/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author nacho
 */
@Entity
public class Actividad implements Serializable {

    @OneToMany(mappedBy = "actividades")
    private List<SocioActividad> socios;

    private static final long serialVersionUID = 1L;
    @Id
    private String nombre;
    private int costo;
    private boolean vigente;
    @OneToMany(mappedBy = "actividad",cascade = CascadeType.ALL)
    private List<Horario> horarios;

    public List<SocioActividad> getSocios() {
        return socios;
    }

    public void setSocios(List<SocioActividad> socios) {
        this.socios = socios;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
