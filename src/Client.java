public class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color green = colorFactory.getColor("GREEN");
        green.fill();
        Color blue = colorFactory.getColor("BLUE");
        blue.fill();
    }
}
