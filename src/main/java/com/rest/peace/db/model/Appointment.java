package com.rest.peace.db.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "appointment")
public class Appointment implements Serializable, DomainObject {

	
	

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_appointment")
	private Integer appointmentId;
	
	

	@JoinColumn(name = "id_doctor", referencedColumnName = "id_doctor")
    @ManyToOne(optional = false)
	private Doctor doctorId;
	
	@JoinColumn(name = "id_patient", referencedColumnName = "id_patient")
    @ManyToOne(optional = false)
	private Patient patientId;

	
	public Appointment(Integer appointmentId, Doctor doctorId, Patient patientId) {
		super();
		this.appointmentId = appointmentId;
		this.doctorId = doctorId;
		this.patientId = patientId;
	}

	public Appointment() {
		super();
	}

	public Integer getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Doctor getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Doctor doctorId) {
		this.doctorId = doctorId;
	}

	public Patient getPatientId() {
		return patientId;
	}

	public void setPatientId(Patient patientId) {
		this.patientId = patientId;
	}
	
	

	
	
	
	
}
