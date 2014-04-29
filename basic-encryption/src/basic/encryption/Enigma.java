/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.encodeion;

/**
 *
 * @author Kyle
 */
public class Enigma {
    
    private char[] inner;
    private char[] middle;
    private char[] outer;
    private char[] encoded;
    private char[] decoded;
    private int rotations;
    
    Enigma()
    {
        inner = Rotor.inner;
        middle = Rotor.middle;
        outer = Rotor.outer;
    }
    
    char[] encode(String input)
    {
        char[] inputarr;
        int buffer;
        input.toLowerCase();
        encoded = new char[input.length()];
        inputarr = input.toCharArray();
        for(int i = 0; i < input.length(); i++)
        {
            if(inputarr[i]==' ')
            {
                encoded[i] = ' ';
            }
            else
            {
                buffer = inputarr[i]-'A';
                encoded[i] = key[buffer];
            }
            rotate();
        }
        
        return encoded;
    }
    
    char[] decode(char[] encoded)
    {
        int index;
        decoded = new char[encoded.length];
        
        for(int i = encoded.length-1; i >= 0; i--)
        {
            rotate();
            if(encoded[i]==' ')
            {
                decoded[i] = ' ';
            }
            else
            {
                index = search(encoded[i]);
                decoded[i] = alphabet[index];
            }
            
        }
//    
        return decoded;
    }
    
    void display()
    {
        System.out.println(encoded);
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
