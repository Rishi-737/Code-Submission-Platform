class User {
private Integer userId;   
private String name;

public User(Integer userId, String name) {
    this.userId = userId;
    this.name = name;
}

public Integer getUserId() {
    return userId;
}

public String getName() {
    return name;
}
}