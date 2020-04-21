import java.util.ArrayList;


public class BlocoDeNotas
{
   private ArrayList<Nota> notas;
   
   //Construtor 
   public BlocoDeNotas ()
   {
      notas = new ArrayList<Nota>();
   }
      
      //adicionar 
      public void addString(Nota nota)
      {
         notas.add(nota);
      }
      
      public boolean removeString (String nnota)
      {
         int posicao = buscar(nnota);
            if(posicao >= 0)
            {
               notas.remove(posicao);
               return true;
            } else {
            return false;
            }
            
       }
       
   private int buscar (String nota)
   {
      for(int i = 0; i < notas.size(); i++)
      {
      Nota not = notas.get(i);
         
      String nnota = not.getNnota();
      if(nota.equals(nnota)){
         return i;
         }
      }
      return -1;
   }
}
