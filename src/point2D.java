public class point2D {
    private float x;
    private float y;


    public point2D() {

    }

    public point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float array[] = {x, y};
        return array;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}