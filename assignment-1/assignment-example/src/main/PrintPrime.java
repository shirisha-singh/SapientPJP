import java.util.*;
public class PrintPrime{
    
    HashMap<String, Integer> map = new HashMap();
    
    PrintPrime(HashMap<String, Integer> map)
    {
        this.map = map;
    }
    
    public String getPrime(String alphabet)
    {
        if(this.map.get(alphabet) <= 9)
            return Integer.toString(this.map.get(alphabet));
        else
            return Integer.toHexString(this.map.get(alphabet));
    }
    
     public static void main(String []args){
            
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>()
{{
     put("A", 1);
     put("B", 2);
     put("C", 3);
     put("D", 5);
     put("E", 7);
     put("F", 11);
     put("G", 13);
     put("H", 17);
     put("I", 19);
     put("J", 23);
     put("K", 29);
     put("L", 31);
     put("M", 37);
     put("N", 41);
     put("O", 43);
     put("P", 47);
     put("Q", 53);
     put("R", 59);
     put("S", 61);
     put("T", 67);
     put("U", 71);
     put("V", 73);
     put("W", 79);
     put("X", 83);
     put("Y", 89);
     put("Z", 97);
}};
    PrintPrime instance = new PrintPrime(hashMap);
    Scanner scanner = new Scanner(System.in);
    String str = scanner. nextLine();
    
    String newstr = "";
    for(int i=0; i< str.length(); i++)
    {
        newstr += instance.getPrime(Character.toString(str.charAt(i)));
    }
    System.out.println(newstr);
     }
}