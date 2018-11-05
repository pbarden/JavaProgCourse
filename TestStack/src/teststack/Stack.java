/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststack;

/**
 *
 * @author paulb
 */
public class Stack {
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = -1; //top of stack
    }

    void push(int item) { // push to stack
        if(tos==9)
            System.out.println("Full stack");
        else
            stck[++tos] = item;
    }

    int pop() {
        if(tos < 0) {
            System.out.println("Underflow");
            return 0;
        }
        else
            return stck[tos--];
    }
}