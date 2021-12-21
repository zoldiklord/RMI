package tp.rmi;



import tp.metier.Compte;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IBanqueRemote extends Remote {
    public double conversion(double montant) throws RemoteException;
    public Compte consulterCompte(int code) throws RemoteException ;
    public List<Compte> listComptes() throws RemoteException ;
}
