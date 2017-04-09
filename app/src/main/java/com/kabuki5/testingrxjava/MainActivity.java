package com.kabuki5.testingrxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.kabuki5.testingrxjava.models.ModelExample;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MVP.View {

    private PresenterImpl mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mPresenter = new PresenterImpl();
        mPresenter.onViewCreated(this);
        mPresenter.printData();

    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mPresenter.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onDestroy();
    }

    @Override
    public void printString(List<ModelExample> s) {
        for(ModelExample example : s){
            Log.d("RBM_RX", example.toString());
        }

    }
}
