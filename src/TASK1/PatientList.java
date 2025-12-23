package TASK1;

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
                System.out.println("This id is found. Patient informations are: " + current.data.name + ", " + current.data.age + ", " + current.data.severity);
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
            System.out.println("Patient Id: " + current.data.id + " Patient name: " + current.data.name + " Patient severity: " +current.data.severity + " Patient age: " + current.data.age);
            current = current.next;
        }

    }
    public void insertionSortBySeverity() { //for task4 I choose insertion sort
        Node sortedHead = null; //new sorted list's head
        Node temp = head; //for traverse the unsorted list

        while (temp != null) {
            Node nextNode = temp.next;
            if (sortedHead == null || temp.data.severity > sortedHead.data.severity) {
                temp.next = sortedHead;
                sortedHead = temp;
            } else {
                Node current = sortedHead;
                while (current.next != null && current.next.data.severity >= temp.data.severity) {
                    current = current.next;
                }
                temp.next = current.next;
                current.next = temp;
            }
            temp = nextNode;
        }
        head = sortedHead; //update head.
    }
}
