/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.figura.geometrica.controller;

import com.figura.geometrica.dto.FiguraDto;
import com.figura.geometrica.entity.Figura;
import com.figura.geometrica.service.FiguraService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Abel Molina Suarez
 */
@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api")
public class FiguraController {

    @Autowired
    @Qualifier("figuraService")
    FiguraService figuraService;

    @GetMapping("/")
    public String inicio() {
        return "Bienvenido al Backend figuras geométricas";
    }

    @GetMapping("/figura/{tipoFigura}")
    public List<FiguraDto> getFindByTipoFigura(@PathVariable("tipoFigura") String tipoFigura) {
        return figuraService.findByTipoFigura(tipoFigura);
    }

    @GetMapping("/figura")
    public List<FiguraDto> getFindAll() {
        return figuraService.findAll();
    }

    @PostMapping("/figura")
    public boolean saveFigura(@RequestBody Figura figura) throws Exception {
        if (figuraService.save(figura)) {
            return true;
        } else {
            return false;
        }
    }

}
