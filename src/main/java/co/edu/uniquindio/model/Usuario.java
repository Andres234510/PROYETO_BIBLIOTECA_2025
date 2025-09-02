package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String idUsuario;
    private List<Prestamo> prestamosActivos;

    public Usuario(String nombre, String idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.prestamosActivos = new ArrayList<>();
    }
    public String getNombre(){return nombre;}
    public String getIdUsuario(){return idUsuario;}

    public void agregarPrestamo(Prestamo prestamo) {
        prestamosActivos.add(prestamo);
    }



    public List<Prestamo> getPrestamosActivos() {
        return prestamosActivos;
    }
}
