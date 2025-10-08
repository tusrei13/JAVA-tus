class Point {
    private double pointX;
    private double pointY;
    
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }
    
    public double getPointX() {
        return pointX;
    }
    
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }
    
    public double getPointY() {
        return pointY;
    }
    
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }
    
    public String toString() {
        return String.format("(%.1f,%.1f)", pointX, pointY);
    }
}
