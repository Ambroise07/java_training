class EXO2{
    public static void main(String argv[]){
        String mot1 = System.console().readLine("Entrer le mot correct ");
        String mot2 = System.console().readLine("Entrer le mot inverse ");
        String R = "";
        if(mot1.length() == mot2.length()){
            
            for(int i = mot1.length()-1; i >= 0; i--){
                 R = R + mot1.charAt(i);
            }
            if(R.equals(mot2)){
                System.out.println(mot1 + " est inverse de " + mot2);
            }else{
                System.out.println("Les mots entrés ne sont pas inverses");
            }

        }else{
            System.exit(1);
        }
    }

    }
