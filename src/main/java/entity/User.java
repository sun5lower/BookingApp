package entity;

public class User {
    int id;
    String name;
    int phoneNumber;

    String last_updated;
    String created_at;

    public User(int id, String name, int phoneNumber) {

    }

    public User(int id, String name, int phoneNumber, String last_updated, String created_at) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.last_updated = last_updated;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return id +
                " \t" + name +
                " \t" + phoneNumber;
    }
}