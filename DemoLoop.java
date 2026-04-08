public class DemoLoop {
  public static void main(String[] args) {
    //for loop
    //intialization int i =0
    //continue criteria -> <3
    //each iteration end

    for(int i = 0; i < 3; i++ ){
      System.out.println("bye");

    }

    //step 1 :int i  = 0
    //step 2 : check if i < 3
    //step 3 : print
    //step 4 : i++
    //step 5 :int i  = 0
    //step 6 : check if i < 3
    //step 7 : print
    //step 8 : i++
    //step 9 :int i  = 0
    //step 10 : i++
    //step 11 : check if i < 3
    //step 12: exit


    for(int i = 0 ; i < 10; i++){
      
      if( i % 2 ==0){
        System.out.println(i);

      }
    }

    for (int i = 0; i < 100; i++){
      if (i > 50 && i % 3 == 0  ){
        System.out.println(i);

      }

    }

    //hello
    //find if character 'l'
String a="hello";
boolean islexist = false ;
    for(int i =0; i< a.length();i++){
      
     System.out.println(a.charAt(i));
     if(a.charAt(i) == 'l'){
      islexist = true;
      break;

     }
    }
    System.out.println("the tagter is exist");

    String d1 = "947852106";//find the lagest even digi
    String d1max="";
    int max = Integer.MIN_VALUE;
    for(int i = 0;i<d1.length();i++){
      //if(d1.charAt(i)==){
        System.out.println(i);

      }
    //int digi =d1.charAt(i)-'0';
   


      


    
    

/*String d1 = "947852106";//find the lagest even digi
    int max = Integer.MIN_VALUE;
    for(int i = 0;i<d1.length();i++){
    int digi =d1.charAt(i)-'0';
    if (digi % 2==0 && digi > max){
      max=digi;
    }
}
    System.out.println(max); */

       //725094849 
    String d8="725094849";
    //String output2="";
    //int max2 = Integer.MAX_VALUE;
    //String max2 = "" ;
    
    int max2 = Integer.MAX_VALUE;
    for(int i = 0;i< d8.length();i++){
      for(int j =0;j<d8.indexOf(d8);j++){
        if(max2==Integer.MAX_VALUE){

        }
      }
    }
      
      //max2= d8.charAt(i);
      
      //System.out.println(max2);
      //System.out.print(d8);

    
    




    String s3= "8A3ahs0nd3";
    String output ="" ;
    for(int i = 0;i< s3.length();i++){
      boolean isalphabt= s3.charAt(i) >= 97 && s3.charAt(i) <=122;
      if(isalphabt){
        output+= s3.charAt(i);


      }
    }
}

}

      
    
   // System.out.println(output);







  

