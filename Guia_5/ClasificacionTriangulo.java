import java.util.Scanner;
class ClasificacionTriangulo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.print("Introduce los valores de a b c: ");
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
        if (a==b && b==c && c==a){
            System.out.println("Equilatero");
        }else if (a!=b && b!=c && c!=a){
            System.out.println("Escaleno");
        }else if (a==b || b==c || a==c){
            System.out.println("Isoceles");
        }
    }
}