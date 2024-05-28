package com.example.demo;

public class Attributes {
    private String uid;
    private String preferredLanguage;
    private String mail;
    private String surname;
    private String givenName;
    private String fullName;
    private String username;

    // Constructores
    public Attributes() {}

    public Attributes(String uid, String preferredLanguage, String mail, String surname, String givenName, String fullName, String username) {
        this.uid = uid;
        this.preferredLanguage = preferredLanguage;
        this.mail = mail;
        this.surname = surname;
        this.givenName = givenName;
        this.fullName = fullName;
        this.username = username;
    }

    // Getters y Setters
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}