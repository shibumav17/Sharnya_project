package class_and_object;

public class BookWithParameterizedConstructor {

    String name;
    String WriterName;
    int pages;
    double price;

    //Parameterized Constructor

    public BookWithParameterizedConstructor(String name, String writerName, int pages, double price) {
        this.name = name;
        this.WriterName = writerName;
        this.pages = pages;
        this.price = price;
    }

    public static void main(String[] args) {
        //SYNTAX Classname obj_name= new ClassName(para1, para2, para3...);

        BookWithParameterizedConstructor obj= new BookWithParameterizedConstructor("Java", "James Gosling", 400,500.5);

        System.out.println("Name of the Book:" +obj.name);
        System.out.println("Writer of the book:" +obj.WriterName);
        System.out.println("Pages in the Book:" +obj.pages);
        System.out.println("Price of the Book:" +obj.price);

        BookWithParameterizedConstructor obj1= new BookWithParameterizedConstructor("The Alchemist", "Paulo Coelho", 250, 300.15);

        System.out.println("Name of the Book: " +obj1.name);
        System.out.println("Name of the Writer: " +obj1.WriterName);
        System.out.println("Pages in the Book: " +obj1.pages);
        System.out.println("Price of the Book: " +obj1.price);
    }

}
