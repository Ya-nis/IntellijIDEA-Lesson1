
public class Vector2D {

    private float m_x;
    private float m_y;

    public float getX() {
        return m_x;
    }

    public void setX(float x) {
        this.m_x = x;
    }

    public float getY() {
        return this.m_y;
    }

    public void setY(float y) {
        this.m_y = y;
    }

    public Vector2D() {
        setX(0f);
        setY(0f);
    }

    public Vector2D(float x, float y) {
        setX(x);
        setY(y);
    }


    public Vector2D add(Vector2D vector) {
        m_x+= vector.getX();
        m_y+= vector.getY();
        return this ;
    }

    public Vector2D subtract(Vector2D vector) {
        m_x-= vector.getX();
        m_y-= vector.getY();
        return this ;
    }

}