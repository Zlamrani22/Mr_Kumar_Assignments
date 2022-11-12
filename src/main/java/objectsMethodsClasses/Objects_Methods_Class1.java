package objectsMethodsClasses;

public class Objects_Methods_Class1 {

    public static void main(String[] args) {
        System.out.println("This is the main method - 1st class");
        Objects_Methods_Class1.methodOne();
        Objects_Methods_Class1.methodTwo();
        Objects_Methods_Class1.methodThree();
        Objects_Methods_Class1.methodFour();
        Objects_Methods_Class1.methodFive();
        System.out.println();

        Objects_Methods_Class1 object1 = new Objects_Methods_Class1();
        object1.methodSix();
        object1.methodSeven();
        object1.methodEight();
        object1.methodNine();
        object1.methodTen();
        System.out.println();

        Objects_Methods_Class1 object2 = new Objects_Methods_Class1();
        object2.methodSix();
        object2.methodSeven();
        object2.methodEight();
        object2.methodNine();
        object2.methodTen();
    }
    public static void methodOne(){
        System.out.println("This is the first static method");
    }
    public static void methodTwo(){
        System.out.println("This is the second static method");
    }
    public static void methodThree(){
        System.out.println("This is the third static method");
    }
    public static void methodFour(){
        System.out.println("This is the fourth static method");
    }
    public static void methodFive(){
        System.out.println("This is the fifth static method");
    }
    public void methodSix(){
        System.out.println("This is the first non static method: method #6");
    }
    public void methodSeven(){
        System.out.println("This is the second non static method: method #7");
    }
    public void methodEight(){
        System.out.println("This is the third non static method: method #8");
    }
    public void methodNine(){
        System.out.println("This is the fourth non static method: method #9");
    }
    public void methodTen(){
        System.out.println("This is the fifth non static method: method #10");
    }
}
