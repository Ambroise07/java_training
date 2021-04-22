import javax.swing.JOptionPane;
class Magazin{
    public static void main(String arg[]){
        String quantit;
        int prix = 10;
        //JOptionPane.showMessageDialog(null,"Entrer la quantité");
        while(true){
            quantit = JOptionPane.showInputDialog("Entrer la quantité : ");
            int Quanti = Integer.parseInt(quantit);
            if(Quanti < 0){
                JOptionPane.showMessageDialog(null, "Vous ne pouvez pas acheter pour cette quantitée ");
            }else{
                if(Quanti > 0 && Quanti < 20){
                    JOptionPane.showMessageDialog(null, "Le prix à payer est : "+ (Quanti*prix) * 20 / 100 + " Fcfa");
                }else if (Quanti >= 20 && Quanti < 100){
                    JOptionPane.showMessageDialog(null, "Le prix à payer est : "+ (Quanti*prix) * 30 / 100 + " Fcfa");
                }else if (Quanti >= 100){
                    JOptionPane.showMessageDialog(null, "Le prix à payer est : "+ (Quanti*prix) * 50 / 100 + " Fcfa");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Le prix à payer est : "+ (Quanti*prix) + " Fcfa");
                }
            }

        }
    }
}