public class String1 {
  private char[] chs;
  //private String str;
  public int length(){
    return this.chs.length;
  }

  public char charAt(int index){
    return this.chs[index];
  }
  public String1 (String value){
    this.chs =new char[value.length()];
    int idx = 0;
    for(int i = 0 ; i<value.length();i++){
      //*  value.charAt(i)
      this.chs [idx++]=value.charAt(i);
      //idx++;

    }
  }

  public int indexof(char target){
    int idx =-1;
    for (int i = 0; i< this.chs.length;i++){
      if(this.chs[i]==target){
        idx =-1;
        break;

      }

    }
    return idx;
  }
  public String afterreplace(char from , char to){
    String afterreplace = "";
    for (int i =0; i<this.chs.length;i++){
      if(chs[i] !=from){
          afterreplace+=chs[i];

      }else{
        afterreplace+=0;
      }

    }
    return afterreplace;
  }

  public String replace(char from, char to){
   for(int i =0 ; i<this.chs.length;i++){
    if(this.chs[i]== from){
      this.chs[i]=to;

    }

   }
   return String.valueOf(this.chs);
  }
  

  
  public static void main(String[] args) {
    String1 str = new String1("hello"); 
    System.out.println(str.length());
    System.out.println(str.charAt(0));
    // replace('l','x')
    //indexof('l')



    System.out.println(str.replace('l','x'));
    System.out.println(str.indexof('o'));
    //String s ="hello";
    System.out.println(str.afterreplace('l', 'x'));
    //System.err.println(s.replace('h', 'e'));

    
  }

  
}
