package net.hedtech.banner.general.common.Guainit.services;

import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
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
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;

import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;

import net.hedtech.banner.general.common.Guainit.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.general.common.Guainit.model.*;

public class CaptureTimings extends AbstractSupportCodeObject {
	

	public CaptureTimings(ISupportCodeContainer container) {
		super(container);
		if ( upper(isNull(this.getFormModel().getParam("TIMING", NString.class), "NO")).equals("YES") )
		{
			gvParmSet = toBool(NBool.True);
		}
	}

	public GuainitTask  getTask() {
		return (GuainitTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Guainit.model.GuainitModel getFormModel() {
		return getTask().getModel();
	}
	
	//Original PL/SQL code for Package Prog Unit (SPEC) CAPTURE_TIMINGS
	/*
	PACKAGE CAPTURE_TIMINGS IS
  PROCEDURE SET_TIME  (p_global_name VARCHAR2);
  PROCEDURE SAVE_INFO (p_string      VARCHAR2);
END;
	*/
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) CAPTURE_TIMINGS
		/*
		PACKAGE BODY CAPTURE_TIMINGS IS
--
  gv_parm_set BOOLEAN := FALSE;
--
  PROCEDURE SET_TIME (p_global_name VARCHAR2) IS
  BEGIN
    IF gv_parm_set THEN
      COPY(TO_CHAR(gokdbms.utility_get_time),p_global_name);
    ELSE
      COPY('',p_global_name);
    END IF;
  END SET_TIME;
--
--
  PROCEDURE SAVE_INFO (p_string VARCHAR2) IS
  BEGIN
    IF gv_parm_set THEN
      genutil.create_addl_record(:GLOBAL.CURRENT_USER,p_string);
    END IF;
  END SAVE_INFO;
--
--
BEGIN
  IF UPPER(NVL(:PARAMETER.TIMING,'NO')) = 'YES' THEN
  	gv_parm_set := TRUE;
  END IF;
END;
		*/
				// 
		private NBool gvParmSet = toBool(NBool.False);
		
		
		public void setTime(NString pGlobalName)
		{
			if ( gvParmSet.getValue() )
			{
				copy(toChar(Gokdbms.FutilityGetTime()),pGlobalName);
			}
			else {
				copy("",pGlobalName);
			}
		}
		
		
		public void saveInfo(NString pString)
		{
			if ( gvParmSet.getValue() )
			{
				Genutil.createAddlRecord(getGlobal("CURRENT_USER"), pString);
			}
		}
		
	
}
