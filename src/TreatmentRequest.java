public class TreatmentRequest {
    private int patientId;
    private long arrivalTime;

    public TreatmentRequest(int patientId){ //constructor
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis(); //what time did the patient arrive
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
