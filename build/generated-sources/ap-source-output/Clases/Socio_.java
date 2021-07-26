package Clases;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Socio.class)
public abstract class Socio_ extends Clases.PersonaBBC_ {

	public static volatile SingularAttribute<Socio, Date> fechaIngreso;
	public static volatile SingularAttribute<Socio, String> tipo;
	public static volatile ListAttribute<Socio, SocioActividad> actividades;
	public static volatile ListAttribute<Socio, Cuota> cuotas;
	public static volatile SingularAttribute<Socio, Familia> familia;
	public static volatile SingularAttribute<Socio, String> rol;

}

