package lu.atozdigital.api.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Vendeur   extends AppUser{



    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVendeur;

    @OneToMany(mappedBy="vendeur")
    private List<Produit> list = new ArrayList<>();

}

