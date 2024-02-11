package String;
public class Strings_Reverse {
    public static void main(String args[]){
        String name = "Divyanshi";
        String newName = " ";
        int n = name.length();
        for(int i=n-1;i>=0;i--){
          newName = newName+name.charAt(i);
        }
        System.out.println(newName);
    }

}
