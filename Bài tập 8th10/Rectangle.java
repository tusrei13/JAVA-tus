class Rectangle extends Shape {
    private double width;
    private double length;
    
    public Rectangle(Point centerPoint, double width, double length) {
        super(centerPoint);
        this.width = width;
        this.length = length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea() {
        return width * length;
    }
    
    public double getPerimeter() {
        return 2 * (width + length);
    }
    
    public String toString() {
        return String.format("Rectangle[center=%s, width=%.1f, length=%.1f, area=%.2f]", 
                           centerPoint, width, length, getArea());
    }
}
