package sv.com.jsoft.salvatier.repository;

import jakarta.ejb.Stateless;
import sv.com.jsoft.salvatier.model.MisionVision;

@Stateless
public class MisionVisionRepo extends AbstractRepository<MisionVision, Integer> {

    public MisionVisionRepo() {
        super(MisionVision.class);
    }
}
