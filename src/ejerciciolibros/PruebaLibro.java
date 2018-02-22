/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolibros;

import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class PruebaLibro {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("NombreAutor");
        String nombre = teclado.next();
        
        //dependencia                
        Autor autor= new Autor (nombre, "Gir", telefono);
        Libro libro = new Libro ("Gir", 35154);
        //asociando el libro con el autor
        libro.setAutor(autor);
        //
        String autorLibro = libro.getAutor().getNombre();
        System.out.println("autorLibro");
    }
    
}
