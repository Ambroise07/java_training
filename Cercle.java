class Cercle{
    static double  perimetre(double r){
        return ((2*3.14) * r);
    }
    static double aire(double r){
        return 3.14*r*r;
    }
    double piquer(double p){
        return perimetre(p);
    }
    public static void main(String argv[]){
        double nombre = Double.parseDouble(System.console().readLine("Entrer le rayon : "));
        System.out.println("Le perimetre du cercle est : "+( perimetre(nombre)));
        System.out.println("L'Aire  du cercle est : "+( aire(nombre)));
        System.out.println("le nombre de pote  est : "+( (perimetre(nombre))/2));
    }
}