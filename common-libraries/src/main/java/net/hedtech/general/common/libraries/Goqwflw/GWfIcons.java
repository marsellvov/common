package net.hedtech.general.common.libraries.Goqwflw;

import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;


import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;

public class GWfIcons extends AbstractSupportCodeObject {
	

	public GWfIcons(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqwflwServices getContainer() {
		return (GoqwflwServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_WF_ICONS
	/*
	PACKAGE G$_WF_ICONS IS
  
<multilinecomment>--------------------------------------------------------------*\
  The package G$_WF_ICONS provides the interfaces needed
  to control the behavior of the workflow specific icons.
\*--------------------------------------------------------------</multilinecomment>

--*
--* Declare public subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_ENABLE_ICONS enables all of the workflow
  specific icons.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_ENABLE_ICONS;
 
<multilinecomment>--------------------------------------------------------------*\
  The procedure WF_DISABLE_ICONS disables all of the workflow
  specific icons.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE WF_DISABLE_ICONS;
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_WF_ICONS
		/*
		PACKAGE BODY G$_WF_ICONS IS
  PROCEDURE WF_ENABLE_ICONS IS
  BEGIN
 		G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0238','LIB','G$_WF_ICONS.WF_ENABLE_ICONS called'));  		
 	  SET_MENU_ITEM_PROPERTY('ICONS.WF_SUBMIT'     ,ENABLED ,PROPERTY_TRUE);
 		SET_MENU_ITEM_PROPERTY('ICONS.WF_RELEASE'    ,ENABLED ,PROPERTY_TRUE);
 		SET_MENU_ITEM_PROPERTY('WORKFLOW.WF_SUBMIT'  ,ENABLED ,PROPERTY_TRUE);
 		SET_MENU_ITEM_PROPERTY('WORKFLOW.WF_RELEASE' ,ENABLED ,PROPERTY_TRUE);	
  END;
  
  PROCEDURE WF_DISABLE_ICONS IS
  BEGIN
 	  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0239','LIB','G$_WF_ICONS.WF_DISABLE_ICONS called' ));
 	  SET_MENU_ITEM_PROPERTY('ICONS.WF_SUBMIT'     ,ENABLED ,PROPERTY_FALSE);
 		SET_MENU_ITEM_PROPERTY('ICONS.WF_RELEASE'    ,ENABLED ,PROPERTY_FALSE);
 		SET_MENU_ITEM_PROPERTY('WORKFLOW.WF_SUBMIT'  ,ENABLED ,PROPERTY_FALSE);
 		SET_MENU_ITEM_PROPERTY('WORKFLOW.WF_RELEASE' ,ENABLED ,PROPERTY_FALSE);	
	END;
END;
		*/
		/* <p>
/* </p>
		*/
		public void wfEnableIcons()
		{
			
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0238"), toStr("LIB"), toStr("G$_WF_ICONS.WF_ENABLE_ICONS called")));
			setMenuItemEnabled("ICONS.WF_SUBMIT", true);
			setMenuItemEnabled("ICONS.WF_RELEASE", true);
			setMenuItemEnabled("WORKFLOW.WF_SUBMIT", true);
			setMenuItemEnabled("WORKFLOW.WF_RELEASE", true);	
			
			NString activity = getContainer().getGWfBa().getActivityName(getContainer().getGWfBa().getWorkId());
			getContainer().getGWfDriver().setWorkspaceMode(true, activity);
		}
/* <p>
/* </p>
		*/
		public void wfDisableIcons()
		{
			getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0239"), toStr("LIB"), toStr("G$_WF_ICONS.WF_DISABLE_ICONS called")));
			setMenuItemEnabled("ICONS.WF_SUBMIT", false);
			setMenuItemEnabled("ICONS.WF_RELEASE", false);
			setMenuItemEnabled("WORKFLOW.WF_SUBMIT", false);
			setMenuItemEnabled("WORKFLOW.WF_RELEASE", false);
			
			getContainer().getGWfDriver().setWorkspaceMode(false, null);

		}
		
	
	
}
