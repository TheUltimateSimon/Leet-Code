class romanToInt {
    public int romanToInt(String s) {
        int number = 0;
        for(int x = 0; x < s.length(); x++) {
            if(s.charAt(x) == 'I')
            {
                if((x+1) >= s.length())
                    number += 1;
                else {
                    if(s.charAt(x+1) == 'V')
                    {
                        number += 4;
                        x++;
                    }
                    else if (s.charAt(x+1) == 'X')
                    {
                        number += 9;
                        x++;
                    }
                    else 
                        number += 1;
                }
            }
            else if(s.charAt(x) == 'V')
                number += 5;
            else if(s.charAt(x) == 'X')
            {
                if((x+1) >= s.length())
                    number += 10;
                else {
                    if(s.charAt(x+1) == 'L')
                    {
                        number += 40;
                        x++;
                    }
                    else if (s.charAt(x+1) == 'C')
                    {
                        number += 90;
                        x++;
                    }
                    else 
                        number += 10;
                }
            }
            else if(s.charAt(x) == 'L')
                number += 50;
            else if(s.charAt(x) == 'C')
            {
                if((x+1) >= s.length())
                    number += 100;
                else {
                    if(s.charAt(x+1) == 'D')
                    {
                        number += 400;
                        x++;
                    }
                    else if (s.charAt(x+1) == 'M')
                    {
                        number += 900;
                        x++;
                    }
                    else 
                        number += 100;
                }
            }
            else if(s.charAt(x) == 'D')
                number += 500;
            else if(s.charAt(x) == 'M')
                number += 1000;            
        }
        return number;
    }
}
