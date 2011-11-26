package org.graalcenter.nw2png;

import born2kill.nw2png.Listener;
import java.io.IOException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;


public class CommandLineNW2PNG implements Listener {
    public static void main(String[] args) throws IOException {
        // required arguments:
        //      tileset
        //      input file
        //      output file
        
        OptionParser parser = new OptionParser() {
            {
                accepts("t", "Path to the tileset file").withRequiredArg().ofType(String.class).describedAs("path to tileset");
                accepts("i", "Path to the input file (GMAP or NW)").withRequiredArg().ofType(String.class).describedAs("path to level");
                accepts("o", "Path to the generated PNG").withRequiredArg().ofType(String.class).describedAs("path to PNG");
            }
        };
        
        OptionSet options = parser.parse(args);
    }

    public void sendMessage(String message) {
        System.out.println(message);
    }

    public void doneGenerating() {
        System.out.println("Finished generating.");
    }
}
