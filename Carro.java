import javax.swing.JOptionPane;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double preco;
    private boolean disponibilidade;

    public Carro(String modelo, String marca, int ano, double preco, boolean disponibilidade) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
        this.disponibilidade = disponibilidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void imprimirDetalhes() {
        JOptionPane.showMessageDialog(null, "Modelo: " 
        + modelo 
        + "\nMarca: " 
        + marca + "\nAno: " 
        + ano 
        + "\nPreço: " 
        + preco);
    }
}
