/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author paulb
 */
public interface Calculator <T extends Number> {
    
    double calculateFees(T clubID);
    
}
