package User;

import Book.BookList;
import Operation.IOperation;

public abstract class User {
    protected String name;//姓名

    public IOperation[] userOperations; //定义用户类的操作代码数组

    public User(String name) {
        this.name = name;
    }

    //父类抽象方法
    public abstract int menu();

    //用户操作
    public void doOperation(int options, BookList bookList) {
        userOperations[options].work(bookList);
    }

}
