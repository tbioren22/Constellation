package trb;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFrame;
import java.awt.Color;

public class App 
{
    public static void main( String[] args ) {
        JFrame frame;
        final int FRAME_WIDTH = 1024;
        final int FRAME_HEIGHT = 1024;

        /*
        The goal of this part of the program is to:
        1. Create a Constellation object
        2. Read the Constellation.json file
        3. Populate the Constellation object line by line with the data from the file
        */
        Constellation constellation = new Constellation();
        File constellationFile = new File("src/main/resources/Constellation.json");
        try {
            FileInputStream fis = new FileInputStream(constellationFile);
            JsonFactory jf = new JsonFactory();
            JsonParser jp = jf.createParser(fis);
            jp.setCodec(new ObjectMapper()); // IDK what this does so ask Yoder
            jp.nextToken();
            while(jp.hasCurrentToken()) {
                Star star = jp.readValueAs(Star.class);
                constellation.addStar(star);
                jp.nextToken();
            }
        } 
        catch (Exception e) {
            System.out.println("StreamReadException: " + e.getMessage());
        }

        // Create the frame
        frame = new JFrame("Constellation");
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(constellation);
    }
}
