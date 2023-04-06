package org.example;

import tdas.QueueStack;
import tdas.StaticStack;

public class Main {
    public static void main(String[] args) {

        QueueStack colaPila = new QueueStack(3);
        StaticStack pila1 = new StaticStack();
        StaticStack pila2 = new StaticStack();
        StaticStack pila3 = new StaticStack();

        pila1.add(1);
        pila1.add(2);
        pila1.add(3);

        pila2.add(1);
        pila2.add(2);
        pila2.add(3);

        pila3.add(1);
        pila3.add(2);
        pila3.add(3);

        colaPila.add(pila1);
        colaPila.add(pila2);
        colaPila.add(pila3);

        System.out.println(colaPila.traza());
    }
}
