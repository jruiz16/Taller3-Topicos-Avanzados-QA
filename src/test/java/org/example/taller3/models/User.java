package org.example.taller3.models;

public class User {
    private String userName;
    private String password;

    // Constructor
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    // Getters
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Método para mostrar el objeto User como un string (opcional)
    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


