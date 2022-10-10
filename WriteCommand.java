import java.util.Scanner;

public class WriteCommand extends Command{

    private Scanner in = new Scanner(System.in);

    public WriteCommand(Document doc) 
    {
        super(doc);
        //prints message for what the user should do.
        this.excute();
    }

    public String excute(){
        /*
         * Asks user "what would you like to write to the file?" 
         * this is the reason for the scanner variable
         */


        System.out.println("Enter Text: ");

        
        // this.document.write(in.next());

         //writes entered data to the file.
        return this.document.write(in.next());
    }
    
}
