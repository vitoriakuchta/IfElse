import java.sql.Array;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Digite um numero: ");
        long numero = myObj.nextLong();
        int quantidadeCaracteres = Long.toString(numero).length();
        if (quantidadeCaracteres == 1)
            System.out.println("Este numero tem 1 digito");
        else if (quantidadeCaracteres > 1 && quantidadeCaracteres < 5)
            System.out.println("Este numero tem " + quantidadeCaracteres + " digitos");
        else
            System.out.println("Este numero tem 5 ou mais digitos");
    }
}