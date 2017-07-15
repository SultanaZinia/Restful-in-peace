package com.rest.peace.db.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rest.peace.db.dao.DoctorDao;
import com.rest.peace.db.model.Doctor;

@Repository("DoctorDao")
public class DoctorDaoImpl extends GenericDaoImpl<Doctor, Integer> implements DoctorDao{

	public DoctorDaoImpl(Class<Doctor> type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Doctor> getDoctorBySpeciality(String speciality){
		
		List<Doctor> doctorList = null;
				
		try{
					
			String query = "select o from " + type.getName() + " o where " +
	     				   "o.spetiality = ?1 ";
	     	doctorList = em.createQuery(query)
	     			 .setParameter(1, speciality)
	     			 .getResultList();
	     	
	     	
	     		}
				catch(Exception e){
					System.out.println("*******failure*******");
		        }
				System.out.println("*******successful*******");
				
		return doctorList;
		
	}
	
@Override
public List<Doctor> getDoctorByFname(String fname){
		
		List<Doctor> doctorList = null;
				
		try{
					
			String query = "select o from " + type.getName() + " o where " +
	     				   "o.first_name = ?1 ";
	     	doctorList = em.createQuery(query)
	     			 .setParameter(1, fname)
	     			 .getResultList();
	     	
	     	
	     		}
				catch(Exception e){
					System.out.println("*******failure*******");
		        }
				System.out.println("*******successful*******");
				
		return doctorList;
		
	}
}
