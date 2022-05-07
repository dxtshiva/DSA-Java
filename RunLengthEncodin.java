import java.util.Scanner;
import java.util.HashMap;

public class RunLengthEncodin {
    
    static HashMap<String, Integer> count(String s){
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
            if(map.containsKey(s.charAt(i)+""))
            map.replace(s.charAt(i)+"", Integer.parseInt(map.get(s.charAt(i)+"").toString())+1);
            else
            map.put(s.charAt(i)+"", 1);
        return map;
    }
    
    static void encode(String s){
        int count =1;
        char c = s.charAt(0);
        for(int i=1;i<s.length();i++){
            
            if((s.charAt(i)+"").equals((c+"")))
                count++;
            else{
                System.out.print(c+""+count);
                c = s.charAt(i);
                count=1;
            }

        }

        System.out.print(c+""+count);
                
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        HashMap<String,Integer> map = count(str);
        System.out.println(map.toString());
        encode(str);
        sc.close();
    }
}
