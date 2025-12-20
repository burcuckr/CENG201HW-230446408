public class Task1Test {
    public static void main(String[] args){
        PatientList newList = new PatientList(); //I created new patient list.

        //In this paragraph I created patients and their all information, In this parts constuructors called.
        Patient person1 = new Patient(1, "Arda Mutlu", 5, 19);
        Patient person2 = new Patient(2, "Sevgi Günaytürk", 9, 25);
        Patient person3 = new Patient(3, "Açelya Demir", 10, 29);
        Patient person4 = new Patient(4, "Işıl Ünal", 2, 44);
        Patient person5 = new Patient(5, "Cengiz Işıldayan", 8, 23);


        //Add patients in the linked lists.
        newList.addPatient(person1);
        newList.addPatient(person2);
        newList.addPatient(person3);
        newList.addPatient(person4);
        newList.addPatient(person5);

        newList.printList(); //before deleting

        newList.removePatient(5); //This sentence calls removePatient method and remove patient using id.

        newList.findPatient(4); //This sentence calls findPatient method and find patient using id.

        newList.printList(); //This sencence prints calls all information.

    }
}
