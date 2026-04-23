package com.project.healthcare_backend.service;

import com.project.healthcare_backend.model.Patient;
import com.project.healthcare_backend.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.PriorityQueue;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    //  Priority Queue (higher priority first)
    private PriorityQueue<Patient> queue =
            new PriorityQueue<>((a, b) -> b.getPriority() - a.getPriority());

    // Add patient
    public Patient addPatient(Patient patient) {
        patientRepository.save(patient); // store in DB
        queue.add(patient);              // add to priority queue
        return patient;
    }

    // Get next patient (highest priority)
    public Patient getNextPatient() {
        return queue.poll();
    }

    // Get all patients from DB
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}