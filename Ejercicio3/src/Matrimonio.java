/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author daniel
 */
public class Matrimonio {

    private Persona persona;
    private Evento evento;

    public Matrimonio(Persona persona, Evento evento) {
        this.persona = persona;
        this.evento = evento;
    }

    public void mostrarMatrimonio() {
        System.out.println(persona.getNombre() + " asistió al evento: " + evento.getDescripcion());
    }
}
