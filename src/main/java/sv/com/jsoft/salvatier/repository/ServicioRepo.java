package sv.com.jsoft.salvatier.repository;

import jakarta.ejb.Stateless;
import sv.com.jsoft.salvatier.model.Servicio;

@Stateless
public class ServicioRepo extends AbstractRepository<Servicio, Integer> {

    public ServicioRepo() {
        super(Servicio.class);
    }
}
