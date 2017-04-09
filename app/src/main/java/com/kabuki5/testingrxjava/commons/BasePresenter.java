package com.kabuki5.testingrxjava.commons;

/**
 * Created by Kabuki on 07/04/2017.
 * Optimus Mobile Engineering
 */

public interface BasePresenter<T> {

    void onViewCreated(T view);
    void onResume();
    void onPause();
    void onDestroy();
}
