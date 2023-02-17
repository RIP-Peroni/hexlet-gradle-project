package main.java.hexlet.gradle.project;


import java.util.Objects;

public final class Gamer {
     final Long id;
    private final String nickname;
    private String password;
    public Gamer(Long id, String nickname, String password) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
    }
    public Long getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gamer gamer = (Gamer) o;
        return id.equals(gamer.id) && nickname.equals(gamer.nickname) && password.equals(gamer.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, password);
    }
}