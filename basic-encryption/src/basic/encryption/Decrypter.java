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
    private char[] decoded;
    
    Decrypter()
    {
        key = Key.key;
        alphabet = Key.alphabet;
    }
    
    
    
    void display()
    {
        System.out.println(decoded);
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
