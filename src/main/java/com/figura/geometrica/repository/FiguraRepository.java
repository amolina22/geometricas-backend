/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.figura.geometrica.repository;

import com.figura.geometrica.entity.Figura;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Abel Molina Suarez
 */
@Repository("figuraRepository")
public interface FiguraRepository extends JpaRepository<Figura, Serializable> {

    public List<Figura> findByTipoFigura(String tipoFigura);

    @Override
    public List<Figura> findAll();

}
