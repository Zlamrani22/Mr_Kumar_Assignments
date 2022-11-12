package objectsMethodsClasses;

public class Objects_Methods_Class5 {

    public static void main(String[] args) {
        System.out.println("This is the main method - 5th class");
        Objects_Methods_Class5.firstMethod();
        Objects_Methods_Class5.secondMethod();
        Objects_Methods_Class5.thirdMethod();
        Objects_Methods_Class5.fourthMethod();
        Objects_Methods_Class5.fifthMethod();
        System.out.println();

        Objects_Methods_Class5 firstObject = new Objects_Methods_Class5();
        firstObject.sixthMethod();
        firstObject.seventhMethod();
        firstObject.eighthMethod();
        firstObject.ninthMethod();
        firstObject.tenthMethod();
        System.out.println();

        Objects_Methods_Class5 class4Object = new Objects_Methods_Class5();
        class4Object.sixthMethod();
        class4Object.seventhMethod();
        class4Object.eighthMethod();
        class4Object.ninthMethod();
        class4Object.tenthMethod();
    }
    public static void firstMethod(){
        System.out.println("This is the 1st static method - 5th class");
    }
    public static void secondMethod(){
        System.out.println("This is the 2nd static method - 5th class");
    }
    public static void thirdMethod(){
        System.out.println("This is the 3rd static method - 5th class");
    }
    public static void fourthMethod(){
        System.out.println("This is the 4th static method - 5th class");
    }
    public static void fifthMethod(){
        System.out.println("This is the 5th static method - 5th class");
    }
    public void sixthMethod(){
        System.out.println("This is the 1st non static method: method #6 - 5th class");
    }
    public void seventhMethod(){
        System.out.println("This is the 2nd non static method: method #7 - 5th class");
    }
    public void eighthMethod(){
        System.out.println("This is the 3rd non static method: method #8 - 5th class");
    }
    public void ninthMethod(){
        System.out.println("This is the 4th non static method: method #9 - 5th class");
    }
    public void tenthMethod(){
        System.out.println("This is the 5th non static method: method #10 - 5th class");
    }
}
