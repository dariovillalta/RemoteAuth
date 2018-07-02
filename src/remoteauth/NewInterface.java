/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remoteauth;

import java.rmi.Remote;
import java.util.ArrayList;

/**
 *
 * @author josef
 */
public interface NewInterface extends Remote {
    boolean insertar(String aejecutar);
    String autenticar(String login , String password);
     ArrayList todos();
     ArrayList porlogin(String loginname);
     ArrayList porid(String loginname);
     boolean borrar(String loginname, String password);
    
}
