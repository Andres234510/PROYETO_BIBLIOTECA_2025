package co.edu.uniquindio.model;

import java.time.LocalDate;

public class Prestamo {
    private Libro libroAsociado;
    private Usuario usuarioAsociado;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Libro libro, Usuario usuario, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.libroAsociado = libro;
        this.usuarioAsociado = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        libro.setDisponible(false);
    }

    public Libro getLibroAsociado() { return libroAsociado; }
    public Usuario getUsuarioAsociado() { return usuarioAsociado; }
}