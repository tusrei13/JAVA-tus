import java.util.ArrayList;
import java.util.List;

public class ShapeMainProgram {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        
        shapes.add(new Circle(new Point(0, 0), 5));
        shapes.add(new Circle(new Point(2, 3), 3.5));
        shapes.add(new Rectangle(new Point(1, 1), 4, 6));
        shapes.add(new Rectangle(new Point(-2, 5), 3, 8));
        shapes.add(new Square(new Point(3, 3), 5));
        shapes.add(new Square(new Point(-1, -1), 4));
        
        System.out.println("=== SO LUONG HINH DA KHOI TAO ===");
        System.out.println("Tong so hinh: " + Shape.getShapeCount());
        
        System.out.println("\n=== DANH SACH CHI TIET CAC HINH ===");
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println((i + 1) + ". " + shapes.get(i));
        }
        
        System.out.println("\n=== DANH SACH TAM DIEM ===");
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println((i + 1) + ". " + shapes.get(i).getCenterPoint());
        }
        
        System.out.println("\n=== THONG KE THEO LOAI ===");
        int circleCount = 0, rectangleCount = 0, squareCount = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                squareCount++;
            } else if (shape instanceof Rectangle) {
                rectangleCount++;
            } else if (shape instanceof Circle) {
                circleCount++;
            }
        }
        System.out.println("So hinh tron: " + circleCount);
        System.out.println("So hinh chu nhat: " + rectangleCount);
        System.out.println("So hinh vuong: " + squareCount);
    }
}
