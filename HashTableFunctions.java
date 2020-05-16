class HashTableFunctions
{
   int hashTableSize;
   String [] hashTableArray;
   int [] shift;
   
   public HashTableFunctions ( int size, String [] array, int [] shift)
   {
      hashTableSize = size;
      hashTableArray = array;
      this.shift = shift;
   }
   
   // constructor
   public HashTableFunctions ( int size, String [] array )
   {
      hashTableSize = size;
      hashTableArray = array;
      shift = new int[]{1,2,3,4,1,2,3,4,1,2,3,4,1};
   }

   // hash function
   public int hash ( String s )
   {
      int sum = 0;
      for (int i=0; i<s.length(); i++){
         sum = (shift[i]*sum) + s.charAt(i);
      }
      sum = sum % hashTableSize;
      // WRITE YOUR CODE HERE

      return sum;
   }   
   
   // return True if the hash table contains string s
   // return False if the hash table does not contain string s
   boolean find ( String s )
   {
      boolean found = false;
      for ( int i=0; i<hashTableSize; i++ ){
         if(s.equals(hashTableArray[i])){
            found = true;
            return found;
         }
      }
      // WRITE YOUR CODE HERE
      
      return found;
   }
}
