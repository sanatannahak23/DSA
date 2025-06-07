package com.tp.practiceOne;

public class Test extends Demo {

    public Test(){
        System.out.println("test constructor");
    }
    static {
        System.out.println("Test is executed...");
    }

    @Override
    protected void m(){}

    public static void main(String[] args) {
        System.out.println("Main is executed.");
        new Test();
    }
}

class Demo{

    Demo(){
        System.out.println("demo constructor");
    }
    static {
        System.out.println("Demo executed");
    }

    void m(){}
}
