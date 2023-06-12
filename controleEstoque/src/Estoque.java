import java.util.ArrayList;
public class Estoque {
    private ArrayList<Item> itens;
    public Estoque() {itens = new ArrayList<>();}
    public void adicionarItem(Item item){itens.add(item);}
    public void removerItem(String nome) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getNome().equals(nome)) {
                itens.remove(i);
                break;
            }
        }
    }
    public void atualizarItem(String nome,
                   double novoPreco, int novaQuantidade) {
        for (Item item : itens) {
            if (item.getNome().equals(nome)) {
                item.setPreco(novoPreco);
                item.setQuantidade(novaQuantidade);
                break;
            }
        }
    }
    public void imprimirEstoque() {
        for (Item item : itens) {
            System.out.println("Nome: " + item.getNome() +
                    ", Preço: " + item.getPreco() + ", Quantidade: "
                    + item.getQuantidade());
        }
    }
}

















