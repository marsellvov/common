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


public class WebutilHost extends AbstractSupportCodeObject {
	

	public WebutilHost(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) WEBUTIL_HOST
	/*
	PACKAGE WEBUTIL_HOST IS
<multilinecomment>********************************************************************************\
 * WEBUTIL_HOST
 *   This Package contains routines to execute "host" commands on the client
 *   Calls may be blocking or asynchronous and if aysnchronous may have a 
 *   callback mode e.g. You fire off the process on the client and when it 
 *   has finished a user named trigger will execute
 *********************************************************************************
 * Version 1.0.2
 *********************************************************************************
 * Change History
 *   1.0.0 DRMILLS 27/JAN/2003 - Creation
 *   1.0.1 DRMILLS 01/MAR/2003 - Slight API changes
 *   1.0.2 DRMILLS 17/MAY/2003 - Added call to WebUtil_Core.Init
 *
\********************************************************************************</multilinecomment>

  <multilinecomment>
   * Types
   </multilinecomment>
   
  <multilinecomment>*
   * PROCESS_ID is a type to represent a process so that you can do 
   * things like get the return code and error output and also kill it
   </multilinecomment>    
  type PROCESS_ID is record (handle PLS_INTEGER);

  <multilinecomment>*
   * OUTPUT_ARRAY is used to return the Standard Out and Standard Error output 
   * from a host command - each line of the output will appear as a member of this array
   </multilinecomment>    
  type OUTPUT_ARRAY is table of VARCHAR2(256 char) index by binary_integer;

  <multilinecomment>
   * Functions 
   </multilinecomment>

  <multilinecomment>*
   * HOST function is closest to the old client/server Host.
   * It blocks the Forms client until the host call is finished.
   * This version returns with the return code from the client
   </multilinecomment>    
  FUNCTION  Host(cmd in VARCHAR2) return PLS_INTEGER;
  
  <multilinecomment>*
   * HOST procedure is closest to the old client/server Host.
   * It blocks the Forms client until the host call is finished.
   * This version returns nothing
   </multilinecomment>      
  PROCEDURE Host(cmd in VARCHAR2);     
  
  <multilinecomment>*
   * Blocking like the Host function blocks the client until 
   * it is finished.  However it returns the process id rather 
   * than the return code.
   </multilinecomment>  
  FUNCTION  Blocking(cmd in VARCHAR2) return PROCESS_ID;  

  <multilinecomment>*
   * This version of Blocking is identical to the HOST Procedure
   </multilinecomment>  
  PROCEDURE Blocking(cmd in VARCHAR2);   
  
  <multilinecomment>*
   * NonBlocking executes a Host command and returns 
   * to the Form, allowing PL/SQL to continue at the same time that
   * the command is running on the client. 
   * The process id is returned so that you can:
   * 1) Get the Return code from the Process once it's finished 
   * 2) Get the console output and error output
   * 3) Kill the Process you started
   * NOTE: It is important to call Release_Process(processId) when 
   * You have finished with this process ID - this will release 
   * resources in the client (but will not kill the program that 
   * you started - use Terminate_Process() for that)
   </multilinecomment> 
  FUNCTION  NonBlocking(cmd in VARCHAR2)return PROCESS_ID;

  <multilinecomment>*
   * The Procedure version of NonBlocking executes a Host command 
   * and returns to the Form, allowing PL/SQL to continue at the 
   * same time that the command is running on the client. 
   * In this case the process id is not returned and the client 
   * side objects are automatically cleaned up for you.
   </multilinecomment>  
  PROCEDURE NonBlocking(cmd in VARCHAR2);
    
  <multilinecomment>*
   * NonBlocking_With_Callback executes a Host command and returns 
   * to the Form, allowing PL/SQL to continue at the same time that
   * the command is running on the client. 
   * The difference between this call and NonBlocking is that you 
   * can supply the name of a User Defined trigger which WebUtil 
   * will automatically call as soon as the process you've started 
   * has ended.
   * The process id is returned so that you can:
   * 1) Get the Return code from the Process once it's finished 
   * 2) Get the console output and error output
   * 3) Kill the Process you started
   * NOTE: It is important to call Release_Process(processId) when 
   * You have finished with this process ID - this will release 
   * resources in the client (but will not kill the program that 
   * you started - use Terminate_Process() for that)
   * Only call ReleaseProcess in this case *After* the callback 
   * trigger has been called. 
   </multilinecomment> 
  FUNCTION  NonBlocking_With_Callback(cmd in VARCHAR2, callbackTrigger in VARCHAR2)return PROCESS_ID;

  <multilinecomment>*
   * Given a Valid process id that you've gotten from 
   * NonBlocking() or NonBlockingWithCallback() you can terminate
   * the client program that you are running. 
   </multilinecomment>  
  PROCEDURE Terminate_Process(process in PROCESS_ID);

  <multilinecomment>*
   * Get the return code from a given process
   </multilinecomment>  
  FUNCTION  Get_Return_Code(process in PROCESS_ID) return PLS_INTEGER;
  
  <multilinecomment>*
   * Get the console output from a given process
   </multilinecomment>  
  FUNCTION  Get_Standard_Output(process in PROCESS_ID) return OUTPUT_ARRAY;

  <multilinecomment>*
   * Get the error output from a given process
   </multilinecomment>  
  FUNCTION  Get_Standard_Error(process in PROCESS_ID) return OUTPUT_ARRAY;
  
  <multilinecomment>*
   * Clean up the resources allocated to a particular Process
   * on the client
   </multilinecomment>  
  PROCEDURE Release_Process(process in out PROCESS_ID);  
  
  <multilinecomment>*
   * Get the ID of the process that has just finished.
   * This call is only valid for use in a callback trigger 
   * that has been set up and called through NonBlockingWithCallback()
   </multilinecomment>  
  FUNCTION  Get_Callback_Process return PROCESS_ID;  
  
  <multilinecomment>*
   * Test to see if this Process ID is null
   </multilinecomment>  
  FUNCTION  ID_NULL(process PROCESS_ID) return BOOLEAN;
  
  <multilinecomment>*
   * Test to see if two Process IDs represent the same process
   </multilinecomment>  
  FUNCTION  EQUALS(process_1 PROCESS_ID, process_2 PROCESS_ID) return BOOLEAN;  
  
END WEBUTIL_HOST;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) WEBUTIL_HOST
		/*
		PACKAGE BODY WEBUTIL_HOST IS
  <multilinecomment> 
   * Constants
   </multilinecomment>
  BLOCKING_MODE     CONSTANT PLS_INTEGER := 0;
  NON_BLOCKING_MODE CONSTANT PLS_INTEGER := 1;
  CALLBACK_MODE     CONSTANT PLS_INTEGER := 2;  

  <multilinecomment> 
   * Internal Types
   </multilinecomment> 
  type CALLBACK_LIST is table of varchar2(30) index by binary_integer;
  
  <multilinecomment>
   * Private Variables
   </multilinecomment>
   m_callbackList CALLBACK_LIST; 

  <multilinecomment>
   * Internal Program units
   </multilinecomment>
  FUNCTION Execute (cmd in VARCHAR2, exemode in PLS_INTEGER) return PROCESS_ID;
  FUNCTION GetOutput(process in PROCESS_ID, prop in VARCHAR2) return OUTPUT_ARRAY;   
   
  <multilinecomment>
   * Implementation of Public Program units
   </multilinecomment>   
  FUNCTION  Host(cmd in VARCHAR2) return PLS_INTEGER is
    procId PROCESS_ID;
    RC     PLS_INTEGER := -1;
  begin
    procId := Blocking(cmd);
    if not ID_NULL(procId) then
      RC := Get_Return_Code(procId);
      -- release the client side object
      Release_Process(procId);
    end if;
    return RC;
  end Host;
  
  PROCEDURE Host(cmd in VARCHAR2) is
  begin
    Blocking(cmd);
  end Host;  
  
  FUNCTION  Blocking(cmd in VARCHAR2) return PROCESS_ID is
  begin
    return Execute(cmd,BLOCKING_MODE);
  end Blocking;
  
  PROCEDURE Blocking(cmd in VARCHAR2) is
    procId PROCESS_ID;
  begin
    procId := Execute(cmd,BLOCKING_MODE);
    if not ID_NULL(procId) then 
       -- release the client side object
       Release_Process(procId);
     end if;      
  end Blocking;  

  FUNCTION  NonBlocking(cmd in VARCHAR2) return PROCESS_ID is
  begin
    return Execute(cmd,NON_BLOCKING_MODE);
  end NonBlocking;

  PROCEDURE NonBlocking(cmd in VARCHAR2) is
    procId PROCESS_ID;  
  begin
    procId := Execute(cmd,NON_BLOCKING_MODE);
    if not ID_NULL(procId) then 
      -- release the client side object
      Release_Process(procId);
    end if;       
  end NonBlocking;
  
  FUNCTION  NonBlocking_With_Callback(cmd in VARCHAR2, callbackTrigger in VARCHAR2)return PROCESS_ID is
    procId PROCESS_ID;   
  begin
    procId := Execute(cmd,CALLBACK_MODE);
    WebUtil_Core.SetCallbackTrigger(procId.handle, callbackTrigger);
    return procId;
  end NonBlocking_With_Callback;

  PROCEDURE Terminate_Process(process in PROCESS_ID) is
  begin
    WebUtil_Core.setProperty(WebUtil_Core.WUH_PACKAGE,'WUH_TERMINATE_PROC',process.handle);
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
       WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUH_PACKAGE)
                               ||' bean not found. WEBUTIL_HOST.Terminate_Process will not work');
  end Terminate_Process;      
  
  
  FUNCTION Get_Return_Code(process in PROCESS_ID) return PLS_INTEGER is
  begin 
    WebUtil_Core.setProperty(WebUtil_Core.WUH_PACKAGE,'WUH_PROC_ID',process.handle);
    return to_number(WebUtil_Core.getProperty(WebUtil_Core.WUH_PACKAGE,'WUH_RC'));
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
       WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUH_PACKAGE)
                               ||' bean not found. WEBUTIL_HOST.Get_Return_Code will not work');
  end Get_Return_Code;
    
  FUNCTION Get_Standard_Output(process in PROCESS_ID) return OUTPUT_ARRAY is  
  begin 
    return GetOutput(process,'WUH_STDOUT');
  end Get_Standard_Output;

  FUNCTION Get_Standard_Error(process in PROCESS_ID) return OUTPUT_ARRAY is  
  begin 
    return GetOutput(process,'WUH_STDERR');
  end Get_Standard_Error;
  
  PROCEDURE Release_Process(process in out PROCESS_ID) is  
  begin
    WebUtil_Core.setProperty(WebUtil_Core.WUH_PACKAGE,'WUH_CLEAR_PROC',process.handle);
    WebUtil_Core.ClearCallbackTrigger(process.handle);
    process.handle := null;
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUH_PACKAGE)
                              ||' bean not found. WEBUTIL_HOST.Release_Process will not work');
  end Release_Process;
  
  FUNCTION  Get_Callback_Process return PROCESS_ID is
    process PROCESS_ID;
  begin 
    process.handle := WebUtil_Core.GetLastCallbackId;
    return process;
  end Get_Callback_Process;
  
  FUNCTION  ID_NULL(process PROCESS_ID) return BOOLEAN is
  begin
    if process.handle is null then 
      return TRUE;
    else
      return FALSE;
    end if;
  end ID_NULL;
  
  FUNCTION  EQUALS(process_1 PROCESS_ID, process_2 PROCESS_ID) return BOOLEAN is
  begin
    if process_1.handle = process_2.handle then 
      return TRUE;
    else
      return FALSE;
    end if;
  end EQUALS;
  
    
  <multilinecomment>
   * Implementation of Internal Program units
   </multilinecomment>   
  FUNCTION Execute (cmd in VARCHAR2, exemode in PLS_INTEGER) return PROCESS_ID is
    procId PROCESS_ID;
  begin 
    if cmd is not null then 
      WebUtil_Core.setProperty(WebUtil_Core.WUH_PACKAGE,'WUH_EXECUTION_MODE',exemode);            
      WebUtil_Core.setProperty(WebUtil_Core.WUH_PACKAGE,'WUH_EXECUTE',cmd);      
      procId.handle := to_number(WebUtil_Core.getProperty(WebUtil_Core.WUH_PACKAGE,'WUH_EXECUTE'));
    end if;
    return procId;
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUH_PACKAGE)
                              ||' bean not found. WEBUTIL_HOST.Execute will not work');
  end Execute;
  
  FUNCTION GetOutput(process in PROCESS_ID, prop in VARCHAR2) return OUTPUT_ARRAY is   
    lines  OUTPUT_ARRAY;
    i      PLS_INTEGER := 1;
    buffer VARCHAR2(257 char);
    status VARCHAR2(1) := 'X';
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUH_PACKAGE,'WUH_PROC_ID',process.handle);
    LOOP
      buffer := WebUtil_Core.getProperty(WebUtil_Core.WUH_PACKAGE,prop);
      status := substr(buffer,1,1);
      -- Status can be Y: indicating more lines to follow,
      --               N: indicating that this is the last line
      --               X: indicating that the buffer was empty
      if status <> 'X' then 
        lines(i) := substr(buffer,2);
        i := i + 1;
      end if;
      exit when status <> 'Y';
    END LOOP;
    return lines;    
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUH_PACKAGE)
                              ||' bean not found. WEBUTIL_HOST.GetOutput will not work');
  END GetOutput;  
  
BEGIN
    -- Ensure that Core is instanciated.
    Webutil_Core.Init;
END;
		*/
					//F2J_ERROR : The code was not converted because error ocurred while parsing the PL/SQL code. Check the log file.
		
	
public static class ProcessId{
	public NInteger handle;
}

public static class OutputArray extends NStringTable{
}

public static class CallbackList extends NStringTable{
}



	
}
