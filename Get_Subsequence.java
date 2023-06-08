import java.util.ArrayList;
import java.util.Scanner;

public class Get_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
    } 
    
    public static ArrayList<String> gss(String str){
        if(str.length()==0){
            ArrayList<String>  li = new ArrayList<>();
            li.add("");
            return li;
        }
char ch = str.charAt(0);
String nstr = str.substring(1);
ArrayList<String> got = gss(nstr);

ArrayList<String> mres = new ArrayList<>();

for (String string : got) {
    mres.add(" "+string);
    mres.add(ch+string);
}

        return mres;
    }
}
