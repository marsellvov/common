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


public class ClientWinApiEnvironment extends AbstractSupportCodeObject {
	

	public ClientWinApiEnvironment(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) CLIENT_WIN_API_ENVIRONMENT
	/*
	PACKAGE CLIENT_WIN_API_ENVIRONMENT IS

<multilinecomment>-----------------------------------------------------------------------------------*\
 * WebUtil version of D2KWUTIL package WIN_API_Environment                                     
 * Note: Not all D2kWutil Functions are ported
 *********************************************************************************
 * Version 1.0.0
 *********************************************************************************
 * Change History
 *   DRMILLS 21/FEB/2003 - Port to WebUtil
 *
 *********************************************************************************
 * WIN_API_ENVIRONMENT -> This package is concerned with reading from and 
 *       writing to either INI files or the Win95/WinNT Registry.
 *       Or gleaning other useful nuggets of information from the system
 * Contents:
 *    Read_INI_File           -> Gets a Value from an INI file
 *    Write_INI_File          -> Sets a Value in an INI file
 *    Get_Windows_Username    -> Login of current Windows User
 *    Get_Windows_Version     -> Returns the O/S being used
 *    Get_Environment_string  -> Expands Environment Vars e.g %path%
 *    Get_Windows_Directory   -> Gets the Working Windows Dir
 *    Get_Temp_Directory      -> Gets the Temp Dir
 *    Get_Net_Connection      -> Expand Drive Letter into a Network Path
 *    Read_Registry           -> Reads a value from the Registry 
 *    Write_Registry          -> Writes a value to the Registry in REG_SZ fmt
 *    Write_RegistryEx        -> Extended version of Write_Registry which allows 
 *                               You to choose which format to Write in
 *    Create_Registry_Key     -> Creates a new subkey in the registry
 *    Delete_Registry_Key     -> Removes a subkey from the registry
 *    Get_Working_Directory   -> Get the name of the "Start In" / Current Directory
 *                               For this runtime
 *    Set_Working_Directory   -> Alter the Working directory
 *    Get_Computer_Name       -> Get the name of this PC if defined
 * Dependancies:
 *    WIN_API
 *    WIN_API_DIALOG
 *    WIN_API_DEBUG
\*------------------------------------------------------------------------------------</multilinecomment> 

<multilinecomment>-------------------------------------------------------------------------*\
 * Read_INI_File    -> Read a Value from a named INI file 
 *                     If you need to read the ORACLE.INI file 
 *                     use TOOL_ENV.GETVAR() instead of this
 *                     package.
 *                     If using 32bit Developer/2000 you would 
 *                     probably rather use 
 *                     WIN_API_PROFILES.READ_REGISTRY() instead
 * Arguments: 
 *  FileName        -> Name of INI file e.g. WIN.INI. If the full
 *                     path is not supplied with this argument
 *                     then the DOS PATH will be searched for the
 *                     Specified INI file
 *  Section         -> Section in INI file where the entry is. 
 *                     This will be delimited using square brackets 
 *                     e.g. [printers]
 *  Entry           -> Name of Variable to read e.g. load (from win.ini)
 *  RaiseExceptions -> TRUE or FALSE(Default) If set to true, then if the 
 *                     requested variable is not found the explicit exception
 *                     NO_DATA_FOUND will be raised.
 * Returns:
 *  Value           -> A VARCHAR2 value containing the 
 *                     string (or number as a string) that the 
 *                     entry contains.
 *                     If the Entry is not found NULL is returned in 
 *                     the return value. (see RaiseExceptions above)
\*-------------------------------------------------------------------------</multilinecomment>
 
FUNCTION Read_INI_File (  FileName        IN  VARCHAR2,
                          Section         IN  VARCHAR2,
                          Entry           IN  VARCHAR2,
                          RaiseExceptions IN  BOOLEAN DEFAULT FALSE) return VARCHAR2;

<multilinecomment>-------------------------------------------------------------------------*\
 * Write_INI_File ->   Write a Value to a named INI file 
 *                     If using 32bit Developer/2000 you would 
 *                     probably rather use 
 *                     WIN_API_PROFILES.WRITE_REGISTRY_XXXX()
 * Arguments: 
 *  FileName        -> Name of INI file e.g. WIN.INI. If the full
 *                     path is not supplied with this argument
 *                     then the DOS PATH will be searched for the
 *                     Specified INI file
 *  Section         -> Section in INI file where the entry is. 
 *                     This will be delimited using square brackets 
 *                     e.g. [printers]. No need to supply the brackets
 *                     for the argument though
 *  Entry           -> Name of Variable to write e.g. load (from win.ini)
 *  Value           -> Value of the variable to write as a string.
 *  RaiseExceptions -> Set to TRUE or FALSE (default).  If this is set 
 *                     to TRUE, then errors such as not finding the 
 *                     INI file will raise NO_DATA_FOUND
 *                     If FALSE then all errors will be handled quietly
 * Returns:
 *  (NONE)
\*-------------------------------------------------------------------------</multilinecomment>

PROCEDURE Write_INI_File (  FileName        IN  VARCHAR2,
                            Section         IN  VARCHAR2,
                            Entry           IN  VARCHAR2,
                            Value           IN  VARCHAR2,
                            RaiseExceptions IN  BOOLEAN DEFAULT FALSE);

<multilinecomment>-------------------------------------------------------------------------*\
 * Get_Windows_Username -> The Username Supplied to log into Windows
 * Arguments: 
 *  RaiseExceptions     -> Set to TRUE or FALSE (default).  If this is set 
 *                         to TRUE, then Not finding the Username (or 
 *                         exceeding the buffer size) will raise
 *                         NO_DATA_FOUND
 * Returns:
 *  UserName ->    Varchar2 
\*-------------------------------------------------------------------------</multilinecomment>

FUNCTION Get_Windows_Username ( RaiseExceptions   IN  BOOLEAN DEFAULT FALSE)  RETURN VARCHAR2;

<multilinecomment>-------------------------------------------------------------------------*\
 * Get_Windows_Version -> The Version of Windows Being used.
 * Arguments: 
 *         NONE
 * Returns:
 *  Version            -> Varchar2 one of the following strings:
 *                        Windows95
 *                        Windows98
 *                        WindowsNT
\*-------------------------------------------------------------------------</multilinecomment>

FUNCTION Get_Windows_Version RETURN VARCHAR2;

<multilinecomment>-------------------------------------------------------------------------*\
 * Get_Environment_String -> Expands a named environment variable
 * Arguments: 
 *  VariableName          -> Name of the variable e.g. PATH
 *  RaiseExceptions       -> Set to TRUE or FALSE (default).  If this is set 
 *                           to TRUE, then Not finding the Variable (or 
 *                           exceeding the buffer size) will raise
 *                           NO_DATA_FOUND
 * Returns:
 *  Expanded String       ->  Varchar2 
\*-------------------------------------------------------------------------</multilinecomment>

FUNCTION Get_Environment_string (VariableName      IN  VARCHAR2,
                                 RaiseExceptions   IN  BOOLEAN DEFAULT FALSE)  RETURN VARCHAR2;


<multilinecomment>-------------------------------------------------------------------------*\
 * Get_Windows_Directory -> Obtains the path to the windows directory 
 *                          on the machine
 * Arguments: 
 *  RaiseExceptions      -> Set to TRUE or FALSE (default).  If this is set 
 *                          to TRUE, then Not finding the directory (or 
 *                          exceeding the buffer size) will raise
 *                          NO_DATA_FOUND exception. If FALSE, a null value
 *                          will be returned. Whether it is TRUE or
 *                          FALSE, ERROR 941 will be raised if the returned
 *                          length is longer than 2000.
 * Returns:
 *  Path                 -> Varchar2 
\*-------------------------------------------------------------------------</multilinecomment>

FUNCTION Get_Windows_Directory ( RaiseExceptions   IN  BOOLEAN DEFAULT FALSE)  RETURN VARCHAR2;

<multilinecomment>-------------------------------------------------------------------------*\
 * Get_Temp_Directory -> Obtains the path to the directory that  
 *                       Windows is using for temp files
 * Arguments: 
 *  RaiseExceptions   -> Set to TRUE or FALSE (default).  If this is set 
 *                       to TRUE, then Not finding the directory (or 
 *                       exceeding the buffer size) will raise
 *                       NO_DATA_FOUND
 * Returns:
 *  Path              -> Varchar2 
\*-------------------------------------------------------------------------</multilinecomment>

FUNCTION Get_Temp_Directory ( RaiseExceptions   IN  BOOLEAN DEFAULT FALSE)  RETURN VARCHAR2;

<multilinecomment>-------------------------------------------------------------------------*\
 * Get_Net_Connection  -> Expands an attached drive letter to it's 
 *                        full network address
 * Arguments: 
 *  DriveLetter        -> Letter of the Drive to expand e.g. 'F'
 *  RaiseExceptions    -> Set to TRUE or FALSE (default).  If this is set 
 *                        to TRUE, then Not finding the Drive (or 
 *                        exceeding the buffer size) will raise
 *                        NO_DATA_FOUND
 * Returns:
 *  Expanded Connection String ->  Varchar2 
\*-------------------------------------------------------------------------</multilinecomment>

FUNCTION Get_Net_Connection  (DriveLetter       IN  VARCHAR2,
                              RaiseExceptions   IN  BOOLEAN DEFAULT FALSE)  RETURN VARCHAR2;

<multilinecomment>-------------------------------------------------------------------------*\
 * Read_Registry    -> Read the value of a particular entry in the 
 *                     Win95/NT Registry
 *                     It wil read Registry Values Stored in the 
 *                     Following Formats
 *                        REG_EXPAND_SZ, REG_SZ, REG_DWORD
 *
 * Arguments: 
 *  RegPath         -> The Full path in the registry to the required
 *                     value e.g. HKEY_LOCAL_MACHINE\SOFTWARE\ORACLE
 *  RegEntry        -> Name of the entry to read e.g. ORACLE_PATH
 *  RaiseExceptions -> Set to TRUE or FALSE (default).  If this is set 
 *                     to TRUE, then failing to find the entry raises
 *                     NO_DATA_FOUND. obtaining an entry of a datatype
 *                     that is not a string or a number raises
 *                     VALUE_ERRROR.
 * Returns:
 *  Value           -> Both Number and String entries returned
 *                     as Varchar2.
 * NOTE:
 *  If you read a registry entry of type REG_EXPAND_SZ, this call will now 
 *  automatically attempt to expand any variables included in the string
 *  such as %path%.  If the total length of the expanded string exceeds 2000
 *  bytes then the unexpanded tring will be returned.
 *  To totally supress the expansion of such strings set the
 *  WIN_API.COMPAT_EXPAND_REG_VALUES flag to FALSE at runtime.
\*-------------------------------------------------------------------------</multilinecomment>

FUNCTION Read_Registry (RegPath         IN  VARCHAR2,
                        RegEntry        IN  VARCHAR2, 
                        RaiseExceptions IN  BOOLEAN DEFAULT FALSE)  RETURN VARCHAR2;
<multilinecomment>-------------------------------------------------------------------------*\
 * Write_Registry   -> Set the value of a particular entry in the 
 *                     Win95/NT Registry in REG_EXPAND_SZ format
 *                     NOTE: The Path to the entry must already Exist
 *
 * Arguments: 
 *  RegPath         -> The Full path in the registry to the required
 *                     value e.g. HKEY_LOCAL_MACHINE\SOFTWARE\ORACLE
 *  RegEntry        -> Name of the entry to set e.g. ORACLE_PATH
 *  RegValue        -> Value to set
 *  RaiseExceptions -> Set to TRUE or FALSE (default).  If this is set 
 *                     to TRUE, then failing to set  the entry raises
 *                     NO_DATA_FOUND. 
 * Returns:
 *  (NONE)
\*-------------------------------------------------------------------------</multilinecomment>

PROCEDURE Write_Registry(  RegPath         IN   VARCHAR2,
                           RegEntry        IN  VARCHAR2, 
                           RegValue        IN  VARCHAR2, 
                           RaiseExceptions IN  BOOLEAN DEFAULT FALSE);
        
<multilinecomment>-------------------------------------------------------------------------*\
 * Write_RegistryEx -> Set the value of a particular entry in the 
 *                     Win95/NT Registry Specifying the Format 
 *                     NOTE: The Path to the entry must already Exist
 *
 * Arguments: 
 *  RegPath         -> The Full path in the registry to the required
 *                     value e.g. HKEY_LOCAL_MACHINE\SOFTWARE\ORACLE
 *  RegEntry        -> Name of the entry to set e.g. ORACLE_PATH
 *  RegValue        -> Value to set
 *  RegFormat       -> Format for Setting Supported Values REG_SZ, REG_EXPAND_SZ,
 *                     REG_DWORD
 *  RaiseExceptions -> Set to TRUE or FALSE (default).  If this is set 
 *                     to TRUE, then failing to set  the entry raises
 *                     NO_DATA_FOUND. 
 * Returns:
 *  (NONE)
\*-------------------------------------------------------------------------</multilinecomment>

PROCEDURE Write_RegistryEx( RegPath         IN  VARCHAR2,
                            RegEntry        IN  VARCHAR2, 
                            RegValue        IN  VARCHAR2, 
                            RegFormat       IN  PLS_INTEGER,
                            RaiseExceptions IN  BOOLEAN DEFAULT FALSE);

<multilinecomment>-------------------------------------------------------------------------*\
 * Create_Registry_Key  -> Create a new subkey on the Registry
 *                         NOTE: If this key already exists this call will 
 *                         be harmless and Will Suceed.
 *
 * Arguments: 
 *  RegPath             -> The Full path in the registry to the required
 *                         value e.g. HKEY_LOCAL_MACHINE\SOFTWARE\D2KWUTIL
 *  RaiseExceptions     -> Set to TRUE or FALSE (default).  If this is set 
 *                         to TRUE, then failing to create key raises
 *                         NO_DATA_FOUND. 
 * Returns:
 *  (NONE)
\*-------------------------------------------------------------------------</multilinecomment>

PROCEDURE Create_Registry_Key(  RegPath          IN  VARCHAR2,
                                RaiseExceptions  IN  BOOLEAN DEFAULT FALSE);        
                                
<multilinecomment>-------------------------------------------------------------------------*\
 * Delete_Registry_Key  ->  Removes a subkey and all it's children from 
 *                          the Registry
 *        NOTE: **** THIS CALL IS VERY DANGEROUS - YOU COULD SERIOUSLY ****
 *              **** DAMAGE YOUR SYSTEM USING THIS FUNCTION            ****
 *              **** EXERCISE CAUTION                                  ****
 *
 * Arguments: 
 *  RegPath             -> The Full path in the registry to be deleted
 *                         value e.g. HKEY_LOCAL_MACHINE\SOFTWARE\D2KWUTIL
 *  RaiseExceptions     -> Set to TRUE or FALSE (default).  If this is set 
 *                         to TRUE, then failing to delete the entry raises
 *                         NO_DATA_FOUND. 
 * Returns:
 *  (NONE)
\*-------------------------------------------------------------------------</multilinecomment>

PROCEDURE Delete_Registry_Key(  RegPath          IN  VARCHAR2,
                                RaiseExceptions  IN  BOOLEAN DEFAULT FALSE);        

                                
<multilinecomment>-------------------------------------------------------------------------*\
 * Get_Working_Directory -> Obtains the path of the current directory
 * Arguments: 
 *  RaiseExceptions      -> Set to TRUE or FALSE (default).  If this is set 
 *                          to TRUE, then Not finding the directory (or 
 *                          exceeding the buffer size) will raise
 *                          NO_DATA_FOUND
 * Returns:
 *  Path                 -> Varchar2 
\*-------------------------------------------------------------------------</multilinecomment>

FUNCTION Get_Working_Directory ( RaiseExceptions   IN  BOOLEAN DEFAULT FALSE)  RETURN VARCHAR2;
        
<multilinecomment>-------------------------------------------------------------------------*\
 * Get_Computer_name -> Obtains the name of the running PC
 * Arguments: 
 *  RaiseExceptions  ->  Set to TRUE or FALSE (default).  If this is set 
 *                       to TRUE, then Not finding the name (or 
 *                       exceeding the buffer size) will raise
 *                       NO_DATA_FOUND
 * Returns:
 *  Computer name ->     Varchar2 
\*-------------------------------------------------------------------------</multilinecomment>

FUNCTION Get_Computer_Name ( RaiseExceptions   IN  BOOLEAN DEFAULT FALSE)  RETURN VARCHAR2;                          

END CLIENT_WIN_API_ENVIRONMENT;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) CLIENT_WIN_API_ENVIRONMENT
		/*
		PACKAGE BODY CLIENT_WIN_API_ENVIRONMENT is

  -- Constants for maintaining the Function Handle Array
  -- These should be unique through the Whole Library
  -- Environment has indexes in the range 300 - 399
  iReadINIFile          CONSTANT  PLS_INTEGER  := 300;
  iWriteINIFile         CONSTANT  PLS_INTEGER  := 301;
  iGetRegKey            CONSTANT  PLS_INTEGER  := 302;
  iSetRegKey            CONSTANT  PLS_INTEGER  := 303;
  iGetWinuser           CONSTANT  PLS_INTEGER  := 304;
  iGetDOSEnv            CONSTANT  PLS_INTEGER  := 305;
  iWinDir               CONSTANT  PLS_INTEGER  := 306;
  iTmpDir               CONSTANT  PLS_INTEGER  := 307;
  iWNetGetConnection    CONSTANT  PLS_INTEGER  := 308;
  iGetWorkingDirectory  CONSTANT  PLS_INTEGER  := 309;
  iSetWorkingDirectory  CONSTANT  PLS_INTEGER  := 310;
  iGetComputerName      CONSTANT  PLS_INTEGER  := 311;
  iGetWindowsVersion    CONSTANT  PLS_INTEGER  := 312;
  iMaintRegKey          CONSTANT  PLS_INTEGER  := 313;

  -- Private Program unit headers  
  PROCEDURE Wrap_Write_Registry( CalledBy        IN  VARCHAR2,
                                 RegPath         IN  VARCHAR2,
                                 RegEntry        IN  VARCHAR2, 
                                 RegValue        IN  VARCHAR2,                               
                                 RegFormat       IN  PLS_INTEGER,                                
                                 RaiseExceptions IN  BOOLEAN DEFAULT FALSE);

  PROCEDURE Wrap_Maint_Registry( CalledBy        IN  VARCHAR2,
                                 RegPath         IN  VARCHAR2,
                                 Opt             IN  PLS_INTEGER,                                
                                 RaiseExceptions IN  BOOLEAN DEFAULT FALSE);



  -- Public Bodies 
  FUNCTION Read_INI_File (  FileName        IN  VARCHAR2,
                            Section         IN  VARCHAR2,
                            Entry           IN  VARCHAR2,
                            RaiseExceptions IN  BOOLEAN DEFAULT FALSE) return VARCHAR2 is
    DEFAULT_PLACEHOLDER  constant varchar2(16):= 'D2KWUTIL_EMPTY';
    vcBuff1    VARCHAR2(512);
    vcBuff2    VARCHAR2(512);
    vcBuff3    VARCHAR2(512);
    vcBuff4    VARCHAR2(512);
    vcBuff5    VARCHAR2(512);
    iRC        PLS_INTEGER;
    args      WEBUTIL_C_API.ParameterList;
    param1    WEBUTIL_C_API.ParameterHandle;
    param2    WEBUTIL_C_API.ParameterHandle; 
    param3    WEBUTIL_C_API.ParameterHandle;   
    param4    WEBUTIL_C_API.ParameterHandle;
    param5    WEBUTIL_C_API.ParameterHandle;
    param6    WEBUTIL_C_API.ParameterHandle;    
  begin 
    Client_Win_API.Clean_Error_Stack;
    iRC  := 0;
    if Client_Win_API.API_ENABLED then 
      Client_win_api.Register_function_call(iReadINIFile,'d2kwutil_ReadINIFile','INT','*CHAR,*CHAR,*CHAR,*CHAR,*CHAR,INT');
      vcBuff1    := FileName;
      vcBuff2    := Section;
      vcBuff3    := Entry;
      vcBuff4    := '';
      vcBuff5    := DEFAULT_PLACEHOLDER;
      args := WEBUTIL_C_API.Create_Parameter_List;
      param1 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_IN,
                                            vcBuff1,
                                            512);
      param2 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_IN,
                                            vcBuff2,
                                            512);
      param3 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_IN,
                                            vcBuff3,
                                            512);
      param4 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_INOUT,
                                            vcBuff4,
                                            512);
      param5 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_IN,
                                            vcBuff5,
                                            18);                                                                                                                                                        
      param6 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_INT,
                                            WEBUTIL_C_API.param_IN,
                                            512);
      iRC := WebUtil_C_API.Invoke_Int(Client_win_api.FunctionHandle(iReadINIFile),args);
      vcBuff4 := WEBUTIL_C_API.Get_Parameter_String(args,param4);
      WEBUTIL_C_API.Destroy_Parameter_List(args);                  
    else 
      raise CLIENT_WIN_API.NOT_AVAILABLE;
    end if;  
    if iRC = 0 or vcBuff4 = DEFAULT_PLACEHOLDER then 
      CLIENT_Win_API.Add_error('Read_INI_File','Unable to obtain '||Entry||' from the ['||Section||'] section of '||FileName);
      if not RaiseExceptions then
        return NULL;
      else 
        raise NO_DATA_FOUND;
      end if;
    else
      return vcBuff4;
    end if;
  exception
    when NO_DATA_FOUND then 
      raise;
    when CLIENT_WIN_API.NOT_AVAILABLE then
      CLIENT_Win_API.Add_error('Read_INI_File',CLIENT_Win_API.NoAPI);
      raise;
    when others then 
      CLIENT_Win_API.Add_error('Read_INI_File',CLIENT_Win_API.UError||CLIENT_WIN_API.Add_External_errors); 
      raise;
  end Read_INI_File;

  PROCEDURE Write_INI_File (  FileName        IN  VARCHAR2,
                              Section         IN  VARCHAR2,
                              Entry           IN  VARCHAR2,
                              Value           IN  VARCHAR2,
                              RaiseExceptions IN  BOOLEAN DEFAULT FALSE) is
    vcBuff1    VARCHAR2(512);
    vcBuff2    VARCHAR2(512);
    vcBuff3    VARCHAR2(512);
    vcBuff4    VARCHAR2(512);
    iRC        PLS_INTEGER;
    args      WEBUTIL_C_API.ParameterList;
    param1    WEBUTIL_C_API.ParameterHandle;
    param2    WEBUTIL_C_API.ParameterHandle; 
    param3    WEBUTIL_C_API.ParameterHandle;   
    param4    WEBUTIL_C_API.ParameterHandle;
  begin

    Client_Win_API.Clean_Error_Stack;
    iRC  := 0;
    if Client_Win_API.API_ENABLED then 
      Client_win_api.Register_function_call(iWriteINIFile,'d2kwutil_WriteINIFile','INT','*CHAR,*CHAR,*CHAR,*CHAR');
      vcBuff1    := FileName;
      vcBuff2    := Section;
      vcBuff3    := Entry;
      vcBuff4    := Value;
      args := WEBUTIL_C_API.Create_Parameter_List;
      param1 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_IN,
                                            vcBuff1,
                                            512);
      param2 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_IN,
                                            vcBuff2,
                                            512);
      param3 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_IN,
                                            vcBuff3,
                                            512);
      param4 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_IN,
                                            vcBuff4,
                                            512);    
      iRC := WebUtil_C_API.Invoke_Int(Client_win_api.FunctionHandle(iWriteINIFile),args);
      WEBUTIL_C_API.Destroy_Parameter_List(args);                                      
    else 
      raise CLIENT_WIN_API.NOT_AVAILABLE;
    end if;  
    if iRC = 0  then
      CLIENT_Win_API.Add_error('Write_INI_File','Unable to set the value of '||Entry||' in the ['||Section||'] section of '||FileName); 
      if RaiseExceptions then
        raise NO_DATA_FOUND;
      end if;
    end if;
  exception
    when NO_DATA_FOUND then 
      raise;
    when CLIENT_WIN_API.NOT_AVAILABLE then
      CLIENT_Win_API.Add_error('Write_INI_File',CLIENT_Win_API.NoAPI);
      raise;
    when others then 
      CLIENT_Win_API.Add_error('Write_INI_File',CLIENT_Win_API.UError||CLIENT_WIN_API.Add_External_errors); 
      raise;
  end Write_INI_File;

  FUNCTION Get_Windows_Username (RaiseExceptions IN  BOOLEAN DEFAULT FALSE)  RETURN VARCHAR2 is
    vcBuff1    VARCHAR2(512);
    iRC        PLS_INTEGER;
    args      WEBUTIL_C_API.ParameterList;
    param1    WEBUTIL_C_API.ParameterHandle;
    param2    WEBUTIL_C_API.ParameterHandle;      
  begin 
    Client_Win_API.Clean_Error_Stack;
    iRC  := 0;
    if Client_Win_API.API_ENABLED then 
      Client_win_api.Register_function_call(iGetWinuser,'d2kwutil_GetWinuser','INT','*CHAR,INT');
      vcBuff1    := '';
      args := WEBUTIL_C_API.Create_Parameter_List;
      param1 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_INOUT,
                                            vcBuff1,
                                            512);
      param2 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_INT,
                                            WEBUTIL_C_API.param_IN,
                                            512);
      iRC := WebUtil_C_API.Invoke_Int(Client_win_api.FunctionHandle(iGetWinuser),args);
      vcBuff1 := WEBUTIL_C_API.Get_Parameter_String(args,param1);
      WEBUTIL_C_API.Destroy_Parameter_List(args);                                        
    else
      raise CLIENT_WIN_API.NOT_AVAILABLE;
    end if;  
    if iRC = 0 then 
      CLIENT_Win_API.Add_error('Get_Windows_Username', 'No Value Returned');
      if RaiseExceptions then
        raise NO_DATA_FOUND;
      else
        return vcBuff1;
      end if;
    else
      return vcBuff1;
    end if;
  exception
    when NO_DATA_FOUND then 
      raise;
    when CLIENT_WIN_API.NOT_AVAILABLE then
      CLIENT_Win_API.Add_error('Get_Windows_Username',CLIENT_Win_API.NoAPI);
      raise;
    when others then 
      CLIENT_Win_API.Add_error('Get_Windows_Username',CLIENT_Win_API.UError||CLIENT_WIN_API.Add_External_errors); 
      raise;
  end Get_Windows_Username;


  FUNCTION Get_Windows_Directory (RaiseExceptions IN  BOOLEAN DEFAULT FALSE)  RETURN VARCHAR2 is
    vcBuff1    VARCHAR2(512);
    iRC        PLS_INTEGER;
    args      WEBUTIL_C_API.ParameterList;
    param1    WEBUTIL_C_API.ParameterHandle;
    param2    WEBUTIL_C_API.ParameterHandle;      
  begin 
    Client_Win_API.Clean_Error_Stack;
    iRC  := 0;
    if Client_Win_API.API_ENABLED then 
      Client_win_api.Register_function_call(iWinDir,'d2kwutil_WinDir','INT','*CHAR,INT');

      vcBuff1    := '';
      args := WEBUTIL_C_API.Create_Parameter_List;
      param1 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_INOUT,
                                            vcBuff1,
                                            512);
      param2 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_INT,
                                            WEBUTIL_C_API.param_IN,
                                            512);
      iRC := WebUtil_C_API.Invoke_Int(Client_win_api.FunctionHandle(iWinDir),args);
      vcBuff1 := WEBUTIL_C_API.Get_Parameter_String(args,param1);
      WEBUTIL_C_API.Destroy_Parameter_List(args);                                            
    else
      raise CLIENT_WIN_API.NOT_AVAILABLE;
    end if;  
    if iRC = 0 then 
      CLIENT_Win_API.Add_error('Get_Windows_Directory','No Value Returned');
      if RaiseExceptions then
        raise NO_DATA_FOUND;
      else
        return NULL;
      end if;
    else
      return CLIENT_WIN_API.StripDirSep(vcBuff1);
    end if;
  exception
    when NO_DATA_FOUND then 
      raise;
    when CLIENT_WIN_API.NOT_AVAILABLE then
      CLIENT_Win_API.Add_error('Get_Windows_Directory',CLIENT_Win_API.NoAPI);
      raise;
    when others then 
      CLIENT_Win_API.Add_error('Get_Windows_Directory',CLIENT_Win_API.UError||CLIENT_WIN_API.Add_External_errors); 
      raise;
  end Get_Windows_Directory;


  FUNCTION Get_Temp_Directory (RaiseExceptions IN  BOOLEAN DEFAULT FALSE)  RETURN VARCHAR2 is
    vcBuff1    VARCHAR2(512);
    iRC        PLS_INTEGER;
    args      WEBUTIL_C_API.ParameterList;
    param1    WEBUTIL_C_API.ParameterHandle;
    param2    WEBUTIL_C_API.ParameterHandle;   
  begin 
    Client_Win_API.Clean_Error_Stack;
    iRC  := 0;
    if Client_Win_API.API_ENABLED then 
      Client_win_api.Register_function_call(iTmpDir,'d2kwutil_TmpDir','INT','*CHAR,INT');
      vcBuff1    := '';
      args := WEBUTIL_C_API.Create_Parameter_List;
      param1 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_INOUT,
                                            vcBuff1,
                                            512);
      param2 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_INT,
                                            WEBUTIL_C_API.param_IN,
                                            512);
      iRC := WebUtil_C_API.Invoke_Int(Client_win_api.FunctionHandle(iTmpDir),args);
      vcBuff1 := WEBUTIL_C_API.Get_Parameter_String(args,param1);
      WEBUTIL_C_API.Destroy_Parameter_List(args);                                                
    else
      raise CLIENT_WIN_API.NOT_AVAILABLE;
    end if;  
    if iRC = 0 then 
      CLIENT_Win_API.Add_error('Get_Temp_Directory','No Value Returned');
      if RaiseExceptions then
        raise NO_DATA_FOUND;
      else
        return NULL;
      end if;
    else
      return CLIENT_WIN_API.StripDirSep(vcBuff1);
    end if;
  exception
    when NO_DATA_FOUND then 
      raise;
    when CLIENT_WIN_API.NOT_AVAILABLE then
      CLIENT_Win_API.Add_error('Get_Temp_Directory',CLIENT_Win_API.NoAPI);
      raise;
    when others then 
      CLIENT_Win_API.Add_error('Get_Temp_Directory',CLIENT_Win_API.UError||CLIENT_WIN_API.Add_External_errors); 
      raise;
  end Get_Temp_Directory;


  FUNCTION Get_Environment_string (  VariableName      IN  VARCHAR2,
                                     RaiseExceptions   IN  BOOLEAN DEFAULT FALSE)  RETURN VARCHAR2 is
    vcBuff1    VARCHAR2(512);
    iMaxOutBuff NUMBER := 2000;
    vcBuff2    VARCHAR2(2000); -- keep the length same as iMaxOutBuff
    iRC        PLS_INTEGER;
    args      WEBUTIL_C_API.ParameterList;
    param1    WEBUTIL_C_API.ParameterHandle;
    param2    WEBUTIL_C_API.ParameterHandle;   
    param3    WEBUTIL_C_API.ParameterHandle;     
  begin 
    Client_Win_API.Clean_Error_Stack;
    iRC  := 0;
    if Client_Win_API.API_ENABLED then
      Client_win_api.Register_function_call(iGetDOSEnv,'d2kwutil_GetDOSEnv','LONG','*CHAR,*CHAR,LONG');
      vcBuff1    := '%'||ltrim(rtrim(VariableName))||'%';
      args := WEBUTIL_C_API.Create_Parameter_List;
      param1 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_IN,
                                            vcBuff1,
                                            512);
      param2 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_OUT,
                                            vcBuff2,
                                            iMaxOutBuff);
      param3 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_INT,
                                            WEBUTIL_C_API.param_IN,
                                            iMaxOutBuff);

      iRC := WebUtil_C_API.Invoke_int(Client_win_api.FunctionHandle(iGetDOSEnv),args);
      if iRC > iMaxOutBuff then
        -- expanded variable value is too long.
        Webutil_Core.Error(Webutil_Core.WUL_PACKAGE,941,
                           'CLIENT_WIN_API_ENVIRONMENT.GET_ENVIRONMENT_STRING', iMaxOutBuff, iRC);
      end if;
      vcBuff2 := WEBUTIL_C_API.Get_Parameter_String(args,param2);
      WEBUTIL_C_API.Destroy_Parameter_List(args);            
    else 
      raise CLIENT_WIN_API.NOT_AVAILABLE;
    end if;  
    if iRC = 0
        or iRC > iMaxOutBuff -- buffer is insufficient
        or vcBuff1 = vcBuff2 -- if not defined %VAR% will be returned as %VAR%
    then 
      CLIENT_Win_API.Add_error('Get_Environment_String','Unable to get the value of the variable '||VariableName);
      if RaiseExceptions then
        raise NO_DATA_FOUND;
      else
        return NULL;
      end if;
    else
      return vcBuff2;
    end if;
  exception
    when NO_DATA_FOUND then 
      raise;
    when CLIENT_WIN_API.NOT_AVAILABLE then
      CLIENT_Win_API.Add_error('Get_Environment_String',CLIENT_Win_API.NoAPI);
      raise;
    when others then 
      CLIENT_Win_API.Add_error('Get_Environment_String',CLIENT_Win_API.UError||CLIENT_WIN_API.Add_External_errors); 
      raise;
  end Get_Environment_String;

  FUNCTION Get_Net_Connection ( DriveLetter     IN  VARCHAR2,
                                RaiseExceptions IN  BOOLEAN DEFAULT FALSE) return VARCHAR2 is
    vcBuff1    VARCHAR2(512);
    vcBuff2    VARCHAR2(512);
    iBuff1    PLS_INTEGER;
    iRC        PLS_INTEGER;
    args      WEBUTIL_C_API.ParameterList;
    param1    WEBUTIL_C_API.ParameterHandle;
    param2    WEBUTIL_C_API.ParameterHandle;   
    param3    WEBUTIL_C_API.ParameterHandle;    
  begin
    Client_Win_API.Clean_Error_Stack;
    iRC  := 0;
    if Client_Win_API.API_ENABLED then 
      Client_win_api.Register_function_call(iWNetGetConnection,'d2kwutil_WNetGetConnection','INT','*CHAR,*CHAR,*LONG');
      vcBuff1   := substr(DriveLetter,1,instr(DriveLetter,':'));
      vcBuff2   := '';
      iBuff1    := 512;
      args := WEBUTIL_C_API.Create_Parameter_List;
      param1 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_IN,
                                            vcBuff1,
                                            2);
      param2 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_INOUT,
                                            vcBuff2,
                                            512);
      param3 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_INT_PTR,
                                            WEBUTIL_C_API.param_IN,
                                            iBuff1);
                                    
      iRC := WebUtil_C_API.Invoke_int(Client_win_api.FunctionHandle(iWNetGetConnection),args);
      vcBuff2 := WEBUTIL_C_API.Get_Parameter_String(args,param2);
      WEBUTIL_C_API.Destroy_Parameter_List(args);      
    else 
      raise CLIENT_WIN_API.NOT_AVAILABLE;
    end if;  
    if iRC <> 0 then 
      CLIENT_Win_API.Add_error('Get_Net_Connection' ,'Unable to expand "'||vcBuff1||'" into a network path (Return Code='||to_char(iRC)||')');
      if not RaiseExceptions then
        return NULL;
      else 
        raise NO_DATA_FOUND;
      end if;
    else
      return vcBuff2;
    end if;
  exception
    when NO_DATA_FOUND then 
      raise;
    when CLIENT_WIN_API.NOT_AVAILABLE then
      CLIENT_Win_API.Add_error('Get_Net_Connection',CLIENT_Win_API.NoAPI);
      raise;
    when others then 
      CLIENT_Win_API.Add_error('Get_Net_Connection',CLIENT_Win_API.UError||CLIENT_WIN_API.Add_External_errors); 
      raise;
  end Get_Net_Connection;


  FUNCTION Read_Registry (RegPath         IN  VARCHAR2,
                          RegEntry        IN  VARCHAR2, 
                          RaiseExceptions IN  BOOLEAN DEFAULT FALSE)  RETURN VARCHAR2 is
    vcBuff1    VARCHAR2(512);
    vcBuff2    VARCHAR2(512);
    vcBuff3    VARCHAR2(2000);                       
    vcRoot     VARCHAR2(20);
    iBuff1     PLS_INTEGER;
    iBuff2     PLS_INTEGER;
    iBuff3         PLS_INTEGER;
    iRC        PLS_INTEGER;
    args      WEBUTIL_C_API.ParameterList;
    param1    WEBUTIL_C_API.ParameterHandle;
    param2    WEBUTIL_C_API.ParameterHandle;   
    param3    WEBUTIL_C_API.ParameterHandle;       
    param4    WEBUTIL_C_API.ParameterHandle;
    param5    WEBUTIL_C_API.ParameterHandle;   
    param6    WEBUTIL_C_API.ParameterHandle;       
  begin
    Client_Win_API.Clean_Error_Stack;
    iRC  := 0;
    if Client_Win_API.API_ENABLED then 
      Client_win_api.Register_function_call(iGetRegKey,'d2kwutil_GetRegKey','INT','INT,*CHAR,*CHAR,*CHAR,INT,INT');  
      -- Which Root?
      vcRoot  := upper(substr(RegPath,1,instr(RegPath,'\')-1));
      if      vcRoot =  'HKEY_LOCAL_MACHINE' then 
        iBuff1 := 0;
      elsif   vcRoot =  'HKEY_CLASSES_ROOT' then 
        iBuff1 := 1;
      elsif   vcRoot =  'HKEY_CURRENT_USER' then 
        iBuff1 := 2;
      elsif   vcRoot =  'HKEY_USERS' then
        iBuff1 := 3;
      elsif   vcRoot =  'HKEY_CURRENT_CONFIG' then
        iBuff1 := 4;      
      else
        CLIENT_Win_API.Add_error('Read_Registry','Invalid Registry Key '||RegPath);
        if  RaiseExceptions then
          raise NO_DATA_FOUND;
        end if;  
      end if;

      iBuff2     := 2000; <multilinecomment> Length of buffer </multilinecomment>
      vcBuff1    := substr(RegPath,instr(RegPath,'\')+1);
      vcBuff2    := RegEntry;
      vcBuff3    := '';
      if not CLIENT_WIN_API.COMPAT_EXPAND_REG_VALUES then 
        iBuff3 := 1;
      else
        iBuff3 := 0;
      end if;
      args := WEBUTIL_C_API.Create_Parameter_List;
      param1 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_INT,
                                            WEBUTIL_C_API.param_IN,
                                            iBuff1);
      param2 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_IN,
                                            vcBuff1,
                                            512);
      param3 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_IN,
                                            vcBuff2,
                                            512);   
      param4 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_INOUT,
                                            vcBuff3,
                                            2000);                                    
      param5 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_INT,
                                            WEBUTIL_C_API.param_IN,
                                            iBuff2); 
      param6 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_INT,
                                            WEBUTIL_C_API.param_IN,
                                            iBuff3);                                     
      iRC := WebUtil_C_API.Invoke_int(Client_win_api.FunctionHandle(iGetRegKey),args);
      vcBuff3 := WEBUTIL_C_API.Get_Parameter_String(args,param4);
      WEBUTIL_C_API.Destroy_Parameter_List(args);      
    
      --iRC        := d2kwutil_GetRegKey(Client_win_api.FunctionHandle(iGetRegKey),iBuff1,vcBuff1,vcBuff2,vcBuff3,iBuff2,iBuff3);      
    else 
      raise CLIENT_WIN_API.NOT_AVAILABLE;
    end if;  
    if iRC = -1  then 
      CLIENT_Win_API.Add_error('Read_Registry','Cannot read  entry '||RegPath||'->'||RegEntry);
      if not RaiseExceptions then
        return NULL;
      else 
        raise NO_DATA_FOUND;
      end if;
    elsif iRC = -2 then
      CLIENT_Win_API.Add_error('Read_Registry', RegPath||'->'||RegEntry||' is an unsupported datatype');
      if not RaiseExceptions then
        return NULL;
      else 
        raise NO_DATA_FOUND;
      end if;
    elsif iRC = -3 then
      CLIENT_Win_API.Add_error('Read_Registry',RegPath||'->'||RegEntry||' is longer than '||to_char(iBuff2)||' Bytes');
      if not RaiseExceptions then
        return NULL;
      else 
        raise VALUE_ERROR;
      end if;
    elsif iRC = -4 then
      CLIENT_Win_API.Add_error('Read_Registry', RegPath||'->'||RegEntry||' Failed to expand environment string');
      if not RaiseExceptions then
        return NULL;
      else 
        raise NO_DATA_FOUND;
      end if;    
    end if;
    return vcBuff3;
  exception
    when NO_DATA_FOUND then 
      raise;
    when VALUE_ERROR then 
      raise;
    when CLIENT_WIN_API.NOT_AVAILABLE then
      CLIENT_Win_API.Add_error('Read_Registry',CLIENT_Win_API.NoAPI);
      raise;
    when others then 
      CLIENT_Win_API.Add_error('Read_Registry',CLIENT_Win_API.UError||CLIENT_WIN_API.Add_External_errors); 
      raise;
  end Read_Registry;

  PROCEDURE Wrap_Write_Registry(  CalledBy        IN  VARCHAR2,
                                  RegPath         IN  VARCHAR2,
                                  RegEntry        IN  VARCHAR2, 
                                  RegValue        IN  VARCHAR2, 
                                  RegFormat       IN  PLS_INTEGER,
                                  RaiseExceptions IN  BOOLEAN DEFAULT FALSE) is
    vcBuff1    VARCHAR2(512);
    vcBuff2    VARCHAR2(512);
    vcBuff3    VARCHAR2(512);
    vcRoot     VARCHAR2(20);
    iBuff1     PLS_INTEGER;
    iBuff2     PLS_INTEGER;
    iBuff3     PLS_INTEGER := 0;
    iRC        PLS_INTEGER;
    iNullInd     PLS_INTEGER := 0;
    args      WEBUTIL_C_API.ParameterList;
    param1    WEBUTIL_C_API.ParameterHandle;
    param2    WEBUTIL_C_API.ParameterHandle;   
    param3    WEBUTIL_C_API.ParameterHandle;       
    param4    WEBUTIL_C_API.ParameterHandle;
    param5    WEBUTIL_C_API.ParameterHandle;   
    param6    WEBUTIL_C_API.ParameterHandle;
    param7    WEBUTIL_C_API.ParameterHandle;     
  begin 
    Client_Win_API.Clean_Error_Stack;
    iRC  := 0;
    if Client_Win_API.API_ENABLED then 
      Client_win_api.Register_function_call(iSetRegKey,'d2kwutil_SetRegKey','INT','INT,*CHAR,*CHAR,INT,*CHAR,LONG,INT');  
      -- Which Root?
      vcRoot  := upper(substr(RegPath,1,instr(RegPath,'\')-1));
      if      vcRoot =  'HKEY_LOCAL_MACHINE' then 
        iBuff1 := 0;
      elsif   vcRoot =  'HKEY_CLASSES_ROOT' then 
        iBuff1 := 1;
      elsif   vcRoot =  'HKEY_CURRENT_USER' then 
        iBuff1 := 2;
      elsif   vcRoot =  'HKEY_USERS' then
        iBuff1 := 3;
      elsif   vcRoot =  'HKEY_CURRENT_CONFIG' then
        iBuff1 := 4;            
      else
        CLIENT_Win_API.Add_error(CalledBy,'Invalid Registry Key '||RegPath);
        if  RaiseExceptions then
          raise NO_DATA_FOUND;
        end if;  
      end if;

      iBuff2    := RegFormat;
      if RegValue is NULL then 
        iBuff3 := 0;
        vcBuff3 := ' ';
        iNullInd := 1;
      else
        if RegFormat = CLIENT_WIN_API.REG_DWORD then 
          iBuff3 := trunc(abs(to_number(RegValue)));
          vcBuff3 := ' ';
          if iBuff3 > 4294967295 then 
            Raise VALUE_ERROR; <multilinecomment> larger than a DWORD </multilinecomment>
          end if;
        else
          vcBuff3    := RegValue;
        end if;
      end if;

      vcBuff1    := substr(RegPath,instr(RegPath,'\')+1);
      vcBuff2    := RegEntry;
      args := WEBUTIL_C_API.Create_Parameter_List;
      param1 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_INT,
                                            WEBUTIL_C_API.param_IN,
                                            iBuff1);
      param2 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_IN,
                                            vcBuff1,
                                            512);
      param3 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_IN,
                                            vcBuff2,
                                            512);   
      param4 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_INT,
                                            WEBUTIL_C_API.param_IN,
                                            iBuff2);                                    
      param5 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_IN,
                                            vcBuff3,
                                            512);   

      param6 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_INT,
                                            WEBUTIL_C_API.param_IN,
                                            iBuff3); 
      param7 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_INT,
                                            WEBUTIL_C_API.param_IN,
                                            iNullInd);                                     
      iRC := WebUtil_C_API.Invoke_int(Client_win_api.FunctionHandle(iSetRegKey),args);
      WEBUTIL_C_API.Destroy_Parameter_List(args);      
      --iRC   := d2kwutil_SetRegKey(Client_win_api.FunctionHandle(iSetRegKey),iBuff1,vcBuff1,vcBuff2,iBuff2,vcBuff3,iBuff3,iNullInd);
    else 
      raise CLIENT_WIN_API.NOT_AVAILABLE;
    end if;  
    if iRC <> 0  then 
      CLIENT_Win_API.Add_error(CalledBy,'Cannot set Registry Entry '||RegPath||'->'||RegEntry||' to '||RegValue);
      if  RaiseExceptions then
        raise NO_DATA_FOUND;
      end if;
    end if;
  exception
    when NO_DATA_FOUND then 
      raise;
    when VALUE_ERROR then 
      CLIENT_Win_API.Add_error(CalledBy,'The value being set exceeded the maximum for a DWORD (4,294,967,295)');
      raise;
    when CLIENT_WIN_API.NOT_AVAILABLE then
      CLIENT_Win_API.Add_error(CalledBy,CLIENT_Win_API.NoAPI);
      raise;
    when others then 
      CLIENT_Win_API.Add_error(CalledBy,CLIENT_Win_API.UError||CLIENT_WIN_API.Add_External_errors); 
      raise;
  end Wrap_Write_Registry;

  PROCEDURE Write_Registry( RegPath         IN   VARCHAR2,
                            RegEntry        IN   VARCHAR2, 
                            RegValue        IN   VARCHAR2, 
                            RaiseExceptions IN   BOOLEAN DEFAULT FALSE) is
  begin
    Wrap_Write_Registry('Write_Registry',RegPath, RegEntry,RegValue,CLIENT_WIN_API.REG_SZ, RaiseExceptions);
  end Write_Registry;

  PROCEDURE Write_RegistryEx(  RegPath         IN  VARCHAR2,
                               RegEntry        IN  VARCHAR2, 
                               RegValue        IN  VARCHAR2, 
                               RegFormat       IN  PLS_INTEGER,
                               RaiseExceptions IN  BOOLEAN DEFAULT FALSE) is
  begin
    Wrap_Write_Registry('Write_RegistryEx',RegPath, RegEntry,RegValue,RegFormat, RaiseExceptions);
  end Write_RegistryEx;

  PROCEDURE Wrap_Maint_Registry(  CalledBy        IN   VARCHAR2,
                                  RegPath         IN   VARCHAR2,
                                  Opt             IN  PLS_INTEGER,
                                  RaiseExceptions IN  BOOLEAN DEFAULT FALSE) is
    vcOp       VARCHAR2(10);
    vcBuff1    VARCHAR2(512);
    vcRoot     VARCHAR2(20);
    iBuff1     PLS_INTEGER;
    iRC        PLS_INTEGER;
    args      WEBUTIL_C_API.ParameterList;
    param1    WEBUTIL_C_API.ParameterHandle;
    param2    WEBUTIL_C_API.ParameterHandle;   
    param3    WEBUTIL_C_API.ParameterHandle;   
  begin 
    Client_Win_API.Clean_Error_Stack;
    iRC  := 0;
    if Client_Win_API.API_ENABLED then 
      Client_win_api.Register_function_call(iMaintRegKey,'d2kwutil_MaintRegKey','INT','INT,*CHAR,INT');  
      -- Which Root?
      vcRoot  := upper(substr(RegPath,1,instr(RegPath,'\')-1));
      if      vcRoot =  'HKEY_LOCAL_MACHINE' then 
        iBuff1 := 0;
      elsif   vcRoot =  'HKEY_CLASSES_ROOT' then 
        iBuff1 := 1;
      elsif   vcRoot =  'HKEY_CURRENT_USER' then 
        iBuff1 := 2;
      elsif   vcRoot =  'HKEY_USERS' then
        iBuff1 := 3;
      else
        CLIENT_Win_API.Add_error(CalledBy,'Invalid Registry Key '||RegPath);
        if  RaiseExceptions then
          raise NO_DATA_FOUND;
        end if;  
      end if;

      vcBuff1    := substr(RegPath,instr(RegPath,'\')+1);

      if opt = 0 then
        vcOp := 'Create';
      else
        vcOp := 'Delete';
        if (instr(vcBuff1,'\') = 0) and iBuff1 <> 1 then
              CLIENT_Win_API.Add_error(CalledBy,'You Probably don''t want to delete something this high in the Registry hierachy: '||RegPath);
              raise NO_DATA_FOUND;
        end if;
      end if;
      args := WEBUTIL_C_API.Create_Parameter_List;
      param1 := WEBUTIL_C_API.Add_Parameter(args,
                                      WEBUTIL_C_API.C_INT,
                                      WEBUTIL_C_API.param_IN,
                                      iBuff1);
      param2 := WEBUTIL_C_API.Add_Parameter(args,
                                      WEBUTIL_C_API.C_CHAR_PTR,
                                      WEBUTIL_C_API.param_IN,
                                      vcBuff1,
                                      512);
      param3 := WEBUTIL_C_API.Add_Parameter(args,
                                      WEBUTIL_C_API.C_INT,
                                      WEBUTIL_C_API.param_IN,
                                      opt);   
      iRC := WebUtil_C_API.Invoke_int(Client_win_api.FunctionHandle(iMaintRegKey),args);
      WEBUTIL_C_API.Destroy_Parameter_List(args);  
      --iRC   := d2kwutil_MaintRegKey(Client_win_api.FunctionHandle(iMaintRegKey),iBuff1,vcBuff1,opt);
    else 
      raise CLIENT_WIN_API.NOT_AVAILABLE;
    end if;  
    if iRC <> 0  then 
      CLIENT_Win_API.Add_error(CalledBy,'Cannot '||vcOp||' Registry Key '||RegPath|| ' (Error code = '||to_char(iRC)||')');
      if  RaiseExceptions then
        raise NO_DATA_FOUND;
      end if;
    end if;
  exception
    when NO_DATA_FOUND then 
      if RaiseExceptions then 
        raise;
      end if;
    when CLIENT_WIN_API.NOT_AVAILABLE then
      CLIENT_Win_API.Add_error(CalledBy,CLIENT_Win_API.NoAPI);
      raise;
    when others then 
      CLIENT_Win_API.Add_error(CalledBy,CLIENT_Win_API.UError||CLIENT_WIN_API.Add_External_errors); 
      raise;
  end Wrap_Maint_Registry;

  PROCEDURE Create_Registry_Key(  RegPath         IN   VARCHAR2,
                                  RaiseExceptions IN  BOOLEAN DEFAULT FALSE) is
  begin
    Wrap_Maint_Registry('Create_Registry_Key',RegPath,0,RaiseExceptions);
  end;


  PROCEDURE Delete_Registry_Key(  RegPath         IN   VARCHAR2,
                                  RaiseExceptions IN  BOOLEAN DEFAULT FALSE) is
  begin
    Wrap_Maint_Registry('Delete_Registry_Key',RegPath,1,RaiseExceptions);
  end;


  FUNCTION Get_Working_Directory ( RaiseExceptions   IN  BOOLEAN DEFAULT FALSE)  RETURN VARCHAR2 is
    vcBuff1    VARCHAR2(512);
    iRC        PLS_INTEGER;
    args      WEBUTIL_C_API.ParameterList;
    param1    WEBUTIL_C_API.ParameterHandle;
    param2    WEBUTIL_C_API.ParameterHandle;    
  begin
    Client_Win_API.Clean_Error_Stack;
    iRC  := 0;
    if Client_Win_API.API_ENABLED then 
      Client_win_api.Register_function_call(iGetWorkingDirectory,'d2kwutil_GetWorkingDirectory','INT','*CHAR,INT');

      vcBuff1    := '';
      args := WEBUTIL_C_API.Create_Parameter_List;
      param1 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_INOUT,
                                            vcBuff1,
                                            512);
      param2 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_INT,
                                            WEBUTIL_C_API.param_IN,
                                            512);
      iRC := WebUtil_C_API.Invoke_Int(Client_win_api.FunctionHandle(iGetWorkingDirectory),args);
      vcBuff1 := WEBUTIL_C_API.Get_Parameter_String(args,param1);
      WEBUTIL_C_API.Destroy_Parameter_List(args);          
      --iRC   := d2kwutil_GetWorkingDirectory(Client_win_api.FunctionHandle(iGetWorkingDirectory),vcBuff1,512);          
    else
      raise CLIENT_WIN_API.NOT_AVAILABLE;
    end if;  
    if iRC = 0 then 
      CLIENT_Win_API.Add_error('Get_Working_Directory','No Value Returned');
      if RaiseExceptions then
        raise NO_DATA_FOUND;
      else
        return NULL;
      end if;
    else
      return CLIENT_WIN_API.StripDirSep(vcBuff1);
    end if;
  exception
    when NO_DATA_FOUND then 
      raise;
    when CLIENT_WIN_API.NOT_AVAILABLE then
      CLIENT_Win_API.Add_error('Get_Working_Directory',CLIENT_Win_API.NoAPI);
      raise;
    when others then 
      CLIENT_Win_API.Add_error('Get_Working_Directory',CLIENT_Win_API.UError||CLIENT_WIN_API.Add_External_errors); 
      raise;
  end Get_Working_Directory;

  FUNCTION Get_Computer_Name ( RaiseExceptions   IN  BOOLEAN DEFAULT FALSE)  RETURN VARCHAR2 is
    vcBuff1    VARCHAR2(512);
    iBuff1     PLS_INTEGER := 512;
    iRC        PLS_INTEGER := 0;
    args      WEBUTIL_C_API.ParameterList;
    param1    WEBUTIL_C_API.ParameterHandle;
    param2    WEBUTIL_C_API.ParameterHandle;   
  begin 
    Client_Win_API.Clean_Error_Stack;
    if Client_Win_API.API_ENABLED then 
      Client_win_api.Register_function_call(iGetComputerName,'d2kwutil_GetComputerName','INT','*CHAR,*LONG');

      vcBuff1    := '';
      args := WEBUTIL_C_API.Create_Parameter_List;
      param1 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_INOUT,
                                            vcBuff1,
                                            512);
      param2 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_INT_PTR,
                                            WEBUTIL_C_API.param_INOUT,
                                            iBuff1);
      iRC := WebUtil_C_API.Invoke_Int(Client_win_api.FunctionHandle(iGetComputerName),args);
      vcBuff1 := WEBUTIL_C_API.Get_Parameter_String(args,param1);
      WEBUTIL_C_API.Destroy_Parameter_List(args);     
      --iRC   := d2kwutil_GetComputerName(Client_win_api.FunctionHandle(iGetComputerName),vcBuff1,iBuff1);
    else
      raise CLIENT_WIN_API.NOT_AVAILABLE;
    end if;  
    if iRC = 0 then 
      CLIENT_Win_API.Add_error('Get_Computer_Name','No Value Returned');
      if RaiseExceptions then
        raise NO_DATA_FOUND;
      else
        return NULL;
      end if;
    else
      return vcBuff1;
    end if;
  exception
    when NO_DATA_FOUND then 
      raise;
    when CLIENT_WIN_API.NOT_AVAILABLE then
      CLIENT_Win_API.Add_error('GetComputer_Name',CLIENT_Win_API.NoAPI);
      raise;
    when others then 
      CLIENT_Win_API.Add_error('Get_Computer_Name',CLIENT_Win_API.UError||CLIENT_WIN_API.Add_External_errors); 
      raise;
  end Get_Computer_Name;

  FUNCTION Get_Windows_Version RETURN VARCHAR2 is
    iRC        PLS_INTEGER := 0;
    rcBuff     VARCHAR2(30);
    vcBuff1    VARCHAR2(30) := ''; 
    vcBuff2    VARCHAR2(16) := '';
    args      WEBUTIL_C_API.ParameterList;
    param1    WEBUTIL_C_API.ParameterHandle;
    param2    WEBUTIL_C_API.ParameterHandle;   
  begin 
    Client_Win_API.Clean_Error_Stack;
    if Client_Win_API.API_ENABLED then 
      Client_win_api.Register_function_call(iGetWindowsVersion,'d2kwutil_GetWindowsVersion','INT','*CHAR,*CHAR');
      args := WEBUTIL_C_API.Create_Parameter_List;
      param1 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_INOUT,
                                            vcBuff1,
                                            30);
      param2 := WEBUTIL_C_API.Add_Parameter(args,
                                            WEBUTIL_C_API.C_CHAR_PTR,
                                            WEBUTIL_C_API.param_INOUT,
                                            vcBuff2,
                                            16);
      iRC := WebUtil_C_API.Invoke_Int(Client_win_api.FunctionHandle(iGetWindowsVersion),args);
      vcBuff1 := WEBUTIL_C_API.Get_Parameter_String(args,param1);
      vcBuff2 := WEBUTIL_C_API.Get_Parameter_String(args,param2);    
      WEBUTIL_C_API.Destroy_Parameter_List(args);     
    
      --iRC   := d2kwutil_GetWindowsVersion(Client_win_api.FunctionHandle(iGetWindowsVersion),vcBuff1,vcBuff2);
    else
      raise CLIENT_WIN_API.NOT_AVAILABLE;
    end if; 

    if iRC = 1 and vcBuff2 = '1998' then
      rcBuff := 'Windows98';
    elsif iRC = 1 then 
      rcBuff := 'Windows95';
    elsif iRC = 2  and substr(vcBuff1,1,1) = '5' then 
      rcBuff := 'Windows2000';
    elsif iRC = 2 then 
      rcBuff := 'WindowsNT';
    else
      rcBuff := 'Unknown Type: '||to_char(iRC)||' BuildInfo: '||vcBuff1;
    end if;

    return rcBuff;
  exception
    when CLIENT_WIN_API.NOT_AVAILABLE then
      CLIENT_Win_API.Add_error('Get_Windows_Version',CLIENT_Win_API.NoAPI);
      raise;
    when others then 
      CLIENT_Win_API.Add_error('Get_Windows_Version',CLIENT_Win_API.UError||CLIENT_WIN_API.Add_External_errors); 
      raise;
  end Get_Windows_Version;

END CLIENT_WIN_API_ENVIRONMENT;
		*/
				//  Constants for maintaining the Function Handle Array
		//  These should be unique through the Whole Library
		//  Environment has indexes in the range 300 - 399
		public final NInteger IREADINIFILE = toInt(300);
		public final NInteger IWRITEINIFILE = toInt(301);
		public final NInteger IGETREGKEY = toInt(302);
		public final NInteger ISETREGKEY = toInt(303);
		public final NInteger IGETWINUSER = toInt(304);
		public final NInteger IGETDOSENV = toInt(305);
		public final NInteger IWINDIR = toInt(306);
		public final NInteger ITMPDIR = toInt(307);
		public final NInteger IWNETGETCONNECTION = toInt(308);
		public final NInteger IGETWORKINGDIRECTORY = toInt(309);
		public final NInteger ISETWORKINGDIRECTORY = toInt(310);
		public final NInteger IGETCOMPUTERNAME = toInt(311);
		public final NInteger IGETWINDOWSVERSION = toInt(312);
		public final NInteger IMAINTREGKEY = toInt(313);
/* <p>
		*  Public Bodies 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param filename
		* @param section
		* @param entry
		*/
		public NString readIniFile(NString filename, NString section, NString entry) {
			return readIniFile(filename, section, entry, toBool(NBool.False));
		}

/* <p>
		*  Public Bodies 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param filename
		* @param section
		* @param entry
		* @param raiseexceptions
		*/
		public NString readIniFile(NString filename, NString section, NString entry, NBool raiseexceptions)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString DEFAULT_PLACEHOLDER = toStr("D2KWUTIL_EMPTY");
//			NString vcbuff1= NString.getNull();
//			NString vcbuff2= NString.getNull();
//			NString vcbuff3= NString.getNull();
//			NString vcbuff4= NString.getNull();
//			NString vcbuff5= NString.getNull();
//			NInteger irc= NInteger.getNull();
//			UnknownTypes.WebutilCApiParameterlist args= null;
//			UnknownTypes.WebutilCApiParameterhandle param1= null;
//			UnknownTypes.WebutilCApiParameterhandle param2= null;
//			UnknownTypes.WebutilCApiParameterhandle param3= null;
//			UnknownTypes.WebutilCApiParameterhandle param4= null;
//			UnknownTypes.WebutilCApiParameterhandle param5= null;
//			UnknownTypes.WebutilCApiParameterhandle param6= null;
//			try
//			{
//				getContainer().getClientWinApi().cleanErrorStack();
//				irc = toInt(0);
//				if ( getContainer().getClientWinApi().apiEnabled.getValue() )
//				{
//					getContainer().getClientWinApi().registerFunctionCall(IREADINIFILE, toStr("d2kwutil_ReadINIFile"), toStr("INT"), toStr("*CHAR,*CHAR,*CHAR,*CHAR,*CHAR,INT"));
//					vcbuff1 = filename;
//					vcbuff2 = section;
//					vcbuff3 = entry;
//					vcbuff4 = toStr("");
//					vcbuff5 = DEFAULT_PLACEHOLDER;
//					args = getContainer().getWebutilCApi().createParameterList();
//					param1 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_IN, vcbuff1, 512);
//					param2 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_IN, vcbuff2, 512);
//					param3 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_IN, vcbuff3, 512);
//					param4 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_INOUT, vcbuff4, 512);
//					param5 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_IN, vcbuff5, 18);
//					param6 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_INT, getWebutilcapi().PARAM_IN, );
//					irc = getContainer().getWebutilCApi().invokeInt(getContainer().getClientWinApi().functionhandle(IREADINIFILE), args);
//					vcbuff4 = getContainer().getWebutilCApi().getParameterString(args, param4);
//					getContainer().getWebutilCApi().destroyParameterList(args);
//				}
//				else {
//					throw new getClientwinapi().NotAvailable();
//				}
//				if ( irc.equals(0) || vcbuff4.equals(DEFAULT_PLACEHOLDER) )
//				{
//					getContainer().getClientWinApi().addError(toStr("Read_INI_File"), toStr("Unable to obtain ").append(entry).append(" from the [").append(section).append("] section of ").append(filename));
//					if ( raiseexceptions.not() )
//					{
//						return NString.getNull();
//					}
//					else {
//						throw new NoDataFoundException();
//					}
//				}
//				else {
//					return vcbuff4;
//				}
//			}
//			catch(NoDataFoundException e)
//			{
//				throw  e;
//			}
//			catch(getClientwinapi().NotAvailable e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Read_INI_File"), getClientwinapi().NOAPI);
//				throw  e;
//			}
//			catch(Exception  e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Read_INI_File"), getClientwinapi().UERROR.append(getContainer().getClientWinApi().addExternalErrors()));
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : readIniFile function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param filename
		* @param section
		* @param entry
		* @param value
		*/
		public void writeIniFile(NString filename, NString section, NString entry, NString value) {
			writeIniFile(filename, section, entry, value, toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param filename
		* @param section
		* @param entry
		* @param value
		* @param raiseexceptions
		*/
		public void writeIniFile(NString filename, NString section, NString entry, NString value, NBool raiseexceptions)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vcbuff1= NString.getNull();
//			NString vcbuff2= NString.getNull();
//			NString vcbuff3= NString.getNull();
//			NString vcbuff4= NString.getNull();
//			NInteger irc= NInteger.getNull();
//			UnknownTypes.WebutilCApiParameterlist args= null;
//			UnknownTypes.WebutilCApiParameterhandle param1= null;
//			UnknownTypes.WebutilCApiParameterhandle param2= null;
//			UnknownTypes.WebutilCApiParameterhandle param3= null;
//			UnknownTypes.WebutilCApiParameterhandle param4= null;
//			try
//			{
//				getContainer().getClientWinApi().cleanErrorStack();
//				irc = toInt(0);
//				if ( getContainer().getClientWinApi().apiEnabled.getValue() )
//				{
//					getContainer().getClientWinApi().registerFunctionCall(IWRITEINIFILE, toStr("d2kwutil_WriteINIFile"), toStr("INT"), toStr("*CHAR,*CHAR,*CHAR,*CHAR"));
//					vcbuff1 = filename;
//					vcbuff2 = section;
//					vcbuff3 = entry;
//					vcbuff4 = value;
//					args = getContainer().getWebutilCApi().createParameterList();
//					param1 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_IN, vcbuff1, 512);
//					param2 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_IN, vcbuff2, 512);
//					param3 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_IN, vcbuff3, 512);
//					param4 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_IN, vcbuff4, 512);
//					irc = getContainer().getWebutilCApi().invokeInt(getContainer().getClientWinApi().functionhandle(IWRITEINIFILE), args);
//					getContainer().getWebutilCApi().destroyParameterList(args);
//				}
//				else {
//					throw new getClientwinapi().NotAvailable();
//				}
//				if ( irc.equals(0) )
//				{
//					getContainer().getClientWinApi().addError(toStr("Write_INI_File"), toStr("Unable to set the value of ").append(entry).append(" in the [").append(section).append("] section of ").append(filename));
//					if ( raiseexceptions.getValue() )
//					{
//						throw new NoDataFoundException();
//					}
//				}
//			}
//			catch(NoDataFoundException e)
//			{
//				throw  e;
//			}
//			catch(getClientwinapi().NotAvailable e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Write_INI_File"), getClientwinapi().NOAPI);
//				throw  e;
//			}
//			catch(Exception  e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Write_INI_File"), getClientwinapi().UERROR.append(getContainer().getClientWinApi().addExternalErrors()));
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : writeIniFile procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getWindowsUsername() {
			return getWindowsUsername(toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param raiseexceptions
		*/
		public NString getWindowsUsername(NBool raiseexceptions)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vcbuff1= NString.getNull();
//			NInteger irc= NInteger.getNull();
//			UnknownTypes.WebutilCApiParameterlist args= null;
//			UnknownTypes.WebutilCApiParameterhandle param1= null;
//			UnknownTypes.WebutilCApiParameterhandle param2= null;
//			try
//			{
//				getContainer().getClientWinApi().cleanErrorStack();
//				irc = toInt(0);
//				if ( getContainer().getClientWinApi().apiEnabled.getValue() )
//				{
//					getContainer().getClientWinApi().registerFunctionCall(IGETWINUSER, toStr("d2kwutil_GetWinuser"), toStr("INT"), toStr("*CHAR,INT"));
//					vcbuff1 = toStr("");
//					args = getContainer().getWebutilCApi().createParameterList();
//					param1 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_INOUT, vcbuff1, 512);
//					param2 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_INT, getWebutilcapi().PARAM_IN, );
//					irc = getContainer().getWebutilCApi().invokeInt(getContainer().getClientWinApi().functionhandle(IGETWINUSER), args);
//					vcbuff1 = getContainer().getWebutilCApi().getParameterString(args, param1);
//					getContainer().getWebutilCApi().destroyParameterList(args);
//				}
//				else {
//					throw new getClientwinapi().NotAvailable();
//				}
//				if ( irc.equals(0) )
//				{
//					getContainer().getClientWinApi().addError(toStr("Get_Windows_Username"), toStr("No Value Returned"));
//					if ( raiseexceptions.getValue() )
//					{
//						throw new NoDataFoundException();
//					}
//					else {
//						return vcbuff1;
//					}
//				}
//				else {
//					return vcbuff1;
//				}
//			}
//			catch(NoDataFoundException e)
//			{
//				throw  e;
//			}
//			catch(getClientwinapi().NotAvailable e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Get_Windows_Username"), getClientwinapi().NOAPI);
//				throw  e;
//			}
//			catch(Exception  e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Get_Windows_Username"), getClientwinapi().UERROR.append(getContainer().getClientWinApi().addExternalErrors()));
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : getWindowsUsername function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getWindowsDirectory() {
			return getWindowsDirectory(toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param raiseexceptions
		*/
		public NString getWindowsDirectory(NBool raiseexceptions)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vcbuff1= NString.getNull();
//			NInteger irc= NInteger.getNull();
//			UnknownTypes.WebutilCApiParameterlist args= null;
//			UnknownTypes.WebutilCApiParameterhandle param1= null;
//			UnknownTypes.WebutilCApiParameterhandle param2= null;
//			try
//			{
//				getContainer().getClientWinApi().cleanErrorStack();
//				irc = toInt(0);
//				if ( getContainer().getClientWinApi().apiEnabled.getValue() )
//				{
//					getContainer().getClientWinApi().registerFunctionCall(IWINDIR, toStr("d2kwutil_WinDir"), toStr("INT"), toStr("*CHAR,INT"));
//					vcbuff1 = toStr("");
//					args = getContainer().getWebutilCApi().createParameterList();
//					param1 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_INOUT, vcbuff1, 512);
//					param2 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_INT, getWebutilcapi().PARAM_IN, );
//					irc = getContainer().getWebutilCApi().invokeInt(getContainer().getClientWinApi().functionhandle(IWINDIR), args);
//					vcbuff1 = getContainer().getWebutilCApi().getParameterString(args, param1);
//					getContainer().getWebutilCApi().destroyParameterList(args);
//				}
//				else {
//					throw new getClientwinapi().NotAvailable();
//				}
//				if ( irc.equals(0) )
//				{
//					getContainer().getClientWinApi().addError(toStr("Get_Windows_Directory"), toStr("No Value Returned"));
//					if ( raiseexceptions.getValue() )
//					{
//						throw new NoDataFoundException();
//					}
//					else {
//						return NString.getNull();
//					}
//				}
//				else {
//					return getContainer().getClientWinApi().stripdirsep(vcbuff1);
//				}
//			}
//			catch(NoDataFoundException e)
//			{
//				throw  e;
//			}
//			catch(getClientwinapi().NotAvailable e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Get_Windows_Directory"), getClientwinapi().NOAPI);
//				throw  e;
//			}
//			catch(Exception  e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Get_Windows_Directory"), getClientwinapi().UERROR.append(getContainer().getClientWinApi().addExternalErrors()));
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : getWindowsDirectory function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getTempDirectory() {
			return getTempDirectory(toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param raiseexceptions
		*/
		public NString getTempDirectory(NBool raiseexceptions)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vcbuff1= NString.getNull();
//			NInteger irc= NInteger.getNull();
//			UnknownTypes.WebutilCApiParameterlist args= null;
//			UnknownTypes.WebutilCApiParameterhandle param1= null;
//			UnknownTypes.WebutilCApiParameterhandle param2= null;
//			try
//			{
//				getContainer().getClientWinApi().cleanErrorStack();
//				irc = toInt(0);
//				if ( getContainer().getClientWinApi().apiEnabled.getValue() )
//				{
//					getContainer().getClientWinApi().registerFunctionCall(ITMPDIR, toStr("d2kwutil_TmpDir"), toStr("INT"), toStr("*CHAR,INT"));
//					vcbuff1 = toStr("");
//					args = getContainer().getWebutilCApi().createParameterList();
//					param1 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_INOUT, vcbuff1, 512);
//					param2 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_INT, getWebutilcapi().PARAM_IN, );
//					irc = getContainer().getWebutilCApi().invokeInt(getContainer().getClientWinApi().functionhandle(ITMPDIR), args);
//					vcbuff1 = getContainer().getWebutilCApi().getParameterString(args, param1);
//					getContainer().getWebutilCApi().destroyParameterList(args);
//				}
//				else {
//					throw new getClientwinapi().NotAvailable();
//				}
//				if ( irc.equals(0) )
//				{
//					getContainer().getClientWinApi().addError(toStr("Get_Temp_Directory"), toStr("No Value Returned"));
//					if ( raiseexceptions.getValue() )
//					{
//						throw new NoDataFoundException();
//					}
//					else {
//						return NString.getNull();
//					}
//				}
//				else {
//					return getContainer().getClientWinApi().stripdirsep(vcbuff1);
//				}
//			}
//			catch(NoDataFoundException e)
//			{
//				throw  e;
//			}
//			catch(getClientwinapi().NotAvailable e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Get_Temp_Directory"), getClientwinapi().NOAPI);
//				throw  e;
//			}
//			catch(Exception  e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Get_Temp_Directory"), getClientwinapi().UERROR.append(getContainer().getClientWinApi().addExternalErrors()));
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : getTempDirectory function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param variablename
		*/
		public NString getEnvironmentString(NString variablename) {
			return getEnvironmentString(variablename, toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param variablename
		* @param raiseexceptions
		*/
		public NString getEnvironmentString(NString variablename, NBool raiseexceptions)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vcbuff1= NString.getNull();
//			NNumber imaxoutbuff = toNumber(2000);
//			NString vcbuff2= NString.getNull();
//			//  keep the length same as iMaxOutBuff
//			NInteger irc= NInteger.getNull();
//			UnknownTypes.WebutilCApiParameterlist args= null;
//			UnknownTypes.WebutilCApiParameterhandle param1= null;
//			UnknownTypes.WebutilCApiParameterhandle param2= null;
//			UnknownTypes.WebutilCApiParameterhandle param3= null;
//			try
//			{
//				getContainer().getClientWinApi().cleanErrorStack();
//				irc = toInt(0);
//				if ( getContainer().getClientWinApi().apiEnabled.getValue() )
//				{
//					getContainer().getClientWinApi().registerFunctionCall(IGETDOSENV, toStr("d2kwutil_GetDOSEnv"), toStr("LONG"), toStr("*CHAR,*CHAR,LONG"));
//					vcbuff1 = toStr("%").append(ltrim(rtrim(variablename))).append("%");
//					args = getContainer().getWebutilCApi().createParameterList();
//					param1 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_IN, vcbuff1, 512);
//					param2 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_OUT, vcbuff2, imaxoutbuff);
//					param3 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_INT, getWebutilcapi().PARAM_IN, imaxoutbuff);
//					irc = getContainer().getWebutilCApi().invokeInt(getContainer().getClientWinApi().functionhandle(IGETDOSENV), args);
//					if ( irc.greater(imaxoutbuff) )
//					{
//						//  expanded variable value is too long.
//						getContainer().getWebutilCore().error(getWebutilcore().WUL_PACKAGE, toInt(941), toStr("CLIENT_WIN_API_ENVIRONMENT.GET_ENVIRONMENT_STRING"), toStr(imaxoutbuff), toStr(irc));
//					}
//					vcbuff2 = getContainer().getWebutilCApi().getParameterString(args, param2);
//					getContainer().getWebutilCApi().destroyParameterList(args);
//				}
//				else {
//					throw new getClientwinapi().NotAvailable();
//				}
//				if ( irc.equals(0) || irc.greater(imaxoutbuff) || vcbuff1.equals(vcbuff2) )
//				{
//					getContainer().getClientWinApi().addError(toStr("Get_Environment_String"), toStr("Unable to get the value of the variable ").append(variablename));
//					if ( raiseexceptions.getValue() )
//					{
//						throw new NoDataFoundException();
//					}
//					else {
//						return NString.getNull();
//					}
//				}
//				else {
//					return vcbuff2;
//				}
//			}
//			catch(NoDataFoundException e)
//			{
//				throw  e;
//			}
//			catch(getClientwinapi().NotAvailable e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Get_Environment_String"), getClientwinapi().NOAPI);
//				throw  e;
//			}
//			catch(Exception  e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Get_Environment_String"), getClientwinapi().UERROR.append(getContainer().getClientWinApi().addExternalErrors()));
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : getEnvironmentString function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param driveletter
		*/
		public NString getNetConnection(NString driveletter) {
			return getNetConnection(driveletter, toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param driveletter
		* @param raiseexceptions
		*/
		public NString getNetConnection(NString driveletter, NBool raiseexceptions)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vcbuff1= NString.getNull();
//			NString vcbuff2= NString.getNull();
//			NInteger ibuff1= NInteger.getNull();
//			NInteger irc= NInteger.getNull();
//			UnknownTypes.WebutilCApiParameterlist args= null;
//			UnknownTypes.WebutilCApiParameterhandle param1= null;
//			UnknownTypes.WebutilCApiParameterhandle param2= null;
//			UnknownTypes.WebutilCApiParameterhandle param3= null;
//			try
//			{
//				getContainer().getClientWinApi().cleanErrorStack();
//				irc = toInt(0);
//				if ( getContainer().getClientWinApi().apiEnabled.getValue() )
//				{
//					getContainer().getClientWinApi().registerFunctionCall(IWNETGETCONNECTION, toStr("d2kwutil_WNetGetConnection"), toStr("INT"), toStr("*CHAR,*CHAR,*LONG"));
//					vcbuff1 = substring(driveletter, toInt(1), inStr(driveletter, toStr(":")));
//					vcbuff2 = toStr("");
//					ibuff1 = toInt(512);
//					args = getContainer().getWebutilCApi().createParameterList();
//					param1 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_IN, vcbuff1, 2);
//					param2 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_INOUT, vcbuff2, 512);
//					param3 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_INT_PTR, getWebutilcapi().PARAM_IN, ibuff1);
//					irc = getContainer().getWebutilCApi().invokeInt(getContainer().getClientWinApi().functionhandle(IWNETGETCONNECTION), args);
//					vcbuff2 = getContainer().getWebutilCApi().getParameterString(args, param2);
//					getContainer().getWebutilCApi().destroyParameterList(args);
//				}
//				else {
//					throw new getClientwinapi().NotAvailable();
//				}
//				if ( irc.notEquals(0) )
//				{
//					getContainer().getClientWinApi().addError(toStr("Get_Net_Connection"), toStr("Unable to expand \"").append(vcbuff1).append("\" into a network path (Return Code=").append(toChar(irc)).append(")"));
//					if ( raiseexceptions.not() )
//					{
//						return NString.getNull();
//					}
//					else {
//						throw new NoDataFoundException();
//					}
//				}
//				else {
//					return vcbuff2;
//				}
//			}
//			catch(NoDataFoundException e)
//			{
//				throw  e;
//			}
//			catch(getClientwinapi().NotAvailable e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Get_Net_Connection"), getClientwinapi().NOAPI);
//				throw  e;
//			}
//			catch(Exception  e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Get_Net_Connection"), getClientwinapi().UERROR.append(getContainer().getClientWinApi().addExternalErrors()));
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : getNetConnection function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param regpath
		* @param regentry
		*/
		public NString readRegistry(NString regpath, NString regentry) {
			return readRegistry(regpath, regentry, toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param regpath
		* @param regentry
		* @param raiseexceptions
		*/
		public NString readRegistry(NString regpath, NString regentry, NBool raiseexceptions)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vcbuff1= NString.getNull();
//			NString vcbuff2= NString.getNull();
//			NString vcbuff3= NString.getNull();
//			NString vcroot= NString.getNull();
//			NInteger ibuff1= NInteger.getNull();
//			NInteger ibuff2= NInteger.getNull();
//			NInteger ibuff3= NInteger.getNull();
//			NInteger irc= NInteger.getNull();
//			UnknownTypes.WebutilCApiParameterlist args= null;
//			UnknownTypes.WebutilCApiParameterhandle param1= null;
//			UnknownTypes.WebutilCApiParameterhandle param2= null;
//			UnknownTypes.WebutilCApiParameterhandle param3= null;
//			UnknownTypes.WebutilCApiParameterhandle param4= null;
//			UnknownTypes.WebutilCApiParameterhandle param5= null;
//			UnknownTypes.WebutilCApiParameterhandle param6= null;
//			try
//			{
//				getContainer().getClientWinApi().cleanErrorStack();
//				irc = toInt(0);
//				if ( getContainer().getClientWinApi().apiEnabled.getValue() )
//				{
//					getContainer().getClientWinApi().registerFunctionCall(IGETREGKEY, toStr("d2kwutil_GetRegKey"), toStr("INT"), toStr("INT,*CHAR,*CHAR,*CHAR,INT,INT"));
//					//  Which Root?
//					vcroot = upper(substring(regpath, toInt(1), inStr(regpath, toStr("\\")).subtract(1)));
//					if ( vcroot.equals("HKEY_LOCAL_MACHINE") )
//					{
//						ibuff1 = toInt(0);
//					}
//					else if ( vcroot.equals("HKEY_CLASSES_ROOT") ) {
//						ibuff1 = toInt(1);
//					}
//					else if ( vcroot.equals("HKEY_CURRENT_USER") ) {
//						ibuff1 = toInt(2);
//					}
//					else if ( vcroot.equals("HKEY_USERS") ) {
//						ibuff1 = toInt(3);
//					}
//					else if ( vcroot.equals("HKEY_CURRENT_CONFIG") ) {
//						ibuff1 = toInt(4);
//					}
//					else {
//						getContainer().getClientWinApi().addError(toStr("Read_Registry"), toStr("Invalid Registry Key ").append(regpath));
//						if ( raiseexceptions.getValue() )
//						{
//							throw new NoDataFoundException();
//						}
//					}
//					ibuff2 = toInt(2000);
//					//  Length of buffer 
//					vcbuff1 = substring(regpath, inStr(regpath, toStr("\\")).add(1));
//					vcbuff2 = regentry;
//					vcbuff3 = toStr("");
//					if ( getContainer().getClientWinApi().compatExpandRegValues.not() )
//					{
//						ibuff3 = toInt(1);
//					}
//					else {
//						ibuff3 = toInt(0);
//					}
//					args = getContainer().getWebutilCApi().createParameterList();
//					param1 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_INT, getWebutilcapi().PARAM_IN, ibuff1);
//					param2 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_IN, vcbuff1, 512);
//					param3 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_IN, vcbuff2, 512);
//					param4 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_INOUT, vcbuff3, 2000);
//					param5 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_INT, getWebutilcapi().PARAM_IN, ibuff2);
//					param6 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_INT, getWebutilcapi().PARAM_IN, ibuff3);
//					irc = getContainer().getWebutilCApi().invokeInt(getContainer().getClientWinApi().functionhandle(IGETREGKEY), args);
//					vcbuff3 = getContainer().getWebutilCApi().getParameterString(args, param4);
//					getContainer().getWebutilCApi().destroyParameterList(args);
//				}
//				else {
//					throw new getClientwinapi().NotAvailable();
//				}
//				if ( irc.equals(- (1)) )
//				{
//					getContainer().getClientWinApi().addError(toStr("Read_Registry"), toStr("Cannot read  entry ").append(regpath).append("->").append(regentry));
//					if ( raiseexceptions.not() )
//					{
//						return NString.getNull();
//					}
//					else {
//						throw new NoDataFoundException();
//					}
//				}
//				else if ( irc.equals(- (2)) ) {
//					getContainer().getClientWinApi().addError(toStr("Read_Registry"), regpath.append("->").append(regentry).append(" is an unsupported datatype"));
//					if ( raiseexceptions.not() )
//					{
//						return NString.getNull();
//					}
//					else {
//						throw new NoDataFoundException();
//					}
//				}
//				else if ( irc.equals(- (3)) ) {
//					getContainer().getClientWinApi().addError(toStr("Read_Registry"), regpath.append("->").append(regentry).append(" is longer than ").append(toChar(ibuff2)).append(" Bytes"));
//					if ( raiseexceptions.not() )
//					{
//						return NString.getNull();
//					}
//					else {
//						throw new ValueErrorException();
//					}
//				}
//				else if ( irc.equals(- (4)) ) {
//					getContainer().getClientWinApi().addError(toStr("Read_Registry"), regpath.append("->").append(regentry).append(" Failed to expand environment string"));
//					if ( raiseexceptions.not() )
//					{
//						return NString.getNull();
//					}
//					else {
//						throw new NoDataFoundException();
//					}
//				}
//				return vcbuff3;
//			}
//			catch(NoDataFoundException e)
//			{
//				throw  e;
//			}
//			catch(ValueErrorException e)
//			{
//				throw  e;
//			}
//			catch(getClientwinapi().NotAvailable e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Read_Registry"), getClientwinapi().NOAPI);
//				throw  e;
//			}
//			catch(Exception  e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Read_Registry"), getClientwinapi().UERROR.append(getContainer().getClientWinApi().addExternalErrors()));
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : readRegistry function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param calledby
		* @param regpath
		* @param regentry
		* @param regvalue
		* @param regformat
		*/
		public void wrapWriteRegistry(NString calledby, NString regpath, NString regentry, NString regvalue, NInteger regformat) {
			wrapWriteRegistry(calledby, regpath, regentry, regvalue, regformat, toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param calledby
		* @param regpath
		* @param regentry
		* @param regvalue
		* @param regformat
		* @param raiseexceptions
		*/
		public void wrapWriteRegistry(NString calledby, NString regpath, NString regentry, NString regvalue, NInteger regformat, NBool raiseexceptions)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vcbuff1= NString.getNull();
//			NString vcbuff2= NString.getNull();
//			NString vcbuff3= NString.getNull();
//			NString vcroot= NString.getNull();
//			NInteger ibuff1= NInteger.getNull();
//			NInteger ibuff2= NInteger.getNull();
//			NInteger ibuff3 = toInt(0);
//			NInteger irc= NInteger.getNull();
//			NInteger inullind = toInt(0);
//			UnknownTypes.WebutilCApiParameterlist args= null;
//			UnknownTypes.WebutilCApiParameterhandle param1= null;
//			UnknownTypes.WebutilCApiParameterhandle param2= null;
//			UnknownTypes.WebutilCApiParameterhandle param3= null;
//			UnknownTypes.WebutilCApiParameterhandle param4= null;
//			UnknownTypes.WebutilCApiParameterhandle param5= null;
//			UnknownTypes.WebutilCApiParameterhandle param6= null;
//			UnknownTypes.WebutilCApiParameterhandle param7= null;
//			try
//			{
//				getContainer().getClientWinApi().cleanErrorStack();
//				irc = toInt(0);
//				if ( getContainer().getClientWinApi().apiEnabled.getValue() )
//				{
//					getContainer().getClientWinApi().registerFunctionCall(ISETREGKEY, toStr("d2kwutil_SetRegKey"), toStr("INT"), toStr("INT,*CHAR,*CHAR,INT,*CHAR,LONG,INT"));
//					//  Which Root?
//					vcroot = upper(substring(regpath, toInt(1), inStr(regpath, toStr("\\")).subtract(1)));
//					if ( vcroot.equals("HKEY_LOCAL_MACHINE") )
//					{
//						ibuff1 = toInt(0);
//					}
//					else if ( vcroot.equals("HKEY_CLASSES_ROOT") ) {
//						ibuff1 = toInt(1);
//					}
//					else if ( vcroot.equals("HKEY_CURRENT_USER") ) {
//						ibuff1 = toInt(2);
//					}
//					else if ( vcroot.equals("HKEY_USERS") ) {
//						ibuff1 = toInt(3);
//					}
//					else if ( vcroot.equals("HKEY_CURRENT_CONFIG") ) {
//						ibuff1 = toInt(4);
//					}
//					else {
//						getContainer().getClientWinApi().addError(calledby, toStr("Invalid Registry Key ").append(regpath));
//						if ( raiseexceptions.getValue() )
//						{
//							throw new NoDataFoundException();
//						}
//					}
//					ibuff2 = regformat;
//					if ( regvalue.isNull() )
//					{
//						ibuff3 = toInt(0);
//						vcbuff3 = toStr(" ");
//						inullind = toInt(1);
//					}
//					else {
//						if ( regformat.equals(getClientwinapi().REG_DWORD) )
//						{
//							ibuff3 = trunc(abs(toNumber(regvalue)));
//							vcbuff3 = toStr(" ");
//							if ( ibuff3.greater(4294967295) )
//							{
//								throw new ValueErrorException();
//							}
//						}
//						else {
//							vcbuff3 = regvalue;
//						}
//					}
//					vcbuff1 = substring(regpath, inStr(regpath, toStr("\\")).add(1));
//					vcbuff2 = regentry;
//					args = getContainer().getWebutilCApi().createParameterList();
//					param1 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_INT, getWebutilcapi().PARAM_IN, ibuff1);
//					param2 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_IN, vcbuff1, 512);
//					param3 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_IN, vcbuff2, 512);
//					param4 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_INT, getWebutilcapi().PARAM_IN, ibuff2);
//					param5 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_IN, vcbuff3, 512);
//					param6 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_INT, getWebutilcapi().PARAM_IN, ibuff3);
//					param7 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_INT, getWebutilcapi().PARAM_IN, inullind);
//					irc = getContainer().getWebutilCApi().invokeInt(getContainer().getClientWinApi().functionhandle(ISETREGKEY), args);
//					getContainer().getWebutilCApi().destroyParameterList(args);
//				}
//				else {
//					throw new getClientwinapi().NotAvailable();
//				}
//				if ( irc.notEquals(0) )
//				{
//					getContainer().getClientWinApi().addError(calledby, toStr("Cannot set Registry Entry ").append(regpath).append("->").append(regentry).append(" to ").append(regvalue));
//					if ( raiseexceptions.getValue() )
//					{
//						throw new NoDataFoundException();
//					}
//				}
//			}
//			catch(NoDataFoundException e)
//			{
//				throw  e;
//			}
//			catch(ValueErrorException e)
//			{
//				getContainer().getClientWinApi().addError(calledby, toStr("The value being set exceeded the maximum for a DWORD (4,294,967,295)"));
//				throw  e;
//			}
//			catch(getClientwinapi().NotAvailable e)
//			{
//				getContainer().getClientWinApi().addError(calledby, getClientwinapi().NOAPI);
//				throw  e;
//			}
//			catch(Exception  e)
//			{
//				getContainer().getClientWinApi().addError(calledby, getClientwinapi().UERROR.append(getContainer().getClientWinApi().addExternalErrors()));
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : wrapWriteRegistry procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param regpath
		* @param regentry
		* @param regvalue
		*/
		public void writeRegistry(NString regpath, NString regentry, NString regvalue) {
			writeRegistry(regpath, regentry, regvalue, toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param regpath
		* @param regentry
		* @param regvalue
		* @param raiseexceptions
		*/
		public void writeRegistry(NString regpath, NString regentry, NString regvalue, NBool raiseexceptions)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			wrapWriteRegistry(toStr("Write_Registry"), regpath, regentry, regvalue, getClientwinapi().REG_SZ, raiseexceptions);
//
			this.getLogger().trace(this, "F2J : writeRegistry procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param regpath
		* @param regentry
		* @param regvalue
		* @param regformat
		*/
		public void writeRegistryex(NString regpath, NString regentry, NString regvalue, NInteger regformat) {
			writeRegistryex(regpath, regentry, regvalue, regformat, toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param regpath
		* @param regentry
		* @param regvalue
		* @param regformat
		* @param raiseexceptions
		*/
		public void writeRegistryex(NString regpath, NString regentry, NString regvalue, NInteger regformat, NBool raiseexceptions)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			wrapWriteRegistry(toStr("Write_RegistryEx"), regpath, regentry, regvalue, regformat, raiseexceptions);
//
			this.getLogger().trace(this, "F2J : writeRegistryex procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param calledby
		* @param regpath
		* @param opt
		*/
		public void wrapMaintRegistry(NString calledby, NString regpath, NInteger opt) {
			wrapMaintRegistry(calledby, regpath, opt, toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param calledby
		* @param regpath
		* @param opt
		* @param raiseexceptions
		*/
		public void wrapMaintRegistry(NString calledby, NString regpath, NInteger opt, NBool raiseexceptions)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vcop= NString.getNull();
//			NString vcbuff1= NString.getNull();
//			NString vcroot= NString.getNull();
//			NInteger ibuff1= NInteger.getNull();
//			NInteger irc= NInteger.getNull();
//			UnknownTypes.WebutilCApiParameterlist args= null;
//			UnknownTypes.WebutilCApiParameterhandle param1= null;
//			UnknownTypes.WebutilCApiParameterhandle param2= null;
//			UnknownTypes.WebutilCApiParameterhandle param3= null;
//			try
//			{
//				getContainer().getClientWinApi().cleanErrorStack();
//				irc = toInt(0);
//				if ( getContainer().getClientWinApi().apiEnabled.getValue() )
//				{
//					getContainer().getClientWinApi().registerFunctionCall(IMAINTREGKEY, toStr("d2kwutil_MaintRegKey"), toStr("INT"), toStr("INT,*CHAR,INT"));
//					//  Which Root?
//					vcroot = upper(substring(regpath, toInt(1), inStr(regpath, toStr("\\")).subtract(1)));
//					if ( vcroot.equals("HKEY_LOCAL_MACHINE") )
//					{
//						ibuff1 = toInt(0);
//					}
//					else if ( vcroot.equals("HKEY_CLASSES_ROOT") ) {
//						ibuff1 = toInt(1);
//					}
//					else if ( vcroot.equals("HKEY_CURRENT_USER") ) {
//						ibuff1 = toInt(2);
//					}
//					else if ( vcroot.equals("HKEY_USERS") ) {
//						ibuff1 = toInt(3);
//					}
//					else {
//						getContainer().getClientWinApi().addError(calledby, toStr("Invalid Registry Key ").append(regpath));
//						if ( raiseexceptions.getValue() )
//						{
//							throw new NoDataFoundException();
//						}
//					}
//					vcbuff1 = substring(regpath, inStr(regpath, toStr("\\")).add(1));
//					if ( opt.equals(0) )
//					{
//						vcop = toStr("Create");
//					}
//					else {
//						vcop = toStr("Delete");
//						if ( (inStr(vcbuff1, toStr("\\")).equals(0)) && ibuff1.notEquals(1) )
//						{
//							getContainer().getClientWinApi().addError(calledby, toStr("You Probably don't want to delete something this high in the Registry hierachy: ").append(regpath));
//							throw new NoDataFoundException();
//						}
//					}
//					args = getContainer().getWebutilCApi().createParameterList();
//					param1 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_INT, getWebutilcapi().PARAM_IN, ibuff1);
//					param2 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_IN, vcbuff1, 512);
//					param3 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_INT, getWebutilcapi().PARAM_IN, opt);
//					irc = getContainer().getWebutilCApi().invokeInt(getContainer().getClientWinApi().functionhandle(IMAINTREGKEY), args);
//					getContainer().getWebutilCApi().destroyParameterList(args);
//				}
//				else {
//					throw new getClientwinapi().NotAvailable();
//				}
//				if ( irc.notEquals(0) )
//				{
//					getContainer().getClientWinApi().addError(calledby, toStr("Cannot ").append(vcop).append(" Registry Key ").append(regpath).append(" (Error code = ").append(toChar(irc)).append(")"));
//					if ( raiseexceptions.getValue() )
//					{
//						throw new NoDataFoundException();
//					}
//				}
//			}
//			catch(NoDataFoundException e)
//			{
//				if ( raiseexceptions.getValue() )
//				{
//					throw  e;
//				}
//			}
//			catch(getClientwinapi().NotAvailable e)
//			{
//				getContainer().getClientWinApi().addError(calledby, getClientwinapi().NOAPI);
//				throw  e;
//			}
//			catch(Exception  e)
//			{
//				getContainer().getClientWinApi().addError(calledby, getClientwinapi().UERROR.append(getContainer().getClientWinApi().addExternalErrors()));
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : wrapMaintRegistry procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param regpath
		*/
		public void createRegistryKey(NString regpath) {
			createRegistryKey(regpath, toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param regpath
		* @param raiseexceptions
		*/
		public void createRegistryKey(NString regpath, NBool raiseexceptions)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			wrapMaintRegistry(toStr("Create_Registry_Key"), regpath, toInt(0), raiseexceptions);
//
			this.getLogger().trace(this, "F2J : createRegistryKey procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param regpath
		*/
		public void deleteRegistryKey(NString regpath) {
			deleteRegistryKey(regpath, toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param regpath
		* @param raiseexceptions
		*/
		public void deleteRegistryKey(NString regpath, NBool raiseexceptions)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			wrapMaintRegistry(toStr("Delete_Registry_Key"), regpath, toInt(1), raiseexceptions);
//
			this.getLogger().trace(this, "F2J : deleteRegistryKey procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getWorkingDirectory() {
			return getWorkingDirectory(toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param raiseexceptions
		*/
		public NString getWorkingDirectory(NBool raiseexceptions)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vcbuff1= NString.getNull();
//			NInteger irc= NInteger.getNull();
//			UnknownTypes.WebutilCApiParameterlist args= null;
//			UnknownTypes.WebutilCApiParameterhandle param1= null;
//			UnknownTypes.WebutilCApiParameterhandle param2= null;
//			try
//			{
//				getContainer().getClientWinApi().cleanErrorStack();
//				irc = toInt(0);
//				if ( getContainer().getClientWinApi().apiEnabled.getValue() )
//				{
//					getContainer().getClientWinApi().registerFunctionCall(IGETWORKINGDIRECTORY, toStr("d2kwutil_GetWorkingDirectory"), toStr("INT"), toStr("*CHAR,INT"));
//					vcbuff1 = toStr("");
//					args = getContainer().getWebutilCApi().createParameterList();
//					param1 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_INOUT, vcbuff1, 512);
//					param2 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_INT, getWebutilcapi().PARAM_IN, );
//					irc = getContainer().getWebutilCApi().invokeInt(getContainer().getClientWinApi().functionhandle(IGETWORKINGDIRECTORY), args);
//					vcbuff1 = getContainer().getWebutilCApi().getParameterString(args, param1);
//					getContainer().getWebutilCApi().destroyParameterList(args);
//				}
//				else {
//					throw new getClientwinapi().NotAvailable();
//				}
//				if ( irc.equals(0) )
//				{
//					getContainer().getClientWinApi().addError(toStr("Get_Working_Directory"), toStr("No Value Returned"));
//					if ( raiseexceptions.getValue() )
//					{
//						throw new NoDataFoundException();
//					}
//					else {
//						return NString.getNull();
//					}
//				}
//				else {
//					return getContainer().getClientWinApi().stripdirsep(vcbuff1);
//				}
//			}
//			catch(NoDataFoundException e)
//			{
//				throw  e;
//			}
//			catch(getClientwinapi().NotAvailable e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Get_Working_Directory"), getClientwinapi().NOAPI);
//				throw  e;
//			}
//			catch(Exception  e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Get_Working_Directory"), getClientwinapi().UERROR.append(getContainer().getClientWinApi().addExternalErrors()));
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : getWorkingDirectory function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getComputerName() {
			return getComputerName(toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param raiseexceptions
		*/
		public NString getComputerName(NBool raiseexceptions)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vcbuff1= NString.getNull();
//			NInteger ibuff1 = toInt(512);
//			NInteger irc = toInt(0);
//			UnknownTypes.WebutilCApiParameterlist args= null;
//			UnknownTypes.WebutilCApiParameterhandle param1= null;
//			UnknownTypes.WebutilCApiParameterhandle param2= null;
//			try
//			{
//				getContainer().getClientWinApi().cleanErrorStack();
//				if ( getContainer().getClientWinApi().apiEnabled.getValue() )
//				{
//					getContainer().getClientWinApi().registerFunctionCall(IGETCOMPUTERNAME, toStr("d2kwutil_GetComputerName"), toStr("INT"), toStr("*CHAR,*LONG"));
//					vcbuff1 = toStr("");
//					args = getContainer().getWebutilCApi().createParameterList();
//					param1 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_INOUT, vcbuff1, 512);
//					param2 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_INT_PTR, getWebutilcapi().PARAM_INOUT, ibuff1);
//					irc = getContainer().getWebutilCApi().invokeInt(getContainer().getClientWinApi().functionhandle(IGETCOMPUTERNAME), args);
//					vcbuff1 = getContainer().getWebutilCApi().getParameterString(args, param1);
//					getContainer().getWebutilCApi().destroyParameterList(args);
//				}
//				else {
//					throw new getClientwinapi().NotAvailable();
//				}
//				if ( irc.equals(0) )
//				{
//					getContainer().getClientWinApi().addError(toStr("Get_Computer_Name"), toStr("No Value Returned"));
//					if ( raiseexceptions.getValue() )
//					{
//						throw new NoDataFoundException();
//					}
//					else {
//						return NString.getNull();
//					}
//				}
//				else {
//					return vcbuff1;
//				}
//			}
//			catch(NoDataFoundException e)
//			{
//				throw  e;
//			}
//			catch(getClientwinapi().NotAvailable e)
//			{
//				getContainer().getClientWinApi().addError(toStr("GetComputer_Name"), getClientwinapi().NOAPI);
//				throw  e;
//			}
//			catch(Exception  e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Get_Computer_Name"), getClientwinapi().UERROR.append(getContainer().getClientWinApi().addExternalErrors()));
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : getComputerName function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getWindowsVersion()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NInteger irc = toInt(0);
//			NString rcbuff= NString.getNull();
//			NString vcbuff1 = toStr("");
//			NString vcbuff2 = toStr("");
//			UnknownTypes.WebutilCApiParameterlist args= null;
//			UnknownTypes.WebutilCApiParameterhandle param1= null;
//			UnknownTypes.WebutilCApiParameterhandle param2= null;
//			try
//			{
//				getContainer().getClientWinApi().cleanErrorStack();
//				if ( getContainer().getClientWinApi().apiEnabled.getValue() )
//				{
//					getContainer().getClientWinApi().registerFunctionCall(IGETWINDOWSVERSION, toStr("d2kwutil_GetWindowsVersion"), toStr("INT"), toStr("*CHAR,*CHAR"));
//					args = getContainer().getWebutilCApi().createParameterList();
//					param1 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_INOUT, vcbuff1, 30);
//					param2 = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_INOUT, vcbuff2, 16);
//					irc = getContainer().getWebutilCApi().invokeInt(getContainer().getClientWinApi().functionhandle(IGETWINDOWSVERSION), args);
//					vcbuff1 = getContainer().getWebutilCApi().getParameterString(args, param1);
//					vcbuff2 = getContainer().getWebutilCApi().getParameterString(args, param2);
//					getContainer().getWebutilCApi().destroyParameterList(args);
//				}
//				else {
//					throw new getClientwinapi().NotAvailable();
//				}
//				if ( irc.equals(1) && vcbuff2.equals("1998") )
//				{
//					rcbuff = toStr("Windows98");
//				}
//				else if ( irc.equals(1) ) {
//					rcbuff = toStr("Windows95");
//				}
//				else if ( irc.equals(2) && substring(vcbuff1, toInt(1), toInt(1)).equals("5") ) {
//					rcbuff = toStr("Windows2000");
//				}
//				else if ( irc.equals(2) ) {
//					rcbuff = toStr("WindowsNT");
//				}
//				else {
//					rcbuff = toStr("Unknown Type: ").append(toChar(irc)).append(" BuildInfo: ").append(vcbuff1);
//				}
//				return rcbuff;
//			}
//			catch(getClientwinapi().NotAvailable e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Get_Windows_Version"), getClientwinapi().NOAPI);
//				throw  e;
//			}
//			catch(Exception  e)
//			{
//				getContainer().getClientWinApi().addError(toStr("Get_Windows_Version"), getClientwinapi().UERROR.append(getContainer().getClientWinApi().addExternalErrors()));
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : getWindowsVersion function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
		
	
	
}
