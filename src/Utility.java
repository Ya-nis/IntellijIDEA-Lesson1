public class Utility {
    public static float distance(Vector2D start, Vector2D end){
        return (float) Math.sqrt(Math.pow(end.getX()-start.getX(),2)+Math.pow(end.getY()-start.getY(),2));
    }

    public static float distance(float x1, float y1, float x2, float y2){
        return (float) Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }

}
