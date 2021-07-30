package Clases;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cuota.class)
public abstract class Cuota_ {

	public static volatile SingularAttribute<Cuota, String> descripcion;
	public static volatile SingularAttribute<Cuota, Date> fecha;
	public static volatile SingularAttribute<Cuota, String> frecuencia;
	public static volatile SingularAttribute<Cuota, Integer> monto;
	public static volatile SingularAttribute<Cuota, Boolean> vigente;
	public static volatile SingularAttribute<Cuota, Long> id;
	public static volatile SingularAttribute<Cuota, String> nombre;
	public static volatile SingularAttribute<Cuota, TipoSocio> tipoSocio;
	public static volatile ListAttribute<Cuota, Socio> socios;

}

