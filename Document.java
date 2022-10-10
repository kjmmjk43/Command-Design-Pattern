import java.util.ArrayList;

public class Document {

    private String fileName;
<<<<<<< HEAD
    private ArrayList<String> lines = new ArrayList();
=======
    private ArrayList<String> lines;
>>>>>>> db5a6da826c6cc042343bf9f38b0205c44c55207

    public Document(String fileName) {

        this.fileName = fileName;
        this.lines = FileManipulator.readFile(fileName);
    }

    public String view() {
<<<<<<< HEAD
        return "-----\n\n----- ";//for every item in append add a | 
    }
    
    public String append(String line) {
        return "The line has been appended by the document. ";

    }

    public String write(String line) {
        return "The line was written to the files.";
    }

    public String save() {
        return "The file has been saved. ";
=======
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
>>>>>>> db5a6da826c6cc042343bf9f38b0205c44c55207
    }
    
}
