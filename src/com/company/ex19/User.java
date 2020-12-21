package com.company.ex19;

public class User {
    public enum typeOfRole {ADMIN, CUSTOMER};
    private String username;
    private String password;
    private typeOfRole role;

    public User() {
    }

    public User(String username, String password, User.typeOfRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }


    public static boolean check3Digits(String str) {
        String num = "0123456789";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < num.length(); j++) {
                if (str.charAt(i) == num.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count >= 3;
    }

    public static boolean checkUppercaseCharacter(String str) {
        String uppercase = "QWERTYUIOPASDFGHJKLZXCVBNM";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < uppercase.length(); j++) {
                if (str.charAt(i) == uppercase.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count >= 1;
    }

    public static boolean checkSpecialCharacter(String str) {
        String special = "#!%";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < special.length(); j++) {
                if (str.charAt(i) == special.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count >= 1;
    }

    public static boolean checkValid(String str) {
        if (checkSpecialCharacter(str)) {
            if (check3Digits(str)) {
                if (checkUppercaseCharacter(str)) {
                    return true;
                }
            }
        }
        return false;
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
        if (checkValid(password)) {
            this.password = password;
        }
    }

    public User.typeOfRole getRole() {
        return role;
    }

    public void setRole(User.typeOfRole role) {
        this.role = role;
    }
}
