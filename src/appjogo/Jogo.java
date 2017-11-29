/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjogo;

import java.io.Serializable;

/**
 *
 * @author lab803
 */
public class Jogo implements Serializable {
    private String nome,produtora,plataforma;
    private double preco;

    public Jogo() {
    }

    public Jogo(String nome, String produtora, String plataforma, double preco) {
        this.nome = nome;
        this.produtora = produtora;
        this.plataforma = plataforma;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Jogo{" + "nome=" + nome + ", produtora=" + produtora + ", plataforma=" + plataforma + ", preco=" + preco + '}'+"\n";
    }
    
    
    
}
