abstract class Shape {
    protected Point centerPoint;
    protected static int shapeCount = 0;
    
    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
        shapeCount++;
    }
    
    public Point getCenterPoint() {
        return centerPoint;
    }
    
    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }
    
    public static int getShapeCount() {
        return shapeCount;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
