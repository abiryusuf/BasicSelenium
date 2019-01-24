package basic_java;

public class RemoveVowel {

    public static void main(String[] args) {
       removeVowel01();
       removeVowel02();
    }
    public static void removeVowel01(){
        String string = "Bangladesh";
        String lowerCase = string.toLowerCase();
        String removeVowel = lowerCase.replaceAll("[aeiou]","");
        System.out.println("Removel vowel one is " + removeVowel);
    }
    public static void removeVowel02(){
        String string = "Bangladesh is my favourite country";
        String removeVowel = string.replaceAll("[aAeEiIoOuU]","");
        System.out.println("Removel vowel two is "+ removeVowel);


        int vowels = 0, consonants = 0, digits = 0, spaces = 0;

        string = string.toLowerCase();
        for (int i =0; i< string.length(); i++)

        {
            char ch = string.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u')
            {
                vowels++;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                consonants++;
            }
            else if( ch >= '0' && ch <= '9')
            {
                digits++;
            }
            else if (ch ==' ')
            {
                spaces++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("White spaces: " + spaces);
    }
    }

