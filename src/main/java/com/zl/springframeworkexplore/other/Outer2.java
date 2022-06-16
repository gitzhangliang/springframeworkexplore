package com.zl.springframeworkexplore.other;

public class Outer2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner1 = new Outer.Inner();
        Outer.Inner.InnerNer inner = new Outer.Inner.InnerNer();
        Outer.Inner.InnerNer2 inner2 = inner1.new InnerNer2();
    }
}
