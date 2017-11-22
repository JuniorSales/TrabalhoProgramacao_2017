/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao_2017_adebalsalesjunior;

/**
 *
 * @author Júnior Sales
 */
public class Ex05_Livro {
    public class Livro {
    private String nome;
    private String autor;
    private int codigo;
    private double preco;
    private int qtdEstoque;

    public Livro() {
    }

    public Livro(String name, String aut, int cod, double price, int qtdE) {
        nome = name;
        autor = aut;
        codigo = cod;
        preco = price;
        qtdEstoque = qtdE;
    }

    public void setNome(String name) {
        nome = name.toUpperCase();
    }

    public void setAutor(String aut) {
        autor = aut.toUpperCase();
    }

    public void setCodigo(int cod) {
        codigo = cod;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
}
}
