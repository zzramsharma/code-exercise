package lang.jdk8.basics.interfaces;

import lang.jdk8.basics.inheritance.ClassB;

public class ClassD {

    ClassB b;

    void helper(){
//        b.met1OfA();
//        System.out.println(b.x);
    }

    void m(Object a, Object b){
        System.out.println("m(Object a, Object b)");
    }
    void m(String a, String b){
        System.out.println("m(String a, String b)");
    }
    void m(Integer a, Integer b){
        System.out.println("m(Integer a, Integer b)");
    }

    public static void main(String[] args) {
        ClassD d = new ClassD();
//        d.m(null,null);
    }
}