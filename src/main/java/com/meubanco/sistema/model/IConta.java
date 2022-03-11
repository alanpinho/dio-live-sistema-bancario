package com.meubanco.sistema.model;

public interface IConta {

    void sacar(long valor);

    void depositar(long valor);

    void transferir(long valor, Conta contaDestino);

    void imprimirExtrato();
}
