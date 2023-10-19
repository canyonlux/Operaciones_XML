package org.example;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


import java.io.File;
import java.util.Arrays;
import java.util.List;

public class AtletaFemeninaSerialization {
    public static void main(String[] args) {
        List<AtletaFemenina> atletas = Arrays.asList(
                new AtletaFemenina("María", Arrays.asList("100 metros lisos", "Lanzamiento de peso"), 29, "España"),
                new AtletaFemenina("Ana", Arrays.asList("100 metros lisos", "Lanzamiento de peso", "Salto de altura"), 22, "Ecuador"),
                new AtletaFemenina("Sara", Arrays.asList("100 metros lisos", "Salto de altura"), 21, "Chile"),
                new AtletaFemenina("Lucía", Arrays.asList("100 metros lisos"), 25, "Mexico")
        );

        // Crear un objeto XmlMapper
        XmlMapper xmlMapper = new XmlMapper();

        try {
            // Serializar la lista de objetos a XML y escribir en un archivo
            xmlMapper.writeValue(new File("atletas_femeninas.xml"), atletas);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
