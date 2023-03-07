import java.util.Scanner;

public class ChuyenDoi {

    static class Temperature {

        public double F;
        public double C;

        public Temperature(double F, double C) {
               this.F = F;
               this.C = C;
        }
        public double setF (){
            return F;
        }
        public double setC(){
            return C;
        }
        public double CtoF (){
            double F = (9.0 / 5) * C + 32;
            return F;
        }
        public double FtoC (){
            double C = (5.0 / 9) * (F - 32);
            return C;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập độ F: ");
            double F = scanner.nextDouble();
            System.out.println("Nhập độ C: ");
            double C = scanner.nextDouble();
            Temperature number = new Temperature(F , C);
            System.out.println("Chuyển đổi độ F sang độ C là : " + number.FtoC());
            System.out.println("Chuyển đổi độ C sang độ F là : " + number.CtoF());
        }
    }
}