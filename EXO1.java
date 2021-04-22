class EXO1{
    static int factoriel(int nombre){            
        int inombre = nombre - 1 ;
        int resulta = nombre;
        while(inombre >= 1){
          resulta = resulta * inombre;
          inombre--;
        }
       
      return resulta;
  }
    static int premier(int x) {
        int k = 0;
            
            if(x < 0){
                System.out.println("Le nombre ne peut pas etre Négatif");
            }else{
                for(int i = 1; i <= x; i++){
                    if( x % i  == 0 ){
                        k++;
                    }
                }
                if(k == 2){
                
                    return 1;
                }
            }
            return 0;
        }

    static int multiple(int y){
        if(y < 0){
            System.out.println("Le nombre ne peut pas etre Négatif");
        }else{
            for(int i = 1; i <= y; i++){
                if(i % 4 == 0 ){
                    return 1;
                }
            }
        }
        return 0;
    }
    
    public static void main(String argv[]){
        try {
            int nombre1 = Integer.parseInt(System.console().readLine("Enter le Premier nombre : "));
            int nombre2 = Integer.parseInt(System.console().readLine("Enter le deuxième nombre : "));
            if(premier(nombre1) == 1 && multiple(nombre2) == 1){
                System.out.println("La sommes Factoriel des nombres est : " + factoriel((nombre1+nombre2)));
            }else{
                System.out.println("Respecter les consignes ! ");
            }
        }catch(NumberFormatException e ){
            System.out.println("Entrer des entiers ! " + e.getMessage());
        }
    }
}