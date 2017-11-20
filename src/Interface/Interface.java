package Interface;
import javax.swing.*;
import java.awt.*;
public class Interface extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Interface() {
	this.setLayout(new BorderLayout());
	add(new SongListsPanel(), BorderLayout.WEST);
	add(new CurrentSongListPanel(), BorderLayout.NORTH);
	add(new ButtonControl(), BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		Interface player = new Interface();
		player.setTitle("Music Player");
		player.setSize(500, 600);
		player.setLocationRelativeTo(null);
		player.setDefaultCloseOperation(EXIT_ON_CLOSE);
		player.setVisible(true);
	}
}
