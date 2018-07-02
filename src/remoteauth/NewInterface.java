/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remoteauth;

import java.rmi.Remote;
import java.util.ArrayList;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author josef
 */
public interface NewInterface extends Remote {
    boolean insertar(String aejecutar) throws RemoteException;
    String autenticar(String login , String password) throws RemoteException;
     ArrayList todos() throws RemoteException;
     ArrayList porlogin(String loginname) throws RemoteException;
     ArrayList porid(String loginname) throws RemoteException;
     boolean borrar(String loginname, String password) throws RemoteException;
    
}
