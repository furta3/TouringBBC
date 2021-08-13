/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author nacho
 */
@Entity
public class Jugador extends Socio implements Serializable {

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date carnetHabilitante;
    @ManyToOne
    private Categoria plantel;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date venCi;//vecnimiento de la cédula
    private int tipoCarnet;
    private String detalles;

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Date getVenCi() {
        return venCi;
    }

    public void setVenCi(Date venCi) {
        this.venCi = venCi;
    }

    public int getTipoCarnet() {
        return tipoCarnet;
    }

    public void setTipoCarnet(int tipoCarnet) {
        this.tipoCarnet = tipoCarnet;
    }
    
    public Date getCarnetHabilitante() {
        return carnetHabilitante;
    }

    public void setCarnetHabilitante(Date carnetHabilitante) {
        this.carnetHabilitante = carnetHabilitante;
    }

    public Categoria getPlantel() {
        return plantel;
    }

    public void setPlantel(Categoria Plantel) {
        this.plantel = Plantel;
    }
    

    @Override
    public String toString() {
        return super.getNombre();//en la tabla socios me muestra este toString, siendo que listo los socios para llenar la tabla
    }
}
