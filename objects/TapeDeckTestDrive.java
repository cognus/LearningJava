class TapeDeck{
    
    boolean canRecord = false;
    
    public void playTape(){
        System.out.println("Tape playing");
    }
    
    public void recordTape(){
        System.out.println("Tape Recording");
    }
    
}

class TapeDeckTestDrive{
    public static void main(String[] args){
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();
        
        if(t.canRecord == true){
            t.recordTape();
        }
    }
}