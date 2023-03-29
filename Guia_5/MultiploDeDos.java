import java.util.Scanner;
class MultiploDeDos{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un numero para encontrar su minimo como un multiplo ~> ");
        double num = input.nextDouble();
        for (; num%2 != 0;){
            num += num;
        }
        System.out.printf("El minimo como un multiplo es ~> %s\n", num);
    }
}