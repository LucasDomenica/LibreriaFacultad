/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import libreria.service.ServiceAutor;

import libreria.service.ServiceLibro;

/**
 *
 * @author BETH
 */
public class Libreria {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ServiceAutor sa = new ServiceAutor();
        ServiceLibro sl = new ServiceLibro();

        sl.crearLibro("Harry Potter", "Rowling", "Bloomsbury");
        sl.crearLibro("El Hombre Araña", "Stan Lee", "Marvel");
        sl.crearLibro("Las tortugas ninjas", "el luquitas ", "nose");
        sl.crearLibro("Black Panter", "Stan Lee", "marvel");
        sa.buscarAutor(); // si esta de alta o no hay libros disponibles de este autor
        sl.busquedaIsbn();  //busqueda por id
        
         sl.busquedaTitulo(); 
        sl.buscarTituloXAutor();
        sl.buscarEditorial();
    }

}
