/*
NW2PNG by Alex (born2kill)
http://forums.graalonline.com/forums/showthread.php?t=134259601

Modifications by Chris Vimes and Dusty
 */
package born2kill.nw2png;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;


public class NW2PNGHelper implements Runnable {
    private Listener listener;
    
    // options
    private double scale = 1;
    private File sourceFile;
    private File outputFile;
    private String graalDir = "C:\\Program Files\\Graal\\";
    private boolean filterOutput = true;
    private boolean splitImages = false;
    private boolean renderNPCs = true;
    private boolean renderChars = true;
    
    // temporary data used for a single render
    private BufferedImage tileset = null;
    HashMap<String, String> fileMap = new HashMap();

    public NW2PNGHelper(Listener listener) {
        this.listener = listener;
    }

    public void setTileset(File tilesetFile) throws IOException {
        tileset = ImageIO.read(tilesetFile);
    }

    public void generate() {
        Thread runner = new Thread(this);
        runner.start();
    }

    public void run() {
        
    }
    
    // 
    

    // getters and setters
    public boolean shouldFilterOutput() {
        return filterOutput;
    }

    public void setFilterOutput(boolean filterOutput) {
        this.filterOutput = filterOutput;
    }

    public String getGraalDir() {
        return graalDir;
    }

    public void setGraalDir(String graalDir) {
        this.graalDir = graalDir;
    }

    public File getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(File outputFile) {
        this.outputFile = outputFile;
    }

    public boolean shouldRenderChars() {
        return renderChars;
    }

    public void setRenderChars(boolean renderChars) {
        this.renderChars = renderChars;
    }

    public boolean shouldRenderNPCs() {
        return renderNPCs;
    }

    public void setRenderNPCs(boolean renderNPCs) {
        this.renderNPCs = renderNPCs;
    }

    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

    public File getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public boolean shouldSplitImages() {
        return splitImages;
    }

    public void setSplitImages(boolean splitImages) {
        this.splitImages = splitImages;
    }

    public BufferedImage getTileset() {
        return tileset;
    }

    public void setTileset(BufferedImage tileset) {
        this.tileset = tileset;
    }
}
