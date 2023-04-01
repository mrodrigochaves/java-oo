package edu.mrodrigochaves.exercices._interface;

class Calc implements MathematicalOperation {



    @Override
    public void sum(double operating1, double operating2){
        System.out.println("Sum: " + (operating1 + operating2));
    }

    @Override
    public void subtraction(double operating1, double operating2){
        System.out.println("Subtraction: " + (operating1 - operating2));
    }

    @Override
    public void multiplication(double operating1, double operating2){
        System.out.println("Multiplication: " + (operating1 * operating2));
    }

    @Override
    public void division(double operating1, double operating2){
        System.out.println("Division: " + (operating1 / operating2));
    }

    
}
