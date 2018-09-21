package lv.tsi.metodi;

import lv.tsi.metodi.Calculator.ICalculator;
import lv.tsi.metodi.Calculator.Gauss;
import lv.tsi.metodi.printers.ConsolePrinter;
import lv.tsi.metodi.printers.IPrinter;

public class Main {

    public static void main(String[] args) {

        double[][] values = {
                {4.0, 3.0, -2.0, 4.0},
                {5.0, 8.0, 1.0, 8.0},
                {3.0, 2.0, -3.2, 10.0}
        };



       System.out.println(" ");


      IPrinter printer = new ConsolePrinter();
      Gauss calc = new Gauss();
      Matrix mtx = new Matrix(values);


     System.out.print("print values");
     printer.print(mtx.getValues());

       printer.print(mtx.getVectorB());

        System.out.println("metof gaussa");
       printer.print(calc.forward(mtx.getMtxA(),mtx.getVectorB()));








        }

    }





