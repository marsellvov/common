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

public class GGoqolibFuncInfoBlock extends AbstractSupportCodeObject {
	

	public GGoqolibFuncInfoBlock(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_GOQOLIB_FUNC_INFO_BLOCK
	/*
	PACKAGE G$_GOQOLIB_FUNC_INFO_BLOCK IS
--
  PROCEDURE SELECT_GEBFUNC (FUNC_SPNSR_ORGN_PIDM IN OUT NUMBER, 
                            FUNC_PURP_CODE IN OUT VARCHAR2,
                            FUNC_ETYP_CODE IN OUT VARCHAR2,
                            FUNC_FSTA_CODE IN OUT VARCHAR2,
                            FUNC_EMPH_CODE IN OUT VARCHAR2,
                            FUNC_PURP_DESC IN OUT VARCHAR2);

  PROCEDURE SELECT_SPRIDEN (SPONSOR_ID            IN OUT VARCHAR2,
                            SPONSOR_NAME          IN OUT VARCHAR2,
                            LOCATION_CONTACT_ID   IN OUT VARCHAR2,
                            LOCATION_CONTACT_NAME IN OUT VARCHAR2,
                            PRIMARY_CONTACT_ID    IN OUT VARCHAR2,
                            PRIMARY_CONTACT_NAME  IN OUT VARCHAR2);

  PROCEDURE SELECT_STVETYP (ETYP_DESC IN OUT VARCHAR2);

  PROCEDURE SELECT_SSRMEET (START_DATE IN OUT VARCHAR2,
                            END_DATE   IN OUT VARCHAR2,
                            MONDAY     IN OUT VARCHAR2,
                            TUESDAY    IN OUT VARCHAR2,
                            WEDNESDAY  IN OUT VARCHAR2,
                            THURSDAY   IN OUT VARCHAR2,
                            FRIDAY     IN OUT VARCHAR2,
                            SATURDAY   IN OUT VARCHAR2,
                            SUNDAY     IN OUT VARCHAR2,
                            BEGIN_TIME IN OUT VARCHAR2,
                            END_TIME   IN OUT VARCHAR2,
                            BUILDING   IN OUT VARCHAR2,
                            ROOM       IN OUT VARCHAR2);

  PROCEDURE KEY_PRINT;
  PROCEDURE KEY_OTHERS;
  PROCEDURE KEY_EXIT;
  PROCEDURE KEY_PRVBLK;
  PROCEDURE KEY_NXTBLK;
--
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_GOQOLIB_FUNC_INFO_BLOCK
		/*
		PACKAGE BODY G$_GOQOLIB_FUNC_INFO_BLOCK  IS
--                             
--                             
  PROCEDURE SELECT_GEBFUNC (FUNC_SPNSR_ORGN_PIDM IN OUT NUMBER, 
                            FUNC_PURP_CODE       IN OUT VARCHAR2,
                            FUNC_ETYP_CODE       IN OUT VARCHAR2,
                            FUNC_FSTA_CODE       IN OUT VARCHAR2,
                            FUNC_EMPH_CODE       IN OUT VARCHAR2,
                            FUNC_PURP_DESC       IN OUT VARCHAR2) IS
--
    V_FUNC_CODE  GEBFUNC.GEBFUNC_FUNC_CODE%TYPE  := NAME_IN('FUNC_FUNC_CODE');
    V_EVNT_CRN   GEBFUNC.GEBFUNC_EVNT_CRN%TYPE   := NAME_IN('FUNC_EVNT_CRN');
--
    CURSOR PTI_CURSOR IS
      SELECT GEBFUNC_SPNSR_ORGN_PIDM, GEBFUNC_PURP_CODE,
             GEBFUNC_ETYP_CODE, GEBFUNC_FSTA_CODE, GEBFUNC_EMPH_CODE,
             GEBFUNC_PURP_DESC
      FROM   GEBFUNC
      WHERE  GEBFUNC_EVNT_CRN = V_EVNT_CRN
      AND    GEBFUNC_FUNC_CODE = V_FUNC_CODE;
--
  BEGIN
    OPEN PTI_CURSOR;
    FETCH PTI_CURSOR INTO FUNC_SPNSR_ORGN_PIDM, FUNC_PURP_CODE,
                          FUNC_ETYP_CODE, FUNC_FSTA_CODE,
                          FUNC_EMPH_CODE, FUNC_PURP_DESC;
    CLOSE PTI_CURSOR;
--
    IF FUNC_PURP_CODE IS NULL THEN
      FUNC_PURP_DESC := '';
    ELSE
      FUNC_PURP_DESC := gb_gtvpurp.f_get_description(FUNC_PURP_CODE);
    END IF;       
  END;
--
--
  PROCEDURE SELECT_SPRIDEN (SPONSOR_ID            IN OUT VARCHAR2,
                            SPONSOR_NAME          IN OUT VARCHAR2,
                            LOCATION_CONTACT_ID   IN OUT VARCHAR2,
                            LOCATION_CONTACT_NAME IN OUT VARCHAR2,
                            PRIMARY_CONTACT_ID    IN OUT VARCHAR2,
                            PRIMARY_CONTACT_NAME  IN OUT VARCHAR2) IS
--
    V_ORGN_PIDM   SPRIDEN.SPRIDEN_PIDM%TYPE := NAME_IN('FUNC_SPNSR_ORGN_PIDM');
    V_EVNT_CRN    GERPART.GERPART_EVNT_CRN%TYPE := NAME_IN('FUNC_EVNT_CRN');
    V_FUNC_CODE   GERPART.GERPART_FUNC_CODE%TYPE := NAME_IN('FUNC_FUNC_CODE');
--
    CURSOR PTI1_CURSOR IS
       SELECT SPRIDEN_ID,
              DECODE(SPRIDEN_ENTITY_IND,'C',SPRIDEN_LAST_NAME,
                     SPRIDEN_FIRST_NAME || ' ' ||
                       DECODE(NVL(SPRIDEN_MI,' '),' ','',SPRIDEN_MI || ' ') || SPRIDEN_LAST_NAME)
         FROM SPRIDEN
        WHERE SPRIDEN_PIDM = V_ORGN_PIDM
          AND SPRIDEN_CHANGE_IND IS NULL;
--
    CURSOR PTI2_CURSOR ( CONTACT_TYPE VARCHAR2) IS
        SELECT SPRIDEN_ID, DECODE(SPRIDEN_ENTITY_IND,'C',
               SPRIDEN_LAST_NAME, SPRIDEN_FIRST_NAME || ' ' ||
               DECODE(NVL(SPRIDEN_MI,' '),' ','',SPRIDEN_MI || ' ') ||
               SPRIDEN_LAST_NAME)
        FROM   SPRIDEN,GERPART
        WHERE  SPRIDEN_PIDM = GERPART_PIDM
        AND    GERPART_EVNT_CRN = V_EVNT_CRN
        AND    GERPART_FUNC_CODE = V_FUNC_CODE
        AND    GERPART_CONTACT_IND = CONTACT_TYPE
        AND    SPRIDEN_CHANGE_IND IS NULL;
--
  BEGIN
    IF V_ORGN_PIDM IS NOT NULL THEN
      OPEN PTI1_CURSOR;
      FETCH PTI1_CURSOR INTO  SPONSOR_ID, SPONSOR_NAME;
      CLOSE PTI1_CURSOR;
    END IF;
--
    OPEN PTI2_CURSOR ('L');
    FETCH PTI2_CURSOR INTO LOCATION_CONTACT_ID ,LOCATION_CONTACT_NAME;
    IF PTI2_CURSOR%NOTFOUND THEN
      LOCATION_CONTACT_ID   := '';
      LOCATION_CONTACT_NAME := '';
    END IF;
    CLOSE PTI2_CURSOR;
--
    OPEN PTI2_CURSOR ('P');
    FETCH PTI2_CURSOR INTO PRIMARY_CONTACT_ID,PRIMARY_CONTACT_NAME;
    IF PTI2_CURSOR%NOTFOUND THEN
      PRIMARY_CONTACT_ID   := '';
      PRIMARY_CONTACT_NAME := '';
    END IF;
    CLOSE PTI2_CURSOR;
  END;
--
--
  PROCEDURE SELECT_STVETYP (ETYP_DESC IN OUT VARCHAR2) IS
    V_ETYP_CODE    STVETYP.STVETYP_CODE%TYPE := NAME_IN('FUNC_ETYP_CODE');  
--
  BEGIN
    ETYP_DESC := gb_stvetyp.f_get_description(V_ETYP_CODE);
    IF ETYP_DESC IS NULL THEN
      G$_CHECK_VALUE(TRUE,G$_NLS.Get('GOQRPLS-0042','LIB','*ERROR* Invalid Function Type Code; press LIST for valid codes.')
                     ,TRUE);
    END IF;
  END;
--
--
  PROCEDURE SELECT_SSRMEET (START_DATE IN OUT VARCHAR2,
                            END_DATE   IN OUT VARCHAR2,
                            MONDAY     IN OUT VARCHAR2,
                            TUESDAY    IN OUT VARCHAR2,
                            WEDNESDAY  IN OUT VARCHAR2,
                            THURSDAY   IN OUT VARCHAR2,
                            FRIDAY     IN OUT VARCHAR2,
                            SATURDAY   IN OUT VARCHAR2,
                            SUNDAY     IN OUT VARCHAR2,
                            BEGIN_TIME IN OUT VARCHAR2,
                            END_TIME   IN OUT VARCHAR2,
                            BUILDING   IN OUT VARCHAR2,
                            ROOM       IN OUT VARCHAR2) IS
    V_FUNC_CODE  SSRMEET.SSRMEET_FUNC_CODE%TYPE  := NAME_IN('FUNC_FUNC_CODE');
    V_EVNT_CRN   SSRMEET.SSRMEET_CRN%TYPE        := NAME_IN('FUNC_EVNT_CRN');
--
    CURSOR PTI_CURSOR IS
      SELECT TO_CHAR(SSRMEET_START_DATE,G$_DATE.GET_NLS_DATE_FORMAT),
             TO_CHAR(SSRMEET_END_DATE,G$_DATE.GET_NLS_DATE_FORMAT),
             SSRMEET_MON_DAY, SSRMEET_TUE_DAY, SSRMEET_WED_DAY,
             SSRMEET_THU_DAY, SSRMEET_FRI_DAY, SSRMEET_SAT_DAY,
             SSRMEET_SUN_DAY, SSRMEET_BEGIN_TIME, SSRMEET_END_TIME,
             SSRMEET_BLDG_CODE, SSRMEET_ROOM_CODE
        FROM SSRMEET
       WHERE SSRMEET_FUNC_CODE = V_FUNC_CODE
         AND SSRMEET_CRN       = V_EVNT_CRN;
--
  BEGIN
    OPEN PTI_CURSOR;
    FETCH PTI_CURSOR INTO START_DATE,END_DATE,MONDAY, TUESDAY, WEDNESDAY,
                          THURSDAY, FRIDAY, SATURDAY, SUNDAY, BEGIN_TIME,
                          END_TIME,BUILDING, ROOM;
    CLOSE PTI_CURSOR;
  END;
--
--
  PROCEDURE KEY_PRINT IS
  BEGIN
    PRINT;
  END;
--
--
  PROCEDURE KEY_OTHERS IS
  BEGIN
    EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
    G$_CHECK_FAILURE;      
  END;
--
--
  PROCEDURE KEY_EXIT IS
  BEGIN
    GO_BLOCK(NAME_IN('SAVE_BLOCK_NAME'));
  END;
--
--
  PROCEDURE KEY_PRVBLK IS
  BEGIN
    GO_BLOCK(NAME_IN('SAVE_BLOCK_NAME'));
  END;
--
--
  PROCEDURE KEY_NXTBLK IS
  BEGIN
    GO_BLOCK(NAME_IN('SAVE_BLOCK_NAME'));
  END;
--
END;
		*/
		/* <p>
		*                              
		*                              
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param funcSpnsrOrgnPidm
		* @param funcPurpCode
		* @param funcEtypCode
		* @param funcFstaCode
		* @param funcEmphCode
		* @param funcPurpDesc
		*/
		public void selectGebfunc(Ref<NNumber> funcSpnsrOrgnPidm, Ref<NString> funcPurpCode, Ref<NString> funcEtypCode, Ref<NString> funcFstaCode, Ref<NString> funcEmphCode, Ref<NString> funcPurpDesc)
		{
			int rowCount = 0;
			// 
			NString vFuncCode = getNameIn("FUNC_FUNC_CODE");
			NString vEvntCrn = getNameIn("FUNC_EVNT_CRN");
			String sqlptiCursor = "SELECT GEBFUNC_SPNSR_ORGN_PIDM, GEBFUNC_PURP_CODE, GEBFUNC_ETYP_CODE, GEBFUNC_FSTA_CODE, GEBFUNC_EMPH_CODE, GEBFUNC_PURP_DESC " +
	" FROM GEBFUNC " +
	" WHERE GEBFUNC_EVNT_CRN = :P_V_EVNT_CRN AND GEBFUNC_FUNC_CODE = :P_V_FUNC_CODE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("P_V_EVNT_CRN", vEvntCrn);
				ptiCursor.addParameter("P_V_FUNC_CODE", vFuncCode);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					funcSpnsrOrgnPidm.val = ptiCursorResults.getNumber(0);
					funcPurpCode.val = ptiCursorResults.getStr(1);
					funcEtypCode.val = ptiCursorResults.getStr(2);
					funcFstaCode.val = ptiCursorResults.getStr(3);
					funcEmphCode.val = ptiCursorResults.getStr(4);
					funcPurpDesc.val = ptiCursorResults.getStr(5);
				}
				ptiCursor.close();
				// 
				if ( funcPurpCode.val.isNull() )
				{
					funcPurpDesc.val = toStr("");
				}
				else {
					funcPurpDesc.val = GbGtvpurp.fGetDescription(funcPurpCode.val);
				}
				}finally{
					ptiCursor.close();
				}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sponsorId
		* @param sponsorName
		* @param locationContactId
		* @param locationContactName
		* @param primaryContactId
		* @param primaryContactName
		*/
		public void selectSpriden(Ref<NString> sponsorId, Ref<NString> sponsorName, Ref<NString> locationContactId, Ref<NString> locationContactName, Ref<NString> primaryContactId, Ref<NString> primaryContactName)
		{
			int rowCount = 0;
			// 
			NNumber vOrgnPidm = toNumber(getNameIn("FUNC_SPNSR_ORGN_PIDM"));
			NString vEvntCrn = getNameIn("FUNC_EVNT_CRN");
			NString vFuncCode = getNameIn("FUNC_FUNC_CODE");
			String sqlpti1Cursor = "SELECT SPRIDEN_ID, DECODE(SPRIDEN_ENTITY_IND, 'C', SPRIDEN_LAST_NAME, SPRIDEN_FIRST_NAME || ' ' || DECODE(NVL(SPRIDEN_MI, ' '), ' ', '', SPRIDEN_MI || ' ') || SPRIDEN_LAST_NAME) " +
	" FROM SPRIDEN " +
	" WHERE SPRIDEN_PIDM = :P_V_ORGN_PIDM AND SPRIDEN_CHANGE_IND IS NULL ";
			DataCursor pti1Cursor = new DataCursor(sqlpti1Cursor);
			String sqlpti2Cursor = "SELECT SPRIDEN_ID, DECODE(SPRIDEN_ENTITY_IND, 'C', SPRIDEN_LAST_NAME, SPRIDEN_FIRST_NAME || ' ' || DECODE(NVL(SPRIDEN_MI, ' '), ' ', '', SPRIDEN_MI || ' ') || SPRIDEN_LAST_NAME) " +
	" FROM SPRIDEN, GERPART " +
	" WHERE SPRIDEN_PIDM = GERPART_PIDM AND GERPART_EVNT_CRN = :P_V_EVNT_CRN AND GERPART_FUNC_CODE = :P_V_FUNC_CODE AND GERPART_CONTACT_IND = :P_CONTACT_TYPE AND SPRIDEN_CHANGE_IND IS NULL ";
			DataCursor pti2Cursor = new DataCursor(sqlpti2Cursor);
			NString contactType = NString.getNull();
			try {
				if ( !vOrgnPidm.isNull() )
				{
					//Setting query parameters
					pti1Cursor.addParameter("P_V_ORGN_PIDM", vOrgnPidm);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable pti1Cursor.
					pti1Cursor.open();
					ResultSet pti1CursorResults = pti1Cursor.fetchInto();
					if ( pti1CursorResults != null ) {
						sponsorId.val = pti1CursorResults.getStr(0);
						sponsorName.val = pti1CursorResults.getStr(1);
					}
					pti1Cursor.close();
				}
				// 
				contactType=toStr("L");
				//Setting query parameters
				pti2Cursor.addParameter("P_V_EVNT_CRN", vEvntCrn);
				pti2Cursor.addParameter("P_V_FUNC_CODE", vFuncCode);
				pti2Cursor.addParameter("P_CONTACT_TYPE", contactType);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable pti2Cursor.
				pti2Cursor.open();
				ResultSet pti2CursorResults = pti2Cursor.fetchInto();
				if ( pti2CursorResults != null ) {
					locationContactId.val = pti2CursorResults.getStr(0);
					locationContactName.val = pti2CursorResults.getStr(1);
				}
				if ( pti2Cursor.notFound() )
				{
					locationContactId.val = toStr("");
					locationContactName.val = toStr("");
				}
				pti2Cursor.close();
				// 
				contactType=toStr("P");
				//Setting query parameters
				pti2Cursor.addParameter("P_V_EVNT_CRN", vEvntCrn);
				pti2Cursor.addParameter("P_V_FUNC_CODE", vFuncCode);
				pti2Cursor.addParameter("P_CONTACT_TYPE", contactType);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable pti2Cursor.
				pti2Cursor.open();
				pti2CursorResults = pti2Cursor.fetchInto();
				if ( pti2CursorResults != null ) {
					primaryContactId.val = pti2CursorResults.getStr(0);
					primaryContactName.val = pti2CursorResults.getStr(1);
				}
				if ( pti2Cursor.notFound() )
				{
					primaryContactId.val = toStr("");
					primaryContactName.val = toStr("");
				}
				pti2Cursor.close();
				}finally{
					pti1Cursor.close();
					pti2Cursor.close();
				}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param etypDesc
		*/
		public void selectStvetyp(Ref<NString> etypDesc)
		{
			NString vEtypCode = getNameIn("FUNC_ETYP_CODE");
			etypDesc.val = GbStvetyp.fGetDescription(vEtypCode);
			if ( etypDesc.val.isNull() )
			{
				getContainer().gCheckValue(toBool(NBool.True), GNls.Fget(toStr("GOQRPLS-0042"), toStr("LIB"), toStr("*ERROR* Invalid Function Type Code; press LIST for valid codes.")), toBool(NBool.True));
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param startDate
		* @param endDate
		* @param monday
		* @param tuesday
		* @param wednesday
		* @param thursday
		* @param friday
		* @param saturday
		* @param sunday
		* @param beginTime
		* @param endTime
		* @param building
		* @param room
		*/
		public void selectSsrmeet(Ref<NString> startDate, Ref<NString> endDate, Ref<NString> monday, Ref<NString> tuesday, Ref<NString> wednesday, Ref<NString> thursday, Ref<NString> friday, Ref<NString> saturday, Ref<NString> sunday, Ref<NString> beginTime, Ref<NString> endTime, Ref<NString> building, Ref<NString> room)
		{
			int rowCount = 0;
			NString vFuncCode = getNameIn("FUNC_FUNC_CODE");
			NString vEvntCrn = getNameIn("FUNC_EVNT_CRN");
			String sqlptiCursor = "SELECT TO_CHAR(SSRMEET_START_DATE, G$_DATE.GET_NLS_DATE_FORMAT), TO_CHAR(SSRMEET_END_DATE, G$_DATE.GET_NLS_DATE_FORMAT), SSRMEET_MON_DAY, SSRMEET_TUE_DAY, SSRMEET_WED_DAY, SSRMEET_THU_DAY, SSRMEET_FRI_DAY, SSRMEET_SAT_DAY, SSRMEET_SUN_DAY, SSRMEET_BEGIN_TIME, SSRMEET_END_TIME, SSRMEET_BLDG_CODE, SSRMEET_ROOM_CODE " +
	" FROM SSRMEET " +
	" WHERE SSRMEET_FUNC_CODE = :P_V_FUNC_CODE AND SSRMEET_CRN = :P_V_EVNT_CRN ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("P_V_FUNC_CODE", vFuncCode);
				ptiCursor.addParameter("P_V_EVNT_CRN", vEvntCrn);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					startDate.val = ptiCursorResults.getStr(0);
					endDate.val = ptiCursorResults.getStr(1);
					monday.val = ptiCursorResults.getStr(2);
					tuesday.val = ptiCursorResults.getStr(3);
					wednesday.val = ptiCursorResults.getStr(4);
					thursday.val = ptiCursorResults.getStr(5);
					friday.val = ptiCursorResults.getStr(6);
					saturday.val = ptiCursorResults.getStr(7);
					sunday.val = ptiCursorResults.getStr(8);
					beginTime.val = ptiCursorResults.getStr(9);
					endTime.val = ptiCursorResults.getStr(10);
					building.val = ptiCursorResults.getStr(11);
					room.val = ptiCursorResults.getStr(12);
				}
				ptiCursor.close();
				}finally{
					ptiCursor.close();
				}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyPrint()
		{
			// F2J_NOT_SUPPORTED : Call to built-in "PRINT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#ExcludePrint".
			//			SupportClasses.SQLFORMS.Print();
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'PRINT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#ExcludePrint'.");
			
			
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyOthers()
		{
			executeAction("INVALID_FUNCTION_MSG");
			getContainer().gCheckFailure();
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyExit()
		{
			goBlock(getNameIn("SAVE_BLOCK_NAME"));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyPrvblk()
		{
			goBlock(getNameIn("SAVE_BLOCK_NAME"));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyNxtblk()
		{
			goBlock(getNameIn("SAVE_BLOCK_NAME"));
		}
		
	
	
}
