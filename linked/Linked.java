import java.util.*;
import java.util.Collections;
import java.util.Arrays;
public class Linked {
    public static void main(String[] args) {
        LinkedList<Integer> flist = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMENU");
            System.out.println("a. Insert element");
            System.out.println("b. Swap elements");
            System.out.println("c. Iterate reverse");
            System.out.println("d. Compare lists");
            System.out.println("e. Convert to ArrayList");
            System.out.println("x. Exit");
            System.out.print("Enter choice: ");
            char choice = sc.next().toLowerCase().charAt(0);

            switch (choice) {
                case 'a':
                    System.out.println("Enter the element");
                    int ele=sc.nextInt();
                    System.out.println("Enter the position");
                    int pos=sc.nextInt()-1;

                    flist.add(pos,ele);

                    System.out.println("Element added!");
                    System.out.println(flist);
                    break;

                case 'b':
                    System.out.println("Enter the first position");
                    int pos1=sc.nextInt()-1;
                    System.out.println("Enter the second position");
                    int pos2=sc.nextInt()-1;

                    Collections.swap(flist,pos1,pos2);
                    System.out.println("Elements swapped!");
                    System.out.println(flist);

                    break;
 
                case 'c':
                    for(int i=flist.size()-1;i>=0;i--){
                        System.out.print(flist.get(i)+" ");
                    }
                    break;

                case 'd':
                    LinkedList<Integer> slist = new LinkedList<>(Arrays.asList(10,20,50));
                    if(flist.equals(slist)){
                        System.out.println("Lists are equal!");
                    }else{
                        System.out.println("Lists are not equal!");
                    }
                    break;

                case 'e':
                    ArrayList<Integer> alist=new ArrayList<>(flist);
                    System.out.println("ArrayList :"+alist);
                    break;

                case 'x':
                    
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
