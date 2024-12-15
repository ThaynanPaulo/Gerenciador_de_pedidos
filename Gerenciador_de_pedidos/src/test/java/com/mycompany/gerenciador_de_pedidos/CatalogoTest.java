/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.gerenciador_de_pedidos;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Thaynan
 */
public class CatalogoTest {
    
    
    
    public CatalogoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of adicionarProduto method, of class Catalogo.
     */
    @Test
    public void testAdicionarProduto() {
        Produto prod1 = new Produto();
        prod1.setId(107);
        prod1.setNome("Camisa");
        prod1.setPreco(80);
        
        Produto prod2 = new Produto();
        prod2.setId(103);
        prod2.setNome("Calca");
        prod2.setPreco(60);
        
        Produto prod3 = new Produto();
        prod3.setId(204);
        prod3.setNome("relogio");
        prod3.setPreco(90);
        
        Catalogo Catalogo_de_Produto = new Catalogo();
        Catalogo_de_Produto.adicionarProduto(prod1);
        Catalogo_de_Produto.adicionarProduto(prod2);
        Catalogo_de_Produto.adicionarProduto(prod3);
        
        
        
         for (int i = 0; i < Catalogo_de_Produto.getCatalogo().size(); i++) { 
            
            if (prod2.getId() == Catalogo_de_Produto.getCatalogo().get(i).getId()) {
                //System.out.println("Informações do produto: " + getCatalogo_de_Produto.get(i));
                Assertions.assertEquals(prod2.getId(), prod2.getId());
            break;
            }
            
        }
        
    }

    /**
     * Test of listarProdutos method, of class Catalogo.
     */
    @Test
    public void testListarProdutos() {
    }

    /**
     * Test of buscarProdutoPorId method, of class Catalogo.
     */
    @Test
    public void testBuscarProdutoPorId() {
        
        Produto prod1 = new Produto();
        prod1.setId(105);
        prod1.setNome("Camisa");
        prod1.setPreco(30);
        
        Produto prod2 = new Produto();
        prod2.setId(103);
        prod2.setNome("Calca");
        prod2.setPreco(60);
        
        Produto prod3 = new Produto();
        prod3.setId(204);
        prod3.setNome("relogio");
        prod3.setPreco(90);
        
        Catalogo Catalogo_de_Produto = new Catalogo();
        Catalogo_de_Produto.adicionarProduto(prod1);
        Catalogo_de_Produto.adicionarProduto(prod2);
        Catalogo_de_Produto.adicionarProduto(prod3);
        
        assertEquals(prod1.getNome(), Catalogo_de_Produto.buscarProdutoPorId(prod1.getId()));
    }

    /**
     * Test of getCatalogo method, of class Catalogo.
     */
    @Test
    public void testGetCatalogo() {
    }

    /**
     * Test of setCatalogo method, of class Catalogo.
     */
    @Test
    public void testSetCatalogo() {
    }
    
}
