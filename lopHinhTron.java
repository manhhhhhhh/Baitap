import java.util.Scanner;

public class lopHinhTron {
}
    class HinhTron {
        private String color;
        private double radius;

        public HinhTron(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        public double getRadius() {
            return this.radius;
        }
        public String getColor() {
            return color;
        }

        public double getDienTich() {
            return Math.PI * this.radius * this.radius;
        }

        public static void main(String[] args) {
            HinhTron hinhTron = new HinhTron(6, "xanh");
            System.out.println("Bán kính của hình tròn là : " + hinhTron.getRadius());
            System.out.println("Diện tích của hình tròn là : " + hinhTron.getDienTich());
            System.out.println("Hình tròn có màu : " + hinhTron.getColor());
        }
    }

