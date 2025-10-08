class Square extends Rectangle {
    
    public Square(Point centerPoint, double side) {
        super(centerPoint, side, side);
    }
    
    public double getSide() {
        return getWidth();
    }
    
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
    
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }
    
    public String toString() {
        return String.format("Square[center=%s, side=%.1f, area=%.2f]", 
                           centerPoint, getSide(), getArea());
    }
}
