class Cyber{
    public static void main(String args[]){
        int minute = 60;
        int heure = 1;
        System.out.println("CHOISISSEZ LE TYPE DE DURRER ");
        System.out.println("1 --> Minute \n2 --> Heure \n3 --> Heure et Minute");
        int question = Integer.parseInt(System.console().readLine("--> "));
        if(question == 1){
            int dure = Integer.parseInt(System.console().readLine("Entrer le nombre de Minute "));
            System.out.println("Vous allez payer : "+((dure * 300)/minute));

        }else if(question == 2){
            int dure = Integer.parseInt(System.console().readLine("Entrer le nombre d'heure  "));
            System.out.println("Vous allez payer : "+((dure * 300)/heure));
        }else if(question == 3){
            System.out.println("Enter le nombre d'Heure et de Minute ");
            int dure1 = Integer.parseInt(System.console().readLine(" Heure -->  "));
            int dure2 = Integer.parseInt(System.console().readLine(" Minute --> "));
            int somme = ((dure1 * 60) / heure) + dure2; 
            System.out.println("Vous allez payer : "+((somme * 300)/minute));

        } 

        
    
    }
}