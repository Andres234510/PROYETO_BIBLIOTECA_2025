package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Usuario> usuarios;
    private List<Libro> libros;
    private List<Prestamo> prestamos;
    private List<Bibliotecario> bibliotecarios;

    public Biblioteca() {
        usuarios = new ArrayList<>();
        libros = new ArrayList<>();
        prestamos = new ArrayList<>();
        bibliotecarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) { libros.add(libro); }
    public void agregarUsuario(Usuario usuario) { usuarios.add(usuario); }
    public void registrarPrestamo(Prestamo prestamo) { prestamos.add(prestamo); }
    public List<Bibliotecario> getBibliotecarios() { return bibliotecarios; }
    public void agregarBibliotecario( Bibliotecario bibliotecario){ bibliotecarios.add(bibliotecario);}

}
