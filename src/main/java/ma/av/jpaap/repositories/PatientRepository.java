package ma.av.jpaap.repositories;

import ma.av.jpaap.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PatientRepository extends JpaRepository<Patient,Long> {
}
