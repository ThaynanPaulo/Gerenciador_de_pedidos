/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciador_de_pedidos;
import java.util.Optional;


/**
 *
 * @author Thaynan
 */



public interface Banco_Repositorio {
    Optional<Banco_Usuário> findById(Long id);
    Banco_Usuário save(Banco_Usuário cliente);
}    

