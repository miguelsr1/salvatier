package sv.com.jsoft.salvatier.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "servicio", schema = "salvatier")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_servicio", nullable = false)
    private Integer id;

    @Size(max = 2000)
    @Column(name = "descripcion", length = 2000)
    private String descripcion;

    @Size(max = 500)
    @Column(name = "titulo", length = 500)
    private String titulo;

    @Column(name = "activo")
    private Boolean activo;

    @Column(name = "fecha_creacion")
    private Instant fechaCreacion;

    @Column(name = "usuario_creacion")
    private Integer usuarioCreacion;

    @Column(name = "fecha_modificacion")
    private Instant fechaModificacion;

    @Column(name = "usuario_modificacion")
    private Integer usuarioModificacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa")
    private InformacionEmpresa idEmpresa;

}