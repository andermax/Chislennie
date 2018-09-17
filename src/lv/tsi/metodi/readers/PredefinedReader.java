package lv.tsi.metodi.readers;

public class PredefinedReader implements IReader {

    private double[][] values = {
            {4.0, 3.0, -2.0, 4.0},
            {1.0, 2.0, 1.0, 8.0},
            {3.0, 2.0, 1.0, 10.0}
    };

    @Override
    public double[][] read() {
        return values = new double[][]{
                {4.0, 3.0, -2.0, 4.0},
                {0.0, 2.0, 1.0, 8.0},
                {3.0, 0.0, 1.0, 10.0}
        };
    }
}
