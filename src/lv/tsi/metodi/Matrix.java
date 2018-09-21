package lv.tsi.metodi;

public class Matrix {


    public Matrix(double[][] values) {

        this.values = values;
        this.mtxA = separateMTX(this.values);
        this.vectorB = separateB(this.values);


    }

    private double[][] values;
    private double[][] mtxA;

    public double[][] getValues() {
        return values;
    }

    public double[][] getMtxA() {
        return mtxA;
    }

    public double[] getVectorB() {
        return vectorB;
    }

    private double[] vectorB;




    public double[][] sort(){ //kakoj to kosjak

        boolean isSorted = false;
        double[] buf = null;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < this.values.length-1; i++) {
                if(this.values[i][0] < this.values[i+1][0]){
                    isSorted = false;
                    buf = this.values[i];
                    this.values[i] = this.values[i+1];
                    this.values[i+1] = buf;
                }
            }
        }
        return this.values;

    }

    public double[][] separateMTX(double[][]values){ //matrica A
        int n = this.values.length;
        double[][] mtx = new double[n][n];
        double[] b = new double[n];

        for (int r = 0; r<this.values.length; r++){
            System.out.println("");
            for (int c = 0; c < this.values[0].length; c++){
                if (c<this.values.length) {

                    mtx[r][c] = this.values[r][c];

                }

            }


        }
        return mtx;

    }


    public double[] separateB(double[][] values){ //vector B
        int n = this.values.length;
        double[][] mtx = new double[n][n];
        double[] vector = new double[n];

        for (int r = 0; r<this.values.length; r++){

            vector[r] = this.values[r][values.length];

        }
        return vector;

    }






}
