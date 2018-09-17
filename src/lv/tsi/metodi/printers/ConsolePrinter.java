package lv.tsi.metodi.printers;

public class ConsolePrinter implements IPrinter {

    @Override
    public void print(double[][] values) {

        for (int r = 0; r<values.length; r++){
            for (int c = 0; c < values[r].length; r++){
                System.out.println(values[r][c]+"  \t\t");
            }

        }

    }
}
