import java.util.Scanner;
class AdivinaAdivinador{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String resp;
        int adiv = 50;
        int max = 100;
        int min = 1;
        System.out.println("Piensa en un numero y voy a tratar de adivinarlo en 7 intentos o menos");
        for (int i = 0; i<7; i++){
            System.out.printf("Es %d tu numero? (si/no) ~> ", adiv);
            resp = input.nextLine();
            if (resp.equals("si")){
                System.out.printf("Adivine tu numero! Era %d, lo hice en el %d intento!\n", adiv, i);
                break;
            }else if (resp.equals("no")){
                System.out.printf("Tu numero es mayor o menor que %d? (mayor/menor) ~> ", adiv);
                resp = input.nextLine();
                if (resp.equals("mayor")){
                    min = adiv+1;
                    adiv = (max+min)/2;
                }else if(resp.equals("menor")){
                    max = adiv-1;
                    adiv = (max+min)/2;
                }else{
                    System.out.printf("Respuesta invalida!");
                }
            } else{
                System.out.printf("Respuesta invalida!");
            }
            System.out.println("No pude adivinar tu numero en 7 preguntas. Lo siento");
        }
        
    }
}