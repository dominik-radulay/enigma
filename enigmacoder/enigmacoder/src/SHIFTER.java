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
public class SHIFTER {
         
            public boolean sh (char[] input, int shift, char[] alphabet)
            {
             for(int i=0;i<alphabet.length;i++)
                {
                    if(i+shift > 25)
                    {
                    input[i]=alphabet[(i+shift)-(alphabet.length)];
                    }

                    else
                    {
                    input[i]=alphabet[i+shift];
                    } 
                }
             return true;
                
            }
}
