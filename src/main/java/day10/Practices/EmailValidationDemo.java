package day10.Practices;

import java.util.regex.Pattern;

import java.util.regex.Pattern;

public class EmailValidationDemo {
    private String email;
    private String regex;

    public EmailValidationDemo(String email, String regex) {
        this.email = email;
        this.regex = regex;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }

    public boolean isValidEmail() {
        return Pattern.matches(regex, email);
    }
}
