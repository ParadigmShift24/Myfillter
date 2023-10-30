package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class AddBook implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("添加图书");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书名称： ");
        String name = scanner.nextLine();
        System.out.println("请输入《"+ name +"》的作者：");
        String author = scanner.nextLine();
        System.out.println("请输入《"+ name +"》的价格：");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("请输入《"+ name +"》的类型：");
        String type = scanner.nextLine();

        boolean isBowrrowed = false;

        //创建一本新书
        Book book = new Book(name, author, price, type, isBowrrowed);

        int currentSize = bookList.getUsedSize();

        for (int i = 0; i < currentSize; i++){
            Book book1 = bookList.getBook(i);
            if (book1.getName().equals(name)){
                System.out.println("当前书架上已经存在这本书");
                return;
            }
        }

        bookList.setBook(currentSize,book);

        //放入一本书后
        bookList.setUsedSize(currentSize + 1);

    }


}
