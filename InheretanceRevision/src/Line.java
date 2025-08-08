public class Line extends Shape {
private int endX;
private int endY;

    public Line(int endX, int endY) {
        this.endX = endX;
        this.endY = endY;
    }

    public Line() {
}

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

}
