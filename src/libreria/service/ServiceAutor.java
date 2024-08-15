/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.service;

import java.util.Scanner;

import libreria.Persistencia.AutorDao;
import libreria.entidades.Autor;

/**
 *
 * @author BETH
 */
public class ServiceAutor {

    private Scanner sc;
    private AutorDao dao;

    public ServiceAutor() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.dao = new AutorDao();
    }

    public Autor crearAutor(String nombre) throws Exception {
        try {

            Autor au = new Autor();
            au.setAlta(Boolean.TRUE);
            au.setNombre(nombre);

            dao.guardarAutor(au);
            return au;
        } catch (Exception e) {
            throw e;
        }
    }

    public void buscarAutor() {
        System.out.println("Ingrese el autor que desear buscar");
        String nombre = sc.next();
        dao.buscarAutores(nombre);
    }

}
