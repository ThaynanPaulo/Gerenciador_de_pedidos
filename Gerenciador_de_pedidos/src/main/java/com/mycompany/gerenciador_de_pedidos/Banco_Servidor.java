/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciador_de_pedidos;

/**
 *
 * @author Thaynan
 */
public class Banco_Servidor {

    private final Banco_Repositorio repositorio;

    // Construtor para injeção de dependência
    public Banco_Servidor(Banco_Repositorio respositorio_cliente) {
        this.repositorio = respositorio_cliente;
    }

    public Banco_Usuário getUserById(Long id) {
        return repositorio.findById(id).orElseThrow(() -> new RuntimeException("Usuario nao encontrado!"));
    }

    public Banco_Usuário createUser(Banco_Usuário cliente) {
        return repositorio.save(cliente);
    }
}