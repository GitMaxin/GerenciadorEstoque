import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String produto = "Teclado Mecânico";
        int quantidade = 50;
        int opcao = 0;

        System.out.println("Produto: " + produto);

        String menu = "***Digite sua opção***\n" +
                "1 - Consultar quantidade em estoque\n" +
                "2 - Adicionar produtos ao estoque\n" +
                "3 - Retirar produtos do estoque\n" +
                "4 - Sair";

        while (opcao != 4) {

            System.out.println(menu);
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("A quantidade atual em estoque é: " + quantidade);
                    break;

                case 2:
                    System.out.println("Quantos produtos você quer adicionar?");
                    int adicionar = sc.nextInt();
                    if (adicionar > 0) {
                        quantidade += adicionar;
                        System.out.println("Você adicionou " + adicionar + " produtos ao estoque.");
                    } else {
                        System.out.println("Operação inválida!");
                        System.out.println("Verifique o número de produtos.");
                    }
                    break;

                case 3:
                    System.out.println("Quantos produtos você quer retirar?");
                    int retirar = sc.nextInt();
                    if (retirar > 0 && retirar <= quantidade) {
                        quantidade -= retirar;
                        System.out.println("Você retirou " + retirar + " produtos do estoque.");
                    } else {
                        System.out.println("Operação inválida!");
                        System.out.println("Verifique o número de produtos e a quantidade em estoque.");
                    }
                    break;

                case 4:
                    System.out.println("Obrigado por usar o sistema de gerenciamento de estoque!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    System.out.println("Digite um número entre 1 e 4.");
            }

            if (quantidade < 10) {
                System.out.println("Atenção! A quantidade em estoque está baixa!");
            }
        }
        sc.close();
    }
}
