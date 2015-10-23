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

public class GToolbar extends AbstractSupportCodeObject {
	

	public GToolbar(ISupportCodeContainer container) {
		super(container);
		ind6 = isNull(getNameIn("PARAMETER.G$_PREFERENCES"), "YYYYYY");
		// 
		for ( int i = 1; i <= 6; i++ )
		{
			ind = substring(ind6, i, toInt(1));
			// 
			if (i == 1)
			{
				vDispHintCb = ind;
			}
			else if (i == 2)
			{
				vFormnameCb = ind;
			}
			else if (i == 3)
			{
				vReleaseCb = ind;
			}
			else if (i == 4)
			{
				vDbaseInstCb = ind;
			}
			else if (i == 5)
			{
				vDateTimeCb = ind;
			}
			else if (i == 6)
			{
				vReqItemCb = ind;
			}
			else {
			}
		}
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_TOOLBAR
	/*
	PACKAGE G$_TOOLBAR IS
--
  pref_config   VARCHAR2(1);
--
  FUNCTION READ_VALUE(v_pref IN VARCHAR2) RETURN VARCHAR2;
  FUNCTION HINT_ENABLED RETURN BOOLEAN;
END;
	*/
	
			// 
		public NString prefConfig= NString.getNull();

			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_TOOLBAR
		/*
		PACKAGE BODY G$_TOOLBAR IS
  V_DISP_HINT_CB  VARCHAR2(1);   -- mapped as 1
  V_FORMNAME_CB   VARCHAR2(1);   --        as 2
  V_RELEASE_CB    VARCHAR2(1);   --        as 3
  V_DBASE_INST_CB VARCHAR2(1);   --        as 4
  V_DATE_TIME_CB  VARCHAR2(1);   --        as 5
  V_REQ_ITEM_CB   VARCHAR2(1);   --        as 6
--
  ind             VARCHAR2(1);
  ind6            VARCHAR2(6);
--
--
  FUNCTION READ_VALUE(v_pref IN VARCHAR2) RETURN VARCHAR2 IS
  BEGIN
    CASE v_pref
      WHEN 'FORM_NAME'  THEN RETURN (V_FORMNAME_CB || 'ES');
      WHEN 'RELEASE'    THEN RETURN (V_RELEASE_CB || 'ES');
      WHEN 'DBASE_INST' THEN RETURN (V_DBASE_INST_CB || 'ES');
      ELSE MESSAGE(G$_NLS.Get('GOQRPLS-0155','LIB','*ERROR* READ THIS = %01%',v_pref)); PAUSE;
           RETURN('NO'); 
    END CASE;
  END;
--
--
  FUNCTION HINT_ENABLED RETURN BOOLEAN IS
  BEGIN
    IF V_DISP_HINT_CB = 'Y' THEN
      RETURN(TRUE);
    END IF;
--
    RETURN(FALSE);
  END;
--
---- MAIN BODY
--
BEGIN
  ind6 := NVL(NAME_IN('PARAMETER.G$_PREFERENCES'),'YYYYYY');
--
  FOR i IN 1..6 LOOP
    ind := SUBSTR(ind6,i,1);
--
    CASE i
      WHEN 1 THEN V_DISP_HINT_CB := ind;
      WHEN 2 THEN V_FORMNAME_CB := ind;
      WHEN 3 THEN V_RELEASE_CB := ind;
      WHEN 4 THEN V_DBASE_INST_CB:= ind;
      WHEN 5 THEN V_DATE_TIME_CB := ind;
      WHEN 6 THEN V_REQ_ITEM_CB := ind;
      ELSE NULL;
    END CASE;
--
  END LOOP;
END;
		*/
				private NString vDispHintCb= NString.getNull();
		//  mapped as 1
		private NString vFormnameCb= NString.getNull();
		//         as 2
		private NString vReleaseCb= NString.getNull();
		//         as 3
		private NString vDbaseInstCb= NString.getNull();
		//         as 4
		private NString vDateTimeCb= NString.getNull();
		//         as 5
		private NString vReqItemCb= NString.getNull();
		//         as 6
		// 
		private NString ind= NString.getNull();
		private NString ind6= NString.getNull();
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param vPref
		*/
		public NString readValue(NString vPref)
		{
			if (vPref.equals("FORM_NAME"))
			{
				return ((vFormnameCb.append("ES")));
			}
			else if (vPref.equals("RELEASE"))
			{
				return ((vReleaseCb.append("ES")));
			}
			else if (vPref.equals("DBASE_INST"))
			{
				return ((vDbaseInstCb.append("ES")));
			}
			else {
				errorMessage(GNls.Fget(toStr("GOQRPLS-0155"), toStr("LIB"), toStr("*ERROR* READ THIS = %01%"), vPref));
				// F2J_TO_REMOVE : Call to built-in "PAUSE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#ExcludePause".
				//				SupportClasses.SQLFORMS.Pause();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'PAUSE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#ExcludePause'.");
				
				
				return  toStr((("NO")));
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool hintEnabled()
		{
			if ( vDispHintCb.equals("Y") )
			{
				return  toBool(((NBool.True)));
			}
			// 
			return  toBool(((NBool.False)));
		}
		
	
	
}
