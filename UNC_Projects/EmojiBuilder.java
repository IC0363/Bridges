package UNC_Projects;

// Emoji Builder Scaffold Code

import bridges.games.NonBlockingGame;
import bridges.base.NamedColor;
import bridges.base.NamedSymbol;

public class EmojiBuilder extends NonBlockingGame {
    // Grid must be less than 1024 cells total. The largest square grid is 32 x 32

    // class (static) variables -- numRows, numCols
    private static int numRows = 10; // change the numRows dimension if you would like
    //YOUR LINE OF CODE HERE:
    private static int numCols = 10;

    // constructor
    public EmojiBuilder(int assid, String login, String apiKey, int numRows, int numCols) {
        super(assid, login, apiKey, numRows, numCols);
        // set game title
        setTitle("Hi");
        // Set a description which will show under the title
        setDescription("Smilie Face");
        // start method
        start();
    }

    //main method
    public static void main(String args[]) {
        // Create an EmojiBuilder object -- Don't forget to fill in your assignment number, username, and apiKey
        // (numRows and numCols values are passed in from the class variables above)
        EmojiBuilder emoji = new EmojiBuilder(2, "IanC", "498487792096", numRows, numCols);
    }

    // initialize
    public void initialize() {
        // Use nested loops to set the background color of your emoji
        // HINT: Remember that getBoardHeight() and getBoardWidth() exist for your use
        // YOUR CODE HERE:
        for(int i = 0; i <getBoardHeight();i++){
            for(int j = 0; j < getBoardWidth(); j++){
                setBGColor(i,j,NamedColor.blueviolet);
            }
        }

        // use setBGColor calls for your emoji
        // for example:
        setBGColor(3,3, NamedColor.green);
        setBGColor(3,5, NamedColor.green);
        


        //YOUR CODE HERE:
        setBGColor(7,5, NamedColor.black);
        setBGColor(7,4, NamedColor.black);
        setBGColor(7,3, NamedColor.black);
        setBGColor(6,2, NamedColor.red);
        setBGColor(6,6, NamedColor.blue);

        setBGColor(1,5, NamedColor.black);
        setBGColor(1,4, NamedColor.black);
        setBGColor(1,3, NamedColor.black);
        setBGColor(1,2, NamedColor.black);
        setBGColor(1,1, NamedColor.black);
        setBGColor(1,6, NamedColor.black);
        setBGColor(1,7, NamedColor.black);
        setBGColor(1,8, NamedColor.black);
        setBGColor(1,9, NamedColor.black);
        setBGColor(1,0, NamedColor.black);
        setBGColor(0,5, NamedColor.black);
        setBGColor(0,4, NamedColor.black);
        setBGColor(0,3, NamedColor.black);
        setBGColor(0,2, NamedColor.black);
        setBGColor(0,1, NamedColor.black);
        setBGColor(0,6, NamedColor.black);
        setBGColor(0,7, NamedColor.black);
        setBGColor(0,8, NamedColor.black);
        setBGColor(0,9, NamedColor.black);
        setBGColor(0,0, NamedColor.black);

        
        
    }

    // gameloop
    public void gameLoop() {
        // Since we are drawing only once (this is not a game yet),
        // we do not need any code inside the gameLoop() method.
    }
} // end clas
