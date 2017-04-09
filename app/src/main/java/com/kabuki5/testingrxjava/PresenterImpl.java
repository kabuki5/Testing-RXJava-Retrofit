package com.kabuki5.testingrxjava;

import android.util.Log;

import com.kabuki5.testingrxjava.commons.DefaultObserver;
import com.kabuki5.testingrxjava.commons.InteractorImpl;
import com.kabuki5.testingrxjava.models.ModelExample;

import java.util.List;

/**
 * Created by Kabuki on 08/04/2017.
 * Optimus Mobile Engineering
 */

public class PresenterImpl implements MVP.Presenter {

    private MVP.View mView;

    @Override
    public void onViewCreated(MVP.View view) {
        this.mView = view;
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onDestroy() {
        mView = null;
    }

    @Override
    public void printData() {
        InteractorImpl interactor = new InteractorImpl();

        DefaultObserver<List<ModelExample>> observer = new DefaultObserver<List<ModelExample>>(){
            @Override
            public void onNext(List<ModelExample> data) {
                super.onNext(data);
                if(mView!=null){
                    mView.printString(data);
                }
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
                Log.d("RBM_RX",e.getMessage());
            }
        };
        interactor.subscribeToGetData(observer);
    }
}
