import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class TaxImp extends UnicastRemoteObject implements Tax {
    public TaxImp()throws RemoteException {
        super();
    }

    public double calTax(double salary){
        if(salary <=10000){
            return salary*0.001;
        }else if(salary <=20000){
            return salary*0.0015;
        }else{
            return salary*0.002;
        }
    }
}