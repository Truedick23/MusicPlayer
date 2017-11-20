package Interface;
import javax.swing.*;
import java.awt.*;
import java.util.Date;
public class CurrentSongListPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ImageIcon songListPic = new ImageIcon("D:\\aa.jpg");
	private JTable songTable;
	private JScrollPane scrollPane;
	private String songListName = "songlist";
	private String builderNumber = "number";
	private long buildDate;
	CurrentSongListPanel(){
		BorderLayout border = new BorderLayout(2, 2);
		setLayout(border);
		JPanel BasicInfoPanel = new JPanel(new BorderLayout());
			BasicInfoPanel.add(new JLabel(songListPic), BorderLayout.WEST);
			BasicInfoPanel.add(new JLabel(songListName + "\n"
					+ "Number " + builderNumber + "student bulit on" + (new Date(buildDate).toString())), BorderLayout.CENTER);
			JPanel ButtonSet = new JPanel();
				ButtonSet.setLayout(new GridLayout(1, 2, 5, 5));
				ButtonSet.add(new JButton("Play All"));
				ButtonSet.add(new JButton("Download ALL"));
			BasicInfoPanel.add(ButtonSet, BorderLayout.CENTER);
			String[] titles = {"Name", "Singer", "Length", "Play", "Download"};
			String[][] data = {};
			songTable = new JTable(data, titles);
			scrollPane = new JScrollPane(songTable);
			add(scrollPane, BorderLayout.NORTH);
	}
	public void setBuildDate(long date) {
		buildDate = date;
	}
}
