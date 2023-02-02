/**
 * App
 */
import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("digite quantidade");

    int n = sc.nextInt();

    Tabela[] vetor = new Tabela[n];

    

    for (int i =0;i < vetor.length;i++){
        System.out.println("digite salario");
        double salario = sc.nextDouble();

        System.out.println("digite id");
        int id =sc.nextInt();

        System.out.println("digite nome");
        String nome = sc.next();

        vetor[i]= new Tabela(salario, nome);

        System.out.println(id);

    }

    sc.close();


    }

}