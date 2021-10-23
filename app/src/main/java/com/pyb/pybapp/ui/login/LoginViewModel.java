package com.pyb.pybapp.ui.login;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.pyb.pybapp.repository.UserRepository;
import com.pyb.pybapp.room.model.User;

public class LoginViewModel extends ViewModel {
    private final UserRepository mUserRepository;

    public LoginViewModel(Application application) {
        mUserRepository = new UserRepository(application);
    }

    LiveData<User> login(String npm, String password) {
        return mUserRepository.login(npm, password);
    }
}
