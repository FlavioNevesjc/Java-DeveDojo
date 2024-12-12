package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import java.util.concurrent.*;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        // ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingDeque
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Flávio"));
        System.out.println(tq.offer("Flávio"));
        System.out.println(tq.offer("Flávio",10,TimeUnit.SECONDS));
        tq.put("DevDojo");
        if (tq.hasWaitingConsumer()){
            tq.transfer("DevDojo");
        }
        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy",5,TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.printf(String.valueOf(tq.remainingCapacity()));
    }
}
