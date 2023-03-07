public class PhuongTrinh {
}
     class GiaiPhuongTrinh {
         public int a;
         public int b;
         public int c;

         public GiaiPhuongTrinh(int a, int b, int c) {
             this.a = a;
             this.b = b;
             this.c = c;
         }

         public int getA() {
             return a;
         }
         public int getB() {
             return b;
         }
         public int getC() {
             return c;
         }
         public void setA(int a) {
             this.a = a;
         }
         public void setB(int b) {
             this.b = b;
         }
         public void setC(int c) {
             this.c = c;
         }
         private double getDelta() {
             return Math.pow(b, 2) - 4 * a * c;
         }

         public double getCase() {
             return -b / (2 * a);
         }

         public double getCase1() {
             double delta = getDelta();

             return (-b + Math.pow(delta, 0.5)) / (2 * a);
         }
         public double getCase2() {
             double delta = getDelta();

             return (-b - Math.pow(delta, 0.5)) / (2 * a);
         }
             public static void main(String[] args) {
                GiaiPhuongTrinh phuongTrinh = new GiaiPhuongTrinh(4, 5, 4);
                if (phuongTrinh.getDelta() > 0) {
                    System.out.println("Phường trình có 2 nghiệm phân biệt là: ");
                    System.out.println("Ngiệm x1 = " + phuongTrinh.getCase1() + " và x2 = " + phuongTrinh.getCase2());
                } else if (phuongTrinh.getDelta() == 0){
                    System.out.println("phương trình có nghiệm kép: ");
                }else {
                    System.out.println("phương trình vô nghiệm;");
                }
             }
         }

