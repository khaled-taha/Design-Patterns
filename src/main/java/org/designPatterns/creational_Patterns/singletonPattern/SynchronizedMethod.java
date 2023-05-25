package org.designPatterns.creational_Patterns.singletonPattern;

/**
 * Synchronized approach:
 *
 * thread safe
 * use when performance is not critical to your application, but, it is multithreaded
 * straightforward and effective
 *
 *
 * problem with synchronized approach:
 *
 * • One big problem is that the synchronization may end up being a severe bottleneck
 * • All the threads will have to wait for the check on whether the object already exists
 * • Reduces the performance because of cost associated with the synchronized method
 *
 *
 * • The only time synchronization is relevant is the first time through this method
 *
 * once we have set the uniqueInstance variable to an instance of Singleton, we have no
 * further need to synchronize this method
 *
 * After the first time through, synchronization is totally unneeded overhead
 */
public class SynchronizedMethod {
    private static SynchronizedMethod synchronizedMethod;

    private SynchronizedMethod(){ }

    public synchronized static SynchronizedMethod getInstance(){
        if(synchronizedMethod == null)
             synchronizedMethod = new SynchronizedMethod();
        return synchronizedMethod;
    }
}
