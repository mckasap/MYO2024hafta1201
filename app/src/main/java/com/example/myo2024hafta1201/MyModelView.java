package com.example.myo2024hafta1201;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyModelView extends ViewModel{

    private MutableLiveData<String> data;

    public MutableLiveData<String> getData() {
        return data;
    }

    public void setData(String data) {
        this.data.setValue(data);
    }

    public MyModelView(){
        data= new MutableLiveData<>();
    }




}