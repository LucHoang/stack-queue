package exercise.ImplementQueueRingLink;

public class Solution {
    public static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;

        if (q.front == null) {
            q.front = q.rear = temp;
        } else {
            q.rear.next = temp;
            q.rear = temp;
        }
        q.rear.next = q.front;
    }

    public static int deQueue(Queue q) {
        int value;
        if (q.front == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        } else if (q.front == q.rear) {
            value = q.front.data;
            q.rear = null;
            q.front = null;
        } else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.next;
            q.rear.next = q.front;
        }
        return value;
    }

    public static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.printf("Elements in Circular Queue are: ");
        while (temp.next != q.front) {
            System.out.printf("%d", temp.data);
            temp = temp.next;
        }
        System.out.printf("%d", temp.data);
    }

    public static void main(String args[]) {
        Queue  q = new Queue();

        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);

        displayQueue(q);

        System.out.printf(" Deleted value = %d", deQueue(q));
        System.out.printf(" Deleted value = %d", deQueue(q));

        displayQueue(q);

        enQueue(q, 9);
        enQueue(q, 20);
        displayQueue(q);

    }
}
