class Admin extends User {
public Admin(Integer id, String name) {
    super(id, name);
}
public void managePlatform() {
    System.out.println("Admin managing platform...");
}
}
class NormalUser extends User {
public NormalUser(Integer id, String name) {
    super(id, name);
}
public void submitCode() {
    System.out.println("User submitting code...");
}
}