/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobiledealer.UI;


/**
 *
 * @author AkbarFauzy
 */
public class Driver {
    public static void main(String args[]) {
        Connection.Connection_to_db.connection();
        new Login().setVisible(true);
        
  
    } 
}
