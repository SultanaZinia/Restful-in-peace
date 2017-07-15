package com.rest.peace.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.peace.db.model.Patient;
import com.rest.peace.service.PatientService;

@RestController
public class PatientController {
	@Autowired
	PatientService patientService;
	@RequestMapping(value = "/patients", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Patient> getPatients() {
	List<Patient> listPatients =patientService.getPatientList();
	return listPatients;
	}
	
	 @RequestMapping(value = "/patient/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	 public Patient getPatientById(@PathVariable int id) {
	 return patientService.findPatientById(id);
	 }
	 
	 @RequestMapping(value = "/patients", method = RequestMethod.POST, headers = "Accept=application/json")
	 public void addPatient(@RequestBody Patient patient) {
	     patientService.savePatient(patient);
	 }
	 
	 @RequestMapping(value = "/patients", method = RequestMethod.PUT, headers = "Accept=application/json")
	 public void updatePatient(@RequestBody Patient patient) {
	     patientService.updatePatient(patient);
	 
	 }
	 
	 @RequestMapping(value = "/patient/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	 public void deletePatient(@PathVariable("id") int id) {
	 patientService.deletePatientById(id);
	 
	 } 
}
