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
        Puerta puertaInicial = new Puerta("Madera");
        Casa miCasa = new Casa(puertaInicial);

        System.out.println("Material de la puerta: " + miCasa.obtenerPuerta().getMaterial());

        Puerta nuevaPuerta = new Puerta("Metal");
        miCasa.cambiarPuerta(nuevaPuerta);
        System.out.println("Nueva puerta material: " + miCasa.obtenerPuerta().getMaterial());

        try {
            miCasa.eliminarPuerta();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
