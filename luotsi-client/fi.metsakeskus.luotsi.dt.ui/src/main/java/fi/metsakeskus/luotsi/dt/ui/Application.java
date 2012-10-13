package fi.metsakeskus.luotsi.dt.ui;


import net.refractions.udig.internal.ui.UDIGApplication;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.ui.application.WorkbenchAdvisor;

/**
 * 
 * @author suisalui
 *
 */
public class Application  extends UDIGApplication implements IApplication {
	
    protected WorkbenchAdvisor createWorkbenchAdvisor() {
        return new ApplicationWorkbenchAdvisor() {
            public String getInitialWindowPerspectiveId() {
                return Perspective.DEFAULT_ID;
            }
        };
    }

}
