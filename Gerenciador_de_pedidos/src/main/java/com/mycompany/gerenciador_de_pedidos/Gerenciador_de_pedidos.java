/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



package com.mycompany.gerenciador_de_pedidos;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;


/**
 *
 * @author Thaynan
 */
public class Gerenciador_de_pedidos{

    public static void main(String[] args) {
        
        
        
        Produto prod = new Produto();
        prod.setId(100);
        prod.setNome("Calça");
        prod.setPreco(70);
        
        Produto prod2 = new Produto();
        prod2.setId(2);
        prod2.setNome("Camisa");
        prod2.setPreco(40);
        
        
        Catalogo Catalogo_de_Produto = new Catalogo();
        Catalogo_de_Produto.adicionarProduto(prod);
        Catalogo_de_Produto.adicionarProduto(prod2);
        Catalogo_de_Produto.listarProdutos();
        Catalogo_de_Produto.buscarProdutoPorId(100);
        Catalogo_de_Produto.listarProdutos();
        
        Pedido Pedido01 = new Pedido("Thaynan");
        Pedido01.adicionarProduto(prod2);
        Pedido01.adicionarProduto(prod);
        double total = Pedido01.calcularTotal();
        
        
    }
}

