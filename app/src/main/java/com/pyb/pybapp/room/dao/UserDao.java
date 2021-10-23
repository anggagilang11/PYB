package com.pyb.pybapp.room.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.pyb.pybapp.room.model.User;

import java.util.List;

@Dao
public interface UserDao {

    @Query("SELECT * FROM user WHERE npm == :npm AND password = :password")
    LiveData<User> login(String npm, String password);

    @Insert
    void register(User user);
}
