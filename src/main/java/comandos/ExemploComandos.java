package comandos;

import java.util.Scanner;

public class ExemploComandos {

    public static void main(String[] args) {

        //IF/ELSE - Par ou impar?
        System.out.println("Informe um número:");
        int numero = new Scanner(System.in).nextInt();

        // ==, !=, <, >, <=, >=        ---> expressões (boleanas)
        boolean ehPar = (numero %2 == 0); // se resto de 2 = 0, é par

        if(ehPar) {
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }

        //SWITCH: Considerando as áreas de DDD do RS, a partir do código, informe a região:
        // 51 Região Metropolitana de Porto Alegre.
        // 53 Pelotas e Região.
        // 54 Caxias do Sul e Região.
        // 55 Santa Maria e Região.
        byte ddd = 53;

        switch (ddd){
            case 51:
                System.out.println("Região Metropolitana de Porto Alegre");
                break; //Impede que ele execute os comandos abaixo caso entre aqui!
            case 53:
                System.out.println("Pelotas e Região");
                break;
            case 54:
                System.out.println("Caxias do Sul e Região");
                break;
            case 55:
                System.out.println("Santa Maria e Região");
                break;
            default:
                System.out.println("Região desconhecida!");
        }

    }
}
