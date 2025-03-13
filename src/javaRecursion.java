public class javaRecursion {
    public static void main(String[] args) {
        message();
    }
    static void message(){
        System.out.println("HelloWorld");
        message1();
    }
    static void message1(){
        System.out.println("HelloWorld");
        message2();
    }
    static void message2(){
        System.out.println("HelloWorld");
        message3();
    }
    static void message3(){
        System.out.println("HelloWorld");
    }
}
