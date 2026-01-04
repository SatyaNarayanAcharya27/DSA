public class Dummy {
    public char last(String s){
        return s.charAt(s.length()-1);
    }
    public static void main(String[] args) {
        Dummy obj = new Dummy();
        String str = "takeuforward";
        char c = obj.last(str);
        System.out.println(c);
    }
}
