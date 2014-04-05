import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.text.Normalizer;

/**
 * Write a description of class File here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileRead
{
    private Scanner sc;

    /**
     * Constructor for objects of class File
     */
    public FileRead(String path)
    {
        try{
            sc= new Scanner( new FileReader(path) );
        }
        catch( FileNotFoundException e ){
            System.out.println("Error 404: File not Found");
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void printNextWord()
    {
        if( sc.hasNext() )
            
            System.out.println(
                Normalizer.normalize(sc.next(), Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
            );
        else
            System.err.println( "# No more word #" );
    }
}
