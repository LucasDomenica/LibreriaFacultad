/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.Persistencia;

import libreria.entidades.Editorial;

/**
 *
 * @author BETH
 */
public final class EditorialDao extends Dao{
    public void guardarEditorial(Editorial ed) throws Exception{
        try {
            if (ed==null) {
                throw new Exception("Debe ingresar una editorial");
            }
        em.getTransaction().begin();
        em.persist(ed);
        em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }
    }
}
