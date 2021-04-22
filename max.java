import javax.swing.JOptionPane;
public class max{
    public static void main(String arg[]){
        while(true){
            String getvalue1 = JOptionPane.showInputDialog("Entrer le nombre 1 ");
            String getvalue2 = JOptionPane.showInputDialog("Entrer le nombre 2 ");
            String getvalue3 = JOptionPane.showInputDialog("Entrer le nombre 3 ");
            int getnombre1 = Integer.parseInt(getvalue1);
            int getnombre2 = Integer.parseInt(getvalue2);
            int getnombre3 = Integer.parseInt(getvalue3);
            if(getnombre1 > getnombre2 && getnombre1 >  getnombre3){
                JOptionPane.showMessageDialog(null , getnombre1 + " Est supperrieur ");
            }
            else if (getnombre2 > getnombre1 && getnombre2 >  getnombre3){
    
                JOptionPane.showMessageDialog(null , getnombre2 + " Est supperrieur ");
            }
            else if (getnombre3 > getnombre1 && getnombre3 >  getnombre2){
    
                JOptionPane.showMessageDialog(null , getnombre3 + " Est supperrieur ");
            }
            else {
    
                JOptionPane.showMessageDialog(null , " Est null ");
            }
        }
    }
}