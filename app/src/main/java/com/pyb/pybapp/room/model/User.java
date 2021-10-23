package com.pyb.pybapp.room.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "user")
public class User {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "mail")
    private String mail;

    @ColumnInfo(name = "npm")
    private String npm;

    @ColumnInfo(name = "password")
    private String password;

    public User(String name, String mail, String npm, String password) {
        this.name = name;
        this.mail = mail;
        this.npm = npm;
        this.password = password;
    }

    public int getId() { return id; }

    public void setId(int id) {this.id = id;}

    public String getName() { return name; }

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }
}
