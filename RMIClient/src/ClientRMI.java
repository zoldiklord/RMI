import tp.metier.Compte;
import tp.rmi.IBanqueRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientRMI {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException, ParseException {
            IBanqueRemote Stub = (IBanqueRemote) Naming.lookup("rmi://localhost:1099/bank");

            System.out.println("affichage de la liste des comptes :" +Stub.listComptes());
            System.out.println("Consultation du compte : "+Stub.consulterCompte(5).getSolde());
            System.out.println("Conversion du montant : "+Stub.conversion(5));




    }
}
