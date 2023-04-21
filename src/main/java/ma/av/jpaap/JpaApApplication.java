package ma.av.jpaap;

import ma.av.jpaap.entities.Patient;
import ma.av.jpaap.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class JpaApApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaApApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*patientRepository.save(
                new Patient(null,"Youssra",new Date(),false, 56));
        patientRepository.save(
                new Patient(null,"Kawtar",new Date(),false, 100));
        patientRepository.save(
                new Patient(null,"Hassan",new Date(),true, 76));
    */

        for (int i = 0; i < 100; i++) {
            patientRepository.save(
                    new Patient(null, "Kawtar", new Date(), Math.random() > 0.5 ? true : false, (int) (Math.random() * 100)));
        }

        //List<Patient> patients = patientRepository.findAll();

        Page<Patient> patients = patientRepository.findAll(PageRequest.of(1, 5));// la pagination
        System.out.println("Totale pages: " + patients.getTotalPages());
        System.out.println("Total elements: " + patients.getTotalElements());
        System.out.println("Numero page: " + patients.getNumber());
        List<Patient> content = patients.getContent();//list de patients de cette page
        //List<Patient> byMalade = patientRepository.findByMalade(true);
        Page<Patient> byMalade = patientRepository.findByMalade(true, PageRequest.of(0, 4));
        List<Patient> patientList = patientRepository.chercherPatientsParScore("%K%", 40);
        //content.forEach(p->{
        byMalade.forEach(p -> {
            System.out.println("==============================");
            System.out.println(p.getId());
            System.out.println(p.getNom());
            System.out.println(p.getScore());
            System.out.println(p.getDateNaissance());
            System.out.println(p.isMalade());

        });

        System.out.println("********************************");
        Patient patient = patientRepository.findById(1L).orElse(null);
        if (patient != null) {
            System.out.println(patient.getNom());
            System.out.println(patient.isMalade());
        }
    }
}
