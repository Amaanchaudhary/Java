class Book {

    static int totalBook;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBook = 0;
    }

    {
        totalBook++;
    }

    Book(String isbn) {
        this(isbn, "UNKNOWN", "UNKNOWN");
    }

    Book(String isbn, String title, String author) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    static int getTotalBook() {
        return totalBook;
    }

    public void borrowBook() {
        if(this.isBorrowed){
            System.out.println(this.title + " Book is already Borrowed");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    public void returnBook() {
        if(this.isBorrowed){
            System.out.println(this.title + " Hope you Enjoyed, Please Leave a Review.");
            this.isBorrowed = false;
        }else{
            System.out.println(this.title + " book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book javaBook = new Book("1","JAVA", "JAMES GOSLIN");
        Book myBook = new Book("2");
        System.out.println(totalBook);
        javaBook.borrowBook();
        myBook.borrowBook();
        javaBook.borrowBook();
        javaBook.returnBook();
        javaBook.returnBook();
    }
}
