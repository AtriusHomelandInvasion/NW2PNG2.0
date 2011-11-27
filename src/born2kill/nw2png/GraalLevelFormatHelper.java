package born2kill.nw2png;

public class GraalLevelFormatHelper {
    public static int getTileNumber(String tileString) {
        String base64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        return base64.indexOf(tileString.substring(0, 1)) * 64 + base64.indexOf(tileString.substring(1, 2));
    }

    public static int[] getTileXY(int tileNumber) {
        int[] tile_xy = {(tileNumber % 16 + tileNumber / 512 * 16) * 16, (tileNumber / 16 % 32) * 16};
        return tile_xy;
    }
}