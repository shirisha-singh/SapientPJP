import java.util.*;
public class PrintPrime{

    HashMap<String, Integer>hashMap = new HashMap<String, Integer>();
    
    PrintPrime(HashMap<String, Integer>hashMap)
    {
        this.hashMap = hashMap;
    }
    
    String getPrime(String alphabet)
    {
        if(hashMap.get(alphabet) <=9)
            return Integer.toString(hashMap.get(alphabet));
        else
            return Integer.toHexString(hashMap.get(alphabet));
    }
     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        HashMap<String, Integer>hashMap = new HashMap<String, Integer>()
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
        
        String newStr = "";
        PrintPrime instance = new PrintPrime(hashMap);
        for(int i=0; i<name.length(); i++)
        {
            newStr += instance.getPrime(Character.toString(name.charAt(i)));
            newStr += " ";
        }
        
        System.out.println(newStr);
     }
}