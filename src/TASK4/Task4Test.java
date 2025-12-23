package TASK4;
import TASK1.Patient;
public class Task4Test {
    public static void main(String[] args){
        HospitalSystem newSys = new HospitalSystem();

        newSys.addPatient(new Patient(1, "Cemil Seven", 3,40));
        newSys.addPatient(new Patient(2, "Cansu Özen", 7, 27));
        newSys.addPatient(new Patient(3, "Sıla Aydemir", 10, 55));
        newSys.addPatient(new Patient(4, "İlkay Keskin", 1,20));
        newSys.addPatient(new Patient(5, "Su Aydın", 2, 17));
        newSys.addPatient(new Patient(6, "Can Genç", 5, 51));
        newSys.addPatient(new Patient(7, "Duru Yıldırım", 8,4));
        newSys.addPatient(new Patient(8, "Demir Taş", 4, 37));
        newSys.addPatient(new Patient(9, "Selim Arslan", 9, 12));
        newSys.addPatient(new Patient(10, "Deniz Kara", 6, 35));

        //I choose 3 id for true priority.
        newSys.addTreatmentRequest(1, false);
        newSys.addTreatmentRequest(3, false);
        newSys.addTreatmentRequest(4, true);
        newSys.addTreatmentRequest(5, false);
        newSys.addTreatmentRequest(6, false);
        newSys.addTreatmentRequest(7, true);
        newSys.addTreatmentRequest(8, false);
        newSys.addTreatmentRequest(10, true);

        newSys.processTreatment();
        newSys.processTreatment();
        newSys.processTreatment();
        newSys.processTreatment();

        newSys.patientList.insertionSortBySeverity();

        System.out.println("Severity Patient List:");
        newSys.patientList.printList();

    }
}
