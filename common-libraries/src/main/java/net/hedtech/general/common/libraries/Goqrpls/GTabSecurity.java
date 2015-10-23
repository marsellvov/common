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

public class GTabSecurity extends AbstractSupportCodeObject {
	

	public GTabSecurity(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_TAB_SECURITY
	/*
	PACKAGE G$_TAB_SECURITY IS
  TYPE TABSEC_TABTYPE IS TABLE OF VARCHAR2(40)
       INDEX BY BINARY_INTEGER;
  TABSEC_TABLE TABSEC_TABTYPE;
  TABSEC_CNT   BINARY_INTEGER := 0;

  PROCEDURE G$_TABSEC_BUILD(p_x VARCHAR2);
  PROCEDURE G$_TABSEC_ECHO;
--
  FUNCTION G$_AUTH_LEVEL_TAB(p_tab_name VARCHAR2) RETURN VARCHAR2;
--      
  PROCEDURE G$_SET_TAB_PAGE_PROPERTY(p_tab_page_id           TAB_PAGE,
                                     p_enable_disable_string VARCHAR2,
                                     p_bool_string           VARCHAR2,
                                     p_tab_name              VARCHAR2);
  PROCEDURE G$_WALK_ITEMS_DISABLE(XBLCK VARCHAR2,FRSTITM VARCHAR2,LSTITM VARCHAR2);
  PROCEDURE G$_WALK_ITEMS_CHECK_QUERY(XBLCK VARCHAR2,FRSTITM VARCHAR2,LSTITM VARCHAR2,BLOCK_HIT OUT VARCHAR2);
  PROCEDURE G$_WALK_BLOCKS_CHECK_QUERY(FRSTBLCK VARCHAR2,LSTBLCK VARCHAR2);
  PROCEDURE G$_WALK_ITEMS_CHECK_HIDE_V2(XBLCK VARCHAR2,FRSTITM VARCHAR2,LSTITM VARCHAR2);
  PROCEDURE G$_WALK_BLOCKS_CHECK_HIDE_V2(FRSTBLCK VARCHAR2,LSTBLCK VARCHAR2);

END;
	*/
	
			public TabsecTabtype tabsecTable= new TabsecTabtype();
			public NInteger tabsecCnt = toInt(0);

			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_TAB_SECURITY
		/*
		PACKAGE BODY G$_TAB_SECURITY IS
  PROCEDURE G$_TABSEC_BUILD(p_x VARCHAR2) IS
  -- This routine is called from Forms that have had the Tab Security Methodology applied to them
  -- This routine will:
  --     (1) Revalidates security.  prevent passing a modified string thru the form's when-new-form-instance.
  --         When testing this "if" can be commented out; otherwise gsasecr modification of tab privs is needed.
  --     (2) value the TABSEC_TABLE
  --     (3) will walk the blocks.items of the form to set block or item properties appropriately for the TAB Canvas
  -- p_x is the return value from G%_SECURITY.G$_GET_TAB_SECURITY_FNC.
  -- IF p_x is NULL then there is no Tab Security in place for this form and user.
  -- Otherwise, p_x variable is not NULL and it is then parsed into the TABSEC_TABLE
  -- For example:
  --    p_x may contain information on 4 tabs for a form.  Tab name, separator (:), Tab access indicator and
  --    separator (:)
  --    WWWWW_TAB:Q:XXXXXXXXX_TAB:N:YYYYYYY_TAB:F:ZZZ_TAB:N:
  --    TABSEC_TABLE (1)   will hold   WWWWW_TAB:Q
  --    TABSEC_TABLE (2)   will hold   XXXXXXXXX_TAB:N
  --    TABSEC_TABLE (3)   will hold   YYYYYYY_TAB:F
  --    TABSEC_TABLE (4)   will hold   ZZZ_TAB:N
  --
  --    Tab Access Values:
  --    F - Full Access to Tab 
  --    Q - Query Access to the Tab
  --    N - No Access to the Tab (Tab is Hidden)
  --
  lv_start_instr   NUMBER(4) := 1;
  lv_end_instr     NUMBER(4) := LENGTH(p_x)  - 2;
  lv_pntr_val      NUMBER(4);
  lv_temp_formname VARCHAR2(30) := NAME_IN('SYSTEM.CURRENT_FORM');
  lv_err_msg       VARCHAR2(200);
  --
  BEGIN
  	IF p_x IS NULL THEN
  		RETURN;
  	END IF;
--
-- --(1)
    IF p_x <> G$_SECURITY.G$_GET_TAB_SECURITY_FNC(lv_temp_formname,USER) THEN
      lv_err_msg := G$_NLS.Get('GOQRPLS-0152','LIB','*ERROR* An override of Tab Security rules for user  %01% on %02% was attempted. %02% aborting.',USER,lv_temp_formname);
      MESSAGE(lv_err_msg);
-- -- record a security violation of this attempt
  	  G$_SECURITY.G$_CREATE_LOG_RECORD(USER, lv_temp_formname, lv_err_msg);
      RAISE FORM_TRIGGER_FAILURE;    
    END IF;
--
-- --(2) 
    WHILE lv_start_instr < lv_end_instr
    LOOP
      lv_pntr_val := INSTR(p_x,':',lv_start_instr,1);
-- --
      TABSEC_CNT := TABSEC_CNT + 1;
      TABSEC_TABLE(TABSEC_CNT) := substr(p_x,lv_start_instr,(lv_pntr_val - lv_start_instr) + 2);
-- --
      lv_start_instr := lv_pntr_val + 3;
    END LOOP;
--
-- --(3)
    IF INSTR(p_x,':Q:') > 0 THEN
	    G$_TAB_SECURITY.G$_WALK_BLOCKS_CHECK_QUERY(GET_FORM_PROPERTY(lv_temp_formname,FIRST_BLOCK),
	                                               GET_FORM_PROPERTY(lv_temp_formname,LAST_BLOCK));
    END IF;
    IF INSTR(p_x,':N:') > 0 THEN
	    G$_TAB_SECURITY.G$_WALK_BLOCKS_CHECK_HIDE_V2(GET_FORM_PROPERTY(lv_temp_formname,FIRST_BLOCK),
	                                                 GET_FORM_PROPERTY(lv_temp_formname,LAST_BLOCK));
    END IF;
-- --
  END;
--  
  PROCEDURE G$_TABSEC_ECHO IS
-- -- This routine is available for debugging
  BEGIN
    MESSAGE(G$_NLS.Get('GOQRPLS-0153','LIB','ECHO of Table TABSEC_TABLE'));
    FOR J IN 1..TABSEC_CNT LOOP
      MESSAGE(G$_NLS.Get('GOQRPLS-0154','LIB','TABSEC_TABLE item %01%=%02%', TO_CHAR(J), TABSEC_TABLE(J)));
    END LOOP;
    MESSAGE('');   
  END;
-- --
  FUNCTION G$_AUTH_LEVEL_TAB(p_tab_name VARCHAR2) RETURN VARCHAR2 IS
  lv_auth_level_tab VARCHAR2(1) := 'F';
  BEGIN
    FOR J IN 1..TABSEC_CNT LOOP
      IF INSTR(TABSEC_TABLE(J),p_tab_name) > 0 THEN
        lv_auth_level_tab := SUBSTR(TABSEC_TABLE(J),INSTR(TABSEC_TABLE(J),':') + 1, 1);
        RETURN(lv_auth_level_tab);
      END IF;
    END LOOP;
    RETURN(lv_auth_level_tab);
  END;
-- --
-- --
  PROCEDURE G$_SET_TAB_PAGE_PROPERTY(p_tab_page_id           TAB_PAGE,
                                     p_enable_disable_string VARCHAR2,
                                     p_bool_string           VARCHAR2,
                                     p_tab_name              VARCHAR2) IS
--
	lv_auth_level_of_tab VARCHAR2(1) := G$_AUTH_LEVEL_TAB(p_tab_name);
--  SET_TAB_PAGE_PROPERTY(p_tab_page_id,p_enable_disable_ind,p_bool_ind);
-- F = Full Access
-- Q = Query ONLY
-- N = Not Visible
  BEGIN
    IF p_bool_string = 'PROPERTY_TRUE' THEN
      IF p_enable_disable_string = 'ENABLED' THEN
        IF lv_auth_level_of_tab IN ('F','Q') THEN
          SET_TAB_PAGE_PROPERTY(p_tab_page_id,ENABLED,PROPERTY_TRUE);
        ELSE
          SET_TAB_PAGE_PROPERTY(p_tab_page_id,VISIBLE,PROPERTY_FALSE);        
        END IF;
      ELSE
        SET_TAB_PAGE_PROPERTY(p_tab_page_id,ENABLED,PROPERTY_FALSE);
      END IF;
    ELSE
      IF lv_auth_level_of_tab IN ('F','Q') THEN  	
        IF p_enable_disable_string = 'ENABLED' THEN
          SET_TAB_PAGE_PROPERTY(p_tab_page_id,ENABLED,PROPERTY_FALSE);
        ELSE
          SET_TAB_PAGE_PROPERTY(p_tab_page_id,ENABLED,PROPERTY_TRUE);
        END IF;
      ELSE
        SET_TAB_PAGE_PROPERTY(p_tab_page_id,VISIBLE,PROPERTY_FALSE);                 
      END IF;  	
    END IF;
  END;
-- --
-- --
  PROCEDURE G$_WALK_ITEMS_DISABLE(XBLCK VARCHAR2,FRSTITM VARCHAR2,LSTITM VARCHAR2) IS
    XITEM   VARCHAR2(61) := XBLCK||'.'||FRSTITM;
    XLSTITM VARCHAR2(61) := XBLCK||'.'||LSTITM;
  BEGIN
    LOOP
    	IF GET_ITEM_PROPERTY(XITEM,ITEM_CANVAS) IS NOT NULL THEN
    	  IF GET_ITEM_PROPERTY(XITEM,ITEM_TYPE) <> 'DISPLAY ITEM' THEN
          SET_ITEM_PROPERTY(XITEM,ENABLED,PROPERTY_FALSE);
        END IF;
      END IF;
--
      EXIT WHEN XITEM = XLSTITM;
--
      XITEM := XBLCK||'.'||GET_ITEM_PROPERTY(XITEM,NEXTITEM);
    END LOOP;
  END;
--
--
  PROCEDURE G$_WALK_ITEMS_CHECK_QUERY(XBLCK VARCHAR2,FRSTITM VARCHAR2,LSTITM VARCHAR2, BLOCK_HIT OUT VARCHAR2) IS
    XITEM            VARCHAR2(61) := XBLCK||'.'||FRSTITM;
    XLSTITM          VARCHAR2(61) := XBLCK||'.'||LSTITM;
    LV_ITEM_TAB_PAGE VARCHAR2(30);
  BEGIN
  	BLOCK_HIT := 'N';
    LOOP
    	IF GET_ITEM_PROPERTY(XITEM,ITEM_CANVAS) IS NOT NULL THEN
    	  IF GET_ITEM_PROPERTY(XITEM,ITEM_TYPE) <> 'DISPLAY ITEM' THEN
          LV_ITEM_TAB_PAGE := GET_ITEM_PROPERTY(XITEM,ITEM_TAB_PAGE);
          IF LV_ITEM_TAB_PAGE IS NOT NULL THEN
          	IF G$_AUTH_LEVEL_TAB(LV_ITEM_TAB_PAGE) = 'Q' THEN
          	  BLOCK_HIT := 'Y';
          	  EXIT ;
          	END IF;
          END IF;
        END IF;
      END IF;
--
      EXIT WHEN XITEM = XLSTITM;
--
      XITEM := XBLCK||'.'||GET_ITEM_PROPERTY(XITEM,NEXTITEM);
    END LOOP;
  END;
--
--
  PROCEDURE G$_WALK_ITEMS_CHECK_HIDE_V2(XBLCK VARCHAR2,FRSTITM VARCHAR2,LSTITM VARCHAR2) IS
    XITEM            VARCHAR2(61) := XBLCK||'.'||FRSTITM;
    XLSTITM          VARCHAR2(61) := XBLCK||'.'||LSTITM;
    LV_ITEM_TAB_PAGE VARCHAR2(30);
  BEGIN
    LOOP
    	IF GET_ITEM_PROPERTY(XITEM,ITEM_CANVAS) IS NOT NULL THEN
    	  IF GET_ITEM_PROPERTY(XITEM,ITEM_TYPE) <> 'DISPLAY ITEM' THEN
          LV_ITEM_TAB_PAGE := GET_ITEM_PROPERTY(XITEM,ITEM_TAB_PAGE);
          IF LV_ITEM_TAB_PAGE IS NOT NULL THEN
          	IF G$_AUTH_LEVEL_TAB(LV_ITEM_TAB_PAGE) = 'N' THEN
          	  SET_ITEM_PROPERTY(XITEM,ENABLED,PROPERTY_FALSE);
          	END IF;
          END IF;
        END IF;
      END IF;
--
      EXIT WHEN XITEM = XLSTITM;
--
      XITEM := XBLCK||'.'||GET_ITEM_PROPERTY(XITEM,NEXTITEM);
    END LOOP;
  END;
--
--
  PROCEDURE G$_WALK_BLOCKS_CHECK_QUERY(FRSTBLCK VARCHAR2,LSTBLCK VARCHAR2)IS
    X VARCHAR2(30) := FRSTBLCK;
    lv_block_hit VARCHAR2(1) := '';
  BEGIN
    LOOP
      IF X NOT IN ('G$_OPT_BLOCK') AND                                       
         NVL(GET_BLOCK_PROPERTY(X,DEFAULT_WHERE),'XOXO') <> 'key-block' THEN 
        G$_WALK_ITEMS_CHECK_QUERY(X,GET_BLOCK_PROPERTY(X,FIRST_ITEM),GET_BLOCK_PROPERTY(X,LAST_ITEM),lv_block_hit);
      END IF;
      IF lv_block_hit = 'Y' THEN
        SET_BLOCK_PROPERTY(X,DELETE_ALLOWED,PROPERTY_FALSE);
        SET_BLOCK_PROPERTY(X,UPDATE_ALLOWED,PROPERTY_FALSE);
        SET_BLOCK_PROPERTY(X,INSERT_ALLOWED,PROPERTY_FALSE);
      END IF;
--
      EXIT WHEN X = LSTBLCK;
--
      X := GET_BLOCK_PROPERTY(X,NEXTBLOCK);
    END LOOP;
  END;
--
--
  PROCEDURE G$_WALK_BLOCKS_CHECK_HIDE_V2(FRSTBLCK VARCHAR2,LSTBLCK VARCHAR2)IS
    X VARCHAR2(30) := FRSTBLCK;
  BEGIN
    LOOP
      IF X NOT IN ('G$_OPT_BLOCK') THEN
        G$_WALK_ITEMS_CHECK_HIDE_V2(X,GET_BLOCK_PROPERTY(X,FIRST_ITEM),GET_BLOCK_PROPERTY(X,LAST_ITEM));
      END IF;
--
      EXIT WHEN X = LSTBLCK;
--
      X := GET_BLOCK_PROPERTY(X,NEXTBLOCK);
    END LOOP;
  END;
BEGIN
  NULL;
END;
		*/
		/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pX
		*/
		public void gTabsecBuild(NString pX)
		{
			//  This routine is called from Forms that have had the Tab Security Methodology applied to them
			//  This routine will:
			//      (1) Revalidates security.  prevent passing a modified string thru the form's when-new-form-instance.
			//          When testing this "if" can be commented out; otherwise gsasecr modification of tab privs is needed.
			//      (2) value the TABSEC_TABLE
			//      (3) will walk the blocks.items of the form to set block or item properties appropriately for the TAB Canvas
			//  p_x is the return value from G%_SECURITY.G$_GET_TAB_SECURITY_FNC.
			//  IF p_x is NULL then there is no Tab Security in place for this form and user.
			//  Otherwise, p_x variable is not NULL and it is then parsed into the TABSEC_TABLE
			//  For example:
			//     p_x may contain information on 4 tabs for a form.  Tab name, separator (:), Tab access indicator and
			//     separator (:)
			//     WWWWW_TAB:Q:XXXXXXXXX_TAB:N:YYYYYYY_TAB:F:ZZZ_TAB:N:
			//     TABSEC_TABLE (1)   will hold   WWWWW_TAB:Q
			//     TABSEC_TABLE (2)   will hold   XXXXXXXXX_TAB:N
			//     TABSEC_TABLE (3)   will hold   YYYYYYY_TAB:F
			//     TABSEC_TABLE (4)   will hold   ZZZ_TAB:N
			// 
			//     Tab Access Values:
			//     F - Full Access to Tab 
			//     Q - Query Access to the Tab
			//     N - No Access to the Tab (Tab is Hidden)
			// 
			NNumber lvStartInstr = toNumber(1);
			NNumber lvEndInstr = toNumber(length(pX).subtract(2));
			NNumber lvPntrVal= NNumber.getNull();
			NString lvTempFormname = getCurrentTaskName();
			NString lvErrMsg= NString.getNull();
			if ( pX.isNull() )
			{
				return ;
			}
			// 
			//  --(1)
			if ( pX.notEquals(GSecurity.FgGetTabSecurityFnc(lvTempFormname, getUser())) )
			{
				lvErrMsg = GNls.Fget(toStr("GOQRPLS-0152"), toStr("LIB"), toStr("*ERROR* An override of Tab Security rules for user  %01% on %02% was attempted. %02% aborting."), getUser(), lvTempFormname);
				errorMessage(lvErrMsg);
				//  -- record a security violation of this attempt
				GSecurity.gCreateLogRecord(getUser(), lvTempFormname, lvErrMsg);
				throw new ApplicationException();
			}
			// 
			//  --(2) 
			while ( lvStartInstr.lesser(lvEndInstr) ) {
				lvPntrVal = toNumber(inStr(pX, toStr(":"), toInt(lvStartInstr), toInt(1)));
				//  --
				tabsecCnt = tabsecCnt.add(1);
				//TABSEC_TABLE(TABSEC_CNT) := substr(p_x,lv_start_instr,(lv_pntr_val - lv_start_instr) + 2);
				tabsecTable.set(tabsecCnt, substring(pX,lvStartInstr,(lvPntrVal.subtract(lvStartInstr)).add(2)));
								//  --
				lvStartInstr = lvPntrVal.add(3);
				
			}
			// 
			//  --(3)
			if ( inStr(pX, toStr(":Q:")).greater(0) )
			{
				gWalkBlocksCheckQuery(getFormFirstBlock(lvTempFormname), getFormLastBlock(lvTempFormname));
			}
			if ( inStr(pX, toStr(":N:")).greater(0) )
			{
				gWalkBlocksCheckHideV2(getFormFirstBlock(lvTempFormname), getFormLastBlock(lvTempFormname));
			}
		}
/* <p>
		*   
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gTabsecEcho()
		{
			infoMessage(GNls.Fget(toStr("GOQRPLS-0153"), toStr("LIB"), toStr("ECHO of Table TABSEC_TABLE")));
			for ( int j = 1; j <= tabsecCnt.toInt32(); j++ )
			{
				infoMessage(GNls.Fget(toStr("GOQRPLS-0154"), toStr("LIB"), toStr("TABSEC_TABLE item %01%=%02%"), toChar(j), tabsecTable.get(j)));
			}
//			message("");
		}
/* <p>
		*  --
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pTabName
		*/
		public NString gAuthLevelTab(NString pTabName)
		{
			NString lvAuthLevelTab = toStr("F");
			for ( int j = 1; j <= tabsecCnt.toInt32(); j++ )
			{
				if ( inStr(tabsecTable.get(j), pTabName).greater(0) )
				{
					lvAuthLevelTab = substring(tabsecTable.get(j), inStr(tabsecTable.get(j), toStr(":")).add(1), toInt(1));
					return ((lvAuthLevelTab));
				}
			}
			return ((lvAuthLevelTab));
		}
/* <p>
		*  --
		*  --
/* </p>
		* @param pTabPageId
		* @param pEnableDisableString
		* @param pBoolString
		* @param pTabName
		*/
		public void gSetTabPageProperty(TabPageDescriptor pTabPageId, NString pEnableDisableString, NString pBoolString, NString pTabName)
		{
			// 
			NString lvAuthLevelOfTab = gAuthLevelTab(pTabName);
			if ( pBoolString.equals("PROPERTY_TRUE") )
			{
				if ( pEnableDisableString.equals("ENABLED") )
				{
					if ( in(lvAuthLevelOfTab, "F", "Q").getValue() )
					{
						setTabPageEnabled(pTabPageId, true);
					}
					else {
						setTabPageVisible(pTabPageId, false);
					}
				}
				else {
					setTabPageEnabled(pTabPageId, false);
				}
			}
			else {
				if ( in(lvAuthLevelOfTab, "F", "Q").getValue() )
				{
					if ( pEnableDisableString.equals("ENABLED") )
					{
						setTabPageEnabled(pTabPageId, false);
					}
					else {
						setTabPageEnabled(pTabPageId, true);
					}
				}
				else {
					setTabPageVisible(pTabPageId, false);
				}
			}
		}
/* <p>
		*  --
		*  --
/* </p>
		* @param xblck
		* @param frstitm
		* @param lstitm
		*/
		public void gWalkItemsDisable(NString xblck, NString frstitm, NString lstitm)
		{
			NString xitem = xblck.append(".").append(frstitm);
			NString xlstitm = xblck.append(".").append(lstitm);
			while (true) {
				if ( !getItemCanvas(xitem).isNull() )
				{
					if ( getItemType(xitem).notEquals("DISPLAY ITEM") )
					{
						setItemEnabled(xitem, false);
					}
				}
				// 
				if ( xitem.equals(xlstitm) ) 
					break;
				// 
				xitem = xblck.append(".").append(getItemNextItem(xitem));
			}
		}
/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param xblck
		* @param frstitm
		* @param lstitm
		* @param blockHit
		*/
		public void gWalkItemsCheckQuery(NString xblck, NString frstitm, NString lstitm, Ref<NString> blockHit)
		{
			NString xitem = xblck.append(".").append(frstitm);
			NString xlstitm = xblck.append(".").append(lstitm);
			NString lvItemTabPage= NString.getNull();
			blockHit.val = toStr("N");
			while (true) {
				if ( !getItemCanvas(xitem).isNull() )
				{
					if ( getItemType(xitem).notEquals("DISPLAY ITEM") )
					{
						TabPageDescriptor itemPage = findItem(xitem).getPage();
						if (itemPage != null)
							lvItemTabPage = toStr(itemPage.getId());
						else
							lvItemTabPage = NString.getNull();
						
						if ( !lvItemTabPage.isNull() )
						{
							if ( gAuthLevelTab(lvItemTabPage).equals("Q") )
							{
								blockHit.val = toStr("Y");
									break;
							}
						}
					}
				}
				// 
				if ( xitem.equals(xlstitm) ) 
					break;
				// 
				xitem = getItemNextItem(xitem);
			}
		}
/* <p>
		* 
		* 
/* </p>
		* @param xblck
		* @param frstitm
		* @param lstitm
		*/
		public void gWalkItemsCheckHideV2(NString xblck, NString frstitm, NString lstitm)
		{
			NString xitem = xblck.append(".").append(frstitm);
			NString xlstitm = xblck.append(".").append(lstitm);
			NString lvItemTabPage= NString.getNull();
			while (true) {
				if ( !getItemCanvas(xitem).isNull() )
				{
					if ( getItemType(xitem).notEquals("DISPLAY ITEM") && getItemType(xitem).notEquals("DISPLAYITEM") )
					{
						TabPageDescriptor itemPage = findItem(xitem).getPage();
						if (itemPage != null)
							lvItemTabPage = toStr(itemPage.getId());
						else
							lvItemTabPage = NString.getNull();
						
						if ( !lvItemTabPage.isNull() )
						{
							if ( gAuthLevelTab(lvItemTabPage).equals("N") )
							{
								setItemEnabled(xitem, false);
							}
						}
					}
				}
				// 
				if ( xitem.equals(xlstitm) ) 
					break;
				// 
				xitem = getItemNextItem(xitem);
			}
		}
/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param frstblck
		* @param lstblck
		*/
		public void gWalkBlocksCheckQuery(NString frstblck, NString lstblck)
		{
			NString x = frstblck;
			NString lvBlockHit = toStr("");
			while (true) {
				if ( !in(x, "G$_OPT_BLOCK").getValue() && isNull(getBlockWhereClause(x), "XOXO").notEquals("key-block") )
				{
					Ref<NString> blockHit_ref = new Ref<NString>(lvBlockHit);
					gWalkItemsCheckQuery(x, getBlockFirstItem(x), getBlockLastItem(x), blockHit_ref);
					lvBlockHit = blockHit_ref.val;
				}
				if ( lvBlockHit.equals("Y") )
				{
					setBlockDeleteAllowed(x, false);
					setBlockUpdateAllowed(x, false);
					setBlockInsertAllowed(x, false);
				}
				// 
				if ( x.equals(lstblck) ) 
					break;
				// 
				x = getBlockNextDeclaredBlock(x);
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param frstblck
		* @param lstblck
		*/
		public void gWalkBlocksCheckHideV2(NString frstblck, NString lstblck)
		{
			NString x = frstblck;
			while (true) {
				if ( !in(x, "G$_OPT_BLOCK").getValue() )
				{
					gWalkItemsCheckHideV2(x, getBlockFirstItem(x), getBlockLastItem(x));
				}
				// 
				if ( x.equals(lstblck) ) 
					break;
				// 
				x = getBlockNextDeclaredBlock(x);
			}
		}
	
		public static class TabsecTabtype extends NStringTable{
		}
	
}
