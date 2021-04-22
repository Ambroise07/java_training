import javax.swing.JOptionPane;
class Multiple3{
    public static void main(String arg[]){
        while(true){
            String Nombre = JOptionPane.showInputDialog("Entrer le nombre ");
            int Nombres = Integer.parseInt(Nombre);
            if(Nombres < 0){
                JOptionPane.showMessageDialog(null, "Le nombre ne peut pas etre Négatif");
            }else{
                for(int i = 1; i < Nombres; i++){
                    if(i % 3 == 0 ){
                        JOptionPane.showMessageDialog(null, i + " Est un mutliple de 3");
                    }
                }
            }
        }
    }
}