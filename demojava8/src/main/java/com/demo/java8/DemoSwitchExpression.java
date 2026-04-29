package com.demo.java8;

public class DemoSwitchExpression {

  public static enum Color{
    red,blue,black
  }
  public static void main(String[] args) {
    Color color =Color.black;

    switch(color){
      case red:
        System.out.println("the coloris red");
        break;
        case blue:
        System.out.println("the coloris blue");
        break;
        case black:
        System.out.println("the coloris black");
        break;
        default:
        System.out.println("Default");
        break;
    }

    switch (color) {
      case red-> System.out.println("the coloris red");
      case blue-> System.out.println("the coloris blue");
      case black-> System.out.println("the coloris black");
    }

    //with retun version

        String result = switch (color) {
      case red -> {
        System.out.println("this is red");
        yield "red";
      }
         case blue -> {
        System.out.println("this is blue");
        yield "blue";
      }
        case black -> {
        System.out.println("this is black");
        yield "black";
      }
      
    };

    //Java 14
  }
}
