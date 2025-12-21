package TASK2;

public class TreatmentNode {
    TreatmentRequest data;
    TreatmentNode next;

    public TreatmentNode(TreatmentRequest data) {
        this.data = data;
        this.next = null;
    }
}
