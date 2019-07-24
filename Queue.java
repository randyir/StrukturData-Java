package queue;
public class Queue {
    int queue[]=new int[5];
    
    public void push(int value){
        if(queue[0]==0){
            queue[0]=value;
            System.out.println("Antrian ke-1 = " + queue[0]);
        }
        else if(queue[1]==0){
            queue[1]=value;
            System.out.println("Antrian ke-2 = " + queue[1]);
        }
        else if(queue[2]==0){
            queue[2]=value;
            System.out.println("Antrian ke-3 = " + queue[2]);
        }
        else if(queue[3]==0){
            queue[3]=value;
            System.out.println("Antrian ke-4" + queue[3]);
        }
        else if(queue[4]==0){
            queue[4]=value;
            System.out.println("Antrian ke-5" + queue[4]);
        }
        else{
            isFull();
        }
    }
    
    public void isFull(){
        System.out.println("Antrian Penuh");
    }
    
    public void pop(){
        if(queue[0]!=0){
            System.out.println("POP : " + queue[0]);
            queue[0]=0;
        }
        else if(queue[1]!=0){
            System.out.println("POP : " + queue[1]);
            queue[1]=0;
        }
        else if(queue[2]!=0){
            System.out.println("POP : " + queue[2]);
            queue[2]=0;
        }
        else if(queue[3]!=0){
            System.out.println("POP : " + queue[3]);
            queue[3]=0;
        }
        else if(queue[4]!=0){
            System.out.println("POP : " + queue[4]);
            queue[4]=0;
        }
        else{
            isEmpty();
        }
    }
    
    public void isEmpty(){
        System.out.println("Antrian Kosong");
    }
    
    public void clear(){
        queue[0]=0;
        queue[1]=0;
        queue[2]=0;
        System.out.println("Antrian telah Bersih");
    }
    
    public void cetak(){
        System.out.println("--------------------------------");
        for(int i=0;i<queue.length;i++){
            if(queue[i]!=0){
            System.out.println(queue[i]+" ");
            }
        }
        System.out.println("--------------------------------");
    }
    
    public static void main(String[] args) {
        Queue s=new Queue();
        s.push(5);
        s.push(3);
        s.push(2);
        s.push(7);
        s.push(8);
        s.cetak();
        s.pop();
        s.pop();
        s.cetak();
        s.clear();
    }   
}