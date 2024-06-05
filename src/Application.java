import Injection.DependencyInjection;
import Injection.DependencyInjectionImpl;
import builder.Gender;
import factory.Shape;
import factory.ShapeType;
import observer.Client;
import observer.Desktop;
import observer.Mobile;
import observer.Server;
import singleton.SingletonConfig;

class Application{
    public static void main(String[] args) {

    /*
            SingletonConfig first_instance = new SingletonConfig();
            SingletonConfig second_instance = SingletonConfig.getInstance();

            first_instance.name = "paulo";

            System.out.println(second_instance.name);
    */

    /*
            Shape circleShape = ShapeImpl.getShape(ShapeType.CIRCLE);
            Shape rectangleShape = ShapeImpl.getShape(ShapeType.RECTANGLE);
            circleShape.draw();
            rectangleShape.draw();
    */
/*

        Student student = new Student();
        student.setName("paulo").setGender(Gender.MALE).setAge(20).setEmail("paulo@gmail.com");;

        System.out.println(student.getName());
*/

/*
        DependencyInjectionImpl dependencyInject = new DependencyInjectionImpl(new DependencyInjection());
        String name = dependencyInject.getName();
        System.out.println(name);
*/

/*
        Server server = new Server();
        Client desktopClient = new Desktop();
        Client mobileClient = new Mobile();

        server.setSubscriber(desktopClient);
        server.setSubscriber(mobileClient);

        System.out.println(mobileClient.getTemperature());
        System.out.println(desktopClient.getTemperature());
        server.setValue(20);
        server.setValue(100);
        System.out.println(desktopClient.getTemperature());
        System.out.println(mobileClient.getTemperature());
*/

    }
}