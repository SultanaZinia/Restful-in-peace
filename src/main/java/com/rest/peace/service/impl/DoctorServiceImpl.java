package com.rest.peace.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.peace.db.dao.DoctorDao;
import com.rest.peace.db.model.Doctor;
import com.rest.peace.service.DoctorService;

@Service("DoctorService")
public class DoctorServiceImpl implements DoctorService, Serializable{
	
	@Autowired
	DoctorDao doctorDao;

	@Override
	public List<Doctor> getDoctorList() {
		List<Doctor> doctorList = null;
		this.doctorDao.findAll();
		return doctorList;
	}

	@Override
	public void saveDoctor(Doctor doctor) {
		this.doctorDao.save(doctor);
		
	}

	@Override
	public void updateDoctor(Doctor doctor) {
		this.doctorDao.update(doctor);
		
	}

	@Override
	public void deleteDoctor(Doctor doctor) {
		this.doctorDao.delete(doctor);
		
	}

	@Override
	public Doctor findDoctorById(int doctorId) {
		
		return this.doctorDao.findById(doctorId);
	}

	@Override
	public void deleteDoctorById(int id) {
		this.doctorDao.deleteById(id);
		
	}

	@Override
	public List<Doctor> getDoctorBySpeciality(String speciality) {
		List<Doctor> doctorList = null;
		doctorList = this.doctorDao.getDoctorBySpeciality(speciality);
		return doctorList;
	}

	@Override
	public List<Doctor> getDoctortByFname(String fname) {
		List<Doctor> doctorList = null;
		doctorList = this.doctorDao.getDoctorByFname(fname);
		return doctorList;
	}
	
	

}
