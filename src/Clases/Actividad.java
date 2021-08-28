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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author nacho
 */
@Entity
public class Actividad implements Serializable {

    @OneToMany(mappedBy = "actividad")
    private List<Cuota> cuotas;

    @OneToMany(mappedBy = "actividades")
    private List<SocioActividad> socios;

    private static final long serialVersionUID = 1L;
    @Id
    private String nombre;
    private int cupos;
    private boolean vigente;
    @OneToMany(mappedBy = "actividad",cascade = CascadeType.ALL)
    private List<Horario> horarios;
    @ManyToOne
    private Funcionario funcionario;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }
    
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

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }
    
    public String showHorarios(){
        String dias  = "";
        for(int f = 0; f<horarios.size();f++){
            if(f>0 && f!=horarios.size())
                dias += ",";
            if(horarios.get(f).isVigente())
                dias += horarios.get(f).getDia();
        }
        return dias;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
