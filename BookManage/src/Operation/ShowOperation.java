package Operation;

import Book.Book;

import Book.BookList;


public class ShowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("图书目录打印");

        int currentSize = bookList.getUsedSize();

        for(int i = 0 ; i < currentSize ; i++ ){
            Book book = bookList.getBook(i);

            System.out.println(book);
        }
    }

}
