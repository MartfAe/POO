package exemplo.formasGeometricas;

public class Retangulo {
    public double width;
    public double height;

    public double Area(){
        return width*height;
    }

    public double Perimeter(){
        double result = ((2*width)+(2*height));
        return result;
    }

    public double Diagonal(){
        double result = Math.sqrt((width*width)+(height*height));
        return result;
    }

    public String toString(){
        return ("AREA:")
        + String.format("%.2f", Area())
        +(" | PERIMÉTRO:")
        +String.format("%.2f", Perimeter())
        +(" | DIAGONAL:")
        +String.format("%.2f", Diagonal());

    }


}
