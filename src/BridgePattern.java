

interface Attribute {

    String getAttributeType();

}



class Color implements Attribute {

    @Override

    public String getAttributeType() {

        return "Color";

    }

}



class Shape implements Attribute {

    @Override

    public String getAttributeType() {

        return "Shape";

    }

}

//Abstracion

abstract class NewShape {

    String type;

    Attribute attribute;

    public NewShape(String type, Attribute attribute) {

        this.type = type;

        this.attribute = attribute;

    }

}



class Square extends NewShape {

    String specification;

    public Square(String specification, Attribute attribute) {

        super("square", attribute);

        this.specification = specification;

    }

    @Override

    public String toString() {

        return "Square{" +

                "type='" + type + '\'' +

                "attribute=" + attribute.getAttributeType() +

                ",specification='" + specification + '\'' +

                '}';

    }

}

//Refined Abstraction

class Triangle1 extends NewShape {

    String specification;

    public Triangle1(String specification, Attribute attribute) {
        super("triangle", attribute);

        this.specification = specification;

    }

    @Override

    public String toString() {

        return "Triangle{" +

                "type='" + type + '\'' +

                "attribute=" + attribute.getAttributeType() +

                ",specification='" + specification + '\'' +

                '}';

    }

}

public class BridgePattern {

    public static void main(String[] args) {

        Square blueSquare = new Square("Blue", new Color());

        Square redSquare = new Square("Red", new Color());

        System.out.println(blueSquare);

        System.out.println(redSquare);

        Triangle1 redTriangle = new Triangle1("red", new Color());

        System.out.println(redTriangle);

    }

}
