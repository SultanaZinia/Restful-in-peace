package com.rest.peace.db.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rest.peace.db.dao.PatientDao;
import com.rest.peace.db.model.Doctor;
import com.rest.peace.db.model.Patient;

@Repository("PatientDao")
public class PatientDaoImpl extends GenericDaoImpl<Patient, Integer> implements PatientDao{

	public PatientDaoImpl(Class<Patient> type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Patient searchByMedicalId(String medicalId){
		Patient patient = null;
		
		try{
					
			String query = "select o from " + type.getName() + " o where " +
	     				   "o.medical_id = ?1 ";
			List<Patient> p = null;
	     	patient = (Patient) em.createQuery(query)
	     			 .setParameter(1, medicalId)
	     			 .getResultList().get(0);
	     	
	     	
	     		}
				catch(Exception e){
					System.out.println("*******failure*******");
		        }
				System.out.println("*******successful*******");
				
		return patient;
		
	}


	@Override
	public List<Patient> searchByFname(String fname) {
		List<Patient> patientList = null;

		try{
					
			String query = "select o from " + type.getName() + " o where " +
	     				   "o.first_name = ?1 ";
			List<Patient> p = null;
	     	patientList = em.createQuery(query)
	     			 .setParameter(1, fname)
	     			 .getResultList();
	     	
	     	
	     		}
				catch(Exception e){
					System.out.println("*******failure*******");
		        }
				System.out.println("*******successful*******");
				
		
		return patientList;
	}

}
