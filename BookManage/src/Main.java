import Book.BookList;
import User.Administrator;
import User.NormalUser;
import User.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static User Login(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的姓名");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1: 管理员 2: 普通用户");

        try {
            int status = scanner.nextInt();

            if (status == 1) {
                return new Administrator(name);
            } else {
                return new NormalUser(name);
            }
        } catch (InputMismatchException e) {
            System.err.println("输入无效，请输入有效的数字。");
            return null;
        }

    }

    public static void main(String[] args) {
        BookList bookList = new BookList();

        User user = Login();


        while (true){

            if (user != null) {
                int choice = user.menu();
                user.doOperation(choice,bookList);

            }

        }

        /*System.out.println(choice);
        System.out.println(user);*/
    }
}