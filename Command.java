public class Command {

    protected Document document;

    public Command(Document document) 
    {
        this.document = document;
    }

    /**
     * should make this one execute call and then calls the correct child execute method accordingly
     * @return returns the output of the executed method as a string
     */
    public String execute()
    {
        return "";

        //i give up very confused:D
    }

}
