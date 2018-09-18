package lv.tsi.metodi;

import lv.tsi.metodi.printers.ConsolePrinter;
import lv.tsi.metodi.printers.IPrinter;
import lv.tsi.metodi.readers.IReader;
import lv.tsi.metodi.readers.PredefinedReader;

import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[][] values = {
                {4.0, 3.0, -2.0, 4.0},
                {5.0, 8.0, 1.0, 8.0},
                {3.0, 2.0, -3.2, 10.0}
        };


        for (int r = 0; r<values.length; r++){
            System.out.println("");
            for (int c = 0; c < values[0].length; c++){
                System.out.print(values[r][c]+"  \t\t");
            }

        }
        System.out.println("\n metod printer");
        IPrinter printer = new ConsolePrinter();
        printer.print(values);

        System.out.println("\n\n sort");
        Calculator calc = new Calculator();


        System.out.println("gauss");
        printer.print(calc.forwardGauss(values));

    }

}


