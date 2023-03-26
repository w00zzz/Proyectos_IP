import java.util.Scanner;
class Cuadrado{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = 1;
        while (num != 42){
            System.out.printf("Introduce un numero para hallar su cuadrado:\n~> ");
            num = input.nextInt();
            System.out.printf("Cuadrado de %d: %d\n", num, (int)(Math.pow(num, 2)));
        }
    }
}