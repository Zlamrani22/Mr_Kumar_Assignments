package objectsMethodsClasses;

public class Objects_Methods_Class3 {

    public static void main(String[] args) {
        System.out.println("This is the main method - 3rd class");
        Objects_Methods_Class3.testMethod1();
        Objects_Methods_Class3.testMethod2();
        Objects_Methods_Class3.testMethod3();
        Objects_Methods_Class3.testMethod4();
        Objects_Methods_Class3.testMethod5();
        System.out.println();

        Objects_Methods_Class3 objects_methods_class3 = new Objects_Methods_Class3();
        objects_methods_class3.testMethod6();
        objects_methods_class3.testMethod7();
        objects_methods_class3.testMethod8();
        objects_methods_class3.testMethod9();
        objects_methods_class3.testMethod10();
        System.out.println();

        Objects_Methods_Class3 objectsMethodsClass3_2 = new Objects_Methods_Class3();
        objectsMethodsClass3_2.testMethod6();
        objectsMethodsClass3_2.testMethod7();
        objectsMethodsClass3_2.testMethod8();
        objectsMethodsClass3_2.testMethod9();
        objectsMethodsClass3_2.testMethod10();
    }
    public static void testMethod1(){
        System.out.println("This is static method 1");
    }
    public static void testMethod2(){
        System.out.println("This is static method 2");
    }
    public static void testMethod3(){
        System.out.println("This is static method 3");
    }
    public static void testMethod4(){
        System.out.println("This is static method 4");
    }
    public static void testMethod5(){
        System.out.println("This is static method 5");
    }
    public void testMethod6(){
        System.out.println("This is non static method 1 - method 6");
    }
    public void testMethod7(){
        System.out.println("This is non static method 2 - method 7");
    }
    public void testMethod8(){
        System.out.println("This is non static method 3 - method 8");
    }
    public void testMethod9(){
        System.out.println("This is non static method 4 - method 9");
    }
    public void testMethod10(){
        System.out.println("This is non static method 5., - method 10");
    }
}
