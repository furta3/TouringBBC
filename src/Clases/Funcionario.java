/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author nacho
 */
@Entity
public class Funcionario extends PersonaBBC implements Serializable {

    @OneToMany(mappedBy = "funcionario")
    private List<Sueldo> sueldos;

    @OneToMany(mappedBy = "funcionario")
    private List<Actividad> actividades;

    @Override
    public String toString() {
        return "Clases.Funcionario[ id=" + super.getCi() + " ]";
    }
    
}
