class Circle extends Shape {
    private double radius;
    
    public Circle(Point centerPoint, double radius) {
        super(centerPoint);
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public String toString() {
        return String.format("Circle[center=%s, radius=%.1f, area=%.2f]", 
                           centerPoint, radius, getArea());
    }
}
