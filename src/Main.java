import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Informe o número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Informe a operação: ");
        String op = entrada.next();

        double
                resultado = "+" .equals(op) ? num1 + num2 :0;
        resultado = "-" .equals(op) ? num1 - num2 : resultado;
        resultado = "*" .equals(op) ? num1 * num2 : resultado;
        resultado = "/" .equals(op) ? num1 / num2 : resultado;
        resultado = "%" .equals(op) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);

        entrada.close();
    }
}
