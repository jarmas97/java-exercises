package designPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonExample s1 = SingletonExample.getInstance("value1");
        SingletonExample s2 = SingletonExample.getInstance("value2");
        SingletonExample s3 = SingletonExample.getInstance("value3");

        System.out.println(s1.getValue());
        System.out.println(s2.getValue());
        System.out.println(s3.getValue());

    }
}
