package Clases;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Actividad.class)
public abstract class Actividad_ {

	public static volatile ListAttribute<Actividad, Horario> horarios;
	public static volatile SingularAttribute<Actividad, Integer> costo;
	public static volatile SingularAttribute<Actividad, Boolean> vigente;
	public static volatile SingularAttribute<Actividad, String> nombre;

}

