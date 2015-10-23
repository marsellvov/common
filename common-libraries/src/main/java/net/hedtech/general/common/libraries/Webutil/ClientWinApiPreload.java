package net.hedtech.general.common.libraries.Webutil;

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


public class ClientWinApiPreload extends AbstractSupportCodeObject {
	

	public ClientWinApiPreload(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) CLIENT_WIN_API_PRELOAD
	/*
	PACKAGE CLIENT_WIN_API_PRELOAD IS
  PROCEDURE SET_LOAD_LOC (Location IN VARCHAR2);
  FUNCTION GET_LOAD_LOC RETURN VARCHAR2;
END CLIENT_WIN_API_PRELOAD;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) CLIENT_WIN_API_PRELOAD
		/*
		PACKAGE BODY CLIENT_WIN_API_PRELOAD IS


  PROCEDURE SET_LOAD_LOC (Location IN VARCHAR2) is
  BEGIN 
    -- No-Op on the Web
    null;
  END SET_LOAD_LOC;
  
  FUNCTION GET_LOAD_LOC RETURN VARCHAR2 IS
  BEGIN 
    -- location is nowClient Side JVM /bin directory
    RETURN null;
  END GET_LOAD_LOC;

END CLIENT_WIN_API_PRELOAD;
		*/
		/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param location
		*/
		public void setLoadLoc(NString location)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  No-Op on the Web
//
			this.getLogger().trace(this, "F2J : setLoadLoc procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getLoadLoc()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  location is nowClient Side JVM /bin directory
//			return NString.getNull();
//
			this.getLogger().trace(this, "F2J : getLoadLoc function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
		
	
	
}
