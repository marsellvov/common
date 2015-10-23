package net.hedtech.banner.document.management.Eoqgpls;

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


public class EImgDriver2 extends AbstractSupportCodeObject {
	

	public EImgDriver2(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public EoqgplsServices getContainer() {
		return (EoqgplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) E$_IMG_DRIVER2
	/*
	PACKAGE E$_IMG_DRIVER2 IS
   PROCEDURE p_call_xs(action_in INTEGER DEFAULT 0, param INTEGER DEFAULT 0);      
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) E$_IMG_DRIVER2
		/*
		PACKAGE BODY E$_IMG_DRIVER2 IS

   PROCEDURE p_call_xs(action_in INTEGER DEFAULT 0, param INTEGER DEFAULT 0) IS
   BEGIN
   	  NULL;
   END;
   
END E$_IMG_DRIVER2;
		*/
		/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void pCallXs() {
			pCallXs(toInt(0), toInt(0));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param actionIn
		*/
		public void pCallXs(NInteger actionIn) {
			pCallXs(actionIn, toInt(0));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param actionIn
		* @param param
		*/
		public void pCallXs(NInteger actionIn, NInteger param)
		{

		}
		
	
	
}
