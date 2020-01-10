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
public class PATHBUILDER {
    
public int rslt ( char[] slow_rotor, char[] medium_rotor, char[] fast_rotor, int input)
{
    char[] reflector_alphabet = "IXUHFEZDAOMTKQJWNSRLCYPBVG".toCharArray();
    char[] basic_alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray(); 
   
    int result = -1;  
    POSITION_LOCATOR locator = new POSITION_LOCATOR();
    
    char buffer = fast_rotor[input];
    result=locator.lc(buffer, basic_alphabet);

    buffer = medium_rotor[result];
    result=locator.lc(buffer, basic_alphabet);
    
    buffer = slow_rotor[result];
    result=locator.lc(buffer, basic_alphabet);
    
    buffer = reflector_alphabet[result];
    
    result=locator.lc(buffer, slow_rotor);
    buffer = basic_alphabet[result];
    
    result=locator.lc(buffer, medium_rotor);
    buffer = basic_alphabet[result];
    
        result=locator.lc(buffer, fast_rotor);
    buffer = basic_alphabet[result];
    
    return result;
    
}
    
    
    
}
