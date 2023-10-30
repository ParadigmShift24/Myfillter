package User;

import Operation.*;

import java.util.Scanner;

public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.userOperations = new IOperation[]{
                new ExitIOperation(),
                new FindBook(),
                new BorrowBook(),
                new ReturnBook(),
                new ShowOperation()
        };
    }

    @Override
    public int menu() {

            System.out.println("——————————————————————————————————————");
            System.out.println("用户菜单");
            System.out.println("——————————————————————————————————————");
            System.out.println("hello "+ name +" welcome to NormalMenu");
            System.out.println("——————————————————————————————————————");
            System.out.println("1. 查找图书");
            System.out.println("2. 借阅图书");
            System.out.println("3. 归还图书");
            System.out.println("4. 显示图书");
            System.out.println("0. 退出系统");
            System.out.println("——————————————————————————————————————");

            System.out.println("请输入操作代码：");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            return option;

    }
}
