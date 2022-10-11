public class SaveCommand extends Command{

    public SaveCommand(Document doc) 
    {
       super(doc);
    }

    public String excute()
    {
        //returns if document was saved correctly or not
        return this.document.save();
    }
    
}
