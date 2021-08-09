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
public class Stack {
    int maxstacksize;
    int stacktop;
    int numberofelement;
    char[] list;
    public Stack(int maxstacksize){
        this.maxstacksize=maxstacksize;
        stacktop=-1;
        numberofelement=0;
        list=new char [maxstacksize];
    
    }
    public boolean isfull(){
   return(stacktop==maxstacksize-1);
    }
    public boolean isempty(){
    return(stacktop==-1);
    }
    public void push(char bracket){
    if(!isfull()){
    stacktop++;
    list[stacktop]=bracket;
    numberofelement++;
    }
    else {
    System.out.println("stack is full");
    }
    }
    public char pop(){
        if(!isempty()){
    char temp =list[stacktop];
    stacktop--;
    numberofelement--;
    return temp;
    }
        else{
            return ' ';
        }
    }
    public void printstack(){
    for(int i=stacktop;i>=0;i--){
    System.out.println("list stack:"+list[i]);
    }
    }
    public boolean check(String bracket){
    Stack mystack=new Stack(5);
    for(int i=0;i<bracket.length();i++){
        if(bracket.charAt(i)=='('){
         mystack.push(bracket.charAt(i));
        }
        else{
             if(!mystack.isempty()){
            mystack.pop();
            }
            else{
//             System.out.println("no balance");
                return false;
            }

        }
        
    }
     if(mystack.isempty()){
        
//         System.out.println(" balance");
           return true; }
        else{
//         System.out.println("no balance");
          return false;
        }
            
    }
}
