package com.javarush.test.level14.lesson06.home01.Test;


public class Test {
    public static void main(String[] args) {
        AA x = H.getH(I.s2);
        x.getIntAA();
    }

    public static class H{
        static AA getH(String sH) {
            AA x = null;
            //add your code here
//            if      (sH == "Интерфейс-I1") {x = new A();}
//            else if (sH == "Интерфейс-I2") {x = new B();}

            switch (sH) {
                case ("Интерфейс-I1"):  x = new A(); break;
                case ("Интерфейс-I2"):  x = new B(); break;
            }
            return x;
        }
    }

    public interface I{
        String s1 = "Интерфейс-I1";
        String s2 = "Интерфейс-I2";
        //String s3 = "Интерфейс I3";
    }

}
