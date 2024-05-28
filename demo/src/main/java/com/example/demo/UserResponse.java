package com.example.demo;

public class UserResponse {
    private String uid;
    private String realm;
    private Attributes attributes;

    // Constructores
    public UserResponse() {}

    public UserResponse(String uid, String realm, Attributes attributes) {
        this.uid = uid;
        this.realm = realm;
        this.attributes = attributes;
    }

    // Getters y Setters
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
}