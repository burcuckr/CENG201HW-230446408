package TASK2;

public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    boolean priority; //I added this because of using task4

    public TreatmentRequest(int patientId){ //constructor
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis(); //what time did the patient arrive
    }
    public TreatmentRequest(int patientId, boolean priority){//I added this constructor for task4
        this.patientId = patientId;
        this.priority = priority;
        this.arrivalTime = System.currentTimeMillis();
    }

    public int getPatientId() { //return patient's id
        return patientId;
    }

    public long getArrivalTime() { //return the time.
        return arrivalTime;
    }
    //I did not use setArrivalTime method becuse of FIFO.
    public String toString() {
        return "Patient ID: " + patientId + ", Arrival Time: " + arrivalTime;
    }
}
