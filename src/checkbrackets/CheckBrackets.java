/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkbrackets;

/**
 *
 * @author somia saber
 */
public class CheckBrackets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Stack s=new Stack(5);
     System.out.println( s.check("()()((()))"));
    }
    
}
