/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author daniel
 */
public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo();

        Jugador jugador1 = new Jugador("Messi");
        Jugador jugador2 = new Jugador("Ronaldo");

        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);

        // Mostrar todos los jugadores
        equipo.mostrarJugadores();

        // Buscar un jugador
        Jugador encontrado = equipo.buscarJugador("Messi");
        System.out.println("Jugador encontrado: " + (encontrado != null ? encontrado.getNombre() : "No encontrado"));

        // Eliminar un jugador
        equipo.eliminarJugador(jugador1);
        equipo.mostrarJugadores();

        // Eliminar todos los jugadores
        equipo.eliminarTodosLosJugadores();
        equipo.mostrarJugadores();
    }
}