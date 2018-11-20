package code.coverage.demo;

public class CodeCoverage {

    public static void main(String[] args) {
        System.out.println("Hello Team !");
        start();
    }

    public static String start() {
        System.out.println("Start !");
        return "start";
    }

    public static String stop() {
        System.out.println("Stop !");
        return "stop";
    }

}