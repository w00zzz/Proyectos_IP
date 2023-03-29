import java.util.Scanner;
class ExisteUnNum{
    public static void main(String[] args){
        int cont = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un numero para ver si contiene 1 3 o 5: ");
        String num = input.nextLine();
        char[] numa = num.toCharArray();
        for (int i = 0; i < num.length(); i++){
            if ((Character.getNumericValue(numa[i]))==1 || (Character.getNumericValue(numa[i]))==3 || (Character.getNumericValue(numa[i]))==5){
                cont++;
            }
        }
        if (cont>0){
            System.out.println("Contiene 1 o 3 o 5 :)");
        }else{
            System.out.println("No contiene 1 o 3 o 5 :)");
        }
    }
}