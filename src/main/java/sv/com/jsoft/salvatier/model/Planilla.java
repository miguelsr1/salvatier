package sv.com.jsoft.salvatier.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "planilla", schema = "salvatier")
public class Planilla {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_planilla", nullable = false)
    private Integer id;

    @Size(max = 250)
    @Column(name = "nombres", length = 250)
    private String nombres;

    @Size(max = 250)
    @Column(name = "apellidos", length = 250)
    private String apellidos;

    @Size(max = 1)
    @Column(name = "sexo", length = 1)
    private String sexo;

    @Size(max = 7)
    @Column(name = "titulo_abre", length = 7)
    private String tituloAbre;

    @Size(max = 300)
    @Column(name = "especialista", length = 300)
    private String especialista;

    @Size(max = 500)
    @Column(name = "email", length = 500)
    private String email;

    @Size(max = 8)
    @Column(name = "telefono", length = 8)
    private String telefono;

    @Size(max = 250)
    @Column(name = "foto", length = 250)
    private String foto;

    @Size(max = 2000)
    @Column(name = "descripcion", length = 2000)
    private String descripcion;

    @Size(max = 2000)
    @Column(name = "experiencia", length = 2000)
    private String experiencia;

    @Column(name = "activo")
    private Boolean activo;

    @Column(name = "fecha_creacion")
    private Instant fechaCreacion;

    @Column(name = "usuario_creacion")
    private Integer usuarioCreacion;

    @Column(name = "fecha_modificacion")
    private Integer fechaModificacion;

    @Column(name = "usuario_modificacion")
    private Integer usuarioModificacion;

}