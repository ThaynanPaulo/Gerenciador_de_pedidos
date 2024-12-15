/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciador_de_pedidos;

import com.mycompany.gerenciador_de_pedidos.Catalogo;
import java.util.ArrayList;
import java.util.logging.Logger;


/**
 *
 * @author Thaynan
 */
public class Pedido {

    private ArrayList<Produto>  Pedido_Produtos;
    private String Nome_cliente;
    private static final Logger logger = Logger.getLogger(Pedido.class.getName());
    
    
    public Pedido(String nome) {
       this.Pedido_Produtos = new ArrayList<>();
       this.Nome_cliente = nome;
       logger.info("Pedido adicionado:" );
   }
    
    /**
     * @return the Pedido_Produtos
     */
    public ArrayList<Produto> getPedido_Produtos() {
        return Pedido_Produtos;
    }

    /**
     * @param Pedido_Produtos the Pedido_Produtos to set
     */
    public void setPedido_Produtos(ArrayList<Produto> Pedido_Produtos) {
        this.Pedido_Produtos = Pedido_Produtos;
    }

    /**
     * @return the Nome_cliente
     */
    public String getNome_cliente() {
        return Nome_cliente;
    }

    /**
     * @param Nome_cliente the Nome_cliente to set
     */
    public void setNome_cliente(String Nome_cliente) {
        this.Nome_cliente = Nome_cliente;
    }
   
    
    public void adicionarProduto(Produto produto) {
       getPedido_Produtos().add(produto);
    }

    
    //realiza a soma dos valores de cada produto. 
    // Quando o valor ultrapassa R$ 100,00 é informado sobre o desconto de 10%
    
    public double calcularTotal() {
        double total = 0;
     
        for (int i = 0; i < getPedido_Produtos().size(); i++) { 
           total = total + getPedido_Produtos().get(i).getPreco(); 
          }

        if (total > 100) {
             total = 0.9 * total;
             logger.info("Desconto de 10% realizado!" );
             
        }
     
     return total;
     
    }

    
    
}

