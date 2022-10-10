public class ViewCommand extends Command{

    public ViewCommand(Document doc) 
    {
        super(doc);
        this.execute();
    }

    public String excute()
    {
        //returns the view method of the document.
        return this.document.view();
    }
    
}
