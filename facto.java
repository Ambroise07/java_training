import javax.swing.JOptionPane;
class facto {
  public static void main(String args[]) {
    String nomb = JOptionPane.showInputDialog("Entrer le nombre");
    try {
      int nombre = Integer.parseInt(nomb);
      int inombre = nombre - 1 ;
      int resulta = nombre;
      while(inombre >= 1){
        resulta = resulta * inombre;
        inombre--;
      }
      JOptionPane.showMessageDialog(null, "Le factoriel de " + nombre + " est " + resulta);
    }catch(NumberFormatException e){
      JOptionPane.showMessageDialog(null, "Votre nombre n'est pas valide ", e.getMessage(), JOptionPane.ERROR_MESSAGE);
      
    };

  }
}
