/* 
 - experiment:
    - removing (c) in class from class identifier 
        - compilation error: class, enum, interface expected 
    - remove void  
        - compilation error: return type required - invalid method declaration  
    - remove final ( } )
        - compilation error:  reached end of file while parsing - compiler in process of parsing while process ended abruptly
 */


public class HelloErrors{
    public static void main(String[] args){

        System.out.println("Hello");
        System.out.println("this is a test");
    }
}
