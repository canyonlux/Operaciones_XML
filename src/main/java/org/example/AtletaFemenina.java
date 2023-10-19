package org.example;

import java.util.Arrays;
import java.util.List;

public class AtletaFemenina {
    private String nombre;
    private List<String> pruebas;
    private int edad;
    private String pais;

    public AtletaFemenina() {
        // Constructor predeterminado vacío
    }

    public AtletaFemenina(String nombre, List<String> pruebas, int edad, String pais) {
        this.nombre = nombre;
        this.pruebas = pruebas;
        this.edad = edad;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getPruebas() {
        return pruebas;
    }

    public int getEdad() {
        return edad;
    }

    public String getPais() {
        return pais;
    }


    public static void main(String[] args) {
        List<AtletaFemenina> atletas = Arrays.asList(
                new AtletaFemenina("María", Arrays.asList("100 metros lisos", "Lanzamiento de peso"), 29, "España"),
                new AtletaFemenina("Ana", Arrays.asList("100 metros lisos", "Lanzamiento de peso", "Salto de altura"), 22, "Ecuador"),
                new AtletaFemenina("Sara", Arrays.asList("100 metros lisos", "Salto de altura"), 21, "Chile"),
                new AtletaFemenina("Lucía", Arrays.asList("100 metros lisos"), 25, "Mexico")
        );
    }
}
