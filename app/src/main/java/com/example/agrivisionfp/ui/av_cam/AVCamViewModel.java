package com.example.agrivisionfp.ui.av_cam;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AVCamViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AVCamViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is AV Cam fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}