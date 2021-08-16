package Clases;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Jugador.class)
public abstract class Jugador_ extends Clases.Socio_ {

	public static volatile SingularAttribute<Jugador, Date> carnetHabilitante;
	public static volatile SingularAttribute<Jugador, String> detalles;
	public static volatile SingularAttribute<Jugador, Date> venCi;
	public static volatile SingularAttribute<Jugador, Integer> tipoCarnet;
	public static volatile SingularAttribute<Jugador, Categoria> plantel;

}

