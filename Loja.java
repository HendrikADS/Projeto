import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Loja {
    private ArrayList<Carro> carros;
    private ArrayList<Vendedor> vendedores;

    public Loja() {
        this.carros = new ArrayList<Carro>();
        this.vendedores = new ArrayList<Vendedor>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void adicionarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void listarCarrosDisponiveis() {
        String mensagem = "Lista de carros disponíveis na loja:\n\n";
        if (carros.size() == 0) {
            mensagem += "Não há carros disponíveis na loja.";
        } else {
            for (Carro carro : carros) {
                if (carro.isDisponibilidade()) {
                    mensagem += "Modelo: " + carro.getModelo() + "\nMarca: " + carro.getMarca() + "\nAno: "
                            + carro.getAno() + "\nPreço: " + carro.getPreco() + "\n\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void listarVendedores() {
        String mensagem = "Lista de vendedores da loja:\n\n";
        if (vendedores.size() == 0) {
            mensagem += "Não há vendedores cadastrados na loja.";
        } else {
            for (Vendedor vendedor : vendedores) {
                mensagem += "Nome: " + vendedor.getNome() + "\nCPF: " + vendedor.getCpf() + "\n\n";
            }
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void listarVendas() {
        String mensagem = "Lista de vendas realizadas na loja:\n\n";
        boolean vendasRealizadas = false;
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getCarrosVendidos().size() > 0) {
                vendasRealizadas = true;
                mensagem += "Vendedor: " + vendedor.getNome() + "\n";
                for (Carro carro : vendedor.getCarrosVendidos()) {
                    mensagem += "Modelo: " + carro.getModelo() + "\nMarca: " + carro.getMarca() + "\nAno: "
                            + carro.getAno() + "\nPreço: " + carro.getPreco() * 1.2 + "\n\n";
                }
            }
        }
        if (!vendasRealizadas) {
            mensagem += "Não foram realizadas vendas na loja.";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
