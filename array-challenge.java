import java.util.*; 
import java.io.*;

class Main {

  public static String ArrayChallenge(String[] strArr) {
    // code goes here
      String palavra1 = strArr[0];
      String dicio = strArr[1];
      String[] palasepar = palavra1.split("");
      String[] diciosepar = dicio.split(",");
      List<String> list1 = Arrays.asList(diciosepar);
      String paljun = "";
      String paljun2 = "";
      
      
      for(int x = 4; x<palasepar.length;x++){
          if(!list1.contains(paljun2)){
            paljun2 = paljun2 + palasepar[x];
            if(x==palsepar.leng){
              return "not possible";
            }
            return "not possible";
          }else{
            paljun2 = paljun2 + palasepar[x];
            if(x==palasepar.length){
              return paljun2;
            }
            }
      };

      for(int i = 0; i<palasepar.length;i++){
          if(!list1.contains(paljun)){
            paljun = paljun + palasepar[i];
            if(i==palasepar.length){
              return "not possible"
              }
          }else{
            paljun = paljun + palasepar[i];
            if(i>2 && i < 4){
              return  new StringBuilder("kpaqrfi23c:" + paljun + "," + paljun2).reverse().toString();
            }
            }
      };

      
      return paljun;
      };
      
  
 public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ArrayChallenge(s.nextLine())); 
  }

}
