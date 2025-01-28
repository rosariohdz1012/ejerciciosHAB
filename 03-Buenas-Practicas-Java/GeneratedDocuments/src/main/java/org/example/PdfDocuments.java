package org.example;

import java.sql.SQLOutput;

public class PdfDocuments implements DocumentosGenerador {
    @Override
    public void generatedDocument() {
        System.out.println("Documento PDF generado");
    }
}
