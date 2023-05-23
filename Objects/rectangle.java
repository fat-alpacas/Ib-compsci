public class rectangle {
    private int width = 0;
    private int height = 0;
    private point origin;

    public rectangle() {
        origin = new point(0, 0);
    }

    public rectangle(point p) {
        origin = p;
    }

    public rectangle(int w, int h) {
        this(new point(0, 0), w, h);
    }

    public rectangle(point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    public void move(int x, int y) {
        origin.setX(x);
        origin.setY(y);
    }

    public int area() {
        return width * height;
    }

    // Getter and Setter methods for width, height, and origin

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public point getOrigin() {
        return origin;
    }

    public void setOrigin(point origin) {
        this.origin = origin;
    }
}
