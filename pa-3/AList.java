import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class AList{
    public static void main(String[] args){
        ArrayList<Integer> alist=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("MENU");
            System.out.println("--------------");
            System.out.println("1.Add");
            System.out.println("2.Sort");
            System.out.println("3.Replace");
            System.out.println("4.Remove");
            System.out.println("5.Display");
            System.out.println("6.Add between");
            System.out.println("7.exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the element");
                    int ele = sc.nextInt();

                    alist.add(ele);
                    break;
                case 2:
                    System.out.println("Sorted List :");
                    Collections.sort(alist);
                    System.out.println(alist);
                    break;

                case 3:
                    System.out.println("Enter element to be replced");
                    int ele3 = sc.nextInt();
                    System.out.println("Enter element ");
                    int ele4 = sc.nextInt();
                    Collections.replaceAll(alist, ele3, ele4);
                    System.out.println("Replaced!!");
                    break;
                case 4:
                    System.out.println("Enter element to be removed");
                    int ele1 = sc.nextInt();
                    if(alist.contains(ele1)){
                        alist.remove((Integer)ele1);
                    }
                    System.out.println("Element removed");
                    break;
                case 5:
                    System.out.println("Elements are :");
                    System.out.println(alist);
                    break;
                case 6:
                    System.out.println("Enter the element");
                    int ele2 = sc.nextInt();
                    System.out.println("Enter the pos");
                    int pos = sc.nextInt();
                    alist.add(pos,ele2);
                    System.out.println("Element added !");
                    break;
            }
        }

    }
}