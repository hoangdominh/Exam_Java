import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập cạnh b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập cạnh? c: ");
        int c = scanner.nextInt();
        if (a==0 || b ==0 || c==0){
            System.out.println("Ba cạnh trên không phải là cạnh của tam giác ");
        } else {
            if(a+b<c || b+c<a || a+c<b){
                System.out.println("Ba cạnh trên không phải là cạnh của tam giác ");
            }
            else {
                if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
                    double dientich =0;
                    int chuvi = 0;
                    chuvi = a+b+c;
                    int nuachuvi = chuvi/2;
                    dientich = Math.sqrt(nuachuvi*(nuachuvi-a)*(nuachuvi-b)*(nuachuvi-c));
                    System.out.println("Ba cạnh trên là 3 cạnh của tam giác vuông !!!");
                    System.out.println("Chu vi tam giác vuông là: " + (chuvi));
                    System.out.println("Diện tích tam giác vuông là: " + dientich);

                } else {
                    System.out.println("Ba cạnh trên không phải là 3 cạnh của tam giác vuông !!!!!");
                }
            }
        }


    }
}
