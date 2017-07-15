package com.rest.peace.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rest.peace.db.dao.AppointmentDao;
import com.rest.peace.db.model.Appointment;
import com.rest.peace.service.AppointmentService;

public class AppointmentServiceImpl implements AppointmentService, Serializable{

	@Autowired
	AppointmentDao appointmentDao;
	


	@Override
	public List<Appointment> getAppointmentList() {
		List<Appointment> appList = null;
		appList=this.appointmentDao.findAll();
		return appList;
	}

	@Override
	public void save(Appointment appoint) {
		this.appointmentDao.save(appoint);
		
	}

	@Override
	public void update(Appointment appoint) {
		this.appointmentDao.update(appoint);		
	}

	@Override
	public void delete(Appointment appoint) {
		// TODO Auto-generated method stub
		this.appointmentDao.delete(appoint);
		
	}

	@Override
	public Appointment findById(int appointmentId) {
		return this.appointmentDao.findById(appointmentId);
	}

	@Override
	public void deleteById(int id) {
		this.appointmentDao.deleteById(id);		
	}

	@Override
	public List<Appointment> getByPatientId(int patientId) {
		List<Appointment> appList = null;
		appList=this.appointmentDao.searchByPatientId(patientId);
		return appList;
		
	}

	@Override
	public List<Appointment> getPatientDoctorId(int doctorId) {
		List<Appointment> appList = null;
		appList=this.appointmentDao.searchByDoctorId(doctorId);
		return appList;
	}

}
