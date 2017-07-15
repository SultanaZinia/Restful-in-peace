package com.rest.peace.service;

import java.util.List;

import com.rest.peace.db.model.Patient;



public interface PatientService {
		
	
    List<Patient>getPatientList();
	
	void savePatient(Patient patient);
	
	void updatePatient(Patient patient);
	
	void deletePatient(Patient patient);
	
	public Patient findPatientById(int patientId);
	
	public void deletePatientById(int id);
    
    public Patient getPatientByMedicalId(String medicalId);
    
    public List<Patient> getPatientByFname(String fname);
    
    
}
