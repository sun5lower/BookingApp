package entity;

import types.Status;

import java.sql.Date;
import java.sql.Time;

public class Timeslot {
    int id;
    Date date;
    Time time;
    Status status;

    String last_updated;
    String created_at;

    public Timeslot() {

    }

    public Timeslot(int id, Date date, Time time, Status status) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
                " \t" + date +
                " \t" + time +
                " \t" + status;
    }
}