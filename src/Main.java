import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static int getRandomNum(){
        return (int) (random() * 11);
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Угадай число от 0 до 10\nВведи число");
        int num = getRandomNum();
        while (console.hasNextInt()){
            int userNum = console.nextInt();
            if (userNum > num){
                System.out.println("Загаданное число меньше");
            }else if (userNum < num){
                System.out.println("Загаданное число больше");
            }else {
                System.out.println("Ты угадал, это число " + num);
                break;
            }
            System.out.println("Введи число");
        }
    }
}
