package cdma;

import java.math.BigInteger;

public class Sender 
{
    Multiplexer mux = new Multiplexer();
    private String gd = "Good";
    private String bd= "Bad";
    private int[] good;
    private int[] bad;
    private int[] StringAsc;
    
    public Sender()//no parameter contructor
    {
        
        
    }
    
    public void start()
    {
        
        
        good = StrtoASC(gd);
        bad = StrtoASC(bd);
        
        System.out.println("Transmitter ASCII/String Output:");
        
        System.out.print("A: ");
        for(int i = 0; i < good.length; i++)
        {
            System.out.print(good[i]);
        }
        
        System.out.print("   String: " + gd);
        
        System.out.print("\nB: ");
        for(int i = 0; i < bad.length; i++)
        {
            System.out.print(bad[i]);
        }
        
        System.out.print("           String: " + bd);
        
        System.out.print("\nC: ");
        for(int i = 0; i < good.length; i++)
        {
            System.out.print(good[i]);
        }
        
        System.out.print("   String: " + gd);
        
        System.out.print("\nD: ");
        for(int i = 0; i < bad.length; i++)
        {
            System.out.print(bad[i]);
        }
        
        System.out.print("           String: " + bd);
        
        mux.start(good, bad);
    }
    
    public int[] StrtoASC(String phrase)
    {
        String bin = "";
        String hex = "";
        for(int i = 0 ; i < phrase.length(); i++)
        {
            char a = phrase.charAt(i);
            int ascii = a;
            hex = hex + Integer.toHexString(a);   
        }
         
        int dec = Integer.parseInt(hex,16);
        //bin = Integer.toBinaryString(dec);
        bin = Integer.toBinaryString(dec);
        
        if(bin.length() > 24)
        {
            bin = String.format("%32s", Integer.toBinaryString(dec)).replace(' ', '0');
        }
        else
        {
            bin = String.format("%24s", Integer.toBinaryString(dec)).replace(' ', '0');
        }
        
        
        StringAsc = new int[bin.length()];
        for(int i = 0; i < StringAsc.length; i++)
        {
            StringAsc[i] = Character.getNumericValue(bin.charAt(i));
        }
        return StringAsc;
    }
    
    public String getGood(){
        return gd;
    }
    
    public String getBad(){
        return bd;
    }
    
}

