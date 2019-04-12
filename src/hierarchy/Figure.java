package hierarchy;

/**
 * 修改后的代码，纠正了标签的种种弊端，且成员变量在初始化时被设为final型
 */
public abstract class Figure {
    /**公共方法area，分解前与标签无关，因此放在抽象类中
     * @return double型面积大小
     * */
    abstract double area();
}

class Circle extends Figure {
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Figure {
    final double length;
    final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
