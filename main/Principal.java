package main;

import java.util.Locale;
import java.util.Scanner;
import entities.Calcular;

public class Principal {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Calcular num1, num2; // atribuição das variáveis para o tipo Calcular (composto)
        num1 = new Calcular(); // instanciando
        //num2 = new Calcular(); // instanciando

        System.out.println("Digite dois numeros");
        num1.a = scanner.nextInt();
        num1.b = scanner.nextInt();

        int calculo1 = num1.taboada(); //atribui o valor retornado da chamada no metódo da classe.

        //int calculo2 = num2.taboada();//atribui o valor retornado da chamada no metódo da classe.
        System.out.println();
        System.out.println("********************************************************" );
        System.out.println("Mostra que teve um retorno da classe: " + calculo1);



        scanner.close();
    }

}
