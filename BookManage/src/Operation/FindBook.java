package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class FindBook implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");

        System.out.print("请输入你要查找的书名: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();

        for(int i = 0 ; i < currentSize ; i++ ){
            Book book = bookList.getBook(i);

            if (book.getName().equals(name)){
                System.out.println("您查找的图书: 《"+ name +"》 存在");
                System.out.println(book);
                return;
            }
        }
    }
}
