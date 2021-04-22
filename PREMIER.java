class PREMIER{
    static int premier() {
        int k = 0;
            int Nombres = Integer.parseInt(System.console().readLine(("Entrer le nombre ")));
            if(Nombres < 0){
                System.out.println("Le nombre ne peut pas etre Négatif");
            }else{
                for(int i = 1; i <= Nombres; i++){
                    if( Nombres % i  == 0 ){
                        k++;
                    }
                }
                if(k == 2){
                
                    return factoriel(Nombres);
                }else {
                    return (factoriel(Nombres) - 1) ;
                }
            }
            return 0;
        }
        static int factoriel(int nombre){            
            int inombre = nombre - 1 ;
            int resulta = nombre;
            while(inombre >= 1){
              resulta = resulta * inombre;
              inombre--;
            }
           System.out.println("Le factoriel de " + nombre + " est " + resulta);
          return 0;
      }
    public static void main(String argv[]){
        premier();
    }
}