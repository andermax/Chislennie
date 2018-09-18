package lv.tsi.metodi.printers;

import lv.tsi.metodi.readers.IReader;

public class ConsolePrinter implements IPrinter {

    @Override
    public void print( double[][] values) {

        for (int r = 0; r<values.length; r++){
            System.out.println("");
            for (int c = 0; c < values[0].length; c++){
                System.out.print(values[r][c]+"  \t\t");
            }

        }

    }
}
