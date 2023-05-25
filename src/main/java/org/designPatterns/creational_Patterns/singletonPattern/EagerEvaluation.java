package org.designPatterns.creational_Patterns.singletonPattern;

/**
 * eager evaluation approach:
 *
 * if your application always creates and uses an instance of the Singleton does not use a lot of resources
 * thread safe
 * the instance is created even though client application might not be using it
 *
 *
 * If your singleton class is not using a lot of resources, then the eager initialization is the approach to use.
 * <br><br>
 * In most of the scenarios, Singleton classes are created for resources such as File System, Database connections etc.
 * <br><br>
 * We should avoid the instantiation until/unless client calls the getInstance method
 * <br><br>
 * So, Bill Pugh came up with a different approach to create the Singleton class using an inner static helper class.
 */
public class EagerEvaluation {
    private static EagerEvaluation eagerEvaluation = new EagerEvaluation();

    private EagerEvaluation(){ }

    public EagerEvaluation getInstance(){
        return eagerEvaluation;
    }
}
