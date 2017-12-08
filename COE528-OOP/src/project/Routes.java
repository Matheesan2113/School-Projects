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
     * @param brr the brr to set
     */
    public void setBrr(BufferedReader brr) {
        this.brr = brr;
    }

    /**
     * @return the filebus
     */
    public File getFilebus() {
        return filebus;
    }

    /**
     * @return the brr
     */
    public BufferedReader getBrr() {
        return brr;
    }

    /**
     *
     */
    private BufferedReader brr;
    private File filebus;

    public Routes() {
        try {
            filebus = new File("./BusRoutes.txt");
            brr = new BufferedReader(new FileReader("./BusRoutes.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Routes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String viewRoute(File file, BufferedReader br2) {
        String current = "";
        try {
            if (br2.ready()) {
                current = br2.readLine();
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Routes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Routes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return current;
    }

}
