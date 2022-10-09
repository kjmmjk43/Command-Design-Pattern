import java.util.ArrayList;

public class Document {

    private String fileName;
    private ArrayList<String> lines = new ArrayList();

    public void Document(String fileName) {

    }

    public String view() {
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
    }
    
}
