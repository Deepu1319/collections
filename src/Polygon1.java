interface Polygon{
    void getPolygon();
}
class Triangle implements Polygon{

    @Override
    public void getPolygon() {
        System.out.println("I am a triangle which have 3 sides");
    }
}
class Quadrilateral implements Polygon{

    @Override
    public void getPolygon() {
        System.out.println("I am a Quadrilateral which have 4 sides");
    }
}
class Pentagon implements Polygon{

    @Override
    public void getPolygon() {
        System.out.println("i am a pentagon which has 5 sides");
    }
}

class Sides{

    Polygon polygon;


    public Polygon getSides() {
        return polygon;
    }

    public void setSides(Polygon polygon) {
        this.polygon = polygon;
    }
}
class PolygonFactory{

    static Sides getPolygonObject(String s){
        Sides sides=new Sides();
        switch (s) {
            case "ThreeSides":
                sides.setSides(new Triangle());
                break;

            case "FourSides":
                sides.setSides(new Quadrilateral());
                break;

            case "FiveSides":
                sides.setSides(new Pentagon());
                break;

        }
        return sides;

        }
    }

public class Polygon1 {
    public static void main(String[] args) {
        Sides threeSides = PolygonFactory.getPolygonObject("ThreeSides");
        threeSides.getSides().getPolygon();
        Sides foursides = PolygonFactory.getPolygonObject("FourSides");
        foursides.getSides().getPolygon();
        Sides fivesides = PolygonFactory.getPolygonObject("FiveSides");
        fivesides.getSides().getPolygon();



    }
}