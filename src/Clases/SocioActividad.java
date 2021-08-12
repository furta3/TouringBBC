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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author nacho
 */
@Entity
public class SocioActividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Socio socios;
    @ManyToOne
    private Actividad actividades;

    @ManyToMany(cascade = CascadeType.REMOVE)
    private List<Horario> horarios;

    public Socio getSocios() {
        return socios;
    }

    public void setSocios(Socio socios) {
        this.socios = socios;
    }

    public Actividad getActividades() {
        return actividades;
    }

    public void setActividades(Actividad actividades) {
        this.actividades = actividades;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SocioActividad)) {
            return false;
        }
        SocioActividad other = (SocioActividad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String dias  = "";
        for(int f = 0; f<horarios.size();f++){
            if(dias == "" && f>0)
                dias += ",";
            if(horarios.get(f).isVigente())
                dias += horarios.get(f).getDia();
        }
        return dias;
    }
}
