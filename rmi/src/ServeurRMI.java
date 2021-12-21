

import tp.metier.Compte;
import tp.rmi.BanqueRMIService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ServeurRMI {
    public static void main(String[] args) throws RemoteException, MalformedURLException, ParseException {
        LocateRegistry.createRegistry(1099) ;
        BanqueRMIService bank = new BanqueRMIService();

        System.out.println(bank);
        Naming.rebind("rmi://localhost:1099/bank" ,bank ) ;
    }
}
