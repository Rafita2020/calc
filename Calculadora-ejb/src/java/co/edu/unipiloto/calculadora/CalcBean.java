/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.calculadora;

import javax.ejb.Stateless;

/**
 *
 * @author rafae
 */
@Stateless
public class CalcBean implements CalcBeanLocal {

    @Override
    public Integer sum(int num1, int num2) {
        return num1 + num2;
    }

    public Integer res(int num1, int num2) {
        return num1 - num2;
    }

    public Integer div(int num1, int num2) {
        return num1 / num2;
    }

    public Integer mult(int num1, int num2) {
        return num1 * num2;
    }

    public String identifica(String cadena) {
        String oper[];
        int num1 = 0;
        int num2 = 0;
        oper = cadena.split(" ");
        num1 = Integer.parseInt(oper[0]);
        num2 = Integer.parseInt(oper[2]);
        String calc =  "";
        if (oper[1].compareToIgnoreCase("+") == 0) {
            calc =  sum(num1, num2).toString();
        }

        if (oper[1].compareToIgnoreCase("-") == 0) {
            calc =  res(num1, num2).toString();
        }

        if (oper[1].compareToIgnoreCase("/") == 0) {
            calc =  div(num1, num2).toString();
        }

        if (oper[1].compareToIgnoreCase("*") == 0) {
            calc =  mult(num1, num2).toString();
        }

        return calc;
    }
}


