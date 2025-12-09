public class PatientList {
    Node head;

    public void addPatient(Patient p) {
        Node newNode = new Node(p);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void removePatient(int id){
        if(head == null){
            return;
        }
        if(head.data.id == id){
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next != null){
            if(current.next.data.id == id){
                current.next = current.next.next;
                return;
            }
           current = current.next;
        }

    }

    public Patient findPatient(int id){
        Node current = head;
        while(current != null){
            if(current.data.id == id) {
                System.out.println("This id is found. Patient informations are: " + current.data.name + ", " + current.data.age + " ," + current.data.severity);
                return current.data;
            }
            current = current.next;
        }
        System.out.println("This id is not found.");
        return null;
    }
    public void printList(){
        Node current = head;

        if(current == null) {
            System.out.println("The list is empty.");
            return;
        }

        while(current != null){
            System.out.println("Patient Id: " + current.data.id + " Patient name: " + current.data.name + " Patient severity: " +current.data.severity + " Patient age: " + current.data.age);
            current = current.next;
        }
    }
}
