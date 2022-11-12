package objectsMethodsClasses;

public class Objects_Methods_Class2 {

    public static void main(String[] args) {
        System.out.println("This is the main method - 2nd class");
        Objects_Methods_Class2.method1();
        Objects_Methods_Class2.method2();
        Objects_Methods_Class2.method3();
        Objects_Methods_Class2.method4();
        Objects_Methods_Class2.method5();
        System.out.println();

        Objects_Methods_Class2 obj1 = new Objects_Methods_Class2();
        obj1.method6();
        obj1.method7();
        obj1.method8();
        obj1.method9();
        obj1.method10();
        System.out.println();

        Objects_Methods_Class2 obj2 = new Objects_Methods_Class2();
        obj2.method6();
        obj2.method7();
        obj2.method8();
        obj2.method9();
        obj2.method10();
    }
    public static void method1(){
        System.out.println("This is the 1st static method");
    }
    public static void method2(){
        System.out.println("This is the 2nd static method");
    }
    public static void method3(){
        System.out.println("This is the 3rd static method");
    }
    public static void method4(){
        System.out.println("This is the 4th static method");
    }
    public static void method5(){
        System.out.println("This is the 5th static method");
    }
    public void method6(){
        System.out.println("This is the 1st non static method: method #6");
    }
    public void method7(){
        System.out.println("This is the 2nd non static method: method #7");
    }
    public void method8(){
        System.out.println("This is the 3rd non static method: method #8");
    }
    public void method9(){
        System.out.println("This is the 4th non static method: method #9");
    }
    public void method10(){
        System.out.println("This is the 5th non static method: method #10");
    }
}
