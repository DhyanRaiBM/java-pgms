import java.rmi.*;
import java.rmi.RemoteException;
import java.io.*;
import java.util.*;


public class TaxClient {
    public static void main(String[] args)throws IOException{
        Tax tax =(Tax)Naming.lookup("rmi://localhost/TaxServer");
        double salary,taxVal;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter basic pay");
        salary = sc.nextDouble();

        taxVal=tax.calTax(salary);

        System.out.println("Tax: " + tax);
    }
}