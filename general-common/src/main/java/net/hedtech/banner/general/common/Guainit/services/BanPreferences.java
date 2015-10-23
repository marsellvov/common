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

public class BanPreferences extends AbstractSupportCodeObject {
	

	public BanPreferences(ISupportCodeContainer container) {
		super(container);
		try {
			pUser=getGlobal("CURRENT_USER");
			tprfRec.addParameter("P_P_USER", pUser);
			tprfRec.open();
			ResultSet tprfRecResults = tprfRec.fetchInto();
			if ( tprfRecResults != null ) {
				vFormnameCb = tprfRecResults.getStr(0);
				vReleaseCb = tprfRecResults.getStr(1);
				vDbaseInstCb = tprfRecResults.getStr(2);
				vDateTimeCb = tprfRecResults.getStr(3);
				vReqItemCb = tprfRecResults.getStr(4);
				gFormnameDisplayInd = tprfRecResults.getStr(5);
			}
			if ( tprfRec.notFound() )
			{
				tprfRec.close();
				createRec();
			}
			else {
				tprfRec.close();
			}
			setGlobal("FORMNAME_DISPLAY_IND", gFormnameDisplayInd);		
		} finally{
			tprfRec.close();
		}
	


	}

	public GuainitTask  getTask() {
		return (GuainitTask )super.getContainer();
	}

	
	public GuainitModel getFormModel() {
		return getTask().getModel();
	}
	
	//Original PL/SQL code for Package Prog Unit (SPEC) BAN_PREFERENCES
	/*
	PACKAGE BAN_PREFERENCES IS
  PROCEDURE PARM_PREFS;
  PROCEDURE UI_PREFS;
END;
	*/
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) BAN_PREFERENCES
		/*
		PACKAGE BODY BAN_PREFERENCES IS
  BASELINE_ID     CONSTANT VARCHAR2(9) := 'BASELINE';
--
  V_DISP_HINT_CB           VARCHAR2(1) := 'N';
  V_FORMNAME_CB            VARCHAR2(1);
  V_RELEASE_CB             VARCHAR2(1);
  V_DBASE_INST_CB          VARCHAR2(1);
  V_DATE_TIME_CB           VARCHAR2(1);
  V_REQ_ITEM_CB            VARCHAR2(1);
--
-- 50-1 add new Form Name preference, this is a 'G' and not a 'V' because it is passed as 
--      a GLOBAL and not a preference
--
  G_FORMNAME_DISPLAY_IND   VARCHAR2(1);
--
  CURSOR TPRF_REC (p_USER VARCHAR2) IS
    SELECT GURTPRF_FORMNAME_CB,
           GURTPRF_RELEASE_CB,GURTPRF_DBASE_INST_CB,
           GURTPRF_DATE_TIME_CB,GURTPRF_REQ_ITEM_CB,
           NVL(DECODE(GURTPRF_FORMNAME_DISPLAY_IND,'B','Y', 'M','Y', 'F','N', GURTPRF_FORMNAME_DISPLAY_IND),'N')
      FROM GURTPRF 
     WHERE GURTPRF_USER_ID = p_USER; 
--
----
-- Functions and Procedures 
----
--
  PROCEDURE CREATE_REC IS
  BEGIN
    OPEN TPRF_REC(BASELINE_ID);
    FETCH TPRF_REC INTO V_FORMNAME_CB, V_RELEASE_CB, V_DBASE_INST_CB,
                        V_DATE_TIME_CB,V_REQ_ITEM_CB,G_FORMNAME_DISPLAY_IND;
--
    IF TPRF_REC%NOTFOUND THEN
      V_DISP_HINT_CB := 'N';
      V_FORMNAME_CB := 'Y';
      V_RELEASE_CB := 'Y';
      V_DBASE_INST_CB := 'Y';
      V_DATE_TIME_CB := 'Y';
      V_REQ_ITEM_CB := 'Y';
      G_FORMNAME_DISPLAY_IND := 'Y';
    END IF;
    CLOSE TPRF_REC;  
--
    INSERT INTO GURTPRF (GURTPRF_USER_ID,GURTPRF_TLB_BTN,
                         GURTPRF_DISP_HINT,GURTPRF_FORMNAME_CB,
                         GURTPRF_RELEASE_CB,GURTPRF_DBASE_INST_CB,
                         GURTPRF_DATE_TIME_CB,GURTPRF_REQ_ITEM_CB,
                         GURTPRF_FORMNAME_DISPLAY_IND)
                 VALUES (:GLOBAL.CURRENT_USER,NULL,
                         V_DISP_HINT_CB,V_FORMNAME_CB,
                         V_RELEASE_CB,V_DBASE_INST_CB,
                         V_DATE_TIME_CB,V_REQ_ITEM_CB,
                         G_FORMNAME_DISPLAY_IND);
--
    FORMS_DDL('BEGIN COMMIT; END;');
  END;
--
--
  PROCEDURE PARM_PREFS IS
    pref          VARCHAR2(6) := NULL;
    pl_id         PARAMLIST; 
    pl_name       VARCHAR2(20) := 'PREFERENCES';  
  BEGIN
    pref := V_DISP_HINT_CB  || V_FORMNAME_CB  || V_RELEASE_CB ||
            V_DBASE_INST_CB || V_DATE_TIME_CB || V_REQ_ITEM_CB;
--
    pl_id := GET_PARAMETER_LIST(pl_name); 
    IF ID_NULL(pl_id) THEN 
      pl_id := CREATE_PARAMETER_LIST(pl_name); 
    END IF;
--
    ADD_PARAMETER(pl_id,'G$_PREFERENCES',TEXT_PARAMETER,pref); 
  END;
--
--
  PROCEDURE UI_PREFS IS
  BEGIN
    :GLOBAL.UI_SEPARATOR_LINE_COLOR := G$_GET_UPRF_SEPARATOR_COLOR;
--
-- Only load the globals if going directly to a form
--
    IF :PARAMETER.LAUNCH_FORM = :GLOBAL.MENU_FORM THEN
      :GLOBAL.UI_BUTTON_COLOR := '';
      :GLOBAL.UI_CANVAS_COLOR := '';
      :GLOBAL.UI_CODE_PROMPT_COLOR := '';
      :GLOBAL.UI_CODE_PROMPT_STYLE := '';
      :GLOBAL.UI_ITEM_BACKGROUND_COLOR := '';
      :GLOBAL.UI_KB_ITEM_BACKGROUND_COLOR := '';
      :GLOBAL.UI_PROMPT_COLOR := '';
      :GLOBAL.UI_RECORD_COLOR := '';
      :GLOBAL.UI_SCROLLBAR_COLOR := '';
      :GLOBAL.UI_WINDOW_COLOR := '';
    ELSE
      :GLOBAL.UI_BUTTON_COLOR := G$_GET_UPRF_BUTTON_COLOR;
      :GLOBAL.UI_CANVAS_COLOR := G$_GET_UPRF_CANVAS_COLOR;
      :GLOBAL.UI_CODE_PROMPT_COLOR := G$_GET_UPRF_CODE_PROMPT_COLOR;
      :GLOBAL.UI_CODE_PROMPT_STYLE := '';
      :GLOBAL.UI_ITEM_BACKGROUND_COLOR := '';
      :GLOBAL.UI_KB_ITEM_BACKGROUND_COLOR := '';
      :GLOBAL.UI_PROMPT_COLOR := G$_GET_UPRF_PROMPT_COLOR;
      :GLOBAL.UI_RECORD_COLOR := G$_GET_UPRF_RECORD_COLOR;
      :GLOBAL.UI_SCROLLBAR_COLOR := G$_GET_UPRF_SCROLLBAR_COLOR;
      :GLOBAL.UI_WINDOW_COLOR := G$_GET_UPRF_CANVAS_COLOR;
    END IF;
  END;
--
---
-- MAIN BODY 
---
--
BEGIN
  OPEN TPRF_REC(:GLOBAL.CURRENT_USER);
  FETCH TPRF_REC INTO V_FORMNAME_CB, V_RELEASE_CB, V_DBASE_INST_CB,
                      V_DATE_TIME_CB,V_REQ_ITEM_CB,G_FORMNAME_DISPLAY_IND;
--
  IF TPRF_REC%NOTFOUND THEN
    CLOSE TPRF_REC;
    CREATE_REC;
  ELSE
    CLOSE TPRF_REC;
  END IF;
--
  :GLOBAL.FORMNAME_DISPLAY_IND := G_FORMNAME_DISPLAY_IND;
END;
		*/
				public final NString BASELINE_ID = toStr("BASELINE");

		private NString vDispHintCb = toStr("N");
		private NString vFormnameCb= NString.getNull();
		private NString vReleaseCb= NString.getNull();
		private NString vDbaseInstCb= NString.getNull();
		private NString vDateTimeCb= NString.getNull();
		private NString vReqItemCb= NString.getNull();
		private NString gFormnameDisplayInd= NString.getNull();
		private static String sqltprfRec = "SELECT GURTPRF_FORMNAME_CB, GURTPRF_RELEASE_CB, GURTPRF_DBASE_INST_CB, GURTPRF_DATE_TIME_CB, GURTPRF_REQ_ITEM_CB, NVL(DECODE(GURTPRF_FORMNAME_DISPLAY_IND, 'B', 'Y', 'M', 'Y', 'F', 'N', GURTPRF_FORMNAME_DISPLAY_IND), 'N') " +
	" FROM GURTPRF " +
	" WHERE GURTPRF_USER_ID = :P_P_USER ";
		private DataCursor tprfRec = new DataCursor(sqltprfRec);
		NString pUser = NString.getNull();

		public void createRec()
		{
			int rowCount = 0;
			try {
				pUser=BASELINE_ID;
				tprfRec.addParameter("P_P_USER", pUser);
				tprfRec.open();
				ResultSet tprfRecResults = tprfRec.fetchInto();
				if ( tprfRecResults != null ) {
					vFormnameCb = tprfRecResults.getStr(0);
					vReleaseCb = tprfRecResults.getStr(1);
					vDbaseInstCb = tprfRecResults.getStr(2);
					vDateTimeCb = tprfRecResults.getStr(3);
					vReqItemCb = tprfRecResults.getStr(4);
					gFormnameDisplayInd = tprfRecResults.getStr(5);
				}
				if ( tprfRec.notFound() )
				{
					vDispHintCb = toStr("N");
					vFormnameCb = toStr("Y");
					vReleaseCb = toStr("Y");
					vDbaseInstCb = toStr("Y");
					vDateTimeCb = toStr("Y");
					vReqItemCb = toStr("Y");
					gFormnameDisplayInd = toStr("Y");
				}
				tprfRec.close();
				String sql1 = "INSERT INTO GURTPRF " +
	"(GURTPRF_USER_ID, GURTPRF_TLB_BTN, GURTPRF_DISP_HINT, GURTPRF_FORMNAME_CB, GURTPRF_RELEASE_CB, GURTPRF_DBASE_INST_CB, GURTPRF_DATE_TIME_CB, GURTPRF_REQ_ITEM_CB, GURTPRF_FORMNAME_DISPLAY_IND)" +
	"VALUES (:GLOBAL__CURRENT_USER, NULL, :P_V_DISP_HINT_CB, :P_V_FORMNAME_CB, :P_V_RELEASE_CB, :P_V_DBASE_INST_CB, :P_V_DATE_TIME_CB, :P_V_REQ_ITEM_CB, :P_G_FORMNAME_DISPLAY_IND)";
				DataCommand command1 = new DataCommand(sql1);
				command1.addParameter("GLOBAL__CURRENT_USER", getGlobal("CURRENT_USER"));
				command1.addParameter("P_V_DISP_HINT_CB", vDispHintCb);
				command1.addParameter("P_V_FORMNAME_CB", vFormnameCb);
				command1.addParameter("P_V_RELEASE_CB", vReleaseCb);
				command1.addParameter("P_V_DBASE_INST_CB", vDbaseInstCb);
				command1.addParameter("P_V_DATE_TIME_CB", vDateTimeCb);
				command1.addParameter("P_V_REQ_ITEM_CB", vReqItemCb);
				command1.addParameter("P_G_FORMNAME_DISPLAY_IND", gFormnameDisplayInd);
				rowCount = command1.execute();
				formsDDL("BEGIN COMMIT; END;");
				}finally{
					tprfRec.close();
				}
		}

		
		public void parmPrefs()
		{
			NString pref = NString.getNull();
			Hashtable plId= null;
			NString plName = toStr("PREFERENCES");
			pref = vDispHintCb.append(vFormnameCb).append(vReleaseCb).append(vDbaseInstCb).append(vDateTimeCb).append(vReqItemCb);
			// 
			plId = getParameterList(plName);
			if ( (plId == null) )
			{
				plId = createParameterList(plName);
			}
			// 
			addParameter(plId, "G$_PREFERENCES", pref);
		}

		
		public void uiPrefs()
		{
			setGlobal("UI_SEPARATOR_LINE_COLOR", getTask().getGoqrpls().gGetUprfSeparatorColor());
			if ( this.getFormModel().getParam("LAUNCH_FORM", NString.class).equals(getGlobal("MENU_FORM")) )
			{
				setGlobal("UI_BUTTON_COLOR", toStr(""));
				setGlobal("UI_CANVAS_COLOR", toStr(""));
				setGlobal("UI_CODE_PROMPT_COLOR", toStr(""));
				setGlobal("UI_CODE_PROMPT_STYLE", toStr(""));
				setGlobal("UI_ITEM_BACKGROUND_COLOR", toStr(""));
				setGlobal("UI_KB_ITEM_BACKGROUND_COLOR", toStr(""));
				setGlobal("UI_PROMPT_COLOR", toStr(""));
				setGlobal("UI_RECORD_COLOR", toStr(""));
				setGlobal("UI_SCROLLBAR_COLOR", toStr(""));
				setGlobal("UI_WINDOW_COLOR", toStr(""));
			}
			else {
				setGlobal("UI_BUTTON_COLOR", getTask().getGoqrpls().gGetUprfButtonColor());
				setGlobal("UI_CANVAS_COLOR", getTask().getGoqrpls().gGetUprfCanvasColor());
				setGlobal("UI_CODE_PROMPT_COLOR", getTask().getGoqrpls().gGetUprfCodePromptColor());
				setGlobal("UI_CODE_PROMPT_STYLE", toStr(""));
				setGlobal("UI_ITEM_BACKGROUND_COLOR", toStr(""));
				setGlobal("UI_KB_ITEM_BACKGROUND_COLOR", toStr(""));
				setGlobal("UI_PROMPT_COLOR", getTask().getGoqrpls().gGetUprfPromptColor());
				setGlobal("UI_RECORD_COLOR", getTask().getGoqrpls().gGetUprfRecordColor());
				setGlobal("UI_SCROLLBAR_COLOR", getTask().getGoqrpls().gGetUprfScrollbarColor());
				setGlobal("UI_WINDOW_COLOR", getTask().getGoqrpls().gGetUprfCanvasColor());
			}
		}
	
}
