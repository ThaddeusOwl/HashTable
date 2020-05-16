import java.util.*;
import java.nio.file.*;

public class FindPerfectHash{
   
   public static void main(String [] args){
   int [] shift = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; 
    
      for(int a=0; a<10; a++){
         shift[0]=a;
         for(int b=0; b<10; b++){
            shift[1]=b;
            for(int c=0; c<10; c++){
               shift[2]=c;
               for(int d=0; d<10; d++){
                  shift[3]=d;
                  for(int e=0; e<10; e++){
                     shift[4]=e;
                     for(int f=0; f<10; f++){
                        shift[5]=f;
                        for(int g=0; g<10; g++){
                           shift[6]=g;
                           for(int h=0; h<10; h++){
                              shift[7]=h;
                              for(int i=0; i<10; i++){
                                 shift[8]=i;
                                 for(int j=0; j<10; j++){
                                    shift[9]=j;
                                    for(int k=0; k<10; k++){
                                       shift[10]=k;
                                       for(int l=0; l<10; l++){
                                          shift[11]=l;
                                          for(int m=0; m<10; m++){
                                             shift[12]=m;
                                             
      HashTable H = new HashTable (shift);
      
      int hit1=0, miss1=0, hit2=0, miss2=0;
      List<String> lines = null;
      List<String> linesmiss = null;
   
      try {
         lines = Files.readAllLines (Paths.get ("names36.txt"));
         linesmiss = Files.readAllLines (Paths.get ("namesmiss.txt"));
      } catch (Exception E) {
         System.out.println (E.toString ());
      }   
      
      for ( int I=0; I<lines.size (); I++ )
      {
         H.insert (lines.get (I));
      }         
      
      for ( int J=0; J<lines.size (); J++ )
      {
         if (H.find (lines.get(J)))
            hit1++;
         else
            miss1++;
      }

      for ( int K=0; K<linesmiss.size (); K++ )
      {
         if (H.find (linesmiss.get(K)))
            hit2++;
         else
            miss2++;
      }
      if(H.getCollisions()==0){
         for(int L=0; L<shift.length; L++){
            System.out.println(L);
         }
      }
                                             
                                                
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     
                     }
                  }
               }
            }
         }
      }   


}
}