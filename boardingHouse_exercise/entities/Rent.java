package retired_exercise.entities;

public class Rent {
    private String name;
    private String email;

    public Rent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String email) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName() + ", " + this.getEmail();
    }
}
