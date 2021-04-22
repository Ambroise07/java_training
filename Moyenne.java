import javax.swing.JOptionPane;
class Moyenne{
   public static void main(String arg[]){
       String Math = JOptionPane.showInputDialog("Entrer la note de Mathématique ");
       String Anglai = JOptionPane.showInputDialog("Entrer la note d'Anglais ");
       String Biologi = JOptionPane.showInputDialog("Entrer la note de Biologie");
       String Physiqu = JOptionPane.showInputDialog("Entrer la note de Physique ");
       String Franch = JOptionPane.showInputDialog("Entrer la note de Français ");

       Double Maths = Double.parseDouble(Math);
       Double Anglais = Double.parseDouble(Anglai);
       Double Biologie = Double.parseDouble(Biologi);
       Double Physique = Double.parseDouble(Physiqu);
       Double Frenchs = Double.parseDouble(Franch);
       if(Maths < 0 || Anglais < 0 || Biologie < 0 || Physique < 0 || Frenchs < 0){
           JOptionPane.showMessageDialog(null, "Vos notes ne sont pas corrects");
       }
       else{
           Double  Moyenne = (((Maths * 4) + (Anglais * 2) + (Biologie * 5) + (Physique * 4) + (Frenchs *2))/17);
           if (Moyenne > 0 && Moyenne > 10){
            JOptionPane.showMessageDialog(null, "Votre Moyenne est :"+Moyenne+" Avec : Mention Insuffisant");
           }else if (Moyenne >= 10 && Moyenne < 14){
            JOptionPane.showMessageDialog(null, "Votre Moyenne est :"+Moyenne+" Avec : Mention Assez Bien");
           }else if (Moyenne > 14){
            JOptionPane.showMessageDialog(null, "Votre Moyenne est :"+Moyenne+" Avec : Mention Très Bien");
           }
       }
   }
}