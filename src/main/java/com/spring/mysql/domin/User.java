package com.spring.mysql.domin;

/**
 * @author：Fangle
 * @className:User
 * @description:
 * @date:2:57 PM 2019/3/13
 */
public class User {

    private Integer id;

    private String username;

    private String password;

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }
}
