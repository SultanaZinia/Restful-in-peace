package com.rest.peace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.peace.db.model.Doctor;
import com.rest.peace.db.model.Patient;
import com.rest.peace.service.DoctorService;


@RestController
public class DoctorController {

	@Autowired
	DoctorService doctorService;
	
	@RequestMapping(value = "/doctors", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Doctor> getPatients() {
	List<Doctor> listPatients =doctorService.getDoctorList();
	return listPatients;
	}
	
	 @RequestMapping(value = "/doctor/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	 public Doctor getDoctorById(@PathVariable int id) {
	 return doctorService.findDoctorById(id);
	 }
	 
	 @RequestMapping(value = "/doctors", method = RequestMethod.POST, headers = "Accept=application/json")
	 public void addDoctor(@RequestBody Doctor doctor) {
	     doctorService.saveDoctor(doctor);
	 }
	 
	 @RequestMapping(value = "/doctors", method = RequestMethod.PUT, headers = "Accept=application/json")
	 public void updateDoctor(@RequestBody Doctor doctor) {
	     doctorService.updateDoctor(doctor);
	 
	 }
	 
	 @RequestMapping(value = "/doctor/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	 public void deleteDoctor(@PathVariable("id") int id) {
	 doctorService.deleteDoctorById(id);
	 
	 } 
}
