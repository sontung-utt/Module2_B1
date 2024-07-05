import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Bài 1");
        System.out.println("Nhập nhiệt độ (độ C)");
        int celcius = inputNumber.nextInt();
        double fahrenheit = celcius * 9/5 + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
/*
        System.out.println("Bài 2");
        System.out.println("Nhập chiều dài(m)");
        int meters = inputNumber.nextInt();
        double feet = meters * 3.20808;
        System.out.println("Feet là: " + feet);

        System.out.println("Bài 3");
        System.out.println("Nhập cạnh hình vuông");
        int a = inputNumber.nextInt();
        int square = a * a;
        System.out.println("Diện tích hình vuông là: " + square);

        System.out.println("Bài 4");
        System.out.println("Nhập chiều dài hình chữ nhật");
        int a1= inputNumber.nextInt();
        System.out.println("Nhập chiều rộng hình chữ nhật");
        int a2= inputNumber.nextInt();
        int rectangle = a1 * a2;
        System.out.println("Diện tích hình chữ nhật là: " + rectangle);

        System.out.println("Bài 5");
        System.out.println("Nhập cạnh thứ nhất tam giác vuông");
        int b1 = inputNumber.nextInt();
        System.out.println("Nhập cạnh thứ hai tam giác vuông");
        int b2 = inputNumber.nextInt();
        double triangle = 0.5 * b1 * b2;
        System.out.println("Diện tích tam giác vuông là: " + triangle);

        System.out.println("Bài 6");
        System.out.println("Nhập hệ số a");
        double num1 = inputNumber.nextDouble();
        System.out.println("Nhập hệ số b");
        double num2 = inputNumber.nextDouble();
        if(num1 != 0){
            double x = -num2 / num1;
            System.out.println("Phương trình có nghiệm là: " + x);
        } else {
            if (num2 == 0){
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }

        System.out.println("Bài 7");
        System.out.println("Nhập hệ số a");
        double num11 = inputNumber.nextDouble();
        System.out.println("Nhập hệ số b");
        double num12 = inputNumber.nextDouble();
        System.out.println("Nhập hệ số c");
        double num13 = inputNumber.nextDouble();
        double delta;
        if(num11==0){
            if(num12 != 0){
                double x = -num13/num12;
                System.out.println("Phương trình có 1 nghiệm đơn là: " + x);
            } else {
                if (num13 == 0){
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
        } else {
            delta = num12 * num12 - 4 * num11 * num13;
            if(delta > 0){
                double x1= (-num12 + Math.sqrt(delta)) / (2 * num11);
                double x2= (-num12 - Math.sqrt(delta)) / (2 * num11);
                System.out.println("Phương trình có 2 nghiệm là " + x1 + " và " + x2);
            } else if(delta == 0){
                double x3 = -num12 / (2 * num11);
                System.out.println("Phương trình có 1 nghiệm kép là " + x3);
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }

        System.out.println("Bài 8");
        System.out.println("Nhập tuổi");
        int age = inputNumber.nextInt();
        if(age < 0 || age > 120){
            System.out.println("Đây không phải là tuổi của một người");
        } else {
            System.out.println("Đây là tuổi của một người");
        }

        System.out.println("Bài 9");
        System.out.println("Nhập cạnh thứ nhất của tam giác");
        int c1 = inputNumber.nextInt();
        System.out.println("Nhập cạnh thứ hai của tam giác");
        int c2 = inputNumber.nextInt();
        System.out.println("Nhập cạnh thứ ba của tam giác");
        int c3 = inputNumber.nextInt();
        if(c1>0 && c2>0 && c3>0){
            if((c1 + c2)>c3 && (c1 + c3)>c2 && (c2 + c3)>c1){
                System.out.println("Đây là 3 cạnh của tam giác");
            } else {
                System.out.println("Đây không phải 3 cạnh của tam giác");
            }
        } else {
            System.out.println("Cạnh của tam giác phải lớn hơn 0");
        }
*/
        System.out.println("Bài 10");
        System.out.println("Nhập số kWh tiêu thụ");
        int kWh = inputNumber.nextInt();
        double totalCost = 0;
        if (kWh <= 50) {
            totalCost = kWh * 1678;
        } else if (kWh <= 100) {
            totalCost = 50 * 1678 + (kWh - 50) * 1734;
        } else if (kWh <= 200) {
            totalCost = 50 * 1678 + 50 * 1734 + (kWh - 100) * 2014;
        } else if (kWh <= 300) {
            totalCost = 50 * 1678 + 50 * 1734 + 100 * 2014 + (kWh - 200) * 2536;
        } else if (kWh <= 400) {
            totalCost = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (kWh - 300) * 2834;
        } else {
            totalCost = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (kWh - 400) * 2927;
        }
        System.out.println("Giá điện phải trả là: " + totalCost + " VND");

        System.out.println("Bài 11");
        System.out.println("Nhập thu nhập hàng tháng (triệu VND)");
        double income = inputNumber.nextDouble();
        double tax = 0;
        if (income <= 5) {
            tax = income * 0.05;
        } else if (income <= 10) {
            tax = 5 * 0.05 + (income - 5) * 0.10;
        } else if (income <= 18) {
            tax = 5 * 0.05 + 5 * 0.10 + (income - 10) * 0.15;
        } else if (income <= 32) {
            tax = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + (income - 18) * 0.20;
        } else if (income <= 52) {
            tax = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + (income - 32) * 0.25;
        } else if (income <= 80) {
            tax = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + 20 * 0.25 + (income - 52) * 0.30;
        } else {
            tax = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + 20 * 0.25 + 28 * 0.30 + (income - 80) * 0.35;
        }
        System.out.println("Thuế thu nhập cá nhân phải nộp là: " + tax + " triệu VND");
    }
}
