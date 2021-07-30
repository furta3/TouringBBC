package Clases;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TipoSocio.class)
public abstract class TipoSocio_ {

	public static volatile SingularAttribute<TipoSocio, Cuota> cuota;
	public static volatile SingularAttribute<TipoSocio, Boolean> vigente;
	public static volatile SingularAttribute<TipoSocio, Long> id;
	public static volatile SingularAttribute<TipoSocio, Date> FechaMod;
	public static volatile SingularAttribute<TipoSocio, String> nombre;
	public static volatile ListAttribute<TipoSocio, Socio> socios;

}

