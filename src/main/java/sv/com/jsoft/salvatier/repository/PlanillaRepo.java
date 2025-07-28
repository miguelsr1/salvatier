package sv.com.jsoft.salvatier.repository;

import jakarta.ejb.Stateless;
import sv.com.jsoft.salvatier.model.Planilla;

@Stateless
public class PlanillaRepo extends AbstractRepository<Planilla, Integer> {
    public PlanillaRepo() {
        super(Planilla.class);
    }
}
