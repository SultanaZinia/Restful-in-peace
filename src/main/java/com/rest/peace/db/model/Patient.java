package com.rest.peace.db.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.rest.peace.db.model.DomainObject;

@Entity
@Table(name = "patient")
public class Patient implements Serializable,DomainObject{
	
	
	

	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_patient")
	private Integer patientId;
	
	@Column(name = "medical_id")
	private long medicalId;
	
	@Column(name="first_name")
	private String fname;
	
	@Column(name = "last name")
	private String lname;
	
	@Column(name = "phone_number")
	private String phone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "dob")
	private String dob;
	
	@Column( name = "address")
	private String address;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "patientId")
    private List<Appointment>appointmentList;
	
	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}

	public Patient() {
		super();
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public long getMedicalId() {
		return medicalId;
	}

	public void setMedicalId(long medicalId) {
		this.medicalId = medicalId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Patient(Integer patientId, long medicalId, String fname, String lname, String phone, String email,
			String dob, String address) {
		super();
		this.patientId = patientId;
		this.medicalId = medicalId;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.email = email;
		this.dob = dob;
		this.address = address;
	}
	
	
	
	

}
