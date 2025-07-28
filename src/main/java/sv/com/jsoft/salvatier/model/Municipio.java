package sv.com.jsoft.salvatier.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "municipio", schema = "salvatier")
public class Municipio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_municipio", nullable = false)
    private Integer id;

    @Size(max = 2)
    @Column(name = "codigo_municipio", length = 2)
    private String codigoMunicipio;

    @Size(max = 200)
    @Column(name = "nombre_municipio", length = 200)
    private String nombreMunicipio;

}