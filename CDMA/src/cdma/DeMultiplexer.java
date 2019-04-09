package cdma;

public class DeMultiplexer {
    final int len = 8;
    Receiver rec = new Receiver();
    Signals seq = new Signals();
    
    public void demux(int[][] trans, int choice)
    {
        int[] ascii;
        if(choice == 0)
        {
            ascii = interpreter(trans, seq.getSeqA());
            
            System.out.print("A: ");
            for(int i : ascii)
            {
                System.out.print(ascii[i]);
            }
            
            System.out.print("  String: ");
            rec.output(ascii);
        }
        else if(choice == 1)
        {
            ascii = interpreter(trans, seq.getSeqB());
            
            System.out.print("B: ");
            for(int i = 0; i < 24; i++)
            {
                System.out.print(ascii[i]);
            }
            
            System.out.print("          String: ");
            rec.output(ascii);
        }
        else if(choice == 2)
        {
            ascii = interpreter(trans, seq.getSeqC());
            
            System.out.print("C: ");
            for(int i : ascii)
            {
                System.out.print(ascii[i]);
            }
            
            System.out.print("  String: ");
            rec.output(ascii);
        }
        else if(choice == 3)
        {
            ascii = interpreter(trans, seq.getSeqD());
            
            System.out.print("D: ");
            for(int i = 0; i < 24; i++)
            {
                System.out.print(ascii[i]);
            }
            
            System.out.print("          String: ");
            rec.output(ascii);
        }
        else
        {
            //do nothing
        }
    }
    
    public int[] interpreter(int[][]trans, int[]seq)
    {
        int[] ascii = new int[trans.length];
        for(int i = 0; i < 32; i++)
        {
            int sum = 0;
            for(int j = 0; j < 8; j++)
            {
                //System.out.print(transmition[i][j]);
                sum += trans[i][j] * seq[j];
            }
            if(sum/len == 1)
            {
                ascii[i] = 1;
            }
            else if(sum/len == -1)
            {
                ascii[i] = 0;
            }
            else
            {
                //do nothing
            }
                
        }
        
        return ascii;
    }
}
