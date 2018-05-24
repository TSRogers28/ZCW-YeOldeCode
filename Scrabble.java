import java.io.*;

class Scrabble
{
// A class to give you the scrabble score of a word

 public static void main(String[] args) throws IOException
 {
  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter a word: ");
  String word=in.readLine();
  System.out.println("Scrabble score is: "+score(word));
 }

 public static int score(String word)
 {
  String uword=word.toUpperCase();
  int score=0;
  for(int i=0;i<uword.length();i++)
     switch(uword.charAt(i))
       {
        case 'Q': case 'Z':
          score+=10; break;
        case 'J': case 'X':
          score+=8; break;
        case 'K':
          score+=5; break;
        case 'F': case 'H': case 'V': case 'W': case 'Y':
          score+=4; break;
        case 'B': case 'C': case 'M': case 'P':
          score+=3; break;
        case 'D': case 'G':
          score+=2;break;
        default:
          score+=1;break;
      } 
  return score;
 }

}