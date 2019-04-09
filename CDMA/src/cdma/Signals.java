package cdma;

public class Signals {
    //used to send 1
    private int[] SeqA = new int[]{-1,-1,-1,1,1,-1,1,1};
    private int[] SeqB = new int[]{-1,-1,1,-1,1,1,1,-1};
    private int[] SeqC = new int[]{-1,1,-1,1,1,1,-1,-1};
    private int[] SeqD = new int[]{-1,1,-1,-1,-1,-1,1,-1};
    
    //used to send 0
    private int[] InvSeqA = new int[]{1,1,1,-1,-1,1,-1,-1};
    private int[] InvSeqB = new int[]{1,1,-1,1,-1,-1,-1,1};
    private int[] InvSeqC = new int[]{1,-1,1,-1,-1,-1,1,1};
    private int[] InvSeqD = new int[]{1,-1,1,1,1,1,-1,1};
    
    public Signals()
    {
        
    }
    
    public int[] getSeqA()
    {
        return SeqA;            
    }
    
    public int[] getSeqB()
    {
        return SeqB;            
    }
    
    public int[] getSeqC()
    {
        return SeqC;            
    }
    
    public int[] getSeqD()
    {
        return SeqD;            
    }
    
    public int[] getInvSeqA()
    {
        return InvSeqA;            
    }
    
    public int[] getInvSeqB()
    {
        return InvSeqB;            
    }
    
    public int[] getInvSeqC()
    {
        return InvSeqC;            
    }
    
    public int[] getInvSeqD()
    {
        return InvSeqD;            
    }
    
}
