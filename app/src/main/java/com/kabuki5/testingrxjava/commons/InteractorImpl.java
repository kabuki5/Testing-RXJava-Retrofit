package com.kabuki5.testingrxjava.commons;

import com.kabuki5.testingrxjava.MVP;
import com.kabuki5.testingrxjava.models.ModelExample;
import com.kabuki5.testingrxjava.rest.ApiController;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Kabuki on 08/04/2017.
 * Optimus Mobile Engineering
 */

public class InteractorImpl implements MVP.Interactor {

    @Override
    public void subscribeToGetData(Observer<List<ModelExample>> observer) {

//        Observable<Integer> obs = Observable.range(0, 50);

        ApiController.getInstance().getService().getApiData()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);

    }
}
