package net.hedtech.general.common.libraries.Goqrpls;

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

public class GErrors extends AbstractSupportCodeObject {
	

	public GErrors(ISupportCodeContainer container) {
		super(container);
		populatePublicVariables();
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_ERRORS
	/*
	PACKAGE G$_ERRORS IS
--
-- Public constants
--
  CHECK_POLICY_VIOLATION    NUMBER;
  CHECK_POLICY_MESSAGE      VARCHAR2(60);
--
  PROCEDURE POPULATE_VARIABLES;
END;
	*/
	
			// 
		//  Public constants
		// 
		public NNumber checkPolicyViolation= NNumber.getNull();
		public NString checkPolicyMessage= NString.getNull();

			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_ERRORS
		/*
		PACKAGE BODY G$_ERRORS IS
--
-- Null procedure which allows for the main logic at the bottom to populate the public
-- constants.
--
  PROCEDURE POPULATE_VARIABLES IS
  BEGIN
  	RETURN;
  END;
--
-- Private procedure
--
  PROCEDURE POPULATE_PUBLIC_VARIABLES IS
  BEGIN
  	IF CHECK_POLICY_VIOLATION IS NULL THEN
      CHECK_POLICY_VIOLATION := gb_common.f_vbs_error_number;
      CHECK_POLICY_MESSAGE   := gb_common.f_vbs_error_msg;
    END IF;
  END;  
--
-- Main logic only executed once.
--
BEGIN
  POPULATE_PUBLIC_VARIABLES;
END;
		*/
		/* <p>
		* 
		*  Null procedure which allows for the main logic at the bottom to populate the public
		*  constants.
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populateVariables()
		{
			return ;
		}
/* <p>
		* 
		*  Private procedure
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePublicVariables()
		{
			if ( checkPolicyViolation.isNull() )
			{
				checkPolicyViolation = GbCommon.fVbsErrorNumber();
				checkPolicyMessage = GbCommon.fVbsErrorMsg();
			}
		}
		
		
	
	
}
