package Operation;

import Book.Book;
import Book.BookList;

public class ExitIOperation implements IOperation{
    @Override
    public void work(BookList bookList) {

        System.out.println("——————————————————————————————————————");

        System.out.println("退出系统");

        System.out.println("——————————————————————————————————————");

        int currentSize = bookList.getUsedSize();


        for(int i = 0 ; i < currentSize ; i++ ){
            bookList.setBook(i,null);
        }
        bookList.setUsedSize(0);

        System.exit(0);
    }
}
