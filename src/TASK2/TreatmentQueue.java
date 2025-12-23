package TASK2;

public class TreatmentQueue {
    TreatmentNode front; //head , first
    TreatmentNode rear; //tail, back
    int size;

    public TreatmentQueue(){ //empty constructor.
        front = null;
        rear = null;
        size= 0;

    }
    boolean isEmpty(){ //I write this method beause easily controlled in other methods the queue is empty or not.
        return front == null;
    }
    public void enqueue(TreatmentRequest request){ //adding an element at the end of the queue
        TreatmentNode newNode = new TreatmentNode(request); //createing new node
        if (isEmpty()) { //checks rear is empty or not
            front = rear = newNode; //the list is empty we add a new element and the list has only one element.
        }else{ //the list is not empty final emelan's next shows new node. rear goes to end of the queue.
            rear.next = newNode;
            rear = newNode;
        }
        size++; // we added new element in the queue and size increases 1.
    }
    public TreatmentRequest dequeue(){ //removing an elements at the begining of the queue.
        //We do not use void because we want to get the patient from the queue.
        if(isEmpty()){ //it checks queue is empty or not.
            return null;
        }
        TreatmentRequest removed = front.data; // We store remove patient's data becuse we returned.
        front = front.next;
        size--; // decreases queue's size.

        if(front == null) {
            rear = null;
        }
        return removed;
    }


    public int getSize() { //return size
        return size;
    }

    public void printQueue() {//prints all queue.
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        TreatmentNode current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
