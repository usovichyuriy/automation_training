package by.bsu.rent.model;

import java.util.Objects;
import java.util.Optional;

public class Account {
    private String email;
    private String password;
    private String againPassword;


    public Account(String email, String password, String againPassword) {
        this.email = email;
        this.password = password;
        this.againPassword = againPassword;
    }

    public Account() {
    }


    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Optional<String> getPassword() {
        return Optional.ofNullable(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Optional<String> getAgainPassword() {
        return Optional.ofNullable(password);
    }

    public void setAgainPassword(String passwordAgain) {
        this.againPassword = passwordAgain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(email, account.email) &&
                Objects.equals(password, account.password) &&
                Objects.equals(againPassword, account.againPassword);

    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, againPassword);
    }

    @Override
    public String toString() {
        return "Account{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", password='" + againPassword + '\'' +
                '}';
    }
}
