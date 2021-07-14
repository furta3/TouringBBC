/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Clases.Jugador;
import Clases.Socio;
import com.mysql.cj.Session;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author nacho
 */
public class Conexion {
    
    private Conexion() {
    }
    
    public static Conexion getInstance() {
        return ConexionHolder.INSTANCE;
    }
    
    private static class ConexionHolder {
        private static final Conexion INSTANCE = new Conexion();
        private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("TouringBBCPU");
        private static final EntityManager em = emf.createEntityManager();
    }
    
    public EntityManager getEntity(){
        return ConexionHolder.em;
    }
    
    public void persist(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    
    /*public void save(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        Session sessionOne = em.openSession();
        sessionOne.beginTransaction();
        try {
            Long id = (Long) em.save(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }*/
    
    public void refresh(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.refresh(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }

    public void merge(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.merge(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }

    public void delete(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.remove(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }

    public List<Socio> getSocios(){
        EntityManager em = getEntity();
        List<Socio> lista = null;
        em.getTransaction().begin();
        try {
            //lista = em.createNativeQuery("SELECT * FROM Socio", Socio.class).getResultList();
            lista = em.createQuery("SELECT s FROM Socio s", Socio.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return lista;
    }
    
    public List<Jugador> getJugadores(){
        EntityManager em = getEntity();
        List<Jugador> lista = null;
        em.getTransaction().begin();
        try {
            //lista = em.createNativeQuery("SELECT * FROM Socio", Socio.class).getResultList();
            lista = em.createQuery("SELECT j FROM Jugador j", Jugador.class).getResultList(); //Jugador va con la J mayúscula sino no anda
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return lista;
    }
}
