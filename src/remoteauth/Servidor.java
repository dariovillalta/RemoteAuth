/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remoteauth;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

/**
 *
 * @author josef
 */
public class Servidor {
    public class Server {
        public Server() {
        }
        
        public void iniciarServidor() {
            try {
                // Crear el repositorio en el puerto 1099
                Registry registry = LocateRegistry.createRegistry(1100);
                // Crea un nuevo servicio y lo registra en el repositorio
                registry.rebind("miMensaje", new coneccion());
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("El sistema esta listo");
         
        }
    }
    
    Server server;
    public void start(){
        server = new Server();
        server.iniciarServidor();
    }

    public static void main(String[] args) {
        Servidor servidor = new Servidor();
        servidor.start();

    }
}
