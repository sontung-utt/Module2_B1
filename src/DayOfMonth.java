import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhập năm");
        int year = inputNumber.nextInt();
        System.out.println("Nhập tháng");
        int month = inputNumber.nextInt();
        // Kiểm tra năm nhuận
        boolean isLeapYear;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (month % 400 == 0) {
                    System.out.println("Năm " + year + " là năm nhuận");
                    isLeapYear = true;
                } else {
                    System.out.println("Năm " + year + " không phải năm nhuận");
                    isLeapYear = false;
                }
            } else {
                System.out.println("Năm " + year + " là năm nhuận");
                isLeapYear = true;
            }
        } else {
            System.out.println("Năm " + year + " không phải năm nhuận");
            isLeapYear = false;
        }
        if (month == 2) {
            if (isLeapYear) {
                System.out.println("Tháng 2 năm " + year + " có 29 ngày");
            } else {
                System.out.println("Tháng 2 năm " + year + " có 28 ngày");
            }
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " năm " + year + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " năm " + year + " có 30 ngày");
                break;
            case 2:
                break;
            default:
                System.out.println("Tháng vừa nhập không hợp lệ!");
                break;
        }
    }
}
