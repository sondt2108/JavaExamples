package exampleString;

public class stringBuffer {
    public static void main(String[] args) {
        countTo_N_Improved();
     }
     private final static int MAX_LENGTH = 30;
     private static String buffer = "";
     
     
     private static void emit(String nextChunk) {
         System.out.println("buffer: " +buffer );
         System.out.println("buffer.lenght : " +buffer.length() );
         System.out.println("nextChunk.lenght : " +nextChunk.length() );
         System.out.println("buffer.length() + nextChunk.length(): "+buffer.length() + nextChunk.length());
        if(buffer.length() + nextChunk.length() > MAX_LENGTH) {
           System.out.println("113: "+buffer);
           buffer = "";  
        }
        buffer += nextChunk;
     }
     private static final int N = 100;
     private static void countTo_N_Improved() {
        for (int count = 2; count <= N; count = count +2) {
           emit(" " + count);
           //System.out.println(" " + count);
        }
     }
}
