 import java.util.HashMap;

public class InputHandler {

    private HashMap<String, Command> commands = new HashMap<String, Command>();
    
        /**
         * Populates Hashmap by using the passed in parameter document.
         * @param document represents the file being manipulated.
         */
        public InputHandler(Document document)
        {
            //converts document to all 4 command types and populates hash map
            ViewCommand view = new ViewCommand(document); 
            commands.put("view", view);

            SaveCommand save = new SaveCommand(document);
            commands.put("save", save);

            AppendCommand append = new AppendCommand(document);
            commands.put("append", append);

            WriteCommand write = new WriteCommand(document);
            commands.put("write", write);
            
        }

        /**
         * correlates the user's typed in command with the correct command child class
         * and then executes the command child class
         * @param string stands for the user's inputted command.
         */
        public void inputEntered(String string) 
        {
            //assigns values to hashmap
            if(string.equalsIgnoreCase("view") || string.equalsIgnoreCase("save") 
            || string.equalsIgnoreCase("append") || string.equalsIgnoreCase("write"))
            {
                //creates a command object and passes in the inputted string
                //Command placeHolderCommand = commands.get(string);
                //executes the command based off the parsed key
                //placeHolderCommand.execute();

                //same thing
                //executes the relating command object that was found within the hashmap
                //why does it not execute the right child class of command based off the hash map????
                commands.get(string).execute();
            }
            
        }

}