package org.example;

import java.sql.SQLOutput;

public class MotoElectrica implements Moto{
    @Override
    public void conducir() {
        System.out.println("Conduciendo moto electrica");
    }
}
