import javax.swing.JOptionPane;
class First{
    public static void main(String arg[]){
        while(true){
            int k = 0;
            String Nombre = JOptionPane.showInputDialog("Entrer le nombre ");
            int Nombres = Integer.parseInt(Nombre);
            if(Nombres < 0){
                JOptionPane.showMessageDialog(null, "Le nombre ne peut pas etre Négatif");
            }else{
                for(int i = 1; i <= Nombres; i++){
                    if( Nombres % i  == 0 ){
                        k++;
                    }
                }
                if(k == 2){
                    JOptionPane.showMessageDialog(null, Nombres + " Est Premier");
                }
            }
        }
    }
}