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

public class PkgTimestampFormat extends AbstractSupportCodeObject {
	

	public PkgTimestampFormat(ISupportCodeContainer container) {
		super(container);
	}

	public GuainitTask  getTask() {
		return (GuainitTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Guainit.model.GuainitModel getFormModel() {
		return getTask().getModel();
	}
	
	//Original PL/SQL code for Package Prog Unit (SPEC) PKG_TIMESTAMP_FORMAT
	/*
	PACKAGE pkg_timestamp_format IS

  -- Packaged variable to catch the last logon time and date
  pk_timestamp DATE;
  --
  
  --Procedure to reformat the logon date and time according to NLS settings
  --This formatted value is assigned to global variable GLOBAL.LAST_LOGON_TIME
  PROCEDURE p_format_timestamp;
  --
  
END pkg_timestamp_format;
	*/
			//  Packaged variable to catch the last logon time and date
		public NDate pkTimestamp= NDate.getNull();

			
		//Original PL/SQL code for Package Prog Unit (BODY) PKG_TIMESTAMP_FORMAT
		/*
		PACKAGE BODY pkg_timestamp_format 
IS
--
  PROCEDURE p_format_timestamp
  IS
    l_nls_time_format VARCHAR2(100);
    l_time_factor VARCHAR2(50);
    l_date_factor VARCHAR2(50);
  BEGIN

    DEFAULT_VALUE('', 'GLOBAL.LAST_LOGON_TIME');

-- If we are restarting a session then this will have already been populated

    IF :GLOBAL.LAST_LOGON_TIME IS NULL THEN
      SELECT value
        INTO l_nls_time_format 
        FROM NLS_SESSION_PARAMETERS
       WHERE PARAMETER = 'NLS_TIME_FORMAT';

      IF ( l_nls_time_format LIKE '%24%' ) THEN
          l_nls_time_format := 'HH24:MI:SS';
         
      ELSE
          l_nls_time_format := 'HH:MI:SS AM';
      END IF;
      --Date and time facor are seperated in order to dispaly time digits correctly(EX: 4:5:60 AM/PM as 04:05:60 AM/PM)
      l_time_factor := TO_CHAR( pkg_timestamp_format.pk_timestamp,l_nls_time_format);
      l_date_factor := TO_CHAR( pkg_timestamp_format.pk_timestamp,'DL');
      --
      :GLOBAL.LAST_LOGON_TIME := l_date_factor||' '||l_time_factor; 
    END IF;
                                            
    EXCEPTION
      WHEN OTHERS THEN
        :GLOBAL.LAST_LOGON_TIME := pkg_timestamp_format.pk_timestamp;

    END p_format_timestamp;
--
END pkg_timestamp_format;
		*/

		public void pFormatTimestamp()
		{
			int rowCount = 0;
			NString lNlsTimeFormat= NString.getNull();
			NString lTimeFactor= NString.getNull();
			NString lDateFactor= NString.getNull();
			try
			{
				setDefaultValue("", "GLOBAL.LAST_LOGON_TIME");
				if ( getGlobal("LAST_LOGON_TIME").isNull() )
				{
					String sql1 = "SELECT value " +
	" FROM NLS_SESSION_PARAMETERS " +
	" WHERE PARAMETER = 'NLS_TIME_FORMAT' ";
					DataCommand command1 = new DataCommand(sql1);
					ResultSet results1 = command1.executeQuery();
					rowCount = command1.getRowCount();
					if ( results1.hasData() ) {
						lNlsTimeFormat = results1.getStr(0);
					}
					results1.close();
					if ((like(lNlsTimeFormat, "%24%")))
					{
						lNlsTimeFormat = toStr("HH24:MI:SS");
					}
					else {
						lNlsTimeFormat = toStr("HH:MI:SS AM");
					}
					lTimeFactor = toChar(pkTimestamp, lNlsTimeFormat);
					lDateFactor = toChar(pkTimestamp, "DL");
					setGlobal("LAST_LOGON_TIME", lDateFactor.append(" ").append(lTimeFactor));
				}
			}
			catch(Exception  e)
			{
				setGlobal("LAST_LOGON_TIME", toStr(pkTimestamp));
			}
		}
		
	
	
}
