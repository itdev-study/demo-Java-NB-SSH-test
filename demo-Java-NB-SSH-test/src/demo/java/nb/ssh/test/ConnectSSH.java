/*
 * To change this license header, choose License Headers in Project Properties.
 */
package demo.java.nb.ssh.test;

import com.jcraft.jsch.*;
import javax.swing.*;

public class ConnectSSH {

  public static void main(String[] arg) {
    try {
      JSch  jsch = new JSch();
     // String connstr = null;
     // if (arg.length > 0) {
    //    connstr = arg[0];
     // } else {
        //connstr = JOptionPane.showInputDialog("Enter username:password@hostname", System.getProperty("user.name")+":<pass>"+"@localhost");
    //  }
     // String user = connstr.substring(0, connstr.indexOf(':'));
    //  String pass = connstr.substring(connstr.indexOf(':')+1, connstr.indexOf('@'));
    //  String host = connstr.substring(connstr.indexOf('@') + 1);
      Session session = jsch.getSession("root", "192.168.254.32", 8022);    
      session.setPassword("10Password1024");
      session.setConfig("StrictHostKeyChecking", "no");
      session.connect();
      Channel channel = session.openChannel("shell");
      channel.setInputStream(System.in);
      channel.setOutputStream(System.out);
      channel.connect();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}