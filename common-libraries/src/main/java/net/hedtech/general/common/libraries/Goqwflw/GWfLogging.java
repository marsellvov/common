package net.hedtech.general.common.libraries.Goqwflw;

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
import net.hedtech.general.common.libraries.Goqrpls.*;

public class GWfLogging extends AbstractSupportCodeObject {
	

	public GWfLogging(ISupportCodeContainer container) {
		super(container);
		
		osName = getNameIn("GLOBAL.OS_IND");
		fileName = getNameIn("GLOBAL.WF_LOG_FILE");
	}
	
	@Override
	public GoqwflwServices getContainer() {
		return (GoqwflwServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_WF_LOGGING
	/*
	PACKAGE G$_WF_LOGGING IS
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
  os_name     VARCHAR2(100);
  output_line VARCHAR2(2000) := NULL;
--
  out_file    TEXT_IO.FILE_TYPE;
--
  PROCEDURE WRITE_DATA (in_string IN VARCHAR2);
  PROCEDURE DEBUG_MSG (in_string IN VARCHAR2);   
  
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
		public NString osName= NString.getNull();
		public NString outputLine = NString.getNull();
		// 
		public ITextFile outFile= null;

			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_WF_LOGGING
		/*
		PACKAGE BODY G$_WF_LOGGING IS

--
--  This routine writes the information out to a flat file.
--
  PROCEDURE WRITE_DATA (in_string IN VARCHAR2) IS
  BEGIN
--
    BEGIN
      date_time := TO_CHAR(SYSDATE,'' || NAME_IN('GLOBAL.NLS_DATE_FORMAT') || ' HH:MI:SS');
    EXCEPTION
    	WHEN OTHERS THEN
    	  date_time := 'Not Connected';
    END;
--
    event_win := NVL(NAME_IN('SYSTEM.EVENT_WINDOW'),'NULL');
    form_name := NVL(NAME_IN('SYSTEM.CURRENT_FORM'),'NULL');
    item_name := NVL(NAME_IN('SYSTEM.CURSOR_ITEM'),'NULL');
--
    TEXT_IO.PUT_LINE(out_file, ' T: ' || date_time || ' F: ' || form_name || ' W: ' || event_win
                              || ' I: ' || item_name || ' P: ' || in_string );
--
  EXCEPTION
    WHEN OTHERS THEN
      MESSAGE('G$_WF_LOGGING.WRITE_DATA: ' || SQLERRM); PAUSE;
  END;
--
--  This routine checks if tracing is turned on and if so calls
--  the other routine to write the file.  It opens and closes the file.
--
  PROCEDURE DEBUG_MSG(in_string IN VARCHAR2) IS
  BEGIN
    IF file_name IS NULL THEN
      RETURN;
    ELSE
      IF os_name = 'WIN32COMMON' THEN
        IF NOT TEXT_IO.IS_OPEN(out_file) THEN
          out_file := TEXT_IO.FOPEN(file_name, 'a');
        END IF;
--
        WRITE_DATA(in_string);
        TEXT_IO.FCLOSE(out_file);
      END IF;
    END IF;
--
  EXCEPTION
    WHEN OTHERS THEN
      MESSAGE('G$_WF_LOGGING.DEBUB_MSG: ' || in_string || ' ' || SQLERRM); PAUSE;
  END;
  
BEGIN
  os_name   := NAME_IN('GLOBAL.OS_IND');
  file_name := NAME_IN('GLOBAL.WF_LOG_FILE');
END G$_WF_LOGGING;
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
			try
			{
				dateTime = toChar(NDate.getNow(), toStr("").append(getNameIn("GLOBAL.NLS_DATE_FORMAT")).append(" HH:MI:SS"));
			}
			catch(Exception  e)
			{
				dateTime = toStr("Not Connected");
			}
//
			eventWin = isNull(getCurrentWindow(), "NULL");
			formName = isNull(getCurrentTaskName(), "NULL");
			itemName = isNull(getCursorItem(), "NULL");
//				
			outFile.writeLn(toStr(" T: ").append(dateTime).append(" F: ").append(formName).append(" W: ").append(eventWin).append(" I: ").append(itemName).append(" P: ").append(inString));
		}
		catch(Exception  e)
		{
			errorMessage(toStr("G$_WF_LOGGING.WRITE_DATA: ").append(errorMessage()));
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
		public void debugMsg(NString inString)
		{
		try {
			//MORPHIS: TEST
			//System.out.println(">>> DEBUG MSG:" + inString );
			
			if (fileName.isNull()) {
				return;
			}
			else {
				if ( osName.equals("WIN32COMMON") )
				{
					if (!outFile.isOpen()) {
						outFile = (ITextFile) TextFileManager.open(fileName, "a");
					}
//
					writeData(inString);
					outFile.close();
				}
			}
		}
		catch(Exception  e)
		{
			errorMessage(toStr("G$_WF_LOGGING.DEBUB_MSG: ").append(inString).append(" ").append(errorMessage()));
		}
}
}