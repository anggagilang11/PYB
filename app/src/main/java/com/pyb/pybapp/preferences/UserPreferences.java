package com.pyb.pybapp.preferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.pyb.pybapp.MainActivity;
import com.pyb.pybapp.room.model.User;
import com.pyb.pybapp.ui.login.LoginActivity;

public class UserPreferences {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;

    /* Mendefinisikan Key */
    public static final String IS_LOGIN = "isLogin";
    public static final String KEY_NAME = "name";
    public static final String KEY_NPM = "npm";
    public static final String KEY_MAIL = "mail";
    public static final String KEY_PASSWORD = "password";

    public UserPreferences(Context context) {
        this.context = context;

        sharedPreferences = context.getSharedPreferences("userPreferences", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void setLogin(User user) {
        editor.putBoolean(IS_LOGIN, true);
        editor.putString(KEY_NAME, user.getName());
        editor.putString(KEY_NPM, user.getNpm());
        editor.putString(KEY_MAIL, user.getMail());
        editor.putString(KEY_PASSWORD, user.getPassword());

        editor.commit();
    }

    public User getUserLogin(){
        String name, npm, mail, password;

        name = sharedPreferences.getString(KEY_NAME, "");
        npm = sharedPreferences.getString(KEY_NPM, "");
        mail = sharedPreferences.getString(KEY_MAIL, "");
        password = sharedPreferences.getString(KEY_PASSWORD, "");

        return new User(name, mail, npm, password);
    }

    public boolean checkLogin(){
        return sharedPreferences.getBoolean(IS_LOGIN, false);
    }

    public void logout(){
        editor.remove(IS_LOGIN);
        editor.commit();
    }
}
