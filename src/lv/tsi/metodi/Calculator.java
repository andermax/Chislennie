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

        newValues[2][0] = values[1][0]*(-1 * values[2][1] / values[1][1]) + values[2][0];
        newValues[2][1] = values[1][1]*(-1 * values[2][1] / values[1][1]) + values[2][1];
        newValues[2][2] = values[1][2]*(-1 * values[2][1] / values[1][1]) + values[2][2];
        newValues[2][3] = values[1][3]*(-1 * values[2][1] / values[1][1]) + values[2][3];

        //values=newValues;
        System.out.println(values[2][3]);


        for(int i=1;i<n-1;i++){
            int m=i;
            for(int j=i+1;j<n;j++){
                if (abs(values[m][i])< abs(values[j][i]))
                    m=j;
                else
                    j++;
                for(int k=i;k<n;k++){
                    double c = values[m][k];
                    values[m][k]=values[i][k];
                    values[i][k]=c;
                    k++;
                    c=b[m];
                    b[m]=b[i];
                    b[i]=c;

                }
                for(j=i+1;j<n;j++){
                    c=-values[j][i]/values[i][i];
                    for (k=i+1;k<n;k++){
                        values
                    }
                }
            }
        }


        return values;

    }
    public double[][] backwardGauss(double[][] values){






        return values;

    }


}
