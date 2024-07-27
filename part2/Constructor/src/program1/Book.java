package program1;

 class Book {
	 String title;
     String author;
     int year;
     String publisher;
     double price;

    
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.year = 0;
        this.publisher = "Unknown";
        this.price = 0.0;
    }

    
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.year = 0;
        this.publisher = "Unknown";
        this.price = 0.0;
    }

    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = 0;
        this.publisher = "Unknown";
        this.price = 0.0;
    }

    
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = "Unknown";
        this.price = 0.0;
    }

    
    public Book(String title, String author, int year, String publisher, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.price = price;
    }

    public void printDetails() {
    	System.out.println("Title: "+title);
    	System.out.println("Author: "+author);
    	System.out.println("Year:"+year);
    	System.out.println("Publisher: "+publisher);
    	System.out.println("Price: "+price);
    }
    
    public static void main(String[] args) {
    
    Book book1 = new Book();
    Book book2 = new Book("elizabeth");
    Book book3 = new Book("harry potter", "jk rowling");
    Book book4 = new Book("hamlet", "shakespeare", 1932);
    Book book5 = new Book("merchant of venice", "shakespeare", 1953, "simon", 15.99);
    
    book1.printDetails();
    book2.printDetails();
    book3.printDetails();
    book4.printDetails();
    book5.printDetails();
    
    
    
    
    
    }

}
