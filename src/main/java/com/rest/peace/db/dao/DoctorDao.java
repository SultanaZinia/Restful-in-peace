package com.rest.peace.db.dao;

import java.util.List;

import com.rest.peace.db.model.Doctor;

public interface DoctorDao extends GenericDao<Doctor,Integer>{

	
	List<Doctor> getDoctorBySpeciality(String speciality);
	List<Doctor> getDoctorByFname(String fname);
}
