package br.com.wenderson.exercicios.collections.desafiocomprascartao.model;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {

    private double limite;
    private double saldo;
    private List<Compra> compras;

    //construtor

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }


    public boolean registrarCompra(Compra compra) {

        if (compra.getValor() <= saldo) {
            compras.add(compra);
            saldo -= compra.getValor();
            return true;
        }

        return false;
    }


    //getters 

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}