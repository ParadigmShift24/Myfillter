package Operation;

import Book.Book;
import Book.BookList;
import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        System.out.println("请输入您要删除的图书的名称：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();

        int index = -1;

        for(int i = 0 ; i < currentSize ; i++ ){
            Book book = bookList.getBook(i);

            if (book.getName().equals(name)){
                System.out.println(book);
                System.out.println("是否要删除图书: 《"+ name +"》 （1：是| 0.否）");
                int choice = scanner.nextInt();

                if (choice == 1){
                    index = i;
                    break;
                }
                else
                    return;
            }

        }

        if(index < 0){
            System.out.println("未找到相关图书！");
        }else {
            for (int i = index;  i < currentSize -1; i++){
                Book book1 = bookList.getBook(i + 1);
                bookList.setBook(i,book1);
            }

            bookList.setUsedSize(currentSize - 1);
            System.out.println("删除成功！");
        }


    }
}
