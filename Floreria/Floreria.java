import java.util.Scanner;
class Floreria{
    public static void main(String[] args) {
        float cant_din;
        Scanner input = new Scanner(System.in);       
        System.out.print("Ofertas:\n  Arreglo tipo 1: Contiene flores de tipo A y tipo B [ $70 ]\n");
        System.out.print("  Arreglo tipo 2: Contiene flores de tipo C y tipo D [ $120 ]\n");
        System.out.print("Con que cantidad de dinero cuenta?\n~> ");
        cant_din = input.nextFloat();
        if (cant_din < 70){
            System.out.println("Lo sentimos, no se puede permitir ningun arreglo");
        } else if (cant_din < 120 && cant_din >= 70){
            System.out.printf("Usted puede comprar:\n\t1 arreglo de tipo 1 y le quedarian $%.2f",(cant_din%70));
        } else {
            System.out.printf("Usted puede comprar:\n\t%d arreglos tipo 1 y sobrarian $%.2f\n\t%d arreglos tipo 2 y sobrarian $%.2f\n",(int)(cant_din/70),(cant_din%70),(int)(cant_din/120),(cant_din%120));
        }
    }
}