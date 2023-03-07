import java.util.Scanner;

public class LopHinhChuNhat {
    public LopHinhChuNhat() {
    }
    class HinhChuNhat {
        double width, height;
        public HinhChuNhat(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getChuVi() {
            return this.width * this.height;
        }

        public double getDienTich() {
            return (this.width + this.height) * 2;
        }

        public String display() {
            return "Hình chữ nhật{" + "chiều rộng=" + width + ", chiều cao=" + height + "}";
        }
        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập chiều rộng:");
            double width = scanner.nextDouble();
            System.out.print("Nhập chiều cao:");
            double height = scanner.nextDouble();
            HinhChuNhat chuNhat = new HinhChuNhat(width, height);
            System.out.println("Hình chữ nhật " + chuNhat.display());
            System.out.println("chu vi của hình chữ nhật: " + chuNhat.getChuVi());
            System.out.println("Diện tích hình chữ nhật: " + chuNhat.getDienTich());
        }
    }
}
