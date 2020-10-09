package com.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patientid")
public class Patient{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String pid;
   

    @Column(name = "name")
    private String name;
    
    
	public String getName() {
		return name;
    }
    
	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

    public Patient(String name) {
        this.name = name;
    }
    
}