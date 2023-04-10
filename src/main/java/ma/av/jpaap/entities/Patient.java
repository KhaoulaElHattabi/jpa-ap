package ma.av.jpaap.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Patient {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   @Column(name = "NOM", length = 50)
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private boolean malade;
    private int score;


}
