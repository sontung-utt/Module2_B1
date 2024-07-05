import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhập cân nặng");
        double weight = inputNumber.nextDouble();
        System.out.println("Nhập chiều cao");
        double height = inputNumber.nextDouble();
        double bmi = weight / (height * height);
        String format = String.format("%.2f", bmi);
        System.out.println("Chỉ số BMI = " + format);
        if(bmi < 18){
            System.out.println("Gầy - Underweight");
        } else if(bmi < 25){
            System.out.println("Bình thường - Normal");
        } else if(bmi < 30){
            System.out.println("Thừa cân - Overweight");
        } else {
            System.out.println("Béo phì - Obese");
        }
    }
}
