package ma.av.jpaap.repositories;

import ma.av.jpaap.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    public List<Patient> findByMalade(boolean mld);     //affichage de tous les personnes malades
    Page<Patient> findByMalade(boolean mld, Pageable pageable);     //affichage des maldes et nbr  pages
    List<Patient> findByMaladeAndScoreLessThan(boolean m, int score);
    List<Patient> findByMaladeIsTrueAndScoreLessThan(int score);
    List<Patient> findByDateNaissanceBetweenAndMaladeIsTrueOrNomLike(Date d1, Date d2,String mc);
    @Query("select p from Patient p where p.dateNaissance between :x and :y or p.nom like :z")
    List<Patient>chercherPatients(@Param("x") Date d1,@Param("y") Date d2,@Param("z") String nom);
    @Query("select p from Patient p where p.nom like :x and p.score<:y ")
    List<Patient>chercherPatientsParScore(@Param("x") String nom, @Param("y") int score );
}
