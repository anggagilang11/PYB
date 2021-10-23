package com.pyb.pybapp.ui.register;

import android.app.Application;
import androidx.lifecycle.ViewModel;

import com.pyb.pybapp.repository.UserRepository;
import com.pyb.pybapp.room.model.User;

public class RegisterViewModel extends ViewModel {
    private final UserRepository mUserRepository;

    public RegisterViewModel(Application application) {
        mUserRepository = new UserRepository(application);
    }

    public void register(User user) {
        mUserRepository.register(user);
    }
}
