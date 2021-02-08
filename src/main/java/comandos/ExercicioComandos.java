package comandos;

import java.util.Scanner;

public class ExercicioComandos {

    public static void main(String[] args) {

       System.out.println("Informe a nota do aluno:");
        int numero = new Scanner(System.in).nextInt();
        boolean aprovado = numero >=7;

        if(aprovado){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }

        System.out.println("Informe a classificação do produto:");
        int classificacao = new Scanner(System.in).nextInt();
        switch (classificacao){
            case 0:
            case 1:
                System.out.println("Péssimo");
                break;
            case 2:
                System.out.println("Ruim");
                break;
            case 3:
                System.out.println("Regular");
                break;
            case 4:
                System.out.println("Bom");
                break;
            case 5:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Classificação inválida!");
        }

        System.out.println("While: ");
        int contador = 0;

        while(contador < 10){
            contador = contador+1;
            System.out.println(contador);
        }

        //Laços infinitos -> for(;;){ if(){ break; } } igual while(true){}

        System.out.println("For: ");
        //SLOTS: 1- inicialização, 2- verificação, 3 - executado ao fim de cada iteração
        for(int count = 0; count < 10 ; count = count+1){
            System.out.println(count);
        }

        //Exemplo Anelisi
        Scanner sc = new Scanner(System.in);

        String nome = "...";
        int senha = 0;
        boolean securit = false;

        do {
            System.out.print("Nome: ");
            nome = sc.nextLine();

            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
            sc.nextLine();

            securit  = nome.equals("Anelisi") && senha == 123;
        }while (!securit);

        //Exemplo do/while

        int menu = 0;
        do {
            System.out.println("Informe o menu: 1- Adm OU 2- Cadastro");
            menu =  new Scanner(System.in).nextInt();
        }while ( menu != 1 && menu != 2 ); // && -> E, || -> OU

        //For
        System.out.println("For: ");
        for(int count = 150; count <= 300; count++){
            System.out.print(count + " ");
        }

        //While
        System.out.println("\nWhile: ");
        int count = 150;
        while( count <= 300){
            System.out.print(count + " ");
            count = count+1;
        }

        //DoWhile
        System.out.println("\nDoWhile: ");
        int countDoWhile = 150;
        do{
            System.out.print(countDoWhile+" ");
            countDoWhile++;
        }while (countDoWhile <= 300);

    }

}
