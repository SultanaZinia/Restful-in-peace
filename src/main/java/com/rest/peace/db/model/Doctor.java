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


@Entity
@Table(name = "doctor")
public class Doctor implements DomainObject, Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_doctor")
	private int doctorId;
	
	@Column(name = "first_name")
	private String fname;
	
	@Column(name = "last_name")
	private String lname;
	
	@Column(name = "nid")
	private String nid;
	
	
	@Column(name = "speciality")
	private String speciality;
	
	@Column (name = "email")
	private String email;
	
	@Column(name = "address")
	private String address;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "doctorId")
    private List<Appointment>appointmentList;
	
	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}

	

	public Doctor() {
		super();
	}

	public Doctor(int doctorId, String fname, String lname, String nid, String speciality, String email, String address,
			List<Appointment> appointmentList) {
		super();
		this.doctorId = doctorId;
		this.fname = fname;
		this.lname = lname;
		this.nid = nid;
		this.speciality = speciality;
		this.email = email;
		this.address = address;
		this.appointmentList = appointmentList;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
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

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
}
