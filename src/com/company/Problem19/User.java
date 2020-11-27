package com.company.Problem19;

enum Role {
    CUSTOMER,
    ADMIN
}

public class User {
    //region Properties
    private String username;
    private String password;
    private Role role;
    //endregion

    //region Constructors
    public User() {
    }

    public User( String username, Role role ) {
        this.username = username;
        this.role = role;
    }

    public User( String username, String password, Role role ) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    //endregion

    //region Methods
    public boolean passwordIsValid() {
        int upperCount = 0;
        int specialCount = 0;
        int numCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (containsUpperLetters(character)) {
                upperCount++;
            } else if (containsDigits(character)) {
                numCount++;
            } else if (containsSpecialCharacter(character)) {
                specialCount++;
            } else if (containsLowerLetters(character)) {
                upperCount += 0;
            } else {
                return false;
            }
        }

        return (upperCount >= 1 && specialCount >= 1 && numCount >= 3);
    }

    public boolean containsUpperLetters( char letterSymbol ) {
        return ((letterSymbol >= 'A' && letterSymbol <= 'Z'));
    }

    public boolean containsLowerLetters( char letterSymbol ) {
        return ((letterSymbol >= 'a' && letterSymbol <= 'z'));
    }

    public boolean containsDigits( char digitSymbol ) {
        return (digitSymbol >= '0' && digitSymbol <= '9');
    }

    public boolean containsSpecialCharacter( char specialSymbol ) {
        return (specialSymbol == '#' || specialSymbol == '%' || specialSymbol == '!');
    }
    //endregion

    //region Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername( String username ) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole( Role role ) {
        this.role = role;
    }
    //endregion
}
