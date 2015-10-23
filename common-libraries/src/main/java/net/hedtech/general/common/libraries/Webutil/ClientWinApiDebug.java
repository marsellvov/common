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


public class ClientWinApiDebug extends AbstractSupportCodeObject {
	

	public ClientWinApiDebug(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) CLIENT_WIN_API_DEBUG
	/*
	PACKAGE Client_Win_API_Debug IS
  <multilinecomment>----------------------------------------------------------------------------*\
  * Debugging Functions
  * WebUtil version of D2KWUTIL package WIN_API_DEBUG                                     
  * Note: All debugging Levels etc are ignored - all output goes to the 
  * webutil_core log file now
  *********************************************************************************
  * Version 1.0.0
  *********************************************************************************
  * Change History
  *   DRMILLS 21/FEB/2003 - Port to WebUtil
  * 
  \*----------------------------------------------------------------------------</multilinecomment>


  <multilinecomment>----------------------------------------------------------------------------*\        
  * SetDebug ->  Enables/Disables the D2kwutil Internal Debugging
  *              You can Also use this for Debugging your own apps
  * Arguments:
  *    DebugType  0 = Normal State - No Debugging
  *               1 = Log
  *               2 = Log 
  *    DebugFile  IGNORED
  *    DebugLevel A numberical argument that allows you to impose "levels" of
  *               Debugging within a App. Use Values < 99. Level 99 will switch 
  *               on the Debug Calls in D2kwutil.
  *               During Dubugging all messages with a level < DebugLevel will
  *               be processed. Higher Debug levels will be ignored.
  *    TimeStamp  Defines if the Logged messages should be prefixed with
  *               the current time.
  \*----------------------------------------------------------------------------</multilinecomment>

  PROCEDURE SetDebug( DebugType   IN PLS_INTEGER, 
                     DebugFile   IN VARCHAR2 DEFAULT NULL, 
                     DebugLevel  IN PLS_INTEGER DEFAULT 98,                        
                     TimeStamp   IN BOOLEAN DEFAULT FALSE);

  <multilinecomment>----------------------------------------------------------------------------*\
  * DebugLog ->  Logs the Debug Output either to a Text File (appends)
  *              Or to a Windows Debugger - Depending on the 
  *              value set by SetDebug
  \*----------------------------------------------------------------------------</multilinecomment>    
  PROCEDURE DebugLog (DebugLevel  IN PLS_INTEGER, 
                     LoggingCall IN VARCHAR2, 
                     LogString   IN VARCHAR2); 

  <multilinecomment>----------------------------------------------------------------------------*\
  * DebugPause -> If you are debugging this just switches it off
  *               use DebugResume to restart.
  *               Using Pause and Resume, it doesn't matter if you are actually
  *               Debugging or not. It'll only take effect if you are 
  *               Currently Debugging.
  *               The LogPause argument just allows you to put the fact that you
  *               are pausing into the debug log. 
  *               If this is FALSE then you'll never know that debugging was 
  *               paused.
  \*----------------------------------------------------------------------------</multilinecomment>    
  PROCEDURE DebugPause(LogPause in BOOLEAN := FALSE); 

  <multilinecomment>----------------------------------------------------------------------------*\
  * DebugResume -> Resumes Debugging
  *               The LogResume argument just allows you to put the fact that you
  *               are resuming into the debug log. 
  *               If this is FALSE then you'll never know that debugging was 
  *               resumed.
  \*----------------------------------------------------------------------------</multilinecomment>    
  PROCEDURE DebugResume(LogResume in BOOLEAN := FALSE); 

  <multilinecomment>----------------------------------------------------------------------------*\
  * BoolToChar ->  A utility function for use when outputting Debug Strings
  *                Converts a Boolean Value to it's String equivilent e.g.
  *                TRUE becomes 'TRUE'
  \*----------------------------------------------------------------------------</multilinecomment>       
  FUNCTION  BoolToChar(ThisBoolean IN BOOLEAN) return VARCHAR2;

  <multilinecomment>-------------------------------------------------------------------------*\
  * WinDebug  ->  Sends a debug message to a windows Debugger
  *
  * Arguments: 
  *  Text        -> String to send  
  * Returns:
  *  (NONE)
  \*-------------------------------------------------------------------------</multilinecomment>

  PROCEDURE WinDebug   (  Text  IN   VARCHAR2);


  <multilinecomment>----------------------------------------------------------------------------*\
  * DEBUG_API_ENABLED - Do no alter this variable it is used internally by
  *                     d2kwutil.
  \*----------------------------------------------------------------------------</multilinecomment>
  DEBUG_API_ENABLED  BOOLEAN := FALSE;
END;
	*/
	
			// ----------------------------------------------------------------------------*\
		// * DEBUG_API_ENABLED - Do no alter this variable it is used internally by
		// *                     d2kwutil.
		// \*----------------------------------------------------------------------------
		public NBool debugApiEnabled = toBool(NBool.False);

			
		//Original PL/SQL code for Package Prog Unit (BODY) CLIENT_WIN_API_DEBUG
		/*
		PACKAGE BODY Client_Win_API_Debug IS

  -- Private Variables
  iDebugState         PLS_INTEGER    := 0;
  iDebugLevel         PLS_INTEGER    := 98;
  bDebugTimeStamp     BOOLEAN        := FALSE;
  bDebugPaused        BOOLEAN        := FALSE;
   

  PROCEDURE SetDebug( DebugType   IN PLS_INTEGER, 
                      DebugFile   IN VARCHAR2 DEFAULT NULL, 
                      DebugLevel  IN PLS_INTEGER DEFAULT 98,                        
                      TimeStamp   IN BOOLEAN DEFAULT FALSE) is
  begin 
    bDebugTimeStamp := TimeStamp;
    iDebugLevel     := DebugLevel;
    if DebugType > 0 then 
      iDebugState := 1;
      DebugLog(0,'SetDebug','Logging to File '||DebugFile);
    else 
      DebugLog(0,'SetDebug','Logging Stopped');
      iDebugState := 0;
    end if;
  end SetDebug;
   
  PROCEDURE DebugLog (DebugLevel  IN PLS_INTEGER, 
                      LoggingCall IN VARCHAR2, 
                      LogString   IN VARCHAR2) is
    vcDateStamp   VARCHAR2(10);
    vcDebugString VARCHAR2(2000);
    hFile         TEXT_IO.FILE_TYPE;
  begin
    if iDebugState = 0 then 
      NULL;
    elsif bDebugPaused then 
      NULL;
    elsif DebugLevel > iDebugLevel then 
      NULL;
    else
      -- Sort out the Datestamp    
      if bDebugTimeStamp then 
          vcDateStamp := to_char(SYSDATE,'HH24:MI:SS')||'> ';
      end if;

      -- Construct the final String
      vcDebugString := '<'||lpad(to_char(DebugLevel),2,0)||'> '||vcDateStamp||rpad(LoggingCall||':',30);
      vcDebugString := vcDebugString||substr(LogString,1,(2000-length(vcDebugString)));

      WebUtil_core.log('D2KWUTIL '||vcDebugString,false);
    end if;
  end DebugLog;
  
  PROCEDURE DebugPause(LogPause in BOOLEAN := FALSE) is
  begin 
    if LogPause then 
      DebugLog(0,'DebugPause','Pausing Debug output');
    end if;    
    bDebugPaused := TRUE;
  end DebugPause;

  PROCEDURE DebugResume(LogResume in BOOLEAN := FALSE) is
  begin 
    bDebugPaused := FALSE;
    if LogResume then 
      DebugLog(0,'DebugResume','Resuming Debug output');
    end if;
  end DebugResume;
  
  PROCEDURE WinDebug  (  Text  IN   VARCHAR2) is
  begin 
    -- no-op
    null;
  end WinDebug;

  FUNCTION  BoolToChar(ThisBoolean IN BOOLEAN) return VARCHAR2 is
  begin
    if ThisBoolean then 
      RETURN 'TRUE';
    else
      RETURN 'FALSE';
    end if;
  end BoolToChar;

END;
		*/
				//  Private Variables
		private NInteger idebugstate = toInt(0);
		private NInteger idebuglevel = toInt(98);
		private NBool bdebugtimestamp = toBool(NBool.False);
		private NBool bdebugpaused = toBool(NBool.False);
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param debugtype
		*/
		public void setdebug(NInteger debugtype) {
			setdebug(debugtype, NString.getNull(), toInt(98), toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param debugtype
		* @param debugfile
		*/
		public void setdebug(NInteger debugtype, NString debugfile) {
			setdebug(debugtype, debugfile, toInt(98), toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param debugtype
		* @param debugfile
		* @param debuglevel
		*/
		public void setdebug(NInteger debugtype, NString debugfile, NInteger debuglevel) {
			setdebug(debugtype, debugfile, debuglevel, toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param debugtype
		* @param debugfile
		* @param debuglevel
		* @param timestamp
		*/
		public void setdebug(NInteger debugtype, NString debugfile, NInteger debuglevel, NBool timestamp)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			bdebugtimestamp = timestamp;
//			idebuglevel = debuglevel;
//			if ( debugtype.greater(0) )
//			{
//				idebugstate = toInt(1);
//				debuglog(toInt(0), toStr("SetDebug"), toStr("Logging to File ").append(debugfile));
//			}
//			else {
//				debuglog(toInt(0), toStr("SetDebug"), toStr("Logging Stopped"));
//				idebugstate = toInt(0);
//			}
//
			this.getLogger().trace(this, "F2J : setdebug procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param debuglevel
		* @param loggingcall
		* @param logstring
		*/
		public void debuglog(NInteger debuglevel, NString loggingcall, NString logstring)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vcdatestamp= NString.getNull();
//			NString vcdebugstring= NString.getNull();
//			ITextFile hfile= null;
//			if ( idebugstate.equals(0) )
//			{
//			}
//			else if ( bdebugpaused.getValue() ) {
//			}
//			else if ( debuglevel.greater(idebuglevel) ) {
//			}
//			else {
//				//  Sort out the Datestamp    
//				if ( bdebugtimestamp.getValue() )
//				{
//					vcdatestamp = toChar(NDate.getNow(), "HH24:MI:SS").append("> ");
//				}
//				//  Construct the final String
//				vcdebugstring = toStr("<").append(lpad(toChar(debuglevel), 2, 0)).append("> ").append(vcdatestamp).append(rpad(loggingcall.append(":"), 30));
//				vcdebugstring = vcdebugstring.append(substring(logstring, toInt(1), ((toInt(2000).subtract(length(vcdebugstring))))));
//				getContainer().getWebutilCore().log(toStr("D2KWUTIL ").append(vcdebugstring), toBool(NBool.False));
//			}
//
			this.getLogger().trace(this, "F2J : debuglog procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void debugpause() {
			debugpause(toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param logpause
		*/
		public void debugpause(NBool logpause)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( logpause.getValue() )
//			{
//				debuglog(toInt(0), toStr("DebugPause"), toStr("Pausing Debug output"));
//			}
//			bdebugpaused = toBool(NBool.True);
//
			this.getLogger().trace(this, "F2J : debugpause procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void debugresume() {
			debugresume(toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param logresume
		*/
		public void debugresume(NBool logresume)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			bdebugpaused = toBool(NBool.False);
//			if ( logresume.getValue() )
//			{
//				debuglog(toInt(0), toStr("DebugResume"), toStr("Resuming Debug output"));
//			}
//
			this.getLogger().trace(this, "F2J : debugresume procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param text
		*/
		public void windebug(NString text)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  no-op
//
			this.getLogger().trace(this, "F2J : windebug procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param thisboolean
		*/
		public NString booltochar(NBool thisboolean)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( thisboolean.getValue() )
//			{
//				return  toStr("TRUE");
//			}
//			else {
//				return  toStr("FALSE");
//			}
//
			this.getLogger().trace(this, "F2J : booltochar function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
		
	
	
}
