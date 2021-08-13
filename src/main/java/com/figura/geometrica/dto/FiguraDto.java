/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.figura.geometrica.dto;

import com.figura.geometrica.entity.Figura;

/**
 *
 * @author Abel Molina Suarez
 */
public class FiguraDto {

    private Long idFiguraGeometrica;

    private Float superficie;

    private Float base;

    private Float altura;

    private Float diametro;

    private String tipoFigura;

    public FiguraDto() {
    }

    public FiguraDto(Figura figura) {
        this.idFiguraGeometrica = figura.getIdFiguraGeometrica();
        this.superficie = figura.getSuperficie();
        this.base = figura.getBase();
        this.altura = figura.getAltura();
        this.diametro = figura.getDiametro();
        this.tipoFigura = figura.getTipoFigura();
    }

    public FiguraDto(Long idFiguraGeometrica, Float superficie, Float base, Float altura, Float diametro, String tipoFigura) {
        this.idFiguraGeometrica = idFiguraGeometrica;
        this.superficie = superficie;
        this.base = base;
        this.altura = altura;
        this.diametro = diametro;
        this.tipoFigura = tipoFigura;
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
