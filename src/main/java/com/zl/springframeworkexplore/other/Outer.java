package com.zl.springframeworkexplore.other;

public class Outer {
     public static class Inner{
         String s ="1";
        public void a(){
            System.out.println(1);
        }
        static class InnerNer{}
         class InnerNer2{}
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = new Inner();
        inner.a();
    }
}
