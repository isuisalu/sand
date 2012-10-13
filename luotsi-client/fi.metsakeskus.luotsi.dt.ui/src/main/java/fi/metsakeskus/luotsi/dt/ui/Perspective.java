package fi.metsakeskus.luotsi.dt.ui;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
/**
 * 
 * @author suisalui
 *
 */
public class Perspective implements IPerspectiveFactory {

	public static final String DEFAULT_ID = "fi.metsakeskus.luotsi.dt.ui.perspective";
	
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.setFixed(true);
		
	}

}
