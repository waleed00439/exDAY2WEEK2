public class point3D {
    private float z;

    public point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "point3D{" +
                "z=" + z +
                '}';
    }

    public float[] getXYZ() {
        float array[] = {super.getX(), super.getY(), z};
        return array;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
}