package Clases;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SocioActividad.class)
public abstract class SocioActividad_ {

	public static volatile ListAttribute<SocioActividad, Horario> horarios;
	public static volatile SingularAttribute<SocioActividad, Cuota> cuota;
	public static volatile SingularAttribute<SocioActividad, Long> id;
	public static volatile SingularAttribute<SocioActividad, Actividad> actividades;
	public static volatile SingularAttribute<SocioActividad, Socio> socios;

}

