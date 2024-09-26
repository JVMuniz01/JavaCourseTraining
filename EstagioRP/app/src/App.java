import java.util.Scanner;

public class App {

    public static boolean verificaFibonacci(int numero) {
        int a = 0, b = 1;
        if (numero == a || numero == b) {
            return true;
        }
        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        
        return b == numero;
    }
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero para verificar");
        int numero = s.nextInt();
        if (verificaFibonacci(numero) == true) {
            System.out.println("O número" + numero +" pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }
    }
}
