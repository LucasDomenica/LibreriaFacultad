/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.service;

import java.util.Scanner;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.Persistencia.LibroDao;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

/**
 *
 * @author BETH
 */
public class ServiceLibro {

    private Scanner sc;
    private LibroDao dao;

    public ServiceLibro() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.dao = new LibroDao();
    }

    public Libro crearLibro(String nombreLibro, String Autor, String nombre) throws Exception {
        try {
            Libro libro = new Libro();
            ServiceAutor sa = new ServiceAutor();
            ServiceEditorial se = new ServiceEditorial();
            //  System.out.println("Ingrese el titulo del libro");
            libro.setTitulo(nombreLibro);
            libro.setEjemplares(30);
            libro.setEjemplaresPrestados(10);
            libro.setEjemplaresRestantes(20);
            libro.setAnio(2021);
            libro.setAlta(Boolean.TRUE);
            libro.setAutor(sa.crearAutor(Autor));
            libro.setEditorial(se.crearEditorial(nombre));

            dao.guardarLibro(libro);

            return libro;
        } catch (Exception e) {
            throw e;
        }
    }

//    public Boolean darAltaBaja(Libro libro) throws Exception {
//        try {
//            
//            System.out.println("De sea de dar al libro de alta o baja? ");
//            String respuesta = sc.next();
//            
//            if (respuesta.equalsIgnoreCase("alta")) {
//                return true;
//            } else if (respuesta.equalsIgnoreCase("baja")) {
//                return false;
//            } else {
//                throw new Exception("Error debe ingresar alta o baja");
//            }
//        } catch (Exception e) {
//            throw e;
//        }
//        
//    }
    public void busquedaIsbn() {
        System.out.println("Ingrese el isbn que desea buscar");
        Long isbn = sc.nextLong();
        dao.busquedaIsbn(isbn);
    }

    public void busquedaTitulo() {
        System.out.println("Ingrese el titulo que desea buscar");
        String nombre = sc.next();
        dao.busquedaTitulo(nombre);
    }

    public void buscarTituloXAutor() {
        System.out.println("Ingrese el autor ");
        String nombre = sc.next();
        dao.busquedaLibroAutor(nombre);
    }

    public void buscarEditorial() {
        System.out.println("Ingrese el nombre de la editorial ");
        String nombre = sc.next();
        dao.busquedalibroEditorial(nombre);
    }
}
