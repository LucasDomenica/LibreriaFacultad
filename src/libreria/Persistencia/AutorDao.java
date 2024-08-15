/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.Persistencia;

import java.util.Collection;
import libreria.entidades.Autor;

/**
 *
 * @author BETH
 */
public final class AutorDao extends Dao {

    public void guardarAutor(Autor au) throws Exception {
        try {
            if (au == null) {
                throw new Exception("Debe ingresar una editorial");
            }
            em.getTransaction().begin();
            em.persist(au);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Autor buscarAutor(String nombre) {
        System.out.println(" " + nombre);
        Autor usuario = (Autor) em.createQuery("SELECT a "
                + "FROM Autor a "
                + "WHERE a.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        System.out.println(usuario);
        return usuario;
    }

    public Collection<Autor> buscarAutores(String nombre) {

        Collection<Autor> au = em.createQuery("SELECT a "
                + "FROM Autor a "
                + "WHERE a.nombre LIKE :nombre ").setParameter("nombre", nombre).getResultList();
        for(Autor autor: au){
            System.out.println(autor.toString());
        }
        return au;
    }
}
