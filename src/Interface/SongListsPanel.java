package Interface;

import javax.swing.*;
import java.awt.*;

public class SongListsPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] ls = {"1", "2", "3"};
	private String[] others = {"4", "5", "6"};
	SongListsPanel() {
		this.setLayout(new GridLayout(2, 1, 4, 4));
		JList<String> mySongLists = new JList<String>(ls);
		JList<String> othersSongLists = new JList<String>(others);
		JScrollPane MyPane = new JScrollPane(mySongLists);
		JScrollPane OthersPane = new JScrollPane(othersSongLists, 4, 4);
		add(MyPane);
		add(OthersPane);
	}
}