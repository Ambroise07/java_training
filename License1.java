import javax.swing.JOptionPane;
class License1{
    public static void main(String args[]){
        while(true){
            try{
                int fact1 = 1;
                int fact2 = 1;
                int nombre1 = Integer.parseInt(JOptionPane.showInputDialog("Entrer le nombre 1"));
                int nombre2 = Integer.parseInt(JOptionPane.showInputDialog("Entrer le nombre 2"));
                if(nombre1 >= nombre2){
                    for(int i = 1; i <= nombre1; i++){
                        fact1 = fact1 * i;
                    }
                    for(int j = 1; j <= nombre2 ; j++){
                        fact2 = fact2 * j;
                    }
                    JOptionPane.showMessageDialog(null,"La soustraction des deux factoriel donnes : " + (fact1 - fact2));
                }else{
                    JOptionPane.showMessageDialog(null, "La somme des deux nombres est : " + (nombre1 + nombre2));
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Veuillez entrer des nombres entiers " + e.getMessage(), "Input error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}