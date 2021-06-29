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

/**
 *
 * @author nacho
 */
@Entity
public class Jugador extends Socio implements Serializable {

    private Date carnetHabilitante;
    private String plantel;

    public Date getCarnetHabilitante() {
        return carnetHabilitante;
    }

    public void setCarnetHabilitante(Date carnetHabilitante) {
        this.carnetHabilitante = carnetHabilitante;
    }

    public String getPlantel() {
        return plantel;
    }

    public void setPlantel(String Plantel) {
        this.plantel = Plantel;
    }
    

    @Override
    public String toString() {
        return super.getNombre();//en la tabla socios me muestra este toString, siendo que listo los socios para llenar la tabla
    }
    
}
