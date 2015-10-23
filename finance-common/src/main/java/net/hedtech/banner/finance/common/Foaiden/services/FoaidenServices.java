package net.hedtech.banner.finance.common.Foaiden.services;

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
import net.hedtech.banner.finance.common.Foaiden.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqclib.model.SpridenCurrentAdapter;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.banner.finance.common.Foaiden.model.*;



public class FoaidenServices extends AbstractSupportCodeObject{
	
	
	public FoaidenServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public FoaidenTask  getTask() {
		return (FoaidenTask )super.getContainer();
	}

	
	public net.hedtech.banner.finance.common.Foaiden.model.FoaidenModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_2_1
	
	PROCEDURE AUDIT_TRAIL_2_1 IS
<multilinecomment>

AUDIT TRAIL: 2.1
1. Forms 4.0 conversion.                                                       AP 08/22/94
2. Modified hint in trigger 'Name_and_ID_check'                                SK 12/27/94
3. Add  DUMMY1, DUMMY2 in trigger 'WHEN-VALIDATE-ITEM' on field ID             SK 01/11/95
   in KEY_BLOCK for correct working G$_VALID_ALL_ID.
AUDIT TRAIL: 2.1.1
1. Modified for VGA usage.                                           AM  03/15/95  
2. Character/Mac updates.                                            AV  04/21/95
3. Charmode/mac additional corrections.                              TGK 05/23/95
   Increased size of dummy1 from 1 to 14 and size of dummy2 from 1
   to 10 such that they can received literal values from g$_valid_all_id
   in when_validate_item on key_block.id.
4. MAC additional corrections.  Adjusted boiler plate.               TGK 06/05/95
AUDIT TRAIL: 2.1.5
1.  Defect#:..490
    Signoff...Sergei Kochenskov      04-AUG-95
    Problem:..Cannot replace ID in Current ID Block if begining with 'A' or'R'.
    Fix:..... Add " AND SOBSEQN_FUNCTION = 'ID' in trigger POST-CHANGE on block
              SPRIDEN_CURRENT.CURRENT_ID.
         Defect#:1205         Sergei Kochenskov                   04-AUG-95
         Problem: Cannot change existing number with system generated ID.
                 Allowed insert into SPRIDEN_ID lower case characters.
         Fix: Modified trigger PRE-UPDATE on block CURRENT_SPRIDEN.
              Add trigger step << create_id_change >>.
	 Defect#: 2404         Sergei Kochenskov                  04-AUG-95 
	 Problem: Error 'Multiple effective addresses on same type - check
		  FTVIDEN'.
	 Fix: disable trigger 'CHECK_DATES' in query mode.Add logic:
		IF :SYSTEM.BLOCK_STATUS = 'QUERY' THEN
		GOTO END_DATES;
2.DEFECT...........NONE
  SIGNOFF..........Sergei Kochenskov     23-AUG-1995
  PROBLEM..........Role Security
3.DEFECT...........NONE
  SIGNOFF..........Sergei Kochenskov     20-sep-1995
  PROBLEM..........Generate for stvnatn_rg
4.DEFECT...........NONE
  SIGNOFF..........Sergei Kochenskov     26-sep-1995
  PROBLEM..........Change hint as APAIDEN in trigger PRE-UPDATE in SPIDEN_CURRENT 
                   block under the label <<CREATE_NAME_CHANGE>>.
5. DEFECT.....NONE
   SIGNOFF....DEBBIE WALTERS 29-SEP-95
   PROBLEM....ADDITIONAL ROLE SECURITY CHANGES
6. DEFECT....NONE
   SIGNOFF...DEBBIE WALTERS 10/19/95
   PROBLEM...Default dates using $$DATE$$ use operating system date 
             (easily changed by user client device).
   FIX.......Changed default date value from $$DATE$$ to $$DBDATE$$ for 
             SPRIDEN_ACTIVITY_DATE and SPRADDR_ACTIVITY_DATE.
7. Defect....None
   Signoff...Galina Andronov 10/27/95
   Problem...Default dates using $$DATE$$ use operating system date (easily 
             changed by user client device).
   Fix.......Changed default date value from $$DATE$$ to $$DBDATE$$ for item
             SPRADDR_FROM_DATE.
AUDIT TRAIL: 2.1.11
1.DEFECT...........NONE
  SIGNOFF..........Sergei Kochenskov     16-FEB-1996
  PROBLEM..........fields PERS_PERFIX, PERS_SUFFIX have a length less then in the table.
  FIX..............increase length of fields: PERS_PREFIX, PERS_SUFFIX to 20.
2.DEFECT...........NONE
  SIGNOFF..........Sergei Kochenskov     26-FEB-1996
  PROBLEM..........timestamp modification to be consistent with SPAIDEN.
  FIX..............modified item SPRIDEN_ACTIVITY_DATE - datetime type, triggers:
                   PRE-INSERT and PRE-UPDATE .
3. DEFECT.....FIN 211040
   SIGNOFF....John Lavin 24-JUN-1996
   PROBLEM....(1) Update release
              (2) No cancel button
              (3) Erroneous Error message when exiting form
                  if in KeyBlock and the ID field is blank.
   FIX........(1) Release updated to 2.1.11
              (2) Added Cancel Button
              (3) Commented out unnecessary Error Message 
                  at the end of the trigger WHEN-VALIDATE-
                  ITEM on item ID.

4. Defect#....None
   Signoff....Anand Mouny  08-16-1996
   Fix........Forms4.0 to Forms4.5 conversion
AUDIT TRAIL END

</multilinecomment>
BEGIN
  null;
END;
	*/
	//ID:5503
	/* <p>
/* </p>
		*/
		public void auditTrail21()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment>
Audit Trail: 3.0
1) Defect#....5018
   Signoff....Anand Mouny  12/06/1996
   Problem....When a 4 character source code is entered in address information window,
              the Delivery Information window automatically pops-up.
   Fix........Removed the Auto-skip property of spraddr_asrc_code OFF.
Audit Trail End
</multilinecomment>

BEGIN
  null;
END;
	*/
	//ID:5504
	/* <p>
/* </p>
		*/
		public void auditTrail30()
		{
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
	//ID:5505
	/* <p>
/* </p>
		*/
		public void auditTrail30B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_1
	
	PROCEDURE AUDIT_TRAIL_3_1 IS
BEGIN
<multilinecomment>Audit Trail: 3.1
1) Defect#....3994
   Signoff....Stan Mukhortov
   Problem....Error message had to be changed	
   Fix........Changed the error message
Audit Trail End</multilinecomment>
  NULL;
END;
	*/
	//ID:5506
	/* <p>
/* </p>
		*/
		public void auditTrail31()
		{
			// Audit Trail: 3.1
			// 1) Defect#....3994
			// Signoff....Stan Mukhortov
			// Problem....Error message had to be changed
			// Fix........Changed the error message
			// Audit Trail End
		}

	
	/* Original PL/SQL code for Prog Unit F$_REQUEST_SEARCH
	
	PROCEDURE F$_REQUEST_SEARCH(ALERT_NAME IN VARCHAR2, ALERT_MESSAGE IN VARCHAR2, FORM_CALLED IN VARCHAR2, 
                            WHICH_NAME_SEARCH IN VARCHAR2) IS

   ALERT_ID	ALERT;
   ALERT_BUT	NUMBER;
   ALERT_FORM	VARCHAR2(20);
 
BEGIN
   ALERT_ID := FIND_ALERT(ALERT_NAME);

   IF ID_NULL(ALERT_ID) THEN
      RAISE FORM_TRIGGER_FAILURE;
   END IF;

   SET_ALERT_PROPERTY(ALERT_ID, ALERT_MESSAGE_TEXT, ALERT_MESSAGE ); 
   ALERT_BUT := SHOW_ALERT(ALERT_ID);

   IF ALERT_BUT = ALERT_BUTTON1 THEN
      IF :GLOBAL.LAST_NAME IS NULL THEN
         :GLOBAL.FIRST_NAME := :PERS_FIRST_NAME;
      END IF;

      :GLOBAL.FORM_WAS_CALLED := 'Y';
      :GLOBAL.CALLING_FORM := 'NAME_SEARCH';
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
      G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, FORM_CALLED, '');
      :GLOBAL.FIRST_NAME := '';
      :GLOBAL.LAST_NAME := '';
   END IF;
END;

	*/
	//ID:5507
	/* <p>
/* </p>
		* @param alertName
		* @param alertMessage
		* @param formCalled
		* @param whichNameSearch
		*/
		public void fRequestSearch(SpridenCurrentAdapter spridenCurrentElement, NString alertName, NString alertMessage, NString formCalled, NString whichNameSearch)
		{
			AlertDescriptor alertId= null;
			NNumber alertBut= NNumber.getNull();
			NString alertForm= NString.getNull();
			alertId = findAlert(alertName);
			if ( (alertId == null) )
			{
				throw new ApplicationException();
			}
			setAlertMessageText(alertId, alertMessage);
			alertBut = toNumber(showAlert(alertId));
			if ( alertBut.equals(MessageServices.BUTTON1) )
			{
				if ( getGlobal("LAST_NAME").isNull() )
				{
					setGlobal("FIRST_NAME", spridenCurrentElement.getPersFirstName());
				}
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				setGlobal("CALLING_FORM", toStr("NAME_SEARCH"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), formCalled, toStr(""));
				setGlobal("FIRST_NAME", toStr(""));
				setGlobal("LAST_NAME", toStr(""));
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0
	
	PROCEDURE AUDIT_TRAIL_4_0 IS
<multilinecomment>AUDIT TRAIL:4.0
   
1. DEFECT......NONE 
   SIGNOFF......Pritee Shah 06/15/98
   ENHANCEMENTS.Enhancement for Banner4.0 upgrade.  Added the Name type and 
   description fields on the SPRIDEN_CURRENT_1_CANVAS.  Also, added the
   Duplicate_Name_Search Option in the menu bar.  Duplicate_Name_Search
   and CQH queries on the first or last name on the FTIIDEN form.
		
AUDIT TRAIL END
</multilinecomment>

BEGIN
  NULL;
END;

	*/
	//ID:5510
	/* <p>
/* </p>
		*/
		public void auditTrail40()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. Pritee Shah 08/20/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.

2. Robert Rullo 01/23/99
   Phase II UI Changes

3. Robert Rullo 02/08/99
   1. Added Generate ID icon
   2. Added flashlights on last & first name fields on SPRIDEN_CURRENT
   3. Changed "Previous" to "Alternate" on the Alternate Info window
   4. Added Name Type, Last Name, First Name, Middle Name on Alternate window
   5. Made SPRIDEN_CHANGE_IND to a drop down list
   6. Gave the ability to add alternate information
   7. Added Alternate Remove icon

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:5511
	/* <p>
/* </p>
		*/
		public void auditTrail40B2k()
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
	//ID:5512
	/* <p>
/* </p>
		*/
		public void auditTrail50Apiconvert()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0
	
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>AUDIT TRAIL: 5.0
   
1. DEFECT......None
   SIGNOFF......Tatyana Ispas    11/08/2000
   Problem......ORA-3113 and FRM-40735 at runtime when using Oracle 8.1.6 
                and Developer 1.6.1. Bug caused by duplicate calls to G$_REVOKE_ACCESS.
   Fix..........Commented out the line "EXECUTE_TRIGGER('$G_REVOKE_ACCESS'); in trigger
                POST_FORM_TRG. 
		
AUDIT TRAIL END
</multilinecomment>

BEGIN
  NULL;
END;

	*/
	//ID:5513
	/* <p>
/* </p>
		*/
		public void auditTrail50()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_3
	
	PROCEDURE AUDIT_TRAIL_5_3 IS
<multilinecomment>AUDIT TRAIL: 5.3
1. Defect.......#32251
   Signoff......Galina Andronov   09/19/2001
   Problem......Name Type field on the Alternate Information block is not working proprly...not updateable.
   Fix..........Modified WHEN-NEW-RECORD-INSTANCE trigger on SPRIDEN_PREVIOUS block.
   
2. Defect.......#39874
   Signoff......Galina Andronov   09/19/2001
   Problem......You can't tab tru the "Person Name Info" to the "Non-Person Name Info" field. However, "click" is possible 
                on those fiels.
   Fix..........Changed POST-CHANGE triggers into WHEN-VALIDATE-ITEM triggers on PERS_LAST_NAME, PERS_FIRST_NAME and
                PERS_MI.
3. Defect.......#13495
   Signoff......Galina Andronov   09/21/2001
   Problem......Defaulting the city, state, county, nation from the zip code table when leaving the zip field does not work.
   Fix..........Created POST-CHANGE trigger on SPRADDR_ZIP field.              
4. Defect.......None
   Signoff......Galina Andronov   01/11/2002
   Fix..........Implementing New General Alt-ID Form into Existing Product Forms.
   
AUDIT TRAIL END  </multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:5514
	/* <p>
/* </p>
		*/
		public void auditTrail53()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
BEGIN
  NULL;
<multilinecomment>
Audit Trail: 6.0
  1. BGourlie  29-JAN-2003
     Enhancement to allow creation of ID numbers which use the ID Prefix
     as identified in SOBSEQN table, and to use new function in the generation
     of ID numbers from that table.
     Disable edit and message in WHEN-VALIDATE-ITEM of KEY_BLOCK.ID
     and POST-CHANGE of SPRIDEN_CURRENT.SPRIDEN_ID.
     Use F_GENERATE_SOBSEQN('ID') in PRE_INSERT of SPRIDEN_CURRENT.
  2.Signoff Grocher 11-APR-2003
    Defect ..#86376
    Problem..If you change the name when a record has a valid name type
             and then commit, the spriden record with the change_ind=N has the name
             type null.
    Fix......On Spriden_Current block, on Pre-Update trigger add the SPRIDEN_NTYP_CODE 
             column on bouth inserts to SPRIDEN table.
   3.Signoff Grocher 11-APR-2003
     Defect...#72706
     Problem....When adding an address and 1 zip code has 2 o more cities associated to it
                its not recognozing it.
       Fix......  Modified the KEY-LISTVAL trigger for item SPRADDR.SPRADDR_ZIP in the SPRADDR block
                  to use the new function G$_CITY_STATE_NATN3 instead of
                  G$_CITY_STATE_NATN. assign global.value_2 to :SPRIDEN_CITY on this same trigger.
    
Audit Trail End
</multilinecomment>
END;
	*/
	//ID:5515
	/* <p>
/* </p>
		*/
		public void auditTrail60()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0_1
	
	PROCEDURE AUDIT_TRAIL_6_0_1 IS
BEGIN
  NULL;
  <multilinecomment>
Audit Trail: 6.0.1
  1. Anandhi Pitchai  29-Sep-2003
     Enhancement to allow creation of ID numbers which use the ID Prefix
     as identified in SOBSEQN table, and to use new function in the generation
     of ID numbers from that table.
     Use F_GENERATE_SOBSEQN('ID') in PRE_UPDATE of SPRIDEN_CURRENT.
  2. Raji Venkatesan  17-Dec-2003
     Added the API calls.  Added on-insert, on-update, on-delete, on-lock triggers in 
     spriden_current, spriden_previous and spraddr blocks.
     Modifed post-update and post-insert triggers to use the telephone api on spraddr block
     Modifed pre-delete on spriden_previous to bring up a warning while deleting
Audit Trail End
 </multilinecomment>   
END;
	*/
	//ID:5516
	/* <p>
/* </p>
		*/
		public void auditTrail601()
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
	//ID:5517
	/* <p>
/* </p>
		*/
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment> 
AUDIT TRAIL: 7.0  
1. Raji Venkatesan  08/20/2004
  Reference blocks and tab pages from GOQCLIB.
  Over-rode spriden_current.Request_name_search to go to ftiiden. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:5518
	/* <p>
/* </p>
		*/
		public void auditTrail70()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_1
	
	PROCEDURE AUDIT_TRAIL_7_1 IS
<multilinecomment> 
AUDIT TRAIL: 7.1 
1. Raji Venkatesan  08/20/2004
   Problem - The SSN on the current_id block gets displayed although masking is applied to it.
   Fix - In When-new-form-instance trigger, check for masking status of ssn before displaying it.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;

	*/
	//ID:5519
	/* <p>
/* </p>
		*/
		public void auditTrail71()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_1_0_1
	
	PROCEDURE AUDIT_TRAIL_7_1_0_1 IS
<multilinecomment> 
AUDIT TRAIL: 7.1.0.1
1. Race/Ethnicity project, Wei Zhang 12-Sep-2005
   1.	Add the following items from goqclib.fmb:
      -	object group g$_ethn_race_obj.  Position block gorprac after spbpers block
      -	form_header.green_data_bar_1
      -	button_control_block.gorprac_race_cde_lbt
   2.	In Biographic tab page, add a rectangle for the race block.
   3.	Set property Visible = Yes for these items: 
      -	spbpers block items: spbpers_ethn_cde, spbpers_confirmed_re_cde, and spbpers_confirmed_re_date
      -	gorprac scroll bar and items gorprac_code, race_desc, gorprac_user_id, and gorprac_activity_date
      -	form_header.green_data_bar_1
   4.	Set property Next Navigate Item = null for item spbpers_ethn_code
   5.	Set property Previous Navigate Item = null for item spbpers_vetc_file_number
   6.	Modifiy trigger MNU_SHOW_BIO to query for race block.
   7.	Modify sprtele.key-nxtblk to query for race block.
   8.	Form trigger when-new-form-instance, call G$_POPULATE_ETHNICITY_LIST to populate the spbpers_ethn_cde list item.
   9.	Block trigger spbpers.spbpers_ethn_code.post-change: add logic to convert Ethnicity to New Ethnicity and Race.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:5520
	/* <p>
/* </p>
		*/
		public void auditTrail7101()
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
	//ID:5521
	/* <p>
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_2
	
	PROCEDURE AUDIT_TRAIL_7_2 IS
<multilinecomment> 
AUDIT TRAIL: 7.2
1. Modify for the new GOQCLIB library, Wei Zhang 24-FEB-2006
   1.	Delete GRAPHIC210 under the BIO_TAB tab canvas and re-inherit it from the new library.
   2.	Modify the mnu_show_bio trigger to add the following code:
       --
       -- Query Race/Ethnicity data
       --
       IF GET_ITEM_PROPERTY('GORPRAC_RACE_CDE', ENABLED) = 'TRUE' THEN
         GO_BLOCK('GORPRAC');  
         :SYSTEM.MESSAGE_LEVEL := '5';
         EXECUTE_QUERY;
         :SYSTEM.MESSAGE_LEVEL := '0';
         GO_BLOCK('SPBPERS');
       END IF;   
   3.	Re-inherit the key-nxtblk and key-prvblk triggers under each data block.
   4.	Delete the green_data_bar_1 item from form_header block. The bar is included in the 
      bio_tab tab canvas in the new library now.
   5.	Re-inherit the post-change trigger under SPBPERS.SPBPERS_ETHN_CODE.
   6.	For the 4 items, spbpers_ethn_cde, 
                       spbpers_confirmed_re_cde,
                       spbpers_confirmed_re_date,
                       spbpers_confirmed_re_date_dbt
      Re-inherit the "visible" property to make sure it has 'Yes' value.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:5522
	/* <p>
/* </p>
		*/
		public void auditTrail72()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_I18N
	
	PROCEDURE AUDIT_TRAIL_8_0_I18N IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 I18N 
1. Michael Hitrik  06/29/2007
   This form has been modified to increase the bio-demographics fields 
   to support internationalization requirements. 
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS Property Class to support internationalization requirements. 
2. Signoff...... Sivanath Peddakotla 12/24/2007
   Defect.......1-37AGZ8
   Problem......Finance forms - (5)  broken inheritance from GOQCLIB - by forms conversion tool
   Fix.......... The fields are again inherited.
  AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:5523
	/* <p>
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment>
AUDIT TRAIL: 8.0
1. TGKinderman 10/30/2007
   Modify in support of SSN ID Look-up
2. TGKinderman 010/30/2007
   Modify in support of General7.5 TabSecurity  (1-2LHZ1C)
3. TGKinderman 11/06/2007
   Add Tab/block to the form for Additional Identification
   a. Reference Object Group G$_ADDITIONAL_ID_OBJ from GOQCLIB into form.  Drag to sequence GORADID block
      appropriately in form
   b. Reference Tab ADDITIONAL_ID_TAB from GOQCLIB into form.
   c. Add logic to form-level triggers WHEN-TAB-PAGE-CHANGED, DISABLE_TAB_PAGES and ENABLE_TAB_PAGES for tab
      ADDITIONAL_ID_TAB
   d. Add form-level trigger MNU_SHOW_ADDITIONAL_ID for use with GUROPTM row (Options).  Used to navigate to the
      block GORADID in the Tab ADDITIONAL_ID_TAB

AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
	//ID:5524
	/* <p>
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3
	
	PROCEDURE AUDIT_TRAIL_8_3 IS
BEGIN
  NULL;
END;
<multilinecomment>
AUDIT TRAIL: 8.3                                
1. Lan Nguyen 03/01/2009
   RPE# 1-4US9HN - Expose I8N Fields.
   Recompiled to pick-up goqclib change for the Address tabpage.
AUDIT TRAIL END
</multilinecomment>

	*/
	//ID:5525
	/* <p>
/* </p>
		*/
		public void auditTrail83()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : FOAIDEN
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Thu Apr 14 16:34:57 2011
-- MSGSIGN : #d3b175cda0925277
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:5526
	/* <p>
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4
	
	PROCEDURE AUDIT_TRAIL_8_4 IS

<multilinecomment>
AUDIT TRAIL: 8.4
1. Defect......1-456XCF
   Signoff.....Ravikumar Beli     15-JUL-2009
   Problem.....Enter vendor on FOAIDEN, next block, click drop down next to last name, get 
   						 "similar name" notice.  Click FTIIDEN to look at name, get SOAIDEN instead.  
   Fix.........Modified REQUEST_NAME_SEARCH trigger of SPRIDEN_CURRENT block.
   
1. Defect......1-4I0Q7O
   Signoff.....Gopinath Thulasidoss     20-AUG-2009
   Problem.....Masking %IDEN Prefix and Full Legal Name produces error.
   Fix.........Modified trigger ENABLE_PERS_ITEMS. Included condition check for 
               VISIBLE PROPERTY_TRUE, before setting enabled/navigable/update_allowed 
               property on for items PERS_LAST_NAME, PERS_FIRST_NAME, PERS_MI, 
               PERS_PREFIX, PERS_SUFFIX, PERS_LEGAL_NAME.

AUDIT TRAIL END 
</multilinecomment>


BEGIN
  NULL;
END;
	*/
	//ID:5527
	/* <p>
/* </p>
		*/
		public void auditTrail84()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5
	
	PROCEDURE AUDIT_TRAIL_8_5 IS
<multilinecomment> 
AUDIT TRAIL: 8.5

1. Defect... 1-3BZAMP
   Signoff...Pradeep Kumar Mallapuram        30-Jun-2010
   Problem...Value NEXT - entry required in English,
             value not translatable
   Fix.......Removed hard coded NEXT and replaced with centralized DB function
             (i.e. fokutil.f_next_display) which returns keyword to validate ID.
             
             Added new item NEXT_DOC_NUM in FORM_HEADER block to store the
             keyword returned by the DB function.
             Modified WHEN_NEW_BLOCK_INSTANCE_TRG to store keyword returned 
             by DB function in NEXT_DOC_NUM.
             
             Below listed triggers are modified to remove/replace the 
             hard coded value NEXT with NEXT_DOC_NUM item which stores 
             keyword to validate ID:
             WHEN-VALIDATE-ITEM (KEY_BLOCK.ID item level)

             Modified WHEN-VALIDATE-ITEM trigger of ID field to default the
             GENERATED keyword in ID field when user enters NEXT or 
             equivalent keyword and if there is no records 
             exists with that keyword.
						 
AUDIT TRAIL END
</multilinecomment>  
BEGIN
	NULL; 
END;
	*/
	//ID:5528
	/* <p>
/* </p>
		*/
		public void auditTrail85()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5_0_6
	
	PROCEDURE AUDIT_TRAIL_8_5_0_6 IS
<multilinecomment> 
AUDIT TRAIL: 8.5.0.6

1. Defect....1-NFG1SL
   Signoff...Pradeep Kumar Mallapuram        12-Apr-2011
   Problem...With matching turned on in GUAINST,  using the word NEXT 
             to generate an id will allow user to create an 
             ID called NEXT and does not generate the next up number for an id.
   Fix.......Modified WHEN-VALIDATE-ITEM and KEY-NEXT-ITEM triggers of KEY_BLOCK.ID
             item to default the GENERATED keyword before calling 
             general library functions which in turn calls GOAMTCH
             when common matching process is ON and the ID entered is not 
             available in SPRIDEN table.
             Also modified WEHN-BUTTON-PRESSED trigger of GENERATE_BTN
             to move cursor to ID to default ID value (i.e. GENERATED) in GOAMTCH.
	 
AUDIT TRAIL END
</multilinecomment>  
BEGIN
  NULL;
END;
	*/
	//ID:5529
	/* <p>
/* </p>
		*/
		public void auditTrail8506()
		{
		}

	
	

}
