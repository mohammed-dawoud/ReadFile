/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readfile;

/**
 *
 * @author DAWOUD
 */
 import java.io.*;
import javax.swing.JOptionPane;

public class ReadFile2 {
  public static void main(String args[]) {
    try {
            String Address = JOptionPane.showInputDialog(null, "Please Enter The File Path", "Web Address Message", 3);  
      FileInputStream fstream = new FileInputStream(Address);
      DataInputStream in = new DataInputStream(fstream);
      BufferedReader br = new BufferedReader(new InputStreamReader(in));
      String str;
      while ((str = br.readLine()) != null) {
        System.out.println(str);
      }
      in.close();
    } catch (Exception e) {
      System.err.println(e);
    }
  }
}
