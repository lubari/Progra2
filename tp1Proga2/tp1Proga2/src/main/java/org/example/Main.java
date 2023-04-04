package org.example;

import tdas.DynamicStack;
import tdas.QueueStack;
import tdas.StaticQueue;
import tdas.StaticStack;

public class Main {
    public static void main(String[] args) {
        QueueStack queueStack = new QueueStack(3);
        StaticStack staticStack = new StaticStack();
        staticStack.add(1);
        staticStack.add(2);
        staticStack.add(3);

        queueStack.add(staticStack);
        queueStack.add(staticStack);
        queueStack.add(staticStack);

        System.out.println(queueStack.traza());


    }
}