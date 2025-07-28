package sv.com.jsoft.salvatier.view;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Getter;

import java.io.Serializable;

@Named(value = "landingView")
@ViewScoped
public class LandingView implements Serializable {

    @Getter
    private String title = "Bienvenido a Salvatier";
}
