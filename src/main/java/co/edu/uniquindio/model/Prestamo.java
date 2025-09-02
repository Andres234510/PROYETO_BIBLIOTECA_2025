package co.edu.uniquindio.model;



import java.time.LocalDate;

public class Prestamo {
    private Libro libroAsociado;
    private Usuario usuarioAsociado;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Bibliotecario bibliotecario;

    public Prestamo(Libro libro, Usuario usuario,  Bibliotecario bibliotecario) {
        this.libroAsociado = libro;
        this.usuarioAsociado = usuario;
        this.fechaPrestamo = LocalDate.now();
        //this.fechaDevolucion = fechaDevolucion;
        this.bibliotecario = bibliotecario;
        libro.setDisponible(false);
    }

    public Libro getLibroAsociado() { return libroAsociado; }
    public Usuario getUsuarioAsociado() { return usuarioAsociado; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public LocalDate getFechaDevolucion(){ return fechaDevolucion;}
    public Bibliotecario getBibliotecario() { return bibliotecario; }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }



}