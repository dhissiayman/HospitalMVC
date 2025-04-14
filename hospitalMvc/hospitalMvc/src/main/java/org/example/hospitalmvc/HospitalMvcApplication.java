package org.example.hospitalmvc;

import org.example.hospitalmvc.entities.Patient;
import org.example.hospitalmvc.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitalMvcApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(HospitalMvcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null,"Mohammed",new Date(),false,34));
        patientRepository.save(new Patient(null,"Ali",new Date(),false,34324));
        patientRepository.save(new Patient(null,"Omar",new Date(),false,34));

    }
}
