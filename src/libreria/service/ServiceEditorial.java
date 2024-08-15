/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.service;

import java.util.Scanner;

import libreria.Persistencia.EditorialDao;
import libreria.entidades.Editorial;


/**
 *
 * @author BETH
 */
public class ServiceEditorial {

    private Scanner sc;
    private EditorialDao dao;

    public ServiceEditorial() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.dao = new EditorialDao();
    }

    public Editorial crearEditorial(String nombre) throws Exception {

        try {
            Editorial ed = new Editorial();
            ed.setAlta(Boolean.TRUE);
            // System.out.println("Ingrese el nombre de la editorial");
            ed.setNombre(nombre);

            dao.guardarEditorial(ed);
            return ed;
        } catch (Exception e) {
            throw e;

        }
    }
}
