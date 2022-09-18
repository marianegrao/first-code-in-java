Fist Code in Java
===

## Resume

Starting studies in Java. 
Code contains a function that prints a greeting on the screen for the user according to the day of the week and the time at which it is instantiated.


Tools learned and used
---
- You must use a semicolon at the end of each line
- For use some method that Java provides is necessary make import of this method
```java
import java.time.LocalDate; 
```
- The function that will be interpreted is ==main==, so if you make a new function it is necessary to instantiate it inside the ==main== function.
```java=2
package packageName;
public class packageName {
    public static void main(String[] args){
        printHelloWorld();  
    } 
    
    public static void printHelloWorld(){
      System.out.println("Hello world");  
    }  
}
```
> Remember: all functions must be in a class that takes the name of the package created at project startup 


- The type of the variable must be typed at the time of its creation
```java
String name = "Maria";
int age = 19;
boolean isDeveloper = true;
// Array type can only receive data of a specific type
int numbers[] = {12, 54, 89};
// once the array size is declared, is immutable
int[] numbers = new int[5];
```

---


