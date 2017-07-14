package com.rest.peace.service;

import java.util.List;

import com.rest.peace.db.model.Appointment;

public interface AppointmentService {

	
List<Appointment>getPatientList();


	List<Appointment> getAppointmentList();
	void save(Appointment appoint,int paitentId);
	
	void update(Appointment appoint);
	void delete(Appointment appoint);
	
	public Appointment findById(int appointmentId);
	
	public void deleteById(int id);
    
    List<Appointment> getByPatientId(int patientId);
    
    List<Appointment> getPatientDoctorId(int doctorId);
}
