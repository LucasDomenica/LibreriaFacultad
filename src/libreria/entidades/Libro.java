/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Libro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long isbn;
    private String titulo;
    private Integer anio;
    private Integer Ejemplares;
    private Integer ejemplaresPrestados;
    private Integer ejemplaresRestantes;
    private Boolean Alta;
    @ManyToOne
    private Autor autor;
    @OneToOne
    private Editorial editorial;

    public Libro(Integer Ejemplares, long isbn, String titulo, Integer anio, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean Alta, Autor autor, Editorial editorial) {
        this.Ejemplares = Ejemplares;
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplaresPrestados = ejemplaresPrestados;
        this.ejemplaresRestantes = ejemplaresRestantes;
        this.Alta = Alta;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Libro() {
    }

    public Integer getEjemplares() {
        return Ejemplares;
    }

    public void setEjemplares(Integer Ejemplares) {
        this.Ejemplares = Ejemplares;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Integer getEjemplaresRestantes() {
        return ejemplaresRestantes;
    }

    public void setEjemplaresRestantes(Integer ejemplaresRestantes) {
        this.ejemplaresRestantes = ejemplaresRestantes;
    }

    public Boolean getAlta() {
        return Alta;
    }

    public void setAlta(Boolean Alta) {
        this.Alta = Alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "Ejemplares=" + Ejemplares + ", isbn=" + isbn + ", titulo=" + titulo + ", anio=" + anio + ", ejemplaresPrestados=" + ejemplaresPrestados + ", ejemplaresRestantes=" + ejemplaresRestantes + ", Alta=" + Alta + ", autor=" + autor + ", editorial=" + editorial + '}';
    }

}
