/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.entidades;

import java.io.Serializable;
import javax.persistence.*;



@Entity
public class Autor implements Serializable  {
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
   // @Column(unique=true)
    private String nombre;
    private Boolean Alta;

    public Autor(Integer id, String nombre, Boolean Alta) {
        this.id = id;
        this.nombre = nombre;
        this.Alta = Alta;
    }

    public Autor() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAlta() {
        return Alta;
    }

    public void setAlta(Boolean Alta) {
        this.Alta = Alta;
    }

    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nombre=" + nombre + ", Alta=" + Alta + '}';
    }
    
}
