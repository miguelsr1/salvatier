package sv.com.jsoft.salvatier.view;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import sv.com.jsoft.salvatier.model.InformacionEmpresa;
import sv.com.jsoft.salvatier.model.MisionVision;
import sv.com.jsoft.salvatier.model.Planilla;
import sv.com.jsoft.salvatier.model.Servicio;
import sv.com.jsoft.salvatier.repository.InformacionEmpresaRepo;
import sv.com.jsoft.salvatier.repository.MisionVisionRepo;
import sv.com.jsoft.salvatier.repository.PlanillaRepo;
import sv.com.jsoft.salvatier.repository.ServicioRepo;

import java.util.List;

@Named
@ApplicationScoped
public class ApplicacionView {

    @Getter
    private InformacionEmpresa informacionEmpresa;
    @Getter
    private MisionVision misionVision;
    @Getter
    private List<Planilla> planillas;
    @Getter
    private List<Servicio> servicios;

    @Inject
    private InformacionEmpresaRepo informacionEmpresaRepo;
    @Inject
    private MisionVisionRepo misionVisionRepo;
    @Inject
    private PlanillaRepo planillaRepo;
    @Inject
    private ServicioRepo servicioRepo;


    @PostConstruct
    public void init() {
        loadInformacionEmpresa();
    }

    private void loadInformacionEmpresa() {
        informacionEmpresa = informacionEmpresaRepo.findByPk(1);
        misionVision = misionVisionRepo.findByPk(1);
        planillas = planillaRepo.findAll();
        servicios = servicioRepo.findAll();
    }
}
