import java.util.Scanner;

public class AppendCommand extends Command{

    //THIS STUFF IS MANAGED BY INPUT HANDLER CLASS

    private Scanner in = new Scanner(System.in);

    public AppendCommand(Document doc) 
    {
        super(doc);
        //prints message for what the user should do.
        this.excute();
       // doc.append(in.next());
        
    }
    
    public String excute()
    {
        System.out.println("Enter Text: ");

        //appends entered data to the file.
        return this.document.append(in.next());
    }

}


/*
     * public void AppendCommandCommand(Document doc) 
    {
        System.out.println("Enter Text: ");
        doc.append(in.nextLine());
        
    }
    
    public String excute()
    {
        /*
         * Asks user "what would you like to append to the file?" 
         * this is the reason for the scanner variable
         */

        // System.out.println("Enter Text: ");
        // doc.append(in.nextLine());

        //return in.nextLine();
      //  return "";
  //  }
