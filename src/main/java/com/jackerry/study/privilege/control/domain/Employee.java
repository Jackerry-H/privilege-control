package com.jackerry.study.privilege.control.domain;

/**
 * @fileName: Employee
 * @description:
 * @author: jackerry
 * @date: 2022/6/17 21:06
 */
public class Employee {
    private String id;
    private String username;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
