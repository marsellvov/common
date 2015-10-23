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

public class GMenuBar extends AbstractSupportCodeObject {
	

	public GMenuBar(ISupportCodeContainer container) {
		super(container);
		currentForm = getCurrentTaskName();
		previousForm = toStr(getParentTaskName());
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_MENU_BAR
	/*
	PACKAGE G$_MENU_BAR IS
--
  PROCEDURE SET_MENU_PRE_FORM;
  PROCEDURE SET_MENU_POST_FORM;
--
  PROCEDURE SET_WIN_HELP(object_in IN VARCHAR2);
--
  PROCEDURE DISABLE_ENABLE_WF_MENU;
  PROCEDURE DISABLE_ENABLE_BXS_MENU;
--
  PROCEDURE SET_DATA_EXTRACT;
  PROCEDURE SET_FGAC_NOTICE;
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_MENU_BAR
		/*
		PACKAGE BODY G$_MENU_BAR IS
--
  current_form  VARCHAR2(30);
  previous_form VARCHAR2(30);
--
  PROCEDURE REGULAR_MENU_SET;
  PROCEDURE MENU_FORMS_MENU_SET;
  PROCEDURE SET_ACTION_SELECT;
  PROCEDURE SET_OPTIONS( object_in IN VARCHAR2 );
--
  FUNCTION GET_LAST_STATE ( var_name IN VARCHAR2, remove_in IN BOOLEAN ) RETURN VARCHAR2;
  FUNCTION SELECT_ENABLED ( remove_in IN BOOLEAN ) RETURN BOOLEAN;
  FUNCTION THIS_IS_MENU_FORM   RETURN BOOLEAN;
  FUNCTION CALLED_BY_MENU_FORM RETURN BOOLEAN;
--
-- Set the menus.
--
  PROCEDURE SET_MENU_PRE_FORM IS
  BEGIN
    IF NOT THIS_IS_MENU_FORM THEN
      REGULAR_MENU_SET;
    ELSE
      MENU_FORMS_MENU_SET;
    END IF;
--
    SET_ACTION_SELECT;
    SET_OPTIONS(current_form);
  END;
--
-- Reset the menus.
--
  PROCEDURE SET_MENU_POST_FORM IS
    prv_sel_state  BOOLEAN;
  BEGIN
    prv_sel_state := SELECT_ENABLED(TRUE);
    IF CALLED_BY_MENU_FORM AND 
       GET_APPLICATION_PROPERTY(CALLING_FORM) IN ('GUAGMNU','GUAQFLW') THEN
      MENU_FORMS_MENU_SET;
    ELSE
      REGULAR_MENU_SET;
    END IF;
  END;
--
--
  PROCEDURE SET_DATA_EXTRACT IS
    EXT_ENABLED VARCHAR2(1);
    CURSOR DB_EXT IS
      SELECT GUBOBJS_EXTRACT_ENABLED_IND
        FROM GUBOBJS
       WHERE GUBOBJS_NAME = current_form;
--
  BEGIN
    current_form := NAME_IN('SYSTEM.CURRENT_FORM');
--
    OPEN DB_EXT;
    FETCH DB_EXT INTO EXT_ENABLED;
    CLOSE DB_EXT;
--
    SET_MENU_ITEM_PROPERTY('HELP.ExtractK',ENABLED,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('HELP.ExtractNK',ENABLED,PROPERTY_FALSE);
--
	  IF EXT_ENABLED IS NULL THEN
      RETURN;
	  ELSIF EXT_ENABLED = 'B' THEN
      SET_MENU_ITEM_PROPERTY('HELP.ExtractNK',ENABLED,PROPERTY_TRUE);
      IF G$_BLOCK_EXISTS('KEY_BLOCK') THEN	  	
        SET_MENU_ITEM_PROPERTY('HELP.ExtractK',ENABLED,PROPERTY_TRUE);
      END IF;
	  ELSIF EXT_ENABLED = 'D' THEN
      SET_MENU_ITEM_PROPERTY('HELP.ExtractNK',ENABLED,PROPERTY_TRUE);
    END IF;
  END;
--
--
  PROCEDURE REGULAR_MENU_SET IS
  BEGIN
    SET_MENU_ITEM_PROPERTY('Icons.Insert'          ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Icons.Remove'          ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Icons.Enter'           ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Icons.Execute'         ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Icons.Cancel'          ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Icons.Previous_record' ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Icons.Next_record'     ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Icons.Previous_block'  ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Icons.Next_block'      ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Icons.Print'           ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Icons.Save'            ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Icons.Rollback'        ,ENABLED  ,PROPERTY_TRUE);
--
    SET_MENU_ITEM_PROPERTY('Main.Edit'           ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Main.Query'          ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Main.Field'          ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Main.Record'         ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Main.Block'          ,ENABLED  ,PROPERTY_TRUE);
--
    SET_MENU_ITEM_PROPERTY('Action.Direct_Access',ENABLED  ,PROPERTY_TRUE);
-- -- -- --
-- -- -- -- XE Seamless Navigation unified menu items
    SET_MENU_ITEM_PROPERTY('Action.BROWSE_MAG',   ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Action.OPEN_APP_MAG', ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Action.SEARCH_MAG',   ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Action.SIGN_OUT_MAG', ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Help.HELP_MAG',       ENABLED  ,PROPERTY_TRUE);
    DEFAULT_VALUE('N','GLOBAL.BANNER_XE_MODE');
    IF NAME_IN('GLOBAL.BANNER_XE_MODE') = 'N' THEN
      G$_XE.SET_MENU_ITEMS(0);
    ELSE
      G$_XE.SET_MENU_ITEMS(1);
    END IF;
-- -- -- --
-- -- -- -- 
    SET_MENU_ITEM_PROPERTY('Action.Object_Search',ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Action.Rollback'     ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Action.Save'         ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Action.ExitBanner'   ,ENABLED  ,PROPERTY_TRUE);
--
    SET_MENU_ITEM_PROPERTY('Record.Previous'     ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Record.Next'         ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Record.Scroll up'    ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Record.Scroll down'  ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Record.Clear'        ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Record.Remove'       ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Record.Insert'       ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Record.Duplicate'    ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Record.Lock'         ,ENABLED  ,PROPERTY_TRUE);
--
    SET_MENU_ITEM_PROPERTY('Field.Duplicate'     ,ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Help.Display_image'  ,ENABLED  ,PROPERTY_TRUE);
--
    SET_MENU_ITEM_PROPERTY('Main.Tools'          ,ENABLED  ,PROPERTY_TRUE);
--
    SET_DATA_EXTRACT;
--
    IF NAME_IN('GLOBAL.QF_STATUS') IS NOT NULL THEN
      SET_MENU_ITEM_PROPERTY('Action.ExitQuickflow',ENABLED,PROPERTY_TRUE);
    END IF;
--
-- Menus which should be conditionally turned on if not coming from a channel.
--
    IF NAME_IN('GLOBAL.KEEP_ALIVE') = 'YES' THEN
      SET_MENU_ITEM_PROPERTY('Action.ExitToMenu'   ,ENABLED  ,PROPERTY_TRUE);
    END IF;
-- -- -- --
-- -- -- --
    DEFAULT_VALUE('N','GLOBAL.BANNER_XE_MODE');
    IF NAME_IN('GLOBAL.BANNER_XE_MODE') = 'Y' THEN
      SET_MENU_ITEM_PROPERTY('Action.ExitToMenu',ENABLED,PROPERTY_TRUE);
      SET_MENU_ITEM_PROPERTY('Action.ExitBanner',ENABLED,PROPERTY_FALSE);
    END IF;
-- -- -- --
-- -- -- --
--
    DISABLE_ENABLE_BXS_MENU;    
    DISABLE_ENABLE_WF_MENU;
  END;
--
--
  PROCEDURE MENU_FORMS_MENU_SET IS
  BEGIN
    SET_MENU_ITEM_PROPERTY('Main.Options'        ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Main.Edit'           ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Main.Block'          ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Main.Query'          ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Main.Field'          ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Main.Record'         ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Action.Direct_Access',ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Action.Rollback'     ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Action.Save'         ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Action.Select'       ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Action.ExitBanner'   ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Action.ExitToMenu'   ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Help.Display_image'  ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Help.Extractk'       ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Help.Extractnk'      ,ENABLED  ,PROPERTY_FALSE);
--
    IF current_form IN ('GUIOBJS','GUAPARM') THEN
      SET_MENU_ITEM_PROPERTY('Main.Query'        ,ENABLED  ,PROPERTY_TRUE);
    END IF;
--
    SET_MENU_ITEM_PROPERTY('Main.Tools'            ,ENABLED  ,PROPERTY_FALSE);
--
    SET_MENU_ITEM_PROPERTY('Icons.Select'          ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Icons.Insert'          ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Icons.Remove'          ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Icons.Enter'           ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Icons.Execute'         ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Icons.Cancel'          ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Icons.Previous_record' ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Icons.Next_record'     ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Icons.Previous_block'  ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Icons.Next_block'      ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Icons.Print'           ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Icons.Save'            ,ENABLED  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Icons.Rollback'        ,ENABLED  ,PROPERTY_FALSE);
--
    DISABLE_ENABLE_BXS_MENU;    
    DISABLE_ENABLE_WF_MENU;
-- -- -- --
-- -- -- -- XE Seamless Navigation unified menu items
    SET_MENU_ITEM_PROPERTY('Action.BROWSE_MAG',   ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Action.OPEN_APP_MAG', ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Action.SEARCH_MAG',   ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Action.SIGN_OUT_MAG', ENABLED  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Help.HELP_MAG',       ENABLED  ,PROPERTY_TRUE);
    DEFAULT_VALUE('N','GLOBAL.BANNER_XE_MODE');
    IF NAME_IN('GLOBAL.BANNER_XE_MODE') = 'N' THEN
      G$_XE.SET_MENU_ITEMS(0);
    ELSE
      G$_XE.SET_MENU_ITEMS(1);
    END IF;
-- -- -- --
-- -- -- -- 
  END;
--
--
  PROCEDURE SET_ACTION_SELECT IS
  BEGIN 
    IF THIS_IS_MENU_FORM 
    OR CALLED_BY_MENU_FORM 
    OR NVL(NAME_IN('GLOBAL.LAST_TEN_CALL') ,'N') = 'Y' 
    OR NVL(NAME_IN('GLOBAL.NAV_FRAME_CALL'),'N') = 'Y' THEN
--
      IF current_form = 'GUQQUIK' THEN
        SET_MENU_ITEM_PROPERTY('Action.Select',ENABLED,PROPERTY_TRUE);
        SET_MENU_ITEM_PROPERTY('Icons.Select', ENABLED,PROPERTY_TRUE);
        COPY('E,' || NAME_IN('GLOBAL.SELECT'),'GLOBAL.SELECT');
      ELSE
        SET_MENU_ITEM_PROPERTY('Action.Select',ENABLED,PROPERTY_FALSE);
        SET_MENU_ITEM_PROPERTY('Icons.Select', ENABLED,PROPERTY_FALSE);
        COPY('D,' || NAME_IN('GLOBAL.SELECT'),'GLOBAL.SELECT');
      END IF;
--
    ELSE
      SET_MENU_ITEM_PROPERTY('Action.Select',ENABLED,PROPERTY_TRUE);
      SET_MENU_ITEM_PROPERTY('Icons.Select', ENABLED,PROPERTY_TRUE);
      COPY('E,' || NAME_IN('GLOBAL.SELECT'),'GLOBAL.SELECT');
    END IF;
    COPY('N','GLOBAL.NAV_FRAME_CALL');
    COPY('N','GLOBAL.LAST_TEN_CALL');
  END;
--
-- Set the menus.
--
  PROCEDURE SET_WIN_HELP ( object_in IN VARCHAR2 ) IS
  BEGIN
    NULL;
  END;
--
--
  PROCEDURE SET_OPTIONS ( object_in IN VARCHAR2 ) IS
  BEGIN
    IF object_in = 'GUAGMNU' THEN
      SET_MENU_ITEM_PROPERTY('Main.Options',ENABLED,PROPERTY_FALSE);
    ELSE
      IF G$_NAVIGATION_FRAME.OPTIONS_EXIST(object_in) THEN
        SET_MENU_ITEM_PROPERTY('Main.Options',ENABLED,PROPERTY_TRUE);
      ELSE
        SET_MENU_ITEM_PROPERTY('Main.Options',ENABLED,PROPERTY_FALSE);
      END IF;
    END IF;
  END;
--
--
  FUNCTION GET_LAST_STATE ( var_name  IN VARCHAR2,
                            remove_in IN BOOLEAN ) RETURN VARCHAR2 IS
    state_is  VARCHAR2(1);
    state_row VARCHAR2(2000) := NAME_IN(var_name);
  BEGIN  
    IF state_row IS NOT NULL THEN
      state_row := SUBSTR(state_row,INSTR(state_row,',')+1);
      state_is := SUBSTR(state_row,1,INSTR(state_row,',')-1);
      IF remove_in THEN
         COPY(state_row,var_name);
      END IF;
    END IF;
    RETURN(state_is);
  END;   
--
--
  FUNCTION SELECT_ENABLED ( remove_in IN BOOLEAN ) RETURN BOOLEAN IS
    sel_state VARCHAR2(1);
  BEGIN    
    IF remove_in THEN
      sel_state := GET_LAST_STATE('GLOBAL.SELECT',TRUE);
      IF NVL(sel_state,'D') = 'D' THEN
        SET_MENU_ITEM_PROPERTY('Action.Select',ENABLED,PROPERTY_FALSE);
        SET_MENU_ITEM_PROPERTY('Icons.Select', ENABLED,PROPERTY_FALSE);
      ELSE
        SET_MENU_ITEM_PROPERTY('Action.Select',ENABLED,PROPERTY_TRUE);
        SET_MENU_ITEM_PROPERTY('Icons.Select', ENABLED,PROPERTY_TRUE);
      END IF;
    END IF;  
--   
    RETURN(NVL(sel_state,'D') = 'D');
  END;   
--
--
  FUNCTION THIS_IS_MENU_FORM RETURN BOOLEAN IS
  BEGIN    
    IF current_form IN ('GUAGMNU','GUIOBJS','GUAPARM','GUAQFLW') THEN
      RETURN(TRUE);
    END IF;
    RETURN(FALSE);
  END;   
--
--
-- -- -- --  FUNCTION CALLED_BY_MENU_FORM RETURN BOOLEAN IS
-- -- -- --  BEGIN   
-- -- -- --    IF GET_APPLICATION_PROPERTY(CALLING_FORM) IN ('GUAGMNU','GUIOBJS','GUAPARM','GUAQFLW') THEN
-- -- -- --      RETURN(TRUE);
-- -- -- --    END IF;
-- -- -- --    RETURN(FALSE);
-- -- -- --  END;
-- -- -- --
-- -- -- --
  FUNCTION CALLED_BY_MENU_FORM RETURN BOOLEAN IS
  BEGIN   
    DEFAULT_VALUE('N','GLOBAL.BANNER_XE_MODE');
    IF NAME_IN('GLOBAL.BANNER_XE_MODE') = 'Y' THEN
      IF GET_APPLICATION_PROPERTY(CALLING_FORM) IN ('GUAINIT','GUAGMNU','GUIOBJS','GUAPARM','GUAQFLW') THEN
        RETURN(TRUE);
      END IF;
    ELSE
      IF GET_APPLICATION_PROPERTY(CALLING_FORM) IN ('GUAGMNU','GUIOBJS','GUAPARM','GUAQFLW') THEN
        RETURN(TRUE);
      END IF;
    END IF;
    RETURN(FALSE);
  END;   
--
--
  PROCEDURE DISABLE_ENABLE_WF_MENU IS
  BEGIN
    IF goksyst.F_IsSystemLinkEnabled('WORKFLOW') THEN
  	  SET_MENU_ITEM_PROPERTY('TOOLS.WORKFLOW',   ENABLED,PROPERTY_TRUE);
--
    	SET_MENU_ITEM_PROPERTY('Icons.WF_SUBMIT',  VISIBLE,PROPERTY_TRUE);
  	  SET_MENU_ITEM_PROPERTY('Icons.WF_RELEASE', VISIBLE,PROPERTY_TRUE);
    	SET_MENU_ITEM_PROPERTY('Icons.SEP8',       VISIBLE,PROPERTY_TRUE);
    ELSE
  	  SET_MENU_ITEM_PROPERTY('TOOLS.WORKFLOW',   ENABLED,PROPERTY_FALSE);
--
    	SET_MENU_ITEM_PROPERTY('Icons.WF_SUBMIT',  VISIBLE,PROPERTY_FALSE);
  	  SET_MENU_ITEM_PROPERTY('Icons.WF_RELEASE', VISIBLE,PROPERTY_FALSE);
    	SET_MENU_ITEM_PROPERTY('Icons.SEP8',       VISIBLE,PROPERTY_FALSE);
    END IF;
  END;
--
--
  PROCEDURE DISABLE_ENABLE_BXS_MENU IS
  BEGIN
    E$_IMG_UTIL.P_SET_MENU;
  END;
--
--
  PROCEDURE SET_FGAC_NOTICE IS
    lv_recs_exist    VARCHAR2(1);
    lv_current_user  VARCHAR2(30) := NAME_IN('GLOBAL.CURRENT_USER');
--
    CURSOR do_rules_exist_c IS
      SELECT 'Y'
        FROM DUAL
       WHERE EXISTS
             (SELECT 'X'
                FROM GOVFGAC
               WHERE GOVFGAC_FGAC_USER_ID = lv_current_user
                 AND (GOVFGAC_UPDATE_PREDICATE IS NOT NULL
                  OR  GOVFGAC_SELECT_PREDICATE IS NOT NULL
                  OR  GOVFGAC_DELETE_PREDICATE IS NOT NULL
                  OR  GOVFGAC_INSERT_PREDICATE IS NOT NULL));
--
  BEGIN
    OPEN do_rules_exist_c;
    FETCH do_rules_exist_c INTO lv_recs_exist;
    CLOSE do_rules_exist_c;
--
    IF NVL(lv_recs_exist,'N') = 'Y' THEN
      SET_MENU_ITEM_PROPERTY('ICONS.FGAC_EXISTS',ENABLED,PROPERTY_TRUE);
--
      IF G$_CHECK_ACCESS('GOIFGAC') THEN
        SET_MENU_ITEM_PROPERTY('ICONS.FGAC_EXISTS',LABEL,
          'Fine-Grained Access Control security is in place for you.  Press image to view details.');
      ELSE
        SET_MENU_ITEM_PROPERTY('ICONS.FGAC_EXISTS',LABEL,
          'Fine-Grained Access Control security is in place for you.');
      END IF;
--
    ELSE
      SET_MENU_ITEM_PROPERTY('ICONS.FGAC_EXISTS',ENABLED,PROPERTY_FALSE);
    END IF;
  END;
--
--
BEGIN
  current_form  := NAME_IN('SYSTEM.CURRENT_FORM');
  previous_form := GET_APPLICATION_PROPERTY(CALLING_FORM);
END;
		*/
				// 
		private NString currentForm= NString.getNull();
		private NString previousForm= NString.getNull();
/* <p>
		* 
		*  Set the menus.
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void setMenuPreForm()
		{
			if ( thisIsMenuForm().not() )
			{
				regularMenuSet();
			}
			else {
				menuFormsMenuSet();
			}
			// 
			setActionSelect();
			setOptions(currentForm);
		}
/* <p>
		* 
		*  Reset the menus.
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void setMenuPostForm()
		{
			//MORPHIS: menu options logic
//			NBool prvSelState= NBool.getNull();
//			prvSelState = selectEnabled(toBool(NBool.True));
			// F2J_TODO : Check if the function used in the expression below may be called more than once. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#FunctionUsedInIn".
			if ( calledByMenuForm().getValue() && in(getParentTaskName(), "GUAGMNU", "GUAQFLW").getValue() )
			{
				menuFormsMenuSet();
			}
			else {
				regularMenuSet();
			}
		}
/* <p>
		* 
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void setDataExtract()
		{
			int rowCount = 0;
			NString extEnabled= NString.getNull();
			String sqldbExt = "SELECT GUBOBJS_EXTRACT_ENABLED_IND " +
	" FROM GUBOBJS " +
	" WHERE GUBOBJS_NAME = :P_CURRENT_FORM ";
			DataCursor dbExt = new DataCursor(sqldbExt);
			try {
				currentForm = getCurrentTaskName();
				// 
				//Setting query parameters
				dbExt.addParameter("P_CURRENT_FORM", currentForm);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable dbExt.
				dbExt.open();
				ResultSet dbExtResults = dbExt.fetchInto();
				if ( dbExtResults != null ) {
					extEnabled = dbExtResults.getStr(0);
				}
				dbExt.close();
				// 
				setMenuItemEnabled("HELP.ExtractK", false);
				setMenuItemEnabled("HELP.ExtractNK", false);
				// 
				if ( extEnabled.isNull() )
				{
					return ;
				}
				else if ( extEnabled.equals("B") ) {
					setMenuItemEnabled("HELP.ExtractNK", true);
					if ( getContainer().gBlockExists(toStr("KEY_BLOCK")).getValue() )
					{
						setMenuItemEnabled("HELP.ExtractK", true);
					}
				}
				else if ( extEnabled.equals("D") ) {
					setMenuItemEnabled("HELP.ExtractNK", true);
				}
				}finally{
					dbExt.close();
				}
		}
/* <p>
		* 
		* 
/* </p>
		*/
		public void regularMenuSet()
		{
			setMenuItemEnabled("Icons.Insert", true);
			setMenuItemEnabled("Icons.Remove", true);
			setMenuItemEnabled("Icons.Enter", true);
			setMenuItemEnabled("Icons.Execute", true);
			setMenuItemEnabled("Icons.Cancel", true);
			setMenuItemEnabled("Icons.Previous_record", true);
			setMenuItemEnabled("Icons.Next_record", true);
			setMenuItemEnabled("Icons.Previous_block", true);
			setMenuItemEnabled("Icons.Next_block", true);
			setMenuItemEnabled("Icons.Print", true);
			setMenuItemEnabled("Icons.Save", true);
			setMenuItemEnabled("Icons.Rollback", true);
			// 
			setMenuItemEnabled("Main.Edit", true);
			setMenuItemEnabled("Main.Query", true);
			setMenuItemEnabled("Main.Field", true);
			setMenuItemEnabled("Main.Record", true);
			setMenuItemEnabled("Main.Block", true);
			// 
			setMenuItemEnabled("Action.Direct_Access", true);
			//  -- -- --
			//  -- -- -- XE Seamless Navigation unified menu items
			setMenuItemEnabled("Action.BROWSE_MAG", true);
			setMenuItemEnabled("Action.OPEN_APP_MAG", true);
			setMenuItemEnabled("Action.SEARCH_MAG", true);
			setMenuItemEnabled("Action.SIGN_OUT_MAG", true);
			setMenuItemEnabled("Help.HELP_MAG", true);
			setDefaultValue("N", "GLOBAL.BANNER_XE_MODE");
			if ( getNameIn("GLOBAL.BANNER_XE_MODE").equals("N") )
			{
				getContainer().getGXe().setMenuItems(toNumber(0));
			}
			else {
				getContainer().getGXe().setMenuItems(toNumber(1));
			}
			//  -- -- --
			//  -- -- -- 
			setMenuItemEnabled("Action.Object_Search", true);
			setMenuItemEnabled("Action.Rollback", true);
			setMenuItemEnabled("Action.Save", true);
			setMenuItemEnabled("Action.ExitBanner", true);
			// 
			setMenuItemEnabled("Record.Previous", true);
			setMenuItemEnabled("Record.Next", true);
			setMenuItemEnabled("Record.Scroll up", true);
			setMenuItemEnabled("Record.Scroll down", true);
			setMenuItemEnabled("Record.Clear", true);
			setMenuItemEnabled("Record.Remove", true);
			setMenuItemEnabled("Record.Insert", true);
			setMenuItemEnabled("Record.Duplicate", true);
			setMenuItemEnabled("Record.Lock", true);
			// 
			setMenuItemEnabled("Field.Duplicate", true);
			setMenuItemEnabled("Help.Display_image", true);
			// 
			setMenuItemEnabled("Main.Tools", true);
			// 
			setDataExtract();
			// 
			if ( !getNameIn("GLOBAL.QF_STATUS").isNull() )
			{
				setMenuItemEnabled("Action.ExitQuickflow", true);
			}
			// 
			//  Menus which should be conditionally turned on if not coming from a channel.
			// 
			if ( getNameIn("GLOBAL.KEEP_ALIVE").equals("YES") )
			{
				setMenuItemEnabled("Action.ExitToMenu", true);
			}
			//  -- -- --
			//  -- -- --
			setDefaultValue("N", "GLOBAL.BANNER_XE_MODE");
			if ( getNameIn("GLOBAL.BANNER_XE_MODE").equals("Y") )
			{
				setMenuItemEnabled("Action.ExitToMenu", true);
				setMenuItemEnabled("Action.ExitBanner", false);
			}
			//  -- -- --
			//  -- -- --
			// 
			disableEnableBxsMenu();
			disableEnableWfMenu();
		}
/* <p>
		* 
		* 
/* </p>
		*/
		public void menuFormsMenuSet()
		{
			setMenuItemEnabled("Main.Options", false);
			setMenuItemEnabled("Main.Edit", false);
			setMenuItemEnabled("Main.Block", false);
			setMenuItemEnabled("Main.Query", false);
			setMenuItemEnabled("Main.Field", false);
			setMenuItemEnabled("Main.Record", false);
			setMenuItemEnabled("Action.Direct_Access", false);
			setMenuItemEnabled("Action.Rollback", false);
			setMenuItemEnabled("Action.Save", false);
			setMenuItemEnabled("Action.Select", false);
			setMenuItemEnabled("Action.ExitBanner", false);
			setMenuItemEnabled("Action.ExitToMenu", false);
			setMenuItemEnabled("Help.Display_image", false);
			setMenuItemEnabled("Help.Extractk", false);
			setMenuItemEnabled("Help.Extractnk", false);
			// 
			if ( in(currentForm, "GUIOBJS", "GUAPARM").getValue() )
			{
				setMenuItemEnabled("Main.Query", true);
			}
			// 
			setMenuItemEnabled("Main.Tools", false);
			// 
			setMenuItemEnabled("Icons.Select", false);
			setMenuItemEnabled("Icons.Insert", false);
			setMenuItemEnabled("Icons.Remove", false);
			setMenuItemEnabled("Icons.Enter", false);
			setMenuItemEnabled("Icons.Execute", false);
			setMenuItemEnabled("Icons.Cancel", false);
			setMenuItemEnabled("Icons.Previous_record", false);
			setMenuItemEnabled("Icons.Next_record", false);
			setMenuItemEnabled("Icons.Previous_block", false);
			setMenuItemEnabled("Icons.Next_block", false);
			setMenuItemEnabled("Icons.Print", false);
			setMenuItemEnabled("Icons.Save", false);
			setMenuItemEnabled("Icons.Rollback", false);
			// 
			disableEnableBxsMenu();
			disableEnableWfMenu();
			//  -- -- --
			//  -- -- -- XE Seamless Navigation unified menu items
			setMenuItemEnabled("Action.BROWSE_MAG", true);
			setMenuItemEnabled("Action.OPEN_APP_MAG", true);
			setMenuItemEnabled("Action.SEARCH_MAG", true);
			setMenuItemEnabled("Action.SIGN_OUT_MAG", true);
			setMenuItemEnabled("Help.HELP_MAG", true);
			setDefaultValue("N", "GLOBAL.BANNER_XE_MODE");
			if ( getNameIn("GLOBAL.BANNER_XE_MODE").equals("N") )
			{
				getContainer().getGXe().setMenuItems(toNumber(0));
			}
			else {
				getContainer().getGXe().setMenuItems(toNumber(1));
			}
		}
/* <p>
		* 
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void setActionSelect()
		{
			if ( thisIsMenuForm().getValue() || calledByMenuForm().getValue() || isNull(getNameIn("GLOBAL.LAST_TEN_CALL"), "N").equals("Y") || isNull(getNameIn("GLOBAL.NAV_FRAME_CALL"), "N").equals("Y") )
			{
				// 
				if ( currentForm.equals("GUQQUIK") )
				{
					setMenuItemEnabled("Action.Select", true);
					setMenuItemEnabled("Icons.Select", true);
					copy(toStr("E,").append(getNameIn("GLOBAL.SELECT")),"GLOBAL.SELECT");
				}
				else {
					setMenuItemEnabled("Action.Select", false);
					setMenuItemEnabled("Icons.Select", false);
					copy(toStr("D,").append(getNameIn("GLOBAL.SELECT")),"GLOBAL.SELECT");
				}
			}
			else {
				setMenuItemEnabled("Action.Select", true);
				setMenuItemEnabled("Icons.Select", true);
				copy(toStr("E,").append(getNameIn("GLOBAL.SELECT")),"GLOBAL.SELECT");
			}
			copy("N","GLOBAL.NAV_FRAME_CALL");
			copy("N","GLOBAL.LAST_TEN_CALL");
		}
/* <p>
		* 
		*  Set the menus.
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param objectIn
		*/
		public void setWinHelp(NString objectIn)
		{
		}
/* <p>
		* 
		* 
/* </p>
		* @param objectIn
		*/
		public void setOptions(NString objectIn)
		{
			if ( objectIn.equals("GUAGMNU") )
			{
				setMenuItemEnabled("Main.Options", false);
			}
			else {
				if ( getContainer().getGNavigationFrame().optionsExist(objectIn).getValue() )
				{
					setMenuItemEnabled("Main.Options", true);
				}
				else {
					setMenuItemEnabled("Main.Options", false);
				}
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param varName
		* @param removeIn
		*/
		public NString getLastState(NString varName, NBool removeIn)
		{
			NString stateIs= NString.getNull();
			NString stateRow = getNameIn(varName);
			if ( !stateRow.isNull() )
			{
				stateRow = substring(stateRow, inStr(stateRow, toStr(",")).add(1));
				stateIs = substring(stateRow, toInt(1), inStr(stateRow, toStr(",")).subtract(1));
				if ( removeIn.getValue() )
				{
					copy(stateRow,varName);
				}
			}
			return ((stateIs));
		}
/* <p>
		* 
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param removeIn
		*/
		public NBool selectEnabled(NBool removeIn)
		{
			NString selState= NString.getNull();
			if ( removeIn.getValue() )
			{
				selState = getLastState(toStr("GLOBAL.SELECT"), toBool(NBool.True));
				if ( isNull(selState, "D").equals("D") )
				{
					setMenuItemEnabled("Action.Select", false);
					setMenuItemEnabled("Icons.Select", false);
				}
				else {
					setMenuItemEnabled("Action.Select", true);
					setMenuItemEnabled("Icons.Select", true);
				}
			}
			//    
			return toBool(isNull(selState, "D").equals("D"));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool thisIsMenuForm()
		{
			if ( in(currentForm, "GUAGMNU", "GUIOBJS", "GUAPARM", "GUAQFLW").getValue() )
			{
				return  toBool(((NBool.True)));
			}
			return  toBool(((NBool.False)));
		}
/* <p>
		* 
		* 
		*  -- -- --  FUNCTION CALLED_BY_MENU_FORM RETURN BOOLEAN IS
		*  -- -- --  BEGIN   
		*  -- -- --    IF GET_APPLICATION_PROPERTY(CALLING_FORM) IN ('GUAGMNU','GUIOBJS','GUAPARM','GUAQFLW') THEN
		*  -- -- --      RETURN(TRUE);
		*  -- -- --    END IF;
		*  -- -- --    RETURN(FALSE);
		*  -- -- --  END;
		*  -- -- --
		*  -- -- --
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool calledByMenuForm()
		{
			setDefaultValue("N", "GLOBAL.BANNER_XE_MODE");
			if ( getNameIn("GLOBAL.BANNER_XE_MODE").equals("Y") )
			{
				// F2J_TODO : Check if the function used in the expression below may be called more than once. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#FunctionUsedInIn".
				if ( in(getParentTaskName(), "GUAINIT", "GUAGMNU", "GUIOBJS", "GUAPARM", "GUAQFLW").getValue() )
				{
					return  toBool(((NBool.True)));
				}
			}
			else {
				// F2J_TODO : Check if the function used in the expression below may be called more than once. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#FunctionUsedInIn".
				if ( in(getParentTaskName(),  "GUAINIT", "GUAGMNU", "GUIOBJS", "GUAPARM", "GUAQFLW").getValue() )
				{
					return  toBool(((NBool.True)));
				}
			}
			return  toBool(((NBool.False)));
		}
/* <p>
		* 
		* 
/* </p>
		*/
		public void disableEnableWfMenu()
		{
			if ( Goksyst.fIssystemlinkenabled(toStr("WORKFLOW")).getValue() )
			{
				setMenuItemEnabled("TOOLS.WORKFLOW", true);
				// 
				setMenuItemVisible("Icons.WF_SUBMIT", true);
				setMenuItemVisible("Icons.WF_RELEASE", true);
				setMenuItemVisible("Icons.SEP8", true);
			}
			else {
				setMenuItemEnabled("TOOLS.WORKFLOW", false);
				// 
				setMenuItemVisible("Icons.WF_SUBMIT", false);
				setMenuItemVisible("Icons.WF_RELEASE", false);
				setMenuItemVisible("Icons.SEP8", false);
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void disableEnableBxsMenu()
		{
			getContainer().getEoqrpls().getEImgUtil().pSetMenu();
		}
/* <p>
		* 
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void setFgacNotice()
		{
			int rowCount = 0;
			NString lvRecsExist= NString.getNull();
			NString lvCurrentUser = getNameIn("GLOBAL.CURRENT_USER");
			String sqldoRulesExistC = "SELECT 'Y' " +
	" FROM DUAL " +
	" WHERE  EXISTS(SELECT 'X' " +
		" FROM GOVFGAC " +
		" WHERE GOVFGAC_FGAC_USER_ID = :P_LV_CURRENT_USER AND (GOVFGAC_UPDATE_PREDICATE IS NOT NULL OR GOVFGAC_SELECT_PREDICATE IS NOT NULL OR GOVFGAC_DELETE_PREDICATE IS NOT NULL OR GOVFGAC_INSERT_PREDICATE IS NOT NULL) ) ";
			DataCursor doRulesExistC = new DataCursor(sqldoRulesExistC);
			try {
				//Setting query parameters
				doRulesExistC.addParameter("P_LV_CURRENT_USER", lvCurrentUser);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable doRulesExistC.
				doRulesExistC.open();
				ResultSet doRulesExistCResults = doRulesExistC.fetchInto();
				if ( doRulesExistCResults != null ) {
					lvRecsExist = doRulesExistCResults.getStr(0);
				}
				doRulesExistC.close();
				// 
				if ( isNull(lvRecsExist, "N").equals("Y") )
				{
					setMenuItemEnabled("ICONS.FGAC_EXISTS", true);
					// 
					if ( getContainer().gCheckAccess(toStr("GOIFGAC")).getValue() )
					{
						// F2J_NOT_SUPPORTED : The property "MENU_ITEM's LABEL" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
						//						SupportClasses.FORMS40.SetMenuItemProperty("ICONS.FGAC_EXISTS", SupportClasses.Property.LABEL, "Fine-Grained Access Control security is in place for you.  Press image to view details.");
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's LABEL' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
						
						
					}
					else {
						// F2J_NOT_SUPPORTED : The property "MENU_ITEM's LABEL" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
						//						SupportClasses.FORMS40.SetMenuItemProperty("ICONS.FGAC_EXISTS", SupportClasses.Property.LABEL, "Fine-Grained Access Control security is in place for you.");
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's LABEL' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
						
						
					}
				}
				else {
					setMenuItemEnabled("ICONS.FGAC_EXISTS", false);
				}
				}finally{
					doRulesExistC.close();
				}
		}
		
	
	
}
