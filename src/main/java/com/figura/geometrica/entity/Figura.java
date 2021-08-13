/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.figura.geometrica.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Abel Molina Suarez
 */
@Entity
@Table(name = "figura_geometrica")
public class Figura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_figura_geometrica")
    private Long idFiguraGeometrica;

    @Column(name = "superficie", nullable = true)
    private Float superficie;

    @Column(name = "base", nullable = true)
    private Float base;

    @Column(name = "altura", nullable = true)
    private Float altura;

    @Column(name = "diametro", nullable = true)
    private Float diametro;

    @Column(name = "tipo_figura", nullable = false)
    private String tipoFigura;

    public Figura() {
    }

    public Long getIdFiguraGeometrica() {
        return idFiguraGeometrica;
    }

    public void setIdFiguraGeometrica(Long idFiguraGeometrica) {
        this.idFiguraGeometrica = idFiguraGeometrica;
    }

    public Float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Float superficie) {
        this.superficie = superficie;
    }

    public Float getBase() {
        return base;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getDiametro() {
        return diametro;
    }

    public void setDiametro(Float diametro) {
        this.diametro = diametro;
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

}
