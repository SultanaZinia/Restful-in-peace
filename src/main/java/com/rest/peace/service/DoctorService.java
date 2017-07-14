package com.rest.peace.service;

import java.util.List;

import com.rest.peace.db.model.Doctor;

public interface DoctorService {

	
	List<Doctor>getDoctorList();
	
	void saveDoctor(Doctor doctor);
	
	void updateDoctor(Doctor doctor);
	
	void deleteDoctor(Doctor doctor);
	
	Doctor findDoctorById(int doctorId);
	
	void deleteDoctorById(int id);
    
    List<Doctor> getDoctorBySpeciality(String speciality);
    
    Doctor getDoctortByFname(String fname);
}
