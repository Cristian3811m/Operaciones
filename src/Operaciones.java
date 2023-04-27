import java.util.Scanner;
public class Operaciones {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        int a = sc.nextInt();
        System.out.println("Ingresa el segundo numero");
        int b = sc.nextInt();
        int suma = a + b;
        int resta = a - b;
        int multi = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println("Suma  " + suma);
        System.out.println("Resta  " + resta);
        System.out.println("Multiplicacion  " + multi);
        System.out.println("Divicion  " + div);
        System.out.println("Modulo  " + mod);
                
    }
}
