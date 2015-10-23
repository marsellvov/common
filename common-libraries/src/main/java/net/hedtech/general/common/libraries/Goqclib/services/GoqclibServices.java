package net.hedtech.general.common.libraries.Goqclib.services;

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


import net.hedtech.general.common.libraries.Goqclib.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqclib.model.*;



public class GoqclibServices extends AbstractSupportCodeObject{
	
	
	public GoqclibServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GoqclibTaskPart  getTask() {
		return (GoqclibTaskPart )super.getContainer();
	}

	
	public net.hedtech.general.common.libraries.Goqclib.model.GoqclibModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0
1.  SJQ 05/05/2004
    Introduction of a new "common" object library.  This library will contain objects which 
    previously existed as common forms.  This intended to provide a location for the consolidation
    of duplicate blocks, windows, and code.
2.  SJQ 05/05/2004
    Moved the blocks (and supporting/required objects) from GOQOLIB to this new form for the
    EMAIL, ADDRESS, CURRENT_ID, ALTERNATE_ID, BIO, TELEPHONE and EMERGENCRY CONTACT blocks and
    canvases.
3.  SJQ 05/18/2004
    Removed references to the SORFADR table.  This is obsolete functionality.  Added conditional
    logic to the CHECK_DATES routine.  This logic should not be executed if part of the Finance
    forms. 
4.  SJQ 05/28/2004
    Add logic to the SPBPERS block to clear the description fields if the code fields are cleared.
5.  SJQ 06/16/2004
    Change the SET_CHECK_BOXES on the spraddr block to default 'N' instead of null.  Added
    scroll bars to the sprtele and goremal blocks.
6.  SJQ 07/02/2004
    Change the address type code item to not be updateable.  Update the ENABLE_PHONES trigger
    to add block name to item.  Update the count query hits on telephone on the address tab
    to go to the telephone tab if it exists.  Update the count query hits on the address type
    to determine which form is running and call the appropriate product address query form.
7.  SJQ 07/06/2004
    Modify the telephone type code in the address block to not be queryable.  It is not part of
    the base table.  Modify the telephone Count Query logic to check if currently in a form
    which has the telephone tab.  If so, navigate to that tab.  If not, determine which form
    is currently running and call that product's IDEN form.  Update the SSN items on the 
    SPBPERS block to have the changed SSN copied to the SPRIDEN_CURRENT SSN item
    in the form.  Removed the key stroke short cuts from the tab canvases.
8.  SJQ 07/07/2004
    Modify the emergency contact block to not set the default initial value of the activity
    date.  Make sure it is set at commit time.  Apply the same change to the biographical
    data block.  Modify the when-button-pressed on the address type button to check which 
    form is running.  If in a payroll form, show list of options otherwise show list of 
    values for the item.  Modify the COUNT QUERY HITs trigger on the address type item in
    the address block to reference the key_block id instead of the spriden_current.
9.  SJQ 07/08/2004
    Add fax numbers to the address block just below the telephone number.  Default is not to
    be displayed.  Selective forms will enable.  Modify the telephone block to set and display
    the user id and activity date.  Update the current id logic to correctly set the legal
    name to accessible when processing a person.  Update the current id block to only copy
    the changed id value if the update succeeds.  Modify the address block to clear the 
    sequence number if a duplicate record function is executed.
10. SJQ 07/09/2004
    Modify the alternate id block to remove the required attribute on the change type
    indicator and code the commit logic to ensure it has been valued.  This was causing 
    errors when attempting to navigate from an empty record.  Modify the logic in the
    email block to add checking for the email type code at commit time and remove the
    required attribute for the same reasons as the modifications to the alternate id block.
10. SJQ 07/14/2004
    Modify the address block to remove the delete of the telephone when the address is
    deleted since the API handles this.
11. SJQ 07/23/2004
    Modify the PRE-QUERY trigger to add dynamic sort logic.
12. RV 07/28/2004
    Added set_finance_rules and reset_finance_rules to spraddr block that Finance can over-ride
    to set finance rules appropriately to create/update addresses.
13. RV 02/08/2004
    The user needs to be prompted to commit any changes before leaving the block.  Added Program Units F_IS_ID_CHANGE
    and F_IS_PHONE_CHANGE and modifed key-NXTBLCK and KEY-PRVBLCK of all the blocks.  Added Form level triggers
    check_to_save, key_nxtblock_trg and key_prvblock_trg to support this functionality.
14. RV 02/08/2004
    Modifed SPREMRG KEY-CQUERY triggers to go to appropritate product address query forms.
15. RV 10/08/2004
    Modified KEY-CLRFRM on spraddr block to get rollback after entering partial address working
16. RV 10/08/2004
    GET_FULLNAME trigger on SPRIDEN_CURRENT block is modified to call the G$_BUILD_FULL_NAME procedure
17. RV 23/08/2004
    Changed Visual attribute of veteran Category to G$_NVA_TEXTITEM
18. RV 23/08/2004
    Added key-entqry and modifed post-query trigger on spraddr block to disable and enable the tele type button
    and phone button during query.
19. RV 23/08/2004
    Modified key-next-item of spraddr.spraddr-from-date to default sysdate.
20. RV 25/08/2004
    Added key-delrec to spriden_previous and alerts to warn user when they delete an alternate row.
21. RV 08/09/2004
    Added user and activity date to the email canvas
22. RV 09/09/2004
    Set :GLOBAL.PIDM in Key-cquery for spraddr_atyp_code in spraddr block.
23. RV 09/13/2004
    Changed the default value of the 3 Alumni related check boxes in SPRADDR to be unchecked.
24. RV 09/20/2004
    Modified check_address in SPREMRG block so that address is not required for emergency contact.
25. RV 09/20/2004
    Fixed post-change on spraddr.spraddr_from_date so that it errors out only when the from_date is past the
    to_date
26. RV 09/20/2004
    Added a hyphen between area code and phone number on the address block.
27. RV 09/27/2004
    Passed in p_origin into the p_update in ON-UPDATE of SPRIDEN_CURRENT block.
28. RV 09/28/2004
    Modified post-change of spbpers_birth_date and when-validate-item of :spbpers_dead_date so that
    if the dead date is left null, then the age is null.
29. RV 09/28/2004
    Added SPRIDEN_CURRENT.SET_MRTL_ITEMS trigger and invoke it from SPRIDEN_CURRENT.WHEN-NEW-BLOCK-INSTANCE trigger
    rather than set the properties of the marital status directly in when-new-block-instance.  This is done so
    that forms such as SPAIDEN that do not display marital status on spriden_current page can always have it 
    disabled.
30. RV 10/19/2004
    Added code in triggers in spriden_current, spriden_previous and spbpers to switch off pii prior to checking for duplicate id
    or existance of ssn in the database.
31. RV 10/20/2004
    Corrected SPRADDR.CHECK_DATES for defect #86970.
32. RV 11/03/2004
    Modified SPRADDR.UPDATE_SPRTELE to update the telephone using row id.  Otherwise, update of tele code did not work.
33. RV 11/08/2004
    Added alumni sort to :SPRADDR.PRE-QUERY.
34. RV 11/11/2004
    Removed on-lock triggers to revert to Oracle's locking. 
35. RV 11/12/2004
    Added veteran indicator parameter to API calls in SPBPERS block on-insert and on-update triggers.
36. RV 11/25/2004
    Modified GOREMAL post-query trigger to select the activity date.  Set activity date to sysdate in on-insert and on-update.
    Activity date is made non database item because of the way GORMEAL api does an update - a create followed by insert. Row 
    ID changes.
37. RV 12/01/2004
    Modified length of pers_legal_name to be 60 from 99.

AUDIT TRAIL: 7.0.0.1
1.  RV 02/14/2005
    Defect 101947: Compile fails if Student product is not there.
    Fix: Remove code in SPBPERS.CHECK_MATERIALS that has Student specific code.
2.  RV 02/14/2005
    Added an auto hint for ATYP in address block.
3.  RV 02/14/2005
    Fixed the auto hint on the primary indicator of Tele block to say 'only one primary per address 
    type/sequence.'
4.  RV 02/14/2005
    On Emergency contact block, fixed autohints for ATYP from ' addr.' to 'address' and 
    State/Province to State or Province.
5.  RV 02/14/2005
    Problem: If an address is inactive and the user attempts to make the associated telphone record 
    active and primary at the same time, the primary ind gets unchecked. The user should be able to
    make the phone active and primary at the same time. 
    Fix: Modified the WHEN_CHECKBOX_CHANGED trigger of SPRTELE.SPRTELE_STATUS_IND to not uncheck 
    primary indicator.

AUDIT TRAIL: 7.0.0.2
1.  SJQ 03/22/2005
    Update the WHEN-VALIDATE-ITEM on the SSN item in the current id block to create the 
    GLOBAL.LOCATION_IND variable if it doesn't exist prior to testing its value.  When running
    in some environments, this global was never being created. (102083)  Updated the properties of 
    the PERS_SEX item, in the SPBPERS block, to have N as the value for "mapping of other values"
    property.  The valid values of the radio group are M, F, and N.  Null is valid in the table
    but the item in this block does not support this option if the NOT_AVAILABLE option of the
    radio group is disabled. (102055)
2.  SJQ 03/23/2005
    Update the logic of the POST-CHANGE on the SPBPERS_SSN item.  The existing logic was trying
    to check if the value existed on any other record.  The query didn't exclude the current
    pidm record and was causing the error to be raised.  The query was modified to not include
    the current pidm record.  Updated the exception logic to turn PII back on if needed.  It was
    turning it off which is wrong.  Update the WHEN-LIST-CHANGED to correct a reference to the
    SPRIDEN.SPRIDEN_LAST_NAME.  This should have been SPRIDEN_PREVIOUS.SPRIDEN_LAST_NAME.
3.  SJQ 03/24/2005
    Update the logic of the WHEN-VALIDATE-ITEM on the SSN item in the current id block.  The 
    existing logic was trying to check if the value existed on any other record.  The query didn't 
    exclude the current pidm record and was causing the error to be raised.  Updated the same
    trigger to only perform validation if it has actually changed from the initial query.  Added
    the same logic for ssn validation for Canadian institutions that is on the ssn item on the
    current id block.  This logic will currently only execute if in the PPAIDEN form.  Updated
    the WHEN-VALIDATE-ITEM on the SSN in the current id block to test if the spriden and spbpers
    records exist before attempting to replicate the SSN to the SPBPERS block.
4.  SJQ 03/31/2005
    Update the logic of the WHEN-VALIDATE-ITEM on the SSN item in the current id block.  The 
    logic was updated to add an exception handler in order to ensure that FGAC was turned back
    on if active.  Needed to add a RAISE FORM_TRIGGER_FAILURE after this to make sure the any
    errors were propagated back to the invoking trigger.
5.  SJQ 04/04/2005
    Update the logic of the WHEN-VALIDATE-ITEM on the SSN item in the current id block.  The 
    logic was updated to verify that the SPBPERS record has been queried before attempting to copy
    the changed value to the SPBPERS_SSN.  Without this, the value was being copied before the
    record had been queried and the attempted to create the SPBPERS record.

AUDIT TRAIL: 7.1
1.  SJQ 05/02/2005
    Modify the legal name item in the SPRIDEN_CURRENT_BLOCK to change the logic in the KEY-NEXT-ITEM
    trigger.  The trigger is inherited via the property class on the item but it was executing
    the code/description validation which shouldn't be happening on this item.  The trigger was
    modified to navigate to the next item.
    
AUDIT TRAIL: 7.2
1.  SJQ 04/15/2005
    Replace all local calls to any DBMS_* packages with calls to the GOKDBMS package.  This is to
    remove all direct calls to these packages as this a recommendation from Oracle and causes 
    problems in some environments.  Modified the PRE-DELETE and the CHECK_SSN on the SPBPERS block.
    Modify the SET_CHECK_BOXES on the SPRADDR block to perform a NULL command.  This was custom
    logic which the APAIDEN form needed and will be maintained in that form. 
2.  SJQ 05/09/2005
    Update the WHEN-NEW-BLOCK-INSTANCE trigger on the SPRIDEN_CURRENT block to test the value
    of the SYSTEM.CURSOR_BLOCK so that if the value is KEY_BLOCK, that the rest of the trigger
    logic is skipped.  This should only be the case when navigation from the KEY_BLOCK fails for
    some reason, like not all values are entered.  Otherwise, the WNBI trigger was attempting to
    execute triggers which only reside in the SPRIDEN_CURRENT block but the cursor is actually
    still in the KEY_BLOCK, thus causing Oracle errors.
3.  SJQ 07/08/2005
    Update the ADDR_DEFAULT_NXTFLD logic on the zip code item.  If the value entered does not
    exist and all other related address items are null (city, state, county and nation),
    navigate the cursor to the city item similar to the way it worked in 5.x (102204).
4.  LN 08/26/2005
    Race/Ethnicity project.  Added the following items:
    - block spbpers items: spbpers_ethn_cde, spbpers_confirmed_re_cde, 
      spbpers_confirmed_re_date.
    - block trigger spbpers.check_ethn_race_confirmed_date to edit the 
      spbpers_confirmed_re_date based on the value of spbpers_ethn_cde.  
      the new trigger is called by spbpers.pre-insert, spbpers.pre-update, 
      and spbpers_confirmed_re_cde.when-checkbox-changed.
    - block gorprac.
    - item form_header.green_data_bar_1.
    - object group g$_ethn_race_obj includes: block gorprac, lov gorrace_lov, and gorrace_rg.
    
    Modified the followings:
    - form trigger check_to_save to check gorprac block status.
    - block spbpers triggers spbpers.on-insert and spbpers.on-update to include
      three new parameters: p_ethn_cde, p_confirmed_re_cde, and p_confirmed_re_date.     
    - item spbpers_svdet_code: set property Next Navigate Item = pers_sex.
    - item pers_sex: set property Previous Navigate Item = spbpers_svdet_code.

AUDIT TRAIL: 7.3
1.  SJQ 10/24/2005
    Update the KEY-COMMIT trigger on the SPRIDEN_CURRENT block to test for success after
    attempting to issue the NEXT_ITEM and PREVIOUS_ITEM commands.  A POST-CHANGE or 
    WHEN-VALIDATE-ITEM failure would not stop the processing and caused error messages to be
    displayed twice.
2.  SJQ 12/14/2005
    Create a new block level trigger, SET_FINANCE_DATES, in the address block.  This will be
    called by the POST-CHANGE on the address type item.  By default, the trigger will do 
    nothing and will be changed by the Finance forms to do custom date handling.
3.  SJQ 12/16/2005
    Update the POST-CHANGE on the SPBPERS.SPBPERS_SSN and the WHEN-VALIDATE-ITEM on the
    SPRIDEN_CURRENT.PERS_SSN items to call a new routine in the GOQRPLS to determine what the
    user preference setting is for displaying the duplicate SSN/SIN/TFN warning message.  Remove
    the logic in the WHEN-VALIDATE-ITEM which was attempting to keep the other SSN item in
    synch.  Since navigation to each tab causes a query to occur, they will automatically get
    the updated value.  This also eliminated the duplicated warning message to occur.  Added
    logic to the WHEN-NEW-RECORD-INSTANCE, WHEN-NEW-ITEM-INSTANCE and KEY-NEXT-ITEM triggers 
    in the SPRIDEN_PREVIOUS block to check if the block is currently in ENTER-QUERY mode and,
    if so, change some of the navigation logic. 
4.  SJQ 12/19/2005
    Update the ON-INSERT trigger in the SPRADDR block to initialize the SPRADDR_SEQNO item
    to NULL before calling the API.  The item should never be valued except by the API but
    sometimes the API thought the item was valued.  Updated the SPRIDEN_ID item in the 
    SPRIDEN_PREVIOUS block to allow enter query mode.  Replace the cursors in the POST-QUERY
    and WHEN-VALIDATE-ITEM in the SPRIDEN_PREVIOUS block to use the existing API for the
    name type code to retrieve the description.  Update the navigation logic in the
    SPRIDEN_PREVIOUS block to consolidate the code into common triggers which can be called
    from various routines.  Add logic to the KEY-COMMIT trigger in the SPRIDEN_PREVIOUS block
    to cause a requery after the commit succeeds to eliminate possible locking issues in.  This 
    was only an issue when the record being deleted required another record to be updated to
    preserve the name or id change so the requery is conditioned for this situation.  Removed 
    code from the SPRIDEN_PREVIOUS block which was enabling and disabling a button which was 
    only on the temp canvas.  Moved the items in the SPBPERS block up one line and moved the 
    items in the GORPRAC block up one line so that all of these will fit in the APAIDEN windows.  
    The APAIDEN form has an additional key block line and needed the additional space.  Made the 
    default property for the GORPRAC items to be visible.  Update the error message in the 
    POST-CHANGE on the SPRIDEN_ID item in the SPRIDEN_CURRENT block to remove the abbreviations.  
    Added green bar line to the GORPRAC block and set it to only display once since this is a 
    repeating block.  Change the default property setting for the scroll bar in the GORPRAC 
    block to visible.  Update the default property for the three R/E related items in the
    SPBPERS block to visible.
5.  SJQ 12/22/2005
    Replace local cursors with calls to existing common APIs for validation and getting 
    descriptions.  Added missing property class to the GORPRAC list of values button.  Add missing
    G$_NLS commands for messages.
6.  SJQ 01/17/2006
    Add new NULL triggers and execution of these new triggers in various locations so that some
    of the products can implement custom versions of these null triggers.  Added:
      SPRIDEN_CURRENT.EDIT_EMPLOYEE_STATUS called by SPRIDEN_CURRENT.WHEN-NEW-BLOCK-INSTANCE
      SPBPERS.EDIT_PERS_GENDER             called by SPBPERS.POST-QUERY
      SPBPERS.CHECK_FOR_EMPLOYEE           called by SPBPERS.PRE-UPDATE
      SPBPERS.EDIT_BIRTH_DATE              called by SPBPERS_BIRTH_DATE.POST-QUERY
      SPBPERS.EDIT_COBRA_ELIGIBILITY       called by SPBPERS_DEAD_IND.WHEN-CHECK-BOX-CHANGED
                                              and by SPBPERS_MRTL_CODE.POST-CHANGE
      SPBPERS.EDIT_PERS_AGE                called by SPBPERS_DEAD_DATE.WHEN-VALIDATE-ITEM
      SPBPERS.CONVERT_ETHN_CODE            calleb by SPBPERS_ETHN_CODE.POST-CHANGE
    Moved the existing logic in the SPBPERS_DEAD_DATE.WHEN-VALIDATE-ITEM which is associated
    with the section which calls the new SPBPERS.EDIT_PERS_AGE trigger into this new trigger.
    Update the navigation logic in the SPRIDEN_CURRENT.SPRIDEN_ID.KEY-PREV-ITEM trigger to check
    if the marital code is visible or not to determine how the cursor should navigate.  In some
    forms, the marital code is not visible.  Update the SPBPERS.CHECK_SSN trigger to remove
    all logic and make into a NULL trigger.  The logic was specific to the PPAIDEN form and
    the PPAIDEN form will be modified to implement the specific logic that is needed to support
    this functionality.
7.  SJQ 01/20/2006
    Update the logic in the form level KEY_NXTBLOCK_TRG and KEY_PRVBLOCK_TRG triggers to
    correctly handle navigation and querying of the SPBPERS and GORPRAC blocks if the R/E
    enhancement has been implemented.
8.  SJQ 01/24/2006
    Update the SPRIDEN_CURRENT.WHEN-NEW-BLOCK-INSTANCE trigger to only enable and disable the
    search buttons only if they are visible.  Added tests to verify if the buttons are visible.
    Remove logic from the SPRIDEN_CURRENT.CHECK_SSN since this is only used by PPAIDEN.  PPAIDEN 
    will customize this trigger.  Update SPBPERS_DEAD_DATE.WHEN-VALIDATE-ITEM to call the
    EDIT_COBRA_ELIGIBILITY trigger.
9.  SJQ 01/25/2006
    Update the GORPRAC.KEY-NXTBLK trigger to execute KEY_NXTBLOCK_TRG instead of simply
    issuing a NEXT_BLOCK command for consistency.  Added a GORPRAC.KEY-PRVBLK trigger to make it
    behave like all of the other blocks (verify no pending changes).
10. SJQ 01/26/2006
    Adjust the positioning of the name related items on the SPRIDEN_CURRENT canvas to make all 
    of the items correctly spaced.  The middle initial was not positioned correctly and was
    affecting the display when run at higher resolutions.
11. SJQ 01/30/2006
    Add logic to the SPBPERS.CONVERT_ETHN_CODE trigger to call the G$_CONVERT_ETHN_CODE library 
    routine to perform the ethnicity conversion.  This will be implemented in all forms which 
    include this block.
12. SJQ 01/31/2006
    Update the SPBPERS block to make the SPBPERS_ETHN_CDE, SPBPERS_CONFIRMED_RE_CDE, 
    SPBPERS_CONFIRMED_RE_DATE, and SPBPERS_CONFIRMED_RE_DATE_DBT items to set the VISIBLE property
    to true.
13. SJQ 02/03/2006
    Update the SPBPERS.UPDATE_SPRTELE trigger to check the existing variable which determines
    whether or not the telephone items have changed and only if this is true, do the call to
    the telephone API.  This trigger was always being called if an address change was committed,
    even if the telephone items did not change.  Update the SPRTELE.DO_EDITS routine to remove
    the logic that was not allowing a record which has the primary indicator set to also be
    made inactive.  Making the record inactive was clearing the primary setting and shouldn't.
    Update the SPBPERS_PRIMARY_IND.WHEN-CHECKBOX-CHANGED logic which was generating an error
    if the primary indicator was being checked and the inactive indicator was already set.  Now
    a warning message will be displayed but the change will be allowed.  Update the SPRADDR
    block routine INSERT_SPRTELE to check if the telephone number already exists which matches
    the address record.  If it does, update the primary indicator.  Otherwise create the new
    telephone number record (1-6P7U8).
14. SJQ 02/06/2006
    Update the auto hint wording on the SPBPERS.SPBPERS_ETHN_CDE item.  Update the navigation
    logic in the SPBPERS block to allow navigation to the race/ethnicity related items.  The
    block used to not allow key board navigation to these items.
15. SJQ 02/15/2006
    Add a WHEN-VALIDATE-ITEM trigger to the SPBPERS.SPBPERS_BIRTH_DATE to clear the age item
    when the SPBPERS_BIRTH_DATE item is cleared.
16. SJQ 02/16/2006
    Change the ENABLED attribute on the GOREMAL_USER_ID, SPRIDEN_PREVIOUS.SPRIDEN_USER_ID,
    SPRIDEN_PREVIOUS.SPRIDEN_ACTIVITY_DATE, SPRIDEN_PREVIOUS.SPRIDEN_CREATE_USER and
    SPRIDEN_PREVIOUS.SPRIDEN_CREATE_DATE to FALSE.  These items were also updated to set the
    QUERY attribute on.  Updated error messages that had SSN/SIN/TFN to SSN/SIN/TIN.
17. SJQ 02/22/2006
    Change the visual attribute assigned to the SPBPERS.SPBPERS_ETHN_CDE.  As a list type item
    it should have the G$_NVA_LIST applied to it.
18. SJQ 03/03/2006
    Move the call to the GET_FULLNAME trigger from the SPRIDEN_CURRENT.PRE-INSERT to the
    POST-INSERT trigger.  This shouldn't execute until the commit processing is almost complete.
    Added a call to the GET_FULLNAME trigger to the SPRIDEN_CURRENT.POST-UPDATE trigger.
19. SJQ 03/28/2006
    Update the GET_FULLNAME trigger to include the prefix and suffix items in the call to the
    GOQRPLS.G$_BUILD_FULL_NAME procedure.
20. SJQ 04/21/2006
    Modify the logic in the SPRIDEN_PREVIOUS.DUPLICATE_RECORD trigger to remove the old navigation
    logic to the user id and origin items.  This was left over from the 6.x version and is no longer
    valid.  Modify the attributes for the SPRIDEN_PREVIOUS.SPRIDEN_USER and SPRIDEN_ORIGIN items
    to make them disabled.  Also change the properties on these items to allow them to be
    queryable.  Update the logic in the SPRIDEN_PREVIOUS.SPRIDEN_NTYP_CODE WHEN-VALIDATE-ITEM to
    verify the code entered returns a valid description.  If it doesn't, raise an error and don't
    allow the user to navigate out of the item.
21. SJQ 04/24/2006
    Modify the logic in the SPRIDEN_PREVIOUS.SPRIDEN_CHANGE_IND WHEN-LIST-CHANGED trigger to test 
    if the user is running in ENTER-QUERY mode.  If running in ENTER-QUERY mode, skip all of the 
    logic which is currently in place.  Move the green bar seperator associated with the R/E block
    to the biographical information block so that the current record hi-lighting doesn't get 
    applied to the seperator item.  Modify the logic in the SPRIDEN_PREVIOUS.SPRIDEN_NTYP_CODE 
    KEY-NEXT-ITEM to remove the test for a null rowid.  The logic should be executed regardless
    of whether the record is new or pre-existing.  This will allow an existing record to have
    the name type value changed and perform the proper validation.  Modify the SPRIDEN_PREVIOUS
    block level trigger DISABLE_ITEMS to remove the disabling of the navigable property.  Update
    the logic in the SPBPERS.SPBPERS_DEAD_DATE WHEN-VALIDATE-ITEM to clear the SPBPERS_DEAD_IND
    and recalculate the age when the date value is cleared or removed.  Modify the form level
    CHECK_TO_SAVE trigger to check the FORM_STATUS instead of the BLOCK_STATUS so that changes
    in the R/E block can be detected from the SPBPERS block (or vice versa) when attempting to 
    do tab or options navigation.  Update the error messages displayed when attempting to navigate
    out of either the SPBPERS or GORPRAC blocks to warn the user that a change is pending in one
    of those blocks.  Update the block navigation logic for these two blocks to allow the user to
    move back and forth even with pending changes.
22. SJQ 04/28/2006
    Add logic to the SPRIDEN_CURRENT.PERS_SSN WHEN-VALIDATE-ITEM to check if the item is visible
    or not.  If not visible, do not execute the remainder of the logic.  This was added because
    when the item is invisible and the user session times out and the user presses the COMMIT key
    they are first prompted to reconnect and then the form raises an error because it is executing
    the WHEN-VALIDATE-ITEM logic on the invisible PERS_SSN item.  This appears to be some kind of
    a bug in the developer suite.  Moved the "green bar" item associated with the R/E block to
    the SPBPERS block.  In the previous implementation the "green bar" item was getting the current
    record color applied to it.  By moving it to the SPBPERS block, this won't happen.

AUDIT TRAIL: 7.3.1.1
1.  TGK 09/18/2006
    Modify SPRADDR.ON-INSERT to null out the SPRADDR.SPRADDR_SEQNO only if the global
    GLOBAL.USE_FINANCE_RULES is not Y.  Forms FTMVEND, FTMFMGR, FTMCUST and FTMAGCY are corrected
    with this modification/regen such that they can enter then seqno and not use the seqno that is
    generated by the api.  (1-W2FWY)

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:2505
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70()
		{
		}

	
	/* Original PL/SQL code for Prog Unit F_IS_ID_CHANGE
	
	FUNCTION F_IS_ID_CHANGE RETURN VARCHAR2 IS
  PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SPRIDEN
         WHERE  ROWID = :SPRIDEN_CURRENT.ROWID
           AND  SPRIDEN_LAST_NAME = :SPRIDEN_CURRENT.SPRIDEN_LAST_NAME
           AND  ((SPRIDEN_FIRST_NAME = :SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME
           AND  :SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME IS NOT NULL)
            OR  (:SPRIDEN_CURRENT.SPRIDEN_FIRST_NAME IS NULL
           AND  :SPRIDEN_CURRENT.SPRIDEN_ENTITY_IND = 'C'))
           AND  SPRIDEN_ID = :SPRIDEN_CURRENT.SPRIDEN_ID ;
                     
BEGIN
	IF :SPRIDEN_CURRENT.SPRIDEN_PIDM IS NULL AND
     (:SPRIDEN_CURRENT.PERS_LAST_NAME IS NOT NULL OR
      :SPRIDEN_CURRENT.NON_PERS_NAME IS NOT NULL) THEN
    RETURN 'NEW';
  ELSIF :SPRIDEN_CURRENT.SPRIDEN_PIDM IS NULL AND
   	    :SPRIDEN_CURRENT.PERS_LAST_NAME IS NULL AND
   	    :SPRIDEN_CURRENT.NON_PERS_NAME IS NULL THEN
    RETURN 'CREATE';
	ELSE 
    OPEN PTI_CURSOR;
    FETCH PTI_CURSOR INTO PTI_INTO_TEMP;
    IF PTI_CURSOR%NOTFOUND THEN
      CLOSE PTI_CURSOR;
      RETURN 'CHANGE';
    ELSE
      CLOSE PTI_CURSOR;
      IF :CHANGE_SPBPERS = 'Y' THEN
        RETURN 'CHANGE';
      END IF;
    END IF;
    RETURN 'NONE';
  END IF;  
END;
	*/
	//ID:2506
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString fIsIdChange(SpridenCurrentAdapter spridenCurrentElement)
		{
			int rowCount = 0;
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
	" FROM SPRIDEN " +
	" WHERE ROWID = :SPRIDEN_CURRENT_ROWID AND SPRIDEN_LAST_NAME = :SPRIDEN_CURRENT_SPRIDEN_LAST_NAME AND ((SPRIDEN_FIRST_NAME = :SPRIDEN_CURRENT_SPRIDEN_FIRST_NAME AND :SPRIDEN_CURRENT_SPRIDEN_FIRST_NAME IS NOT NULL) OR (:SPRIDEN_CURRENT_SPRIDEN_FIRST_NAME IS NULL AND :SPRIDEN_CURRENT_SPRIDEN_ENTITY_IND = 'C')) AND SPRIDEN_ID = :SPRIDEN_CURRENT_SPRIDEN_ID ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				if ( spridenCurrentElement.getSpridenPidm().isNull() && (!spridenCurrentElement.getPersLastName().isNull() || !spridenCurrentElement.getNonPersName().isNull()) )
				{
					return  toStr("NEW");
				}
				else if ( spridenCurrentElement.getSpridenPidm().isNull() && spridenCurrentElement.getPersLastName().isNull() && spridenCurrentElement.getNonPersName().isNull() ) {
					return  toStr("CREATE");
				}
				else {
					//Setting query parameters
					ptiCursor.addParameter("SPRIDEN_CURRENT_ROWID", spridenCurrentElement.getROWID());
					ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_LAST_NAME", spridenCurrentElement.getSpridenLastName());
					ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_FIRST_NAME", spridenCurrentElement.getSpridenFirstName());
					ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_ENTITY_IND", spridenCurrentElement.getSpridenEntityInd());
					ptiCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_ID", spridenCurrentElement.getSpridenId());
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if ( ptiCursorResults != null ) {
						ptiIntoTemp = ptiCursorResults.getStr(0);
					}
					if ( ptiCursor.notFound() )
					{
						ptiCursor.close();
						return  toStr("CHANGE");
					}
					else {
						ptiCursor.close();
						if ( spridenCurrentElement.getChangeSpbpers().equals("Y") )
						{
							return  toStr("CHANGE");
						}
					}
					return  toStr("NONE");
				}
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit F_IS_PHONE_CHANGE
	
	FUNCTION F_IS_PHONE_CHANGE RETURN VARCHAR2 IS
BEGIN
  IF :SPRADDR.CHANGE_PHONE = 'Y' THEN
  	RETURN 'Y';
  ELSE 
  	RETURN 'N';
  END IF;
END;
	*/
	//ID:2507
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString fIsPhoneChange(SpraddrAdapter spraddrElement)
		{
			if ( spraddrElement.getChangePhone().equals("Y") )
			{
				return  toStr("Y");
			}
			else {
				return  toStr("N");
			}
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
	//ID:2508
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_I18N
	
	PROCEDURE AUDIT_TRAIL_8_0_I18N IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 I18N 
1. Michael Hitrik  06/26/2007
   This form has been modified to increase the bio-demographics fields 
   to support internationalization requirements. 
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS Property Class to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:2509
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_SDE
	
	PROCEDURE AUDIT_TRAIL_8_0_SDE IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 SDE 
1. Michael Hitrik  06/26/2007
   This form has been modified to change W-N-R-I Execution Hierarchy to AFTER 
   to support SDE requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:2510
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80Sde()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment>

AUDIT TRAIL: 8.0
1.  TGK 10/29/2007
    Modify SPRIDEN_CURRENT.PERS_SSN.WHEN-VALIDATE-ITEM select to have nvl on :SPRIDEN_CURRENT.SPRIDEN_PIDM
    for proper evaluation when inserting row.  Warning for duplicate SSN was not being dislpayed on
    an insert because :SPRIDEN_CURRENT.SPRIDEN_PIDM is null.    (1-182SEM)
2.  TGK 10/29/2007
    Modify block SPRTELE to support the COUNT_QUERY built in.  Was perfroming Invalid_Fct_msg.
    Modify SPRTELE_TELE_CODE KEY-CQRY to not call address form.   (CMS-DFCT82650)
3.  TGK 10/29/2007
    TabSecurity:
    Modify form-level KEY_PREVBLOCK_TRG to NOT look to navigate to the SPREMRG block if in the SPRIDEN_CURRENT.
    Modify form-level KEY_NEXTBLOCK_TRG to NOT look to navigate to the SPRIDEN_CURRENT block if in the SPREMRG.
    Modify SPRADDR.SHOW_PHONES and SPREMGR.CALL_PHONE_FORM in 2 places checking for users access to Telephone_tab.
4.  TGK 10/29/2007
    SSN ID Lookup:
    Modify SPRIDEN_CURRENT.SPRIDEN_ID.POST-CHANGE. If SSN Searching is enabled (GUBINST_SSN_SEARCH_ENABLED_IND = 'Y'),
    check if the changed id number is an SSN/SIN/TIN of another entity.  If it is, an error message is thrown.
5.  TGK 11/20/2007
    Modify SPREMRG_MI to be Mixed case.  Was erroneously only allowing UPPER to be entered.
6.  TGK 12/19/2007
    Modify SPRADDR.FAX_AREA, SPRADDR.FAX_PHONE, SPRADDR.FAX_EXT, SPRADDR.HOLD_FAX_AREA, SPRADDR.HOLD_FAX_PHONE and
    SPRADDR.HOLD_FAX_EXT max length to I18N increased values.
7.	George Shalovka  11 March 2008 
		Tracking:	1-2WLKBE
		Problem:	The SPATELE form should allow a "Count Query Hits" function while in query mode.
		Solution:	Modify trigger property Functional.Fire in Enter-Query Mode from "No" to "Yes".
8.	George Shalovka  26 March 2008 
		Tracking:	1-3I8TNH
		Problem:	Cannot delete an additional ID after the GORADID Primary key changes.
		Solution:	Tab Additional ID block GORADID trigger ON-DELETE needed to be updated
							to match the call to GB_ADDITIONAL_IDENT.P_DELETE by adding parameter
		          p_adid_code=>:GORADID.GORADID_ADID_CODE to call list.
		          Additionally, aligned various form items and buttons to standard locations.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2511
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1
	
	PROCEDURE AUDIT_TRAIL_8_1 IS
<multilinecomment>
AUDIT TRAIL: 8.1 
1.Tracking:	1-3IJWTG	George Shalovka  01 April 2008
	Problem:	In tab 'Additional Identification' cannot delete a new row until you roll back and requery
	Solution:	Add Program Unit EXECUTE_QUERY to query current block.
						Modify trigger GORADID.KEY-COMMIT to call Program Unit EXECUTE_QUERY
							to refresh block after COMMIT_FORM.
						Modify trigger GORADID.GORADID_ADID_CODE.WHEN-VALIDATE-ITEM to use API
							call to GTVADID to return 'Additional Identification' description
							instead of local cursor.
						Modify form item GORADID.GORADID_ADID_CODE property palette Data.Maximum Length
							to reduce data entry size from 30 to 4 characters to match the database size.
						Modify trigger GORADID.WHEN-NEW_BLOCK-INSTANCE to uncomment code to initialize
							local variable cmt_result for use in commit processing.
2. 	Tracking:	CMS-DFCT104342	George Shalovka  21 April 2008
		Problem: 	attempt to insert a new address record in SPAIDEN, 
							double-clicking in the address type feild gives an error 
							message:'FRM-40102: Record must be entered or deleted first'.
    Solution: Add block-level trigger SPRADDR.KEY-CREREC to navigate to 
    					last row before inserting a new row.
3. 	Tracking:	1-3MMJBL	George Shalovka  07 July 2008
		Problem: 	ReKey - Version 8.0 of form has invalid message.
    Solution: Modify trigger GORPRAC.GORPRAC_RACE_CDE.WHEN-VALIDATE-ITEM
    					to remove	call to G$_NLS since message returned thru API 
    					function since error message has already been passed thru 
    					utility G$_NLS in API.
    NOTE: to find code, search for string "81-3".
4. 	Tracking:	1-39RIWH	George Shalovka  08 July 2008
		Problem: 	Performance may degrade when searching for an ID
							when using the Generate function due to a full table scan.
    Solution: Modify trigger SPRIDEN_CURRENT.SPRIDEN_ID.POST-CHANGE
    					to remove	Outer Join "(+)" between SPRIDEN_PDIM and SPBPERS_PIDM
    					from cursor SSN_CURSOR.
    NOTE: to find code, search for string "81-4".
5. 	Tracking:	1-3PJQZZ	George Shalovka  08 July 2008
		Problem: 	Missing G$_NLS.Get calls in three locations.
    Solution: Messages were already corrected.
    					Ran ReKey utility and replaced library with updated ReKeyed version.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2512
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail81()
		{
		}

	
	/* Original PL/SQL code for Prog Unit EXECUTE_QUERY
	
	-- 81-1 add requery of block
PROCEDURE EXECUTE_QUERY IS
BEGIN
  IF :SYSTEM.BLOCK_STATUS IN ('NEW','QUERY')
  THEN 
    :system.message_level := '5'; 
    EXECUTE_QUERY ;
    :system.message_level := '0'; 
  END IF;
END;
	*/
	//ID:2513
	/* <p>
		*  81-1 add requery of block
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void executeQuery()
		{
			if ( (getBlockStatus().equals("NEW") || getBlockStatus().equals("QUERY")) )
			{
				try { 
				MessageServices.setMessageLevel(MessageLevel.NONE);
				TaskServices.executeQuery();
				} finally {
							
				MessageServices.resetMessageLevel();
				}
							
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GOQCLIB
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Thu Apr 09 08:44:19 2009
-- MSGSIGN : #e11f2fba78ab5119
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:2514
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS
<multilinecomment>
AUDIT TRAIL: 8.2
1. Added new database columns to various canvases, blocks, and triggers
   for Internationalization effort.

    * SPRADDR_CTRY_CODE_PHONE, SPRADDR_HOUSE_NUMBER, SPRADDR_STREET_LINE4, LAST_NAME_PREFIX
    * SPRTELE_CTRY_CODE_PHONE
    * SPREMRG_SURNAME_PREFIX, SPREMRG_CTRY_CODE_PHONE, SPREMRG_HOUSE_NUMBER, SPREMRG_STREET_LINE4 
     
2. 1-3JALZV
   Added logic to check for the possibility that an item was masked before enabling the item or
   going to the item by calling G$_MASKS.G$_DID_MASK_RESTRICT for specific columns only.
   
3. 1-49R62P
   LvH 12/12/2008
   Added GO_ADDR_FORM to the G$_EMERGENCY_CONTACT_OBJ object to be automatically included in
   inherited forms.
   Modified KEY-CQUERY of SPREMRG.SPREMRG_ATYP_CODE to position to CTRY_CODE_PHONE if needed

4. 1-1FU3H7
   EM 12/30/2008
   Updated POST-CHANGE trigger of SPRADDR_ATYP_CODE item of SPRADDR data block to properly
   update :SPRADDR.TELE_DESCRIPTION if :SPRADDR.TELE_CODE IS NOT NULL.
   
5. 1-4MS7U7
   LvH 02/06/2009
   Updated KEY-NEXT-ITEM triggers for SPREMRG_RELT_CODE, SPREMRG_ATYPE_CODE and SPREMRG_NATN_CODE to prevent
   values from blanking out when tabbing past the fields.
       
6. VETS-100/100A 2009                                  
   Lan Nguyen 04/08/2009       
   Added SPBPERS_ARMED_SERV_MED_VET_IND.
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2515
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3
	
	PROCEDURE AUDIT_TRAIL_8_3 IS
<multilinecomment>
AUDIT TRAIL: 8.3
1. Defect 1-4UKBR1 
   EM 09/04/2009
   On attempting to insert a new address record in SPAIDEN, double-clicking in the address 
   type field gives error message: 'FRM-40102: Record must be entered or deleted first'.
     a. Removed the KEY-CREREC trigger from SPRADDR block in goqclib.fmb 
     b. Added SET_FORM_PROPERTY statements to SPRADDR.SPRADDR_ATYP_CODE.G$_SEARCH_OPTIONS 
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2516
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail83()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3_0_5
	
	PROCEDURE AUDIT_TRAIL_8_3_0_5 IS
<multilinecomment>
AUDIT TRAIL: 8.3.0.5
1. Defect 1-9FP38N  
   PM 04/23/2010
   Multiple changes to name or ID (without rollback in between) results in FRM-40654 
     a. Updated SPRIDEN_CURRENT.ON-UPDATE and SPRIDEN_PREVIOUS.ON-UPDATE to include 
           p_ORIGIN => :SPRIDEN_CURRENT.SPRIDEN_ORIGIN,
        in the call to GB_IDENTIFICATION.P_UPDATE.
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2517
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail8305()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3_1
	
	PROCEDURE AUDIT_TRAIL_8_3_1 IS
<multilinecomment>
AUDIT TRAIL: 8.3.1
1. RPE 1-86YX6G
   LVH 07/24/2010
   Modified the sort for GOREMAL so that the records are listed in descending date order in 
   addition to the preferrred, status, and email code.
   The forms that will need to be recompiled to pick up the changes are: 
     APAIDEN, FOAIDEN, GOAEMAL, PPAIDEN, SPAIDEN
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2518
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail831()
		{
		}

	
	

}
