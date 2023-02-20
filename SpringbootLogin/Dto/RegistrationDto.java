package com.Logindetails.SpringbootLogin.Dto;


public class RegistrationDto {

    @Override
    public String toString() {
        return "RegistrationDto{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public RegistrationDto() {
    }

    public RegistrationDto(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String userName;
    private String password;
}
