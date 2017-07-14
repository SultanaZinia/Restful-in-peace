package com.rest.peace.db.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rest.peace.db.dao.AppointmentDao;
import com.rest.peace.db.model.Appointment;
import com.rest.peace.db.model.Patient;
@Repository("AppointmentDao")
public class AppointmentDaoImpl extends GenericDaoImpl<Appointment, Integer> implements AppointmentDao{

	public AppointmentDaoImpl(Class<Appointment> type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
   public List<Appointment> searchByPatientId(int patientId){
	   List<Appointment> appointmentList  = null;
	   try{
			
			String query = "select o from " + type.getName() + " o where " +
	     				   "o.id_patient = ?1 ";
			List<Patient> p = null;
	     	appointmentList =  em.createQuery(query)
	     			 .setParameter(1, patientId)
	     			 .getResultList();
	     	
	     	
	     		}
				catch(Exception e){
					System.out.println("*******failure*******");
		        }
				System.out.println("*******successful*******");
	   
	   return appointmentList;
	   
	   
   }
   
   public List<Appointment> searchByDoctorId(int doctorId){
	   List<Appointment> appointmentList  = null;
	   try{
			
			String query = "select o from " + type.getName() + " o where " +
	     				   "o.id_doctor = ?1 ";
			List<Patient> p = null;
	     	appointmentList =  em.createQuery(query)
	     			 .setParameter(1, doctorId)
	     			 .getResultList();
	     	
	     	
	     		}
				catch(Exception e){
					System.out.println("*******failure*******");
		        }
				System.out.println("*******successful*******");
	   
	   return appointmentList;
	   
	   
   }
}
