package lu.atozdigital.api.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ligneCommande {



    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idLigneCmd;
    @ManyToOne
    private Acheteur acheteur;
    @ManyToOne
    private Produit produit;
    private int quantite;
}
