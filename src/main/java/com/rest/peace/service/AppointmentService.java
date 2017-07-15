package com.rest.peace.service;

import java.util.List;

import com.rest.peace.db.model.Appointment;

public interface AppointmentService {

	



	List<Appointment> getAppointmentList();
	void save(Appointment appoint);
	
	void update(Appointment appoint);
	void delete(Appointment appoint);
	
	Appointment findById(int appointmentId);
	
	void deleteById(int id);
    
    List<Appointment> getByPatientId(int patientId);
    
    List<Appointment> getPatientDoctorId(int doctorId);
}
