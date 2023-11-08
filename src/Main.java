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
//    String con = new String();
//    if(a.length() > 2 && b.length() > 2){
//        con = con.concat(a.substring(0, 3));
//        con = con.concat(b.substring(0, 3));
//    }
//        System.out.println(con);
//
//        String nowy = new String();
//    int first = a.length();
//    int second = b.length();
//
//    int min = first;
//    if (min > second) min = second;
//    for(int i = 0; i < a.length() && i < b.length(); i++ ){
//       nowy = nowy.concat(a.substring(i, i+1));
//       nowy = nowy.concat(b.substring(i, i+1));
//    }
//    if(first > second) nowy += a.substring(second, first);
//    else nowy += b.substring(first, second);
//    System.out.println(nowy);
    // zad 3
        if(a.length() > b.length()){
            System.out.println(b+a+b);
        }
        else if(a.length() != b.length()){
            System.out.println(a+b+a);
    }

    }
}