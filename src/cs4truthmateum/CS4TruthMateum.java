/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4truthmateum;

/**
 *
 * @author TRUTH
 */
public class CS4TruthMateum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name1="Trent";
        String lname1="Carter";
        int age1 = 13;
        
        String name2="Joe";
        String lname2="King";
        int age2 = 6;
                
        String name3="Susan";
        String lname3="Carter";
        int age3 = 11;
        
        int sumage = age1 + age2 + age3;
        boolean relation = lname1 == lname3;
        boolean ages = age2 > age3;
        
        
        System.out.println("Sum of ages: " + sumage);
        System.out.println("Are Trent and Susan related?: " + relation);
        System.out.println("Is Joe older than Susan?: " + ages);
        
    }
    
}