package LambdaExpressionExample2;

@FunctionalInterface  //It is optional  
interface Drawable{  
    public void draw();  
}  
  
public class LambdaExpressionExample2 {  
    public static void main(String[] args) {  
        int width=10;  
          
        //with lambda  
     //object=   (argument-list) -> { body } ;

      
        Drawable d3=()->{   System.out.println("Drawing "+width);  
        };  
        d3.draw();  
    }  
}  
