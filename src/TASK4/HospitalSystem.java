package TASK4;

import TASK1.Patient;
import TASK1.PatientList;
import TASK2.TreatmentQueue;
import TASK2.TreatmentRequest;
import TASK3.DischargeRecord;
import TASK3.DischargeStack;

import java.util.HashMap;

public class HospitalSystem {
    //for integrating all data structures into a single system.
    PatientList patientList;
    TreatmentQueue normalQueue;
    TreatmentQueue priorityQueue; //for priorityas
    DischargeStack dischargeStack;
    HashMap<Integer, Patient> patientHashMap;


    HospitalSystem(){ //initalizies all data structures.
        patientList = new PatientList(); //create a linked list for patients.
        normalQueue = new TreatmentQueue();//create a queue for waiting patients.
        priorityQueue = new TreatmentQueue(); //create a queue for high priority patients.
        dischargeStack = new DischargeStack(); //create a stack for discharged patients.
        patientHashMap = new HashMap<>(); //hash table for quickly find the patients using their id.

    }

    public void addPatient(Patient p){
        patientList.addPatient(p);
        patientHashMap.put(p.getId(), p);
    }

    public void addTreatmentRequest(int id, boolean priority) { // adding a treatment request to the appropirate queue.
        TreatmentRequest request = new TreatmentRequest(id, priority);

        if (priority) {
            priorityQueue.enqueue(request);
        } else {
            normalQueue.enqueue(request);
        }
    }
    public void processTreatment(){
        TreatmentRequest request = priorityQueue.dequeue();

        if(request == null){
            request = normalQueue.dequeue();
        }
        if(request == null){
            return;
        }
        int patientId = request.getPatientId(); //adds patient tot he discharge stack.
        DischargeRecord record = new DischargeRecord(patientId);
        dischargeStack.push(record);
    }
    //I wroted insertion method int the patient list class.
}
