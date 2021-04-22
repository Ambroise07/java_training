import javax.swing.JOptionPane;
public class exo{
    public static void main(String[] arg){
        int nombre;
        //String nn = System.console().readLine();
            while(true){
                String nn = JOptionPane.showInputDialog("Entrer la valeur");
                nombre = Integer.parseInt(nn);
                if(nombre % 2 == 0){
                    JOptionPane.showMessageDialog(null, "C'est un nombre paix  " + nombre);
                }
                else{

                    JOptionPane.showMessageDialog(null, "C'est pas un nombre paix");
                }
            }
       
       
        
    }
}