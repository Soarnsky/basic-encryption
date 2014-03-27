/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.encryption;

import java.util.Scanner;

/**
 *
 * @author Kyle
 */
public class BasicEncryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Encrypter encrypter = new Encrypter();
        Decrypter decrypter = new Decrypter();
        String userinput;
        char[] encrypted;
        
        System.out.println("Enter message to be encoded:\n");
        Scanner reader = new Scanner(System.in);
        userinput = reader.nextLine();
        
        encrypted = encrypter.encrypt(userinput);
        encrypter.display();
        
        decrypter.decrypt(encrypted);
        decrypter.display();
    
    }
}
