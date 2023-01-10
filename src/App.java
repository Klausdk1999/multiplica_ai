import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Insira o número que você quer multiplicar:");

        Scanner s = new Scanner(System.in);
        int entrada = s.nextInt();
        s.close();

        System.out.println("Tabela de multiplicação do " + entrada);

        String leftAlignFormat = "| %-13s | %-9d |%n";

        System.out.format("+---------------+-----------+%n");
        System.out.format("| Mutiplicação  | Resultado |%n");
        System.out.format("+---------------+-----------+%n");
        for (int i = 1; i < 11; i++) {
            System.out.format(leftAlignFormat, entrada + " * " + i, entrada * i);
        }
        System.out.format("+---------------+-----------+%n");
    }
}
