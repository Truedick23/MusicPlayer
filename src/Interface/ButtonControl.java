package Interface;
import javax.swing.*;
import java.awt.*;

public class ButtonControl extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton previousButton;
	private JButton followingButton;
	private JButton PlayAndPauseButton;
	private JComboBox<String> PlayModeCombo;
	GridLayout layout = new GridLayout(1, 5);
	public void setButtons() {
		previousButton = new JButton("Previous");
		followingButton = new JButton("Following");
		PlayAndPauseButton = new JButton("Play/Pause");
		PlayModeCombo = new JComboBox<String>(new String[]{"Ramdomly", "Orderly", "Single"});
	}
	ButtonControl() {
		setButtons();
		setLayout(layout);
		add(new JLabel("Play Manipulation"));
		add(previousButton);
		add(followingButton);
		add(PlayAndPauseButton);
		add(PlayModeCombo);
	}
}
