/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author BETH
 */
public abstract class Dao {
    protected EntityManagerFactory emf=Persistence.createEntityManagerFactory("LibreriaPU");
    protected  EntityManager em= emf.createEntityManager();
}
