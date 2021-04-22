import java.util.Scanner; 
class chaine{
    public static void main(String args[]){
        System.out.println("Enter le caractère : ");
        Scanner name = new Scanner(System.in);
        char namee = name.next().charAt(0);
        int N = 0;
        String phrase = "adelaideadelaide";
        for(int i = 0; i < phrase.length(); i++)
        {
            if(phrase.charAt(i) == namee){
                N = N+1;
            }
        }
        System.out.println("Le nombre de fois est : "+N);
    }
}