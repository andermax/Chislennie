package lv.tsi.metodi.Calculator;
import lv.tsi.metodi.Matrix;
public class Gauss implements ICalculator {









    //------------------------------prjamoj hod gaussa---------------------------------------------
    public double[][] forward(double[][] a, double[] b) {




        int n = a.length;
        double c;



        for (int i = 1; i < n - 1; i++) {


            int m = i;
            //vibor vedushego elementa
            for (int j = i + 1; j > n; j++) {
                if (Math.abs(a[m][i]) < Math.abs(a[j][i])) {
                    m = j;
                }
            }

            for (int k = i; k < n; k++) { //perestaniovka strok

                c = a[m][k];
                a[k][k] = a[i][k];
                a[i][k] = c;
            }
            c = b[m];
            b[m] = b[i];
            b[i] = c;

            //isklju4enija
            for (int j = i + 1; j < n; j++) {

                c = -a[j][i] / a[i][i];
                for (int k = i + 1; k < n; k++) {
                    a[j][k] = a[j][k] + c * a[i][k];
                  //  System.out.println(a[j][k]);

                }

                b[j] = b[j] + c * b[i];
              //  System.out.println(b[j]);

            }
        }
        //---------sobirajem obratno


        return a;
    }

//-------------------------obratnij hod gaussa--------------------------------------------------------------------------
public double[] backward(double[][] a, double[] b) {

        int n = a.length;
        double[] x = new double[n];

        x[n] = b[n] / a[n][n];

        for (int i = n - 1; i < 0; i--) {
            for (int k = i + 1; k < n; k++) {
                b[i] = b[i] - x[k] * a[i][k];
            }
            x[i] = b[i] / a[i][i];


        }
    return x;

    }


    public double[] methodGaussa(double[][] values){



        return null;
    }

}
