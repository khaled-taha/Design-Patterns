package org.designPatterns.creational_Patterns.singletonPattern;

/**
 * double-checked locking principle approach
 * thread safe
 * increases performance from the synchronized approach
 *
 * Use "double-checked locking" to reduce the use of synchronization in getInstance()
 * With double-checked locking, we first check to see if an instance is created, and if not, THEN we synchronize
 * We only synchronize the first time through, just what we want
 */
public class DoubleCheckedLocking {
    private static DoubleCheckedLocking doubleCheckedLocking;

    private DoubleCheckedLocking(){ }

    public static DoubleCheckedLocking getInstance(){
        if(doubleCheckedLocking == null) {
            synchronized (DoubleCheckedLocking.class){
                if(doubleCheckedLocking == null) {
                   doubleCheckedLocking = new DoubleCheckedLocking();
                }
            }
        }
        return doubleCheckedLocking;
    }
}
