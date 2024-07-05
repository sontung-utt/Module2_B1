import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Câu điều kiện");
        System.out.println("Bài 1");
        System.out.println("Nhập số thứ nhất");
        int number1 = inputNumber.nextInt();
        System.out.println("Nhập số thứ hai");
        int number2 = inputNumber.nextInt();
        if (number1 % number2 == 0) {
            System.out.println("Số thứ nhất chia hết cho số thứ hai");
        } else {
            System.out.println("Số thứ nhất không chia hết cho số thứ hai");
        }
        System.out.println("Bài 2");
        System.out.println("Nhập tuổi cho học sinh");
        int age = inputNumber.nextInt();
        if (age < 15 || age > 25) {
            System.out.println("Người này tuổi không phù hợp học lớp 10");
        } else {
            System.out.println("Người này đủ tuổi học lớp 10");
        }
        System.out.println("Bài 3");
        System.out.println("Nhập số nguyên bất kỳ");
        int number = inputNumber.nextInt();
        if (number > 0) {
            System.out.println("Số bạn vừa nhập lớn hơn 0");
        } else {
            System.out.println("Số bạn vừa nhập nhỏ hơn hoặc bằng 0");
        }
        System.out.println("Bài 4");
        System.out.println("Nhập số thứ nhất");
        int num1 = inputNumber.nextInt();
        System.out.println("Nhập số nguyên thứ hai");
        int num2 = inputNumber.nextInt();
        System.out.println("Nhập số nguyên thứ ba");
        int num3 = inputNumber.nextInt();
        int maxInt = num1;
        if (num2 > maxInt) {
            maxInt = num2;
        }
        if (num3 > maxInt) {
            maxInt = num3;
        }
        System.out.println("Số lớn nhất trong 3 số là: " + maxInt);
        System.out.println("Bài 5");
        System.out.println("Nhập điểm bài kiểm tra");
        int mark1 = inputNumber.nextInt();
        System.out.println("Nhập điểm thi giữa kỳ");
        int mark2 = inputNumber.nextInt();
        System.out.println("Nhập điểm thi cuối kỳ");
        int mark3 = inputNumber.nextInt();
        double totalMark = (mark1 + mark2 * 2 + mark3 * 3)/6;
        if (mark1 < 0 || mark2 < 0 || mark3 < 0) {
            System.out.println("Điểm phải lớn hơn hoặc bằng 0");
        } else if (mark1 > 10 || mark2 > 10 || mark3 > 10) {
            System.out.println("Điểm phải nhỏ hơn hoặc bằng 10");
        } else {
            if (totalMark < 4) {
                System.out.println("Học lực yếu");
            } else if (totalMark >= 4 && totalMark < 6) {
                System.out.println("Học lực trung bình");
            } else if (totalMark >= 6 && totalMark < 8) {
                System.out.println("Học lực khá");
            } else {
                System.out.println("Học lực giỏi");
            }
        }
        System.out.println("Bài 6");
        System.out.println("Nhập doanh số cho nhân viên");
        int sales = inputNumber.nextInt();
        if(sales < 5000000){
            System.out.println("Nhân viên không có thưởng");
        } else if(sales >= 5000000 && sales < 12000000){
            System.out.println("Thưởng của nhân viên là: " + (sales * 5/100));
        } else if(sales >= 12000000 && sales < 25000000){
            System.out.println("Thưởng của nhân viên là: " + (sales * 12/100));
        } else {
            System.out.println("Thưởng của nhân viên là: " + (sales * 20/100));
        }
        System.out.println("Bài 7");
        System.out.println("Nhập số phút gọi nội địa");
        int minute1 = inputNumber.nextInt();
        System.out.println("Nhập số phút gọi quốc tế");
        int minute2 = inputNumber.nextInt();
        int localFee, foreignFee, totalFee;
        if(minute1 < 100){
            localFee = minute1 * 200;
        } else if(minute1 >= 100 && minute1 < 1000){
            localFee = minute1 * 500;
        } else {
            localFee = minute1 * 1000;
        }
        System.out.println("Cước phí khách hàng phải trả nội địa là: " + localFee);
        if(minute2 < 200){
            foreignFee = minute2 * 2500;
        } else if(minute2 >= 200 && minute2 < 1000){
            foreignFee = minute2 * 5500;
        } else {
            foreignFee = minute2 * 8000;
        }
        System.out.println("Cước phí khách hàng phải trả quốc tế là: " + foreignFee);
        totalFee = localFee + foreignFee;
        System.out.println("Tổng cước phí khách hàng phải trả là: " + totalFee);
    }
}
