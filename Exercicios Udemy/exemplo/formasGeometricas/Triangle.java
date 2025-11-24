
package exemplo.formasGeometricas;

public class Triangle {
    public double a;
    public double c;
    public double b;

    public double  area( ){
        double p = (a + b +c)/2;
        double result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return result;

    }



}
