package layout.view.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

import layout.controller.Controller;
import layout.model.Model;
import layout.view.View;

public class ZoomResetAction extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private Model model;
	private View view;
	@SuppressWarnings("unused")
	private Controller controller;

	{
		putValue(NAME, "Zoom Reset");
		putValue(SMALL_ICON, new ImageIcon(getClass().getResource("/layout/icons/zoomreset.png")));
		putValue(SHORT_DESCRIPTION, "Fits the width of the image to the window");
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_0, ActionEvent.CTRL_MASK));

	}

	public ZoomResetAction(Model model, View view, Controller controller)
	    {
	        this.view = view;
	        this.model = model;
	        this.controller = controller;
	    }

	public void actionPerformed(ActionEvent e) {
		view.setScale(1);
	}
}
