/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Equipo {
    private List<Jugador> jugadores;

    public Equipo() {
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public Jugador buscarJugador(String nombre) {
        return jugadores.stream()
                .filter(jugador -> jugador.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }

    public boolean eliminarJugador(Jugador jugador) {
        return jugadores.remove(jugador);
    }

    public void eliminarTodosLosJugadores() {
        jugadores.clear();
    }

    public void mostrarJugadores() {
        for (Jugador jugador : jugadores) {
            System.out.println("Jugador: " + jugador.getNombre());
        }
    }
}