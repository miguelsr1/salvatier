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
@Table(name = "mision_vision", schema = "salvatier")
public class MisionVision {
    @Id
    @Column(name = "id_mision_vision", nullable = false)
    private Integer id;

    @Size(max = 2000)
    @Column(name = "mision", length = 2000)
    private String mision;

    @Size(max = 2000)
    @Column(name = "vision", length = 2000)
    private String vision;

    @NotNull
    @Column(name = "fecha_creacion", nullable = false)
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