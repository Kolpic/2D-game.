package  main;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
    // Настройки на екрана
    final int originalTileSize = 16; // 16x16 tile
    final int scale = 3; // 16x3

    final int tileSize = originalTileSize * scale; // 48x48 tile
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    final int screenHeight = tileSize * maxScreenRow; // 576 pixels

    public GamePanel () {
        this.setPreferredSize(new Dimension(screenWidth, screenHight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);


    }


}
