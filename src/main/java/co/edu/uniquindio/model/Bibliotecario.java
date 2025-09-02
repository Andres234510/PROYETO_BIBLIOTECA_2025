package co.edu.uniquindio.model;

import co.edu.uniquindio.service.IGestionInventario;

public class Bibliotecario extends Empleado implements IGestionInventario {
    public Bibliotecario(String nombre, String idEmpleado) {
        super(nombre, idEmpleado);
    }

    @Override
    public void gestionarItem(Libro libro) {
        System.out.println("Gestionando libro: " + libro.getTitulo());
    }

    @Override
    public void agregarLibro(Libro libro) {


    }

    @Override
    public void eliminarLibro(Libro libro) {

    }

    public void gestionarPrestamo(Prestamo prestamo) {
        System.out.println("Gestionando préstamo de: " + prestamo.getLibroAsociado().getTitulo());
    }
}
