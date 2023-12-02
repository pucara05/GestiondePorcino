package admin_user.model;

import java.util.Date;

import org.hibernate.annotations.ManyToAny;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal_monta {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private Long dni;

//se crea 1 variable  String dniCeloHembra; para registar los datos del select sirve tanto string como long
//@Column(name = "dni_cerdo_hembra1") // Asignación de nombre específico para el campo dniCeloHembra
private String dniCeloHembra;

//se crea 1 variable  String dniCeloMacho; para registar los datos del select sirve tanto string como long
//@Column(name = "dni_cerdo_macho2") // Asignación de nombre específico para el campo dniCeloMacho
private String dniCeloMacho;


@Temporal(TemporalType.DATE)
@DateTimeFormat(iso = ISO.DATE)
@NonNull
private Date fechaMonta;


@ManyToOne
@JoinColumn(name = "animal_celo_id" )
private Animal_celo celo;



    
}
