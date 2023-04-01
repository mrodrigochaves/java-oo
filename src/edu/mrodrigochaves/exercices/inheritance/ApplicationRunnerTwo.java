package edu.mrodrigochaves.exercices.inheritance;

public class ApplicationRunnerTwo {
    public static void main(String[] args) {
        
        Employee employee = new Employee();

        // Upcast example
        Employee manager = new Manager();
        Employee seller = new Seller();
        Employee janitor = new Janitor();

        // Downcast exemple
        //Seller seller1 = (Seller) new Employee();

    }
}
