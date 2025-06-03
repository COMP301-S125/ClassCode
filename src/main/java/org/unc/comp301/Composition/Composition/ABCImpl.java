package org.unc.comp301.Composition.Composition;


import org.unc.comp301.Composition.InterfaceA;
import org.unc.comp301.Composition.InterfaceB;
import org.unc.comp301.Composition.InterfaceC;

public class ABCImpl {
    InterfaceA a;
    InterfaceB b;
    InterfaceC c;

    public ABCImpl(InterfaceA a, InterfaceB b, InterfaceC c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(InterfaceA a){
        this.a = a;
    }
}
