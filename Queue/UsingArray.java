public class UsingArray {
    public static class Queue {
        static int arr[];
        static int size;
        static int front;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full!");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public int remove() {
            if (rear != -1) {
                int data = arr[0];
                for (int i = 0; i <= rear; i++) {
                    arr[i] = arr[i + 1];
                }
                rear = rear - 1;
                return data;
            } else {
                return -1;
            }
        }

        public void print() {
            if (rear == -1) {
                System.out.println("Queue is empty!");
                return;
            }
            for (int i = 0; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.isEmpty());
        q.print();
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println();
        q.print();
    }
}
