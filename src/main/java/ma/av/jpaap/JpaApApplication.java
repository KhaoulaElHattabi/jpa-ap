package ma.av.jpaap;

import ma.av.jpaap.entities.Patient;
import ma.av.jpaap.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class JpaApApplication implements CommandLineRunner  {
     @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(JpaApApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(
                new Patient(null,"Youssra",new Date(),false, 56));
        patientRepository.save(
                new Patient(null,"Kawtar",new Date(),false, 100));
        patientRepository.save(
                new Patient(null,"Hassan",new Date(),true, 76));

        List<Patient> all = patientRepository.findAll();
    }
}
