import java.lang.Math;
public class GeometryCalculator {

    private int precision;
    public GeometryCalculator() {
        this(2);
    }
    public GeometryCalculator(int precision){
        this.precision = precision;
    }
    
    
    public static double calculateArea(double a, double b, double c){
        if(a<=0 || b<=0 || c<=0) return 0;
        double s =(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));

    }

    public static double calculateArea(double base, double height, boolean isTriangle){
        if(base<=0 || height<=0) return 0;
        return isTriangle ?(base*height)/2 : base*height;
    }

    public static double calculateArea(double radius){
        if(radius<=0) return 0;
        return Math.PI *Math.pow(radius, 2);
    }

    public static double calculatePerimeter(double... sides){
        double perimeter = 0;
        for(double side : sides){
            if(side<=0) return 0;
            perimeter += side;
        }
        return perimeter;
    }

    public int getPrecision() {
        return precision;
    }

    
}
