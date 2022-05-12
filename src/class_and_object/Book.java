package class_and_object;


public class Book {
    //PROPERTIES OR DATA MEMBER OR MEMBER FUNCTION
    //NAME
         String name="Java";
    //WRITER
         String writer="James Gosling";
         //GENRE
    String genre="Education";
    //COST
         double cost=500.5;
    //PAGES
         int pages=900;

    public static void main(String[] args) {


        //SYNTAX : ClassName obj_name = new ClassName();
        Book book1 = new Book();
        // USE OBJECT TO ACCESS DATA MEMBER : obj_name.property_name;

        System.out.println(book1.name);
        System.out.println(book1.writer);
        System.out.println(book1.pages);
        System.out.println(book1.cost);

        Book book2 = new Book();

        //Changing of Object

        book2.name="Alchemist";
        book2.genre="Life";
        book2.cost=300.67;
        book2.pages=250;
        book2.writer="Paulo Coelho";
        System.out.println(book2.name);
        System.out.println(book2.genre);
        System.out.println(book2.pages);
        System.out.println(book2.writer);
        System.out.println(book2.cost);
    }
}
