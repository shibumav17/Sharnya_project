package conditional_statements;

public class Nested_If {

    public static void main(String[] args) {

        int marks = 75;
        String Branch = "CS";

        if (marks>=75 & Branch=="CS") {
            System.out.println("First division in CS branch");
        }

        if (marks>=75) {
            if (Branch=="CS") {
                System.out.println("First division in CS branch");
            }
        }
    }
}
