/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.gerenciador_de_pedidos;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

/**
 *
 * @author Thaynan
 */
public class PedidoTest {
    
    
    //@Mock
    //private Produto ProdutoMock;
    
    public PedidoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        // Inicializa o mock
        //ProdutoMock = mock(Produto.class);
    }
    
    @AfterEach
    public void tearDown() {
    }

    /*
    
    /**
     * Test of getPedido_Produtos method, of class Pedido.
     */
    @Test
    public void testGetPedido_Produtos() {
        
    }

    /**
     * Test of setPedido_Produtos method, of class Pedido.
     */
    @Test
    public void testSetPedido_Produtos() {
        
    }

    /**
     * Test of getNome_cliente method, of class Pedido.
     */
    @Test
    public void testGetNome_cliente() {
        
    }

    /**
     * Test of setNome_cliente method, of class Pedido.
     */
    @Test
    public void testSetNome_cliente() {
        
    }

    /**
     * Test of adicionarProduto method, of class Pedido.
     */
    @Test
    public void testAdicionarProduto() {
        
    }

    
    
    
    /**
     * Test of calcularTotal method, of class Pedido.
     */
    @Test
    public void testCalcularTotal() {
        System.out.println("calcularTotal");
        
        
        double total = 0; 
        
        Produto prod1 = new Produto();
        prod1.setId(1);
        prod1.setNome("Calça");
        prod1.setPreco(30);
        
        Produto prod2 = new Produto();
        prod2.setId(2);
        prod2.setNome("Camisa");
        prod2.setPreco(35);
        
        Produto prod3 = new Produto();
        prod3.setId(3);
        prod3.setNome("Tenis");
        prod3.setPreco(50);
        
        Pedido Pedido01 = new Pedido("Thaynan");
        Pedido01.adicionarProduto(prod1);
        Pedido01.adicionarProduto(prod2);
        Pedido01.adicionarProduto(prod3);
        
        total = Pedido01.calcularTotal();
        
        double esperado = ((prod1.getPreco() + prod2.getPreco() + prod3.getPreco()) * 0.9);
        System.out.println("valor total da compra é: " + esperado);
        assertEquals(esperado, total);
        
        
        
        
    }
    
}
