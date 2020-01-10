/*
 * Copyright (C) 2020 Dominik Radulay
 *
 * This program was created for demonstrative purposes you can redistribute it
 *  and/or modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */

/**
 *
 * @author domin
 */
public class main_class {
    
    public static void main(String[] args) {
        
        new Gui().setVisible(true);
    
         }
    public String process (String inputtext)
                {
        
                Gui Gui = new Gui();
                
        char[] input =inputtext.toCharArray();
        String output ="";

        /*alphabetical input of words*/
        char fast_input = Gui.fast_choice.getSelectedItem().charAt(0);
        char medium_input = Gui.medium_choice.getSelectedItem().charAt(0);
        char slow_input = Gui.slow_choice.getSelectedItem().charAt(0);
                
        char[] slow_rotor = new char[26];
        char[] medium_rotor = new char[26];
        char[] fast_rotor = new char[26];
        
        /*defined alphabets of rotors*/
        char[] basic_alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] fast_alphabet = "EKMFLGDQVZNTOWYHXUSPAIBRCJ".toCharArray();
        char[] medium_alphabet = "AJDKSIRUXBLHWTMCQGZNPYFVOE".toCharArray(); 
        char[] slow_alphabet = "BDFHJLCPRTXVZNYEIWGAKMUSQO".toCharArray(); 
        
        
        
    
        /*TAKE INPUT OF ROTOR SETTING  AND ROTATE ROTORS BY THEM*/
        POSITION_LOCATOR locator = new POSITION_LOCATOR();
        SHIFTER shift = new SHIFTER();
          
        int slow_shift = locator.lc(slow_input, basic_alphabet);
        int medium_shift = locator.lc(medium_input, basic_alphabet);
        int fast_shift = locator.lc(fast_input, basic_alphabet);
        shift.sh(slow_rotor,slow_shift, slow_alphabet);
        shift.sh(medium_rotor,medium_shift, medium_alphabet);
        shift.sh(fast_rotor,fast_shift, fast_alphabet);
        
        
        
        
        /*ENCODING MESSAGE*/
        for(int i=0;i<input.length;i++)
        {  
            
        /*SHIFTING OF ROTORS*/    
        fast_shift=fast_shift+1;
        shift.sh(fast_rotor,fast_shift, fast_alphabet);
        
        /*IF FAST ROTOR IS AT THE END, ROTATE MEDIUM ROTOR BY ONE POSITION*/
        if (fast_shift>=fast_alphabet.length)
        {
            fast_shift=0;
            medium_shift=medium_shift+1;
            shift.sh(medium_rotor,medium_shift, medium_alphabet);
 
        }
        
        /*IF MEDIUM ROTOR IS AT THE END, ROTATE SLOW ROTOR BY ONE POSITION*/
        if (medium_shift>=medium_alphabet.length)
        {
          medium_shift=0;
          slow_shift=slow_shift+1;
          shift.sh(slow_rotor,slow_shift, slow_alphabet); 
        }
        
        
        /*encoding message by rottor settings and writing it into output variable*/
        PATHBUILDER path = new PATHBUILDER();
        output=output+basic_alphabet[path.rslt(slow_rotor, medium_rotor, fast_rotor, locator.lc(input[i], basic_alphabet))];

        }

        return output;
        
    }
    
}
