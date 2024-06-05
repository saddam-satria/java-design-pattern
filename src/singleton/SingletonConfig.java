package singleton;

public class SingletonConfig{
    public static SingletonConfig instance;
    public static String name = "hello";

    public SingletonConfig(){}

    public static SingletonConfig getInstance() {
        if (instance == null) {
            SingletonConfig.instance = new SingletonConfig();
        }

        return SingletonConfig.instance;
    }

}