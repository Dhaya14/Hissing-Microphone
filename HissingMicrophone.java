import java.util.*;

class HissingMicrophone {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    boolean check = true;
    String s=kbd.nextLine();
    for (int i = 0; i < s.length()-1 && check; i++){
       if( s.charAt(i)=='s' && s.charAt(i+1)=='s')
       {
         System.out.print("hiss");
         check = false;
       }
     } 
     if(check){
       System.out.print("no hiss");
     }
    
  }
}
