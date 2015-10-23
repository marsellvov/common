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
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;

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

public class GGoqolibUserTrigger extends AbstractSupportCodeObject {
	

	public GGoqolibUserTrigger(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_GOQOLIB_USER_TRIGGER
	/*
	PACKAGE G$_GOQOLIB_USER_TRIGGER IS
  PROCEDURE WHEN_NEW_REC_INST;
  PROCEDURE CHECK_KEYS;
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_GOQOLIB_USER_TRIGGER
		/*
		PACKAGE BODY G$_GOQOLIB_USER_TRIGGER IS
--
  PROCEDURE WHEN_NEW_REC_INST IS
  BEGIN
    IF NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW' THEN
      IF NAME_IN('SYSTEM.CURSOR_RECORD') <> '1' THEN
        PREVIOUS_RECORD;
        MESSAGE(G$_NLS.Get('GOQRPLS-0049','LIB','At last record.'),NO_ACKNOWLEDGE);
      END IF;
    END IF;
  END;
--
  PROCEDURE CHECK_KEYS IS
    item_id ITEM := FIND_ITEM('CHECK_KEYS');
  BEGIN
    IF NOT ID_NULL(item_id) THEN
      COPY('Y','CHECK_KEYS');
    END IF;
  END;
--    
END;
		*/
		/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void whenNewRecInst()
		{
			// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
			if ( getRecordStatus().equals("NEW") )
			{
				if ( getCursorRecord().notEquals("1") )
				{
					previousRecord();
					infoMessage(GNls.Fget(toStr("GOQRPLS-0049"), toStr("LIB"), toStr("At last record.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
				}
			}
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void checkKeys()
		{
			ItemDescriptor itemId = findItem(toStr("CHECK_KEYS"));
			if ( !(itemId == null) )
			{
				copy("Y","CHECK_KEYS");
			}
		}
		
	
	
}
