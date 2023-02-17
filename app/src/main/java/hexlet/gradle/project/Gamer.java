package main.java.hexlet.gradle.project;


import java.util.Objects;

public class Gamer {
    private Long id;
    private String nickname;
    private String password;
    public Gamer(Long id, String nickname, String password) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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