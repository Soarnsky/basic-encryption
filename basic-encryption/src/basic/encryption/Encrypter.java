/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.encryption;

/**
 *
 * @author Kyle
 */
public class Encrypter {
    
    private char[] key;
    private char[] encrypted;
    private int rotations;
    
    Encrypter()
    {
        key = Key.key;
    }
    
    char[] encrypt(String input)
    {
        char[] inputarr;
        int buffer;
        input.toLowerCase();
        encrypted = new char[input.length()];
        inputarr = input.toCharArray();
        for(int i = 0; i < input.length(); i++)
        {
            if(inputarr[i]==' ')
            {
                encrypted[i] = ' ';
            }
            else
            {
                buffer = inputarr[i]-'a';
                encrypted[i] = key[buffer];
            }
            rotate();
        }
        
        return encrypted;
    }
    
    void display()
    {
        System.out.println(encrypted);
    }
    
    void rotate()
    {
        char temp;
        temp = key[0];
        for(int i = 0; i < 25; i++)
        {
            key[i] = key[i+1];
        }
        key[25] = temp;
    }
    
}
