import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println(">> Cálculo de Área <<");

        System.out.println("> Defina tipo de polígono a ser calculado: ");
        System.out.println("> 1. Quadrado \n 2. Retângulo \n 3. Triângulo \n 4. Círculo  ");
        var poligono = scanner.nextLine();
        

        if (poligono == "T") {

            System.out.println("> Insira a altura do triângulo:");
            int altura = scanner.nextInt();
            System.out.println("> Insira a base do triângulo:");
            int base = scanner.nextInt();
            var areaTriangle = base * altura /2;

            System.out.printf("> A área do triângulo é: %d metros quadrados " ,areaTriangle);


        } else if (poligono == "4") {

            System.out.println("> Insira raio do Círculo:");
            int raio = scanner.nextInt();
            var areaCircle = 3.14 *(raio * raio);

            System.out.printf("> A área do círculo é: %d metros quadrados", areaCircle);

        } else {

            System.out.println("> Insira tamanho do lado: ");
            int side = scanner.nextInt();
            var area = side * side;

            System.out.printf("> A área do polígono é: %d metros quadrados ", area);


        }
        
    } 
}
