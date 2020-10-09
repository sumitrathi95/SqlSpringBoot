package com.mysql.repository;

import java.io.Serializable;

import com.mysql.model.Patient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Serializable>{
   // public storePid(Stirng pid)
    
}
