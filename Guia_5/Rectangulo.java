import java.util.Scanner;
class DibujarCuadrado{
    public static void main(String[] args){
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce la longitud de los lados a y b: ");
        a = input.nextInt();
        b = input.nextInt();
        for (int i = 0; i < a; i++){
            if (i==0 || i==(a-1)){
                for (int j = 0; j < (b); j++){
                    System.out.print('*');
                }    
            }else {
                System.out.print('*');
                for (int j = 1; j < (b-1); j++){
                    if (j!=0 || j!=(b-2)){
                        System.out.print(' ');
                    }else{
                        System.out.print('*');
                    }
                }
                System.out.print('*');
            }
            System.out.println();
        }
    }
}