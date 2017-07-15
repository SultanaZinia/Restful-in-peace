package com.rest.peace.db.dao;

import java.util.List;

import com.rest.peace.db.model.Appointment;

public interface AppointmentDao  extends GenericDao<Appointment,Integer>{
	List<Appointment> searchByPatientId(int patientId);
	List<Appointment> searchByDoctorId(int doctorId);
}
