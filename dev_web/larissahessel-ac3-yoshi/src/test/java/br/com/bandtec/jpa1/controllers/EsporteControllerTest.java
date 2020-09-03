package br.com.bandtec.jpa1.controllers;

import br.com.bandtec.jpa1.entidades.Esporte;
import br.com.bandtec.jpa1.repositorios.EsporteRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EsporteControllerTest {

    @MockBean
    EsporteRepository repository;

    @Autowired
    EsporteController controller;

    @Test
    void listarTodos() {
        List<Esporte> esportes = new ArrayList<>(Arrays.asList(new Esporte()));

        esportes.add(new Esporte());
        esportes.add(new Esporte());

        //Retorna uma listinha de esportes
        Mockito.when(repository.findAll()).thenReturn(new ArrayList<>(esportes));
        Mockito.when(repository.count()).thenReturn((long) esportes.size());

        ResponseEntity resposta = controller.listarTodos();

        assertEquals(200, resposta.getStatusCodeValue(), "Lista com os esportes deve retornar status 200");
        assertEquals(esportes, resposta.getBody(), "Lista do endpoint deve ser fiel a do Repository");
    }

    @Test
    void nenhumItemEncontrado() {
        List<Esporte> esportes = new ArrayList<>();

        //Retorna uma listinha de esportes
        Mockito.when(repository.findAll()).thenReturn(new ArrayList<>(esportes));
        Mockito.when(repository.count()).thenReturn((long) esportes.size());

        ResponseEntity resposta = controller.listarTodos();

        assertEquals(204, resposta.getStatusCodeValue(), "Lista com os esportes deve retornar status 200");
        assertNull(resposta.getBody(), "Lista do endpoint deve ser fiel a do Repository");
    }

    @Test
    void testarConfiguracoes() throws NoSuchMethodException {

        Class classe = EsporteController.class;

        assertTrue(classe.isAnnotationPresent(RestController.class),
                "A controller deve estar anotada com @RestController");

        Method listarTodos = classe.getDeclaredMethod("listarTodos");

        assertTrue(listarTodos.isAnnotationPresent(GetMapping.class),
                "O método somar() deve estar anotado com @GetMapping");
        
    }

}