import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println(">> Cálculo de Área <<");

        System.out.println("> Defina tipo de polígono a ser calculado: ");
        System.out.println("> 1. Quadrado \n 2. Retângulo \n 3. Triângulo \n 4. Círculo  ");
        int poligono = scanner.nextInt();

        switch(poligono){
            case 1:
            System.out.println("> Insira o lado do quadrado: ");
            var side = scanner.nextFloat();
            var areaSquare = side*side;
            System.out.printf("> A área do quadrado é: %.2f metros quadrados", areaSquare);
            break;

            case 2:
            System.out.println("> Insira o comprimento do retângulo: ");
            var comp = scanner.nextFloat();
            System.out.println("> Insira a altura do retângulo:");
            var largura = scanner.nextFloat();
            var areaRetangle = comp * largura;
            System.out.printf("> A área do retângulo é: %.2f metros quadrados ", areaRetangle);
            break;

            case 3:
            System.out.println("> Insira a altura do triângulo:");
            var altura = scanner.nextFloat();
            System.out.println("> Insira a base do triângulo:");
            var base = scanner.nextFloat();
            var areaTriangle = (base * altura) /2;
            System.out.printf("> A área do triângulo é: %.2f metros quadrados" , areaTriangle);
            break;

            case 4:
            System.out.println("> Insira raio do Círculo:");
            var raio = scanner.nextFloat();
            var areaCircle = 3.14 * (raio * raio);
            System.out.printf("> A área do círculo é: %.2f metros quadrados", areaCircle);
            break;

            default:
            System.out.println("> Erro; reinicializar");
        }
        
    } 
}
