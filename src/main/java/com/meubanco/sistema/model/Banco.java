package com.meubanco.sistema.model;

import lombok.Data;

import java.util.List;

@Data
public class Banco {
    private String name;
    private List<Conta> contas;
}
