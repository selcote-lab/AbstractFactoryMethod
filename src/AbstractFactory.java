public abstract class AbstractFactory {
     abstract Color getColor(String color);
     abstract Shape getShape(String shape);
}

class ShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }
        else if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }

    Color getColor(String shape) {
        return null;
    }

}

class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String colorType) {
        if(colorType == null) {
            return null;
        }
        else if(colorType.equalsIgnoreCase("RED")){
            return new Red();
        }
        else if(colorType.equalsIgnoreCase("Green")){
            return new Green();
        }
        else if(colorType.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        return null;
    }

    Shape getShape(String shapeType) {
        return null;
    }

}