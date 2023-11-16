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

public class ReadFile {
  public static void main(String[] args) {
      String Address = JOptionPane.showInputDialog(null, "Please Enter The File Path", "Web Address Message", 3);

    File file = new File(Address);
    int ch;
    StringBuffer strContent = new StringBuffer("");
    FileInputStream fin = null;
    try {
      fin = new FileInputStream(file);
      while ((ch = fin.read()) != -1)
        strContent.append((char) ch);
      fin.close();
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println(strContent.toString());
  }
}
