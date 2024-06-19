import java.rmi.*;

public class TaxServer{
    public TaxServer() {
        try{
            Tax tax =new TaxImp();
            Naming.rebind("rmi://localhost/TaxServer",tax);
            System.out.println("running server");
        }catch(Exception e){
            System.out.println("Failed to run server");
        }
    }

    public static void main(String[] args)throws RemoteException{
        new TaxServer();
    }
}