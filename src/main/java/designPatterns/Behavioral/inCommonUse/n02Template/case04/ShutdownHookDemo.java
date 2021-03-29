package designPatterns.Behavioral.inCommonUse.n02Template.case04;

/**
 * Created by chenjinxin on 2021/3/29 下午1:59
 */

public class ShutdownHookDemo {

    private static class ShutdownHook extends Thread {
        public void run() {
            System.out.println("I am called during shutting down.");
        }
    }

    private static class ShutdownHook2 extends Thread {
        public void run() {
            System.out.println("I am called during shutting down 2.");
        }
    }

    private static class ShutdownHook3 extends Thread {
        public void run() {
            System.out.println("I am called during shutting down 3.");
        }
    }

    public static void main(String[] args) {
        System.out.println("start");
        Runtime.getRuntime().addShutdownHook(new ShutdownHook());
        Runtime.getRuntime().addShutdownHook(new ShutdownHook2());
        Runtime.getRuntime().addShutdownHook(new ShutdownHook3());
        System.out.println("end");
        // start
        //end
        //I am called during shutting down.
        //I am called during shutting down 2.
        //I am called during shutting down 3.
    }

}
