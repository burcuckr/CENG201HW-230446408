public class PatientList {
    Node head; //I created head for first variable for the linked list.

    public void addPatient(Patient p) { //This metod adds patient in the linked lists. This methods add patitent to the end of the linked list.
        Node newNode = new Node(p);
        if (head == null) { //If the linked list is empty the methods add new patient in the head of the linked list.
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){ //This loop runs end of the list.
            current = current.next;
        }
        current.next = newNode;
    }

    public void removePatient(int id){ //This method remove elements in the linked lists thanks to id.
        if(head == null){ //If the list empty runs this part.
            return;
        }
        if(head.data.id == id){ //if we want to remove first element runs this part.
            head = head.next; // This statement make second elements to head and remove first.
            return;
        }
        Node current = head; //Create current and its equals to head (first element)
        while(current.next != null){ //This loops runs for this equations true.
            if(current.next.data.id == id){
                current.next = current.next.next;
                return;
            }
           current = current.next;
        }

    }

    public Patient findPatient(int id){ //This methods find patient using patient's id.
        Node current = head; //create current and equals head.
        while(current != null){
            if(current.data.id == id) {
                System.out.println("This id is found. TASK1.Patient informations are: " + current.data.name + ", " + current.data.age + ", " + current.data.severity);
                return current.data;
            }
            current = current.next;
        }
        System.out.println("This id is not found."); //If this patient not found this statement prints This id is not found. message.
        return null;
    }
    public void printList(){ //This statements prints all information about patients.
        Node current = head;

        if(current == null) { //if list is empty this parts run.
            System.out.println("The list is empty.");
            return;
        }

        while(current != null){ //If this list is not empty run this statement.
            System.out.println("TASK1.Patient Id: " + current.data.id + " TASK1.Patient name: " + current.data.name + " TASK1.Patient severity: " +current.data.severity + " TASK1.Patient age: " + current.data.age);
            current = current.next;
        }
    }
}
