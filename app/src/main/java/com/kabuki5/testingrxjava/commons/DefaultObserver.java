package com.kabuki5.testingrxjava.commons;

import io.reactivex.observers.DisposableObserver;

/**
 * Created by Kabuki on 07/04/2017.
 * Optimus Mobile Engineering
 */

public class DefaultObserver<T> extends DisposableObserver<T> {

    @Override
    public void onNext(T t) {

    }

    @Override
    public void onComplete() {

    }

    @Override
    public void onError(Throwable e) {

    }

}
