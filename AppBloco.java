import javax.swing.JOptionPane;

public class AppBloco 
{
   public static void main(String [] args)
   {
       BlocoDeNotas notas = new BlocoDeNotas ();
      
      String menu = "1-adicionar notas\n2-Remover Nota\n0-Sair\n";
      int opcao;
      
      do{
         opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            if(opcao == 1){
                String nnota = JOptionPane.showInputDialog(" Que Nota Deseja Inserir? ");
            Nota nota = new Nota (nnota);
            notas.addString(nota);
            
            }
            else if (opcao == 0){
               JOptionPane.showMessageDialog(null, "tchau");
               }
            else if (opcao == 2){
            String nnota = JOptionPane.showInputDialog(" Qual Nota Deseja Remover? ");
            if (notas.removeString(nnota)){
             JOptionPane.showMessageDialog(null, "Nota Removida");
               }else{
               JOptionPane.showMessageDialog(null, "Nota Não Encontrada");
               }
         }
               
     }while(opcao != 0);
   }
}
   
   
   
   
   
   
   
   
   
   
   
   
  
             
