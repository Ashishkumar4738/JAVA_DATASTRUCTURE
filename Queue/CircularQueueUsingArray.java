public class CircularQueueUsingArray {

    static class Queue {
        static int front;
        static int rear;
        static int arr[];
        int size;

        public Queue(int size) {
            arr = new int[size];
            this.size = size;
            front = -1;
            rear = -1;
        }

        public boolean isEmpty() {
            return front == -1&&rear==-1;
        }
        public boolean isFull(){
            return (rear+1)%size==front;
        }
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            if(front==-1){
                rear = front = 0;
                arr[rear] = data;
                return;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty...");
                return -1;
            }
            int num = arr[front];
            if(front == rear){
                front = rear = -1;
                return num;
            }
            front = (front+1)%size;
            return num;
        }

        public void printQueue(){
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i]+" ");    
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.add(4);
       
        
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
