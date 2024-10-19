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
public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Ana");

        Evento evento1 = new Evento("Boda");
        Evento evento2 = new Evento("Aniversario");

        List<Matrimonio> matrimonios = new ArrayList<>();
        matrimonios.add(new Matrimonio(persona1, evento1));
        matrimonios.add(new Matrimonio(persona2, evento2));

        for (Matrimonio matrimonio : matrimonios) {
            matrimonio.mostrarMatrimonio();  // Muestra la relación de personas y eventos
        }
    }
}
