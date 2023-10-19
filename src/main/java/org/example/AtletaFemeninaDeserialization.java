package org.example;


import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.util.List;

public class AtletaFemeninaDeserialization  {
    public static void main(String[] args) {
        // Crear un objeto XmlMapper
        XmlMapper xmlMapper = new XmlMapper();

        try {
            // Deserializar la lista de objetos desde el archivo XML
            List<AtletaFemenina> atletas = xmlMapper.readValue(new File("atletas_femeninas.xml"),
                    //Aquí estamos diciendo que queremos deserializar el archivo XML en una lista de objetos AtletaFemenina
                    xmlMapper.getTypeFactory().constructCollectionType(List.class, AtletaFemenina.class));

            // Imprimir la información de las atletas
            for (AtletaFemenina atleta : atletas) {
                System.out.println("Nombre: " + atleta.getNombre());
                System.out.println("Pruebas: " + atleta.getPruebas());
                System.out.println("Edad: " + atleta.getEdad());
                System.out.println("País: " + atleta.getPais());
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
