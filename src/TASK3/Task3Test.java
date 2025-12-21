package TASK3;

public class Task3Test {
    public static void main(String[] args){
        DischargeStack newRecord = new DischargeStack(); //create empty stack
        newRecord.push(new DischargeRecord(1));
        newRecord.push(new DischargeRecord(2));
        newRecord.push(new DischargeRecord(3));
        newRecord.push(new DischargeRecord(4));
        newRecord.push(new DischargeRecord(5)); //top.

        newRecord.printStack(); //before delete

        newRecord.pop();//delete head.
        newRecord.pop();

        newRecord.printStack();
    }
}
