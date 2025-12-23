package TASK1;

public class Patient {//I created variables.
    int id;
    String name;
    int severity;
    int age;

    public Patient(int id, String name, int severity, int age){ //I created constructors, it's run creating a new Patient.
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }

    public int getId() {
        return id;
    }
}
