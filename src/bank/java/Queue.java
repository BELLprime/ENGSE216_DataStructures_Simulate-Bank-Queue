package bank.java;

public class Queue {
    private Database db ;
    private int front,rear,count,size;
    //constructor
    public Queue() {
        this(5);
    }
    public Queue(int size){
        this.size=size;
        this.db = new Database(size);
        this.count=0;
        this.front=0;
        this.rear=-1;
    }
    
    public void enqueue(String item){
        if(!isFull()){
            rear=(rear+1)%size;
            db.setData(rear,item);
            count++;
        } else System.out.println("Queue is full," + item + " will not collect.");
    }
    public String dequeue(){
        String data="";
        if (!isEmpty()) {
            data=db.getData(front);
            front=(front+1)%size;
            count--;
        } else System.out.println("Queue is empty,You can't dequeue.");
        return data;
    }
    //check
    public boolean isEmpty(){return count==0;}
    public boolean isFull(){return count==size;}
    //get count
    public int getCount() {return this.count;}
    public void showArr() {
        for (int i=0;i<db.getSize();i++) {
            System.out.print(db.getData(i)+" ");
        }
        System.out.println();
    }
    public void showCurrent() {
        System.out.println("CurrentFront: " + this.front);
        System.out.println("CurrentRear: " + this.rear);
        System.out.println("CurrentCount: " + this.count);
    }
}
