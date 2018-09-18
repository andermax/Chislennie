package lv.tsi.metodi;

import lv.tsi.metodi.printers.ConsolePrinter;
import lv.tsi.metodi.printers.IPrinter;
import lv.tsi.metodi.readers.IReader;
import lv.tsi.metodi.readers.PredefinedReader;

import java.lang.reflect.Array;

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
        double[][] newValues = values;
        int n = values.length;

        newValues[1][0] = values[0][0]*(-1 * values[1][0] / values[0][0]) + values[1][0];
        newValues[1][1] = values[0][1]*(-1 * values[1][0] / values[0][0]) + values[1][1];
        newValues[1][2] = values[0][2]*(-1 * values[1][0] / values[0][0]) + values[1][2];
        newValues[1][1] = values[0][3]*(-1 * values[1][0] / values[0][0]) + values[1][3];

        values = newValues;

        newValues[2][0] = values[0][0]*(-1 * values[2][0] / values[0][0]) + values[2][0];
        newValues[2][1] = values[0][1]*(-1 * values[2][0] / values[0][0]) + values[2][1];
        newValues[2][2] = values[0][2]*(-1 * values[2][0] / values[0][0]) + values[2][2];
        newValues[2][3] = values[0][3]*(-1 * values[2][0] / values[0][0]) + values[2][3];

        values = newValues;

        values[1][0]



        return values;

    }
    public double[][] backwardGauss(double[][] values){






        return values;

    }


}
