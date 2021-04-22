class func{
    static int somme(int a, int b){
        
        return a + b ;
    }
    public static void main(String args[]){
        int nombre1 = Integer.parseInt(System.console().readLine("Entrer le nombre1 "));
        int nombre2 = Integer.parseInt(System.console().readLine("Entrer le nombre2 "));
        System.out.println("Le resultat est : "+ somme(nombre1, nombre2));
    }
}