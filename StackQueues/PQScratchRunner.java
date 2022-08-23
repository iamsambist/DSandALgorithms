

public class PQScratchRunner {
    public static void main(String[] args) {
        PQScratch priorityQueue=new PQScratch();
        priorityQueue.add(4);
        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(6);
        System.out.println(priorityQueue);

        priorityQueue.remove(3);
        System.out.println(priorityQueue);

        

        
    }

}