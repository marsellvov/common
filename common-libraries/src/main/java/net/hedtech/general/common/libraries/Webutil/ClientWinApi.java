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


public class ClientWinApi extends AbstractSupportCodeObject {
	

	public ClientWinApi(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) CLIENT_WIN_API
	/*
	PACKAGE Client_Win_API IS
<multilinecomment>-------------------------------------------------------------------------------*\
 * WebUtil version of D2KWUTIL package WIN_API                                     
 * Note: Not all D2kWutil Functions are ported
 *********************************************************************************
 * Version 1.0.0
 *********************************************************************************
 * Change History
 *   DRMILLS 21/FEB/2003 - Port Creation
 *
 *********************************************************************************
 * WIN_API ->  This package defines the constants used throughout 
 *      the library as a whole, including versions of those 
 *      constants defined within WINDOWS.H/WINUSER.H that 
 *      we'll be using. Add more constants in here if required
 *      The package also contains Explict Exception declarations,
 *      various status Flags and functions for Error Handling
 * NOTE:    In order to make this library portable across Forms,
 *      Reports and Graphics we do not use any application 
 *      specific built-ins such as the Forms MESSAGE() 
 *      Built-in. Instead errors are recorded in a package
 *      variable which the programmer can examine if required
\*-------------------------------------------------------------------------------</multilinecomment>

<multilinecomment>-------------------------------------------------------------------------------*\
 * Internal Version Number  ** Oracle Developer Release 6.0 Version
\*-------------------------------------------------------------------------------</multilinecomment>
  WIN_API_VERSION  CONSTANT  VARCHAR2(30) := '6.0.6.0 Production';
  DLL_NAME         CONSTANT  VARCHAR2(12) := 'd2kwut60.dll';
  DLL_PATH         VARCHAR2(256)          := NULL;


<multilinecomment>-------------------------------------------------------------------------------*\
 * General Window Classes of Common Applications for use with WIN_API_SESSION
 * ** WARNING ** These Window classes are out of our control and might change 
 *               when you upgrade the software in question,
\*-------------------------------------------------------------------------------</multilinecomment>

  -- Oracle Apps
  WINCLASS_DEVELOPER_2000_V1  CONSTANT  VARCHAR2(15)  := 'ui23MDIroot_W32';             <multilinecomment> Developer/2000 release 1.n / Toolkit 2.3 Apps on 32 bit </multilinecomment>
  WINCLASS_DEVELOPER_2000_V2  CONSTANT  VARCHAR2(15)  := 'ui25MDIroot_W32';             <multilinecomment> Developer/2000 Release 2.0 / Toolkit 2.5 Apps on 32 bit </multilinecomment>
  WINCLASS_DEVELOPER_2000_V6  CONSTANT  VARCHAR2(15)  := 'ui60MDIroot_W32';             <multilinecomment> Developer/2000 Release 6.0 / Toolkit 6.0 Apps on 32 bit </multilinecomment>  
  D2K_WINDOW_CLASS            CONSTANT  VARCHAR2(15)  := WINCLASS_DEVELOPER_2000_V6;    <multilinecomment> Set to the "current" version </multilinecomment>  
  WINCLASS_INTEROFFICE_40     CONSTANT  VARCHAR2(28)  := 'Afx:10000000:b:10008:6:5023b';<multilinecomment> Oracle Interoffice 4.0 Client 32 bit </multilinecomment>
  WINCLASS_INTEROFFICE_41     CONSTANT  VARCHAR2(28)  := 'Afx:10000000:b:1496:6:3a17';  <multilinecomment> Oracle Interoffice 4.0 Client 32 bit </multilinecomment>
  WINCLASS_SQLPLUS            CONSTANT  VARCHAR2(13)  := 'SqlplusWClass';               <multilinecomment> Sql*Plus 32 bit </multilinecomment>
  WINCLASS_REPORTSSERVER_V1   CONSTANT  VARCHAR2(15)  := 'R25SRV_WINCLASS';             <multilinecomment> Reports Server Reports 2.5 </multilinecomment>
  WINCLASS_REPORTSSERVER_V2   CONSTANT  VARCHAR2(15)  := 'R30SRV_WINCLASS';             <multilinecomment> Reports Server Reports 3.0 </multilinecomment>
  WINCLASS_REPORTSSERVER_V6   CONSTANT  VARCHAR2(14)  := 'RWRBE_WINCLASS';              <multilinecomment> Reports Server Reports 6.0 </multilinecomment>

  -- Microsoft Office Apps - Office97
  WINCLASS_MSWORD_97         CONSTANT  VARCHAR2(7) := 'OpusApp';                        <multilinecomment> Microsoft Word 97 </multilinecomment>
  WINCLASS_MSEXCEL_97        CONSTANT  VARCHAR2(6) := 'XLMAIN';                         <multilinecomment> Microsoft Excel 97 </multilinecomment>
  WINCLASS_MSPOWERPOINT_97   CONSTANT  VARCHAR2(14):= 'PP97FrameClass';                 <multilinecomment> Microsoft Power Point 97 </multilinecomment>


  -- Microsoft Office Apps - Office95
  WINCLASS_MSWORD_7          CONSTANT  VARCHAR2(7) := 'OpusApp';                        <multilinecomment> Microsoft Word 7 </multilinecomment>
  WINCLASS_MSEXCEL_7         CONSTANT  VARCHAR2(6) := 'XLMAIN';                         <multilinecomment> Microsoft Excel 7 </multilinecomment>
  WINCLASS_MSPOWERPOINT_7    CONSTANT  VARCHAR2(13):= 'PP7FrameClass';                  <multilinecomment> Microsoft Power Point 7 </multilinecomment>
  WINCLASS_MSSCHEDULE_7      CONSTANT  VARCHAR2(23):= 'MS Schedule+ 32 Panesdi';        <multilinecomment> Microsoft Schedule 7 </multilinecomment>
  WINCLASS_MSEXCHANGE_4      CONSTANT  VARCHAR2(29):= 'Microsoft Exchange 4.0 Viewer';  <multilinecomment> Microsoft Exchange 4 in-tray </multilinecomment>


  -- Microsoft O/S Utilities
  WINCLASS_INETEXPLORER      CONSTANT  VARCHAR2(7):= 'IEFrame';                         <multilinecomment> Internet Explorer </multilinecomment>
  WINCLASS_OUTLOOK_EXPRESS   CONSTANT  VARCHAR2(29):= 'Outlook Express Browser Class';  <multilinecomment> Outlook Express </multilinecomment>
  WINCLASS_EXPLORER          CONSTANT  VARCHAR2(13):= 'ExploreWClass';                  <multilinecomment> Explorer </multilinecomment>
  WINCLASS_MYCOMPUTER        CONSTANT  VARCHAR2(13):= 'CabinetWClass';                  <multilinecomment> My Computer & Network Neighborhood</multilinecomment>
  WINCLASS_CALCULATOR        CONSTANT  VARCHAR2(7) := 'SciCalc';                        <multilinecomment> Windows Calculator </multilinecomment>
  WINCLASS_NOTEPAD           CONSTANT  VARCHAR2(7) := 'Notepad';                        <multilinecomment> Windows Notepad </multilinecomment>
  WINCLASS_WORDPAD           CONSTANT  VARCHAR2(12):= 'WordPadClass';                   <multilinecomment> Windows Wordpad/Write </multilinecomment>
  WINCLASS_DOS               CONSTANT  VARCHAR2(18):= 'ConsoleWindowClass';             <multilinecomment> Dos Window </multilinecomment>

  -- Other
  WINCLASS_NETSCAPE_3        CONSTANT  VARCHAR2(27):= 'Afx:40000000:b:150e:6:38cfe';    <multilinecomment> Netscape Navigator 3.0 </multilinecomment>
  WINCLASS_NETSCAPE_4        CONSTANT  VARCHAR2(28):= 'Afx:40000000:b:10008:6:6063e';   <multilinecomment> Netscape Communicator 4.0 </multilinecomment>
  WINCLASS_PFE_7             CONSTANT  VARCHAR2(11):= 'PFE32_Frame';                    <multilinecomment> Programmers File Editor </multilinecomment>
  WINCLASS_REGEDIT           CONSTANT  VARCHAR2(15):= 'RegEdit_RegEdit';                <multilinecomment> Registry Editor </multilinecomment>


  -- Window Style Constants (from WINUSER.H)
  --  Any PU's that use these constants will explain 
  --  their use.  For further information consult the
  --  Windows SDK.

  SW_HIDE              CONSTANT  PLS_INTEGER := 0;
  SW_SHOWNORMAL        CONSTANT  PLS_INTEGER := 1;
  SW_SHOWMINIMIZED     CONSTANT  PLS_INTEGER := 2;
  SW_SHOWMAXIMIZED     CONSTANT  PLS_INTEGER := 3;
  SW_SHOWNOACTIVATE    CONSTANT  PLS_INTEGER := 4;
  SW_SHOW              CONSTANT  PLS_INTEGER := 5;
  SW_MINIMIZE          CONSTANT  PLS_INTEGER := 6;
  SW_SHOWMINNOACTIVE   CONSTANT  PLS_INTEGER := 7;
  SW_SHOWNA            CONSTANT  PLS_INTEGER := 8;
  SW_RESTORE           CONSTANT  PLS_INTEGER := 9;
  SW_SHOWDEFAULT       CONSTANT  PLS_INTEGER := 10;

  -- Help Access Constants (From WINUSER.H)
  --  See WIN_API_SHELL.WinHelp

  HELP_CONTEXT         CONSTANT  PLS_INTEGER := 1;   <multilinecomment> 0x0001L </multilinecomment>
  HELP_QUIT            CONSTANT  PLS_INTEGER := 2;   <multilinecomment> 0x0002L </multilinecomment>
  HELP_INDEX           CONSTANT  PLS_INTEGER := 3;   <multilinecomment> 0x0003L </multilinecomment>
  HELP_CONTENTS        CONSTANT  PLS_INTEGER := 3;   <multilinecomment> 0x0003L </multilinecomment>
  HELP_HELPONHELP      CONSTANT  PLS_INTEGER := 4;   <multilinecomment> 0x0004L </multilinecomment>
  HELP_SETINDEX        CONSTANT  PLS_INTEGER := 5;   <multilinecomment> 0x0005L </multilinecomment>
  HELP_SETCONTENTS     CONSTANT  PLS_INTEGER := 5;   <multilinecomment> 0x0005L </multilinecomment>
  HELP_CONTEXTPOPUP    CONSTANT  PLS_INTEGER := 8;   <multilinecomment> 0x0008L </multilinecomment>
  HELP_FORCEFILE       CONSTANT  PLS_INTEGER := 9;   <multilinecomment> 0x0009L </multilinecomment>
  HELP_KEY             CONSTANT  PLS_INTEGER := 257; <multilinecomment> 0x0101L </multilinecomment>
  HELP_COMMAND         CONSTANT  PLS_INTEGER := 258; <multilinecomment> 0x0102L </multilinecomment>
  HELP_PARTIALKEY      CONSTANT  PLS_INTEGER := 261; <multilinecomment> 0x0105L </multilinecomment>
  HELP_MULTIKEY        CONSTANT  PLS_INTEGER := 513; <multilinecomment> 0x0201L </multilinecomment>
  HELP_SETWINPOS       CONSTANT  PLS_INTEGER := 515; <multilinecomment> 0x0203L </multilinecomment>
  -- Windows 4+
  HELP_CONTEXTMENU     CONSTANT  PLS_INTEGER := 10;  <multilinecomment> 0x000a  </multilinecomment>
  HELP_FINDER          CONSTANT  PLS_INTEGER := 11;  <multilinecomment> 0x000b  </multilinecomment>
  HELP_WM_HELP         CONSTANT  PLS_INTEGER := 12;  <multilinecomment> 0x000c  </multilinecomment>
  HELP_SETPOPUP_POS    CONSTANT  PLS_INTEGER := 13;  <multilinecomment> 0x000d  </multilinecomment>


  -- Windows Messages for use with SendMessage
  -- DO NOT utilise the Windows Sendmessage interface without being conversant
  -- with the Windows message handling mechanism
  -- Refer to the Microsoft Windows SDK for Messages and Parameter values
  WM_SYSCOMMAND        CONSTANT  PLS_INTEGER := 274;   <multilinecomment> 0x0112 </multilinecomment>
  WM_MDITILE           CONSTANT  PLS_INTEGER := 550;   <multilinecomment> 0x0226 </multilinecomment>
  WM_MDICASCADE        CONSTANT  PLS_INTEGER := 551;   <multilinecomment> 0x0227 </multilinecomment>
  WM_MDIICONARRANGE    CONSTANT  PLS_INTEGER := 552;   <multilinecomment> 0x0228 </multilinecomment>      
  SC_RESTORE           CONSTANT  PLS_INTEGER := 61728; <multilinecomment> 0xF120 </multilinecomment>
  SC_MINIMIZE          CONSTANT  PLS_INTEGER := 61472; <multilinecomment> 0xF020 </multilinecomment>
  SC_MAXIMIZE          CONSTANT  PLS_INTEGER := 61488; <multilinecomment> 0xF030 </multilinecomment>
  


  -- Flags for use with File Dialog boxes ("Save As" or "Open")
  -- Refer to your Microsoft documentation for details on the 
  -- Exact usage and dependancies of each option
  OFN_READONLY           CONSTANT  PLS_INTEGER := 1;        <multilinecomment> 0x00000001 </multilinecomment>
  OFN_OVERWRITEPROMPT    CONSTANT  PLS_INTEGER := 2;        <multilinecomment> 0x00000002 </multilinecomment>
  OFN_HIDEREADONLY       CONSTANT  PLS_INTEGER := 4;        <multilinecomment> 0x00000004 </multilinecomment>
  OFN_NOCHANGEDIR        CONSTANT  PLS_INTEGER := 8;        <multilinecomment> 0x00000008 </multilinecomment>
  OFN_SHOWHELP           CONSTANT  PLS_INTEGER := 16;       <multilinecomment> 0x00000010 </multilinecomment>
  OFN_NOVALIDATE         CONSTANT  PLS_INTEGER := 256;      <multilinecomment> 0x00000100 </multilinecomment>
  OFN_ALLOWMULTISELECT   CONSTANT  PLS_INTEGER := 512;      <multilinecomment> 0x00000200 </multilinecomment>
  OFN_EXTENSIONDIFFERENT CONSTANT  PLS_INTEGER := 1024;     <multilinecomment> 0x00000400 </multilinecomment>
  OFN_PATHMUSTEXIST      CONSTANT  PLS_INTEGER := 2048;     <multilinecomment> 0x00000800 </multilinecomment>
  OFN_FILEMUSTEXIST      CONSTANT  PLS_INTEGER := 4096;     <multilinecomment> 0x00001000 </multilinecomment>
  OFN_CREATEPROMPT       CONSTANT  PLS_INTEGER := 8192;     <multilinecomment> 0x00002000 </multilinecomment>
  OFN_SHAREAWARE         CONSTANT  PLS_INTEGER := 16384;    <multilinecomment> 0x00004000 </multilinecomment>
  OFN_NOREADONLYRETURN   CONSTANT  PLS_INTEGER := 32768;    <multilinecomment> 0x00008000 </multilinecomment>
  OFN_NOTESTFILECREATE   CONSTANT  PLS_INTEGER := 65536;    <multilinecomment> 0x00010000 </multilinecomment>
  OFN_NONETWORKBUTTON    CONSTANT  PLS_INTEGER := 131072;   <multilinecomment> 0x00020000 </multilinecomment>
  OFN_NOLONGNAMES        CONSTANT  PLS_INTEGER := 262144;   <multilinecomment> 0x00040000 </multilinecomment>
  OFN_EXPLORER           CONSTANT  PLS_INTEGER := 524288;   <multilinecomment> 0x00080000 </multilinecomment>
  OFN_NODEREFERENCELINKS CONSTANT  PLS_INTEGER := 1048576;  <multilinecomment> 0x00100000 </multilinecomment>
  OFN_LONGNAMES          CONSTANT  PLS_INTEGER := 2097152;  <multilinecomment> 0x00200000 </multilinecomment>

  -- The defaults used here (WIN_API.OFN_PATHMUSTEXIST|WIN_API.OFN_FILEMUSTEXIST|WIN_API.OFN_HIDEREADONLY|WIN_API.OFN_NOCHANGEDIR|WIN_API.OFN_EXPLORER)
  OFN_FLAG_DEFAULT       CONSTANT  PLS_INTEGER :=  530444;
  
  
  -- Registry Data types for Write_RegistryEx
  REG_EXPAND_SZ          CONSTANT  PLS_INTEGER := 0;
  REG_SZ                 CONSTANT  PLS_INTEGER := 1;
  REG_DWORD              CONSTANT  PLS_INTEGER := 2;
  
  -- Compatibility Flags - Used where I have changed behaviour and you might not like the new version
  -- Change these at runtime to FALSE to revert to "old" behaviour
  COMPAT_EXPAND_REG_VALUES    BOOLEAN := TRUE;

  
  
  -- Types
  TYPE aFunctionHandle is table of WEBUTIL_C_API.FUNCTIONHANDLE index by BINARY_INTEGER;  
  SUBTYPE FILE_TYPE is PLS_INTEGER;

  -- Public Variables
  ERROR_ENCOUNTERED  BOOLEAN := FALSE;  <multilinecomment> The Last Call resulted in an error </multilinecomment>
  ERROR_STACK        VARCHAR2(2000);    <multilinecomment> Holds Text of Last error(s) </multilinecomment> 
  API_ENABLED        BOOLEAN := FALSE;   <multilinecomment> Are API functions usable ?</multilinecomment>
  DLL_HANDLE         ORA_FFI.LibHandleType;
  FunctionHandle     aFunctionHandle;
   

  -- Public Exceptions
  NOT_AVAILABLE      EXCEPTION;  <multilinecomment> A call to the API was made but API functions not currently available (e.g. not on Windows) </multilinecomment>
     
  -- Error Constants
  UError             CONSTANT  VARCHAR2(30) := ' Caused an unexpected error: ';
  NoAPI              CONSTANT  VARCHAR2(31) := 'API Functions are not Available';
  MaxDWord           CONSTANT  VARCHAR2(33) := 'Integer Argument exceeds 32 bits ';
  MaxWord            CONSTANT  VARCHAR2(33) := 'Integer Argument exceeds 16 bits ';
  MaxByte            CONSTANT  VARCHAR2(32) := 'Integer Argument exceeds 8 bits ';
  MinBound           CONSTANT  VARCHAR2(27) := 'Integer Argument too Small ';
  MaxBound           CONSTANT  VARCHAR2(27) := 'Integer Argument too Large ';
  NullArg            CONSTANT  VARCHAR2(24) := 'Argument cannot be NULL ';

  <multilinecomment>----------------------------------------------------------------------------*\
  * PreLoad ->  Loads the DLL into memory 
  *             DLL_Location argument allows you to explicitly load 
  *             from a particular place
  \*----------------------------------------------------------------------------</multilinecomment>    
  PROCEDURE PreLoad(RaiseExceptions IN BOOLEAN DEFAULT TRUE);

  <multilinecomment>----------------------------------------------------------------------------*\
  * DLLVersion ->  Returns the Version String of the DLL in use. 
  \*----------------------------------------------------------------------------</multilinecomment>    
  FUNCTION DLLVersion return varchar2; 

  <multilinecomment>----------------------------------------------------------------------------*\
  * Clean_Error_Stack ->  Re-initialises the error mechanism
  \*----------------------------------------------------------------------------</multilinecomment>    
  PROCEDURE Clean_Error_Stack;

  <multilinecomment>----------------------------------------------------------------------------*\
  * Add_Error ->  Adds the text of the specified error to the 
  *        ERROR_STACK variable and sets the error Flag 
  *        ERROR_ENCOUTERED.
  \*----------------------------------------------------------------------------</multilinecomment>    
  PROCEDURE Add_Error (CallingFunction in VARCHAR2, SetErrorText in VARCHAR2);

  <multilinecomment>----------------------------------------------------------------------------*\
  * Add_External_Errors ->  If we get an unexpected error this funtion will 
  *        return a sting containing the error text
  \*----------------------------------------------------------------------------</multilinecomment>    
  FUNCTION Add_External_Errors return varchar2;

  <multilinecomment>----------------------------------------------------------------------------*\
  * Register_Function_Call ->  Ensures that the DLL is still loaded and
  *                            registers the function if required
  *                            Raises NO_DATA_FOUND if the library 
  *                            cannot be loaded
  \*----------------------------------------------------------------------------</multilinecomment>    
  PROCEDURE Register_Function_Call (FunctionID in PLS_INTEGER, 
                                   FunctionName in VARCHAR2,
                                   FunctionReturn in VARCHAR2, 
                                   FunctionArgs in VARCHAR2);

  <multilinecomment>----------------------------------------------------------------------------*\
  * StripDirSep ->  Removes trailing directory separators or 
  *        SemiColons from paths, providing a known format
  \*----------------------------------------------------------------------------</multilinecomment>    
  FUNCTION StripDirSep ( INPath in varchar2) return varchar2; 

  <multilinecomment>----------------------------------------------------------------------------*\
  * GetResource ->  Returns the name of the Resource requested Prefixed with  
  *                 The name of the DLL in the Correct Format
  *                 If the resource being requested is a Cursor then 
  *                 the D2kwutil DLL file *Must* be on the O/S Path
  \*----------------------------------------------------------------------------</multilinecomment>    
  FUNCTION GetResource (ResourceName in VARCHAR2) return VARCHAR2;
   
END Client_Win_API; <multilinecomment> End Package Declaration </multilinecomment>
	*/
	
			// -------------------------------------------------------------------------------*\
		// * WebUtil version of D2KWUTIL package WIN_API
		// * Note: Not all D2kWutil Functions are ported
		// *********************************************************************************
		// * Version 1.0.0
		// *********************************************************************************
		// * Change History
		// *   DRMILLS 21/FEB/2003 - Port Creation
		// *
		// *********************************************************************************
		// * WIN_API ->  This package defines the constants used throughout
		// *      the library as a whole, including versions of those
		// *      constants defined within WINDOWS.H/WINUSER.H that
		// *      we'll be using. Add more constants in here if required
		// *      The package also contains Explict Exception declarations,
		// *      various status Flags and functions for Error Handling
		// * NOTE:    In order to make this library portable across Forms,
		// *      Reports and Graphics we do not use any application
		// *      specific built-ins such as the Forms MESSAGE()
		// *      Built-in. Instead errors are recorded in a package
		// *      variable which the programmer can examine if required
		// \*-------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------*\
		// * Internal Version Number  ** Oracle Developer Release 6.0 Version
		// \*-------------------------------------------------------------------------------
		public final NString WIN_API_VERSION = toStr("6.0.6.0 Production");
		public final NString DLL_NAME = toStr("d2kwut60.dll");
		public NString dllPath = NString.getNull();
		// -------------------------------------------------------------------------------*\
		// * General Window Classes of Common Applications for use with WIN_API_SESSION
		// * ** WARNING ** These Window classes are out of our control and might change
		// *               when you upgrade the software in question,
		// \*-------------------------------------------------------------------------------
		//  Oracle Apps
		public final NString WINCLASS_DEVELOPER_2000_V1 = toStr("ui23MDIroot_W32");
		//  Developer/2000 release 1.n / Toolkit 2.3 Apps on 32 bit 
		public final NString WINCLASS_DEVELOPER_2000_V2 = toStr("ui25MDIroot_W32");
		//  Developer/2000 Release 2.0 / Toolkit 2.5 Apps on 32 bit 
		public final NString WINCLASS_DEVELOPER_2000_V6 = toStr("ui60MDIroot_W32");
		//  Developer/2000 Release 6.0 / Toolkit 6.0 Apps on 32 bit 
		public static final NString D2K_WINDOW_CLASS = WINCLASS_DEVELOPER_2000_V6;
		//  Set to the "current" version 
		public final NString WINCLASS_INTEROFFICE_40 = toStr("Afx:10000000:b:10008:6:5023b");
		//  Oracle Interoffice 4.0 Client 32 bit 
		public final NString WINCLASS_INTEROFFICE_41 = toStr("Afx:10000000:b:1496:6:3a17");
		//  Oracle Interoffice 4.0 Client 32 bit 
		public final NString WINCLASS_SQLPLUS = toStr("SqlplusWClass");
		//  Sql*Plus 32 bit 
		public final NString WINCLASS_REPORTSSERVER_V1 = toStr("R25SRV_WINCLASS");
		//  Reports Server Reports 2.5 
		public final NString WINCLASS_REPORTSSERVER_V2 = toStr("R30SRV_WINCLASS");
		//  Reports Server Reports 3.0 
		public final NString WINCLASS_REPORTSSERVER_V6 = toStr("RWRBE_WINCLASS");
		//  Reports Server Reports 6.0 
		//  Microsoft Office Apps - Office97
		public final NString WINCLASS_MSWORD_97 = toStr("OpusApp");
		//  Microsoft Word 97 
		public final NString WINCLASS_MSEXCEL_97 = toStr("XLMAIN");
		//  Microsoft Excel 97 
		public final NString WINCLASS_MSPOWERPOINT_97 = toStr("PP97FrameClass");
		//  Microsoft Power Point 97 
		//  Microsoft Office Apps - Office95
		public final NString WINCLASS_MSWORD_7 = toStr("OpusApp");
		//  Microsoft Word 7 
		public final NString WINCLASS_MSEXCEL_7 = toStr("XLMAIN");
		//  Microsoft Excel 7 
		public final NString WINCLASS_MSPOWERPOINT_7 = toStr("PP7FrameClass");
		//  Microsoft Power Point 7 
		public final NString WINCLASS_MSSCHEDULE_7 = toStr("MS Schedule+ 32 Panesdi");
		//  Microsoft Schedule 7 
		public final NString WINCLASS_MSEXCHANGE_4 = toStr("Microsoft Exchange 4.0 Viewer");
		//  Microsoft Exchange 4 in-tray 
		//  Microsoft O/S Utilities
		public final NString WINCLASS_INETEXPLORER = toStr("IEFrame");
		//  Internet Explorer 
		public final NString WINCLASS_OUTLOOK_EXPRESS = toStr("Outlook Express Browser Class");
		//  Outlook Express 
		public final NString WINCLASS_EXPLORER = toStr("ExploreWClass");
		//  Explorer 
		public final NString WINCLASS_MYCOMPUTER = toStr("CabinetWClass");
		//  My Computer & Network Neighborhood
		public final NString WINCLASS_CALCULATOR = toStr("SciCalc");
		//  Windows Calculator 
		public final NString WINCLASS_NOTEPAD = toStr("Notepad");
		//  Windows Notepad 
		public final NString WINCLASS_WORDPAD = toStr("WordPadClass");
		//  Windows Wordpad/Write 
		public final NString WINCLASS_DOS = toStr("ConsoleWindowClass");
		//  Dos Window 
		//  Other
		public final NString WINCLASS_NETSCAPE_3 = toStr("Afx:40000000:b:150e:6:38cfe");
		//  Netscape Navigator 3.0 
		public final NString WINCLASS_NETSCAPE_4 = toStr("Afx:40000000:b:10008:6:6063e");
		//  Netscape Communicator 4.0 
		public final NString WINCLASS_PFE_7 = toStr("PFE32_Frame");
		//  Programmers File Editor 
		public final NString WINCLASS_REGEDIT = toStr("RegEdit_RegEdit");
		//  Registry Editor 
		//  Window Style Constants (from WINUSER.H)
		//   Any PU's that use these constants will explain 
		//   their use.  For further information consult the
		//   Windows SDK.
		public final NInteger SW_HIDE = toInt(0);
		public final NInteger SW_SHOWNORMAL = toInt(1);
		public final NInteger SW_SHOWMINIMIZED = toInt(2);
		public final NInteger SW_SHOWMAXIMIZED = toInt(3);
		public final NInteger SW_SHOWNOACTIVATE = toInt(4);
		public final NInteger SW_SHOW = toInt(5);
		public final NInteger SW_MINIMIZE = toInt(6);
		public final NInteger SW_SHOWMINNOACTIVE = toInt(7);
		public final NInteger SW_SHOWNA = toInt(8);
		public final NInteger SW_RESTORE = toInt(9);
		public final NInteger SW_SHOWDEFAULT = toInt(10);
		//  Help Access Constants (From WINUSER.H)
		//   See WIN_API_SHELL.WinHelp
		public final NInteger HELP_CONTEXT = toInt(1);
		//  0x0001L 
		public final NInteger HELP_QUIT = toInt(2);
		//  0x0002L 
		public final NInteger HELP_INDEX = toInt(3);
		//  0x0003L 
		public final NInteger HELP_CONTENTS = toInt(3);
		//  0x0003L 
		public final NInteger HELP_HELPONHELP = toInt(4);
		//  0x0004L 
		public final NInteger HELP_SETINDEX = toInt(5);
		//  0x0005L 
		public final NInteger HELP_SETCONTENTS = toInt(5);
		//  0x0005L 
		public final NInteger HELP_CONTEXTPOPUP = toInt(8);
		//  0x0008L 
		public final NInteger HELP_FORCEFILE = toInt(9);
		//  0x0009L 
		public final NInteger HELP_KEY = toInt(257);
		//  0x0101L 
		public final NInteger HELP_COMMAND = toInt(258);
		//  0x0102L 
		public final NInteger HELP_PARTIALKEY = toInt(261);
		//  0x0105L 
		public final NInteger HELP_MULTIKEY = toInt(513);
		//  0x0201L 
		public final NInteger HELP_SETWINPOS = toInt(515);
		//  0x0203L 
		//  Windows 4+
		public final NInteger HELP_CONTEXTMENU = toInt(10);
		//  0x000a  
		public final NInteger HELP_FINDER = toInt(11);
		//  0x000b  
		public final NInteger HELP_WM_HELP = toInt(12);
		//  0x000c  
		public final NInteger HELP_SETPOPUP_POS = toInt(13);
		//  0x000d  
		//  Windows Messages for use with SendMessage
		//  DO NOT utilise the Windows Sendmessage interface without being conversant
		//  with the Windows message handling mechanism
		//  Refer to the Microsoft Windows SDK for Messages and Parameter values
		public final NInteger WM_SYSCOMMAND = toInt(274);
		//  0x0112 
		public final NInteger WM_MDITILE = toInt(550);
		//  0x0226 
		public final NInteger WM_MDICASCADE = toInt(551);
		//  0x0227 
		public final NInteger WM_MDIICONARRANGE = toInt(552);
		//  0x0228 
		public final NInteger SC_RESTORE = toInt(61728);
		//  0xF120 
		public final NInteger SC_MINIMIZE = toInt(61472);
		//  0xF020 
		public final NInteger SC_MAXIMIZE = toInt(61488);
		//  0xF030 
		//  Flags for use with File Dialog boxes ("Save As" or "Open")
		//  Refer to your Microsoft documentation for details on the 
		//  Exact usage and dependancies of each option
		public final NInteger OFN_READONLY = toInt(1);
		//  0x00000001 
		public final NInteger OFN_OVERWRITEPROMPT = toInt(2);
		//  0x00000002 
		public final NInteger OFN_HIDEREADONLY = toInt(4);
		//  0x00000004 
		public final NInteger OFN_NOCHANGEDIR = toInt(8);
		//  0x00000008 
		public final NInteger OFN_SHOWHELP = toInt(16);
		//  0x00000010 
		public final NInteger OFN_NOVALIDATE = toInt(256);
		//  0x00000100 
		public final NInteger OFN_ALLOWMULTISELECT = toInt(512);
		//  0x00000200 
		public final NInteger OFN_EXTENSIONDIFFERENT = toInt(1024);
		//  0x00000400 
		public final NInteger OFN_PATHMUSTEXIST = toInt(2048);
		//  0x00000800 
		public final NInteger OFN_FILEMUSTEXIST = toInt(4096);
		//  0x00001000 
		public final NInteger OFN_CREATEPROMPT = toInt(8192);
		//  0x00002000 
		public final NInteger OFN_SHAREAWARE = toInt(16384);
		//  0x00004000 
		public final NInteger OFN_NOREADONLYRETURN = toInt(32768);
		//  0x00008000 
		public final NInteger OFN_NOTESTFILECREATE = toInt(65536);
		//  0x00010000 
		public final NInteger OFN_NONETWORKBUTTON = toInt(131072);
		//  0x00020000 
		public final NInteger OFN_NOLONGNAMES = toInt(262144);
		//  0x00040000 
		public final NInteger OFN_EXPLORER = toInt(524288);
		//  0x00080000 
		public final NInteger OFN_NODEREFERENCELINKS = toInt(1048576);
		//  0x00100000 
		public final NInteger OFN_LONGNAMES = toInt(2097152);
		//  0x00200000 
		//  The defaults used here (WIN_API.OFN_PATHMUSTEXIST|WIN_API.OFN_FILEMUSTEXIST|WIN_API.OFN_HIDEREADONLY|WIN_API.OFN_NOCHANGEDIR|WIN_API.OFN_EXPLORER)
		public final NInteger OFN_FLAG_DEFAULT = toInt(530444);
		//  Registry Data types for Write_RegistryEx
		public final NInteger REG_EXPAND_SZ = toInt(0);
		public final NInteger REG_SZ = toInt(1);
		public final NInteger REG_DWORD = toInt(2);
		//  Compatibility Flags - Used where I have changed behaviour and you might not like the new version
		//  Change these at runtime to FALSE to revert to "old" behaviour
		public NBool compatExpandRegValues = toBool(NBool.True);
		//  Public Variables
		public NBool errorEncountered = toBool(NBool.False);
		//  The Last Call resulted in an error 
		public NString errorStack= NString.getNull();
		//  Holds Text of Last error(s) 
		public NBool apiEnabled = toBool(NBool.False);
		//  Are API functions usable ?
		public UnknownTypes.OraFfiLibhandletype dllHandle= null;
		public Clientwinapi.Afunctionhandle functionhandle= null;
		//  Public Exceptions
		 public class NotAvailable extends Exception{}
		//  A call to the API was made but API functions not currently available (e.g. not on Windows) 
		//  Error Constants
		public final NString UERROR = toStr(" Caused an unexpected error: ");
		public final NString NOAPI = toStr("API Functions are not Available");
		public final NString MAXDWORD = toStr("Integer Argument exceeds 32 bits ");
		public final NString MAXWORD = toStr("Integer Argument exceeds 16 bits ");
		public final NString MAXBYTE = toStr("Integer Argument exceeds 8 bits ");
		public final NString MINBOUND = toStr("Integer Argument too Small ");
		public final NString MAXBOUND = toStr("Integer Argument too Large ");
		public final NString NULLARG = toStr("Argument cannot be NULL ");

			
		//Original PL/SQL code for Package Prog Unit (BODY) CLIENT_WIN_API
		/*
		PACKAGE BODY Client_Win_API is

-- Function and Procedure Bodies

  PROCEDURE PreLoad(RaiseExceptions IN BOOLEAN DEFAULT TRUE) is
    vcVersion VARCHAR2(40);
  begin
   CLIENT_WIN_API_DEBUG.DebugLog(99,'PreLoad','Args: (None)');      
    vcVersion := DLLVersion;
  exception
    when NO_DATA_FOUND then
      CLIENT_WIN_API.Add_error('D2KWUTIL (Pre-Load)', CLIENT_WIN_API.NoAPI);
      if RaiseExceptions then
        raise;    
      end if;
    when CLIENT_WIN_API.NOT_AVAILABLE then
      CLIENT_WIN_API.Add_error('D2KWUTIL (Pre-Load)', CLIENT_WIN_API.NoAPI);
      if RaiseExceptions then
        raise;
      end if;
    when others then
      CLIENT_WIN_API.Add_error('D2KWUTIL (Pre-Load)', CLIENT_WIN_API.UError||CLIENT_WIN_API.Add_External_errors); 
      if RaiseExceptions then
        raise;
      end if;
  end PreLoad;
 
  FUNCTION DLLVersion return varchar2 is
    args      WEBUTIL_C_API.ParameterList;
    param     WEBUTIL_C_API.ParameterHandle;
    vcVersion VARCHAR2(42) := rpad(' ',40);
  begin
    CLIENT_WIN_API_DEBUG.DebugLog(99,'DLLVersion','Args: <No Arguments>'); 
    CLIENT_WIN_API.Clean_Error_Stack;
    Register_function_call(1,'d2kwutil_Version','VOID','*CHAR');
    args := WEBUTIL_C_API.Create_Parameter_List;
    param := WEBUTIL_C_API.Add_parameter(args,
                                         WEBUTIL_C_API.C_CHAR_PTR,
                                         WEBUTIL_C_API.param_INOUT,
                                         vcVersion,
                                         40);
    WEBUTIL_C_API.Invoke(CLIENT_WIN_API.FunctionHandle(1),args);
    vcVersion := WEBUTIL_C_API.Get_Parameter_String(args,param);
    WEBUTIL_C_API.Destroy_Parameter_List(args);
    CLIENT_WIN_API_DEBUG.DebugLog(99,'DLLVersion','Result: Version='||vcVersion); 
    return vcVersion;
  end DLLVersion;

  PROCEDURE Clean_Error_Stack is 
  begin 
    -- just empty the variables
    ERROR_ENCOUNTERED  := FALSE;
    ERROR_STACK        := NULL;
  end Clean_Error_Stack;

  PROCEDURE Add_Error (CallingFunction in VARCHAR2, SetErrorText in VARCHAR2) is
  begin 
    -- Just watch for value errors 
    ERROR_ENCOUNTERED  := TRUE;
    ERROR_STACK    := CallingFunction||': '||substr(SetErrorText,1,1968);
    CLIENT_WIN_API_DEBUG.DebugLog(99,'Add_Error',ERROR_STACK);
  end Add_Error;

  FUNCTION Add_External_Errors return varchar2 is
    iCounter   pls_integer;
    vcErrBuff  varchar2(1968);
  begin 
    if tool_err.nerrors > 0 then 
      for iCounter in 1..tool_err.nerrors LOOP
        begin 
          vcErrBuff := vcErrBuff||chr(10)||tool_err.message;
        exception
          when VALUE_ERROR then 
            exit; <multilinecomment> String exceeds allowable buffer </multilinecomment>
        end;
        tool_err.pop;
      end loop;
    elsif SQLERRM is not null then 
      vcErrBuff := chr(10)||SQLERRM; 
    end if;
    return vcErrBuff;
  end Add_External_Errors;


  PROCEDURE Register_Function_Call ( FunctionID     in PLS_INTEGER, 
                                     FunctionName   in VARCHAR2,
                                     FunctionReturn in VARCHAR2, 
                                     FunctionArgs   in VARCHAR2) is
    vcArgs  VARCHAR2(200);
    vcFrag  VARCHAR2(10);
    iOffset PLS_INTEGER;   
  begin 
    if (not FunctionHandle.exists(FunctionId)) then
      -- We need to go through the registration process.      
      -- Register the function with the DLL
      FunctionHandle(FunctionId) := Webutil_C_API.register_function(DLL_NAME,FunctionName);
    end if;
  end Register_Function_Call; 

  Function StripDirSep ( InPath in varchar2) return varchar2 is 
    vcPath  varchar2(500) := InPath;
  begin 
    -- Check and Strip SemiColons, we take everything
    -- Before the first Semicolon as our path
    if instr(vcPath,';') > 0 then
      vcPath := substr(vcPath,1,instr(vcPath,';') -1);
    end if;

    -- Check and Strip '\'
    if substr(vcPath,-1,1) = '\' then 
      vcPath := substr(vcPath,1,length(vcPath)-1);
    end if;

    return vcPath;
  end StripDirSep;

  FUNCTION GetResource (ResourceName in VARCHAR2) return VARCHAR2 is
  begin 
    Return '<'||substr(DLL_NAME,1,(instr(DLL_NAME,'.')-1))||'>'||ResourceName;
  end GetResource;

BEGIN
  -- no need to pre-load the DLL for the web implemenation
  if WebUtil_core.GetClientOSFamily = WebUtil_core.CLIENT_PLATFORM_WIN32 then 
    CLIENT_WIN_API.API_ENABLED := true;
  end if;
END Client_Win_API; <multilinecomment> End Package Body Win API </multilinecomment>
		*/
		/* <p>
		*  Function and Procedure Bodies
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void preload() {
			preload(toBool(NBool.True));
		}

/* <p>
		*  Function and Procedure Bodies
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param raiseexceptions
		*/
		public void preload(NBool raiseexceptions)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vcversion= NString.getNull();
//			try
//			{
//				getContainer().getClientWinApiDebug().debuglog(toInt(99), toStr("PreLoad"), toStr("Args: (None)"));
//				vcversion = dllversion();
//			}
//			catch(NoDataFoundException e)
//			{
//				addError(toStr("D2KWUTIL (Pre-Load)"), NOAPI);
//				if ( raiseexceptions.getValue() )
//				{
//					throw  e;
//				}
//			}
//			catch(getClientwinapi().NotAvailable e)
//			{
//				addError(toStr("D2KWUTIL (Pre-Load)"), NOAPI);
//				if ( raiseexceptions.getValue() )
//				{
//					throw  e;
//				}
//			}
//			catch(Exception  e)
//			{
//				addError(toStr("D2KWUTIL (Pre-Load)"), UERROR.append(addExternalErrors()));
//				if ( raiseexceptions.getValue() )
//				{
//					throw  e;
//				}
//			}
//
			this.getLogger().trace(this, "F2J : preload procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString dllversion()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			UnknownTypes.WebutilCApiParameterlist args= null;
//			UnknownTypes.WebutilCApiParameterhandle param= null;
//			NString vcversion = rpad(" ", 40);
//			getContainer().getClientWinApiDebug().debuglog(toInt(99), toStr("DLLVersion"), toStr("Args: <No Arguments>"));
//			cleanErrorStack();
//			registerFunctionCall(toInt(1), toStr("d2kwutil_Version"), toStr("VOID"), toStr("*CHAR"));
//			args = getContainer().getWebutilCApi().createParameterList();
//			param = getContainer().getWebutilCApi().addParameter(args, getWebutilcapi().C_CHAR_PTR, getWebutilcapi().PARAM_INOUT, vcversion, 40);
//			getContainer().getWebutilCApi().invoke(functionhandle.functionhandle(1), args);
//			vcversion = getContainer().getWebutilCApi().getParameterString(args, param);
//			getContainer().getWebutilCApi().destroyParameterList(args);
//			getContainer().getClientWinApiDebug().debuglog(toInt(99), toStr("DLLVersion"), toStr("Result: Version=").append(vcversion));
//			return vcversion;
//
			this.getLogger().trace(this, "F2J : dllversion function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void cleanErrorStack()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  just empty the variables
//			errorEncountered = toBool(NBool.False);
//			errorStack = toStr(null);
//
			this.getLogger().trace(this, "F2J : cleanErrorStack procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param callingfunction
		* @param seterrortext
		*/
		public void addError(NString callingfunction, NString seterrortext)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  Just watch for value errors 
//			errorEncountered = toBool(NBool.True);
//			errorStack = callingfunction.append(": ").append(substring(seterrortext, toInt(1), toInt(1968)));
//			getContainer().getClientWinApiDebug().debuglog(toInt(99), toStr("Add_Error"), errorStack);
//
			this.getLogger().trace(this, "F2J : addError procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString addExternalErrors()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NInteger icounter= NInteger.getNull();
//			NString vcerrbuff= NString.getNull();
//			if ( SupportClasses.TOOL_ERR.Nerrors().greater(0) )
//			{
//				// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//				for ( icounter = 1; icounter <= SupportClasses.TOOL_ERR.Nerrors(); icounter+= 1 )
//				{
//					try
//					{
//						vcerrbuff = vcerrbuff.append(chr(10)).append(message());
//					}
//					catch(ValueErrorException e)
//					{
//							break;
//					}
//					// F2J_NOT_SUPPORTED : Call to built-in "POP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
//					//					SupportClasses.TOOL_ERR.Pop();
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'POP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
//					
//				}
//			}
//			else if ( !errorMessage().isNull() ) {
//				vcerrbuff = chr(10).append(errorMessage());
//			}
//			return vcerrbuff;
//
			this.getLogger().trace(this, "F2J : addExternalErrors function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param functionid
		* @param functionname
		* @param functionreturn
		* @param functionargs
		*/
		public void registerFunctionCall(NInteger functionid, NString functionname, NString functionreturn, NString functionargs)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vcargs= NString.getNull();
//			NString vcfrag= NString.getNull();
//			NInteger ioffset= NInteger.getNull();
//			if ((!functionhandle.size() >= functionid))
//			{
//				//  We need to go through the registration process.      
//				//  Register the function with the DLL
//							}
//
			this.getLogger().trace(this, "F2J : registerFunctionCall procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param inpath
		*/
		public NString stripdirsep(NString inpath)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vcpath = inpath;
//			//  Check and Strip SemiColons, we take everything
//			//  Before the first Semicolon as our path
//			if ( inStr(vcpath, toStr(";")).greater(0) )
//			{
//				vcpath = substring(vcpath, toInt(1), inStr(vcpath, toStr(";")).subtract(1));
//			}
//			//  Check and Strip '\'
//			if ( substring(vcpath, - (1), toInt(1)).equals("\\") )
//			{
//				vcpath = substring(vcpath, toInt(1), length(vcpath).subtract(1));
//			}
//			return vcpath;
//
			this.getLogger().trace(this, "F2J : stripdirsep function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param resourcename
		*/
		public NString getresource(NString resourcename)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return toStr("<").append(substring(DLL_NAME, toInt(1), ((inStr(DLL_NAME, toStr(".")).subtract(1))))).append(">").append(resourcename);
//
			this.getLogger().trace(this, "F2J : getresource function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
		public ClientWinApi() {
			//F2J_WRAPPED_CODE : The code of this Package Constructor was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  no need to pre-load the DLL for the web implemenation
//			if ( getContainer().getWebutilCore().getclientosfamily().equals(getWebutilcore().CLIENT_PLATFORM_WIN32) )
//			{
//				apiEnabled = toBool(NBool.True);
//			}
//
			this.getLogger().trace(this, "F2J : ClientWinApi Constructor is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
public static class Afunctionhandle extends OraTable<WebutilCApi.Functionhandle>{
}



	
}
