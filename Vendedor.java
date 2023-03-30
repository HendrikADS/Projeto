import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Vendedor {
    private String nome;
    private String cpf;
    private ArrayList<Carro> carrosVendidos;

    public Vendedor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.carrosVendidos = new ArrayList<Carro>();
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
    
    public ArrayList<Carro> getCarrosVendidos() {
            return carrosVendidos;
        }
    
        public void realizarVenda(Carro carro, double preco) {
            carrosVendidos.add(carro);
            JOptionPane.showMessageDialog(null, "Venda realizada para o vendedor " 
            + nome + " no valor de R$ " 
            + preco + ".");   
    }
}