package com.example.simplewebapplication;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
public class UserEntity
{
    @Id
    private String id;
    private String username;
    private String email;
    private String password;

    // constructors
    public UserEntity() {}

    public UserEntity(String username, String email, String password)
    {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // getters & setters
    public String getId() { return id; }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return this.username = username;
    }

    public String getEmail() { return email; }

    public void setEmail(String email)
    {
        this.username = username;
    }

    public String getPassword() { return password; }

    public void setPassword(String password)
    {
        this.password = password;
    }

}
