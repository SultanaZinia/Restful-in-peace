package com.rest.peace.db.dao;

import java.util.List;

import com.rest.peace.db.model.Patient;

public interface PatientDao extends GenericDao<Patient, Integer>{

	
	Patient searchByMedicalId(String medicalId);
	List<Patient> searchByFname(String fname);
}
