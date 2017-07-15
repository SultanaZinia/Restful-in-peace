package com.rest.peace.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.rest.peace.db.dao.PatientDao;
import com.rest.peace.db.model.Patient;
import com.rest.peace.service.PatientService;


@Service("PatientService")
public class PateintServiceImpl implements PatientService, Serializable {
	
	@Autowired
	PatientDao patientDao;

	@Override
	public List<Patient> getPatientList() {
		List<Patient> patientList = null;
		patientList = this.patientDao.findAll();
		return patientList;
	}

	@Override
	public void savePatient(Patient patient) {
		this.patientDao.save(patient);
		
	}

	@Override
	public void updatePatient(Patient patient) {
		this.patientDao.update(patient);
		
	}

	@Override
	public void deletePatient(Patient patient) {
		this.patientDao.delete(patient);		
	}

	@Override
	public Patient findPatientById(int patientId) {
		return this.patientDao.findById(patientId);
	}

	@Override
	public void deletePatientById(int id) {
		this.patientDao.deleteById(id);	
	}

	@Override
	public Patient getPatientByMedicalId(String medicalId) {
		return this.patientDao.searchByMedicalId(medicalId);
	}

	@Override
	public List<Patient> getPatientByFname(String fname) {
		List<Patient> patientList = null;
		patientList = this.patientDao.searchByFname(fname);
		return patientList;
	}

}
