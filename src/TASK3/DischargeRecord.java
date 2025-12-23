package TASK3;

public class DischargeRecord {
    int patientId;
    long dischargeTime;

    public DischargeRecord(int patientId){ //constructor.
        this.patientId= patientId;
        this.dischargeTime = System.currentTimeMillis();
    }

    public int getPatientId() { //returns patient id
        return patientId;
    }

    public long getDischargeTime() { //returns discharge time.
        return dischargeTime;
    }
    public String toString() { //prints information.
        return "Patient ID: " + patientId + ", Discharge Time: " + dischargeTime;
    }
}
