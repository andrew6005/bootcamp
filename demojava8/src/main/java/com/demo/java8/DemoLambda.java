package com.demo.java8;

import java.math.BigDecimal;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

//* severless
//* AWS Lambda(upload jar)-> run java application
public class DemoLambda {
  public static void main(String[] args) {
    //* function(y = f(x))
//*Function interface is local variable */
    Function<String ,Integer> stringLeFunction= s -> s.length();
    System.out.println(stringLeFunction.apply("hello"));
    System.out.println(stringLeFunction.apply("java"));

    //*Bifunction 2 in 1 out
    BiFunction<String , String, Integer>stringLeFunction2=(s1,s2)->s1.length()+s2.length();
    System.out.println(stringLeFunction2.apply("python", "java"));


  /*  TriFunction<Integer ,Integer ,Integer>sumIntegerFormula = (i1,i2,i3) -> i1+i2+i3;
    System.out.println(sumIntegerFormula.apply(10,20,30));*/

    int age =67;
    Predicate<Integer> isElderlyFunction = a -> a > 65;
    System.out.println(isElderlyFunction.test(age));
    System.out.println(isElderlyFunction.test(64));

    
    BiPredicate<String, String>equalsFunction = (s1,s2) ->s1!=null&& s1.equals(s2);
    System.out.println(equalsFunction.test("hello","hello"));
     System.out.println(equalsFunction.test("java","python"));
      System.out.println(equalsFunction.test(null,"hello"));

    Supplier<Integer> randomMarksixFunction = () -> new Random().nextInt(49)+1;
    System.out.println(randomMarksixFunction.get());

    UnaryOperator<String>upperString=s->s.toUpperCase();
    System.out.println(upperString.apply("hello"));

    BinaryOperator<String> concatString = (s1,s2) ->{
      if(s1==null)
        return null;
     return s1.concat(s2);
    };

    System.out.println(concatString.apply("hello","apple"));

    MathOperation< Integer,Integer, Integer> sumopartion = (i1,i2) -> i1+i2;
    System.out.println(sumopartion.compute(7, 9));
    MathOperation<Double,Double,Double> sumDoubleopartion = (d1,d2) -> 
    BigDecimal.valueOf(d1).add(BigDecimal.valueOf(d2)
    .doubleValue());
     System.out.println(sumDoubleopartion.compute(0.1, 0.2));

     //consumer
     Consumer<String> PrintString =s -> System.out.println();



  }


  public static Integer getLength(String s){
    return s.length();
  }
}
