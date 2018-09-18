package lv.tsi.metodi;

import lv.tsi.metodi.printers.ConsolePrinter;
import lv.tsi.metodi.printers.IPrinter;
import lv.tsi.metodi.readers.IReader;
import lv.tsi.metodi.readers.PredefinedReader;

import static java.lang.Math.*;

public class Calculator{


    public Calculator() {

    }

        public double[][] sort(double[][] values){

            boolean isSorted = false;
            double[] buf = null;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < values.length-1; i++) {
                    if(values[i][0] < values[i+1][0]){
                        isSorted = false;

                        buf = values[i];
                        values[i] = values[i+1];
                        values[i+1] = buf;
                    }
                }
            }
            return values;


    }
    public double[][] forwardGauss(double[][] values){
        //razdelenie na matricu A i vector B
        double[][] newValues = null;
        int n = values.length;

        newValues[1][0] = values[1][0]*(-1 * values[1][0] / values[0][0]);
        newValues[1][1] = values[1][0]*(-1 * values[1][0] / values[0][0]);





        return values;

    }
    public double[][] backwardGauss(double[][] values){






        return values;

    }


}
