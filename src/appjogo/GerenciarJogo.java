/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjogo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author lab803
 */
public class GerenciarJogo implements Serializable {
    private ArrayList<Jogo> listajogos = new ArrayList();
    
    public void adicionar(String nome, String prod, Double preco, String plat){
        Jogo c = new Jogo(nome, prod, plat, preco);
        listajogos.add(c);
    }
    public String listar(){
        String saida = "";
        for (Jogo listajogo : listajogos) {
            saida+= listajogo.toString()+"\n";
        }
        return saida;
    }
}
