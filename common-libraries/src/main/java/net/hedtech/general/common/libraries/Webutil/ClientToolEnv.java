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


public class ClientToolEnv extends AbstractSupportCodeObject {
	

	public ClientToolEnv(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) CLIENT_TOOL_ENV
	/*
	PACKAGE CLIENT_TOOL_ENV IS
<multilinecomment>********************************************************************************\
 * CLIENT_TOOL_ENV
 *   This package duplicates the action of the TOOL_ENV package, except that it 
 *   operates on the client (browser) tier rather than the Applcation server tier.  
 *   Existing TOOL_ENV code  can be re-directed to run on the client simply by 
 *   prefixing all the calls with "CLIENT_" 
 *********************************************************************************
 * Version 1.0.1
 *********************************************************************************
 * Change History
 *   1.0.0 DRMILLS 03/JAN/2003 - Creation
 *   1.0.1 DRMILLS 27/FEB/2003 - Added Windows Client Implementation   
 *
\********************************************************************************</multilinecomment>

<multilinecomment>-------------------------------------------------------------------------*\
 * GetVar -> Get environment variable
 * Arguments: 
 *  VARNAME     -> Variable name to be expanded
 *  VARVALUE    -> Expanded value of the variable. It will have null if the
 *                 variable is not defined or the value is too long.
 * Note:
 *  On Windows, it will raise ERROR 941 if the value of the variable
 *  exceeds the maximum length allowed as mentioned in the
 *  CLIENT_WIN_API_ENVIRONMENT.GET_ENVIRONMENT_STRING
\*-------------------------------------------------------------------------</multilinecomment>
  PROCEDURE GETVAR(VARNAME IN VARCHAR2, VARVALUE IN OUT VARCHAR2);
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) CLIENT_TOOL_ENV
		/*
		PACKAGE BODY CLIENT_TOOL_ENV IS

  PROCEDURE GETVAR(VARNAME IN VARCHAR2, VARVALUE IN OUT VARCHAR2) is
    unixOutput WebUtil_HOST.OUTPUT_ARRAY;
    hostHandle WebUtil_HOST.PROCESS_ID;
    varKey     VARCHAR2(100);
    iPos       PLS_INTEGER;
  BEGIN
    if WebUtil_Core.GetClientOSFamily = WebUtil_Core.CLIENT_PLATFORM_WIN32 then 
      -- read the client Registry
      VARVALUE := Client_Win_API_Environment.read_registry('HKEY_LOCAL_MACHINE\SOFTWARE\ORACLE',VARNAME,false);
      if VARVALUE is null OR VARVALUE = '' then
        -- Could not get an Oracle variable in registry. Try to get from environment varialble
        -- java desupported System.getenv method until they supported it again in 1.5.
        -- We can still get the environment variables in windows using
        -- CLIENT_WIN_API_ENVIRONMENT.GET_ENVIRONMENT_STRING
        VARVALUE := CLIENT_WIN_API_ENVIRONMENT.GET_ENVIRONMENT_STRING(VARNAME);
      end if;
    elsif WebUtil_Core.GetClientOSFamily in (WebUtil_Core.CLIENT_PLATFORM_MAC,WebUtil_Core.CLIENT_PLATFORM_UNKNOWN) then 
      -- do nothing 
      null;
    else
      -- Unix Ports - do a env to get the environment and parse that
      hostHandle := WebUtil_HOST.Blocking('env');
      unixOutput := WebUtil_HOST.Get_Standard_Output(hostHandle);
      WebUtil_HOST.Release_Process(hostHandle);
      for i in 1..unixOutput.count LOOP
        iPos := instr(unixOutput(i),'=');
        if iPos > 0 then 
          varKey := substr(unixOutput(i),1,iPos-1);
          if varKey = VARNAME then 
            VARVALUE := substr(unixOutput(i),iPos+1);
            EXIT;
          end if;
        end if;
      end LOOP;
    end if;

  exception
    when NO_DATA_FOUND then
      VARVALUE := null;
  END GETVAR;

END CLIENT_TOOL_ENV;
		*/
					//F2J_ERROR : The code was not converted because error ocurred while parsing the PL/SQL code. Check the log file.
		
	
	
}
