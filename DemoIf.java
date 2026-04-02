public class DemoIf {
  public static void main(String[] args) {
    int age=13;
    //>,<,>=,<=

    if(age <=18){
      System.out.println("hello");
    }


    if(age >= 18) {
      System.out.println("adult");
      }else{
      System.out.println("child");

    }

    age = 70;
    if(age>65){
      System.out.println("Fee=2");

    }

    boolean isElderly = age >65;
    if(isElderly){
      System.out.println("Fee=2");

    }
    if (isElderly == true){
      System.out.println("Fee=2");

    }

    //&& ||
    int a = 20;
    if(a> 5 && a <= 20){
      System.out.println("a is between 5 and 20");

    }

    if(a> 5 || a <= 20){
      System.out.println("a is either >=5 or <= 20");

    }

    int b=18;
    if(a>20 || b >12){
      System.out.println("hello");
    }else{
      System.out.println("goodbye");
    }
    if(a > 20 || b > 6 && b < 20){
      System.out.println("correct");
    }

    if(b > 6 && b < 20 || a > 20 ){
      System.out.println("correct2");
    }
    int age2 = 9;
    boolean ischild = age2 < 10;
    if (ischild == true){
      System.out.println("this is children" );
    }

    // double,char,string(comparsion)
    //String -> methods



    //
    int x = 9;
    int y = 5;
    int temp = x; //x backup
    x=y;
    y = temp;
    System.out.println(x);
    System.out.println(y);

//fin max between two numbers
    int k = 10;
    int j = 5;
    int max = k;
    if(j > k){
    max = j;

    }else {
    max = k;
    }
    System.out.println(max);
//find min between 3 numbers

int q = 10;
int u = 2 ;
int t = 8;
int min ;



if(q < u ){
  if(q < t){
    min = q;

  }else {
    min = t;
  }
 
}else {
  if (u < t){
min = u;
  }else {
    min = t;
  }
  
}
System.out.println("min ="+min);

//double, char, staring (comparsion)
int score = 76;
char grade ='F';
// >=90 GradeA
// >=80 and <90 Grade B
// >=70 and <80 Grade c
//Grade A or Grade B-> print Excellent
//Grade C -> Print pass

if(score>=90){
  grade ='A';
  }else if(score >= 80){
    grade = 'B';
  }else if (score >= 70){
    grade = 'C';
  }
  if(grade=='A'|| grade=='B'){
    System.out.println("Excellent");

  }else if (grade == 'C'){
    System.out.println("pass");
  }
  String s1 = "java";
  //check if s1 start with j or length > 5 -> print hello 
  //otherwise -Print bye bye

  if (s1.charAt(0)== 'j' || s1.length()>5){
    System.out.println("hello");

  }else{
    System.out.println("bye bye");
  }
  //switch
  //and or
  //range checking
  char gender = 'M';
  switch (gender) {
    case 'M':
      System.out.println("he is male");
      break;
    case 'F':
      System.out.println("she is femal");
      break;
      default:
      System.out.println("Inlid gender");

      break;
  
  
  }
    int year = 2025;
    boolean isLeapYear =  false;

    if(year % 4 == 0 ){
      if(year % 100==0){
        
        if(year % 400==0){
          isLeapYear = true;
          System.out.println("this is leap year");
        }else{
          isLeapYear = false;
          System.out.println("this is not leap year");
          
        }

        }else{
          isLeapYear= true;
          System.out.println("this is leap year");
           

        }

      }else{
        isLeapYear=false;
        System.out.println("this is not leap year");
        

    }
    if(year %400 ==0 || year %4==0&& year%100!=0){
      System.out.println("this is  leap year");
    }else{
      System.out.println("this is not leap year");
    }



    

      
      

    }
    
  




}



