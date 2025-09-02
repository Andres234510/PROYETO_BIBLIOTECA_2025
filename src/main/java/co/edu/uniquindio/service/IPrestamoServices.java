package co.edu.uniquindio.service;

import co.edu.uniquindio.model.Bibliotecario;
import co.edu.uniquindio.model.Libro;
import co.edu.uniquindio.model.Usuario;

import java.time.LocalDate;

public interface IPrestamoServices {
    void realizarPrestamo(Libro libroAsociado, Usuario usuarioAsociado, Bibliotecario bibliotecario);
    void eliminarPrestamo(Libro libroAsociado, Usuario usuarioAsociado, Bibliotecario bibliotecario);
}
