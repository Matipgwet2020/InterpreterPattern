/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreterpattern;

/**
 *
 * @author Mgms
 */
public class main {
    // Rule: Marcel and Simeon are male
    public static Expression getMaleExpression() {
        Expression marcel = new TerminalExpression("Marcel");
        Expression simeon = new TerminalExpression("Siméon");
        
        return new OrExpression(marcel,simeon);
    }
    
    // Rule : Vanessa is a married women
    public static Expression getMarriedWomanExpression() {
        Expression vanessa = new TerminalExpression("Vanessa");
        Expression married = new TerminalExpression("Married");
        
        return new AndExpression(vanessa,married);
    }
    public static void main(String [] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();
        
        System.out.println(" Marcel is male?" + isMale.interpret("Marcel"));
        System.out.println("Vanessa is a married women?" + isMarriedWoman.interpret("Married Vanessa"));
        
        
        
    }
    
}
