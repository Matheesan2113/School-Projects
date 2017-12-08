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
 * Overview: An authentication Object is Immutable as it only works with one file and buffered Writer at a time
 * <p>
 * Abstraction function: Class works with file, and writers from UI requiring no changes from within class.
 * <p>
 * Rep invariant: file must be the same
 */
public class Authentication {
FileWriter fw;
File file;
    /**
     * Modifies:boolean to set as true or false
     * Requires: matching username and password
     * Effects: Returns true if credentials match, false otherwise
     * @param user- Must be the same as one of the usernames stored in text file
     * @param pass-Must be the same as the password stored next to specified username in text file
     * @return true or false depending on the username and password matched stored values
     * @throws IOException if user name and password were read incorrectly as wrong input
     */
    public boolean login(String user, String pass) throws IOException {
//EFFECTS: CHECKS IF LOG IN EXISTS AND IS CORRECT OR NOT
        //REQUIRES: FOR EXITING LOOP, REQUIRES CORRECT USER AND PASS, REQUIRES FILE STORING INFORMATION
        boolean r = false;
        String hold;
        try {
            BufferedReader br = new BufferedReader(new FileReader("./logindata.txt"));
            try {
                while ((hold = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(hold);
                    if (user.equals(st.nextElement())) {
                        if (pass.equals(st.nextElement())) {
                            System.out.println("YOU logged in : " + user);
                            r = true;
                            break;
                        } else {
                            System.out.println("password was wrong for " + user);
                            r = false;
                        }
                    } else {
                        r = false;
                    }
                }
            } catch (NullPointerException ef) {

            }
        } catch (IOException ex) {

        }
        return r;
    }

    /**
     * Constructor
     * Requires: login file specifically
     * @param file-needs login file in order to step through account usernames
     */
    public Authentication(File file){
    this.file=file;
        try {
            fw = new FileWriter(file.getAbsoluteFile()); // COMMA TRUE TO APPEND MANAGER LOG IN DETAILS 
        } catch (IOException ex) {
            Logger.getLogger(Authentication.class.getName()).log(Level.SEVERE, null, ex);
        }
           this.bw= new BufferedWriter(fw);
}


    /**
     *Instance of Buffered Writer so UI can reuse it from singleton 
     * Instance of Authentication to keep track of where it read 
     * from previous time
     */
    protected BufferedWriter bw;

    /**
     * Modifies: file @login.txt through the use of bufferedWriter
     * Requires: BufferedWriter from single Instance of this class, username and password
     * Effects: saves username and password on text file for later use
     * @param bw-allows the use of the same buffered reader going through the same file
     * @param user-string
     * @param pass-string
     */
    public void Write2Text(BufferedWriter bw, String user,String pass) {         
        try {   
            bw.write(user);
            bw.write(" "+pass);
            bw.newLine();
            bw.flush();
        } catch (IOException ex) {
            Logger.getLogger(Authentication.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (NullPointerException fs){
            
        }
    }

    /**
     * Effects:Returns Buffered Writer from instance it was created from
     * @return buffered Writer
     */
    protected BufferedWriter getBw() {
        return bw;
    }

}
