/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.threads.com.simple;

/**
 * @author Денис
 */
public class Runner {

    public static void main(String[] args) throws InterruptedException {
        Queue queue = new Queue(1);
        new Producer(queue).start();
        Thread.sleep(20);
        new Consumer(queue).start();
        System.out.println("main is finished");
    }

}
