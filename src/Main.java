import java.util.Scanner;

public class projec3 {
    public static void main(String[] args) {

        Scanner lector =new Scanner(System.in);

        double num;
        double resultado;

        System.out.println("///////////////////////////////////////////////////");

        System.out.println("ingresar el numero al que quiere elevar al cuadrado");
        num= lector.nextDouble();


        resultado = (num*num);

       System.out.println("la suma de estos dos numeros es:"+" "+resultado);

    }
}
