package lv.tsi.metodi;

import lv.tsi.metodi.printers.ConsolePrinter;
import lv.tsi.metodi.printers.IPrinter;
import lv.tsi.metodi.readers.IReader;
import lv.tsi.metodi.readers.PredefinedReader;

public class Calculator{

    private final IReader reader;
    private final IPrinter printer;

    public Calculator(final IReader reader,
                      final IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }



    public void sort(){
        final double[][] values = reader.read();
        final double[][] sortedValues  = null;
        for (int i=0;i<values.length;i++){

            if(values[i][i] > values[i][i+1]){
                sortedValues[i] = values[i+1];
            }
            else sortedValues[i] = values[i];
        }
        


    }
    public void methodGaussa(){
            final double[][] values = reader.read();

            final double calcValues[][] = values;


            for (int i=0;i<values.length;i++){

                if(values[i][i] > values[i][i+1]){
                    calcValues[i] = values[i+1];
                }
                else calcValues[i] = values[i];
            }



            printer.print(calcValues);

    }


}
