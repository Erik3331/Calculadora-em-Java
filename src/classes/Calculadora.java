package classes;

import java.util.Scanner;

import classes.operacoes.*;

public class Calculadora {
    public void menu(){
        int x;
        int y;

        System.out.println("Calculadora em Java\n");
        System.out.println("+ = Adicao");
        System.out.println("- = Subtracao");
        System.out.println("* = Multiplicacao");
        System.out.println("/ = Divisao");
        System.out.println("% = Porcentagem\n");

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        x = scan.nextInt();
        System.out.print("Insira uma operacao(+, -, *, /, %): ");
        char opc = scan.next().charAt(0);
        System.out.print("Insira outro numero: ");
        y = scan.nextInt();

        scan.close();

        Adicao adicao = new Adicao(x, y);
        Subtracao subtracao = new Subtracao(x, y);
        Multiplicacao multiplicacao = new Multiplicacao(x, y);
        Divisao divisao = new Divisao(x, y);
        Porcentagem porcentagem = new Porcentagem(x, y);

        switch (opc) {
            case '+':
                System.out.printf("Resultado: %d", adicao.adicao());
                break;

            case '-':
                System.out.printf("Resultado: %d", subtracao.subtracao());
                break;

            case '*':
                System.out.printf("Resultado: %d", multiplicacao.multiplicacao());
                break;

            case '/':
                System.out.printf("Resultado: %.2f", divisao.divisao());
                break;

            case '%':
                System.out.printf("Resultado: %.2f", porcentagem.porcentagem());
                break;
        
            default:
                System.out.println("Calculo invalido");
                break;
        }
        
    }
}
