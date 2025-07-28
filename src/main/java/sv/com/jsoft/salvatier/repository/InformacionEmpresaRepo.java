package sv.com.jsoft.salvatier.repository;

import jakarta.ejb.Stateless;
import sv.com.jsoft.salvatier.model.InformacionEmpresa;

@Stateless
public class InformacionEmpresaRepo extends AbstractRepository<InformacionEmpresa, Integer> {

    public InformacionEmpresaRepo() {
        super(InformacionEmpresa.class);
    }
}
