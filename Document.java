import java.util.ArrayList;

public class Document {

    private String fileName;
    private ArrayList<String> lines;

    public Document(String fileName) {

        this.fileName = fileName;
        this.lines = FileManipulator.readFile(fileName);
    }

    public String view() {
        String file = "";

        //assigns entire file to one string and returns it
        for(int i = 0; i < lines.size(); i++)
        {
            file = lines.get(i) + "\n";
        }

        return file;
    }
    
    public String append(String line) 
    {
         //adds the string to the file
         lines.add(line + "\n");
         return "The line has been appended to the document.";
    }

    public String write(String line) 
    {
        //reintitalizes lines to nothing so that it can be overwritten
        this.lines = new ArrayList<String>();

        //adds the string to the file
        lines.add(line);
        return "The line was written to the file.";
    }

    public String save() 
    {
        //saves the file using the FileManipulator class
        if(FileManipulator.writeFile(this.fileName, this.lines) == true)
        {
            FileManipulator.writeFile(this.fileName, this.lines);
            return "The file has been saved.";
        }
        return "There was an error saving the file.";
    }
    
}
