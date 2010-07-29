class BuildArray{
    int[] numeros;
    int i, j;
    
    public void putThatValues(){
        i = 1;
        while(i <= j){
            numeros = new int[i];
            System.out.println("Estos son los valores de mi arreglo:" + "\t" + i);
            i++;
        }
        System.out.println("Este es el size del arreglo creado: " + numeros.length);
    }
}

class integersArray{
    public static void main(String[] args){
        BuildArray n = new BuildArray();
        n.j = 32;
        n.putThatValues();
        
    }
}