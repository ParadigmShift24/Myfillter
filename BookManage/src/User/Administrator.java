package User;

import Operation.*;

import java.util.Scanner;

public class Administrator extends User{
    public Administrator(String name){
        super(name);
        this.userOperations = new IOperation[]{
                new ExitIOperation(),
                new FindBook(),
                new AddBook(),
                new DelOperation(),
                new ShowOperation()
        };
    }

    @Override
    public int menu(){

        System.out.println("——————————————————————————————————————");
        System.out.println("管理员菜单");
        System.out.println("——————————————————————————————————————");
        System.out.println("hello "+ name +" welcome to AdminMenu");
        System.out.println("——————————————————————————————————————");
        System.out.println("1. 查找图书");
        System.out.println("2. 添加图书");
        System.out.println("3. 删除图书");
        System.out.println("4. 显示图书");
        System.out.println("0. 退出系统");
        System.out.println("——————————————————————————————————————");

        System.out.println("请输入操作代码：");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        return option;

    }

}
