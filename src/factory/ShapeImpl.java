import factory.Circle;
import factory.Rectangle;
import factory.Shape;
import factory.ShapeType;

public class ShapeImpl {
    public static Shape getShape(ShapeType type) {
        if(type == ShapeType.CIRCLE) return new Circle();

        return new Rectangle();
    }
}