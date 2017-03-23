/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdemop4_2;

/**
 *
 * @author Rolando
 */
public class Bean {
    private int a;
    private double b;
    private String c;

     public Bean() {
        this.a = 0;
        this.b = 0.0;
        this.c = "";
    }
     
    public Bean(int a, double b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
    
    
}
