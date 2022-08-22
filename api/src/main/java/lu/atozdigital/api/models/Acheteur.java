package lu.atozdigital.api.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Acheteur extends AppUser {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAcheteur;

    @OneToMany(mappedBy="acheteur")
    private List<Commande> list = new ArrayList<>();





}
