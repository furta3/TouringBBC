package Clases;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Categoria.class)
public abstract class Categoria_ {

	public static volatile SingularAttribute<Categoria, Boolean> vigente;
	public static volatile SingularAttribute<Categoria, Long> id;
	public static volatile ListAttribute<Categoria, Jugador> jugadores;
	public static volatile SingularAttribute<Categoria, String> nombre;

}

