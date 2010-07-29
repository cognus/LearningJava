class GameLauncher{
    public static void main(String[] args){
	GuessGame p = new GuessGame();
        p.startGame();
        
    }
}


class GuessGame{
    //Instances
    Player p1;
    Player p2;
    Player p3;
    
    //Methods
    public void startGame(){
	p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Estoy calculando un numero entre 0 y 9...");
        
        while(true){
            System.out.println("Numero a adivinar es " + targetNumber);
           
            p1.guess();
            p2.guess();
            p3.guess();
            
            guessp1 = p1.number;
            System.out.println("Jugador 1 escogio el valor: " + guessp1);
            
            guessp2 = p2.number;
            System.out.println("Jugador 2 escogio el valor: " + guessp2);
            
            guessp3 = p3.number;
            System.out.println("Jugador 3 escogio el valor: " + guessp3);
            
            if(guessp1 == targetNumber){
                p1isRight = true;
            }
            if(guessp2 == targetNumber){
                p2isRight = true;
            }
            if(guessp3 == targetNumber){
                p3isRight = true;
            }
            
            if(p1isRight || p2isRight || p3isRight ){
                System.out.println("Tenemos un ganador");
                System.out.println("Jugador 1 es ganador? " + p1isRight);
                System.out.println("Jugador 2 es ganador? " + p2isRight);
                System.out.println("Jugador 3 es ganador? " + p3isRight);
                
                System.out.println("El juego ha terminado");
                break;
                
            }
            else{
                System.out.println("Los jugadores tienen que intentarlo otra vez! ");
            }
            
        }
    }
}


class Player{
    //Instances
    int number = 0;
    
    //Methods
    public void guess(){
	number = (int) (Math.random() * 10);
        System.out.println("El numero que selecciono es: " + number);
    }
    
}
