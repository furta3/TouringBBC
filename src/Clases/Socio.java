/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author nacho
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Socio extends PersonaBBC implements Serializable {

    @ManyToMany(mappedBy = "socios")
    private List<Cuota> cuotas;

    @OneToMany(mappedBy = "socios")
    private List<SocioActividad> actividades;

    private String tipo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaIngreso;

    public List<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public List<SocioActividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<SocioActividad> actividades) {
        this.actividades = actividades;
    }


    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    @Override
    public String toString() {
        return super.getNombre();
    }
    
}
