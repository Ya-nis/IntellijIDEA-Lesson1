public class Main {
    public static void main(String[] args) {

        Vector2D point1 = new Vector2D(2,7);
        System.out.println("point1 "+point1.toString());
        Vector2D point2 = new Vector2D(-6,5);
        System.out.println("point2 "+point2.toString());
        point1.add(point2);
        System.out.println("point1 "+point1.toString());
        point2.subtract(point1);
        System.out.println("point2 "+point2.toString());

    }
}
