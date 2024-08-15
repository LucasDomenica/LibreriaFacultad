/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.Persistencia;

import java.util.Collection;
import libreria.entidades.Libro;

/**
 *
 * @author BETH
 */
public final class LibroDao extends Dao {

    public void guardarLibro(Libro libro) throws Exception {
        try {
            if (libro == null) {
                throw new Exception("Debe ingresar un titulo");
            }
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void modificarLibro(Libro libro) {
        try {
            if (libro == null) {
                throw new Exception("ERROR no se encuentra el libro");
            }
            em.getTransaction().begin();
            em.merge(libro);
            em.getTransaction().commit();
        } catch (Exception e) {
        }
    }

    public Libro busquedaIsbn(Long isbn) {
        Libro li = (Libro) em.createQuery("SELECT l "
                + "FROM Libro l "
                + "WHERE l.isbn = :isbn").setParameter("isbn", isbn).getSingleResult();
        System.out.println(li);
        return li;
    }

    public Libro busquedaTitulo(String titulo) {
        Libro li = (Libro) em.createQuery("SELECT l "
                + "FROM Libro l "
                + "WHERE l.titulo LIKE :titulo").setParameter("titulo", titulo).getSingleResult();
        System.out.println(li);
        return li;
    }

    public Collection<Libro> busquedaLibroAutor(String nombre) {
        Collection<Libro> li = em.createQuery("SELECT l "
                + "FROM Libro l "
                + "WHERE l.autor.nombre LIKE :nombre ").setParameter("nombre", nombre).getResultList();
        for (Libro libro : li) {
            System.out.println(libro.getTitulo());
        }
        return li;
    }

    public Collection<Libro> busquedalibroEditorial(String nombre) {
        Collection<Libro> li = em.createQuery("SELECT l "
                + "FROM Libro l "
                + "WHERE l.editorial.nombre LIKE :nombre ").setParameter("nombre", nombre).getResultList();
        for (Libro libro : li) {
            System.out.println(libro.getTitulo());
        }
        return li;
    }
}
