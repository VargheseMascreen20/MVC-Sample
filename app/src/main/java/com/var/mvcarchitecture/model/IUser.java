package com.var.mvcarchitecture.model;

public interface IUser {
    String getEmail();

    String getPassword();

    int isValid();
}
