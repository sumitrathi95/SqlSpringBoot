package com.mysql.controller;

//import java.time.LocalDate;

import com.mysql.model.Patient;
import com.mysql.service.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    
    @Autowired
    private PatientService patientService;

 
    @PostMapping("/patient")
    public ResponseEntity<Object> newPatient(@RequestBody Patient patient, Object Status){


        String pattern = "^([A-Za-z0-9])*$";
                /*String msg = "Input format should be [A-Za-z0-9]";
                HttpHeaders header = new HttpHeaders();
                header.add("desc", "New Patient Addded");*/
       
                if (patient.getName().matches(pattern)) {
                    //System.out.println("valid");
                     Patient p = patientService.saveOrUpdate(patient);
                     //this.producerService.sendMessage(p.getPid());
                     
                    String msg = "New Patient is added";
		            return new ResponseEntity<Object>(msg, HttpStatus.CREATED.valueOf(200));
                } else {
                    
                  HttpStatus.valueOf(400);
				
                   return new ResponseEntity<Object>("Input format should be [A-Za-z0-9]", HttpStatus.INTERNAL_SERVER_ERROR.valueOf(400));
                }
    }

 
    
}