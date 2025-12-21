package TASK2;

public class Task2Test {
    public static void main(String[] args){
        TreatmentQueue treatmentRequests = new TreatmentQueue();

        treatmentRequests.enqueue(new TreatmentRequest(1));
        treatmentRequests.enqueue(new TreatmentRequest(2));
        treatmentRequests.enqueue(new TreatmentRequest(3));
        treatmentRequests.enqueue(new TreatmentRequest(4));
        treatmentRequests.enqueue(new TreatmentRequest(5));
        treatmentRequests.enqueue(new TreatmentRequest(6));
        treatmentRequests.enqueue(new TreatmentRequest(7));
        treatmentRequests.enqueue(new TreatmentRequest(8));

        treatmentRequests.printQueue(); //After removing an elements

        System.out.println(treatmentRequests.dequeue());
        System.out.println(treatmentRequests.dequeue());
        System.out.println(treatmentRequests.dequeue());

        treatmentRequests.printQueue();
    }
}
