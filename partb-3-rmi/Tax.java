import java.rmi.*;

public interface Tax extends Remote{
    public double calTax(double salary) throws RemoteException;
}