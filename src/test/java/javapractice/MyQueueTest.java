package javapractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyQueueTest {
    @Test
    public void given3NumbersWhenAddedToQueueFromTheFront() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(myFirstNode);
        myQueue.enQueue(mySecondNode);
        myQueue.enQueue(myThirdNode);
        myQueue.printQueue();
        INode add = myQueue.add();
        Assertions.assertEquals(myThirdNode,add);
    }
    @Test
    public void given3NumbersWhenAddedToDequeu() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyQueue myQueue = new MyQueue();
        myQueue.deQueue(myFirstNode);
        myQueue.deQueue(mySecondNode);
        myQueue.deQueue(myThirdNode);
        myQueue.printQueue();
        INode add1 = myQueue.add1();
        Assertions.assertEquals(myThirdNode,add1);
    }
}
