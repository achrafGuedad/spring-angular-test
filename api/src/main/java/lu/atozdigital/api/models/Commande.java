package lu.atozdigital.api.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Commande {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCommande;

    @ManyToOne
    private Acheteur acheteur;


    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateCommande ;


}
