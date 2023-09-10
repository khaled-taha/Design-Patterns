package org.designPatterns.creational_patterns.singletonPattern;

/**
 * Bill Pugh approach:
 *
 * thread safe
 * high performance
 * ensures that the instance is only created if a client needs it
 * create the Singleton class using a inner static helper class
 * regarded as the standard method to implement singletons in Java
 */
public class BillPugh {
    private BillPugh(){ }

    private static class BillPughHelper{
        private static BillPugh billPugh = new BillPugh();
    }

    public static BillPugh getInstance(){
        return BillPughHelper.billPugh;
    }
}
