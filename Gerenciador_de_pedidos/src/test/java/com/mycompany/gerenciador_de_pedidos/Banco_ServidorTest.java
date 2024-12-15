/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.gerenciador_de_pedidos;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Thaynan
 */
public class Banco_ServidorTest {
    
    
    @Mock
    private Banco_Repositorio repositorio;

    @InjectMocks
    private Banco_Servidor servidor;
    
   
    
    public Banco_ServidorTest() {
       MockitoAnnotations.openMocks(this);
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
     * Test of getUserById method, of class Cliente_Servidor.
     */
    
    
    @Test
    
    public void testGetUserById() {
        
        Banco_Usuário mock_usuario =  new Banco_Usuário (1L, "Thaynan");
        when(repositorio.findById(1L)).thenReturn(Optional.of(mock_usuario));
        
        Banco_Usuário usuario = servidor.getUserById(1L);
        System.out.println(usuario.getNome());
        
        
        assertEquals("Thaynan", usuario.getNome());    
        verify(repositorio, times(1)).findById(1L);
        

    }

        
    /**
      *Test of createUser method, of class Cliente_Servidor.
     */
    
     @Test
    public void testCreateUser() {
        Banco_Usuário usuario01 =  new Banco_Usuário (null, "Thaynan");
        Banco_Usuário usuario02 =  new Banco_Usuário (1L, "Thaynan");
        
        when(repositorio.save(usuario01)).thenReturn(usuario02);
        
        Banco_Usuário resultado = servidor.createUser(usuario01);
        
        assertEquals(2L, resultado.getId());
        assertEquals("Thaynan", resultado.getNome());
        verify(repositorio, times(1)).save(usuario01);
        
    }
    
}
