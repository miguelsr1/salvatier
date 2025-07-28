package sv.com.jsoft.salvatier.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "informacion_empresa", schema = "salvatier")
public class InformacionEmpresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa", nullable = false)
    private Integer id;

    @Size(max = 150)
    @NotNull
    @Column(name = "nombre_comercial", nullable = false, length = 150)
    private String nombreComercial;

    @Size(max = 150)
    @NotNull
    @Column(name = "razon_social", nullable = false, length = 150)
    private String razonSocial;

    @Size(max = 150)
    @NotNull
    @Column(name = "direccion_casa_matriz", nullable = false, length = 150)
    private String direccionCasaMatriz;

    @NotNull
    @Column(name = "id_municipio", nullable = false)
    private Integer idMunicipio;

    @Size(max = 250)
    @NotNull
    @Column(name = "email", nullable = false, length = 250)
    private String email;

    @Size(max = 8)
    @NotNull
    @Column(name = "telefono", nullable = false, length = 8)
    private String telefono;

    @NotNull
    @Column(name = "fecha_creacion", nullable = false)
    private Instant fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Instant fechaModificacion;

    @Size(max = 2000)
    @NotNull
    @Column(name = "descripcion", nullable = false, length = 2000)
    private String descripcion;

    @Size(max = 2000)
    @NotNull
    @Column(name = "descripcion_equipo", nullable = false, length = 2000)
    private String descripcionEquipo;
}
