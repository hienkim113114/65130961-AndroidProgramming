package kimhien.myapplication;

import java.io.Serializable;
import java.util.HashMap;

public class TASKS implements Serializable {

    String name;
    String date;
    String message;
    int priority;

    public TASKS() {
    }

    public TASKS(String name, String date, String message, int priority) {
        this.name = name;
        this.date = date;
        this.message = message;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public HashMap<String, Object> toFirebaseObject() {

        HashMap<String, Object> tasksObject = new HashMap<>();

        tasksObject.put("name", name);
        tasksObject.put("date", date);
        tasksObject.put("message", message);
        tasksObject.put("priority", priority);

        return tasksObject;
    }
}