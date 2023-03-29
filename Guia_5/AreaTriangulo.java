import java.util.Scanner;
class AreaTriangulo{
    public static void main(String[] args){
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce los tres lados a b c: ");
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
        if(((a+b)>c)&&((a+c)>b)&&((b+c)>a)){
            System.out.println("El area del triangulo usando los tres lados es: "+((Math.sqrt(((a+b+c)*(a+b-c)*(a+c-b)*(c+b-a))))/4));
        }else{
            System.out.println("No es un triangulo :(");
        }
    }
}