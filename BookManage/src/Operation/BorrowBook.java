package Operation;

import Book.Book;
import Book.BookList;
import java.util.Scanner;


public class BorrowBook implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书籍名称：");
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();

        for(int i = 0 ; i < currentSize ; i++ ){
            Book book = bookList.getBook(i);

            if (book.getName().equals(name)){
                if (book.isBorrowed() == false){
                    book.setBorrowed(true);
                }else{
                    System.out.println("该书已经借出！");
                }

                System.out.println(book);
                return;
            }
        }
        System.out.println("未查找到该书籍！");
    }
}
