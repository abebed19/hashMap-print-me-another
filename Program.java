
import java.util.HashMap;

public class Program {
    
    
    public static void printValues(HashMap<String,Book> hashMap){
        
        hashMap.values().forEach(System.out::println);
    }
    
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        
      
        hashmap.values().forEach(book->{
          if(book.getName().contains(text))
          {
              System.out.println(book);
              
          }
        });
        
    }

    public static void main(String[] args) {
        
         HashMap<String, Book> hashmap = new HashMap<>();
         hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
         hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

         printValues(hashmap);
         System.out.println("---");
         printValueIfNameContains(hashmap, "prejud");
    }

}
