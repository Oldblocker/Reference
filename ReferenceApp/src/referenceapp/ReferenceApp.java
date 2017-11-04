/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referenceapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Luke
 */
public class ReferenceApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        List<String> lst = new ArrayList<>();
        
        lst.add("Jacek");
        lst.add("Adam");
        lst.add("Stasiek");
        lst.add("Pasiek");
        lst.add("Lelek");
        
        Collections.sort(lst, String::compareToIgnoreCase);
        
        for(String t: lst)
        {
            System.out.println(t);
        }
    }
    
}
