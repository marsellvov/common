package net.hedtech.banner.general.common.Gxvdird.services;

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
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
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
import net.hedtech.banner.general.common.Gxvdird.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Gxvdird.model.*;



public class GxvdirdServices extends AbstractSupportCodeObject{
	
	
	public GxvdirdServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GxvdirdTask  getTask() {
		return (GxvdirdTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Gxvdird.model.GxvdirdModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0_B2K
	
	PROCEDURE AUDIT_TRAIL_3_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 3.0                                        INIT   DATE
1. Enhancements for Banner2000 upgrade.  These include   SQ  01/01/97
   adding an object group which contains the objects for
   the toolbar, adding an object group which highlights
   the active record within a block, a mouse-doubleclick
   and when-timer-expired trigger at the form level and
   this audit trail.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:556
		public void auditTrail30B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. AP  08/18/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.
2. SF 10/23/98
   Enhancements for ACH
3. Scott Freeman 1/26/99
   Phase II UI Changes
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:557
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0
	
	PROCEDURE AUDIT_TRAIL_4_0 IS
<multilinecomment>
AUDIT TRAIL: 4.1.0.1
1. GS 31-March-2000
   Correct defect 37652.
   Problem: Form would not accept 8 digit Bank Routing Numbers as 
            required by Canadian banks.
   Impact:  Form could not be used properly for Canadian clients.
   Solution:Modify item GXVDIRD.GXVDIRD_CODE_BANK_ROUT_NUM Post-Change
            trigger to accept both 8 and 9 digit values.
            Modify associated error message to include this 
            information.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:558
		public void auditTrail40()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0_APICONVERT
	
	PROCEDURE AUDIT_TRAIL_5_0_APICONVERT IS 
<multilinecomment>
AUDIT_TRAIL 5.0 
1. API conversion   EFD  06/23/00 
Do not modify this program unit. 
</multilinecomment> 
BEGIN
NULL;
END; 
	*/
	//ID:559
		public void auditTrail50Apiconvert()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_5
	
	PROCEDURE AUDIT_TRAIL_5_5 IS
<multilinecomment>
AUDIT TRAIL: 5.5
1. Rkumar		07/09/2002
Defect  	: 73712
Problem 	: Issue with GXVDIRD and 6 digit bank routing numbers.
						Currently if you enter a 6 digit direct deposit code you get an error
  					*ERROR* Bank Routing Number must be 8 digits for Canada, 9 digits for US.
  					
Resolution : Removed routing number check in post change trigger for item GXVDIRD_CODE_BANK_ROUT_NUM
AUDIT TRAIL END
</multilinecomment>
BEGIN
	null;
END;
	*/
	//ID:560
		public void auditTrail55()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0_FORMSCNV
	
	PROCEDURE AUDIT_TRAIL_7_0_FORMSCNV IS 
<multilinecomment> 
AUDIT TRAIL: 7.0 FORMSCNV 
1. Michael Hitrik  01/30/2004 
  Auto conversion of UI enhancements. Refer to the General UI documentation for more details. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:561
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS 
<multilinecomment> 
AUDIT TRAIL: 7.0
1. G Shalovka   12 February 2004
   Application of enhanced UI methodology.  Please refer to the SCT Banner 7.0 User Interface Technical  Methodology for more details. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:562
		public void auditTrail70()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_NLS_DATE_SUPPORT
	
	PROCEDURE AUDIT_TRAIL_NLS_DATE_SUPPORT IS
-- AUDIT TRAIL: NLS_DATE_SUPPORT 
-- 1. TGKinderman   11/11/2005
--    This object was passed through a conversion process relative to preparing
--    the object to support internationalization needs.  Basically, hard coded
--    date format masks of DD-MON-YYYY are converted to a G$_DATE function that
--    returns nls_date_format.  The release number of this object was NOT
--    modified as part of this effort.  This object may or may not have had 
--    conversion process code modifications.  However, this audit trail entry
--    does indicate that the object has been passed through the conversion.
-- AUDIT TRAIL END
-- 
BEGIN
  NULL;
END AUDIT_TRAIL_NLS_DATE_SUPPORT;

	*/
	//ID:563
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_I18N
	
	PROCEDURE AUDIT_TRAIL_8_0_I18N IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 I18N 
1. Michael Hitrik  06/28/2007
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS  to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:564
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6_1
	
	PROCEDURE AUDIT_TRAIL_8_6_1 IS
<multilinecomment> 
AUDIT TRAIL: 8.6.1
1. RPE 1-10FXRY1
   LVH 05/31/2013
   a. Increased the size of GXVDIRD_CODE_BANK_ROUT_NUM from 9 to 11
   b. Added calls to goksels.f_validate_bank_rout_num for validation
   c. Added User ID to the display and increase the display length of the Bank Name
   d. Added user friendly message instead of Oracle number if trying to change an existing account 
      number that was in use
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:583
		public void auditTrail861()
		{
		}

	
	/* Original PL/SQL code for Prog Unit COPYRIGHT
	
	PROCEDURE COPYRIGHT IS
<multilinecomment>
  Copyright 1997-2013 Ellucian Company L.P. and its affiliates.
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:584
		public void copyright()
		{
		}

	
	/* Original PL/SQL code for Prog Unit IS_BANK_ROUT_IN_USE
	
	FUNCTION IS_BANK_ROUT_IN_USE (bank_rout_new VARCHAR2)
  RETURN VARCHAR2 IS
<multilinecomment>
   This function checks to see if the bank routing number is associated with the payroll tables
   PEBPAYM or PHRDOCM before allowing the value to be updated. If it is found, an error message will
   display and a 'Y' will be returned, otherwise an 'N' will be returned.
</multilinecomment>
  lv_cnt           INTEGER := 0;
  err_cnt          INTEGER := 0;
  lv_cursor        INTEGER;
  ignore           INTEGER;
  bank_rout_old    gxvdird.gxvdird_code_bank_rout_num%type;
  cursor gxvdird_c is
    select gxvdird_code_bank_rout_num
      from gxvdird
     where rowid = :gxvdird.rowid;
--
BEGIN
--
 IF goksyst.F_IsProductInstalled('HUMANRE') THEN
--
  OPEN gxvdird_c;
  FETCH gxvdird_c INTO bank_rout_old;
  CLOSE gxvdird_c;
  --
  IF bank_rout_new != bank_rout_old THEN
   -- GXRDIRD
     lv_cnt := 0;
     lv_cursor := dbms_sql.open_cursor;
     DBMS_SQL.PARSE(lv_cursor,
         'SELECT count(*) ' ||
         '  FROM gxrdird ' ||
         ' WHERE gxrdird_bank_rout_num = :a ', 1);
     DBMS_SQL.DEFINE_COLUMN(lv_cursor, 1, lv_cnt);
     DBMS_SQL.BIND_VARIABLE(lv_cursor, ':a', bank_rout_old);
     ignore := DBMS_SQL.EXECUTE(lv_cursor);
     IF DBMS_SQL.FETCH_ROWS(lv_cursor) > 0 THEN
-- get column values of the row 
       DBMS_SQL.COLUMN_VALUE(lv_cursor, 1, lv_cnt); 
       IF lv_cnt > 0 THEN     	
         MESSAGE(G$_NLS.Get('GXVDIRD-0008','FORM','*ERROR* Bank Routing number %01% cannot be deleted or modified since it is used %02% times in GXRDIRD', bank_rout_old, lv_cnt), acknowledge);
         err_cnt := 1;
       END IF;
     END IF;
   -- close all cursors:
     DBMS_SQL.CLOSE_CURSOR(lv_cursor);
   -- PEBPAYM
     lv_cnt := 0;
     lv_cursor := dbms_sql.open_cursor;
     DBMS_SQL.PARSE(lv_cursor,
         'SELECT count(*) ' ||
         '  FROM pebpaym ' ||
         ' WHERE pebpaym_bank_rout_num = :a ', 1);
     DBMS_SQL.DEFINE_COLUMN(lv_cursor, 1, lv_cnt);
     DBMS_SQL.BIND_VARIABLE(lv_cursor, ':a', bank_rout_old);
     ignore := DBMS_SQL.EXECUTE(lv_cursor);
     IF DBMS_SQL.FETCH_ROWS(lv_cursor) > 0 THEN
-- get column values of the row 
       DBMS_SQL.COLUMN_VALUE(lv_cursor, 1, lv_cnt); 
       IF lv_cnt > 0 THEN
         MESSAGE(G$_NLS.Get('GXVDIRD-0009','FORM','*ERROR* Bank Routing number %01% cannot be deleted or modified since it is used %02% times in PEBPAYM', bank_rout_old, lv_cnt), acknowledge);
         err_cnt := 1;
       END IF;
     END IF;
   -- close all cursors:
     DBMS_SQL.CLOSE_CURSOR(lv_cursor);
   -- PHRDOCM
     lv_cnt := 0;
     lv_cursor := dbms_sql.open_cursor;
     DBMS_SQL.PARSE(lv_cursor,
         'SELECT count(*) ' ||
         '  FROM phrdocm ' ||
         ' WHERE phrdocm_bank_code = :a ', 1);
     DBMS_SQL.DEFINE_COLUMN(lv_cursor, 1, lv_cnt);
     DBMS_SQL.BIND_VARIABLE(lv_cursor, ':a', bank_rout_old);
     ignore := DBMS_SQL.EXECUTE(lv_cursor);
     IF DBMS_SQL.FETCH_ROWS(lv_cursor) > 0 THEN
-- get column values of the row 
       DBMS_SQL.COLUMN_VALUE(lv_cursor, 1, lv_cnt); 
       IF lv_cnt > 0 THEN     	
         MESSAGE(G$_NLS.Get('GXVDIRD-0010','FORM','*ERROR* Bank Routing number %01% cannot be deleted or modified since it is used %02% times in PHRDOCM', bank_rout_old, lv_cnt), acknowledge);
         err_cnt := 1;
       END IF;
     END IF;
   -- close all cursors:
     DBMS_SQL.CLOSE_CURSOR(lv_cursor);
   END IF;
 END IF;
--     
 IF err_cnt > 0 then
   RETURN 'Y';
 ELSE     
   RETURN 'N';
 END IF;
END;

	*/
	//ID:585
		public NString isBankRoutInUse(GxvdirdAdapter gxvdirdElement, NString bankRoutNew)
		{
			int rowCount = 0;
			NNumber lvCnt = toNumber(0);
			NNumber errCnt = toNumber(0);
			NNumber lvCursor= NNumber.getNull();
			NNumber ignore= NNumber.getNull();
			NString bankRoutOld= NString.getNull();
			String sqlgxvdirdC = "SELECT gxvdird_code_bank_rout_num " +
	" FROM gxvdird " +
	" WHERE rowid = :GXVDIRD_ROWID ";
			DataCursor gxvdirdC = new DataCursor(sqlgxvdirdC);
			try {
				if ( Goksyst.fIsproductinstalled(toStr("HUMANRE")).getValue() )
				{
					if (gxvdirdElement.getRowState() == DataRowStatus.INSERTED)
						gxvdirdC.addParameter("GXVDIRD_ROWID", NString.getNull());
					else
						gxvdirdC.addParameter("GXVDIRD_ROWID", toStr(DbManager.getDataBaseFactory().rowidToString(gxvdirdElement.getROWID())));
					gxvdirdC.open();
					ResultSet gxvdirdCResults = gxvdirdC.fetchInto();
					if ( gxvdirdCResults != null ) {
						bankRoutOld = gxvdirdCResults.getStr(0);
					}
					if ( bankRoutNew.notEquals(bankRoutOld) )
					{
						lvCnt = toNumber(0);
						lvCursor = DbmsSql.openCursor();
						DbmsSql.parse(lvCursor, toStr("SELECT count(*) ").append("  FROM gxrdird ").append(" WHERE gxrdird_bank_rout_num = :a "), toNumber(1));
						DbmsSql.defineColumn(lvCursor, toNumber(1), lvCnt);
						DbmsSql.bindVariable(lvCursor, toStr(":a"), bankRoutOld);
						ignore = DbmsSql.execute(lvCursor);
						if ( DbmsSql.fetchRows(lvCursor).greater(0) )
						{
							Ref<NNumber> lvCnt_ref = new Ref<NNumber>();
							lvCnt_ref.val= lvCnt;
							DbmsSql.columnValueNumber(lvCursor, toNumber(1), lvCnt_ref);
							lvCnt = lvCnt_ref.val;
							if ( lvCnt.greater(0) )
							{
								errorMessage(GNls.Fget(toStr("GXVDIRD-0008"), toStr("FORM"), toStr("*ERROR* Bank Routing number %01% cannot be deleted or modified since it is used %02% times in GXRDIRD"), bankRoutOld, toStr(lvCnt)), OutputMessageUserResponse.ACKNOWLEDGE);
								errCnt = toNumber(1);
							}
						}
						DbmsSql.closeCursor(lvCursor);
						lvCnt = toNumber(0);
						lvCursor = DbmsSql.openCursor();
						DbmsSql.parse(lvCursor, toStr("SELECT count(*) ").append("  FROM pebpaym ").append(" WHERE pebpaym_bank_rout_num = :a "), toNumber(1));
						DbmsSql.defineColumn(lvCursor, toNumber(1), lvCnt);
						DbmsSql.bindVariable(lvCursor, toStr(":a"), bankRoutOld);
						ignore = DbmsSql.execute(lvCursor);
						if ( DbmsSql.fetchRows(lvCursor).greater(0) )
						{
							Ref<NNumber> lvCnt_ref = new Ref<NNumber>();
							lvCnt_ref.val= lvCnt;
							DbmsSql.columnValueNumber(lvCursor, toNumber(1), lvCnt_ref);
							lvCnt = lvCnt_ref.val;
							if ( lvCnt.greater(0) )
							{
								errorMessage(GNls.Fget(toStr("GXVDIRD-0009"), toStr("FORM"), toStr("*ERROR* Bank Routing number %01% cannot be deleted or modified since it is used %02% times in PEBPAYM"), bankRoutOld, toStr(lvCnt)), OutputMessageUserResponse.ACKNOWLEDGE);
								errCnt = toNumber(1);
							}
						}
						DbmsSql.closeCursor(lvCursor);
						lvCnt = toNumber(0);
						lvCursor = DbmsSql.openCursor();
						DbmsSql.parse(lvCursor, toStr("SELECT count(*) ").append("  FROM phrdocm ").append(" WHERE phrdocm_bank_code = :a "), toNumber(1));
						DbmsSql.defineColumn(lvCursor, toNumber(1), lvCnt);
						DbmsSql.bindVariable(lvCursor, toStr(":a"), bankRoutOld);
						ignore = DbmsSql.execute(lvCursor);
						if ( DbmsSql.fetchRows(lvCursor).greater(0) )
						{
							Ref<NNumber> lvCnt_ref = new Ref<NNumber>();
							lvCnt_ref.val= lvCnt;
							DbmsSql.columnValueNumber(lvCursor, toNumber(1), lvCnt_ref);
							lvCnt = lvCnt_ref.val;
							if ( lvCnt.greater(0) )
							{
								errorMessage(GNls.Fget(toStr("GXVDIRD-0010"), toStr("FORM"), toStr("*ERROR* Bank Routing number %01% cannot be deleted or modified since it is used %02% times in PHRDOCM"), bankRoutOld, toStr(lvCnt)), OutputMessageUserResponse.ACKNOWLEDGE);
								errCnt = toNumber(1);
							}
						}
						DbmsSql.closeCursor(lvCursor);
					}
				}
				if ( errCnt.greater(0) )
				{
					return  toStr("Y");
				}
				else {
					return  toStr("N");
				}
				}finally{
					gxvdirdC.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GXVDIRD
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Mon Jun 17 11:04:19 2013
-- MSGSIGN : #2677369581559dc6
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:586
	/* <p>
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	

}
