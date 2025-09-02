package co.edu.uniquindio.service;

import co.edu.uniquindio.model.Libro;

public interface IGestionInventario {
    void gestionarItem(Libro libro);
    void agregarLibro(Libro libro);
    void eliminarLibro(Libro libro);
}