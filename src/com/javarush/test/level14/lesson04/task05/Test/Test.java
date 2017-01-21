package com.javarush.test.level14.lesson04.task05.Test;

import java.util.Objects;

/**
 * Created by Gennary on 20.07.2015.
 */
public class Test {
    public static void main(String[] args) {

        B b1 = new B();
        C c1 = new C();
        print(b1);
        print(c1);
    }

    public static void print(A x){

        if(x instanceof B){
            B b2 = (B)x;
            b2.bPrint();
        }else{
            C c2 = (C)x;
            c2.cPrint();
        }
    }
    /*{System.out.println(person.getClass().getSimpleName())*/
    interface A { }

    static class B implements A{void bPrint(){System.out.println("class B");}}

    static class C implements A{void cPrint(){System.out.println("class C");}}


}
