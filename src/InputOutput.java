import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        //Nhập xuất
        System.out.println("Nhập xuất");
        System.out.println("Bài 1");
        System.out.println("Hello World");
        System.out.println("Bài 2");
        System.out.println("Hello World, Hi Ae");
        System.out.println("Bài 3");
        Scanner inputName = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String name = inputName.nextLine();
        System.out.println("Hello C04");

        //Kiểu dữ liệu
        System.out.println("Kiểu dữ liệu");
        System.out.println("Bài 1");
        int number = 20;
        System.out.println("Biến number là: " + number);
        System.out.println("Bài 2");
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhập số bất kỳ");
        int num = inputNumber.nextInt();
        System.out.println("Số vừa nhập là: " + num);
        System.out.println("Bài 3");
        System.out.println("Nhập số thứ nhất: ");
        int number1 = inputNumber.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int number2 = inputNumber.nextInt();
        System.out.println("Tổng của hai số vừa nhập là: " + (number1 + number2));
        System.out.println("Hiệu của hai số vừa nhập là: " + (number1 - number2));
        System.out.println("Tích của hai số vừa nhập là: " + (number1 * number2));
        System.out.println("Thương của hai số vừa nhập là: " + (number1 / number2));
        System.out.println("Chia lấy dư của hai số vừa nhập là: " + (number1 % number2));
        System.out.println("Bài 4");
        System.out.println("Nhập tên của bạn");
        String myName = inputName.nextLine();
        System.out.println("Nhập tuổi của bạn");
        int age = inputNumber.nextInt();
        System.out.println("Xin chào " + myName + " , tôi năm nay " + age + " tuổi!");

        //Toán tử
        System.out.println("Toán tử");
        System.out.println("Nhập số tính toán tử thứ nhất");
        int numInt1 = inputNumber.nextInt();
        System.out.println("Nhập số tính toán tử thứ hai");
        int numInt2 = inputNumber.nextInt();
        System.out.println("Bài 1");
        System.out.println("Phép cộng: " + (numInt1 + numInt2));
        System.out.println("Phép trừn: " + (numInt1 - numInt2));
        System.out.println("Phép nhân: " + (numInt1 * numInt2));
        System.out.println("Phép chia: " + (numInt1 / numInt2));
        System.out.println("Phép chia lấy dư: " + (numInt1 % numInt2));
        System.out.println("Bài 2");
        int a1 = numInt1;
        int a2 = numInt1;
        int a3 = numInt1;
        int a4 = numInt1;
        int a5 = numInt1;
        a1 += numInt2;
        a2 -= numInt2;
        a3 *= numInt2;
        a4 /= numInt2;
        a5 %= numInt2;
        System.out.println("Số 1 += số 2 là: " + a1);
        System.out.println("Số 1 -= số 2 là: " + a2);
        System.out.println("Số 1 *= số 2 là: " + a3);
        System.out.println("Số 1 /= số 2 là: " + a4);
        System.out.println("Số 1 %= số 2 là: " + a5);
        System.out.println("Bài 3");
        int b1 = numInt1;
        b1++;
        int b2 = numInt1;
        b2--;
        System.out.println("Tăng 1 giá trị số thứ nhất là: " + b1);
        System.out.println("Giảm 1 giá trị số thứ nhất là: " + b2);
        System.out.println("Bài 4");
        System.out.println("num1 > num2 " + (numInt1 > numInt2));
        System.out.println("num1 < num2 " + (numInt1 < numInt2));
        System.out.println("num1 >= num2 " + (numInt1 >= numInt2));
        System.out.println("num1 <= num2 " + (numInt1 <= numInt2));
        System.out.println("num1 == num2 " + (numInt1 == numInt2));
        System.out.println("num1 != num2 " + (numInt1 != numInt2));
    }

}
