import java.util.Scanner;

public class Ejercicio3Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int var;
        int factorial = 1;
        var = getInt("Ingrese un número");
        for(int i=0;i<var;i++){
            factorial = factorial * (var-i);
        }
        System.out.println("El factorial del número ingresado es: " + factorial);
    }

    public static int getInt(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-9]*$")){
                n = "";
            }
        }
        
        return Integer.parseInt(n);
    }
}