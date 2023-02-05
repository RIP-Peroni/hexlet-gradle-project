package hexlet.gradle.project;

public final class User {
    private final int id;
    private final String nickname;
    User(int id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }
    public int getId() {
        return id;
    }
    public String getNickname() {
        return nickname;
    }
    public boolean isEqual(User otherUser) {
        return otherUser.getId() == getId();
    }
}
