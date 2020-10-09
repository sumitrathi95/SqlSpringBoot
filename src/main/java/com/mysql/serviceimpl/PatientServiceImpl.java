package com.mysql.serviceimpl;

import com.mysql.model.Patient;
import com.mysql.service.PatientService;
import com.mysql.repository.PatientRepository;

//import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {
    private PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
     


    @Override
    public Patient saveOrUpdate(Patient patient) {
        //Patient patient = new Patient(patient);
        System.out.println("IS SAVED");
        return patientRepository.save(patient);
       
        
    }

    
    
}