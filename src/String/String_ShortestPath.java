package String;
import java.util.*;
public class String_ShortestPath {

    public static int getShortestPath(String path){
        int x2 = 0;
        int y2 = 0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);

            if(dir == 'S'){
                y2--;
            }
            else if(dir == 'N'){
                y2++;
            }
            else if(dir == 'W'){
                x2--;
            }
    
        else{
            x2++;
        }
    }

        double X = x2*x2;
        double Y = y2*y2;
        return (int) Math.sqrt(X+Y);
    }

    public static void main(String args[]){
        String path ="WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
    
}
