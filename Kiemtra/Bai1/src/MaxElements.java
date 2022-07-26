import java.util.Scanner;

public class MaxElements {
    public static void main(String[] args) {
        int n = 0;
        int[] array ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số phần tử bạn muốn nhập: ");
        n = scanner.nextInt();
        if(n<0){
            System.out.println("Giá trị bạn nhập phải lớn hơn 0");
        }
        array = new int[n];
        int i =0;

        while (i< array.length){
            System.out.print("Phần tử "+(i+1)+ " có giá trị : " );
            array[i] = scanner.nextInt();
            if (array[i]<0){
                System.out.println("Giá trị phần tử phải là số nguyên dương");
            }
            i++;
        }

        int max = array[0];
        int index = 1;
        for (int j=0; j<array.length;j++){
            if(array[j]>max) {
                max = array[j];
                index = j +1;
            }
        }

        System.out.println("Giá trị lớn nhất của trong các phần tử là : "+max);
    }
}
