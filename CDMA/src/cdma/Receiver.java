package cdma;

public class Receiver 
{
    
    public void output(int[] msg)
    {
        String let1 = "";
        String let2 = "";
        String let3 = "";
        String let4 = "";
        for(int i = 0; i < msg.length; i++)//this for loop splits up the ascii code into  segements of 8 
        {                                   //to help reconstruct the message that was sent over CDMA
            if(i < 8 )//word 1
            {
                let1 = let1 + msg[i];
            }
            else if(i >= 8 && i < 16)//word 2
            {
                let2 = let2 + msg[i];
            }
            else if(i >= 16 && i < 24)//word3
            {
                let3 = let3 + msg[i];
            }
            else if(i >= 24 && i < 32)//word4
            {
                let4 = let4 + msg[i];
            }
        }
        char a  = (char) Integer.parseInt(let1,2);//converts from hex back to a character
        char b  = (char) Integer.parseInt(let2,2);//converts from hex back to a character
        char c  = (char) Integer.parseInt(let3,2);//converts from hex back to a character
        char d  = (char) Integer.parseInt(let4,2);//converts from hex back to a character
        
        System.out.println(a+""+b+""+c+""+d);//outputs the message that was transferred
    }
}
