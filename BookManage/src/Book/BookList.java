package Book;

//书架：

public class BookList {
    private Book[] books = new Book[20];

    private int usedSize;//记录当前书架上书的数目

    public BookList(){

        //书架上默认放3本书

        this.books[0] = new Book("三国演义","罗贯中",23,"History Novel",true);
        this.books[1] = new Book("西游记","吴承恩",34,"History Bovel",true);
        this.books[2] = new Book("红楼梦","曹雪芹",21,"Novel",true);
        this.usedSize = 3;

    }


    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    //向书架上放书
    public Book setBook(int index, Book book) {
        books[index] = book;
        return book;
    }

    public Book getBook(int index) {
        return books[index];
        //返回当前下标书
    }



    public BookList(Book[] books) {
        this.books = books;
    }


}
