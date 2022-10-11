import java.util.Scanner;

public class AppendCommand extends Command{

    //THIS STUFF IS MANAGED BY INPUT HANDLER CLASS

    private Scanner in = new Scanner(System.in);

    public AppendCommand(Document doc) 
    {
        super(doc);
    }
    
     /*
     * Asks user "what would you like to append to the file?" 
     * this is the reason for the scanner variable
     */
    public String excute()
    {
        System.out.println("Enter Text: ");
        //appends entered data to the end of the file.
        return this.document.append(in.next());
    }

}
