package org.example;

import java.sql.SQLOutput;

public class WordDocuments implements DocumentosGenerador{
    @Override
    public void generatedDocument() {
        System.out.println("Documento Word generado");
    }
}
