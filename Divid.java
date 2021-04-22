import javax.swing.JOptionPane;
class Divid{
    public static void main(String arg[]){
    while(true){
        try{
            int iiniatial = 0;
            int k = 0;
            int x = Integer.parseInt(JOptionPane.showInputDialog("Entrer le nombre X "));
            for (int i = 1; i <= x; i++){
                if(i %  2 != 0){
                    iiniatial += i;
                }
    
            }
            for(int ii = 1; ii <= iiniatial; ii++){
                if( iiniatial % ii  == 0 ){
                    k++;
                }
            }
            if(k == 2){
                JOptionPane.showMessageDialog(null, iiniatial + " Est Premier");
            }else{
                JOptionPane.showMessageDialog(null, iiniatial + " N'est pas Premier");
            }
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Valeur X incorrect "+e.getMessage(), "Message d'erreur", JOptionPane.ERROR_MESSAGE);
        }

}


    }
}