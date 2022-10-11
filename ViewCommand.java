public class ViewCommand extends Command{

    public ViewCommand(Document doc) 
    {
        super(doc);
    }

    public String excute()
    {
        //returns the view method of the document.
        return this.document.view();
    }
    
}
