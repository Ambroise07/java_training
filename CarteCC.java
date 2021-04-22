import javax.swing.JOptionPane;
class CarteCC{
    public static void main(String args[]){
        int debit = 10000;
        double SommePrix = 0;
        try{
            int nombreCommand = Integer.parseInt(JOptionPane.showInputDialog("Entrer le nombre d'achat"));
            for(int i = 0 ; i < nombreCommand; i++){
                double prixC = Double.parseDouble(JOptionPane.showInputDialog("Entrer le prix de l'article "+(i+1)));
                SommePrix += prixC;
            }
            if(SommePrix > debit){
                JOptionPane.showMessageDialog(null, "Votre debit est insuffisant vous devez completez : " + (SommePrix - debit));
            }else if(SommePrix < debit){
                JOptionPane.showMessageDialog(null,  SommePrix + " Sera debiter de votre carte " + "\n" + "Votre solde actuel est : " + (debit - SommePrix));
                
            }
        }catch(NumberFormatException E){
            JOptionPane.showMessageDialog(null, "Veuillez entrer des nombres entiers " + E.getMessage(), "Input error", JOptionPane.ERROR_MESSAGE);
        }
    }
}