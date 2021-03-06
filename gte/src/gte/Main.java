package gte;

import gte.controller.Controller;
import gte.model.Model;
import gte.view.View;

import javax.swing.*;


/**
 * User: Alan P. Sexton
 * Date: 20-Jun-2013
 * Time: 14:21:36
 */


/**
 * A basic Java GUI application
 * <p />
 * This uses a <emph>pull</emph> version of Model-View-Controller: i.e. it does not use events and listeners to
 * communicate changes from the model to the view or controller.
 * <ol>
 *   <li>
 *       The model does not know anything about the view or the controller
 *   </li>
 *   <li>
 *       The view reads from but NEVER updates the model. Instead it calls methods on the controller to
 *       carry out such operations.
 *   </li>
 *   <li>
 *       The controller gets called by the view when a user interaction occurs, calls methods on the model to update
 *       as necessary and calls methods on the view to trigger the appropriate changes in the GUI.
 *   </li>
 *   <li>
 *       The utils package contains utility classes that can be used by any classes.
 *   </li>
 *   <li>
 *       The model, view and controller packages each have only ONE public class: the class of the corresponding
 *       (capitalized) name. All other classes in these packages have package scope (i.e. no Public modifier), and
 *       hence cannot be seen by any classes in other packages.
 *   </li>
 * </ol>
 */
public class Main extends JFrame
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Model model = new Model();
                Controller controller = new Controller(model);
                View view = new View(model, controller);

                view.setVisible(true);
            }
        });

    }

}
