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
public class POSITION_LOCATOR {
    
            public int lc (char input, char[] alphabet)
            {
             int storage=0;
             for(int i=0;i<alphabet.length;i++)
                {
                    if(alphabet[i] == input)
                    {
                    storage = i;
                    }
                }
             
             
             return storage;
                
            }
    
    
}
