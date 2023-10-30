package Operation;

import Book.Book;
import Book.BookList;
import java.util.Scanner;

public class ReturnBook implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书籍名称：");
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();

        for(int i = 0 ; i < currentSize ; i++ ){
            Book book = bookList.getBook(i);

            if (book.getName().equals(name)){
                book.setBorrowed(false);
                System.out.println("已归还图书");
                return;
            }
        }
        System.out.println("未查找到该书籍！");
    }
}
