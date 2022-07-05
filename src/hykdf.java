public class hykdf {
    public static int makeSomething(int i, int j){
        return i+j;
    }
    public static String makeSomething(String name){
        return "Hello " + name;
    }
    public static double makeSomething(){
        return 3.14;
    }

    public static void main(String[] args) {
        System.out.println(makeSomething());
        System.out.println(makeSomething("savesta"));
        System.out.println(makeSomething(4,8));
        byte i = 1;
        byte j = 2;
        byte sum = (byte) (i + j);
        char c = 'a';
        System.out.println(c);
    }
}
