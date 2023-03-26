import java.util.Scanner;
class DibujarCuadrado{
    public static void main(String[] args){
        int ld;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce la longitud de su lado: ");
        ld = input.nextInt();
        for (int i = 0; i < ld; i++){
            for (int j = 0; j < ld; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}