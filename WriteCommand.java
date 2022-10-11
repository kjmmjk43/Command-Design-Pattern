import java.util.Scanner;

public class WriteCommand extends Command{

    private Scanner in = new Scanner(System.in);

    public WriteCommand(Document doc) 
    {
        super(doc);
    }

    /*
     * Asks user "what would you like to write to the file?" 
     * this is the reason for the scanner variable
     */
    public String excute(){
        System.out.println("Enter Text: ");
         //writes entered data to the file.
        return this.document.write(in.next());
    }
    
}
