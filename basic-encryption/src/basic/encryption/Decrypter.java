/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.encryption;

/**
 *
 * @author Kyle
 */
public class Decrypter {
    
    private char[] alphabet;
    private char[] key;
    private int rotations;
    private char[] decrypted;
    
    Decrypter()
    {
        key = Key.key;
        alphabet = Key.alphabet;
    }
    
    char[] decrypt(char[] encrypted)
    {
        int index;
        decrypted = new char[encrypted.length];
        
        for(int i = encrypted.length-1; i >= 0; i--)
        {
            rotate();
            if(encrypted[i]==' ')
            {
                decrypted[i] = ' ';
            }
            else
            {
                index = search(encrypted[i]);
                decrypted[i] = alphabet[index];
            }
            
        }
//    
        return decrypted;
    }
    
    void display()
    {
        System.out.println(decrypted);
    }
    
    void rotate()
    {
        char temp;
        temp = key[25];
        for(int i = 25; i > 0; i--)
        {
            key[i] = key[i-1];
        }
        key[0] = temp;
    }
    
    int search( char c )
    {
        for(int i = 0; i < 26; i++)
        {
            if (key[i] == c)
            {
                return i;
            }
        }
        return -1;
    }
}
