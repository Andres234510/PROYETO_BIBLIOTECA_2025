package co.edu.uniquindio.service;

import co.edu.uniquindio.model.Bibliotecario;
import co.edu.uniquindio.model.Libro;
import co.edu.uniquindio.model.Prestamo;
import co.edu.uniquindio.model.Usuario;

import java.time.LocalDate;
import java.util.List;

public class PrestamoService implements IPrestamoServices {
    List<Prestamo> prestamosActivos;

    @Override
    public void realizarPrestamo(Libro libroAsociado, Usuario usuarioAsociado, Bibliotecario bibliotecario) {
        if( libroAsociado.isDisponible()) {
            Prestamo prestamo = new Prestamo(libroAsociado, usuarioAsociado, bibliotecario);
            prestamosActivos.add(prestamo);
            System.out.println("El préstamo del libro " + libroAsociado.getTitulo() + " ha sido realizado a " + usuarioAsociado.getNombre() + "por el bibliotecario " + bibliotecario.getNombre());
        }else{
            System.out.println("El libro " + libroAsociado.getTitulo() + " se encuentra prestado" );
        }
    }

    @Override
    public void eliminarPrestamo(Libro libroAsociado, Usuario usuarioAsociado, Bibliotecario bibliotecario) {
        for( Prestamo prestamo : prestamosActivos){
            if(prestamo.getUsuarioAsociado().equals(usuarioAsociado) && prestamo.getLibroAsociado().equals(libroAsociado) && prestamo.getFechaDevolucion()== null) {
                prestamo.setFechaDevolucion(LocalDate.now());
                prestamosActivos.remove(prestamo);
                libroAsociado.setDisponible(true);
                System.out.println(" El préstamo del libro " + libroAsociado.getTitulo() + " ha sido eliminado y este nuevamente está disponible" );
                return;
            }
        }
        System.out.println("No se encuentra un préstamo activo ");
    }
}
