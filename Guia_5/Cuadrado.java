import java.util.Scanner;
class DibujarCuadrado{
    public static void main(String[] args){
        int ld;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce la longitud de su lado: ");
        ld = input.nextInt();
        for (int i = 0; i < ld; i++){
            if (i==0 || i==(ld-1)){
                for (int j = 0; j < (ld); j++){
                    System.out.print('*');
                }    
            }else {
                System.out.print('*');
                for (int j = 1; j < (ld-1); j++){
                    if (j!=0 || j!=(ld-2)){
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