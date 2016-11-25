/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mathe
 */
public class Routes {
    
    /**
     *
     */
    public Routes() {

    }
    public String viewRoute(){
        String current="";
        try {
                    File file = new File("./BusRoutes.txt");
            BufferedReader br2 = new BufferedReader(new FileReader("./BusRoutes.txt"));
            current=br2.readLine();
            System.out.println("Read string is.."+current+"  File name is : ");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Routes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Routes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return current;
    }
    
}
