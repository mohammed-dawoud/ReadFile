/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readfile;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author DAWOUD
 */
public class TestReadFile2 {
    
    
      public static void main(String args[]) {
    try {
      FileInputStream fstream = new FileInputStream("C:/R.java");
      DataInputStream in = new DataInputStream(fstream);
      BufferedReader br = new BufferedReader(new InputStreamReader(in));
      String str;
      while ((str = br.readLine()) != null) {
        System.out.println(str);
//        str.
      }
      in.close();
    } catch (Exception e) {
      System.err.println(e);
    }
  }
    
    
}
