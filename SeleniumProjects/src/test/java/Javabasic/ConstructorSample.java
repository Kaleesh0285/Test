package Javabasic;

import org.checkerframework.checker.units.qual.K;

public class ConstructorSample {

    static int b=10;//global variable

    public static void main(String[] args) {
        ConstructorSample Sample = new ConstructorSample();
        int a = Sample.m1();
        System.out.println(a);
        String name = Sample.m2();
        System.out.println(name);
        ConstructorSample.b();


    }

    public static void b() {
    }


    public int m1(){
        int a=10;
        System.out.println(a);
        return a;

    }
    public String m2(){
        String name = "Constructorsample";
        System.out.println(name);
        return name;

    }


}
