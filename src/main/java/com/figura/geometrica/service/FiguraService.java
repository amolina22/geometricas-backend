/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.figura.geometrica.service;

import com.figura.geometrica.dto.FiguraDto;
import com.figura.geometrica.entity.Figura;
import com.figura.geometrica.repository.FiguraRepository;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Abel Molina Suarez
 */
@Service("figuraService")
public class FiguraService {

    @Autowired
    @Qualifier("figuraRepository")
    private FiguraRepository figuraRepository;

    public List<FiguraDto> findByTipoFigura(String tipoFigura) {
        List<Figura> figura = figuraRepository.findByTipoFigura(tipoFigura);
        List<FiguraDto> figuraDto = new ArrayList<>();
        for (Figura item : figura) {
            figuraDto.add(new FiguraDto(item));
        }
        return figuraDto;
    }

    public List<FiguraDto> findAll() {
        List<Figura> figura = figuraRepository.findAll();
        List<FiguraDto> figuraDto = new ArrayList<>();
        for (Figura item : figura) {
            figuraDto.add(new FiguraDto(item));
        }
        return figuraDto;
    }

    public boolean save(Figura figura) {
        try {
            figuraRepository.save(figura);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
