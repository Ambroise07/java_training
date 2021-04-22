class pal{
    public static void main(String args[]){
        String mot = System.console().readLine("Enter le mot ");
        String palin = "";
        for(int i = mot.length()-1; i >= 0; i--){
             palin = palin + mot.charAt(i);
             System.out.println(palin);
        }
        if(mot.equals(palin)){
            System.out.println("C'est un palindrome");
        }else{
            System.out.println("C'est pas un palindrome");
        }
    }
    

}