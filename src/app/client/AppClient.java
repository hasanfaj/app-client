/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client;


import com.sun.servicetag.*;
import service.mahasiswaService;
import app.client.form.form;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.SwingUtilities;
/**
 *
 * @author paguman
 */
public class AppClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, NotBoundException {
        // TODO code application logic here
        Registry registry = (Registry) LocateRegistry.getRegistry("127.0.0.1", 6789);

        final mahasiswaService service = (mahasiswaService) registry.lookup("service");
   
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
         form Form = new form(service);
         Form.setVisible(true);


            }
        });


    }
}
