
import java.util.Arrays;

public class GeometryCalculator {
    private int precision ; 
    
    public GeometryCalculator(){
        this(2);
    }


    public GeometryCalculator(int precision){
        this.precision=precision;
    }


    public double CalculateArea(double radius){
        double area = Math.PI *(radius*radius);
        return area;
    }

    public void calculateArea(double width, double height){
        double areaRetangle= width * height;
        double areaTriangle = ((width*height)/2);

        System.out.println("Retangle area: "+round(areaRetangle));
        System.out.println("Triangle area: "+round(areaTriangle));
    }


    public double calculatePerimeter(double... sides){
        double sum = 0;
        for(double s : sides){
            sum +=s;   
        }

        return round(sum);



    }


    private double round(double value){
        double factor = Math.pow(10, precision);
        return Math.round(value * factor)/factor;
    }


}