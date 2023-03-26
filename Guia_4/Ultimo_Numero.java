import java.util.Scanner;
class UltimoNumero{
    public static void main(String[] args){
        int a, b;
        int cont = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce los valores de a y b respectivamente: ");
        a = input.nextInt();
        b = input.nextInt();
        for (int i = a; i <= b; i++){
            if (i%10 == 2 || i%10 == 3 || i%10 == 6){
                cont++;
            }
        }
        System.out.printf("Existen %d numeros que terminan en 2, 3 o 6 en el rango de %d hasta %d\n", cont, a, b);
    }
}