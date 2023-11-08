import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String title = "Pan Tadeusz";
//        System.out.println(title.length());
//        System.out.println(title.isEmpty());
//        System.out.println(title.charAt(10));
//
//        char[] znaki = new char[title.length()];
//        for(int i = 0; i < znaki.length; i++){
//            znaki[i] = title.charAt(i);
//            System.out.println(znaki[i]);
//        }
//        System.out.println(title.indexOf("s"));
//        System.out.println(title.endsWith("e"));
//        String tit = title.substring(4);
//        System.out.println(tit);
//        String titletit = title.concat(tit);
//        System.out.println(titletit);
//        title = title.replace("Pan", "Mr");
//        System.out.println(title);


    Scanner skan = new Scanner(System.in);
    String a = skan.nextLine();
    Scanner skan2 = new Scanner(System.in);
    String b = skan2.nextLine();
    String con = new String();
    if(a.length() > 2 && b.length() > 2){
        con = con.concat(a.substring(0, 3));
        con = con.concat(b.substring(0, 3));
    }
        System.out.println(con);
    }
}