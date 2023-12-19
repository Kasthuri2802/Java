public class Big {
    public static void main(String[] args) {
        int a=10,b,c,d;
        b= ++a +15;
        c=a-- + --b -10;
        d=--a+ ++b- --c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        

    }
}