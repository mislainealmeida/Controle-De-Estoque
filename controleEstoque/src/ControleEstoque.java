import java.util.Scanner;
public class ControleEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Atualizar item");
            System.out.println("4 - Imprimir estoque");
            System.out.println("5 - Sair");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("\nAdicionar item:");
                System.out.print("Nome: ");
                String nome = scanner.next();
                System.out.print("Preço: ");
                double preco = scanner.nextDouble();
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();
                Item item = new Item(nome, preco, quantidade);
                estoque.adicionarItem(item);

            } else if (opcao == 2) {
                System.out.println("\nRemover item:");
                System.out.print("Nome: ");
                String nome = scanner.next();
                estoque.removerItem(nome);

            } else if (opcao == 3) {
                System.out.println("\nAtualizar item:");
                System.out.print("Nome: ");
                String nome = scanner.next();
                System.out.print("Novo preço: ");
                double novoPreco = scanner.nextDouble();
                System.out.print("Nova quantidade: ");
                int novaQuantidade = scanner.nextInt();
                estoque.atualizarItem(nome, novoPreco, novaQuantidade);

            } else if (opcao == 4) {
                System.out.println("\nEstoque:");
                estoque.imprimirEstoque();

            } else if (opcao == 5) {
                break;

            } else {
                System.out.println("\nOpção inválida!");
            }
        } scanner.close();
    }
}

