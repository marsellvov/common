package net.hedtech.banner.general.common.Gutpmnu.services;

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
import net.hedtech.banner.general.common.Gutpmnu.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqgmnu.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Gutpmnu.model.*;

public class SubmenuMaintenance extends AbstractSupportCodeObject {
	

	public SubmenuMaintenance(ISupportCodeContainer container) {
		super(container);
	}

	public GutpmnuTask  getTask() {
		return (GutpmnuTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Gutpmnu.model.GutpmnuModel getFormModel() {
		return getTask().getModel();
	}
	
	//Original PL/SQL code for Package Prog Unit (SPEC) SUBMENU_MAINTENANCE
	/*
	PACKAGE SUBMENU_MAINTENANCE IS
  PROCEDURE UPDATE_QUERY;
  PROCEDURE QTY_CHANGED_RECORDS;
--
  FUNCTION UPDATE_STANDARD RETURN BOOLEAN;
  FUNCTION CURRENT_BLOCK   RETURN VARCHAR2;
END;

	*/
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) SUBMENU_MAINTENANCE
		/*
		PACKAGE BODY SUBMENU_MAINTENANCE IS
--
  FUNCTION CURRENT_BLOCK RETURN VARCHAR2 IS
    v_block VARCHAR2(30);
  BEGIN
    IF GET_VIEW_PROPERTY('GURMENU2_CANVAS',VISIBLE) = 'TRUE' THEN
      v_block := 'GURMENU2';
    ELSE
      v_block := 'GURMENU';
    END IF; 
    RETURN v_block;
  END;
--
  FUNCTION SUBMENU_NOTFOUND RETURN BOOLEAN IS
    CURSOR C2 (p_menu VARCHAR2) IS 
      SELECT GURMENU_OBJ_NAME
        FROM GURMENU
       WHERE GURMENU_NAME = p_menu
         AND GURMENU_USER_ID = :current_user1; 
--
    dummy  GURMENU.GURMENU_OBJ_NAME%TYPE;
  BEGIN
     OPEN C2(:GURMENU.GURMENU_OBJ_NAME);
     FETCH C2 into dummy;
     CLOSE C2;
--
     IF dummy IS NULL THEN
       RETURN TRUE;
     ELSE
       RETURN FALSE;
     END IF;
     RETURN NULL; 
  END;
--
-- 54-4
-- Modify SELECT to return menu component descriptions.
-- GURMENU_DESC is NOT NULL only for non-Baseline items;
-- GUBOBJJS_DESC supplies the default description for Baseline items.
--
  PROCEDURE CREATE_CUSTOM_SUBMENU IS
    lv_cnt INTEGER := 0;
--
    CURSOR menu_count_c (p_menu VARCHAR2) IS
      SELECT COUNT(*)
        FROM GURMENU,GUBOBJS
       WHERE GURMENU_USER_ID IN ('BASELINE','LOCAL')
         AND GURMENU_NAME = p_menu
         AND GURMENU_OBJ_NAME = GUBOBJS_NAME;
--
  BEGIN
--
-- Verify the menu has records.
--
    OPEN menu_count_c(:GURMENU.GURMENU_OBJ_NAME);
    FETCH menu_count_c INTO lv_cnt;
    CLOSE menu_count_c;
--
    IF lv_cnt = 0 THEN
    	RETURN;
    END IF;
--
    BEGIN
      INSERT INTO GURMENU (GURMENU_NAME,
                           GURMENU_OBJ_NAME,
                           GURMENU_SORT_SEQ,
                           GURMENU_USER_ID,
                           GURMENU_ACTIVITY_DATE)
             SELECT GURMENU_NAME,
                    GURMENU_OBJ_NAME,
                    GURMENU_SORT_SEQ,
                    :current_user1,
                    SYSDATE
               FROM GURMENU,GUBOBJS
              WHERE GURMENU_USER_ID IN ('BASELINE','LOCAL')
                AND GURMENU_NAME = :GURMENU.GURMENU_OBJ_NAME
                AND GURMENU_OBJ_NAME = GUBOBJS_NAME;
    EXCEPTION 
      WHEN DUP_VAL_ON_INDEX THEN 
        NULL;
    END;
--
    :SYSTEM.MESSAGE_LEVEL :='5';
    COMMIT_FORM;
    :SYSTEM.MESSAGE_LEVEL := '0';
  END;
--
--
  PROCEDURE UPDATE_QUERY IS
  BEGIN
    :SYSTEM.MESSAGE_LEVEL :='5';
    EXECUTE_QUERY;
    :SYSTEM.MESSAGE_LEVEL :='0';
--
    IF TO_NUMBER(GET_BLOCK_PROPERTY('GURMENU2',QUERY_HITS)) = 0 THEN
      SET_BLOCK_PROPERTY('GURMENU2',DEFAULT_WHERE,
                         'GURMENU_NAME = :GURMENU.GURMENU_OBJ_NAME AND '||
                         'GURMENU_USER_ID IN (''BASELINE'',''LOCAL'')');
--
      IF SUBSTR(:GURMENU.GURMENU_OBJ_NAME,1,1) = '*' THEN
        CREATE_CUSTOM_SUBMENU;
      END IF;
--
      SET_BLOCK_PROPERTY('GURMENU2',DEFAULT_WHERE,
                         'GURMENU_NAME = :GURMENU.GURMENU_OBJ_NAME AND '||
                         'GURMENU_USER_ID = :current_user1 ');
      EXECUTE_QUERY;
    END IF;
--
    FIRST_RECORD;
  END;
--
--
  FUNCTION UPDATE_STANDARD RETURN BOOLEAN IS
    al_msg    VARCHAR2(200);
    al_button NUMBER(2);
    qty_rec   NUMBER(5);
    hold_rec  NUMBER;
  BEGIN
    IF Current_Block = 'GURMENU2' THEN
      IF SUBMENU_NOTFOUND THEN
        AL_MSG := G$_NLS.Get('GUTPMNU-0043','FORM','You are not able to update the standard version of current menu. Do you want to convert it to the custom?');
        SET_ALERT_PROPERTY('WARNING_ALERT',ALERT_MESSAGE_TEXT,AL_MSG);
        AL_BUTTON := SHOW_ALERT('WARNING_ALERT');
        IF AL_BUTTON = ALERT_BUTTON1 THEN
          CREATE_CUSTOM_SUBMENU;
          UPDATE_QUERY;
          RETURN TRUE;
        ELSE
          MESSAGE(G$_NLS.Get('GUTPMNU-0044','FORM','*ERROR* The standard version of current menu can not to be update.'));
          RETURN FALSE;
        END IF; 
      ELSE
        RETURN TRUE;
      END IF;
    ELSE
      RETURN TRUE;
    END IF; 
    RETURN NULL; 
  END;
--
--
  PROCEDURE QTY_CHANGED_RECORDS IS
  BEGIN
    LAST_RECORD;
    FIRST_RECORD;  
  END;
--
END SUBMENU_MAINTENANCE;
		*/
		/* <p>
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString currentBlock()
		{
			NString vBlock= NString.getNull();
			if ( getViewVisible("GURMENU2_CANVAS").equals("TRUE") )
			{
				vBlock = toStr("GURMENU2");
			}
			else {
				vBlock = toStr("GURMENU");
			}
			return vBlock;
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool submenuNotfound(GurmenuAdapter gurmenuElement)
		{
			int rowCount = 0;
			String sqlc2 = "SELECT GURMENU_OBJ_NAME " +
	" FROM GURMENU " +
	" WHERE GURMENU_NAME = :P_P_MENU AND GURMENU_USER_ID = :CURRENT_USER1 ";
			DataCursor c2 = new DataCursor(sqlc2);
			NString pMenu = NString.getNull();
			// 
			NString dummy= NString.getNull();
			try {
				pMenu=gurmenuElement.getGurmenuObjName();
				//Setting query parameters
				c2.addParameter("P_P_MENU", pMenu);
				c2.addParameter("CURRENT_USER1", getFormModel().getFormHeader().getCurrentUser1());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable c2.
				c2.open();
				ResultSet c2Results = c2.fetchInto();
				if ( c2Results != null ) {
					dummy = c2Results.getStr(0);
				}
				// 
				if ( dummy.isNull() )
				{
					return  toBool(NBool.True);
				}
				else {
					return  toBool(NBool.False);
				}
//				return NBool.getNull();
				}finally{
					c2.close();
				}
		}
/* <p>
		* 
		*  54-4
		*  Modify SELECT to return menu component descriptions.
		*  GURMENU_DESC is NOT NULL only for non-Baseline items;
		*  GUBOBJJS_DESC supplies the default description for Baseline items.
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void createCustomSubmenu(GurmenuAdapter gurmenuElement)
		{
			int rowCount = 0;
			NInteger lvCnt = toInt(0);
			String sqlmenuCountC = "SELECT COUNT(*) " +
	" FROM GURMENU, GUBOBJS " +
	" WHERE (GURMENU_USER_ID) IN ('BASELINE', 'LOCAL') AND GURMENU_NAME = :P_P_MENU AND GURMENU_OBJ_NAME = GUBOBJS_NAME ";
			DataCursor menuCountC = new DataCursor(sqlmenuCountC);
			NString pMenu = NString.getNull();
			try {
				// 
				//  Verify the menu has records.
				// 
				pMenu=gurmenuElement.getGurmenuObjName();
				//Setting query parameters
				menuCountC.addParameter("P_P_MENU", pMenu);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable menuCountC.
				menuCountC.open();
				ResultSet menuCountCResults = menuCountC.fetchInto();
				if ( menuCountCResults != null ) {
					lvCnt = menuCountCResults.getInteger(0);
				}
				// 
				if ( lvCnt.equals(0) )
				{
					return ;
				}
				try
				{
					String sql1 = "INSERT INTO GURMENU " +
	"(GURMENU_NAME, GURMENU_OBJ_NAME, GURMENU_SORT_SEQ, GURMENU_USER_ID, GURMENU_ACTIVITY_DATE)" +
	"SELECT GURMENU_NAME, GURMENU_OBJ_NAME, GURMENU_SORT_SEQ, :CURRENT_USER1, SYSDATE " +
	" FROM GURMENU, GUBOBJS " +
	" WHERE (GURMENU_USER_ID) IN ('BASELINE', 'LOCAL') AND GURMENU_NAME = :GURMENU_GURMENU_OBJ_NAME AND GURMENU_OBJ_NAME = GUBOBJS_NAME ";
					DataCommand command1 = new DataCommand(sql1);
					//Setting query parameters
					command1.addParameter("CURRENT_USER1", getFormModel().getFormHeader().getCurrentUser1());
					command1.addParameter("GURMENU_GURMENU_OBJ_NAME", gurmenuElement.getGurmenuObjName());
					rowCount = command1.execute();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				// 
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
				try { 
				MessageServices.setMessageLevel(MessageLevel.NONE);
				commitTask();
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
				} finally {
							
				MessageServices.resetMessageLevel();
				}
							
				}finally{
					menuCountC.close();
				}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void updateQuery(GurmenuAdapter gurmenuElement)
		{
			// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
			try { 
			MessageServices.setMessageLevel(MessageLevel.NONE);
			executeQuery();
			// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
			} finally {
						
			MessageServices.resetMessageLevel();
			}
						
			// 
			if ( toNumber(getBlockQueryHits("GURMENU2")).equals(0) )
			{
				setBlockWhereClause("GURMENU2", toStr("GURMENU_NAME = :GURMENU.GURMENU_OBJ_NAME AND ").append("GURMENU_USER_ID IN ('BASELINE','LOCAL')"));
				// 
				if ( substring(gurmenuElement.getGurmenuObjName(), toInt(1), toInt(1)).equals("*") )
				{
					createCustomSubmenu(gurmenuElement);
				}
				// 
				setBlockWhereClause("GURMENU2", toStr("GURMENU_NAME = :GURMENU.GURMENU_OBJ_NAME AND ").append("GURMENU_USER_ID = :current_user1 "));
				executeQuery();
			}
			// 
			firstRecord();
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool updateStandard()
		{
			NString alMsg= NString.getNull();
			NNumber alButton= NNumber.getNull();
			NNumber qtyRec= NNumber.getNull();
			NNumber holdRec= NNumber.getNull();
//			if ( currentBlock().equals("GURMENU2") )
//			{
//				GurmenuAdapter gurmenuElement = (GurmenuAdapter) this.getFormModel().getGurmenu().getRowAdapter(true);
//				if ( submenuNotfound(gurmenuElement).getValue() )
//				{
//					alMsg = GNls.Fget(toStr("GUTPMNU-0043"), toStr("FORM"), toStr("You are not able to update the standard version of current menu. Do you want to convert it to the custom?"));
//					setAlertMessageText("WARNING_ALERT", alMsg);
//					alButton = toNumber(showAlert("WARNING_ALERT"));
//					if ( alButton.equals(MessageServices.BUTTON1) )
//					{
//						createCustomSubmenu(gurmenuElement);
//						updateQuery(gurmenuElement);
//						return  toBool(NBool.True);
//					}
//					else {
//						errorMessage(GNls.Fget(toStr("GUTPMNU-0044"), toStr("FORM"), toStr("*ERROR* The standard version of current menu can not to be update.")));
//						return  toBool(NBool.False);
//					}
//				}
//				else {
//					return  toBool(NBool.True);
//				}
//			}
//			else {
//				return  toBool(NBool.True);
//			}
			
			
		//CABANAS ADICIONADO	
			
			if ( currentBlock().equals("GURMENU") )
			{
				GurmenuAdapter gurmenuElement = (GurmenuAdapter) this.getFormModel().getGurmenu().getRowAdapter(true);
				if ( submenuNotfound(gurmenuElement).getValue() )
				{
					alMsg = GNls.Fget(toStr("GUTPMNU-0043"), toStr("FORM"), toStr("You are not able to update the standard version of current menu. Do you want to convert it to the custom?"));
					setAlertMessageText("WARNING_ALERT", alMsg);
					alButton = toNumber(showAlert("WARNING_ALERT"));
					if ( alButton.equals(MessageServices.BUTTON1) )
					{
						createCustomSubmenu(gurmenuElement);
						updateQuery(gurmenuElement);
						return  toBool(NBool.True);
					}
					else {
						errorMessage(GNls.Fget(toStr("GUTPMNU-0044"), toStr("FORM"), toStr("*ERROR* The standard version of current menu can not to be update.")));
						return  toBool(NBool.False);
					}
				}
				else {
					return  toBool(NBool.True);
				}
			}
			else {
				return  toBool(NBool.True);
			}
			
			//CABANAS FIM DE ADICAO		
			
//			return NBool.getNull();
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void qtyChangedRecords()
		{
			lastRecord();
			firstRecord();
		}
		
	
	
}
