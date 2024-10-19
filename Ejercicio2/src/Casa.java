/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author daniel
 */
public class Casa {

    private Puerta puerta;

    public Casa(Puerta puerta) {
        if (puerta == null) {
            throw new IllegalArgumentException("Una casa no puede existir sin una puerta.");
        }
        this.puerta = puerta;
    }

    public void cambiarPuerta(Puerta nuevaPuerta) {
        if (nuevaPuerta == null) {
            throw new IllegalArgumentException("La puerta no puede ser nula.");
        }
        this.puerta = nuevaPuerta;
    }

    public Puerta obtenerPuerta() {
        return this.puerta;
    }

    public void eliminarPuerta() {
        throw new UnsupportedOperationException("No se puede eliminar la puerta. La casa dejaria de existir.");
    }
}
