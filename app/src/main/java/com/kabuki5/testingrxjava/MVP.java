package com.kabuki5.testingrxjava;

import com.kabuki5.testingrxjava.commons.BasePresenter;
import com.kabuki5.testingrxjava.models.ModelExample;

import java.util.List;

import io.reactivex.Observer;

/**
 * Created by Kabuki on 07/04/2017.
 * Optimus Mobile Engineering
 */

public interface MVP {

    interface View {
        void printString(List<ModelExample> m);
    }

    interface Presenter extends BasePresenter<MVP.View> {
        void printData();
    }

    interface Interactor {
        void subscribeToGetData(Observer<List<ModelExample>> observer);
    }

}
