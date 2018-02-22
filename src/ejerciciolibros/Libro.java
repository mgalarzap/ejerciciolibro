/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolibros;
import ejerciciolibros.Autor;
/**
 *
 * @author Estudiante
 */
public class Libro {
    private String titulo;
    private int numeroPaginas;
    private int calificacion;
    
    public Libro(String titulo, int numeroPaginas, int calificacion) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.calificacion = calificacion;
    }
    
    //
    
    Private Autor autor;
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    public int getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    public Autor getAutor() {
        return Autor;
    }
    
    public void setNumeroPaginas(Autor autor) {
        this.autor = autor;
    }
}
