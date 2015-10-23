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
import morphis.foundations.core.appsupportlib.util.io.ITextFile;
import morphis.foundations.core.appsupportlib.util.io.TextFileManager;
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

public class GTracePkg extends AbstractSupportCodeObject {
	

	public GTracePkg(ISupportCodeContainer container) {
		super(container);
		setDefaultValue("N", "GLOBAL.DO_TRIGGER_TRACE");
		// 
		//  get the location of the TEMP directory.
		// 
		//  -- -- --  TOOL_ENV.GETVAR('TEMP',file_name);
		if ( !fileName.isNull() )
		{
			if ( substring(fileName, isNull(length(fileName), 0)).notEquals("\\") )
			{
				fileName = fileName.append("\\");
			}
			fileName = fileName.append("b2ktrace.log");
		}
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_TRACE_PKG
	/*
	PACKAGE G$_TRACE_PKG IS
--
--  This a general routine which is being used for debugging and performance
--  evaluation purposes.  This routine is called by other routines, passing in
--  the name of the trigger or pl/sql unit.  A global is evaluated as to whether
--  or not to write the information out to a flat file.
--
  is_on       VARCHAR2(1) := 'N';
  date_time   VARCHAR2(30);
  event_win   VARCHAR2(30);
  form_name   VARCHAR2(30);
  item_name   VARCHAR2(61);
  file_name   VARCHAR2(200);
  output_line VARCHAR2(2000) := NULL;
--
  out_file    TEXT_IO.FILE_TYPE;
--
  PROCEDURE WRITE_DATA (in_string IN VARCHAR2);
  PROCEDURE TRACE_RTN (in_string IN VARCHAR2);
  PROCEDURE DO_EXEC_SQL (on_or_off IN VARCHAR2);
--
  PROCEDURE TURN_SQL_TRACE_ON;
  PROCEDURE TURN_SQL_TRACE_OFF;
--
  PROCEDURE TURN_PLSQL_TRACE_ON;
  PROCEDURE TURN_PLSQL_TRACE_OFF;
--
  PROCEDURE SET_OPTIMIZER_ALL_ROWS;
  PROCEDURE SET_OPTIMIZER_FIRST_ROWS;
  PROCEDURE SET_OPTIMIZER_FIRST_ROWS (p_row_cnt IN PLS_INTEGER);
  PROCEDURE SET_OPTIMIZER_RULE;
END;
	*/
	
			// 
		//   This a general routine which is being used for debugging and performance
		//   evaluation purposes.  This routine is called by other routines, passing in
		//   the name of the trigger or pl/sql unit.  A global is evaluated as to whether
		//   or not to write the information out to a flat file.
		// 
		public NString isOn = toStr("N");
		public NString dateTime= NString.getNull();
		public NString eventWin= NString.getNull();
		public NString formName= NString.getNull();
		public NString itemName= NString.getNull();
		public NString fileName= NString.getNull();
		public NString outputLine = NString.getNull();
		// 
		public ITextFile outFile= null;

			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_TRACE_PKG
		/*
		PACKAGE BODY G$_TRACE_PKG IS
--
--  This routine writes the information out to a flat file.
--
  PROCEDURE WRITE_DATA (in_string IN VARCHAR2) IS
  BEGIN
    date_time := TO_CHAR(SYSDATE,''||G$_DATE.GET_NLS_DATE_FORMAT||' HH:MM:SS');
    event_win := NVL(NAME_IN('SYSTEM.EVENT_WINDOW'),'NULL');
    form_name := NVL(NAME_IN('SYSTEM.CURRENT_FORM'),'NULL');
    item_name := NVL(NAME_IN('SYSTEM.CURSOR_ITEM'),'NULL');
--
    TEXT_IO.PUT_LINE(out_file, 'F: ' || form_name || ' W: ' || event_win
                              || ' I: ' || item_name || ' P: ' || in_string
                              || ' T: ' || date_time);
--
  EXCEPTION
    WHEN OTHERS THEN
      MESSAGE('G$_TRACE_PKG.WRITE_DATA: ' || SQLERRM); PAUSE;
  END;
--
--  This routine checks if tracing is turned on and if so calls
--  the other routine to write the file.  It opens and closes the file.
--
  PROCEDURE TRACE_RTN (in_string IN VARCHAR2) IS
  BEGIN
--
-- if tracing is turned on
--
    IF NVL(NAME_IN('GLOBAL.DO_TRIGGER_TRACE'),'N') = 'Y' THEN
--
-- is this a windows environment
--
      IF NAME_IN('GLOBAL.OS_IND') = 'WIN32COMMON' THEN
        IF file_name IS NOT NULL THEN
          IF NOT TEXT_IO.IS_OPEN(out_file) THEN
            out_file := TEXT_IO.FOPEN(file_name, 'a');
          END IF;
--
          WRITE_DATA(in_string);
          TEXT_IO.FCLOSE(out_file);
        END IF;
      END IF;
    END IF;
--
  EXCEPTION
    WHEN OTHERS THEN
      MESSAGE('G$_TRACE_PKG.TRACE_RTN: ' || in_string || ' ' || SQLERRM); PAUSE;
  END;
--
-- SQL Trace routines
--
  PROCEDURE DO_EXEC_SQL (on_or_off IN VARCHAR2) IS
    connection_id EXEC_SQL.CONNTYPE;
    cursor_number EXEC_SQL.CURSTYPE;
    ret_code      PLS_INTEGER;
    sql_string    VARCHAR2(2000) := 'Alter session set sql_trace ' || on_or_off;
--
  BEGIN
    IF on_or_off NOT IN ('TRUE','FALSE') THEN
    	sql_string := on_or_off;
    END IF;
--
    connection_id := EXEC_SQL.DEFAULT_CONNECTION;
    cursor_number :=  EXEC_SQL.OPEN_CURSOR(connection_id);
--
    EXEC_SQL.PARSE(connection_id, cursor_number, sql_string);
    ret_code := EXEC_SQL.EXECUTE(connection_id, cursor_number);
    EXEC_SQL.CLOSE_CURSOR(connection_id, cursor_number);
    EXEC_SQL.CLOSE_CONNECTION(connection_id);
--
  EXCEPTION
    WHEN EXEC_SQL.PACKAGE_ERROR THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0156','LIB','*ERROR* DO_EXEC_SQL failed: %01%',
                                                EXEC_SQL.LAST_ERROR_MESG(connection_id)));
      IF EXEC_SQL.IS_CONNECTED(connection_id) THEN
        IF EXEC_SQL.IS_OPEN(connection_id,cursor_number) THEN
          EXEC_SQL.CLOSE_CURSOR(connection_id, cursor_number);
        END IF;
        EXEC_SQL.CLOSE_CONNECTION(connection_id);
      END IF;
      RAISE FORM_TRIGGER_FAILURE;
    WHEN OTHERS THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0157','LIB','*ERROR* Call to DO_EXEC_SQL raised errors.'));
      RAISE FORM_TRIGGER_FAILURE;
  END;
--
  PROCEDURE TURN_SQL_TRACE_ON IS
  BEGIN
    SET_MENU_ITEM_PROPERTY('TECHNICAL.TRACEON',ENABLED,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.TRACEOFF',ENABLED,PROPERTY_TRUE);
    DO_EXEC_SQL('TRUE');
  END;
--
  PROCEDURE TURN_SQL_TRACE_OFF IS
  BEGIN
    SET_MENU_ITEM_PROPERTY('TECHNICAL.TRACEON',ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.TRACEOFF',ENABLED,PROPERTY_FALSE);
    DO_EXEC_SQL('FALSE');
  END;
--
-- PL/SQL Tracing
--
  PROCEDURE TURN_PLSQL_TRACE_ON IS
    ret_code      PLS_INTEGER;
    trc_name      VARCHAR2(60) := NAME_IN('GLOBAL.CURRENT_USER')||'-'||NAME_IN('GLOBAL.SESSION_ID');
    trc_cmt       VARCHAR2(20) := TO_CHAR(SYSDATE,''||G$_DATE.GET_NLS_DATE_FORMAT||' HH:MI:SS');
  BEGIN
<multilinecomment>
    ret_code := GOKDBMS.PROFILER_START_PROFILER(trc_name,trc_cmt);
    IF ret_code <> 0 THEN
    	MESSAGE('START RETURN CODE: ' || TO_CHAR(ret_code)); PAUSE;
    END IF;
</multilinecomment>
    NULL;
  END;
--
  PROCEDURE TURN_PLSQL_TRACE_OFF IS
    ret_code      PLS_INTEGER;
  BEGIN
<multilinecomment>
    ret_code := GOKDBMS.PROFILER_FLUSH_DATA;
    IF ret_code <> 0 THEN
    	MESSAGE('FLUSH RETURN CODE: ' || TO_CHAR(ret_code)); PAUSE;
    END IF;
    ret_code := GOKDBMS.PROFILER_STOP_PROFILER;
    IF ret_code <> 0 THEN
    	MESSAGE('STOP RETURN CODE: ' || TO_CHAR(ret_code)); PAUSE;
    END IF;
</multilinecomment>
    NULL;
  END;
--
  PROCEDURE SET_OPTIMIZER_ALL_ROWS IS
  BEGIN
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEALLROWS',     ENABLED,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEFIRSTROWS',   ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEFIRSTROWS1',  ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEFIRSTROWS10', ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEFIRSTROWS100',ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODERULE',        ENABLED,PROPERTY_TRUE);
   	DO_EXEC_SQL('ALTER SESSION SET OPTIMIZER_MODE = ALL_ROWS');
  END;
--
  PROCEDURE SET_OPTIMIZER_FIRST_ROWS IS
  BEGIN
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEALLROWS',     ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEFIRSTROWS',   ENABLED,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEFIRSTROWS1',  ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEFIRSTROWS10', ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEFIRSTROWS100',ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODERULE',        ENABLED,PROPERTY_TRUE);
   	DO_EXEC_SQL('ALTER SESSION SET OPTIMIZER_MODE = FIRST_ROWS');
  END;
--
  PROCEDURE SET_OPTIMIZER_FIRST_ROWS (p_row_cnt IN PLS_INTEGER) IS
    lv_row_cnt  VARCHAR2(4) := TO_CHAR(p_row_cnt);
  BEGIN
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEALLROWS',     ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEFIRSTROWS',   ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEFIRSTROWS1',  ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEFIRSTROWS10', ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEFIRSTROWS100',ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODERULE',        ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEFIRSTROWS' || lv_row_cnt,ENABLED,PROPERTY_FALSE);
   	DO_EXEC_SQL('ALTER SESSION SET OPTIMIZER_MODE = FIRST_ROWS_' || lv_row_cnt);
  END;
--
  PROCEDURE SET_OPTIMIZER_RULE IS
  BEGIN
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEALLROWS',     ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEFIRSTROWS',   ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEFIRSTROWS1',  ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEFIRSTROWS10', ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODEFIRSTROWS100',ENABLED,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('TECHNICAL.MODERULE',        ENABLED,PROPERTY_FALSE);
   	DO_EXEC_SQL('ALTER SESSION SET OPTIMIZER_MODE = RULE');
  END;
--
-- Main logic which executes once.
--
BEGIN
  DEFAULT_VALUE('N','GLOBAL.DO_TRIGGER_TRACE');
--
-- get the location of the TEMP directory.
--
-- -- -- --  TOOL_ENV.GETVAR('TEMP',file_name);
  IF file_name IS NOT NULL THEN
    IF SUBSTR(file_name,NVL(LENGTH(file_name), 0)) <> '\' THEN
      file_name := file_name || '\';
    END IF;
    file_name := file_name || 'b2ktrace.log';
  END IF;
--
END;
		*/
		/* <p>
		* 
		*   This routine writes the information out to a flat file.
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param inString
		*/
		public void writeData(NString inString)
		{
			try
			{
				dateTime = toChar(NDate.getNow(), toStr("").append(GDate.getNlsDateFormat()).append(" HH:MM:SS"));
				eventWin = isNull(getCurrentWindow(), "NULL");
				formName = isNull(getCurrentTaskName(), "NULL");
				itemName = isNull(getCursorItem(), "NULL");
				// 
				outFile.writeLn(toStr("F: ").append(formName).append(" W: ").append(eventWin).append(" I: ").append(itemName).append(" P: ").append(inString).append(" T: ").append(dateTime));
			}
			catch(Exception  e)
			{
				errorMessage(toStr("G$_TRACE_PKG.WRITE_DATA: ").append(errorMessage()));
				// F2J_TO_REMOVE : Call to built-in "PAUSE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#ExcludePause".
				//				SupportClasses.SQLFORMS.Pause();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'PAUSE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#ExcludePause'.");
				
				
			}
		}
/* <p>
		* 
		*   This routine checks if tracing is turned on and if so calls
		*   the other routine to write the file.  It opens and closes the file.
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param inString
		*/
		public void traceRtn(NString inString)
		{
			try
			{
				if (outFile == null)
					return;
					
				// 
				//  if tracing is turned on
				// 
				if ( isNull(getNameIn("GLOBAL.DO_TRIGGER_TRACE"), "N").equals("Y") )
				{
					// 
					//  is this a windows environment
					// 
					if ( getNameIn("GLOBAL.OS_IND").equals("WIN32COMMON") )
					{
						if ( !fileName.isNull() )
						{
							if (  !outFile.isOpen() )
							{
								// F2J_TO_COMPLETE Check if the file being opened is really a server side file or a file to be downloaded or uploaded, see documentation for details
								//MORPHIS: review this code
								//outFile = TextFileManager.open(fileName, "a");
;
							}
							// 
							writeData(inString);
							outFile.close();
						}
					}
				}
			}
			catch(Exception  e)
			{
				errorMessage(toStr("G$_TRACE_PKG.TRACE_RTN: ").append(inString).append(" ").append(errorMessage()));
				// F2J_TO_REMOVE : Call to built-in "PAUSE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#ExcludePause".
				//				SupportClasses.SQLFORMS.Pause();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'PAUSE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#ExcludePause'.");
				
				
			}
		}
/* <p>
		* 
		*  SQL Trace routines
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param onOrOff
		*/
		public void doExecSql(NString onOrOff)
		{
			NString sqlString = toStr("Alter session set sql_trace ").append(onOrOff);
			
			try
			{
				if ( !in(onOrOff, "TRUE", "FALSE").getValue() )
				{
					sqlString = onOrOff;
				}
				DataCommand cmd = new DataCommand(sqlString.toString());	
				cmd.execute();
			}
			catch(Exception e)
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0140"), toStr("LIB"), toStr("*ERROR* Call to DO_EXEC_SQL raised errors.")));
				throw new ApplicationException();
			}
		}
/* <p>
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void turnSqlTraceOn()
		{
			setMenuItemEnabled("TECHNICAL.TRACEON", false);
			setMenuItemEnabled("TECHNICAL.TRACEOFF", true);
			doExecSql(toStr("TRUE"));
		}
/* <p>
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void turnSqlTraceOff()
		{
			setMenuItemEnabled("TECHNICAL.TRACEON", true);
			setMenuItemEnabled("TECHNICAL.TRACEOFF", false);
			doExecSql(toStr("FALSE"));
		}
/* <p>
		* 
		*  PL/SQL Tracing
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void turnPlsqlTraceOn()
		{
			NInteger retCode= NInteger.getNull();
			NString trcName = getNameIn("GLOBAL.CURRENT_USER").append("-").append(getNameIn("GLOBAL.SESSION_ID"));
			NString trcCmt = toChar(NDate.getNow(), toStr("").append(GDate.getNlsDateFormat()).append(" HH:MI:SS"));
			// ret_code := GOKDBMS.PROFILER_START_PROFILER(trc_name,trc_cmt);
			// IF ret_code <> 0 THEN
			// MESSAGE('START RETURN CODE: ' || TO_CHAR(ret_code)); PAUSE;
			// END IF;
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void turnPlsqlTraceOff()
		{
			NInteger retCode= NInteger.getNull();
			// ret_code := GOKDBMS.PROFILER_FLUSH_DATA;
			// IF ret_code <> 0 THEN
			// MESSAGE('FLUSH RETURN CODE: ' || TO_CHAR(ret_code)); PAUSE;
			// END IF;
			// ret_code := GOKDBMS.PROFILER_STOP_PROFILER;
			// IF ret_code <> 0 THEN
			// MESSAGE('STOP RETURN CODE: ' || TO_CHAR(ret_code)); PAUSE;
			// END IF;
		}
/* <p>
		* 
/* </p>
		*/
		public void setOptimizerAllRows()
		{
			setMenuItemEnabled("TECHNICAL.MODEALLROWS", false);
			setMenuItemEnabled("TECHNICAL.MODEFIRSTROWS", true);
			setMenuItemEnabled("TECHNICAL.MODEFIRSTROWS1", true);
			setMenuItemEnabled("TECHNICAL.MODEFIRSTROWS10", true);
			setMenuItemEnabled("TECHNICAL.MODEFIRSTROWS100", true);
			setMenuItemEnabled("TECHNICAL.MODERULE", true);
			doExecSql(toStr("ALTER SESSION SET OPTIMIZER_MODE = ALL_ROWS"));
		}
/* <p>
		* 
/* </p>
		*/
		public void setOptimizerFirstRows()
		{
			setMenuItemEnabled("TECHNICAL.MODEALLROWS", true);
			setMenuItemEnabled("TECHNICAL.MODEFIRSTROWS", false);
			setMenuItemEnabled("TECHNICAL.MODEFIRSTROWS1", true);
			setMenuItemEnabled("TECHNICAL.MODEFIRSTROWS10", true);
			setMenuItemEnabled("TECHNICAL.MODEFIRSTROWS100", true);
			setMenuItemEnabled("TECHNICAL.MODERULE", true);
			doExecSql(toStr("ALTER SESSION SET OPTIMIZER_MODE = FIRST_ROWS"));
		}
/* <p>
		* 
/* </p>
		* @param pRowCnt
		*/
		public void setOptimizerFirstRows(NInteger pRowCnt)
		{
			NString lvRowCnt = toChar(pRowCnt);
			setMenuItemEnabled("TECHNICAL.MODEALLROWS", true);
			setMenuItemEnabled("TECHNICAL.MODEFIRSTROWS", true);
			setMenuItemEnabled("TECHNICAL.MODEFIRSTROWS1", true);
			setMenuItemEnabled("TECHNICAL.MODEFIRSTROWS10", true);
			setMenuItemEnabled("TECHNICAL.MODEFIRSTROWS100", true);
			setMenuItemEnabled("TECHNICAL.MODERULE", true);
			setMenuItemEnabled(toStr("TECHNICAL.MODEFIRSTROWS").append(lvRowCnt), false);
			doExecSql(toStr("ALTER SESSION SET OPTIMIZER_MODE = FIRST_ROWS_").append(lvRowCnt));
		}
/* <p>
		* 
/* </p>
		*/
		public void setOptimizerRule()
		{
			setMenuItemEnabled("TECHNICAL.MODEALLROWS", true);
			setMenuItemEnabled("TECHNICAL.MODEFIRSTROWS", true);
			setMenuItemEnabled("TECHNICAL.MODEFIRSTROWS1", true);
			setMenuItemEnabled("TECHNICAL.MODEFIRSTROWS10", true);
			setMenuItemEnabled("TECHNICAL.MODEFIRSTROWS100", true);
			setMenuItemEnabled("TECHNICAL.MODERULE", false);
			doExecSql(toStr("ALTER SESSION SET OPTIMIZER_MODE = RULE"));
		}
		
	
}
