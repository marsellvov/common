package net.hedtech.banner.student.common.Spaiden.services;

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
import net.hedtech.banner.student.common.Spaiden.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.student.common.Spaiden.model.*;



public class SpaidenServices extends AbstractSupportCodeObject{
	
	
	public SpaidenServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public SpaidenTask  getTask() {
		return (SpaidenTask )super.getContainer();
	}

	
	public net.hedtech.banner.student.common.Spaiden.model.SpaidenModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_2_1
	
	PROCEDURE AUDIT_TRAIL_2_1 IS
<multilinecomment>
 AUDIT TRAIL: 2.1
1. Forms 4.0 conversion.                      AP 08/22/94
2. Modified CHECK_FIRST_LAST_NAME trigger to  AP 02/06/95
check if Last name is entered. Modified PRE-UPDATE
on SPRIDEN_CURRENT to call the above trigger.
AUDIT TRAIL: 2.1.1
1. VGA conversion.
  VB  03/16/95
AUDIT TRAIL: 2.1.5
1. Cleared out full name in key block when    AP 03/03/95
generating new ID.
2. Implement role-based security.
   Richard Lander 09/02/95
3. Correct pre-delete trigger in spriden      PL 10/10/95
   previous block to reset name change record
   to current id only when deleting the
   corresponding previous name spriden record.
AUDIT TRAIL: 2.1.8
1. Changed order by clause of SPRADDR block   VB 11/29/95
   such that addresses are ordered by active
   today, all other active, then Inactive.
2. Changed size of PERS_PREFIX, PERS_SUFFIX,  VB 12/14/95
   and HOLD_SUFFIX fields to 20.
3. Replaced referenced communication plan procedures
   with call to packaged procedure SOKCPLN.
   Richard Lander  02/22/96
4. Added timestamp to activity date on insert of
   SPRIDEN records.
   Richard Lander  02/22/96
5. Forms 4.5 conversion.                      MS 07/03/96

AUDIT TRAIL: 2.1.20
 1. Removed hard-coded anchoring of windows    AM 01/06/97
   depending upon CHARMODE or otherwise.

 2. Defect 2805		                      DDM 03/13/97
    Set SPRADDR_ZIP autoskip to false.

 3. Defect 5895	                              DDM 03/14/97
    Use the :GLOBAL.QUERY_MODE to control
    cursor so that you only goto SPRADDR_DEVIVERY_POINT
    if you are comming from ZIP_CODE field.
 
 4. Defect 5008.	                      DDM 03/17/97
    Moved the word Inactive one charter to right.

 5. Defect 3837	                              DDM 05/02/97
    Added KEY-EXIT trigger that checks for
    changes to the phone number. Also added
    CAUTION_CHANGE_ALERT.  
 
6. Defect 5424                               DDM 05/07/97
    Problem with SYSTEM.EVENT_WINDOW function
    is not consistent when returning from a 
    called form. Changed WHEN-ACTIVATE-WINDOW
    trigger.
AUDIT TRAIL END
</multilinecomment>
BEGIN
 NULL;
END;
	*/
	//ID:5573
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail21()
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
2. Defect 6483. Changed abbreviations of keys to "CQH";
   "NEXT PRIM KEY"; for Type and City fields; and removed 
   the word "effective" in From Date and To Date fields.   TI 05/28/97
3. Defect 6481. Changed the title of the CANCEL button to
   RETURN where RETURN indicates that user will return to 
   the place he/she was started from.                      TI 05/28/97
4. Defect 6482. Modified KEY-PRVREC trigger to return to 
   existing record from a blank record when user do nothing. TI 05/28/97
5. Set execution style on Post-Block (Key-Block) to AFTER.  TI 06/18/97
6. DEFECT#:6477                                         BY: JWF 07/09/97
   FIX: Prevent error message caused by missing mandatory field.
   TECHNICAL: Removed post-text-item trigger on pers_last_name
   field which was clearing the spriden_last_name field at the
   wrong time. Added logic to when-validate-item triggers on
   pers_last_name and non_pers_name fields to handle clearing
   of spriden_last_name field.
7. Defect 7464 set property to upper case.                     DM 08/18/97
8. Defect 7557 Change COMMIT to save in NAME_AND_ID_CHECK      DM 08/20/97
   Trigger.
AUDIT TRAIL: 3.1
1. Defect 6482 Changed the key-prvrec.                         DM 08/20/97
2. Defect 6785                                                 DM 08/21/97
    The last address record for person could not be removed.  
    Problem was that the default data in the new record would
    mark the last record as changed and try to insert the record. 
    1. Remove all default data. This data will be inserted into 
       record when data in entered into SPRADDR_ATYP_CODE. 
    2. Removed PIDM copy from property SPRADDR_PIDM
    3. Add code to update removed defaults in the post-change trigger
       of spraddr_atyp_code.
    4. Removed required fields in SPRADDR block.
    5. Removed WHEN-NEW-RECORD-INSTANCE from SPAADDR block
    6. Added where clause to SPRADDR to repalce copy PIDM.
    7. Reattached libraries.
 AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:5574
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail30B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_1_B2K
	
	PROCEDURE AUDIT_TRAIL_3_1_B2K IS
<multilinecomment>
AUDIT TRAIL: 3.1                                        INIT   DATE
1. Added this audit trail.                              DDM   02/24/98
2. Updated the LOAD_CURRENT_RELEASE TO 3.1              DDM   02/24/98
3. Defect 8714                                          DDM   02/24/98
   Problem. The From date changing after a duplecate record.
            When Type is changed.
   Cause... The Post_change trigger for SPRADDR_ATYP_CODE 
            Updates the SPRADDR_FROM_DATE.
   Fix..... Only update From date with system date if 
            the date is null. Changed trigger POST-CHANGE 
            to update the SPRADDR_FROM_DATE only if it is null.
4. Removed library SOQOLIB                              DDM    03/25/97
5. Defect 8322                                          DDM    04/04/98
   Problem. Need RETURN buttons on Address, Previous ID,
            and Legal windows.
   Fix..... Added return buttons, And triggers for Dup-item.
            Also changed Cancel buttons to return.
            Added code to update hold_block_field used
            by the return buttons.
6. Defect 8713                                         DDM    04/06/98
   Added three items, SPRIDEN_NTYP_CODE_LBT,
   SPRIDEN_NTYP_CODE, and NTYP_DESC, to the
   SPRIDEN_CURRENT and SPRIDEN_PREVIOUS blocks
   to enable the display and update
   of name type.  Created function GET_NTYP
   _DESC to retrieve type desc based on GTVNTYP
   _CODE.               

AUDIT TRAIL: 3.1.0.1                                        INIT   DATE
1. Defect #9824						    CLF   07/31/98
   PROBLEM:  Cursor does not go to Nonperson name info
         Occurs since the addition of PERS_NTYP_CODE.
   FIX:  Correct navigation in SPRIDEN_CURRENT block.
2.  Change the release number on the form to 3.1.0.1 	    CLF   08/07/98 
	LOAD_CURRENT_RELEASE form trigger
  
 AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:5575
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail31B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. CLF   09/30/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.
2. CLF   01/21/99
   In SPRADDR block changed the ORDER BY clause to look at 
      GREATEST(nvl(spraddr_from_date,sysdate),sysdate)
   to accommodate Inactive future-dated addresses

3. CLF  05/10/99
   Defect #12496
   Problem:  The Confidential Notification Window was using the wrong
      Alert box.
   Fix:  Changed the WHEN-VALIDATE-ITEM trigger on the KEY_BLOCK.ID
      to use G$_VALID_ALL_ID

3. CLF  05/31/99
   Defect #12777
   Problem:  POST FORM trigger is not being inherited from the property class
   Fix:  Rename the form level POST-FORM trigger to
      POST_FORM_TRG per 4.0 methodology

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:5576
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_3_B2K
	
	PROCEDURE AUDIT_TRAIL_3_3_B2K IS
<multilinecomment>
AUDIT TRAIL: 3.3                                            INIT   DATE
1. Defect #10748					    CLF   02/25/99
   PROBLEM:  Street line 1 is no longer a required field
   FIX:  Added the following lines to block SPRADDR trigger
      CHECK_ADDRESS:     
      G$_CHECK_VALUE(:SPRADDR_STREET_LINE1 IS NULL,
      '*ERROR* Street Line 1 must be entered.', TRUE);

2. Defect #10838					    CLF   02/25/99
   PROBLEM:  Tirgger ERROR message appears when user does 
           not have update access on Finaid
   FIX:  Include an exception handler with meaningful message in
         form level trigger FINAID_RECON  

3. Defect #11156					    CLF   02/25/99
   PROBLEM:  Name Type code is not populated for
           SPRIDEN PREVIOUS name/ID
   FIX: Add :spriden_ntyp_code to INSERT statements 
        block SPRIDEN_CURRENT PRE-UPDATE trigger
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:5577
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail33B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_1_B2K
	
	PROCEDURE AUDIT_TRAIL_4_1_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.1
1.  CLF  09/27/99
    Defect #12896
    Problem:  SPAIDEN allows NEXT to be a valid ID while
       other forms use it to generate a new ID
    Fix:  Disallow NEXT as a valid ID on SPAIDEN
    Technical:  Change WHEN-VALIDATE-ITEM trigger on
       key_block.ID to generate message if NEXT is used for ID
       Change form level trigger KEY_EXIT to check for NEXT in
       KEY_BLOCK.Id and eliminate multiple error boxes
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
	//ID:5578
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail41B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_3_B2K
	
	PROCEDURE AUDIT_TRAIL_4_3_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.3
1. Defect #14589                                      CLF  01/14/00
    Problem: Alternate ID field allows lower case 
    Fix:  Alternate ID field should only allow CAPS
    Technical: Change Case Restriction on Property sheet to Upper
       for spriden_previous.spriden_id

2. Defect #33053                                      CLF  01/19/00
   Problem:  On new record, legal name must be typed in twice in 
      order to save
   Fix:  Save on first entry
   Technical:  On spriden_current block trigger GET_PERS_INFO
      commented out setting form fields to null.
      Added LEGAL_NAME_CURSOR to form level trigger SHOW_LEGAL_NAME.

3. Defect #13429                                      CLF  01/20/00
   Problem:  Duplicate Name Type codes are not allowed on
      Alternate ID info
   Fix:  Allow duplicate Name Types on Alternate ID info
   Technical:  Update spriden_current.PRE-UPDATE trigger to include
      test for spriden_ntyp_code on INSERT statement.
      Update spriden_previous.PRE-UPDATE and PRE-INSERT triggers to
      elliminate check for SPRIDEN_NTYP_CODE

4. Defect #34797                                      CLF  02/17/00
    Problem:  The Current Information Block allows NEXT to be a valid
       ID while other forms use it to generate a new ID
    Fix:  Disallow NEXT as a valid ID in Current Information Block and
       Alternate ID block.
    Technical:  Changed POST-CHANGE trigger on
       spriden_current.SPRIDEN_ID to generate message if NEXT is used for ID.

       Changed form level trigger KEY-EXIT to check for NEXT in
       spriden_current.SPRIDEN_ID to eliminate multiple error boxes.

       Changed SPRIDEN_CURRENT block level trigger KEY-COMMIT to check for NEXT in
       spriden_current.SPRIDEN_ID to eliminate multiple error boxes.

       Updated form level CLRFRM_TRIGGER to CLEAR_FORM(NO_VALIDATE) if
       spriden_current.SPRIDEN_ID = NEXT.

       Also made check for NEXT in PRE-INSERT trigger on 
       SPRIDEN_PREVIOUS block.

5. Defect #38266                                      CLF  04/20/00
    Problem: Previous field from current_spriden_spriden_ID 
       takes user to spriden_mi field
    Fix:  Take user to spriden_ntyp_code field
    Technical: Change SPRIDEN_CURRENT.SPRIDEN_ID trigger
       KEY-PREV-ITEM to go to spriden_natyp_code

AUDIT TRAIL: 4.3.3
1. Defect #40692                                      CLF  07/13/00
    Problem: Form flashes when going from Legal Name window to
       Address window 
    Fix:  Eliminate strobing action - window flashing
    Technical: Created WHEN-NEW-BLOCK-INSTANCE block trigger for 
       block SPRADDR


AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
	//ID:5579
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail43B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0_MANUAL
	
	PROCEDURE AUDIT_TRAIL_5_0_MANUAL IS
<multilinecomment>
AUDIT TRAIL: 5.0
1.  Regen form to keep Banner 5.0 in sync with 4.3.3 defect corrections
                                  CLF  08/02/00
                                  
AUDIT TRAIL: 5.2
1. Defect 45543                               MW  01/24/2001
   Problem: In the Alternate Identification block, press the
      Next Record function, and a blank screen comes up.
      Then, when you TAB from the Alternate ID field, you get
      a pop-up: 'FRM-41039 Invalid Alert ID 0.'  The same
      happens as you Tab through the Last Name, First Name
      fields.
   Technical Fix: Added to the top of the WHEN-NEW-RECORD-INSTANCE
      trigger in the SPRIDEN_PREVIOUS block to check for
      last record and display the message, 'At last record.',
      when no more records are available for review.

      The user should NOT be able to change anything in this block
      except to delete a record.  Therefore, modified the
      KEY-CREREC trigger and created the KEY-CLRREC trigger in the
      SPRIDEN_PREVIOUS block to execute the INVALID_FUNCTION_MSG
      trigger.

2. Defect 12662                               MW  05/22/2001
   Problem: When there are two or more entries in GTVZIPC with the
      same Zip Code, entering the Zip Code does not automatically
      bring in City and State.
   Technical Fix: Modified the KEY-LISTVAL and ADDR_DEFAULT_NXTFLD
      triggers for item SPRADDR.SPRADDR_ZIP in the SPRADDR block
      to use the new function G$_CITY_STATE_NATN3 instead of
      G$_CITY_STATE_NATN.

AUDIT TRAIL: 5.2.0.1
1. Defect 47190                               MW  06/11/2001
   Problem: The 4.3.3 version of SPAIDEN no longer have SPATELE
     and GOAEMAL as options on the left-hand side of the form?
   Technical Fix;: Added call to G$_NAVIGATION_FRAME.POPULATE_GUROPTM
     to populate the options in the navigation frame in the
     WHEN-NEW-BLOCK-INSTANCEINSTANCE trigger in the SPRADDR block.
     
2. Adjustments for Defect 12662               MW  06/11/2001
   Problem: When there are two or more entries in GTVZIPC with the
      same Zip Code, entering the Zip Code does not automatically
      bring in City and State.
   Technical Fix: Modified the KEY-LISTVAL trigger for item
      SPRADDR.SPRADDR_ZIP in the SPRADDR block to use the new
      function G$_CITY_STATE_NATN3.
      The ADDR_DEFAULT_NXTFLD trigger still uses function
      G$_CITY_STATE_NATN to populate the zip, city, state, county,
      and nation.  Also added a CHECK_MULTIPLE_ZIPS procedure to
      check for Cities which have the same ZIP/Postal codes.  This
      new procedure is called from KEY-NEXT-ITEM and KEY-PREV-ITEM
      triggers of item SPRADDR_ZIP from the SPRADDR block.
      
3. Defect 58882                               MW  06/27/2001
   Problems:
   1) Using Banner Web to update an address creates a
      second address of the same type with the old address having
      an inactive flag set to Y.  If you go to SPAIDEN or RPAIDEN
      to view the addresses for that person and try to rollback
      while viewing the inactive address, you get the error message:
        "ERROR Multiple effective addresses of this address type -
         check FTIIDEN"
      You have to view a different address (if any exist) in order
      to rollback or do the exit function.  This error message does
      not occur on PPAIDEN or FOAIDEN.

   2) Second issue deals with the incorrect error message of having
      to check the form FTIIDEN, when in SPAIDEN.

   Technical Fix: Modified the CHECK_DATES trigger in the SPRADDR
      block to work like the CHECK_DATES trigger in the RPAIDEN form.

4. Defect 53266                               MW  07/10/2001
   Problem: When clicking on the Alternate Name/ID Source option when
     in the Address Information window, receive: 'FRM-40700: No such
     trigger SHOW_SOURCE_2.'
     User cannot access the Alternate Name/ID Source option when in
     the Address Information window. 
   Technical Fix: Added two new records in the GUAOPTM form.  One
     record calls the Alternate Name/ID's option from the Address
     Information window.  The other record returns users back to the
     Address Information window from the Alternate Name/ID's window.
     Also, modified the form-level WHEN_WINDOW_ACTIVATED_TRG
     trigger to fix flickering of windows (i.e. when navigating from
     one window to another window).  

     Also, modified the KEY-DUPREC trigger in the SPRIDEN_PREVIOUS
     block by adding conditional statements to SET_FIELD ENTERABLE
     only when they have not been set ENTERABLE for items,
     'SPRIDEN_PREVIOUS.SPRIDEN_USER' and
     'SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN'.

5. Defect 54727                               MW  07/13/2001
   Problem: When accessing an address for a student thru SPAIDEN, the
     form edits on the first street address line.  Since the Spaiden
     form displays addresses in address type order, the AP address
     will appear first if the student is also a vendor.  AP does not
     use the 1st address line except for c/o etc and the FTMVEND form
     does not require the 1st line to be used.
   Technical Fix: Commented out the G$_CHECK_VALUE line of code for
      :SPRADDR_STREET_LINE1 in the CHECK_ADDRESS trigger in the SPRADDR
      block.

AUDIT TRAIL: 5.2.0.2
1. Defect 66421                               MW  08/03/2001
   Problem: If we look up a student that does not have a record in
     SPBPERS, we get an error, "FRM-40735: GET_PERS_INFO trigger raised
     unhandled exception INVALID_CURSOR."  This prevents viewing or
     updating the information in this block.
   Technical Fix: Changed the GET_PERS_INFO trigger in the
     SPRIDEN_CURRENT block.
     The trigger code was changed from the following

       OPEN PERS_NAME_CURSOR;
       FETCH PERS_NAME_CURSOR INTO :PERS_PREFIX, :PERS_SUFFIX, :PERS_PREF_FNAME, 
         :PERS_LEGAL_NAME;
       IF PERS_NAME_CURSOR%NOTFOUND THEN
          CLOSE PERS_NAME_CURSOR;
          :found_spbpers := 'N';
       END IF;
       CLOSE PERS_NAME_CURSOR;

     to the following code:

       OPEN PERS_NAME_CURSOR;
       FETCH PERS_NAME_CURSOR INTO :PERS_PREFIX, :PERS_SUFFIX, :PERS_PREF_FNAME, 
         :PERS_LEGAL_NAME;
       IF PERS_NAME_CURSOR%NOTFOUND THEN
          CLOSE PERS_NAME_CURSOR;
          :found_spbpers := 'N';
       ELSE
          CLOSE PERS_NAME_CURSOR;
       END IF;

     Also, made similar changes to the following triggers.
			SHOW_LEGAL_NAME form-level trigger
			PRE-UPDATE trigger in SPRIDEN_CURRENT block
			PRE-INSERT trigger in SPRIDEN_PREVIOUS block
			PRE-DELETE trigger in SPRIDEN_PREVIOUS block
			INSERT_SPRTELE in SPRADDR block

AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
	//ID:5580
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50Manual()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0
	
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>
AUDIT TRAIL: 5.0
1. DEFECT: 50818	WTSUI	12/29/2000
	 PROBLEM: You should not be allowed to change/update the Address Type code on a saved record. 
	 					In 3.x you receive the message: "Field protected against update."
	 FIX: 		The address type should have an 'update allowed' property turned off.
	 TECHNICAL: Set the update allowed property of SPRADDR_ATYP_CODE to "false".

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:5581
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_3_B2K
	
	PROCEDURE AUDIT_TRAIL_5_3_B2K IS
<multilinecomment>
AUDIT TRAIL: 5.3
1. Defect 49622                               MW  08/06/2001
   Problem: "Confidential" pop-up window does not appear when using
     SOAIDEN to search for persons.
   Technical Fix: Modified the KEY-LISTVAL trigger for item,
     KEY_BLOCK.ID.  Set the :GLOBAL.KEY_IDNO to NULL after the call to
     LIST_VALUES_COPY so that when the confidential check is done the
     "Confidential" warning message will pop-up.
     The confidential check is done in the WHEN-VALIDATE-ITEM trigger
     for item, KEY_BLOCK.ID.  It calls G$_VALID_ALL_ID where it checks
     for CONFIG_IND.  When the CONFIG_IND is NOT NULL and if the ID is
     NOT equal to GLOBAL.KEY_IDNO, the "Confidential" warning will pop-up.
     When returning from SOAIDEN, the new value selected is copied
     into KEY_BLOCK.ID which now is the same as the GLOBAL.KEY_IDNO.
     This makes the conditional statement to fail for the
     "Confidential" pop-up window to display.

2. Defect 64355                               MW  08/07/2001
   Problem: In SPAIDEN [4.3.5 and 5.0] enter a valid ID for an
     individual with no name and/or ID changes.  Press NEXT BLOCK.
     Cursor is now in the Current Identification block.  Press NEXT
     BLOCK again.  Cursor is now in the Alternative ID block.
     Press NEXT BLOCK again and cursor moves to the Address
     Information block.  Now press PREVIOUS BLOCK.  While navigating
     back to the Alternative ID block a query is performed with no
     records retrieved.  The user must respond to the alert box:
       FRM-40350: Query caused no records to be retrieved.

     The same behavior exists whenever the user navigates to the
     Alternative ID block from another block (i.e.: Current Name/ID,
     Legal Name, Addresses).  Having to respond to the alert box is
     annoying to functional users (especially when not consistent).
     The message should only display in the Auto Hint area.
   Technical Fix: Modified the KEY-PRVBLK trigger from the SPRADDR
     block and the form-level SHOW_PREV_ID trigger to not show the
     message, 'FRM-40350: Query caused no records to be retrieved.'
     This keeps it consistent with when navigating from the
     SPRIDEN_CURRENT block to the SPRIDEN_PREVIOUS block.

     Also, added a reference to the G$_INFO_ALERT alert from the
     GOQOLIB form.  The addition of this alert fixes defect 45543
     which states,
       In the Alternate Identification block, press the
       Next Record function, and a blank screen comes up.
       Then, when you TAB from the Alternate ID field, you get
       a pop-up: 'FRM-41039 Invalid Alert ID 0.'  The same
       happens as you Tab through the Last Name, First Name
       fields.
    
3. Defect 64786                               MW  08/07/2001
   Problem: In the Alternate Identification block of SPAIDEN
     it is possible to update the name type field and save the
     change without the userid being updated on the record.  
   Technical Fix: Modified the PRE-UPDATE trigger int the
     SPRIDEN_PREVIOUS block to also update the columns to be:
      :SPRIDEN_PREVIOUS.SPRIDEN_USER := USER;
      :SPRIDEN_PREVIOUS.SPRIDEN_ORIGIN := :SYSTEM.CURRENT_FORM;

AUDIT TRAIL: 5.3.0.1
1. Defect 66439                                MW  10/03/2001
   Problem: If you mark an existing address as inactive, the
     phone number, area code and  phone type are removed from
     the form. The phone number, area code and type continue
     to exist on form SPATELE. However, you can not select
     the number from SPATELE and have it restored to SPAIDEN.
   Technical Fix: Modified the UPDATE_PHONE_STATUS trigger in
     the SPRADDR block under the INACTIVE_TELE label.
     Set the Status Indicator to 'I' in the SPRTELE table for
     the records that match the Address Type and Sequence Number
     where the Status indicator is NULL.  Commented out the line
     of code where the Primary Indicator was getting set to NULL.

     When an existing address is inactivated, it looks like the
     phone number is cleared.  The phone info is cleared, but
     the phone info is fetched back in from the Primary record
     for that Address Type and Sequence No. in the SPRTELE table.
     
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:5582
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail53B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_4_B2K
	
	PROCEDURE AUDIT_TRAIL_5_4_B2K IS
<multilinecomment>
AUDIT TRAIL: 5.4
1. SSN/SID Alternate Search Enhancement            MW 01/13/2002
     Add new SSN/SID Alternate ID Search Form, GUIALTI, to allow
     the user to search and return an entity's Banner ID by using
     SSN/SID, Name, and/or Birth Date look-up.
   Changes:
     Modified a WHEN-BUTTON-PRESSED trigger for ID_LBT in the
     BUTTON_CONTROL_BLOCK block.
     Created a KEY-DUPREC trigger for KEY_BLOCK.ID.
     Modified the autohint for KEY_BLOCK.ID.

2. Defect 72149                                    MW 01/14/2002
   Problem: If you enter SPAIDEN for ID which has the
     Confidentiality Indicator = Y, and then ROLLBACK to the
     Key Block, the *CONFIDENTIAL* mesage still displays. It
     continues to display if you then enter a new SPAIDEN
     record and SAVE until you SAVE again [perhaps after 
     SAVing the Address Record].
   Technical Fix: Modified in the form-level KEY-DUP-ITEM
     trigger to clear the CONFID_IND item.
     
3. Defect 68330                                    MW 01/14/2002
   Problem: On SPAIDEN, in the Address block, there are two
     options that take a user to GOAEMAL.  One is labeled
     "Email Address" and the other is labeled
     "Email Address TES".  The latter one should be deleted.
   Technical Fix: Ran the following sqlplus statement to remove
     the latter Option from the GUROPTM table.
       DELETE GUROPTM
       WHERE GUROPTM_FORM_NAME = 'SPAIDEN'
       AND GUROPTM_NAME1_DESC = 'Email Addresses TEST';

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:5583
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail54B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_6_B2K
	
	PROCEDURE AUDIT_TRAIL_5_6_B2K IS
<multilinecomment>
AUDIT TRAIL: 5.6
1. Defect 79267                               MW  08/29/2002
   Problem: The record insert function is not creating the
     opportunity to add additional records in the alternate
     name block of SPAIDEN. User must use down arrow key to
     create a blank field before adding alternate name. The
     record insert function works correctly on most other
     blocks and forms.

     From the 4.0 user manual:
     September 1999 Banner2000 Student Release 4.0
     Confidential User Manual 7-7
     Alternate Identification Window
     "Use this window to enter or change information for an
      alternate ID and name."

   Technical Fix: Modified the KEY-CREREC trigger in the
     SPRIDEN_PREVIOUS block to allow for record creation
     with CREATE_RECORD line of code and removed the call
     to INVALID_FUNCTION_MSG trigger.
     Removed the KEY-CLRREC trigger to allow for clear
     record in this Alternate Identification Window.
     
2. Defect 80767                             MW  10/01/2002
   Problem: The initial SPBPERS record is not created with
     the SPBPERS_NAME_PREFIX and SPBPERS_NAME_SUFFIX when
     the initial SPRIDEN record is created.
   Technical Fix: Modified the POST-UPDATE trigger of the
     SPRIDEN_CURRENT block to first check if an SPBPERS
     record exists to determine if the SPBPERS record
     should be inserted or updated.  Created a function
     called, SELECT_SPBPERS, under Program Units to check
     if an SPBPERS record exists.
     
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:5584
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail56B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0_B2K
	
	PROCEDURE AUDIT_TRAIL_6_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 6.0
1. Defect 79498                             MW  12/30/2002
   Problem: After entering Street Line 1, and a City, if a
     SAVE is performed the following message is received:
     "ERROR-Either State or Nation must be entered." 
   Technical Fix: Modified the CHECK_ADDRESS trigger in
     the SPRADDR block to the following error message.
      '*ERROR* Either State/Province or Nation must be
       entered.' 
     
2. Defect 81235                             MW  02/02/2003
   Problem: On the Form SPAIDEN the legal name field allows
     a maximum of 99 characters to be entered, yet the
     SPBPERS_LEGAL_NAME column in the table where legal name
     is stored will only accept 60 characters
   Technical Fix: Modified the Maximum Length property of
     PERS_LEGAL_NAME in SPRIDEN_CURRENT block from 99 to 60.
     
3. Defect 80350                             MW  02/02/2003
   Problem: In the ID field of the Key Block, the Auto Hint
     displays: "ID Number; Press LIST for Person Name/DUPLICATE
     ITEM for Alternate ID look-up".  Although the function
     works correctly, HELP/SHOW KEYS does not list "Duplicate
     Item" and the associated Key stroke.

     As a comparison do this same test in GOAEMAL and SHOW KEY
     will display this entry: Duplicate Field/Item : F3

   Technical Fix: Modified the 'Keyboard Help' Text property of
     form-level KEY-DUP-ITEM trigger from 'Generate ID' to
     'Duplicate Field/Item' for function Key F3 to be listed
     under HELP/SHOW KEYS.
     
4. New ID Generation                       WG  02/05/03
   Replaced calls to UPDATE_SOBSEQN_3 and SELECT_SOBSEQN_1 with
   :SPRIDEN_CURRENT.SPRIDEN_ID := F_GENERATE_SOBSEQN('ID');
   in the PRE-INSERT and PRE-UPDATE triggers on SPRIDEN_CURRENT
   block.  Changed the WHEN-VALIDATE-ITEM on the KEY_BLOCK.ID
   and POST-CHANGE trigger on the SPRIDEN_CURRENT.SPRIDEN_ID
   to allow ID's that begin with the SOBSEQN_SEQNO_PREFIX for
   SOBSEQN_FUNCTION = 'ID'.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:5585
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail60B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_1_B2K
	
	PROCEDURE AUDIT_TRAIL_6_1_B2K IS
<multilinecomment>
AUDIT TRAIL: 6.1
1. Defect 76909																CLF  09/17/03
   Problem: When the GUBINST_FINAID_INSTALLED is not checked on GUAINST, 
      and the GUBINST_FINAID_IND is also not checked on GUAINST, some BANNER Student 
      processes still create records in the SORFADR table.
   Technical: Change check for GLOBAL.SAMSYS IS NOT NULL to GLOBAL.SAMSYS = 'Y'

2. Defect 87878																CLF  09/22/03
   Problem: Time Stamps on the SPRIDEN_ACTIVITY_DATE 
      are not accurate and consistant.
   Technical: In block level trigger SPRIDEN_CURRENT.PRE-UPDATE CREATE_ID_CHANGE insert,
      change spriden_Activity_date to sysdate.

3. Defect 89505
   Problem: If a Zip Code corresponds to more than one City/State on GTVZIPC, 
      when that Zip Code is entered on SPAIDEN, cusrso goes to City field and is
      incosistent with error message to select LIST
   Fix: Cursor should remain in Zipcode field
   Technical:  In block level trigger ADDR_DEFAULT_NXTFLD, comment out PREVIOUS_FIELD
      code lines.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
	//ID:5586
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail61B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0_API
	
	PROCEDURE AUDIT_TRAIL_7_0_API IS 
<multilinecomment> 
AUDIT TRAIL: 7.0.API 
1. Michael Hitrik  07/10/2003 
   Enhancements for 9i UI. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:5587
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70Api()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment> 
AUDIT TRAIL: 7.0
1. SJQ  11/18/2003 
   Various modifications to reference a new tab canvas and the SPRIDEN_CURRENT, SPRIDEN_ALTERNATE,
   and SPRADDR blocks from GOQOLIB. Removed obsolete triggers and made additional modifications to
   support these changes.

2. EFD 2/12/2004
   gb_identification.p_create had a signature change. Change p_pidm out to p_pidm_inout.

3. CLF 02/17/04
	 Application of enhanced UI methodology.  
	 Please refer to the SCT Banner 7.0 User Interface Technical Methodology for more details. 

	 For Common Matching, added calls to G$_INVOKE_CM in form level trigger KEY-DUP-ITEM and
	 		item level trigger key_block.id.WHEN-VALIDATE-ITEM.
	 
4. SJQ 07/06/2004
   Modify the WHEN-NEW-BLOCK-INSTANCE trigger to handle the case where the entity_ind is null.
   It was only checking if it was set.  This was causing the non person list of value to not
   be enabled when creating a new record.

5. CLF  09/29/04
	 Marital Status should not appear on the Current Identification Tab of SPAIDEN.
	 In WHEN-NEW-FORM-INSTANCE trigger, set item property VISIBLE to OFF for pers_mrtl_code and pers_mrtl_code_lbt
	 		and mrtl_desc
	 Override referenced trigger SET_MRTL_ITEMS - null;
	 
	 Overrride spriden_current.spriden_id.KEY-PREV-ITEM trigger
	 	--  GO_ITEM('SPRIDEN_CURRENT.PERS_MRTL_CODE');
  			GO_ITEM('SPRIDEN_CURRENT.PERS_LEGAL_NAME');
	 
	 Deceased date is required when deceased indicator is checked.
	 Override spbpers.CHECK_DCSD_INFO trigger
	 			IF :SPBPERS.SPBPERS_DEAD_IND IS NOT NULL AND
   				:SPBPERS.SPBPERS_DEAD_DATE IS NULL THEN
   				GO_ITEM('SPBPERS.SPBPERS_DEAD_DATE');
  				MESSAGE ( G$_NLS.Get('SPAIDEN-0050', 'FORM','*ERROR* Deceased Date must be entered when Deceased Indicator is checked.') );
  				RAISE FORM_TRIGGER_FAILURE;
				END IF;
  			
6. Defect# 70-0426, LN 18-Oct-2005
   Problem:
     Form should not allow creating duplicate IDs when PII is on, 
     Common Matching is off and the user is not exempted from PII.
   Functional Impact:
     Form will not allow creating duplicate IDs when PII is on, 
     Common Matching is off and the user is not exempted from PII.
   Technical Fix:
     Added new KEY_BLOCK.ID.VALIDATE_ID trigger to validate ID; 
     it is called by KEY_BLOCK.ID.WHEN-VALIDATE-ITEM and KEY-DUP-ITEM. 
     
7. Defect #70-0526										CLF  11/10/04
	 Problem:  When performing a clear form function from the email tab you are properly taken to the keyblock, 
	    but the Generate ID icon is no longer active. 
	 Fix: Change the Execution Hierarchy from Override to Before 
	    on the GOREMAL ENABLE_KEYS and DISABLE_KEYS triggers.

AUDIT TRAIL: 7.0.0.1
1. Defect 101958																	CLF  02/24/05
	 Problem: Contact 3455548/defect 101947 have necessitated that functionality be moved out of GOQCLIB. 
	 	 	Reference in GOQCLIB to SOKCPLN.P_CREATE_MATERIALS causes problems if school doesn't have Student. 
			Code being removed from GOQCLIB.
	 Technical: Override the referenced trigger CHECK_MATERIALS.  Include the code that has been
	 		removed from GOQCLIB.

AUDIT TRAIL: 7.2
1. Issue:  Form was not using referenced POST-FORMS-COMMIT trigger.
	 Technical: Change SPAIDEN subclass to NULL on property palette.
	 		Change name of trigger POST-FORMS-COMMIT to POST_FORMS_COMMIT_TRG.
	 		Re-assign G$_APPL_FORM_CLASS to SPAIDEN.
	 																										CLF  07/06/05
AUDIT TRAIL: 7.3
1. RACE ETHNICITY                                     WG   01/17/06
	 Subclassed in the RACE ETHN block and made certain fields visible
	 that weren't.  Recompiled the form.
	      
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:5591
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
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
	//ID:5592
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_SPBPERS_2
	
	FUNCTION SELECT_SPBPERS_2 
   RETURN BOOLEAN IS
   BIO_EXISTS VARCHAR2(1):='N';
   RACE_EXISTS VARCHAR2(1):='N';
      CURSOR PTI_CURSOR IS
         SELECT 'Y'
         FROM   SPBPERS
         WHERE  SPBPERS_PIDM = :PIDM ;
      CURSOR PTI_CURSOR2 IS
         SELECT 'Y'
         FROM   GORPRAC
         WHERE  GORPRAC_PIDM = :PIDM ;         
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO BIO_EXISTS ;
      CLOSE PTI_CURSOR ;
      OPEN PTI_CURSOR2 ;
      FETCH PTI_CURSOR2 INTO RACE_EXISTS ;
      CLOSE PTI_CURSOR2 ;  
      IF (BIO_EXISTS = 'Y' OR RACE_EXISTS = 'Y') THEN
         RETURN (FALSE) ;
      ELSE
      	 RETURN (TRUE) ;
      END IF;
   END ;
	*/
	//ID:5593
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool selectSpbpers2()
		{
			int rowCount = 0;
			NString bioExists = toStr("N");
			NString raceExists = toStr("N");
			String sqlptiCursor = "SELECT 'Y' " +
	" FROM SPBPERS " +
	" WHERE SPBPERS_PIDM = :PIDM ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			String sqlptiCursor2 = "SELECT 'Y' " +
	" FROM GORPRAC " +
	" WHERE GORPRAC_PIDM = :PIDM ";
			DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
			try {
				//Setting query parameters
				ptiCursor.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					bioExists = ptiCursorResults.getStr(0);
				}
				//Setting query parameters
				ptiCursor2.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());
				ptiCursor2.open();
				ResultSet ptiCursor2Results = ptiCursor2.fetchInto();
				if ( ptiCursor2Results != null ) {
					raceExists = ptiCursor2Results.getStr(0);
				}
				if ((bioExists.equals("Y") || raceExists.equals("Y")))
				{
					return  toBool(((NBool.False)));
				}
				else {
					return  toBool(((NBool.True)));
				}
				}finally{
					ptiCursor.close();
					ptiCursor2.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_I18N
	
	PROCEDURE AUDIT_TRAIL_8_0_I18N IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 I18N 
1. Michael Hitrik  06/29/2007
   This form has been modified to increase the bio-demographics fields 
   to support internationalization requirements. 
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS Property Class to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:5594
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
2. TGKinderman 10/30/2007
   Modify in support of General7.5 TabSecurity  (1-2LHZ2R)
3. TGKinderman 11/06/2007
   Add Tab/block to the form for Additional Identification
   a. Reference Object Group G$_ADDITIONAL_ID_OBJ from GOQCLIB into form.  Drag to sequence GORADID block
      appropriately in form
   b. Reference Tab ADDITIONAL_ID_TAB from GOQCLIB into form.
   c. Add logic to form-level triggers WHEN-TAB-PAGE-CHANGED, DISABLE_TAB_PAGES and ENABLE_TAB_PAGES for tab
      ADDITIONAL_ID_TAB
   d. Add form-level trigger SHOW_ADDITIONAL_ID for use with GUROPTM row (Options).  Used to navigate to the
      block GORADID in the Tab ADDITIONAL_ID_TAB
4. Eapen Mani 12/14/2007
   Defect No:1-33V7FR
   Problem: "Confidential" pop-up window does not appear when using
     GUAILTI to search for persons.
   Technical Fix: Modified the KEY-DUPREC trigger for item,
     KEY_BLOCK.ID.  Set the :GLOBAL.KEY_IDNO to NULL after the call to
     LIST_VALUES_COPY so that when the confidential check is done the
     "Confidential" warning message will pop-up.
 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;

	*/
	//ID:5595
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS
<multilinecomment> 
AUDIT TRAIL: 8.2
1. Recompiled to pick up GOQCLIB changes.                        JC  11/24/2008
2. Defect 1-3JALZV                                               LvH 12/12/2008
   Changes made to SPAIDEN and goqclib to enable masking of fields on the
   SPAIDEN form.
3. Defect 1-3XGCCP                                               LvH 01/03/2009
   Changes made to ENABLE_KEYS, DISABLE_KEYS, and WHEN-NEW-FORM-INSTANCE to disable
   the options while in the key block.
4. Defect 1-4NTK62                                               LvH 02/06/2009
   Changes made to allow 'NEXT' as a valid ID.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:5596
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : SPAIDEN
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Tue Feb 14 15:58:49 2012
-- MSGSIGN : #a4bc8784ccf107f1
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:5597
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5_3_1
	
	PROCEDURE AUDIT_TRAIL_8_5_3_1 IS
BEGIN
  NULL;
 <multilinecomment>
 AUDIT TRAIL: 8.5.3.1   
  1.Defect: 1-USLLT                         MV 01/11/2012
    Problem: Data Masking with GORPRAC_RACE_CDE field on SPAIDEN, SPAPERS, SAAQUIK, SRAQUIK - FRM-40106.
    Solution: Following triggers have been modified to resolve this issue.
    
  a. SHOW_BIO: added logic to check that gorprac_race_cde is enabled prior to navigating to 
      and querying the gorprac block.  Added logic to execute triggers to enable/show or disable/hide all
     visible columns depending on gorprac_race_cde settings.  Added 2 new form triggers, enable_gorprac
     and disable_gorprac to accomplish this.
        
 AUDIT TRAIL END 
 </multilinecomment> 
END;
	*/
	//ID:5598
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail8531()
		{
		}

		public void executeAQuery() {
			if ( (getBlockStatus().equals("NEW") || getBlockStatus().equals("QUERY")) )
			{
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
				try { 
				MessageServices.setMessageLevel(MessageLevel.NONE);
				executeQuery();
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
				} finally {
							
				MessageServices.resetMessageLevel();
				}
							
			}
			
		}

	
	

}
