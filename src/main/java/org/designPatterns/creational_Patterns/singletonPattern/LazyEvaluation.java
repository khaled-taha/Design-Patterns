package org.designPatterns.creational_patterns.singletonPattern;

/**
 * Lazy evaluation approach:
 *<br>
 * it is not multi-thread safe
 * <br>
 * use this approach if you are not worried about multiple threads
 * <br>
 * this is not a recommended approach
 *
 * • suppose two calls to getInstance() are made at virtually the same time
 * <br>
 * • the first thread checks to see whether the instance exists. It does not, it goes into the part
 * of the code that will create the first instance
 * <br>
 * however, before it has done that, suppo: e a second thread also looks to see whether the
 * instance member is null
 * <br>
 * • because the first thread has not created anything yet, the instance is still equal to null,
 * so the second thread also goes into the code that will create an object
 */
public class LazyEvaluation {

    private static LazyEvaluation lazyEvaluation;

    private LazyEvaluation(){ }

    public static LazyEvaluation getInstance(){
        if(lazyEvaluation == null)
             lazyEvaluation = new LazyEvaluation();
        return lazyEvaluation;
    }
}
