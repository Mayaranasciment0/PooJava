import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Zoologico zoologico = new Zoologico();
        int opcao;
        boolean continuar = true;

        do {
            System.out.println("Escolha uma das opções abaixo do nosso sistema: ");
            System.out.println("1 -> Cadastrar novo animal");
            System.out.println("2 -> Listar todos os animais cadastrados");
            System.out.println("3 -> Buscar animais por espécie");
            System.out.println("4 -> Remover Animal");
            System.out.println("0 -> Sair do sistema");

            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do animal:");
                    String nome = input.nextLine();
                    System.out.println("Digite a espécie do animal:");
                    String especie = input.nextLine();
                    System.out.println("Digite a idade do animal:");
                    int idade = input.nextInt();
                    input.nextLine();

                    Animal animal = new Animal(nome, especie, idade);
                    zoologico.adicionarAnimal(animal);

                    System.out.println("Animal cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Lista de todos os animais cadastrados:");
                    zoologico.listarAnimais();
                    break;
                case 3:
                    System.out.println("Digite a espécie para buscar:");
                    String especieBusca = input.nextLine();
                    zoologico.buscarPorEspecie(especieBusca);
                    break;
                case 4:
                    System.out.println("Digite o nome do animal para remover o cadastro:");
                    String nomeRemover = input.nextLine();
                    zoologico.removerAnimal(nomeRemover);
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (continuar);

        input.close();
    }
}
