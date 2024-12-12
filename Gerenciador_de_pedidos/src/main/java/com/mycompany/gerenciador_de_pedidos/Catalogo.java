/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciador_de_pedidos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.FileHandler;

/**
 *
 * @author Thaynan
 */
public class Catalogo {
    
   private ArrayList<Produto> Catalogo;
   private static final Logger logger = Logger.getLogger(Catalogo.class.getName());
   
   public Catalogo () {
       this.Catalogo = new ArrayList<>();
       
   }
    
   

   public void adicionarProduto(Produto produto) {
        getCatalogo().add(produto);
        logger.info("Produto adicionado:" );
        
    }
   
   //Lista os produtos por ordem de adição na lista
   
    public void listarProdutos() {
        
        for (int i = 0; i < getCatalogo().size(); i++) { 
            System.out.println("Informações do produto: " + getCatalogo().get(i));
           }
    
    }
    
    //Busca o código a partir do seu IP. Trás como retorno o nome do produto
  
    public String buscarProdutoPorId(int id) {
        for (int i = 0; i < getCatalogo().size(); i++) {
            if (getCatalogo().get(i).getId() == id) {
                System.out.println("Produto id nº " + id + ":" + getCatalogo().get(i));
                return getCatalogo().get(i).getNome();
            }
            
            
        }
        
        return "erro";
    }

    /**
     * @return the Catalogo
     */
    public ArrayList<Produto> getCatalogo() {
        return Catalogo;
    }

    /**
     * @param Catalogo the Catalogo to set
     */
    public void setCatalogo(ArrayList<Produto> Catalogo) {
        this.Catalogo = Catalogo;
    }


}
