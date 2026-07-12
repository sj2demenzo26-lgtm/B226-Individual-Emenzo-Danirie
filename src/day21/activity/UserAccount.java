/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day21.activity;

/**
 *
 * @author Danirie
 */
 public class UserAccount {

    // Private fields (Encapsulation)
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    // Constructor
    public UserAccount(String firstName, String middleName, String lastName,
                       String address, String email, String password) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;

        setEmail(email);
        setPassword(password);
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Email Validation
    public void setEmail(String email) {
        if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            this.email = email;
        } else {
            this.email = "Invalid Email";
        }
    }

    // Password Validation
    public void setPassword(String password) {

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        if (password.length() >= 8) {

            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c))
                    hasUpper = true;

                if (Character.isLowerCase(c))
                    hasLower = true;

                if (Character.isDigit(c))
                    hasDigit = true;
            }

            if (hasUpper && hasLower && hasDigit) {
                this.password = password;
                return;
            }
        }

        this.password = "Invalid Password";
    }
}
    
   
    

