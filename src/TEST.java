import java.util.Scanner;

public class TEST {

    public static void main(String[] args) {
        printUserInfo();
    }

    public static void printUserInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("您的姓名是：" + username + "，年龄是：" + age);
    }
}