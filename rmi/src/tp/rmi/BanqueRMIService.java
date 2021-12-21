package tp.rmi;

import tp.metier.Compte;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BanqueRMIService extends UnicastRemoteObject implements  IBanqueRemote{
    DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
    List<Compte> l = new ArrayList<>();
    Compte compte1 = new Compte(1,50,df.parse("15-01-2001"));
    Compte compte2 = new Compte(2,30,df.parse("12-01-2001"));
    Compte compte3 = new Compte(3,100,df.parse("14-01-2003"));










    @Override
    public double conversion(double montant) throws RemoteException {
        System.out.println(" Conversion du montant suivant :" + montant);
        return montant*10;
    }



    @Override
    public Compte consulterCompte(int code) throws RemoteException, ParseException {
        for (Compte compte : listComptes()) {
            if (compte.getCode() == code) {
                return compte;
            }


        }
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("un nouveau compte sera crée de code "+code + " est de solde =0");

        return new Compte(code,0,df.parse("15-01-2001"));
    }






    @Override
    public List<Compte> listComptes() throws RemoteException, ParseException {
        l.add(compte1);
        l.add(compte2);
        l.add(compte3);
        return l;

    }


    static public void setL(List<Compte> l) {

    }

    public BanqueRMIService() throws RemoteException, ParseException {
        super();






    }
}
