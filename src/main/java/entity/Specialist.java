package entity;

public class Specialist {
    int id;
    String specialist;

    String last_updated;
    String created_at;

    public Specialist(int id, String specialist) {

    }

    public Specialist(int id, String specialist, String last_updated, String created_at) {
        this.id = id;
        this.specialist = specialist;
        this.last_updated = last_updated;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
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
                " \t" + specialist;

    }
}