package objectsMethodsClasses;

public class Objects_Methods_Class4 {

    public static void main(String[] args) {
        System.out.println("This is the main method - 4th class");
        Objects_Methods_Class4.methodA();
        Objects_Methods_Class4.methodB();
        Objects_Methods_Class4.methodC();
        Objects_Methods_Class4.methodD();
        Objects_Methods_Class4.methodE();
        System.out.println();

        Objects_Methods_Class4 objects_methods_class4 = new Objects_Methods_Class4();
       objects_methods_class4.methodF();
       objects_methods_class4.methodG();
       objects_methods_class4.methodH();
       objects_methods_class4.methodI();
       objects_methods_class4.methodJ();
        System.out.println();

        Objects_Methods_Class4 class4Object = new Objects_Methods_Class4();
        class4Object.methodF();
        class4Object.methodG();
        class4Object.methodH();
        class4Object.methodI();
        class4Object.methodJ();
    }
    public static void methodA(){
        System.out.println("This is the 1st static method - 4th class");
    }
    public static void methodB(){
        System.out.println("This is the 2nd static method - 4th class");
    }
    public static void methodC(){
        System.out.println("This is the 3rd static method - 4th class");
    }
    public static void methodD(){
        System.out.println("This is the 4th static method - 4th class");
    }
    public static void methodE(){
        System.out.println("This is the 5th static method - 4th class");
    }
    public void methodF(){
        System.out.println("This is the 1st non static method: method #6 - 4th class");
    }
    public void methodG(){
        System.out.println("This is the 2nd non static method: method #7 - 4th class");
    }
    public void methodH(){
        System.out.println("This is the 3rd non static method: method #8 - 4th class");
    }
    public void methodI(){
        System.out.println("This is the 4th non static method: method #9 - 4th class");
    }
    public void methodJ(){
        System.out.println("This is the 5th non static method: method #10 - 4th class");
    }
}
