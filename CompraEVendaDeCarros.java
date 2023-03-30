import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CompraEVendaDeCarros {

    public static void main(String[] args) {

        // Criação de variáveis
        String carro, marca, modelo, ano, preco, cor, vendedor, comprador, opcao;
        ArrayList<String> listaCarros = new ArrayList<String>();

        // Laço principal
        while (true) {

            // Apresentação do menu
            opcao = JOptionPane.showInputDialog("Bem-vindo ao aplicativo de compra e venda de carros!\n" 
                                                + "1 - Vender carro\n" 
                                                + "2 - Comprar carro\n" 
                                                + "3 - Listar carros disponíveis\n" 
                                                + "4 - Encerrar aplicativo");

            if (opcao.equals("1")) {
                // Cadastro do carro a ser vendido
                marca = JOptionPane.showInputDialog("Cadastro de carro para venda\nInforme a marca do carro:");
                modelo = JOptionPane.showInputDialog("Informe o modelo do carro:");
                ano = JOptionPane.showInputDialog("Informe o ano do carro:");
                preco = JOptionPane.showInputDialog("Informe o preço de venda do carro:");
                cor = JOptionPane.showInputDialog("Informe a cor do carro:");
                vendedor = JOptionPane.showInputDialog("Informe o nome do vendedor:");

                // Adição do carro à lista
                listaCarros.add("Marca: " + marca + "\n" + 
                                 "Modelo: " + modelo + "\n" + 
                                 "Ano: " + ano + "\n" + 
                                 "Preço: " + preco + "\n" + 
                                 "Cor: " + cor + "\n" + 
                                 "Vendedor: " + vendedor + "\n");

                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

            } else if (opcao.equals("2")) {
                // Compra de carro
                int index = Integer.parseInt(JOptionPane.showInputDialog("Compra de carro\nInforme o índice do carro a ser comprado:"));

                if (index >= 0 && index < listaCarros.size()) {
                    // Seleção do carro a ser comprado
                    carro = listaCarros.get(index);

                    JOptionPane.showMessageDialog(null, "Você deseja comprar o seguinte carro?\n" + carro);

                    comprador = JOptionPane.showInputDialog("Informe o nome do comprador:");

                    JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!");

                    // Remoção do carro da lista
                    listaCarros.remove(index);
                } else {
                    JOptionPane.showMessageDialog(null, "Carro não encontrado!");
                }

            } else if (opcao.equals("3")) {
                // Listagem de carros disponíveis
                if (listaCarros.size() > 0) {
                    String lista = "";
                    for (String c : listaCarros) {
                        lista += c + "\n";
                    }
                    JOptionPane.showMessageDialog(null, "Lista de carros disponíveis:\n" + lista);
                } else {
                    JOptionPane.showMessageDialog(null, "Não há carros disponíveis!");
                }

            } else if (opcao.equals("4")) {
                // Encerramento do aplicativo
                JOptionPane.showMessageDialog(null, "Aplicativo encerrado!");
                break;
            }
        }
    }
}
