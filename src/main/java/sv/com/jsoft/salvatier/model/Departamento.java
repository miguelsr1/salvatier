package sv.com.jsoft.salvatier.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "departamento", schema = "salvatier")
public class Departamento {
    @Id
    @Size(max = 2)
    @Column(name = "codigo_departamento", nullable = false, length = 2)
    private String codigoDepartamento;

    @Size(max = 150)
    @Column(name = "nombre_departamento", length = 150)
    private String nombreDepartamento;

}