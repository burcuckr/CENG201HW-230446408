package TASK3;

public class DischargeStack {
    DischargeNode top;
    int size;

    public DischargeStack(){ //parameterless constructor because of our stack is empty
        this.top = null;
        this.size = 0;
    }
    public boolean isEmpty(){ //checks stack is empty or not
        return top == null;
    }
    public void push(DischargeRecord item){ //adding new element top of the list.
        DischargeNode newNode = new DischargeNode(item); // create a new node.
        newNode.next = top;
        top = newNode;
        size++; //I added element after that size increases 1.
    }
    public DischargeRecord pop(){//removes top element.
        if(isEmpty()){ //cheks the stack is empty or not.
            System.out.println("Stack is empty.");
            return null;
        }
        DischargeRecord removeRecord = top.data;
        top = top.next;
        size--; //delete an element and size decreases 1.
        return removeRecord;
    }
    public DischargeRecord peek(){ //looks at the first element at the top.
        if(isEmpty()){ //ckecks the list empty or not.
            System.out.println("Stack is empty.");
            return null;
        }
        return top.data;
    }
    public void printStack(){ //prints stack.
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return;
        }

        DischargeNode current = top;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
