package exemplo;

import exemplo.formasGeometricas.Retangulo;
import exemplo.formasGeometricas.Triangle;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        System.out.println("Informe as medidas do triângulo:");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();

        double areaX = x.area();
        System.out.printf("A área do primeiro triângulo é:%.2f\n\n", areaX);
        

        System.out.println("Informe as medidas do segundo triângulo:");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();
        
        double areaY = y.area();
        System.out.printf("A área do segundo triângulo é:%.2f", areaY);*/
        



        Retangulo retangulo= new Retangulo();
;

        System.out.println("Informe a altura do retângulo:");
        retangulo.height = input.nextDouble();

        System.out.println("Informe a largura do retângulo:");
        retangulo.width = input.nextDouble();

        System.out.println(retangulo);
        input.close();

        


        

    }

}
