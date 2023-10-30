package Book;

public class Book {

    private String name; //书名
    private String author; // 作者
    private int price;//价格
    private String type;  // 类型
    private boolean isBorrowed; //是否借出


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }


    public Book(String name, String author, int price, String type, boolean isBorrowed){
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }


    @Override
    public String toString() {
        return "{" +
                "书名: 《" + name + '》' +
                " | 作者: '" + author + '\'' +
                ", 价格: " + price +
                " $, 类型: '" + type + '\'' +
                ((isBorrowed == true) ?
                        "  已借出" :
                        "  可借阅")+

                /*", isBorrowed=" + isBorrowed +*/
                '}';
    }

}
