import java.util.Scanner;
class Triangulo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ct;
        System.out.print("Introduce la longitud del cateto: ");
        ct = input.nextInt();
        for (int i = 0; i < ct; i++){
            for (int j = 0; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}