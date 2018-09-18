package lv.tsi.metodi.readers;

public class PredefinedReader implements IReader {


    private final double[][] values;

    public PredefinedReader(double[][] values) {
        this.values = values;
    }

    @Override
    public double[][] read() {
        return this.values;
    }
}
