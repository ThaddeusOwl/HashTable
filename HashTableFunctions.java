class HashTableFunctions
{
   int hashTableSize;
   String [] hashTableArray;
   
   // constructor
   public HashTableFunctions ( int size, String [] array )
   {
      hashTableSize = size;
      hashTableArray = array;
   }

   // hash function
   public int hash ( String s )
   {
      int sum = 0;
      for (int i=0; i<s.length(); i++){
         sum = (4*sum) + s.charAt(i);
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
