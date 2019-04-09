package cdma;


public class Multiplexer 
{
    DeMultiplexer demux = new DeMultiplexer();
    Signals seq = new Signals();
    
    public void start(int[] wordG, int[] wordB)
    {
        int[] tempTrans = new int[8];
        int[][] transmition = new int[wordG.length][8];
        
        int[] tempASeq = new int[8];
        int[] tempBSeq = new int[8];
        int[] tempCSeq = new int[8];
        int[] tempDSeq = new int[8];
        
        //int[] transG = generation(wordG);
        //int[] transB = generation(wordB);
        
        for(int i = 0; i < wordG.length; i++)
        {
            if(wordG[i] == 1)
            {
                tempASeq = seq.getSeqA();
                tempCSeq = seq.getSeqC();
            }
            else if(wordG[i] == 0)
            {
                tempASeq = seq.getInvSeqA();
                tempCSeq = seq.getInvSeqC();
            }
            
            if(wordB.length > i && wordB[i] == 1)
            {
                tempBSeq = seq.getSeqB();
                tempDSeq = seq.getSeqD();
            }
            else if(wordB.length > i && wordB[i] == 0)
            {
                tempBSeq = seq.getInvSeqB();
                tempDSeq = seq.getInvSeqD();
            }
            
            
            for(int j = 0; j < 8; j++)
            {
                transmition[i][j] = tempASeq[j] + tempBSeq[j] + tempCSeq[j] + tempDSeq[j];   
            }        
        }
        
        System.out.println("\n\nReceiver ASCII/String Output");
        demux.demux(transmition, 0);
        demux.demux(transmition, 1);
        demux.demux(transmition, 2);
        demux.demux(transmition, 3);
    }
}
