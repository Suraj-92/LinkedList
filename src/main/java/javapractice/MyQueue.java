package javapractice;

public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue(){
        this.myLinkedList = new MyLinkedList();
    }

    public void enQueue(INode myNode) {
        myLinkedList.append(myNode);
    }

    public void printQueue() {
        myLinkedList.printMyNodes();
    }

    public INode add() {
        return myLinkedList.tail;
    }

    public INode add1() {
        return myLinkedList.head;
    }

    public void deQueue(INode myNode) {
        myLinkedList.add(myNode);
    }
}
