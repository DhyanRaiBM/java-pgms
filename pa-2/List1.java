import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class List1{
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(1,6,5,3,4,8,2,0);

        Collections.sort(list);

        int secondMin=list.get(1);
        int secondMax=list.get(list.size()-2);

        System.out.println("Second min: " + secondMin + " second max: " + secondMax);

    }
}