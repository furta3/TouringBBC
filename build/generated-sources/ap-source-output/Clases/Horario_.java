package Clases;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Horario.class)
public abstract class Horario_ {

	public static volatile SingularAttribute<Horario, String> hora;
	public static volatile ListAttribute<Horario, SocioActividad> socioActividadHorario;
	public static volatile SingularAttribute<Horario, Integer> duracion;
	public static volatile SingularAttribute<Horario, Boolean> vigente;
	public static volatile SingularAttribute<Horario, Long> id;
	public static volatile SingularAttribute<Horario, String> dia;
	public static volatile SingularAttribute<Horario, Actividad> actividad;

}

