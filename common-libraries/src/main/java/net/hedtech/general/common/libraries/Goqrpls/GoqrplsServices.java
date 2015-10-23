package net.hedtech.general.common.libraries.Goqrpls;


import morphis.core.utils.misc.RefObject;
import morphis.foundations.core.appsupportlib.runtime.AbstractLibrary;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.TaskServices;
import morphis.foundations.core.appsupportlib.runtime.configuration.LibraryConfiguration;
 


























import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.utils.DataUtils;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.web.message.InteractionManager;
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
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
import static morphis.foundations.core.util.globals.Globals.setGlobal;
import morphis.foundations.core.util.*;
import morphis.foundations.core.util.event.EventHelper;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.forms.BaseTask;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.Exceptions.TimedOut;
import net.hedtech.general.common.runtime.KeyBlockNavigationModel;
import net.hedtech.general.common.services.BannerServices;


public class GoqrplsServices extends AbstractLibrary{
		
	public GoqrplsServices (LibraryConfiguration configuration,
			ISupportCodeContainer container, Hashtable sharedLibraries) {
		super(configuration, container, sharedLibraries);
	}
			
		
	// Attached Libraries
    public net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices getEoqrpls()
    {
		return (net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices)getSupportCodeManager().getLibrary("EOQRPLS");
    }
    
    public net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices getGoqwflw()
    {
		return (net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices)getSupportCodeManager().getLibrary("GOQWFLW");
    }
    
	/* package accessor */
	public GXeStateManager getGXeStateManager() 
	{
		return (GXeStateManager)getSupportCodeManager().getPackage("G$_XE_STATE_MANAGER");
	}
	/* package accessor */
	public GXe getGXe() 
	{
		return (GXe)getSupportCodeManager().getPackage("G$_XE");
	}
	/* package accessor */
	public GWriteBlock getGWriteBlock() 
	{
		return (GWriteBlock)getSupportCodeManager().getPackage("G$_WRITE_BLOCK");
	}
	/* package accessor */
	public GWalkForm getGWalkForm() 
	{
		return (GWalkForm)getSupportCodeManager().getPackage("G$_WALK_FORM");
	}
	/* package accessor */
	public GVpdiTrigger getGVpdiTrigger() 
	{
		return (GVpdiTrigger)getSupportCodeManager().getPackage("G$_VPDI_TRIGGER");
	}
	/* package accessor */
	public GVpdi getGVpdi() 
	{
		return (GVpdi)getSupportCodeManager().getPackage("G$_VPDI");
	}
	/* package accessor */
	public GTracePkg getGTracePkg() 
	{
		return (GTracePkg)getSupportCodeManager().getPackage("G$_TRACE_PKG");
	}
	/* package accessor */
	public GToolbar getGToolbar() 
	{
		return (GToolbar)getSupportCodeManager().getPackage("G$_TOOLBAR");
	}
	/* package accessor */
	public GTabSecurity getGTabSecurity() 
	{
		return (GTabSecurity)getSupportCodeManager().getPackage("G$_TAB_SECURITY");
	}
	/* package accessor */
	public GSearchWhere getGSearchWhere() 
	{
		return (GSearchWhere)getSupportCodeManager().getPackage("G$_SEARCH_WHERE");
	}
	/* package accessor */
	public GSearch getGSearch() 
	{
		return (GSearch)getSupportCodeManager().getPackage("G$_SEARCH");
	}
	/* package accessor */
	public GSd getGSd() 
	{
		return (GSd)getSupportCodeManager().getPackage("G$_SD");
	}
	/* package accessor */
	public GReadMetadata getGReadMetadata() 
	{
		return (GReadMetadata)getSupportCodeManager().getPackage("G$_READ_METADATA");
	}
	/* package accessor */
	public GPopUpMenu getGPopUpMenu() 
	{
		return (GPopUpMenu)getSupportCodeManager().getPackage("G$_POP_UP_MENU");
	}
	/* package accessor */
	public GNavigationFrame getGNavigationFrame() 
	{
		return (GNavigationFrame)getSupportCodeManager().getPackage("G$_NAVIGATION_FRAME");
	}
	/* package accessor */
	public GMenuBar getGMenuBar() 
	{
		return (GMenuBar)getSupportCodeManager().getPackage("G$_MENU_BAR");
	}
	/* package accessor */
	public GMasks getGMasks() 
	{
		return (GMasks)getSupportCodeManager().getPackage("G$_MASKS");
	}
	/* package accessor */
	public GLastTen getGLastTen() 
	{
		return (GLastTen)getSupportCodeManager().getPackage("G$_LAST_TEN");
	}
	/* package accessor */
	public GImgDriver getGImgDriver() 
	{
		return (GImgDriver)getSupportCodeManager().getPackage("G$_IMG_DRIVER");
	}
	/* package accessor */
	public GIdnameSearch getGIdnameSearch() 
	{
		return (GIdnameSearch)getSupportCodeManager().getPackage("G$_IDNAME_SEARCH");
	}
	/* package accessor */
	public GHandshakeAq getGHandshakeAq() 
	{
		return (GHandshakeAq)getSupportCodeManager().getPackage("G$_HANDSHAKE_AQ");
	}
	/* package accessor */
	public GGoqolibUserTrigger getGGoqolibUserTrigger() 
	{
		return (GGoqolibUserTrigger)getSupportCodeManager().getPackage("G$_GOQOLIB_USER_TRIGGER");
	}
	/* package accessor */
	public GGoqolibPpTrigger getGGoqolibPpTrigger() 
	{
		return (GGoqolibPpTrigger)getSupportCodeManager().getPackage("G$_GOQOLIB_PP_TRIGGER");
	}
	/* package accessor */
	public GGoqolibOptBlock getGGoqolibOptBlock() 
	{
		return (GGoqolibOptBlock)getSupportCodeManager().getPackage("G$_GOQOLIB_OPT_BLOCK");
	}
	/* package accessor */
	public GGoqolibKeyTrigger getGGoqolibKeyTrigger() 
	{
		return (GGoqolibKeyTrigger)getSupportCodeManager().getPackage("G$_GOQOLIB_KEY_TRIGGER");
	}
	/* package accessor */
	public GGoqolibFuncInfoBlock getGGoqolibFuncInfoBlock() 
	{
		return (GGoqolibFuncInfoBlock)getSupportCodeManager().getPackage("G$_GOQOLIB_FUNC_INFO_BLOCK");
	}
	/* package accessor */
	public GFrm getGFrm() 
	{
		return (GFrm)getSupportCodeManager().getPackage("G$_FRM");
	}
	/* package accessor */
	public GFormsNls getGFormsNls() 
	{
		return (GFormsNls)getSupportCodeManager().getPackage("G$_FORMS_NLS");
	}
	/* package accessor */
	public GF5Navigation getGF5Navigation() 
	{
		return (GF5Navigation)getSupportCodeManager().getPackage("G$_F5_NAVIGATION");
	}
	/* package accessor */
	public GErrors getGErrors() 
	{
		return (GErrors)getSupportCodeManager().getPackage("G$_ERRORS");
	}
	/* package accessor */
	public GB2kWinHelp getGB2kWinHelp() 
	{
		return (GB2kWinHelp)getSupportCodeManager().getPackage("G$_B2K_WIN_HELP");
	}
	
	public enum PopUpMessageType{
		MESSAGE,INFO,WARNING,ERROR;
	}
	//Original PL/SQL code for Prog Unit GOQRPLS.G$_WIN_DEACTIVATED
	/*
	PROCEDURE G$_WIN_DEACTIVATED IS
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gWinDeactivated()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_WIN_CLOSED
	/*
	PROCEDURE G$_WIN_CLOSED IS
  lv_event_win VARCHAR2(30) := NAME_IN('SYSTEM.EVENT_WINDOW');
BEGIN 
  IF lv_event_win <> 'G$_OPT_WINDOW' THEN
--
    IF lv_event_win IN ('MAIN_WINDOW','FUNC_BASE_WINDOW') THEN
      DO_KEY('EXIT_FORM');
    ELSIF lv_event_win = 'G$_EXTENDED_SEARCH_WINDOW' THEN
      G$_IDNAME_SEARCH.COPY_SELECTED_ID;
    ELSIF lv_event_win = 'G$_VPDI_WINDOW' THEN
      G$_VPDI.CANCEL_VPDI_SELECTION;
    ELSE
      SET_WINDOW_PROPERTY(NAME_IN('SYSTEM.EVENT_WINDOW'),VISIBLE,PROPERTY_OFF);
    END IF;
--
  END IF;
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gWinClosed()
		{
			NString lvEventWin = getCurrentWindow();
//			if ( lvEventWin.notEquals("G$_OPT_WINDOW") )
//			{
				// 
				if ( in(lvEventWin, "MAIN_WINDOW", "FUNC_BASE_WINDOW").getValue() )
				{
					executeAction("EXIT");
				}
				else if ( lvEventWin.equals("G$_EXTENDED_SEARCH_WINDOW") ) {
					getGIdnameSearch().copySelectedId();
				}
				else if ( lvEventWin.equals("G$_VPDI_WINDOW") ) {
					getGVpdi().cancelVpdiSelection();
				}
				else if (lvEventWin.equals("G$_OPT_WINDOW") )
				{
					getGGoqolibOptBlock().hyperlinkCancel();
				}
				else if (lvEventWin.equals("G$_SDSP_WINDOW") )
				{
					getGSd().pCloseSdeForm(NBool.False);
				}
				else {
					hideWindow(getCurrentWindow());
				}
//			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_WIN_ACTIVATED
	/*
	PROCEDURE G$_WIN_ACTIVATED IS
  lv_event_win VARCHAR2(30) := NAME_IN('SYSTEM.EVENT_WINDOW');
BEGIN
  IF lv_event_win IS NULL OR
     lv_event_win NOT IN ('G$_OPT_WINDOW','G$_NAV_CANVAS','G$_EXTENDED_SEARCH_WINDOW') THEN
    G$_SET_INST_PROPERTY;
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gWinActivated()
		{
			NString lvEventWin = getCurrentWindow();
			if ( lvEventWin.isNull() || !in(lvEventWin, "G$_OPT_WINDOW", "G$_NAV_CANVAS", "G$_EXTENDED_SEARCH_WINDOW").getValue() )
			{
				gSetInstProperty();
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_WEB_SHOW_DOCUMENT_OUTD
	/*
	PROCEDURE G$_WEB_SHOW_DOCUMENT_OUTD (ONE_UP_NO_IN IN NUMBER,
                                     FILE_NAME_IN IN VARCHAR2,
                                     FILE_NO_IN   IN NUMBER)IS
  TEMP_PIPENAME  VARCHAR2(255);
  TEMP_WEBDIR    VARCHAR2(255);
  TEMP_URL       VARCHAR2(255);
  UPRF_VALUE     VARCHAR2(255);
  TEMP_PROCNAME  VARCHAR2(255);
--
BEGIN
--
  UPRF_VALUE := G$_GET_UPRF_VALUE('DATA_EXTRACT', 'WIN32COMMON', 'MIME_TYPE');
-- 
  IF UPPER(uprf_value) = 'FILE' THEN
    Temp_procname := 'gokoutd.csv';
  ELSE
    Temp_procname := 'gokoutd.P_Showreq';
  END IF;
--
  gokoutd.P_SendReq(ONE_UP_NO_IN, FILE_NAME_IN, FILE_NO_IN, TEMP_PIPENAME);
--
  TEMP_WEBDIR := G$_GET_UPRF_WEBOUTPUT;
  TEMP_URL    := TEMP_WEBDIR || TEMP_PROCNAME
                             || '?pipe_name=' || TEMP_PIPENAME
                             || '&sess_id='   || NAME_IN('GLOBAL.SESSION_ID')
                             || '&user_name=' || NAME_IN('GLOBAL.CURRENT_USER');
--
  WEB.SHOW_DOCUMENT(TEMP_URL, '_blank');
EXCEPTION
  WHEN OTHERS THEN
    IF INSTR(SQLERRM,'ORA',1,3) > 0 THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0183', 'LIB', '*ERROR* %01%',SUBSTR(SQLERRM,12,INSTR(SQLERRM,'ORA',1,3) - 12)));
    ELSIF INSTR(SQLERRM,'ORA',1,2) > 0 THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0184', 'LIB', '*ERROR* %01%',SUBSTR(SQLERRM,12,INSTR(SQLERRM,'ORA',1,2) - 12)));
    ELSE
      MESSAGE(G$_NLS.Get('GOQRPLS-0185', 'LIB', '*ERROR* %01%',SUBSTR(SQLERRM,12,255)));
    END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param oneUpNoIn
		* @param fileNameIn
		* @param fileNoIn
		*/
		public void gWebShowDocumentOutd(NNumber oneUpNoIn, NString fileNameIn, NNumber fileNoIn)
		{
			NString tempPipename= NString.getNull();
			NString tempWebdir= NString.getNull();
			NString tempUrl= NString.getNull();
			NString uprfValue= NString.getNull();
			NString tempProcname= NString.getNull();
			try
			{
				// 
				uprfValue = gGetUprfValue(toStr("DATA_EXTRACT"), toStr("WIN32COMMON"), toStr("MIME_TYPE"));
				//  
				if ( upper(uprfValue).equals("FILE") )
				{
					tempProcname = toStr("gokoutd.csv");
				}
				else {
					tempProcname = toStr("gokoutd.P_Showreq");
				}
				// 
				Ref<NString> pipe_name_ref = new Ref<NString>(tempPipename);
				Gokoutd.pSendreq(oneUpNoIn, fileNameIn, fileNoIn, pipe_name_ref);
				tempPipename = pipe_name_ref.val;
				// 
				tempWebdir = gGetUprfWeboutput();
				tempUrl = tempWebdir.append(tempProcname).append("?pipe_name=").append(tempPipename).append("&sess_id=").append(getNameIn("GLOBAL.SESSION_ID")).append("&user_name=").append(getNameIn("GLOBAL.CURRENT_USER"));
				// 
				showDocument(tempUrl, "_blank");
			}
			catch(Exception  e)
			{
				if ( inStr(errorMessage(), toStr("ORA"), toInt(1), toInt(3)).greater(0) )
				{
					errorMessage(GNls.Fget(toStr("GOQRPLS-0183"), toStr("LIB"), toStr("*ERROR* %01%"), substring(errorMessage(), toInt(12), inStr(errorMessage(), toStr("ORA"), toInt(1), toInt(3)).subtract(12))));
				}
				else if ( inStr(errorMessage(), toStr("ORA"), toInt(1), toInt(2)).greater(0) ) {
					errorMessage(GNls.Fget(toStr("GOQRPLS-0184"), toStr("LIB"), toStr("*ERROR* %01%"), substring(errorMessage(), toInt(12), inStr(errorMessage(), toStr("ORA"), toInt(1), toInt(2)).subtract(12))));
				}
				else {
					errorMessage(GNls.Fget(toStr("GOQRPLS-0185"), toStr("LIB"), toStr("*ERROR* %01%"), substring(errorMessage(), toInt(12), toInt(255))));
				}
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_WEB_SHOW_DOCUMENT
	/*
	PROCEDURE G$_WEB_SHOW_DOCUMENT (ONE_UP_NO_IN IN NUMBER,
                                FILE_NAME_IN IN VARCHAR2,
                                FILE_NO_IN   IN NUMBER)IS
  TEMP_PIPENAME  VARCHAR2(255);
  TEMP_WEBDIR    VARCHAR2(255);
  TEMP_URL       VARCHAR2(255);
  UPRF_VALUE     VARCHAR2(255);
  TEMP_PROCNAME  VARCHAR2(255);
--
BEGIN
	-- 55-1
  UPRF_VALUE := G$_GET_UPRF_VALUE('DATA_EXTRACT', 'WIN32COMMON', 'MIME_TYPE');
-- 
  IF UPPER(uprf_value) = 'FILE' THEN
    Temp_procname := 'gokoutp.csv';
  ELSE
    Temp_procname := 'gokoutp.P_Showreq';
  END IF;
--
  gokoutp.P_SendReq(ONE_UP_NO_IN, FILE_NAME_IN, FILE_NO_IN, TEMP_PIPENAME);
--
  TEMP_WEBDIR := G$_GET_UPRF_WEBOUTPUT;
  TEMP_URL    := TEMP_WEBDIR || TEMP_PROCNAME
                             || '?pipe_name=' || TEMP_PIPENAME
                             || '&sess_id='   || NAME_IN('GLOBAL.SESSION_ID')
                             || '&user_name=' || NAME_IN('GLOBAL.CURRENT_USER');
--
  WEB.SHOW_DOCUMENT(TEMP_URL, '_blank');
EXCEPTION
  WHEN OTHERS THEN
    IF INSTR(SQLERRM,'ORA',1,3) > 0 THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0180', 'LIB',
	              '*ERROR* %01%',SUBSTR(SQLERRM,12,INSTR(SQLERRM,'ORA',1,3) - 12)));
    ELSIF INSTR(SQLERRM,'ORA',1,2) > 0 THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0181', 'LIB',
	              '*ERROR* %01%',SUBSTR(SQLERRM,12,INSTR(SQLERRM,'ORA',1,2) - 12)));
    ELSE
      MESSAGE(G$_NLS.Get('GOQRPLS-0182', 'LIB',
	              '*ERROR* %01%',SUBSTR(SQLERRM,12,255)));
    END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param oneUpNoIn
		* @param fileNameIn
		* @param fileNoIn
		*/
		public void gWebShowDocument(NNumber oneUpNoIn, NString fileNameIn, NNumber fileNoIn)
		{
			NString tempPipename= NString.getNull();
			NString tempWebdir= NString.getNull();
			NString tempUrl= NString.getNull();
			NString uprfValue= NString.getNull();
			NString tempProcname= NString.getNull();
			try
			{
				//  55-1
				uprfValue = gGetUprfValue(toStr("DATA_EXTRACT"), toStr("WIN32COMMON"), toStr("MIME_TYPE"));
				//  
				if ( upper(uprfValue).equals("FILE") )
				{
					tempProcname = toStr("gokoutp.csv");
				}
				else {
					tempProcname = toStr("gokoutp.P_Showreq");
				}
				// 
				Ref<NString> pipe_name_ref = new Ref<NString>(tempPipename);
				Gokoutp.pSendreq(oneUpNoIn, fileNameIn, fileNoIn, pipe_name_ref);
				tempPipename = pipe_name_ref.val;
				// 
				tempWebdir = gGetUprfWeboutput();
				tempUrl = tempWebdir.append(tempProcname).append("?pipe_name=").append(tempPipename).append("&sess_id=").append(getNameIn("GLOBAL.SESSION_ID")).append("&user_name=").append(getNameIn("GLOBAL.CURRENT_USER"));
				// 
				showDocument(tempUrl, "_blank");
			}
			catch(Exception  e)
			{
				if ( inStr(errorMessage(), toStr("ORA"), toInt(1), toInt(3)).greater(0) )
				{
					errorMessage(GNls.Fget(toStr("GOQRPLS-0180"), toStr("LIB"), toStr("*ERROR* %01%"), substring(errorMessage(), toInt(12), inStr(errorMessage(), toStr("ORA"), toInt(1), toInt(3)).subtract(12))));
				}
				else if ( inStr(errorMessage(), toStr("ORA"), toInt(1), toInt(2)).greater(0) ) {
					errorMessage(GNls.Fget(toStr("GOQRPLS-0181"), toStr("LIB"), toStr("*ERROR* %01%"), substring(errorMessage(), toInt(12), inStr(errorMessage(), toStr("ORA"), toInt(1), toInt(2)).subtract(12))));
				}
				else {
					errorMessage(GNls.Fget(toStr("GOQRPLS-0182"), toStr("LIB"), toStr("*ERROR* %01%"), substring(errorMessage(), toInt(12), toInt(255))));
				}
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_VERIFY_SSN_EXISTS
	/*
	FUNCTION G$_VERIFY_SSN_EXISTS(p_ID VARCHAR2) RETURN BOOLEAN IS
--
  lv_dummy VARCHAR2(1);
--
  CURSOR c_verify_ssn (lv_id VARCHAR2) IS
     SELECT 'X'
       FROM SPBPERS
      WHERE SPBPERS_SSN = lv_id;
---
BEGIN
  gokfgac.p_turn_fgac_off;
--
  OPEN c_verify_ssn(p_ID);
  FETCH c_verify_ssn INTO lv_dummy;
  CLOSE c_verify_ssn;
--
  gokfgac.p_turn_fgac_on;
--
  RETURN(NVL(lv_dummy,'N') = 'X');
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pId
		*/
		public NBool gVerifySsnExists(NString pId)
		{
			int rowCount = 0;
			// 
			NString lvDummy= NString.getNull();
			String sqlcVerifySsn = "SELECT 'X' " +
	" FROM SPBPERS " +
	" WHERE SPBPERS_SSN = :P_LV_ID ";
			DataCursor cVerifySsn = new DataCursor(sqlcVerifySsn);
			NString lvId = NString.getNull();
			try {
				Gokfgac.pTurnFgacOff();
				// 
				lvId=pId;
				//Setting query parameters
				cVerifySsn.addParameter("P_LV_ID", lvId);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable cVerifySsn.
				cVerifySsn.open();
				ResultSet cVerifySsnResults = cVerifySsn.fetchInto();
				if ( cVerifySsnResults != null ) {
					lvDummy = cVerifySsnResults.getStr(0);
				}
				cVerifySsn.close();
				// 
				Gokfgac.pTurnFgacOn();
				// 
				return (toBool(isNull(lvDummy, "N").equals("X")));
				}finally{
					cVerifySsn.close();
				}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_VERIFY_ID_EXISTS
	/*
	FUNCTION G$_VERIFY_ID_EXISTS(p_ID VARCHAR2) RETURN BOOLEAN IS
--
  lv_dummy VARCHAR2(1);
--
  CURSOR c_verify_id (lv_id VARCHAR2) IS
    SELECT 'X'
      FROM SPRIDEN
     WHERE SPRIDEN_ID = lv_id;
--
BEGIN
  gokfgac.p_turn_fgac_off;
--
  OPEN c_verify_id(p_ID);
  FETCH c_verify_id INTO lv_dummy;
  CLOSE c_verify_id;
--
  gokfgac.p_turn_fgac_on;
--
  RETURN(NVL(lv_dummy,'N') = 'X');
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pId
		*/
		public NBool gVerifyIdExists(NString pId)
		{
			int rowCount = 0;
			// 
			NString lvDummy= NString.getNull();
			String sqlcVerifyId = "SELECT 'X' " +
	" FROM SPRIDEN " +
	" WHERE SPRIDEN_ID = :P_LV_ID ";
			DataCursor cVerifyId = new DataCursor(sqlcVerifyId);
			NString lvId = NString.getNull();
			try {
				Gokfgac.pTurnFgacOff();
				// 
				lvId=pId;
				//Setting query parameters
				cVerifyId.addParameter("P_LV_ID", lvId);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable cVerifyId.
				cVerifyId.open();
				ResultSet cVerifyIdResults = cVerifyId.fetchInto();
				if ( cVerifyIdResults != null ) {
					lvDummy = cVerifyIdResults.getStr(0);
				}
				cVerifyId.close();
				// 
				Gokfgac.pTurnFgacOn();
				// 
				return (toBool(isNull(lvDummy, "N").equals("X")));
				}finally{
					cVerifyId.close();
				}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_VERIFY_ID_AS_SSN
	/*
	FUNCTION G$_VERIFY_ID_AS_SSN(p_ID VARCHAR2) RETURN BOOLEAN IS
--
  lv_dummy VARCHAR2(1);
--
  CURSOR c_verify_id (lv_id VARCHAR2) IS
     SELECT 'X'
       FROM SPBPERS
      WHERE SPBPERS_SSN = lv_id;
--
BEGIN
--
  OPEN c_verify_id(p_ID);
  FETCH c_verify_id INTO lv_dummy;
  CLOSE c_verify_id;
--
  RETURN(NVL(lv_dummy,'N') = 'X');
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pId
		*/
		public NBool gVerifyIdAsSsn(NString pId)
		{
			int rowCount = 0;
			// 
			NString lvDummy= NString.getNull();
			String sqlcVerifyId = "SELECT 'X' " +
	" FROM SPBPERS " +
	" WHERE SPBPERS_SSN = :P_LV_ID ";
			DataCursor cVerifyId = new DataCursor(sqlcVerifyId);
			NString lvId = NString.getNull();
			try {
				// 
				lvId=pId;
				//Setting query parameters
				cVerifyId.addParameter("P_LV_ID", lvId);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable cVerifyId.
				cVerifyId.open();
				ResultSet cVerifyIdResults = cVerifyId.fetchInto();
				if ( cVerifyIdResults != null ) {
					lvDummy = cVerifyIdResults.getStr(0);
				}
				cVerifyId.close();
				// 
				return (toBool(isNull(lvDummy, "N").equals("X")));
				}finally{
					cVerifyId.close();
				}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_VALID_ID
	/*
	PROCEDURE G$_VALID_ID(p_ID            IN OUT VARCHAR2,
                      p_p_IDM         IN OUT NUMBER,
                      p_FULL_NAME     IN OUT VARCHAR2,
                      p_CONFID_IND    IN OUT VARCHAR2,
                      p_DCSD_IND      IN OUT VARCHAR2,
                      p_CHECK_VALUE   IN     VARCHAR2 DEFAULT 'YYYYN') IS
BEGIN
  G$_VALID_ALL_ID(p_ID, p_p_IDM, p_FULL_NAME, p_CONFID_IND, p_DCSD_IND, 
                  p_CHECK_VALUE, 'P');
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pId
		* @param pPIdm
		* @param pFullName
		* @param pConfidInd
		* @param pDcsdInd
		*/
		public void gValidId(Ref<NString> pId, Ref<NNumber> pPIdm, Ref<NString> pFullName, Ref<NString> pConfidInd, Ref<NString> pDcsdInd) {
			gValidId(pId, pPIdm, pFullName, pConfidInd, pDcsdInd, toStr("YYYYN"));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pId
		* @param pPIdm
		* @param pFullName
		* @param pConfidInd
		* @param pDcsdInd
		* @param pCheckValue
		*/
		public void gValidId(Ref<NString> pId, Ref<NNumber> pPIdm, Ref<NString> pFullName, Ref<NString> pConfidInd, Ref<NString> pDcsdInd, NString pCheckValue)
		{
			gValidAllId(pId, pPIdm, pFullName, pConfidInd, pDcsdInd, pCheckValue, toStr("P"));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_VALID_ALL_ID
	/*
	PROCEDURE G$_VALID_ALL_ID(p_ID            IN OUT VARCHAR2,
                          p_PIDM          IN OUT NUMBER,
                          p_FULL_NAME     IN OUT VARCHAR2,
                          p_CONFID_IND    IN OUT VARCHAR2,
                          p_DCSD_IND      IN OUT VARCHAR2,
                          p_CHECK_VALUE   IN     VARCHAR2 DEFAULT 'YYYYN',
                          p_ID_TYPE       IN     VARCHAR2 DEFAULT 'ANY',
                          p_NAME_LEN      IN     INTEGER  DEFAULT  230) IS
--
-- Constant
--
  ANY_ID                             VARCHAR2(3) := 'ANY';
--
-- Local variables
--
  lv_entity_ind                      VARCHAR2(1)  := NULL;
  lv_check_confid_ind                VARCHAR2(1)  := NULL;
  lv_check_dcsd_ind                  VARCHAR2(1)  := NULL;
  lv_check_value                     VARCHAR2(30) := UPPER(p_CHECK_VALUE);
  lv_cm_status                       VARCHAR2(4)  := '';
  lv_id_type                         VARCHAR2(30) := UPPER(p_ID_TYPE);                                              
  lv_raise_confid_dcsd_alert_msg     VARCHAR2(1)  := NULL;
  lv_raise_id_form_failure           VARCHAR2(1)  := NULL;
  lv_get_id_name_ind                 VARCHAR2(1)  := NULL;
  lv_id_found                        BOOLEAN      := FALSE;
  lv_ssn_count                       NUMBER(10)   := NULL;
--
  lv_alert_button                    NUMBER := NULL;
  lv_surname_prefix                  SPRIDEN.SPRIDEN_SURNAME_PREFIX%TYPE := NULL;
  lv_last_name                       SPRIDEN.SPRIDEN_LAST_NAME%TYPE := NULL;
  lv_first_name                      SPRIDEN.SPRIDEN_FIRST_NAME%TYPE := NULL;
  lv_mi_name                         SPRIDEN.SPRIDEN_MI%TYPE := NULL;
  lv_name_prefix                     SPBPERS.SPBPERS_NAME_PREFIX%TYPE := NULL;
  lv_name_suffix                     SPBPERS.SPBPERS_NAME_SUFFIX%TYPE := NULL;
--
-- Get the current ID associated with the given pidm.
--
  CURSOR GET_ID IS
    SELECT SPRIDEN_ID
      FROM SPRIDEN
     WHERE SPRIDEN_PIDM = p_PIDM
       AND SPRIDEN_CHANGE_IND IS NULL;
--
-- Get the current ID and name based on the given pidm.
--
  CURSOR GET_ID_NAME IS
    SELECT SPRIDEN_ID, SPRIDEN_SURNAME_PREFIX,
           SPRIDEN_LAST_NAME, SPRIDEN_FIRST_NAME, SPRIDEN_MI
      FROM SPRIDEN
     WHERE SPRIDEN_PIDM = p_PIDM
       AND SPRIDEN_CHANGE_IND IS NULL; 
--
-- Get ID info based on the given ID.
--
  CURSOR ID_CURSOR IS
     SELECT SPRIDEN_PIDM, SPRIDEN_SURNAME_PREFIX,
            SPRIDEN_LAST_NAME, SPRIDEN_FIRST_NAME, SPRIDEN_MI, 
            SPRIDEN_ENTITY_IND,
            SPBPERS_NAME_PREFIX, SPBPERS_NAME_SUFFIX,
            DECODE(NVL(SPBPERS_CONFID_IND,'N'),'Y',G$_NLS.Get('GOQRPLS-0159', 'LIB','Confidential'),''),
            DECODE(NVL(SPBPERS_DEAD_IND,'N'),'Y',G$_NLS.Get('GOQRPLS-0160', 'LIB','Deceased'),'')
       FROM SPRIDEN, 
            SPBPERS
      WHERE SPRIDEN_ID = p_ID
        AND SPRIDEN_CHANGE_IND IS NULL
        AND SPRIDEN_PIDM = SPBPERS_PIDM(+);
--
-- The given ID has changed, get the current ID.
--
  CURSOR PREV_ID_CURSOR IS
    SELECT SPRIDEN_PIDM,
           SPRIDEN_ID, SPRIDEN_SURNAME_PREFIX,
           SPRIDEN_LAST_NAME, SPRIDEN_FIRST_NAME, SPRIDEN_MI, 
           SPRIDEN_ENTITY_IND,
           SPBPERS_NAME_PREFIX, SPBPERS_NAME_SUFFIX,
           DECODE(NVL(SPBPERS_CONFID_IND,'N'),'Y',G$_NLS.Get('GOQRPLS-0161', 'LIB','Confidential'),''),
           DECODE(NVL(SPBPERS_DEAD_IND,'N'),'Y',G$_NLS.Get('GOQRPLS-0162', 'LIB','Deceased'),'')
      FROM SPRIDEN, 
           SPBPERS
     WHERE SPRIDEN_PIDM IN 
              (SELECT Y.SPRIDEN_PIDM
                 FROM SPRIDEN Y
                WHERE Y.SPRIDEN_ID = p_ID
                  AND Y.SPRIDEN_CHANGE_IND = 'I')
       AND SPRIDEN_CHANGE_IND IS NULL
       AND SPRIDEN_PIDM = SPBPERS_PIDM(+);
--
-- Previous ID is removed, get the current ID by pidm
--
  CURSOR CURRENT_ID_CURSOR IS
    SELECT SPRIDEN_ID, SPRIDEN_SURNAME_PREFIX,
           SPRIDEN_LAST_NAME, SPRIDEN_FIRST_NAME, SPRIDEN_MI, 
           SPRIDEN_ENTITY_IND,
           SPBPERS_NAME_PREFIX, SPBPERS_NAME_SUFFIX,
           DECODE(NVL(SPBPERS_CONFID_IND,'N'),'Y',G$_NLS.Get('GOQRPLS-0163', 'LIB','Confidential'),''),
           DECODE(NVL(SPBPERS_DEAD_IND,'N'),'Y',G$_NLS.Get('GOQRPLS-0164', 'LIB','Deceased'),'')
      FROM SPRIDEN, 
           SPBPERS
     WHERE SPRIDEN_PIDM = p_PIDM
       AND SPRIDEN_CHANGE_IND IS NULL
       AND SPRIDEN_PIDM = SPBPERS_PIDM(+);
--
-- Get ID info based on an assumed SSN value in the ID field.
--
  CURSOR SSN_ID_CURSOR IS
     SELECT SPRIDEN_PIDM,
            SPRIDEN_ID,
            SPRIDEN_SURNAME_PREFIX,
            SPRIDEN_LAST_NAME,
            SPRIDEN_FIRST_NAME,
            SPRIDEN_MI, 
            SPRIDEN_ENTITY_IND,
            SPBPERS_NAME_PREFIX,
            SPBPERS_NAME_SUFFIX,
            DECODE(NVL(SPBPERS_CONFID_IND,'N'),'Y',G$_NLS.Get('GOQRPLS-0165', 'LIB','Confidential'),''),
            DECODE(NVL(SPBPERS_DEAD_IND,'N'),'Y',G$_NLS.Get('GOQRPLS-0166', 'LIB','Deceased'),'')
       FROM SPRIDEN, 
            SPBPERS
      WHERE SPBPERS_SSN = p_ID
        AND SPRIDEN_CHANGE_IND IS NULL
        AND SPRIDEN_PIDM = SPBPERS_PIDM;
--
  CURSOR SSN_COUNT_CURSOR IS        
     SELECT count(*)
       FROM SPRIDEN, 
            SPBPERS
      WHERE SPBPERS_SSN = p_ID
        AND SPRIDEN_CHANGE_IND IS NULL
        AND SPRIDEN_PIDM = SPBPERS_PIDM;
--
--
-- Internal Procedures
--
  PROCEDURE CLEAR_NAME_VARS IS
  BEGIN
  	lv_surname_prefix := NULL;
    lv_last_name   := NULL;
    lv_first_name  := NULL;
    lv_mi_name     := NULL;
    lv_entity_ind  := NULL;
    lv_name_prefix := NULL;
    lv_name_suffix := NULL;
    p_CONFID_IND   := NULL;
    p_DCSD_IND     := NULL;	
    p_PIDM         := NULL;
  END CLEAR_NAME_VARS;	      
--
--
  PROCEDURE DO_SEL_ID IS
  BEGIN
--
-- Get ID info based on the given ID.
--
    OPEN ID_CURSOR;
    FETCH ID_CURSOR INTO p_PIDM, lv_surname_prefix, lv_last_name, lv_first_name, lv_mi_name,
                         lv_entity_ind, lv_name_prefix, lv_name_suffix, 
                         p_CONFID_IND, p_DCSD_IND;
    lv_id_found := ID_CURSOR%FOUND;                             
    CLOSE ID_CURSOR;
--
-- The given ID has changed, get the current ID.
--
    IF NOT lv_id_found THEN
      OPEN PREV_ID_CURSOR;
      FETCH PREV_ID_CURSOR INTO p_PIDM, p_ID, lv_surname_prefix, lv_last_name, lv_first_name, 
                                lv_mi_name, lv_entity_ind, lv_name_prefix, 
                                lv_name_suffix, p_CONFID_IND, p_DCSD_IND;
      lv_id_found := PREV_ID_CURSOR%FOUND;                             
      CLOSE PREV_ID_CURSOR;
--
      IF lv_id_found THEN 
        MESSAGE(G$_NLS.Get('GOQRPLS-0167','LIB','*WARNING* Previous ID replaced with current ID.'));
--
-- Previous ID is not found, Get the current ID and name by the p_IDm
--
      ELSIF NOT lv_id_found AND lv_get_id_name_ind = 'Y' THEN
        OPEN CURRENT_ID_CURSOR;
        FETCH CURRENT_ID_CURSOR INTO p_ID, lv_surname_prefix, lv_last_name, lv_first_name, 
                                     lv_mi_name, lv_entity_ind, lv_name_prefix,
                                     lv_name_suffix, p_CONFID_IND, p_DCSD_IND;
        lv_id_found := CURRENT_ID_CURSOR%FOUND;                              
        CLOSE CURRENT_ID_CURSOR;
--
        IF lv_id_found THEN 
          MESSAGE(G$_NLS.Get('GOQRPLS-0168','LIB','*WARNING* Previous ID removed, replaced by current ID.'));
        END IF;
      END IF;  
--
-- -- -- --
-- -- -- --
      IF NOT lv_id_found THEN
      	IF NAME_IN('GLOBAL.SSN_SEARCH_ENABLED_IND') = 'Y' THEN
          IF G$_CHK_AUTH.G$_CHECK_AUTHORIZATION_FNC('SSN_SEARCH',USER) = 'YES' THEN
-- -- --
-- -- -- check if more than 1 ID has this as SSN    		
            OPEN SSN_COUNT_CURSOR;
    		    FETCH SSN_COUNT_CURSOR INTO lv_ssn_count;
    		    CLOSE SSN_COUNT_CURSOR;
    		    IF lv_ssn_count = 1 THEN
    			    NULL;
    		    ELSIF lv_ssn_count = 0 THEN
    		      RETURN;
    		    ELSE
              COPY('Y','GLOBAL.MORE_THAN_ONE_SSN');
    			    RETURN;
    		    END IF;
            OPEN SSN_ID_CURSOR;
            FETCH SSN_ID_CURSOR INTO p_PIDM, p_ID, lv_surname_prefix, lv_last_name, lv_first_name, 
                                     lv_mi_name, lv_entity_ind, lv_name_prefix, 
                                     lv_name_suffix, p_CONFID_IND, p_DCSD_IND;
            lv_id_found := SSN_ID_CURSOR%FOUND;                             
            CLOSE SSN_ID_CURSOR;
            IF lv_id_found THEN 
              MESSAGE(G$_NLS.Get('GOQRPLS-0169','LIB','*WARNING* SSN/SIN/TIN replaced with current ID.'));
            END IF;
    	    END IF;
        END IF;
      END IF;    
-- -- -- --
    END IF;
  END DO_SEL_ID;
--
--
BEGIN
--
-- Label is so that if the common matching routine is called and an ID is returned,
-- this validation logic needs to be repeated to enable the ID to validated.
--
<<REDO_VALIDATION>>
--
-- Reset the out parameters, except p_PIDM is alternately used when p_ID is 
-- not given.         
--
  COPY('N','GLOBAL.MORE_THAN_ONE_SSN');
-- -- -- --
-- -- -- --
--
  p_CONFID_IND := '';
  p_DCSD_IND   := '';
  p_FULL_NAME  := '';
--
-- Get the associated id of the given pidm.
--
  IF lv_check_value = 'SEL_ID_NAME' AND p_PIDM IS NOT NULL THEN
    OPEN GET_ID;
    FETCH GET_ID INTO p_ID;
    CLOSE GET_ID;      
  END IF; 
--
  IF p_ID IS NULL THEN
    RETURN;
  END IF;
--
-- Decode the lv_check_value.
--
  IF lv_check_value IN ('SEL_PIDM_NAME', 'SEL_ID_NAME') THEN
--
-- Get the name string by a given ID
--
    IF lv_check_value = 'SEL_PIDM_NAME' THEN
      OPEN ID_CURSOR;
      FETCH ID_CURSOR INTO p_PIDM, lv_surname_prefix, lv_last_name, lv_first_name, lv_mi_name,
                           lv_entity_ind, lv_name_prefix, lv_name_suffix, 
                           p_CONFID_IND, p_DCSD_IND;
      lv_id_found := ID_CURSOR%FOUND;                             
      CLOSE ID_CURSOR;
--
-- The given ID has changed, get the current ID.
--
      IF NOT lv_id_found THEN
        OPEN PREV_ID_CURSOR;
        FETCH PREV_ID_CURSOR INTO p_PIDM, p_ID, lv_surname_prefix, lv_last_name, lv_first_name, 
                                  lv_mi_name, lv_entity_ind, lv_name_prefix, 
                                  lv_name_suffix, p_CONFID_IND, p_DCSD_IND;
        lv_id_found := PREV_ID_CURSOR%FOUND;                             
        CLOSE PREV_ID_CURSOR;
      END IF;  
--
-- Get the name string by a given pidm
--
    ELSE
      OPEN GET_ID_NAME;
      FETCH GET_ID_NAME INTO p_ID, lv_surname_prefix, lv_last_name, lv_first_name, lv_mi_name;
      CLOSE GET_ID_NAME;
    END IF;
--
    IF GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.CURSOR_BLOCK'),DEFAULT_WHERE) = 'key-block' THEN
      COPY(p_ID,'GLOBAL.KEY_IDNO');
    END IF;
    G$_BUILD_FULL_NAME(p_FULL_NAME, lv_last_name, lv_first_name, lv_mi_name, '', '', '', lv_surname_prefix);
    RETURN;
--
  ELSE
    lv_check_confid_ind            := NVL(SUBSTR(lv_check_value, 1, 1), 'Y');
    lv_check_dcsd_ind              := NVL(SUBSTR(lv_check_value, 2, 1), 'Y');
    lv_raise_confid_dcsd_alert_msg := NVL(SUBSTR(lv_check_value, 3, 1), 'Y'); 
    lv_raise_id_form_failure       := NVL(SUBSTR(lv_check_value, 4, 1), 'Y'); 
    lv_get_id_name_ind             := NVL(SUBSTR(lv_check_value, 5, 1), 'N');              
  END IF;
--
-- Get ID info based on the given ID.
--
  DO_SEL_ID;
--
-- ID is not found.
--
  IF NOT lv_id_found THEN
    IF (NAME_IN('GLOBAL.MORE_THAN_ONE_SSN') = 'Y' AND gokfgac.f_spriden_pii_active = 'Y') THEN
      NULL;
    ELSE  
      IF ((gokfgac.f_spriden_pii_active = 'Y') AND G$_VERIFY_ID_EXISTS(p_ID)) OR
         (NAME_IN('GLOBAL.SSN_SEARCH_ENABLED_IND') = 'Y' AND
         gokfgac.f_spriden_pii_active = 'Y'             AND
    	   gokfgac.f_is_user_exempt = 'N'                 AND
    	   G$_VERIFY_SSN_EXISTS(p_ID)
    	   ) THEN 
-- -- PII is active, ID is found with fgac off.
        CLEAR_NAME_VARS;
        MESSAGE(G$_NLS.Get('GOQRPLS-0170','LIB','*ERROR* You do not have permission to view this ID.'));
        RAISE FORM_TRIGGER_FAILURE;
      END IF;
    END IF;
--
-- --
-- --
    IF NAME_IN('GLOBAL.MORE_THAN_ONE_SSN') = 'Y' THEN
      lv_cm_status := 'SKIP';
    ELSE
      lv_cm_status := G$_INVOKE_CM;
    END IF;
-- --
-- --    
    IF lv_cm_status = 'DONE' THEN
      p_ID := NAME_IN('GLOBAL.KEY_IDNO');
      GOTO REDO_VALIDATION;
    ELSIF lv_cm_status = 'SKIP' THEN
      IF NAME_IN('GLOBAL.MORE_THAN_ONE_SSN') = 'Y' THEN
        MESSAGE(G$_NLS.Get('GOQRPLS-0171','LIB','*WARNING* SSN/SIN/TIN found on multiple ID rows.   NEXT ITEM from ID field will invoke SSN/SIN/TIN Extended Search.'));
      ELSE
        MESSAGE(G$_NLS.Get('GOQRPLS-0172','LIB','*ERROR* ID does not exist; press LIST for name/ID search.'));
      END IF;
-- --      MESSAGE(G$_NLS.Get('GOQRPLS-0718','LIB','*ERROR* ID does not exist; press LIST for name/ID search.'));
      IF lv_raise_id_form_failure = 'Y' THEN
        RAISE FORM_TRIGGER_FAILURE;
      ELSE
        RETURN;
      END IF;  
    ELSE
      RETURN;
    END IF;  
  END IF;  
--
-- Build the full name
--
  G$_BUILD_FULL_NAME(p_FULL_NAME, lv_last_name, lv_first_name, lv_mi_name, 
                     lv_name_prefix, lv_name_suffix, p_NAME_LEN, lv_surname_prefix);
--
-- Check entity - lv_id_type is not P, C or the default value, set to default value
--
  IF lv_id_type NOT IN (ANY_ID, 'P', 'C') THEN
    lv_id_type := ANY_ID;
  END IF;
--
-- Any IDs and the found ID is a company.
--
  IF lv_id_type IN (ANY_ID, 'C') AND lv_entity_ind = 'C' THEN
    IF GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.CURSOR_BLOCK'),DEFAULT_WHERE) = 'key-block' THEN
      COPY(p_ID,'GLOBAL.KEY_IDNO');
    END IF;
    RETURN;
--
-- Request a person ID and the matched ID is a non-person.
--
  ELSIF lv_id_type <> ANY_ID THEN
    G$_CHECK_VALUE(lv_id_type = 'P' AND lv_entity_ind = 'C', G$_NLS.Get('GOQRPLS-0173', 'LIB',
      '*ERROR* ID identifies a company; must enter a person ID.'), TRUE);
--
-- Request a non-person ID and the matched ID is a person.
--
    G$_CHECK_VALUE(lv_id_type = 'C' AND lv_entity_ind = 'P', 
      G$_NLS.Get('GOQRPLS-0174','LIB','*ERROR* ID identifies a person; must enter a non-person ID.'), TRUE);
  END IF;
--
-- The found ID is a person, check deceased status
--
  IF lv_check_dcsd_ind = 'Y' AND p_DCSD_IND IS NOT NULL THEN
    IF (p_ID <> NAME_IN('GLOBAL.KEY_IDNO') OR NAME_IN('GLOBAL.KEY_IDNO') IS NULL) AND
       lv_raise_confid_dcsd_alert_msg = 'Y' AND 
       G$_GET_UPRF_DEAD_ALERT = 'Y' THEN
--
      lv_alert_button := G$_DISPLAY_ALERT('G$_CAUTION_OK_ALERT', 
        G$_NLS.Get('GOQRPLS-0175','LIB','Warning: This person is deceased.'));
    END IF;
  END IF;    
--
-- Check confidential status
--
  IF lv_check_confid_ind = 'Y' AND p_CONFID_IND IS NOT NULL THEN
    IF (p_ID <> NAME_IN('GLOBAL.KEY_IDNO') OR NAME_IN('GLOBAL.KEY_IDNO') IS NULL) AND
       lv_raise_confid_dcsd_alert_msg = 'Y' AND 
       G$_GET_UPRF_CONF_ALERT = 'Y' THEN
--
      lv_alert_button := G$_DISPLAY_ALERT('G$_CAUTION_OK_ALERT',
         G$_NLS.Get('GOQRPLS-0176','LIB','Warning: Information about this person is confidential.'));   
    END IF;
  END IF;    
--
  IF GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.CURSOR_BLOCK'),DEFAULT_WHERE) = 'key-block' THEN
    COPY(p_ID,'GLOBAL.KEY_IDNO');
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pId
		* @param pPidm
		* @param pFullName
		* @param pConfidInd
		* @param pDcsdInd
		*/
		public void gValidAllId(Ref<NString> pId, Ref<NNumber> pPidm, Ref<NString> pFullName, Ref<NString> pConfidInd, Ref<NString> pDcsdInd) {
			gValidAllId(pId, pPidm, pFullName, pConfidInd, pDcsdInd, toStr("YYYYN"), toStr("ANY"), toInt(230));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pId
		* @param pPidm
		* @param pFullName
		* @param pConfidInd
		* @param pDcsdInd
		* @param pCheckValue
		*/
		public void gValidAllId(Ref<NString> pId, Ref<NNumber> pPidm, Ref<NString> pFullName, Ref<NString> pConfidInd, Ref<NString> pDcsdInd, NString pCheckValue) {
			gValidAllId(pId, pPidm, pFullName, pConfidInd, pDcsdInd, pCheckValue, toStr("ANY"), toInt(230));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pId
		* @param pPidm
		* @param pFullName
		* @param pConfidInd
		* @param pDcsdInd
		* @param pCheckValue
		* @param pIdType
		*/
		public void gValidAllId(Ref<NString> pId, Ref<NNumber> pPidm, Ref<NString> pFullName, Ref<NString> pConfidInd, Ref<NString> pDcsdInd, NString pCheckValue, NString pIdType) {
			gValidAllId(pId, pPidm, pFullName, pConfidInd, pDcsdInd, pCheckValue, pIdType, toInt(230));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pId
		* @param pPidm
		* @param pFullName
		* @param pConfidInd
		* @param pDcsdInd
		* @param pCheckValue
		* @param pIdType
		* @param pNameLen
		*/
		public void gValidAllId(Ref<NString> pId, Ref<NNumber> pPidm, Ref<NString> pFullName, Ref<NString> pConfidInd, Ref<NString> pDcsdInd, NString pCheckValue, NString pIdType, NInteger pNameLen)
		{
			GValidAllId_Local innerClass = new GValidAllId_Local(pId, pPidm, pFullName, pConfidInd, pDcsdInd, pCheckValue, pIdType, pNameLen);
			try {
				do{
					// 
					//  Reset the out parameters, except p_PIDM is alternately used when p_ID is 
					//  not given.         
					// 
					copy("N","GLOBAL.MORE_THAN_ONE_SSN");
					//  -- -- --
					//  -- -- --
					// 
					innerClass.pConfidInd.val = toStr("");
					innerClass.pDcsdInd.val = toStr("");
					innerClass.pFullName.val = toStr("");
					// 
					//  Get the associated id of the given pidm.
					// 
					if ( innerClass.lvCheckValue.equals("SEL_ID_NAME") && !innerClass.pPidm.val.isNull() )
					{
						//Setting query parameters
						innerClass.getId.addParameter("P_P_PIDM", innerClass.pPidm);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable getId.
						innerClass.getId.open();
						ResultSet getIdResults = innerClass.getId.fetchInto();
						if ( getIdResults != null ) {
							innerClass.pId.val = getIdResults.getStr(0);
						}
						innerClass.getId.close();
					}
					// 
					if (innerClass.pId.val.isNull() )
					{
						return ;
					}
					// 
					//  Decode the lv_check_value.
					// 
					if ( in(innerClass.lvCheckValue, "SEL_PIDM_NAME", "SEL_ID_NAME").getValue() )
					{
						// 
						//  Get the name string by a given ID
						// 
						if ( innerClass.lvCheckValue.equals("SEL_PIDM_NAME") )
						{
							//Setting query parameters
							innerClass.idCursor.addParameter("P_P_ID", innerClass.pId);
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable idCursor.
							innerClass.idCursor.open();
							ResultSet idCursorResults = innerClass.idCursor.fetchInto();
							if ( idCursorResults != null ) {
								innerClass.pPidm.val = idCursorResults.getNumber(0);
								innerClass.lvSurnamePrefix = idCursorResults.getStr(1);
								innerClass.lvLastName = idCursorResults.getStr(2);
								innerClass.lvFirstName = idCursorResults.getStr(3);
								innerClass.lvMiName = idCursorResults.getStr(4);
								innerClass.lvEntityInd = idCursorResults.getStr(5);
								innerClass.lvNamePrefix = idCursorResults.getStr(6);
								innerClass.lvNameSuffix = idCursorResults.getStr(7);
								innerClass.pConfidInd.val = idCursorResults.getStr(8);
								innerClass.pDcsdInd.val = idCursorResults.getStr(9);
							}
							innerClass.lvIdFound = toBool(innerClass.idCursor.found());
							innerClass.idCursor.close();
							// 
							//  The given ID has changed, get the current ID.
							// 
							if ( innerClass.lvIdFound.not() )
							{
								//Setting query parameters
								innerClass.prevIdCursor.addParameter("P_P_ID", innerClass.pId);
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable prevIdCursor.
								innerClass.prevIdCursor.open();
								ResultSet prevIdCursorResults = innerClass.prevIdCursor.fetchInto();
								if ( prevIdCursorResults != null ) {
									innerClass.pPidm.val = prevIdCursorResults.getNumber(0);
									innerClass.pId.val = prevIdCursorResults.getStr(1);
									innerClass.lvSurnamePrefix = prevIdCursorResults.getStr(2);
									innerClass.lvLastName = prevIdCursorResults.getStr(3);
									innerClass.lvFirstName = prevIdCursorResults.getStr(4);
									innerClass.lvMiName = prevIdCursorResults.getStr(5);
									innerClass.lvEntityInd = prevIdCursorResults.getStr(6);
									innerClass.lvNamePrefix = prevIdCursorResults.getStr(7);
									innerClass.lvNameSuffix = prevIdCursorResults.getStr(8);
									innerClass.pConfidInd.val = prevIdCursorResults.getStr(9);
									innerClass.pDcsdInd.val = prevIdCursorResults.getStr(10);
								}
								innerClass.lvIdFound = toBool(innerClass.prevIdCursor.found());
								innerClass.prevIdCursor.close();
							}
						}
						else {
							//Setting query parameters
							innerClass.getIdName.addParameter("P_P_PIDM", innerClass.pPidm);
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable getIdName.
							innerClass.getIdName.open();
							ResultSet getIdNameResults =innerClass. getIdName.fetchInto();
							if ( getIdNameResults != null ) {
								innerClass.pId.val = getIdNameResults.getStr(0);
								innerClass.lvSurnamePrefix = getIdNameResults.getStr(1);
								innerClass.lvLastName = getIdNameResults.getStr(2);
								innerClass.lvFirstName = getIdNameResults.getStr(3);
								innerClass.lvMiName = getIdNameResults.getStr(4);
							}
							innerClass.getIdName.close();
						}
						// 
						if ( getBlockWhereClause(getCursorBlock()).equals("key-block") )
						{
							copy(innerClass.pId.val,"GLOBAL.KEY_IDNO");
						}
						gBuildFullName(innerClass.pFullName, innerClass.lvLastName, innerClass.lvFirstName, innerClass.lvMiName, toStr(""), toStr(""), toInt(""), innerClass.lvSurnamePrefix);
						return ;
					}
					else {
						innerClass.lvCheckConfidInd = isNull(substring(innerClass.lvCheckValue, toInt(1), toInt(1)), "Y");
						innerClass.lvCheckDcsdInd = isNull(substring(innerClass.lvCheckValue, toInt(2), toInt(1)), "Y");
						innerClass.lvRaiseConfidDcsdAlertMsg = isNull(substring(innerClass.lvCheckValue, toInt(3), toInt(1)), "Y");
						innerClass.lvRaiseIdFormFailure = isNull(substring(innerClass.lvCheckValue, toInt(4), toInt(1)), "Y");
						innerClass.lvGetIdNameInd = isNull(substring(innerClass.lvCheckValue, toInt(5), toInt(1)), "N");
					}
					// 
					//  Get ID info based on the given ID.
					// 
					innerClass.doSelId();
					// 
					//  ID is not found.
					// 
					if ( innerClass.lvIdFound.not() )
					{
						if ((getNameIn("GLOBAL.MORE_THAN_ONE_SSN").equals("Y") && Gokfgac.fSpridenPiiActive().equals("Y")))
						{
						}
						else {
							if ( ((Gokfgac.fSpridenPiiActive().equals("Y")) && gVerifyIdExists(innerClass.pId.val).isTrue()) ||
									(getNameIn("GLOBAL.SSN_SEARCH_ENABLED_IND").equals("Y") && Gokfgac.fSpridenPiiActive().equals("Y") && Gokfgac.fIsUserExempt().equals("N") && gVerifySsnExists(innerClass.pId.val).isTrue()) )
							{
								//  -- PII is active, ID is found with fgac off.
								innerClass.clearNameVars();
								errorMessage(GNls.Fget(toStr("GOQRPLS-0170"), toStr("LIB"), toStr("*ERROR* You do not have permission to view this ID.")));
								throw new ApplicationException();
							}
						}
						// 
						//  --
						//  --
						if ( getNameIn("GLOBAL.MORE_THAN_ONE_SSN").equals("Y") )
						{
							innerClass.lvCmStatus = toStr("SKIP");
						}
						else {
							innerClass.lvCmStatus = gInvokeCm();
						}
						//  --
						//  --    
						if ( innerClass.lvCmStatus.equals("DONE") )
						{
							innerClass.pId.val = getNameIn("GLOBAL.KEY_IDNO");
							continue;
						}
						else if ( innerClass.lvCmStatus.equals("SKIP") ) {
							if ( getNameIn("GLOBAL.MORE_THAN_ONE_SSN").equals("Y") )
							{
								warningMessage(GNls.Fget(toStr("GOQRPLS-0171"), toStr("LIB"), toStr("*WARNING* SSN/SIN/TIN found on multiple ID rows.   NEXT ITEM from ID field will invoke SSN/SIN/TIN Extended Search.")));
							}
							else {
								errorMessage(GNls.Fget(toStr("GOQRPLS-0172"), toStr("LIB"), toStr("*ERROR* ID does not exist; press LIST for name/ID search.")));
							}
							//  --      MESSAGE(G$_NLS.Get('GOQRPLS-0718','LIB','*ERROR* ID does not exist; press LIST for name/ID search.'));
							if ( innerClass.lvRaiseIdFormFailure.equals("Y") )
							{
								throw new ApplicationException();
							}
							else {
								return ;
							}
						}
						else {
							return ;
						}						
					}
					break;
				} while(true);
				
				// 
				//  Build the full name
				// 
				gBuildFullName(innerClass.pFullName, innerClass.lvLastName, innerClass.lvFirstName, innerClass.lvMiName, innerClass.lvNamePrefix, innerClass.lvNameSuffix, pNameLen, innerClass.lvSurnamePrefix);
				// 
				//  Check entity - lv_id_type is not P, C or the default value, set to default value
				// 
				if ( !in(innerClass.lvIdType, innerClass.anyId.getValue(), "P", "C").getValue() )
				{
					innerClass.lvIdType = innerClass.anyId;
				}
				// 
				//  Any IDs and the found ID is a company.
				// 
				if ( in(innerClass.lvIdType, innerClass.anyId.getValue(), "C").getValue() && innerClass.lvEntityInd.equals("C") )
				{
					if ( getBlockWhereClause(getCursorBlock()).equals("key-block") )
					{
						copy(innerClass.pId.val,"GLOBAL.KEY_IDNO");
					}
					return ;
				}
				else if ( innerClass.lvIdType.notEquals(innerClass.anyId) ) {
					gCheckValue(toBool(innerClass.lvIdType.equals("P") && innerClass.lvEntityInd.equals("C")), GNls.Fget(toStr("GOQRPLS-0173"), toStr("LIB"), toStr("*ERROR* ID identifies a company; must enter a person ID.")), toBool(NBool.True));
					// 
					//  Request a non-person ID and the matched ID is a person.
					// 
					gCheckValue(toBool(innerClass.lvIdType.equals("C") && innerClass.lvEntityInd.equals("P")), GNls.Fget(toStr("GOQRPLS-0174"), toStr("LIB"), toStr("*ERROR* ID identifies a person; must enter a non-person ID.")), toBool(NBool.True));
				}
				// 
				//  The found ID is a person, check deceased status
				// 
				if ( innerClass.lvCheckDcsdInd.equals("Y") && !innerClass.pDcsdInd.val.isNull() )
				{
					if ( (innerClass.pId.val.notEquals(getNameIn("GLOBAL.KEY_IDNO")) || getNameIn("GLOBAL.KEY_IDNO").isNull()) && innerClass.lvRaiseConfidDcsdAlertMsg.equals("Y") && gGetUprfDeadAlert().equals("Y") )
					{
						// 
						innerClass.lvAlertButton = gDisplayAlert(toStr("G$_CAUTION_OK_ALERT"), GNls.Fget(toStr("GOQRPLS-0175"), toStr("LIB"), toStr("Warning: This person is deceased.")));
					}
				}
				// 
				//  Check confidential status
				// 
				if (innerClass. lvCheckConfidInd.equals("Y") && !innerClass.pConfidInd.val.isNull() )
				{
					if ( (innerClass.pId.val.notEquals(getNameIn("GLOBAL.KEY_IDNO")) || getNameIn("GLOBAL.KEY_IDNO").isNull()) && innerClass.lvRaiseConfidDcsdAlertMsg.equals("Y") && gGetUprfConfAlert().equals("Y") )
					{
						// 
						innerClass.lvAlertButton = gDisplayAlert(toStr("G$_CAUTION_OK_ALERT"), GNls.Fget(toStr("GOQRPLS-0176"), toStr("LIB"), toStr("Warning: Information about this person is confidential.")));
					}
				}
				// 
				if ( getBlockWhereClause(getCursorBlock()).equals("key-block") )
				{
					copy(innerClass.pId.val,"GLOBAL.KEY_IDNO");
				}
			}finally{
				innerClass.getId.close();
				innerClass.idCursor.close();
				innerClass.prevIdCursor.close();
				innerClass.getIdName.close();
			}
		}
		
		private class GValidAllId_Local
		{
			int rowCount = 0;
			// 
			//  Constant
			// 
			NString anyId = toStr("ANY");
			// 
			//  Local variables
			// 
			NString lvEntityInd = NString.getNull();
			NString lvCheckConfidInd = NString.getNull();
			NString lvCheckDcsdInd = NString.getNull();
			NString lvCheckValue;
			NString lvIdType;
			NString lvCmStatus = toStr("");
			
			NString lvRaiseConfidDcsdAlertMsg = NString.getNull();
			NString lvRaiseIdFormFailure = NString.getNull();
			NString lvGetIdNameInd = NString.getNull();
			NBool lvIdFound = toBool(NBool.False);
			NNumber lvSsnCount = NNumber.getNull();
			// 
			NNumber lvAlertButton = NNumber.getNull();
			NString lvSurnamePrefix = NString.getNull();
			NString lvLastName = NString.getNull();
			NString lvFirstName = NString.getNull();
			NString lvMiName = NString.getNull();
			NString lvNamePrefix = NString.getNull();
			NString lvNameSuffix = NString.getNull();
			String sqlgetId = "SELECT SPRIDEN_ID " +
	" FROM SPRIDEN " +
	" WHERE SPRIDEN_PIDM = :P_P_PIDM AND SPRIDEN_CHANGE_IND IS NULL ";
			DataCursor getId = new DataCursor(sqlgetId);
			String sqlgetIdName = "SELECT SPRIDEN_ID, SPRIDEN_SURNAME_PREFIX, SPRIDEN_LAST_NAME, SPRIDEN_FIRST_NAME, SPRIDEN_MI " +
	" FROM SPRIDEN " +
	" WHERE SPRIDEN_PIDM = :P_P_PIDM AND SPRIDEN_CHANGE_IND IS NULL ";
			DataCursor getIdName = new DataCursor(sqlgetIdName);
			String sqlidCursor = "SELECT SPRIDEN_PIDM, SPRIDEN_SURNAME_PREFIX, SPRIDEN_LAST_NAME, SPRIDEN_FIRST_NAME, SPRIDEN_MI, SPRIDEN_ENTITY_IND, SPBPERS_NAME_PREFIX, SPBPERS_NAME_SUFFIX, DECODE(NVL(SPBPERS_CONFID_IND, 'N'), 'Y', G$_NLS.Get('GOQRPLS-0159', 'LIB', 'Confidential'), ''), DECODE(NVL(SPBPERS_DEAD_IND, 'N'), 'Y', G$_NLS.Get('GOQRPLS-0160', 'LIB', 'Deceased'), '') " +
	" FROM SPRIDEN, SPBPERS " +
	" WHERE SPRIDEN_ID = :P_P_ID AND SPRIDEN_CHANGE_IND IS NULL AND SPRIDEN_PIDM = SPBPERS_PIDM(+) ";
			DataCursor idCursor = new DataCursor(sqlidCursor);
			String sqlprevIdCursor = "SELECT SPRIDEN_PIDM, SPRIDEN_ID, SPRIDEN_SURNAME_PREFIX, SPRIDEN_LAST_NAME, SPRIDEN_FIRST_NAME, SPRIDEN_MI, SPRIDEN_ENTITY_IND, SPBPERS_NAME_PREFIX, SPBPERS_NAME_SUFFIX, DECODE(NVL(SPBPERS_CONFID_IND, 'N'), 'Y', G$_NLS.Get('GOQRPLS-0161', 'LIB', 'Confidential'), ''), DECODE(NVL(SPBPERS_DEAD_IND, 'N'), 'Y', G$_NLS.Get('GOQRPLS-0162', 'LIB', 'Deceased'), '') " +
	" FROM SPRIDEN, SPBPERS " +
	" WHERE (SPRIDEN_PIDM) IN ((SELECT Y.SPRIDEN_PIDM " +
		" FROM SPRIDEN Y " +
		" WHERE Y.SPRIDEN_ID = :P_P_ID AND Y.SPRIDEN_CHANGE_IND = 'I' )) AND SPRIDEN_CHANGE_IND IS NULL AND SPRIDEN_PIDM = SPBPERS_PIDM(+) ";
			DataCursor prevIdCursor = new DataCursor(sqlprevIdCursor);
			String sqlcurrentIdCursor = "SELECT SPRIDEN_ID, SPRIDEN_SURNAME_PREFIX, SPRIDEN_LAST_NAME, SPRIDEN_FIRST_NAME, SPRIDEN_MI, SPRIDEN_ENTITY_IND, SPBPERS_NAME_PREFIX, SPBPERS_NAME_SUFFIX, DECODE(NVL(SPBPERS_CONFID_IND, 'N'), 'Y', G$_NLS.Get('GOQRPLS-0163', 'LIB', 'Confidential'), ''), DECODE(NVL(SPBPERS_DEAD_IND, 'N'), 'Y', G$_NLS.Get('GOQRPLS-0164', 'LIB', 'Deceased'), '') " +
	" FROM SPRIDEN, SPBPERS " +
	" WHERE SPRIDEN_PIDM = :P_P_PIDM AND SPRIDEN_CHANGE_IND IS NULL AND SPRIDEN_PIDM = SPBPERS_PIDM(+) ";
			DataCursor currentIdCursor = new DataCursor(sqlcurrentIdCursor);
			String sqlssnIdCursor = "SELECT SPRIDEN_PIDM, SPRIDEN_ID, SPRIDEN_SURNAME_PREFIX, SPRIDEN_LAST_NAME, SPRIDEN_FIRST_NAME, SPRIDEN_MI, SPRIDEN_ENTITY_IND, SPBPERS_NAME_PREFIX, SPBPERS_NAME_SUFFIX, DECODE(NVL(SPBPERS_CONFID_IND, 'N'), 'Y', G$_NLS.Get('GOQRPLS-0165', 'LIB', 'Confidential'), ''), DECODE(NVL(SPBPERS_DEAD_IND, 'N'), 'Y', G$_NLS.Get('GOQRPLS-0166', 'LIB', 'Deceased'), '') " +
	" FROM SPRIDEN, SPBPERS " +
	" WHERE SPBPERS_SSN = :P_P_ID AND SPRIDEN_CHANGE_IND IS NULL AND SPRIDEN_PIDM = SPBPERS_PIDM ";
			DataCursor ssnIdCursor = new DataCursor(sqlssnIdCursor);
			String sqlssnCountCursor = "SELECT count(*) " +
	" FROM SPRIDEN, SPBPERS " +
	" WHERE SPBPERS_SSN = :P_P_ID AND SPRIDEN_CHANGE_IND IS NULL AND SPRIDEN_PIDM = SPBPERS_PIDM ";
			DataCursor ssnCountCursor = new DataCursor(sqlssnCountCursor);
			Ref<NString> pId;
			Ref<NNumber> pPidm;
			Ref<NString> pFullName; 
			Ref<NString> pConfidInd;
			Ref<NString> pDcsdInd;
			NString pCheckValue;
			NString pIdType;
			NInteger pNameLen;
			
			GValidAllId_Local (Ref<NString> pId, Ref<NNumber> pPidm, Ref<NString> pFullName, Ref<NString> pConfidInd, Ref<NString> pDcsdInd, NString pCheckValue, NString pIdType, NInteger pNameLen){
				lvCheckValue = upper(pCheckValue);
				lvIdType = upper(pIdType);
				
				this.pId = pId;
				this.pPidm = pPidm;
				this.pFullName = pFullName;
				this.pConfidInd = pConfidInd;
				this.pDcsdInd = pDcsdInd;
				this.pCheckValue = pCheckValue;
				this.pIdType = pIdType;
				this.pNameLen = pNameLen;
			}
			
			
		/* <p>
				* 
				* 
				*  Internal Procedures
				* 
				* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
		/* </p>
				*/
				public void clearNameVars()
				{
					lvSurnamePrefix = NString.getNull();
					lvLastName = NString.getNull();
					lvFirstName = NString.getNull();
					lvMiName = NString.getNull();
					lvEntityInd = NString.getNull();
					lvNamePrefix = NString.getNull();
					lvNameSuffix = NString.getNull();
					pConfidInd.val = NString.getNull();
					pDcsdInd.val = NString.getNull();
					pPidm.val = NNumber.getNull();
				}
		/* <p>
				* 
				* 
				* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
		/* </p>
				*/
				public void doSelId()
				{
					try {
						// 
						//  Get ID info based on the given ID.
						// 
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable idCursor.
						idCursor.addParameter("P_P_ID", pId.val);
						
						idCursor.open();
						ResultSet idCursorResults = idCursor.fetchInto();
						if ( idCursorResults != null ) {
							pPidm.val = idCursorResults.getNumber(0);
							lvSurnamePrefix = idCursorResults.getStr(1);
							lvLastName = idCursorResults.getStr(2);
							lvFirstName = idCursorResults.getStr(3);
							lvMiName = idCursorResults.getStr(4);
							lvEntityInd = idCursorResults.getStr(5);
							lvNamePrefix = idCursorResults.getStr(6);
							lvNameSuffix = idCursorResults.getStr(7);
							pConfidInd.val = idCursorResults.getStr(8);
							pDcsdInd.val = idCursorResults.getStr(9);
						}
						lvIdFound = toBool(idCursor.found());
						idCursor.close();
						// 
						//  The given ID has changed, get the current ID.
						// 
						if ( lvIdFound.not() )
						{
							prevIdCursor.addParameter("P_P_ID", pId.val);
							prevIdCursor.open();
							ResultSet prevIdCursorResults = prevIdCursor.fetchInto();
							if ( prevIdCursorResults != null ) {
								pPidm.val = prevIdCursorResults.getNumber(0);
								pId.val = prevIdCursorResults.getStr(1);
								lvSurnamePrefix = prevIdCursorResults.getStr(2);
								lvLastName = prevIdCursorResults.getStr(3);
								lvFirstName = prevIdCursorResults.getStr(4);
								lvMiName = prevIdCursorResults.getStr(5);
								lvEntityInd = prevIdCursorResults.getStr(6);
								lvNamePrefix = prevIdCursorResults.getStr(7);
								lvNameSuffix = prevIdCursorResults.getStr(8);
								pConfidInd.val = prevIdCursorResults.getStr(9);
								pDcsdInd.val = prevIdCursorResults.getStr(10);
							}
							lvIdFound = toBool(prevIdCursor.found());
							prevIdCursor.close();
							// 
							if ( lvIdFound.getValue() )
							{
								warningMessage(GNls.Fget(toStr("GOQRPLS-0167"), toStr("LIB"), toStr("*WARNING* Previous ID replaced with current ID.")));
							}
							else if ( lvIdFound.not() && lvGetIdNameInd.equals("Y")) {
								currentIdCursor.addParameter("P_P_PIDM", pPidm.val);
								currentIdCursor.open();
								ResultSet currentIdCursorResults = currentIdCursor.fetchInto();
								if ( currentIdCursorResults != null ) {
									pId.val = currentIdCursorResults.getStr(0);
									lvSurnamePrefix = currentIdCursorResults.getStr(1);
									lvLastName = currentIdCursorResults.getStr(2);
									lvFirstName = currentIdCursorResults.getStr(3);
									lvMiName = currentIdCursorResults.getStr(4);
									lvEntityInd = currentIdCursorResults.getStr(5);
									lvNamePrefix = currentIdCursorResults.getStr(6);
									lvNameSuffix = currentIdCursorResults.getStr(7);
									pConfidInd.val = currentIdCursorResults.getStr(8);
									pDcsdInd.val = currentIdCursorResults.getStr(9);
								}
								lvIdFound = toBool(currentIdCursor.found());
								currentIdCursor.close();
								// 
								if ( lvIdFound.getValue() )
								{
									warningMessage(GNls.Fget(toStr("GOQRPLS-0168"), toStr("LIB"), toStr("*WARNING* Previous ID removed, replaced by current ID.")));
								}
							}
							// 
							//  -- -- --
							//  -- -- --
							if ( lvIdFound.not() )
							{
								if ( getNameIn("GLOBAL.SSN_SEARCH_ENABLED_IND").equals("Y") )
								{
									if ( GChkAuth.gCheckAuthorizationFnc(toStr("SSN_SEARCH"), getUser()).equals("YES") )
									{
										//  -- --
										//  -- -- check if more than 1 ID has this as SSN    		
										//F2J_WARNING : Make sure that the method "Close" is being called over the variable ssnCountCursor.
										ssnCountCursor.addParameter("P_P_ID", pId.val);
										ssnCountCursor.open();
										ResultSet ssnCountCursorResults = ssnCountCursor.fetchInto();
										if ( ssnCountCursorResults != null ) {
											lvSsnCount = ssnCountCursorResults.getNumber(0);
										}
										ssnCountCursor.close();
										if ( lvSsnCount.equals(1) )
										{
										}
										else if ( lvSsnCount.equals(0) ) {
											return ;
										}
										else {
											copy("Y","GLOBAL.MORE_THAN_ONE_SSN");
											return ;
										}
										ssnIdCursor.addParameter("P_P_ID", pId.val);
										ssnIdCursor.open();
										ResultSet ssnIdCursorResults = ssnIdCursor.fetchInto();
										if ( ssnIdCursorResults != null ) {
											pPidm.val = ssnIdCursorResults.getNumber(0);
											pId.val = ssnIdCursorResults.getStr(1);
											lvSurnamePrefix = ssnIdCursorResults.getStr(2);
											lvLastName = ssnIdCursorResults.getStr(3);
											lvFirstName = ssnIdCursorResults.getStr(4);
											lvMiName = ssnIdCursorResults.getStr(5);
											lvEntityInd = ssnIdCursorResults.getStr(6);
											lvNamePrefix = ssnIdCursorResults.getStr(7);
											lvNameSuffix = ssnIdCursorResults.getStr(8);
											pConfidInd.val = ssnIdCursorResults.getStr(9);
											pDcsdInd.val = ssnIdCursorResults.getStr(10);
										}
										lvIdFound = toBool(ssnIdCursor.found());
										ssnIdCursor.close();
										if ( lvIdFound.getValue() )
										{
											warningMessage(GNls.Fget(toStr("GOQRPLS-0169"), toStr("LIB"), toStr("*WARNING* SSN/SIN/TIN replaced with current ID.")));
										}
									}
								}
							}
						}
						}finally{
							idCursor.close();
							prevIdCursor.close();
							currentIdCursor.close();
							ssnCountCursor.close();
							ssnIdCursor.close();
						}
				}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_VALIDATE_FIXED_LENGTH
	/*
	PROCEDURE G$_VALIDATE_FIXED_LENGTH IS
  LV_CUR_ITEM   VARCHAR2(100) := NAME_IN('SYSTEM.TRIGGER_ITEM');
  LV_ITEM_LEN   NUMBER := GET_ITEM_PROPERTY(LV_CUR_ITEM,MAX_LENGTH);
BEGIN
  IF NAME_IN(LV_CUR_ITEM) IS NOT NULL THEN
  	IF LENGTH(RTRIM(LTRIM(NAME_IN(LV_CUR_ITEM)))) <> LV_ITEM_LEN THEN
  		MESSAGE(G$_NLS.Get('GOQRPLS-0158','LIB','*ERROR* Item must be entered completely.'));
  		RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		
		//MORPHIS TODO Tmrpaixao: Created new overload method to fix the problem with the GO-BUTTON being the trigger-item.
		//When necessary pass the item name to be validated instead of the trigger item. 
		
		public void gValidateFixedLength()
		{
			NString lvCurItem = getTriggerItem();
			gValidateFixedLength(lvCurItem);
		}
		
		public void gValidateFixedLength(NString lvCurItem)
		{			
			NNumber lvItemLen = toNumber(findItem(lvCurItem).getMaxLength());
			if ( !getNameIn(lvCurItem).isNull() )
			{
				if ( length(rtrim(ltrim(getNameIn(lvCurItem)))).notEquals(lvItemLen) )
				{
					errorMessage(GNls.Fget(toStr("GOQRPLS-0158"), toStr("LIB"), toStr("*ERROR* Item must be entered completely.")));
					throw new ApplicationException();
				}
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_UPDATE_ACTIVITY_DATE
	/*
	PROCEDURE G$_UPDATE_ACTIVITY_DATE IS
--
-- updates the activity date column in the table associated with 
-- the current block.
--
  ITEM_NAME   VARCHAR2(80) := NULL;
  ID_ITEM     ITEM;
BEGIN
--
-- build item name with block and basetable names
--
  ITEM_NAME := NAME_IN('SYSTEM.CURRENT_BLOCK') || '.' 
               || GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.CURRENT_BLOCK'),BASE_TABLE)
               || '_ACTIVITY_DATE';
--
-- check for the existance of this item and if valid, update
--
  ID_ITEM := FIND_ITEM(ITEM_NAME);
  IF NOT ID_NULL(ID_ITEM) THEN
    COPY(NAME_IN('CURRENT_DATE'),ITEM_NAME);
  END IF;
END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gUpdateActivityDate()
		{
			// 
			//  updates the activity date column in the table associated with 
			//  the current block.
			// 
			NString itemName = NString.getNull();
			ItemDescriptor idItem= null;
			// 
			//  build item name with block and basetable names
			// 
			itemName = getCurrentBlock().append(".").append(getBlockQueryDataSourceName(getCurrentBlock())).append("_ACTIVITY_DATE");
			// 
			//  check for the existance of this item and if valid, update
			// 
			idItem = findItem(itemName);
			if ( !(idItem == null) )
			{
//				copy(getNameIn("CURRENT_DATE"),itemName);
				copy(NDate.getNow(),itemName);
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_TIMER_EXP
	/*
	PROCEDURE G$_TIMER_EXP IS
  WHICH_TIMER   VARCHAR2(30) := GET_APPLICATION_PROPERTY(TIMER_NAME);
BEGIN
  CASE WHICH_TIMER
--
    WHEN 'RESTART_SESSION' THEN 
      COPY('Y','GLOBAL.EXIT_TO_MENU');
      COPY('Y','GLOBAL.EXIT_BANNER');
      COPY('Y','GLOBAL.RESTART_SESSION');
      EXIT_FORM(NO_VALIDATE);
      -- 80-3
    WHEN g$_sd.C_SD_CLOSE_TIMER_NAME THEN
      g$_sd.p_close_sde_form(p_delayed=>false);
    WHEN g$_sd.C_SD_BLOCK_TIMER_NAME THEN
    	g$_sd.p_new_block;
    	--
    ELSE NULL;
--
  END CASE;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gTimerExp(NString whichTimer)
		{
			
			if (whichTimer.equals("RESTART_SESSION"))
			{
				copy("Y","GLOBAL.EXIT_TO_MENU");
				copy("Y","GLOBAL.EXIT_BANNER");
				copy("Y","GLOBAL.RESTART_SESSION");
				exitTask(TaskServices.NO_VALIDATE);
			}
			else if (whichTimer.equals(GSd.C_SD_CLOSE_TIMER_NAME))
			{
				// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
				getGSd().pCloseSdeForm(/*pDelayed=>*/NBool.False);
			}
			else if (whichTimer.equals(toStr(GSd.C_SD_BLOCK_TIMER_NAME)))
			{
				getGSd().pNewBlock();
			}
			else {
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_STARTUP
	/*
	PROCEDURE G$_STARTUP IS
BEGIN
  EXECUTE_TRIGGER('LOAD_FORM_HEADER');
  G$_CHECK_FAILURE; 
  EXECUTE_TRIGGER('GLOBAL_COPY');
  G$_CHECK_FAILURE; 
  IF GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.TRIGGER_BLOCK'),BASE_TABLE) IS NOT NULL THEN    
    EXECUTE_QUERY;
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gStartup()
		{ 
			try {
				executeAction("LOAD_FORM_HEADER");
			} catch (Exception e) {
				throw new ApplicationException(e);
			}
			try {
				executeAction("GLOBAL_COPY");
			} catch (Exception e) {
			throw new ApplicationException(e);
			}
			if ( !getBlockQueryDataSourceName(getTriggerBlock()).isNull() )
			{
				executeQuery();
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_SSN_VALIDATE_MAX_LENGTH
	/*
	FUNCTION G$_SSN_VALIDATE_MAX_LENGTH(p_item VARCHAR2) RETURN VARCHAR2 IS
-- -- Implemented in version 8.0
-- -- To be used in validation (either a WHEN-VALIDATE-ITEM or POST-CHANGE) of data
-- -- enterable SSN items.  The SSN may be a length of 9, 10, 11, 12, 13, 14 or 15 based
-- -- on the GUBINST_SSN_MAX_LENGTH value.
-- -- This routine will check the length of the data in the SSN item being passed.
-- -- If that length is greater than the GUBINST_SSN_MAX_LENGTH THEN
-- --   the error message is returned through this function
-- -- ELSE
-- --   No error and NULL is returned as the message through this function.
-- -- The calling routine should check for the return being NOT NULL and
-- --     1) MESSAGE that value
-- -- and 2) RAISE FORM_TRIGGER_FAILURE
-- --
-- --
  lv_error_message VARCHAR2(200) :=
      G$_NLS.Get('GOQRPLS-0151','LIB','*ERROR* Cannot exceed the maximum number of characters for this field (%01%)',
                                 NAME_IN('GLOBAL.GUBINST_SSN_MAX_LENGTH'));
BEGIN
  IF LENGTH(NAME_IN(p_item)) > TO_NUMBER(NAME_IN('GLOBAL.GUBINST_SSN_MAX_LENGTH')) THEN
    RETURN(lv_error_message);
  ELSE
  	RETURN('');
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pItem
		*/
		public NString gSsnValidateMaxLength(NString pItem)
		{
			//  -- Implemented in version 8.0
			//  -- To be used in validation (either a WHEN-VALIDATE-ITEM or POST-CHANGE) of data
			//  -- enterable SSN items.  The SSN may be a length of 9, 10, 11, 12, 13, 14 or 15 based
			//  -- on the GUBINST_SSN_MAX_LENGTH value.
			//  -- This routine will check the length of the data in the SSN item being passed.
			//  -- If that length is greater than the GUBINST_SSN_MAX_LENGTH THEN
			//  --   the error message is returned through this function
			//  -- ELSE
			//  --   No error and NULL is returned as the message through this function.
			//  -- The calling routine should check for the return being NOT NULL and
			//  --     1) MESSAGE that value
			//  -- and 2) RAISE FORM_TRIGGER_FAILURE
			//  --
			//  --
			NString lvErrorMessage = GNls.Fget(toStr("GOQRPLS-0151"), toStr("LIB"), toStr("*ERROR* Cannot exceed the maximum number of characters for this field (%01%)"), getNameIn("GLOBAL.GUBINST_SSN_MAX_LENGTH"));
			if ( length(getNameIn(pItem)).greater(toNumber(getNameIn("GLOBAL.GUBINST_SSN_MAX_LENGTH"))) )
			{
				return ((lvErrorMessage));
			}
			else {
				return  toStr((("")));
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_SSN_SET_ITEM_HINT
	/*
	PROCEDURE G$_SSN_SET_ITEM_HINT(p_item VARCHAR2) IS
-- -- Implemented in version 8.0
-- -- To be used in WHEN-NEW-ITEM-INSTANCE of data enterable SSN items
-- -- SSN may be a length of 9, 10, 11, 12, 13, 14 or 15 basedup the GUBINST_SSN_MAX_LENGTH value.
-- -- This routine will append to the SSN items autohint display
-- --
  lv_hint        VARCHAR2(512);
  lv_append_hint VARCHAR2(60) := 
            G$_NLS.Get('GOQRPLS-0150','LIB','Maximum field length %01% characters.',NAME_IN('GLOBAL.GUBINST_SSN_MAX_LENGTH'));
BEGIN
  lv_hint := GET_ITEM_PROPERTY(p_item,HINT_TEXT);
  IF INSTR(lv_hint,lv_append_hint) = 0 THEN
    IF lv_hint IS NOT NULL THEN
    	lv_hint := lv_hint||'  '||lv_append_hint;
    ELSE
      lv_hint := lv_append_hint;
    END IF;
    SET_ITEM_PROPERTY(p_item,HINT_TEXT,lv_hint);
  END IF;
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pItem
		*/
		public void gSsnSetItemHint(NString pItem)
		{
			//  -- Implemented in version 8.0
			//  -- To be used in WHEN-NEW-ITEM-INSTANCE of data enterable SSN items
			//  -- SSN may be a length of 9, 10, 11, 12, 13, 14 or 15 basedup the GUBINST_SSN_MAX_LENGTH value.
			//  -- This routine will append to the SSN items autohint display
			//  --
			NString lvHint= NString.getNull();
			NString lvAppendHint = GNls.Fget(toStr("GOQRPLS-0150"), toStr("LIB"), toStr("Maximum field length %01% characters."), getNameIn("GLOBAL.GUBINST_SSN_MAX_LENGTH"));
			lvHint = getItemHint(pItem);
			if ( inStr(lvHint, lvAppendHint).equals(0) )
			{
				if ( !lvHint.isNull() )
				{
					lvHint = lvHint.append("  ").append(lvAppendHint);
				}
				else {
					lvHint = lvAppendHint;
				}
				setItemHint(pItem, lvHint);
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_SHOW_MENU_BKSHLF
	/*
	PROCEDURE G$_SHOW_MENU_BKSHLF IS
 WEBDOC_URL         VARCHAR2(200) := NULL; -- including both path and filename
--
BEGIN
  WEBDOC_URL := G$_GET_UPRF_WEBBKSHLF;
  WEB.SHOW_DOCUMENT(WEBDOC_URL, '_blank');
--   
EXCEPTION
  WHEN OTHERS THEN
    IF INSTR(SQLERRM,'ORA',1,3) > 0 THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0147','LIB','*ERROR* %01%',
                 SUBSTR(SQLERRM,12,INSTR(SQLERRM,'ORA',1,3) - 12)));
    ELSIF INSTR(SQLERRM,'ORA',1,2) > 0 THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0148','LIB','*ERROR* %01%',
                 SUBSTR(SQLERRM,12,INSTR(SQLERRM,'ORA',1,2) - 12)));
    ELSE
      MESSAGE(G$_NLS.Get('GOQRPLS-0149','LIB','*ERROR* %01%',
                 SUBSTR(SQLERRM,12,255)));
    END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gShowMenuBkshlf()
		{
			NString webdocUrl = NString.getNull();
			try
			{
				webdocUrl = gGetUprfWebbkshlf();
				showDocument(webdocUrl, "_blank");
			}
			catch(Exception  e)
			{
				if ( inStr(errorMessage(), toStr("ORA"), toInt(1), toInt(3)).greater(0) )
				{
					errorMessage(GNls.Fget(toStr("GOQRPLS-0147"), toStr("LIB"), toStr("*ERROR* %01%"), substring(errorMessage(), toInt(12), inStr(errorMessage(), toStr("ORA"), toInt(1), toInt(3)).subtract(12))));
				}
				else if ( inStr(errorMessage(), toStr("ORA"), toInt(1), toInt(2)).greater(0) ) {
					errorMessage(GNls.Fget(toStr("GOQRPLS-0148"), toStr("LIB"), toStr("*ERROR* %01%"), substring(errorMessage(), toInt(12), inStr(errorMessage(), toStr("ORA"), toInt(1), toInt(2)).subtract(12))));
				}
				else {
					errorMessage(GNls.Fget(toStr("GOQRPLS-0149"), toStr("LIB"), toStr("*ERROR* %01%"), substring(errorMessage(), toInt(12), toInt(255))));
				}
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_SHOW_MENU
	/*
	PROCEDURE G$_SHOW_MENU IS
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gShowMenu()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_SET_WIN_PROPERTY
	/*
	PROCEDURE G$_SET_WIN_PROPERTY IS
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gSetWinProperty()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_SET_USER_PREFERENCES
	/*
	PROCEDURE G$_SET_USER_PREFERENCES IS
BEGIN
--
-- Set the user's preferences for the various NVAs.
--
  G$_NVA_SET_BUTTON;
  G$_CHECK_FAILURE;
--
  G$_NVA_SET_CANVAS;
  G$_CHECK_FAILURE;
--
  G$_NVA_SET_ITEM;
  G$_CHECK_FAILURE;
--
  G$_NVA_SET_PROMPT;
  G$_CHECK_FAILURE;
--
  G$_NVA_SET_PROMPT_CODE;
  G$_CHECK_FAILURE;
--
  G$_NVA_SET_RECORD;
  G$_CHECK_FAILURE;
--
  G$_NVA_SET_SCROLLBAR;
  G$_CHECK_FAILURE;
--
  G$_NVA_SET_SEPARATOR_LINE;
  G$_CHECK_FAILURE;
--
  G$_NVA_SET_WINDOW;
  G$_CHECK_FAILURE;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gSetUserPreferences()
		{
			// 
			//  Set the user's preferences for the various NVAs.
			// 
			gNvaSetButton();
			
			// 
			gNvaSetCanvas();
			
			// 
			gNvaSetItem();
			
			// 
			gNvaSetPrompt();
			
			// 
			gNvaSetPromptCode();
			
			// 
			gNvaSetRecord();
			
			// 
			gNvaSetScrollbar();
			
			// 
			gNvaSetSeparatorLine();
			
			// 
			gNvaSetWindow();
			
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_SET_INST_PROPERTY
	/*
	PROCEDURE G$_SET_INST_PROPERTY IS
--
  WIN_TITLE    VARCHAR2(200);
  WIN_ID       WINDOW;
  MAIN_WIN_ID  WINDOW;
--
  event_win    VARCHAR2(60) := NAME_IN('SYSTEM.EVENT_WINDOW');
  cur_form     VARCHAR2(60) := NAME_IN('SYSTEM.CURRENT_FORM');
  db_inst      VARCHAR2(20) := NAME_IN('GLOBAL.INST');
  cur_rel      VARCHAR2(20) := NAME_IN('CURRENT_RELEASE');
  vpdi_value   VARCHAR2(20) := NAME_IN('GLOBAL.DEFAULT_INSTITUTION_CODE');
  mod_id_value VARCHAR2(30);
  qf_status    VARCHAR2(60);
--
BEGIN
  G$_CREATE_METADATA;
--
-- Retrieve the current window's title.  If the window name being 
-- passed in is null, assume it to be the ROOT_WINDOW or MAIN_WINDOW.
--
  IF event_win IS NULL OR
     event_win IN ('G$_OPT_WINDOW','G$_MESSAGE_WINDOW','FORMS_MDI_WINDOW') THEN
    win_id := G$_FIND_WINDOW_ID;
  ELSE
    win_id := FIND_WINDOW(event_win);
  END IF;
--
-- 60-5 begin  if window is MAIN_WINDOW, replace title bar description
--             specified in Form Builder with value from database
--
  MAIN_WIN_ID := FIND_WINDOW('MAIN_WINDOW');
  IF ID_NULL(MAIN_WIN_ID) THEN
    NULL;
  ELSE
  	IF event_win = 'MAIN_WINDOW' OR
  	   event_win IS NULL THEN
      WIN_TITLE := G$_GET_MAIN_WINDOW_TITLE;
  	  IF WIN_TITLE <> 'NotFound' THEN
        SET_WINDOW_PROPERTY('MAIN_WINDOW',TITLE,G$_GET_MAIN_WINDOW_TITLE);
  	  END IF;
  	END IF;
  END IF;
--
-- 60-5 end
  win_title := GET_WINDOW_PROPERTY(win_id,TITLE);
--
--  If window title is null, return without doing anything.
--
  IF win_title IS NOT NULL THEN
--
-- Append the form name to the title.
--
    IF INSTR(win_title,cur_form) <= 0 THEN
      IF G$_TOOLBAR.READ_VALUE('FORM_NAME') = 'YES' THEN
        win_title := win_title || '  ' || cur_form;
      END IF;
    END IF;
--
-- Append the release number to the title.
--
    IF INSTR(win_title,cur_rel) <= 0 THEN
      IF G$_TOOLBAR.READ_VALUE('RELEASE') = 'YES' THEN
        win_title := win_title || '  ' || cur_rel;
      END IF;
    END IF;
--
-- Append the mod id to the title.
--
    IF NOT ID_NULL(FIND_ITEM('FORM_HEADER.MOD_ID')) THEN
      mod_id_value := NAME_IN('FORM_HEADER.MOD_ID');
      IF INSTR(win_title,'[' || mod_id_value || ']') <= 0 THEN
      	IF G$_TOOLBAR.READ_VALUE('RELEASE') = 'YES' THEN
          IF mod_id_value IS NOT NULL THEN
            win_title := win_title || '  [' || mod_id_value || ']';
          END IF;
        END IF;
      END IF;
    END IF;
--
-- Append the inst global to the title.
--
    IF db_inst IS NOT NULL THEN
      db_inst := '(' || db_inst || ')';
      IF INSTR(win_title,db_inst) <= 0 THEN
        IF G$_TOOLBAR.READ_VALUE('DBASE_INST') = 'YES' THEN 
          win_title := win_title || '  ' || db_inst;
        END IF;
      END IF;
    END IF;
--
-- Append the vpdi code to the title.
--
    IF vpdi_value IS NOT NULL THEN
      vpdi_value := '(' || vpdi_value || ')';
--
      IF INSTR(win_title,vpdi_value) <= 0 THEN
        IF G$_TOOLBAR.READ_VALUE('DBASE_INST') = 'YES' THEN 
          IF G$_VPDI.IS_FORM_VPDI_ENABLED(cur_form) THEN
            win_title := win_title || '  ' || vpdi_value || '::' || G$_VPDI.find_vpdi(cur_form);
          ELSE
            win_title := win_title || '  ' || vpdi_value;
          END IF;
        END IF;
--
      ELSE
        IF G$_VPDI.IS_FORM_VPDI_ENABLED(cur_form) THEN
          win_title := SUBSTR(win_title,1,INSTR(win_title,'::') + 1 ) || G$_VPDI.find_vpdi(cur_form); 
        END IF;        
      END IF;
    END IF;    
--
-- Add on quick flow status.
--
    qf_status := NAME_IN('GLOBAL.QF_STATUS');
    IF qf_status IS NOT NULL THEN
      IF INSTR(win_title,qf_status) <= 0 THEN
        win_title := win_title || '  ' || qf_status;
      END IF;
    END IF;
--
-- Reset title.
--
    SET_WINDOW_PROPERTY(win_id,TITLE,win_title);
  END IF;
--
END;
	*/
	/* <p>
/* </p>
		*/
		public void gSetInstProperty()
		{
			// 
			NString winTitle= NString.getNull();
			WindowDescriptor winId= null;
			WindowDescriptor mainWinId= null;
			// 
			NString eventWin = getCurrentWindow();
			NString curForm = getCurrentTaskName();
			NString dbInst = getNameIn("GLOBAL.INST");
			NString curRel = getNameIn("CURRENT_RELEASE");
			NString vpdiValue = getNameIn("GLOBAL.DEFAULT_INSTITUTION_CODE");
			NString modIdValue= NString.getNull();
			NString qfStatus= NString.getNull();
			gCreateMetadata();
			// 
			//  Retrieve the current window's title.  If the window name being 
			//  passed in is null, assume it to be the ROOT_WINDOW or MAIN_WINDOW.
			// 
			if ( eventWin.isNull() || in(eventWin, "G$_OPT_WINDOW", "G$_MESSAGE_WINDOW", "FORMS_MDI_WINDOW").getValue() )
			{
				winId = gFindWindowId();
			}
			else {
				winId = findWindow(eventWin);
			}
			// 
			//  60-5 begin  if window is MAIN_WINDOW, replace title bar description
			//              specified in Form Builder with value from database
			// 
			mainWinId = findWindow("MAIN_WINDOW");
			if ( (mainWinId == null) )
			{
			}
			else {
				if ( eventWin.equals("MAIN_WINDOW") || eventWin.isNull() )
				{
					winTitle = gGetMainWindowTitle();
					if ( winTitle.notEquals("NotFound") )
					{
						setWindowTitle("MAIN_WINDOW", winTitle);
					}
				}
			}
			// 
			//  60-5 end
			winTitle = toStr(getWindowTitle(winId));
			// 
			//   If window title is null, return without doing anything.
			// 
			if ( !winTitle.isNull() )
			{
				// 
				//  Append the form name to the title.
				// 
				if ( inStr(winTitle, curForm).lesserOrEquals(0) )
				{
					if ( getGToolbar().readValue(toStr("FORM_NAME")).equals("YES") )
					{
						winTitle = winTitle.append("  ").append(curForm);
					}
				}
				// 
				//  Append the release number to the title.
				// 
				if ( inStr(winTitle, curRel).lesserOrEquals(0) )
				{
					if ( getGToolbar().readValue(toStr("RELEASE")).equals("YES") )
					{
						winTitle = winTitle.append("  ").append(curRel);
					}
				}
				// 
				//  Append the mod id to the title.
				// 
				if ( !(findItem(toStr("FORM_HEADER.MOD_ID")) == null) )
				{
					modIdValue = getNameIn("FORM_HEADER.MOD_ID");
					if ( inStr(winTitle, toStr("[").append(modIdValue).append("]")).lesserOrEquals(0) )
					{
						if ( getGToolbar().readValue(toStr("RELEASE")).equals("YES") )
						{
							if ( !modIdValue.isNull() )
							{
								winTitle = winTitle.append("  [").append(modIdValue).append("]");
							}
						}
					}
				}
				// 
				//  Append the inst global to the title.
				// 
				if ( !dbInst.isNull() )
				{
					dbInst = toStr("(").append(dbInst).append(")");
					if ( inStr(winTitle, dbInst).lesserOrEquals(0) )
					{
						if ( getGToolbar().readValue(toStr("DBASE_INST")).equals("YES") )
						{
							winTitle = winTitle.append("  ").append(dbInst);
						}
					}
				}
				// 
				//  Append the vpdi code to the title.
				// 
				if ( !vpdiValue.isNull() )
				{
					vpdiValue = toStr("(").append(vpdiValue).append(")");
					// 
					if ( inStr(winTitle, vpdiValue).lesserOrEquals(0) )
					{
						if ( getGToolbar().readValue(toStr("DBASE_INST")).equals("YES") )
						{
							if ( getGVpdi().isFormVpdiEnabled(curForm).getValue() )
							{
								winTitle = winTitle.append("  ").append(vpdiValue).append("::").append(getGVpdi().findVpdi(curForm));
							}
							else {
								winTitle = winTitle.append("  ").append(vpdiValue);
							}
						}
					}
					else {
						if ( getGVpdi().isFormVpdiEnabled(curForm).getValue() )
						{
							winTitle = substring(winTitle, toInt(1), inStr(winTitle, toStr("::")).add(1)).append(getGVpdi().findVpdi(curForm));
						}
					}
				}
				// 
				//  Add on quick flow status.
				// 
				qfStatus = getNameIn("GLOBAL.QF_STATUS");
				if ( !qfStatus.isNull() )
				{
					if ( inStr(winTitle, qfStatus).lesserOrEquals(0) )
					{
						winTitle = winTitle.append("  ").append(qfStatus);
					}
				}
				// 
				//  Reset title.
				// 
				setWindowTitle(winId, winTitle);
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_SETMENU
	/*
	PROCEDURE G$_SETMENU (MENUITEM VARCHAR2, SETVALUE NUMBER) IS
<multilinecomment> To disable or enable a menu item when passed a
valid menu item name.  When SETVALUE is passed 0 the menu
item is disabled otherwise the menu item is enabled.
</multilinecomment>
BEGIN
  IF SETVALUE = 0 THEN
    SET_MENU_ITEM_PROPERTY(MENUITEM,ENABLED,PROPERTY_OFF);
  ELSE
    SET_MENU_ITEM_PROPERTY(MENUITEM,ENABLED,PROPERTY_ON);
  END IF;
END;
	*/
	/* <p>
/* </p>
		* @param menuitem
		* @param setvalue
		*/
		public void gSetmenu(NString menuitem, NNumber setvalue)
		{
			if ( setvalue.equals(0) )
			{
				setMenuItemEnabled(menuitem, false);
			}
			else {
				setMenuItemEnabled(menuitem, true);
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_SETITEM
	/*
	PROCEDURE G$_SETITEM(ITEMNAME VARCHAR2, SETVALUE NUMBER) IS
<multilinecomment> (FORMS40) To disable or enable an item when passed a valid item name.
   When SETVALUE is passed 0 the item is disabled otherwise the item is 
   enabled. </multilinecomment>
  ITM_ID ITEM;
BEGIN
  ITM_ID := FIND_ITEM(ITEMNAME);
  IF ID_NULL(ITM_ID) THEN
    RETURN;
  END IF;
--
  IF SETVALUE = 0 THEN
    SET_ITEM_PROPERTY(ITM_ID,ENABLED,PROPERTY_OFF);
  ELSE
    SET_ITEM_PROPERTY(ITM_ID,ENABLED,PROPERTY_ON);
  END IF;
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itemname
		* @param setvalue
		*/
		public void gSetitem(NString itemname, NNumber setvalue)
		{
			//  (FORMS40) To disable or enable an item when passed a valid item name.
			// When SETVALUE is passed 0 the item is disabled otherwise the item is
			// enabled. 
			ItemDescriptor itmId= null;
			itmId = findItem(itemname);
			if ( (itmId == null) )
			{
				return ;
			}
			// 
			if ( setvalue.equals(0) )
			{
				setItemEnabled(itmId, false);
			}
			else {
				setItemEnabled(itmId, true);
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_SEL_SPRIDEN_PIDM_NAME
	/*
	PROCEDURE G$_SEL_SPRIDEN_PIDM_NAME (p_ID            IN OUT VARCHAR2,
                                    p_FIELD_NAME    IN     VARCHAR2,
                                    p_MI            IN     VARCHAR2,
                                    p_PIDM          IN OUT NUMBER,
                                    p_CHECK_VALUE   IN     VARCHAR2 DEFAULT 'NNNNN',
                                    p_ID_TYPE       IN     VARCHAR2 DEFAULT 'ANY') IS
  -- Local variables                                    
  lv_full_name     VARCHAR2(300) := NULL;
  lv_org_id        SPRIDEN.SPRIDEN_ID%TYPE := p_ID;
  lv_confid_ind    VARCHAR2(30) := NULL;   
  lv_dcsd_ind      VARCHAR2(30) := NULL;   
  lv_check_value   VARCHAR2(30) := UPPER(p_CHECK_VALUE);        
BEGIN
  COPY('','GLOBAL.NEW_ID');

  IF lv_check_value = 'PREV_ID_REMOVED' THEN
    lv_check_value := 'NNNYY';
  ELSE
    lv_check_value := 'NNNYN';
  END IF;

  G$_VALID_ALL_ID(p_ID, p_PIDM, lv_full_name, lv_confid_ind, lv_dcsd_ind, 
                  lv_check_value, p_ID_TYPE, GET_ITEM_PROPERTY(p_FIELD_NAME, MAX_LENGTH));

  IF lv_full_name IS NULL THEN
    -- ID is not found
    COPY('', p_FIELD_NAME) ;
    p_PIDM := '' ;
  ELSE
    -- ID is found
    IF lv_org_id <> p_ID THEN
      COPY(p_ID, 'GLOBAL.NEW_ID');      
    END IF;
    COPY(lv_full_name, p_FIELD_NAME);
  END IF;
END;
	*/
	/* <p>
/* </p>
		* @param pId
		* @param pFieldName
		* @param pMi
		* @param pPidm
		*/
		public void gSelSpridenPidmName(Ref<NString> pId, NString pFieldName, NString pMi, Ref<NNumber> pPidm) {
			gSelSpridenPidmName(pId, pFieldName, pMi, pPidm, toStr("NNNNN"), toStr("ANY"));
		}

/* <p>
/* </p>
		* @param pId
		* @param pFieldName
		* @param pMi
		* @param pPidm
		* @param pCheckValue
		*/
		public void gSelSpridenPidmName(Ref<NString> pId, NString pFieldName, NString pMi, Ref<NNumber> pPidm, NString pCheckValue) {
			gSelSpridenPidmName(pId, pFieldName, pMi, pPidm, pCheckValue, toStr("ANY"));
		}

/* <p>
/* </p>
		* @param pId
		* @param pFieldName
		* @param pMi
		* @param pPidm
		* @param pCheckValue
		* @param pIdType
		*/
		public void gSelSpridenPidmName(Ref<NString> pId, NString pFieldName, NString pMi, Ref<NNumber> pPidm, NString pCheckValue, NString pIdType)
		{
			//  Local variables                                    
			NString lvFullName = NString.getNull();
			NString lvOrgId = pId.val;
			NString lvConfidInd = NString.getNull();
			NString lvDcsdInd = NString.getNull();
			NString lvCheckValue = upper(pCheckValue);
			copy("","GLOBAL.NEW_ID");
			if ( lvCheckValue.equals("PREV_ID_REMOVED") )
			{
				lvCheckValue = toStr("NNNYY");
			}
			else {
				lvCheckValue = toStr("NNNYN");
			}
			Ref<NString> pFullName_ref = new Ref<NString>(lvFullName);
			Ref<NString> pConfidInd_ref = new Ref<NString>(lvConfidInd);
			Ref<NString> pDcsdInd_ref = new Ref<NString>(lvDcsdInd);
			gValidAllId(pId, pPidm, pFullName_ref, pConfidInd_ref, pDcsdInd_ref, lvCheckValue, pIdType, toInt(findItem(pFieldName).getMaxLength()));
			lvFullName = pFullName_ref.val;
			lvConfidInd = pConfidInd_ref.val;
			lvDcsdInd = pDcsdInd_ref.val;
			
			if ( lvFullName.isNull() )
			{
				//  ID is not found
				copy("",pFieldName);
				pPidm.val = toNumber("");
			}
			else {
				//  ID is found
				if ( lvOrgId.notEquals(pId.val) )
				{
					copy(pId.val,"GLOBAL.NEW_ID");
				}
				copy(lvFullName,pFieldName);
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_SEL_SPRIDEN_ID_NAME
	/*
	PROCEDURE G$_SEL_SPRIDEN_ID_NAME(p_PIDM        IN     NUMBER,
                                 p_FIELD_NAME  IN     VARCHAR2,
                                 p_MI          IN     VARCHAR2,
                                 p_ID          IN OUT VARCHAR2) IS
  -- Local variables                                 
  lv_full_name      VARCHAR2(300) := NULL;      
  lv_surname_prefix SPRIDEN.SPRIDEN_SURNAME_PREFIX%TYPE := NULL;
  lv_last_name      SPRIDEN.SPRIDEN_LAST_NAME%TYPE := NULL;
  lv_first_name     SPRIDEN.SPRIDEN_FIRST_NAME%TYPE := NULL;
  lv_mi_name        SPRIDEN.SPRIDEN_MI%TYPE := NULL;
  lv_name_prefix    SPBPERS.SPBPERS_NAME_PREFIX%TYPE := NULL;
  lv_name_suffix    SPBPERS.SPBPERS_NAME_SUFFIX%TYPE := NULL;
  --
  CURSOR SEL_ID_NAME IS
    SELECT SPRIDEN_ID, SPRIDEN_SURNAME_PREFIX,
           SPRIDEN_LAST_NAME, SPRIDEN_FIRST_NAME, SPRIDEN_MI, 
           SPBPERS_NAME_PREFIX, SPBPERS_NAME_SUFFIX
    FROM   SPRIDEN, SPBPERS
    WHERE  SPRIDEN_PIDM = p_PIDM
      AND  SPRIDEN_CHANGE_IND IS NULL
      AND  SPRIDEN_PIDM = SPBPERS_PIDM(+);
BEGIN
  OPEN SEL_ID_NAME;
  FETCH SEL_ID_NAME INTO p_ID, lv_surname_prefix, lv_last_name, lv_first_name, lv_mi_name, 
                         lv_name_prefix, lv_name_suffix;
  CLOSE SEL_ID_NAME;
  
  G$_BUILD_FULL_NAME(lv_full_name, lv_last_name, lv_first_name, lv_mi_name, 
    lv_name_prefix, lv_name_suffix, GET_ITEM_PROPERTY(p_FIELD_NAME, MAX_LENGTH), lv_surname_prefix);

  COPY(lv_full_name, p_FIELD_NAME);
END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pPidm
		* @param pFieldName
		* @param pMi
		* @param pId
		*/
		public void gSelSpridenIdName(NNumber pPidm, NString pFieldName, NString pMi, Ref<NString> pId)
		{
			int rowCount = 0;
			//  Local variables                                 
			NString lvFullName = NString.getNull();
			NString lvSurnamePrefix = NString.getNull();
			NString lvLastName = NString.getNull();
			NString lvFirstName = NString.getNull();
			NString lvMiName = NString.getNull();
			NString lvNamePrefix = NString.getNull();
			NString lvNameSuffix = NString.getNull();
			String sqlselIdName = "SELECT SPRIDEN_ID, SPRIDEN_SURNAME_PREFIX, SPRIDEN_LAST_NAME, SPRIDEN_FIRST_NAME, SPRIDEN_MI, SPBPERS_NAME_PREFIX, SPBPERS_NAME_SUFFIX " +
	" FROM SPRIDEN, SPBPERS " +
	" WHERE SPRIDEN_PIDM = :P_P_PIDM AND SPRIDEN_CHANGE_IND IS NULL AND SPRIDEN_PIDM = SPBPERS_PIDM(+) ";
			DataCursor selIdName = new DataCursor(sqlselIdName);
			try {
				//Setting query parameters
				selIdName.addParameter("P_P_PIDM", pPidm);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable selIdName.
				selIdName.open();
				ResultSet selIdNameResults = selIdName.fetchInto();
				if ( selIdNameResults != null ) {
					pId.val = selIdNameResults.getStr(0);
					lvSurnamePrefix = selIdNameResults.getStr(1);
					lvLastName = selIdNameResults.getStr(2);
					lvFirstName = selIdNameResults.getStr(3);
					lvMiName = selIdNameResults.getStr(4);
					lvNamePrefix = selIdNameResults.getStr(5);
					lvNameSuffix = selIdNameResults.getStr(6);
				}
				selIdName.close();

				Ref<NString> pFullName_ref = new Ref<NString>(lvFullName);
				gBuildFullName(pFullName_ref, lvLastName, lvFirstName, lvMiName, lvNamePrefix, lvNameSuffix, toInt(findItem(pFieldName).getMaxLength()), lvSurnamePrefix);
				lvFullName = pFullName_ref.val;
								
				copy(lvFullName,pFieldName);
				}finally{
					selIdName.close();
				}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_SEL_SPRIDEN_ID
	/*
	FUNCTION G$_SEL_SPRIDEN_ID(PIDM_IN IN NUMBER,
                           ID_OUT  IN OUT VARCHAR2) RETURN BOOLEAN IS
<multilinecomment> 
  This function will simply return the current ID for the
  PIDM argument passed when invoked. This calls the GB_COMMON.F_GET_ID api.
  
  This Procedure (Function) will also return a boolean cursor attribute.
</multilinecomment>
--
BEGIN
  ID_OUT := gb_common.f_get_id(PIDM_IN);
--
  RETURN(ID_OUT IS NULL);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pidmIn
		* @param idOut
		*/
		public NBool gSelSpridenId(NNumber pidmIn, Ref<NString> idOut)
		{
			idOut.val = GbCommon.fGetId(pidmIn);
			// 
			return toBool((idOut.val.isNull()));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_SEL_SOBSEQN_MAXSEQNO
	/*
	FUNCTION G$_SEL_SOBSEQN_MAXSEQNO (IVAR_1 VARCHAR2, OVAR_1 IN OUT NUMBER)
   RETURN BOOLEAN IS
   <multilinecomment> This Procedure (Function) will return the current sequence
      number in table SOBSEQN for the sobseqn_function argument
      that is passed when invoked. This Procedure (Function) will
      also return a boolean cursor attribute.
   </multilinecomment>
      CURSOR MAXSEQNO_CURSOR (cp_var VARCHAR2) IS
        SELECT SOBSEQN_MAXSEQNO
          FROM SOBSEQN
         WHERE SOBSEQN_FUNCTION = cp_var 
           FOR UPDATE OF SOBSEQN_MAXSEQNO;
BEGIN
  OPEN MAXSEQNO_CURSOR(IVAR_1);
  FETCH MAXSEQNO_CURSOR INTO OVAR_1;
  IF MAXSEQNO_CURSOR%NOTFOUND THEN
    CLOSE MAXSEQNO_CURSOR;
    RETURN(TRUE);
  END IF;
--
  CLOSE MAXSEQNO_CURSOR;
  RETURN(FALSE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param ivar1
		* @param ovar1
		*/
		public NBool gSelSobseqnMaxseqno(NString ivar1, Ref<NNumber> ovar1)
		{
			int rowCount = 0;
			String sqlmaxseqnoCursor = "SELECT SOBSEQN_MAXSEQNO " +
	" FROM SOBSEQN " +
	" WHERE SOBSEQN_FUNCTION = :P_CP_VAR ";
			DataCursor maxseqnoCursor = new DataCursor(sqlmaxseqnoCursor);
			NString cpVar = NString.getNull();
			try {
				cpVar=ivar1;
				//Setting query parameters
				maxseqnoCursor.addParameter("P_CP_VAR", cpVar);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable maxseqnoCursor.
				maxseqnoCursor.open();
				ResultSet maxseqnoCursorResults = maxseqnoCursor.fetchInto();
				if ( maxseqnoCursorResults != null ) {
					ovar1 = new Ref<NNumber>( maxseqnoCursorResults.getNumber(0));
				}
				if ( maxseqnoCursor.notFound() )
				{
					maxseqnoCursor.close();
					return  toBool(((NBool.True)));
				}
				// 
				maxseqnoCursor.close();
				return  toBool(((NBool.False)));
				}finally{
					maxseqnoCursor.close();
				}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_SECURED_FORM_CALL_PL
	/*
	PROCEDURE G$_SECURED_FORM_CALL_PL (USER_IN        IN VARCHAR2,
                                   FORM_NAME_IN   IN VARCHAR2,
                                   PARM_LIST_IN   IN PARAMLIST,
                                   MODE_IN        IN VARCHAR2 := NULL) IS
<multilinecomment> 
Invoke this procedure with <user> or global.CURRENT_USER and <form> 
or global.secrfrm.  Optionally enter a parameter list name as the third 
arguement and <mode> or NULL as the fourth argument.  If you do not want a
parameter list, use NULL as the third parameter.  The mode is to control
how the form is called.  The default mode (null) is NO_QUERY and NO_HIDE.  
Valid modes are NEW, NEW_QUERY, QUERY, QUERY_NOHIDE, QUERY_HIDE, HIDE, 
and NOHIDE.

IE:
   G$_SECURED_FORM_CALL_PL('CIMSUSR','CBAACCD',NULL);
     OR  
   G$_SECURED_FORM_CALL_PL(global.CURRENT_USER,global.secrfrm,'');
</multilinecomment>
--
  ADD_Q          VARCHAR2(1);
  LV_OBJ_UI_VERSION VARCHAR2(1);
  CALL_MODE      VARCHAR2(30);
  CUR_OPEN_FORMS VARCHAR2(2000);
  CUR_OBJECT     VARCHAR2(30) := NAME_IN('SYSTEM.CURRENT_FORM');
  HOLD_MODE      VARCHAR2(30) := NVL(UPPER(MODE_IN),'HIDE');
  HOLD_ROLE      VARCHAR2(30);
  INIT_FORM      VARCHAR2(30);
  INIT_GLOBAL    VARCHAR2(30);
  INIT_VALUE     VARCHAR2(30);
--
  CUR_FORMS      PLS_INTEGER;
  MAX_FORMS      PLS_INTEGER;
  STATUS_IND     PLS_INTEGER;
--
  FORM_ID        FORMMODULE;
  MI_ID          MENUITEM;
--
  CUR_FORM_ID    FORMMODULE;
  LAST_FORM_ID   VARCHAR2(300);
  FORM_ID_STR    VARCHAR2(300);
--
BEGIN
--
-- If global is null, call routines to populate.
--
  DEFAULT_VALUE('','GLOBAL.DISABLE_EXTQRY');
  DEFAULT_VALUE('','GLOBAL.INST_CALL_QUERY');
  DEFAULT_VALUE('','GLOBAL.FORMID');
--
  IF NAME_IN('GLOBAL.DISABLE_EXTQRY') IS NULL THEN
    IF G$_CHECK_ACCESS('EXTENDED_QUERY',USER_IN) THEN
      COPY('N','GLOBAL.DISABLE_EXTQRY');
    ELSE
      COPY('Y','GLOBAL.DISABLE_EXTQRY');
    END IF;
  END IF;
--
  IF NAME_IN('GLOBAL.INST_CALL_QUERY') IS NULL THEN
    COPY(G$_SECURITY.G$_GET_PROFILE_INFO_FNC('CALL_QUERY'),'GLOBAL.INST_CALL_QUERY');
  END IF;
-- --
  LV_OBJ_UI_VERSION := G$_CHK_AUTH.G$_GET_OBJ_UI_VERSION_FNC(FORM_NAME_IN);
  IF LV_OBJ_UI_VERSION IN ('C','E') THEN
  	IF LV_OBJ_UI_VERSION = 'E' AND
       NAME_IN('GLOBAL.BANNER_XE_MODE') = 'Y' THEN  
      MESSAGE(G$_NLS.Get('GOQRPLS-0141','LIB','*ERROR* Object %01% is no longer authorized for INB access. Please use '||
                                        'the unified menu to access this Object.',FORM_NAME_IN),ACKNOWLEDGE);
  	ELSE
      MESSAGE(G$_NLS.Get('GOQRPLS-0142','LIB','*ERROR* Object %01% is no longer authorized for INB access',FORM_NAME_IN),ACKNOWLEDGE);
    END IF;
    MESSAGE(' ');
    EXECUTE_TRIGGER('G$_VERIFY_ACCESS');
    G$_CHECK_FAILURE;
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
-- --
-- Check whether or not a maximum number of open forms has
-- been set and if so, has the user reached the limit.
--
  MAX_FORMS := TO_NUMBER(NVL(NAME_IN('GLOBAL.MAX_NO_FORMS'),0));
  CUR_FORMS := TO_NUMBER(NVL(NAME_IN('GLOBAL.CURR_NO_FORMS'),0));
  CUR_OPEN_FORMS := NAME_IN('GLOBAL.CURR_OPEN_FORMS');
--
  IF MAX_FORMS > 0 THEN
    IF CUR_FORMS + 1 > MAX_FORMS THEN
      MESSAGE(G$_NLS.GET('GOQRPLS-0143','LIB',
	       'Organization''s maximum number (%01%) of current open forms has been reached.',
         TO_CHAR(CUR_FORMS)));
      MESSAGE(G$_NLS.GET('GOQRPLS-0144','LIB','Current open forms: %01%',CUR_OPEN_FORMS),ACKNOWLEDGE);
      EXECUTE_TRIGGER('G$_VERIFY_ACCESS');
      G$_CHECK_FAILURE;
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END IF; 
--
  IF NOT G$_CHK_AUTH.G$_CHECK_VALID_OBJ_FNC(FORM_NAME_IN) THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0145','LIB','*ERROR* Unable to call invalid object named %01%.',FORM_NAME_IN));
    EXECUTE_TRIGGER('G$_VERIFY_ACCESS');
    G$_CHECK_FAILURE;
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  FORM_ID := FIND_FORM(CUR_OBJECT);
--
  MI_ID := FIND_MENU_ITEM('ICONS.WF_SUBMIT');
  IF NOT ID_NULL(mi_id) THEN
    IF GET_MENU_ITEM_PROPERTY(mi_id,ENABLED) = 'TRUE' THEN
      COPY(CUR_OBJECT || '::' || TO_CHAR(FORM_ID.ID), 'GLOBAL.WF_SUBMIT_ENA_HOLD_FORMID');
    END IF;
  END IF;
--
-- Check whether or not the initialization form for the requested
-- form has been run.  If not, build name and issue call before 
-- any other processing.
--
  G$_XE.JSON_OPENED_FORM(FORM_NAME_IN);
  G$_XE_STATE_MANAGER.FILL_GROUP_BXE_CALL(NAME_IN('SYSTEM.CURRENT_FORM'));
--
  IF NVL(LENGTH(FORM_NAME_IN), 0) = 7 THEN
    INIT_VALUE := SUBSTR(FORM_NAME_IN,1,1);
  ELSE
    INIT_VALUE := SUBSTR(FORM_NAME_IN,1,2);
  END IF;
--
  INIT_GLOBAL := 'GLOBAL.INIT' || INIT_VALUE;
  INIT_FORM   := INIT_VALUE || 'OQMENU';
  DEFAULT_VALUE('N','GLOBAL.INIT' || INIT_VALUE);
--
  IF NVL(NAME_IN(INIT_GLOBAL),'N') <> 'Y' THEN
    IF INSTR(FORM_NAME_IN,'OQMENU') = 0 THEN
      COPY('Y', INIT_GLOBAL);
--
      G$_VPDI.SET_VPDI_ON_INIT( INIT_FORM, NAME_IN('GLOBAL.INSTITUTION_CODE') );      
      SYNCHRONIZE; 
      SYNCHRONIZE;    
      CALL_FORM(INIT_FORM,HIDE,NO_REPLACE,NO_QUERY_ONLY,PARM_LIST_IN); 
      SYNCHRONIZE; 
      SYNCHRONIZE;    
      COPY('Y', INIT_GLOBAL);
--
      COPY('','GLOBAL.WIN_TITLE');
      COPY('','GLOBAL.WIN_X_POS');
      COPY('','GLOBAL.WIN_Y_POX');
    END IF;
  END IF;
--
-- New logic to support call query mode.
--
  HOLD_ROLE := G$_SECURITY.G$_GET_ROLE_FOR_OBJECT_FNC(FORM_NAME_IN,USER_IN);
--
  IF NAME_IN('GLOBAL.INST_CALL_QUERY') = 'Y' THEN
    IF INSTR(HOLD_MODE,'QUERY') = 0 THEN
--
      IF HOLD_ROLE IS NOT NULL AND SUBSTR(HOLD_ROLE,-2,2) = '_Q' THEN
        IF INSTR(HOLD_MODE,'NEW') = 0 THEN
          HOLD_MODE := 'QUERY_' || HOLD_MODE;
        ELSE
          HOLD_MODE := 'NEW_QUERY';
        END IF;
      END IF;
--
    END IF;
  END IF;
--
-- Build list of open forms.
--
  IF FORM_NAME_IN = 'GUAGMNU' THEN
    CUR_OPEN_FORMS := '';
  END IF;
--
  DEFAULT_VALUE('','GLOBAL.MDI_TITLE');
  IF CUR_OBJECT IN ('GUAINIT','GUQSETI') THEN
    COPY(GET_WINDOW_PROPERTY(FORMS_MDI_WINDOW,TITLE),'GLOBAL.MDI_TITLE');
    IF INSTR(NAME_IN('GLOBAL.MDI_TITLE'),':') > 0 THEN
      COPY(SUBSTR(NAME_IN('GLOBAL.MDI_TITLE'),1,INSTR(NAME_IN('GLOBAL.MDI_TITLE'),':')-1),'GLOBAL.MDI_TITLE');
    END IF;
  ELSIF CUR_OBJECT = 'GUAGMNU' THEN
    IF HOLD_MODE NOT IN ('NEW','NEW_QUERY') THEN
      CUR_OPEN_FORMS := ':  Open > ' || FORM_NAME_IN;
    ELSE
      COPY(SUBSTR(NAME_IN('GLOBAL.MDI_TITLE'),1,INSTR(NAME_IN('GLOBAL.MDI_TITLE'),':')-1),'GLOBAL.MDI_TITLE');
    END IF;
  ELSE
    IF SUBSTR(CUR_OPEN_FORMS,-3,3) = '[Q]' THEN
      ADD_Q := 'Y';
    ELSE
      ADD_Q := 'N';
    END IF;
    IF (LENGTH(CUR_OPEN_FORMS) + LENGTH(FORM_NAME_IN) + 1) < 255 THEN
      CUR_OPEN_FORMS := CUR_OPEN_FORMS || ' - ' || FORM_NAME_IN;
    END IF;
  END IF;
--
  IF HOLD_ROLE IS NOT NULL AND SUBSTR(HOLD_ROLE,-2,2) = '_Q' THEN
    IF FORM_NAME_IN <> 'GUAGMNU' THEN
      CUR_OPEN_FORMS := CUR_OPEN_FORMS || ' [Q]';
    END IF;
  ELSIF ADD_Q = 'Y' THEN
    CUR_OPEN_FORMS := CUR_OPEN_FORMS || ' [Q]';
  END IF;
--
-- --
-- --
  IF LENGTH(CUR_OPEN_FORMS) < 255 THEN
  	CUR_FORM_ID := FIND_FORM(NAME_IN('SYSTEM.CURRENT_FORM'));
  	FORM_ID_STR := NAME_IN('GLOBAL.FORMID') ||','||TO_CHAR(CUR_FORM_ID.id);  	
  	COPY(FORM_ID_STR, 'GLOBAL.FORMID');
    COPY(CUR_OPEN_FORMS,'GLOBAL.CURR_OPEN_FORMS');
    SET_WINDOW_PROPERTY(FORMS_MDI_WINDOW,TITLE,NAME_IN('GLOBAL.MDI_TITLE') || CUR_OPEN_FORMS);
  END IF;
-- --
-- --
--
  G$_VPDI.SET_VPDI_ON_INIT(FORM_NAME_IN, NAME_IN('GLOBAL.INSTITUTION_CODE'));  
--
-- Call form in the requested or supported manor.
--
  CASE HOLD_MODE
--
    WHEN 'NEW_QUERY' THEN 
      NEW_FORM(FORM_NAME_IN,NO_ROLLBACK,QUERY_ONLY,PARM_LIST_IN); 
--
    WHEN 'NEW' THEN 
      NEW_FORM(FORM_NAME_IN,NO_ROLLBACK,NO_QUERY_ONLY,PARM_LIST_IN); 
--
    WHEN 'QUERY' THEN 
      CALL_FORM(FORM_NAME_IN,HIDE,NO_REPLACE,QUERY_ONLY,PARM_LIST_IN); 
--
    WHEN 'QUERY_NOHIDE' THEN 
      CALL_FORM(FORM_NAME_IN,NO_HIDE,NO_REPLACE,QUERY_ONLY,PARM_LIST_IN); 
--
    WHEN 'QUERY_HIDE' THEN 
      CALL_FORM(FORM_NAME_IN,HIDE,NO_REPLACE,QUERY_ONLY,PARM_LIST_IN); 
--
    WHEN 'HIDE' THEN 
      CALL_FORM(FORM_NAME_IN,HIDE,NO_REPLACE,NO_QUERY_ONLY,PARM_LIST_IN);
--
    WHEN 'NOHIDE' THEN 
      CALL_FORM(FORM_NAME_IN,NO_HIDE,NO_REPLACE,NO_QUERY_ONLY,PARM_LIST_IN); 
--
    WHEN 'OPEN' THEN 
      OPEN_FORM(FORM_NAME_IN,ACTIVATE,NO_SESSION,PARM_LIST_IN);
--
-- Added this logic to fix problem with hide/nohide from the menu since
-- the size of the menu form is different than the other forms.
--
    ELSE
      CALL_FORM(FORM_NAME_IN,HIDE,NO_REPLACE,NO_QUERY_ONLY,PARM_LIST_IN);
  END CASE;
--
-- Check status and set indicator for use after resetting the title bar.
--
  IF NOT FORM_SUCCESS THEN
    STATUS_IND := 1;
  ELSE
    STATUS_IND := 0;
  END IF;
--
-- Remove form from list of called forms.
--
  IF CUR_OBJECT = 'GUAGMNU' THEN
    CUR_OPEN_FORMS := '';
    FORM_ID_STR := '';
    COPY(FORM_ID_STR,'GLOBAL.FORMID');
    G$_VPDI.SET_MAIN_MENU_WINDOW_TITLE_VPD;
  ELSE
    CUR_FORM_ID := FIND_FORM(NAME_IN('SYSTEM.CURRENT_FORM'));
    FORM_ID_STR := NAME_IN('GLOBAL.FORMID');
    LAST_FORM_ID := SUBSTR(FORM_ID_STR,(INSTR(FORM_ID_STR,',',-1)+1));
    IF LAST_FORM_ID = TO_CHAR(CUR_FORM_ID.id) THEN
    	FORM_ID_STR := NAME_IN('GLOBAL.FORMID');
    	FORM_ID_STR := SUBSTR(FORM_ID_STR,1,INSTR(FORM_ID_STR,',',-1) -1);    
    	COPY(FORM_ID_STR,'GLOBAL.FORMID');  	
      CUR_OPEN_FORMS := SUBSTR(CUR_OPEN_FORMS,1,INSTR(CUR_OPEN_FORMS,' - ',-1) -1);
    END IF;
  END IF;
--
  COPY(CUR_OPEN_FORMS,'GLOBAL.CURR_OPEN_FORMS');
  SET_WINDOW_PROPERTY(FORMS_MDI_WINDOW,TITLE,NAME_IN('GLOBAL.MDI_TITLE') || CUR_OPEN_FORMS);
--
-- Reset form count and listing and re-establish the previous role.
--
  COPY('Y','GLOBAL.SKIP_DECR_CNT');
  EXECUTE_TRIGGER('G$_VERIFY_ACCESS');
  G$_CHECK_FAILURE;
  COPY('N','GLOBAL.SKIP_DECR_CNT');
--
-- Test status of object call.
--
  IF STATUS_IND = 1 THEN
    G$_NAVIGATION_FRAME.RESET_MENU_AFTER_FORM_CALL;
    RAISE FORM_TRIGGER_FAILURE;
  ELSE
    G$_LAST_TEN.LAST_10_UPDATE(FORM_NAME_IN);
  END IF;
--
-- If returning to the calling workflow activity form....re-eanble the wfsubmit and wfrelease
--
  IF NAME_IN('SYSTEM.CURRENT_FORM')||'::'||TO_CHAR(FORM_ID.ID) = NAME_IN('GLOBAL.WF_SUBMIT_ENA_HOLD_FORMID') THEN
    SET_MENU_ITEM_PROPERTY('ICONS.WF_SUBMIT'     ,ENABLED ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('ICONS.WF_RELEASE'    ,ENABLED ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('WORKFLOW.WF_SUBMIT'  ,ENABLED ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('WORKFLOW.WF_RELEASE' ,ENABLED ,PROPERTY_TRUE);
    COPY('','GLOBAL.WF_SUBMIT_ENA_HOLD_FORMID');
  ELSE
    SET_MENU_ITEM_PROPERTY('ICONS.WF_SUBMIT'     ,ENABLED ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('ICONS.WF_RELEASE'    ,ENABLED ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('WORKFLOW.WF_SUBMIT'  ,ENABLED ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('WORKFLOW.WF_RELEASE' ,ENABLED ,PROPERTY_FALSE);	
  END IF;
-- -- --
-- -- --
  IF NAME_IN('GLOBAL.WF_ARGS') IS NOT NULL THEN
    SET_MENU_ITEM_PROPERTY('ICONS.VPDI_EXISTS'   ,ENABLED ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('ICONS.VPDI_EXISTS'   ,LABEL   ,G$_NLS.Get('GOQRPLS-0146','LIB','Multi-Entity Processing not enabled'));
  END IF;
-- -- --
-- -- --
--   IF NAME_IN('GLOBAL.BANNER_XE') IS NOT NULL THEN
--    IF NAME_IN('SYSTEM.CURRENT_FORM') <> NAME_IN('GLOBAL.BANNER_XE') THEN
--      G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
--    ELSE
--      COPY(null,'GLOBAL.BANNER_XE');
--    END IF;
--  END IF;
--
-- Determine if user is doing more then simply exiting the current form.
--
  DEFAULT_VALUE('N','GLOBAL.EXIT_TO_MENU');
  DEFAULT_VALUE('N','GLOBAL.EXIT_BANNER');
-- -- -- --
  IF NAME_IN('GLOBAL.BANNER_XE_MODE') = 'Y' THEN  
    IF NAME_IN('GLOBAL.EXIT_BANNER') != 'Y' THEN
      IF NAME_IN('GLOBAL.BANNER_XE') IS NOT NULL THEN
        IF NAME_IN('SYSTEM.CURRENT_FORM') <> NAME_IN('GLOBAL.BANNER_XE') THEN
          G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
        ELSE
          COPY(null,'GLOBAL.BANNER_XE');
        END IF;
      END IF;
    ELSE
        set_form_property(NAME_IN('system.current_form'),validation,property_false);
        exit_form(no_validate);  
    END IF;
  END IF;
-- -- -- --  
--
-- -- -- --  IF NAME_IN('GLOBAL.EXIT_TO_MENU') = 'Y' THEN
-- -- -- --    IF NAME_IN('SYSTEM.CURRENT_FORM') <> 'GUAGMNU' THEN
-- -- -- --    	G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
-- -- -- --    ELSE
-- -- -- --    	COPY('N','GLOBAL.EXIT_TO_MENU');
-- -- -- --      IF NAME_IN('GLOBAL.EXIT_BANNER') = 'Y' THEN
-- -- -- --        DO_KEY('EXIT_FORM');
-- -- -- --      END IF;
-- -- -- --    END IF;
-- -- -- --  END IF;
-- -- -- --
-- original "Exit to Menu" logic is above - - and is comment out while examining below
-- -- -- --
-- -- -- --
  IF NAME_IN('GLOBAL.EXIT_TO_MENU') = 'Y' THEN
    IF NAME_IN('GLOBAL.BANNER_XE_MODE') = 'Y' THEN  
      IF NAME_IN('SYSTEM.CURRENT_FORM') NOT IN ('GUAGMNU','GUAINIT') THEN
      	G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
      ELSE
    	  COPY('N','GLOBAL.EXIT_TO_MENU');
        IF NAME_IN('GLOBAL.EXIT_BANNER') = 'Y' THEN
          DO_KEY('EXIT_FORM');
        END IF;
      END IF;
    ELSE
      IF NAME_IN('SYSTEM.CURRENT_FORM') <> 'GUAGMNU' THEN
      	G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
      ELSE
    	  COPY('N','GLOBAL.EXIT_TO_MENU');
        IF NAME_IN('GLOBAL.EXIT_BANNER') = 'Y' THEN
          DO_KEY('EXIT_FORM');
        END IF;
      END IF;
    END IF;
  END IF;
-- -- -- --
-- -- -- --      
END;
	*/
	/* <p>
/* </p>
		* @param userIn
		* @param formNameIn
		* @param parmListIn
		*/
		public void gSecuredFormCallPl(NString userIn, NString formNameIn, Hashtable parmListIn) {
			gSecuredFormCallPl(userIn, formNameIn, parmListIn, NString.getNull());
		}

/* <p>
/* </p>
		* @param userIn
		* @param formNameIn
		* @param parmListIn
		* @param modeIn
		*/
		public void gSecuredFormCallPl(final NString userIn, final NString formNameIn, Hashtable parmListIn, NString modeIn)
		{
			// Invoke this procedure with <user> or global.CURRENT_USER and <form>
			// or global.secrfrm.  Optionally enter a parameter list name as the third
			// arguement and <mode> or NULL as the fourth argument.  If you do not want a
			// parameter list, use NULL as the third parameter.  The mode is to control
			// how the form is called.  The default mode (null) is NO_QUERY and NO_HIDE.
			// Valid modes are NEW, NEW_QUERY, QUERY, QUERY_NOHIDE, QUERY_HIDE, HIDE,
			// and NOHIDE.
			// IE:
			// G$_SECURED_FORM_CALL_PL('CIMSUSR','CBAACCD',NULL);
			// OR
			// G$_SECURED_FORM_CALL_PL(global.CURRENT_USER,global.secrfrm,'');
			//
			
			//MORPHIS: This method was splitted in two to allow a continuation via callback when OPEN TASK is used			
			
			final WindowDescriptor main = TaskServices.getWorkspaceTask().findWindow("WORKSPACE_WINDOW");
			
			NString addQ= NString.getNull();
			NString lvObjUiVersion= NString.getNull();
			NString callMode= NString.getNull();
			NString curOpenForms= NString.getNull();
			NString curObject = getCurrentTaskName();
			NString holdMode = isNull(upper(modeIn), "HIDE");
			NString holdRole= NString.getNull();
			NString initForm= NString.getNull();
			NString initGlobal= NString.getNull();
			NString initValue= NString.getNull();
			// 
			NInteger curForms= NInteger.getNull();
			NInteger maxForms= NInteger.getNull();
			NInteger statusInd= NInteger.getNull();
			
			//MORPHIS
			String statusMessage = null;
			
			// 
			//MORPHIS: MENU Logic
			//MenuItemDescriptor miId= null;
			// 
			ITask curFormId= null;
			NString lastFormId= NString.getNull();
			NString formIdStr= NString.getNull();
			// 
			//  If global is null, call routines to populate.
			// 
			setDefaultValue("", "GLOBAL.DISABLE_EXTQRY");
			setDefaultValue("", "GLOBAL.INST_CALL_QUERY");
			setDefaultValue("", "GLOBAL.FORMID");
			// 
			if ( getNameIn("GLOBAL.DISABLE_EXTQRY").isNull() )
			{
				if ( gCheckAccess(toStr("EXTENDED_QUERY"), userIn).getValue() )
				{
					copy("N","GLOBAL.DISABLE_EXTQRY");
				}
				else {
					copy("Y","GLOBAL.DISABLE_EXTQRY");
				}
			}
			// 
			if ( getNameIn("GLOBAL.INST_CALL_QUERY").isNull() )
			{
				copy(GSecurity.FgGetProfileInfoFnc(toStr("CALL_QUERY")),"GLOBAL.INST_CALL_QUERY");
			}
			//  --
			lvObjUiVersion = GChkAuth.gGetObjUiVersionFnc(formNameIn);
			if ( in(lvObjUiVersion, "C", "E").getValue() )
			{
				if ( lvObjUiVersion.equals("E") && getNameIn("GLOBAL.BANNER_XE_MODE").equals("Y") )
				{
					errorMessage(GNls.Fget(toStr("GOQRPLS-0141"), toStr("LIB"), toStr("*ERROR* Object %01% is no longer authorized for INB access. Please use ").append("the unified menu to access this Object."), formNameIn), OutputMessageUserResponse.ACKNOWLEDGE);
				}
				else {
					errorMessage(GNls.Fget(toStr("GOQRPLS-0142"), toStr("LIB"), toStr("*ERROR* Object %01% is no longer authorized for INB access"), formNameIn), OutputMessageUserResponse.ACKNOWLEDGE);
				}
//				message(" ");
				executeAction("G$_VERIFY_ACCESS");
				gCheckFailure();
				throw new ApplicationException();
			}
			//  --
			//  Check whether or not a maximum number of open forms has
			//  been set and if so, has the user reached the limit.
			// 
			maxForms = toInt(isNull(getNameIn("GLOBAL.MAX_NO_FORMS"), 0));
			curForms = toInt(isNull(getNameIn("GLOBAL.CURR_NO_FORMS"), 0));
			curOpenForms = getNameIn("GLOBAL.CURR_OPEN_FORMS");
			// 
			if ( maxForms.greater(0) )
			{
				if ( curForms.add(1).greater(maxForms) )
				{
					warningMessage(GNls.Fget(toStr("GOQRPLS-0143"), toStr("LIB"), toStr("Organization's maximum number (%01%) of current open forms has been reached."), toChar(curForms)));
					warningMessage(GNls.Fget(toStr("GOQRPLS-0144"), toStr("LIB"), toStr("Current open forms: %01%"), curOpenForms), OutputMessageUserResponse.ACKNOWLEDGE);
					executeAction("G$_VERIFY_ACCESS");
					gCheckFailure();
					throw new ApplicationException();
				}
			}
			// 
			if ( GChkAuth.gCheckValidObjFnc(formNameIn).not() )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0145"), toStr("LIB"), toStr("*ERROR* Unable to call invalid object named %01%."), formNameIn));
				executeAction("G$_VERIFY_ACCESS");
				gCheckFailure();
				throw new ApplicationException();
			}
			// 
			
			final ITask formId = findTask(curObject);
			
			//MORPHIS: MENU Logic
			// 
			// F2J_NOT_SUPPORTED : Call to built-in "FIND_MENU_ITEM" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
			//			miId = SupportClasses.FORMS40.FindMenuItem("ICONS.WF_SUBMIT");
			//System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'FIND_MENU_ITEM' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
			//MORPHIS: MENU Logic			
//			if ( !(miId == null) )
//			{
//				if ( getMenuItemEnabled(miId).equals("TRUE") )
//				{
//					copy(curObject.append("::").append(toStr(formId.getName())),"GLOBAL.WF_SUBMIT_ENA_HOLD_FORMID");
//				}
//			}
			
			// 
			//  Check whether or not the initialization form for the requested
			//  form has been run.  If not, build name and issue call before 
			//  any other processing.
			// 
			
			//JOG 06/01/2015 - Banner Guainit replacement
			final boolean topCall = formId.isWorkspace();
			
			getGXe().jsonOpenedForm(formNameIn);
			getGXeStateManager().fillGroupBxeCall(getCurrentTaskName());
			// 
			if ( isNull(length(formNameIn), 0).equals(7) )
			{
				initValue = substring(formNameIn, toInt(1), toInt(1));
			}
			else {
				initValue = substring(formNameIn, toInt(1), toInt(2));
			}
			// 
			if ( topCall ) {
				setGlobal("SELECTFRM", formNameIn);
			}
			
			initGlobal = toStr("GLOBAL.INIT").append(initValue);
			initForm = initValue.append("OQMENU");
			setDefaultValue("N", toStr("GLOBAL.INIT").append(initValue));
			// 
			if ( isNull(getNameIn(initGlobal), "N").notEquals("Y") )
			{
				if ( inStr(formNameIn, toStr("OQMENU")).equals(0) )
				{
					copy("Y",initGlobal);
					// 
					getGVpdi().setVpdiOnInit(initForm, getNameIn("GLOBAL.INSTITUTION_CODE"));

					try{
						callTask(initForm, TaskServices.HIDE, TaskServices.NO_REPLACE, TaskServices.NO_QUERY_ONLY, parmListIn);
					} catch (Exception e){
						initGlobals(initForm);
						
						this.getLogger().trace(this, e.getMessage());
						
					}
					
					copy("Y",initGlobal);
					// 
					copy("","GLOBAL.WIN_TITLE");
					copy("","GLOBAL.WIN_X_POS");
					copy("","GLOBAL.WIN_Y_POX");
				}
			}
			// 
			//  New logic to support call query mode.
			// 
			holdRole = GSecurity.FgGetRoleForObjectFnc(formNameIn, userIn);
			// 
			if ( getNameIn("GLOBAL.INST_CALL_QUERY").equals("Y") )
			{
				if ( inStr(holdMode, toStr("QUERY")).equals(0) )
				{
					// 
					if ( !holdRole.isNull() && substring(holdRole, - (2), toInt(2)).equals("_Q") )
					{
						if ( inStr(holdMode, toStr("NEW")).equals(0) )
						{
							holdMode = toStr("QUERY_").append(holdMode);
						}
						else {
							holdMode = toStr("NEW_QUERY");
						}
					}
				}
			}
			// 
			//  Build list of open forms.
			// 
			if ( formNameIn.equals("GUAGMNU") )
			{
				curOpenForms = toStr("");
			}
			// 
			setDefaultValue("", "GLOBAL.MDI_TITLE");
			
			//MORPHIS: changed this condition to first place because when is a top call the current object (Workspace) is emulating 
			if ( topCall /*curObject.equals("GUAGMNU") */ ) { //JOG
				if ( !in(holdMode, "NEW", "NEW_QUERY").getValue() )
				{
					curOpenForms = toStr(":  Open > ").append(formNameIn);
				}
				else {
					copy(substring(getNameIn("GLOBAL.MDI_TITLE"), toInt(1), inStr(getNameIn("GLOBAL.MDI_TITLE"), toStr(":")).subtract(1)),"GLOBAL.MDI_TITLE");
				}
			}
			else if ( in(curObject, "GUAINIT", "GUQSETI").getValue() )
			{

				//MORPHIS: Workaround				
				//copy(getWindowTitle(formsMdiWindow),"GLOBAL.MDI_TITLE");				
				copy(getWindowTitle(main),"GLOBAL.MDI_TITLE");
				
				if ( inStr(getNameIn("GLOBAL.MDI_TITLE"), toStr(":")).greater(0) )
				{
					copy(substring(getNameIn("GLOBAL.MDI_TITLE"), toInt(1), inStr(getNameIn("GLOBAL.MDI_TITLE"), toStr(":")).subtract(1)),"GLOBAL.MDI_TITLE");
				}
			}
			else {
				if ( substring(curOpenForms, - (3), toInt(3)).equals("[Q]") )
				{
					addQ = toStr("Y");
				}
				else {
					addQ = toStr("N");
				}
				if ( (length(curOpenForms).add(length(formNameIn)).add(1)).lesser(255) )
				{
					curOpenForms = curOpenForms.append(" - ").append(formNameIn);
				}
			}
			// 
			if ( !holdRole.isNull() && substring(holdRole, - (2), toInt(2)).equals("_Q") )
			{
				if ( formNameIn.notEquals("GUAGMNU") )
				{
					curOpenForms = curOpenForms.append(" [Q]");
				}
			}
			else if ( addQ.equals("Y") ) {
				curOpenForms = curOpenForms.append(" [Q]");
			}
			// 
			//  --
			//  --
			if ( length(curOpenForms).lesser(255) )
			{
				curFormId = findTask(getCurrentTaskName());
				formIdStr = getNameIn("GLOBAL.FORMID").append(",").append(toStr(curFormId.getName()));
				copy(formIdStr,"GLOBAL.FORMID");
				copy(curOpenForms,"GLOBAL.CURR_OPEN_FORMS");
				setWindowTitle(main, getNameIn("GLOBAL.MDI_TITLE").append(curOpenForms));
			}
			//  --
			//  --
			// 
			getGVpdi().setVpdiOnInit(formNameIn, getNameIn("GLOBAL.INSTITUTION_CODE"));
			
			//JOG 06/01/2015 - Banner Guainit replacement
			if ( topCall && modeIn.isNull() ) {
				holdMode = toStr("OPEN");
			}
			
			try{
				try {
					
					try{
						executeAction("POST-FORM");
					}catch(Exception e) {}
					// 
					//  Call form in the requested or supported manor.
					// 
					if (holdMode.equals("NEW_QUERY"))
					{
						newTask(formNameIn, TaskServices.NO_ROLLBACK, TaskServices.QUERY_ONLY, parmListIn);
					}
					else if (holdMode.equals("NEW"))
					{
						newTask(formNameIn, TaskServices.NO_ROLLBACK, TaskServices.NO_QUERY_ONLY, parmListIn);
					}
					else if (holdMode.equals("QUERY"))
					{
						callTask(formNameIn, TaskServices.HIDE, TaskServices.NO_REPLACE, TaskServices.QUERY_ONLY, parmListIn);
					}
					else if (holdMode.equals("QUERY_NOHIDE"))
					{
						callTask(formNameIn, TaskServices.NO_HIDE, TaskServices.NO_REPLACE, TaskServices.QUERY_ONLY, parmListIn);
					}
					else if (holdMode.equals("QUERY_HIDE"))
					{
						callTask(formNameIn, TaskServices.HIDE, TaskServices.NO_REPLACE, TaskServices.QUERY_ONLY, parmListIn);
					}
					else if (holdMode.equals("HIDE"))
					{
						callTask(formNameIn, TaskServices.HIDE, TaskServices.NO_REPLACE, TaskServices.NO_QUERY_ONLY, parmListIn);
					}
					else if (holdMode.equals("NOHIDE"))
					{
						callTask(formNameIn, TaskServices.NO_HIDE, TaskServices.NO_REPLACE, TaskServices.NO_QUERY_ONLY, parmListIn);
					}
					else if (holdMode.equals("OPEN"))
					{
						
						openTask(formNameIn, TaskServices.ACTIVATE, TaskServices.NO_SESSION, parmListIn);
						Task openTask = (Task)TaskServices.getCurrentTask();
						boolean failed = openTask == formId;
						
						//MORPHIS: add a callback when task ends
						if ( !failed && !openTask.isEnded() && topCall ) {
							
							//Store callback non final state variables
							final NString p_curOpenForms = curOpenForms;
							final NInteger p_statusInd = statusInd;							

							Object callbackController = new Object() {
								@TaskEndedPos
								public void OpenTask_TaskEndedPos(EventObject args)
								{
									gSecuredFormCallPl_End(formId, formNameIn, main, p_statusInd, null, topCall, p_curOpenForms);
								}
							};
							EventHelper.registerEventListeners(openTask, callbackController);
							return;
						}
					}
					else {
						callTask(formNameIn, TaskServices.HIDE, TaskServices.NO_REPLACE, TaskServices.NO_QUERY_ONLY, parmListIn);
					}
				}
				//MORPHIS: double check in case of exception gets here
				catch(TaskExitException ex) {				
				}
				
				statusInd = toInt(0);
				// 
				//  Check status and set indicator for use after resetting the title bar.
				//
				
			} catch (ApplicationException e) {
				statusInd = toInt(1);			
				statusMessage = e.getMessage();
				//return;
			}
					
			//MORPHIS: default call to continuation method
			gSecuredFormCallPl_End(formId, formNameIn, main, statusInd, statusMessage, topCall, curOpenForms);
			
		}
		
		public void gSecuredFormCallPl_End(ITask formId, NString formNameIn, WindowDescriptor main, NInteger statusInd, String statusMessage, boolean topCall, NString curOpenForms)
		{	
			//These variables are used locally only, the values from the previous part are not relevant
			NString formIdStr;			
			ITask curFormId;
			NString lastFormId;
			
			// 
			//  Remove form from list of called forms.
			// 
			//JOG 06/01/2015 - Banner Guainit replacement
			if ( topCall /*curObject.equals("GUAGMNU")*/ )
			{
				curOpenForms = toStr("");
				formIdStr = toStr("");
				copy(formIdStr,"GLOBAL.FORMID");
				getGVpdi().setMainMenuWindowTitleVpd();
			}
			else {
				curFormId = findTask(getCurrentTaskName());
				formIdStr = getNameIn("GLOBAL.FORMID");
				lastFormId = substring(formIdStr, ((inStr(formIdStr, toStr(","), - (1)).add(1))));
				if ( lastFormId.equals(toStr(curFormId.getName())))
				{
					formIdStr = getNameIn("GLOBAL.FORMID");
					formIdStr = substring(formIdStr, toInt(1), inStr(formIdStr, toStr(","), - (1)).subtract(1));
					copy(formIdStr,"GLOBAL.FORMID");
					curOpenForms = substring(curOpenForms, toInt(1), inStr(curOpenForms, toStr(" - "), - (1)).subtract(1));
				}
			}
			// 
			copy(curOpenForms,"GLOBAL.CURR_OPEN_FORMS");
			setWindowTitle(main, getNameIn("GLOBAL.MDI_TITLE").append(curOpenForms));
			// 
			//  Reset form count and listing and re-establish the previous role.
			// 
			copy("Y","GLOBAL.SKIP_DECR_CNT");
			executeAction("G$_VERIFY_ACCESS");
			gCheckFailure();
			copy("N","GLOBAL.SKIP_DECR_CNT");
			// 
			//  Test status of object call.
			// 
			if ( statusInd.equals(1) )
			{
				getGNavigationFrame().resetMenuAfterFormCall();
				throw new ApplicationException(statusMessage);
			}
			else {
				getGLastTen().last10Update(formNameIn);
			}
			// 
			//  If returning to the calling workflow activity form....re-eanble the wfsubmit and wfrelease
			// 
			if ( getCurrentTaskName().append("::").append(toStr(formId.getName())).equals(getNameIn("GLOBAL.WF_SUBMIT_ENA_HOLD_FORMID")) )
			{
				setMenuItemEnabled("ICONS.WF_SUBMIT", true);
				setMenuItemEnabled("ICONS.WF_RELEASE", true);
				setMenuItemEnabled("WORKFLOW.WF_SUBMIT", true);
				setMenuItemEnabled("WORKFLOW.WF_RELEASE", true);
				copy("","GLOBAL.WF_SUBMIT_ENA_HOLD_FORMID");
			}
			else {
				setMenuItemEnabled("ICONS.WF_SUBMIT", false);
				setMenuItemEnabled("ICONS.WF_RELEASE", false);
				setMenuItemEnabled("WORKFLOW.WF_SUBMIT", false);
				setMenuItemEnabled("WORKFLOW.WF_RELEASE", false);
			}
			//  -- --
			//  -- --
			if ( !getNameIn("GLOBAL.WF_ARGS").isNull() )
			{
				((BaseTask)TaskServices.getCurrentTask()).getMenuServices().setMenuItemEnabled("ICONS.VPDI_EXISTS", false);
				// F2J_NOT_SUPPORTED : The property "MENU_ITEM's LABEL" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
				//				SupportClasses.FORMS40.SetMenuItemProperty("ICONS.VPDI_EXISTS", SupportClasses.Property.LABEL, GNls.Fget(toStr("GOQRPLS-0146"), toStr("LIB"), toStr("Multi-Entity Processing not enabled")));
				System.err.println("// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's LABEL' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
				
			}
			
			
			//  -- --
			//  -- --
			//    IF NAME_IN('GLOBAL.BANNER_XE') IS NOT NULL THEN
			//     IF NAME_IN('SYSTEM.CURRENT_FORM') <> NAME_IN('GLOBAL.BANNER_XE') THEN
			//       G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
			//     ELSE
			//       COPY(null,'GLOBAL.BANNER_XE');
			//     END IF;
			//   END IF;
			// 
			//  Determine if user is doing more then simply exiting the current form.
			// 
			setDefaultValue("N", "GLOBAL.EXIT_TO_MENU");
			setDefaultValue("N", "GLOBAL.EXIT_BANNER");
			//  -- -- --
			if ( getNameIn("GLOBAL.BANNER_XE_MODE").equals("Y") )
			{
				if ( getNameIn("GLOBAL.EXIT_BANNER").notEquals("Y") )
				{
					if ( !getNameIn("GLOBAL.BANNER_XE").isNull() )
					{
						if ( getCurrentTaskName().notEquals(getNameIn("GLOBAL.BANNER_XE")) )
						{
							getGGoqolibKeyTrigger().b2kExitForm();
						}
						else {
							copy(null,"GLOBAL.BANNER_XE");
						}
					}
				}
				else {
					TaskServices.getCurrentTask().setValidationEnabled(false);					
					exitTask(TaskServices.NO_VALIDATE);
				}
			}
			//  -- -- --  
			// 
			//  -- -- --  IF NAME_IN('GLOBAL.EXIT_TO_MENU') = 'Y' THEN
			//  -- -- --    IF NAME_IN('SYSTEM.CURRENT_FORM') <> 'GUAGMNU' THEN
			//  -- -- --    	G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
			//  -- -- --    ELSE
			//  -- -- --    	COPY('N','GLOBAL.EXIT_TO_MENU');
			//  -- -- --      IF NAME_IN('GLOBAL.EXIT_BANNER') = 'Y' THEN
			//  -- -- --        DO_KEY('EXIT_FORM');
			//  -- -- --      END IF;
			//  -- -- --    END IF;
			//  -- -- --  END IF;
			//  -- -- --
			//  original "Exit to Menu" logic is above - - and is comment out while examining below
			//  -- -- --
			//  -- -- --
			if ( getNameIn("GLOBAL.EXIT_TO_MENU").equals("Y") )
			{
				if ( getNameIn("GLOBAL.BANNER_XE_MODE").equals("Y") )
				{
					if ( !in(getCurrentTaskName(), "GUAGMNU", "GUAINIT").getValue() )
					{
						getGGoqolibKeyTrigger().b2kExitForm();
					}
					else {
						copy("N","GLOBAL.EXIT_TO_MENU");
						if ( getNameIn("GLOBAL.EXIT_BANNER").equals("Y") )
						{
							executeAction("EXIT");
						}
					}
				}
				else {
					if ( getCurrentTaskName().notEquals("GUAGMNU") )
					{
						getGGoqolibKeyTrigger().b2kExitForm();
					}
					else {
						copy("N","GLOBAL.EXIT_TO_MENU");
						if ( getNameIn("GLOBAL.EXIT_BANNER").equals("Y") )
						{
							executeAction("EXIT");
						}
					}
				}
			}
		}

	private void initGlobals(NString formNameIn) {
		if (formNameIn.equals("POQMENU")) {
			try{
				executeAction("G$_VERIFY_ACCESS");
				int rowCount = 0;
				NString eclsSecurityInd = NString.getNull();
				NString orgnSecurityInd = NString.getNull();
				NString salaSecurityInd = NString.getNull();
				NString emprSecurityInd = NString.getNull();
				NString displayRateInd = NString.getNull();
				NString califInfo = NString.getNull();
				NString facultyInd = NString.getNull();
				NString coasCode = NString.getNull();
				NString locationInd = NString.getNull();
				NString emprCode = NString.getNull();
				NString emprInd = NString.getNull();
				
				setDefaultValue("", "GLOBAL.KEY_NAME");
				{
					String sqlptiCursor = "SELECT PTRINST_ECLS_SECURITY_IND, PTRINST_ORGN_SECURITY_IND, PTRINST_SALA_SECURITY_IND, PTRINST_EMPR_SECURITY_IND, PTRINST_DISPLAY_RATE_IND, PTRINST_STRS_PERS_DATE, PTRINST_FACULTY_IND " +
	" FROM PTRINST " +
	" WHERE PTRINST_CODE = 'PAYROLL' ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							eclsSecurityInd = ptiCursorResults.getStr(0);
							orgnSecurityInd = ptiCursorResults.getStr(1);
							salaSecurityInd= ptiCursorResults.getStr(2);
							emprSecurityInd= ptiCursorResults.getStr(3);
							displayRateInd= ptiCursorResults.getStr(4);
							califInfo= ptiCursorResults.getStr(5);
							facultyInd= ptiCursorResults.getStr(6);
						}
						this.gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("POQMENU-0000"), toStr("FORM"), toStr(" Record With Key = PAYROLL not found in PTRINST table.")), toBool(NBool.False), toBool(NBool.False), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				{
					String sqlptiCursor = "SELECT NTRINST_COAS_CODE, NTRINST_LOCATION_IND " +
	" FROM NTRINST ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							coasCode = ptiCursorResults.getStr(0);
							locationInd = ptiCursorResults.getStr(1);
						}
						this.gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("POQMENU-0001"), toStr("FORM"), toStr(" No record found in NTRINST table.")), toBool(NBool.False), toBool(NBool.False), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				{
					String sqlptiCursor = "SELECT PTREMPR_CODE " +
	" FROM PTREMPR " +
	" WHERE PTREMPR_DEFAULT_IND = 'Y' ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							emprCode = ptiCursorResults.getStr(0);
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				setDefaultValue(coasCode, "GLOBAL.COAS_CODE");
				setDefaultValue(eclsSecurityInd, "GLOBAL.ECLS_SECURITY_IND");
				setDefaultValue(orgnSecurityInd, "GLOBAL.ORGN_SECURITY_IND");
				setDefaultValue(salaSecurityInd, "GLOBAL.SALA_SECURITY_IND");
				setDefaultValue(emprSecurityInd, "GLOBAL.EMPR_SECURITY_IND");
				setDefaultValue(locationInd, "GLOBAL.LOCATION_IND");
				setDefaultValue(emprCode, "GLOBAL.EMPR_CODE");
				setDefaultValue(null, "GLOBAL.NON_CASH_IND");
				setDefaultValue(displayRateInd, "GLOBAL.DISPLAY_RATE_IND");
				setDefaultValue(califInfo, "GLOBAL.CALIF_INFO");
				setDefaultValue(facultyInd, "GLOBAL.FACULTY_IND");
				setDefaultValue(null, "GLOBAL.GO_TO_BLOCK");
				setDefaultValue(null, "GLOBAL.GO_TO_ITEM");
				setDefaultValue(null, "GLOBAL.ACTION_DATE");
				setDefaultValue(null, "GLOBAL.ACTION_LIST");
				setDefaultValue(null, "GLOBAL.ACTION_ALL");
				setDefaultValue(null, "GLOBAL.REC_STATUS");
				setDefaultValue(null, "GLOBAL.LEAVE_STATUS");
				//  New globals for Web Time Entry and Electronic Approvals.
				setDefaultValue(null, "GLOBAL.TIME_ENTRY_METHOD");
				setDefaultValue(null, "GLOBAL.TIME_ENTRY_ACTION");
				setDefaultValue(null, "GLOBAL.TIME_ENTRY_STATUS");
				setDefaultValue(null, "GLOBAL.SUPERUSER_IND");
				setDefaultValue(null, "GLOBAL.SUPERUSER_LV_IND");
				setDefaultValue(null, "GLOBAL.PHATIME_CHANGE_IND");
				setDefaultValue(null, "GLOBAL.USER_ROLL_IND");
				//  New globals for Core Benifit Deduction
				setDefaultValue(null, "GLOBAL.BDCA_STATUS");
				setDefaultValue(null, "GLOBAL.BDCA_EFFECTIVE_DATE");
				//  New global for Job Progression 
				setDefaultValue(null, "GLOBAL.JOBP_CODE");
				//  New globals for Direct Deposit on Demand
				setDefaultValue(null, "GLOBAL.BANK_CODE");
				setDefaultValue(null, "GLOBAL.BANK_ACCT_NO");
				setDefaultValue(null, "GLOBAL.BANK_ACCT_TYPE");
				//  New global for Third Party Interface
				setDefaultValue(null, "GLOBAL.TPCD_CODE");
				//  New global for W2
				setDefaultValue(null, "GLOBAL.W2_SEQ_NO");
				//  New global for Assocaited Term
				setDefaultValue(null, "GLOBAL.ATRM_CODE");
				//  New globals for Automated Faculty Load and Compensation
				setDefaultValue(null, "GLOBAL.KEY_TERM ");
				setDefaultValue(null, "GLOBAL.KEY_COLL");
				setDefaultValue(null, "GLOBAL.KEY_CAMP");
				setDefaultValue(null, "GLOBAL.KEY_FCNT");
				//  New global for Effort Certification
				setDefaultValue(null, "GLOBAL.ECPD_CODE");
				{
					String sqlptiCursor = "SELECT GUBINST_HIGHED_GOVT_IND " +
	" FROM GUBINST " +
	" WHERE UPPER(GUBINST_KEY) = 'INST' ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							emprInd = ptiCursorResults.getStr(0);
						}
						if ((ptiCursor.notFound()))
						{
							warningMessage(GNls.Fget(toStr("POQMENU-0002"), toStr("FORM"), toStr("Control record with KEY = INST not found in GUBINST table.")));
							throw new ApplicationException();
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				setDefaultValue(emprInd, "GLOBAL.EMPR_IND");
				// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
				// added this three lines VR  
				
			} finally {
				executeAction("G$_REVOKE_ACCESS");
			}
		} else if (formNameIn.equals("NOQMENU")) {
			try{
				executeAction("G$_VERIFY_ACCESS");
				NString emprInd = NString.getNull();
				NString coasCode = NString.getNull();
				NString locationInd = NString.getNull();
				NString approvalsInd = NString.getNull();
				NString nbrjobsFutureChgInd = NString.getNull();
				NString budgetInd = NString.getNull();
				NString eclsSecurityInd = NString.getNull();
				NString orgnSecurityInd = NString.getNull();
				NString salaSecurityInd = NString.getNull();
				NString emprSecurityInd = NString.getNull();
				NString emprCode = NString.getNull();
				
				setDefaultValue("", "GLOBAL.KEY_PIDM");
				
				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT GUBINST_HIGHED_GOVT_IND " +
	" FROM GUBINST " +
	" WHERE UPPER(GUBINST_KEY) = 'INST' ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							emprInd = ptiCursorResults.getStr(0);
						}
						if ((ptiCursor.notFound()))
						{
							warningMessage(GNls.Fget(toStr("NOQMENU-0000"), toStr("FORM"), toStr("Control record with KEY = INST not found in GUBINST table.")));
							throw new ApplicationException();
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				setDefaultValue(emprInd, "GLOBAL.EMPR_IND");
				
				rowCount = 0;
				String sql1 = "SELECT NTRINST_COAS_CODE, NTRINST_LOCATION_IND, NTRINST_APPROVALS_IND, NTRINST_NBRJOBS_FUTURE_CHG_IND, NTRINST_BUDGET_ERROR_IND " +
	" FROM NTRINST ";
				DataCommand command1 = new DataCommand(sql1);
				ResultSet results1 = command1.executeQuery();
				rowCount = command1.getRowCount();
				if ( results1.hasData() ) {
					coasCode = results1.getStr(0);
					locationInd = results1.getStr(1);
					approvalsInd = results1.getStr(2);
					nbrjobsFutureChgInd = results1.getStr(3);
					budgetInd = results1.getStr(4);
				}
				results1.close();
				
				if ( getGlobal("HRESYS").equals("Y") )
				{
					NString parEclsInd = NString.getNull();
					NString parOrgnInd = NString.getNull();
					NString parSalaInd = NString.getNull();
					NString parEmprInd = NString.getNull();
					NString parStrsPersDate = NString.getNull();
					NString msg = NString.getNull();
					NString msgType = NString.getNull();
					Ref<NString> par_ecls_ind_ref = new Ref<NString>(parEclsInd);
					Ref<NString> par_orgn_ind_ref = new Ref<NString>(parOrgnInd);
					Ref<NString> par_sala_ind_ref = new Ref<NString>(parSalaInd);
					Ref<NString> par_empr_ind_ref = new Ref<NString>(parEmprInd);
					Ref<NString> par_strs_pers_date_ref = new Ref<NString>(parStrsPersDate);
					Ref<NString> msg_ref = new Ref<NString>(msg);
					Ref<NString> msg_type_ref = new Ref<NString>(msgType);
					Nokp3lb.pEditPtrinst(toStr("PAYROLL"), par_ecls_ind_ref, par_orgn_ind_ref, par_sala_ind_ref, par_empr_ind_ref, par_strs_pers_date_ref, msg_ref, msg_type_ref);
					parEclsInd = par_ecls_ind_ref.val;
					parOrgnInd = par_orgn_ind_ref.val;
					parSalaInd = par_sala_ind_ref.val;
					parEmprInd = par_empr_ind_ref.val;
					parStrsPersDate = par_strs_pers_date_ref.val;
					msg = msg_ref.val;
					msgType = msg_type_ref.val;
					eclsSecurityInd = parEclsInd;
					orgnSecurityInd = parOrgnInd;
					salaSecurityInd = parSalaInd;
					emprSecurityInd = parEmprInd;
				}
				else {
					eclsSecurityInd = toStr("N");
					orgnSecurityInd = toStr("N");
					salaSecurityInd = toStr("N");
					emprSecurityInd = toStr("N");
					emprCode =  toStr("N");
				}
				
				setDefaultValue(coasCode, "GLOBAL.COAS_CODE");
				setDefaultValue(eclsSecurityInd, "GLOBAL.ECLS_SECURITY_IND");
				setDefaultValue(orgnSecurityInd, "GLOBAL.ORGN_SECURITY_IND");
				setDefaultValue(salaSecurityInd, "GLOBAL.SALA_SECURITY_IND");
				setDefaultValue(emprSecurityInd, "GLOBAL.EMPR_SECURITY_IND");
				setDefaultValue(locationInd, "GLOBAL.LOCATION_IND");
				setDefaultValue(emprCode, "GLOBAL.empr_code");
				//  Added new global for NBAJOBS form for 8.7
				setDefaultValue(approvalsInd, "GLOBAL.APPROVALS_IND");
				setDefaultValue(nbrjobsFutureChgInd, "GLOBAL.NBRJOBS_FUTURE_CHG_IND");
				setDefaultValue(budgetInd, "GLOBAL.BUDGET_IND");
				//  Added for 3.1
				setDefaultValue("", "GLOBAL.NEW_HIRE_IND");
				setDefaultValue(null, "GLOBAL.NON_CASH_IND");
				setDefaultValue(null, "GLOBAL.GO_TO_BLOCK");
				setDefaultValue(null, "GLOBAL.GO_TO_ITEM");
				setDefaultValue(null, "GLOBAL.ACTION_DATE");
				setDefaultValue(null, "GLOBAL.ACTION_LIST");
				setDefaultValue(null, "GLOBAL.ACTION_ALL");
				setDefaultValue(null, "GLOBAL.REC_STATUS");
				//  Added for WTE & EA (4.2)
				setDefaultValue(null, "GLOBAL.SUPERUSER_IND");
				//  Added for 6.0
				setDefaultValue(null, "GLOBAL.SGRP_CODE");
				setDefaultValue(null, "GLOBAL.JINR_CODE");
				//  Added New global for Job Progression for 6.0
				setDefaultValue(null, "GLOBAL.JOBP_CODE");
				//  Added new global for NTRSPEX for 6.1
				setDefaultValue(null, "GLOBAL.SPEX_CODE");
				//  Added new global for Electornic Approval Group Rules Form for 7.2
				setDefaultValue(null, "GLOBAL.AGRP_CODE");
				//  Added new global for Effort Certification Rules Forms for 8.1   
				setDefaultValue(null, "GLOBAL.DATA_SOURCE");
				setDefaultValue(null, "GLOBAL.CATCH_ALL_GROUP_IND");
				setDefaultValue(null, "GLOBAL.QPRT_CODE");
				setDefaultValue(null, "GLOBAL.QPRT_ID");
				
			} finally {
				executeAction("G$_REVOKE_ACCESS");
			}
		}
		
	}
	


		//Original PL/SQL code for Prog Unit GOQRPLS.G$_SECURED_FORM_CALL
	/*
	PROCEDURE G$_SECURED_FORM_CALL (USER_IN        IN VARCHAR2,
                                FORM_NAME_IN   IN VARCHAR2,
                                MODE_IN        IN VARCHAR2) IS
<multilinecomment> 
This Procedure will replace Form GUQSECR which had been called to do secured form calls. 
Invoke this procedure with <user> or global.CURRENT_USER, <form> or global.secrfrm, and 
<mode> or NULL as the arguments.  The mode is to control how the form is called.  The 
default mode (null) is no_query.  Valid modes are QUERY, QUERY_NOHIDE, QUERY_HIDE, HIDE, 
and NOHIDE.

IE:
   G$_SECURED_FORM_CALL('CIMSUSR','CBAACCD','QUERY');
     OR  
   G$_SECURED_FORM_CALL(global.CURRENT_USER,global.secrfrm,'');
</multilinecomment>
--
--
  pl_name VARCHAR2(30) := 'PREFERENCES'; 
  pl_id   PARAMLIST    := GET_PARAMETER_LIST(pl_name);
BEGIN
--
-- Check for parameter list
--
  IF ID_NULL(pl_id) THEN 
    pl_id := CREATE_PARAMETER_LIST(pl_name); 
--
    ADD_PARAMETER(pl_id,'G$_PREFERENCES',TEXT_PARAMETER,'6'); 
    SET_PARAMETER_ATTR(pl_id,'G$_PREFERENCES',TEXT_PARAMETER,NAME_IN('PARAMETER.G$_PREFERENCES'));
  END IF;
--
  G$_SECURED_FORM_CALL_PL(USER_IN, FORM_NAME_IN, pl_id, MODE_IN);
--
-- Reset menu options in current form after returning from another form.
--
  IF NAME_IN('SYSTEM.CURRENT_FORM') <> 'GUAGMNU' THEN
    G$_NAVIGATION_FRAME.RESET_MENU_AFTER_FORM_CALL;
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param userIn
		* @param formNameIn
		* @param modeIn
		*/
	
		public void gSecuredFormCall(NString userIn, NString formNameIn, NString modeIn)
		{
			gSecuredFormCall(userIn, formNameIn, modeIn, null);
		}
		
		public void gSecuredFormCall(NString userIn, NString formNameIn, NString modeIn, Hashtable<String, String> params)
		{
		
			// This Procedure will replace Form GUQSECR which had been called to do secured form calls.
			// Invoke this procedure with <user> or global.CURRENT_USER, <form> or global.secrfrm, and
			// <mode> or NULL as the arguments.  The mode is to control how the form is called.  The
			// default mode (null) is no_query.  Valid modes are QUERY, QUERY_NOHIDE, QUERY_HIDE, HIDE,
			// and NOHIDE.
			// IE:
			// G$_SECURED_FORM_CALL('CIMSUSR','CBAACCD','QUERY');
			// OR
			// G$_SECURED_FORM_CALL(global.CURRENT_USER,global.secrfrm,'');
			// 
			// 
			
			if(params == null)
				params = new Hashtable<String, String>();
			if(Globals.getGlobal("RELATED_FORM_CALL").equals("Y")){

				params.put("RELATED_FORM_CALL", "Y");
				Globals.removeGlobal("RELATED_FORM_CALL");
			}
			
			NString plName = toStr("PREFERENCES");
			Hashtable plId = getParameterList(plName);
			// 
			//  Check for parameter list
			// 
			if ( (plId == null) )
			{
				plId = createParameterList(plName);
				// 
				addParameter(plId, "G$_PREFERENCES", "6");
				setParameter(plId, "G$_PREFERENCES",  getNameIn("PARAMETER.G$_PREFERENCES"));
			}
			if(params != null && !params.isEmpty()){
				for(String paramName : params.keySet()){
					addParameter(plId, paramName,  params.get(paramName));
				}
			}
			
			// 
			gSecuredFormCallPl(userIn, formNameIn, plId, modeIn);
			
			//MORPHIS TODO: tmp solution
			deleteParameterList(plName);
			// 
			//  Reset menu options in current form after returning from another form.
			// 
			if ( getCurrentTaskName().notEquals("GUAGMNU") )
			{
				getGNavigationFrame().resetMenuAfterFormCall();
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_RESYNCH_RECORD
	/*
	FUNCTION G$_RESYNCH_RECORD (p_rowid VARCHAR2) RETURN VARCHAR2 IS
--
-- Function to calculate the block's activity date item and fetch it back from the database.
-- This is needed with some of the APIs since they are not passing the activity date in but
-- they are being updated.  The form then thinks the record was updated by another user and
-- thus would raise an error.  This function is called by the ON-INSERT and ON-UPDATE triggers
-- after executing the API call to re-synchronize the activity date.
--
--
  CURSORA           INTEGER;
  RET_CODE          INTEGER;
--
  lv_item_id        ITEM;
--
  COL_ONE           NUMBER := 1;
--
  SQL_RET           VARCHAR2(30);
  SQL_STMT          VARCHAR2(200);
--
  lv_block_name     VARCHAR2(30) := NAME_IN('SYSTEM.CURRENT_BLOCK'); 
  lv_table_name     VARCHAR2(30) := GET_BLOCK_PROPERTY(lv_block_name,DML_DATA_TARGET_NAME); 
--
BEGIN
  lv_item_id := FIND_ITEM(lv_block_name || '.' || lv_table_name || '_ACTIVITY_DATE');
  IF ID_NULL(lv_item_id) THEN
  	RETURN(NULL);
  END IF;
--
  SQL_STMT := 'SELECT TO_CHAR(' || lv_table_name || '_ACTIVITY_DATE,''DDMONYYYYHH24MISS'') ' ||
              '  FROM ' || lv_table_name ||
              ' WHERE ' || lv_table_name || '.ROWID = ' || '''' || p_rowid ||'''';
--
  GOKDBMS.DYNAMIC_SQL(SQL_STMT,SQL_RET);
--
  RETURN(SQL_RET);
END;
	*/
	/* <p>
/* </p>
		* @param pRowid
		*/
		public NString gResynchRecord(java.sql.RowId pRowid)
		{
			// 
			//  Function to calculate the block's activity date item and fetch it back from the database.
			//  This is needed with some of the APIs since they are not passing the activity date in but
			//  they are being updated.  The form then thinks the record was updated by another user and
			//  thus would raise an error.  This function is called by the ON-INSERT and ON-UPDATE triggers
			//  after executing the API call to re-synchronize the activity date.
			// 
			// 
			NInteger cursora= NInteger.getNull();
			NInteger retCode= NInteger.getNull();
			// 
			ItemDescriptor lvItemId= null;
			// 
			NNumber colOne = toNumber(1);
			// 
			NString sqlRet= NString.getNull();
			NString sqlStmt= NString.getNull();
			// 
			NString lvBlockName = getCurrentBlock();
			NString lvTableName = toStr(findBlock(lvBlockName).getDataSourceName());
			lvItemId = findItem(lvBlockName.append(".").append(lvTableName).append("_ACTIVITY_DATE"));
			if ( (lvItemId == null) )
			{
				return NString.getNull();
			}
			// 
			sqlStmt = toStr("SELECT TO_CHAR(").append(lvTableName).append("_ACTIVITY_DATE,'DDMONYYYYHH24MISS', 'NLS_DATE_LANGUAGE=").append(getEnvVar("NLS_CANONICAL_LANG")).append("') ").append("  FROM ").append(lvTableName).append(" WHERE ").append(lvTableName).append(".ROWID = ").append("'").append(DbManager.getDataBaseFactory().rowidToString(pRowid)).append("'");
			// 
			Ref<NString> p_return_value1_ref = new Ref<NString>(sqlRet);
			Gokdbms.dynamicSql(sqlStmt, p_return_value1_ref);
			sqlRet = p_return_value1_ref.val;
			// 
			return ((sqlRet));
		}
		


	//Original PL/SQL code for Prog Unit GOQRPLS.G$_RESIZE_WEB_WINDOW
	/*
	PROCEDURE G$_RESIZE_WEB_WINDOW IS
--
-- This procedure resizes modal windows in the web environment that are so narrow that the 
-- menu wraps around to two lines.  It also increases the height of windows that are short 
-- since this sometimes leads to buttons on the bottom of the window being covered.
--
  web_window WINDOW := FIND_WINDOW(NAME_IN('SYSTEM.EVENT_WINDOW'));
  win_h      NUMBER := 0;
  win_y      NUMBER := 0;
--
BEGIN
--
-- check the size of the window
--
  IF NOT ID_NULL(web_window) THEN
--
-- expand the window if the width is too small to accomodate the menu
--
    IF GET_WINDOW_PROPERTY(web_window, WIDTH) < 320 THEN
      SET_WINDOW_PROPERTY(web_window,WIDTH, 320);
    END IF;
--
-- expand the height to display possible buttons on the bottom of the window
-- unfortunately this hieght is a guess that accommodates the windows thus far that have a 
-- problem displaying buttons and may need to be changed if other windows don't display 
-- their buttons
--
    win_h := GET_WINDOW_PROPERTY(web_window,HEIGHT);
    IF win_h < 190 THEN
      win_y := GET_WINDOW_PROPERTY(web_window,Y_POS);
      SET_WINDOW_PROPERTY(web_window,HEIGHT,win_h + 17);
      SET_WINDOW_PROPERTY(web_window,Y_POS,win_y - 17);
    END IF;
--
    IF NVL(NAME_IN('SYSTEM.EVENT_WINDOW'),'MAIN_WINDOW') <> 'MAIN_WINDOW' THEN
      win_y := TO_NUMBER(GET_WINDOW_PROPERTY(web_window,Y_POS));
      SET_WINDOW_PROPERTY(web_window,Y_POS,win_y + 41);
    END IF;
  END IF;
END;
	*/
	/* <p>
/* </p>
		*/
		public void gResizeWebWindow()
		{
			// 
			//  This procedure resizes modal windows in the web environment that are so narrow that the 
			//  menu wraps around to two lines.  It also increases the height of windows that are short 
			//  since this sometimes leads to buttons on the bottom of the window being covered.
			// 
			WindowDescriptor webWindow = findWindow(getCurrentWindow());
			NNumber winH = toNumber(0);
			NNumber winY = toNumber(0);
			// 
			//  check the size of the window
			// 
			if ( !(webWindow == null) )
			{
				// 
				//  expand the window if the width is too small to accomodate the menu
				// 
				if ( SupportClasses.FORMS4W.GetWindowProperty(webWindow, SupportClasses.Property.WIDTH).lesser(320) )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					// F2J_NOT_SUPPORTED : The property "WINDOW's WIDTH" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
					//					SupportClasses.FORMS4W.SetWindowProperty(webWindow, SupportClasses.Property.WIDTH, 320);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's WIDTH' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
					
					
				}
				// 
				//  expand the height to display possible buttons on the bottom of the window
				//  unfortunately this hieght is a guess that accommodates the windows thus far that have a 
				//  problem displaying buttons and may need to be changed if other windows don't display 
				//  their buttons
				// 
				// F2J_NOT_SUPPORTED : The property "WINDOW's HEIGHT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin6".
				//				winH = toNumber(SupportClasses.FORMS4W.GetWindowProperty(webWindow, SupportClasses.Property.HEIGHT));
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's HEIGHT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin6'.");
				
				
				if ( winH.lesser(190) )
				{
					// F2J_NOT_SUPPORTED : The property "WINDOW's Y_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS".
					//					winY = toNumber(SupportClasses.FORMS4W.GetWindowProperty(webWindow, SupportClasses.Property.Y_POS));
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's Y_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS'.");
					
					
					// F2J_NOT_SUPPORTED : The property "WINDOW's HEIGHT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
					//					SupportClasses.FORMS4W.SetWindowProperty(webWindow, SupportClasses.Property.HEIGHT, winH.add(17));
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's HEIGHT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
					
					
					// F2J_NOT_SUPPORTED : The property "WINDOW's Y_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS".
					//					SupportClasses.FORMS4W.SetWindowProperty(webWindow, SupportClasses.Property.Y_POS, winY.subtract(17));
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's Y_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS'.");
					
					
				}
				// 
				if ( isNull(getCurrentWindow(), "MAIN_WINDOW").notEquals("MAIN_WINDOW") )
				{
					// F2J_NOT_SUPPORTED : The property "WINDOW's Y_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS".
					//					winY = toNumber(SupportClasses.FORMS4W.GetWindowProperty(webWindow, SupportClasses.Property.Y_POS));
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's Y_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS'.");
					
					
					// F2J_NOT_SUPPORTED : The property "WINDOW's Y_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS".
					//					SupportClasses.FORMS4W.SetWindowProperty(webWindow, SupportClasses.Property.Y_POS, winY.add(41));
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's Y_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS'.");
					
					
				}
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_RESET_VIEW
	/*
	PROCEDURE G$_RESET_VIEW IS
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gResetView()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_RESET_GLOBAL
	/*
	PROCEDURE G$_RESET_GLOBAL IS
-- resets the global variables for pop-up windows.
BEGIN
   COPY('','GLOBAL.POS_X');
   COPY('','GLOBAL.POS_Y');
   COPY('','GLOBAL.SIZE_X');
   COPY('','GLOBAL.SIZE_Y');
   COPY('','GLOBAL.MOVE_X');
   COPY('','GLOBAL.MOVE_Y');
   COPY('','GLOBAL.ANC_X');
   COPY('','GLOBAL.ANC_Y');
   COPY('','GLOBAL.POP_FLD_NAME');
   DEFAULT_VALUE('Y','GLOBAL.CALL_IND');
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gResetGlobal()
		{
			copy("","GLOBAL.POS_X");
			copy("","GLOBAL.POS_Y");
			copy("","GLOBAL.SIZE_X");
			copy("","GLOBAL.SIZE_Y");
			copy("","GLOBAL.MOVE_X");
			copy("","GLOBAL.MOVE_Y");
			copy("","GLOBAL.ANC_X");
			copy("","GLOBAL.ANC_Y");
			copy("","GLOBAL.POP_FLD_NAME");
			setDefaultValue("Y", "GLOBAL.CALL_IND");
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_RECONNECT
	/*
	PROCEDURE G$_RECONNECT(p_display_msg IN VARCHAR2 := NULL) IS
  LV_DUMMY       VARCHAR2(1) := 'Y';
--
  NEW_UN         VARCHAR2(100) := '';
  NEW_UP         VARCHAR2(100) := '';
  NEW_UC         VARCHAR2(100) := '';
--
  ALERT_INFO_ID  ALERT;
  ALERT_MSG      VARCHAR2(200);
  ALERT_RESULT   NUMBER;
--
  TM_ID          TIMER;
  TM_INTERVAL    NUMBER(3) := 100;
BEGIN
  DEFAULT_VALUE(GET_APPLICATION_PROPERTY(CONNECT_STRING),'GLOBAL.ALT_DATABASE');
  IF NAME_IN('GLOBAL.ALT_DATABASE') IS NULL THEN
    COPY(' ','GLOBAL.ALT_DATABASE');
  END IF;
--
-- Check if connected by hitting the database and trap any exceptions.
--
  BEGIN
    SELECT 'X'
      INTO LV_DUMMY
      FROM DUAL;
  EXCEPTION
    WHEN OTHERS THEN
      LV_DUMMY := 'Z';
  END;
--
-- Still connected.
--
  IF NVL(LV_DUMMY,'Y') = 'X' THEN
    IF p_display_msg IS NOT NULL THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0123','LIB','Already Connected.'));
    END IF;
--
-- No longer connected.
--
  ELSE
--
-- Notify user that the connection was lost and that they will have to reconnect and be
-- logged off. 
--
    ALERT_INFO_ID := FIND_ALERT('G$_INFO_ALERT');
    IF NAME_IN('SYSTEM.CURRENT_FORM') = 'GUAGMNU' THEN
      ALERT_MSG := 'Your connection has been lost; you will need to '
                 || 'reconnect and then your session will be restarted.';
    ELSE
      ALERT_MSG := 'Your connection and any pending changes have been lost; you will need to '
                 || 'reconnect and then your session will be restarted.';
    END IF;
--
    IF ID_NULL(ALERT_INFO_ID) THEN
     	MESSAGE(ALERT_MSG,ACKNOWLEDGE);
    ELSE
      SET_ALERT_PROPERTY(ALERT_INFO_ID, ALERT_MESSAGE_TEXT,ALERT_MSG);
      ALERT_RESULT := SHOW_ALERT(ALERT_INFO_ID);
    END IF;
--
    LOGOUT;
    LOGON_SCREEN;
--    
    NEW_UN := GET_APPLICATION_PROPERTY(USERNAME);
    NEW_UP := GET_APPLICATION_PROPERTY(PASSWORD);
    NEW_UC := GET_APPLICATION_PROPERTY(CONNECT_STRING);
--
-- If all are null, user probably canceled.
--
    IF NEW_UN IS NULL AND NEW_UP IS NULL AND NEW_UC IS NULL THEN
    	ALERT_MSG := '*ERROR* No values were entered or cancel was selected, you have not been reconnected.';
      IF ID_NULL(ALERT_INFO_ID) THEN
        MESSAGE(ALERT_MSG,ACKNOWLEDGE);
      ELSE
        SET_ALERT_PROPERTY(ALERT_INFO_ID, ALERT_MESSAGE_TEXT,ALERT_MSG);
        ALERT_RESULT := SHOW_ALERT(ALERT_INFO_ID);
      END IF;
    	RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
-- Verify the same user id was entered.
--
    IF UPPER(NVL(NEW_UN,'X')) <> UPPER(NVL(NAME_IN('GLOBAL.ALT_USER_ID'),'X')) THEN
    	ALERT_MSG := '*ERROR* The user ID entered does not match the original value.';
      IF ID_NULL(ALERT_INFO_ID) THEN
        MESSAGE(ALERT_MSG,ACKNOWLEDGE);
      ELSE
        SET_ALERT_PROPERTY(ALERT_INFO_ID, ALERT_MESSAGE_TEXT,ALERT_MSG);
        ALERT_RESULT := SHOW_ALERT(ALERT_INFO_ID);
      END IF;
    	RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
-- Verify the same database connection was entered.
--
    IF UPPER(NVL(NEW_UC,'X')) <> UPPER(NVL(RTRIM(NAME_IN('GLOBAL.ALT_DATABASE')),'X')) THEN
    	ALERT_MSG := '*ERROR* The database entered does not match the original value.';
      IF ID_NULL(ALERT_INFO_ID) THEN
        MESSAGE(ALERT_MSG,ACKNOWLEDGE);
      ELSE
        SET_ALERT_PROPERTY(ALERT_INFO_ID, ALERT_MESSAGE_TEXT,ALERT_MSG);
        ALERT_RESULT := SHOW_ALERT(ALERT_INFO_ID);
      END IF;
    	RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
-- Build connect string.
--
    IF NEW_UC IS NOT NULL THEN
    	NEW_UP := NEW_UP || '@' || NEW_UC;
    END IF;
--
    COPY('Y','GLOBAL.EXIT_TO_MENU');
    COPY('Y','GLOBAL.EXIT_BANNER');
    COPY('Y','GLOBAL.RESTART_SESSION');
--
-- Attempt to logon.
--       
    LOGON(NEW_UN,NEW_UP,TRUE);
    IF NOT FORM_SUCCESS THEN
    	MESSAGE('*ERROR* Logon failed, you have not been reconnected.  Please try again.');
    	RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
-- Re-establish security.
--
    EXECUTE_TRIGGER('G$_VERIFY_ACCESS');
    G$_CHECK_FAILURE;
--
-- Create timer to cause the session to exit banner.
--
    TM_ID := FIND_TIMER('RESTART_SESSION');
    IF ID_NULL(TM_ID) THEN
      TM_ID := CREATE_TIMER('RESTART_SESSION', TM_INTERVAL, REPEAT);
    END IF;
--
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gReconnect() {
			gReconnect(NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pDisplayMsg
		*/
		public void gReconnect(NString pDisplayMsg)
		{
			int rowCount = 0;
			NString lvDummy = toStr("Y");
			// 
			NString newUn = toStr("");
			NString newUp = toStr("");
			NString newUc = toStr("");
			// 
			AlertDescriptor alertInfoId= null;
			NString alertMsg= NString.getNull();
			NNumber alertResult= NNumber.getNull();
			// 
			UnknownTypes.Timer tmId= null;
			NNumber tmInterval = toNumber(100);
			setDefaultValue(getConnectionString(), "GLOBAL.ALT_DATABASE");
			if ( getNameIn("GLOBAL.ALT_DATABASE").isNull() )
			{
				copy(" ","GLOBAL.ALT_DATABASE");
			}
			try
			{
				String sql1 = "SELECT 'X' " +
	" FROM DUAL ";
				DataCommand command1 = new DataCommand(sql1);
				ResultSet results1 = command1.executeQuery();
				rowCount = command1.getRowCount();
				if ( results1.hasData() ) {
					lvDummy = results1.getStr(0);
				}
				results1.close();
			}
			catch(Exception  e)
			{
				lvDummy = toStr("Z");
			}
			// 
			//  Still connected.
			// 
			if ( isNull(lvDummy, "Y").equals("X") )
			{
				if ( !pDisplayMsg.isNull() )
				{
					warningMessage(GNls.Fget(toStr("GOQRPLS-0123"), toStr("LIB"), toStr("Already Connected.")));
				}
			}
			else {
				// 
				//  Notify user that the connection was lost and that they will have to reconnect and be
				//  logged off. 
				// 
				alertInfoId = findAlert("G$_INFO_ALERT");
				if ( getCurrentTaskName().equals("GUAGMNU") )
				{
					alertMsg = toStr("Your connection has been lost; you will need to ").append("reconnect and then your session will be restarted.");
				}
				else {
					alertMsg = toStr("Your connection and any pending changes have been lost; you will need to ").append("reconnect and then your session will be restarted.");
				}
				// 
				if ( (alertInfoId == null) )
				{
					warningMessage(alertMsg, OutputMessageUserResponse.ACKNOWLEDGE);
				}
				else {
					setAlertMessageText(alertInfoId, alertMsg);
					alertResult = toNumber(showAlert(alertInfoId));
				}
				// 
				// F2J_NOT_SUPPORTED : Call to built-in "LOGOUT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin7".
				//				SupportClasses.FORMS40.Logout();
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'LOGOUT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin7'.");
				
				
				// F2J_NOT_SUPPORTED : Call to built-in "LOGON_SCREEN" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin8".
				//				SupportClasses.FORMS40.LogonScreen();
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'LOGON_SCREEN' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin8'.");
				
				
				//     
				newUn = toStr(getUser());
				newUp = toStr(getPassword());
				newUc = toStr(getConnectionString());
				// 
				//  If all are null, user probably canceled.
				// 
				if ( newUn.isNull() && newUp.isNull() && newUc.isNull() )
				{
					alertMsg = toStr("*ERROR* No values were entered or cancel was selected, you have not been reconnected.");
					if ( (alertInfoId == null) )
					{
						warningMessage(alertMsg, OutputMessageUserResponse.ACKNOWLEDGE);
					}
					else {
						setAlertMessageText(alertInfoId, alertMsg);
						alertResult = toNumber(showAlert(alertInfoId));
					}
					throw new ApplicationException();
				}
				// 
				//  Verify the same user id was entered.
				// 
				if ( upper(isNull(newUn, "X")).notEquals(upper(isNull(getNameIn("GLOBAL.ALT_USER_ID"), "X"))) )
				{
					alertMsg = toStr("*ERROR* The user ID entered does not match the original value.");
					if ( (alertInfoId == null) )
					{
						warningMessage(alertMsg, OutputMessageUserResponse.ACKNOWLEDGE);
					}
					else {
						setAlertMessageText(alertInfoId, alertMsg);
						alertResult = toNumber(showAlert(alertInfoId));
					}
					throw new ApplicationException();
				}
				// 
				//  Verify the same database connection was entered.
				// 
				if ( upper(isNull(newUc, "X")).notEquals(upper(isNull(rtrim(getNameIn("GLOBAL.ALT_DATABASE")), "X"))) )
				{
					alertMsg = toStr("*ERROR* The database entered does not match the original value.");
					if ( (alertInfoId == null) )
					{
						warningMessage(alertMsg, OutputMessageUserResponse.ACKNOWLEDGE);
					}
					else {
						setAlertMessageText(alertInfoId, alertMsg);
						alertResult = toNumber(showAlert(alertInfoId));
					}
					throw new ApplicationException();
				}
				// 
				//  Build connect string.
				// 
				if ( !newUc.isNull() )
				{
					newUp = newUp.append("@").append(newUc);
				}
				// 
				copy("Y","GLOBAL.EXIT_TO_MENU");
				copy("Y","GLOBAL.EXIT_BANNER");
				copy("Y","GLOBAL.RESTART_SESSION");
				// 
				//  Attempt to logon.
				//        
				// F2J_NOT_SUPPORTED : Call to built-in "LOGON" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin9".
				//				SupportClasses.FORMS40.Logon(newUn, newUp, NBool.True);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'LOGON' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin9'.");
				
				
				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					errorMessage("*ERROR* Logon failed, you have not been reconnected.  Please try again.");
					throw new ApplicationException();
				}
				// 
				//  Re-establish security.
				// 
				executeAction("G$_VERIFY_ACCESS");
				gCheckFailure();
				// 
				//  Create timer to cause the session to exit banner.
				// 
				// F2J_NOT_SUPPORTED : Call to built-in "FIND_TIMER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin10".
				//				tmId = SupportClasses.FORMS40.FindTimer("RESTART_SESSION");
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'FIND_TIMER' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin10'.");
				
				
				if ( (tmId == null) )
				{
					// F2J_NOT_SUPPORTED : Call to built-in "CREATE_TIMER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin11".
					//					tmId = SupportClasses.FORMS40.CreateTimer("RESTART_SESSION", tmInterval, SupportClasses.Constants.REPEAT);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'CREATE_TIMER' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin11'.");
					
					
				}
				// 
				throw new ApplicationException();
			}
		}

			
	//Original PL/SQL code for Prog Unit GOQRPLS.G$_QUICKFLOW
	/*
	PROCEDURE G$_QUICKFLOW (p_CALL_CODE VARCHAR2) IS
  TYPE QF_TABTYPE IS TABLE OF VARCHAR2(30)
       INDEX BY BINARY_INTEGER;
  QF_TABLE QF_TABTYPE;
--
  QF_CNT   BINARY_INTEGER := 0;
  CUR_FORM VARCHAR2(30) := NAME_IN('SYSTEM.CURRENT_FORM');
  OBJ_NAME VARCHAR2(30) := '';
--
  CURSOR QF_CURSOR IS
    SELECT GURCALL_FORM
      FROM GURCALL
     WHERE GURCALL_CALL_CODE = p_CALL_CODE
     ORDER BY GURCALL_SEQNO;
BEGIN
  COPY('','GLOBAL.QF_STATUS');
  COPY('N','GLOBAL.KILL_CALL');
  SET_MENU_ITEM_PROPERTY('Action.ExitQuickflow',ENABLED  ,PROPERTY_TRUE);
--
  IF CUR_FORM = 'GUAQFLW' THEN
    HIDE_WINDOW('GUACSUB_1_WINDOW');
  END IF;
--
  FOR QF_REC IN QF_CURSOR LOOP
    QF_CNT := QF_CNT + 1;
    QF_TABLE(QF_CNT) := QF_REC.GURCALL_FORM;
  END LOOP;
--
  FOR J IN 1..QF_CNT LOOP
  	OBJ_NAME := QF_TABLE(J);
--
    IF NAME_IN('GLOBAL.KILL_CALL') = 'Y' THEN
      COPY('','GLOBAL.QF_STATUS');
      EXIT;
    END IF;
--
    COPY('  QuickFlow: ' || p_CALL_CODE || ': ' || TO_CHAR(J) 
                         || ' of ' || TO_CHAR(QF_CNT),'GLOBAL.QF_STATUS');
--
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),OBJ_NAME,'HIDE');
  END LOOP;
--
  SET_MENU_ITEM_PROPERTY('Action.ExitQuickflow',ENABLED  ,PROPERTY_FALSE);
  COPY('','GLOBAL.QF_STATUS');
--
EXCEPTION
  WHEN OTHERS THEN
    COPY('','GLOBAL.QF_STATUS');
END;
	*/
	/* <p>
/* </p>
		* @param pCallCode
		*/
		public void gQuickflow(NString pCallCode)
		{
			int rowCount = 0;
			QfTabtype qfTable= new QfTabtype();
			// 
			NInteger qfCnt = toInt(0);
			NString curForm = getCurrentTaskName();
			NString objName = toStr("");
			String sqlqfCursor = "SELECT GURCALL_FORM " +
	" FROM GURCALL " +
	" WHERE GURCALL_CALL_CODE = :P_P_CALL_CODE " +
	" ORDER BY GURCALL_SEQNO";
			DataCursor qfCursor = new DataCursor(sqlqfCursor);
			try
			{
				copy("","GLOBAL.QF_STATUS");
				copy("N","GLOBAL.KILL_CALL");
				setMenuItemEnabled("Action.ExitQuickflow", true);
				// 
				if ( curForm.equals("GUAQFLW") )
				{
					hideWindow("GUACSUB_1_WINDOW");
				}
				// 
				//Setting query parameters
				qfCursor.addParameter("P_P_CALL_CODE", pCallCode);
				try
				{
					qfCursor.open();
					while (true)
					{
						TableRow qfRec = qfCursor.fetchRow();
						if ( qfCursor.notFound() ) 
							break;
						qfCnt = qfCnt.add(1);
						qfTable.set(qfCnt, qfRec.getStr("GURCALL_FORM"));
					}
				}finally{
					qfCursor.close();
				}
				// 
				for ( int j = 1; j <= qfCnt.toInt32(); j++ )
				{
					objName = qfTable.get(j);
					// 
					if ( getNameIn("GLOBAL.KILL_CALL").equals("Y") )
					{
						copy("","GLOBAL.QF_STATUS");
							break;
					}
					// 
					copy(toStr("  QuickFlow: ").append(pCallCode).append(": ").append(toChar(j)).append(" of ").append(toChar(qfCnt)),"GLOBAL.QF_STATUS");
					// 
					executeAction("G$_REVOKE_ACCESS");
					gCheckFailure();
					gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), objName, toStr("HIDE"));
				}
				// 
				setMenuItemEnabled("Action.ExitQuickflow", false);
				copy("","GLOBAL.QF_STATUS");
			}
			catch(Exception  e)
			{
				copy("","GLOBAL.QF_STATUS");
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_QUERY_ONLY_ROLE
	/*
	FUNCTION G$_QUERY_ONLY_ROLE RETURN BOOLEAN IS
  lv_what_obj  VARCHAR2(30);
  lv_what_role VARCHAR2(30);
BEGIN
  GOKDBMS.APPLICATION_INFO_READ_MODULE(lv_what_obj, lv_what_role);
  IF lv_what_role IS NOT NULL AND SUBSTR(lv_what_role,-2,2) = '_Q' THEN
    RETURN(TRUE);
  END IF;
--
  RETURN(FALSE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool gQueryOnlyRole()
		{
			NString lvWhatObj= NString.getNull();
			NString lvWhatRole= NString.getNull();
			Ref<NString> p_module_name_ref = new Ref<NString>(lvWhatObj);
			Ref<NString> p_action_name_ref = new Ref<NString>(lvWhatRole);
			Gokdbms.applicationInfoReadModule(p_module_name_ref, p_action_name_ref);
			lvWhatObj = p_module_name_ref.val;
			lvWhatRole = p_action_name_ref.val;
			if ( !lvWhatRole.isNull() && substring(lvWhatRole, - (2), toInt(2)).equals("_Q") )
			{
				return  toBool(((NBool.True)));
			}
			// 
			return  toBool(((NBool.False)));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_POPULATE_TBBDETC_LOVD
	/*
	PROCEDURE G$_POPULATE_TBBDETC_LOVD IS
--
-- Procedure to populate the dynamic/run time version of the 
-- record group.
--
  ITEM_NAME  VARCHAR2(61);
  LIST_NAME  VARCHAR2(40);
  RG_NAME    VARCHAR2(40);
--
  ITEM_ID    ITEM;
  LOV_ID     LOV;
  RG_ID      RECORDGROUP;
--
  ERR_CODE   NUMBER;
--
BEGIN
--
-- Check if Finance is installed and if not, exit.
--
  IF NAME_IN('GLOBAL.RESSYS') <> 'Y' THEN
    MESSAGE( G$_NLS.Get('GOQRPLS-0120', 'LIB','List of Values not available') );
    RETURN;
  END IF;
--
-- Get the item name and the LOV name for that item.
--
  ITEM_NAME := NAME_IN( 'SYSTEM.CURSOR_ITEM' );
  LIST_NAME := GET_ITEM_PROPERTY( ITEM_NAME, LOV_NAME );
  RG_NAME   := GET_LOV_PROPERTY( LIST_NAME, GROUP_NAME );
--
-- If the record_group doesn't exist, create it.
--  
  ERR_CODE := POPULATE_GROUP_WITH_QUERY( RG_NAME, 
                      'SELECT TBBDETC_DETAIL_CODE, '
                   || 'TBBDETC_DESC, '
                   || 'TBBDETC_DCAT_CODE, '
                   || 'TBBDETC_PRIORITY, '
                   || 'TBBDETC_RECEIPT_IND '
                   || 'FROM TBBDETC '
                   || 'WHERE TBBDETC_DETC_ACTIVE_IND = '
                   || '''' || 'Y' || '''' 
                   || ' AND TBBDETC_TYPE_IND = '
                   || '''' || 'P' || '''' 
                   || ' AND TBBDETC_DCAT_CODE <> '
                   || '''' || 'GRN' || ''''
                   || ' ORDER BY TBBDETC_DETAIL_CODE ');
--
-- If the populate fails, display error and exit.
--
  IF ERR_CODE <> 0 THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0121','LIB','*ERROR* Error populating the Detail Code List of Values.'));
    RAISE FORM_TRIGGER_FAILURE;
    RETURN;
  END IF;
--
-- Display the lov.
--
  G$_DISPLAY_LOV('','');
END;
	*/
	/* <p>
/* </p>
		*/
		public void gPopulateTbbdetcLovd()
		{
			// 
			//  Procedure to populate the dynamic/run time version of the 
			//  record group.
			// 
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			NString rgName= NString.getNull();
			// 
			ItemDescriptor itemId= null;
			LovDescriptor lovId= null;
			ValueSet rgId= null;
			// 
			NNumber errCode= NNumber.getNull();
			// 
			//  Check if Finance is installed and if not, exit.
			// 
			if ( getNameIn("GLOBAL.RESSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("GOQRPLS-0120"), toStr("LIB"), toStr("List of Values not available")));
				return ;
			}
			// 
			//  Get the item name and the LOV name for that item.
			// 
			itemName = getCursorItem();
			listName = getItemLovName(itemName);
			rgName = getLovGroupName(listName);
			// 
			//  If the record_group doesn't exist, create it.
			//   
			errCode = populateGroupWithQuery(rgName, toStr("SELECT TBBDETC_DETAIL_CODE, ").append("TBBDETC_DESC, ").append("TBBDETC_DCAT_CODE, ").append("TBBDETC_PRIORITY, ").append("TBBDETC_RECEIPT_IND ").append("FROM TBBDETC ").append("WHERE TBBDETC_DETC_ACTIVE_IND = ").append("'").append("Y").append("'").append(" AND TBBDETC_TYPE_IND = ").append("'").append("P").append("'").append(" AND TBBDETC_DCAT_CODE <> ").append("'").append("GRN").append("'").append(" ORDER BY TBBDETC_DETAIL_CODE "));
			// 
			//  If the populate fails, display error and exit.
			// 
			if ( errCode.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0121"), toStr("LIB"), toStr("*ERROR* Error populating the Detail Code List of Values.")));
				throw new ApplicationException();
				
			}
			// 
			//  Display the lov.
			// 
			gDisplayLov(toStr(""), toStr(""));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_POPULATE_ROIAIDY_LOVD
	/*
	PROCEDURE G$_POPULATE_ROIAIDY_LOVD IS
--
-- Procedure to populate the dynamic/run time version of the 
-- recordgroup.
--
  ITEM_NAME  VARCHAR2(61);
  LIST_NAME  VARCHAR2(40);
  RG_NAME    VARCHAR2(40);
--
  ITEM_ID    ITEM;
  LOV_ID     LOV;
  RG_ID      RECORDGROUP;
--
  ERR_CODE   NUMBER;
--
BEGIN
--
-- Check if Finance is installed and if not, exit.
--
  IF NAME_IN('GLOBAL.RESSYS') <> 'Y' THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0118','LIB','List of Values not available'));
    RETURN;
  END IF;
--
-- Get the item name and the LOV name for that item.
--
  ITEM_NAME := NAME_IN( 'SYSTEM.CURSOR_ITEM' );
  LIST_NAME := GET_ITEM_PROPERTY( ITEM_NAME, LOV_NAME );
  RG_NAME   := GET_LOV_PROPERTY( LIST_NAME, GROUP_NAME );
--
-- If the record_group doesn't exist, create it.
--
-- 8001-1 add ORDER BY clause to sort LOV when displayed on form GUIMAIL
  ERR_CODE := POPULATE_GROUP_WITH_QUERY( RG_NAME, 'SELECT ROBINST_AIDY_CODE, '
                   || 'ROBINST_AIDY_DESC, ROBINST_STATUS_IND '
                   || 'FROM ROBINST ORDER BY UPPER(ROBINST_AIDY_CODE) DESC');
--
-- If the populate fails, display error and exit.
--
  IF ERR_CODE <> 0 THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0119','LIB','*ERROR* Error populating the Aid Year List of Values.'));
    RAISE FORM_TRIGGER_FAILURE;
    RETURN;
  END IF;
--
-- Display the lov.
--
  G$_DISPLAY_LOV('','');
END;
	*/
	/* <p>
/* </p>
		*/
		public void gPopulateRoiaidyLovd()
		{
			// 
			//  Procedure to populate the dynamic/run time version of the 
			//  recordgroup.
			// 
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			NString rgName= NString.getNull();
			// 
			ItemDescriptor itemId= null;
			LovDescriptor lovId= null;
			ValueSet rgId= null;
			// 
			NNumber errCode= NNumber.getNull();
			// 
			//  Check if Finance is installed and if not, exit.
			// 
			if ( getNameIn("GLOBAL.RESSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("GOQRPLS-0118"), toStr("LIB"), toStr("List of Values not available")));
				return ;
			}
			// 
			//  Get the item name and the LOV name for that item.
			// 
			itemName = getCursorItem();
			listName = getItemLovName(itemName);
			rgName = getLovGroupName(listName);
			// 
			//  If the record_group doesn't exist, create it.
			// 
			//  8001-1 add ORDER BY clause to sort LOV when displayed on form GUIMAIL
			errCode = populateGroupWithQuery(rgName, toStr("SELECT ROBINST_AIDY_CODE, ").append("ROBINST_AIDY_DESC, ROBINST_STATUS_IND ").append("FROM ROBINST ORDER BY UPPER(ROBINST_AIDY_CODE) DESC"));
			// 
			//  If the populate fails, display error and exit.
			// 
			if ( errCode.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0119"), toStr("LIB"), toStr("*ERROR* Error populating the Aid Year List of Values.")));
				throw new ApplicationException();
				
			}
			// 
			//  Display the lov.
			// 
			gDisplayLov(toStr(""), toStr(""));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_POPULATE_GXVBANK_LOVD
	/*
	PROCEDURE G$_POPULATE_GXVBANK_LOVD IS
--
-- Procedure to populate the dynamic/run time version of the 
-- recordgroup.
--
  ITEM_NAME  VARCHAR2(61);
  LIST_NAME  VARCHAR2(40);
  RG_NAME    VARCHAR2(40);
--
  ITEM_ID    ITEM;
  LOV_ID     LOV;
  RG_ID      RECORDGROUP;
--
  ERR_CODE   NUMBER;
--
BEGIN
--
-- Check if Finance is installed and if not, exit.
--
  IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0116','LIB','*WARNING* BANNER Finance is not installed.'));
    RETURN;
  END IF;
--
-- Get the item name and the LOV name for that item.
--
  ITEM_NAME := NAME_IN( 'SYSTEM.CURSOR_ITEM' );
  LIST_NAME := GET_ITEM_PROPERTY( ITEM_NAME, LOV_NAME );
  RG_NAME   := GET_LOV_PROPERTY( LIST_NAME, GROUP_NAME );
--
-- Populate the record_group.
--
  ERR_CODE := POPULATE_GROUP_WITH_QUERY( RG_NAME, 'SELECT GXVBANK_COAS_CODE, '
                   || 'GXVBANK_BANK_CODE, GXVBANK_ACCT_NAME, '
                   || 'GXVBANK_STATUS_IND, '
                   || 'TO_CHAR(GXVBANK_EFF_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || '), ' 
                   || 'TO_CHAR(GXVBANK_TERM_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || ') '
                   || 'FROM GXVBANK ORDER BY GXVBANK_COAS_CODE, '
                   || 'GXVBANK_BANK_CODE' );
--
-- If the populate fails, display error and exit.
--
  IF ERR_CODE <> 0 THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0117','LIB','*ERROR* Error populating the Bank Account Code List of Values.'));
    RAISE FORM_TRIGGER_FAILURE;
    RETURN;
  END IF;
--
-- Display the lov.
--
  G$_DISPLAY_LOV('','');
END;
	*/
	/* <p>
/* </p>
		*/
		
		
		// TODO MORPHIS DF
		public void gPopulateGxvbankLovd()
		{
			gPopulateGxvbankLovd("","","","","","");
		}
		
		
		
		// TODO MORPHIS DF
		public void gPopulateGxvbankLovd(String coasCodeAllias, String codeAllias, String nameAllias, String statusAllias, String effDateAllias,String termAllias)
		{
			// 
			//  Procedure to populate the dynamic/run time version of the 
			//  recordgroup.
			// 
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			NString rgName= NString.getNull();
			// 
			ItemDescriptor itemId= null;
			LovDescriptor lovId= null;
			ValueSet rgId= null;
			// 
			NNumber errCode= NNumber.getNull();
			// 
			//  Check if Finance is installed and if not, exit.
			// 
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("GOQRPLS-0116"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			// 
			//  Get the item name and the LOV name for that item.
			// 
			itemName = getCursorItem();
			listName = getItemLovName(itemName);
			rgName = getLovGroupName(listName);
			// 
			//  Populate the record_group.
			// TODO MORPHIS DF
//			errCode = populateGroupWithQuery(rgName, toStr("SELECT GXVBANK_COAS_CODE, ").append("GXVBANK_BANK_CODE, GXVBANK_ACCT_NAME, ").append("GXVBANK_STATUS_IND, ").append("TO_CHAR(GXVBANK_EFF_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append("), ").append("TO_CHAR(GXVBANK_TERM_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append("FROM GXVBANK ORDER BY GXVBANK_COAS_CODE, ").append("GXVBANK_BANK_CODE"));
			errCode = populateGroupWithQuery(rgName, toStr("SELECT GXVBANK_COAS_CODE ").append(coasCodeAllias).append(", ").append("GXVBANK_BANK_CODE ").append(codeAllias).append(",").append("GXVBANK_ACCT_NAME ").append(nameAllias).append(", ").append("GXVBANK_STATUS_IND ").append(statusAllias).append(", ").append("TO_CHAR(GXVBANK_EFF_DATE ,").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append(effDateAllias).append(", ").append("TO_CHAR(GXVBANK_TERM_DATE ,").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append(termAllias).append(" FROM GXVBANK ORDER BY GXVBANK_COAS_CODE, ").append("GXVBANK_BANK_CODE"));

			// 
			//  If the populate fails, display error and exit.
			// 
			if ( errCode.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0117"), toStr("LIB"), toStr("*ERROR* Error populating the Bank Account Code List of Values.")));
				throw new ApplicationException();
				
			}
			// 
			//  Display the lov.
			// 
			gDisplayLov(toStr(""), toStr(""));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_POPULATE_GXRDIRD_LOVD
	/*
	PROCEDURE G$_POPULATE_GXRDIRD_LOVD(FIELD_NAME IN VARCHAR2) IS
   VALUE_OF_FIELD NUMBER(8) := TO_NUMBER(NAME_IN(FIELD_NAME));
   RG_LOGIC   VARCHAR2(2000) := 'SELECT gxrdird_bank_rout_num rout_num, gxvdird_desc, gxrdird_bank_acct_num acct_num, decode(gxrdird_acct_type,''C'','''||G$_NLS.Get('GOQRPLS-0113','LIB','Checking')||''',''S'','''||G$_NLS.Get('GOQRPLS-0114','LIB','Savings')||''') acct_type, to_char(gxrdird_priority) priority, nvl(to_char(gxrdird_amount,''999999999D99''),gxrdird_percent)||decode(gxrdird_amount,NULL,''%'') amt_pct, to_char(gxrdird_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from gxrdird, gxvdird';
   WHERE_STMT VARCHAR2(200) := ' WHERE gxrdird_hr_ind = ''A'' and gxrdird_status = ''A'' and gxvdird_code_bank_rout_num = gxrdird_bank_rout_num and gxrdird_pidm = ';
   ORDER_BY   VARCHAR2(200) := ' ORDER BY gxrdird_bank_rout_num';
--
   ERROR_NUMBER NUMBER;
--
BEGIN
  RG_LOGIC := RG_LOGIC||WHERE_STMT||''''||VALUE_OF_FIELD||''''||ORDER_BY;
  ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('G$_GXRDIRD_RGD',RG_LOGIC);
  IF ERROR_NUMBER <> 0 THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0115','LIB','*ERROR* No active Payroll direct deposit record(s) available.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fieldName
		*/
		public void gPopulateGxrdirdLovd(NString fieldName)
		{
			NNumber valueOfField = toNumber(getNameIn(fieldName));
			NString rgLogic = toStr("SELECT gxrdird_bank_rout_num rout_num, gxvdird_desc, gxrdird_bank_acct_num acct_num, decode(gxrdird_acct_type,'C','").append(GNls.Fget(toStr("GOQRPLS-0113"), toStr("LIB"), toStr("Checking"))).append("','S','").append(GNls.Fget(toStr("GOQRPLS-0114"), toStr("LIB"), toStr("Savings"))).append("') acct_type, to_char(gxrdird_priority) priority, nvl(to_char(gxrdird_amount,'999999999D99'),gxrdird_percent)||decode(gxrdird_amount,NULL,'%') amt_pct, to_char(gxrdird_activity_date,'").append(GDate.getNlsDateFormat()).append("') act_date from gxrdird, gxvdird");
			NString whereStmt = toStr(" WHERE gxrdird_hr_ind = 'A' and gxrdird_status = 'A' and gxvdird_code_bank_rout_num = gxrdird_bank_rout_num and gxrdird_pidm = ");
			NString orderBy = toStr(" ORDER BY gxrdird_bank_rout_num");
			// 
			NNumber errorNumber= NNumber.getNull();
			rgLogic = rgLogic.append(whereStmt).append("'").append(valueOfField).append("'").append(orderBy);
			errorNumber = populateGroupWithQuery("G$_GXRDIRD_RGD", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0115"), toStr("LIB"), toStr("*ERROR* No active Payroll direct deposit record(s) available.")));
				throw new ApplicationException();
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_POPULATE_FTVRUCL_LOVD
	/*
	PROCEDURE G$_POPULATE_FTVRUCL_LOVD IS
--
-- Procedure to populate the dynamic/run time version of the 
-- recordgroup.
--
  ITEM_NAME  VARCHAR2(61);
  LIST_NAME  VARCHAR2(40);
  RG_NAME    VARCHAR2(40);
--
  ITEM_ID    ITEM;
  LOV_ID     LOV;
  RG_ID      RECORDGROUP;
--
  ERR_CODE   NUMBER;
--
BEGIN
--
-- Check if Finance is installed and if not, exit.
--
  IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0111','LIB','*WARNING* BANNER Finance is not installed.'));
    RETURN;
  END IF;
--
-- Get the item name and the LOV name for that item.
--
  ITEM_NAME := NAME_IN( 'SYSTEM.CURSOR_ITEM' );
  LIST_NAME := GET_ITEM_PROPERTY( ITEM_NAME, LOV_NAME );
  RG_NAME   := GET_LOV_PROPERTY( LIST_NAME, GROUP_NAME );
--
-- Populate the record_group.
--
  ERR_CODE := POPULATE_GROUP_WITH_QUERY( RG_NAME, 'SELECT FTVRUCL_RUCL_CODE, '
                   || 'FTVRUCL_CLASS_TITLE, FTVRUCL_CLASS_TYPE, '
                   || 'FTVRUCL_STATUS_IND, '
                   || 'TO_CHAR(FTVRUCL_EFF_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || '), ' 
                   || 'TO_CHAR(FTVRUCL_TERM_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || ') '
                   || 'FROM FTVRUCL ORDER BY FTVRUCL_RUCL_CODE, ' 
                   || 'FTVRUCL_EFF_DATE' );
--
-- If the populate fails, display error and exit.
--
  IF ERR_CODE <> 0 THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0112','LIB','*ERROR* Error populating the Chart of Accounts List of Values.'));
    RAISE FORM_TRIGGER_FAILURE;
    RETURN;
  END IF;
--
-- Display the lov.
--
  G$_DISPLAY_LOV('','');
END;
	*/
	/* <p>
/* </p>
		*/
		
		public void gPopulateFtvruclLovd()
		{
			gPopulateFtvruclLovd("","","","","","");
		}
		
		public void gPopulateFtvruclLovd(String ruclCodeAllias, String titleAllias, String typeAllias, String statusAllias, String effDateAllias, String termAllias)
		{
			// 
			//  Procedure to populate the dynamic/run time version of the 
			//  recordgroup.
			// 
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			NString rgName= NString.getNull();
			// 
			ItemDescriptor itemId= null;
			LovDescriptor lovId= null;
			ValueSet rgId= null;
			// 
			NNumber errCode= NNumber.getNull();
			// 
			//  Check if Finance is installed and if not, exit.
			// 
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("GOQRPLS-0111"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			// 
			//  Get the item name and the LOV name for that item.
			// 
			itemName = getCursorItem();
			listName = getItemLovName(itemName);
			rgName = getLovGroupName(listName);
			// 
			//  Populate the record_group.
			// 
			errCode = populateGroupWithQuery(rgName, toStr("SELECT FTVRUCL_RUCL_CODE ").append(ruclCodeAllias).append(", ").append("FTVRUCL_CLASS_TITLE ").append(titleAllias).append(",").append(" FTVRUCL_CLASS_TYPE ").append(typeAllias).append(", ").append("FTVRUCL_STATUS_IND ").append(statusAllias).append(", ").append(" TO_CHAR(FTVRUCL_EFF_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append(effDateAllias).append(", ").append(" TO_CHAR(FTVRUCL_TERM_DATE ,").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append(termAllias).append(" FROM FTVRUCL ORDER BY FTVRUCL_RUCL_CODE, ").append("FTVRUCL_EFF_DATE"));
			
			// 
			//  If the populate fails, display error and exit.
			// 
			if ( errCode.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0112"), toStr("LIB"), toStr("*ERROR* Error populating the Chart of Accounts List of Values.")));
				throw new ApplicationException();
				
			}
			// 
			//  Display the lov.
			// 
			gDisplayLov(toStr(""), toStr(""));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_POPULATE_FTVPROJ_LOVD
	/*
	PROCEDURE G$_POPULATE_FTVPROJ_LOVD IS
--
-- Procedure to populate the dynamic/run time version of the 
-- recordgroup.
--
  ITEM_NAME  VARCHAR2(61);
  LIST_NAME  VARCHAR2(40);
  RG_NAME    VARCHAR2(40);
--
  ITEM_ID    ITEM;
  LOV_ID     LOV;
  RG_ID      RECORDGROUP;
--
  ERR_CODE   NUMBER;
--
BEGIN
--
-- Check if Finance is installed and if not, exit.
--
  IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0109','LIB','*WARNING* BANNER Finance is not installed.'));
    RETURN;
  END IF;
--
-- Get the item name and the LOV name for that item.
--
  ITEM_NAME := NAME_IN( 'SYSTEM.CURSOR_ITEM' );
  LIST_NAME := GET_ITEM_PROPERTY( ITEM_NAME, LOV_NAME );
  RG_NAME   := GET_LOV_PROPERTY( LIST_NAME, GROUP_NAME );
--
-- Populate the record_group.
--
  ERR_CODE := POPULATE_GROUP_WITH_QUERY( RG_NAME, 'SELECT FTVPROJ_CODE, '
                   || 'FTVPROJ_LONG_DESC, '                  
                   || 'TO_CHAR(FTVPROJ_EFF_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || '), ' 
                   || 'TO_CHAR(FTVPROJ_TERM_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || ') '
                   || 'FROM FTVPROJ ORDER BY FTVPROJ_CODE ');
--
-- If the populate fails, display error and exit.
--
  IF ERR_CODE <> 0 THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0110','LIB','*ERROR* Error populating the Chart of Accounts List of Values.'));
    RAISE FORM_TRIGGER_FAILURE;
    RETURN;
  END IF;
--
-- Display the lov.
--
  G$_DISPLAY_LOV('','');
END;
	*/
	/* <p>
/* </p>
		*/
		public void gPopulateFtvprojLovd()
		{
			// 
			//  Procedure to populate the dynamic/run time version of the 
			//  recordgroup.
			// 
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			NString rgName= NString.getNull();
			// 
			ItemDescriptor itemId= null;
			LovDescriptor lovId= null;
			ValueSet rgId= null;
			// 
			NNumber errCode= NNumber.getNull();
			// 
			//  Check if Finance is installed and if not, exit.
			// 
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("GOQRPLS-0109"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			// 
			//  Get the item name and the LOV name for that item.
			// 
			itemName = getCursorItem();
			listName = getItemLovName(itemName);
			rgName = getLovGroupName(listName);
			// 
			//  Populate the record_group.
			// 
			errCode = populateGroupWithQuery(rgName, toStr("SELECT FTVPROJ_CODE, ").append("FTVPROJ_LONG_DESC, ").append("TO_CHAR(FTVPROJ_EFF_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append("), ").append("TO_CHAR(FTVPROJ_TERM_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append("FROM FTVPROJ ORDER BY FTVPROJ_CODE "));
			// 
			//  If the populate fails, display error and exit.
			// 
			if ( errCode.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0110"), toStr("LIB"), toStr("*ERROR* Error populating the Chart of Accounts List of Values.")));
				throw new ApplicationException();
				
			}
			// 
			//  Display the lov.
			// 
			gDisplayLov(toStr(""), toStr(""));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_POPULATE_FTVPROG_LOVD
	/*
	PROCEDURE G$_POPULATE_FTVPROG_LOVD IS
--
-- Procedure to populate the dynamic/run time version of the 
-- recordgroup.
--
  ITEM_NAME  VARCHAR2(61);
  LIST_NAME  VARCHAR2(40);
  RG_NAME    VARCHAR2(40);
--
  ITEM_ID    ITEM;
  LOV_ID     LOV;
  RG_ID      RECORDGROUP;
--
  ERR_CODE   NUMBER;
--
BEGIN
--
-- Check if Finance is installed and if not, exit.
--
  IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0107','LIB','*WARNING* BANNER Finance is not installed.'));
    RETURN;
  END IF;
--
-- Get the item name and the LOV name for that item.
--
  ITEM_NAME := NAME_IN( 'SYSTEM.CURSOR_ITEM' );
  LIST_NAME := GET_ITEM_PROPERTY( ITEM_NAME, LOV_NAME );
  RG_NAME   := GET_LOV_PROPERTY( LIST_NAME, GROUP_NAME );
--
-- If the record_group doesn't exist, create it.
--
  ERR_CODE := POPULATE_GROUP_WITH_QUERY( RG_NAME, 'SELECT FTVPROG_COAS_CODE, '
                   || 'FTVPROG_PROG_CODE, FTVPROG_TITLE, '
                   || 'FTVPROG_DATA_ENTRY_IND, FTVPROG_STATUS_IND, '
                   || 'TO_CHAR(FTVPROG_EFF_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || '), '
                   || 'TO_CHAR(FTVPROG_TERM_DATE, ' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || ') '
                   || 'FROM FTVPROG ORDER BY DECODE(FTVPROG_COAS_CODE, ' 
                   || ' :GLOBAL.COAS_CODE, ' || '''' || ' ' || '''' || ', FTVPROG_COAS_CODE), ' 
                   || 'FTVPROG_DATA_ENTRY_IND DESC, FTVPROG_PROG_CODE, '
                   || 'FTVPROG_EFF_DATE' );
--
-- If the populate fails, display error and exit.
--
  IF ERR_CODE <> 0 THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0108','LIB','*ERROR* Error populating the Organization List of Values.'));
    RAISE FORM_TRIGGER_FAILURE;
    RETURN;
  END IF;
--
-- Display the lov.
--
  G$_DISPLAY_LOV('','');
END;
	*/
	/* <p>
/* </p>
		*/
		public void gPopulateFtvprogLovd()
		{
			// 
			//  Procedure to populate the dynamic/run time version of the 
			//  recordgroup.
			// 
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			NString rgName= NString.getNull();
			// 
			ItemDescriptor itemId= null;
			LovDescriptor lovId= null;
			ValueSet rgId= null;
			// 
			NNumber errCode= NNumber.getNull();
			// 
			//  Check if Finance is installed and if not, exit.
			// 
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("GOQRPLS-0107"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			// 
			//  Get the item name and the LOV name for that item.
			// 
			itemName = getCursorItem();
			listName = getItemLovName(itemName);
			rgName = getLovGroupName(listName);
			// 
			//  If the record_group doesn't exist, create it.
			// 
			errCode = populateGroupWithQuery(rgName, toStr("SELECT FTVPROG_COAS_CODE, ").append("FTVPROG_PROG_CODE, FTVPROG_TITLE, ").append("FTVPROG_DATA_ENTRY_IND, FTVPROG_STATUS_IND, ").append("TO_CHAR(FTVPROG_EFF_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append("), ").append("TO_CHAR(FTVPROG_TERM_DATE, ").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append("FROM FTVPROG ORDER BY DECODE(FTVPROG_COAS_CODE, ").append(" '").append(Globals.getString("COAS_CODE")).append("', ").append("'").append(" ").append("'").append(", FTVPROG_COAS_CODE), ").append("FTVPROG_DATA_ENTRY_IND DESC, FTVPROG_PROG_CODE, ").append("FTVPROG_EFF_DATE"));
			// 
			//  If the populate fails, display error and exit.
			// 
			if ( errCode.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0108"), toStr("LIB"), toStr("*ERROR* Error populating the Organization List of Values.")));
				throw new ApplicationException();
				
			}
			// 
			//  Display the lov.
			// 
			gDisplayLov(toStr(""), toStr(""));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_POPULATE_FTVORGN_LOVD
	/*
	PROCEDURE G$_POPULATE_FTVORGN_LOVD IS
--
-- Procedure to populate the dynamic/run time version of the 
-- recordgroup.
--
  ITEM_NAME  VARCHAR2(61);
  LIST_NAME  VARCHAR2(40);
  RG_NAME    VARCHAR2(40);
--
  ITEM_ID    ITEM;
  LOV_ID     LOV;
  RG_ID      RECORDGROUP;
--
  ERR_CODE   NUMBER;
--
BEGIN
--
-- Check if Finance is installed and if not, exit.
--
  IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0105','LIB','*WARNING* BANNER Finance is not installed.'));
    RETURN;
  END IF;
--
-- Get the item name and the LOV name for that item.
--
  ITEM_NAME := NAME_IN( 'SYSTEM.CURSOR_ITEM' );
  LIST_NAME := GET_ITEM_PROPERTY( ITEM_NAME, LOV_NAME );
  RG_NAME   := GET_LOV_PROPERTY( LIST_NAME, GROUP_NAME );
--
-- If the record_group doesn't exist, create it.
--
  ERR_CODE := POPULATE_GROUP_WITH_QUERY( RG_NAME, 'SELECT FTVORGN_COAS_CODE, '
                   || 'FTVORGN_ORGN_CODE, FTVORGN_TITLE, '
                   || 'FTVORGN_DATA_ENTRY_IND, FTVORGN_STATUS_IND, '
                   || 'TO_CHAR(FTVORGN_EFF_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || '), '
                   || 'TO_CHAR(FTVORGN_TERM_DATE, ' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || ') '
                   || 'FROM FTVORGN ORDER BY DECODE(FTVORGN_COAS_CODE, ' 
                   || ' :GLOBAL.COAS_CODE, ' || '''' || ' ' || '''' || ', FTVORGN_COAS_CODE), ' 
                   || 'FTVORGN_DATA_ENTRY_IND DESC, FTVORGN_ORGN_CODE, '
                   || 'FTVORGN_EFF_DATE' );
--
-- If the populate fails, display error and exit.
--
  IF ERR_CODE <> 0 THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0106','LIB','*ERROR* Error populating the Organization List of Values.'));
    RAISE FORM_TRIGGER_FAILURE;
    RETURN;
  END IF;
--
-- Display the lov.
--
  G$_DISPLAY_LOV('','');
END;
	*/
	/* <p>
/* </p>
		*/
		//MORPHIS TODO (JP) Quick fix for bug ELLBHR-9985. Overload method to allow use of aliases. Similar to gPopulateFtvacciLovd.
		public void gPopulateFtvorgnLovd(){
			gPopulateFtvorgnLovd("","","","","","","");
		}
		
		public void gPopulateFtvorgnLovd(String coasCodeAlias, String orgnAlias, String titleAlias, String dataEntryAlias, String statusAlias, String effDateAlias,String termAlias)
		{
			// 
			//  Procedure to populate the dynamic/run time version of the 
			//  recordgroup.
			// 
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			NString rgName= NString.getNull();
			// 
			ItemDescriptor itemId= null;
			LovDescriptor lovId= null;
			ValueSet rgId= null;
			// 
			NNumber errCode= NNumber.getNull();
			// 
			//  Check if Finance is installed and if not, exit.
			// 
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("GOQRPLS-0105"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			// 
			//  Get the item name and the LOV name for that item.
			// 
			itemName = getCursorItem();
			listName = getItemLovName(itemName);
			rgName = getLovGroupName(listName);
			// 
			//  If the record_group doesn't exist, create it.
			// 
			//MORPHIS TODO (JP) Query changed to apply aliases to each table column. Bugfix ELLBHR-9985.
//			errCode = populateGroupWithQuery(rgName, toStr("SELECT FTVORGN_COAS_CODE, ").append("FTVORGN_ORGN_CODE, FTVORGN_TITLE, ").append("FTVORGN_DATA_ENTRY_IND, FTVORGN_STATUS_IND, ").append("TO_CHAR(FTVORGN_EFF_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append("), ").append("TO_CHAR(FTVORGN_TERM_DATE, ").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append("FROM FTVORGN ORDER BY DECODE(FTVORGN_COAS_CODE, ").append(" '").append(Globals.getString("COAS_CODE")).append("', ").append("'").append(" ").append("'").append(", FTVORGN_COAS_CODE), ").append("FTVORGN_DATA_ENTRY_IND DESC, FTVORGN_ORGN_CODE, ").append("FTVORGN_EFF_DATE"));
			errCode = populateGroupWithQuery(rgName, toStr("SELECT FTVORGN_COAS_CODE ").append(coasCodeAlias).append(", FTVORGN_ORGN_CODE ").append(orgnAlias).append(", FTVORGN_TITLE ").append(titleAlias).append(", FTVORGN_DATA_ENTRY_IND ").append(dataEntryAlias).append(", FTVORGN_STATUS_IND ").append(statusAlias).append(", TO_CHAR(FTVORGN_EFF_DATE,").append("'").append(GDate.getNlsDateFormat()).append("') ").append(effDateAlias).append(", TO_CHAR(FTVORGN_TERM_DATE, ").append("'").append(GDate.getNlsDateFormat()).append("') ").append(termAlias).append(" FROM FTVORGN ORDER BY DECODE(FTVORGN_COAS_CODE, ").append(" '").append(Globals.getString("COAS_CODE")).append("', ").append("'").append(" ").append("'").append(", FTVORGN_COAS_CODE), ").append("FTVORGN_DATA_ENTRY_IND DESC, FTVORGN_ORGN_CODE, ").append("FTVORGN_EFF_DATE"));
			// 
			//  If the populate fails, display error and exit.
			// 
			if ( errCode.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0106"), toStr("LIB"), toStr("*ERROR* Error populating the Organization List of Values.")));
				throw new ApplicationException();
				
			}
			// 
			//  Display the lov.
			// 
			gDisplayLov(toStr(""), toStr(""));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_POPULATE_FTVLOCN_LOVD
	/*
	PROCEDURE G$_POPULATE_FTVLOCN_LOVD IS
--
-- Procedure to populate the dynamic/run time version of the 
-- recordgroup.
--
  ITEM_NAME  VARCHAR2(61);
  LIST_NAME  VARCHAR2(40);
  RG_NAME    VARCHAR2(40);
--
  ITEM_ID    ITEM;
  LOV_ID     LOV;
  RG_ID      RECORDGROUP;
--
  ERR_CODE   NUMBER;
--
BEGIN
--
-- Check if Finance is installed and if not, exit.
--
  IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0103','LIB','*WARNING* BANNER Finance is not installed.'));
    RETURN;
  END IF;
--
-- Get the item name and the LOV name for that item.
--
  ITEM_NAME := NAME_IN( 'SYSTEM.CURSOR_ITEM' );
  LIST_NAME := GET_ITEM_PROPERTY( ITEM_NAME, LOV_NAME );
  RG_NAME   := GET_LOV_PROPERTY( LIST_NAME, GROUP_NAME );
--
-- Populate the record_group.
--
  ERR_CODE := POPULATE_GROUP_WITH_QUERY( RG_NAME, 'SELECT FTVLOCN_COAS_CODE, '
                   || 'FTVLOCN_LOCN_CODE, FTVLOCN_TITLE, FTVLOCN_STATUS_IND, '
                   || 'TO_CHAR(FTVLOCN_EFF_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || '), ' 
                   || 'TO_CHAR(FTVLOCN_TERM_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || ') '
                   || 'FROM FTVLOCN ORDER BY DECODE(FTVLOCN_COAS_CODE, ' 
                   || ' :GLOBAL.COAS_CODE, ' || '''' || ' ' || '''' || ', FTVLOCN_COAS_CODE), ' 
                   || 'FTVLOCN_LOCN_CODE, FTVLOCN_EFF_DATE' );
--
-- If the populate fails, display error and exit.
--
  IF ERR_CODE <> 0 THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0104','LIB','*ERROR* Error populating the Chart of Accounts List of Values.'));
    RAISE FORM_TRIGGER_FAILURE;
    RETURN;
  END IF;
--
-- Display the lov.
--
  G$_DISPLAY_LOV('','');
END;
	*/
	/* <p>
/* </p>
		*/
		public void gPopulateFtvlocnLovd()
		{
			// 
			//  Procedure to populate the dynamic/run time version of the 
			//  recordgroup.
			// 
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			NString rgName= NString.getNull();
			// 
			ItemDescriptor itemId= null;
			LovDescriptor lovId= null;
			ValueSet rgId= null;
			// 
			NNumber errCode= NNumber.getNull();
			// 
			//  Check if Finance is installed and if not, exit.
			// 
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("GOQRPLS-0103"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			// 
			//  Get the item name and the LOV name for that item.
			// 
			itemName = getCursorItem();
			listName = getItemLovName(itemName);
			rgName = getLovGroupName(listName);
			// 
			//  Populate the record_group.
			// 
			errCode = populateGroupWithQuery(rgName, toStr("SELECT FTVLOCN_COAS_CODE, ").append("FTVLOCN_LOCN_CODE, FTVLOCN_TITLE, FTVLOCN_STATUS_IND, ").append("TO_CHAR(FTVLOCN_EFF_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append("), ").append("TO_CHAR(FTVLOCN_TERM_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append("FROM FTVLOCN ORDER BY DECODE(FTVLOCN_COAS_CODE, ").append(" '").append(Globals.getString("COAS_CODE")).append("', ").append("'").append(" ").append("'").append(", FTVLOCN_COAS_CODE), ").append("FTVLOCN_LOCN_CODE, FTVLOCN_EFF_DATE"));
			// 
			//  If the populate fails, display error and exit.
			// 
			if ( errCode.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0104"), toStr("LIB"), toStr("*ERROR* Error populating the Chart of Accounts List of Values.")));
				throw new ApplicationException();
				
			}
			// 
			//  Display the lov.
			// 
			gDisplayLov(toStr(""), toStr(""));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_POPULATE_FTVFUND_LOVD
	/*
	PROCEDURE G$_POPULATE_FTVFUND_LOVD IS
--
-- Procedure to populate the dynamic/run time version of the 
-- recordgroup.
--
  ITEM_NAME  VARCHAR2(61);
  LIST_NAME  VARCHAR2(40);
  RG_NAME    VARCHAR2(40);
--
  ITEM_ID    ITEM;
  LOV_ID     LOV;
  RG_ID      RECORDGROUP;
--
  ERR_CODE   NUMBER;
--
BEGIN
--
-- Check if Finance is installed and if not, exit.
--
  IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0101','LIB','*WARNING* BANNER Finance is not installed.'));
    RETURN;
  END IF;
--
-- Get the item name and the LOV name for that item.
--
  ITEM_NAME := NAME_IN( 'SYSTEM.CURSOR_ITEM' );
  LIST_NAME := GET_ITEM_PROPERTY( ITEM_NAME, LOV_NAME );
  RG_NAME   := GET_LOV_PROPERTY( LIST_NAME, GROUP_NAME );
--
-- Populate the record_group.
--
  ERR_CODE := POPULATE_GROUP_WITH_QUERY( RG_NAME, 'SELECT FTVFUND_COAS_CODE, '
                   || 'FTVFUND_FUND_CODE, FTVFUND_TITLE, FTVFUND_FTYP_CODE, '
                   || 'FTVFUND_DATA_ENTRY_IND, FTVFUND_STATUS_IND, '
                   || 'FTVFUND_POOL_IND, '
                   || 'TO_CHAR(FTVFUND_EFF_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || '), ' 
                   || 'TO_CHAR(FTVFUND_TERM_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || ') '
                   || 'FROM FTVFUND ORDER BY DECODE(FTVFUND_COAS_CODE, ' 
                   || ' :GLOBAL.COAS_CODE, ' || '''' || ' ' || '''' || ', FTVFUND_COAS_CODE), ' 
                   || 'FTVFUND_FUND_CODE, FTVFUND_EFF_DATE' );
--
-- If the populate fails, display error and exit.
--
  IF ERR_CODE <> 0 THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0102','LIB','*ERROR* Error populating the Chart of Accounts List of Values.'));
    RAISE FORM_TRIGGER_FAILURE;
    RETURN;
  END IF;
--
-- Display the lov.
--
  G$_DISPLAY_LOV('','');
END;
	*/
	/* <p>
/* </p>
		*/
		public void gPopulateFtvfundLovd()
		{
			// 
			//  Procedure to populate the dynamic/run time version of the 
			//  recordgroup.
			// 
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			NString rgName= NString.getNull();
			// 
			ItemDescriptor itemId= null;
			LovDescriptor lovId= null;
			ValueSet rgId= null;
			// 
			NNumber errCode= NNumber.getNull();
			// 
			//  Check if Finance is installed and if not, exit.
			// 
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("GOQRPLS-0101"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			// 
			//  Get the item name and the LOV name for that item.
			// 
			itemName = getCursorItem();
			listName = getItemLovName(itemName);
			rgName = getLovGroupName(listName);
			// 
			//  Populate the record_group.
			// 
			errCode = populateGroupWithQuery(rgName, toStr("SELECT FTVFUND_COAS_CODE, ").append("FTVFUND_FUND_CODE, FTVFUND_TITLE, FTVFUND_FTYP_CODE, ").append("FTVFUND_DATA_ENTRY_IND, FTVFUND_STATUS_IND, ").append("FTVFUND_POOL_IND, ").append("TO_CHAR(FTVFUND_EFF_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append("), ").append("TO_CHAR(FTVFUND_TERM_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append("FROM FTVFUND ORDER BY DECODE(FTVFUND_COAS_CODE, ").append(" '").append(Globals.getString("COAS_CODE")).append("', ").append("'").append(" ").append("'").append(", FTVFUND_COAS_CODE), ").append("FTVFUND_FUND_CODE, FTVFUND_EFF_DATE"));
			// 
			//  If the populate fails, display error and exit.
			// 
			if ( errCode.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0102"), toStr("LIB"), toStr("*ERROR* Error populating the Chart of Accounts List of Values.")));
				throw new ApplicationException();
			}
			// 
			//  Display the lov.
			// 
			gDisplayLov(toStr(""), toStr(""));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_POPULATE_FTVCTYP_LOVD
	/*
	PROCEDURE G$_POPULATE_FTVCTYP_LOVD IS
--
-- Procedure to populate the dynamic/run time version of the 
-- recordgroup.
--
  ITEM_NAME  VARCHAR2(61);
  LIST_NAME  VARCHAR2(40);
  RG_NAME    VARCHAR2(40);
--
  ITEM_ID    ITEM;
  LOV_ID     LOV;
  RG_ID      RECORDGROUP;
--
  ERR_CODE   NUMBER;
--
BEGIN
--
-- Check if Finance is installed and if not, exit.
--
  IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0099','LIB','*WARNING* BANNER Finance is not installed.'));
    RETURN;
  END IF;
--
-- Get the item name and the LOV name for that item.
--
  ITEM_NAME := NAME_IN( 'SYSTEM.CURSOR_ITEM' );
  LIST_NAME := GET_ITEM_PROPERTY( ITEM_NAME, LOV_NAME );
  RG_NAME   := GET_LOV_PROPERTY( LIST_NAME, GROUP_NAME );
--
-- Populate the record_group.
--
  ERR_CODE := POPULATE_GROUP_WITH_QUERY( RG_NAME, 'SELECT FTVCTYP_CODE, '
                   || 'FTVCTYP_SHORT_DESC, FTVCTYP_LONG_DESC '
                   || 'FROM FTVCTYP ORDER BY FTVCTYP_CODE' );
--
-- If the populate fails, display error and exit.
--
  IF ERR_CODE <> 0 THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0100','LIB','*ERROR* Error populating the Cost Type List of Values.'));
    RAISE FORM_TRIGGER_FAILURE;
    RETURN;
  END IF;
--
-- Display the lov.
--
  G$_DISPLAY_LOV('','');
END;
	*/
	/* <p>
/* </p>
		*/
		
		public void gPopulateFtvctypLovd()
		{
			gPopulateFtvctypLovd("","","");
		}
		
		
		
		
		public void gPopulateFtvctypLovd(String codeAllias, String shortDescAllias, String longDescAllias)
		{
			// 
			//  Procedure to populate the dynamic/run time version of the 
			//  recordgroup.
			// 
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			NString rgName= NString.getNull();
			// 
			ItemDescriptor itemId= null;
			LovDescriptor lovId= null;
			ValueSet rgId= null;
			// 
			NNumber errCode= NNumber.getNull();
			// 
			//  Check if Finance is installed and if not, exit.
			// 
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("GOQRPLS-0099"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			// 
			//  Get the item name and the LOV name for that item.
			// 
			itemName = getCursorItem();
			listName = getItemLovName(itemName);
			rgName = getLovGroupName(listName);
			// 
			//  Populate the record_group.
			// 
			errCode = populateGroupWithQuery(rgName, toStr("SELECT FTVCTYP_CODE ").append(codeAllias).append(", ").append("FTVCTYP_SHORT_DESC ").append(shortDescAllias).append(",").append(" FTVCTYP_LONG_DESC ").append(longDescAllias).append("").append(" FROM FTVCTYP ORDER BY FTVCTYP_CODE"));
			// 
			//  If the populate fails, display error and exit.
			// 
			if ( errCode.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0100"), toStr("LIB"), toStr("*ERROR* Error populating the Cost Type List of Values.")));
				throw new ApplicationException();
				
			}
			// 
			//  Display the lov.
			// 
			gDisplayLov(toStr(""), toStr(""));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_POPULATE_FTVCOAS_LOVD
	/*
	PROCEDURE G$_POPULATE_FTVCOAS_LOVD IS
--
-- Procedure to populate the dynamic/run time version of the 
-- recordgroup.
--
  ITEM_NAME  VARCHAR2(61);
  LIST_NAME  VARCHAR2(40);
  RG_NAME    VARCHAR2(40);
--
  ITEM_ID    ITEM;
  LOV_ID     LOV;
  RG_ID      RECORDGROUP;
--
  ERR_CODE   NUMBER;
--
BEGIN
--
-- Check if Finance is installed and if not, exit.
--
  IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0097','LIB','*WARNING* BANNER Finance is not installed.'));
    RETURN;
  END IF;
--
-- Get the item name and the LOV name for that item.
--
  ITEM_NAME := NAME_IN( 'SYSTEM.CURSOR_ITEM' );
  LIST_NAME := GET_ITEM_PROPERTY( ITEM_NAME, LOV_NAME );
  RG_NAME   := GET_LOV_PROPERTY( LIST_NAME, GROUP_NAME );
--
-- Populate the record_group.
--
  ERR_CODE := POPULATE_GROUP_WITH_QUERY( RG_NAME, 'SELECT FTVCOAS_COAS_CODE, '
                   || 'FTVCOAS_TITLE, FTVCOAS_STATUS_IND, '
                   || 'TO_CHAR(FTVCOAS_EFF_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || '), ' 
                   || 'TO_CHAR(FTVCOAS_TERM_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || ') '
                   || 'FROM FTVCOAS ORDER BY FTVCOAS_COAS_CODE' );
--
-- If the populate fails, display error and exit.
--
  IF ERR_CODE <> 0 THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0098','LIB','*ERROR* Error populating the Chart of Accounts List of Values.'));
    RAISE FORM_TRIGGER_FAILURE;
    RETURN;
  END IF;
--
-- Display the lov.
--
  G$_DISPLAY_LOV('','');
END;
	*/
	/* <p>
/* </p>
		*/
		
		public void gPopulateFtvcoasLovd()
		{
			gPopulateFtvcoasLovd("COAS", "TITLE", "STATUS","EFF","TERM");
		}
		
		public void gPopulateFtvcoasLovd(String coasAllias, String titleAllias, String statusAllias, String effDateAllias, String termAllias)
		{
			// 
			//  Procedure to populate the dynamic/run time version of the 
			//  recordgroup.
			// 
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			NString rgName= NString.getNull();
			// 
			ItemDescriptor itemId= null;
			LovDescriptor lovId= null;
			ValueSet rgId= null;
			// 
			NNumber errCode= NNumber.getNull();
			// 
			//  Check if Finance is installed and if not, exit.
			// 
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("GOQRPLS-0097"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			// 
			//  Get the item name and the LOV name for that item.
			// 
			itemName = getCursorItem();
			listName = getItemLovName(itemName);
			rgName = getLovGroupName(listName);
			// 
			//  Populate the record_group.
			// 
			errCode = populateGroupWithQuery(rgName, 
					toStr("SELECT FTVCOAS_COAS_CODE ").append(coasAllias).append(", ")
					.append(" FTVCOAS_TITLE ").append(titleAllias).append(",")
					.append(" FTVCOAS_STATUS_IND ").append(statusAllias).append(", ")
					.append(" TO_CHAR(FTVCOAS_EFF_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append(effDateAllias).append(", ")
					.append(" TO_CHAR(FTVCOAS_TERM_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append(termAllias)
					.append(" FROM FTVCOAS ORDER BY FTVCOAS_COAS_CODE"));
			
			// 
			//  If the populate fails, display error and exit.
			// 
			if ( errCode.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0098"), toStr("LIB"), toStr("*ERROR* Error populating the Chart of Accounts List of Values.")));
				throw new ApplicationException();
				
			}
			// 
			//  Display the lov.
			// 
			gDisplayLov(toStr(""), toStr(""));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_POPULATE_FTVATYP_LOVD
	/*
	PROCEDURE G$_POPULATE_FTVATYP_LOVD IS
--
-- Procedure to populate the dynamic/run time version of the 
-- recordgroup.
--
  ITEM_NAME  VARCHAR2(61);
  LIST_NAME  VARCHAR2(40);
  RG_NAME    VARCHAR2(40);
--
  ITEM_ID    ITEM;
  LOV_ID     LOV;
  RG_ID      RECORDGROUP;
--
  ERR_CODE   NUMBER;
--
BEGIN
--
-- Check if Finance is installed and if not, exit.
--
  IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0095','LIB','*WARNING* BANNER Finance is not installed.'));
    RETURN;
  END IF;
--
-- Get the item name and the LOV name for that item.
--
  ITEM_NAME := NAME_IN( 'SYSTEM.CURSOR_ITEM' );
  LIST_NAME := GET_ITEM_PROPERTY( ITEM_NAME, LOV_NAME );
  RG_NAME   := GET_LOV_PROPERTY( LIST_NAME, GROUP_NAME );
--
-- If the record_group doesn't exist, create it.
--
  ERR_CODE := POPULATE_GROUP_WITH_QUERY( RG_NAME, 'SELECT FTVATYP_COAS_CODE, '
                   || 'FTVATYP_ATYP_CODE, FTVATYP_TITLE, FTVATYP_ATYP_CODE_PRED, '
                   || ' FTVATYP_STATUS_IND, '
                   || 'TO_CHAR(FTVATYP_EFF_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || '), '
                   || 'TO_CHAR(FTVATYP_TERM_DATE, ' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || ') '
                   || 'FROM FTVATYP ORDER BY DECODE(FTVATYP_COAS_CODE, ' 
                   || ' :GLOBAL.COAS_CODE, ' || '''' || ' ' || '''' || ', FTVATYP_COAS_CODE), ' 
                   || 'FTVATYP_ATYP_CODE, '
                   || 'FTVATYP_EFF_DATE' );
--
-- If the populate fails, display error and exit.
--
  IF ERR_CODE <> 0 THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0096','LIB','*ERROR* Error populating the Organization List of Values.'));
    RAISE FORM_TRIGGER_FAILURE;
    RETURN;
  END IF;
--
-- Display the lov.
--
  G$_DISPLAY_LOV('','');
END;
	*/
	/* <p>
/* </p>
		*/
		public void gPopulateFtvatypLovd()
		{
			// 
			//  Procedure to populate the dynamic/run time version of the 
			//  recordgroup.
			// 
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			NString rgName= NString.getNull();
			// 
			ItemDescriptor itemId= null;
			LovDescriptor lovId= null;
			ValueSet rgId= null;
			// 
			NNumber errCode= NNumber.getNull();
			// 
			//  Check if Finance is installed and if not, exit.
			// 
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("GOQRPLS-0095"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			// 
			//  Get the item name and the LOV name for that item.
			// 
			itemName = getCursorItem();
			listName = getItemLovName(itemName);
			rgName = getLovGroupName(listName);
			// 
			//  If the record_group doesn't exist, create it.
			// 
			errCode = populateGroupWithQuery(rgName, toStr("SELECT FTVATYP_COAS_CODE, ").append("FTVATYP_ATYP_CODE, FTVATYP_TITLE, FTVATYP_ATYP_CODE_PRED, ").append(" FTVATYP_STATUS_IND, ").append("TO_CHAR(FTVATYP_EFF_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append("), ").append("TO_CHAR(FTVATYP_TERM_DATE, ").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append("FROM FTVATYP ORDER BY DECODE(FTVATYP_COAS_CODE, ").append(" '").append(Globals.getString("COAS_CODE")).append("', ").append("'").append(" ").append("'").append(", FTVATYP_COAS_CODE), ").append("FTVATYP_ATYP_CODE, ").append("FTVATYP_EFF_DATE"));
			// 
			//  If the populate fails, display error and exit.
			// 
			if ( errCode.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0096"), toStr("LIB"), toStr("*ERROR* Error populating the Organization List of Values.")));
				throw new ApplicationException();
				
			}
			// 
			//  Display the lov.
			// 
			gDisplayLov(toStr(""), toStr(""));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_POPULATE_FTVACTV_LOVD
	/*
	PROCEDURE G$_POPULATE_FTVACTV_LOVD IS
--
-- Procedure to populate the dynamic/run time version of the 
-- recordgroup.
--
  ITEM_NAME  VARCHAR2(61);
  LIST_NAME  VARCHAR2(40);
  RG_NAME    VARCHAR2(40);
--
  ITEM_ID    ITEM;
  LOV_ID     LOV;
  RG_ID      RECORDGROUP;
--
  ERR_CODE   NUMBER;
--
BEGIN
--
-- Check if Finance is installed and if not, exit.
--
  IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0093','LIB','*WARNING* BANNER Finance is not installed.'));
    RETURN;
  END IF;
--
-- Get the item name and the LOV name for that item.
--
  ITEM_NAME := NAME_IN( 'SYSTEM.CURSOR_ITEM' );
  LIST_NAME := GET_ITEM_PROPERTY( ITEM_NAME, LOV_NAME );
  RG_NAME   := GET_LOV_PROPERTY( LIST_NAME, GROUP_NAME );
--
-- Populate the record_group.
--
  ERR_CODE := POPULATE_GROUP_WITH_QUERY( RG_NAME, 'SELECT FTVACTV_COAS_CODE, '
                   || 'FTVACTV_ACTV_CODE, FTVACTV_TITLE, FTVACTV_STATUS_IND, '
                   || 'TO_CHAR(FTVACTV_EFF_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || '), ' 
                   || 'TO_CHAR(FTVACTV_TERM_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || ') '
                   || 'FROM FTVACTV ORDER BY DECODE(FTVACTV_COAS_CODE, ' 
                   || ' :GLOBAL.COAS_CODE, ' || '''' || ' ' || '''' || ', FTVACTV_COAS_CODE), ' 
                   || 'FTVACTV_ACTV_CODE, FTVACTV_EFF_DATE' );
--
-- If the populate fails, display error and exit.
--
  IF ERR_CODE <> 0 THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0094','LIB','*ERROR* Error populating the Chart of Accounts List of Values.'));
    RAISE FORM_TRIGGER_FAILURE;
    RETURN;
  END IF;
--
-- Display the lov.
--
  G$_DISPLAY_LOV('','');
END;
	*/
	/* <p>
/* </p>
		*/
		public void gPopulateFtvactvLovd()
		{
			// 
			//  Procedure to populate the dynamic/run time version of the 
			//  recordgroup.
			// 
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			NString rgName= NString.getNull();
			// 
			ItemDescriptor itemId= null;
			LovDescriptor lovId= null;
			ValueSet rgId= null;
			// 
			NNumber errCode= NNumber.getNull();
			// 
			//  Check if Finance is installed and if not, exit.
			// 
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("GOQRPLS-0093"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			// 
			//  Get the item name and the LOV name for that item.
			// 
			itemName = getCursorItem();
			listName = getItemLovName(itemName);
			rgName = getLovGroupName(listName);
			// 
			//  Populate the record_group.
			// 
			errCode = populateGroupWithQuery(rgName, toStr("SELECT FTVACTV_COAS_CODE, ").append("FTVACTV_ACTV_CODE, FTVACTV_TITLE, FTVACTV_STATUS_IND, ").append("TO_CHAR(FTVACTV_EFF_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append("), ").append("TO_CHAR(FTVACTV_TERM_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append("FROM FTVACTV ORDER BY DECODE(FTVACTV_COAS_CODE, ").append(" '").append(Globals.getString("COAS_CODE")).append("', ").append("'").append(" ").append("'").append(", FTVACTV_COAS_CODE), ").append("FTVACTV_ACTV_CODE, FTVACTV_EFF_DATE"));
			// 
			//  If the populate fails, display error and exit.
			// 
			if ( errCode.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0094"), toStr("LIB"), toStr("*ERROR* Error populating the Chart of Accounts List of Values.")));
				throw new ApplicationException();
				
			}
			// 
			//  Display the lov.
			// 
			gDisplayLov(toStr(""), toStr(""));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_POPULATE_FTVACCT_LOVD
	/*
	PROCEDURE G$_POPULATE_FTVACCT_LOVD IS
--
-- Procedure to populate the dynamic/run time version of the 
-- recordgroup.
--
  ITEM_NAME  VARCHAR2(61);
  LIST_NAME  VARCHAR2(40);
  RG_NAME    VARCHAR2(40);
--
  ITEM_ID    ITEM;
  LOV_ID     LOV;
  RG_ID      RECORDGROUP;
--
  ERR_CODE   NUMBER;
--
BEGIN
--
-- Check if Finance is installed and if not, exit.
--
  IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0091','LIB','*WARNING* BANNER Finance is not installed.'));
    RETURN;
  END IF;
--
-- Get the item name and the LOV name for that item.
--
  ITEM_NAME := NAME_IN( 'SYSTEM.CURSOR_ITEM' );
  LIST_NAME := GET_ITEM_PROPERTY( ITEM_NAME, LOV_NAME );
  RG_NAME   := GET_LOV_PROPERTY( LIST_NAME, GROUP_NAME );
--
-- If the record_group doesn't exist, create it.
--
  ERR_CODE := POPULATE_GROUP_WITH_QUERY( RG_NAME, 'SELECT FTVACCT_COAS_CODE, '
                   || 'FTVACCT_ACCT_CODE, FTVACCT_TITLE, FTVACCT_ATYP_CODE, '
                   || 'FTVACCT_DATA_ENTRY_IND, FTVACCT_STATUS_IND, '
                   || 'TO_CHAR(FTVACCT_EFF_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || '), '
                   || 'TO_CHAR(FTVACCT_TERM_DATE, ' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || ') '
                   || 'FROM FTVACCT ORDER BY DECODE(FTVACCT_COAS_CODE, ' 
                   || ' :GLOBAL.COAS_CODE, ' || '''' || ' ' || '''' || ', FTVACCT_COAS_CODE), ' 
                   || 'FTVACCT_DATA_ENTRY_IND DESC, FTVACCT_ACCT_CODE, '
                   || 'FTVACCT_EFF_DATE' );
--
-- If the populate fails, display error and exit.
--
  IF ERR_CODE <> 0 THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0092','LIB','*ERROR* Error populating the Organization List of Values.'));
    RAISE FORM_TRIGGER_FAILURE;
    RETURN;
  END IF;
--
-- Display the lov.
--
  G$_DISPLAY_LOV('','');
END;
	*/
	/* <p>
/* </p>
		*/
		public void gPopulateFtvacctLovd()
		{
			// 
			//  Procedure to populate the dynamic/run time version of the 
			//  recordgroup.
			// 
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			NString rgName= NString.getNull();
			// 
			ItemDescriptor itemId= null;
			LovDescriptor lovId= null;
			ValueSet rgId= null;
			// 
			NNumber errCode= NNumber.getNull();
			// 
			//  Check if Finance is installed and if not, exit.
			// 
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("GOQRPLS-0091"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			// 
			//  Get the item name and the LOV name for that item.
			// 
			itemName = getCursorItem();
			listName = getItemLovName(itemName);
			rgName = getLovGroupName(listName);
			// 
			//  If the record_group doesn't exist, create it.
			// 
			errCode = populateGroupWithQuery(rgName, toStr("SELECT FTVACCT_COAS_CODE, ").append("FTVACCT_ACCT_CODE, FTVACCT_TITLE, FTVACCT_ATYP_CODE, ").append("FTVACCT_DATA_ENTRY_IND, FTVACCT_STATUS_IND, ").append("TO_CHAR(FTVACCT_EFF_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append("), ").append("TO_CHAR(FTVACCT_TERM_DATE, ").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append("FROM FTVACCT ORDER BY DECODE(FTVACCT_COAS_CODE, ").append(" '").append(Globals.getString("COAS_CODE")).append("', ").append("'").append(" ").append("'").append(", FTVACCT_COAS_CODE), ").append("FTVACCT_DATA_ENTRY_IND DESC, FTVACCT_ACCT_CODE, ").append("FTVACCT_EFF_DATE"));
			// 
			//  If the populate fails, display error and exit.
			// 
			if ( errCode.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0092"), toStr("LIB"), toStr("*ERROR* Error populating the Organization List of Values.")));
				throw new ApplicationException();
							}
			// 
			//  Display the lov.
			// 
			gDisplayLov(toStr(""), toStr(""));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_POPULATE_FTVACCI_LOVD
	/*
	PROCEDURE G$_POPULATE_FTVACCI_LOVD IS
--
-- Procedure to populate the dynamic/run time version of the 
-- recordgroup.
--
  ITEM_NAME  VARCHAR2(61);
  LIST_NAME  VARCHAR2(40);
  RG_NAME    VARCHAR2(40);
--
  ITEM_ID    ITEM;
  LOV_ID     LOV;
  RG_ID      RECORDGROUP;
--
  ERR_CODE   NUMBER;
--
BEGIN
--
-- Check if Finance is installed and if not, exit.
--
  IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0089','LIB','*WARNING* BANNER Finance is not installed.'));
    RETURN;
  END IF;
--
-- Get the item name and the LOV name for that item.
--
  ITEM_NAME := NAME_IN( 'SYSTEM.CURSOR_ITEM' );
  LIST_NAME := GET_ITEM_PROPERTY( ITEM_NAME, LOV_NAME );
  RG_NAME   := GET_LOV_PROPERTY( LIST_NAME, GROUP_NAME );
--
-- Populate the record_group.
--
  ERR_CODE := POPULATE_GROUP_WITH_QUERY( RG_NAME, 'SELECT FTVACCI_COAS_CODE, '
                   || 'FTVACCI_ACCI_CODE, FTVACCI_TITLE, FTVACCI_STATUS_IND, '
                   || 'TO_CHAR(FTVACCI_EFF_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || '), ' 
                   || 'TO_CHAR(FTVACCI_TERM_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || ') '
                   || 'FROM FTVACCI ORDER BY DECODE(FTVACCI_COAS_CODE, ' 
                   || ' :GLOBAL.COAS_CODE, ' || '''' || ' ' || '''' || ', FTVACCI_COAS_CODE), ' 
                   || 'FTVACCI_ACCI_CODE, FTVACCI_EFF_DATE' );
--
-- If the populate fails, display error and exit.
--
  IF ERR_CODE <> 0 THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0090','LIB','*ERROR* Error populating the Chart of Accounts List of Values.'));
    RAISE FORM_TRIGGER_FAILURE;
    RETURN;
  END IF;
--
-- Display the lov.
--
  G$_DISPLAY_LOV('','');
END;
	*/
	/* <p>
/* </p>
		*/
		
		public void gPopulateFtvacciLovd()
		{
			gPopulateFtvacciLovd("","","","","","");
		}
		
		
		
		
		
		public void gPopulateFtvacciLovd(String coasCodeAllias, String acciAlias, String titleAllias, String statusAllias, String effDateAllias,String termAllias)
		{
			// 
			//  Procedure to populate the dynamic/run time version of the 
			//  recordgroup.
			// 
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			NString rgName= NString.getNull();
			// 
			ItemDescriptor itemId= null;
			LovDescriptor lovId= null;
			ValueSet rgId= null;
			// 
			NNumber errCode= NNumber.getNull();
			// 
			//  Check if Finance is installed and if not, exit.
			// 
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("GOQRPLS-0089"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			// 
			//  Get the item name and the LOV name for that item.
			// 
			itemName = getCursorItem();
			listName = getItemLovName(itemName);
			rgName = getLovGroupName(listName);
			// 
			//  Populate the record_group.
			// 
			errCode = populateGroupWithQuery(rgName, toStr("SELECT FTVACCI_COAS_CODE ").append(coasCodeAllias).append(", ").append(" FTVACCI_ACCI_CODE ").append(acciAlias).append(" ,").append(" FTVACCI_TITLE ").append(titleAllias).append(" ,").append(" FTVACCI_STATUS_IND ").append(statusAllias).append(" , ").append("TO_CHAR(FTVACCI_EFF_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append(effDateAllias).append(", ").append("TO_CHAR(FTVACCI_TERM_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append(termAllias).append(" FROM FTVACCI ORDER BY DECODE(FTVACCI_COAS_CODE, '").append(getGlobal("COAS_CODE")).append("', ").append("'").append(" ").append("'").append(", FTVACCI_COAS_CODE), ").append("FTVACCI_ACCI_CODE, FTVACCI_EFF_DATE"));
			// 
			//  If the populate fails, display error and exit.
			// 
			if ( errCode.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0090"), toStr("LIB"), toStr("*ERROR* Error populating the Chart of Accounts List of Values.")));
				throw new ApplicationException();
				
			}
			// 
			//  Display the lov.
			// 
			gDisplayLov(toStr(""), toStr(""));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_POPULATE_ETHNICITY_LIST
	/*
	PROCEDURE G$_POPULATE_ETHNICITY_LIST (p_item_name VARCHAR2) IS
--
  lv_rg_name    VARCHAR2(30) := 'ETHN_RG';
  lv_rg_id      RECORDGROUP  := FIND_GROUP(lv_rg_name);
  lv_list_id    ITEM         := FIND_ITEM(p_item_name);
  lv_id_count   PLS_INTEGER;
  lv_query_text VARCHAR2(1000) := gb_race_ethnicity.f_new_ethnicity_values;
--
BEGIN
  IF ID_NULL(lv_rg_id) THEN
    lv_rg_id := CREATE_GROUP_FROM_QUERY(lv_rg_name, lv_query_text);
    lv_id_count := POPULATE_GROUP(lv_rg_id);
  ELSE
    DELETE_GROUP_ROW(lv_rg_id,ALL_ROWS);
    lv_id_count := POPULATE_GROUP_WITH_QUERY(lv_rg_id, lv_query_text);
  END IF;
--
  POPULATE_LIST(lv_list_id, lv_rg_name);
END;
	*/
	/* <p>
/* </p>
		* @param pItemName
		*/
		public void gPopulateEthnicityList(NString pItemName)
		{
			// 
			NString lvRgName = toStr("ETHN_RG");
			ValueSet lvRgId = findGroup(lvRgName);
			ItemDescriptor lvListId = findItem(pItemName);
			NInteger lvIdCount= NInteger.getNull();
			NString lvQueryText = GbRaceEthnicity.fNewEthnicityValues();
			if ( (lvRgId == null) )
			{
				lvRgId = createGroupFromQuery(lvRgName, lvQueryText);
				lvIdCount = toInt(populateGroup(lvRgId));
			}
			else {
				deleteGroupRow(lvRgId, ValueSet.ALL_ROWS);
				lvIdCount = toInt(populateGroupWithQuery(lvRgId, lvQueryText));
			}
			// 
			populateList(lvListId, lvRgId);
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_POPULATE_ATVGIFT_LOVD
	/*
	PROCEDURE G$_POPULATE_ATVGIFT_LOVD IS
--
-- Procedure to populate the dynamic/run time version of the 
-- record group.
--
  ITEM_NAME  VARCHAR2(61);
  LIST_NAME  VARCHAR2(40);
  RG_NAME    VARCHAR2(40);
--
  ITEM_ID    ITEM;
  LOV_ID     LOV;
  RG_ID      RECORDGROUP;
--
  ERR_CODE   NUMBER;
--
BEGIN
--
-- Check if Finance is installed and if not, exit.
--
  IF NAME_IN('GLOBAL.RESSYS') <> 'Y' THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0087','LIB','List of Values not available'));
    RETURN;
  END IF;
--
-- Get the item name and the LOV name for that item.
--
  ITEM_NAME := NAME_IN( 'SYSTEM.CURSOR_ITEM' );
  LIST_NAME := GET_ITEM_PROPERTY( ITEM_NAME, LOV_NAME );
  RG_NAME   := GET_LOV_PROPERTY( LIST_NAME, GROUP_NAME );
--
-- If the record_group doesn't exist, create it.
--  
  ERR_CODE := POPULATE_GROUP_WITH_QUERY( RG_NAME, 
                      'SELECT ATVGIFT_CODE, '
                   || 'ATVGIFT_DESC, '
                   || 'TO_CHAR(ATVGIFT_ACTIVITY_DATE,' 
                   || '''' || G$_DATE.GET_NLS_DATE_FORMAT || '''' || ') ' 
                   || 'FROM ATVGIFT '
                   || 'WHERE ATVGIFT_CREDIT_CARD_IND = '
                   || '''' || 'Y' || '''' 
                   || ' ORDER BY ATVGIFT_CODE ');
--
-- If the populate fails, display error and exit.
--
  IF ERR_CODE <> 0 THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0088','LIB','*ERROR* Error populating the Gift Type Code List of Values.'));
    RAISE FORM_TRIGGER_FAILURE;
    RETURN;
  END IF;
--
-- Display the lov.
--
  G$_DISPLAY_LOV('','');
END;
	*/
	/* <p>
/* </p>
		*/
		public void gPopulateAtvgiftLovd()
		{
			// 
			//  Procedure to populate the dynamic/run time version of the 
			//  record group.
			// 
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			NString rgName= NString.getNull();
			// 
			ItemDescriptor itemId= null;
			LovDescriptor lovId= null;
			ValueSet rgId= null;
			// 
			NNumber errCode= NNumber.getNull();
			// 
			//  Check if Finance is installed and if not, exit.
			// 
			if ( getNameIn("GLOBAL.RESSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("GOQRPLS-0087"), toStr("LIB"), toStr("List of Values not available")));
				return ;
			}
			// 
			//  Get the item name and the LOV name for that item.
			// 
			itemName = getCursorItem();
			listName = getItemLovName(itemName);
			rgName = getLovGroupName(listName);
			// 
			//  If the record_group doesn't exist, create it.
			//   
			errCode = populateGroupWithQuery(rgName, toStr("SELECT ATVGIFT_CODE, ").append("ATVGIFT_DESC, ").append("TO_CHAR(ATVGIFT_ACTIVITY_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append("FROM ATVGIFT ").append("WHERE ATVGIFT_CREDIT_CARD_IND = ").append("'").append("Y").append("'").append(" ORDER BY ATVGIFT_CODE "));
			// 
			//  If the populate fails, display error and exit.
			// 
			if ( errCode.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0088"), toStr("LIB"), toStr("*ERROR* Error populating the Gift Type Code List of Values.")));
				throw new ApplicationException();
				
			}
			// 
			//  Display the lov.
			// 
			gDisplayLov(toStr(""), toStr(""));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_NVA_SET_WINDOW
	/*
	PROCEDURE G$_NVA_SET_WINDOW IS
  lv_va    VISUALATTRIBUTE := FIND_VA('G$_NVA_WINDOW');
  lv_value VARCHAR2(30);
BEGIN
  DEFAULT_VALUE('','GLOBAL.UI_WINDOW_COLOR');
--
  lv_value := NAME_IN('GLOBAL.UI_WINDOW_COLOR');
  IF lv_value IS NULL THEN
    RETURN;
  ELSE
    IF NOT ID_NULL(lv_va) THEN
    	SET_VA_PROPERTY(lv_va,BACKGROUND_COLOR,lv_value);
    END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gNvaSetWindow()
		{
			//MORPHIS: TODO Check this code
//			UnknownTypes.Visualattribute lvVa = (UnknownTypes.Visualattribute)SupportClasses.FORMS40.FindVa("G$_NVA_WINDOW");
//			NString lvValue= NString.getNull();
//			setDefaultValue("", "GLOBAL.UI_WINDOW_COLOR");
//			// 
//			lvValue = getNameIn("GLOBAL.UI_WINDOW_COLOR");
//			if ( lvValue.isNull() )
//			{
//				return ;
//			}
//			else {
//				if ( !(lvVa == null) )
//				{
//					// F2J_NOT_SUPPORTED : The property "VA's backgroundColor" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12".
//					//					SupportClasses.FORMS40.SetVaProperty(lvVa, backgroundColor, lvValue);
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'VA's backgroundColor' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12'.");
//					
//				}
//			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_NVA_SET_SEPARATOR_LINE
	/*
	PROCEDURE G$_NVA_SET_SEPARATOR_LINE IS
  lv_va    VISUALATTRIBUTE := FIND_VA('G$_NVA_DATA_SEPARATOR_LINE');
  lv_value VARCHAR2(30);
BEGIN
  DEFAULT_VALUE('','GLOBAL.UI_SEPARATOR_LINE_COLOR');
--
  lv_value := NAME_IN('GLOBAL.UI_SEPARATOR_LINE_COLOR');
  IF lv_value IS NULL THEN
  	RETURN;
  ELSE
    IF NOT ID_NULL(lv_va) THEN
    	SET_VA_PROPERTY(lv_va,BACKGROUND_COLOR,lv_value);
    END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gNvaSetSeparatorLine()
		{
			//MORPHIS: TODO Check this code
//			UnknownTypes.Visualattribute lvVa = (UnknownTypes.Visualattribute)SupportClasses.FORMS40.FindVa("G$_NVA_DATA_SEPARATOR_LINE");
//			NString lvValue= NString.getNull();
//			setDefaultValue("", "GLOBAL.UI_SEPARATOR_LINE_COLOR");
//			// 
//			lvValue = getNameIn("GLOBAL.UI_SEPARATOR_LINE_COLOR");
//			if ( lvValue.isNull() )
//			{
//				return ;
//			}
//			else {
//				if ( !(lvVa == null) )
//				{
//					// F2J_NOT_SUPPORTED : The property "VA's backgroundColor" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12".
//					//					SupportClasses.FORMS40.SetVaProperty(lvVa, backgroundColor, lvValue);
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'VA's backgroundColor' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12'.");
//					
//				}
//			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_NVA_SET_SCROLLBAR
	/*
	PROCEDURE G$_NVA_SET_SCROLLBAR IS
  lv_va    VISUALATTRIBUTE := FIND_VA('G$_NVA_SCROLLBAR');
  lv_value VARCHAR2(30);
BEGIN
  DEFAULT_VALUE('','GLOBAL.UI_SCROLLBAR_COLOR');
--
  lv_value := NAME_IN('GLOBAL.UI_SCROLLBAR_COLOR');
  IF lv_value IS NULL THEN
  	RETURN;
  ELSE
    IF NOT ID_NULL(lv_va) THEN
    	SET_VA_PROPERTY(lv_va,BACKGROUND_COLOR,lv_value);
    END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gNvaSetScrollbar()
		{
			//MORPHIS: TODO Check this code
//			UnknownTypes.Visualattribute lvVa = (UnknownTypes.Visualattribute)SupportClasses.FORMS40.FindVa("G$_NVA_SCROLLBAR");
//			NString lvValue= NString.getNull();
//			setDefaultValue("", "GLOBAL.UI_SCROLLBAR_COLOR");
//			// 
//			lvValue = getNameIn("GLOBAL.UI_SCROLLBAR_COLOR");
//			if ( lvValue.isNull() )
//			{
//				return ;
//			}
//			else {
//				if ( !(lvVa == null) )
//				{
//					// F2J_NOT_SUPPORTED : The property "VA's backgroundColor" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12".
//					//					SupportClasses.FORMS40.SetVaProperty(lvVa, backgroundColor, lvValue);
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'VA's backgroundColor' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12'.");
//					
//				}
//			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_NVA_SET_RECORD
	/*
	PROCEDURE G$_NVA_SET_RECORD IS
  lv_va1   VISUALATTRIBUTE := FIND_VA('G$_NVA_HIGHLITE_FIXED_TEXT');
  lv_va2   VISUALATTRIBUTE := FIND_VA('G$_NVA_HIGHLITE_TEXT');
  lv_value VARCHAR2(30);
BEGIN
  DEFAULT_VALUE('','GLOBAL.UI_RECORD_COLOR');
--
  lv_value := NAME_IN('GLOBAL.UI_RECORD_COLOR');
  IF lv_value IS NULL THEN
    RETURN;
  ELSE
    IF NOT ID_NULL(lv_va1) THEN
    	SET_VA_PROPERTY(lv_va1,BACKGROUND_COLOR,lv_value);
    END IF;
--
    IF NOT ID_NULL(lv_va2) THEN
    	SET_VA_PROPERTY(lv_va2,BACKGROUND_COLOR,lv_value);
    END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gNvaSetRecord()
		{
			//MORPHIS: TODO Check this code
//			UnknownTypes.Visualattribute lvVa1 = (UnknownTypes.Visualattribute)SupportClasses.FORMS40.FindVa("G$_NVA_HIGHLITE_FIXED_TEXT");
//			UnknownTypes.Visualattribute lvVa2 = (UnknownTypes.Visualattribute)SupportClasses.FORMS40.FindVa("G$_NVA_HIGHLITE_TEXT");
//			NString lvValue= NString.getNull();
//			setDefaultValue("", "GLOBAL.UI_RECORD_COLOR");
//			// 
//			lvValue = getNameIn("GLOBAL.UI_RECORD_COLOR");
//			if ( lvValue.isNull() )
//			{
//				return ;
//			}
//			else {
//				if ( !(lvVa1 == null) )
//				{
//					// F2J_NOT_SUPPORTED : The property "VA's backgroundColor" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12".
//					//					SupportClasses.FORMS40.SetVaProperty(lvVa1, backgroundColor, lvValue);
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'VA's backgroundColor' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12'.");
//					
//				}
//				// 
//				if ( !(lvVa2 == null) )
//				{
//					// F2J_NOT_SUPPORTED : The property "VA's backgroundColor" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12".
//					//					SupportClasses.FORMS40.SetVaProperty(lvVa2, backgroundColor, lvValue);
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'VA's backgroundColor' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12'.");
//					
//				}
//			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_NVA_SET_PROMPT_CODE
	/*
	PROCEDURE G$_NVA_SET_PROMPT_CODE IS
  lv_va     VISUALATTRIBUTE := FIND_VA('G$_NVA_PROMPT_CODE');
  lv_value  VARCHAR2(30);
  lv_values VARCHAR2(30);
BEGIN
  DEFAULT_VALUE('','GLOBAL.UI_CODE_PROMPT_COLOR');
  DEFAULT_VALUE('','GLOBAL.UI_CODE_PROMPT_STYLE');
--
  lv_value  := NAME_IN('GLOBAL.UI_CODE_PROMPT_COLOR');
  lv_values := NAME_IN('GLOBAL.UI_CODE_PROMPT_STYLE');
  IF ID_NULL(lv_va) THEN
  	RETURN;
  ELSE
    IF lv_value IS NOT NULL THEN
    	SET_VA_PROPERTY(lv_va,FOREGROUND_COLOR,lv_value);
    END IF;
--
    IF lv_values IS NOT NULL THEN
    	SET_VA_PROPERTY(lv_va,FONT_STYLE,lv_values);
    END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gNvaSetPromptCode()
		{
			//MORPHIS: TODO Check this code
//			UnknownTypes.Visualattribute lvVa = (UnknownTypes.Visualattribute)SupportClasses.FORMS40.FindVa("G$_NVA_PROMPT_CODE");
//			NString lvValue= NString.getNull();
//			NString lvValues= NString.getNull();
//			setDefaultValue("", "GLOBAL.UI_CODE_PROMPT_COLOR");
//			setDefaultValue("", "GLOBAL.UI_CODE_PROMPT_STYLE");
//			// 
//			lvValue = getNameIn("GLOBAL.UI_CODE_PROMPT_COLOR");
//			lvValues = getNameIn("GLOBAL.UI_CODE_PROMPT_STYLE");
//			if ( (lvVa == null) )
//			{
//				return ;
//			}
//			else {
//				if ( !lvValue.isNull() )
//				{
//					// F2J_NOT_SUPPORTED : The property "VA's foregroundColor" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12".
//					//					SupportClasses.FORMS40.SetVaProperty(lvVa, foregroundColor, lvValue);
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'VA's foregroundColor' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12'.");
//					
//				}
//				// 
//				if ( !lvValues.isNull() )
//				{
//					// F2J_NOT_SUPPORTED : The property "VA's fontStyle" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12".
//					//					SupportClasses.FORMS40.SetVaProperty(lvVa, fontStyle, lvValues);
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'VA's fontStyle' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12'.");
//					
//				}
//			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_NVA_SET_PROMPT
	/*
	PROCEDURE G$_NVA_SET_PROMPT IS
  lv_va     VISUALATTRIBUTE := FIND_VA('G$_NVA_PROMPT');
--  lv_vac    VISUALATTRIBUTE := FIND_VA('G$_NVA_PROMPT_CODE');
  lv_value  VARCHAR2(30);
  lv_valuec VARCHAR2(30);
BEGIN
  DEFAULT_VALUE('','GLOBAL.UI_PROMPT_COLOR');
--  DEFAULT_VALUE('','GLOBAL.UI_CODE_PROMPT_COLOR');
--
  lv_value := NAME_IN('GLOBAL.UI_PROMPT_COLOR');
  IF lv_value IS NULL THEN
  	RETURN;
  ELSE
    IF NOT ID_NULL(lv_va) THEN
    	SET_VA_PROPERTY(lv_va,FOREGROUND_COLOR,lv_value);
    END IF;
<multilinecomment>
    IF NOT ID_NULL(lv_vac) THEN
    	SET_VA_PROPERTY(lv_vac,FOREGROUND_COLOR,lv_value);
    END IF;
</multilinecomment>
  END IF;
--
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gNvaSetPrompt()
		{
			//MORPHIS: TODO Check this code
//			UnknownTypes.Visualattribute lvVa = (UnknownTypes.Visualattribute)SupportClasses.FORMS40.FindVa("G$_NVA_PROMPT");
//			//   lv_vac    VISUALATTRIBUTE := FIND_VA('G$_NVA_PROMPT_CODE');
//			NString lvValue= NString.getNull();
//			NString lvValuec= NString.getNull();
//			setDefaultValue("", "GLOBAL.UI_PROMPT_COLOR");
//			//   DEFAULT_VALUE('','GLOBAL.UI_CODE_PROMPT_COLOR');
//			// 
//			lvValue = getNameIn("GLOBAL.UI_PROMPT_COLOR");
//			if ( lvValue.isNull() )
//			{
//				return ;
//			}
//			else {
//				if ( !(lvVa == null) )
//				{
//					// F2J_NOT_SUPPORTED : The property "VA's foregroundColor" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12".
//					//					SupportClasses.FORMS40.SetVaProperty(lvVa, foregroundColor, lvValue);
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'VA's foregroundColor' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12'.");
//					
//				}
//			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_NVA_SET_KEY_BLOCK
	/*
	PROCEDURE G$_NVA_SET_KEY_BLOCK IS
  lv_va    VISUALATTRIBUTE := FIND_VA('G$_NVA_KEY_BLOCK_ITEM');
  lv_value VARCHAR2(30);
BEGIN
  DEFAULT_VALUE('','GLOBAL.UI_KB_ITEM_BACKGROUND_COLOR');
--
  lv_value := NAME_IN('GLOBAL.UI_KB_ITEM_BACKGROUND_COLOR');
  IF lv_value IS NULL THEN
  	RETURN;
  ELSE
    IF NOT ID_NULL(lv_va) THEN
    	SET_VA_PROPERTY(lv_va,BACKGROUND_COLOR,lv_value);
    END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gNvaSetKeyBlock()
		{
			//MORPHIS: TODO Check this code
//			UnknownTypes.Visualattribute lvVa = (UnknownTypes.Visualattribute)SupportClasses.FORMS40.FindVa("G$_NVA_KEY_BLOCK_ITEM");
//			NString lvValue= NString.getNull();
//			setDefaultValue("", "GLOBAL.UI_KB_ITEM_BACKGROUND_COLOR");
//			// 
//			lvValue = getNameIn("GLOBAL.UI_KB_ITEM_BACKGROUND_COLOR");
//			if ( lvValue.isNull() )
//			{
//				return ;
//			}
//			else {
//				if ( !(lvVa == null) )
//				{
//					// F2J_NOT_SUPPORTED : The property "VA's backgroundColor" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12".
//					//					SupportClasses.FORMS40.SetVaProperty(lvVa, backgroundColor, lvValue);
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'VA's backgroundColor' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12'.");
//					
//				}
//			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_NVA_SET_ITEM
	/*
	PROCEDURE G$_NVA_SET_ITEM IS
  lv_va    VISUALATTRIBUTE := FIND_VA('G$_NVA_TEXT_ITEM');
  lv_value VARCHAR2(30);
BEGIN
  DEFAULT_VALUE('','GLOBAL.UI_ITEM_BACKGROUND_COLOR');
--
  lv_value := NAME_IN('GLOBAL.UI_ITEM_BACKGROUND_COLOR');
  IF lv_value IS NULL THEN
  	RETURN;
  ELSE
    IF NOT ID_NULL(lv_va) THEN
    	SET_VA_PROPERTY(lv_va,BACKGROUND_COLOR,lv_value);
    END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gNvaSetItem()
		{
			//MORPHIS: TODO Check this code
//			UnknownTypes.Visualattribute lvVa = (UnknownTypes.Visualattribute)SupportClasses.FORMS40.FindVa("G$_NVA_TEXT_ITEM");
//			NString lvValue= NString.getNull();
//			setDefaultValue("", "GLOBAL.UI_ITEM_BACKGROUND_COLOR");
//			// 
//			lvValue = getNameIn("GLOBAL.UI_ITEM_BACKGROUND_COLOR");
//			if ( lvValue.isNull() )
//			{
//				return ;
//			}
//			else {
//				if ( !(lvVa == null) )
//				{
//					// F2J_NOT_SUPPORTED : The property "VA's backgroundColor" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12".
//					//					SupportClasses.FORMS40.SetVaProperty(lvVa, backgroundColor, lvValue);
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'VA's backgroundColor' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12'.");
//					
//				}
//			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_NVA_SET_CANVAS
	/*
	PROCEDURE G$_NVA_SET_CANVAS IS
  lv_va    VISUALATTRIBUTE := FIND_VA('G$_NVA_CANVAS');
  lv_value VARCHAR2(30);
BEGIN
  DEFAULT_VALUE('','GLOBAL.UI_CANVAS_COLOR');
--
  lv_value := NAME_IN('GLOBAL.UI_CANVAS_COLOR');
  IF lv_value IS NULL THEN
  	RETURN;
  ELSE
    IF NOT ID_NULL(lv_va) THEN
    	SET_VA_PROPERTY(lv_va,BACKGROUND_COLOR,lv_value);
    END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gNvaSetCanvas()
		{
			//MORPHIS: TODO Check this code
//			UnknownTypes.Visualattribute lvVa = (UnknownTypes.Visualattribute)SupportClasses.FORMS40.FindVa("G$_NVA_CANVAS");
//			NString lvValue= NString.getNull();
//			setDefaultValue("", "GLOBAL.UI_CANVAS_COLOR");
//			// 
//			lvValue = getNameIn("GLOBAL.UI_CANVAS_COLOR");
//			if ( lvValue.isNull() )
//			{
//				return ;
//			}
//			else {
//				if ( !(lvVa == null) )
//				{
//					// F2J_NOT_SUPPORTED : The property "VA's backgroundColor" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12".
//					//					SupportClasses.FORMS40.SetVaProperty(lvVa, backgroundColor, lvValue);
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'VA's backgroundColor' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12'.");
//					
//				}
//			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_NVA_SET_BUTTON
	/*
	PROCEDURE G$_NVA_SET_BUTTON IS
  lv_va    VISUALATTRIBUTE := FIND_VA('G$_NVA_BUTTON_ITEM');
  lv_value VARCHAR2(30);
BEGIN
  DEFAULT_VALUE('','GLOBAL.UI_BUTTON_COLOR');
--
  lv_value := NAME_IN('GLOBAL.UI_BUTTON_COLOR');
  IF lv_value IS NULL THEN
    RETURN;
  ELSE
    IF NOT ID_NULL(lv_va) THEN
    	SET_VA_PROPERTY(lv_va,BACKGROUND_COLOR,lv_value);
    END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gNvaSetButton()
		{
			//MORPHIS: TODO Check this code
//			UnknownTypes.Visualattribute lvVa = (UnknownTypes.Visualattribute)SupportClasses.FORMS40.FindVa("G$_NVA_BUTTON_ITEM");
//			NString lvValue= NString.getNull();
//			setDefaultValue("", "GLOBAL.UI_BUTTON_COLOR");
//			// 
//			lvValue = getNameIn("GLOBAL.UI_BUTTON_COLOR");
//			if ( lvValue.isNull() )
//			{
//				return ;
//			}
//			else {
//				if ( !(lvVa == null) )
//				{
//					// F2J_NOT_SUPPORTED : The property "VA's backgroundColor" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12".
//					//					SupportClasses.FORMS40.SetVaProperty(lvVa, backgroundColor, lvValue);
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'VA's backgroundColor' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin12'.");
//					
//				}
//			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_NCHK
	/*
	FUNCTION G$_NCHK (CONDITION BOOLEAN) RETURN BOOLEAN IS
<multilinecomment> performs a Null Value check on passed value. </multilinecomment>
BEGIN
  RETURN NVL(CONDITION, TRUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param condition
		*/
		public NBool gNchk(NBool condition)
		{
			return isNull(condition, NBool.True);
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_MOUSE_DOUBLECLICK
	/*
	PROCEDURE G$_MOUSE_DOUBLECLICK IS
--
-- Determine the type of item that the cursor is currently on and
-- launch the appropriate action when the mouse button is Double Clicked.
--
  X                  BOOLEAN;
  MI_ID              MENUITEM;
  TI_ID              ITEM;
  CURRENT_BLOCK      VARCHAR2(30);
  CURRENT_BLOCK_FLD  VARCHAR2(61);
  KEY_PRESSED        VARCHAR2(10) := 'FALSE';
--
--Added for Intcal Implementation -- yslooi
--
  TEMP_STR           VARCHAR2(20);
  TEMP_DATE          VARCHAR2(20);
--  
BEGIN
  CLEAR_MESSAGE;
  KEY_PRESSED := NAME_IN('SYSTEM.MOUSE_BUTTON_SHIFT_STATE');
--
-- Is the mouse in an item.
--
  IF NAME_IN('SYSTEM.MOUSE_ITEM') IS NOT NULL THEN
--
-- Check if item is a button, display item, checkbox, list or radio group, and if so 
-- return
--
    IF GET_ITEM_PROPERTY(NAME_IN('SYSTEM.MOUSE_ITEM'),ITEM_TYPE) IN
      ('BUTTON', 'DISPLAY ITEM', 'CHECKBOX', 'LIST', 'RADIO GROUP') THEN
     RETURN;
    END IF;
--
-- Check if the shift key was held down and if so launch the help form.
--
    IF UPPER(KEY_PRESSED) = 'SHIFT+' OR
       UPPER(KEY_PRESSED) = 'SHIFT-' THEN
      G$_GUAHELP('N');
      NEXT_ITEM;
      SYNCHRONIZE;
      PREVIOUS_ITEM;
      SYNCHRONIZE;
      RETURN;
    END IF;
--
-- Get the block name, menu and button ids.
--
    CURRENT_BLOCK := SUBSTR(NAME_IN('SYSTEM.MOUSE_ITEM'),1,INSTR(NAME_IN('SYSTEM.MOUSE_ITEM'),'.')-1);
    CURRENT_BLOCK_FLD := NAME_IN('SYSTEM.MOUSE_ITEM');
    MI_ID := FIND_MENU_ITEM('ACTION.SELECT');
--
-- Check if on option's block and if so, exit.
--
    IF CURRENT_BLOCK = 'G$_OPT_BLOCK' THEN
      RETURN;
    END IF;
--
-- Check to see if the menu for SELECT is found and if so, if it is enabled.
--
    IF NOT ID_NULL(MI_ID) THEN
      IF GET_MENU_ITEM_PROPERTY(MI_ID,ENABLED) = 'TRUE' THEN
        DO_KEY('NEXT_KEY');
        RETURN;
      END IF;
    END IF;
--
-- If the item is a date or datetime field, call the calander form.
--
-- Changed for Intcal Implementation -- yslooi
--
    IF SUBSTR(GET_ITEM_PROPERTY(NAME_IN('SYSTEM.MOUSE_ITEM'),ITEM_NAME),1,8) = 'GREGDATE'
    OR GET_ITEM_PROPERTY(NAME_IN('SYSTEM.MOUSE_ITEM'),DATATYPE) IN ('DATE','DATETIME') THEN
      IF SUBSTR(GET_ITEM_PROPERTY(NAME_IN('SYSTEM.MOUSE_ITEM'),ITEM_NAME),1,8) = 'GREGDATE' THEN
      	TEMP_DATE:=NAME_IN('SYSTEM.CURSOR_VALUE');
      	SELECT TO_CHAR(TO_DATE(TEMP_DATE,G$_DATE.GET_NLS_DATE_FORMAT,'NLS_CALENDAR=''GREGORIAN'''),G$_DATE.GET_NLS_DATE_FORMAT)
      	INTO TEMP_STR FROM DUAL;
      	COPY(TEMP_STR,'GLOBAL.VALUE');
      ELSIF GET_ITEM_PROPERTY(NAME_IN('SYSTEM.MOUSE_ITEM'),DATATYPE)='DATE' THEN 
      	COPY(TO_CHAR(TO_DATE(NAME_IN('SYSTEM.CURSOR_VALUE')),G$_DATE.GET_NLS_DATE_FORMAT),'GLOBAL.VALUE');
      ELSE
        COPY(NAME_IN('SYSTEM.CURSOR_VALUE'),'GLOBAL.VALUE');
      END IF;
-- If item is not protected launch the calendar form
      IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATEABLE) = 'TRUE' OR
         (GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATE_NULL) = 'TRUE' AND
          NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL) OR
         (NAME_IN('SYSTEM.MODE') <> 'NORMAL' AND
          GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,QUERYABLE) = 'TRUE') OR
         (NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW' AND
          GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') OR
         (NAME_IN('SYSTEM.RECORD_STATUS') = 'INSERT' AND
          GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') THEN
      
        EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
        G$_CHECK_FAILURE;
        G$_SECURED_FORM_CALL(USER,'GUACALN','QUERY_NOHIDE');
--
        IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
          COPY(NAME_IN('GLOBAL.VALUE'),CURRENT_BLOCK_FLD);
          COPY('','GLOBAL.VALUE');
          DO_KEY('NEXT_ITEM');
        END IF;
      ELSE
          MESSAGE(G$_NLS.Get('GOQRPLS-0080', 'LIB','*ERROR* Item is protected against update.'));              
      END IF;
--
      RETURN;
    END IF;
--
-- If the item is a numeric field, call the calculator form.
--
    IF GET_ITEM_PROPERTY(NAME_IN('SYSTEM.MOUSE_ITEM'),DATATYPE) 
          IN ('INT','RINT','MONEY','RMONEY','NUMBER','RNUMBER') THEN
--
-- If item is not protected, launch the calendar.
--
      IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATEABLE) = 'TRUE' OR
         (GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATE_NULL) = 'TRUE' AND
          NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL) OR
         (NAME_IN('SYSTEM.MODE') <> 'NORMAL' AND
          GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,QUERYABLE) = 'TRUE') OR
         (NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW' AND
          GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') OR
         (NAME_IN('SYSTEM.RECORD_STATUS') = 'INSERT' AND
          GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') THEN
--
-- Not protected so call the form
--
        COPY(NAME_IN('SYSTEM.CURSOR_VALUE'),'GLOBAL.VALUE');
        EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
        G$_CHECK_FAILURE;
        G$_SECURED_FORM_CALL(USER,'GUACALC','QUERY_NOHIDE');
--
        IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
--
-- Check to see if money type of item and round to 2 decimals.
--
          IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,DATATYPE) IN ('MONEY','RMONEY') THEN
            COPY(TO_CHAR(ROUND(TO_NUMBER(NAME_IN('GLOBAL.VALUE')),2)),CURRENT_BLOCK_FLD);
--
-- Check to see if integer type of item and round to 0 decimals.
--
          ELSIF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,DATATYPE) IN ('INT','RINT') THEN
            COPY(TO_CHAR(ROUND(TO_NUMBER(NAME_IN('GLOBAL.VALUE')),0)),CURRENT_BLOCK_FLD);
          ELSE
            COPY(NAME_IN('GLOBAL.VALUE'),CURRENT_BLOCK_FLD);
          END IF;
--
          COPY('','GLOBAL.VALUE');
          DO_KEY('NEXT_ITEM');
        END IF;  
--
-- Is protected.
--
      ELSE
        MESSAGE(G$_NLS.Get('GOQRPLS-0081', 'LIB','*ERROR* Item is protected against update.'));              
      END IF;  
--
      RETURN;
    END IF;
--
  END IF;
END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gMouseDoubleclick()
		{
			
			//MORPHIS Check this code
			int rowCount = 0;
			// 
			//  Determine the type of item that the cursor is currently on and
			//  launch the appropriate action when the mouse button is Double Clicked.
			// 
//			NBool x= NBool.getNull();
			//MORPHIS Menu manipulation logic
			//MenuItemDescriptor miId= null;
			ItemDescriptor tiId= null;
			NString currentBlock= NString.getNull();
			NString currentBlockFld= NString.getNull();
			NString keyPressed = toStr("FALSE");
			// 
			// Added for Intcal Implementation -- yslooi
			// 
			NString tempStr= NString.getNull();
			NString tempDate= NString.getNull();
			clearMessage();
//			keyPressed = SupportClasses.AppContext.MouseButtonShiftState;
			// 
			//  Is the mouse in an item.
			// 
			if ( !getTriggerItem().isNull() )
			{
				// 
				//  Check if item is a button, display item, checkbox, list or radio group, and if so 
				//  return
				// 
				if ( in(getItemType(getTriggerItem()), "BUTTON", "DISPLAY ITEM", "CHECKBOX", "LIST", "RADIO GROUP").getValue() )
				{
					return ;
				}
				// 
				//  Check if the shift key was held down and if so launch the help form.
				// 
				if ( upper(keyPressed).equals("SHIFT+") || upper(keyPressed).equals("SHIFT-") )
				{
					gGuahelp(toStr("N"));
					nextItem();
					//SYNCHRONIZE
					doFullNavigation();
					//
					previousItem();
					//SYNCHRONIZE
					doFullNavigation();
					//
					return ;
				}
				// 
				//  Get the block name, menu and button ids.
				// 
				currentBlock = substring(getTriggerItem(), toInt(1), inStr(getTriggerItem(), toStr(".")).subtract(1));
				currentBlockFld = getTriggerItem();
				// F2J_NOT_SUPPORTED : Call to built-in "FIND_MENU_ITEM" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				miId = SupportClasses.FORMS40.FindMenuItem("ACTION.SELECT");
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'FIND_MENU_ITEM' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				
				// 
				//  Check if on option's block and if so, exit.
				// 
				if ( currentBlock.equals("G$_OPT_BLOCK") )
				{
					return ;
				}
				
				// 
				//  Check to see if the menu for SELECT is found and if so, if it is enabled.
				// 

				// MORPHIS: Alterado para a workspace task quando os forms chamados pelo menu n�o passem pelo GUAINIT. Este codigo é um alternativa ao codigo comentado em baixo, por agora. if ( !(miId == null) ) etc etc
				//if (!((BaseTask)getCurrentTask()).getParentName().equalsIgnoreCase("GUAINIT")){
//				if (!((BaseTask)getCurrentTask()).getParent().isWorkspace()){
                if(ItemServices.getItemVisible("MENU_CONTROL.SELECT_BT").isTrue()){
					executeAction("KEY-NXTKEY");
					return;
				}
//				if ( !(miId == null) )
//				{
//					if ( getMenuItemEnabled(miId).equals("TRUE") )
//					{
//						// F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin13".
//						//						SupportClasses.SQLFORMS.DoKey("NEXT_KEY");
//						System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin13'.");
//						
//						return ;
//					}
//				}
				
				
				// 
				//  If the item is a date or datetime field, call the calander form.
				// 
				//  Changed for Intcal Implementation -- yslooi
				// 
				// F2J_TODO : Check if the function used in the expression below may be called more than once. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#FunctionUsedInIn".
				if ( substring(getItemName(getTriggerItem()), toInt(1), toInt(8)).equals("GREGDATE") || in(getItemDataType(getTriggerItem()), "DATE", "DATETIME").getValue() )
				{
					if ( substring(getItemName(getTriggerItem()), toInt(1), toInt(8)).equals("GREGDATE") )
					{
						tempDate = toStr(getNameIn("SYSTEM.CURSOR_VALUE"));
						String sql1 = "SELECT TO_CHAR(TO_DATE(:P_TEMP_DATE, G$_DATE.GET_NLS_DATE_FORMAT, 'NLS_CALENDAR=''GREGORIAN'''), G$_DATE.GET_NLS_DATE_FORMAT) " +
	" FROM DUAL ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("P_TEMP_DATE", tempDate);
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							tempStr = results1.getStr(0);
						}
						results1.close();
						copy(tempStr,"GLOBAL.VALUE");
					}
					else if ( getItemDataType(getTriggerItem()).equals("DATE") ) {
						copy(toChar(toDate(getNameIn("SYSTEM.CURSOR_VALUE")), GDate.getNlsDateFormat()),"GLOBAL.VALUE");
					}
					else {
						copy(getNameIn("SYSTEM.CURSOR_VALUE"),"GLOBAL.VALUE");
					}
					//  If item is not protected launch the calendar form
					if ( getItemUpdateAllowed(currentBlockFld).equals("TRUE") 
							|| (getItemUpdateNull(currentBlockFld).equals("TRUE") && toStr(getNameIn("SYSTEM.CURSOR_VALUE")).isNull()) 
									|| (getMode().notEquals("NORMAL") && getItemQueryAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) )
					{
						//MORPHIS Carlos disse para comentar isto. Calendario ainda não está implementado ou não irá ser implementado.
//						executeAction("G$_REVOKE_ACCESS");
//						gCheckFailure();
//						gSecuredFormCall(getUser(), toStr("GUACALN"), toStr("QUERY_NOHIDE"));
						// 
//						if ( !getNameIn("GLOBAL.VALUE").isNull() )
//						{
//							copy(getNameIn("GLOBAL.VALUE"),currentBlockFld);
//							copy("","GLOBAL.VALUE");
//							executeAction("NEXT_ITEM");
//						}
					}
					else {
						errorMessage(GNls.Fget(toStr("GOQRPLS-0081"), toStr("LIB"), toStr("*ERROR* Item is protected against update.")));
					}
					// 
					return ;
				}
				// 
				//  If the item is a numeric field, call the calculator form.
				//
				if ( in(getItemDataType(getTriggerItem()), "INT", "RINT", "MONEY", "RMONEY", "NUMBER", "RNUMBER").getValue() )
				{
					// 
					//  If item is not protected, launch the calendar.
					// 
					if ( getItemUpdateAllowed(currentBlockFld).equals("TRUE") || (getItemUpdateNull(currentBlockFld).equals("TRUE") && getNameIn("SYSTEM.CURSOR_VALUE").isNull()) || (getMode().notEquals("NORMAL") && getItemQueryAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) )
					{
						// 
						//  Not protected so call the form
						// 
						//MORPHIS Carlos disse para comentar isto. Calculadora ainda não está implementada ou não irá ser implementada.
//						copy(getNameIn("SYSTEM.CURSOR_VALUE"),"GLOBAL.VALUE");
//						executeAction("G$_REVOKE_ACCESS");
//						gCheckFailure();
//						gSecuredFormCall(getUser(), toStr("GUACALC"), toStr("QUERY_NOHIDE"));
						// 
						if ( !getNameIn("GLOBAL.VALUE").isNull() )
						{
							// 
							//  Check to see if money type of item and round to 2 decimals.
							// 
							if ( in(getItemDataType(currentBlockFld), "MONEY", "RMONEY").getValue() )
							{
								copy(toChar(round(toNumber(getNameIn("GLOBAL.VALUE")), 2)),currentBlockFld);
							}
							else if ( in(getItemDataType(currentBlockFld), "INT", "RINT").getValue() ) {
								copy(toChar(round(toNumber(getNameIn("GLOBAL.VALUE")), 0)),currentBlockFld);
							}
							else {
								copy(getNameIn("GLOBAL.VALUE"),currentBlockFld);
							}
							// 
							copy("","GLOBAL.VALUE");
							executeAction("NEXT_ITEM");
						}
					}
					else {
						errorMessage(GNls.Fget(toStr("GOQRPLS-0081"), toStr("LIB"), toStr("*ERROR* Item is protected against update.")));
					}
					// 
					return ;
				}
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_LOAD_FORM_HEADER
	/*
	PROCEDURE G$_LOAD_FORM_HEADER IS
-- populates form heading items
  itm_id  ITEM := FIND_ITEM('CURRENT_USER');
BEGIN
  COPY(TO_CHAR(SYSDATE,G$_DATE.GET_NLS_DATE_FORMAT),'CURRENT_DATE');
  COPY(TO_CHAR(SYSDATE,'HH24:MI:SS'),'CURRENT_TIME');
  COPY(NAME_IN('SYSTEM.CURRENT_FORM'),'CURRENT_FORM');
  COPY(NAME_IN('GLOBAL.INSTITUTION'),'CURRENT_INSTITUTION');
--
  IF NOT ID_NULL(itm_id) THEN
    COPY(NAME_IN('GLOBAL.CURRENT_USER'),'CURRENT_USER');
  END IF;  
--
  EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE');
  G$_CHECK_FAILURE;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gLoadFormHeader()
		{
			//  populates form heading items
			ItemDescriptor itmId = findItem(toStr("CURRENT_USER"));
			copy(toChar(NDate.getNow(), GDate.getNlsDateFormat()),"CURRENT_DATE");
			copy(toChar(NDate.getNow(), "HH24:MI:SS"),"CURRENT_TIME");
			copy(getCurrentTaskName(),"CURRENT_FORM");
			copy(getNameIn("GLOBAL.INSTITUTION"),"CURRENT_INSTITUTION");
			// 
			if ( !(itmId == null) )
			{
				copy(getNameIn("GLOBAL.CURRENT_USER"),"CURRENT_USER");
			}
			// 
			executeAction("LOAD_CURRENT_RELEASE");
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_LIST_VALUES_COPY
	/*
	PROCEDURE G$_LIST_VALUES_COPY IS
-- used in conjunciton with G$_LIST_VALUES_CALL to return
-- a selected value from a validation form
BEGIN
  COPY(NAME_IN('GLOBAL.VALUE'),NAME_IN('SYSTEM.CURSOR_ITEM'));
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gListValuesCopy()
		{
			copy(getNameIn("GLOBAL.VALUE"),getCursorItem());
			//MORPHIS: TO REMOVE when trigger execution fires on navigation and autoskip implmented
			findItem(getCursorItem()).setToValidate(true);
			
			if (getCurrentTask().getNavigationModel() instanceof KeyBlockNavigationModel)
			{
				KeyBlockNavigationModel navModel = (KeyBlockNavigationModel)getCurrentTask().getNavigationModel();
				navModel.doNavigation();
			}
			
			if (!validateCurrentItem(true))
				throw new ValidationException();
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_LIST_VALUES_CALL
	/*
	PROCEDURE G$_LIST_VALUES_CALL IS
--
-- calls the appropriate 'TV' validation form and returns a selected value
--
  LEADING_EDGE  VARCHAR2(30);
  FORM_TO_CALL  VARCHAR2(61);
BEGIN
  LEADING_EDGE := SUBSTR(NAME_IN('SYSTEM.CURRENT_FORM'),1,NVL(LENGTH(NAME_IN('SYSTEM.CURRENT_FORM')), 0)-6);
  FORM_TO_CALL := NAME_IN('SYSTEM.CURSOR_ITEM');
--
  IF INSTR(FORM_TO_CALL,'.') > 0 THEN
    FORM_TO_CALL := SUBSTR(FORM_TO_CALL,INSTR(FORM_TO_CALL,'.')+1);
  END IF;
  FORM_TO_CALL := LEADING_EDGE || 'TV' || SUBSTR(FORM_TO_CALL,INSTR(FORM_TO_CALL,'_')+1,4);
--
  G$_COPY_FLD_ATTR;
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
  G$_SECURED_FORM_CALL(USER,FORM_TO_CALL,'QUERY');
  G$_RESET_GLOBAL;
--
  IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
    IF GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),UPDATEABLE) = 'TRUE' OR
       (GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),UPDATE_NULL) = 'TRUE' AND
        NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL) OR
       (NAME_IN('SYSTEM.MODE') <> 'NORMAL' AND
        GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),QUERYABLE) = 'TRUE') OR
       (NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW' AND
        GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),INSERT_ALLOWED) = 'TRUE') OR
       (NAME_IN('SYSTEM.RECORD_STATUS') = 'INSERT' AND
        GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),INSERT_ALLOWED) = 'TRUE') THEN
      EXECUTE_TRIGGER('LIST_VALUES_COPY'); 
      G$_CHECK_FAILURE;
      COPY('','GLOBAL.VALUE');
      DO_KEY('NEXT_ITEM');
    ELSE
      MESSAGE( G$_NLS.Get('GOQRPLS-0075', 'LIB','*ERROR* Item is protected against update.') );              
    END IF;     
  END IF;
END;
	*/
	/* <p>
/* </p>
		*/
		public void gListValuesCall()
		{
			// 
			//  calls the appropriate 'TV' validation form and returns a selected value
			// 
			NString leadingEdge= NString.getNull();
			NString formToCall= NString.getNull();
			leadingEdge = substring(getCurrentTaskName(), toInt(1), isNull(length(getCurrentTaskName()), 0).subtract(6));
			formToCall = getCursorItem();
			// 
			if ( inStr(formToCall, toStr(".")).greater(0) )
			{
				formToCall = substring(formToCall, inStr(formToCall, toStr(".")).add(1));
			}
			formToCall = leadingEdge.append("TV").append(substring(formToCall, inStr(formToCall, toStr("_")).add(1), toInt(4)));
			// 
			gCopyFldAttr();
			executeAction("G$_REVOKE_ACCESS");
			gCheckFailure();
			gSecuredFormCall(getUser(), formToCall, toStr("QUERY"));
			gResetGlobal();
			// 
			if ( !getNameIn("GLOBAL.VALUE").isNull() )
			{
				// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
				if ( getItemUpdateAllowed(getCursorItem()).isTrue() /*|| (SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.UPDATE_NULL).equals("TRUE") && SupportClasses.AppContext.CursorValue.isNull()) || (getMode().notEquals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) */|| (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					executeAction("LIST_VALUES_COPY");
					gCheckFailure();
					copy("","GLOBAL.VALUE");
					executeAction("NEXT_ITEM");
				}
				else {
					errorMessage(GNls.Fget(toStr("GOQRPLS-0075"), toStr("LIB"), toStr("*ERROR* Item is protected against update.")));
				}
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_KEY_OPT_MENU
	/*
	PROCEDURE G$_KEY_OPT_MENU (ITEM_NAME_IN IN VARCHAR2, 
                           SEL_A_DESC   IN VARCHAR2,         SEL_A_KEY IN VARCHAR2,
                           SEL_B_DESC   IN VARCHAR2,         SEL_B_KEY IN VARCHAR2,
                           SEL_C_DESC   IN VARCHAR2,         SEL_C_KEY IN VARCHAR2,
                           SEL_D_DESC   IN VARCHAR2,         SEL_D_KEY IN VARCHAR2,
                           SEL_E_DESC   IN VARCHAR2 := null, SEL_E_KEY IN VARCHAR2 := null,
                           SEL_F_DESC   IN VARCHAR2 := null, SEL_F_KEY IN VARCHAR2 := null) IS
--
-- invokes the Option list window
--
  ITM          VARCHAR2(1);
  DESC_VAR     VARCHAR2(36);
  KEY_VAR      VARCHAR2(30);
  ITEM_ID      ITEM;
--
  item_name    VARCHAR2(61) := NAME_IN('SYSTEM.TRIGGER_ITEM');
--
BEGIN
  ITEM_ID := FIND_ITEM(NAME_IN('SYSTEM.CURSOR_BLOCK') ||
               SUBSTR(item_name, INSTR(item_name,'.'), 
                   INSTR(item_name,'_LBT') - 1 - INSTR(item_name,'.') + 1));
--
  IF ID_NULL(ITEM_ID) AND
     GET_ITEM_PROPERTY(item_name,ITEM_TYPE) = 'BUTTON' THEN
    IF G$_DISPLAY_ALERT('',G$_NLS.Get('GOQRPLS-0073','LIB','The Button you pressed is outside the current block')) IS NOT NULL
      THEN RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END IF;
--
-- If item is not enabled, raise an error.
--
  IF GET_ITEM_PROPERTY(ITEM_NAME_IN,ENABLED) = 'FALSE' THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0074','LIB','*ERROR* Item associated with this button is not enabled.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  COPY('','G$_OPT_BLOCK.SELECT_ITEM');
  COPY('','G$_OPT_BLOCK.OPT_SEL');
--
-- -- --
  G$_GOQOLIB_OPT_BLOCK.ENABLE_OPT_BLOCK_ON_ENTRY; 
-- -- --
  FOR I IN 1..6 LOOP
    CASE I
      WHEN 1 THEN ITM := 'A'; DESC_VAR := SEL_A_DESC; KEY_VAR := SEL_A_KEY;
      WHEN 2 THEN ITM := 'B'; DESC_VAR := SEL_B_DESC; KEY_VAR := SEL_B_KEY;
      WHEN 3 THEN ITM := 'C'; DESC_VAR := SEL_C_DESC; KEY_VAR := SEL_C_KEY;
      WHEN 4 THEN ITM := 'D'; DESC_VAR := SEL_D_DESC; KEY_VAR := SEL_D_KEY;
      WHEN 5 THEN ITM := 'E'; DESC_VAR := SEL_E_DESC; KEY_VAR := SEL_E_KEY;
      ELSE        ITM := 'F'; DESC_VAR := SEL_F_DESC; KEY_VAR := SEL_F_KEY;
    END CASE;
--
    item_name := 'G$_OPT_BLOCK.SELECT_'||ITM||'_DESC';
    IF DESC_VAR IS NOT NULL THEN
    	SET_ITEM_PROPERTY(item_name,VISIBLE,PROPERTY_ON);
      SET_ITEM_PROPERTY(item_name,ENABLED,PROPERTY_ON);
      SET_ITEM_PROPERTY(item_name,NAVIGABLE,PROPERTY_ON);
      SET_ITEM_PROPERTY(item_name,LABEL,DESC_VAR);
      COPY(KEY_VAR,'G$_OPT_BLOCK.SELECT_'||ITM||'_KEY');
    ELSE
      SET_ITEM_PROPERTY(item_name,LABEL,' ');
      SET_ITEM_PROPERTY(item_name,VISIBLE,PROPERTY_OFF);  
      SET_ITEM_PROPERTY(item_name,ENABLED,PROPERTY_OFF); 
      COPY('','G$_OPT_BLOCK.SELECT_'||ITM||'_KEY');
    END IF;
  END LOOP;
  G$_CHECK_FAILURE;
--
  SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_OFF);
  GO_ITEM('G$_OPT_BLOCK.OPT_SEL');
--
  COPY(ITEM_NAME_IN,'G$_OPT_BLOCK.SELECT_ITEM');  
END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itemNameIn
		* @param selADesc
		* @param selAKey
		* @param selBDesc
		* @param selBKey
		* @param selCDesc
		* @param selCKey
		* @param selDDesc
		* @param selDKey
		*/
		public void gKeyOptMenu(NString itemNameIn, NString selADesc, NString selAKey, NString selBDesc, NString selBKey, NString selCDesc, NString selCKey, NString selDDesc, NString selDKey) {
			gKeyOptMenu(itemNameIn, selADesc, selAKey, selBDesc, selBKey, selCDesc, selCKey, selDDesc, selDKey, NString.getNull(), NString.getNull(), NString.getNull(), NString.getNull());
		}

/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itemNameIn
		* @param selADesc
		* @param selAKey
		* @param selBDesc
		* @param selBKey
		* @param selCDesc
		* @param selCKey
		* @param selDDesc
		* @param selDKey
		* @param selEDesc
		*/
		public void gKeyOptMenu(NString itemNameIn, NString selADesc, NString selAKey, NString selBDesc, NString selBKey, NString selCDesc, NString selCKey, NString selDDesc, NString selDKey, NString selEDesc) {
			gKeyOptMenu(itemNameIn, selADesc, selAKey, selBDesc, selBKey, selCDesc, selCKey, selDDesc, selDKey, selEDesc, NString.getNull(), NString.getNull(), NString.getNull());
		}

/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itemNameIn
		* @param selADesc
		* @param selAKey
		* @param selBDesc
		* @param selBKey
		* @param selCDesc
		* @param selCKey
		* @param selDDesc
		* @param selDKey
		* @param selEDesc
		* @param selEKey
		*/
		public void gKeyOptMenu(NString itemNameIn, NString selADesc, NString selAKey, NString selBDesc, NString selBKey, NString selCDesc, NString selCKey, NString selDDesc, NString selDKey, NString selEDesc, NString selEKey) {
			gKeyOptMenu(itemNameIn, selADesc, selAKey, selBDesc, selBKey, selCDesc, selCKey, selDDesc, selDKey, selEDesc, selEKey, NString.getNull(), NString.getNull());
		}

/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itemNameIn
		* @param selADesc
		* @param selAKey
		* @param selBDesc
		* @param selBKey
		* @param selCDesc
		* @param selCKey
		* @param selDDesc
		* @param selDKey
		* @param selEDesc
		* @param selEKey
		* @param selFDesc
		*/
		public void gKeyOptMenu(NString itemNameIn, NString selADesc, NString selAKey, NString selBDesc, NString selBKey, NString selCDesc, NString selCKey, NString selDDesc, NString selDKey, NString selEDesc, NString selEKey, NString selFDesc) {
			gKeyOptMenu(itemNameIn, selADesc, selAKey, selBDesc, selBKey, selCDesc, selCKey, selDDesc, selDKey, selEDesc, selEKey, selFDesc, NString.getNull());
		}

/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itemNameIn
		* @param selADesc
		* @param selAKey
		* @param selBDesc
		* @param selBKey
		* @param selCDesc
		* @param selCKey
		* @param selDDesc
		* @param selDKey
		* @param selEDesc
		* @param selEKey
		* @param selFDesc
		* @param selFKey
		*/
		public void gKeyOptMenu(NString itemNameIn, NString selADesc, NString selAKey, NString selBDesc, NString selBKey, NString selCDesc, NString selCKey, NString selDDesc, NString selDKey, NString selEDesc, NString selEKey, NString selFDesc, NString selFKey)
		{
			// 
			//  invokes the Option list window
			// 
			NString itm= NString.getNull();
			NString descVar= NString.getNull();
			NString keyVar= NString.getNull();
			ItemDescriptor itemId= null;
			// 
			NString itemName = getTriggerItem();
			itemId = findItem(getCursorBlock().append(substring(itemName, inStr(itemName, toStr(".")), inStr(itemName, toStr("_LBT")).subtract(1).subtract(inStr(itemName, toStr("."))).add(1))));
			// 
			if ( (itemId == null) && getItemType(itemName).equals("BUTTON") )
			{
				if ( !gDisplayAlert(toStr(""), GNls.Fget(toStr("GOQRPLS-0073"), toStr("LIB"), toStr("The Button you pressed is outside the current block"))).isNull() )
				{
					throw new ApplicationException();
				}
			}
			// 
			//  If item is not enabled, raise an error.
			// 
			if ( getItemEnabled(itemNameIn).equals("FALSE") )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0074"), toStr("LIB"), toStr("*ERROR* Item associated with this button is not enabled.")));
				throw new ApplicationException();
			}
			// 
			copy("","G$_OPT_BLOCK.SELECT_ITEM");
			copy("","G$_OPT_BLOCK.OPT_SEL");
			// 
			//  -- --
			getGGoqolibOptBlock().enableOptBlockOnEntry();
			//  -- --
			for ( int i = 1; i <= 6; i++ )
			{
				if (i == 1)
				{
					itm = toStr("A");
					descVar = selADesc;
					keyVar = selAKey;
				}
				else if (i == 2)
				{
					itm = toStr("B");
					descVar = selBDesc;
					keyVar = selBKey;
				}
				else if (i == 3)
				{
					itm = toStr("C");
					descVar = selCDesc;
					keyVar = selCKey;
				}
				else if (i == 4)
				{
					itm = toStr("D");
					descVar = selDDesc;
					keyVar = selDKey;
				}
				else if (i == 5)
				{
					itm = toStr("E");
					descVar = selEDesc;
					keyVar = selEKey;
				}
				else {
					itm = toStr("F");
					descVar = selFDesc;
					keyVar = selFKey;
				}
				// 
				itemName = toStr("G$_OPT_BLOCK.SELECT_").append(itm).append("_DESC");
				if ( !descVar.isNull() )
				{
					setItemVisible(itemName, true);
					setItemEnabled(itemName, true);
					setItemNavigable(itemName, true);
					setItemLabel(itemName, descVar);
					copy(keyVar,toStr("G$_OPT_BLOCK.SELECT_").append(itm).append("_KEY"));
				}
				else {
					setItemLabel(itemName, " ");
					setItemVisible(itemName, false);
					setItemEnabled(itemName, false);
					setItemNavigable(itemName, false);
					copy("",toStr("G$_OPT_BLOCK.SELECT_").append(itm).append("_KEY"));
				}
			}
			gCheckFailure();
			// 
			// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
			//			SupportClasses.FORMS40.SetFormProperty(getCurrentTaskName(), SupportClasses.Property.VALIDATION, false);
			TaskServices.getCurrentTask().setValidationEnabled(false);
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
			
			goItem(toStr("G$_OPT_BLOCK.OPT_SEL"));
			// 
			copy(itemNameIn,"G$_OPT_BLOCK.SELECT_ITEM");
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_INVOKE_CM
	/*
	FUNCTION G$_INVOKE_CM RETURN VARCHAR2 IS
  lv_call_ui          GOBCMUS.GOBCMUS_EXCLUDE_IND%TYPE;
  lv_cmsc_option_ind  GOBCMUS.GOBCMUS_CMSC_OPTION_IND%TYPE;
  lv_cmsc_code        GOBCMUS.GOBCMUS_CM_USER_ID%TYPE;
  lv_current_form     VARCHAR2(10) := NAME_IN('SYSTEM.CURRENT_FORM');
  lv_hold_id          SPRIDEN.SPRIDEN_ID%TYPE;
  lv_valid_list       VARCHAR2(2000) := G$_GET_UPRF_CM_FORMS;
--
  C_NULL              CONSTANT VARCHAR2(4) := 'NULL';
  C_SKIP              CONSTANT VARCHAR2(4) := 'SKIP';
  C_DONE              CONSTANT VARCHAR2(4) := 'DONE';
BEGIN
  IF lv_current_form = 'GOAMTCH' THEN
  	RETURN(C_NULL);
  END IF;
--
  IF INSTR(lv_valid_list,lv_current_form) = 0 THEN
  	RETURN(C_SKIP);
  END IF;
--
  gokcmpk.p_get_cm_options(NAME_IN('GLOBAL.CURRENT_USER'),lv_call_ui,
                           lv_cmsc_option_ind,lv_cmsc_code);
--
  IF lv_call_ui = 'N' THEN
  	RETURN(C_SKIP);
  END IF;
--
  COPY('','GLOBAL.KEY_PIDM');
  COPY(NAME_IN(NAME_IN('SYSTEM.CURSOR_ITEM')),'GLOBAL.KEY_IDNO');
  IF lv_cmsc_code IS NOT NULL THEN
    COPY(lv_cmsc_code,'GLOBAL.CM_SOURCE_CODE');
  END IF;
--
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
  G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),'GOAMTCH','');
--
  IF NAME_IN('GLOBAL.KEY_PIDM') IS NULL THEN
    COPY('','GLOBAL.KEY_IDNO');
    COPY('',NAME_IN('SYSTEM.CURSOR_ITEM'));
--
  	RETURN(C_NULL);
  ELSE
    COPY(NAME_IN('GLOBAL.KEY_IDNO'),NAME_IN('SYSTEM.CURSOR_ITEM'));
    RETURN(C_DONE);
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gInvokeCm()
		{
			NString lvCallUi= NString.getNull();
			NString lvCmscOptionInd= NString.getNull();
			NString lvCmscCode= NString.getNull();
			NString lvCurrentForm = getCurrentTaskName();
			NString lvHoldId= NString.getNull();
			NString lvValidList = gGetUprfCmForms();
			// 
			final NString C_NULL = toStr("NULL");
			final NString C_SKIP = toStr("SKIP");
			final NString C_DONE = toStr("DONE");
			if ( lvCurrentForm.equals("GOAMTCH") )
			{
				return ((C_NULL));
			}
			// 
			if ( inStr(lvValidList, lvCurrentForm).equals(0) )
			{
				return ((C_SKIP));
			}
			// 
			Ref<NString> p_call_ui_out_ref = new Ref<NString>(lvCallUi);
			Ref<NString> p_cmsc_option_ind_out_ref = new Ref<NString>(lvCmscOptionInd);
			Ref<NString> p_cmsc_code_out_ref = new Ref<NString>(lvCmscCode);
			Gokcmpk.pGetCmOptions(getNameIn("GLOBAL.CURRENT_USER"), p_call_ui_out_ref, p_cmsc_option_ind_out_ref, p_cmsc_code_out_ref);
			lvCallUi = p_call_ui_out_ref.val;
			lvCmscOptionInd = p_cmsc_option_ind_out_ref.val;
			lvCmscCode = p_cmsc_code_out_ref.val;
			// 
			if ( lvCallUi.equals("N") )
			{
				return ((C_SKIP));
			}
			// 
			copy("","GLOBAL.KEY_PIDM");
			copy(getNameIn(getCursorItem()),"GLOBAL.KEY_IDNO");
			if ( !lvCmscCode.isNull() )
			{
				copy(lvCmscCode,"GLOBAL.CM_SOURCE_CODE");
			}
			// 
			executeAction("G$_REVOKE_ACCESS");
			gCheckFailure();
			gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), toStr("GOAMTCH"), toStr(""));
			// 
			if ( getNameIn("GLOBAL.KEY_PIDM").isNull() )
			{
				copy("","GLOBAL.KEY_IDNO");
				copy("",getCursorItem());
				// 
				return ((C_NULL));
			}
			else {
				copy(getNameIn("GLOBAL.KEY_IDNO"),getCursorItem());
				return ((C_DONE));
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_INVALID_FUNCTION_MSG
	/*
	PROCEDURE G$_INVALID_FUNCTION_MSG IS
BEGIN
  MESSAGE(G$_NLS.Get('GOQRPLS-0072','LIB','Undefined function key. Press <Show Keys> for a list of valid keys.'));
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gInvalidFunctionMsg()
		{
			errorMessage(GNls.Fget(toStr("GOQRPLS-0072"), toStr("LIB"), toStr("*ERROR* Undefined Function Key. Press <Show Keys> for a list of valid keys.")));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_INS_UPD_LOCAL_DIR
	/*
	PROCEDURE G$_INS_UPD_LOCAL_DIR (DOES_IT_EXIST VARCHAR2,
                                SAVE_FILES_IN VARCHAR2) IS
  WHAT_OS VARCHAR2(30);
--
-- Routine to insert/update the user's profile for
-- print destination
--
BEGIN
  WHAT_OS := NAME_IN('GLOBAL.OS_IND');
  IF DOES_IT_EXIST = 'Y' THEN
    UPDATE GURUPRF SET GURUPRF_VALUE = SAVE_FILES_IN
     WHERE GURUPRF_USER_ID  = USER
       AND GURUPRF_GROUP    = 'JOBSUB'
       AND GURUPRF_KEY      = WHAT_OS
       AND GURUPRF_STRING   = 'LOCAL_DIRECTORY';
  ELSE
    INSERT INTO GURUPRF (GURUPRF_USER_ID,GURUPRF_GROUP,GURUPRF_KEY,
                         GURUPRF_STRING, GURUPRF_VALUE,
                         GURUPRF_SYSTEM_REQ_IND, GURUPRF_ACTIVITY_DATE)
    SELECT USER,'JOBSUB',WHAT_OS,
           'LOCAL_DIRECTORY',SAVE_FILES_IN,
           'N', SYSDATE
      FROM DUAL;
  END IF;
--
  COMMIT_FORM;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param doesItExist
		* @param saveFilesIn
		*/
		public void gInsUpdLocalDir(NString doesItExist, NString saveFilesIn)
		{
			int rowCount = 0;
			NString whatOs= NString.getNull();
			whatOs = getNameIn("GLOBAL.OS_IND");
			if ( doesItExist.equals("Y") )
			{
				String sql1 = "UPDATE GURUPRF " +
	"SET GURUPRF_VALUE = :P_SAVE_FILES_IN " +
	" WHERE GURUPRF_USER_ID = USER AND GURUPRF_GROUP = 'JOBSUB' AND GURUPRF_KEY = :P_WHAT_OS AND GURUPRF_STRING = 'LOCAL_DIRECTORY'";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("P_SAVE_FILES_IN", saveFilesIn);
				command1.addParameter("P_WHAT_OS", whatOs);
				rowCount = command1.execute();
			}
			else {
				String sql2 = "INSERT INTO GURUPRF " +
	"(GURUPRF_USER_ID, GURUPRF_GROUP, GURUPRF_KEY, GURUPRF_STRING, GURUPRF_VALUE, GURUPRF_SYSTEM_REQ_IND, GURUPRF_ACTIVITY_DATE)" +
	"SELECT USER, 'JOBSUB', :P_WHAT_OS, 'LOCAL_DIRECTORY', :P_SAVE_FILES_IN, 'N', SYSDATE " +
	" FROM DUAL ";
				DataCommand command2 = new DataCommand(sql2);
				//Setting query parameters
				command2.addParameter("P_WHAT_OS", whatOs);
				command2.addParameter("P_SAVE_FILES_IN", saveFilesIn);
				rowCount = command2.execute();
			}
			// 
			commitTask();
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_HELP_SETUP
	/*
	PROCEDURE G$_HELP_SETUP IS
--sets global for use in GUAHELP form
BEGIN
--
-- Set a default value.
--
  COPY('','GLOBAL.DB_FIELD');
--
-- Check first if block is based on a table, then make sure it's not a button, then check
-- if it is a base table item.
--
  IF GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.CURSOR_BLOCK'),QUERY_DATA_SOURCE_NAME) IS NOT NULL THEN
    IF GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),ITEM_TYPE) NOT IN ('BUTTON') THEN
      IF GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),BASE_TABLE) = 'TRUE' THEN
        COPY('Y','GLOBAL.DB_FIELD');
      END IF;
    END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gHelpSetup()
		{
			// 
			//  Set a default value.
			// 
			copy("","GLOBAL.DB_FIELD");
			// 
			//  Check first if block is based on a table, then make sure it's not a button, then check
			//  if it is a base table item.
			// 
			if ( !getBlockQueryDataSourceName(getCursorBlock()).isNull() )
			{
				// F2J_TODO : Check if the function used in the expression below may be called more than once. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#FunctionUsedInIn".
				if ( !in(getItemType(getCursorItem()), "BUTTON").getValue() )
				{
					if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(), baseTable).equals("TRUE") )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						copy("Y","GLOBAL.DB_FIELD");
					}
				}
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_HELP_ALL_FIELDS
	/*
	PROCEDURE G$_HELP_ALL_FIELDS IS

    lv_form             varchar2(100) := NAME_IN('SYSTEM.CURRENT_FORM');
    lv_first_block      varchar2(100);
    lv_cur_block        varchar2(100);
    lv_block_table      varchar2(100);
    lv_item_table       varchar2(100);
    lv_first_item       varchar2(100);
    lv_cur_item         varchar2(100);
    lv_start_blocks     varchar2(01);
    lv_start_items      varchar2(01);
    lv_block_item       varchar2(100);

    lv_column           varchar2(100);
    lv_name             varchar2(100);
    lv_label            varchar2(100);
    lv_prompt           varchar2(200);
    lv_hint             varchar2(500);
    lv_type             varchar2(100);
    lv_data_type        varchar2(100);
    lv_canvas           varchar2(100);
    lv_tab              varchar2(100);
    lv_list             varchar2(2000);
    lv_str              varchar2(200);
    lv_list_value       varchar2(200);
    lv_list_label       varchar2(200);
    lv_detail           varchar2(4000);
    lv_list_count       number;
    lv_length           varchar2(100);
    lv_tab_data_type    varchar2(200);
    lv_tab_precision    number;
    lv_tab_scale        number;
    lv_tab_length       number;
    lv_tab_data_length  number;
    lv_decimal          varchar2(01);

    lv_seq              number;
    lv_user_num         number;
    lv_session          number := TO_NUMBER(NAME_IN('GLOBAL.SESSION_ID'));
    lv_recs             number := 1;
    lv_header           varchar2(2000) := G$_NLS.Get('GOQRPLS-0052', 'LIB', '%01%Form%02%'       ,'"','",') ||
                                          G$_NLS.Get('GOQRPLS-0053', 'LIB', '%01%Block%02%'      ,'"','",') ||
                                          G$_NLS.Get('GOQRPLS-0054', 'LIB', '%01%Table%02%'      ,'"','",') ||
                                          G$_NLS.Get('GOQRPLS-0055', 'LIB', '%01%Column%02%'     ,'"','",') ||
                                          G$_NLS.Get('GOQRPLS-0056', 'LIB', '%01%Length%02%'     ,'"','",') ||
                                          G$_NLS.Get('GOQRPLS-0057', 'LIB', '%01%Prompt%02%'     ,'"','",') ||
                                          G$_NLS.Get('GOQRPLS-0058', 'LIB', '%01%DataType%02%'   ,'"','",') ||
                                          G$_NLS.Get('GOQRPLS-0059', 'LIB', '%01%Type%02%'       ,'"','",') ||
                                          G$_NLS.Get('GOQRPLS-0060', 'LIB', '%01%Hint%02%'       ,'"','",') ||
                                          G$_NLS.Get('GOQRPLS-0061', 'LIB', '%01%Tab%02%'        ,'"','",') ||
                                          G$_NLS.Get('GOQRPLS-0062', 'LIB', '%01%ListValues%02%' ,'"','",');
    cursor size_c is
    select data_type,data_precision,data_scale,char_length, data_length
      from all_tab_columns
     where table_name  = upper(lv_block_table)
       and column_name = upper(lv_column);
    cursor decimal_c is
      SELECT substr(VALUE,1,1)
        FROM NLS_SESSION_PARAMETERS
       WHERE parameter = 'NLS_NUMERIC_CHARACTERS';

  FUNCTION get_format(format_in VARCHAR2)
    RETURN VARCHAR2
  IS
    lv_char      VARCHAR2(01);
    lv_right     VARCHAR2(01);
    lv_left_cnt  NUMBER :=0;
    lv_right_cnt NUMBER :=0;

  BEGIN
      if format_in is null then
        return null;
      end if;

    lv_right     := 'N';
    lv_left_cnt  := 0;
    lv_right_cnt := 0;

    FOR i IN 1..length(format_in)
    LOOP
      lv_char := substr(format_in,i,1);
      IF lv_char = 'D'        THEN lv_right := 'Y'; END IF;
      IF lv_char = lv_decimal THEN lv_right := 'Y'; END IF;
      IF lv_char = '9' THEN
        IF lv_right = 'Y' THEN
          lv_right_cnt := lv_right_cnt + 1;
        ELSE
          lv_left_cnt  := lv_left_cnt + 1;
        END IF;
      END IF;
    END LOOP;

    RETURN lv_left_cnt || lv_decimal || lv_right_cnt;
  END get_format;


BEGIN
  COPY('15','SYSTEM.MESSAGE_LEVEL');
  open decimal_c;
  fetch decimal_c into lv_decimal;
  close decimal_c;

  SELECT GJBPSEQ.NEXTVAL
    INTO lv_seq
    FROM DUAL;

  SELECT user_id
    INTO lv_user_num
    FROM all_users
   WHERE username = USER;

  INSERT INTO GUBOUTD
             (GUBOUTD_USER_ID,
              GUBOUTD_USER_NUM,
              GUBOUTD_ONE_UP_NO,
              GUBOUTD_JOB,
              GUBOUTD_FILE_NAME,
              GUBOUTD_FILE_NUMBER,
              GUBOUTD_NUMBER_OF_LINES,
              GUBOUTD_ACTIVITY_DATE,
              GUBOUTD_DATE_PRINTED,
              GUBOUTD_DATA_ORIGIN)
      VALUES (USER,
              lv_user_num,
              lv_seq,
              lv_form,
              lv_form,
              lv_session,
              -1,
              SYSDATE,
              SYSDATE,
              'BANNER');

  INSERT INTO GUROUTD
             (GUROUTD_USER_NUM,
              GUROUTD_ONE_UP_NO,
              GUROUTD_FILE_NUMBER,
              GUROUTD_SEQ_NO,
              GUROUTD_LINE)
      VALUES (lv_user_num,
              lv_seq,
              lv_session,
              lv_recs,
              lv_header);

  lv_first_block  := get_form_property(lv_form, FIRST_BLOCK);
  lv_cur_block    := lv_first_block;
  lv_start_blocks := 'Y';
  LOOP -- go thru all blocks
    if lv_start_blocks = 'Y' then
      lv_start_blocks := 'N';
    elsif (lv_cur_block = lv_first_block) or (lv_cur_block is null) then
      exit;
    end if;
    lv_first_item  := get_block_property(lv_cur_block, FIRST_ITEM);
    lv_cur_item    := lv_first_item;
    lv_start_items := 'Y';
    if get_block_property(lv_cur_block, QUERY_DATA_SOURCE_TYPE) = 'TABLE' then
      lv_block_table := get_block_property(lv_cur_block, QUERY_DATA_SOURCE_NAME);
    else
      lv_block_table := G$_NLS.Get('GOQRPLS-0063', 'LIB', 'N/A');
    end if;

    LOOP -- go thru all items in the block
    lv_block_item    := lv_cur_block || '.' || lv_cur_item;
    if lv_start_items = 'Y' then
      lv_start_items := 'N';
    elsif (lv_cur_item = lv_first_item) or (lv_cur_item is null) then
      exit;
    end if;

    -- no need to process 'internal' blocks
    if lv_cur_block in ('G$_SDKEY','G$_SDISP','G$_VPDI_BLOCK','G$_NAV_BLOCK','G$_EXTENDED_SEARCH_BLOCK','G$_OPT_BLOCK') then
      exit;
    end if;

    if get_item_property(lv_block_item, VISIBLE) <> 'TRUE' then
      goto skip_item;
    end if;

    lv_type     := get_item_property(lv_block_item, ITEM_TYPE);
    if (lv_type not in ('CHECKBOX','LIST','DISPLAY ITEM','TEXT ITEM','RADIO GROUP')) or
       ((lv_type = 'DISPLAY ITEM') and (get_item_property(lv_block_item, VISUAL_ATTRIBUTE) = 'G$_NVA_DATA_SEPARATOR_LINE')) then
      goto skip_item;
    end if;

    lv_list := null;
    if lv_type = 'LIST' then
      lv_list_count := get_list_element_count(lv_block_item);
      for i in 1..lv_list_count
      loop
        lv_list_value := trim(get_list_element_value(lv_block_item,i));
        lv_list_label := trim(replace(get_list_element_label(lv_block_item,i),'"', ''''));
        if (lv_list_value is not null) or (lv_list_label is not null) then
            lv_str := substr(nvl(lv_list_value,'NULL') || '=' || lv_list_label || ', ', 1, 200);
            if length(lv_list) + length(lv_str) > 2000 then
              lv_list := lv_list || '....';
              exit;
            else
              lv_list := lv_list || lv_str;
            end if;
        end if;
      end loop;
      lv_list := substr(lv_list,1,length(lv_list) - 2);
    end if;

    lv_canvas   := get_item_property(lv_block_item, ITEM_CANVAS);
    if lv_canvas is null then
      goto skip_item;
    end if;

    lv_tab       := get_item_property(lv_block_item, ITEM_TAB_PAGE);
    if lv_tab is not null then
      lv_tab     := get_tab_page_property(lv_tab, LABEL);
    end if;

    lv_data_type := get_item_property(lv_block_item, DATATYPE);
    lv_name      := get_item_property(lv_block_item, ITEM_NAME);
    lv_column    := upper(get_item_property(lv_block_item, COLUMN_NAME));
    if lv_column is null then
      lv_column  := upper(lv_name);
    end if;

    lv_prompt    := trim(replace(substr(get_item_property(lv_block_item, PROMPT_TEXT),1,200),'"',''''));
    if lv_type = 'CHECKBOX' then
      lv_label   := replace(get_item_property(lv_block_item, LABEL),'"',''''); -- only for buttons and check boxes
      if lv_prompt is null then
        lv_prompt  := lv_label;
      end if;
    else
      lv_label   := null;
    end if;

    lv_hint      := trim(replace(substr(get_item_property(lv_block_item, HINT_TEXT),1,500),'"',''''));
    if lv_hint like 'G$\_%' <multilinecomment>escape '\'</multilinecomment> then
      goto skip_item;
    end if;

    -- since we cannot query 'Database Item', we have to assume that if the column name does not start with the block table
    -- name, then it is not a database item and therefore set the 'table' appropriately
    if upper(lv_cur_item) like upper(lv_block_table) || '\_%' <multilinecomment>escape '\'</multilinecomment> then
      lv_item_table := upper(lv_block_table);
    else
      lv_item_table := G$_NLS.Get('GOQRPLS-0064', 'LIB', 'N/A');
    end if;

    lv_length        := null;
    lv_tab_data_type := null;
    lv_tab_precision := null;
    lv_tab_scale     := null;
    lv_tab_length    := null;
    lv_tab_data_length := null;

    open size_c;
    fetch size_c into lv_tab_data_type, lv_tab_precision, lv_tab_scale, lv_tab_length, lv_tab_data_length;
    close size_c;

    if lv_tab_data_type    = 'VARCHAR2' then
      lv_length := lv_tab_length;
    elsif lv_tab_data_type = 'DATE' then
      lv_length := null;
    elsif lv_tab_data_type = 'CLOB' then
      lv_length := null;
    elsif lv_tab_data_type = 'NUMBER' then
      if lv_tab_precision is null then
        lv_length := lv_tab_data_length;
      else
        lv_length := to_char(lv_tab_precision - lv_tab_scale) || lv_decimal || to_char(lv_tab_scale);
      end if;
    elsif lv_tab_data_type is null then
      if lv_data_type    in ('CHAR','ALPHA') then
        lv_length := get_item_property(lv_block_item, MAX_LENGTH);
      elsif lv_data_type in ('NUMBER','RINT', 'INT', 'RNUMBER', 'MONEY', 'RMONEY') then
        lv_length := get_format(get_item_property(lv_block_item, FORMAT_MASK));
        if lv_length is null then
          lv_length := get_item_property(lv_block_item, MAX_LENGTH);
        end if;
      end if;
    end if;

    lv_recs := lv_recs + 1;

    lv_detail := '"' || lv_form        || '",' ||
                 '"' || lv_cur_block   || '",' ||
                 '"' || lv_item_table  || '",' ||
                 '"' || lv_column      || '",' ||
                 '"' || lv_length      || '",' ||
                 '"' || lv_prompt      || '",' ||
                 '"' || lv_data_type   || '",' ||
                 '"' || lv_type        || '",' ||
                 '"' || lv_hint        || '",' ||
                 '"' || lv_tab         || '",' ||
                 '"' || lv_list        || '",';
    if length (lv_detail) > 2000 then
      lv_detail := '"' || lv_form        || '",' ||
                   '"' || lv_cur_block   || '",' ||
                   '"' || lv_item_table  || '",' ||
                   '"' || lv_column      || '",' ||
                   '"' || lv_length      || '",' ||
                   '"' || lv_prompt      || '",' ||
                   '"' || lv_data_type   || '",' ||
                   '"' || lv_type        || '",' ||
                   '"' || lv_hint        || '",' ||
                   '"' || lv_tab         || '",';
      lv_detail := lv_detail || '"' || substr(lv_list,1,2000 - length(lv_detail) - 7) || '....",';
    end if;

    INSERT INTO GUROUTD
               (GUROUTD_USER_NUM,
                GUROUTD_ONE_UP_NO,
                GUROUTD_FILE_NUMBER,
                GUROUTD_SEQ_NO,
                GUROUTD_LINE)
        VALUES (lv_user_num,
                lv_seq,
                lv_session,
                lv_recs,
                lv_detail);
    <<SKIP_ITEM>>
    lv_cur_item  := get_item_property(lv_block_item, NEXTITEM);
    END LOOP; -- go thru all items in the block
    lv_cur_block  := get_block_property(lv_cur_block ,NEXTBLOCK);
  END LOOP; -- go thru all blocks
--
  COPY('0','SYSTEM.MESSAGE_LEVEL');
  FORMS_DDL('BEGIN COMMIT; END;');
--
-- If running on the web, call routine which will display output in browser
--
  IF G$_GET_UPRF_DE_MIME_TYPE IN ('FILE','TEXT') THEN
    G$_WEB_SHOW_DOCUMENT_OUTD(lv_seq, lv_form, lv_session);
  ELSE
    COPY(TO_CHAR(lv_seq),'GLOBAL.WUTL_ONE_UP_NO');
    COPY(TO_CHAR(lv_session),'GLOBAL.WUTL_FILE_NUMBER');
    COPY(lv_form,'GLOBAL.WUTL_FORM_NAME');
    COPY(lv_form,'GLOBAL.WUTL_BLOCK_NAME');
    COPY('','GLOBAL.WUTL_FILE_NAME');
--
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),'GUQWUTL','NOHIDE');
  END IF;
-- --
  CLEAR_MESSAGE;
-- --

END G$_HELP_ALL_FIELDS;
	*/
	/* <p>
/* </p>
		*/
		public void gHelpAllFields()
		{
			GHelpAllFields_Local innerClass = new GHelpAllFields_Local();
			
			try {
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '15'
				try { 
				MessageServices.setMessageLevel(MessageLevel.NONE);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable decimalC.
				innerClass.decimalC.open();
				ResultSet decimalCResults = innerClass.decimalC.fetchInto();
				if ( decimalCResults != null ) {
					innerClass.lvDecimal = decimalCResults.getStr(0);
				}
				innerClass.decimalC.close();
				String sql1 = "SELECT GJBPSEQ.NEXTVAL " +
	" FROM DUAL ";
				DataCommand command1 = new DataCommand(sql1);
				ResultSet results1 = command1.executeQuery();
				innerClass.rowCount = command1.getRowCount();
				if ( results1.hasData() ) {
					innerClass.lvSeq = results1.getNumber(0);
				}
				results1.close();
				String sql2 = "SELECT user_id " +
	" FROM all_users " +
	" WHERE username = USER ";
				DataCommand command2 = new DataCommand(sql2);
				ResultSet results2 = command2.executeQuery();
				innerClass.rowCount = command2.getRowCount();
				if ( results2.hasData() ) {
					innerClass.lvUserNum = results2.getNumber(0);
				}
				results2.close();
				String sql3 = "INSERT INTO GUBOUTD " +
	"(GUBOUTD_USER_ID, GUBOUTD_USER_NUM, GUBOUTD_ONE_UP_NO, GUBOUTD_JOB, GUBOUTD_FILE_NAME, GUBOUTD_FILE_NUMBER, GUBOUTD_NUMBER_OF_LINES, GUBOUTD_ACTIVITY_DATE, GUBOUTD_DATE_PRINTED, GUBOUTD_DATA_ORIGIN)" +
	"VALUES (USER, :P_LV_USER_NUM, :P_LV_SEQ, :P_LV_FORM, :P_LV_FORM, :P_LV_SESSION, - 1, SYSDATE, SYSDATE, 'BANNER')";
				DataCommand command3 = new DataCommand(sql3);
				//Setting query parameters
				command3.addParameter("P_LV_USER_NUM", innerClass.lvUserNum);
				command3.addParameter("P_LV_SEQ", innerClass.lvSeq);
				command3.addParameter("P_LV_FORM", innerClass.lvForm);
				command3.addParameter("P_LV_SESSION", innerClass.lvSession);
				innerClass.rowCount = command3.execute();
				String sql4 = "INSERT INTO GUROUTD " +
	"(GUROUTD_USER_NUM, GUROUTD_ONE_UP_NO, GUROUTD_FILE_NUMBER, GUROUTD_SEQ_NO, GUROUTD_LINE)" +
	"VALUES (:P_LV_USER_NUM, :P_LV_SEQ, :P_LV_SESSION, :P_LV_RECS, :P_LV_HEADER)";
				DataCommand command4 = new DataCommand(sql4);
				//Setting query parameters
				command4.addParameter("P_LV_USER_NUM", innerClass.lvUserNum);
				command4.addParameter("P_LV_SEQ", innerClass.lvSeq);
				command4.addParameter("P_LV_SESSION", innerClass.lvSession);
				command4.addParameter("P_LV_RECS", innerClass.lvRecs);
				command4.addParameter("P_LV_HEADER", innerClass.lvHeader);
				innerClass.rowCount = command4.execute();
				innerClass.lvFirstBlock = getFormFirstBlock(innerClass.lvForm);
				innerClass.lvCurBlock = innerClass.lvFirstBlock;
				innerClass.lvStartBlocks = toStr("Y");
				while (true) {
					//  go thru all blocks
					if ( innerClass.lvStartBlocks.equals("Y") )
					{
						innerClass.lvStartBlocks = toStr("N");
					}
					else if ( (innerClass.lvCurBlock.equals(innerClass.lvFirstBlock)) || (innerClass.lvCurBlock.isNull()) ) {
							break;
					}
					innerClass.lvFirstItem = getBlockFirstItem(innerClass.lvCurBlock);
					innerClass.lvCurItem = innerClass.lvFirstItem;
					innerClass.lvStartItems = toStr("Y");
					if ( SupportClasses.FORMS40.GetBlockProperty(innerClass.lvCurBlock, SupportClasses.Property.QUERY_DATA_SOURCE_TYPE).equals("TABLE") )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						innerClass.lvBlockTable = getBlockQueryDataSourceName(innerClass.lvCurBlock);
					}
					else {
						innerClass.lvBlockTable = GNls.Fget(toStr("GOQRPLS-0063"), toStr("LIB"), toStr("N/A"));
					}
					while (true) {
						//  go thru all items in the block
						innerClass.lvBlockItem = innerClass.lvCurBlock.append(".").append(innerClass.lvCurItem);
						if ( innerClass.lvStartItems.equals("Y") )
						{
							innerClass.lvStartItems = toStr("N");
						}
						else if ( (innerClass.lvCurItem.equals(innerClass.lvFirstItem)) || (innerClass.lvCurItem.isNull()) ) {
								break;
						}
						//  no need to process 'internal' blocks
						if ( in(innerClass.lvCurBlock, "G$_SDKEY", "G$_SDISP", "G$_VPDI_BLOCK", "G$_NAV_BLOCK", "G$_EXTENDED_SEARCH_BLOCK", "G$_OPT_BLOCK").getValue() )
						{
								break;
						}
						if ( getItemVisible(innerClass.lvBlockItem).notEquals("TRUE") )
						{
							innerClass.lvCurItem = getItemNextItem(innerClass.lvBlockItem);
							continue;
						}
						innerClass.lvType = getItemType(innerClass.lvBlockItem);
						if ( (!in(innerClass.lvType, "CHECKBOX", "LIST", "DISPLAY ITEM", "TEXT ITEM", "RADIO GROUP").getValue()) || ((innerClass.lvType.equals("DISPLAY ITEM")) && (getItemStyleClass(innerClass.lvBlockItem).equals("G$_NVA_DATA_SEPARATOR_LINE"))) )
						{
							innerClass.lvCurItem = getItemNextItem(innerClass.lvBlockItem);
							continue;
						}
						innerClass.lvList = toStr(null);
						if ( innerClass.lvType.equals("LIST") )
						{
							innerClass.lvListCount = toNumber(getListElementCount(innerClass.lvBlockItem));
							for ( int i = 1; innerClass.lvListCount.greaterOrEquals(i); i++ )
							{
								innerClass.lvListValue = trim(getListElementValue(innerClass.lvBlockItem, i));
								innerClass.lvListLabel = trim(replace(getListElementLabel(innerClass.lvBlockItem, i), "\"", "'"));
								if ( (!innerClass.lvListValue.isNull()) || (!innerClass.lvListLabel.isNull()) )
								{
									innerClass.lvStr = substring(isNull(innerClass.lvListValue, "NULL").append("=").append(innerClass.lvListLabel).append(", "), toInt(1), toInt(200));
									if ( length(innerClass.lvList).add(length(innerClass.lvStr)).greater(2000) )
									{
										innerClass.lvList = innerClass.lvList.append("....");
											break;
									}
									else {
										innerClass.lvList = innerClass.lvList.append(innerClass.lvStr);
									}
								}
							}
							innerClass.lvList = substring(innerClass.lvList, toInt(1), length(innerClass.lvList).subtract(2));
						}
						innerClass.lvCanvas = getItemCanvas(innerClass.lvBlockItem);
						if ( innerClass.lvCanvas.isNull() )
						{
							innerClass.lvCurItem = getItemNextItem(innerClass.lvBlockItem);
							continue;
						}
						// F2J_NOT_SUPPORTED : The property "ITEM's ITEM_TAB_PAGE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
						//						lvTab = SupportClasses.FORMS40.GetItemProperty(lvBlockItem, SupportClasses.Property.ITEM_TAB_PAGE);
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'ITEM's ITEM_TAB_PAGE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
						
						
						if ( !innerClass.lvTab.isNull() )
						{
							innerClass.lvTab = getTabPageLabel(innerClass.lvTab);
						}
						innerClass.lvDataType = getItemDataType(innerClass.lvBlockItem);
						innerClass.lvName = getItemName(innerClass.lvBlockItem);
						// F2J_NOT_SUPPORTED : The property "ITEM's columnName" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
						//						lvColumn = upper(SupportClasses.FORMS40.GetItemProperty(lvBlockItem, columnName));
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'ITEM's columnName' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
						
						
						if ( innerClass.lvColumn.isNull() )
						{
							innerClass.lvColumn = upper(innerClass.lvName);
						}
						innerClass.lvPrompt = trim(replace(substring(getItemPromptText(innerClass.lvBlockItem), toInt(1), toInt(200)), "\"", "'"));
						if ( innerClass.lvType.equals("CHECKBOX") )
						{
							innerClass.lvLabel = replace(getItemLabel(innerClass.lvBlockItem), "\"", "'");
							//  only for buttons and check boxes
							if ( innerClass.lvPrompt.isNull() )
							{
								innerClass.lvPrompt = innerClass.lvLabel;
							}
						}
						else {
							innerClass.lvLabel = toStr(null);
						}
						innerClass.lvHint = trim(replace(substring(getItemHint(innerClass.lvBlockItem), toInt(1), toInt(500)), "\"", "'"));
						if ( like(innerClass.lvHint, "G$\\_%") )
						{
							innerClass.lvCurItem = getItemNextItem(innerClass.lvBlockItem);
							continue;
						}
						//  since we cannot query 'Database Item', we have to assume that if the column name does not start with the block table
						//  name, then it is not a database item and therefore set the 'table' appropriately
						if ( like(upper(innerClass.lvCurItem), upper(innerClass.lvBlockTable).append("\\_%")) )
						{
							innerClass.lvItemTable = upper(innerClass.lvBlockTable);
						}
						else {
							innerClass.lvItemTable = GNls.Fget(toStr("GOQRPLS-0064"), toStr("LIB"), toStr("N/A"));
						}
						innerClass.lvLength = toStr(null);
						innerClass.lvTabDataType = toStr(null);
						innerClass.lvTabPrecision = toNumber(null);
						innerClass.lvTabScale = toNumber(null);
						innerClass.lvTabLength = toNumber(null);
						innerClass.lvTabDataLength = toNumber(null);
						//Setting query parameters
						innerClass.sizeC.addParameter("P_LV_BLOCK_TABLE", innerClass.lvBlockTable);
						innerClass.sizeC.addParameter("P_LV_COLUMN", innerClass.lvColumn);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable sizeC.
						innerClass.sizeC.open();
						ResultSet sizeCResults = innerClass.sizeC.fetchInto();
						if ( sizeCResults != null ) {
							innerClass.lvTabDataType = sizeCResults.getStr(0);
							innerClass.lvTabPrecision = sizeCResults.getNumber(1);
							innerClass.lvTabScale = sizeCResults.getNumber(2);
							innerClass.lvTabLength = sizeCResults.getNumber(3);
							innerClass.lvTabDataLength = sizeCResults.getNumber(4);
						}
						innerClass.sizeC.close();
						if ( innerClass.lvTabDataType.equals("VARCHAR2") )
						{
							innerClass.lvLength = toStr(innerClass.lvTabLength);
						}
						else if ( innerClass.lvTabDataType.equals("DATE") ) {
							innerClass.lvLength = toStr(null);
						}
						else if ( innerClass.lvTabDataType.equals("CLOB") ) {
							innerClass.lvLength = toStr(null);
						}
						else if ( innerClass.lvTabDataType.equals("NUMBER") ) {
							if ( innerClass.lvTabPrecision.isNull() )
							{
								innerClass.lvLength = toStr(innerClass.lvTabDataLength);
							}
							else {
								innerClass.lvLength = toChar(innerClass.lvTabPrecision.subtract(innerClass.lvTabScale)).append(innerClass.lvDecimal).append(toChar(innerClass.lvTabScale));
							}
						}
						else if ( innerClass.lvTabDataType.isNull() ) {
							if ( in(innerClass.lvDataType, "CHAR", "ALPHA").getValue() )
							{
								// F2J_NOT_SUPPORTED : The property "ITEM's MAX_LENGTH" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
								//								lvLength = SupportClasses.FORMS40.GetItemProperty(lvBlockItem, SupportClasses.Property.MAX_LENGTH);
								this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'ITEM's MAX_LENGTH' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
								
								
							}
							else if ( in(innerClass.lvDataType, "NUMBER", "RINT", "INT", "RNUMBER", "MONEY", "RMONEY").getValue() ) {
								innerClass.lvLength = innerClass.getFormat(getItemFormatMask(innerClass.lvBlockItem));
								if ( innerClass.lvLength.isNull() )
								{
									// F2J_NOT_SUPPORTED : The property "ITEM's MAX_LENGTH" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
									//									lvLength = SupportClasses.FORMS40.GetItemProperty(lvBlockItem, SupportClasses.Property.MAX_LENGTH);
									this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'ITEM's MAX_LENGTH' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
									
									
								}
							}
						}
						innerClass.lvRecs = innerClass.lvRecs.add(1);
						innerClass.lvDetail = toStr("\"").append(innerClass.lvForm).append("\",").append("\"").append(innerClass.lvCurBlock).append("\",").append("\"").append(innerClass.lvItemTable).append("\",").append("\"").append(innerClass.lvColumn).append("\",").append("\"").append(innerClass.lvLength).append("\",").append("\"").append(innerClass.lvPrompt).append("\",").append("\"").append(innerClass.lvDataType).append("\",").append("\"").append(innerClass.lvType).append("\",").append("\"").append(innerClass.lvHint).append("\",").append("\"").append(innerClass.lvTab).append("\",").append("\"").append(innerClass.lvList).append("\",");
						if ( length(innerClass.lvDetail).greater(2000) )
						{
							innerClass.lvDetail = toStr("\"").append(innerClass.lvForm).append("\",").append("\"").append(innerClass.lvCurBlock).append("\",").append("\"").append(innerClass.lvItemTable).append("\",").append("\"").append(innerClass.lvColumn).append("\",").append("\"").append(innerClass.lvLength).append("\",").append("\"").append(innerClass.lvPrompt).append("\",").append("\"").append(innerClass.lvDataType).append("\",").append("\"").append(innerClass.lvType).append("\",").append("\"").append(innerClass.lvHint).append("\",").append("\"").append(innerClass.lvTab).append("\",");
							innerClass.lvDetail = innerClass.lvDetail.append("\"").append(substring(innerClass.lvList, toInt(1), toInt(2000).subtract(length(innerClass.lvDetail)).subtract(7))).append("....\",");
						}
						String sql5 = "INSERT INTO GUROUTD " +
	"(GUROUTD_USER_NUM, GUROUTD_ONE_UP_NO, GUROUTD_FILE_NUMBER, GUROUTD_SEQ_NO, GUROUTD_LINE)" +
	"VALUES (:P_LV_USER_NUM, :P_LV_SEQ, :P_LV_SESSION, :P_LV_RECS, :P_LV_DETAIL)";
						DataCommand command5 = new DataCommand(sql5);
						//Setting query parameters
						command5.addParameter("P_LV_USER_NUM", innerClass.lvUserNum);
						command5.addParameter("P_LV_SEQ", innerClass.lvSeq);
						command5.addParameter("P_LV_SESSION", innerClass.lvSession);
						command5.addParameter("P_LV_RECS", innerClass.lvRecs);
						command5.addParameter("P_LV_DETAIL", innerClass.lvDetail);
						innerClass.rowCount = command5.execute();
						 
						innerClass.lvCurItem = getItemNextItem(innerClass.lvBlockItem);
					}
					//  go thru all items in the block
					innerClass.lvCurBlock = getBlockNextBlock(innerClass.lvCurBlock);
				}
				//  go thru all blocks
				// 
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
				} finally {
					MessageServices.resetMessageLevel();
				}
							
				formsDDL("BEGIN COMMIT; END;");
				// 
				//  If running on the web, call routine which will display output in browser
				// 
				if ( in(gGetUprfDeMimeType(), "FILE", "TEXT").getValue() )
				{
					gWebShowDocumentOutd(innerClass.lvSeq, innerClass.lvForm, innerClass.lvSession);
				}
				else {
					copy(toChar(innerClass.lvSeq),"GLOBAL.WUTL_ONE_UP_NO");
					copy(toChar(innerClass.lvSession),"GLOBAL.WUTL_FILE_NUMBER");
					copy(innerClass.lvForm,"GLOBAL.WUTL_FORM_NAME");
					copy(innerClass.lvForm,"GLOBAL.WUTL_BLOCK_NAME");
					copy("","GLOBAL.WUTL_FILE_NAME");
					// 
					executeAction("G$_REVOKE_ACCESS");
					gCheckFailure();
					gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), toStr("GUQWUTL"), toStr("NOHIDE"));
				}
				//  --
				clearMessage();
				}finally{
					innerClass.decimalC.close();
					innerClass.sizeC.close();
				}
		}
		
		private class GHelpAllFields_Local{
			
			int rowCount = 0;
			NString lvForm = getCurrentTaskName();
			NString lvFirstBlock= NString.getNull();
			NString lvCurBlock= NString.getNull();
			NString lvBlockTable= NString.getNull();
			NString lvItemTable= NString.getNull();
			NString lvFirstItem= NString.getNull();
			NString lvCurItem= NString.getNull();
			NString lvStartBlocks= NString.getNull();
			NString lvStartItems= NString.getNull();
			NString lvBlockItem= NString.getNull();
			NString lvColumn= NString.getNull();
			NString lvName= NString.getNull();
			NString lvLabel= NString.getNull();
			NString lvPrompt= NString.getNull();
			NString lvHint= NString.getNull();
			NString lvType= NString.getNull();
			NString lvDataType= NString.getNull();
			NString lvCanvas= NString.getNull();
			NString lvTab= NString.getNull();
			NString lvList= NString.getNull();
			NString lvStr= NString.getNull();
			NString lvListValue= NString.getNull();
			NString lvListLabel= NString.getNull();
			NString lvDetail= NString.getNull();
			NNumber lvListCount= NNumber.getNull();
			NString lvLength= NString.getNull();
			NString lvTabDataType= NString.getNull();
			NNumber lvTabPrecision= NNumber.getNull();
			NNumber lvTabScale= NNumber.getNull();
			NNumber lvTabLength= NNumber.getNull();
			NNumber lvTabDataLength= NNumber.getNull();
			NString lvDecimal= NString.getNull();
			NNumber lvSeq= NNumber.getNull();
			NNumber lvUserNum= NNumber.getNull();
			NNumber lvSession = toNumber(getNameIn("GLOBAL.SESSION_ID"));
			NNumber lvRecs = toNumber(1);
			NString lvHeader = GNls.Fget(toStr("GOQRPLS-0052"), toStr("LIB"), toStr("%01%Form%02%"), toStr("\""), toStr("\",")).append(GNls.Fget(toStr("GOQRPLS-0053"), toStr("LIB"), toStr("%01%Block%02%"), toStr("\""), toStr("\","))).append(GNls.Fget(toStr("GOQRPLS-0054"), toStr("LIB"), toStr("%01%Table%02%"), toStr("\""), toStr("\","))).append(GNls.Fget(toStr("GOQRPLS-0055"), toStr("LIB"), toStr("%01%Column%02%"), toStr("\""), toStr("\","))).append(GNls.Fget(toStr("GOQRPLS-0056"), toStr("LIB"), toStr("%01%Length%02%"), toStr("\""), toStr("\","))).append(GNls.Fget(toStr("GOQRPLS-0057"), toStr("LIB"), toStr("%01%Prompt%02%"), toStr("\""), toStr("\","))).append(GNls.Fget(toStr("GOQRPLS-0058"), toStr("LIB"), toStr("%01%DataType%02%"), toStr("\""), toStr("\","))).append(GNls.Fget(toStr("GOQRPLS-0059"), toStr("LIB"), toStr("%01%Type%02%"), toStr("\""), toStr("\","))).append(GNls.Fget(toStr("GOQRPLS-0060"), toStr("LIB"), toStr("%01%Hint%02%"), toStr("\""), toStr("\","))).append(GNls.Fget(toStr("GOQRPLS-0061"), toStr("LIB"), toStr("%01%Tab%02%"), toStr("\""), toStr("\","))).append(GNls.Fget(toStr("GOQRPLS-0062"), toStr("LIB"), toStr("%01%ListValues%02%"), toStr("\""), toStr("\",")));
			String sqlsizeC = "SELECT data_type, data_precision, data_scale, char_length, data_length " +
	" FROM all_tab_columns " +
	" WHERE table_name = upper(:P_LV_BLOCK_TABLE) AND column_name = upper(:P_LV_COLUMN) ";
			DataCursor sizeC = new DataCursor(sqlsizeC);
			String sqldecimalC = "SELECT substr(VALUE, 1, 1) " +
	" FROM NLS_SESSION_PARAMETERS " +
	" WHERE parameter = 'NLS_NUMERIC_CHARACTERS' ";
			DataCursor decimalC = new DataCursor(sqldecimalC);
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formatIn
		*/
		public NString getFormat(NString formatIn)
		{
			NString lvChar= NString.getNull();
			NString lvRight= NString.getNull();
			NNumber lvLeftCnt = toNumber(0);
			NNumber lvRightCnt = toNumber(0);
			if ( formatIn.isNull() )
			{
				return NString.getNull();
			}
			lvRight = toStr("N");
			lvLeftCnt = toNumber(0);
			lvRightCnt = toNumber(0);
			for ( int i = 1; i <= length(formatIn).getValue(); i++ )
			{
				lvChar = substring(formatIn, i, toInt(1));
				if ( lvChar.equals("D") )
				{
					lvRight = toStr("Y");
				}
				if ( lvChar.equals(lvDecimal) )
				{
					lvRight = toStr("Y");
				}
				if ( lvChar.equals("9") )
				{
					if ( lvRight.equals("Y") )
					{
						lvRightCnt = lvRightCnt.add(1);
					}
					else {
						lvLeftCnt = lvLeftCnt.add(1);
					}
				}
			}
			return toStr(lvLeftCnt).append(lvDecimal).append(lvRightCnt);
		}
	}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GUAMENU_CHECK_SET
	/*
	PROCEDURE G$_GUAMENU_CHECK_SET (EVAL_BTNNAME VARCHAR2) IS
<multilinecomment> 
   This procedure will disable the Exit w/Value button and menu
   item when the form is called from GUAMENU.  The procedure takes one
   parameter - the button name (the valid item name of the Exit w/Value
   button).
   If the EVAL_BTNNAME is null a standard button name will be constructed
   and disabled. (X_1_EXITVALUE_BTN where X is the name of the block that
   sequentially follows the FORM_HEADER block).

   Note: This procedure also assumes there is a menu item of
         'ACTION.EXIT WITH VALUE' to disable.
</multilinecomment>
  MI_ID  MENUITEM;
BEGIN    
  IF GET_APPLICATION_PROPERTY(CALLING_FORM) = 'GUAMENU' OR
     GET_APPLICATION_PROPERTY(CALLING_FORM) = 'GUAGMNU' OR
     GET_APPLICATION_PROPERTY(CALLING_FORM) IS NULL THEN
    MI_ID := FIND_MENU_ITEM('Action.Select');
    IF NOT ID_NULL(MI_ID) THEN
      SET_MENU_ITEM_PROPERTY('Action.Select',ENABLED,PROPERTY_OFF);
    END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param evalBtnname
		*/
		public void gGuamenuCheckSet(NString evalBtnname)
		{
			// This procedure will disable the Exit w/Value button and menu
			// item when the form is called from GUAMENU.  The procedure takes one
			// parameter - the button name (the valid item name of the Exit w/Value
			// button).
			// If the EVAL_BTNNAME is null a standard button name will be constructed
			// and disabled. (X_1_EXITVALUE_BTN where X is the name of the block that
			// sequentially follows the FORM_HEADER block).
			// Note: This procedure also assumes there is a menu item of
			// 'ACTION.EXIT WITH VALUE' to disable.
//			MenuItemDescriptor miId= null; //MORPHIS TODO: (JP) 05-NOV-2014.
			if ( getParentTaskName().equals("GUAMENU") || getParentTaskName().equals("GUAGMNU") || (getParentTaskName()) == null )
			{
				// F2J_NOT_SUPPORTED : Call to built-in "FIND_MENU_ITEM" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				miId = SupportClasses.FORMS40.FindMenuItem("Action.Select");
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'FIND_MENU_ITEM' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				
				//MORPHIS TODO: (JP) 05-NOV-2014.
//				if ( !(miId == null) )
//				{
//					setMenuItemEnabled("Action.Select", false);
//				}
				
				setMenuItemEnabled("Action.Select", false);
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GUAHELP
	/*
	PROCEDURE G$_GUAHELP(EDIT_IND VARCHAR2) IS 
--
-- calls the Dynamic Help form in either Query or Edit mode
--
  POS_X   NUMBER;
  POS_Y   NUMBER;
  ITM_LEN NUMBER;
  WIN_TIL VARCHAR2(80);
  WIN_ID  WINDOW;
--
  CURSOR_ITEM   VARCHAR2(61) := NAME_IN('SYSTEM.CURSOR_ITEM');
  CURSOR_BLOCK  VARCHAR2(30) := NAME_IN('SYSTEM.CURSOR_BLOCK');
  CURRENT_FORM  VARCHAR2(30) := NAME_IN('SYSTEM.CURRENT_FORM');
  EVENT_WINDOW  VARCHAR2(30) := NAME_IN('SYSTEM.EVENT_WINDOW');
--
BEGIN
  WIN_ID := G$_FIND_WINDOW_ID;
--
  COPY(SUBSTR(CURSOR_ITEM,INSTR(CURSOR_ITEM,'.')+1),'GLOBAL.HELP_FIELD');
  COPY(CURSOR_BLOCK,'GLOBAL.HELP_BLOCK');
  COPY(CURRENT_FORM,'GLOBAL.HELP_FORM');
--
  POS_X := GET_WINDOW_PROPERTY(WIN_ID,X_POS);
  POS_Y := GET_WINDOW_PROPERTY(WIN_ID,Y_POS);
  COPY(TO_CHAR(POS_Y),'GLOBAL.Y_LINE');
--
  IF GET_ITEM_PROPERTY(CURSOR_ITEM,ITEM_TYPE) = 'RADIO GROUP' THEN
   ITM_LEN := 5;
   COPY(TO_CHAR(ITM_LEN + POS_X),'GLOBAL.WIN_X_POS');
   COPY(TO_CHAR(POS_Y),'GLOBAL.WIN_Y_POS');
  ELSE
   IF TO_NUMBER(GET_ITEM_PROPERTY(CURSOR_ITEM,WIDTH)) > 10 THEN
     ITM_LEN := 10;
   ELSE
     ITM_LEN := TO_NUMBER(GET_ITEM_PROPERTY(CURSOR_ITEM,WIDTH));
   END IF;
   COPY(TO_CHAR(TO_NUMBER(GET_ITEM_PROPERTY(CURSOR_ITEM,X_POS)) 
                         + ITM_LEN + POS_X),'GLOBAL.WIN_X_POS');
   COPY(TO_CHAR(TO_NUMBER(GET_ITEM_PROPERTY(CURSOR_ITEM,Y_POS)) 
                         + POS_Y),'GLOBAL.WIN_Y_POS');
  END IF;
--
  IF EDIT_IND = 'Y' THEN
   COPY('Y','GLOBAL.HELP_UPD');
   G$_HELP_SETUP;
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),'GUAHELP','NOHIDE');
  ELSE
   COPY('N','GLOBAL.HELP_UPD');
   G$_HELP_SETUP;
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),'GUAHELP','QUERY_NOHIDE');
  END IF;
--
  IF NAME_IN('GLOBAL.WIN_TITLE') IS NULL THEN 
    G$_SET_INST_PROPERTY;
  ELSE
    SET_WINDOW_PROPERTY(WIN_ID,TITLE,NAME_IN('GLOBAL.WIN_TITLE'));
  END IF;
  COPY('Y','GLOBAL.HELP_UPD');
END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param editInd
		*/
		public void gGuahelp(NString editInd)
		{
			// 
			//  calls the Dynamic Help form in either Query or Edit mode
			// 
			NNumber posX= NNumber.getNull();
			NNumber posY= NNumber.getNull();
			NNumber itmLen= NNumber.getNull();
			NString winTil= NString.getNull();
			WindowDescriptor winId= null;
			// 
			NString cursorItem = getCursorItem();
			NString cursorBlock = getCursorBlock();
			NString currentForm = getCurrentTaskName();
			NString eventWindow = getCurrentWindow();
			winId = gFindWindowId();
			// 
			copy(substring(cursorItem, inStr(cursorItem, toStr(".")).add(1)),"GLOBAL.HELP_FIELD");
			copy(cursorBlock,"GLOBAL.HELP_BLOCK");
			copy(currentForm,"GLOBAL.HELP_FORM");
			// 
			// F2J_TO_REMOVE : The property "WINDOW's X_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS".
			//			posX = toNumber(SupportClasses.FORMS4W.GetWindowProperty(winId, SupportClasses.Property.X_POS));
			this.getLogger().trace(this, "// F2J_TO_REMOVE : The property 'WINDOW's X_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS'.");
			
			
			// F2J_NOT_SUPPORTED : The property "WINDOW's Y_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS".
			//			posY = toNumber(SupportClasses.FORMS4W.GetWindowProperty(winId, SupportClasses.Property.Y_POS));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's Y_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS'.");
			
			
			copy(toChar(posY),"GLOBAL.Y_LINE");
			// 
			if ( getItemType(cursorItem).equals("RADIO GROUP") )
			{
				itmLen = toNumber(5);
				copy(toChar(itmLen.add(posX)),"GLOBAL.WIN_X_POS");
				copy(toChar(posY),"GLOBAL.WIN_Y_POS");
			}
			else {
				if ( toNumber(getItemWidth(cursorItem)).greater(10) )
				{
					itmLen = toNumber(10);
				}
				else {
					itmLen = toNumber(getItemWidth(cursorItem));
				}
				copy(toChar(toNumber(getItemXPos(cursorItem)).add(itmLen).add(posX)),"GLOBAL.WIN_X_POS");
				copy(toChar(toNumber(getItemYPos(cursorItem)).add(posY)),"GLOBAL.WIN_Y_POS");
			}
			// 
			if ( editInd.equals("Y") )
			{
				copy("Y","GLOBAL.HELP_UPD");
				gHelpSetup();
				executeAction("G$_REVOKE_ACCESS");
				gCheckFailure();
				gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), toStr("GUAHELP"), toStr("NOHIDE"));
			}
			else {
				copy("N","GLOBAL.HELP_UPD");
				gHelpSetup();
				executeAction("G$_REVOKE_ACCESS");
				gCheckFailure();
				gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), toStr("GUAHELP"), toStr("QUERY_NOHIDE"));
			}
			// 
			if ( getNameIn("GLOBAL.WIN_TITLE").isNull() )
			{
				gSetInstProperty();
			}
			else {
				setWindowTitle(winId, getNameIn("GLOBAL.WIN_TITLE"));
			}
			copy("Y","GLOBAL.HELP_UPD");
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_WIN_PROPERTY
	/*
	PROCEDURE G$_GET_WIN_PROPERTY IS
  WIN_ID WINDOW;
BEGIN
  WIN_ID := G$_FIND_WINDOW_ID;
--
  COPY(NVL(GET_WINDOW_PROPERTY(WIN_ID,HEIGHT),20),'GLOBAL.WIN_H');
  COPY(NVL(GET_WINDOW_PROPERTY(WIN_ID,WIDTH) ,20),'GLOBAL.WIN_W');
  COPY(NVL(GET_WINDOW_PROPERTY(WIN_ID,X_POS) ,0) ,'GLOBAL.WIN_X');
  COPY(NVL(GET_WINDOW_PROPERTY(WIN_ID,Y_POS) ,0) ,'GLOBAL.WIN_Y');
END;
	*/
	/* <p>
/* </p>
		*/
		public void gGetWinProperty()
		{
			WindowDescriptor winId= null;
			winId = gFindWindowId();
			// 
			copy(isNull(SupportClasses.FORMS4W.GetWindowProperty(winId, SupportClasses.Property.HEIGHT), 20),"GLOBAL.WIN_H");
			copy(isNull(SupportClasses.FORMS4W.GetWindowProperty(winId, SupportClasses.Property.WIDTH), 20),"GLOBAL.WIN_W");
			copy(isNull(SupportClasses.FORMS4W.GetWindowProperty(winId, SupportClasses.Property.X_POS), 0),"GLOBAL.WIN_X");
			copy(isNull(SupportClasses.FORMS4W.GetWindowProperty(winId, SupportClasses.Property.Y_POS), 0),"GLOBAL.WIN_Y");
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_WEBRPT_SERVICE
	/*
	FUNCTION G$_GET_UPRF_WEBRPT_SERVICE RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for Web Report Service Name.
--
  UPRF_GROUP     VARCHAR2(30) := 'REPORT';
  UPRF_KEY       VARCHAR2(30) := 'WEB';
  UPRF_STRING    VARCHAR2(30) := 'SERVICE';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  IF UPRF_VALUE IS NULL THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0041','LIB','*ERROR* No default Web Report Service Name found.  Use the GUAUPRF form to set one.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfWebrptService()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for Web Report Service Name.
			// 
			NString uprfGroup = toStr("REPORT");
			NString uprfKey = toStr("WEB");
			NString uprfString = toStr("SERVICE");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			if ( uprfValue.isNull() )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0041"), toStr("LIB"), toStr("*ERROR* No default Web Report Service Name found.  Use the GUAUPRF form to set one.")));
				throw new ApplicationException();
			}
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_WEBRPT
	/*
	FUNCTION G$_GET_UPRF_WEBRPT RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'REPORT';
  UPRF_KEY       VARCHAR2(30) := 'WEB';
  UPRF_STRING    VARCHAR2(30) := 'DIRECTORY';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  IF UPRF_VALUE IS NULL THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0040','LIB','*ERROR* No default Web Report location found.  Use the GUAUPRF form to set one.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfWebrpt()
		{
			// 
			NString uprfGroup = toStr("REPORT");
			NString uprfKey = toStr("WEB");
			NString uprfString = toStr("DIRECTORY");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			if ( uprfValue.isNull() )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0040"), toStr("LIB"), toStr("*ERROR* No default Web Report location found.  Use the GUAUPRF form to set one.")));
				throw new ApplicationException();
			}
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_WEBOUTPUT
	/*
	FUNCTION G$_GET_UPRF_WEBOUTPUT RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for web output url.
--
  UPRF_GROUP     VARCHAR2(30) := 'WEBOUTPUT';
  UPRF_KEY       VARCHAR2(30) := 'WEB';
  UPRF_STRING    VARCHAR2(30) := 'DIRECTORY';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  IF UPRF_VALUE IS NULL THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0039','LIB','*ERROR* No default Web Output URL location found.  Use the GUAUPRF form to set one.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfWeboutput()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for web output url.
			// 
			NString uprfGroup = toStr("WEBOUTPUT");
			NString uprfKey = toStr("WEB");
			NString uprfString = toStr("DIRECTORY");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			if ( uprfValue.isNull() )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0039"), toStr("LIB"), toStr("*ERROR* No default Web Output URL location found.  Use the GUAUPRF form to set one.")));
				throw new ApplicationException();
			}
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_WEBHLP
	/*
	FUNCTION G$_GET_UPRF_WEBHLP RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for web help.
--
  UPRF_GROUP     VARCHAR2(30) := 'HELP';
  UPRF_KEY       VARCHAR2(30) := 'WEB';
  UPRF_STRING    VARCHAR2(30) := 'DIRECTORY';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  IF UPRF_VALUE IS NULL THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0038','LIB','*ERROR* No default Web Help location found.  Use the GUAUPRF form to set one.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfWebhlp()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for web help.
			// 
			NString uprfGroup = toStr("HELP");
			NString uprfKey = toStr("WEB");
			NString uprfString = toStr("DIRECTORY");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			if ( uprfValue.isNull() )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0038"), toStr("LIB"), toStr("*ERROR* No default Web Help location found.  Use the GUAUPRF form to set one.")));
				throw new ApplicationException();
			}
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_WEBBKSHLF
	/*
	FUNCTION G$_GET_UPRF_WEBBKSHLF RETURN VARCHAR2 IS
BEGIN 
  RETURN(NULL);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfWebbkshlf()
		{
			return NString.getNull();
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_VALUE
	/*
	FUNCTION G$_GET_UPRF_VALUE (GROUP_IN  IN VARCHAR2,
                            KEY_IN    IN VARCHAR2,
                            STRING_IN IN VARCHAR2) RETURN VARCHAR2 IS
--
-- This function takes the various keys to the user preference table and
-- attempts to identify the user settings.  If no user settings are found
-- then the institution default value is read.
--
  VALUE_OUT      VARCHAR2(200);
--
  CURSOR GURUPRF_C (cp_user VARCHAR2) IS
    SELECT GURUPRF_VALUE 
      FROM GURUPRF
     WHERE GURUPRF_USER_ID  = cp_user
       AND GURUPRF_GROUP    = GROUP_IN
       AND GURUPRF_KEY      = KEY_IN
       AND GURUPRF_STRING   = STRING_IN;
--
BEGIN
--
-- Find the user profile record.
--
  OPEN GURUPRF_C(USER);
  FETCH GURUPRF_C INTO VALUE_OUT;
  CLOSE GURUPRF_C;
--
  IF VALUE_OUT IS NOT NULL THEN
    RETURN(VALUE_OUT);
--
-- No user record found so get the default.
--
  ELSE
    OPEN GURUPRF_C('BASELINE');
    FETCH GURUPRF_C INTO VALUE_OUT;
    CLOSE GURUPRF_C;
--
    IF VALUE_OUT IS NOT NULL THEN
      RETURN(VALUE_OUT);
    ELSE
    	RETURN(NULL);
    END IF;
--
  END IF;
--
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param groupIn
		* @param keyIn
		* @param stringIn
		*/
		public NString gGetUprfValue(NString groupIn, NString keyIn, NString stringIn)
		{
			int rowCount = 0;
			// 
			//  This function takes the various keys to the user preference table and
			//  attempts to identify the user settings.  If no user settings are found
			//  then the institution default value is read.
			// 
			NString valueOut= NString.getNull();
			String sqlguruprfC = "SELECT GURUPRF_VALUE " +
	" FROM GURUPRF " +
	" WHERE GURUPRF_USER_ID = :P_CP_USER AND GURUPRF_GROUP = :P_GROUP_IN AND GURUPRF_KEY = :P_KEY_IN AND GURUPRF_STRING = :P_STRING_IN ";
			DataCursor guruprfC = new DataCursor(sqlguruprfC);
			NString cpUser = NString.getNull();
			try {
				// 
				//  Find the user profile record.
				// 
				cpUser=getUser();
				//Setting query parameters
				guruprfC.addParameter("P_CP_USER", cpUser);
				guruprfC.addParameter("P_GROUP_IN", groupIn);
				guruprfC.addParameter("P_KEY_IN", keyIn);
				guruprfC.addParameter("P_STRING_IN", stringIn);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable guruprfC.
				guruprfC.open();
				ResultSet guruprfCResults = guruprfC.fetchInto();
				if ( guruprfCResults != null ) {
					valueOut = guruprfCResults.getStr(0);
				}
				guruprfC.close();
				// 
				if ( !valueOut.isNull() )
				{
					return ((valueOut));
				}
				else {
					cpUser=toStr("BASELINE");
					//Setting query parameters
					guruprfC.addParameter("P_CP_USER", cpUser);
					guruprfC.addParameter("P_GROUP_IN", groupIn);
					guruprfC.addParameter("P_KEY_IN", keyIn);
					guruprfC.addParameter("P_STRING_IN", stringIn);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable guruprfC.
					guruprfC.open();
					guruprfCResults = guruprfC.fetchInto();
					if ( guruprfCResults != null ) {
						valueOut = guruprfCResults.getStr(0);
					}
					guruprfC.close();
					// 
					if ( !valueOut.isNull() )
					{
						return ((valueOut));
					}
					else {
						return NString.getNull();
					}
				}
				}finally{
					guruprfC.close();
				}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_TREE_CANVAS_COLOR
	/*
	FUNCTION G$_GET_UPRF_TREE_CANVAS_COLOR RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'COLOR';
  UPRF_STRING    VARCHAR2(30) := 'TREE_CANVAS';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfTreeCanvasColor()
		{
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("COLOR");
			NString uprfString = toStr("TREE_CANVAS");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_STARTUP_MENU
	/*
	FUNCTION G$_GET_UPRF_STARTUP_MENU RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'MENU';
  UPRF_KEY       VARCHAR2(30) := 'WIN32COMMON';
  UPRF_STRING    VARCHAR2(30) := 'STARTUP_MENU';
  UPRF_VALUE     VARCHAR2(200):= '';
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  IF UPRF_VALUE IS NULL THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0037','LIB','*ERROR* No default Banner Startup Menu found.  Use the GUAUPRF form to set one.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfStartupMenu()
		{
			// 
			NString uprfGroup = toStr("MENU");
			NString uprfKey = toStr("WIN32COMMON");
			NString uprfString = toStr("STARTUP_MENU");
			NString uprfValue = toStr("");
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			if ( uprfValue.isNull() )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0037"), toStr("LIB"), toStr("*ERROR* No default Banner Startup Menu found.  Use the GUAUPRF form to set one.")));
				throw new ApplicationException();
			}
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_SEPARATOR_COLOR
	/*
	FUNCTION G$_GET_UPRF_SEPARATOR_COLOR RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'COLOR';
  UPRF_STRING    VARCHAR2(30) := 'SEPARATOR';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfSeparatorColor()
		{
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("COLOR");
			NString uprfString = toStr("SEPARATOR");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_SCROLLBAR_COLOR
	/*
	FUNCTION G$_GET_UPRF_SCROLLBAR_COLOR RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'COLOR';
  UPRF_STRING    VARCHAR2(30) := 'SCROLLBAR';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfScrollbarColor()
		{
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("COLOR");
			NString uprfString = toStr("SCROLLBAR");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_RECORD_COLOR
	/*
	FUNCTION G$_GET_UPRF_RECORD_COLOR RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'COLOR';
  UPRF_STRING    VARCHAR2(30) := 'RECORD';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfRecordColor()
		{
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("COLOR");
			NString uprfString = toStr("RECORD");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_PROMPT_COLOR
	/*
	FUNCTION G$_GET_UPRF_PROMPT_COLOR RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30)  := 'UI';
  UPRF_KEY       VARCHAR2(30)  := 'COLOR';
  UPRF_STRING    VARCHAR2(30)  := 'PROMPT';
  UPRF_VALUE     VARCHAR2(200) := '';
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfPromptColor()
		{
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("COLOR");
			NString uprfString = toStr("PROMPT");
			NString uprfValue = toStr("");
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_MSG_CANVAS_COLOR
	/*
	FUNCTION G$_GET_UPRF_MSG_CANVAS_COLOR RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'COLOR';
  UPRF_STRING    VARCHAR2(30) := 'MESSAGE_CANVAS';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
	UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfMsgCanvasColor()
		{
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("COLOR");
			NString uprfString = toStr("MESSAGE_CANVAS");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_LINKS_PROG6
	/*
	FUNCTION G$_GET_UPRF_LINKS_PROG6 RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for the personal link 6 program/url.
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'LINKS';
  UPRF_STRING    VARCHAR2(30) := 'MY_LINK_6EVENT';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;      
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfLinksProg6()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for the personal link 6 program/url.
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("LINKS");
			NString uprfString = toStr("MY_LINK_6EVENT");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_LINKS_PROG5
	/*
	FUNCTION G$_GET_UPRF_LINKS_PROG5 RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for the personal link 5 program/url.
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'LINKS';
  UPRF_STRING    VARCHAR2(30) := 'MY_LINK_5EVENT';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;      
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfLinksProg5()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for the personal link 5 program/url.
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("LINKS");
			NString uprfString = toStr("MY_LINK_5EVENT");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_LINKS_PROG4
	/*
	FUNCTION G$_GET_UPRF_LINKS_PROG4 RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for the personal link 4 program/url.
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'LINKS';
  UPRF_STRING    VARCHAR2(30) := 'MY_LINK_4EVENT';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;      
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfLinksProg4()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for the personal link 4 program/url.
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("LINKS");
			NString uprfString = toStr("MY_LINK_4EVENT");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_LINKS_PROG3
	/*
	FUNCTION G$_GET_UPRF_LINKS_PROG3 RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for the personal link 3 program/url.
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'LINKS';
  UPRF_STRING    VARCHAR2(30) := 'MY_LINK_3EVENT';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;      
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfLinksProg3()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for the personal link 3 program/url.
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("LINKS");
			NString uprfString = toStr("MY_LINK_3EVENT");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_LINKS_PROG2
	/*
	FUNCTION G$_GET_UPRF_LINKS_PROG2 RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for the personal link 2 program/url.
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'LINKS';
  UPRF_STRING    VARCHAR2(30) := 'MY_LINK_2EVENT';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;      
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfLinksProg2()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for the personal link 2 program/url.
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("LINKS");
			NString uprfString = toStr("MY_LINK_2EVENT");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_LINKS_PROG1
	/*
	FUNCTION G$_GET_UPRF_LINKS_PROG1 RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for the personal link 1 program/url.
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'LINKS';
  UPRF_STRING    VARCHAR2(30) := 'MY_LINK_1EVENT';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfLinksProg1()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for the personal link 1 program/url.
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("LINKS");
			NString uprfString = toStr("MY_LINK_1EVENT");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_LINKS_MY_INST
	/*
	FUNCTION G$_GET_UPRF_LINKS_MY_INST RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'LINKS';
  UPRF_STRING    VARCHAR2(30) := 'MY_INST';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
	UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfLinksMyInst()
		{
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("LINKS");
			NString uprfString = toStr("MY_INST");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_LINKS_DESC6
	/*
	FUNCTION G$_GET_UPRF_LINKS_DESC6 RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for the personal link 1 description.
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'LINKS';
  UPRF_STRING    VARCHAR2(30) := 'MY_LINK_6DESC';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfLinksDesc6()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for the personal link 1 description.
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("LINKS");
			NString uprfString = toStr("MY_LINK_6DESC");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_LINKS_DESC5
	/*
	FUNCTION G$_GET_UPRF_LINKS_DESC5 RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for the personal link 1 description.
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'LINKS';
  UPRF_STRING    VARCHAR2(30) := 'MY_LINK_5DESC';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfLinksDesc5()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for the personal link 1 description.
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("LINKS");
			NString uprfString = toStr("MY_LINK_5DESC");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_LINKS_DESC4
	/*
	FUNCTION G$_GET_UPRF_LINKS_DESC4 RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for the personal link 1 description.
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'LINKS';
  UPRF_STRING    VARCHAR2(30) := 'MY_LINK_4DESC';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfLinksDesc4()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for the personal link 1 description.
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("LINKS");
			NString uprfString = toStr("MY_LINK_4DESC");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_LINKS_DESC3
	/*
	FUNCTION G$_GET_UPRF_LINKS_DESC3 RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for the personal link 1 description.
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'LINKS';
  UPRF_STRING    VARCHAR2(30) := 'MY_LINK_3DESC';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfLinksDesc3()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for the personal link 1 description.
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("LINKS");
			NString uprfString = toStr("MY_LINK_3DESC");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_LINKS_DESC2
	/*
	FUNCTION G$_GET_UPRF_LINKS_DESC2 RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for the personal link 1 description.
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'LINKS';
  UPRF_STRING    VARCHAR2(30) := 'MY_LINK_2DESC';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfLinksDesc2()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for the personal link 1 description.
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("LINKS");
			NString uprfString = toStr("MY_LINK_2DESC");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_LINKS_DESC1
	/*
	FUNCTION G$_GET_UPRF_LINKS_DESC1 RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for the personal link 1 description.
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'LINKS';
  UPRF_STRING    VARCHAR2(30) := 'MY_LINK_1DESC';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfLinksDesc1()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for the personal link 1 description.
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("LINKS");
			NString uprfString = toStr("MY_LINK_1DESC");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_LINKS_CANVAS_COLOR
	/*
	FUNCTION G$_GET_UPRF_LINKS_CANVAS_COLOR RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'COLOR';
  UPRF_STRING    VARCHAR2(30) := 'LINKS_CANVAS';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfLinksCanvasColor()
		{
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("COLOR");
			NString uprfString = toStr("LINKS_CANVAS");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_IMAGE_DIR
	/*
	FUNCTION G$_GET_UPRF_IMAGE_DIR RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for directory where images are stored.
--
  UPRF_GROUP     VARCHAR2(30) := 'IMAGE';
  UPRF_KEY       VARCHAR2(30) := 'WEB';
  UPRF_STRING    VARCHAR2(30) := 'DIRECTORY';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  IF UPRF_VALUE IS NULL THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0036','LIB','*ERROR* No default image directory found.  Use the GUAUPRF form to set one.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfImageDir()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for directory where images are stored.
			// 
			NString uprfGroup = toStr("IMAGE");
			NString uprfKey = toStr("WEB");
			NString uprfString = toStr("DIRECTORY");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			if ( uprfValue.isNull() )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0036"), toStr("LIB"), toStr("*ERROR* No default image directory found.  Use the GUAUPRF form to set one.")));
				throw new ApplicationException();
			}
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_HELP
	/*
	FUNCTION G$_GET_UPRF_HELP RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for online help.
--
  UPRF_GROUP     VARCHAR2(30) := 'HELP';
  UPRF_KEY       VARCHAR2(30) := 'WIN32COMMON';
  UPRF_STRING    VARCHAR2(30) := 'DIRECTORY';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  IF UPRF_VALUE IS NULL THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0035','LIB','*ERROR* No default Help directory found.  Use the GUAUPRF form to set one.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  IF UPRF_VALUE IS NOT NULL THEN
    IF SUBSTR(UPRF_VALUE,NVL(LENGTH(UPRF_VALUE), 0)) <> '\' THEN
      UPRF_VALUE := UPRF_VALUE || '\';
    END IF;
  END IF;
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfHelp()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for online help.
			// 
			NString uprfGroup = toStr("HELP");
			NString uprfKey = toStr("WIN32COMMON");
			NString uprfString = toStr("DIRECTORY");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			if ( uprfValue.isNull() )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0035"), toStr("LIB"), toStr("*ERROR* No default Help directory found.  Use the GUAUPRF form to set one.")));
				throw new ApplicationException();
			}
			// 
			if ( !uprfValue.isNull() )
			{
				if ( substring(uprfValue, isNull(length(uprfValue), 0)).notEquals("\\") )
				{
					uprfValue = uprfValue.append("\\");
				}
			}
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_EXIT_ALERT
	/*
	FUNCTION G$_GET_UPRF_EXIT_ALERT RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'ALERT';
  UPRF_STRING    VARCHAR2(30) := 'EXIT';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfExitAlert()
		{
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("ALERT");
			NString uprfString = toStr("EXIT");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_DUP_SSN_ALERT
	/*
	FUNCTION G$_GET_UPRF_DUP_SSN_ALERT RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'ALERT';
  UPRF_STRING    VARCHAR2(30) := 'DUP_SSN';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfDupSsnAlert()
		{
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("ALERT");
			NString uprfString = toStr("DUP_SSN");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_DE_PROMPTS
	/*
	FUNCTION G$_GET_UPRF_DE_PROMPTS RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'DATA_EXTRACT';
  UPRF_KEY       VARCHAR2(30) := 'WIN32COMMON';
  UPRF_STRING    VARCHAR2(30) := 'PROMPTS';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfDePrompts()
		{
			// 
			NString uprfGroup = toStr("DATA_EXTRACT");
			NString uprfKey = toStr("WIN32COMMON");
			NString uprfString = toStr("PROMPTS");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_DE_MIME_TYPE
	/*
	FUNCTION G$_GET_UPRF_DE_MIME_TYPE RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'DATA_EXTRACT';
  UPRF_KEY       VARCHAR2(30) := 'WIN32COMMON';
  UPRF_STRING    VARCHAR2(30) := 'MIME_TYPE';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := UPPER(G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING));
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfDeMimeType()
		{
			// 
			NString uprfGroup = toStr("DATA_EXTRACT");
			NString uprfKey = toStr("WIN32COMMON");
			NString uprfString = toStr("MIME_TYPE");
			NString uprfValue= NString.getNull();
			uprfValue = upper(gGetUprfValue(uprfGroup, uprfKey, uprfString));
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_DEAD_ALERT
	/*
	FUNCTION G$_GET_UPRF_DEAD_ALERT RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'ALERT';
  UPRF_STRING    VARCHAR2(30) := 'DECEASED';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfDeadAlert()
		{
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("ALERT");
			NString uprfString = toStr("DECEASED");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_DATAEXTRACT
	/*
	FUNCTION G$_GET_UPRF_DATAEXTRACT RETURN VARCHAR2 IS
--
-- This function sets various keys needed to the find the user preference 
-- table settings for data extract routine.
--
  UPRF_GROUP     VARCHAR2(30) := 'DATA_EXTRACT';
  UPRF_KEY       VARCHAR2(30) := 'WIN32COMMON';
  UPRF_STRING    VARCHAR2(30) := 'DIRECTORY';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  IF UPRF_VALUE IS NULL THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0034','LIB','*ERROR* No default Data Extract location found.  Use the GUAUPRF form to set one.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  IF UPRF_VALUE IS NOT NULL THEN
    IF SUBSTR(UPRF_VALUE,NVL(LENGTH(UPRF_VALUE), 0)) <> '\' THEN
      UPRF_VALUE := UPRF_VALUE || '\';
    END IF;
  END IF;
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfDataextract()
		{
			// 
			//  This function sets various keys needed to the find the user preference 
			//  table settings for data extract routine.
			// 
			NString uprfGroup = toStr("DATA_EXTRACT");
			NString uprfKey = toStr("WIN32COMMON");
			NString uprfString = toStr("DIRECTORY");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			if ( uprfValue.isNull() )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0034"), toStr("LIB"), toStr("*ERROR* No default Data Extract location found.  Use the GUAUPRF form to set one.")));
				throw new ApplicationException();
			}
			// 
			if ( !uprfValue.isNull() )
			{
				if ( substring(uprfValue, isNull(length(uprfValue), 0)).notEquals("\\") )
				{
					uprfValue = uprfValue.append("\\");
				}
			}
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_CONF_ALERT
	/*
	FUNCTION G$_GET_UPRF_CONF_ALERT RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'ALERT';
  UPRF_STRING    VARCHAR2(30) := 'CONFIDENTIAL';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfConfAlert()
		{
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("ALERT");
			NString uprfString = toStr("CONFIDENTIAL");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_CODE_PROMPT_COLOR
	/*
	FUNCTION G$_GET_UPRF_CODE_PROMPT_COLOR RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'COLOR';
  UPRF_STRING    VARCHAR2(30) := 'CODE_PROMPT';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfCodePromptColor()
		{
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("COLOR");
			NString uprfString = toStr("CODE_PROMPT");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_CM_FORMS
	/*
	FUNCTION G$_GET_UPRF_CM_FORMS RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'CM';
  UPRF_KEY       VARCHAR2(30) := 'LIST';
  UPRF_STRING    VARCHAR2(30) := 'FORMS';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfCmForms()
		{
			// 
			NString uprfGroup = toStr("CM");
			NString uprfKey = toStr("LIST");
			NString uprfString = toStr("FORMS");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_CANVAS_COLOR
	/*
	FUNCTION G$_GET_UPRF_CANVAS_COLOR RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'COLOR';
  UPRF_STRING    VARCHAR2(30) := 'CANVAS';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfCanvasColor()
		{
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("COLOR");
			NString uprfString = toStr("CANVAS");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_UPRF_BUTTON_COLOR
	/*
	FUNCTION G$_GET_UPRF_BUTTON_COLOR RETURN VARCHAR2 IS
--
  UPRF_GROUP     VARCHAR2(30) := 'UI';
  UPRF_KEY       VARCHAR2(30) := 'COLOR';
  UPRF_STRING    VARCHAR2(30) := 'BUTTON';
  UPRF_VALUE     VARCHAR2(200);
BEGIN
  UPRF_VALUE := G$_GET_UPRF_VALUE(UPRF_GROUP, UPRF_KEY, UPRF_STRING);
--
  RETURN(UPRF_VALUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetUprfButtonColor()
		{
			// 
			NString uprfGroup = toStr("UI");
			NString uprfKey = toStr("COLOR");
			NString uprfString = toStr("BUTTON");
			NString uprfValue= NString.getNull();
			uprfValue = gGetUprfValue(uprfGroup, uprfKey, uprfString);
			// 
			return ((uprfValue));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_SET_LOCAL_DIR
	/*
	PROCEDURE G$_GET_SET_LOCAL_DIR (HOME_IS OUT VARCHAR2) IS
--
-- used in Job Submission and Graphics Modules; 
-- Defines a profile of hte user's Operating System, including
-- default lecal directory.
--
  WHAT_OS        VARCHAR2(30);
  UPRF_VALUE     VARCHAR2(200);
  DOES_IT_EXIST  VARCHAR2(1);
--
  CURSOR GURUPRFC_FILE_SAVE IS
    SELECT GURUPRF_VALUE 
      FROM GURUPRF
     WHERE GURUPRF_USER_ID = USER
       AND GURUPRF_GROUP   = 'JOBSUB'
       AND GURUPRF_KEY     = WHAT_OS
       AND GURUPRF_STRING  = 'LOCAL_DIRECTORY';
--
BEGIN
  WHAT_OS := NAME_IN('GLOBAL.OS_IND');
  OPEN GURUPRFC_FILE_SAVE;
  FETCH GURUPRFC_FILE_SAVE INTO UPRF_VALUE;
  IF GURUPRFC_FILE_SAVE%NOTFOUND THEN
    UPRF_VALUE    := NULL;
    DOES_IT_EXIST := 'N';
    HOME_IS       := NULL;
  ELSE
    DOES_IT_EXIST := 'Y';
  END IF;
  CLOSE GURUPRFC_FILE_SAVE;
--
  IF UPRF_VALUE IS NOT NULL THEN
    HOME_IS := UPRF_VALUE;
    RETURN;
  END IF;
--
  IF WHAT_OS = 'UNIX' THEN
    TOOL_ENV.getvar('HOME',UPRF_VALUE);
    IF UPRF_VALUE IS NOT NULL THEN
      IF SUBSTR(UPRF_VALUE,NVL(LENGTH(UPRF_VALUE), 0)) <> '/' THEN
        UPRF_VALUE := UPRF_VALUE||'/';
      END IF;
      G$_INS_UPD_LOCAL_DIR(DOES_IT_EXIST,UPRF_VALUE);
      HOME_IS := UPRF_VALUE;
    END IF;
  ELSIF WHAT_OS = 'VMS' THEN
    TOOL_ENV.getvar('SYS$LOGIN',UPRF_VALUE);
    IF UPRF_VALUE IS NOT NULL THEN
      G$_INS_UPD_LOCAL_DIR(DOES_IT_EXIST,UPRF_VALUE);
      HOME_IS := UPRF_VALUE;
    END IF;
  ELSIF WHAT_OS = 'WIN32COMMON' THEN
    TOOL_ENV.getvar('TEMP',UPRF_VALUE);
    IF UPRF_VALUE IS NOT NULL THEN
      IF SUBSTR(UPRF_VALUE,NVL(LENGTH(UPRF_VALUE), 0)) <> '\' THEN
        UPRF_VALUE := UPRF_VALUE||'\';
      END IF;
      G$_INS_UPD_LOCAL_DIR(DOES_IT_EXIST,UPRF_VALUE);
      HOME_IS := UPRF_VALUE;
    ELSE
      G$_INS_UPD_LOCAL_DIR(DOES_IT_EXIST,'UNKNOWN');
      HOME_IS       := NULL;
    END IF;
  ELSIF WHAT_OS = 'MSWINDOWS' THEN
    TOOL_ENV.getvar('TEMP',UPRF_VALUE);
    IF UPRF_VALUE IS NOT NULL THEN
      IF SUBSTR(UPRF_VALUE,NVL(LENGTH(UPRF_VALUE), 0)) <> '\' THEN
        UPRF_VALUE := UPRF_VALUE||'\';
      END IF;
      G$_INS_UPD_LOCAL_DIR(DOES_IT_EXIST,UPRF_VALUE);
      HOME_IS := UPRF_VALUE;
    ELSE
      G$_INS_UPD_LOCAL_DIR(DOES_IT_EXIST,'UNKNOWN');
      HOME_IS       := NULL;
    END IF;
  ELSE
    G$_INS_UPD_LOCAL_DIR(DOES_IT_EXIST,'UNKNOWN');
    HOME_IS       := NULL;
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param homeIs
		*/
		public void gGetSetLocalDir(Ref<NString> homeIs)
		{
			int rowCount = 0;
			// 
			//  used in Job Submission and Graphics Modules; 
			//  Defines a profile of hte user's Operating System, including
			//  default lecal directory.
			// 
			NString whatOs= NString.getNull();
			NString uprfValue= NString.getNull();
			NString doesItExist= NString.getNull();
			String sqlguruprfcFileSave = "SELECT GURUPRF_VALUE " +
	" FROM GURUPRF " +
	" WHERE GURUPRF_USER_ID = USER AND GURUPRF_GROUP = 'JOBSUB' AND GURUPRF_KEY = :P_WHAT_OS AND GURUPRF_STRING = 'LOCAL_DIRECTORY' ";
			DataCursor guruprfcFileSave = new DataCursor(sqlguruprfcFileSave);
			try {
				whatOs = getNameIn("GLOBAL.OS_IND");
				//Setting query parameters
				guruprfcFileSave.addParameter("P_WHAT_OS", whatOs);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable guruprfcFileSave.
				guruprfcFileSave.open();
				ResultSet guruprfcFileSaveResults = guruprfcFileSave.fetchInto();
				if ( guruprfcFileSaveResults != null ) {
					uprfValue = guruprfcFileSaveResults.getStr(0);
				}
				if ( guruprfcFileSave.notFound() )
				{
					uprfValue = toStr(null);
					doesItExist = toStr("N");
					homeIs.val = toStr(null);
				}
				else {
					doesItExist = toStr("Y");
				}
				guruprfcFileSave.close();
				// 
				if ( !uprfValue.isNull() )
				{
					homeIs.val = uprfValue;
					return ;
				}
				// 
				if ( whatOs.equals("UNIX") )
				{
					uprfValue = getEnvVar("HOME");
					if ( !uprfValue.isNull() )
					{
						if ( substring(uprfValue, isNull(length(uprfValue), 0)).notEquals("/") )
						{
							uprfValue = uprfValue.append("/");
						}
						gInsUpdLocalDir(doesItExist, uprfValue);
						homeIs.val = uprfValue;
					}
				}
				else if ( whatOs.equals("VMS") ) {
					uprfValue = getEnvVar("SYS$LOGIN");
					if ( !uprfValue.isNull() )
					{
						gInsUpdLocalDir(doesItExist, uprfValue);
						homeIs.val = uprfValue;
					}
				}
				else if ( whatOs.equals("WIN32COMMON") ) {
					uprfValue = getEnvVar("TEMP");
					if ( !uprfValue.isNull() )
					{
						if ( substring(uprfValue, isNull(length(uprfValue), 0)).notEquals("\\") )
						{
							uprfValue = uprfValue.append("\\");
						}
						gInsUpdLocalDir(doesItExist, uprfValue);
						homeIs.val = uprfValue;
					}
					else {
						gInsUpdLocalDir(doesItExist, toStr("UNKNOWN"));
						homeIs.val = toStr(null);
					}
				}
				else if ( whatOs.equals("MSWINDOWS") ) {
					uprfValue = getEnvVar("TEMP");
					if ( !uprfValue.isNull() )
					{
						if ( substring(uprfValue, isNull(length(uprfValue), 0)).notEquals("\\") )
						{
							uprfValue = uprfValue.append("\\");
						}
						gInsUpdLocalDir(doesItExist, uprfValue);
						homeIs.val = uprfValue;
					}
					else {
						gInsUpdLocalDir(doesItExist, toStr("UNKNOWN"));
						homeIs.val = toStr(null);
					}
				}
				else {
					gInsUpdLocalDir(doesItExist, toStr("UNKNOWN"));
					homeIs.val = toStr(null);
				}
				}finally{
					guruprfcFileSave.close();
				}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_RW_ATTRIBUTES
	/*
	PROCEDURE G$_GET_RW_ATTRIBUTES IS
-- Stores event window attributes.
  WN_ID WINDOW;
--
BEGIN
  WN_ID := G$_FIND_WINDOW_ID;
  COPY(GET_WINDOW_PROPERTY( WN_ID, WIDTH ),'GLOBAL.RW_W');
  COPY(GET_WINDOW_PROPERTY( WN_ID, HEIGHT ),'GLOBAL.RW_H');
  COPY(GET_WINDOW_PROPERTY( WN_ID, X_POS ),'GLOBAL.RW_X');
  COPY(GET_WINDOW_PROPERTY( WN_ID, Y_POS ),'GLOBAL.RW_Y');
END;
	*/
	/* <p>
/* </p>
		*/
		public void gGetRwAttributes()
		{
			//  Stores event window attributes.
			WindowDescriptor wnId= null;
			wnId = gFindWindowId();
			copy(SupportClasses.FORMS4W.GetWindowProperty(wnId, SupportClasses.Property.WIDTH),"GLOBAL.RW_W");
			copy(SupportClasses.FORMS4W.GetWindowProperty(wnId, SupportClasses.Property.HEIGHT),"GLOBAL.RW_H");
			copy(SupportClasses.FORMS4W.GetWindowProperty(wnId, SupportClasses.Property.X_POS),"GLOBAL.RW_X");
			copy(SupportClasses.FORMS4W.GetWindowProperty(wnId, SupportClasses.Property.Y_POS),"GLOBAL.RW_Y");
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_PIPE_MESSAGES
	/*
	PROCEDURE G$_GET_PIPE_MESSAGES IS 
--
-- This procedure checks for Electronic Approvals messages through the use of  
-- a dbms pipe named as the Oracle username. It alerts the user to how many 
-- transactions they have pending. 
--
  TIMED_OUT      EXCEPTION;
  PRAGMA         EXCEPTION_INIT(TIMED_OUT,-6556);
  STATUS         NUMBER;
  MAX_WAIT       INTEGER := 0;
  RETURN_PIPE    VARCHAR2(30);
  RETURN_MESSAGE VARCHAR(200);
  COUNT_MSG      NUMBER := 0;
  ALERT_MESSAGE  VARCHAR2(80);
--
BEGIN
  DEFAULT_VALUE('N','GLOBAL.APPROVAL_MSG_IND');
  IF NAME_IN('GLOBAL.APPROVAL_MSG_IND') = 'Y' THEN 
    RETURN_PIPE := USER;
    LOOP 
      STATUS := GOKDBMS.PIPE_RECEIVE_MESSAGE(RETURN_PIPE,MAX_WAIT);
      GOKDBMS.PIPE_UNPACK_MESSAGE(RETURN_MESSAGE);
      IF STATUS = 0 THEN 
        COUNT_MSG := COUNT_MSG + 1;
      ELSE
        EXIT;
      END IF;
    END LOOP;
  END IF;
--
EXCEPTION
  WHEN TIMED_OUT THEN 
    IF COUNT_MSG > 0 THEN
      ALERT_MESSAGE := RETURN_MESSAGE;
      SET_ALERT_PROPERTY('G$_PIPE_MESSAGE_ALERT',ALERT_MESSAGE_TEXT,ALERT_MESSAGE);
      IF SHOW_ALERT('G$_PIPE_MESSAGE_ALERT') = ALERT_BUTTON1 THEN 
        IF NAME_IN('GLOBAL.SELECTFRM') <> 'NOAAPSM' THEN
          EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
          G$_CHECK_FAILURE;
          G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),'NOAAPSM','');
        END IF;
      END IF;    
    END IF;
--
  WHEN OTHERS THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0033','LIB','*WARNING* Problem receiving piped messages.'));
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gGetPipeMessages()
		{
			// 
			//  This procedure checks for Electronic Approvals messages through the use of  
			//  a dbms pipe named as the Oracle username. It alerts the user to how many 
			//  transactions they have pending. 
			// 
			NNumber status= NNumber.getNull();
			NInteger maxWait = toInt(0);
			NString returnPipe= NString.getNull();
			NString returnMessage= NString.getNull();
			NNumber countMsg = toNumber(0);
			NString alertMessage= NString.getNull();
			try
			{
				setDefaultValue("N", "GLOBAL.APPROVAL_MSG_IND");
				if ( getNameIn("GLOBAL.APPROVAL_MSG_IND").equals("Y") )
				{
					returnPipe = getUser();
					while (true) {
						status = Gokdbms.FpipeReceiveMessage(returnPipe, toNumber(maxWait));
						Ref<NString> p_item_ref = new Ref<NString>(returnMessage);
						Gokdbms.pipeUnpackMessage(p_item_ref);
						returnMessage = p_item_ref.val;
						if ( status.equals(0) )
						{
							countMsg = countMsg.add(1);
						}
						else {
								break;
						}
					}
				}
			}
			catch(ApplicationException e)
			{
				if ( countMsg.greater(0) )
				{
					alertMessage = returnMessage;
					setAlertMessageText("G$_PIPE_MESSAGE_ALERT", alertMessage);
					if ( showAlert("G$_PIPE_MESSAGE_ALERT").equals(MessageServices.BUTTON1) )
					{
						if ( getNameIn("GLOBAL.SELECTFRM").notEquals("NOAAPSM") )
						{
							executeAction("G$_REVOKE_ACCESS");
							gCheckFailure();
							gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), toStr("NOAAPSM"), toStr(""));
						}
					}
				}
			}
			catch(Exception  e)
			{
				warningMessage(GNls.Fget(toStr("GOQRPLS-0033"), toStr("LIB"), toStr("*WARNING* Problem receiving piped messages.")));
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_GET_MAIN_WINDOW_TITLE
	/*
	FUNCTION G$_GET_MAIN_WINDOW_TITLE RETURN VARCHAR2 IS
  lv_form_name  VARCHAR2(30) := NAME_IN('SYSTEM.CURRENT_FORM');
  lv_form_title VARCHAR2(80) := 'NotFound';
--
  CURSOR BANNER_FORM_DESC IS
    SELECT RTRIM(GUBOBJS_DESC)
      FROM GUBOBJS
     WHERE GUBOBJS_USER_ID = 'BASELINE'
       AND GUBOBJS_NAME = lv_form_name;
--
BEGIN
  OPEN BANNER_FORM_DESC;
  FETCH BANNER_FORM_DESC INTO lv_form_title;
  IF BANNER_FORM_DESC%NOTFOUND THEN
    lv_form_title := 'NotFound';
  END IF;
  CLOSE BANNER_FORM_DESC;
--
  RETURN(lv_form_title);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString gGetMainWindowTitle()
		{
			int rowCount = 0;
			NString lvFormName = getCurrentTaskName();
			NString lvFormTitle = toStr("NotFound");
			String sqlbannerFormDesc = "SELECT RTRIM(GUBOBJS_DESC) " +
	" FROM GUBOBJS " +
	" WHERE GUBOBJS_USER_ID = 'BASELINE' AND GUBOBJS_NAME = :P_LV_FORM_NAME ";
			DataCursor bannerFormDesc = new DataCursor(sqlbannerFormDesc);
			try {
				//Setting query parameters
				bannerFormDesc.addParameter("P_LV_FORM_NAME", lvFormName);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable bannerFormDesc.
				bannerFormDesc.open();
				ResultSet bannerFormDescResults = bannerFormDesc.fetchInto();
				if ( bannerFormDescResults != null ) {
					lvFormTitle = bannerFormDescResults.getStr(0);
				}
				if ( bannerFormDesc.notFound() )
				{
					lvFormTitle = toStr("NotFound");
				}
				bannerFormDesc.close();
				// 
				return ((lvFormTitle));
				}finally{
					bannerFormDesc.close();
				}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_FUNC_BASE_INFO
	/*
	PROCEDURE G$_FUNC_BASE_INFO IS
BEGIN
  COPY(NAME_IN('SYSTEM.CURRENT_BLOCK'),'SAVE_BLOCK_NAME');
  GO_BLOCK('G$_FUNC_BASE_INFO_BLOCK');
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gFuncBaseInfo()
		{
			copy(getCurrentBlock(),"SAVE_BLOCK_NAME");
			goBlock(toStr("G$_FUNC_BASE_INFO_BLOCK"));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_FORM_STARTUP
	/*
	PROCEDURE G$_FORM_STARTUP IS
  TEMP_FORMNAME VARCHAR2(30) := NAME_IN('SYSTEM.CURRENT_FORM');
BEGIN
  G$_MENU_BAR.SET_MENU_PRE_FORM;
  G$_CHECK_FAILURE;
--
-- Call mask package to deterime if any items in this form need to have format masks
-- applied for privacy protection.
--
  G$_MASKS.G$_STARTUP_MASK(TEMP_FORMNAME);
--
-- Added for I18N of date format masks and to modify hints accordingly
--
	G$_FORMS_NLS.INIT_FORM(TEMP_FORMNAME);
--
-- Verify the role being used to determine whether or not to disable some of the pop-up menu
-- options.
--
  IF G$_QUERY_ONLY_ROLE THEN
    SET_MENU_ITEM_PROPERTY('G$_DEFAULT_PM.ADD_FORM', ENABLED, PROPERTY_FALSE);        	
  END IF;
END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gFormStartup()
		{
			NString tempFormname = getCurrentTaskName();
			try {
				//MORPHIS: Menu logic
				getGMenuBar().setMenuPreForm();
			} catch (Exception e) {
				throw new ApplicationException(e);
			}
			// 
			//  Call mask package to deterime if any items in this form need to have format masks
			//  applied for privacy protection.
			// 
			getGMasks().gStartupMask(tempFormname);
			// 
			//  Added for I18N of date format masks and to modify hints accordingly
			// 
			getGFormsNls().initForm(tempFormname);
			// 
			//  Verify the role being used to determine whether or not to disable some of the pop-up menu
			//  options.
			// 
			if ( gQueryOnlyRole().getValue() )
			{
				setMenuItemEnabled("G$_DEFAULT_PM.ADD_FORM", false);
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_FORM_SHUTDOWN
	/*
	PROCEDURE G$_FORM_SHUTDOWN IS
BEGIN
  G$_MENU_BAR.SET_MENU_POST_FORM;
  G$_CHECK_FAILURE;      
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gFormShutdown()
		{
			getGMenuBar().setMenuPostForm();
			gCheckFailure();
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_FIND_WINDOW_ID
	/*
	FUNCTION G$_FIND_WINDOW_ID RETURN WINDOW IS
--
-- This function returns the ID of the current event's window. 
--
  lv_event_win VARCHAR2(30) := NAME_IN('SYSTEM.EVENT_WINDOW');
  WIN_ID       WINDOW;
BEGIN
  IF lv_event_win IS NULL OR
     lv_event_win IN ('G$_OPT_WINDOW','FORMS_MDI_WINDOW') THEN
    WIN_ID := FIND_WINDOW('MAIN_WINDOW');
    IF ID_NULL(WIN_ID) THEN
      WIN_ID := FIND_WINDOW('ROOT_WINDOW');
    END IF;
  ELSE
    WIN_ID := FIND_WINDOW(lv_event_win);
  END IF;
--
  RETURN(WIN_ID);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public WindowDescriptor gFindWindowId()
		{
			// 
			//  This function returns the ID of the current event's window. 
			// 
			NString lvEventWin = getCurrentWindow();
			WindowDescriptor winId= null;
			if ( lvEventWin.isNull() || in(lvEventWin, "G$_OPT_WINDOW", "FORMS_MDI_WINDOW").getValue() )
			{
				winId = findWindow("MAIN_WINDOW");
				if ( (winId == null) )
				{
					winId = findWindow("ROOT_WINDOW");
				}
			}
			else {
				winId = findWindow(lvEventWin);
			}
			// 
			return ((winId));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_EXTRACT_BCC_ITEMS
	/*
	PROCEDURE G$_EXTRACT_BCC_ITEMS IS
BEGIN
  NULL;
END G$_EXTRACT_BCC_ITEMS;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gExtractBccItems()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_ENV_IS_WINDOWSNT
	/*
	FUNCTION G$_ENV_IS_WINDOWSNT RETURN BOOLEAN IS
-- This function returns TRUE in a Windows NT environment.
BEGIN
  RETURN(FALSE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool gEnvIsWindowsnt()
		{
			return  toBool(((NBool.False)));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_ENV_IS_WINDOWS9X
	/*
	FUNCTION G$_ENV_IS_WINDOWS9X RETURN BOOLEAN IS
-- This function returns TRUE in a Windows 95 environment.
BEGIN
  RETURN(FALSE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool gEnvIsWindows9x()
		{
			return  toBool(((NBool.False)));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_ENV_IS_WINDOWS98
	/*
	FUNCTION G$_ENV_IS_WINDOWS98 RETURN BOOLEAN IS
--  The function returns TRUE if the current operating system is Windows 98.
BEGIN
  RETURN FALSE;
END G$_ENV_IS_WINDOWS98;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool gEnvIsWindows98()
		{
			return  toBool(NBool.False);
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_ENV_IS_WINDOWS95
	/*
	FUNCTION G$_ENV_IS_WINDOWS95 RETURN BOOLEAN IS
--  The function returns TRUE if the current operating system is Windows 95.
BEGIN
  RETURN FALSE;
END G$_ENV_IS_WINDOWS95;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool gEnvIsWindows95()
		{
			return  toBool(NBool.False);
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_ENV_IS_WINDOWS3X
	/*
	FUNCTION G$_ENV_IS_WINDOWS3X RETURN BOOLEAN IS
-- This function returns TRUE in a Windows 3.X environment.
BEGIN
  IF NAME_IN('GLOBAL.USER_INTERFACE') = 'MSWINDOWS' THEN
    RETURN(TRUE);
  END IF;
  RETURN(FALSE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool gEnvIsWindows3x()
		{
			if ( getNameIn("GLOBAL.USER_INTERFACE").equals("MSWINDOWS") )
			{
				return  toBool(((NBool.True)));
			}
			return  toBool(((NBool.False)));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_ENV_IS_WINDOWS
	/*
	FUNCTION G$_ENV_IS_WINDOWS RETURN BOOLEAN IS
-- This function returns TRUE in a Windows environment.
BEGIN
  IF NAME_IN('GLOBAL.USER_INTERFACE') IN ('MSWINDOWS','MSWINDOWS32') THEN
    RETURN(TRUE);
  END IF;
  RETURN(FALSE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool gEnvIsWindows()
		{
			if ( in(getNameIn("GLOBAL.USER_INTERFACE"), "MSWINDOWS", "MSWINDOWS32").getValue() )
			{
				return  toBool(((NBool.True)));
			}
			return  toBool(((NBool.False)));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_ENV_IS_WEB_UNIX
	/*
	FUNCTION G$_ENV_IS_WEB_UNIX RETURN BOOLEAN IS
-- This function returns TRUE in a World Wide Web environment
-- and being served by a UNIX web forms server
BEGIN
  IF NAME_IN('GLOBAL.USER_INTERFACE') = 'WEB' AND
     NAME_IN('GLOBAL.OS_IND') = 'UNIX' THEN
    RETURN(TRUE);
  END IF;
  RETURN(FALSE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool gEnvIsWebUnix()
		{
			if ( getNameIn("GLOBAL.USER_INTERFACE").equals("WEB") && getNameIn("GLOBAL.OS_IND").equals("UNIX") )
			{
				return  toBool(((NBool.True)));
			}
			return  toBool(((NBool.False)));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_ENV_IS_WEB
	/*
	FUNCTION G$_ENV_IS_WEB RETURN BOOLEAN IS
-- This function returns TRUE in a World Wide Web environment.
BEGIN
  IF NAME_IN('GLOBAL.USER_INTERFACE') = 'WEB' THEN
    RETURN(TRUE);
  END IF;
  RETURN(FALSE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool gEnvIsWeb()
		{
			if ( getNameIn("GLOBAL.USER_INTERFACE").equals("WEB") )
			{
				return  toBool(((NBool.True)));
			}
			return  toBool(((NBool.False)));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_ENV_IS_MOTIF
	/*
	FUNCTION G$_ENV_IS_MOTIF RETURN BOOLEAN IS
-- This function returns TRUE in a MOTIF User Interface environment.
BEGIN
  IF NAME_IN('GLOBAL.USER_INTERFACE') = 'MOTIF' THEN
    RETURN(TRUE);
  END IF;
  RETURN(FALSE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool gEnvIsMotif()
		{
			if ( getNameIn("GLOBAL.USER_INTERFACE").equals("MOTIF") )
			{
				return  toBool(((NBool.True)));
			}
			return  toBool(((NBool.False)));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_ENV_IS_MAC
	/*
	FUNCTION G$_ENV_IS_MAC RETURN BOOLEAN IS
-- This function returns TRUE in a Macintosh environment.
BEGIN
  IF NAME_IN('GLOBAL.USER_INTERFACE') = 'MACINTOSH' THEN
    RETURN(TRUE);
  END IF;
  RETURN(FALSE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool gEnvIsMac()
		{
			if ( getNameIn("GLOBAL.USER_INTERFACE").equals("MACINTOSH") )
			{
				return  toBool(((NBool.True)));
			}
			return  toBool(((NBool.False)));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_ENV_IS_GUI
	/*
	FUNCTION G$_ENV_IS_GUI RETURN BOOLEAN IS
-- This function returns TRUE in a Graphical User Interface environment.
BEGIN
  IF NAME_IN('GLOBAL.USER_INTERFACE') 
          IN ('MSWINDOWS','MSWINDOWS32','MACINTOSH','X','MOTIF') THEN
    RETURN(TRUE);
  END IF;
  RETURN(FALSE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool gEnvIsGui()
		{
			if ( in(getNameIn("GLOBAL.USER_INTERFACE"), "MSWINDOWS", "MSWINDOWS32", "MACINTOSH", "X", "MOTIF").getValue() )
			{
				return  toBool(((NBool.True)));
			}
			return  toBool(((NBool.False)));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_ENV_IS_CHARMODE
	/*
	FUNCTION G$_ENV_IS_CHARMODE RETURN BOOLEAN IS
-- This function returns TRUE in a non-GUI, character-mode environment.
BEGIN
  RETURN(FALSE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool gEnvIsCharmode()
		{
			return  toBool(((NBool.False)));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_DUPLICATE_PIDM
	/*
	FUNCTION G$_DUPLICATE_PIDM (PIDM_IN IN NUMBER) RETURN BOOLEAN IS
  PIDM_EXIST VARCHAR2(1);
BEGIN
  PIDM_EXIST := gb_common.f_pidm_exists(PIDM_IN);
--
  RETURN(PIDM_EXIST = 'Y');
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pidmIn
		*/
		public NBool gDuplicatePidm(NNumber pidmIn)
		{
			NString pidmExist= NString.getNull();
			pidmExist = GbCommon.fPidmExists(pidmIn);
			// 
			return toBool(pidmExist.equals("Y"));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_DO_WIN_ACTIVATED
	/*
	FUNCTION G$_DO_WIN_ACTIVATED RETURN BOOLEAN IS
BEGIN
--
-- This function will be removed before being shipped.  This
-- function is called by the WHEN-WINDOW-ACTIVATED trigger in the form
-- property classes in GOQOLIB.
--
  RETURN(TRUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool gDoWinActivated()
		{
			// 
			//  This function will be removed before being shipped.  This
			//  function is called by the WHEN-WINDOW-ACTIVATED trigger in the form
			//  property classes in GOQOLIB.
			// 
			return  toBool(((NBool.True)));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_DO_NEW_MESSAGES_EXIST
	/*
	PROCEDURE G$_DO_NEW_MESSAGES_EXIST IS
  al_id            ALERT;
  al_button        NUMBER;
--
  dummy            VARCHAR2(1)  := NULL;
  last_notify_time VARCHAR2(10) := NULL;
  last_msg_time    VARCHAR2(10) := NULL;
  todo_time        VARCHAR2(10) := NULL;
--
  CURSOR MSG_CURSOR1 IS
    SELECT 'X'
      FROM GURTKLR
     WHERE GURTKLR_USER_ID = USER
       AND GURTKLR_STATUS = 'P'
       AND TRUNC(GURTKLR_TODO_DATE) <= TRUNC(SYSDATE)
       AND (GURTKLR_TODO_TIME IS NULL
        OR  GURTKLR_TODO_TIME <= TO_NUMBER(TO_CHAR(SYSDATE,'HH24MI')))
       AND ROWNUM = 1;
--
  CURSOR MSG_CURSOR2 IS
    SELECT MAX(TO_CHAR(GURTKLR_ACTIVITY_DATE,'HH24MI'))
      FROM GURTKLR
     WHERE GURTKLR_USER_ID = USER
       AND GURTKLR_STATUS = 'P'
       AND TRUNC(GURTKLR_TODO_DATE) <= TRUNC(SYSDATE)
       AND ((TRUNC(GURTKLR_ACTIVITY_DATE) = TRUNC(SYSDATE)
       AND   TO_NUMBER(TO_CHAR(GURTKLR_ACTIVITY_DATE,'HH24MI')) > TO_NUMBER(last_notify_time))
       AND  (GURTKLR_TODO_TIME IS NULL
        OR   GURTKLR_TODO_TIME <= TO_NUMBER(TO_CHAR(SYSDATE,'HH24MI'))));
--
BEGIN
--sq
-- Added this return to disable the functionality of this routine until
-- the alert/call_form bug is fixed in 6.x
  RETURN;
--sq
--
  IF NAME_IN('SYSTEM.CURRENT_FORM') IN ('GUAINIT','GUAMESG') THEN
    RETURN;
  END IF;
--
  DEFAULT_VALUE('','GLOBAL.LAST_NOTIFY_TIME');
  last_notify_time := NAME_IN('GLOBAL.LAST_NOTIFY_TIME');
--
-- check if the user been notified at least once
--
  IF last_notify_time IS NULL THEN
    OPEN MSG_CURSOR1;
    FETCH MSG_CURSOR1 INTO dummy;
    IF MSG_CURSOR1%NOTFOUND THEN
      CLOSE MSG_CURSOR1;
      RETURN;
    END IF;
    CLOSE MSG_CURSOR1;
--
-- check if the latest message is after the last notification
--
  ELSE
    OPEN MSG_CURSOR2;
    FETCH MSG_CURSOR2 INTO last_msg_time;
    IF MSG_CURSOR2%NOTFOUND THEN
      CLOSE MSG_CURSOR2;
      RETURN;
    END IF;
    CLOSE MSG_CURSOR2;
--
-- Test if last message time is less than last notification.
--
    IF last_msg_time IS NULL OR
       TO_DATE(last_msg_time,'HH24MI') < TO_DATE(last_notify_time,'HH24MI') THEN
      RETURN;
    END IF;
  END IF;
--
  COPY(TO_CHAR(SYSDATE,'HH24MI'),'GLOBAL.LAST_NOTIFY_TIME');
--
-- set the icon
--
-- show the alert
--
  al_id := FIND_ALERT('G$_PIPE_MESSAGE_ALERT');
  IF NOT ID_NULL(al_id) THEN
    SET_ALERT_PROPERTY(al_id,ALERT_MESSAGE_TEXT,G$_NLS.Get('GOQRPLS-0023','LIB','You have new message(s). View now?'));
    al_button := SHOW_ALERT(al_id); 
--
-- if yes button is pressed, call message form
--
    IF al_button = ALERT_BUTTON1 THEN
--sq 
-- Add this next line to solve problem with forms crashing after the alert.
--
      SET_WINDOW_PROPERTY('MAIN_WINDOW',TITLE,'ALERT TEST');
--sq
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
      G$_SECURED_FORM_CALL(USER,'GUAMESG','');
    END IF;
  END IF;
END;
	*/
	/* <p>
/* </p>
		*/
		public void gDoNewMessagesExist()
		{
			int rowCount = 0;
			AlertDescriptor alId= null;
			NNumber alButton= NNumber.getNull();
			// 
			NString dummy = NString.getNull();
			NString lastNotifyTime = NString.getNull();
			NString lastMsgTime = NString.getNull();
			NString todoTime = NString.getNull();
			String sqlmsgCursor1 = "SELECT 'X' " +
	" FROM GURTKLR " +
	" WHERE GURTKLR_USER_ID = USER AND GURTKLR_STATUS = 'P' AND TRUNC(GURTKLR_TODO_DATE) <= TRUNC(SYSDATE) AND (GURTKLR_TODO_TIME IS NULL OR GURTKLR_TODO_TIME <= TO_NUMBER(TO_CHAR(SYSDATE, 'HH24MI'))) AND ROWNUM = 1 ";
			DataCursor msgCursor1 = new DataCursor(sqlmsgCursor1);
			String sqlmsgCursor2 = "SELECT MAX(TO_CHAR(GURTKLR_ACTIVITY_DATE, 'HH24MI')) " +
	" FROM GURTKLR " +
	" WHERE GURTKLR_USER_ID = USER AND GURTKLR_STATUS = 'P' AND TRUNC(GURTKLR_TODO_DATE) <= TRUNC(SYSDATE) AND ((TRUNC(GURTKLR_ACTIVITY_DATE) = TRUNC(SYSDATE) AND TO_NUMBER(TO_CHAR(GURTKLR_ACTIVITY_DATE, 'HH24MI')) > TO_NUMBER(:P_LAST_NOTIFY_TIME)) AND (GURTKLR_TODO_TIME IS NULL OR GURTKLR_TODO_TIME <= TO_NUMBER(TO_CHAR(SYSDATE, 'HH24MI')))) ";
			DataCursor msgCursor2 = new DataCursor(sqlmsgCursor2);
			try {
				// sq
				//  Added this return to disable the functionality of this routine until
				//  the alert/call_form bug is fixed in 6.x
				if (1 == 1)
					return ;
				// sq
				// 
				
				// 
				setDefaultValue("", "GLOBAL.LAST_NOTIFY_TIME");
				lastNotifyTime = getNameIn("GLOBAL.LAST_NOTIFY_TIME");
				// 
				//  check if the user been notified at least once
				// 
				if ( lastNotifyTime.isNull() )
				{
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable msgCursor1.
					msgCursor1.open();
					ResultSet msgCursor1Results = msgCursor1.fetchInto();
					if ( msgCursor1Results != null ) {
						dummy = msgCursor1Results.getStr(0);
					}
					if ( msgCursor1.notFound() )
					{
						msgCursor1.close();
						return ;
					}
					msgCursor1.close();
				}
				else {
					//Setting query parameters
					msgCursor2.addParameter("P_LAST_NOTIFY_TIME", lastNotifyTime);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable msgCursor2.
					msgCursor2.open();
					ResultSet msgCursor2Results = msgCursor2.fetchInto();
					if ( msgCursor2Results != null ) {
						lastMsgTime = msgCursor2Results.getStr(0);
					}
					if ( msgCursor2.notFound() )
					{
						msgCursor2.close();
						return ;
					}
					msgCursor2.close();
					// 
					//  Test if last message time is less than last notification.
					// 
					if ( lastMsgTime.isNull() || toDate(lastMsgTime, "HH24MI").lesser(toDate(lastNotifyTime, "HH24MI")) )
					{
						return ;
					}
				}
				// 
				copy(toChar(NDate.getNow(), "HH24MI"),"GLOBAL.LAST_NOTIFY_TIME");
				// 
				//  set the icon
				// 
				//  show the alert
				// 
				alId = findAlert("G$_PIPE_MESSAGE_ALERT");
				if ( !(alId == null) )
				{
					setAlertMessageText(alId, GNls.Fget(toStr("GOQRPLS-0023"), toStr("LIB"), toStr("You have new message(s). View now?")));
					alButton = toNumber(showAlert(alId));
					// 
					//  if yes button is pressed, call message form
					// 
					if ( alButton.equals(MessageServices.BUTTON1) )
					{
						// sq 
						//  Add this next line to solve problem with forms crashing after the alert.
						// 
						setWindowTitle("MAIN_WINDOW", "ALERT TEST");
						// sq
						executeAction("G$_REVOKE_ACCESS");
						gCheckFailure();
						gSecuredFormCall(getUser(), toStr("GUAMESG"), toStr(""));
					}
				}
				}finally{
					msgCursor1.close();
					msgCursor2.close();
				}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_DISPLAY_LOV
	/*
	PROCEDURE G$_DISPLAY_LOV(item_name_in     IN VARCHAR2,
                         list_name_IN     IN VARCHAR2,
                         SHOULD_I_COPY_IT IN VARCHAR2 DEFAULT 'Y') IS
<multilinecomment>
PARAMETERS:
  ITEM_NAME - if null, the cursor field will be used.
  LIST_NAME - if null, the lov associated with the item will be used.
  SHOULD_I_COPY_IT - determines whether the procedure automatically 
                     attempts to copy a selected value into the
                     field in the invoking form.
</multilinecomment>
  item_x       PLS_INTEGER := 0;
  item_y       PLS_INTEGER := 0;
  win_x        PLS_INTEGER := 0;
  win_y        PLS_INTEGER := 0;
  win_w        PLS_INTEGER := 0;  
  win_h        PLS_INTEGER := 0;  
  mid_win_w    PLS_INTEGER := 0;
  mid_win_h    PLS_INTEGER := 0;
  lov_x        PLS_INTEGER := 0;
  lov_y        PLS_INTEGER := 0;
  lov_w        PLS_INTEGER := 0;
  lov_h        PLS_INTEGER := 0;
  view_x       PLS_INTEGER := 0;
  view_y       PLS_INTEGER := 0;
  viewport_x   PLS_INTEGER := 0;
  viewport_y   PLS_INTEGER := 0;
--
  item_name    VARCHAR2(80);
  list_name    VARCHAR2(80);
  lov_id       LOV;
  rg_name      VARCHAR2(80);
  rg_id        RECORDGROUP;
  rg_status    PLS_INTEGER;
  main_win_id  WINDOW;
  canvas_name  VARCHAR2(50);
BEGIN  
--
-- Get the item name and type
--
  item_name := NVL(item_name_in, NAME_IN('SYSTEM.CURSOR_ITEM'));
  IF GET_ITEM_PROPERTY(item_name, ITEM_TYPE) <> 'TEXT ITEM' THEN
  	MESSAGE(G$_NLS.Get('GOQRPLS-0018','LIB','*ERROR* This function is only valid for text items.'));
    RETURN;
  END IF;
--
-- Check to see if the item is protected and if so, don't launch the list.
--
  IF (GET_ITEM_PROPERTY(item_name,UPDATEABLE) = 'TRUE')  OR 
     (GET_ITEM_PROPERTY(item_name,UPDATE_NULL) = 'TRUE' AND
      NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL)            OR
     (NAME_IN('SYSTEM.MODE') <> 'NORMAL')                OR
     (NAME_IN('SYSTEM.RECORD_STATUS') IN ('NEW','INSERT')) THEN 
    NULL;
  ELSE
    MESSAGE(G$_NLS.Get('GOQRPLS-0019','LIB','*ERROR* Item is protected against update.'));              
    RETURN;
  END IF;
--
-- Get the original LOV name, since it might have changed when in searh mode. 
--
  list_name := NVL(list_name_in, GET_ITEM_PROPERTY(item_name, LOV_NAME));
  IF list_name IS NULL THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0020','LIB','*ERROR* LOV does not exist for this item'));
    RETURN;
  END IF;
--
-- Obtain the id for the LOV and use that to get the record group.
--
  lov_id := FIND_LOV(list_name);
  rg_name := GET_LOV_PROPERTY(lov_id, GROUP_NAME);
  rg_id := FIND_GROUP(rg_name);
--
-- Populate the record group and use the returned status to determine whether 
-- or not any records exist.  If no records exist, issue warning and return.
--
  IF list_name <> 'G$_SEARCH_LOV' THEN
    rg_status := POPULATE_GROUP(rg_id);
    IF rg_status <> 0 THEN
      IF rg_status = 1403 THEN
        MESSAGE(G$_NLS.Get('GOQRPLS-0021','LIB','*WARNING* No records exist to query LOV.'));
      ELSE
        MESSAGE(G$_NLS.Get('GOQRPLS-0022','LIB',
	         '*ERROR* LOV (%01%) generated Oracle error number %02%.',list_name,TO_CHAR(rg_status)));
      END IF;
      RETURN;
    END IF;
  END IF;
--
-- Get main window id
--
  main_win_id := FIND_WINDOW('MAIN_WINDOW'); 
  win_x := TO_NUMBER(GET_WINDOW_PROPERTY(main_win_id, X_POS));
  win_y := TO_NUMBER(GET_WINDOW_PROPERTY(main_win_id, Y_POS));
  win_w := TO_NUMBER(GET_WINDOW_PROPERTY(main_win_id, WIDTH));
  win_h := TO_NUMBER(GET_WINDOW_PROPERTY(main_win_id, HEIGHT));
	mid_win_w := win_w / 2;
	mid_win_h := win_h / 2;
--
-- Get item properties
--
  COPY('','GLOBAL.VALUE');
  item_x := GET_ITEM_PROPERTY(item_name, X_POS);     
  item_y := GET_ITEM_PROPERTY(item_name, Y_POS);           
--
  canvas_name := GET_ITEM_PROPERTY(item_name, ITEM_CANVAS);
  viewport_x := TO_NUMBER(GET_VIEW_PROPERTY(canvas_name, VIEWPORT_X_POS));
  viewport_y := TO_NUMBER(GET_VIEW_PROPERTY(canvas_name, VIEWPORT_Y_POS));
--
  view_x := TO_NUMBER(GET_WINDOW_PROPERTY(GET_VIEW_PROPERTY(canvas_name, WINDOW_NAME),X_POS));
  view_y := TO_NUMBER(GET_WINDOW_PROPERTY(GET_VIEW_PROPERTY(canvas_name, WINDOW_NAME),Y_POS));
--
-- Set lov properies
--
  lov_w := GET_LOV_PROPERTY(list_name, WIDTH);
  lov_h := GET_LOV_PROPERTY(list_name, HEIGHT);
  IF lov_w < mid_win_w THEN
    lov_w := mid_win_w;  	
  END IF;	
  IF lov_h < mid_win_h THEN
    lov_h := mid_win_h;  	
  END IF;
--
  lov_x := 0;
  lov_y := 13;
  IF item_x + view_x + viewport_x < mid_win_w THEN
    lov_x := lov_x + win_w - lov_w;
  END IF;
  IF item_y + view_y + viewport_y < mid_win_h THEN
  	lov_y := lov_y + win_h - lov_h;
  END IF;	
--
  SET_LOV_PROPERTY(list_name, LOV_SIZE, mid_win_w, mid_win_h);
--
-- Display LOV.
--
  COPY('N','GLOBAL.VALUE_SELECTED');
--
  IF SHOW_LOV(list_name, lov_x, lov_y) THEN
    IF SHOULD_I_COPY_IT = 'Y' THEN
      COPY('Y','GLOBAL.VALUE_SELECTED');
--
      IF list_name <> 'G$_SEARCH_LOV' THEN
        EXECUTE_TRIGGER('LIST_VALUES_COPY'); 
        G$_CHECK_FAILURE;
        COPY('','GLOBAL.VALUE');
--
-- Set to 'Y' so that the Search Mode LOV will not appear 
-- after leaving the original LOV.
--
        G$_SEARCH.USED_LOV(TRUE);
        DO_KEY('NEXT_ITEM');
      END IF;
    END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itemNameIn
		* @param listNameIn
		*/
		public void gDisplayLov(NString itemNameIn, NString listNameIn) {
			gDisplayLov(itemNameIn, listNameIn, toStr("Y"));
		}

/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itemNameIn
		* @param listNameIn
		* @param shouldICopyIt
		*/
		public void gDisplayLov(NString itemNameIn, NString listNameIn, NString shouldICopyIt)
		{
			// PARAMETERS:
			// ITEM_NAME - if null, the cursor field will be used.
			// LIST_NAME - if null, the lov associated with the item will be used.
			// SHOULD_I_COPY_IT - determines whether the procedure automatically
			// attempts to copy a selected value into the
			// field in the invoking form.
			NInteger itemX = toInt(0);
			NInteger itemY = toInt(0);
			NInteger winX = toInt(0);
			NInteger winY = toInt(0);
			NInteger winW = toInt(0);
			NInteger winH = toInt(0);
			NInteger midWinW = toInt(0);
			NInteger midWinH = toInt(0);
			NInteger lovX = toInt(0);
			NInteger lovY = toInt(0);
			NInteger lovW = toInt(0);
			NInteger lovH = toInt(0);
			NInteger viewX = toInt(0);
			NInteger viewY = toInt(0);
			NInteger viewportX = toInt(0);
			NInteger viewportY = toInt(0);
			// 
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			LovDescriptor lovId= null;
			NString rgName= NString.getNull();
			ValueSet rgId= null;
			NInteger rgStatus= NInteger.getNull();
			WindowDescriptor mainWinId= null;
			NString canvasName= NString.getNull();
			// 
			//  Get the item name and type
			// 
			itemName = isNull(itemNameIn, getCursorItem());
			if ( getItemType(itemName).notEquals("TEXT ITEM") && getItemType(itemName).notEquals("TEXTITEM") )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0018"), toStr("LIB"), toStr("*ERROR* This function is only valid for text items.")));
				return ;
			}
			// 
			//  Check to see if the item is protected and if so, don't launch the list.
			// 
			// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
			if ( (getItemUpdateAllowed(itemName).equals("TRUE"))
					// MORPHIS TODO: Implement support for this
					//|| (SupportClasses.FORMS40.GetItemProperty(itemName, SupportClasses.Property.UPDATE_NULL).equals("TRUE") && SupportClasses.AppContext.CursorValue.isNull())
					|| (getMode().notEquals("NORMAL")) || (in(getRecordStatus(), "NEW", "INSERT").getValue()) )
			{
				// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
			}
			else {
				errorMessage(GNls.Fget(toStr("GOQRPLS-0019"), toStr("LIB"), toStr("*ERROR* Item is protected against update.")));
				return ;
			}
			// 
			//  Get the original LOV name, since it might have changed when in searh mode. 
			// 
			listName = isNull(listNameIn, getItemLovName(itemName));
			if ( listName.isNull() )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0020"), toStr("LIB"), toStr("*ERROR* LOV does not exist for this item")));
				return ;
			}
			// 
			//  Obtain the id for the LOV and use that to get the record group.
			// 
			lovId = findLov(listName);
			rgName = toStr(getLovGroupName(lovId));
			rgId = findGroup(rgName);
			//MORPHIS TODO: Para resolver o problema da subtask:224001 do form GSAVPDI, valor do elemento nunca era apagado
			rgId.setCriteria(null);
			// 
			//  Populate the record group and use the returned status to determine whether 
			//  or not any records exist.  If no records exist, issue warning and return.
			// 
			if ( listName.notEquals("G$_SEARCH_LOV") )
			{
				rgStatus = toInt(populateGroup(rgId));
				if ( rgStatus.notEquals(0) )
				{
					if ( rgStatus.equals(1403) )
					{
						warningMessage(GNls.Fget(toStr("GOQRPLS-0021"), toStr("LIB"), toStr("*WARNING* No records exist to query LOV.")));
					}
					else {
						errorMessage(GNls.Fget(toStr("GOQRPLS-0022"), toStr("LIB"), toStr("*ERROR* LOV (%01%) generated Oracle error number %02%."), listName, toChar(rgStatus)));
					}
					return ;
				}
			}
			// 
			//  Get main window id
			// 
			mainWinId = findWindow("MAIN_WINDOW");
			// F2J_TO_REMOVE : The property "WINDOW's X_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS".
			//			winX = toNumber(SupportClasses.FORMS4W.GetWindowProperty(mainWinId, SupportClasses.Property.X_POS));
			this.getLogger().trace(this, "// F2J_TO_REMOVE : The property 'WINDOW's X_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS'.");
			
			
			// F2J_NOT_SUPPORTED : The property "WINDOW's Y_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS".
			//			winY = toNumber(SupportClasses.FORMS4W.GetWindowProperty(mainWinId, SupportClasses.Property.Y_POS));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's Y_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS'.");
			
			
			// F2J_NOT_SUPPORTED : The property "WINDOW's WIDTH" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin6".
			//			winW = toNumber(SupportClasses.FORMS4W.GetWindowProperty(mainWinId, SupportClasses.Property.WIDTH));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's WIDTH' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin6'.");
			
			
			// F2J_NOT_SUPPORTED : The property "WINDOW's HEIGHT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin6".
			//			winH = toNumber(SupportClasses.FORMS4W.GetWindowProperty(mainWinId, SupportClasses.Property.HEIGHT));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's HEIGHT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin6'.");
			
			
//			midWinW = winW.divide(2);
//			midWinH = winH.divide(2);
			// 
			//  Get item properties
			// 
			copy("","GLOBAL.VALUE");
			itemX = toInt(getItemXPos(itemName));
			itemY = toInt(getItemYPos(itemName));
			// 
			canvasName = getItemCanvas(itemName);
			// F2J_NOT_SUPPORTED : The property "VIEW's VIEWPORT_X_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin16".
			//			viewportX = toNumber(SupportClasses.FORMS4W.GetViewProperty(canvasName, SupportClasses.Property.VIEWPORT_X_POS));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'VIEW's VIEWPORT_X_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin16'.");
			
			
			// F2J_NOT_SUPPORTED : The property "VIEW's VIEWPORT_Y_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin16".
			//			viewportY = toNumber(SupportClasses.FORMS4W.GetViewProperty(canvasName, SupportClasses.Property.VIEWPORT_Y_POS));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'VIEW's VIEWPORT_Y_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin16'.");
			
			
			// 
			// F2J_TO_REMOVE : The property "WINDOW's X_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS".
			//			viewX = toNumber(SupportClasses.FORMS4W.GetWindowProperty(getViewWindowName(canvasName), SupportClasses.Property.X_POS));
			this.getLogger().trace(this, "// F2J_TO_REMOVE : The property 'WINDOW's X_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS'.");
			
			
			// F2J_NOT_SUPPORTED : The property "WINDOW's Y_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS".
			//			viewY = toNumber(SupportClasses.FORMS4W.GetWindowProperty(getViewWindowName(canvasName), SupportClasses.Property.Y_POS));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's Y_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS'.");
			
			
			// 
			//  Set lov properies
			// 
			// F2J_NOT_SUPPORTED : The property "LOV's WIDTH" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin17".
			//			lovW = toInt(SupportClasses.FORMS4W.GetLovProperty(listName, SupportClasses.Property.WIDTH));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'LOV's WIDTH' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin17'.");
			
			
			// F2J_NOT_SUPPORTED : The property "LOV's HEIGHT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin17".
			//			lovH = toInt(SupportClasses.FORMS4W.GetLovProperty(listName, SupportClasses.Property.HEIGHT));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'LOV's HEIGHT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin17'.");
			
			
			if ( lovW.lesser(midWinW) )
			{
				lovW = midWinW;
			}
			if ( lovH.lesser(midWinH) )
			{
				lovH = midWinH;
			}
			// 
			lovX = toInt(0);
			lovY = toInt(13);
			if ( itemX.add(viewX).add(viewportX).lesser(midWinW) )
			{
				lovX = lovX.add(winW).subtract(lovW);
			}
			if ( itemY.add(viewY).add(viewportY).lesser(midWinH) )
			{
				lovY = lovY.add(winH).subtract(lovH);
			}
			// 
			// F2J_NOT_SUPPORTED : The property "LOV's LOV_SIZE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin18".
			//			SupportClasses.FORMS4W.SetLovProperty(listName, SupportClasses.Constants.LOV_SIZE, midWinW, midWinH);
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'LOV's LOV_SIZE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin18'.");
			
			
			// 
			//  Display LOV.
			// 
			copy("N","GLOBAL.VALUE_SELECTED");
			// 
			//if ( showLov(listName, lovX, lovY) )
			if ( showLov(listName).isTrue() )
			{
				if ( shouldICopyIt.equals("Y") )
				{
					
					copy("Y","GLOBAL.VALUE_SELECTED");
					// 
					if ( listName.notEquals("G$_SEARCH_LOV") )
					{
						executeAction("LIST_VALUES_COPY");
						gCheckFailure();
						copy("","GLOBAL.VALUE");
						// 
						//  Set to 'Y' so that the Search Mode LOV will not appear 
						//  after leaving the original LOV.
						// 
						getGSearch().usedLov(toBool(NBool.True));
						executeAction(KeyFunction.NEXT_ITEM);
						doNavigation();
					}
				}
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_DISPLAY_IMAGE
	/*
	PROCEDURE G$_DISPLAY_IMAGE IS
  lv_img_dir       VARCHAR2(2000) := '';
  lv_img_dir_hold  VARCHAR2(2000) := '';
-- -- --
-- values for this are:
-- 3,7 and it will get I appended into name such that it works similar to way before 7.4
-- 1,9 for those that want the value in the ID field to be equivalent to file prefix
  lv_guaimge_id_range        VARCHAR2(03) := '';
-- -- --
  lv_guaimge_extension       VARCHAR2(4) := '';
-- --
BEGIN
-- -- --
-- -- --
-- -- -- ID Range
	DEFAULT_VALUE('XX','GLOBAL.BAN_GUAIMGE_ID_RANGE');
  IF NAME_IN('GLOBAL.BAN_GUAIMGE_ID_RANGE') = 'XX' THEN
    tool_env.getvar('BAN_GUAIMGE_ID_RANGE', lv_guaimge_id_range);
    IF lv_guaimge_id_range IS NULL THEN
    	DEFAULT_VALUE('N','GLOBAL.BAN_GUAIMGE_DUAL_SEARCH');
      lv_guaimge_id_range := '3,7';
    ELSE
  	  DEFAULT_VALUE('Y','GLOBAL.BAN_GUAIMGE_DUAL_SEARCH');
    END IF;
    IF lv_guaimge_id_range NOT IN ('3,7','1,9') THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0013','LIB','*WARNING* Configuration for ID field is invalid.  Cannot display Image.'));
      RETURN;
    END IF;
    COPY(lv_guaimge_id_range,'GLOBAL.BAN_GUAIMGE_ID_RANGE');
  END IF;  	
-- -- --
-- -- --
-- -- --
-- -- -- Image extension
	DEFAULT_VALUE('XX','GLOBAL.BAN_GUAIMGE_EXTENSION');
  IF NAME_IN('GLOBAL.BAN_GUAIMGE_EXTENSION') = 'XX' THEN
    tool_env.getvar('BAN_GUAIMGE_EXTENSION', lv_guaimge_extension);
    IF lv_guaimge_extension IS NULL THEN
      lv_guaimge_extension := 'BMP';
    END IF;
    IF UPPER(lv_guaimge_extension) NOT IN ('BMP','GIF','JPG','TIF') THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0014','LIB','*WARNING* Configuration for File Extension is invalid.  Cannot display Image.'));
      RETURN;
    END IF;    
    COPY(UPPER(lv_guaimge_extension),'GLOBAL.BAN_GUAIMGE_EXTENSION');
  END IF;
-- -- --
-- -- --
  COPY(GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURRENT_BLOCK')||'.'||NAME_IN('SYSTEM.CURRENT_ITEM'), DATATYPE),'GLOBAL.CURRENT_FLD_TYPE');
  COPY(GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURRENT_BLOCK')||'.'||NAME_IN('SYSTEM.CURRENT_ITEM'), MAX_LENGTH),'GLOBAL.CURRENT_FLD_LEN');
--
  IF NAME_IN('GLOBAL.CURRENT_FLD_TYPE') != 'CHAR' OR
     NAME_IN('GLOBAL.CURRENT_FLD_LEN') != 9 THEN
    BELL;
    MESSAGE(G$_NLS.Get('GOQRPLS-0015','LIB','*WARNING* Option is only valid in an ID field.'), ACKNOWLEDGE);
    RETURN;
  END IF;
--
  IF NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL THEN
    BELL;
    MESSAGE(G$_NLS.Get('GOQRPLS-0016','LIB','*WARNING* Option is only valid if ID is not null.'), ACKNOWLEDGE);
    RETURN;
  END IF;
--
  G$_GET_RW_ATTRIBUTES;
--
  lv_img_dir      := G$_GET_UPRF_IMAGE_DIR;
  lv_img_dir_hold := lv_img_dir;
  IF NAME_IN('GLOBAL.BAN_GUAIMGE_ID_RANGE') = '3,7' THEN
  	lv_img_dir    := lv_img_dir || 'I';
  END IF;
  IF lv_img_dir IS NULL THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0017','LIB','*WARNING* Image file for this ID does not exist'));
    RETURN;
  END IF;
--
  COPY(lv_img_dir || SUBSTR(NAME_IN('SYSTEM.CURSOR_VALUE'),
                     to_number(substr(NAME_IN('GLOBAL.BAN_GUAIMGE_ID_RANGE'),1,1)),
                     to_number(substr(NAME_IN('GLOBAL.BAN_GUAIMGE_ID_RANGE'),3,1))) ||
                     '.'||NAME_IN('GLOBAL.BAN_GUAIMGE_EXTENSION'),'GLOBAL.IMAGE_NAME');
-- -- --
-- -- --
-- At this point GLOBAL.BAN_GUAIMGE_DUAL_SEARCH, if indicating a dual search; the valule of the
-- gloabl will change from Y to the other image path and file name to look-up.
-- Otherwise the value remains N and will be read in for GUAIMGE when-new-form-instance.
  IF NAME_IN('GLOBAL.BAN_GUAIMGE_DUAL_SEARCH') = 'Y' THEN
    IF NAME_IN('GLOBAL.BAN_GUAIMGE_ID_RANGE') = '3,7' THEN
      lv_guaimge_id_range := '1,9';
    ELSE
      lv_guaimge_id_range := '3,7';
      lv_img_dir_hold := lv_img_dir_hold || 'I';
    END IF;
    COPY(lv_img_dir_hold || SUBSTR(NAME_IN('SYSTEM.CURSOR_VALUE'),
                            to_number(substr(lv_guaimge_id_range,1,1)),
                            to_number(substr(lv_guaimge_id_range,3,1))) ||
                            '.'||NAME_IN('GLOBAL.BAN_GUAIMGE_EXTENSION'),'GLOBAL.BAN_GUAIMGE_DUAL_SEARCH');    
  END IF;
-- -- --
-- -- --             
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
  G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),'GUAIMGE','QUERY_NOHIDE');
-- -- --
  IF NAME_IN('GLOBAL.BAN_GUAIMGE_DUAL_SEARCH') <> 'N' THEN
    COPY('Y','GLOBAL.BAN_GUAIMGE_DUAL_SEARCH');    
  END IF;
-- -- --
END;
	*/
	/* <p>
/* </p>
		*/
		public void gDisplayImage()
		{
			NString lvImgDir = toStr("");
			NString lvImgDirHold = toStr("");
			//  -- --
			//  values for this are:
			//  3,7 and it will get I appended into name such that it works similar to way before 7.4
			//  1,9 for those that want the value in the ID field to be equivalent to file prefix
			NString lvGuaimgeIdRange = toStr("");
			//  -- --
			NString lvGuaimgeExtension = toStr("");
			//  -- --
			//  -- --
			//  -- -- ID Range
			setDefaultValue("XX", "GLOBAL.BAN_GUAIMGE_ID_RANGE");
			if ( getNameIn("GLOBAL.BAN_GUAIMGE_ID_RANGE").equals("XX") )
			{
				lvGuaimgeIdRange = TaskServices.getEnvVar("BAN_GUAIMGE_ID_RANGE");
				if ( lvGuaimgeIdRange.isNull() )
				{
					setDefaultValue("N", "GLOBAL.BAN_GUAIMGE_DUAL_SEARCH");
					lvGuaimgeIdRange = toStr("3,7");
				}
				else {
					setDefaultValue("Y", "GLOBAL.BAN_GUAIMGE_DUAL_SEARCH");
				}
				if ( !in(lvGuaimgeIdRange, "3,7", "1,9").getValue() )
				{
					warningMessage(GNls.Fget(toStr("GOQRPLS-0013"), toStr("LIB"), toStr("*WARNING* Configuration for ID field is invalid.  Cannot display Image.")));
					return ;
				}
				copy(lvGuaimgeIdRange,"GLOBAL.BAN_GUAIMGE_ID_RANGE");
			}
			//  -- --
			//  -- --
			//  -- --
			//  -- -- Image extension
			setDefaultValue("XX", "GLOBAL.BAN_GUAIMGE_EXTENSION");
			if ( getNameIn("GLOBAL.BAN_GUAIMGE_EXTENSION").equals("XX") )
			{
				lvGuaimgeExtension = TaskServices.getEnvVar("BAN_GUAIMGE_EXTENSION");
				if ( lvGuaimgeExtension.isNull() )
				{
					lvGuaimgeExtension = toStr("BMP");
				}
				if ( !in(upper(lvGuaimgeExtension), "BMP", "GIF", "JPG", "TIF").getValue() )
				{
					warningMessage(GNls.Fget(toStr("GOQRPLS-0014"), toStr("LIB"), toStr("*WARNING* Configuration for File Extension is invalid.  Cannot display Image.")));
					return ;
				}
				copy(upper(lvGuaimgeExtension),"GLOBAL.BAN_GUAIMGE_EXTENSION");
			}
			//  -- --
			//  -- --
			NString currentItem = getCurrentBlock().append(".").append(getCurrentItem());
			if (getItemType(currentItem).equals("BUTTON"))
			{
				currentItem = toStr(getCurrentTask().findNextNavigableItem(findItem(currentItem), -1, false, new Ref<Boolean>(false)).getFullId());
			}
			copy(getItemDataType(currentItem),"GLOBAL.CURRENT_FLD_TYPE");
			copy(getItemMaxLength(currentItem),"GLOBAL.CURRENT_FLD_LEN");
			// 
			if ( getNameIn("GLOBAL.CURRENT_FLD_TYPE").notEquals("STRING") || getNameIn("GLOBAL.CURRENT_FLD_LEN").notEquals(9) )
			{
				// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin19".
				//				SupportClasses.SQLFORMS.Bell();
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin19'.");
				
				
				warningMessage(GNls.Fget(toStr("GOQRPLS-0015"), toStr("LIB"), toStr("*WARNING* Option is only valid in an ID field.")), OutputMessageUserResponse.ACKNOWLEDGE);
				return ;
			}
			// 
			NString cursorValue = getNameIn(currentItem);
			if ( cursorValue.isNull() )
			{
				// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
				// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin19".
				//				SupportClasses.SQLFORMS.Bell();
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin19'.");
				
				
				warningMessage(GNls.Fget(toStr("GOQRPLS-0016"), toStr("LIB"), toStr("*WARNING* Option is only valid if ID is not null.")), OutputMessageUserResponse.ACKNOWLEDGE);
				return ;
			}
			// 
			//gGetRwAttributes();
			//
			//Morphis: now from config.properties 
			lvImgDir = TaskServices.getEnvVar("BAN_GUAIMGE_PATH"); //gGetUprfImageDir();
			lvImgDirHold = lvImgDir;
			if ( getNameIn("GLOBAL.BAN_GUAIMGE_ID_RANGE").equals("3,7") )
			{
				lvImgDir = lvImgDir.append("I");
			}
			if ( lvImgDir.isNull() )
			{
				warningMessage(GNls.Fget(toStr("GOQRPLS-0017"), toStr("LIB"), toStr("*WARNING* Image file for this ID does not exist")));
				return ;
			}
			// 
			copy(lvImgDir.append(substring(cursorValue, toNumber(substring(getNameIn("GLOBAL.BAN_GUAIMGE_ID_RANGE"), toInt(1), toInt(1))), toNumber(substring(getNameIn("GLOBAL.BAN_GUAIMGE_ID_RANGE"), toInt(3), toInt(1))))).append(".").append(getNameIn("GLOBAL.BAN_GUAIMGE_EXTENSION")),"GLOBAL.IMAGE_NAME");
			//  -- --
			//  -- --
			//  At this point GLOBAL.BAN_GUAIMGE_DUAL_SEARCH, if indicating a dual search; the valule of the
			//  gloabl will change from Y to the other image path and file name to look-up.
			//  Otherwise the value remains N and will be read in for GUAIMGE when-new-form-instance.
			if ( getNameIn("GLOBAL.BAN_GUAIMGE_DUAL_SEARCH").equals("Y") )
			{
				if ( getNameIn("GLOBAL.BAN_GUAIMGE_ID_RANGE").equals("3,7") )
				{
					lvGuaimgeIdRange = toStr("1,9");
				}
				else {
					lvGuaimgeIdRange = toStr("3,7");
					lvImgDirHold = lvImgDirHold.append("I");
				}
				copy(lvImgDirHold.append(substring(getCursorValue(), toNumber(substring(lvGuaimgeIdRange, toInt(1), toInt(1))), toNumber(substring(lvGuaimgeIdRange, toInt(3), toInt(1))))).append(".").append(getNameIn("GLOBAL.BAN_GUAIMGE_EXTENSION")),"GLOBAL.BAN_GUAIMGE_DUAL_SEARCH");
			}
			//  -- --
			//  -- --             
			executeAction("G$_REVOKE_ACCESS");
			gCheckFailure();
			gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), toStr("GUAIMGE"), toStr("QUERY_NOHIDE"));
			//  -- --
			if ( getNameIn("GLOBAL.BAN_GUAIMGE_DUAL_SEARCH").notEquals("N") )
			{
				copy("Y","GLOBAL.BAN_GUAIMGE_DUAL_SEARCH");
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_DISPLAY_ERR_MSG
	/*
	PROCEDURE G$_DISPLAY_ERR_MSG (p_ERROR_MESSAGE VARCHAR2, p_DO_ROLLBACK VARCHAR2 DEFAULT 'Y') IS
  lv_err_text  VARCHAR2(4000) := '';
  lv_pl_id     PARAMLIST; 
  lv_pl_name   VARCHAR2(20) := 'ERROR_MESSAGE';  
BEGIN
  lv_pl_id := GET_PARAMETER_LIST(lv_pl_name); 
  IF NOT ID_NULL(lv_pl_id) THEN 
    DESTROY_PARAMETER_LIST(lv_pl_id); 
  END IF;
  lv_pl_id := CREATE_PARAMETER_LIST(lv_pl_name); 
  ADD_PARAMETER(lv_pl_id,'ERR_MSG',TEXT_PARAMETER,'4000'); 
--
  G$_ERRORS.POPULATE_VARIABLES;
  IF SQLCODE = G$_ERRORS.CHECK_POLICY_VIOLATION THEN
    lv_err_text := G$_ERRORS.CHECK_POLICY_MESSAGE;
  ELSE 	
    lv_err_text := gb_common.F_ERR_MSG_REMOVE_DELIM(p_ERROR_MESSAGE);
  END IF;
--
  lv_err_text := REPLACE(lv_err_text,'    ',CHR(10));
  SET_PARAMETER_ATTR(lv_pl_id,'ERR_MSG',TEXT_PARAMETER,lv_err_text);
  ADD_PARAMETER(lv_pl_id,'G$_PREFERENCES',TEXT_PARAMETER,'6'); 
  SET_PARAMETER_ATTR(lv_pl_id,'G$_PREFERENCES',TEXT_PARAMETER,NAME_IN('PARAMETER.G$_PREFERENCES'));
--
  IF NVL(p_DO_ROLLBACK,'Y') = 'Y' THEN
    GB_COMMON.P_ROLLBACK('NO ROLLBACK');
    ISSUE_ROLLBACK('');
  END IF;
--
  G$_SECURED_FORM_CALL_PL(USER,'GUAERRM',lv_pl_id,'QUERY_NOHIDE');
-- --
  G$_NAVIGATION_FRAME.POPULATE_GUROPTM;
  G$_CHECK_FAILURE;  
-- --
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pErrorMessage
		*/
		public void gDisplayErrMsg(NString pErrorMessage) {
			gDisplayErrMsg(pErrorMessage, toStr("Y"));
		}

		
		public void gDisplayErrMsg(String pErrorMessage) {
			gDisplayErrMsg(toStr(pErrorMessage), toStr("Y"));
		}
		
		public void gDisplayErrMsg(NString pErrorMessage, boolean sync) {
			gDisplayErrMsg(pErrorMessage, toStr("Y"), sync);
		}

		
		public void gDisplayErrMsg(String pErrorMessage, boolean sync) {
			gDisplayErrMsg(toStr(pErrorMessage), toStr("Y"), sync);
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pErrorMessage
		* @param pDoRollback
		*/
		
		public void gDisplayErrMsg(NString pErrorMessage, NString pDoRollback)
		{
			gDisplayErrMsg( pErrorMessage,  pDoRollback, true);
		}
		public void gDisplayErrMsg(NString pErrorMessage, NString pDoRollback, boolean sync)
		{
			NString lvErrText = toStr("");
			Hashtable lvPlId= null;
			NString lvPlName = toStr("ERROR_MESSAGE");
			lvPlId = getParameterList(lvPlName);
			if ( !(lvPlId == null) )
			{
				deleteParameterList(lvPlId);
			}
			lvPlId = createParameterList(lvPlName);
			addParameter(lvPlId, "ERR_MSG", "4000");
			// 
			getGErrors().populateVariables();
			if ( errorCode().equals(getGErrors().checkPolicyViolation) )
			{
				lvErrText = getGErrors().checkPolicyMessage;
			}
			else {
				lvErrText = GbCommon.fErrMsgRemoveDelim(pErrorMessage);
			}
			// 
			lvErrText = replace(lvErrText, "    ", chr(10));
			setParameter(lvPlId, "ERR_MSG",  lvErrText);
			addParameter(lvPlId, "G$_PREFERENCES", "6");
			setParameter(lvPlId, "G$_PREFERENCES",  getNameIn("PARAMETER.G$_PREFERENCES"));
			// 
			if ( isNull(pDoRollback, "Y").equals("Y") )
			{
				GbCommon.pRollback(toStr("NO ROLLBACK"));
				issueRollback(DbManager.getSavePointManager().getCurrentSavePoint());
			}
			// 
			//MORPHIS: Workaround to get Messages to show in Status Panel instead of "Notification Panel Form"
			//gSecuredFormCallPl(getUser(), toStr("GUAERRM"), lvPlId, toStr("QUERY_NOHIDE"));
			NString msg = lvErrText.trim().toUpper();
			if (msg.startsWith("*ERROR*") || msg.startsWith("ERROR") ){
				setAlertMessageText("G$_GUAERRM_ALERT", lvErrText);
				showAlert("G$_GUAERRM_ALERT", sync);
			}
			else if (msg.startsWith("*WARNING*") || msg.startsWith("WARNING") ){
				setAlertMessageText("G$_GUAERRM_W_ALERT", lvErrText);
				showAlert("G$_GUAERRM_W_ALERT", sync);
			}
			else {
				lvErrText = toStr("*ERROR* ").append(lvErrText);
				setAlertMessageText("G$_GUAERRM_ALERT", lvErrText);
				showAlert("G$_GUAERRM_ALERT", sync);
			}
			//  --
			getGNavigationFrame().populateGuroptm();
			gCheckFailure();
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_DISPLAY_ALERT
	/*
	FUNCTION G$_DISPLAY_ALERT(ALERT_NAME IN VARCHAR2,
                          MSG_STRING IN VARCHAR2) RETURN NUMBER IS
<multilinecomment>
   This function is to display the alert window to insure that user
   acknowlege the errors. The first paramater 'ALERT_NAME' is optional and
   the default is G$_WARNING_ALERT, the second parameter 'MSG_STRING' will be 
   required which can be a string enclosed in single quotes or as a variable  
   and the return number indicate which alert button that user pressed 
   such as ALERT_BUTTON1, ALERT_BUTTON2  or ALERT_BUTTON3, and depend on
   which the program can be coded for different action . 

   Reference WHEN-BUTTON-PRESSED trigger in GOQOLIB for useage
</multilinecomment>
--
  ALERT_ID         ALERT;
  AL_NAME          VARCHAR2(30);
  ALERT_BUT        NUMBER;
--
BEGIN 
  IF ALERT_NAME IS NULL THEN
    AL_NAME := 'G$_WARNING_ALERT';
  ELSE
    AL_NAME := ALERT_NAME;
  END IF;
--
  ALERT_ID := FIND_ALERT(AL_NAME);
  IF ID_NULL(ALERT_ID) THEN
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  SET_ALERT_PROPERTY(ALERT_ID,ALERT_MESSAGE_TEXT,MSG_STRING);
  ALERT_BUT := SHOW_ALERT(ALERT_ID);
  RETURN (ALERT_BUT);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param alertName
		* @param msgString
		*/
		
		public NNumber gDisplayAlert(NString alertName, NString msgString)
		{
			boolean sync = true;
			if(alertName.isNotNull()){
				AlertDescriptor alertId = findAlert(alertName);
				if(alertId != null && alertId.getButtons().size()<=1)
					sync = false;
			}
			return gDisplayAlert(alertName, msgString, sync);
		}
		public NNumber gDisplayAlert(NString alertName, NString msgString, boolean sync)
		{
			// This function is to display the alert window to insure that user
			// acknowlege the errors. The first paramater 'ALERT_NAME' is optional and
			// the default is G$_WARNING_ALERT, the second parameter 'MSG_STRING' will be
			// required which can be a string enclosed in single quotes or as a variable
			// and the return number indicate which alert button that user pressed
			// such as ALERT_BUTTON1, ALERT_BUTTON2  or ALERT_BUTTON3, and depend on
			// which the program can be coded for different action .
			// Reference WHEN-BUTTON-PRESSED trigger in GOQOLIB for useage
			// 
			AlertDescriptor alertId= null;
			NString alName= NString.getNull();
			NNumber alertBut= NNumber.getNull();
			if ( alertName.isNull() )
			{
				alName = toStr("G$_WARNING_ALERT");
			}
			else {
				alName = alertName;
			}
			// 
			alertId = findAlert(alName);
			if ( (alertId == null) )
			{
				throw new ApplicationException();
			}
			// 
			setAlertMessageText(alertId, msgString);
			alertBut = toNumber(showAlert(alertId, sync));
			return ((alertBut));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_DETERMINE_WIN_NOT_PREV_ACTV
	/*
	FUNCTION G$_DETERMINE_WIN_NOT_PREV_ACTV (GOTO_ITEM IN OUT VARCHAR2) RETURN BOOLEAN IS
<multilinecomment> This function is used in multi window forms where window to window
   navigation has no restrictions.  This function is called from 
   procedure G$_DETERMINE_CURSOR_LOCATION.  If a window has previously
   been activated a global will have been created containing the
   window name.  This function searches sequentially thru the array
   of window names.If the window name is not found, "TRUE" is returned.
   If the window name is found, "FALSE" and the 'block.item' to
   place the cursor in are returned.

   NOTE: Construction of variables in this function are dependent upon
   unique 7 character form names.
</multilinecomment>
  WIN_CNT        NUMBER;
  GLOBAL_WIN_CNT VARCHAR2(22) := 'GLOBAL.'||NAME_IN('SYSTEM.CURRENT_FORM')||'_WIN_CNT';
  GLOBAL_ARRAY   VARCHAR2(21) := 'GLOBAL.'||NAME_IN('SYSTEM.CURRENT_FORM')||'_ARRAY_';
--
BEGIN
  WIN_CNT := TO_NUMBER(NAME_IN(GLOBAL_WIN_CNT));
  GOTO_ITEM := '';
--
<<LOOP_LOOK_FOR_WIN>>
  IF WIN_CNT <= 0 THEN
    RETURN(TRUE);
  END IF;
--
  IF SUBSTR(NAME_IN(GLOBAL_ARRAY||TO_CHAR(WIN_CNT)),1,
     TO_NUMBER(INSTR(NAME_IN(GLOBAL_ARRAY||TO_CHAR(WIN_CNT)),';') - 1)) = 
     NAME_IN('SYSTEM.EVENT_WINDOW') THEN
    GOTO_ITEM := SUBSTR(NAME_IN(GLOBAL_ARRAY||TO_CHAR(WIN_CNT)),
          TO_NUMBER(INSTR(NAME_IN(GLOBAL_ARRAY||TO_CHAR(WIN_CNT)),';')) + 1,
          NVL(LENGTH(NAME_IN(GLOBAL_ARRAY||TO_CHAR(WIN_CNT))), 0));
    RETURN(FALSE);
  END IF;
  WIN_CNT := WIN_CNT - 1;
  GOTO LOOP_LOOK_FOR_WIN;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param gotoItem
		*/
		public NBool gDetermineWinNotPrevActv(Ref<NString> gotoItem)
		{
			//  This function is used in multi window forms where window to window
			// navigation has no restrictions.  This function is called from
			// procedure G$_DETERMINE_CURSOR_LOCATION.  If a window has previously
			// been activated a global will have been created containing the
			// window name.  This function searches sequentially thru the array
			// of window names.If the window name is not found, "TRUE" is returned.
			// If the window name is found, "FALSE" and the 'block.item' to
			// place the cursor in are returned.
			// NOTE: Construction of variables in this function are dependent upon
			// unique 7 character form names.
			NNumber winCnt= NNumber.getNull();
			NString globalWinCnt = toStr("GLOBAL.").append(getCurrentTaskName()).append("_WIN_CNT");
			NString globalArray = toStr("GLOBAL.").append(getCurrentTaskName()).append("_ARRAY_");
			winCnt = toNumber(getNameIn(globalWinCnt));
			gotoItem.val = toStr("");
			while (true){
				if ( winCnt.lesserOrEquals(0) )
				{
					return  toBool(((NBool.True)));
				}
				// 
				if ( substring(getNameIn(globalArray.append(toChar(winCnt))), toInt(1), toNumber(inStr(getNameIn(globalArray.append(toChar(winCnt))), toStr(";")).subtract(1))).equals(getCurrentWindow()) )
				{
					gotoItem.val = substring(getNameIn(globalArray.append(toChar(winCnt))), toNumber(inStr(getNameIn(globalArray.append(toChar(winCnt))), toStr(";"))).add(1), isNull(length(getNameIn(globalArray.append(toChar(winCnt)))), 0));
					return  toBool(((NBool.False)));
				}
				winCnt = winCnt.subtract(1);
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_DETERMINE_ERASE_GLOBAL
	/*
	PROCEDURE G$_DETERMINE_ERASE_GLOBAL IS
<multilinecomment> This procedure is used in multi window forms where window to window 
   navigation has no restrictions.  This procedure is called prior to 
   exiting the form (KEY-EXIT).  This procedure will erase any globals
   previously created by the procedure G$_DETERMINE_CURSOR_LOCATION.

   NOTE: Construction of variables in this procedure are dependent upon
         unique 7 character form names.

   EXAMPLE CALL (KEY-EXIT trigger):     G$_DETERMINE_ERASE_GLOBAL;
                                        EXIT_FORM;
</multilinecomment>
  WIN_CNT        NUMBER;
  GLOBAL_WIN_CNT VARCHAR2(22) := 'GLOBAL.'||NAME_IN('SYSTEM.CURRENT_FORM')||'_WIN_CNT';
  GLOBAL_ARRAY   VARCHAR2(21) := 'GLOBAL.'||NAME_IN('SYSTEM.CURRENT_FORM')||'_ARRAY_';
--
BEGIN
  DEFAULT_VALUE('XX',GLOBAL_WIN_CNT);
  IF NAME_IN(GLOBAL_WIN_CNT) = 'XX' THEN
    ERASE(GLOBAL_WIN_CNT);
    RETURN;
  END IF;
  WIN_CNT := TO_NUMBER(NAME_IN(GLOBAL_WIN_CNT));
  ERASE(GLOBAL_WIN_CNT);
--
<<LOOP_ALL_WIN_GLOBALS>>
  IF WIN_CNT <= 0 THEN
    RETURN;
  END IF;
  ERASE(GLOBAL_ARRAY||TO_CHAR(WIN_CNT));
  WIN_CNT := WIN_CNT - 1;
  GOTO LOOP_ALL_WIN_GLOBALS;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gDetermineEraseGlobal()
		{
			//  This procedure is used in multi window forms where window to window
			// navigation has no restrictions.  This procedure is called prior to
			// exiting the form (KEY-EXIT).  This procedure will erase any globals
			// previously created by the procedure G$_DETERMINE_CURSOR_LOCATION.
			// NOTE: Construction of variables in this procedure are dependent upon
			// unique 7 character form names.
			// EXAMPLE CALL (KEY-EXIT trigger):     G$_DETERMINE_ERASE_GLOBAL;
			// EXIT_FORM;
			NNumber winCnt= NNumber.getNull();
			NString globalWinCnt = toStr("GLOBAL.").append(getCurrentTaskName()).append("_WIN_CNT");
			NString globalArray = toStr("GLOBAL.").append(getCurrentTaskName()).append("_ARRAY_");
			setDefaultValue("XX", globalWinCnt);
			if ( getNameIn(globalWinCnt).equals("XX") )
			{
				removeGlobal(globalWinCnt);
				return ;
			}
			winCnt = toNumber(getNameIn(globalWinCnt));
			removeGlobal(globalWinCnt);
			while(true){
				if ( winCnt.lesserOrEquals(0) )
				{
					return ;
				}
				removeGlobal(globalArray.append(toChar(winCnt)));
				winCnt = winCnt.subtract(1);
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_DETERMINE_CURSOR_LOCATION
	/*
	PROCEDURE G$_DETERMINE_CURSOR_LOCATION (INITEM IN VARCHAR2) IS
<multilinecomment> This procedure is used in multi window forms where window to window
   navigation has no restrictions.  This procedure is called from the
   WHEN-WINDOW-ACTIVATED trigger.  The first time a window is activated
   (opened) during the execution of  this form a dynamically named
   global variable is created.  This global variable holds the name of 
   the window and the name of the item the cursor is sitting in 
   (:system.cursor_item) when the window is first activated (opened).
   The information in this global can then be used when this window is
   implicitly reactivated to bring the cursor to the window.

   NOTE: Construction of variables in this procedure are dependent upon
         unique 7 character form names.

   NOTE: Due to the erratic behavior of the firing of the 
         WHEN-WINDOW-ACTIVATED trigger in conjunction with the
         'ROOT_WINDOW' and the fact that some forms contain a key_block
         and data block(s) in the 'ROOT_WINDOW', it IS REQUIRED to
         pass to this procedure a 'block.item_name'.  This 'block.item'
         is where to locate the cursor when implicit activation of the 
         'ROOT_WINDOW' takes place.

   EXAMPLE CALL:     G$_DETERMINE_CURSOR_LOCATION ('MY_BLOCK.MY_ITEM');

   EXAMPLE OF GLOBAL VARIABLE NOMENCLATURE:
         If running form ABCFORM with windows 'ROOT_WINDOW',
         'ABC_1_WINDOW', 'ABC_2_WINDOW' and 'XYZ_WINDOW'.......and if 
         your call to this procedure were similar to the example above
         .......an examination of globals after activation of all 
         windows has occurred may disclose the following:

         Global Name                     Value
         ----------------------          ---------------------------
         GLOBAL.ABCFORM_WIN_CNT          3
         GLOBAL.ABCFORM_ARRAY_1          ABC_1_WINDOW;BLOCK_X.ITEM_X
         GLOBAL.ABCFORM_ARRAY_2          ABC_2_WINDOW;BLOCK_Y.ITEM_Y
         GLOBAL.ABCFORM_ARRAY_3          XYZ_WINDOW;BLOCK_Z.ITEM_Z   
</multilinecomment>
  WIN_CNT        NUMBER;
  GOTOITEM       VARCHAR2(80);
  GLOBAL_WIN_CNT VARCHAR2(22) := 'GLOBAL.'||NAME_IN('SYSTEM.CURRENT_FORM')||'_WIN_CNT';
  GLOBAL_ARRAY   VARCHAR2(21) := 'GLOBAL.'||NAME_IN('SYSTEM.CURRENT_FORM')||'_ARRAY_';
--
BEGIN
  IF INITEM IS NULL THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0011','LIB','*ERROR* Must pass a goto item to use G$_DETERMINE_CURSOR_LOCATION.'));
    RETURN;
  END IF;
--
  DEFAULT_VALUE('XX',GLOBAL_WIN_CNT);
  IF NAME_IN(GLOBAL_WIN_CNT) = 'XX' THEN
    COPY('0',GLOBAL_WIN_CNT);
  END IF;
--
  IF NAME_IN('SYSTEM.EVENT_WINDOW') <> 'MAIN_WINDOW' THEN
    IF G$_DETERMINE_WIN_NOT_PREV_ACTV(GOTOITEM) THEN
      WIN_CNT := TO_NUMBER(NAME_IN(GLOBAL_WIN_CNT)) + 1;
      COPY(TO_CHAR(WIN_CNT),GLOBAL_WIN_CNT);
      COPY(NAME_IN('SYSTEM.EVENT_WINDOW')||';'||NAME_IN('SYSTEM.CURSOR_ITEM'),GLOBAL_ARRAY||TO_CHAR(WIN_CNT));
      RETURN;
    END IF;
  END IF;
--
  IF GET_VIEW_PROPERTY(GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),ITEM_CANVAS),WINDOW_NAME) <>
     NAME_IN('SYSTEM.EVENT_WINDOW') THEN
    IF NAME_IN('SYSTEM.EVENT_WINDOW') = 'MAIN_WINDOW' THEN
      GOTOITEM :=INITEM;  
    END IF;    
--
    IF GOTOITEM IS NOT NULL AND GET_ITEM_PROPERTY(GOTOITEM,ENABLED) = 'TRUE' THEN
      GO_ITEM(GOTOITEM);
    ELSE
      MESSAGE(G$_NLS.Get('GOQRPLS-0012','LIB','*WARNING* Cannot navigate implicitly to this Window at this time.'));
      SET_WINDOW_PROPERTY(GET_VIEW_PROPERTY(
         GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),ITEM_CANVAS),WINDOW_NAME),
            VISIBLE,PROPERTY_ON);    
    END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param initem
		*/
		public void gDetermineCursorLocation(NString initem)
		{
			//  This procedure is used in multi window forms where window to window
			// navigation has no restrictions.  This procedure is called from the
			// WHEN-WINDOW-ACTIVATED trigger.  The first time a window is activated
			// (opened) during the execution of  this form a dynamically named
			// global variable is created.  This global variable holds the name of
			// the window and the name of the item the cursor is sitting in
			// (:system.cursor_item) when the window is first activated (opened).
			// The information in this global can then be used when this window is
			// implicitly reactivated to bring the cursor to the window.
			// NOTE: Construction of variables in this procedure are dependent upon
			// unique 7 character form names.
			// NOTE: Due to the erratic behavior of the firing of the
			// WHEN-WINDOW-ACTIVATED trigger in conjunction with the
			// 'ROOT_WINDOW' and the fact that some forms contain a key_block
			// and data block(s) in the 'ROOT_WINDOW', it IS REQUIRED to
			// pass to this procedure a 'block.item_name'.  This 'block.item'
			// is where to locate the cursor when implicit activation of the
			// 'ROOT_WINDOW' takes place.
			// EXAMPLE CALL:     G$_DETERMINE_CURSOR_LOCATION ('MY_BLOCK.MY_ITEM');
			// EXAMPLE OF GLOBAL VARIABLE NOMENCLATURE:
			// If running form ABCFORM with windows 'ROOT_WINDOW',
			// 'ABC_1_WINDOW', 'ABC_2_WINDOW' and 'XYZ_WINDOW'.......and if
			// your call to this procedure were similar to the example above
			// .......an examination of globals after activation of all
			// windows has occurred may disclose the following:
			// Global Name                     Value
			// ----------------------          ---------------------------
			// GLOBAL.ABCFORM_WIN_CNT          3
			// GLOBAL.ABCFORM_ARRAY_1          ABC_1_WINDOW;BLOCK_X.ITEM_X
			// GLOBAL.ABCFORM_ARRAY_2          ABC_2_WINDOW;BLOCK_Y.ITEM_Y
			// GLOBAL.ABCFORM_ARRAY_3          XYZ_WINDOW;BLOCK_Z.ITEM_Z
			NNumber winCnt= NNumber.getNull();
			NString gotoitem= NString.getNull();
			NString globalWinCnt = toStr("GLOBAL.").append(getCurrentTaskName()).append("_WIN_CNT");
			NString globalArray = toStr("GLOBAL.").append(getCurrentTaskName()).append("_ARRAY_");
			if ( initem.isNull() )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0011"), toStr("LIB"), toStr("*ERROR* Must pass a goto item to use G$_DETERMINE_CURSOR_LOCATION.")));
				return ;
			}
			// 
			setDefaultValue("XX", globalWinCnt);
			if ( getNameIn(globalWinCnt).equals("XX") )
			{
				copy("0",globalWinCnt);
			}
			// 
			if ( getCurrentWindow().notEquals("MAIN_WINDOW") )
			{
				Ref<NString> gotoItemRef = new Ref<NString>(gotoitem);
				if ( gDetermineWinNotPrevActv(gotoItemRef).getValue() )
				{					
					winCnt = toNumber(toNumber(getNameIn(globalWinCnt)).add(1));
					copy(toChar(winCnt),globalWinCnt);
					copy(getCurrentWindow().append(";").append(getCursorItem()),globalArray.append(toChar(winCnt)));
					return ;
				}
				gotoitem = gotoItemRef.val;
			}
			// 
			if ( getViewWindowName(getItemCanvas(getCursorItem())).notEquals(getCurrentWindow()) )
			{
				if ( getCurrentWindow().equals("MAIN_WINDOW") )
				{
					gotoitem = initem;
				}
				// 
				if ( !gotoitem.isNull() && getItemEnabled(gotoitem).equals("TRUE") )
				{
					goItem(gotoitem);
				}
				else {
					warningMessage(GNls.Fget(toStr("GOQRPLS-0012"), toStr("LIB"), toStr("*WARNING* Cannot navigate implicitly to this Window at this time.")));
					// F2J_NOT_SUPPORTED : The property "WINDOW's VISIBLE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
					//					SupportClasses.FORMS4W.SetWindowProperty(getViewWindowName(getItemCanvas(getCursorItem())), SupportClasses.Property.VISIBLE, true);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's VISIBLE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
					
					
				}
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_DEF_VIEW
	/*
	PROCEDURE G$_DEF_VIEW IS
  NXT_FLD     VARCHAR2(61);
  NXT_FLD1    VARCHAR2(61);
-- Sets sizes for pop-up windows.
BEGIN
  DEFAULT_VALUE('18','GLOBAL.SIZE_Y');
  DEFAULT_VALUE('1','GLOBAL.MOVE_X');
  DEFAULT_VALUE('4','GLOBAL.MOVE_Y');
  DEFAULT_VALUE('5','GLOBAL.ANC_Y');
  DEFAULT_VALUE('','GLOBAL.ANC_X');
  DEFAULT_VALUE('','GLOBAL.SIZE_X');
  DEFAULT_VALUE('','GLOBAL.POP_FLD_NAME');
--
  IF NAME_IN('GLOBAL.POP_FLD_NAME') IS NULL THEN
    NXT_FLD := GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),NEXTITEM);
    IF SUBSTR(NAME_IN('SYSTEM.CURRENT_FORM'),1,3) = 'FTV' THEN
      NXT_FLD1 := GET_ITEM_PROPERTY(NXT_FLD,NEXTITEM);
      NXT_FLD := NXT_FLD1;
    END IF;
  ELSE
    NXT_FLD := NAME_IN('GLOBAL.POP_FLD_NAME');
  END IF;
--
  IF NXT_FLD IS NULL THEN
    NXT_FLD := NAME_IN('SYSTEM.CURSOR_ITEM');
  END IF;
--
  IF NAME_IN('GLOBAL.SIZE_X') IS NULL THEN
    COPY(TO_CHAR(TO_NUMBER(GET_ITEM_PROPERTY(NXT_FLD,X_POS)) +
                 TO_NUMBER(GET_ITEM_PROPERTY(NXT_FLD,WIDTH)) + 2),'GLOBAL.SIZE_X');
  END IF;
--
  IF NAME_IN('GLOBAL.ANC_X') IS NULL THEN
    IF NAME_IN('GLOBAL.POS_X') > 40 THEN
      COPY('2','GLOBAL.ANC_X');
    ELSE
      COPY(TO_CHAR(79 - TO_NUMBER(NAME_IN('GLOBAL.SIZE_X')) + 1),'GLOBAL.ANC_X');
    END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gDefView()
		{
			NString nxtFld= NString.getNull();
			NString nxtFld1= NString.getNull();
			setDefaultValue("18", "GLOBAL.SIZE_Y");
			setDefaultValue("1", "GLOBAL.MOVE_X");
			setDefaultValue("4", "GLOBAL.MOVE_Y");
			setDefaultValue("5", "GLOBAL.ANC_Y");
			setDefaultValue("", "GLOBAL.ANC_X");
			setDefaultValue("", "GLOBAL.SIZE_X");
			setDefaultValue("", "GLOBAL.POP_FLD_NAME");
			// 
			if ( getNameIn("GLOBAL.POP_FLD_NAME").isNull() )
			{
				nxtFld = getItemNextItem(getCursorItem());
				if ( substring(getCurrentTaskName(), toInt(1), toInt(3)).equals("FTV") )
				{
					nxtFld1 = getItemNextItem(nxtFld);
					nxtFld = nxtFld1;
				}
			}
			else {
				nxtFld = getNameIn("GLOBAL.POP_FLD_NAME");
			}
			// 
			if ( nxtFld.isNull() )
			{
				nxtFld = getCursorItem();
			}
			// 
			if ( getNameIn("GLOBAL.SIZE_X").isNull() )
			{
				copy(toChar(toNumber(getItemXPos(nxtFld)).add(toNumber(getItemWidth(nxtFld))).add(2)),"GLOBAL.SIZE_X");
			}
			// 
			if ( getNameIn("GLOBAL.ANC_X").isNull() )
			{
				if ( toNumber(getNameIn("GLOBAL.POS_X")).greater(40) )
				{
					copy("2","GLOBAL.ANC_X");
				}
				else {
					copy(toChar(toInt(79).subtract(toNumber(getNameIn("GLOBAL.SIZE_X"))).add(1)),"GLOBAL.ANC_X");
				}
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_DECEASED_WARNING
	/*
	PROCEDURE G$_DECEASED_WARNING IS
--
-- Display Alert Window if the person is deceased
--
  ALERT_BUT   NUMBER;
BEGIN
  ALERT_BUT := G$_DISPLAY_ALERT('G$_WARNING_ALERT', G$_NLS.Get('GOQRPLS-0010', 'LIB','Warning: this person is deceased') );
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gDeceasedWarning()
		{
			// 
			//  Display Alert Window if the person is deceased
			// 
			NNumber alertBut= NNumber.getNull();
			alertBut = gDisplayAlert(toStr("G$_WARNING_ALERT"), GNls.Fget(toStr("GOQRPLS-0010"), toStr("LIB"), toStr("Warning: this person is deceased")));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_DATE_WHEN_NEW_ITEM
	/*
	PROCEDURE G$_DATE_WHEN_NEW_ITEM IS
--
--  This procedure should be in a WHEN-NEW-ITEM-INSTANCE trigger of a date field 
--  that requires G$_DATE_REFORMAT. When using this procedure, also include 
--  G$_DATE_POST_ITEM in a POST-TEXT-ITEM on the date field. 
--
  CUR_ITEM     VARCHAR2(61) := NAME_IN('SYSTEM.CURSOR_ITEM');
  CUR_MASK     VARCHAR2(61) := GET_ITEM_PROPERTY(CUR_ITEM,FORMAT_MASK);
  CUR_DATATYPE VARCHAR2(30) := GET_ITEM_PROPERTY(CUR_ITEM,DATATYPE); --DATE
  CUR_ITEMTYPE VARCHAR2(30) := GET_ITEM_PROPERTY(CUR_ITEM,ITEM_TYPE); --TEXT ITEM
  CUR_MAXLEN   NUMBER(3)    := GET_ITEM_PROPERTY(CUR_ITEM,MAX_LENGTH);

BEGIN
--
-- exit if running in enter-query mode
--
  IF NAME_IN('SYSTEM.MODE') <> 'NORMAL' THEN
    RETURN;
  END IF;
--
  SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION, PROPERTY_OFF);
--
-- Change the existing format mask
--
-- Changed for Intcal Implementation -- yslooi

  IF CUR_DATATYPE = 'DATETIME' THEN
  	NULL;
--
-- No mask, so verify it is a date item and set the format mask
--
  ELSE
    IF CUR_DATATYPE = 'DATE' AND CUR_ITEMTYPE = 'TEXT ITEM' THEN
      IF CUR_MAXLEN = 9 THEN
        SET_ITEM_PROPERTY(CUR_ITEM, FORMAT_MASK, G$_DATE.GET_NLS_DATE_FORMAT);
      ELSIF CUR_MAXLEN = 11 THEN
        SET_ITEM_PROPERTY(CUR_ITEM, FORMAT_MASK, G$_DATE.GET_NLS_DATE_FORMAT);
      ELSE
        NULL;
      END IF;
    END IF;
  END IF;
--
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gDateWhenNewItem()
		{
			//MORPHIS
			//This code is not relevant as the gDatePostItem. This feature for using masks for edition is not used.
			//Furthermore, the date masks with RRRR, RR were replaced by the native YYY, YY
			
			return;
/*			
			// 
			//   This procedure should be in a WHEN-NEW-ITEM-INSTANCE trigger of a date field 
			//   that requires G$_DATE_REFORMAT. When using this procedure, also include 
			//   G$_DATE_POST_ITEM in a POST-TEXT-ITEM on the date field. 
			// 
			NString curItem = getCursorItem();
			NString curMask = getItemFormatMask(curItem);
			NString curDatatype = getItemDataType(curItem);
			// DATE
			NString curItemtype = getItemType(curItem);
			// TEXT ITEM
			NNumber curMaxlen = toNumber(getItemMaxLength(curItem));					
			// 
			//  exit if running in enter-query mode
			// 
			if ( getMode().notEquals("NORMAL") )
			{
				return ;
			}
			// 
			// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
			//			SupportClasses.FORMS40.SetFormProperty(getCurrentTaskName(), SupportClasses.Property.VALIDATION, false);
			//TaskServices.getCurrentTask().setValidationEnabled(false);
			//System.err.println("// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
			
			// 
			//  Change the existing format mask
			// 
			//  Changed for Intcal Implementation -- yslooi
			if ( curDatatype.equals("DATETIME") )
			{
			}
			else {
				if ( curDatatype.equals("DATE") && curItemtype.equals("TEXT ITEM") )
				{
					if ( curMaxlen.equals(9) )
					{
						setItemFormatMask(curItem, GDate.getNlsDateFormat().replace("RR", "YY"));
					}
					else if ( curMaxlen.equals(11) ) {
						setItemFormatMask(curItem, GDate.getNlsDateFormat().replace("RRRR", "YYYY"));
					}
					else {
					}
				}
			}
			*/
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_DATE_REFORMAT
	/*
	PROCEDURE G$_DATE_REFORMAT (PAR_DATE_ITEM IN VARCHAR2,PAR_CENTURY_PIVOT IN NUMBER) IS
--
-- Parameters:
--
  DATE_RETURN        VARCHAR2(30) := NULL;
  DATE_VALUE         VARCHAR2(30) := NULL;
  DATE_VALUEI        VARCHAR2(30) := NULL;  -- Initial
  DATE_FIELD_NAME    VARCHAR2(61) := NULL;
  DATE_MSG           VARCHAR2(200) := NULL;
--
BEGIN
  IF NAME_IN('SYSTEM.MODE') <> 'NORMAL' THEN
    RETURN;
  END IF;
--
  DATE_VALUE := NAME_IN(NVL(PAR_DATE_ITEM,NAME_IN('SYSTEM.TRIGGER_ITEM')));
  DATE_FIELD_NAME := NVL(PAR_DATE_ITEM,NAME_IN('SYSTEM.TRIGGER_ITEM'));
--
  IF DATE_VALUE IS NULL THEN
    RETURN;
  END IF;
--
-- Changed for Intcal Implementation -- yslooi -- HvT (fix issue with GJAPCTL)
--
  DATE_VALUEI:= NAME_IN(DATE_FIELD_NAME); -- Backup Initial value 
  IF SUBSTR(GET_ITEM_PROPERTY(DATE_FIELD_NAME, ITEM_NAME), 1, 8) = 'GREGDATE' THEN
    NULL; -- Use without change
  ELSIF GET_ITEM_PROPERTY(DATE_FIELD_NAME, DATATYPE) = 'DATETIME' THEN
    IF GET_ITEM_PROPERTY(DATE_FIELD_NAME, ITEM_DEFAULT_VALUE) IS NOT NULL	 
    THEN
      DATE_VALUEI := GET_ITEM_PROPERTY(DATE_FIELD_NAME, ITEM_DEFAULT_VALUE);  -- SCB fix (wo 927)
    END IF;
    SET_APPLICATION_PROPERTY(BUILTIN_DATE_FORMAT, G$_DATE.GET_NLS_DATE_FORMAT||' HH24:MI:SS');  -- SCB fix (wo 927)
    DATE_VALUE := NAME_IN(DATE_FIELD_NAME);
  ELSE
    BEGIN 
    --Convert implicitly to date (name_in may have implicitly converted to char)  	
      DATE_VALUE := TO_CHAR(TO_DATE(DATE_VALUE), G$_DATE.GET_NLS_DATE_FORMAT);
    EXCEPTION
      WHEN OTHERS THEN -- fall back on initial value
        DATE_VALUE := DATE_VALUEI;
    END;
  END IF;
--
  IF GET_ITEM_PROPERTY(DATE_FIELD_NAME, DATATYPE) = 'DATETIME' THEN 
    G$_DATE.DATE_FORMAT(DATE_VALUE, DATE_RETURN, 'Y', DATE_MSG);
  ELSE
    G$_DATE.DATE_FORMAT(DATE_VALUE,DATE_RETURN,'N',DATE_MSG);
  END IF;
--
  IF DATE_MSG IS NOT NULL THEN
    MESSAGE(DATE_MSG);
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  --IF DATE_VALUE <> DATE_RETURN THEN
  IF DATE_VALUEI <> DATE_RETURN THEN --Changed HvT (compare to initial value instead of manipulated val)
    COPY(DATE_RETURN,DATE_FIELD_NAME);
  END IF;
  SET_APPLICATION_PROPERTY(BUILTIN_DATE_FORMAT, G$_DATE.GET_NLS_DATE_FORMAT);
EXCEPTION
  WHEN VALUE_ERROR THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0009','LIB','*ERROR* Invalid date format.'));
    RAISE FORM_TRIGGER_FAILURE;
END;
	*/
	/* <p>
/* </p>
		* @param parDateItem
		* @param parCenturyPivot
		*/
		public void gDateReformat(NString parDateItem, NNumber parCenturyPivot)
		{
			// 
			//  Parameters:
			// 
			NString dateReturn = NString.getNull();
			NString dateValue = NString.getNull();
			NString dateValuei = NString.getNull();
			//  Initial
			NString dateFieldName = NString.getNull();
			NString dateMsg = NString.getNull();
			try
			{
				if ( getMode().notEquals("NORMAL") )
				{
					return ;
				}
				// 
				dateValue = getNameIn(isNull(parDateItem, getTriggerItem()));
				dateFieldName = isNull(parDateItem, getTriggerItem());
				// 
				if ( dateValue.isNull() )
				{
					return ;
				}
				// 
				//  Changed for Intcal Implementation -- yslooi -- HvT (fix issue with GJAPCTL)
				// 
				dateValuei = getNameIn(dateFieldName);
				//  Backup Initial value 
				if ( substring(getItemName(dateFieldName), toInt(1), toInt(8)).equals("GREGDATE") )
				{
				}
				else if ( getItemDataType(dateFieldName).equals("DATETIME") ) {
					if (findItem(dateFieldName).getDataItemConfiguration().getValue() != null && DataUtils.getValue(findItem(dateFieldName).getDataItemConfiguration().getValue()) != null )
					{
						dateValuei = toStr(DataUtils.getValue(findItem(dateFieldName).getDataItemConfiguration().getValue()));
						
					}
					setDateFormat(GDate.getNlsDateFormat().append(" HH24:MI:SS"));
					//  SCB fix (wo 927)
					dateValue = getNameIn(dateFieldName);
				}
				else {
					try
					{
						// Convert implicitly to date (name_in may have implicitly converted to char)  	
						dateValue = toChar(toDate(dateValue), GDate.getNlsDateFormat());
					}
					catch(Exception  e)
					{
						//  fall back on initial value
						dateValue = dateValuei;
					}
				}
				// 
				Ref<NString> refDateReturn = new Ref<NString>(dateReturn);
				Ref<NString> refDateMsg = new Ref<NString>(dateMsg);
				if ( getItemDataType(dateFieldName).equals("DATETIME") )
				{
					
					GDate.dateFormat(dateValue, refDateReturn, toStr("Y"), refDateMsg);
				}
				else {
					GDate.dateFormat(dateValue, refDateReturn, toStr("N"), refDateMsg);
				}
				dateReturn = refDateReturn.val;
				dateMsg = refDateMsg.val;
				// 
				if ( !dateMsg.isNull() )
				{
					errorMessage(dateMsg);
					throw new ApplicationException();
				}
				// 
				// IF DATE_VALUE <> DATE_RETURN THEN
				if ( dateValuei.notEquals(dateReturn) )
				{
					// Changed HvT (compare to initial value instead of manipulated val)
					copy(dateReturn,dateFieldName);
					//MORPHIS_INTERNAL: Remove when validations implemented according to Oracle Engine.
				     if (!validateItem(dateFieldName)) {
							TaskServices.setFormSucess(false);
				     }
				}
				setDateFormat(GDate.getNlsDateFormat());
			}
			catch(Exception e)
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0009"), toStr("LIB"), toStr(" Invalid date format.")));
				throw new ApplicationException();
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_DATE_POST_ITEM
	/*
	PROCEDURE G$_DATE_POST_ITEM IS
--
-- This procedure should be in a POST-TEXT-ITEM trigger of a date field that    
-- requires G$_DATE_REFORMAT. When using this procedure, also include       
-- G$_DATE_WHEN_NEW_ITEM in a WHEN-NEW-ITEM-INSTANCE trigger of the date field. 
--
BEGIN
--
-- exit if running in enter-query mode
--
  IF NAME_IN('SYSTEM.MODE') <> 'NORMAL' THEN
    RETURN;
  END IF;
--
-- reset the form validation
--
  IF GET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION) = 'FALSE' THEN
    SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION, PROPERTY_ON);
  END IF;
--
  IF GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'), ITEM_IS_VALID) = 'TRUE' THEN
    RETURN;
  END IF;
--
  G$_DATE_REFORMAT('','');
  G$_CHECK_FAILURE;
EXCEPTION
  WHEN OTHERS THEN
    SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'), VALIDATION, PROPERTY_OFF);
    RAISE FORM_TRIGGER_FAILURE;
END;
	*/
	/* <p>
/* </p>
		*/
		public void gDatePostItem()
		{
			
			//MORPHIS TODO : not supported will be reemplemented in another way
			return;
//			try
//			{
//				// 
//				//  exit if running in enter-query mode
//				// 
//				if ( getMode().notEquals("NORMAL") )
//				{
//					return ;
//				}
//				
//				 
//				//  reset the form validation
//				// 
//				if (!TaskServices.getCurrentTask().getValidationEnabled())
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
//					//					SupportClasses.FORMS40.SetFormProperty(getCurrentTaskName(), SupportClasses.Property.VALIDATION, true);
//					//TaskServices.getCurrentTask().setValidationEnabled(true);
//					//System.err.println("// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
//					
//				}
//				
//				// 
//				if ( getItemIsValid(getTriggerItem()).equals("TRUE") )
//				{
//					return ;
//				}
//				// 
//				gDateReformat(toStr(""), toNumber(""));
//				gCheckFailure();
////				//MORPHIS: TO REMOVE WHEN TRIGGER ORDER CORRECT!
////				if ( !getItemIsValid(getTriggerItem()).equals("TRUE") )
////				{
////					 if (!validateItem(getTriggerItem())) {
//							TaskServices.setFormSucess(false);
////					     }
////					 gCheckFailure();
////				}
//			}
//			catch(Exception  e)
//			{
//				// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
//				//				SupportClasses.FORMS40.SetFormProperty(getCurrentTaskName(), SupportClasses.Property.VALIDATION, false);
//				//TaskServices.getCurrentTask().setValidationEnabled(false);
////				System.err.println("// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
//				
//				throw new ApplicationException(e);
//			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_DATE_NEXT_ITEM
	/*
	PROCEDURE G$_DATE_NEXT_ITEM IS
BEGIN
  NEXT_ITEM;
END;
	*/
	/* <p>
/* </p>
		*/
		public void gDateNextItem()
		{
			nextItem();
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_DATE_CALL_GUACALN
	/*
	PROCEDURE G$_DATE_CALL_GUACALN (X_ITEM_NAME IN VARCHAR2) IS
--
-- TGK 12/04/2003 Routine created for Banner7.0.  To be used for a date data enterable items calendar button
-- when-button-pressed logic ONLY when the date item name is longer than 26 characters.  If the date
-- name is 26 or less in length the calendar button can be named with _DBT at the end of the name.  This would
-- allow for using the subclassed (from G$_CALENDAR_BUTTON_CLASS class) when-button-pressed trigger.
--
-- Example of a call to this procedure:
-- BEGIN
--   G$_DATE_CALL_GUACALN('FTVVEND_TERM_DATE_IS_TOO_LONG');
--   G$_CHECK_FAILURE;
-- END;
--
  ITEM_ID           ITEM;
  CURRENT_BLOCK_FLD VARCHAR2(61);
BEGIN
  ITEM_ID := FIND_ITEM(NAME_IN('SYSTEM.CURSOR_BLOCK')||'.'||X_ITEM_NAME);
  IF ID_NULL(ITEM_ID) THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0007','LIB','*ERROR* Date button is outside the current block.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  CURRENT_BLOCK_FLD := NAME_IN('SYSTEM.CURSOR_BLOCK')||'.'||X_ITEM_NAME;
  GO_ITEM(CURRENT_BLOCK_FLD);
  G$_CHECK_FAILURE; 
--
  COPY(NAME_IN('SYSTEM.CURSOR_VALUE'),'GLOBAL.VALUE');
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
  G$_SECURED_FORM_CALL(USER,'GUACALN','QUERY_NOHIDE');
--
  IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
    IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATEABLE) = 'TRUE' OR
       (GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATE_NULL) = 'TRUE' AND
        NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL) OR
       (NAME_IN('SYSTEM.MODE') <> 'NORMAL' AND
        GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,QUERYABLE) = 'TRUE') OR
       (NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW' AND
        GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') OR
       (NAME_IN('SYSTEM.RECORD_STATUS') = 'INSERT' AND
        GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') THEN
      COPY(NAME_IN('GLOBAL.VALUE'),CURRENT_BLOCK_FLD);
      COPY('','GLOBAL.VALUE');
      DO_KEY('NEXT_ITEM');
    ELSE
      MESSAGE(G$_NLS.Get('GOQRPLS-0008','LIB','*ERROR* Item is protected against update.'));              
    END IF;  
  END IF;
END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param xItemName
		*/
		public void gDateCallGuacaln(NString xItemName)
		{
			// 
			//  TGK 12/04/2003 Routine created for Banner7.0.  To be used for a date data enterable items calendar button
			//  when-button-pressed logic ONLY when the date item name is longer than 26 characters.  If the date
			//  name is 26 or less in length the calendar button can be named with _DBT at the end of the name.  This would
			//  allow for using the subclassed (from G$_CALENDAR_BUTTON_CLASS class) when-button-pressed trigger.
			// 
			//  Example of a call to this procedure:
			//  BEGIN
			//    G$_DATE_CALL_GUACALN('FTVVEND_TERM_DATE_IS_TOO_LONG');
			//    G$_CHECK_FAILURE;
			//  END;
			// 
			ItemDescriptor itemId= null;
			NString currentBlockFld= NString.getNull();
			itemId = findItem(getCursorBlock().append(".").append(xItemName));
			if ( (itemId == null) )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0007"), toStr("LIB"), toStr("*ERROR* Date button is outside the current block.")));
				throw new ApplicationException();
			}
			// 
			currentBlockFld = getCursorBlock().append(".").append(xItemName);
			goItem(currentBlockFld);
			gCheckFailure();
			// 
			copy(SupportClasses.AppContext.CursorValue,"GLOBAL.VALUE");
			executeAction("G$_REVOKE_ACCESS");
			gCheckFailure();
			gSecuredFormCall(getUser(), toStr("GUACALN"), toStr("QUERY_NOHIDE"));
			// 
			if ( !getNameIn("GLOBAL.VALUE").isNull() )
			{
				// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
				if ( getItemUpdateAllowed(currentBlockFld).equals("TRUE") /*|| (SupportClasses.FORMS40.GetItemProperty(currentBlockFld, SupportClasses.Property.UPDATE_NULL).equals("TRUE") && SupportClasses.AppContext.CursorValue.isNull()) */|| (getMode().notEquals("NORMAL") && getItemQueryAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					copy(getNameIn("GLOBAL.VALUE"),currentBlockFld);
					copy("","GLOBAL.VALUE");
					executeAction("NEXT_ITEM");
				}
				else {
					errorMessage(GNls.Fget(toStr("GOQRPLS-0008"), toStr("LIB"), toStr("*ERROR* Item is protected against update.")));
				}
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_DATA_EXTRACT
	/*
	PROCEDURE G$_DATA_EXTRACT (WITH_KEY_BLOCK_IND BOOLEAN) IS
  extract_error      EXCEPTION;
--
  seq_no             NUMBER;
  session_no         NUMBER := TO_NUMBER(NAME_IN('GLOBAL.SESSION_ID'));
  tmp_index          NUMBER;
  tmp_rtn            NUMBER;
--
  tmp_blk            VARCHAR2(30) := NAME_IN('SYSTEM.CURSOR_BLOCK');
  tmp_cur_item       VARCHAR2(60) := NAME_IN('SYSTEM.CURSOR_ITEM');
  tmp_kb_blk         VARCHAR2(30) := 'KEY_BLOCK';
  tmp_kb_canvas      VARCHAR2(30);
  tmp_kb_item        VARCHAR2(30);
  tmp_lstqry         VARCHAR2(10000);
  where_clause_orig  VARCHAR2(2000);
  where_clause_save  VARCHAR2(2000);
  lv_data_extract_pad_columns VARCHAR2(1) := '';
--
BEGIN
  MESSAGE(G$_NLS.Get('GOQRPLS-0005','LIB','Working...') ,NO_ACKNOWLEDGE);
  SYNCHRONIZE;
-- -- -- TGKinderman 09/12/2006:
-- -- -- This environment variable has been established with the 7.4 release.
-- -- -- Read environment variable and load it to the global.
-- -- -- If the global is Y, then the data extract logic in the G$_WRITE_BLOCK
-- -- -- will pad the columns with space.  This is the behavior prior to this 7.4
-- -- -- modification.  Since the columns are wrappered with double-quotes the
-- -- -- padding is not needed.  But if the padding (old behavior) is desired, this
-- -- -- env var can be used to achieve.
  DEFAULT_VALUE('XX','GLOBAL.BAN_DATA_EXTRACT_PAD_COLUMNS');
  IF NAME_IN('GLOBAL.BAN_DATA_EXTRACT_PAD_COLUMNS') = 'XX' THEN
    tool_env.getvar('BAN_DATA_EXTRACT_PAD_COLUMNS', lv_data_extract_pad_columns);
    IF lv_data_extract_pad_columns IS NULL THEN
      COPY('N','GLOBAL.BAN_DATA_EXTRACT_PAD_COLUMNS');
    ELSIF UPPER(lv_data_extract_pad_columns) = 'Y' THEN
      COPY('Y','GLOBAL.BAN_DATA_EXTRACT_PAD_COLUMNS');
    ELSE
    	COPY('N','GLOBAL.BAN_DATA_EXTRACT_PAD_COLUMNS');
    END IF;
  END IF;  	
-- -- --
--
-- Generate a one up number for storing the extracting in the database
--
  SELECT GJBPSEQ.NEXTVAL
    INTO seq_no
    FROM DUAL;
--
-- If requested to print KEY-BLOCK data, find navigable item.
--
  COPY('15','SYSTEM.MESSAGE_LEVEL');
  IF NOT WITH_KEY_BLOCK_IND THEN
    tmp_kb_item := '';
--
  ELSE
    IF G$_BLOCK_EXISTS(tmp_kb_blk) THEN
      tmp_kb_item := GET_BLOCK_PROPERTY(tmp_kb_blk,FIRST_ITEM);
      tmp_kb_canvas := GET_ITEM_PROPERTY(tmp_kb_item,ITEM_CANVAS);
--
      WHILE (tmp_kb_item IS NOT NULL AND 
             (tmp_kb_canvas IS NULL OR tmp_kb_canvas = 'TEMP_CANVAS')) LOOP
        tmp_kb_item := GET_ITEM_PROPERTY(tmp_kb_item,NEXTITEM);
        tmp_kb_canvas := GET_ITEM_PROPERTY(tmp_kb_item,ITEM_CANVAS);
      END LOOP;
    END IF;
  END IF;
--
-- Invoke the function to write the data to the file if already in the key block
-- or if no key block exists.
--
  IF (tmp_blk = tmp_kb_blk OR tmp_kb_item IS NULL) THEN
    tmp_rtn := G$_WRITE_BLOCK.WRITE_BLOCK(tmp_blk,TO_CHAR(seq_no),'W',TRUE,',','ALL',TRUE);
    IF tmp_rtn <> 0 THEN
      RAISE extract_error;
    END IF;
--
  ELSE 
--
-- Save the default where clause and the last query incase an extended
-- query was entered so it can be restored
--
    where_clause_orig := GET_BLOCK_PROPERTY(tmp_blk,DEFAULT_WHERE);
--
-- Remove the Where statement
--
    tmp_lstqry := NAME_IN('SYSTEM.LAST_QUERY');
    tmp_index := INSTR(tmp_lstqry,'WHERE');
    IF tmp_index > 0 THEN
      where_clause_save := SUBSTR(tmp_lstqry, tmp_index + 6);
    END IF;
--
-- Remove the order by statement
--
    IF INSTR(UPPER(where_clause_save),'ORDER BY') > 0 THEN
    	where_clause_save := SUBSTR(where_clause_save,1,INSTR(UPPER(where_clause_save),'ORDER BY')-1);
    END IF;
--
-- If this is not null, change block's default where to user's query
-- as this will be lost during navigation to key block below.
--
    IF where_clause_save IS NOT NULL THEN
      SET_BLOCK_PROPERTY(tmp_blk,DEFAULT_WHERE,where_clause_save);
    END IF;
--
-- Make a key block item navigable so the data can be extracted
--
    EXECUTE_TRIGGER('enable_keys');
--
-- Extract data from key block
--
    tmp_rtn := G$_WRITE_BLOCK.WRITE_BLOCK(tmp_kb_blk,TO_CHAR(seq_no),'W',TRUE,',','ALL',TRUE);
    IF tmp_rtn <> 0 THEN
      RAISE extract_error;
    END IF;
--
-- Extract data from data block and append to same file
--
    tmp_rtn := G$_WRITE_BLOCK.WRITE_BLOCK(tmp_blk,TO_CHAR(seq_no),'A',TRUE,',','ALL',TRUE);
    IF tmp_rtn <> 0 THEN
      RAISE extract_error;
    END IF;
--
-- Go back to where the cursor was, reset key_block and where clause.
--
    GO_ITEM(tmp_cur_item);
    EXECUTE_TRIGGER('disable_keys');
    SET_BLOCK_PROPERTY(tmp_blk,DEFAULT_WHERE,where_clause_orig);
  END IF;
--
-- Check success of process.
--
  COPY('0','SYSTEM.MESSAGE_LEVEL');
--
  FORMS_DDL('BEGIN COMMIT; END;');
--
-- If running on the web, call routine which will display output in browser
--
  IF G$_GET_UPRF_DE_MIME_TYPE IN ('FILE','TEXT') THEN
    G$_WEB_SHOW_DOCUMENT_OUTD(seq_no,tmp_blk,session_no);
  ELSE
    COPY(TO_CHAR(seq_no),'GLOBAL.WUTL_ONE_UP_NO');
    COPY(TO_CHAR(session_no),'GLOBAL.WUTL_FILE_NUMBER');
    COPY(NAME_IN('SYSTEM.CURRENT_FORM'),'GLOBAL.WUTL_FORM_NAME');
    COPY(NAME_IN('SYSTEM.CURSOR_BLOCK'),'GLOBAL.WUTL_BLOCK_NAME');
    COPY('','GLOBAL.WUTL_FILE_NAME');
--  
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),'GUQWUTL','NOHIDE');
  END IF;
-- --  
  CLEAR_MESSAGE;
-- --
--     
-- Reset the auto hint text.
--     
  MESSAGE(GET_ITEM_PROPERTY(tmp_cur_item,HINT_TEXT));
EXCEPTION
  WHEN extract_error THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0006','LIB','*ERROR* Data Extract error occurred during processing request.') ,ACKNOWLEDGE); 
END;
	*/
	/* <p>
/* </p>
		* @param withKeyBlockInd
		*/
		public void gDataExtract(NBool withKeyBlockInd)
		{
			int rowCount = 0;
			// 
			NNumber seqNo= NNumber.getNull();
			NNumber sessionNo = toNumber(getNameIn("GLOBAL.SESSION_ID"));
			NNumber tmpIndex= NNumber.getNull();
			NNumber tmpRtn= NNumber.getNull();
			// 
			NString tmpBlk = getCursorBlock();
			NString tmpCurItem = getCursorItem();
			NString tmpKbBlk = toStr("KEY_BLOCK");
			NString tmpKbCanvas= NString.getNull();
			NString tmpKbItem= NString.getNull();
			NString tmpLstqry= NString.getNull();
			NString whereClauseOrig= NString.getNull();
			NString whereClauseSave= NString.getNull();
			NString lvDataExtractPadColumns = toStr("");
			try
			{
				infoMessage(GNls.Fget(toStr("GOQRPLS-0005"), toStr("LIB"), toStr("Working...")));
				// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#ExcludeSynchronize".
				//				SupportClasses.SQLFORMS.Synchronize();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#ExcludeSynchronize'.");
				
				
				//  -- -- TGKinderman 09/12/2006:
				//  -- -- This environment variable has been established with the 7.4 release.
				//  -- -- Read environment variable and load it to the global.
				//  -- -- If the global is Y, then the data extract logic in the G$_WRITE_BLOCK
				//  -- -- will pad the columns with space.  This is the behavior prior to this 7.4
				//  -- -- modification.  Since the columns are wrappered with double-quotes the
				//  -- -- padding is not needed.  But if the padding (old behavior) is desired, this
				//  -- -- env var can be used to achieve.
				setDefaultValue("XX", "GLOBAL.BAN_DATA_EXTRACT_PAD_COLUMNS");
				if ( getNameIn("GLOBAL.BAN_DATA_EXTRACT_PAD_COLUMNS").equals("XX") )
				{
					getEnvVar("BAN_DATA_EXTRACT_PAD_COLUMNS", lvDataExtractPadColumns);
					if ( lvDataExtractPadColumns.isNull() )
					{
						copy("N","GLOBAL.BAN_DATA_EXTRACT_PAD_COLUMNS");
					}
					else if ( upper(lvDataExtractPadColumns).equals("Y") ) {
						copy("Y","GLOBAL.BAN_DATA_EXTRACT_PAD_COLUMNS");
					}
					else {
						copy("N","GLOBAL.BAN_DATA_EXTRACT_PAD_COLUMNS");
					}
				}
				//  -- --
				// 
				//  Generate a one up number for storing the extracting in the database
				// 
				String sql1 = "SELECT GJBPSEQ.NEXTVAL " +
	" FROM DUAL ";
				DataCommand command1 = new DataCommand(sql1);
				ResultSet results1 = command1.executeQuery();
				rowCount = command1.getRowCount();
				if ( results1.hasData() ) {
					seqNo = results1.getNumber(0);
				}
				results1.close();
				// 
				//  If requested to print KEY-BLOCK data, find navigable item.
				// 
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '15'
				try { 
				MessageServices.setMessageLevel(MessageLevel.NONE);
				if ( withKeyBlockInd.not() )
				{
					tmpKbItem = toStr("");
				}
				else {
					if ( gBlockExists(tmpKbBlk).getValue() )
					{
						tmpKbItem = getBlockFirstItem(tmpKbBlk);
						tmpKbCanvas = getItemCanvas(tmpKbItem);
						// 
						while ((!tmpKbItem.isNull() && (tmpKbCanvas.isNull() || tmpKbCanvas.equals("TEMP_CANVAS")))) {
							tmpKbItem = getItemNextItem(tmpKbItem);
							tmpKbCanvas = getItemCanvas(tmpKbItem);
						}
					}
				}
				// 
				//  Invoke the function to write the data to the file if already in the key block
				//  or if no key block exists.
				// 
				if ((tmpBlk.equals(tmpKbBlk) || tmpKbItem.isNull()))
				{
					tmpRtn = getGWriteBlock().writeBlock(tmpBlk, toChar(seqNo), toStr("W"), toBool(NBool.True), toStr(","), toStr("ALL"), toBool(NBool.True));
					if ( tmpRtn.notEquals(0) )
					{
						throw new Exceptions.ExtractError();
					}
				}
				else {
					// 
					//  Save the default where clause and the last query incase an extended
					//  query was entered so it can be restored
					// 
					whereClauseOrig = getBlockWhereClause(tmpBlk);
					// 
					//  Remove the Where statement
					// 
					tmpLstqry = SupportClasses.AppContext.LastQuery;
					tmpIndex = toNumber(inStr(tmpLstqry, toStr("WHERE")));
					if ( tmpIndex.greater(0) )
					{
						whereClauseSave = substring(tmpLstqry, toInt(tmpIndex.add(6)));
					}
					// 
					//  Remove the order by statement
					// 
					if ( inStr(upper(whereClauseSave), toStr("ORDER BY")).greater(0) )
					{
						whereClauseSave = substring(whereClauseSave, toInt(1), inStr(upper(whereClauseSave), toStr("ORDER BY")).subtract(1));
					}
					// 
					//  If this is not null, change block's default where to user's query
					//  as this will be lost during navigation to key block below.
					// 
					if ( !whereClauseSave.isNull() )
					{
						setBlockWhereClause(tmpBlk, whereClauseSave);
					}
					// 
					//  Make a key block item navigable so the data can be extracted
					// 
					executeAction("enable_keys");
					// 
					//  Extract data from key block
					// 
					tmpRtn = getGWriteBlock().writeBlock(tmpKbBlk, toChar(seqNo), toStr("W"), toBool(NBool.True), toStr(","), toStr("ALL"), toBool(NBool.True));
					if ( tmpRtn.notEquals(0) )
					{
						throw new Exceptions.ExtractError();
					}
					// 
					//  Extract data from data block and append to same file
					// 
					tmpRtn = getGWriteBlock().writeBlock(tmpBlk, toChar(seqNo), toStr("A"), toBool(NBool.True), toStr(","), toStr("ALL"), toBool(NBool.True));
					if ( tmpRtn.notEquals(0) )
					{
						throw new Exceptions.ExtractError();
					}
					// 
					//  Go back to where the cursor was, reset key_block and where clause.
					// 
					goItem(tmpCurItem);
					executeAction("disable_keys");
					setBlockWhereClause(tmpBlk, whereClauseOrig);
				}
				// 
				//  Check success of process.
				// 
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
							
				} finally {
							
				MessageServices.resetMessageLevel();
							
				}
							
				// 
				formsDDL("BEGIN COMMIT; END;");
				// 
				//  If running on the web, call routine which will display output in browser
				// 
				if ( in(gGetUprfDeMimeType(), "FILE", "TEXT").getValue() )
				{
					gWebShowDocumentOutd(seqNo, tmpBlk, sessionNo);
				}
				else {
					copy(toChar(seqNo),"GLOBAL.WUTL_ONE_UP_NO");
					copy(toChar(sessionNo),"GLOBAL.WUTL_FILE_NUMBER");
					copy(getCurrentTaskName(),"GLOBAL.WUTL_FORM_NAME");
					copy(getCursorBlock(),"GLOBAL.WUTL_BLOCK_NAME");
					copy("","GLOBAL.WUTL_FILE_NAME");
					//   
					executeAction("G$_REVOKE_ACCESS");
					gCheckFailure();
					gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), toStr("GUQWUTL"), toStr("NOHIDE"));
				}
				//  --  
				clearMessage();
				//  --
				//      
				//  Reset the auto hint text.
				//      
				infoMessage(getItemHint(tmpCurItem));
			}
			catch(Exceptions.ExtractError e)
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0006"), toStr("LIB"), toStr("*ERROR* Data Extract error occurred during processing request.")), OutputMessageUserResponse.ACKNOWLEDGE);
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_CREATE_METADATA
	/*
	PROCEDURE G$_CREATE_METADATA IS
BEGIN
  IF GET_APPLICATION_PROPERTY(CALLING_FORM) = 'GOAWFIZ' THEN
    g$_read_metadata.read_metadata;
    EXIT_FORM;
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gCreateMetadata()
		{
			if ( getParentTaskName().equals("GOAWFIZ") )
			{
				getGReadMetadata().readMetadata();
				exitTask();
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_COPY_FLD_ATTR
	/*
	PROCEDURE G$_COPY_FLD_ATTR IS
--
-- Copies item's positional properties to Globals.
--
BEGIN
  COPY(FIELD_CHARACTERISTIC(NAME_IN('SYSTEM.CURSOR_ITEM'),X_POS),'GLOBAL.POS_X');
  COPY(FIELD_CHARACTERISTIC(NAME_IN('SYSTEM.CURSOR_ITEM'),Y_POS),'GLOBAL.POS_Y');
END;
	*/
	/* <p>
/* </p>
		*/
		public void gCopyFldAttr()
		{
			setGlobal("POS_X", findItem(getCursorItem()).getPosition().getX());
			setGlobal("POS_Y", findItem(getCursorItem()).getPosition().getY());			
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_CONVERT_ETHNICITY_CODE
	/*
	PROCEDURE G$_CONVERT_ETHNICITY_CODE(p_pidm             spbpers.spbpers_pidm%TYPE,
                                    p_ethn_code        spbpers.spbpers_ethn_code%TYPE,
                                    p_ethn_cde  IN OUT spbpers.spbpers_ethn_cde%TYPE) IS
--
  lv_spbpers_ethn_code spbpers.spbpers_ethn_code%TYPE := NULL;
  lv_spbpers_ethn_cde  spbpers.spbpers_ethn_cde%TYPE := NULL;
  lv_stvethn_ethn_cde  spbpers.spbpers_ethn_cde%TYPE := NULL;
  lv_stvethn_race_cde  gorrace.gorrace_race_cde%TYPE := NULL;
--  
  CURSOR sel_stvethn_row IS
    SELECT stvethn_ethn_cde, stvethn_race_cde
      FROM stvethn
     WHERE stvethn_code = p_ethn_code;
--
BEGIN	
  OPEN sel_stvethn_row;
  FETCH sel_stvethn_row INTO lv_stvethn_ethn_cde, lv_stvethn_race_cde;
  CLOSE sel_stvethn_row;
--
-- Map ethnicity defined and new ethnicity, SPBPERS_ETHN_CDE, is null,
-- update the new ethnicity of the given pidm.
--
  IF lv_stvethn_ethn_cde IS NOT NULL AND p_ethn_cde IS NULL THEN
    p_ethn_cde := lv_stvethn_ethn_cde;
  END IF;
--
-- Map race defined and person's race has not been defined in GORPRAC,
-- create the race record for the given pidm.
--
  IF lv_stvethn_race_cde IS NOT NULL AND GET_BLOCK_PROPERTY('GORPRAC', STATUS) = 'NEW' THEN
    COPY(lv_stvethn_race_cde,'gorprac.gorprac_race_cde');
    COPY(p_pidm,'gorprac.gorprac_pidm');
    COPY(NAME_IN('GLOBAL.CURRENT_DATE'),'gorprac.gorprac_activity_date');
    COPY(NAME_IN('GLOBAL.CURRENT_USER'),'gorprac.gorprac_user_id');
    COPY(gb_race_ethnicity.f_get_description(p_code => NAME_IN('gorprac.gorprac_race_cde')),	  
         'gorprac.race_desc');
  END IF;
END;    
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pPidm
		* @param pEthnCode
		* @param pEthnCde
		*/
		public void gConvertEthnicityCode(NNumber pPidm, NString pEthnCode, Ref<NString> pEthnCde)
		{
			int rowCount = 0;
			// 
			NString lvSpbpersEthnCode = NString.getNull();
			NString lvSpbpersEthnCde = NString.getNull();
			NString lvStvethnEthnCde = NString.getNull();
			NString lvStvethnRaceCde = NString.getNull();
			String sqlselStvethnRow = "SELECT stvethn_ethn_cde, stvethn_race_cde " +
	" FROM stvethn " +
	" WHERE stvethn_code = :P_P_ETHN_CODE ";
			DataCursor selStvethnRow = new DataCursor(sqlselStvethnRow);
			try {
				//Setting query parameters
				selStvethnRow.addParameter("P_P_ETHN_CODE", pEthnCode);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable selStvethnRow.
				selStvethnRow.open();
				ResultSet selStvethnRowResults = selStvethnRow.fetchInto();
				if ( selStvethnRowResults != null ) {
					lvStvethnEthnCde = selStvethnRowResults.getStr(0);
					lvStvethnRaceCde = selStvethnRowResults.getStr(1);
				}
				selStvethnRow.close();
				// 
				//  Map ethnicity defined and new ethnicity, SPBPERS_ETHN_CDE, is null,
				//  update the new ethnicity of the given pidm.
				// 
				if ( !lvStvethnEthnCde.isNull() && pEthnCde.val.isNull() )
				{
					pEthnCde.val = lvStvethnEthnCde;
				}
				// 
				//  Map race defined and person's race has not been defined in GORPRAC,
				//  create the race record for the given pidm.
				// 
				if ( !lvStvethnRaceCde.isNull() && getBlockStatus("GORPRAC").equals("NEW") )
				{
					copy(lvStvethnRaceCde,"gorprac.gorprac_race_cde");
					copy(pPidm,"gorprac.gorprac_pidm");
					copy(getNameIn("GLOBAL.CURRENT_DATE"),"gorprac.gorprac_activity_date");
					copy(getNameIn("GLOBAL.CURRENT_USER"),"gorprac.gorprac_user_id");
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					copy(GbRaceEthnicity.fGetDescription(/*pCode=>*/getNameIn("gorprac.gorprac_race_cde")),"gorprac.race_desc");
				}
				}finally{
					selStvethnRow.close();
				}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_COMPRESS_WORK_NAME
	/*
	FUNCTION G$_COMPRESS_WORK_NAME(NAME_FIELD  VARCHAR2) RETURN VARCHAR2
--
--  Purpose: To return a compressed name field in all
--           uppercase without spaces or punctuation except
--           for the '%', which allows the field to be used
--           in queries.
--  Parameters: any varchar2 field.
--
IS
BEGIN
  RETURN(TRANSLATE(UPPER(name_field),
    'ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890% `-=\[];'',./~!@#$^&*()_+|}{":?><',
    'ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890%'));
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param nameField
		*/
		public NString gCompressWorkName(NString nameField)
		{
			return ((translate(upper(nameField), "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890% `-=\\[];',./~!@#$^&*()_+|}{\":?><", "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890%")));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_CITY_STATE_NATN3
	/*
	FUNCTION G$_CITY_STATE_NATN3(ZIP_IN    IN OUT  VARCHAR2,
                             CITY_IN   IN OUT  VARCHAR2,
                             STATE_OUT IN OUT  VARCHAR2,
                             NATN_OUT  IN OUT  VARCHAR2,
                             CNTY_OUT  IN OUT  VARCHAR2) RETURN BOOLEAN IS
--
  CURSOR GTVZIPC_CURSOR IS
     SELECT GTVZIPC_STAT_CODE,
            GTVZIPC_NATN_CODE,
            GTVZIPC_CNTY_CODE
       FROM GTVZIPC
      WHERE GTVZIPC_CODE = ZIP_IN
        AND GTVZIPC_CITY = CITY_IN;
--
BEGIN
  OPEN GTVZIPC_CURSOR;
  FETCH GTVZIPC_CURSOR INTO STATE_OUT, NATN_OUT, CNTY_OUT;
  IF GTVZIPC_CURSOR%NOTFOUND THEN
    CLOSE GTVZIPC_CURSOR;
    RETURN(FALSE);
  END IF;
--
  CLOSE GTVZIPC_CURSOR;
  RETURN(TRUE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param zipIn
		* @param cityIn
		* @param stateOut
		* @param natnOut
		* @param cntyOut
		*/
		public NBool gCityStateNatn3(Ref<NString> zipIn, Ref<NString> cityIn, Ref<NString> stateOut, Ref<NString> natnOut, Ref<NString> cntyOut)
		{
			int rowCount = 0;
			String sqlgtvzipcCursor = "SELECT GTVZIPC_STAT_CODE, GTVZIPC_NATN_CODE, GTVZIPC_CNTY_CODE " +
	" FROM GTVZIPC " +
	" WHERE GTVZIPC_CODE = :P_ZIP_IN AND GTVZIPC_CITY = :P_CITY_IN ";
			DataCursor gtvzipcCursor = new DataCursor(sqlgtvzipcCursor);
			try {
				//Setting query parameters
				gtvzipcCursor.addParameter("P_ZIP_IN", zipIn.val);
				gtvzipcCursor.addParameter("P_CITY_IN", cityIn.val);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable gtvzipcCursor.
				gtvzipcCursor.open();
				ResultSet gtvzipcCursorResults = gtvzipcCursor.fetchInto();
				if ( gtvzipcCursorResults != null ) {
					stateOut.val = gtvzipcCursorResults.getStr(0);
					natnOut.val = gtvzipcCursorResults.getStr(1);
					cntyOut.val = gtvzipcCursorResults.getStr(2);
				}
				if ( gtvzipcCursor.notFound() )
				{
					gtvzipcCursor.close();
					return  toBool(((NBool.False)));
				}
				// 
				gtvzipcCursor.close();
				return  toBool(((NBool.True)));
				}finally{
					gtvzipcCursor.close();
				}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_CITY_STATE_NATN2
	/*
	FUNCTION G$_CITY_STATE_NATN2(ZIP_IN    IN OUT  VARCHAR2,
                             CITY_OUT  IN OUT  VARCHAR2,
                             STATE_OUT IN OUT  VARCHAR2,
                             NATN_OUT  IN OUT  VARCHAR2,
                             CNTY_OUT  IN OUT  VARCHAR2) RETURN BOOLEAN IS
<multilinecomment>
This procedure will default city, state, nation and county codes when 
a zip code is entered. This procedure should NOT be called or used if 
the city/state/nation or county codes are already entered.

This needs to be the first check in th key-nxtfld and key-prvfld
triggers of the zip field, if the city is entered then return, do not 
continue with this trigger. The field navigation after this procedure 
is invoked is dependent upon what is returned from this procedure. The 
field navigation is coded in each of the forms that will be using this 
procedure, the code should look like this:

       IF G$_CITY_STATE_NATN(:SPRADDR_ZIP,  --- Pass values from
                             :SPRADDR_CITY,     the current form.
                             :SPRADDR_STAT_CODE,
                             :SPRADDR_NATN_CODE,
                             :SPRADDR_CNTY_CODE) THEN
           PREVIOUS_FIELD ; --- To the CITY field because
                            --- the IF G$_CITY_STATE_NATN translates
                            --- to true, which means no value was
                            --- returned, then goto city.
       ELSE
           NEXT_FIELD ;     --- Then go next field because
                            --- the IF G$_CITY_STATE_NATN is false
                            --- because it returned the defaulted
                            --- values , then go next field.
       END IF;
</multilinecomment>
--
  DEFAULT_LENGTH  NUMBER := NAME_IN('GLOBAL.ZIP_DEFAULT_LENGTH');
--
-- Cursor for exact hit.
--
  CURSOR CITY_STATE_CURSOR IS
     SELECT GTVZIPC_CITY, GTVZIPC_STAT_CODE,
            GTVZIPC_NATN_CODE, GTVZIPC_CNTY_CODE
       FROM GTVZIPC
      WHERE GTVZIPC_CODE = ZIP_IN;
--
-- Cursor for close hit.
--
  CURSOR CITY_STATE_DEFAULT_CURSOR IS
     SELECT GTVZIPC_CITY, GTVZIPC_STAT_CODE,
            GTVZIPC_NATN_CODE, GTVZIPC_CNTY_CODE
       FROM GTVZIPC
      WHERE GTVZIPC_CODE LIKE 
                 SUBSTR(ZIP_IN,1,DEFAULT_LENGTH);
--
BEGIN
  DECLARE
    MY_COUNT NUMBER := 0;
  BEGIN
--
-- Count the number of exact hits.
--
    SELECT COUNT(GTVZIPC_CODE) 
      INTO MY_COUNT
      FROM GTVZIPC
     WHERE GTVZIPC_CODE = ZIP_IN;
--
-- If only one hit, fetch it and return to calling routine.
--
    IF MY_COUNT = 1 THEN 
      OPEN CITY_STATE_CURSOR;
      FETCH CITY_STATE_CURSOR INTO
            CITY_OUT, STATE_OUT, NATN_OUT, CNTY_OUT;
      IF CITY_STATE_CURSOR%NOTFOUND THEN
        CLOSE CITY_STATE_CURSOR;
      ELSE            
        CLOSE CITY_STATE_CURSOR;
        RETURN (FALSE);
      END IF;
    END IF;
--
-- Either none or more than one exist so do another count
-- using the default length and use the like command.
--
    MY_COUNT := 0;
    SELECT COUNT(GTVZIPC_CODE) 
      INTO MY_COUNT
      FROM GTVZIPC
     WHERE GTVZIPC_CODE LIKE 
               SUBSTR(ZIP_IN,1,DEFAULT_LENGTH)||'%';
--
-- If only one hit, fetch it and return to calling routine.
--
    IF MY_COUNT = 1 THEN
      OPEN CITY_STATE_DEFAULT_CURSOR;
      FETCH CITY_STATE_DEFAULT_CURSOR INTO
            CITY_OUT, STATE_OUT, NATN_OUT, CNTY_OUT;
      CLOSE CITY_STATE_DEFAULT_CURSOR;
      RETURN (FALSE);
    ELSE
--
-- No matches, return.
--
      IF MY_COUNT = 0 THEN
        COPY('','GLOBAL.ZIP_CODE');
        RETURN (TRUE);
--
-- More than one match, set a global for the call to the GTVZIPC
-- form upon return and exit.
--
      ELSE
        COPY(ZIP_IN,'GLOBAL.ZIP_CODE');
        RETURN (TRUE);
      END IF;
    END IF;
--
  END;
  RETURN NULL; 
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param zipIn
		* @param cityOut
		* @param stateOut
		* @param natnOut
		* @param cntyOut
		*/
		public NBool gCityStateNatn2(Ref<NString> zipIn, Ref<NString> cityOut, Ref<NString> stateOut, Ref<NString> natnOut, Ref<NString> cntyOut)
		{
			int rowCount = 0;
			// This procedure will default city, state, nation and county codes when
			// a zip code is entered. This procedure should NOT be called or used if
			// the city/state/nation or county codes are already entered.
			// This needs to be the first check in th key-nxtfld and key-prvfld
			// triggers of the zip field, if the city is entered then return, do not
			// continue with this trigger. The field navigation after this procedure
			// is invoked is dependent upon what is returned from this procedure. The
			// field navigation is coded in each of the forms that will be using this
			// procedure, the code should look like this:
			// IF G$_CITY_STATE_NATN(:SPRADDR_ZIP,  --- Pass values from
			// :SPRADDR_CITY,     the current form.
			// :SPRADDR_STAT_CODE,
			// :SPRADDR_NATN_CODE,
			// :SPRADDR_CNTY_CODE) THEN
			// PREVIOUS_FIELD ; --- To the CITY field because
			// --- the IF G$_CITY_STATE_NATN translates
			// --- to true, which means no value was
			// --- returned, then goto city.
			// ELSE
			// NEXT_FIELD ;     --- Then go next field because
			// --- the IF G$_CITY_STATE_NATN is false
			// --- because it returned the defaulted
			// --- values , then go next field.
			// END IF;
			// 
			NNumber defaultLength = toNumber(getNameIn("GLOBAL.ZIP_DEFAULT_LENGTH"));
			String sqlcityStateCursor = "SELECT GTVZIPC_CITY, GTVZIPC_STAT_CODE, GTVZIPC_NATN_CODE, GTVZIPC_CNTY_CODE " +
	" FROM GTVZIPC " +
	" WHERE GTVZIPC_CODE = :P_ZIP_IN ";
			DataCursor cityStateCursor = new DataCursor(sqlcityStateCursor);
			String sqlcityStateDefaultCursor = "SELECT GTVZIPC_CITY, GTVZIPC_STAT_CODE, GTVZIPC_NATN_CODE, GTVZIPC_CNTY_CODE " +
	" FROM GTVZIPC " +
	" WHERE GTVZIPC_CODE LIKE SUBSTR(:P_ZIP_IN, 1, :P_DEFAULT_LENGTH) ";
			DataCursor cityStateDefaultCursor = new DataCursor(sqlcityStateDefaultCursor);
			{
				NNumber myCount = toNumber(0);
				try {
					// 
					//  Count the number of exact hits.
					// 
					String sql1 = "SELECT COUNT(GTVZIPC_CODE) " +
	" FROM GTVZIPC " +
	" WHERE GTVZIPC_CODE = :P_ZIP_IN ";
					DataCommand command1 = new DataCommand(sql1);
					//Setting query parameters
					command1.addParameter("P_ZIP_IN", zipIn);
					ResultSet results1 = command1.executeQuery();
					rowCount = command1.getRowCount();
					if ( results1.hasData() ) {
						myCount = results1.getNumber(0);
					}
					results1.close();
					// 
					//  If only one hit, fetch it and return to calling routine.
					// 
					if ( myCount.equals(1) )
					{
						//Setting query parameters
						cityStateCursor.addParameter("P_ZIP_IN", zipIn);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable cityStateCursor.
						cityStateCursor.open();
						ResultSet cityStateCursorResults = cityStateCursor.fetchInto();
						if ( cityStateCursorResults != null ) {
							cityOut.val = cityStateCursorResults.getStr(0);
							stateOut.val = cityStateCursorResults.getStr(1);
							natnOut.val = cityStateCursorResults.getStr(2);
							cntyOut.val = cityStateCursorResults.getStr(3);
						}
						if ( cityStateCursor.notFound() )
						{
							cityStateCursor.close();
						}
						else {
							cityStateCursor.close();
							return  toBool(((NBool.False)));
						}
					}
					// 
					//  Either none or more than one exist so do another count
					//  using the default length and use the like command.
					// 
					myCount = toNumber(0);
					String sql2 = "SELECT COUNT(GTVZIPC_CODE) " +
	" FROM GTVZIPC " +
	" WHERE GTVZIPC_CODE LIKE SUBSTR(:P_ZIP_IN, 1, :P_DEFAULT_LENGTH) || '%' ";
					DataCommand command2 = new DataCommand(sql2);
					//Setting query parameters
					command2.addParameter("P_ZIP_IN", zipIn);
					command2.addParameter("P_DEFAULT_LENGTH", defaultLength);
					ResultSet results2 = command2.executeQuery();
					rowCount = command2.getRowCount();
					if ( results2.hasData() ) {
						myCount = results2.getNumber(0);
					}
					results2.close();
					// 
					//  If only one hit, fetch it and return to calling routine.
					// 
					if ( myCount.equals(1) )
					{
						//Setting query parameters
						cityStateDefaultCursor.addParameter("P_ZIP_IN", zipIn);
						cityStateDefaultCursor.addParameter("P_DEFAULT_LENGTH", defaultLength);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable cityStateDefaultCursor.
						cityStateDefaultCursor.open();
						ResultSet cityStateDefaultCursorResults = cityStateDefaultCursor.fetchInto();
						if ( cityStateDefaultCursorResults != null ) {
							cityOut.val = cityStateDefaultCursorResults.getStr(0);
							stateOut.val = cityStateDefaultCursorResults.getStr(1);
							natnOut.val = cityStateDefaultCursorResults.getStr(2);
							cntyOut.val = cityStateDefaultCursorResults.getStr(3);
						}
						cityStateDefaultCursor.close();
						return  toBool(((NBool.False)));
					}
					else {
						// 
						//  No matches, return.
						// 
						if ( myCount.equals(0) )
						{
							copy("","GLOBAL.ZIP_CODE");
							return  toBool(((NBool.True)));
						}
						else {
							copy(zipIn.val,"GLOBAL.ZIP_CODE");
							return  toBool(((NBool.True)));
						}
					}
				}
				finally{
					cityStateCursor.close();
					cityStateDefaultCursor.close();
				}
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_CITY_STATE_NATN
	/*
	FUNCTION G$_CITY_STATE_NATN(ZIP_IN    IN OUT  VARCHAR2,
                            CITY_OUT  IN OUT  VARCHAR2,
                            STATE_OUT IN OUT  VARCHAR2,
                            NATN_OUT  IN OUT  VARCHAR2,
                            CNTY_OUT  IN OUT  VARCHAR2)
        RETURN BOOLEAN IS
<multilinecomment>
 This procedure will default city, state, nation and county
 codes when a zip code is entered. This procedure should NOT
 be called or used if the city/state/nation or county codes
 are already entered.
 This needs to be the first check in th key-nxtfld and key-prvfld
 triggers of the zip field, if the city is entered then return,
 do not continue with this trigger. The field navigation
 after this procedure is invoked is dependent upon what is
 returned from this procedure. The field navigation is coded
 in each of the forms that will be using this procedure,
 the code should look like this:

            IF G$_CITY_STATE_NATN(:SPRADDR_ZIP,  --- Pass values from
                                  :SPRADDR_CITY,     the current form.
                                  :SPRADDR_STAT_CODE,
                                  :SPRADDR_NATN_CODE,
                                  :SPRADDR_CNTY_CODE) THEN
               PREVIOUS_FIELD ; --- To the CITY field because
                                --- the IF G$_CITY_STATE_NATN translates
                                --- to true, which means no value was
                                --- returned, then goto city.
             ELSE
               NEXT_FIELD ;     --- Then go next field because
                                --- the IF G$_CITY_STATE_NATN is false
                                --- because it returned the defaulted
                                --- values, then go next field.
            END IF;
</multilinecomment>
--
  DEFAULT_LENGTH  NUMBER := NAME_IN('GLOBAL.ZIP_DEFAULT_LENGTH');
  RTN_VALUE       BOOLEAN;
--
  CURSOR CITY_STATE_CURSOR IS
    SELECT GTVZIPC_CITY, GTVZIPC_STAT_CODE,
           GTVZIPC_NATN_CODE, GTVZIPC_CNTY_CODE
      FROM GTVZIPC
     WHERE GTVZIPC_CODE = ZIP_IN;
--
  CURSOR CITY_STATE_DEFAULT_CURSOR IS
    SELECT GTVZIPC_CITY, GTVZIPC_STAT_CODE,
           GTVZIPC_NATN_CODE, GTVZIPC_CNTY_CODE
      FROM GTVZIPC
     WHERE SUBSTR(GTVZIPC_CODE,1,DEFAULT_LENGTH) = 
                 SUBSTR(ZIP_IN,1,DEFAULT_LENGTH);
BEGIN
  DECLARE
    MY_COUNT NUMBER := 0;
  BEGIN
--
-- Count the number of exact hits.
--
    SELECT COUNT(GTVZIPC_CODE) 
      INTO MY_COUNT
      FROM GTVZIPC
     WHERE GTVZIPC_CODE = ZIP_IN;
--
-- If only one hit, fetch it and return to calling routine.
--
    IF MY_COUNT = 1 THEN 
      OPEN CITY_STATE_CURSOR;
      FETCH CITY_STATE_CURSOR INTO CITY_OUT, STATE_OUT, NATN_OUT, CNTY_OUT;
      IF CITY_STATE_CURSOR%NOTFOUND THEN
        CLOSE CITY_STATE_CURSOR;
      ELSE            
        CLOSE CITY_STATE_CURSOR;
        RETURN (FALSE);
      END IF;
    END IF;
--
-- Either none or more than one exist so do another count
-- using the default length and use the like command.
--
    MY_COUNT := 0;
    SELECT COUNT(GTVZIPC_CODE) INTO MY_COUNT
      FROM GTVZIPC
     WHERE SUBSTR(GTVZIPC_CODE,1,DEFAULT_LENGTH) = 
               SUBSTR(ZIP_IN,1,DEFAULT_LENGTH);
--
    IF MY_COUNT = 1 THEN
      OPEN CITY_STATE_DEFAULT_CURSOR;
      FETCH CITY_STATE_DEFAULT_CURSOR INTO
            CITY_OUT, STATE_OUT, NATN_OUT, CNTY_OUT;
      CLOSE CITY_STATE_DEFAULT_CURSOR;
      RETURN (FALSE);
    ELSE
-- Defect 1-143HWB - do not return any values if multiple zips exist
--      OPEN CITY_STATE_DEFAULT_CURSOR;
--      FETCH CITY_STATE_DEFAULT_CURSOR INTO
--            CITY_OUT, STATE_OUT, NATN_OUT, CNTY_OUT;
--      IF CITY_STATE_DEFAULT_CURSOR%NOTFOUND THEN
        CITY_OUT := ' ';          
        STATE_OUT := ' ';           
        NATN_OUT := ' ';           
        CNTY_OUT := ' ';      
--        CLOSE CITY_STATE_DEFAULT_CURSOR;
        RETURN (TRUE);
--      ELSE
--        CLOSE CITY_STATE_DEFAULT_CURSOR;
--        RETURN (FALSE);
--      END IF;
    END IF;
  END;
  RETURN NULL; 
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param zipIn
		* @param cityOut
		* @param stateOut
		* @param natnOut
		* @param cntyOut
		*/
		public NBool gCityStateNatn(Ref<NString> zipIn, Ref<NString> cityOut, Ref<NString> stateOut, Ref<NString> natnOut, Ref<NString> cntyOut)
		{
			int rowCount = 0;
			// This procedure will default city, state, nation and county
			// codes when a zip code is entered. This procedure should NOT
			// be called or used if the city/state/nation or county codes
			// are already entered.
			// This needs to be the first check in th key-nxtfld and key-prvfld
			// triggers of the zip field, if the city is entered then return,
			// do not continue with this trigger. The field navigation
			// after this procedure is invoked is dependent upon what is
			// returned from this procedure. The field navigation is coded
			// in each of the forms that will be using this procedure,
			// the code should look like this:
			// IF G$_CITY_STATE_NATN(:SPRADDR_ZIP,  --- Pass values from
			// :SPRADDR_CITY,     the current form.
			// :SPRADDR_STAT_CODE,
			// :SPRADDR_NATN_CODE,
			// :SPRADDR_CNTY_CODE) THEN
			// PREVIOUS_FIELD ; --- To the CITY field because
			// --- the IF G$_CITY_STATE_NATN translates
			// --- to true, which means no value was
			// --- returned, then goto city.
			// ELSE
			// NEXT_FIELD ;     --- Then go next field because
			// --- the IF G$_CITY_STATE_NATN is false
			// --- because it returned the defaulted
			// --- values, then go next field.
			// END IF;
			// 
			NNumber defaultLength = toNumber(getNameIn("GLOBAL.ZIP_DEFAULT_LENGTH"));
			NBool rtnValue= NBool.getNull();
			String sqlcityStateCursor = "SELECT GTVZIPC_CITY, GTVZIPC_STAT_CODE, GTVZIPC_NATN_CODE, GTVZIPC_CNTY_CODE " +
	" FROM GTVZIPC " +
	" WHERE GTVZIPC_CODE = :P_ZIP_IN ";
			DataCursor cityStateCursor = new DataCursor(sqlcityStateCursor);
			String sqlcityStateDefaultCursor = "SELECT GTVZIPC_CITY, GTVZIPC_STAT_CODE, GTVZIPC_NATN_CODE, GTVZIPC_CNTY_CODE " +
	" FROM GTVZIPC " +
	" WHERE SUBSTR(GTVZIPC_CODE, 1, :P_DEFAULT_LENGTH) = SUBSTR(:P_ZIP_IN, 1, :P_DEFAULT_LENGTH) ";
			DataCursor cityStateDefaultCursor = new DataCursor(sqlcityStateDefaultCursor);
			{
				NNumber myCount = toNumber(0);
				try {
					// 
					//  Count the number of exact hits.
					// 
					String sql1 = "SELECT COUNT(GTVZIPC_CODE) " +
	" FROM GTVZIPC " +
	" WHERE GTVZIPC_CODE = :P_ZIP_IN ";
					DataCommand command1 = new DataCommand(sql1);
					//Setting query parameters
					command1.addParameter("P_ZIP_IN", zipIn.val);
					ResultSet results1 = command1.executeQuery();
					rowCount = command1.getRowCount();
					if ( results1.hasData() ) {
						myCount = results1.getNumber(0);
					}
					results1.close();
					// 
					//  If only one hit, fetch it and return to calling routine.
					// 
					if ( myCount.equals(1) )
					{
						//Setting query parameters
						cityStateCursor.addParameter("P_ZIP_IN", zipIn.val);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable cityStateCursor.
						cityStateCursor.open();
						ResultSet cityStateCursorResults = cityStateCursor.fetchInto();
						if ( cityStateCursorResults != null ) {
							cityOut.val = cityStateCursorResults.getStr(0);
							stateOut.val = cityStateCursorResults.getStr(1);
							natnOut.val = cityStateCursorResults.getStr(2);
							cntyOut.val = cityStateCursorResults.getStr(3);
						}
						if ( cityStateCursor.notFound() )
						{
							cityStateCursor.close();
						}
						else {
							cityStateCursor.close();
							return  toBool(((NBool.False)));
						}
					}
					// 
					//  Either none or more than one exist so do another count
					//  using the default length and use the like command.
					// 
					myCount = toNumber(0);
					String sql2 = "SELECT COUNT(GTVZIPC_CODE) " +
	" FROM GTVZIPC " +
	" WHERE SUBSTR(GTVZIPC_CODE, 1, :P_DEFAULT_LENGTH) = SUBSTR(:P_ZIP_IN, 1, :P_DEFAULT_LENGTH) ";
					DataCommand command2 = new DataCommand(sql2);
					//Setting query parameters
					command2.addParameter("P_DEFAULT_LENGTH", defaultLength);
					command2.addParameter("P_ZIP_IN", zipIn.val);
					ResultSet results2 = command2.executeQuery();
					rowCount = command2.getRowCount();
					if ( results2.hasData() ) {
						myCount = results2.getNumber(0);
					}
					results2.close();
					// 
					if ( myCount.equals(1) )
					{
						//Setting query parameters
						cityStateDefaultCursor.addParameter("P_DEFAULT_LENGTH", defaultLength);
						cityStateDefaultCursor.addParameter("P_ZIP_IN", zipIn.val);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable cityStateDefaultCursor.
						cityStateDefaultCursor.open();
						ResultSet cityStateDefaultCursorResults = cityStateDefaultCursor.fetchInto();
						if ( cityStateDefaultCursorResults != null ) {
							cityOut.val = cityStateDefaultCursorResults.getStr(0);
							stateOut.val = cityStateDefaultCursorResults.getStr(1);
							natnOut.val = cityStateDefaultCursorResults.getStr(2);
							cntyOut.val = cityStateDefaultCursorResults.getStr(3);
						}
						cityStateDefaultCursor.close();
						return  toBool(((NBool.False)));
					}
					else {
						//  Defect 1-143HWB - do not return any values if multiple zips exist
						//       OPEN CITY_STATE_DEFAULT_CURSOR;
						//       FETCH CITY_STATE_DEFAULT_CURSOR INTO
						//             CITY_OUT, STATE_OUT, NATN_OUT, CNTY_OUT;
						//       IF CITY_STATE_DEFAULT_CURSOR%NOTFOUND THEN
						cityOut.val = toStr("");
						stateOut.val = toStr("");
						natnOut.val = toStr("");
						cntyOut.val = toStr("");
						//         CLOSE CITY_STATE_DEFAULT_CURSOR;
						return  toBool(((NBool.True)));
					}
				}
				finally{
					cityStateCursor.close();
					cityStateDefaultCursor.close();
				}
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_CHECK_VALUE
	/*
	PROCEDURE G$_CHECK_VALUE (CONDITION BOOLEAN, STRING VARCHAR2, RAISE_BOOL BOOLEAN, 
                          CHKNULL   BOOLEAN := FALSE) IS
--
-- Checks passed string for null value.
--
BEGIN
  IF NVL(CONDITION, CHKNULL) THEN
    IF STRING IS NOT NULL THEN
      MESSAGE(STRING);
    END IF;
    IF RAISE_BOOL THEN
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param condition
		* @param _string
		* @param raiseBool
		*/
		
		public void gCheckValue(boolean condition, NString _string, NBool raiseBool) {
			gCheckValue(toBool(condition), _string, raiseBool, toBool(NBool.False));
		}
		public void gCheckValue(NBool condition, NString _string, NBool raiseBool) {
			gCheckValue(condition, _string, raiseBool, toBool(NBool.False));
		}
		
		public void gCheckValue(boolean condition, NString _string, NBool raiseBool, NBool chknull) {
			gCheckValue(toBool(condition), _string, raiseBool, chknull);
			
		}
		
		public void gCheckValue(NBool condition, NString _string, NBool raiseBool, NBool chknull) {
			gCheckValue(condition, _string, raiseBool, toBool(NBool.False), toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param condition
		* @param _string
		* @param raiseBool
		* @param chknull
		*/
		public void gCheckValue(NBool condition, NString _string, NBool raiseBool, NBool chknull, NBool isWarning)
		{
			if ( isNull(condition, chknull).isTrue() )
			{
				if ( !_string.isNull() )
				{
					if ( raiseBool.getValue())
						errorMessage(_string);
					else if(isWarning.getValue())
						warningMessage(_string);
					else
						message(_string);
				}
				if ( raiseBool.getValue() )
				{
					throw new ApplicationException();
				}
			}
		}
		
		public void gCheckValue(NBool condition, NString _string, NBool raiseBool, NBool chknull, PopUpMessageType type)
		{
			if ( isNull(condition, chknull).isTrue() )
			{
				if ( !_string.isNull() )
				{
					if ( type == PopUpMessageType.ERROR )
						errorMessage(_string);
					else if( type == PopUpMessageType.WARNING )
						warningMessage(_string);
					else if( type == PopUpMessageType.MESSAGE )
						message(_string);
					else if( type == PopUpMessageType.INFO )
						infoMessage(_string);
				}
				if ( raiseBool.getValue() )
				{
					throw new ApplicationException();
				}
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_CHECK_STATUS_QUERY
	/*
	PROCEDURE G$_CHECK_STATUS_QUERY IS
--
-- USED TO CHECK WHETHER THE MOST-RECENTLY EXECUTED BUILT-IN
-- HAS SUCCEEDED (COMMIT_FORM OR POST).
--
BEGIN
  IF NAME_IN('SYSTEM.FORM_STATUS') <> 'QUERY' THEN
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gCheckStatusQuery()
		{
			if ( toStr(getTaskStatus()).notEquals("QUERY") )
			{
				throw new ApplicationException();
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_CHECK_QUERY_MODE
	/*
	PROCEDURE G$_CHECK_QUERY_MODE IS
--
-- Sets Global to One if form is in query mode; else zero.
--
BEGIN
  IF NAME_IN('SYSTEM.MODE') = 'NORMAL' THEN
    COPY('0','GLOBAL.QUERY_MODE');
  ELSE
    COPY('1','GLOBAL.QUERY_MODE');
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gCheckQueryMode()
		{
			if ( getMode().equals("NORMAL") )
			{
				copy("0","GLOBAL.QUERY_MODE");
			}
			else {
				copy("1","GLOBAL.QUERY_MODE");
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_CHECK_IF_DUP_PIDM
	/*
	PROCEDURE G$_CHECK_IF_DUP_PIDM(PIDM IN OUT NUMBER) IS
--
-- Checks for duplicate PIDM condition.
--
BEGIN
  IF G$_DUPLICATE_PIDM(PIDM) THEN 
    MESSAGE(G$_NLS.Get('GOQRPLS-0004','LIB','*ERROR* Duplicate Generated PIDM. See General Tech. Reference Manual - SOBSEQN.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pidm
		*/
		public void gCheckIfDupPidm(Ref<NNumber> pidm)
		{
			if ( gDuplicatePidm(pidm.val).getValue() )
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0004"), toStr("LIB"), toStr("*ERROR* Duplicate Generated PIDM. See General Tech. Reference Manual - SOBSEQN.")));
				throw new ApplicationException();
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_CHECK_FAILURE
	/*
	PROCEDURE G$_CHECK_FAILURE IS
--
-- Checks for Form Success.
--
BEGIN
  IF NOT FORM_SUCCESS THEN
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gCheckFailure()
		{
//			if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//			{
//				// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//				throw new ApplicationException();
//			}
			try{
				   if (Boolean.FALSE.equals(InteractionManager.getInteractionState().getAttribute(Task.FORM_SUCESS))
						   || Boolean.TRUE.equals(InteractionManager.getInteractionState().getAttribute(Task.TASK_EVENT_FAILURE))){
				    
				    throw new ApplicationException();
				   }
			}finally {
				    InteractionManager.getInteractionState().removeAttribute(Task.FORM_SUCESS);
				    InteractionManager.getInteractionState().removeAttribute(Task.TASK_EVENT_FAILURE);
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_CHECK_ACCESS
	/*
	FUNCTION G$_CHECK_ACCESS (OBJECT  VARCHAR2, 
                          USER_ID VARCHAR2 := USER) RETURN BOOLEAN IS
--
-- This is a new function to check whether a user is authorized
-- to access a program/process via job submission. 
--
BEGIN
  IF G$_CHK_AUTH.G$_CHECK_AUTHORIZATION_FNC(OBJECT,USER_ID) = 'YES' THEN
    RETURN(TRUE);
  END IF;
  RETURN(FALSE);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		*/
		public NBool gCheckAccess(NString _object) {
			return gCheckAccess(_object, getUser());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param userId
		*/
		public NBool gCheckAccess(NString _object, NString userId)
		{
			if ( GChkAuth.gCheckAuthorizationFnc(_object, userId).equals("YES") )
			{
				return  toBool(((NBool.True)));
			}
			return  toBool(((NBool.False)));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_BUTTON_PROC
	/*
	PROCEDURE G$_BUTTON_PROC IS
--
-- This is a generic button procedure. It reads the NAME of the button and 
-- performs a DO_KEY(item_name).
-- Regarding QUERY-operation:
-- if there are buttons called EXECUTE_QUERY and CANCEL_QUERY, this function shows
-- them, when the ENTER_QUERY button is pressed and hides them, when EXECUTE_- or 
-- CANCEL_QUERY ispressed. No error should be returned, if these buttons do not exist.
-- To make naming of the buttons easier, EXIT, QUIT and EXIT_FORM all perform exit_form,
-- even if the form is in ENTER-QUERY mode !!!!!!!
-- A CANCEL_QUERY button-name cancels a currently "open" query.
--
  action varchar(80);

-- disable a button (for ENTER_-, EXECUTE_- or CANCEL_QUERY)
  PROCEDURE show_off(item_name VARCHAR2) IS
  BEGIN
    IF NOT Id_Null(Find_Item(item_name)) THEN
      Set_Item_Property(item_name,ENABLED,PROPERTY_FALSE);
    END IF;
  END;

-- try to show a button (for the two query-states. If there is no button to show,
-- return FALSE to the calling procedure.
  FUNCTION show_on(item_name VARCHAR2) RETURN BOOLEAN IS
  BEGIN
    IF NOT Id_Null(Find_Item(item_name)) THEN
      Set_Item_Property(item_name,ENABLED,PROPERTY_TRUE);
      RETURN TRUE;
    ELSE
      RETURN FALSE;
    END IF;
  RETURN NULL; END;

BEGIN    
  COPY('25','SYSTEM.MESSAGE_LEVEL');
  action := GET_ITEM_PROPERTY(NAME_IN('SYSTEM.TRIGGER_ITEM'),ITEM_NAME);
  COPY('0','SYSTEM.MESSAGE_LEVEL');

  IF action = 'ENTER_QUERY' THEN
--
-- only hide the ENTER_QUERY button, if there are EXECUTE_QUERY and (!!) CANCEL_QUERY
-- buttons. Otherwise an existing EXECUTE_QUERY button will be shown.
--
    IF show_on('EXECUTE_QUERY') AND show_on('CANCEL_QUERY') THEN
--      show_off('ENTER_QUERY');
      NULL;
    END IF;
--
  ELSIF action IN ('EXIT_FORM', 'EXIT','QUIT') THEN
    action := 'EXIT_FORM';
    IF NAME_IN('SYSTEM.MODE')='ENTER-QUERY' THEN
      DO_KEY('EXIT_FORM');
    END IF;
--
  ELSIF action = 'CANCEL_QUERY' THEN 
    IF NAME_IN('SYSTEM.MODE') != 'ENTER-QUERY' THEN
      G$_INVALID_FUNCTION_MSG;
      RETURN;
    ELSE
      action := 'EXIT_FORM';
    END IF;
  END IF;
  Do_Key(action);
--
  IF NAME_IN('SYSTEM.MODE') != 'ENTER-QUERY' THEN
    IF show_on('ENTER_QUERY') THEN
--      show_off('EXECUTE_QUERY');
--      show_off('CANCEL_QUERY');
      NULL;
    END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gButtonProc()
		{
			// 
			//  This is a generic button procedure. It reads the NAME of the button and 
			//  performs a DO_KEY(item_name).
			//  Regarding QUERY-operation:
			//  if there are buttons called EXECUTE_QUERY and CANCEL_QUERY, this function shows
			//  them, when the ENTER_QUERY button is pressed and hides them, when EXECUTE_- or 
			//  CANCEL_QUERY ispressed. No error should be returned, if these buttons do not exist.
			//  To make naming of the buttons easier, EXIT, QUIT and EXIT_FORM all perform exit_form,
			//  even if the form is in ENTER-QUERY mode !!!!!!!
			//  A CANCEL_QUERY button-name cancels a currently "open" query.
			// 
			NString action= NString.getNull();
			// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '25'
			try { 
				MessageServices.setMessageLevel(MessageLevel.NONE);
				action = getItemName(getTriggerItem());
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
			} finally {
				MessageServices.resetMessageLevel();
			}
						
			if ( action.equals("ENTER_QUERY") )
			{
				// 
				//  only hide the ENTER_QUERY button, if there are EXECUTE_QUERY and (!!) CANCEL_QUERY
				//  buttons. Otherwise an existing EXECUTE_QUERY button will be shown.
				// 
				if ( GButtonProc_showOn_Local(toStr("EXECUTE_QUERY")).getValue() && GButtonProc_showOn_Local(toStr("CANCEL_QUERY")).getValue() )
				{
					//       show_off('ENTER_QUERY');
				}
			}
			else if ( in(action, "EXIT_FORM", "EXIT", "QUIT").getValue() ) {
				action = toStr("EXIT_FORM");
				if ( getMode().equals("ENTER-QUERY") )
				{
					executeAction("EXIT");
				}
			}
			else if ( action.equals("CANCEL_QUERY") ) {
				if ( getMode().notEquals("ENTER-QUERY") )
				{
					gInvalidFunctionMsg();
					return ;
				}
				else {
					action = toStr("EXIT_FORM");
				}
			}
			// F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
			//			SupportClasses.SQLFORMS.DoKey(action);
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
			
			
			// 
			if ( getMode().notEquals("ENTER-QUERY") )
			{
				if ( GButtonProc_showOn_Local(toStr("ENTER_QUERY")).getValue() )
				{
					//       show_off('EXECUTE_QUERY');
					//       show_off('CANCEL_QUERY');
				}
			}
		}
/* <p>
		*  disable a button (for ENTER_-, EXECUTE_- or CANCEL_QUERY)
		* F2J_PURE_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itemName
		*/
		public void GButtonProc_showOff_Local(NString itemName)
		{
			if ( !(findItem(itemName) == null) )
			{
				setItemEnabled(itemName, false);
			}
		}
/* <p>
		*  try to show a button (for the two query-states. If there is no button to show,
		*  return FALSE to the calling procedure.
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itemName
		*/
		public NBool GButtonProc_showOn_Local(NString itemName)
		{
			if ( !(findItem(itemName) == null) )
			{
				setItemEnabled(itemName, true);
				return  toBool(NBool.True);
			}
			else {
				return  toBool(NBool.False);
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_BUILD_FULL_NAME
	/*
	PROCEDURE G$_BUILD_FULL_NAME(
  p_FULL_NAME    IN OUT VARCHAR2,
  p_LAST_NAME    IN     SPRIDEN.SPRIDEN_LAST_NAME%TYPE,
  p_FIRST_NAME   IN     SPRIDEN.SPRIDEN_FIRST_NAME%TYPE,
  p_MI_NAME      IN     SPRIDEN.SPRIDEN_MI%TYPE,
  p_NAME_PREFIX  IN     SPBPERS.SPBPERS_NAME_PREFIX%TYPE,
  p_NAME_SUFFIX  IN     SPBPERS.SPBPERS_NAME_SUFFIX%TYPE,
  p_NAME_LEN     IN     INTEGER  DEFAULT 60,
  p_SURNAME_PREFIX IN   SPRIDEN.SPRIDEN_SURNAME_PREFIX%TYPE DEFAULT NULL) IS
--
-- Local variables
--
  lv_form_name          VARCHAR2(30) := UPPER(GET_APPLICATION_PROPERTY(CURRENT_FORM_NAME));
  lv_form_prefix        VARCHAR2(1)  := SUBSTR(lv_form_name, 1, 1);
--  lv_full_name          VARCHAR2(230):= '';
  lv_full_name          VARCHAR2(300):= '';
  lv_temp_name          VARCHAR2(300):= '';
  lv_extra_len          NUMBER;
  lv_mi_len             NUMBER;
  lv_mi                 SPRIDEN.SPRIDEN_MI%TYPE;
  lv_SURNAME_PREFIX     SPRIDEN.SPRIDEN_SURNAME_PREFIX%TYPE;
  lv_display            VARCHAR2(01);
--
BEGIN
  p_FULL_NAME := '';
  lv_SURNAME_PREFIX := p_SURNAME_PREFIX;
  DEFAULT_VALUE('?','GLOBAL.DISPLAY_SURNAME_PREFIX');
  lv_display := NAME_IN('GLOBAL.DISPLAY_SURNAME_PREFIX');
--
  IF lv_SURNAME_PREFIX IS NOT NULL THEN
  	IF lv_display = '?' THEN
  		lv_display := GB_DISPLAYMASK.F_SSB_FORMAT_NAME();
      COPY(lv_display, 'GLOBAL.DISPLAY_SURNAME_PREFIX');
    END IF;
    IF lv_display = 'N' THEN
    	lv_SURNAME_PREFIX := NULL;
    END IF;
  END IF;
--
-- Finance and common forms exception
--
  IF (lv_form_prefix = 'F' AND lv_form_name NOT IN ('FTMCARD','FAICARD','FAAINVT'))
  OR (lv_form_prefix = 'S' 
      AND lv_form_name NOT IN ('SOADDRQ','SOAHOLD','SOAIGEO','SOQHOLD', 
                               'SHACOMI','SHICMBQ','SHICMID','SLAEVNT')) THEN
--
-- These exceptions will become obsolete when customized name format option is 
-- available in future release.
--
    IF lv_SURNAME_PREFIX IS NOT NULL THEN
    	lv_full_name := lv_SURNAME_PREFIX || ' ' || p_LAST_NAME;
    ELSE
      lv_full_name := p_LAST_NAME;
    END IF;
--
    IF p_FIRST_NAME IS NOT NULL THEN
      lv_full_name := lv_full_name||', '||p_FIRST_NAME;
    END IF;
--
    IF p_MI_NAME IS NOT NULL THEN
      lv_full_name := lv_full_name||' '||SUBSTR(p_MI_NAME,1,1) || '.';
    END IF;
  ELSE
    IF p_NAME_PREFIX IS NOT NULL THEN
      lv_full_name := p_NAME_PREFIX||' ';
    END IF;
--
    IF p_FIRST_NAME IS NOT NULL THEN
      lv_full_name := lv_full_name||p_FIRST_NAME||' ';
    END IF;
--
-- If the surname prefix is present, we want to make sure we can still include
-- the middle name in the desired length. If not, we will truncate the middle name
-- so that it will all fit
--
    IF p_MI_NAME IS NOT NULL THEN
      IF lv_SURNAME_PREFIX IS NULL THEN
        lv_full_name := lv_full_name||p_MI_NAME||' ';
      ELSE
      	lv_temp_name := lv_full_name||p_MI_NAME||' '|| lv_SURNAME_PREFIX || ' ' || p_LAST_NAME;
        IF p_NAME_SUFFIX IS NOT NULL THEN
          lv_temp_name := lv_temp_name||', '||p_NAME_SUFFIX;
        END IF;
        IF LENGTH(lv_temp_name) > p_NAME_LEN THEN
        	lv_extra_len := LENGTH(lv_temp_name) - p_NAME_LEN;
        	lv_mi_len := LENGTH(p_MI_NAME) + 1; --need to count concatenated space
        	if lv_mi_len > lv_extra_len THEN
        		lv_mi := RTRIM(SUBSTR(p_MI_NAME, 1, lv_mi_len - lv_extra_len - 1));
        	ELSE
        		lv_mi := NULL;
        	END IF;
        	IF lv_mi IS NOT NULL THEN
        		lv_full_name := lv_full_name||p_MI_NAME||' ';
        	END IF;
        ELSE
        	lv_full_name := lv_full_name||p_MI_NAME||' ';
        END IF;
      END IF;
    END IF;
--
    IF lv_SURNAME_PREFIX IS NOT NULL THEN
    	lv_full_name := lv_full_name || lv_SURNAME_PREFIX || ' ' || p_LAST_NAME;
    ELSE
      lv_full_name := lv_full_name || p_LAST_NAME;
    END IF;
--
    IF p_NAME_SUFFIX IS NOT NULL THEN
      lv_full_name := lv_full_name||', '||p_NAME_SUFFIX;
    END IF;
  END IF;    
--
  IF p_NAME_LEN IS NOT NULL THEN
    p_FULL_NAME := SUBSTR(lv_full_name, 1, p_NAME_LEN);
  ELSE
    p_FULL_NAME := lv_full_name;
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pFullName
		* @param pLastName
		* @param pFirstName
		* @param pMiName
		* @param pNamePrefix
		* @param pNameSuffix
		*/
		public void gBuildFullName(Ref<NString> pFullName, NString pLastName, NString pFirstName, NString pMiName, NString pNamePrefix, NString pNameSuffix) {
			gBuildFullName(pFullName, pLastName, pFirstName, pMiName, pNamePrefix, pNameSuffix, toInt(60), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pFullName
		* @param pLastName
		* @param pFirstName
		* @param pMiName
		* @param pNamePrefix
		* @param pNameSuffix
		* @param pNameLen
		*/
		public void gBuildFullName(Ref<NString> pFullName, NString pLastName, NString pFirstName, NString pMiName, NString pNamePrefix, NString pNameSuffix, NInteger pNameLen) {
			gBuildFullName(pFullName, pLastName, pFirstName, pMiName, pNamePrefix, pNameSuffix, pNameLen, NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pFullName
		* @param pLastName
		* @param pFirstName
		* @param pMiName
		* @param pNamePrefix
		* @param pNameSuffix
		* @param pNameLen
		* @param pSurnamePrefix
		*/
		public void gBuildFullName(Ref<NString> pFullName, NString pLastName, NString pFirstName, NString pMiName, NString pNamePrefix, NString pNameSuffix, NInteger pNameLen, NString pSurnamePrefix)
		{
			// 
			//  Local variables
			// 
			NString lvFormName = upper(getCurrentTaskName());
			NString lvFormPrefix = substring(lvFormName, toInt(1), toInt(1));
			//   lv_full_name          VARCHAR2(230):= '';
			NString lvFullName = toStr("");
			NString lvTempName = toStr("");
			NNumber lvExtraLen= NNumber.getNull();
			NNumber lvMiLen= NNumber.getNull();
			NString lvMi= NString.getNull();
			NString lvSurnamePrefix= NString.getNull();
			NString lvDisplay= NString.getNull();
			pFullName.val = toStr("");
			lvSurnamePrefix = pSurnamePrefix;
			setDefaultValue("?", "GLOBAL.DISPLAY_SURNAME_PREFIX");
			lvDisplay = getNameIn("GLOBAL.DISPLAY_SURNAME_PREFIX");
			// 
			if ( !lvSurnamePrefix.isNull() )
			{
				if ( lvDisplay.equals("?") )
				{
					lvDisplay = GbDisplaymask.fSsbFormatName();
					copy(lvDisplay,"GLOBAL.DISPLAY_SURNAME_PREFIX");
				}
				if ( lvDisplay.equals("N") )
				{
					lvSurnamePrefix = toStr(null);
				}
			}
			// 
			//  Finance and common forms exception
			// 
			if ( (lvFormPrefix.equals("F") && !in(lvFormName, "FTMCARD", "FAICARD", "FAAINVT").getValue()) || (lvFormPrefix.equals("S") && !in(lvFormName, "SOADDRQ", "SOAHOLD", "SOAIGEO", "SOQHOLD", "SHACOMI", "SHICMBQ", "SHICMID", "SLAEVNT").getValue()) )
			{
				// 
				//  These exceptions will become obsolete when customized name format option is 
				//  available in future release.
				// 
				if ( !lvSurnamePrefix.isNull() )
				{
					lvFullName = lvSurnamePrefix.append(" ").append(pLastName);
				}
				else {
					lvFullName = pLastName;
				}
				// 
				if ( !pFirstName.isNull() )
				{
					lvFullName = lvFullName.append(", ").append(pFirstName);
				}
				// 
				if ( !pMiName.isNull() )
				{
					lvFullName = lvFullName.append(" ").append(substring(pMiName, toInt(1), toInt(1))).append(".");
				}
			}
			else {
				if ( !pNamePrefix.isNull() )
				{
					lvFullName = pNamePrefix.append(" ");
				}
				// 
				if ( !pFirstName.isNull() )
				{
					lvFullName = lvFullName.append(pFirstName).append(" ");
				}
				// 
				//  If the surname prefix is present, we want to make sure we can still include
				//  the middle name in the desired length. If not, we will truncate the middle name
				//  so that it will all fit
				// 
				if ( !pMiName.isNull() )
				{
					if ( lvSurnamePrefix.isNull() )
					{
						lvFullName = lvFullName.append(pMiName).append(" ");
					}
					else {
						lvTempName = lvFullName.append(pMiName).append(" ").append(lvSurnamePrefix).append(" ").append(pLastName);
						if ( !pNameSuffix.isNull() )
						{
							lvTempName = lvTempName.append(", ").append(pNameSuffix);
						}
						if ( length(lvTempName).greater(pNameLen) )
						{
							lvExtraLen = toNumber(length(lvTempName).subtract(pNameLen));
							lvMiLen = toNumber(length(pMiName).add(1));
							// need to count concatenated space
							if ( lvMiLen.greater(lvExtraLen) )
							{
								lvMi = rtrim(substring(pMiName, toInt(1), toInt(lvMiLen.subtract(lvExtraLen).subtract(1))));
							}
							else {
								lvMi = toStr(null);
							}
							if ( !lvMi.isNull() )
							{
								lvFullName = lvFullName.append(pMiName).append(" ");
							}
						}
						else {
							lvFullName = lvFullName.append(pMiName).append(" ");
						}
					}
				}
				// 
				if ( !lvSurnamePrefix.isNull() )
				{
					lvFullName = lvFullName.append(lvSurnamePrefix).append(" ").append(pLastName);
				}
				else {
					lvFullName = lvFullName.append(pLastName);
				}
				// 
				if ( !pNameSuffix.isNull() )
				{
					lvFullName = lvFullName.append(", ").append(pNameSuffix);
				}
			}
			// 
			if ( !pNameLen.isNull() )
			{
				pFullName.val = substring(lvFullName, toInt(1), pNameLen);
			}
			else {
				pFullName.val = lvFullName;
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_BTN_PRESSED
	/*
	PROCEDURE G$_BTN_PRESSED IS
   ITEM_ID           ITEM;
   AL_BUT            NUMBER;
   CUR_ITEM          VARCHAR2(100) := NAME_IN('SYSTEM.TRIGGER_ITEM');
--
-- Executes Built-in subprogram associated with appropriate button.
--
BEGIN
  IF INSTR(CUR_ITEM,'ROLLBACK') > 0 THEN
    DO_KEY ('CLEAR_FORM');
    G$_CHECK_FAILURE;      
  ELSIF INSTR(CUR_ITEM,'SAVE') > 0 THEN
    DO_KEY ('COMMIT_FORM');
    G$_CHECK_FAILURE;      
  ELSIF INSTR(CUR_ITEM,'EXITVALUE') > 0 THEN
    DO_KEY ('NEXT_KEY');
    G$_CHECK_FAILURE;      
  ELSIF INSTR(CUR_ITEM,'EXIT') > 0 THEN
    DO_KEY('EXIT_FORM');
    G$_CHECK_FAILURE;      
  ELSIF INSTR(CUR_ITEM,'ENTQRY') > 0 THEN
    DO_KEY('ENTER_QUERY');
    G$_CHECK_FAILURE;      
  ELSIF INSTR(CUR_ITEM,'EXEQRY') > 0 THEN
    DO_KEY('EXECUTE_QUERY');
    G$_CHECK_FAILURE;      
  ELSIF INSTR(CUR_ITEM,'NXTBLK') > 0 THEN
    DO_KEY('NEXT_BLOCK');
    G$_CHECK_FAILURE;      
  ELSIF INSTR(CUR_ITEM,'PRVBLK') > 0 THEN
    DO_KEY('PREVIOUS_BLOCK');
    G$_CHECK_FAILURE;      
--
-- 5300-01  Do not process BXS icon pressing here.
--
  ELSIF GET_ITEM_PROPERTY(cur_item, LABEL) = 'Banner XtenderSolutions' THEN
  	NULL;
--
-- Processing INB bookshelf icon here.
-- 
  ELSIF GET_ITEM_PROPERTY(cur_item, ICON_NAME) = 'book' THEN
    NULL;
--
  ELSIF INSTR(CUR_ITEM,'_LBT') > 0 THEN 
    ITEM_ID := FIND_ITEM(NAME_IN('SYSTEM.CURSOR_BLOCK') ||
               SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
                 INSTR(CUR_ITEM,'_LBT') - 1 - INSTR(CUR_ITEM,'.') + 1));
--
    IF ID_NULL(ITEM_ID) THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0002','LIB','*ERROR* LOV button is outside the current block.'));
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
-- If item is not enabled, exit.
--
    IF GET_ITEM_PROPERTY(ITEM_ID,ENABLED) = 'FALSE' THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0003','LIB','*ERROR* Item associated with this button is not enabled.'));
      RETURN;
    END IF;
--
    GO_ITEM(ITEM_ID);
    G$_CHECK_FAILURE;       
--
    DO_KEY('LIST_VALUES');
    G$_CHECK_FAILURE;      
  END IF; 
END;
	*/
	/* <p>
/* </p>
		*/
		public void gBtnPressed()
		{
			ItemDescriptor itemId= null;
			NNumber alBut= NNumber.getNull();
			NString curItem = getTriggerItem();
			if ( inStr(curItem, toStr("ROLLBACK")).greater(0) )
			{
				executeAction("CLEAR_FORM");
				gCheckFailure();
			}
			else if ( inStr(curItem, toStr("SAVE")).greater(0) ) {
				executeAction("SAVE");
				gCheckFailure();
			}
			else if ( inStr(curItem, toStr("EXITVALUE")).greater(0) ) {
				// F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin13".
				//				SupportClasses.SQLFORMS.DoKey("NEXT_KEY");
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin13'.");
				
				
				gCheckFailure();
			}
			else if ( inStr(curItem, toStr("EXIT")).greater(0) ) {
				executeAction("EXIT");
				gCheckFailure();
			}
			else if ( inStr(curItem, toStr("ENTQRY")).greater(0) ) {
				executeAction("SEARCH");
				gCheckFailure();
			}
			else if ( inStr(curItem, toStr("EXEQRY")).greater(0) ) {
				executeAction("EXECUTE_QUERY");
				gCheckFailure();
			}
			else if ( inStr(curItem, toStr("NXTBLK")).greater(0) ) {
				executeAction("NEXT_BLOCK");
				gCheckFailure();
			}
			else if ( inStr(curItem, toStr("PRVBLK")).greater(0) ) {
				executeAction("PREVIOUS_BLOCK");
				gCheckFailure();
			}
			else if ( getItemLabel(curItem).equals("Banner XtenderSolutions") ) {
			}
			else if ( getItemIcon(curItem).equals("book") ) {
			}
			else if ( inStr(curItem, toStr("_LBT")).greater(0) ) {
				itemId = findItem(getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_LBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1))));

				if ( (itemId == null) )
				{
					errorMessage(GNls.Fget(toStr("GOQRPLS-0002"), toStr("LIB"), toStr("*ERROR* LOV button is outside the current block.")));
					throw new ApplicationException();
				}
				// 
				//  If item is not enabled, exit.
				// 
				if ( getItemEnabled(itemId).equals("FALSE") )
				{
					errorMessage(GNls.Fget(toStr("GOQRPLS-0003"), toStr("LIB"), toStr("*ERROR* Item associated with this button is not enabled.")));
					return ;
				}
				// This validation cannot be fired when none navigable buttons triggered action #ELLBHR-11305
//				// 
//				//MORPHIS TODO : remove when set value marks item invalid
//				setItemIsValid(itemId, false);
//				if(findItem(getCursorField()) != itemId && !validateCurrentItem())
//				{
//					throw new ValidationException();
//				}
				BannerServices.goItem(itemId);
				gCheckFailure();
				//MORPHIS: TO REMOVE when trigger execution fires on navigation and autoskip implmented
				if (getCurrentTask().getNavigationModel() instanceof KeyBlockNavigationModel)
				{
					KeyBlockNavigationModel navModel = (KeyBlockNavigationModel)getCurrentTask().getNavigationModel();
					navModel.doNavigation();
				}
				
				// 
				executeAction("LIST_VALUES");
				gCheckFailure();
			}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_BLOCK_EXISTS
	/*
	FUNCTION G$_BLOCK_EXISTS (bk_name VARCHAR2) RETURN BOOLEAN IS
--
-- This is used in the menu choice EXTRACTK under BLOCK and in the
-- G$_MENU_BAR.REGULAR_MENU_SET routine.
--
  bk_id BLOCK;
BEGIN
  bk_id := FIND_BLOCK(bk_name);
  RETURN (NOT ID_NULL(bk_id));
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param bkName
		*/
		public NBool gBlockExists(NString bkName)
		{
			// 
			//  This is used in the menu choice EXTRACTK under BLOCK and in the
			//  G$_MENU_BAR.REGULAR_MENU_SET routine.
			// 
			BlockDescriptor bkId= null;
			bkId = findBlock(bkName);
			return (toBool(!(bkId == null)));
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.G$_ADD_TO_PERSONAL_MENU
	/*
	PROCEDURE G$_ADD_TO_PERSONAL_MENU IS
  lv_form_name  VARCHAR2(30) := NAME_IN('SYSTEM.CURRENT_FORM');
  lv_form_found VARCHAR2(1)  := '';
  lv_hold_q     VARCHAR2(1);
  lv_max_seq    GURMENU.GURMENU_SORT_SEQ%TYPE;
--
  CURSOR FIND_PERSONAL_ENTRY IS
    SELECT 'X'
      FROM GURMENU
     WHERE GURMENU_USER_ID = USER
       AND GURMENU_OBJ_NAME = lv_form_name;
--
  CURSOR FIND_MAX_PERSONAL_ENTRY IS
    SELECT MAX(GURMENU_SORT_SEQ)
      FROM GURMENU
     WHERE GURMENU_USER_ID = USER;
--
BEGIN
--
-- If any data changes are pending, don't do this.
--
  IF NAME_IN('SYSTEM.FORM_STATUS') = 'CHANGED' THEN
    MESSAGE(G$_NLS.Get('GOQRPLS-0000','LIB','NOTE: This option is not supported when there are pending changes within the form.'));
  ELSE
--
-- Verify if it is valid to add this object
--
    IF NVL(LENGTH(lv_form_name), 0) = 7 THEN
      lv_hold_q := SUBSTR(lv_form_name,3,1);
    ELSE
      lv_hold_q := SUBSTR(lv_form_name,4,1);
    END IF;
--
    IF lv_hold_q = 'Q' THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0001','LIB','*ERROR* This form can not be called directly, you cannot add this to your menu.'));
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
--
-- Attempt to find custom form name.
--
    OPEN FIND_PERSONAL_ENTRY;
    FETCH FIND_PERSONAL_ENTRY INTO lv_form_found;
    IF FIND_PERSONAL_ENTRY%NOTFOUND THEN
--
-- Not found, so add it.
--
      OPEN FIND_MAX_PERSONAL_ENTRY;
      FETCH FIND_MAX_PERSONAL_ENTRY INTO lv_max_seq;
      CLOSE FIND_MAX_PERSONAL_ENTRY;
--
      IF NVL(lv_max_seq,0) = 0 THEN
      	lv_max_seq := 1;
      ELSE
    	  lv_max_seq := lv_max_seq + 1;
      END IF;
--
      INSERT INTO GURMENU(GURMENU_NAME,
                          GURMENU_OBJ_NAME,
                          GURMENU_SORT_SEQ,
                          GURMENU_USER_ID,
                          GURMENU_ACTIVITY_DATE,
                          GURMENU_DESC)
                   VALUES('*PERSONAL',
                          lv_form_name,
                          lv_max_seq,
                          USER,
                          SYSDATE,
                          '');
--
      COPY('5','SYSTEM.MESSAGE_LEVEL');
      COMMIT;
      COPY('0','SYSTEM.MESSAGE_LEVEL');
--
    END IF;
    CLOSE FIND_PERSONAL_ENTRY;
--
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gAddToPersonalMenu()
		{
			int rowCount = 0;
			NString lvFormName = getCurrentTaskName();
			NString lvFormFound = toStr("");
			NString lvHoldQ= NString.getNull();
			NNumber lvMaxSeq= NNumber.getNull();
			String sqlfindPersonalEntry = "SELECT 'X' " +
	" FROM GURMENU " +
	" WHERE GURMENU_USER_ID = USER AND GURMENU_OBJ_NAME = :P_LV_FORM_NAME ";
			DataCursor findPersonalEntry = new DataCursor(sqlfindPersonalEntry);
			String sqlfindMaxPersonalEntry = "SELECT MAX(GURMENU_SORT_SEQ) " +
	" FROM GURMENU " +
	" WHERE GURMENU_USER_ID = USER ";
			DataCursor findMaxPersonalEntry = new DataCursor(sqlfindMaxPersonalEntry);
			try {
				// 
				//  If any data changes are pending, don't do this.
				// 
				if ( getTaskStatus().equals("CHANGED") )
				{
					infoMessage(GNls.Fget(toStr("GOQRPLS-0000"), toStr("LIB"), toStr("NOTE: This option is not supported when there are pending changes within the form.")));
				}
				else {
					// 
					//  Verify if it is valid to add this object
					// 
					if ( isNull(length(lvFormName), 0).equals(7) )
					{
						lvHoldQ = substring(lvFormName, toInt(3), toInt(1));
					}
					else {
						lvHoldQ = substring(lvFormName, toInt(4), toInt(1));
					}
					// 
					if ( lvHoldQ.equals("Q") )
					{
						errorMessage(GNls.Fget(toStr("GOQRPLS-0001"), toStr("LIB"), toStr("*ERROR* This form can not be called directly, you cannot add this to your menu.")));
						throw new ApplicationException();
					}
					// 
					// 
					//  Attempt to find custom form name.
					// 
					//Setting query parameters
					findPersonalEntry.addParameter("P_LV_FORM_NAME", lvFormName);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable findPersonalEntry.
					findPersonalEntry.open();
					ResultSet findPersonalEntryResults = findPersonalEntry.fetchInto();
					if ( findPersonalEntryResults != null ) {
						lvFormFound = findPersonalEntryResults.getStr(0);
					}
					if ( findPersonalEntry.notFound() )
					{
						// 
						//  Not found, so add it.
						// 
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable findMaxPersonalEntry.
						findMaxPersonalEntry.open();
						ResultSet findMaxPersonalEntryResults = findMaxPersonalEntry.fetchInto();
						if ( findMaxPersonalEntryResults != null ) {
							lvMaxSeq = findMaxPersonalEntryResults.getNumber(0);
						}
						findMaxPersonalEntry.close();
						// 
						if ( isNull(lvMaxSeq, 0).equals(0) )
						{
							lvMaxSeq = toNumber(1);
						}
						else {
							lvMaxSeq = lvMaxSeq.add(1);
						}
						// 
						String sql1 = "INSERT INTO GURMENU " +
	"(GURMENU_NAME, GURMENU_OBJ_NAME, GURMENU_SORT_SEQ, GURMENU_USER_ID, GURMENU_ACTIVITY_DATE, GURMENU_DESC)" +
	"VALUES ('*PERSONAL', :P_LV_FORM_NAME, :P_LV_MAX_SEQ, USER, SYSDATE, '')";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("P_LV_FORM_NAME", lvFormName);
						command1.addParameter("P_LV_MAX_SEQ", lvMaxSeq);
						rowCount = command1.execute();
						// 
						// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
						try { 
							MessageServices.setMessageLevel(MessageLevel.NONE);
							commitTask();
							// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
						} finally {
							MessageServices.resetMessageLevel();
						}
									
					}
					findPersonalEntry.close();
				}
				}finally{
					findPersonalEntry.close();
					findMaxPersonalEntry.close();
				}
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.COPYRIGHT_GOQRPLS
	/*
	PROCEDURE COPYRIGHT_GOQRPLS IS
<multilinecomment>
Copyright 1994-2013 Ellucian Company L.P. and its affiliates. 
</multilinecomment>
BEGIN
  NULL;  
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void copyrightGoqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_MSGKEY_UPDATE
	/*
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GOQRPLS
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Thu Feb 06 08:29:50 2014
-- MSGSIGN : #f5e9bbce9e64428c
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_8_6_4_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_8_6_4_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 8.6.4
CR-000101888 Seamless Navigation
1. TGKinderman 07/29/2013
   Michael Hitrik
   a. Add G$_XE package specification and body. Contains functions and procedures that faciliates call stack values,
      parsing and dirty state (are there changes to commit) commication with the unified Banner menu layer.
      Modify G$_XE.JSON_OUT from using package SOKNSUT to instead using package GOKNSUT.
   b. Add logic to top of G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM to stop exit of runtime if you are at the last form
      in the call stack. This is identified by the calling_form being GUAINIT and the current for being other than
      an "OQMENU" form.  Error message modified to indicate "use the unified menu to exit Banner".
   c. Add logic towards the end of procedure G$_SECURED_FORM_CALL_PL to continue exiting the call stack if GLOBAL.BANNER_XE
      is not null. If this global is not null it will contain the name of the form being launched from the unified Banner menu
      and of which had been previously launched and is found in the call stack.
   d. Add to G$_MENU_BAR logic to control display/non-display 5 addtional mmb menu items in support of Seamless Navigation.
   e. Add to G$_XE 5 procedures called from 5 addtional mmb menu items to call javascript functions
   f. To support list of opened forms, add call to G$_XE.JSON_OPENED_FORM in G$_SECURED_FORM_CALL_PL. Add if
      GLOBAL.BANNER_XE_MODE test wrapper into procedure G$_XE.JSON_OPENED_FORM.
2. Defect 1-1E45N4P
   TGKinderman 08/07/2013
   Add missing G$_NLS.Get to alert message in G$_KEY_OPT_MENU and in G$_GOQOLIB_OPT_BLOCK.KEY_NXT_PRV_REC
   (This modification is not specific to the Seamless Navigation modifications)
3. Modify in support of "unified Sign Out" proper disconnect from database and from Form server.
   TGKinderman 08/26/2013
   a. Modify G$_XE.XE_CONTROLLER within "exit-banner" logic to set GLOBAL.EXIT_BANNER to 'Y'.
   b. Modify G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM to bypass message "Please use the unified menu to exit Banner" if
      GLOBAL.EXIT_BANNER is 'Y'.  If "exit-banner" message is requested do not halt the exit processes.
   c. Modify G$_SECURED_FORM_CALL_PL exit logic to exit entire call stack if GLOBAL.EXIT_BANNER is 'Y' and
      GLOBAL.BANNER_XE_MODE is 'Y'      
4. Establish GUAGMNU in the call stack.
   TGKinderman 12/19/2013
   a. Modify G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM removing message "Please use the unified menu to exit Banner". This halting
      the exit of INB when running form Magellan is shifting, with this modification, to the GUAGMNU form.
   b. Support establishing GUAGMNU within the call stack when INB is launched from unified menu.
      Modify G$_MENU_BAR.REGULAR_MENU_SET to: enable Action.ExitToMenu and disable Action.ExitBanner if XE_MODE.
   c. Modify G$_MENU_BAR.CALLED_BY_MENU_FORM to look at an alternate list of forms if XE_MODE to halt double-click from exiting with value.
   d. Modify G$_XE.XE_CONTROLLER to copy 'Y' to NAV_FRAME_CALL just before G$_SECURED_FORM_CALL to indicate that call is not LISTVAL call
      and will help to set menu item Action.Select as disabled thereby surpressing exit-with-value ability.
   e. Modify G$_SECURED_FORM_CALL_PL "Exit to Menu" logic to exit call form stack when in the initial guainit stack.
5. Establish state manager routines
   TGKinderman 12/20/2013
   a. Add G$_XE_STATE_MANAGER spec and body to controll state of INB call stack
   b. Modify G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM to remove form from the state manager call stack.
   c. Modify G$_SECURED_FORM_CALL_PL to place form on the state manager call stack.
   d. Modify G$_XE_STATE_MANAGER.CHECK_ME by commenting out the debug section of this function. The debug section of this function
      uses a non-deliver table LOG_BANNER_SESSION for debugging purposes.
6. Modify error message when accessing Banner 9 page from INB
   TGKinderman 01/22/2014
   a. Modify error message in G$_SECURED_FORM_CALL_PL to display a different error message if accessing an object that is designated for
      unified menu Banner9 Only (GUBOBJS_UI_VERSION of E) and you are running XE Mode.
   b. Modify G$_XE.SET_MENU_ITEMS to softly remove (visible set to FALSE) menu item Help.HELP_MAG. The unified menu help widget was
      removed with this initial release.
7. Modify JSON_OUT IF logic
   TGKinderman 01/31/2014
   Modify G$_XE.JSON_OUT procedure IF statment to properly test for setting global_context_found to TRUE and thereby controlling
   whether or not a message out of Banner is sent.
         
AUDIT TRAIL END
</multilinecomment>
BEGIN
NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail864Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_8_5_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_8_5_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 8.5
1. LVH 04/20/2011
   RPE 1-EG05J9
   All forms that start with 'K' should be treated as 'finaid' for online help and therefore
   G$_B2K_WIN_HELP was modified to enable this.
   Note: This may have been released as part of 8.4.1 as well.
   
2. LVH 04/20/2011
   Defect 1-AH99OU
   Updated the 'Confidential' and 'Deceased' strings to be internationalized in G$_VALID_ALL_ID.

3. TGKinderman 10/11/2011
   Defect 1-U7U2EV   
   PROBLEM: Using a very old style of tracing that is only invoked if runtime is Windows (WIN32COMMON OS).
   A file b2ktrace.log is created in folder designated by the TEMP environment variable. A majority of this
   old style of tracing was removed previously. Some environments, using OFM11g in WIN32COMMON OS 
   experiencing an inability to create an/or write to this file resulting in multiple runtime error message
   G$TRACE_PKG.TRACE_RTN:G$_SEARCH.POST_TEXT_CODE 3020000: non-ORACLE exception.
   RESOLUTION: In main Begin-End of G$_TRACE_PKG remove assignment of file_name with the value in TEMP
   environment variable. This will leave item file_name as NULL and will prohibit the file b2ktrace.log
   from being created or written to.
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail85Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_8_5_2_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_8_5_2_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 8.5.2
1. Defect 1-156F9LW
   LVH 08/08/2012
   Added 'TREE' to the type of ITEMTYPEs ignored in g$_forms_nls.init_block to make sure that a format mask is
   not applied to a 'TREE' item and thereby generating a 'FRM-41058: No such property for Get_Item_Property' error message.
   This is an issue that will only show up in a non-US date format environment on a form that has a 'tree' item (i.e. GXAPEXE and GXAPEXS)
   
2. RPE 1-106YFAF and 1-10QF0W7
   LVH 08/08/2012
   Added G$_HELP_ALL_FIELDS to enable a 'data extract' of field definitions for all visible fields on a form.

AUDIT TRAIL END
</multilinecomment>
BEGIN
NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail852Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_8_5_1_3_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_8_5_1_3_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 8.5.1.3
1. TGKinderman 07/02/2012
   Defect 1-13FDY05
   Modify G$_SECURED_FORM_CALL_PL (in association with gspauth.sql) to raise error if a user attempts calling an INB form
   object that is set to 'GUAOBJS_UI_VERSION of 'C', which is Banner9 only.  If set to 'C' the INB form is to no longer be
   used and is to not be called.
     
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;  
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail8513Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_8_5_0_1_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_8_5_0_1_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 8.5.0.1
1. TGKinderman 11/22/2011
   Defect 1-10YQNU7
   Those that have installed General 8.4.2.2, installing General 8.5,
   package GUKMENU will be invalid. General 8.4.2.2 is NOT rolling into
   General 8.5. For those that have installed General 8.4.2.2 and are
   installing General 8.5, there are 2 objects (gukmen1.sql and goqrpls.pll)
   that need to be synchronized with the various 8.4.2.2 modifications.
     
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;  
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail8501Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_8_4_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_8_4_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 8.4
1. LVH 10/14/2010
   Defect 1-5J85OF
   All forms that start with 'K' should be treated as 'finaid' for online help and therefore
   G$_B2K_WIN_HELP was modified to enable this.

AUDIT TRAIL END
</multilinecomment>
BEGIN
NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail84Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_8_4_2_2_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_8_4_2_2_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 8.4.2.2
1. RPE 1-SX62DJ 
   TGKinderman 08/22/2011
   Modify G$_MASKS.G$_STARTUP_MASKS in 3 places to bypass certain masking rows. If the gordmsk_block_name is equal
   to the gordmsk_block_comp_name and the gordmsk_column_name is equal to the gordmsk_column_comp_name then this is
   considered a masking rule for "the Horizon application only" and not a masking rule for INB.
     
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;  
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail8422Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_8_4_1_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_8_4_1_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 8.4.1
1. RPE 1-HNVO97 
   TGKinderman 02/08/2011
   Modify the SET_MENU_ITEM_PROPERTY statement in procedure G$_VPDI.SET_VPDI_MENU and G$_SECURED_FORM_CALL_PL that sets the label on
   ICONS.VPDI_EXISTS from "Multi-Insitution not enabled" to "Multi-Entity Processing not enabled" such that tooltip reflects these
   values.  Terminology has changed from Multi-Institution to Mulit-Entity.
     
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;  
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail841Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_8_3_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_8_3_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 8.3
1. LVH 07/03/2009
   Defect 1-5J85OF
   If a name search was too generic and returned more records than the server could handle
   the the following error would be displayed:
     FRM-91021: There was a failure in the Form Server during startup.
   A new GTVSDAX entry has been created (GOQRPLS / SEARCH_MAX) that can be used to limit the
   number of records returned. If no entry is found, then a count of 999,999 will be assumed
   thereby giving the same results as currently being done. If the count of records returned is
   greater than the SEARCH_MAX then the following message will be displayed:
      *ERROR* Too many results returned. Search Limit=nn Matches Found=nn. Results are truncated. 
         Please refine your search criteria. 

2. SA 07/03/2009
   Defect 1-1V1USZ
   When using a quick flow process that is entered from the GUAGMNU form 
   press the <Ctrl> + <Tab> keys while positioned in the key block.  The 
   result is that the GUAGMNU form is displayed and must be minimized to 
   get back to the quickflow process.  This functionality is different  
   entering a form directly  from the menu that is not part of a quick flow. 
   G$QUICKFLOW has been modified to chnage the 'NOHIDE' to 'HIDE' in
     G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),OBJ_NAME,'HIDE');

3. EM 07/03/2009
   Defect 1-143HWB
   G$_CITY_STATE_NATN was modified to return a NULL city, state, natn if multiple occurences
   for a zip code were found instead of just returning one of the instances.

4. TGKinderman 09/23/2009
   Support of AQ alternative communication mechanism to that of DBMS_PIPE.  Support for publishing
   to single consumer queue(s) with a specific payload datatype of g_msg_fragments (message fragments).
   G$_HANDSHAKE_AQ specification and body established for enque from form.
   

AUDIT TRAIL END
</multilinecomment>
BEGIN
NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail83Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_8_3_1_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_8_3_1_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 8.3.1
1. LVH 07/02/2010
   Defect 1-C0X96I
   SDE assumed that the table names in the forms were always upper case and in 
   cases where it was not, the table entry was not being matched.
   Updated G$_sd.f_base_table to return the UPPER table name   
   
2. PV / LVH 07/02/2010
   RPE 1-CDR9EH
   Modified code in G$_VPDI to remove the select 'x' from gtvvpdi.  This was not necessary
   since the function IS_VPDI_ON is already part of the program and was redundant and cause an
   extra trip to the database that was not necessary.    

3. TK / LVH 07/06/2010
   Defect 1-BT201V   
   In the GOQRPLS library routine that walks through the blocks attempting to set them 
   for query only (G$_TAB_SECURITY.G$_WALK_BLOCKS_CHECK_QUERY), there is an exclusion 
   for the block G$_OPT_BLOCK.  Exclude also if the block is designated as a KEY_BLOCK.
   A standard KEY_BLOCK is identified by examining the Block's default where clause for
   the value 'key-block' (As is established in the class G$_KEY_BLOCK_CLASS).
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail831Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_8_2_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_8_2_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 8.2
1. WG  12/05/08
   Migrate 8.1.0.1 to 8.2. 
   
2. LVH 12/12/2008
   Added G$_MASKS.G$_DID_MASK_RESTRICT to determine if a masking rules actually restricted access
   or not.

3. EM 1-31O4PW
   When we roll back the form, the item named 'G$_NAV_BLOCK.HOLD_CURSOR_LOCATION' in G$_NAV_BLOCK
   block also get cleared. Basically this item is used to hold the value of SYSTEM.CURSOR_ITEM.
   When we press F5 again, the form control will go to the item specified in 
   'G$_NAV_BLOCK.HOLD_CURSOR_LOCATION' item by using the following command.
      GO_ITEM(NAME_IN('G$_NAV_BLOCK.HOLD_CURSOR_LOCATION'));
   Since this item 'G$_NAV_BLOCK.HOLD_CURSOR_LOCATION' contains Null value, the form cannot able
   to navigate to specified item. Due to this reason the following error displayed.
      error - unable to resolve reference to item

4. LVH/EM 12/20/2008
   CMS - DFCT81073
   Updated G$_GOQOLIB_KEY_TRIGGER.ON_ERROR to display the Oracle error message text (SQLERRM) if
   if was not present.
   
5. LVH 01/27/2009
   Updated G$_BUILD_FULL_NAME, G$_VALID_ALL_ID, G$_SEL_SPRIDEN_ID_NAME to optionally display
   the surname prefix.
   
6. LVH 03/17/2009
   Updated G$_IDNAME_SEARCH.F_COMPRESS_NAME to call gukcmpr.f_goqrpls_compress_name so that
   we can treat various accented characters as their base letter characters to enable searching.
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail82Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_8_1_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_8_1_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 8.1
1. Migrate 8.0.0.1 Variant version to 8.1 Main Branch version.

2. LVH 07/29/2008
   Defect 1-3MLX1B
   Fixed several G$_NLS.GET statements to conform to ISC standards.  

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail81Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_8_1_0_1_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_8_1_0_1_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 8.1.0.1
1. George Shalovka  07 November 2008
   Track:1-3MLX1W
   Problem:Some messages lack internationalization keys.
   Solution:Run rekey utility. 
AUDIT TRAIL END
</multilinecomment>
BEGIN
NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail8101Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_8_0_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_8_0_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 8.0    
1.  TGK 01/18/2007 
    Apply the following 7.4.0.1 modifications to 8.0
*************
    START 7.4.0.1
    1.  TGK 12/13/2006
        Modify G$_SEARCH.WHEN_MOUSE_CLICK to execute trigger G$_SEARCH_OPTIONS only if the item is not protected against
        update.  (1-HBU7Y)
    2.  TGK 12/13/2006
        Modify alert messages in G$_RECONNECT to indicate that after providing reconnect "your session will be restarted".
        This is in association with mods to GUAGMNU for 7.4.0.1 and (1-9LQSB).
    3.  TGK 12/13/2006 (SN implemented by TGK)
        When performing data extract on form items (ftv% forms) that do not have an autohint, the status bar continues
        to display 'Working...' even though the data extract has completed.  Modify G$_DATA_EXTRACT to add a CLEAR_MESSAGE
        prior to the hint text of the calling form's item being displayed.   (1-16UVZ3)
    4.  TGK 12/13/2006 (SN implemented by TGK)
        When invoking the LIST button on forms SSAMATX or SLABQRY; when accessed from GEAFUNC; forms SSAMATX or SLABQRY
        will hang.  Hang only occurs when SSAMATX or SLABQRY is the first Student (S) form called during the session
        thereby calling SOQMENU.  Modify G$_SECURED_FORM_CALL_PL procedure to add 2 SYNCHRONIZE calls before and after
        the OQMENU form call.   (1-LJ953)
    5.  TGK 12/19/2006
        Modify G$_NAVIGATION_FRAME body to value package varaible qty_ditm to 24 (instead of 9).  There were some form
        options with count greater than 9 that were not being enabled or diabled properly.  This is related to
        Advancement defect 1-THKL3.      (1-1FWAA1)
    END 7.4.0.1
***********
2.  TGK 03/26/2007 
    Apply the following 7.4.1.1 modifications to 8.0
*************
    START 7.4.1.1
    1.  TGK 02/22/2007
        Modify G$_IDNAME_SEARCH.DISABLE_NAME_ITEM routine to perform the SYNCHRONIZE if the form is SFARQST,SGAASST,
        SMARQCM, or SSASECT. Form was erroneously exiting when the cursor was in an ID field and SAVE was selected.
        (1-11OA7A)
    END 7.4.1.1
*************
3.	George Shalovka  05/07/2007 
    Add the following SDE enhancements.
*************
    START 80-3
    Add Package G$_FRM: defines form specific constants such as 'FALSE', 'BUTTON' etc.
	                   		Avoids misspellings and reduces the number of texts extracted by TranMan.
    Add Package Spec and Body G$_SD: manages the SD menu and SD block display.

    Modified G$_GOQOLIB_KEY_TRIGGER.KEY_CLRFRM: add call to g$_sd.p_close_sde_form(p_delayed=> FALSE).
    Modified G$_GOQOLIB_PP_TRIGGER.PRE_FORM: add call to g$_sd.p_pre_form.
    Modified G$_GOQOLIB_PP_TRIGGER.PRE_BLOCK: add call to g$_sd.p_pre_block.
    Modified G$_GOQOLIB_PP_TRIGGER.POST_FORM: add call to g$_sd.p_pst_form.
    Modified G$_GOQOLIB_PP_TRIGGER.POST_BLOCK: 
     1. changed condition for clearing current record attribute when SD is displayed
        It would not be clear to which record SD belongs when current record is not highlighted
        when moving to the SD block.
     2. add call to g$_sd.p_pst_block. 
    Modified Procedure G$_TIMER_EXP: 
      1. handler for g$_sd.C_SD_CLOSE_TIMER_NAME
      2. handler for g$_sd.C_SD_BLOCK_TIMER_NAME
    Modified G$_GOQOLIB_KEY_TRIGGER.KEY_ENTQRY: add call to G$_SD.p_enter_query.
    END 80-3
***********
3.	George Shalovka 05/18/2007 
    Add the following SDE enhancements.
*************
    START 80-4
    Add Procudures G$_SD.KEY_COMMIT, G$_SD.KEY_NXTBLK and G$_SD.KEY_PRVBLK
    	to provide SDE block functionality thru GOQOLIB.G$_SDISP triggers.
    END 80-4
***********
4. TGKinderman      06/26/2007
   a. Change the lv_full_name variable from 200 to 230 in G$_SEL_SPRIDEN_PIDM_NAME, G$_SEL_SPRIDEN_ID_NAME and
      G$_BUILD_FULL_NAME
   b. Change the default length of parameter p_NAME_LEN from 60 to 230 is procedure G$_VALID_ALL_ID.
***********
5.  TGKinderman     07/31/2007 
    Apply the following 7.4.1.2, 7.4.1.3 and 7.4.1.4 modifications to 8.0
*************
    7.4.1.2 Modifications
    1.  TGK 04/23/2007
        Modify G$_IDNAME_SEARCH.COMPRESS_NAME routine restore translate charater _   This character was erroneously
        removed breaking the ability to find names containing a single quote character (ie O'Leary, O'Conner) (1-1QYUF6)
    2.  SN 05/01/2007 (Implemented by TGK 05/05/2007)
        Added global variable GLOBAL.FORMID in G$_SECURED_FORM_CALL_PL to hold the form id’s of all the forms open.
        Amended code in G$_SECURED_FORM_CALL_PL to build and remove names of forms in MDI window. Building the form
        names is done by checking sum of length of CURR_OPEN_FORM’s variable and the next form to open. If it is less
        than 255, name of the form and form id are appended to their respective global variables. Removal of form is
        done by checking if current form id is present in GLOBAL.FORMID, if it exists the name of the form is removed
        from global and is populated in MDI window.  (1-1NZPTW)
    7.4.1.3 Modifications
    1.  TGK 05/15/2007
        Add SYNCHRONIZE in G$_GOQOLIB_OPT_BLOCK.WHEN_NEW_ITEM_INST, just before DO_KEY.  This corrected a problem at
        runtime when using the java plug-in.  The problem encountered was, after launching a form from the options
        window; when that form queried more than one record, you were not able to mouse off of the first record.
        (1-2ALEK2)(1-KL77X)
    7.4.1.4 Modifications  
    1.  SN 06/26/2007 (Implemented by TGK 06/26/2007)
        In procedure G$_SECURED_FORM_CALL_PL, clear variable FORM_ID_STR and global GLOBAL.FORMID when returning from
        the call stack and the cur_object is GUAGMNU.  (1-1NZPTW additional modifications).
*************
6.  TGKinderman     10/11/2007
    a. Modify G$_IDNAME_SEARCH.DISABLE_NAME_ITEM routine to perform the SYNCHRONIZE if the form is SOAWLTC,SFARWLP,
       SFAWLPR, or SFIWLNT. Form was erroneously exiting when no data found for an ID upon navigation.
    b. Modify G$_MASK package to recognize columns GORDMSK_MASK_DIRECTION and GORDMSK_MASK_LENGTH in support of partial
       character masking.  These 2 columns contribute to valuing an items TOOLTIP_TEXT with (for example) R=4, L=12.
       The form item's implemenation class (java class in the Bannerui.jar file) will then partial mask the field.
       The item is disabled such that the cursor can no longer access the item.  Applying a partial character mask, for
       ALL, a specific user, or those that satisfy the rule (see GORDSMK) should take into consideration that the item
       becomes disabled.
7.  TGKinderman     10/16/2007
    Modify G$_WRITE_BLOCK routine to force the 'too long' and 'possible double quotes' messages to display with a
    call to SYNCHRONIZE.  Also replace incoming single double quotes with two double quotes so that the data is
    extracted correctly.     (CMS-DFCT82278)
8.  TGKinderman     10/16/2007
    Modify G$_WRITE_BLOCK spec and body to properly support date and datetime data being extracted. Partial masked
    date items and masked Datetime items are extracted completely and formatted properly.
    Modify G$_WRITE_BLOCK to recognize if partial character masking (GORDMSK_MASK_DIRECTION and GORDMSK_MASK_LENGTH)
    are in place on an item so as to extract the data with appropriate mask.  Modify G$_MASKS routines, specifically
    record group (MASKING_LIST) to support the mask_direction and mask_length.
9.  TGKinderman      10/17/2007
    Add to top of G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM to present a Warning Alert when exiting a form and you are
    in a form that is part of a Workflow activity.  Exiting the form by selecting "Workflow Submit" will not present
    the Warning Alert.
10. TGKinderman      10/29/2007
    Modify G$_VALID_ALL_ID and G$_IDNAME_SEARCH in support of SSN ID Lookup enhancement.
11. TGKinderman      10/29/2007
    TabSecurity modifications.
    a. Modify G$_NAVIGATION_FRAME. CREATE_OPT_SELECTION, EXECUTE_GUROPTM and logic inside main begin-end to use the
       two new guroptm table columns GUROPTM_TAB_SEC_FORM and GUROPTM_TAB_SEC_TAB.  Guroptm rows, where the
       GUROPTM_TAB_SEC_TAB column is NOT NULL, are specifc for facilitating navigation to a specific tab (in a form).
    b. Modify G$_IDNAME_SEARCH (This is specific to GOQOLIB.G$_EXTENDED_SEARCH_BLOCK no longer being statically navigable)
       Add routines ENABLE_EXT_SRCH_BLK_ON_ENTRY and DISABLE_EXT_SRCH_BLK_ON_EXIT to the spec and body. Add calls to
       these routines in START_ID_SEARCH, COPY_SELECTED_ID and DETAIL_BTN_PRESSED to appropriately enable and disable
       the G$_EXTENDED_SEARCH_BLOCK block.
    c. Modify G$_KEY_OPT_MENU and G$_GOQOLIB_OPT_BLOCK (This is specific to GOQOLIB.G$_OPT_BLOCK no longer being
       statically navigable).  Add routines ENABLE_OPT_BLOCK_ON_ENTRY and DISABLE_OPT_BLOCK_ON_EXIT to the spec and
       body of G$_GOQOLIB_OPT_BLOCK.  Add calls to these routines in G$_KEY_OPTM_MENU, WHEN_NEW_ITEM_INST and
       WHEN_BTN_PRESSED to appropriately enable and disable the G$_OPT_BLOCK block.
12. George Shalovka  11/07/2007
		Tracking: 1-2YJ1KTF
		Modification:Supplemental Data Engine changes for Tab Security to give SDE block same table access privileges as calling block.      
		Solution:Modify Program Unit G$_FRM: add two constants C_SYSTEM_CURSOR_BLOCK and C_SYSTEM_CURRENT_FORM.
						 Modify Program Unit G$_SD package spec:
						 		add variable CALLING_BLOCK_NAME to store block that is calling SDE window so that later in code SDE block can have same
						 			database table access (INSERT, UPDATE, and DELETE) applied;
						 		add specification for procedure p_sde_block_access_set and procedure p_sde_block_access_reset.
						 Modify Program Unit G$_SD package body:
						 		modify function f_sdisp_win_visible to clarify boolean RETURN value;
								modify procedure p_show_sd to save calling block name and call new procesure p_sde_block_access_set
						 			to set SDE block access;
								add procedure p_sde_block_access_set to set SDE block	database access (INSERT, UPDATE, and DELETE)
							 		to match calling block database access;
								add procedure p_sde_block_access_reset to reset SDE block to initial access values;
								modify p_check_required to call p_sde_block_access_reset.
						 Procedure  p_check_required is called from referenced GOQOLIB block G$_SDISP trigger Post-Block.
13. George Shalovka  11/07/2007
		Tracking: 1-2JAW36
		Modification:Modify SDE Menu Bar Block option label and Toolbar icon label and code 
									to switch between "Hide..." and "View..."	based on window status.
		Solution:Modify procedure p_pst_form to handle case where user exits form without first exiting SDE window.
						 Modify procedure p_show_sd to change button and menu bar option label when SDE window is shown.
						 Modify procedure p_close_sde_form to change button and menu bar option label when SDE window is hidden.
14. George Shalovka  11/14/2007
		Tracking: 1-30CTP4
		Modification:Forms that are query-only forms should not allow SDE window updates.
		Solution:Modify GOQRPLS G$_SD.p_sde_block_access_set to open SDE window in 
				query-only mode if form is in list: SOAIDEN, ROAIDEN, AOAIDEN, SOACOMP, AOACOMP.
15. TGKinderman      11/20/2007
    Modify G$_IDNAME_SEARCH.DETAIL_BTN_PRESSED to call DISABLE_EXT_SRCH_BLK_ON_EXIT immediately after GO_ITEM.
    The EXTENDED_SEARCH_BLOCK was erroneously left as being navigable when the detail button was selected.
16. TGKinderman      11/28/2007
    Modify where clauses in the following: G$_IDNAME_SEARCH.START_ID_SEARCH, G$_VALID_ALL_ID, G$_VERIFY_ID_AS_SSN and
    G$_VERIFY_SSN_EXISTS.  Where clauses were performing unnecessary outer joins and/or joins into SPRIDEN.  (1-2YK893)
17. TGKinderman      12/04/2007
    Modify G$_VALID_ALL_ID in 2 places:   1) add to the where clause of SSN_COUNT_CURSOR to join into SPRIDEN per
    leveraging of FGAC rules that may exist.  Without this join, an SSN count greater than one has potential for
    being returned.  2) The body of the IF following DO_SEL_ID was modified to be skipped if more_than_one_ssn=Y and
    spriden_pii_active=Y for the user.
18. George Shalovka  12/06/2007                
    Tracking:1-2F59MW
    Topic:  on update trigger raised unhandled exception after typing text after a date.
    Solution: Modify Program Unit G$_SD Procedure p_close_sde_form by adding two calls to G$_CHECK_FAILURE, one after
    call to p_check_required and one after GO_BLOCK to provide an escape from procedure if an edit error is encountered.
19. TGKinderman      12/12/2007
    Modify size of name_str variable, from 60 to 300, to match that of the in incoming size in routine 
    G$_IDNAME_SEARCH.START_NAME_SEARCH. When name item carried a value larger than 60 characters a truncation error was
    occuring.  Enhanced logic in same routine when zero, one or two commas are provided in the input field.  (1) One comma
    assumes: lastname, firstname.  (2) Two commas assumes: lastname, firstname, middlename.  (3) Zero commas assumes: lastname.
    None of these cases were recognizing field size limits and was giving a truncation error.  Substring was added to correct
    for this.
20. TGKinderman      12/18/2007
    Some non standard date items in some forms were found to not have a date format mask.  This results in the data extract
    extracting these date values as null.  Modify G$_WRITE_BLOCK, to use a default date format when extracting date items
    that do not have a mask.  (1-36W1XL)
21. George Shalovka  15 February 2008                
    Tracking:1-3D6o2N, 1-3DVTJ1
    Problem: Oracle has identified performance issues with ALL_SYNONYMS in Oracle 10g and 
    					documented those issues in MetaLink note 377037.1.
    Solution:Oracle recommendation to replace use of ALL_SYNONYMS with a private synonym
    					has been adopted and therefore ALL_SYNONYMS has been replaced with 
    					ALL_SYNONYMS_BANNER.
    				Modify Program Unit G$_SEARCH Cursor Find_Owner3 FROM clause 
    					from "ALL_SYNONYMS" to "ALL_SYNONYMS_BANNER".
22. George Shalovka  18 February 2008                
    Tracking:1-13FTZD
    Problem: Some level 3 security violations are being recorded as level 1 secrutiy violations
    Solution:Modify Program Body G$_SEARCH Procedure create_recgroups to add fourth parameter
    					to call to G$_SECURITY.G$_CREATE_LOG_RECORD.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_8_0_0_1_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_8_0_0_1_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 8.0.0.1
1. George Shalovka  21 April 2008                
   Tracking:1-2TERBA
   Problem: On form GUIMAIL, LOV for form item Aid Year is not sorted when displayed.
   Solution:Modify Program Unit G$_POPULATE_ROIAIDY_LOVD to add an ORDER BY
   					clause to SELECT statement for table ROBINST.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail8001Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_7_3_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_7_3_GOQRPLS IS
<multilinecomment>
NOTE: This was created as a continuation of the AUDIT_TRAIL_7_0_GOQRPLS.  The size of the
      procedure was growing too large.
      
AUDIT TRAIL: 7.3
1.  SJQ 11/09/2005
    Update the G$_SECURED_FORM_CALL to verify if the extended query setting has been obtained,
    and if not, fetch it.  Also updated to verify if the call_query setting has been obtained,
    and if not, fetch it.  These were removed from the GUAINIT form to improve start up time.
    The change also stores the settings in globals to remove the need to call the database
    function every time the procedure is invoked.
2.  SJQ 11/25/2005
    Moved the call to G$_QUERY_ONLY_ROLE by the G$_POP_UP_MENU routine to the G$_FORM_STARTUP
    routine.  This was to enable or disable the "add to personal menu" option but was being
    executed for each block in the form.  This needs to be done only once at form start up.
3.  TGK 12/09/2005
   	Per I18N date modifications, move the initilization logic form main begin-end of 
   	GOQRPLS.G$_FORMS_NLS to proper location in guainit.when-new-form-instance.    
4.  SJQ 12/13/2005
    Update the G$_GOQOLIB_PP_TRIGGER.PRE_BLOCK trigger to remove several item declarations
    which are never used.
5.  SJQ 12/14/2005
    Update the logic in the G$_SECURED_FORM_CALL to remove obsolete code and variables.  Clean
    up code to make it more efficient.
6.  SJQ 12/16/2005
    Add the G$_GET_UPRF_DUP_SNN_ALERT routine to retrieve a user's custom settings for whether
    or not the user should be alerted of duplicate SSN/SIN/TFN has been entered.
7.  SJQ 12/23/2005
    Update the G$_NAVIGATION_FRAME package body to process the pop-up menu entries the same
    way it processes options.  This affected the changing of the description, enabling and
    disabling of entries.  This modification then removes the need to completely rebuild the 
    pop-up menu each time a change is made.
8.  TGK 01/11/2006
    Update the G$_GOQOLIB_PP_TRIGGER package body to load options in the PRE_FORM routine and
    not in the PRE_BLOCK routine.  PRE_BLOCK loading of options was found to be inefficient.
9.  SJQ 01/18/2006
    Update the G$_GOQOLIB_KEY_TRIGGER.ON_SELECT routine to change the search for the advanced
    search characters (':', '&') from looking anywhere in the item data to checking only if it
    is the first character in the data.  This logic is related to the testing of whether the
    user is authorized to perform "extended queries" (1-66J86).  Update the G$_BUILD_FULL_NAME
    routine to build the name using a local variable and then transfer the end result to the 
    out parameter.  When building names which were very long, it was exceeding the length of 
    out parameter before being sub-stringed to the return length.
10. SJQ 01/20/2006
    Add initialization of the GLOBAL.MDI_TITLE to the G$_SECURED_FORM_CALL_PL for when a form
    is launched directly from a channel.
11. SJQ 01/26/2006
    Update the G$_WRITE_BLOCK package.  Remove the WRITE_HTML function as this is never used.
    Update the logic in the WRITE_BLOCK function where the double quotes are being added and
    then the length of the value is tested.  If the value was greater then 2000 characters, the
    closing double quotes was being lost.  The logic was changed to truncate the value to 1998
    characters and the double quote is appended to this (1-8BI14).
12. TGK (MH) 02/03/2006
    In support of vpd implementation, modify pl/sql units G$_SET_INST_PROPERTY, 
    G$_SECURED_FORM_CALL_PL and G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM.  Create the spec and body
    for G$_VPDI.
13. SJQ 02/08/2006
    Update the G$_WIN_CLOSED procedure to add support for closing the VPDI window. The logic
    performs the same call that the "cancel" button on the VPDI window does.  Added a local
    variable to hold the value of the EVENT_WINDOW name instead of repeatedly performing
    a NAME_IN of the SYSTEM.EVENT_WINDOW.  This way, it is done only once and then the local
    variable is used in the logic.  Update the G$_VPDI package procedures to remove multiple
    local variables which are never used.  Broke the audit trail procedures apart for this
    release since it exceeded 64k in size.
14. SJQ 02/10/2006
    Update the G$_DISPLAY_ERR_MSG procedure to have a second parameter, p_do_rollback, with a
    default value of 'Y'.  If a routine needs to use this routine to display warning messages
    but does not want the transaction to be rolled back, they will pass a 'N' value for this
    new parameter.
15. SJQ 02/16/2006
    Add new routine, G$_GET_UPRF_DE_PROMPTS, to query the user preference table and return 
    the current value for the data extract prompts indicator.  Update the logic in the 
    G$_WRITE_BLOCK package to add a new routine to get item prompts.  Update the logic in
    the G$_WRITE_BLOCK.WRITE_BLOCK procedure to query the user's preference for including the
    column headers.  If this is set to 'Y', call the new  GET_PROMPTS routine in the package
    for each item being processed in the first data row.  The headings will be inserted as
    the first row of data.  Update the logic to also be smarter about which items to include
    in the data extract.  Update the G$_VPDI package to add a new routine IS_F5_ON and call
    this routine from the CALL_VPDI_COMPONENT routine.  Don't want this function to be valid
    if the form is running as part of a WORKFLOW or if the F5 window is active.
16. SJQ 02/20/2006
    Update the G$_GET_MAIN_WINDOW_TITLE routine to only retrieve the object description from 
    the object table.  The routine used to try to get the customized description from the menu
    table but if the object existed with more then one custom description, launching the form
    did not always bring back the correct custom description.
17. SJQ 02/21/2006
    Update the logic in the G$_GOQOLIB_KEY_TRIGGER.ON_ERROR to trap the error condition when
    a GO_ITEM attempts to navigate to a disabled item.  Add a more descriptive message instead
    of the FRM style message.
18. SJQ 02/22/2006
    Update the G$_VPDI logic to add support for the dynamic LOV rule builder for form with ID 
    value in a KEY-BLOCK.  Removed several references to "SCT" in some of the routines.
19. TGK 03/06/2006
    Update the G$_DATA_EXTRACT logic in support of implementing Oracle's WebUtil for moving
    data from the guroupt table to a local folder. Continue with existing functionality by 
    calling G$_WEB_SHOW_DOCUMENT if uprf row value is FILE or TEXT; otherwise uprf row value
    is WEBUTIL, global variables are loaded and GUQWUTL form is called.
20. SJQ 03/09/2006
    Add logic to the G$_ADD_TO_PERSONAL_MENU to verify that the user isn't trying to put a form 
    with a Q in the third position on the menu.  These forms are not directly callable and 
    shouldn't be allowed on personal menus.
21. SJQ 03/14/2006
    Modify the G$_TIMER_EXP to remove the logic  specific to the WWA_TIMER.  This timer is
    related to the WHEN-WINDOW-ACTIVATED trigger.  The timer logic was only clearing a global.
    Modify the G$_SECURED_FORM_CALL_PL to remove the population of this same global.  Removed
    all logic in the G$_DO_WIN_ACTIVATED trigger.  This was obsolete logic and was causing a
    timer to be created any time a form was exiting.  This is not needed nor should it be
    ever needed.  Modify the G$_NVA routines to add a local variable to store the value of the
    global containing the color value.  By using the local variable the number of calls to the
    NAME_IN built-in is reduced for improved performance.  Modify the G$_DISPLAY_ERR_MSG to
    increase the size of the maximum error string length to match what the maximum is in the
    APIs (4000 characters).
22. SJQ 03/16/2006
    Update the logic in the G$_DISPLAY_ERR_MSG routine to add in a new line character after
    each period in the string of messages.  This is to cause the display of the messages to be
    formatted to start on a new line to make it easier to read.  Also adding the passing of the
    user preference parameter to the call so that the G$_SET_INST_PROPERTY can correctly 
    determine whether or not to add items to the window title bar.
23. SJQ 03/21/2006
    Re-write some of the logic in the G$_NAVIGATION_FRAME package to improve performance.
24. SJQ 03/27/2006
    Update the G$_TRACE_PKG to add a new overloaded version of the SET_OPTIMIZER_FIRST_ROWS
    procedure.  This new version will accept a parameter representing the number of rows to be 
    returned.  Valid values are 1, 10, 100, or 1000 according to the Oracle documentation.  This
    new routine will be called by the menu module and will pass in the number to be used.
25. SJQ 04/10/2006
    Modify the G$_NAVIGATION_FRAME to replace one deleted variable.  It was incorrectly removed and
    caused problems with the loading of the options.  Update the logic (see #22 above) to not
    look for the period but instead look for four spaces and replace those with the new line
    character.  Many messages don't have periods but they will contain the four spaces if multiple
    messages are being sent back after the API message seperator is replaced.
26. SJQ 04/12/2006
    Update the G$_VPDI package to add a new function (IS_FORM_VPDI_ENABLED).  Update various
    routines in the package to call this new function to determine whether to continue processing
    the VPDI logic or not.  Additional modifications were for performance improvements.
27. SJQ 04/24/2006
    Update the G$_SECURED_FORM_CALL_PL to remove a debug message.
28. SJQ 04/27/2006
    Update the G$_GOQOLIB_KEY_TRIGGER.ON_ERROR to add logic to verify that the user session is
    still connected when an error occurs and it's not one of the standard errors which are being 
    tested for related to being disconnected.  There is an existing test for several errors which
    are raised when the session is disconnected but if these conditions are not met, the remaining
    logic didn't handle the disconnected situation correctly.  Added logic to verify the session
    was still active and if not, force the user to re-connect.  Updated the logic in the 
    G$_RECONNECT to change the timer which is used to force an exit from Banner to be a repeating
    timer and moved it's location to after the user has reconnected.  Updated the error message 
    which is displayed to the user.

AUDIT TRAIL: 7.3.1.1
1.  TGK 08/09/2006
    Update the G$_MOUSE_DOUBLECLICK to check the item's status prior to launching the calendar form,
    rather then launching the calendar and then testing if the value can be copied back.  This is so
    that if an item is concealed or partially masked that the user can't see the value by having it
    displayed in the calendar form.  This functionality was originally placed into 7.0 and subsequently
    erroneously removed  (1-PD501).
    (applied 08/21/2006).

AUDIT TRAIL: 7.4
1.  SJQ 05/19/2006
    Modified the G$_IDNAME_SEARCH routine to pass the query to a new routine in the 
    gb_identification package.  This will allow the use of bind variables and thus, the sharing
    of cursors among users for vastly improved performance.  The call will return a ref cursor 
    and loading of the values from this ref cursor to the existing list item in the extended
    search window.  Most of the logic will remain the same except for having the database do the
    query instead of using a local record group.  All routines related to the building of the
    query and executing it have been removed.
2.  SJQ 05/24/2006
    Update the G$_DATA_EXTRACT routine to set the SYSTEM.MESSAGE_LEVEL to 15 so that navigation
    which causes an error in some forms is hidden from the user.  The G$_WRITE_BLOCK was modified
    to reset the SYSTEM.MESSAGE_LEVEL back to 0 just prior to displaying a status message when
    being called by the G$_DATA_EXTRACT.
3.  SJQ 05/31/2006
    Update the logic in the G$_DUPLICATE_PIDM to remove the local SQL and call the 
    gb_common.f_pidm_exists API that has the exact same logic.  Replaced several occurrences of 
    select statements implementing DECODE statements against the DUAL table with CASE statements.
    There was one in the G$_KEY_OPT_MENU and four in the G$_GOQOLIB_OPT_BLOCK package.  Modify the 
    G$_EXTRACT_BCC_ITEMS, G$_RESET_VIEW and G$_GET_UPRF_WEBBKSHLF routines to remove all of the 
    existing logic and return or execute the NULL command.  These are being left in place for 
    compatibility since the routines are obsolete.
4.  SJQ 06/06/2006
    Update several procedures in the G$_GOQOLIB_FUNC_INFO_BLOCK package to replace existing
    cursors with calls to existing APIs.  Modify the G$_SEL_SPRIDEN_ID routine to remove the local
    logic that was looking up an ID based on the PIDM parameter.  Changed to call the existing
    routine GB_COMMON.F_GET_ID.
5.  TGK 07/20/2006
    Modify front end of routine G$_SECURED_FORM_CALL_PL to check that the FORM_NAME_IN to be called is valid.
    Some form names constructed dynamically (i.e. RNANAxx) may not be found as valid objects.
6.  SJQ 07/25/2006
    Modify the G$_IDNAME_SEARCH package body to remove the logic that was doing the dynamic
    query to find the potential matches.  This was moved to the GB_IDENTIFICATION API so that
    the query could be designed to use bind variables.  The logic to populate the record group
    in the G$_IDNAME_SEARCH package was rewritten to call the new function in the API.
7.  TGK 08/22/2006
    Modify the INB Data Extract to no longer write to the GUBOUTP/GUROUTP tables.  GUBOUTD/GUROUTD have been
    created to support the intermidiate collection of the INB Data Extract data.  Modify G$_DATA_EXTRACT to
    hit G$_WEB_SHOW_DOCUMENT_OUTD.  This new function is using package GOKOUTD.  G$_WEB_SHOW_DOCUMENT continues
    to exist and support the Finance GASB Data Extract.  Modify G$_WRITE_BLOCK to use the GUBOUTD/GUROUTD tables.
8.  TGK 09/11/2006
    Modify G$_DISPLAY_ERR_MSG to refresh options after dismissing the GUAERRM form.  Cases of returning to the
    calling form with options disabled were discovered.  (1-UUD85)
9.  TGK 09/12/2006
    Establish logic for recognizing an environment variable BAN_DATA_EXTRACT_PAD_COLUMN and loading a global in
    the G$_DATA_EXTRACT pl/sql unit.  If global is Y, data extract logic in the G$_WRITE_BLOCK will pad the
    columns with spaces (just like the logic did before this modification); otherwise N and the space padding of
    the columns will not occur.  The padding is not needed since the columns are wrappered with double-quotes.
    No existence of the environment variable equates to N.  (1-HRQ33)
10. TGK 09/21/2006
    Add UPPER function to G$_GET_UPRF_DE_MIME_TYPE pl/sql unit.  Pre-Banner7.0 data (text, file) may have been
    provided as lowercase and brought forward to Banner7.  Data Extract, GJIREVO, Finance GASB extract were not
    properly testing for case.  (1-Y4Q1N)
11. TGK 09/28/2006
    Modify the message statement in the EXCEPTION clause of G$_TRACE_PKG.DO_EXEC_SQL to have a call to
    EXEC_SQL.LAST_ERROR_MESG(connection_id).   This will allow the complete Oracle Error message to display.
    (1-10J53J)
12. TGK 10/02/2006
    PL/SQL unit G$_VALID_ALL_ID was modified in 7.2 to unconditionally value GLOBAL.KEY_IDNO. This caused problems
    with ID changing unexpectedly when entering some forms.  The global GLOBAL.KEY_IDNO was being erroneously valued
    in repeating row blocks where the row contained an ID field and validation using the G$_VALID_ALL_ID.  Add condition
    for valuing the GLOBAL.KEY_IDNO in pl/sql unit G$_VALID_ALL_ID for only when you are in a KEY_BLOCK. As a standard
    this is when the block property DEFAULT_WHERE is equal to 'key-block'.   (1-E9U9D) and (1-ZRFR8)
13. TGK 10/04/2006
    Modify G$_DISPLAY_IMAGE to support environment variables BAN_GUAIMGE_ID_RANGE and BAN_GUAIMGE_EXTENSION. If 
    these environment variable are not present or not valued, will function as prior to this modification and use
    ID positions 3,7 prefixed with I and extension of BMP.  
    BAN_GUAIMGE_ID_RANGE can be 3,7 or 1,9.  If specified, will search for that named-image-file first.  If not found
    will then search for the other-named-image file format. (reason: if sites are wanting to continue using the old
    named-image file format of 3,7 prefixed with I and for any new IDs use the 1,9 or full IDvalue for the name of the
    image file; they would specify BAN_GUAIMGE_ID_RANGE=1,9)
    Extension can be BMP, GIF, JPG or TIF.
14. TGK 10/09/2006
    Modify G$_SECURED_FORM_CALL_PL after returning from the called form (after the core CASE statement) to set the
    ICONS.VPDI_EXISTS iconic button disbaled and label to "Mulit-institution not enabled" if the form being displayed
    has been through a Banner session launched from Workflow.
15. SJQ 10/11/2006
    Modify the G$_RECONNECT routine to present a different "reconnect" message to the user if the user is currently
    on the menu form versus any other form.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail73Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_7_1_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_7_1_GOQRPLS IS
<multilinecomment>
NOTE: This was created as a continuation of the AUDIT_TRAIL_7_0_GOQRPLS.  The size of the
      procedure was growing too large.
      
AUDIT TRAIL: 7.1
1.  SJQ 02/07/2005
    Update the G$_TOOLBAR package start up logic to add an NVL on the sub-string logic so that
    if a null parameter (G$_PREFERENCES) is found, it defaults to 'Y'.
2.  SJQ 02/08/2005
    Update the G$_GOQOLIB_KEY_TRIGGER.KEY_PRINT routine to reset the title bar back to it's 
    original value after the print.  There was a problem with the date being appended and not
    being removed if print was pressed multiple times.
3.  SJQ 02/03/2005
    Update G$_IDNAME_SEARCH to re-arrange the logic in the DO_START_ID_SEARCH routine so that
    the extended search window does not get displayed even though the user doesn't have access
    to any of the records.
4.  SJQ 02/10/2005
    Update the G$_MASK.G$_APPLY_STARTUP_MASK routine to add additional logic to verify that an
    item which is going to be made visible also has an assigned canvas.  It would be possible for
    a user to specify an item which is not visible and has no canvas to try and make it visible.
    This generates an error when attempting to set the item visible but it has not assigned canvas.
    Add new routines to the G$_TRACE package for setting the optimizer mode.  This is for testing
    purposes of the various methods of optimization.  Add support for setting the optimization
    mode for ALL_ROWS, FIRST_ROWS, and RULE.  These functions will only be called from the menu
    module (GUMAPPL).
5.  SJQ 02/21/2005
    Update the G$_MASK.G$_APPLY_STARTUP_MASK routine to add additional logic to verify that an
    item which is going to be made visible is not assigned to the TEMP_CANVAS canvas.  It would 
    be possible for a user to specify an item which is not visible and have navigation occur to
    the item on the TEMP_CANVAS.
6.  SJQ 03/18/2005
    Update the G$_HELP_SETUP procedure to correctly determine if the cursor item is a database
    item or not.  The GET_ITEM_PROPERTY was used to check the base_table value which is not a
    valid option for buttons.  The logic was updated to first check if the block was based on
    a table, then if so, to verify the item was not a button, then to check the base_table value.
7.  SJQ 03/23/2005
    Update the G$_WIN_CLOSED routine to add support for the FUNC_BASE_WINDOW.  This is a window
    used in the events forms and wasn't closing correctly.  Modify the procedure 
    G$_GOQOLIB_FUNC_INFO_BLOCK.SELECT_GEBFUNC to declare and use a cursor to get the Purpose
    Description from the GTVPURP table.  Modify the procedure 
    G$_GOQOLIB_FUNC_INFO_BLOCK.SELECT_SPRIDEN such that the PTI1_CURSOR is modified.  The second 
    column of SPRIDEN_LAST_NAME is to be replaced with a decode of the SPRIDEN_ENTITY_IND.  If 
    it is C, then return the Last_name, otherwise return the First_name  Middle_initial  Last_name.
8.  SJQ 03/30/2005
    Update the G$_SEARCH.CREATE_RECGROUPS procedure such that it contains specific logic for
    the GUBOBJS table.  If the cursor is in either the go to item on the menu or in the navigation
    item (F5) on any form and the record group does not return an exact match while doing the 
    search, and the search window is not displayed, then verify the user's access to the object.
9.  SJQ 04/01/2005
    Update the G$_SEARCH.CREATE_RECGROUPS procedure so that if the search returns no records,
    and the user is on the menu or F5, call the security package to verify if the object is 
    valid, and if so, call another routine to create the security violation record and then
    notify the user they are not authorized.  Modify the G$_SECURED_FORM_CALL_PL to move the
    defaulting of several globals to a different spot.  The original location was interfering 
    with the testing of success or failing when calling a form.
10. SJQ 04/21/2005
    Include the changes required for the 7.0.0.1 posting.
11. SJQ 04/28/2005
    Modify the G$_MASKS routine to remove unused and unneeded routine.  Added new routine which
    will provide the ability to determine if masking has been applied to an item.  If masking is
    applied a record is added to a local record group.  The new routine, G$_WAS_MASKING_APPLIED,
    can be called and it will return TRUE if masking has been applied to that item, and FALSE if
    no masking has been applied.
12. SJQ 04/29/2005
    Update the ON_SELECT procedure in the G$_GOQOLIB_KEY_TRIGGER to add the "&" character to the
    list of characters which are tested for when an "extended query" is executed.  Update the
    G$_WRITE_BLOCK routines to exclude the values for items which are concealed.  This package
    is used by the data extract process.

AUDIT TRAIL: 7.2
1.  SJQ 04/15/2005
    Replace all local calls to any DBMS_* packages with calls to the GOKDBMS package.  This is to
    remove all direct calls to these packages as this is a recommendation from Oracle and causes 
    problems in some environments.  Modified the G$_GET_PIPE_MESSAGES, G$_GOQOLIB_KEY_TRIGGER.KEY_PRINT,
    G$_RESYNCH_RECORD, G$_TRACE_PKG and G$_VPDI_TRIGGER.
2.  SJQ 05/25/2005
    Update the G$_VALID_ID_ALL logic to copy the validated ID to the GLOBAL.KEY_IDNO.  This was
    done so that the ID value is immediately available to other forms which may be called from the
    current form without having to do a rollback or exit.
3.  SJQ 06/16/2005
    Update the G$_TRACE_PKG.DO_EXEC_SQL routine to increase the size of a local variable.  The
    local variable gets assigned the passed parameter which could be up to 2000 characters.  Made
    the local variable 2000.  This routine is called typically by other routines in the package
    but is also called by some other forms to replace thier use of DBMS_SQL.
4.  SJQ 06/22/2005
    Remove some developer comments which were left behind.  These were for debugging only.
5.  SJQ 06/23/2005
    Add a new procedure (PRE_COMMIT) to the G$_GOQOLIB_PP_TRIGGER package.  This new routine will
    be called by a new trigger (PRE-COMMIT) added to the G$_FORM_CLASS property class in GOQOLIB.
    This routine has been added so that if the user is executing the form with a "query" role,
    the user will be given an error message that they are running with a query only role.  This 
    logic will fire as part of the "commit" logic but is executed prior to any calls to any 
    DML (insert, update or delete) or API calls (on-insert, on-update, or on-delete).  The change
    is designed to address the limitations of implementing the "call query" security setting.  The
    new routine will also execute the PRE_COMMIT_TRG which can be used by any forms with existing
    PRE-COMMIT logic.
6.  SJQ 06/29/2005
    Update the G$_LOAD_FORM_HEADER to populate any local current_user with the GLOBAL.CURRENT_USER
    instead of the GLOBAL.USER_ID.  The later global is used by some forms for other reasons.
7.  SJQ 07/08/2005
    Update the G$_SECURED_FORM_CALL_PL routine to build a list of open forms and place the list
    in the MDI window title bar.
8.  SJQ 08/11/2005
    Update the G$_VALID_ID_ALL logic (see #2 above) to move the copy of the validated ID to 
    the GLOBAL.KEY_IDNO to after the confidential and deceased logic is executed.  The previous
    location was causing these messages to not display.
9.  TGK 08/18/2005
    Modifications per Infrastructure support of I18N date modifications.
    (Infrastructure pieces are: goqrpls.pll, gokdate.sql and goknlsg.sql)
    a) Convert to pld, apply date modifications to the pld and convert back to pll.
    b) Modify the following routines for specific I18N date modifications:
     	 G$_DATE_REFORMAT, G$_DATE_WHEN_NEW_ITEM and G$_MOUSE_DOUBLECLICK.
    c) Add G$_FORM_NLS package body and spec.  Add call to init_form in G$_FORM_STARTUP
    d) Modifications for missing g$_nls.get calls and non-I18N numeric mask in routine
       G$_POPULATE_GXRDIRD_LOVD
10. SJQ 08/29/2005
    Update the G$_NAVIGATION_FRAME.EXECUTE_GUROPTM to handle situations where an option entered
    is for a "block" but no item name is entered.  The logic assumed that an item name was always
    entered and when it attempted to verify the block.item is enabled it generated an FRM error.
    The logic was changed to only verify the item if an item name was entered.  If no item name
    was entered, the logic would execute a GO_BLOCK instead of a GO_ITEM.
11. SJQ 08/31/2005
    Add new G$_CONVERT_ETHNICITY_CODE and G$_POPULATE_ETHNICITY_LIST routines for support of the 
    Race/Ethnicty enhancements.
12. SJQ 09/01/2005
    Update the G$_NAVIGATION_FRAME.EXECUTE_GUROPTM to handle situations where an option entered
    is for a "window" but no item name is entered.  The logic assumed that an item name was always
    entered and when it attempted to verify the block.item is enabled it generated an FRM error.
    The logic was changed to only verify the item if an item name was entered.  If no item name
    was entered, an error message is produced.  Update the logic in the G$_RECONNECT to remove
    calls to the G$_NLS.GET function when the reconnect failed or if other errors exist.  Since
    the user is not connected, can't call the database function.
13. SJQ 09/02/2005
    Update the G$_GOQOLIB_KEY_TRIGGER.ON_ERROR logic to check if the user has been disconnected
    from the database.  If they have been, call the G$_RECONNECT routine to be prompted to logon
    again.  Updated the G$_RECONNECT routine to add a message to tell the user they need to exit
    and restart their session.
14. SJQ 09/07/2005
    Added new function, G$_QUERY_ONLY_ROLE, to determine if the current form is running with
    a query only role.  Several different routines need to determine this so that various menus
    or options can be disabled or enabled.  Currently being called by the G$_POP_UP_MENU routine.
    Updated the G$_POP_UP_MENU to disable selective options if the form is currently running with
    a query role.  Updated the G$_GOQOLIB_PP_TRIGGER.PRE_COMMIT logic to call the new
    G$_QUERY_ONLY_ROLE function and removed local implementation.  Modify the G$_RECONNECT routine
    to remove some calls to the G$_NLS package since the user is not currently connected to the
    database.  These changes were to address additional issues related to defect 75322.
15. SJQ 09/20/2005
    Update the G$_GOQOLIB_KEY_TRIGGER.ON_ERROR routine to move the accessing of the DBMS_ERROR_CODE
    out from the initialization section to a point after testing the form errors to determine
    whether the user has been disconnected from the database.  If they have been disconnected,
    accessing the DBMS_ERROR_CODE causes more errors.  Update the G$_RECONNECT to change the
    message commands into alerts.  The messages are displayed when the user tries to reconnect and
    enters a different userid or database connect string.  During the situation where the user is
    trying to reconnect and cause other errors, the messages didn't always appear or appeared at
    the wrong time.
16. SJQ 10/03/2005
    Remove a left over debug message from the G$_GOQOLIB_KEY_TRIGGER.ON_ERROR routine.
17. TGK 10/07/2005
    Modify DBMS_SESSION call to use G$_TRACE_PKG.DO_EXEC_SQL routine.  This DBMS_SESSION call was
    found in the routine G$_FORM_NLS previously provided for support of I18N date modifications.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail71Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_7_0_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_7_0_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 7.0
1.  SJQ 07/21/2003
    Upgrade to new version of toolset.
2.  SJQ 07/21/2003
    Modify the G$_MENU_BAR routine to disable the menu icons when on the menu form.
3.  SJQ 07/28/2003
    Modify all of the G$_ENV routines which were referencing the WIN_API routines to simply
    return FALSE.  This is being done to remove errors for routines which call the G$_ENV
    routines.  Modify the G$_SECURED_FORM_CALL routine to remove references to the toolbar
    parameters.
    Start removing obsolete code.  List of the ones removed:
      G$_DRAG_DROP
      G$_RELOAD_PREFERENCES
      WIN_API* routines
4.  SJQ 08/05/2003
    Remove most of the logic from the G$_TOOLBAR package.  Need to review additional changes.
5.  SJQ 08/11/2003
    Modify the G$_WALK_FORM to remove references to the toolbars and navigation frame.
    Modify the G$_TOOLBAR package to remove the LAST_BTN_PRESSED_PROPERTY routine.  Modify the
    G$_B2K_WIN_HELP.DISPLAY_HELP routine to remove calls to the G$_WINHELP procedure.  Remove
    the G$_WINHELP procedure.  Remove all client/server logic from the G$_SHOW_MENU_BKSHLF.
    Remove the G$_HOST routine.  Modify the G$_MENU_BAR.SET_OPTIONS routine to remove logic
    which was specific to client/server.
6.  SJQ 08/19/2003
    Modify the logic in the G$_NAVIGATION_FRAME to remove all logic not needed to support the
    display of options on the menu.  Remove the G$_HINT package. Remove the G$_RESIZE_MAIN_WINDOW
    routine.
7.  SJQ 09/02/2003
    Modify the G$_SET_INST_PROPERTY routine to append the new global for the current quickflow
    status.  This will be populated by the quickflow form.  This is to show the progress.  Add
    a new G$_QUICKFLOW procedure.  This routine can be called to launch and execute a quick flow.
8.  SJQ 09/05/2003
    Add new routine G$_POP_UP_MENU for supporting pop up menus.
9.  SJQ 10/01/2003
    Add new routine G$_ADD_TO_PERSONAL_MENU to allow the popup menu to add the current form to
    a user personal menu.
10. SJQ 10/02/2003
    Add logic to the G$_SECURED_FORM_CALL_PL to check the value of a new global to determine if
    the routine should issue an exit for an attempt to return to the menu form.
11. SJQ 10/15/2003
    Add new routines for setting NVAs.  Created G$_NVA_SET_CANVAS, G$_NVA_SET_PROMPT,
    G$_NVA_SET_ITEM, G$_NVA_SET_KEY_BLOCK and G$_NVA_SET_WINDOW.  Each routine executes a NULL 
    command.  This is for future enhancements.
12. SJQ 10/16/2003
    Add new routine for setting the separator line NVA.  Add logic to the G$_WIN_CLOSED routine
    to support the closing of windows via the little 'X' icon.
13. SJQ 10/18/2003
    Add new routines to G$_MENU_BAR for enabling and disabling the WF and BXS menu items and icons.
14. SJQ 10/20/2003
    Add a new procedure in the G$_GOQOLIB_KEY_TRIGGER package to support the KEY-MENU trigger.
    This is being created to cause the G$_NAV_CANVAS to be displayed if not currently visible 
    and it exists in the form.
15. SJQ 10/31/2003
    Add logic to the NVA_SET routines to look for specific named visual attributes.  More most, 
    there is no other logic.  The NVA_SET_CANVAS routine looks for GLOBAL.UI_CANVAS_COLOR and if
    valued, alters the respective named visual attribute to this new color.
16. SJQ 11/12/2003
    Add new routine, G$_NVA_SET_SCROLLBAR, to enable the setting of the scrollbar background color.
17. SJQ 11/13/2003
    Modify the G$_SEARCH routine to temporarily add the '>' as prompt when navigating into a code
    item and remove it when exiting.  Also, commented out the logic which caused the item to be
    resized.
18. SJQ 11/20/2003
    Added a new routine, G$_SET_IDEN_ITEMS, which should be called by the various IDEN
    forms to establish which items should be enabled and which ones shouldn't be.
19. SJQ 12/02/2003
    Rename audit trail procedures to append '_GOQRPLS' so the name is unique in other forms.
20. SJQ 12/08/2003
    Add G$_DATE_LONG_ITEM_NAME routine for date items which would normally call be less then 26
    characters in lenght (the name of the item) and would have a _DBT button.  Since the name is
    too long to follow this standard, a new routine needed to be created for those situations.
21. SJQ 12/18/2003
    Modify the data extract logic which was in the menu_bar and navigation_frame routines.  Changed
    logic which resided in both packages to a single procedure in the menu_bar package.  Also
    rewrote the logic to cause only one database query instead of two.  Removed the two previous
    functions (F_IS_DATA_EXT_ENABLED and F_IS_DATA_EXT_KEY_ENABLED).
22. SJQ 01/13/2004
    Modify the G$_DISPLAY_LOV logic provided by TGK.  The logic was changed to improve the placement
    of the displaying LOV.  Add a new routine, G$_VALIDATE_FIXED_LENGTH to be used by items which
    used to implement a fixed length attribute.  The attribute was obsoleted so this is an attempt
    to maintain existing functionality.
23. SJQ 02/10/2004
    Modify the G$_WALK_FORM package to remove the go to statements and rewrite using pl/sql looping
    functionality.  Modify the WALK_BLOCK routine to simply return and not execute any logic.  It
    was left in place in case there is a need to implement this type of functionality for other 
    reasons.
24. SJQ 02/12/2004
    Modify the KEY-MENU logic in the G$_GOQOLIB_KEY_TRIGGERS package to set a variable in the 
    G$_NAV_BLOCK for helping the WHEN-NEW-BLOCK-INSTANCE trigger logic to determine what should
    or should not be done.  Modify the G$_MENU_BAR to correct the logic which was activated the
    select icon when it shouldn't have been.
25. SJQ 02/16/2004
    Update the G$_NVA_SET_WINDOW routine to set the window color to the value of the canvas
    color if the window setting is null and the canvas setting is not null.
26. SJQ 02/26/2004
    Created the G$_GET_UPRF_CANVAS_COLOR, G$_GET_UPRF_SCROLLBAR_COLOR and 
    G$_GET_UPRF_SEPARATOR_COLOR functions to return the user preference settings from the 
    guruprf table for the user.
27. SJQ 03/01/2004
    Created the G$_GET_UPRF_BUTTON_COLOR and G$_NVA_SET_BUTTON routines.
28. SJQ 03/09/2004
    Updated the G$_SET_IDEN_ITEMS to make three additional items display on the address block
    if the form calling the routine is APAIDEN.
29. SJQ 03/10/2004
    Modify the G$_NAVIGATION_FRAME.POPULATE_GUROPTM routine to add the call to the pop up menu
    for population of the pop up menu to resolve defect where it wasn't always showing the entries.
30. SJQ 03/15/2004
    Add the enabling and displaying of the marital lov button to the G$_SET_IDEN_ITEMS.
31. SJQ 04/20/2004
    Add a new routine, G$_SET_USER_PREFERENCES, which will call all of the various routines
    which set up the user preference colors and UI settings.
32. SJQ 04/28/2004
    Remove the previously added G$_SET_IDEN_ITEMS routine since it was determined this was not 
    the right approach.  The code which was in this routine will be implemented in the individual
    IDEN forms.
33. SJQ 05/13/2004
    Add the G$_GET_UPRF_PROMPT_COLOR (which doesn't do anything yet) and 
    G$_GET_UPRF_CODE_PROMPT_COLOR routine to retrieve a user's custom settings for coloring
    prompts.
34. TGK 06/01/2004
    Modified routines within the G$_GOQOLIB_OPT_BLOCK package spec and body and the 
    G$_KEY_OPT_MENU procedure in support of UI changes to the Options Window.
35. TGK 06/03/2004
    Add G$_BUILD_FULL_NAME and modified G$_VALID_ALL_ID, G$_VALID_ID, G$_SEL_SPRIDEN_ID_NAME,
    G$_SEL_SPRIDEN_PIDM_NAME in support of consolidating ID field validation logic.
    Added GUAERRM as one of the uitility forms to skip in the G$_LAST_10.LAST_10_UPDATE procedure.
36. SJQ 06/11/2004
    Add G$_INVOKE_CM routine to handle calling the new common matching form.  Added logic to
    G$_IDNAME_SEARCH and G$_VALID_ALL_ID routines to call this new routine.
37. SJQ 06/15/2004
    Add G$_GET_UPRF_CM_FORMS which will return a list of forms which should invoke the new
    common matching form.
38. SJQ 06/28/2004
    Add G$_GET_UPRF_LINKS_CANVAS_COLOR, G$_GET_UPRF_MSG_CANVAS_COLOR, and G$_GET_UPRF_TREE_CANVAS_COLOR
    routines to get the user preferences for setting the colors of the canvases on the main
    menu.
39. SJQ 06/30/2004
    Modify the KEY_MENU logic in the GOQOLIB_KEY_TRIGGER package to disable the java listener
    when the navigation window is closed so that multiple windows aren't launched via the 
    hyperlink.  Add G$_GET_UPRF_LINKS_MY_INST function to get the settings for this user
    preference.
40. TGK 06/30/2004
		Added G$_VPDI_TRIGGER Package and Procedure for Baseline additions for vpd implementation.
		Created by PVV 05/17/2004
41. TGK 07/07/2004
    Problem: When nxtrec to an empty row, or inserting a row and then choosing to exit the form;
    a fields required property was necessitating having to acknowledge a message.
    SOLUTION: Modified G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM to save off the form's validation unit
    and then set the validation_unit to FORM_SCOPE.  Added to G$_GOQOLIB_KEY_TRIGGER an internal
    proc SET_FORM_VALIDATION_SCOPE, that restores the form's VALIDATION_UNIT when returning from
    B2K_EXIT_FORM. 
42. SJQ 07/12/2004
    Update the G$_VALID_ID_ALL routine to check the user preferences before displaying the
    deceased and confidential alerts.  Add a G$_GET_UPRF_IMAGE_DIR function to return the 
    directory location of images used by the G$_DISPLAY_IMAGE.  Modify the G$_DISPLAY_IMAGE 
    to use this new function.
43. SJQ 07/13/2004
    Replace the G$_POP_UP_MENU procedure with an updated package (G$_POP_UP_MENU) of the
    same name.  Make the appropriate changes to the G$_NAVIGATION_FRAME routine to call new
    procedures in this package.  Add additional forms to the exception list in the 
    G$_BUILD_FULL_NAME procedure.
44. SJQ 07/28/2004
    Modify the G$_MENU_BAR package to remove all direct references to the BXS icons and
    menu entries.  Have the routines which were enabling/disabling these call an existing
    routine in the package specifically written for BXS.  Modify this routine to call a
    routine in the BXS library.
45. TGK 07/29/2004
    Modified G$_GOQOLIB_OPT_BLOCK (spec and body) and G$_KEY_OPT_MENU relative to having 
    navigable hyperlinks on the Options Window.
46. SJQ 08/03/2004
    Remove the lines from the G$_MENU_BAR which were commented out.  Clean up.
47. SJQ 08/05/2004
    Added a new funtion G$_GET_UPRF_WEBRPT_SERVICE to get the value of new guruprf row 
    supporting a Report service name per run_report_object initial implementation modifications.
48. SJQ 08/09/2004
    Modify G$_SECURED_FORM_CALL_PL to correctly reset the global used by the return to menu
    option.  Global wasn't getting reset.  Implement logic in the same routine to support the
    exit banner menu option.
49. SJQ 08/10/2004
    Modify the G$_GOQOLIB_KEY_TRIGGER.KEY_PRINT routine to test if the canvas color is set to
    any value other than white.  If it is not white, set the G$_NVA_CANVAS visual attribute to
    white prior to issuing the print command and then reset it back to the original color.  
    This is so that printing to color printers doesn't cause windows to be printed in color.
50. SJQ 08/16/2004
    Modify the G$_MENU_BAR package to remove the workflow.open menu item from the logic.  This
    entry was removed by request from the GUMAPPL menu module.
51. SJQ 08/17/2004
    Modify the G$_GET_UPRF_WEBHLP and G$_B2K_WIN_HELP routines to add support the new design
    for online help.
52. SJQ 08/18/2004
    Modify the G$_B2K_WIN_HELP to remove the checking of help on gubobjs as part of the
    display logic.  No need to check for this as this column is obsolete.  Modify the 
    G$_MENU_BAR to make the on line help icon and menu item to be always enabled.
53. SJQ 08/19/2004
    Added the G$_MASKS package which is used as part of the PII data masking.
54. SJQ 08/20/2004
    Added the G$_ERROR_PKG package spec which contains several error constants which will be
    referenced by the ON-ERROR trigger in GOQOLIB.
55. SJQ 08/23/2004
    Add ON_ERROR and ON_ROLLBACK routines to the G$_GOQOLIB_KEY_TRIGGER package and move the
    logic from GOQOLIB to these new procedures.  Add POST_FORMS_COMMIT trigger to the
    G$_GOQOLIB_PP_TRIGGER package and move the logic from GOQOLIB to this procedure.  Add a
    SYNCHRONIZE to the G$_IDNAME_SEARCH.COPY_SELECTED_ID select so that when an ID is returned
    and the deceased or confidential alert pops up, the menu bar is visible.  Modify the 
    G$_ERROR_PKG package to call the GB_COMMON_STRINGS package to get the error code and message
    for a policy violation.
56. SJQ 08/25/2004
    Modify the ID/NAME search routine so that if an invalid name is entered, the user won't be
    taken to the matching form.
57. SJQ 08/26/2004
    Modify the G$_SET_INST_PROPERTY routine to remove obsolete variables and code.  Modify the
    G$_CREATE_METADATA to remove obsolete logic.  Modify the G$_FORM_STARTUP routine to add the
    call to the G$_MASKS.G$_STARTUP_MASK routine.
58. SJQ 08/30/2004
    Modify the G$_MASKS routine to remove the exception handlers so that an error is sent
    back to the calling routine.  Modify the G$_MENU_BAR routine to make sure the on line help 
    menu items are always be available.
59. SJQ 09/01/2004
    Modify the G$_NAVIGATION_FRAME to increase the size of some of the local variables to 
    correctly handle the concatination of object and description if both are completely filled
    to the maximum length.  Add new routines to retrieve the user preference settings for the
    6 personal links, both for description and url.  
60. SJQ 09/08/2004
    Add new routine, FGAC_SECURITY_NOTICE, to the G$_MENU_BAR which will enable the 
    FGAC_SECURITY icon on the menu module.  Cleaned out redundant and unused logic in the 
    G$_MENU_BAR package.  Modify the G$_DATA_EXTRACT routine to remove obsolete and unused 
    variables and logic.  Modify the G$_WRITE_BLOCK to remove references to client/server
    and remove unused variables.
61. SJQ 09/09/2004
    Additional code clean up for consistancy.  Add logic to the KEY-MENU routine to first
    check if there are pending changes, and if so, don't display the navigation window but 
    rather an error message that the pending changes need to be committed or rolled back.
    Remove all references to the FBEAN function which were related to the navigation hyperlink.
62. TGK 09/15/2004
    Removed valuing of "where the cursor was located" from pre-block of G$_NAV_BLOCK in GOQOLIB.
    With this modification, this valuing is being placed into the goqrpls.KEY_MENU routine 
    IF branch.
63. SJQ 09/21/2004
    Add logic to the G$_DISPLAY_ERR_MSG routine to address FGAC issues.  This logic looks for
    specific errors related to FGAC in order to display a custom message.
64. SJQ 09/22/2004
    Modify the menu_bar routine which displays or hides the workflow icons.  This was needed
    due to a re-organization of the gumappl icons.
65. SJQ 09/23/2004
    Update the G$_APPLY_STARTUP_MASK routine to add logic to disable update and insert 
    properties if the item is marked for conceal.
66. SJQ 09/27/2004
    Modify the G$_GOQOLIB_KEY_TRIGGER routine to change a variable from a reserved word.
67. SJQ 09/28/2004
    Modify the G$_SET_WIN_PROPERTY routine to remove logic for MOTIF.
68. SJQ 09/29/2004
    Modify the G$_DISPLAY_ERR_MSG routine which is invoked currently when an api is called to
    execute a DML change and an error is returned.  The routine was modified to issue a rollback
    so that the changes and locks could be released.  Modify the B2K_EXIT_FORM logic to consolidate
    the multiply issued commands into a single routine.
69. SJQ 09/30/2004
    Add a new routine, G$_VERIFY_ID_EXISTS, to enable verifying that an ID exists in the database
    even though the FGAC policy restricts the user from seeing it.  This will be called by several 
    different routines.  Modify the G$_IDNAME_SEARCH and G$_VALID_ALL_ID routines to call the new 
    G$_VERIFY_ID_EXISTS routine to verify if the spriden record actually exists but is not
    visible to the user.  Modify the G$_B2K_WIN_HELP.DISPLAY_HELP routine to build the list of 
    products installed and pass that information as part of the url.
70. SJQ 10/01/2004
    Modify the changes implemented in the G$_IDNAME_SEARCH for verifying that the user doesn't
    have access to the id/name entered to redo the search if a name was entered.
71. SJQ 10/06/2004
    Modify the G$_MENU_BAR.SET_FGAC_NOTICE procedure to query the GOVFGAC view instead of the
    GOVFUSR so that if the user has either VBS or PII turned on the icon will be enabled.  Update
    the G$_IDNAME_SEARCH.DISABLE_NAME_ITEMS to add in condition testing of the current form and
    if in the special list, issue a needed SYNCHRONIZE command.  Modify the G$_NAVIGATION_FRAME
    to replace a reserved word used as a variable name.
72. SJQ 10/11/2004
    Modify the G$_MENU_BAR.SET_FGAC_NOTICE to test if user is exempt from PII even if they have 
    PII rules so the FGAC icon on the menu will be not be enabled if the user is exempt.  Changed 
    the setting of the tool tip for the icon to match standards.
73. TGK 10/14/2004
    Modify the G$_VALID_ALL_ID routine moving the test for "verifying that the spriden record actually
    exists but is not visible to the user" earlier in the routine.  This is per controlling the call
    to the GOAMTCH form.
74. SJQ 10/14/2004
    Modify the G$_MASK routines to add the disabling of INSERT when the items are being disabled
    for UPDATE.
75. SJQ 10/15/2004
    Create new package, G$_F5_NAVIGATION, to contain all of the logic related to the F5 navigation
    and window.  This logic was moved from GOQOLIB to this new package.
76. SJQ 10/18/2004
    Add in missing asterik in error message in the G$_VALID_ALL_ID procedure.
77. SJQ 10/19/2004
    Correct the parameters in the G$_SEL_SPRIDEN_PIDM_NAME routine to make sure that if an ID
    fails validation that the user can't navigate out of the item and that a form_trigger_failure
    is raised.  Rewrite the logic in the G$_MOUSE_DOUBLECLICK to check the item's status prior
    to launching the calendar or calculator rather then launching them and then testing if the
    value can be copied back.  This is so that if an item is concealed or partially masked that
    the user can't see the value by having it copied to those forms.  Make the same change to 
    the G$_DISPLAY_LOV procedure.
78. TGK 10/20/2004
    Added message_level around the commit inside G$_ADD_TO_PERSONAL_MENU to surpress "No changes to
    save" message, when selecting from pop-up menu to add the current form to the Personal menu.
    Modify WEB.SHOW_DOCUMENT parameter from _TOP to _BLANK in G$_B2K_WIN_HELP body. This is to better
    support various browsers presentation of the help.
79. SJQ 10/21/2004
    Modify the G$_BTN_PRESSED logic to verify the item is enabled before attempting to navigate.
    If an item is hidden with PII but the list button is still enabled, this will stop the 
    navigation.  Modify the G$_NAVIGATION_FRAME to test if the item to navigate to is enabled
    prior to going there.  For block/item type navigation, change the logic to do a GO_BLOCK 
    instead of a GO_ITEM.  For window type navigation, no block is available so generate a message.
    Modify the G$_KEY_OPT_MENU to verify that the item which is passed in is enabled, and if not,
    display an error message and don't continue.  Rewrite some of the logic in the G$_MASK package
    which was incorrectly attempting to get and set properties on items where these properties
    were not appropriate.
80. SJQ 10/22/2004
    Modify the G$_DISPLAY_LOV to change the variables which hold the initial "middle" calculation
    to be of type INTEGER instead of number.  Some time the calculations were coming up with 
    fractions and this was sometimes causing the lov to be displayed in a position that made
    scroll bars appear on the window.
81. SJQ 10/27/2004
    Update the G$_MASK package to determine the type of the item and based on that, only enable
    the appropriate item properties.  Add logic to the G$_MENU_BAR to test the value of the
    GLOBAL.KEEP_ALIVE to determine if certain menu options should be enabled if being called
    via a channel.
82. SJQ 10/28/2004
    Update the G$_MASK package to have a switch which determines whether or not masking is
    enabled.  Add logic to the other routines to test this and exit if masking is not enabled.
    Updated the queries to be mutually exclusive to reduce overhead and correct some possible
    problems.  Set the new switch in the package to turn masking off for now.
83. TGK 11/01/2004
    Set the new switch in G$_MASK such that masking is on.
    Remove the FULL_ROLLBACK on EXIT_FORM statement in G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM inside
    IF Statement for form_stauts = 'QUERY'.
84. TGK 11/02/2004
    Modify WEB.SHOW_DOCUMENT parameter from _BLANK to SCTBANNER in G$_B2K_WIN_HELP body. This is
    to better support various browsers presentation of the help.  This will make online help present
    within a single browser session, no matter how many times it is called.  (The change of the
    parameter to SCTBANNER can be any alphanumeric combination).
85. SJQ 11/12/2004 (implemented by TGK).
    Added function G$_RESYNCH_RECORD to calculate the block's activity date item and fetch it back
    from the database.  This is needed with some of the APIs since they are not passing the activity
    date in but they are being updated.  The form then thinks the record was updated by another user
    and thus would raise an error.  This function is called by the ON-INSERT and ON-UPDATE triggers
    after executing the API call to re-synchronize the activity date.
86. SJQ 11/17/2004
    Update the G$_MASKS routine to replace the query which is used to identify the rules for users
    in a business profile.  Query was not working correctly.
87. SJQ 11/18/2004
    Added logic to the G$_F5_NAVIGATION.CALL_ROUTINE to change the select statement into a cursor.  
    Also add logic so that if the cursor fails, to call the security routine to verify the object
    is valid.  If valid, but not able to determine what type of object it is, default the object
    type to FORM and let the logic attempt to call the form.  This will cause the access violations
    to be logged.
88. TGK 12/01/2004
    Added logic to the g$_secured_form_call_pl routine that saves off the value of the calling form,
    if the calling forms' wf_submit icon is enabled.  After returning from the form call, if the 
    returned to form is the saved off value then set the wfsubmit and wfrelease to be enabled else 
    disabled.

AUDIT TRAIL: 7.0.0.1
1.  SJQ 04/21/2005
    Update the G$_MASK package so that if an item is to be concealed, that it is also not enabled.
    If they are enabled, then the value can be copied and pasted into some other location as 
    clear text.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_6_0_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_6_0_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 6.0
1. G Shalovka  26 Sep 2002
   Applied General 5.5 System Test corrections.  
2. G Shalovka  03 Oct 2002
   Correct defect 81010.
   Problem: Defect resolutions for General Release 5.4.0.1 were not 
              in General 5.5 version.
   Impact:  Four defects resolutions were lost.
   Solution: Re-apply 5.4.0.1 code.  Reference audit trail 5.4.0.1 for details.
3. HCheng   12/23/2002
   Defect #35055
   Problem:  Not support bookshelf function when calling from gumappl.mmb;
            Bookshelf didn't work in INB env. 
   Solution: Added function G$_GET_UPRF_WEBBKSHLF to return URL of Banner 
            Bookshelf; Modified G$_BTN_PRESSED and G$_TOOLBAR.TOOLBAR_RUN to 
            show bookshelf in INB when calling from bookshelf iconic button; 
            Added procedure G$_SHOW_MENU_BKSHLF to show bookshelf when calling 
            from menu.
4.  SJQ 01/22/2003
    Add a new routine (G$_RECONNECT) which tests if the user is currently connected
    to the database.  If not, reconnect using the current logon parameters.  This is
    being migrated from the 5.5.2 release.
5.  G Shalovka  24 Jan 2003
    Add function G$_GET_MAIN_WINDOW_TITLE, which is called from G$_SET_INST_PROPERTY. 
    New function will replace the existing MAIN_WINDOW Title Bar description with 
    value from GUBOBJS_DESC.
6.  HCheng 02/27/2003
    Add a new routine G$_POPULATE_GXRDIRD_LOVD for PAYROLL.
7.  HCheng 03/03/2003
    Modified G$_GET_MAIN_WINDOW_TITLE to use PERSONAL_FORM_DESC%NOTFOUND and 
    BANNER_FORM_DESC%NOTFOUND instead of SQL%NOTFOUND.
8.  G Shalovka  21 Mar 2003
    Updated G$_NAVIGATION_FRAME.DEFINE_OPTION to remove double brackets
    when not needed from Menu Bar Options; Client Server environment only.
9.  HCheng 04/01/2003
    Modified G$_RECONNECT with optional parameter to provide feedback message
    when called from HELP/Technical/Reconnect.
    
AUDIT TRAIL: 6.0.1.1
1.  SJQ 07/14/2003
    Modify the G$_RECONNECT routine to force the user to provide the logon parameters
    instead of automatically reconnecting.  Verify user id and database connect strings 
    are the same as what was originally used. (87106)
    
AUDIT TRAIL: 6.1
1.  SJQ 07/15/2003
    Modify the G$_MENU_BAR to add support for the new Tools menu.  This option is 
    enabled when calling forms and disabled when returning to the main menu form.
2.  SJQ 08/01/2003
    Modify the G$_WRITE_BLOCK routine to make the mode and output file values equal
    between the package spec and body.
3.  XZ 08/05/2003
    Modify G$_IMG_DRIVER. GOQOLIB has been changed in this release, which requires all 
    Banner forms be recompiled. For newly compiled Banner forms, they will call EOQRPLS 
    directly instead of calling G$_IMG_DRIVER in GOQRPLS. If a Banner form is not 
    recompiled, it will still call G$_IMG_DRIVER when the first BXS toolbar icon is clicked. 
    Add the code in G$_IMG_DRIVER to intercept such calls and redirect to EOQRPLS.
    
AUDIT TRAIL: 6.1.1
1.  SJQ 09/26/2003
    Add a new routine (G$_DISPLAY_ERR_MSG) to build a parameter list, then call the new
    error form to display the value of the parameter which is passed.  This routine will
    be called by all of the API routines which need to display an error which is passed
    back from the database routines.  Can be used for any other messages as well.
2.  SJQ 11/03/2003
    Add new routine to the G$_GOQOLIB_KEY_TRIGGER (ON_SELECT) to determine if the user has
    performed an extended query.  The logic evaluates a new global to determine whether or not
    to limit the user functionality.  If the global is set, the user will receive an warning
    message if extended query functionality is attempted.
3.  GS 12/02/2003
    Problem: If a query is used to limit the results that display on TSAAREV [by Detail Code, 
    Trans Date, etc] and then a Data Extract is performed, the query cannot be cancelled nor can 
    the form be re-queried unless a User EXITs the form.
    Solution: Modify the G$_DATA_EXTRACT Procedure Body to reset the DEFAULT_WHERE block 
    property from 'where_clause_save' to 'where_clause_orig'. (85937)

AUDIT TRAIL: 6.2
1.  TGKinderman 03/02/2004
    Problem: The date-time-stamp does not appear in the print of a form in INB on Windows2000
    client.  Solution: In G$_GOQOLIB_KEY_TRIGGER.KEY_PRINT added, for web only, a dbms_lock.sleep
    after the print builtin and before the set_date_time (false) call. (81303)
2.  TGKinderman 03/02/2004
    In G$_SET_INST_PROPERTY if a form has a non-null item FORM_HEADER.MOD_ID; this value is appended
    with brackets into the window title bar following the current release number.  If the current
    release number does not display, the FORM_HEADER.MOD_ID does not display.  The FORM_HEADER.MOD_ID
    is a "form branding mechanism".  It is not intended to work with versioning.

AUDIT TRAIL END
</multilinecomment>
BEGIN
	NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail60Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_5_0_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_5_0_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 5.0
1.  FHL 5/08/2000
    Added package spec and body F60WRITE to this library.
    This functionality (extracting a block's data to a flat file)
    will be implemented via a new menu choice (in GUMAPPL.mmb)
    that writes out all displayed items in every record queried
    to a .csv file.
2.  FHL 5/15/2000
    Modified G$_GOQOLIB_PP_TRIGGER in the PRE_BLOCK and POST_BLOCK
    procedures to change the way we hi-light the current record.
3.  FHL 5/18/2000
    Added new function BLOCK_EXISTS which will be used in the menu (GUMAPPL)
    as well as in package G$_MENU_BAR.
4.  GS  22 May 2000
    Added code to the following procedures to enable the Menu Bar Options
    in both Web Enabled and Client/Server environments:
    G$_MENU_BAR, G$_NAVIGATION_FRAME, G$_SECURED_FORM_CALL,
    G$_SECURED_FORM_CALL_PL.
5.  GS  23 May 2000
    Modified G$_SEARCH.Define_RG.
    Variable STATUS changed from type number(1) to type number.
    Corrected problem using Key-Next-Item in Code items
    that have associated Description items.  This originally
    resulted in FRM-40735 unhandled exception errors.
6.  GS  10 June 2000
    Modified G$_NAVIGATION_FRAME.Define_Options to handle greater than
    24 entries for Menu Bar Options.
7.  FHL 8/15/2000
    Modified G$_IDNAME_SEARCH package body & spec to order extended
    name search by name as provided by Matthew Hull of CT Community
    College. Comments in these procedures of the change reflect a date
    of 6/13/00.
8.  TGKinderman 08/15/2000
    Modified G$_GOQOLIB_OPT_BLOCK.WHEN_NEW_ITEM_INST to disable the invoking
    of the timer to drive the selected option from the option window.
    The destination form icon buttons caused locking on web runtime. Changed
    to invoke appropriate do_key logic and by-pass timer.
9.  TGKinderman 08/22/2000
    Modified such that invoking an option never puts you in an 'exit with value'
    condition.  Modified G$_NAVIGATION_FRAME.EXECUTE_GUROPTM to also indicate
    a navigation frame item was selected if the guroptm_type_ind is 'P'. Modified
    G$_SEARCH.WHEN_MOUSE_CLICK to recognize Control+ shift_state  
10. TGKinderman 09/07/2000
    In order to correct the subordinate window x,y position and lov x,y position
    in the web environment; Modified G$_SET_INST_PROPERTY to not make the call
    to G$_RESIZE_WEB_WINDOW. Modified G$_DISPLAY_LOV to bypass the horizontal
    and vertical offset calculations if it is web.  Reworked the lov_x and lov_y
    calculations if it is web.
11. SJQ 09/08/2000
    Modify all routines which called the G$_TRACE_PKG.  These were removed since
    the new FRD option provided by Oracle is more detailed.
12. SJQ 09/08/2000
    Removed the G$_WIN_API routines.  These were copied from the D2KWUTIL.pll 
    and renamed to adhere to naming conventions.  Since several versions have 
    been distributed since then, the original names will be maintained so that
    newer versions can simply be dropped in place without further modification.
13. SJQ 09/18/2000
    Replaced all CHANGE_ALERT_MESSAGE commands with SET_ALERT_PROPERTY commands.
    The previous command was unsupport and will be desupported.
14. SJQ 09/20/2000
    Remove the synchronize in the G$_IDNAME_SEARCH.DISABLE_NAME_ITEM routine. 
    This routine gets fired in the PRE-TEXT-ITEM trigger and is an illegal
    command in this routine.
15. SJQ 09/21/2000
    Modify several local variables in the G$_IDNAME_SEARCH and G$_SEARCH
    packages.  They were showing up as reserved words.
16. TGKinderman 09/21/2000
    Modified such that no scroll bars appear when calling a form.  Modified
    G$_RESIZE_MAIN_WINDOW to subtract an adjustment value (6) when setting
    the width of the main window for the web environment.
17. GS  25 Sep 2000
    Added code to G$_NAVIGATION_FRAME.Define_Option procedure to remove extra
    space characters from the Menu Bar Option items.  These extra spaces were
    inserted to allow proper alignment of the Menu Item Description in the 
    Navigation Frame.
18. SJQ 10/13/2000
    Remove left over comments from debugging various routines.  Remove additional
    calls to the TRACE_RTN since this is not used any more.
19. SJQ 10/17/2000
    Modify the G$_DO_NEW_MESSAGES_EXIST routine to do a RETURN and not execute.  This
    is temporary to stop the crashing.  This is an Oracle bug.  Modify the G$_SEARCH
    package routine FIND_EXACT_MATCH.  Comment out the second call to column_to_char.
    This is a description column which should always return a varchar.
20. SJQ 10/27/2000
    Modify the COLUMN_TO_CHAR routine in the G$_SEARCH package to have it find the
    table owner based on synonym for improved performance.
21. GS 01 Nov 2000
    Add code for Data Extract enhancement:
      add Program Unit G$_WRITE_BLOCK containing f60write utility;
      modify G$_MENU_BAR to add functions F_IS_DATA_EXT_ENABLED and F_IS_DATA_EXT_KEY_ENABLED;
      modify G$_MENU_BAR.Regular_Menu_Set to add code 
          to enable /disable new Help Menu Items ExtractK and ExtractNK.
22. TGKinderman 11/14/2000
    TOOLTIP_TEXT Changes: 1) Added G$_WALK_FORM package that passes through all items in all
    blocks so as to value icon buttons with a TOOLTIP_TEXT value. Called from G$_FORM_STARTUP.
    2) Added boolean function to determine if v_disp_hint_cb is equal 'Y' (display bubble help
    or tooltip_text).  This function is used within G$_FORM_STARTUP. 3)Added to G$_TOOLBAR.SET_BTN
    logic to value TOOLTIP_TEXT if v_disp_hint_cb is Y.  4) Nulled out procedures
    G$_HINT.ShowButtonHelp and G$_HINT.HideButtonHelp.
23. GShalovka 15 Nov 2000
    Add code for Form Name Display Option enhancement:
      modify G$_NAVIGAION_FRAME to add variables and code to display 
      GUROPTM_FORM_TO_BE_CALLED if valued according to GURTPRF_FORMNAME_DISPLAY_IND value.
      This will allow a form mnemonic or other descriptive text to be displayed 
      in Menu Bar Options and/or Navigation Frame, or not displayed at all.   
24. SJQ 12/08/2000
    Add new routines for accessing various records in the user preference table.
    One routine will be built for each type of record to be queried and one which 
    accept those parameters and do the sql.  The G$_GET_UPRF_HELP is for online
    help.  The G$_GET_UPRF_WEBHLP is for web help.  The G$_GET_UPRF_WEBRPT is
    for reports on the web.  The G$_GET_UPRF_DATAEXTRACT is for the data extract
    routine.  The G$_GET_UPRF_VALUE is the routine which executes the query based
    on the parameters passed in by the other routines.  Modified the G$_B2K_WIN_HELP
    routine to use these new functions.
25. DRM 12/20/2000   Reference defect 50-0031.
    Creating new package G$_IMG_DRIVER to deal with all invocations from
    an SCT Banner toolbar into the SCT Banner(r) XtenderSolutions(tm) product.
    This code was formerly located in GOQOLIB but was relocated to this location
    for future expandibility.
26. GShalovka 28 Dec 2000
    Add code to G$_GOQOLIB_PP_TRIGGER.Pre_Block to set block highlighting 
      to G$_NVA_HIGHLITE_FIXED_TEXT if current item has attribute equal
      G$_NVA_FIXED_TEXT_ITEM.  Default is G$_NVA_HIGHLITE_TEXT.
    This change is to handle cases on forms where display should be in 
    non-proporitonal font. Without this change text was skewed and did 
    not appear properly. 
27. NL 01/10/2001 
    Additional logic included in G$_TOOLBAR.TOOLBAR_RUN to hide vertical and
    horizontal scrollbars in forms called from the toolbars' icons, Ex: GUAMESG.
28. SJQ 01/10/2001
    Modify the G$_GET_UPRF_WEBRPT routine to not append a '/' to the end.
29. SJQ 01/11/2001
    Changed the name of a routine to adhere the naming conventions and modified
    the reference to it in the G$_MENU_BAR package.

AUDIT TRAIL: 5.1.0.1
1.  SJQ 03/12/2001
    Modify the G$_SEARCH routine to resolve the navigational problems.  Modifications
    were spread through the routine, making everything be pl/sql 8 compliant and
    renaming various local variables so they didn't match reserved words.

AUDIT TRAIL: 5.2
1. WG 05/02/2001
   New program units G$_POPULATE_TBBDETC_LOVD and G$_POPULATE_ATVGIFT_LOVD
   for Web for Admisions Enhancement project.
2. Defect....6119,12662  TGKinderman 17-MAY-2001
   Problem...GTVZIPC "exit with value" only passes out the ZIPCODE value.  ZIPCODE and CITY
             need to be passed out to identify proper GTVZIPC row.
   Fix.......Create G$_CITY_STATE_NATN3 to be used in the KEY-LISTVAL to pass in ZIPCODE and
             CITY and pass out STate, Nation and County.
3. SJQ 05/24/2001
   Modify the G$_SEARCH.CODE_KEY_NEXT_ITEM routine to duplicate the setting of 
   a local variable using a NAME_IN command.  Appears to be some type of Oracle
   bug.

AUDIT TRAIL: 5.3
1. Defect....63313  TGKinderman 30-JUL-2001
   Problem...Extract Data menu selections, under Help, are not maintaining display
             attributes (enabled or disabled).  When you call form B from form A, form B's
             Extract Data menu selection display attributes overwrite form A values.  When
             you return to form A the display attributes are different than before the call
             to form B.
   Solution..Restructure and add to the Procedure REST_MENU_AFTER_FORM_CALL.  (1) Move the
             Function declaration statements for F_IS_DATA_EXT_ENABLED and
             F_IS_DATA_EXT_KEY_ENABLED from the top of the G$_MENU_BAR package Body to the
             bottom of the G$_MENU_BAR Package Spec.  So they can be seen externally.
             (2) Value the variable current_form at the beginning of functions
             F_IS_DATA_EXT_ENABLED and F_IS_DATA_EXT_KEY_ENABLED in the G$_MENU_BAR Package
             Body.  Variable was not accurate when returning from a LAST_10 form call.
             (3) Add logic to call the functions G$_MENU_BAR.F_IS_DATA_EXT_ENABLED and
             G$_MENU_BAR.F_IS_DATA_EXT_KEY_ENABLED and appropriately enable or disable the
             Data Extract menu selections.  This logic is added at the end of the Procedure
             RESET_MENU_AFTER_FORM_CALL in the G$_NAVIGATION_FRAME Package Body.
2. Defect....62519  TGKinderman 30-JUL-2001
   Problem..."Save and Print" not available from GJIREVO for web-enabled.
   Solution.."Save and Print" when on the Web using web.Show_Document. 1) Added function
             G$_GET_UPRF_WEBOUTPUT to return the user preference row (guruprf), Web Output
             URL.  This user preference row designates the web server database location for
             database procedure execution.
3. BXS Baselining   DRM         08-AUG-2001
             Changes to package G$_IMG_DRIVER, namely, addition of new procedure
             p_img_execute_v53.  Legacy procedure p_img_execute was left untouched to
             provide backward compatibility with forms that are not regenerated as of
             General 5.3.

AUDIT TRAIL: 5.4
1.  SJQ 09/28/2001
    Modify the G$_TRACE_PKG package to add routines to support the ability to perform an
    Oracle sql trace during a runtime session.  These will only be called by the GUMAPPL
    menu module.  These are being added to help with performance tuning.  They are usable
    by developers and end users.
2.  SJQ 10/10/2001
    Modify the G$_BTN_PRESSED, G$_TIMER_EXP and G$_TOOLBAR to remove references to the 
    G$_HINT package.  This package is to be obsoleted and no longer used.  Will be removed in
    the future.  Also modified the G$_HINT package to remove references to the SHWHNT32.DLL.
    The G$_HINT package is being left in for compatibility reasons and will be removed with
    the next major release.
3.  SJQ 10/26/2001
    Modify the G$_TIMER_EXP, G$_WIN_CLOSED and G$_GOQOLIB_OPT_BLOCK to remove references to
    the OPT_TIMER timer.  This is not used and thus obsolete.
4.  SJQ 10/26/2001
    Modify the G$_NAVIGATION_FRAME logic which is building the logic used to populate the 
    record group.  The BEGIN section is building a sql statement which was missing several
    spaces and was causing CURSOR_SHARING=FORCE to fail at a client site.  The created logic 
    was syntactically incorrect.
5.  Modify the G$_TRACE_PKG routines which support the sql trace function to enable and
    disable the menu options depending on which choice is selected.
6.  TKinderman 01/10/2002
    Made change to support UNIX Internet Native.  Created boolean function
    G$_ENV_IS_WEB_UNIX.  Returns TRUE/FALSE based upon evaluation of global variables.
    These global values initially set in GUAINIT start-up logic.  Get_appilcation_property
    is the USER_INTERFACE "WEB" and is the OPERATING_SYSTEM "UNIX".
7.  SJQ 01/14/2002
    Add logic to the B2K_EXIT_FORM routine to check if the cursor is currently in the KEY_BLOCK.
    If so, exit the form with no validation otherwise, continue to perform the remainder of the
    logic.
8.  SJQ 01/14/2002
    Add logic to the G$_FIND_WINDOW and G$_SET_INST_PROPERTY routines to check for the 
    FORMS_MDI_WINDOW which the system.event_window is populated with when using the little
    X icon to close a form.  This addresses the invalid window error (71728).
9.  SJQ 01/14/2002
    Modify the G$_DISPLAY_LOV routine to first verify that the item is a text item.  This function
    is not valid for other data types and generates errors.  This will give the user a message
    and then exit the routine.
10. SJQ 01/15/2002
    Add a new routine, G$_GET_UPRF_STARTUP_MENU, to be used to read the user preference table
    to obtain the value set by the user for their startup menu.  This will be used by the main
    menu form to determine what should be the starting place for the user.
11. SJQ 01/28/2002
    Modify the G$_TRACE_PKG to comment out the logic in the PLSQL_TRACE routines.  These are in
    test phase and reference a database package which is not part of the normal Oracle DB
    installation.
12. SJQ 01/28/2002
    Modify the G$_SEARCH routines to remove remaining calls to the G$_TRACE_PKG.
13. SJQ 03/02/2002
    Create new routine G$_DATA_EXTRACT which is the logic used for the data extract process.
    This logic was in the menu module.  Moved it here and cleaned up the logic.
14. SJQ 03/07/2002
    Modify the the G$_MENU_BAR routine to disable the data extract and the display image
    options on the menu if the current form is a menu form.
15. SJQ 03/15/2002
    Modify the G$_B2K_WIN_HELP to change the object name to be in lower case so that the files
    on a unix server can be found.  By default the names are upper case and the help files are
    in lower case.
16. SJQ 03/19/2002
    Modify the G$_DATA_EXTRACT and G$_WRITE_BLOCK to have specific logic to support web
    forms.  Add G$_WEB_SHOW_DOCUMENT routine which is used to create a web document and
    display that document in a separate browser.

AUDIT TRAIL: 5.4.0.1
1.  SJQ 05/06/2002
    Modify the POST_TEXT_CODE in the G$_SEARCH package to put back the call to the 
    G$_TRACE_PKG package.  By removing this, a synchronization problem arose in the PPAGENL
    form.  Further investigation is required.
2.  SJQ 05/06/2002
    Modify the G$_WRITE_BLOCK routine to enclose the data being extracted with double quotes so
    that embedded commas, special characters and single quotes don't cause problems.  Also added
    a message to notify the user if the text contains double quotes.
3.  SJQ 05/17/2002
    Modify the G$_DRAG_DROP package to remove left over debugging messages.  These were
    inadvertently left in and prohibit the use of the routine (77924).

AUDIT TRAIL: 5.5
1. Signoff....Lakshmi Radhakrishnan 10-july-2002
   Mod........Modify data extract functionality to return data as a .csv file type.
              In g$_web_show_document, change temp_procname to gokoutp.csv if user prefers mimetype of csv else
              set temp_procname to gokoutp.p_showreq.
2. JT 07/15/02
   Made changes to the G$_SET_INST_PROPERTY program unit to display the VPD institution
   code in the window title.
3. HC 07/25/02
   Defect# 69230
   Problem: Select menu item HELP -- Display ID Image from SPAIDEN,
            and get error FRM-41085: Ambiguous item name: SPRIDEN_ID.
   Solution: Modified the G$_DISPLAY_IMAGE program unit to specify both 
             current_block and current_item.

AUDIT TRAIL: 5.5.0.1
1. G Shalovka  02 October 2002
   Defect #
   Apply modifications from 5.4.0.1 release.
   Refer to the 5.4.0.1 audit trail for details.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_4_0_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_4_0_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 4.0
1.  AP 10/6/97
    Add the following procedures for the dynamic pulldown list items.
    G$_GET_LIST, G$_ENABLE_LIST, G$_FIND_LIST_ITEMS, G$_EXPAND_LIST,
    G$_COLLAPSE_LIST, G$_EXPAND_LIST_ON_EDGE, G$_SHOW_PULL_DOWN,
    G$_PLDOWN_NEXT_ITEM,  G$_PLDOWN_PREV_ITEM.
    Add package G$_IDNAME_SEARCH to enhance the ID and Name Search
    capability.
2.  NR 11/11/97
    Modified:
    G$_DISPLAY_LOV for Real to Character co-ordinate conversion;
    G$_KEY_OPT_MENU for new Option List window;
    G$_TIMER_EXP to support the above changes.
    Utilized with the G$_OPT_GROUP Object Group from GOQOLIB.
3.  NR 11/11/97
    Modified G$_GOQOLIB_PP_TRIGGER.Pre-Block and .Post-Block to
    highlight Items with a Required attribute within a record.
    Added G$_REQUIRED_ITEMS procedure to scan and set above NVA.
4.  GS 11/11/97
    Added G$_POPULATE_GUROPTM to build the blue navigation canvas.
    Utilized with the G$_TOOLBAR Object Group from GOQOLIB.
5.  JC 06/02/98
    Removed package G$_GOQOLIB_POP$_BLOCK.
    Procedures that handled Key-function were moved into G$_GOQOLIB_KEY_TRIGGER.
    Procedure W_N_R_INST was renamed as WHEN_NEW_REC_INST and moved into
    new package G$_GOQOLIB_USER_TRIGGER.
6.  JC 08/12/98
    Removed package G$_OPTION_MENU.
7.  Added package G$_LAST_TEN to keep all procedures used for performing any
    action with changing last_10 submenus in menu 'ACTION'.  
8.  JC 10/22/98
    Changes were made by Scott Freeman. G$_POPULATE_FTVBANK_LOVD 
    procedure was updated to reflect the new table gxvbank and  
    renamed as G$_POPULATE_GXVBANK_LOVD.  
9.  SJQ 11/24/98
    Modify the G$_SECURED_FORM_CALL_PL routine to make all form call commands
    have NO_HIDE.  This is to fix a problem with when-window-activated triggers
    in some forms.  This needs more research.
10. SJQ 12/03/98
    Add G$_B2K_WIN_HELP package to contain the logic required to support the new
    win help system.  Removed a few obsolete routines and all references to the
    option menu.
11. SJQ 12/04/98
    Modify G$_UPDATE_ACTIVITY_DATE to verify the column does exist.  Modify the 
    G$_SEARCH routine to disable search when in enter query mode.  Modify the 
    G$_IDNAME_SEARCH routine add a new message when in the name field.  Modify 
    the G$_GOQOLIB_PP_TRIGGER routine to add logic to support the required item 
    if not enabled.  Add new G$_SEARCH_WHERE routine to generate where clauses
    for Finance code and description searches.
12. SJQ 12/10/98
    Modify G$_BTN_PRESSED routine to hide the bubblehelp.  Add new version of the
    G$_DATE_REFORMAT to use the new database package.  Added G$_CHECK_FAILURE after
    all of the EXECUTE_TRIGGER commands.
13. SJQ 12/12/98
    Added new KEY-EXIT routine to G$_GOQOLIB_KEY_TRIGGERS.  Modify the G$_IDNAME_SEARCH
    to clear out the name field if the name search fails.  Modify the G$_MENUBAR routines
    to clear out the globals for the pre and post form logic.  Modify the G$_SEARCH
    routine to handle the '%'.  Remove the G$_SAVE_TITLE routine since it is never
    used.
14. SJQ 12/15/98
    Modify the G$_MOUSE_DOUBLECLICK routine to add additional condition test for the
    drag back from the calendar and calculator.  Removed the G$_POPULATE_FTVBANK_LOVD
    and G$_POPULATE_TBBBANK_LOVD.
15. SJQ 12/17/98
    Clear global in the G$_NAVIGATION.EXECUTE_GUROPTM routine.
16. SJQ 12/21/98
    Modify the G$_STARTUP routine to perform the global copy routine and to verify 
    that the current block has an associated base table prior to doing query.
17. SJQ 12/29/98
    Modify the navigation frame logic to remove the synchronize commands.  Move the
    G$_CURSORSET routine from another library to this one.
18. SJQ 12/29/98
    Modify the G$_DISPLAY_LOV logic to test for the existance of the horizontal and
    vertical toolbars prior to calculating the lov's offset.
19. SJQ 01/04/99
    Removed the G$_GUAMENU_CHECK_SET procedure from G$_STARTUP routine.  This
    procedure call is not needed.  Removed G$_SET_WIN_PROPERTY procedure from the
    G$_WIN_ACTIVATED routine since this is not needed.
20. SJQ 01/05/99
    Modify the clear form logic to verify that the clear form worked prior to 
    attempting to execute any other logic.  This addresses the issue where the
    user canceled the rollback and gets prompted a second time.  Add additional
    logic to verify that the block has a base table prior to executing the query.
21. SJQ 01/06/99
    Updated the KEY-PRVBLK and KEY-NXTBLK routines within the G$_GOQOLIB_KEY_TRIGGER
    to address the outstanding navigation problems.
22. SJQ 01/06/99
    Modify the logic in the G$_DATE_POST_ITEM to check if the form validation is 
    currently turned off and if so to turn it back on prior to checking if the form
    is running in enter query mode.  It used to turn it on after this test.  Removed
    the logic from the PRE-BLOCK and POST-BLOCK of the G$_GOQOLIB_PP_TRIGGER package
    to remove the required item high lighting.
23. SJQ 01/08/99
    Modify the G$_NAVIGATION_FRAME routine which disabled an option to correct
    the logic.  It now only reviews the options which have been selected for display.
24. SJQ 01/11/99
    Modify the KEY-EXIT logic in the G$_GOQOLIB_KEY_TRIGGER routine to turn off 
    validation prior to exiting the form to make sure that the post-form fires in
    all conditions.  Modify G$_SEARCH package to call the GUAHELP form when the
    shift key is held down and you doubleclick in an item.
25. SJQ 01/14/99
    Modify the exit logic to check if in query mode and if so, issue the exit_form
    command and return.
26. SJQ 01/18/99
    Modify the G$_SECURED_FORM_CALL_PL and G$_WIN_ACTIVATED routines to create and
    review a form specific global to determine if the when-window-activated trigger
    is being executed because the focus is returning from a called form.  If true,
    don't execute the logic in the when-window-activated trigger.
27. SJQ 01/19/99
    Added new routine (G$_DO_WIN_ACTIVATED) to be called by the when-window-activated
    trigger to determine whether or not to execute the remainder of the logic in the
    when-window-activated trigger based on the global.
28. SJQ 01/20/99
    Add new G$_NAVIGATION_FRAME logic.  Added additional timer logic to G$_TIMER_EXP.  
    This timer is set by the G$_DO_WIN_ACTIVATED to clear the global which is being 
    set by the G$_SECURED_FORM_CALL_PL for addressing the problem with the 
    when-window-activated processing.
29. SJQ 01/21/99
    Modify the EXIT_FORM logic in the G$_GOQOLIB_KEY_TRIGGER package.  The logic
    to exit the form was modified to handle attempting to exit with committing the
    changes that exist.  Now the commit will raise an alert box if the commit fails.
30. SJQ 01/22/99
    Modify the EXIT_FORM logic in the G$_GOQOLIB_KEY_TRIGGER package to further refine
    the logic to address the issues when exiting when changes are pending or errors exist.
    Changed the order of the KEY_CLRFRM routine in the G$_GOQOLIB_KEY_TRIGGER package to
    execute the GLOBAL_COPY before it attempts to do an execute query.  Additional 
    navigation frame modifications for enable and disable logic.
31. SJQ 01/25/99
    Add additional logic to the EXIT_FORM routine to check if the form status is reset
    after attempting to commit.
32. SJQ 01/28/99
    Modify the G$_GUAHELP routine to increase the size of a local variable to correctly
    handle the possible value being placed into it.  Modified several other routines 
    which did not have large enough variables for storing the value of system.cursor_item.
    Modify the G$_DISPLAY_IMAGE to use SYSTEM.CURSOR_VALUE.  The routine did not work
    prior to this due to changes in versions of forms.
33. SJQ 02/01/99
    Modify the exit form logic to remove the FULL_ROLLBACK option when exiting with no
    changes.  This caused a problem for forms called in query mode.
34. SJQ 02/08/99
    Modify the G$_UPDATE_ACTIVITY_DATE to use the block name in identifying the name
    of the field to be updated.  This fixes the problem where more than one block is
    based on the same base table in the form.
35. SJQ 02/11/99
    Add a new routine to check for any new messages based on the current date and
    time and if a newer message exists, display an alert.
36. SJQ 02/15/99
    Updated G$_TOOLBAR logic to use the parameter list which is passed in to determine
    which buttons on the toolbar should be displayed.  Modify the G$_SET_INST_PROPERTY
    routine to not use a global but to call the G$_TOOLBAR routine to determine which
    options (formname, instance, release) should be displayed.  Modify the way in which
    the G$_SECURED_FORM_CALL works.  Added logic to pass the new toolbar parameter list.
37. SJQ 02/18/99
    Modify the G$_SECURED_FORM_CALL_PL to add the parameter list to the form call for the
    xoqmenu form calls.
38. SJQ 02/22/99
    Modify the navigation frame logic to display/hide the buttons if on the web.  Modify
    the toolbar logic to add the missing parenthesis to the return commands.
39. SJQ 02/24/99
    Modify the G$_TIMER_EXP routine to do nothing if the cursor is sitting in the 
    G$_OPT_BLOCK.OPT_SEL field on the options window.  This fixes a problem on the 
    web.
40. SJQ 03/02/99
    Modify the G$_B2K_HELP routine to use the new global which contains the directory
    name for the help files.
41. SJQ 03/05/99
    Modify the G$_WIN_ACTIVATED routine to add logic for webforms to reposition the window
    to account for the navigation frame.
42. SJQ 03/11/99
    Added new G$_WIN_DEACTIVATED routine to be executed by webforms to set a global to
    know where the cursor was when it was leaving a child window.  Modify the logic in the
    G$_NAVIGATION_FRAME package to check this new global to determine whether to redo
    the options or execute them.
43. SJQ 03/24/99
    Modify the order of the routines within G$_GOQOLIB_PP_TRIGGER.POST_FORM to resolve
    a table access violation.
44. SJQ 03/26/99
    Modify the G$_GOQOLIB_PP_TRIGGER.PRE_BLOCK routine to force the population of the
    options record group if running on the web.  Modify the G$_MENU_BAR to add logic to
    enable or disable the options menu at form startup depending on whether any options
    exist (for webforms).
45. SJQ 04/26/99
    Modify the G$_NAVIGATION_FRAME to force word wrapping if the routine is called to 
    dynamically change the description of an option.  Remove several obsolete routines
    used by the previous version of the toolbar.
46. SJQ 05/11/99
    Add an offset to the positioning of all windows on the web to make sure they are
    positioned lower (vertically) on the screen.
47. SJQ 05/17/99
    Add additional logic to the G$_DATE_WHEN_NEW_ITEM to set the format mask for all
    date items, even if none was currently set.
48. SJQ 06/01/99
    Add logic to the G$_FORM_STARTUP routine to call a new routine (G$_RESIZE_MAIN_WINDOW)
    to increase the size of the window to allow for the additional size of the 
    vertical toolbar for the bug on webforms.
49. MVS 06/03/1999
    Add public function LAST_BTN_PRESSED_PROPERTY to the G$_TOOLBAR package to obtain
    the properties of the last button pressed on the toolbar of a form.
50. SJQ 06/23/99
    Modified several of the G$_SEARCH_WHERE routines 
    to remove the UPPER command.  Add logic to the G$_B2K_WIN_HELP routine to verify
    that the menu option is enabled otherwise produce a message if the iconic
    button is pressed.
51. SJQ 06/28/99
    Added logic to the G$_SET_INST_PROPERTY trigger to increase the width of windows which 
    are causing the menu to wrap when running on the web.
52. SJQ 06/29/99
    Modify the toolbar logic so that the vertical toolbar will not display on the web.
53. SJQ 07/06/99
    Move the resizing logic for webforms into G$_RESIZE_WEB_WINDOW and add logic to resize
    the height and reposition the window to address the additional line within the window
    for the menu.  Add logic to the toolbar so that you cannot start up the message form 
    while the message form is active.
54. SJQ 07/07/99
    Modify the G$_SET_WIN_PROPERTY routine to not attempt to resize the main window if 
    running in the normal win32 environment.  Add a global to the exit_form logic when the
    cancel button is pressed.  This will help form specific logic that will prohibit logic
    from firing within the WHEN-NEW-RECORD-INSTANCE trigger.
55. SJQ 07/13/99
    Modify the window movement logic to be more accurate.  Now it only executes once.
56. SJQ 08/03/99
    Modify the G$_MENU_BAR routine to treat the quickflow form like the menu.  Without
    this modification, any form called by launching a quickflow had the "select" menu
    option enabled incorrectly.

AUDIT TRAIL: 4.1
 1. NR 08/18/99
    Modified G$_TOOLBAR package; function FIND_BTN to find the physical button associated
    with an icon.
 2. Michael Hitrik 09/28/1999
    Added G$_CREATE_METADATA procedure, G$_read_metadata package
    Modified g$_secured_form_open_pl to handle 'OPEN_FORM' mode
 3. AC 11/12/1999
    Modified TOOLBAR_RUN in the G$_TOOLBAR package to allow any form which is called 
    via the toolbar to NOT be called in query mode. Replaced the QUERY_NOHIDE to NO_HIDE
    in G$_SECURED_FORM_CALL.
 4. MVS 12/31/1999
    Created functions G$_ENV_IS_WINDOWS95 and G$_ENV_IS_WINDOWS98 to enable Banner2000
    to specifically determine whether the current operating system is Windows 95 or
    Windows 98, respectively.

AUDIT TRAIL: 4.2
 1. EPM 04/03/00
    Added the procedure g$_extract_bcc_items and modified the procedure g$_create_metadata.
    These changes were made to support the process that tracks Banner form item changes
    that are relevant to Workflow.  This new procedure will never be called by clients it is
    for internal use only.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_3_0_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_3_0_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 3.0
1.  Added new G$_READ_INI routine to read the banner.ini      SQ 01/30/97
    file to obtain the various commands and options for the
    tool bar functions.  Added G$_HINT routine to provide
    bubble help on iconic buttons.  Added G$_IMAGE_HINT to
    provide bubble help on the image items on the main menu
    form.  Also rewrite the G$_OPTIONS_MENU routine to make
    options function as a pulldown menu rather than as an lov.
2.  Added new modes to the G$_SECURED_FORM_CALL to support    SQ 05/20/97
    NEW_FORM command.
3.  TAM 05/15/97
    Changed G$_DISPLAY_LOV to have a new optional 3rd parameter
    which tells the procedure whether it should copy the selected
    value back to the form.
4.  RLH 05/27/97
    Change G$_GOQOLIB_FUNC_INFO_BLOCK package body to use the
    name_in function with save_block_name item in KEY_EXIT,
    KEY_PRVBLK, and KEY_NXTBLK.
5.  SJQ 05/28/97
    Remove the display of the iconic button hint text in the message
    field in the G$_HINT.  Also add logic to the G$_MOUSE_DOUBLECLICK
    to test to see if the current block is the G$_OPT_BLOCK and if
    so, exit.
6.  Modify doubleclick logic to first see if the generated item name
    is greater than 30 characters and if so exit since this causes
    internal forms errors.
7.  Modify toolbar key logic to disable the cancel query execution if
    the form is not running in enter-query mode.
8.  SJQ 06/17/97
    Modify mouse-doubleclick logic to test for the shift state in a
    different format for Mac support.  This is used to display the
    GUAHELP form.  The mac shows the state with a minus sign, the 
    pc shows it with a plus sign.
9.  SJQ 06/24/97
    Add new routines to be used to verify or test what type of environment
    you are running in.  One for windows, mac, charmode, and gui.  They
    following the naming convention of G$_ENV_IS...
10. SJQ 06/25/97
    Modify toolbar_run logic to handle null icons.
11. SJQ 07/06/97
    Add routine to test if environment is web forms.
12. SJQ 07/07/97
    Modify LAST_10 routine to eliminate the GUACLGO from being added.
13. SJQ 07/22/97
    Modify drag and drop routine for mac support.
14. SJQ 07/30/97
    Modify mouse doubleclick logic to handle int and rint data types by 
    rounding the value returned from the calculator to whole number.  The
    money and rmoney values returned are rounded to 2 decimal places.  Also
    add some additional logic to the toolbar run routine to issues the calls
    differently for windows95 vs. windows3.x.
15. SJQ 08/11/97
    Modify toolbar_run logic to comment out the DDE commands for 16 bit 
    windows since charactermode doesn't understand these commands.  Use
    new version of code to do calls in Win31.

AUDIT TRAIL: 3.1
1.  SJQ 11/06/97
    Rewrite the G$_CHECK_OPTION_MENU routine to fix a bug
    in AIX and NCR platforms.  Problem with implicit cursor.
2.  SJQ 11/06/97
    Modify the G$_DISPLAY_LOV to display a new error msg
    if an error other than no data found occurs.
3.  SJQ 11/07/97
    Modify the G$_GOQOLIB_PP_TRIGGER.POST-FORM routine to have the
    proper code.  It had the same code as the PRE-FORM routine.
4.  SJQ 11/07/97
    Modify the G$_HINT body to change the way the dll's are initialized
    so that they always get initialized instead of only the first time.
5.  SJQ 11/10/97
    Rewrite the G$_SET_LAST_TEN routine to fix a bug
    in Sequent/Dynix platforms.  Problem with implicit cursor.
6.  SJQ 11/18/97
    Modify G$_SET_INST_PROPERTY to handle values longer than 78.  This
    is for schools with really long names to eliminate truncation errors.
7.  SJQ 11/19/97
    Add new routine to read the registry and other API type routines.  Add
    new G$_ENV_IS_WINDOWSNT routine to read the registry to try and determine
    if the machine is running NT.  Modify the G$_TOOLBAR_RUN routine to 
    handle NT differently than 95.
8.  SJQ 12/03/97
    Modify above mentioned routines to first check a global which should have
    been set in GUAINIT for increased performance.
9.  SJQ 12/05/97
    Remove obsolete routines to make file smaller.
10. SJQ 02/27/98
    Modify G$_GET_SET_LOCAL_DIR routine to handle missing variables.
11. SJQ 03/18/98
    Modify G$_SECURED_FORM_CALL routine to fix the QUERY problem.

AUDIT TRAIL: 3.1.0.1
1.  SJQ 06/26/98
    Modify the name routines to truncate the returned value to a maximum of
    60 characters.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail30Goqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit GOQRPLS.AUDIT_TRAIL_2_0_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_2_0_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 2.1                                            INIT   DATE
1. Converted to library.                                     SQ  05/24/94

AUDIT TRAIL: 2.1.11
1. Modifications to support 2 char product                   SQ  09/04/96
   identifier and 7 or 8 character form names.
2. Added new QUERY_NOHIDE option to the                      SQ  10/18/96
   G$_SECURED_FORM_CALL routine.
3. Add winexec routine to call windows programs.             SQ  11/14/96
4. Add G$_HINT and G$_IMAGE_HINT for displaying bubble help. SQ  11/14/96
5. Modify G$_SET_WIN_PROPERTY to add support for MOTIF.      SQ  11/17/96
6. Modify G$_LIST_VALUES_COPY to use system.cursor_item      SQ  11/17/96
   instead of current_item.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail20Goqrpls()
		{
		}

		
		public class QfTabtype extends Table<NString>{
			
		}

		public NBool gNchk(boolean b) {
			
			return gNchk(toBool(b));
		}


}
