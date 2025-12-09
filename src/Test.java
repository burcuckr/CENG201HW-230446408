public class Test {
    public static void main(String[] args){
        PatientList newList = new PatientList();

        Patient person1 = new Patient(55, "Doga", 5, 19);
        Patient person2 = new Patient(45, "Berra", 9, 25);
        Patient person3 = new Patient(47, "Duru", 10, 29);
        Patient person4 = new Patient(85, "Enes", 2, 44);
        Patient person5 = new Patient(50, "Ece", 8, 23);

        newList.addPatient(person1);
        newList.addPatient(person2);
        newList.addPatient(person3);
        newList.addPatient(person4);
        newList.addPatient(person5);

        newList.removePatient(55);

        newList.findPatient(47);

        newList.printList();

    }
}
