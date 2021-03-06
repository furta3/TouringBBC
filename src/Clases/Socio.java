/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author nacho
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Socio extends PersonaBBC implements Serializable {

    @ManyToOne
    private Familia familia;

    @ManyToMany(mappedBy = "socios", cascade = CascadeType.ALL)
    private List<Cuota> cuotas;

    @OneToMany(mappedBy = "socios")
    private List<SocioActividad> actividades;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaIngreso;
    private boolean rol;
    @ManyToOne
    private TipoSocio tipo;
    @OneToMany(mappedBy = "socio")
    private List<PagoBBC> pagos;

    public Socio(Familia familia, List<Cuota> cuotas, List<SocioActividad> actividades, Date fechaIngreso, boolean rol, TipoSocio tipo, List<PagoBBC> pagos) {
        this.familia = familia;
        this.cuotas = cuotas;
        this.actividades = actividades;
        this.fechaIngreso = fechaIngreso;
        this.rol = rol;
        this.tipo = tipo;
        this.pagos = pagos;
    }

    public Socio(Familia familia, List<Cuota> cuotas, List<SocioActividad> actividades, Date fechaIngreso, boolean rol, TipoSocio tipo, List<PagoBBC> pagos, int ci, String nombre, String apellido, String telefono, String direccion, boolean vigente, Date fechaNac) {
        super(ci, nombre, apellido, telefono, direccion, vigente, fechaNac);
        this.familia = familia;
        this.cuotas = cuotas;
        this.actividades = actividades;
        this.fechaIngreso = fechaIngreso;
        this.rol = rol;
        this.tipo = tipo;
        this.pagos = pagos;
    }
    

    public Socio() {}
    
    public List<PagoBBC> getPagos() {
        return pagos;
    }

    public void setPagos(List<PagoBBC> pagos) {
        this.pagos = pagos;
    }
    
    public boolean getRol() {
        return rol;
    }

    public void setRol(boolean rol) {
        this.rol = rol;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

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

    public TipoSocio getTipo() {
        return tipo;
    }

    public void setTipo(TipoSocio tipo) {
        this.tipo = tipo;
    }
    

    @Override
    public String toString() {
        return super.getNombre();
    }
    
}
