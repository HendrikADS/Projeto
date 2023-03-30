import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Carro> carrosComprados;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.carrosComprados = new ArrayList<Carro>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void adicionarCarroComprado(Carro carro) {
        carrosComprados.add(carro);
    }

    public void listarCarrosComprados() {
        String mensagem = "Lista de carros comprados pelo cliente " + nome + ":\n\n";
        if (carrosComprados.size() == 0) {
            mensagem += "O cliente não comprou nenhum carro ainda.";
        } else {
            for (Carro carro : carrosComprados) {
                mensagem += "Modelo: " + carro.getModelo() + "\nMarca: " + carro.getMarca() + "\nAno: " + carro.getAno() + "\nPreço: " + carro.getPreco() + "\n\n";
            }
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
