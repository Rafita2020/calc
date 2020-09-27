/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.calculadora;

import javax.ejb.Local;

/**
 *
 * @author rafae
 */
@Local
public interface CalcBeanLocal {

    Integer sum(int num1, int num2);
    Integer res(int num1, int num2);
    Integer div(int num1, int num2);
    Integer mult(int num1, int num2);
    
    String identifica(String operacion);
    

    
    
}
