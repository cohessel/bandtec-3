package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/sayajin")
public class SayajinController {

    public Integer forca = 0;
    public String forma = "base";

    @GetMapping ("/forca-base/{forca}")
    public Integer setForcaBase(@PathVariable("forca") Integer forca){
        this.forca = forca;
        return forca;
    }

    @GetMapping ("/transformar/{forma}")
    public void setTransformar(@PathVariable("transformar") String forma){
        if(forma.equals("ssj")){
            this.forca *= 50;
        }
    }
}
