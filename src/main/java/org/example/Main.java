package org.example;

import domains.Pedido;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("----------- Pedido 01 -------------------");
            // Faça seus teste aqui!!!
            Pedido pedido = new Pedido();
            pedido.sucessoAoPagar();
            pedido.despacharPedido();

            System.out.println("----------- Pedido 02 -------------------");
            Pedido pedido2 = new Pedido();
            pedido2.sucessoAoPagar();
            pedido2.despacharPedido();
            pedido2.cancelarPedido();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}