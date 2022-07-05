package designPatterns.singleton;

public class SingletonExample {

    private static SingletonExample instance;
    private String value;

    private SingletonExample(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static SingletonExample getInstance(String value) {
        if (instance == null) {
            instance = new SingletonExample(value);
        }
        return instance;
    }
}
