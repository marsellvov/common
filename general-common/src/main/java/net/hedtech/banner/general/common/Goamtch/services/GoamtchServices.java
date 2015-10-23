package net.hedtech.banner.general.common.Goamtch.services;

import java.util.*;

import org.eclipse.jdt.internal.compiler.lookup.BlockScope;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.flavors.forms.appsupportlib.runtime.FormsMessageLevel;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
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
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lists.ListDataDescriptor;
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
import net.hedtech.banner.general.common.Goamtch.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.general.common.Goamtch.controller.GoamtchFormController;
import net.hedtech.banner.general.common.Goamtch.model.*;



public class GoamtchServices extends AbstractSupportCodeObject{
	
	
	public GoamtchServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GoamtchTask  getTask() {
		return (GoamtchTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Goamtch.model.GoamtchModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit CM_UPDATE_EXISTING_ID
	
	PROCEDURE CM_UPDATE_EXISTING_ID IS
  lv_addr_seqno  SPRADDR.SPRADDR_SEQNO%TYPE;
  lv_atyp_code   SPRADDR.SPRADDR_ATYP_CODE%TYPE;
  lv_block_name  VARCHAR2(30) := :SYSTEM.CURSOR_BLOCK;
  lv_id          SPRIDEN.SPRIDEN_ID%TYPE;
  lv_pidm        SPRIDEN.SPRIDEN_PIDM%TYPE;
  lv_status_msg  VARCHAR2(2000);
--
BEGIN
  lv_id   := NAME_IN(lv_block_name || '.MATCH_ID');
-- 73-1
  IF lv_block_name = 'GOVCMID' THEN
    lv_pidm := NAME_IN(lv_block_name || '.GOVCMID_PIDM');
  ELSE
  	lv_pidm := NAME_IN(lv_block_name || '.GOVCMRT_PIDM');
  END IF;
--
-- Call the routines to do the individual updates/creates.
--
  lv_status_msg := F_CM_UPDATE_BIO(lv_pidm);
  lv_status_msg := lv_status_msg || F_CM_UPDATE_ADDRESS(lv_pidm, lv_atyp_code, lv_addr_seqno);
  lv_status_msg := lv_status_msg || F_CM_UPDATE_TELEPHONE(lv_pidm, lv_atyp_code, lv_addr_seqno);
  lv_status_msg := lv_status_msg || F_CM_UPDATE_EMAIL(lv_pidm);
  lv_status_msg := lv_status_msg || F_CM_UPDATE_ADDID(lv_pidm);
--
  GB_COMMON.P_COMMIT;
--
-- Notify user of the status of the changes being done by the update id button.
--
  MESSAGE(lv_status_msg,ACKNOWLEDGE);
  MESSAGE('');
--
  :GLOBAL.ID := lv_id;
  :GLOBAL.KEY_IDNO := lv_id;
  :GLOBAL.KEY_PIDM := lv_pidm;
  :FORM_HEADER.SKIP_SAVE := 'Y';
--
EXCEPTION
  WHEN OTHERS THEN
    GB_COMMON.P_ROLLBACK;
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END;
	*/
	//ID:1797
	/* <p>
/* </p>
		*/
		public void cmUpdateExistingId(GotcmmeAdapter gotcmmeElement)
		{
			NNumber lvAddrSeqno= NNumber.getNull();
			NString lvAtypCode= NString.getNull();
			NString lvBlockName = getCursorBlock();
			NString lvId= NString.getNull();
			NNumber lvPidm= NNumber.getNull();
			NString lvStatusMsg= NString.getNull();
			Ref<NString> pAtypCodeOut_ref = new Ref<NString>(gotcmmeElement.getGotcmmeAtypCode());

			Ref<NNumber> pAddrSeqnoOut_ref =  new Ref<NNumber>(lvAddrSeqno);

			try
			{
				lvId = getNameIn(lvBlockName.append(".MATCH_ID"));
				//  73-1
				if ( lvBlockName.equals("GOVCMID") )
				{
					lvPidm = toNumber(getNameIn(lvBlockName.append(".GOVCMID_PIDM")));
				}
				else {
					lvPidm = toNumber(getNameIn(lvBlockName.append(".GOVCMRT_PIDM")));
				}
				// 
				//  Call the routines to do the individual updates/creates.
				// 
				lvStatusMsg = fCmUpdateBio(gotcmmeElement, lvPidm);
				lvStatusMsg = lvStatusMsg.append(fCmUpdateAddress(gotcmmeElement, lvPidm, pAtypCodeOut_ref, pAddrSeqnoOut_ref));
				lvStatusMsg = lvStatusMsg.append(fCmUpdateTelephone(gotcmmeElement, lvPidm, lvAtypCode, lvAddrSeqno));
				lvStatusMsg = lvStatusMsg.append(fCmUpdateEmail(gotcmmeElement, lvPidm));
				lvStatusMsg = lvStatusMsg.append(fCmUpdateAddid(gotcmmeElement, lvPidm));
				// 
				GbCommon.pCommit();
				// 
				//  Notify user of the status of the changes being done by the update id button.
				// 
				message(lvStatusMsg, OutputMessageUserResponse.ACKNOWLEDGE);
//				message("");
				// 
				setGlobal("ID", lvId);
				setGlobal("KEY_IDNO", lvId);
				setGlobal("KEY_PIDM", toStr(lvPidm));
				getFormModel().getFormHeader().setSkipSave(toStr("Y"));
			}
			catch(Exception  e)
			{
				GbCommon.pRollback();
				getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment> 
AUDIT TRAIL: 7.0
1.  SJQ  11/24/2003 
    Implement modifications to the form to remove the GOREMAL block and reference in a common
    version of this block from GOQOLIB. 
2.  SJQ  07/21/2004
    Modify the email items to increase size to match maximumn on the goremal table.  Add logic
    to the query of the GOTCMME record to populate the last_item displayed item.  Modify the 
    query logic of the suspense records.  Modify the navigation logic to clear the detail 
    records if the user navigates back into the data entry block.  Modify the query logic of
    the data entry block to populate the last_name item if a record is found.  Modify the
    query logic to hide the error message that no records are found and display the auto hint.
3.  SJQ 07/23/2004
    Modify the query logic of the GOTCMME block to default the values from the key block only
    after querying the block and finding no records.  Reorder the buttons on the GOTCMME
    block.
4.  SJQ 07/26/2004
    Modify the query logic of the data entry block to correctly display the last name.
    Add a conditional generate id button to the key block.  This button will only show if
    the form is called from the menu.  Modified the logic for when a zip code is returned
    to have the state properly display the description.  Remove 'form' from title of window.
5.  SJQ 07/27/2004
    Update the logic for the display of the generate button to review the list of valid
    forms which automatically call it and hide the button if being called from one of these
    forms.  Modify the logic in the data entry block to disable the middle initial if the
    non person item is used.  Add logic to validate the individual date items and logic
    to validate the entire date if all three are entered.  Make the address list in the match
    and potential match blocks navigable.  Add auto hint to the address list, priority and 
    match results items.  Modify the nation code to call the correct list of values.  The
    default call to G$_SEARCH_PARAMETERS was not correct.  Modify the zip code logic to not
    replace the other fields when validation occurs if the other items are already populated.
    Modify the start up logic to disable the source code item in the key block if the user
    is not allowed to change it based on settings on the GOBCMUS table.  Modify the global 
    copy routine to obtain the user's default source code and use that value, overriding what
    was in the global.  Add logic so that the key block ID can't be changed if being called
    from another form which is passing in a ID.
6.  SJQ 07/28/2004
    Update the auto hint for the items not used as part of the search.  Update the birthday
    label to birth date.  Add logic to the exit of the form to clear the id global if the pidm
    global is null.  Remove messages during create and update operations.  Complete the
    address logic in the update routine to inactivate an existing active record if one 
    exists for the address type being created.
7.  SJQ 07/29/2004
    Modify the logic for the details button.  The java address was not updated to match the
    new location.  The implementation was also not correctly creating new instances of the
    hyperlink.
8.  SJQ 07/30/2004
    Completely rewrite the update and create logic.  The rules for address on an update were
    to check for an existing active address and if found, first make it inactive and then
    create the new address.  The telephone was created to use the address and sequence number
    of the address created if one was created.  The telephone is only created if the it is
    unique.  The email update/create logic was also updated to only create the record if it is
    unique.  Add a message after the create and update to notify the user what was done.
9.  SJQ 08/02/2004
    Modify the logic which was disabling the source code item in the key block to also disable
    the list of values button for the source code.
10. SJQ 08/03/2004
    Add missing visual attribute to the gender item on the match tab.  Modify the logic in the
    DO_MATCHING_LOGIC to populate a form item with the returned pidm when a match has been
    found.  Modify the block properties of the match and suspense blocks to use this form item
    in the where clauses.  Removed some of the unused columns from the match and suspense 
    blocks.  Update the wording on the birthdate items.  Add labels to each birthdate item.
    Update the autohint on the items used only for updating or creating.  Update the logic
    which was enabling and disabling the key block items to include the generate button.
    Update the query logic in the suspense block to hide the "last record query" message.
    Updated enable and disable button logic to use form field to test which form called this
    form.  It was incorrectly using a global.  Updated the KEY-EXIT to make sure it executed
    the KEY_EXIT_TRG which is clearing the globals if no record is selected.  Modify the query
    logic in the match and suspense blocks to format the name differently if the record is
    for a company.  Add logic to support key stroke navigation from the match block and 
    suspense block.
11. SJQ 08/04/2004
    Modify the common matching logic to ensure that at least one of the tabs is enabled before
    disabling another.  Change the prompts on the buttons to be on the left instead of on the
    right.  Modify the prompt on the zip code item to make it all upper case.
12. SJQ 08/05/2004
    Modify the global_copy to create the global.cm_source_code in case it doesn't already 
    exist.  Add the function keys for the buttons to the match block.  Modify the detail block
    to limit it to only 6 records.  Move the label for the clear block button to the left.  Add
    additional information to display the generated id in the create status message if the user 
    is using the generate id option.
13. SJQ 08/09/2004
    Add logic to the telephone create so that when creating the telephone record after 
    creating the ID and address records, the primary indicator should be 'Y' while it is 
    set to NULL on other record creates.  Modify the match and suspense blocks to not allow
    the user to make any changes to the values displayed.  Changed the update and insert 
    attributes on the items to 'no'.  Fixed a problem with the telephone create which was
    incorrectly set the primary indicator to 'N' instead of NULL.
14. SJQ 08/12/2004
    Add logic to the KEY-EXIT trigger to not attempt to clean up the temporary records if
    the key block items are still enabled.  This would be the case if the exit function is
    invoked while in the key block or the navigation block.  Increase size of the detail 
    window so that the exit 'X' is more noticable.  Change the "update matched" function key
    to a different one since the "enter query" function key was too common.  Add logic to the 
    address create routine to default the current date for the from_date column if the use 
    finance rules global is not set equal to 'Y'.  Add the clear block buttons to the list of 
    buttons to be disabled if being called by the RCRSUSP form.  Make the date item of type 
    number and add a leading zero format mask to the day and month.  Add logic to the matching 
    logic so that if no matches are found, and the calling for is RCRSUSP, display a new 
    message, "No matches were found, exiting." and once the user acknowledges, exit the form.
    Add additional logic to the global copy routine so that if the form is being called by
    RCRSUSP that the global source code should always be used and not the user's default.
15. SJQ 08/13/2004
    Add additional logic to the global copy routine so that if the form is being called by
    RCRSUSP that the source code can not be changed.  Modify the logic of the clear block 
    key triggers in the match and suspense blocks to only function if the clear block buttons
    are enabled.  Update the navigation logic during the matching process for cases when the
    status is (N)ew and more than one record exists.  Correct the disabling of the suspense
    tab logic.
16. SJQ 08/16/2004
    Update the birth date logic.  It was incorrectly formatting the entire date from the 
    individual items.  Add logic to the validation of the source code to ensure that rules
    exist for the source code.  If not, raise an error.  This will eliminate the case where
    the user does the data entry and then getting the error by the API.
17. SJQ 08/17/2004
    Add logic to the birth year item to add the century if none is entered.
18. SJQ 08/19/2004
    Change the day and month items back to character type but add logic to format each of
    them with a leading zero.  Modify the where clause for the match block to include the
    result indicator = 'M' to ensure the correct record is queried.
19. SJQ 08/20/2004
    Update the load_form_header to test for three additional forms.  Added form level switches
    to determine whether the user is allowed to do UPDATES/CREATES and/or clearing various
    blocks and records.  Modify the global_copy trigger to enable or disable the source code
    item based on whether the user is allowed to do clear form, block, record, etc.  Update
    various triggers to evaluate these settings.
20. SJQ 08/26/2004
    Update the query logic for the match and suspense blocks to fetch the first, middle and 
    last names and then call the G$_BUILD_FULL_NAME routine to format it.  Implement the 
    masking logic for the match and suspense blocks.  Add logic to the "select" function to
    call the FGAC package for temporary access to the pidm.  Change the sort on the match
    block to be in descending order of the GOTCMRT_CMSR_PRIORITY_NO.  Add logic to the match
    block to append an asterisk to the name/id if they are used as part of the actually match
    and they are name/id changed records.  This is dependent upon the GOTCMRT_SPRIDEN_ID_ROWID
    and GOTCMRT_SPRIDEN_NAME_ROWID being populated.
21. SJQ 08/29/2004
    Add logic to verify if there are any detail options defined for the source code entered 
    and enable/disable the detail button respectively.  Modify the logic added for previous 
    name match in the match block for a misspelled cursor which was causing an ORA-01001.
22. SJQ 08/30/2004
    Add missing G$_NLS function to messages.
23. SJQ 08/31/2004
    Add logic at form start up to disable the 'select' functions (menu and icon).
24. SJQ 09/09/2004
    Enlarge the telephone and email type code items.  Modify the global copy logic to not 
    disable the source code item if being called by any of the special student load forms.
    Modify the ID validation logic in the key block to be skipped if called by RCRSUSP.
25. SJQ 09/21/2004
    Add additional comments to the id and name items in the match and suspense block to say that
    an asterik in the field means that an id or name change is being displayed.  Add logic to
    the suspense block to check for name/id changes.
26. SJQ 09/23/2004
    Update the create and update logic so that if the calling form is the main menu, don't 
    exit the form but rather, after completing the DML, clear the form and return to the key
    block.  Corrected the logic in the suspense block which was attempting to retrieve the
    appropriate name.  Modify the form start up logic to check if being called from one of 
    three "special" student forms and allow the source code in the key block to be modified
    and yet still protect the data in the data entry block.
27. SJQ 09/29/2004
    Update the validation of the source code to also retrieve the entity code so that selective
    items in the data entry block can be disabled.  Correct the error message for a missing
    ID when attempting to leave the key block in the CHECK_KEYS trigger.
28. SJQ 10/04/2004
    Update the common matching logic which calls the database procedure and determines counts to
    change the logic for the matches.  If a match is found, the count for records wasn't doing
    the call to the cursor for the non matches correctly.
29. SJQ 10/07/2004
    Modify the GLOBAL_COPY trigger to disable the source code only if the user is not authorized
    to change it AND they are not exempted.  Additionally, if the user id passed in is 
    "generated", attempt, based on rules to automatically navigate to the source code item in the
    key block.  Update the update and create message to notify you if you are updating/creating
    personal data for a company.
30. SJQ 10/12/2004
    Update the disable and enable logic for the name items.  Use the entity code for the source
    code entered in the key block to determine which ones should be enabled or disabled.  If the
    entity code is for both (person and non-person) then use navigation logic in the block to
    enable and disable items based on which ones have data entered in them.
31. SJQ 10/15/2004
    Remove all logic which had the first name required for processing a person record as part
    of a search but make it required if creating a new or updating an ID record.  Redo the
    match logic and counts logic.
32. SJQ 10/18/2004
    Modify the DO_MATCHING_LOGIC routine to dynamically set the where clause of the partial
    match block based on the status returned by the gokcmpk.p_common_matching procedure.  The
    form queries did not appear to be working correctly.  Modify the when-tab-changed routine to
    be sure to query the partial match block.  Change the order of the clear block and remove
    records in the partial match block.  Remove the unneeded FORMS_DDL commands in the two
    "remove" routines.  Change the GLOBAL_COPY routine which enables/disables the source code
    based on the user's settings returned by the gokcmpk.p_common_matching procedure.  Logic
    was only disabling the source code if the "call_ui" was yes and user was not authorized to
    change the source code.  Changed to ignore the "call_ui" setting and use the user's settings.
33. SJQ 10/20/2004
    Add logic to the DO_MATCHING_LOGIC to display an alert to the user when the status is new
    but partial matches exist.
34. SJQ 10/26/2004
    Update the logic when navigating into the data entry block to navigate to the non-person
    name item if the source code has an entity_cde of 'C'.
35. SJQ 10/27/2004
    Update navigation logic from match or suspense block to navigate to the appropriate name
    items depending on the entity code and values in those items.
36. SJQ 10/28/2004
    Update the CM_CREATE_NEW_ID and CM_UPDATE_EXISTING_ID to increase the size of the local
    variable which holds the status message.  In certain conditions, the length was exceeding
    the previous length and causing the transactions to fail.
37. SJQ 11/04/2004
    Change the gender item to have four values (F,M,N,NULL).  Changed the labels and initial 
    value for the gender item to N.  Update birth day item logic to not use the standard oracle
    to_date function since the DD function implies the current month and year and may make 
    some day numbers invalid.
38. SJQ 11/11/2004
    Modify the disabling/enabling logic for the non-person item when in the first name and 
    middle name.  It was not evaluating the entity code for the source code correctly.
39. SJQ 11/12/2004
    Modify the DETAILS block to remove the use of the java bean for the hyperlink.  Changed to
    make the item a button instead of a java bean and add the new java implementation class.  
    Remove references to the fbean function calls.  Change the trigger from a when-custom to
    a when-button-pressed.
40. SJQ 11/15/2004
    Modify the attributes of the suspense block to increase the query array size and the number 
    of records buffered to be 100.  Since there is no way to know how many records will be 
    returned, increasing the number will improve performance for larger queries and it resolves
    an error condition which was occasionally happening on large queries.  Change the
    PRE-BLOCK triggers for the match and suspense blocks to not execute the CHECK_REQUIRED_ITEMS 
    as this is done as part of the DO_MATCHING_LOGIC and wasn't needed.  Change the 
    CHECK_REQUIRED_ITEMS to do a commit after it was done since it was clearing out various name 
    items depending on the entity code that was calculated and thus put the block into a state 
    where a commit was still pending.  Modify the detail options to call forms in query mode.
41. SJQ 11/30/2004
    Update the name enable/disable logic in the data entry block.  In some cases the enable
    logic was not correctly resetting all of the attributes for navigation purposes.
42. SJQ 12/02/2004
    Remove the KEY-F8 and KEY-F9 triggers which were created only for debugging purposes.
43. Defect 70-0351
    Michael Hitrik 12/08/2004
    Added TRUNC(SYSDATE) on F_CREATE_ADDRESS

AUDIT TRAIL: 7.1
1.  SJQ 01/18/2005
    Update the DO_MATCHING_LOGIC routine to have the count of records for "new" to include
    "match" along with "suspense" records.  Previously, it only included "match".  Update the
    properties on the SSN item to force upper case.
2.  SJQ 02/02/2005
    Update the start up logic to allow the 3 special forms in Student to be able to clear the
    results data block but not the form.
3.  SJQ 02/04/2005
    Change the maximum value of the zip code item to 10.  Update the validation of all of the
    validation codes to use the validation APIs and add logic to handle the situation where the
    code returns a null description (invalid code) and the user mouses out of the item.  This
    will also address the issue where invalid codes are being saved to the database.
4.  SJQ 03/30/2005
    Remove debug messages.

AUDIT TRAIL: 7.2
1.  SJQ 03/22/2005
    Replace all references to the GOTCMRT table with the GOVCMRT view.
2.  SJQ 04/04/2005
    Add sort buttons to the suspense block.  These will support the ability to sort the data on
    either ID or Name in either ascending or descending order.
3.  SJQ 05/09/2005
    Update the clear form triggers in the match and suspense blocks to disable the various
    buttons on the form.  In some cases, some of the buttons were not being disabled correctly.
4.  SJQ 06/08/2005
    Update the suspense block to allow for enter query functionality in the name item.  The key
    used for execute query was updated to perform a query if the form is in query mode, otherwise
    it displays the details window.
5.  SJQ 06/30/2005
    Modify the KEY-NXTSET trigger to perform a SCROLL_DOWN instead of issuing an error message
    to the user.
6.  SJQ 07/27/2005
    Update the suspense block to allow enter query to be performed from any item in the block.
    The only item which is valid to enter query data is the name item.
7.  SJQ 08/02/2005
    Update the name item in the suspense block to allow mixed case searches.
8.  SJQ 08/25/2005
    Update the CM_CREATE_NEW_ID to add in a call to the gb_common.p_commit and change the 
    exception logic to replace the rollback with a call to the gb_common.p_rollback so that
    if messages are created they can be published and/or discarded.  Update the CM_UPDATE_EXISTING_ID
    routine to add in the call to gb_common.p_commit and gb_common.p_rollback for messaging
    support.
9.  SJQ 10/05/2005
    Change the CHECK_CLRFRM procedure to use the GET_APPLICATION_PROPERTY to determine what the
    calling form name is.  Previously the logic was testing the GLOBAL.CALLING_FORM but this 
    value gets changed if the user navigates (F5) to another form.  This was then causing a 
    warning message to be displayed when the user does a clear form.
    
AUDIT TRAIL: 7.3
1.  SJQ 08/29/2005
    Added two triggers (OPTM_MATCH_NAV, OPTM_SUSPENSE_NAV) to support "options" navigation.  The 
    two triggers will support navigation to either of the tab canvases.  Update the 
    F_CM_UPDATE_ADDRESS routine to reset the status of an address to active if the routine had
    just changed it to inactive and then the create of a new address fails.
2.  SJQ 09/16/2005
    Update the GLOBAL_COPY trigger to create the GLOBAL.KEY_PIDM if it doesn't exist.  This is 
    created initially in the GUAINIT form but only if Advancement is installed.
3.  SJQ 10/12/2005
    Update the maximum length of the GOVCMRT.MATCH_CITY_STATE_ZIP item to 36 to handle the
    formatting of the data with each of the items having a maximum length for each.
4.  SJQ 10/24/2005
    Update the attributes of the GOTCMME_SEX item to change the default value to NULL instead of
    "unknown".  Change the "mapping of other values" to NULL instead of "unknown".  If entering a
    non-person, the "unknown" value was making it appear as if the SPBPERS record had values and
    thus caused the creation of a record on the table.  Changed the canvas value to NULL for a
    number of hidden items.
5.  GShalovka  08 December 2005
    Reorganize data display on canvases.
    Add 'Matching Source Comment' in Key Block and 'Data Entry' block.
    Modify block GOVCMRT_MATCH to display pull-down type items for Address, Telephone and E-mail.
    Add new view and block to display one row per ID: GOVCMID.
6.  SJQ 05/03/2006
    Add WHEN-MOUSE-DOUBLECLICK triggers to each of the sort buttons.  These new triggers override
    the referenced trigger and executes a NULL command.  Add logic to the CHECK_BTN to enable
    the view source comments button.  Update the DISABLE_LOCAL_BTNS trigger to disable the
    button to view the source comments when in the data entry block.  Update the CHECK_REQUIRED_ITEMS
    procedure to remove the COMMIT.  This commit is not needed since the DO_MATCHING_LOGIC has
    a COMMIT which is executed after calling the CHECK_REQUIRED_ITEMS procedure.  Add logic to
    the DO_MATCHING_LOGIC to test if the detail blocks have already been queried, and if so, exit
    out of the routine.  Re-inherit the subclassing on several of the form level triggers.

AUDIT TRAIL END
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1798
	/* <p>
/* </p>
		*/
		public void auditTrail70()
		{
		}

	
	/* Original PL/SQL code for Prog Unit REMOVE_CMME_RECORDS
	
	PROCEDURE REMOVE_CMME_RECORDS IS
BEGIN
  :SYSTEM.MESSAGE_LEVEL := '5';
	DELETE FROM GOTCMME;
  :SYSTEM.MESSAGE_LEVEL := '0';
END;
	*/
	//ID:1799
	/* <p>
/* </p>
		*/
		public void removeCmmeRecords()
		{
			int rowCount = 0;
			try { 
			MessageServices.setMessageLevel(MessageLevel.NONE);
			String sql1 = "DELETE FROM GOTCMME ";
			DataCommand command1 = new DataCommand(sql1);
			rowCount = command1.execute();
			} finally {
						
			MessageServices.resetMessageLevel();
			}
						
		}

	
	/* Original PL/SQL code for Prog Unit REMOVE_CMRT_RECORDS
	
	PROCEDURE REMOVE_CMRT_RECORDS IS
BEGIN
  :SYSTEM.MESSAGE_LEVEL := '5';
	DELETE FROM GOVCMRT;
  :SYSTEM.MESSAGE_LEVEL := '0';
END;
	*/
	//ID:1800
	/* <p>
/* </p>
		*/
		public void removeCmrtRecords()
		{
			int rowCount = 0;
			try { 
			MessageServices.setMessageLevel(MessageLevel.NONE);
			String sql1 = "DELETE FROM GOVCMRT ";
			DataCommand command1 = new DataCommand(sql1);
			rowCount = command1.execute();
			} finally {
						
			MessageServices.resetMessageLevel();
			}
						
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_REQUIRED_ITEMS
	
	PROCEDURE CHECK_REQUIRED_ITEMS IS
  lv_date         DATE;
  lv_skip_err_msg VARCHAR2(1) := 'Y';
  lv_email        VARCHAR2(1);
  lv_phone        VARCHAR2(1);
  lv_ssn   VARCHAR2(1);
  CURSOR email_c IS
    SELECT 'Y'
      FROM gtvsdax
     WHERE gtvsdax_internal_code_group = 'CM_SOURCE_CODE'
       AND gtvsdax_internal_code       = 'EMAIL_PRIM'
       AND gtvsdax_external_code       = :KEY_BLOCK.KEYBLOCK_SOURCE_CODE;
  CURSOR phone_c IS
    SELECT 'Y'
      FROM gtvsdax
     WHERE gtvsdax_internal_code_group = 'CM_SOURCE_CODE'
       AND gtvsdax_internal_code       = 'PHONE_PRIM'
       AND gtvsdax_external_code       = :KEY_BLOCK.KEYBLOCK_SOURCE_CODE;
   CURSOR ssn_c IS
     SELECT 'Y'
      FROM gtvsdax
     WHERE gtvsdax_internal_code_group = 'CM_SOURCE_CODE'
       AND gtvsdax_internal_code       = 'SSN_PRIM'
       AND gtvsdax_external_code       = :KEY_BLOCK.KEYBLOCK_SOURCE_CODE;    
BEGIN
  OPEN email_c;
  FETCH email_c into lv_email;
  CLOSE email_c;
--  
  OPEN phone_c;
  FETCH phone_c into lv_phone;
  CLOSE phone_c;
--  
  OPEN ssn_c;
  FETCH ssn_c into lv_ssn;
  CLOSE ssn_c;
--
  IF NVL(lv_email,'N') = 'N'         AND
  	 NVL(lv_phone,'N') = 'N'         AND
  	 :GOTCMME.NONPERSON_NAME IS NULL AND
     :GOTCMME.LAST_NAME      IS NULL AND
     :GOTCMME.GOTCMME_SSN    IS NULL THEN
       MESSAGE(G$_NLS.Get('GOAMTCH-0068','FORM','*ERROR* Last Name, Non-Person Name, OR SSN/SIN/TIN is required.'));
	     RAISE FORM_TRIGGER_FAILURE;
	END IF;
--
  IF NVL(lv_email,'N') = 'Y'                AND
     :GOTCMME.GOTCMME_EMAIL_ADDRESS IS NULL THEN
       MESSAGE(G$_NLS.Get('GOAMTCH-0069','FORM','*ERROR* E-mail is required when using e-mail as a primary match.'));
	     RAISE FORM_TRIGGER_FAILURE;
	END IF;
--
  IF NVL(lv_phone,'N') = 'Y'               AND
     :GOTCMME.GOTCMME_PHONE_AREA   IS NULL AND
     :GOTCMME.GOTCMME_PHONE_NUMBER IS NULL THEN
       MESSAGE(G$_NLS.Get('GOAMTCH-0070','FORM','*ERROR* Telephone area code or telephone number is required when using telephone as a primary match.'));
	     RAISE FORM_TRIGGER_FAILURE;
	END IF;
--
--
  IF NVL(lv_ssn,'N') = 'Y'               AND
     :GOTCMME.GOTCMME_SSN IS NULL THEN
        MESSAGE(G$_NLS.Get('GOAMTCH-0071','FORM','*ERROR* SSN/SIN/TIN is required when used as a primary match.'));
        RAISE FORM_TRIGGER_FAILURE;
     END IF;
--
  IF :GOTCMME.NONPERSON_NAME IS NOT NULL THEN
      :GOTCMME.GOTCMME_ENTITY_CDE := 'C';
      :GOTCMME.GOTCMME_LAST_NAME  := :GOTCMME.NONPERSON_NAME;
      :GOTCMME.GOTCMME_FIRST_NAME := ''; 	
      :GOTCMME.GOTCMME_MI         := ''; 	
      :GOTCMME.LAST_NAME          := ''; 	
  ELSIF :GOTCMME.LAST_NAME IS NOT NULL THEN
	    :GOTCMME.GOTCMME_ENTITY_CDE := 'P';
      :GOTCMME.GOTCMME_LAST_NAME  := :GOTCMME.LAST_NAME;
      :GOTCMME.NONPERSON_NAME     := '';
  ELSE
	    :GOTCMME.GOTCMME_ENTITY_CDE := 'B';
      :GOTCMME.NONPERSON_NAME     := '';
      :GOTCMME.LAST_NAME          := '';
  END IF;
--
  VALIDATE(BLOCK_SCOPE);
  IF NOT FORM_SUCCESS THEN
    :SYSTEM.MESSAGE_LEVEL := '0';
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  IF :GOTCMME.GOTCMME_BIRTH_DAY IS NOT NULL AND
     :GOTCMME.GOTCMME_BIRTH_MON IS NOT NULL AND
     :GOTCMME.GOTCMME_BIRTH_YEAR IS NOT NULL THEN
    lv_skip_err_msg := 'N';
--
    lv_date := TO_DATE(:GOTCMME.GOTCMME_BIRTH_DAY
                    || :GOTCMME.GOTCMME_BIRTH_MON
                    || :GOTCMME.GOTCMME_BIRTH_YEAR, 'DDMMYYYY');
  END IF;
--
 <multilinecomment>IF :GOTCMME.GOTCMME_ADID_CODE IS NULL AND :GOTCMME.GOTCMME_ADDITIONAL_ID IS NOT NULL THEN
 	 MESSAGE(G$_NLS.Get('X','FORM','*ERROR* Additional ID is required when type is enetered.'));
 	 GO_ITEM('GOTCMME.GOTCMME_ADDITIONAL_ID');
   RAISE FORM_TRIGGER_FAILURE;
 ELSIF  :GOTCMME.GOTCMME_ADID_CODE IS NOT NULL AND :GOTCMME.GOTCMME_ADDITIONAL_ID IS  NULL THEN
 	 MESSAGE(G$_NLS.Get('X','FORM','*ERROR* Additional ID Type is required when Additional ID is enetered.'));
 	 GO_ITEM('GOTCMME.GOTCMME_ADID_CODE');
   RAISE FORM_TRIGGER_FAILURE;
 END IF;</multilinecomment>

EXCEPTION
  WHEN OTHERS THEN
    IF lv_skip_err_msg = 'N' THEN
      MESSAGE(G$_NLS.GET('GOAMTCH-0072','FORM','*ERROR* Invalid birth date entered.'));
    END IF;
    RAISE FORM_TRIGGER_FAILURE;
END;
	*/
	//ID:1801
	/* <p>
/* </p>
		*/
		public void checkRequiredItems(GotcmmeAdapter gotcmmeElement)
		{
			int rowCount = 0;
			NDate lvDate= NDate.getNull();
			NString lvSkipErrMsg = toStr("Y");
			NString lvEmail= NString.getNull();
			NString lvPhone= NString.getNull();
			NString lvSsn= NString.getNull();
			String sqlemailC = "SELECT 'Y' " +
	" FROM gtvsdax " +
	" WHERE gtvsdax_internal_code_group = 'CM_SOURCE_CODE' AND gtvsdax_internal_code = 'EMAIL_PRIM' AND gtvsdax_external_code = :KEY_BLOCK_KEYBLOCK_SOURCE_CODE ";
			DataCursor emailC = new DataCursor(sqlemailC);
			String sqlphoneC = "SELECT 'Y' " +
	" FROM gtvsdax " +
	" WHERE gtvsdax_internal_code_group = 'CM_SOURCE_CODE' AND gtvsdax_internal_code = 'PHONE_PRIM' AND gtvsdax_external_code = :KEY_BLOCK_KEYBLOCK_SOURCE_CODE ";
			DataCursor phoneC = new DataCursor(sqlphoneC);
			String sqlssnC = "SELECT 'Y' " +
	" FROM gtvsdax " +
	" WHERE gtvsdax_internal_code_group = 'CM_SOURCE_CODE' AND gtvsdax_internal_code = 'SSN_PRIM' AND gtvsdax_external_code = :KEY_BLOCK_KEYBLOCK_SOURCE_CODE ";
			DataCursor ssnC = new DataCursor(sqlssnC);
			try {
				try
				{
					//Setting query parameters
					emailC.addParameter("KEY_BLOCK_KEYBLOCK_SOURCE_CODE", getFormModel().getKeyBlock().getKeyblockSourceCode());
					emailC.open();
					ResultSet emailCResults = emailC.fetchInto();
					if ( emailCResults != null ) {
						lvEmail = emailCResults.getStr(0);
					}
					//emailC.close();
					//   
					//Setting query parameters
					phoneC.addParameter("KEY_BLOCK_KEYBLOCK_SOURCE_CODE", getFormModel().getKeyBlock().getKeyblockSourceCode());
					phoneC.open();
					ResultSet phoneCResults = phoneC.fetchInto();
					if ( phoneCResults != null ) {
						lvPhone = phoneCResults.getStr(0);
					}
					//phoneC.close();
					//   
					//Setting query parameters
					ssnC.addParameter("KEY_BLOCK_KEYBLOCK_SOURCE_CODE", getFormModel().getKeyBlock().getKeyblockSourceCode());
					ssnC.open();
					ResultSet ssnCResults = ssnC.fetchInto();
					if ( ssnCResults != null ) {
						lvSsn = ssnCResults.getStr(0);
					}
					//ssnC.close();
					// 
					if ( isNull(lvEmail, "N").equals("N") && isNull(lvPhone, "N").equals("N") && gotcmmeElement.getNonpersonName().isNull() && gotcmmeElement.getLastName().isNull() && gotcmmeElement.getGotcmmeSsn().isNull() )
					{
						errorMessage(GNls.Fget(toStr("GOAMTCH-0068"), toStr("FORM"), toStr("*ERROR* Last Name, Non-Person Name, OR SSN/SIN/TIN is required.")));
						throw new ApplicationException();
					}
					// 
					if ( isNull(lvEmail, "N").equals("Y") && gotcmmeElement.getGotcmmeEmailAddress().isNull() )
					{
						errorMessage(GNls.Fget(toStr("GOAMTCH-0069"), toStr("FORM"), toStr("*ERROR* E-mail is required when using e-mail as a primary match.")));
						throw new ApplicationException();
					}
					// 
					if ( isNull(lvPhone, "N").equals("Y") && gotcmmeElement.getGotcmmePhoneArea().isNull() && gotcmmeElement.getGotcmmePhoneNumber().isNull() )
					{
						errorMessage(GNls.Fget(toStr("GOAMTCH-0070"), toStr("FORM"), toStr("*ERROR* Telephone area code or telephone number is required when using telephone as a primary match.")));
						throw new ApplicationException();
					}
					// 
					// 
					if ( isNull(lvSsn, "N").equals("Y") && gotcmmeElement.getGotcmmeSsn().isNull() )
					{
						errorMessage(GNls.Fget(toStr("GOAMTCH-0071"), toStr("FORM"), toStr("*ERROR* SSN/SIN/TIN is required when used as a primary match.")));
						throw new ApplicationException();
					}
					// 
					if ( !gotcmmeElement.getNonpersonName().isNull() )
					{
						gotcmmeElement.setGotcmmeEntityCde(toStr("C"));
						gotcmmeElement.setGotcmmeLastName(gotcmmeElement.getNonpersonName());
						gotcmmeElement.setGotcmmeFirstName(toStr(""));
						gotcmmeElement.setGotcmmeMi(toStr(""));
						gotcmmeElement.setLastName(toStr(""));
					}
					else if ( !gotcmmeElement.getLastName().isNull() ) {
						gotcmmeElement.setGotcmmeEntityCde(toStr("P"));
						gotcmmeElement.setGotcmmeLastName(gotcmmeElement.getLastName());
						gotcmmeElement.setNonpersonName(toStr(""));
					}
					else {
						gotcmmeElement.setGotcmmeEntityCde(toStr("B"));
						gotcmmeElement.setNonpersonName(toStr(""));
						gotcmmeElement.setLastName(toStr(""));
					}
					// 
					//validateTask(SupportClasses.Constants.BLOCK_SCOPE); 
					try {
						validateBlock(getCurrentBlock());
						MessageServices.resetMessageLevel();
						//:SYSTEM.MESSAGE_LEVEL := '0';
					} catch (Exception e) {
						throw new ApplicationException();
					}
					
//				
						MessageServices.resetMessageLevel();
//						
//					}
					// 
					if ( !gotcmmeElement.getGotcmmeBirthDay().isNull() && !gotcmmeElement.getGotcmmeBirthMon().isNull() && !gotcmmeElement.getGotcmmeBirthYear().isNull() )
					{
						lvSkipErrMsg = toStr("N");
						// 
						lvDate = toDate(gotcmmeElement.getGotcmmeBirthDay().append(gotcmmeElement.getGotcmmeBirthMon()).append(gotcmmeElement.getGotcmmeBirthYear()), "DDMMYYYY");
					}
				}
				catch(Exception  e)
				{
					if ( lvSkipErrMsg.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("GOAMTCH-0072"), toStr("FORM"), toStr("*ERROR* Invalid birth date entered.")));
					}
					throw new ApplicationException();
				}
				}finally{
					emailC.close();
					phoneC.close();
					ssnC.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit DO_MATCHING_LOGIC
	
	PROCEDURE DO_MATCHING_LOGIC IS
  lv_match_source    GORCMSR.GORCMSR_CMSC_CODE%TYPE := :KEY_BLOCK.KEYBLOCK_SOURCE_CODE;
  lv_result_cnt      PLS_INTEGER := 0;
  alert_btn          PLS_INTEGER;
--
  CURSOR partial_match_result_cnt IS
    SELECT COUNT(*) 
      FROM GOVCMRT 
     WHERE GOVCMRT_PIDM <> :FORM_HEADER.MATCH_PIDM
       AND GOVCMRT_RESULT_IND IN ('S','M');
--
  CURSOR no_match_cnt IS
    SELECT COUNT(*) 
      FROM GOVCMRT 
     WHERE GOVCMRT_RESULT_IND IN ('S','M');
--
BEGIN
  IF :FORM_HEADER.QUERIED_DETAIL = 'Y' THEN
    RETURN;
  END IF;
--
  :FORM_HEADER.API_FAILURE := 'N';
  :FORM_HEADER.F_CREATE_ADDRESS_ERR := 'N';
  :FORM_HEADER.F_CREATE_BIO_ERR := 'N';
  :FORM_HEADER.F_CREATE_EMAIL_ERR := 'N';
  :FORM_HEADER.F_CREATE_ADDID_ERR := 'N';
  :FORM_HEADER.F_CREATE_TELEPHONE_ERR := 'N';
  :FORM_HEADER.DO_TAB_NAVIGATION := 'N';
--
  CHECK_REQUIRED_ITEMS;
  G$_CHECK_FAILURE;
--
  :FORM_HEADER.MATCH_PIDM := '';
  :SYSTEM.MESSAGE_LEVEL := '5';
  COMMIT_FORM;
  IF NOT FORM_SUCCESS THEN
    :SYSTEM.MESSAGE_LEVEL := '0';
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
  :SYSTEM.MESSAGE_LEVEL := '0';
  :COMMIT_COMPLETED := 'Y';
-- 73-9
-- Set SAVEPOINT for rollback from Create ID processing
--
  ISSUE_SAVEPOINT('DATA_ENTRY');
--
-- Call matching routine.
--
  BEGIN
    gokcmpk.p_common_matching(lv_match_source,:FORM_HEADER.MATCH_STATUS,:FORM_HEADER.MATCH_PIDM);
  EXCEPTION
    WHEN OTHERS THEN
      G$_DISPLAY_ERR_MSG(SQLERRM);
      RAISE FORM_TRIGGER_FAILURE;
  END;
--
-- Match status is NEW
--
  IF :FORM_HEADER.MATCH_STATUS = 'N' THEN
    OPEN no_match_cnt;
    FETCH no_match_cnt INTO lv_result_cnt;
    CLOSE no_match_cnt;
--
-- More than one match or potential match.
--
    IF NVL(lv_result_cnt,0) > 0 THEN
      ENABLE_SUSPENSE_TAB;
      DISABLE_MATCH_TAB;
      NAV_TO_GOVCMID_TAB;                 
--
-- Notify user of status.
--
      alert_btn := G$_DISPLAY_ALERT('G$_INFO_ALERT', G$_NLS.Get('GOAMTCH-0073','FORM',
                     'Match status is ''New'' but potential matches exist from prior rule.'));
    ELSE
--
-- No other match or potential match, ask whether or not to create.
--
      SET_GOVCMID_COUNT('');
--
      IF :FORM_HEADER.ALLOW_UPDATES = 'N' THEN
        alert_btn := G$_DISPLAY_ALERT('G$_INFO_ALERT', G$_NLS.Get('GOAMTCH-0074', 'FORM',
                                      'No matches found, exiting.'));
        CLEAN_UP_AND_EXIT;
      ELSE
        alert_btn := G$_DISPLAY_ALERT('G$_PIPE_MESSAGE_ALERT', G$_NLS.Get('GOAMTCH-0075', 'FORM',
                                      'No matches found, create as new?'));
      END IF;
--
      IF alert_btn = ALERT_BUTTON1 THEN
        CHECK_FIRST_NAME;
        G$_CHECK_FAILURE;
-- 73-5
-- basic validtation checks to save API calls
       	EXECUTE_TRIGGER('CM_CREATE_NEW_ID_1');
        G$_CHECK_FAILURE;
-- if basic data entry missing, do not rollback
       	IF :FORM_HEADER.API_FAILURE = 'Y' THEN
          RETURN;
        END IF;
-- attempt create using API calls
        EXECUTE_TRIGGER('CM_CREATE_NEW_ID_2');
        G$_CHECK_FAILURE;
-- if no API errors, after acknowledge, rollback 
        IF :FORM_HEADER.API_FAILURE = 'Y' AND
          :KEY_BLOCK.KEYBLOCK_API_FAILURE_IND = 'Y' THEN
          RETURN;
       	ELSE
          CLEAN_UP_AND_EXIT;
        END IF;
--
      END IF;
    END IF;
--
-- Match status is SUSPENSE
--
  ELSIF :FORM_HEADER.MATCH_STATUS = 'S' THEN
    OPEN no_match_cnt;
    FETCH no_match_cnt INTO lv_result_cnt;
    CLOSE no_match_cnt;
--
    IF lv_result_cnt > 0 THEN
      ENABLE_SUSPENSE_TAB;
      DISABLE_MATCH_TAB;
      NAV_TO_GOVCMID_TAB;
--
    ELSE
      MESSAGE(G$_NLS.GET('GOAMTCH-0076','FORM','*WARNING* Suspense status returned no records, check source rules.'));
    END IF;
--
-- Match status is MATCHED
--
  ELSE
    OPEN partial_match_result_cnt;
    FETCH partial_match_result_cnt INTO lv_result_cnt;
    CLOSE partial_match_result_cnt;
--
    ENABLE_MATCH_TAB;
--
    IF lv_result_cnt > 0 THEN
      ENABLE_SUSPENSE_TAB;
      SET_GOVCMID_COUNT(lv_result_cnt);
    ELSE
      SET_GOVCMID_COUNT('');
    END IF;
--
    GO_BLOCK('GOVCMRT_MATCH');
    EXECUTE_QUERY;
  END IF;
--
END;
	*/
	//ID:1802
	/* <p>
/* </p>
		*/
		public void doMatchingLogic(GotcmmeAdapter gotcmmeElement)
		{
			int rowCount = 0;
			NString lvMatchSource = getFormModel().getKeyBlock().getKeyblockSourceCode();
			NInteger lvResultCnt = toInt(0);
			NInteger alertBtn= NInteger.getNull();
			String sqlpartialMatchResultCnt = "SELECT COUNT(*) " +
	" FROM GOVCMRT " +
	" WHERE GOVCMRT_PIDM <> :FORM_HEADER_MATCH_PIDM AND (GOVCMRT_RESULT_IND) IN ('S', 'M') ";
			DataCursor partialMatchResultCnt = new DataCursor(sqlpartialMatchResultCnt);
			String sqlnoMatchCnt = "SELECT COUNT(*) " +
	" FROM GOVCMRT " +
	" WHERE (GOVCMRT_RESULT_IND) IN ('S', 'M') ";
			DataCursor noMatchCnt = new DataCursor(sqlnoMatchCnt);
			try {
				if ( getFormModel().getFormHeader().getQueriedDetail().equals("Y") )
				{
					return ;
				}
				// 
				getFormModel().getFormHeader().setApiFailure(toStr("N"));
				getFormModel().getFormHeader().setFCreateAddressErr(toStr("N"));
				getFormModel().getFormHeader().setFCreateBioErr(toStr("N"));
				getFormModel().getFormHeader().setFCreateEmailErr(toStr("N"));
				getFormModel().getFormHeader().setFCreateAddidErr(toStr("N"));
				getFormModel().getFormHeader().setFCreateTelephoneErr(toStr("N"));
				getFormModel().getFormHeader().setDoTabNavigation(toStr("N"));
				// 
				checkRequiredItems(gotcmmeElement);
				getTask().getGoqrpls().gCheckFailure();
				// 
				getFormModel().getFormHeader().setMatchPidm(toNumber(""));
				try { 
//				MessageServices.setMessageLevel(MessageLevel.NONE);
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
//				 :SYSTEM.MESSAGE_LEVEL := '5';
				try{
					commitTask();
				}
				catch(Exception e){
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
					throw new ApplicationException(e.getMessage());
				}
					} finally {
								
					MessageServices.resetMessageLevel();
					}
								
					//throw new ApplicationException();
				//}
				//:SYSTEM.MESSAGE_LEVEL := '0';
				getFormModel().getFormHeader().setCommitCompleted(toStr("Y"));
				//  73-9
				//  Set SAVEPOINT for rollback from Create ID processing
				// 
				issueSavepoint("DATA_ENTRY");
				try
				{
					Ref<NString> p_match_status_out_ref = new Ref<NString>(getFormModel().getFormHeader().getMatchStatus());
					Ref<NNumber> p_match_pidm_out_ref = new Ref<NNumber>(getFormModel().getFormHeader().getMatchPidm());
					Gokcmpk.pCommonMatching(lvMatchSource, p_match_status_out_ref, p_match_pidm_out_ref);
					getFormModel().getFormHeader().setMatchStatus(p_match_status_out_ref.val);
					getFormModel().getFormHeader().setMatchPidm(p_match_pidm_out_ref.val);
				}
				catch(Exception  e)
				{
					getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
				// 
				//  Match status is NEW
				// 
				if ( getFormModel().getFormHeader().getMatchStatus().equals("N") )
				{
					noMatchCnt.open();
					ResultSet noMatchCntResults = noMatchCnt.fetchInto();
					if ( noMatchCntResults != null ) {
						lvResultCnt = noMatchCntResults.getInteger(0);
					}
					//noMatchCnt.close();
					// 
					//  More than one match or potential match.
					// 
					if ( isNull(lvResultCnt, 0).greater(0) )
					{
						enableSuspenseTab();
						disableMatchTab();
						navToGovcmidTab();
						// 
						//  Notify user of status.
						// 
						alertBtn = toInt(getTask().getGoqrpls().gDisplayAlert(toStr("G$_INFO_ALERT"), GNls.Fget(toStr("GOAMTCH-0073"), toStr("FORM"), toStr("Match status is 'New' but potential matches exist from prior rule."))));
					}
					else {
						// 
						//  No other match or potential match, ask whether or not to create.
						// 
						setGovcmidCount(toInt(""));
						// 
						if ( getFormModel().getFormHeader().getAllowUpdates().equals("N") )
						{
							alertBtn = toInt(getTask().getGoqrpls().gDisplayAlert(toStr("G$_INFO_ALERT"), GNls.Fget(toStr("GOAMTCH-0074"), toStr("FORM"), toStr("No matches found, exiting."))));
							cleanUpAndExit();
						}
						else {
							alertBtn = toInt(getTask().getGoqrpls().gDisplayAlert(toStr("G$_PIPE_MESSAGE_ALERT"), GNls.Fget(toStr("GOAMTCH-0075"), toStr("FORM"), toStr("No matches found, create as new?"))));
						}
						// 
						if ( alertBtn.equals(MessageServices.BUTTON1) )
						{
							checkFirstName(gotcmmeElement);
							getTask().getGoqrpls().gCheckFailure();
							//  73-5
							//  basic validtation checks to save API calls
							executeAction("CM_CREATE_NEW_ID_1");
							getTask().getGoqrpls().gCheckFailure();
							//  if basic data entry missing, do not rollback
							if ( getFormModel().getFormHeader().getApiFailure().equals("Y") )
							{
								return ;
							}
							//  attempt create using API calls
							executeAction("CM_CREATE_NEW_ID_2");
							getTask().getGoqrpls().gCheckFailure();
							//  if no API errors, after acknowledge, rollback 
							if ( getFormModel().getFormHeader().getApiFailure().equals("Y") && getFormModel().getKeyBlock().getKeyblockApiFailureInd().equals("Y") )
							{
								return ;
							}
							else {
								cleanUpAndExit();
							}
						}
					}
				}
				else if ( getFormModel().getFormHeader().getMatchStatus().equals("S") ) {
					noMatchCnt.open();
					ResultSet noMatchCntResults = noMatchCnt.fetchInto();
					if ( noMatchCntResults != null ) {
						lvResultCnt = noMatchCntResults.getInteger(0);
					}
					//noMatchCnt.close();
					// 
					if ( lvResultCnt.greater(0) )
					{
						enableSuspenseTab();
						disableMatchTab();
						navToGovcmidTab();
					}
					else {
						warningMessage(GNls.Fget(toStr("GOAMTCH-0076"), toStr("FORM"), toStr("*WARNING* Suspense status returned no records, check source rules.")));
					}
				}
				else {
					//Setting query parameters
					partialMatchResultCnt.addParameter("FORM_HEADER_MATCH_PIDM", getFormModel().getFormHeader().getMatchPidm());
					partialMatchResultCnt.open();
					ResultSet partialMatchResultCntResults = partialMatchResultCnt.fetchInto();
					if ( partialMatchResultCntResults != null ) {
						lvResultCnt = partialMatchResultCntResults.getInteger(0);
					}
					//partialMatchResultCnt.close();
					// 
					enableMatchTab();
					// 
					if ( lvResultCnt.greater(0) )
					{
						enableSuspenseTab();
						setGovcmidCount(lvResultCnt);
					}
					else {
						setGovcmidCount(toInt(""));
					}
					// 
					goBlock(toStr("GOVCMRT_MATCH"));
					executeQuery();
				}
				}finally{
					noMatchCnt.close();
					partialMatchResultCnt.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit CLEAN_UP_AND_EXIT
	
	PROCEDURE CLEAN_UP_AND_EXIT IS
BEGIN
  IF :SYSTEM.CURSOR_BLOCK <> 'KEY_BLOCK' THEN
    IF :SYSTEM.CURSOR_BLOCK IN ('GOVCMRT_MATCH','GOVCMID') THEN
      REMOVE_CMRT_RECORDS;
      GO_BLOCK('GOTCMME');
    END IF;
--
    IF :SYSTEM.RECORD_STATUS IN ('INSERT','NEW') THEN
    	DELETE_RECORD;
    END IF;
--
    :SYSTEM.MESSAGE_LEVEL := '5';
    COMMIT_FORM;
    :SYSTEM.MESSAGE_LEVEL := '0';
  END IF;
--
  :GLOBAL.VALUE := '';
  :CHECK_KEYS := 'E';
  :GLOBAL.CM_PURGE_RECORDS := 'Y';
  :FORM_HEADER.DO_TAB_NAVIGATION := 'N';
  :COMMIT_COMPLETED := 'Y';
--
-- If this form was entered by the menu, don't exit.
--
 	IF :FORM_HEADER.CALLING_FORM <> 'GUAGMNU' THEN
    G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
    G$_CHECK_FAILURE;
 	ELSE
    DO_KEY('CLEAR_FORM');
 	END IF;
END;
	*/
	//ID:1803
	/* <p>
 </p>
		*/
		public void cleanUpAndExit()
		{
			if ( getCursorBlock().notEquals("KEY_BLOCK") )
			{
				if ( in(getCursorBlock(), "GOVCMRT_MATCH", "GOVCMID").getValue() )
				{
					removeCmrtRecords();
					goBlock(toStr("GOTCMME"));
				}
				// 
				if ( (getRecordStatus().equals("INSERT") || getRecordStatus().equals("NEW")) )
				{
					deleteRecord();
				}
				// 
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
				commitTask();
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
			}
			// 
			setGlobal("VALUE", toStr(""));
			getFormModel().getFormHeader().setCheckKeys(toStr("E"));
			setGlobal("CM_PURGE_RECORDS", toStr("Y"));
			getFormModel().getFormHeader().setDoTabNavigation(toStr("N"));
			getFormModel().getFormHeader().setCommitCompleted(toStr("Y"));
			// 
			//  If this form was entered by the menu, don't exit.
			// 
			
			
			if ( getFormModel().getFormHeader().getCallingForm().notEquals("GUAINIT") )
			{
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				getTask().getGoqrpls().gCheckFailure();
			}
			else {
			executeAction("KEY-CLRFRM", "KEY_BLOCK", null);
				
				
				
			}
			
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_CLRFRM
	
	PROCEDURE CHECK_CLRFRM IS
BEGIN
  IF GET_APPLICATION_PROPERTY(CALLING_FORM) <> 'GUAGMNU' THEN
    MESSAGE(G$_NLS.Get('GOAMTCH-0077','FORM','*ERROR* This function is not valid when called from another form.'));
  	RAISE FORM_TRIGGER_FAILURE;
  END IF;
END;
	*/
	//ID:1804
	/* <p>
 </p>
		*/
		public void checkClrfrm()
		{
			if ( getParentTaskName().notEquals("GUAGMNU") )
			{
				errorMessage(GNls.Fget(toStr("GOAMTCH-0077"), toStr("FORM"), toStr("*ERROR* This function is not valid when called from another form.")));
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit PURGE_TEMP_RECORDS
	
	PROCEDURE PURGE_TEMP_RECORDS IS
BEGIN
  DEFAULT_VALUE('Y','GLOBAL.CM_PURGE_RECORDS');
--
  IF NVL(:GLOBAL.CM_PURGE_RECORDS,'Y') = 'Y' THEN
    REMOVE_CMRT_RECORDS;
    REMOVE_CMME_RECORDS;
  END IF;
END;
	*/
	//ID:1805
	/* <p>
 </p>
		*/
		public void purgeTempRecords()
		{
			setDefaultValue("Y", "GLOBAL.CM_PURGE_RECORDS");
			// 
			if ( isNull(getGlobal("CM_PURGE_RECORDS"), "Y").equals("Y") )
			{
				removeCmrtRecords();
				removeCmmeRecords();
			}
		}

	
	/* Original PL/SQL code for Prog Unit FORMAT_BIRTH_DATE
	
	FUNCTION FORMAT_BIRTH_DATE RETURN DATE IS
BEGIN
  IF :GOTCMME.GOTCMME_BIRTH_DAY IS NOT NULL AND
  	 :GOTCMME.GOTCMME_BIRTH_MON IS NOT NULL AND
  	 :GOTCMME.GOTCMME_BIRTH_YEAR IS NOT NULL THEN
    RETURN(TO_DATE(LPAD(TO_CHAR(:GOTCMME.GOTCMME_BIRTH_DAY),2,'0') 
                    || LPAD(TO_CHAR(:GOTCMME.GOTCMME_BIRTH_MON),2,'0')
                    || :GOTCMME.GOTCMME_BIRTH_YEAR, 'DDMMYYYY'));
  ELSE
  	RETURN(NULL);
  END IF;
END;
	*/
	//ID:1806
	/* <p>
 </p>
		*/
		public NDate formatBirthDate(GotcmmeAdapter gotcmmeElement)
		{
			if ( !gotcmmeElement.getGotcmmeBirthDay().isNull() && !gotcmmeElement.getGotcmmeBirthMon().isNull() && !gotcmmeElement.getGotcmmeBirthYear().isNull() )
			{
				return ((toDate(lpad(toChar(gotcmmeElement.getGotcmmeBirthDay()), 2, "0").append(lpad(toChar(gotcmmeElement.getGotcmmeBirthMon()), 2, "0")).append(gotcmmeElement.getGotcmmeBirthYear()), "DDMMYYYY")));
			}
			else {
				return NDate.getNull();
			}
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_ID_AND_EXIT
	
	PROCEDURE SELECT_ID_AND_EXIT IS
  lv_block  VARCHAR2(30) := :SYSTEM.CURSOR_BLOCK;
BEGIN
  IF lv_block NOT IN ('GOVCMRT_MATCH','GOVCMID') THEN
  	
  	G$_INVALID_FUNCTION_MSG;
  END IF;
--
  COPY(NAME_IN(lv_block || '.MATCH_ID'),'GLOBAL.VALUE');
  COPY(NAME_IN(lv_block || '.MATCH_ID'),'GLOBAL.ID');
  COPY(NAME_IN(lv_block || '.MATCH_ID'),'GLOBAL.KEY_IDNO');
--
  IF  lv_block = 'GOVCMRT_MATCH'  THEN
  	  COPY(NAME_IN(lv_block || '.GOVCMRT_PIDM'),'GLOBAL.KEY_PIDM');
  ELSE
      COPY(NAME_IN(lv_block || '.GOVCMID_PIDM'),'GLOBAL.KEY_PIDM');
  END IF;
--
-- Now call FGAC to provide temporary access.
--
  gokfgac.p_search_form_update_temp_pidm(:GLOBAL.KEY_PIDM);
--
  :FORM_HEADER.SKIP_SAVE := 'Y';
  EXECUTE_TRIGGER('KEY-EXIT');
  G$_CHECK_FAILURE;
END;
	*/
	//ID:1807
	/* <p>
	 </p>
		*/
		public void selectIdAndExit()
		{
			NString lvBlock = getCursorBlock();
			if ( !in(lvBlock, "GOVCMRT_MATCH", "GOVCMID").getValue() )
			{
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}
			// 
			copy(getNameIn(lvBlock.append(".MATCH_ID")),"GLOBAL.VALUE");
			copy(getNameIn(lvBlock.append(".MATCH_ID")),"GLOBAL.ID");
			copy(getNameIn(lvBlock.append(".MATCH_ID")),"GLOBAL.KEY_IDNO");
			// 
			if ( lvBlock.equals("GOVCMRT_MATCH") )
			{
				copy(getNameIn(lvBlock.append(".GOVCMRT_PIDM")),"GLOBAL.KEY_PIDM");
			}
			else {
				copy(getNameIn(lvBlock.append(".GOVCMID_PIDM")),"GLOBAL.KEY_PIDM");
			}
			// 
			//  Now call FGAC to provide temporary access.
			// 
			Gokfgac.pSearchFormUpdateTempPidm(toNumber(getGlobal("KEY_PIDM")));
			// 
			getFormModel().getFormHeader().setSkipSave(toStr("Y"));
			executeAction("KEY-EXIT");
			getTask().getGoqrpls().gCheckFailure();
		}

	
	/* Original PL/SQL code for Prog Unit F_CM_UPDATE_BIO
	
	--
-- Process the SPBPERS items.
--
FUNCTION F_CM_UPDATE_BIO (p_PIDM_IN SPRIDEN.SPRIDEN_PIDM%TYPE) RETURN VARCHAR2 IS
--
  lv_bd          SPBPERS.SPBPERS_BIRTH_DATE%TYPE;
  lv_bdate       DATE := FORMAT_BIRTH_DATE;
  lv_gender      SPBPERS.SPBPERS_SEX%TYPE;
  lv_msg         VARCHAR2(200) := G$_NLS.Get('GOAMTCH-0078','FORM',' Biographical record updated;');
  lv_rowid       VARCHAR2(18);
  lv_ssn         SPBPERS.SPBPERS_SSN%TYPE;
--
  lv_bio_ref     GB_BIO.BIO_REF;
  lv_bio_rec     GB_BIO.BIO_REC;
--
BEGIN
  IF :GOTCMME.GOTCMME_SSN IS NOT NULL OR
  	 :GOTCMME.GOTCMME_SEX IS NOT NULL OR
  	 lv_bdate IS NOT NULL THEN
--
-- Determine if the record already exist.
--
    IF GB_BIO.F_EXISTS(p_PIDM  =>p_PIDM_IN,
    	                 p_ROWID =>'') = 'N' THEN
--
-- Create the record.
--
      RETURN(F_CREATE_BIO(p_PIDM_IN, lv_bdate));
--
-- Update the record.
--
    ELSE
      lv_bio_ref := GB_BIO.F_QUERY_ONE(p_PIDM =>p_PIDM_IN);
      FETCH lv_bio_ref INTO lv_bio_rec;
--
      lv_bd     := NVL(lv_bio_rec.r_birth_date,
                        NVL(lv_bdate, dml_common.f_unspecified_date));
      lv_ssn    := NVL(lv_bio_rec.r_ssn,
                        NVL(:GOTCMME.GOTCMME_SSN, dml_common.f_unspecified_string));
      lv_gender := CASE NVL(lv_bio_rec.r_sex,'N')
                     WHEN 'N' THEN NVL(:GOTCMME.GOTCMME_SEX,'N')
                     ELSE lv_bio_rec.r_sex
    	             END;
--
-- If no changes to apply, skip the update.
--
      IF lv_bd = lv_bio_rec.r_birth_date AND
      	 lv_ssn = lv_bio_rec.r_ssn AND
      	 lv_gender = lv_bio_rec.r_sex THEN
--
        RETURN(G$_NLS.Get('GOAMTCH-0079','FORM',' Biographical record not updated;'));
--
-- Do the update.
--
      ELSE
        BEGIN
          GB_BIO.P_UPDATE(p_PIDM            =>p_PIDM_IN,
                          p_SSN             =>lv_ssn,
                          p_BIRTH_DATE      =>lv_bd,
                          p_SEX             =>lv_gender,
                          p_DATA_ORIGIN     =>:GLOBAL.DATA_ORIGIN,
                          p_USER_ID         =>:GLOBAL.CURRENT_USER,
                          p_ROWID           =>'');
--
        EXCEPTION
        	WHEN OTHERS THEN
        	  RETURN(G$_NLS.Get('GOAMTCH-0080','FORM',' Biographical record update failed;'));
        END;
--
        IF :GOTCMME.GOTCMME_ENTITY_CDE = 'C' THEN
          lv_msg := G$_NLS.Get('GOAMTCH-0081','FORM',' Warning - Biographical Information was updated for a Non Person;');
        END IF;
        RETURN(lv_msg);
      END IF;
    END IF;
--
  ELSE
    RETURN(G$_NLS.Get('GOAMTCH-0082','FORM',' Biographical record not updated;'));
  END IF;
END;
	*/
	//ID:1808
	/* <p>
		* 
		*  Process the SPBPERS items.
		* 
		</p>
		* @param pPidmIn
		*/
		public NString fCmUpdateBio(GotcmmeAdapter gotcmmeElement, NNumber pPidmIn)
		{
			Object caseExpressionResult = null;
			// 
			NDate lvBd= NDate.getNull();
			NDate lvBdate = formatBirthDate(gotcmmeElement);
			NString lvGender= NString.getNull();
			NString lvMsg = GNls.Fget(toStr("GOAMTCH-0078"), toStr("FORM"), toStr(" Biographical record updated;"));
			java.sql.RowId lvRowid = null;
			NString lvSsn= NString.getNull();
			
			// 
			Cursor lvBioRef= null; 
			GbBio.BioRecRow lvBioRec= null;
			if ( !gotcmmeElement.getGotcmmeSsn().isNull() || !gotcmmeElement.getGotcmmeSex().isNull() || !lvBdate.isNull() )
			{
				// 
				//  Determine if the record already exist.
				// 
				if ( GbBio.fExists(/*pPidm=>*/pPidmIn, /*pRowid=>*/toStr("")).equals("N") )
				{
					// 
					//  Create the record.
					// 
					return ((fCreateBio(gotcmmeElement, pPidmIn, lvBdate)));
				}
				else {
					
					lvBioRef = GbBio.fQueryOne(/*pPidm=>*/pPidmIn);
					List<Row> lvBioRefResults = lvBioRef.getRows();
					if ( lvBioRefResults.size() > 0) {
						lvBioRec =  new GbBio.BioRecRow(lvBioRefResults.get(0));
					}
					// 
					lvBd = isNull(lvBioRec.RBirthDate, isNull(lvBdate, DmlCommon.fUnspecifiedDate()));
					lvSsn = isNull(lvBioRec.RSsn, isNull(gotcmmeElement.getGotcmmeSsn(), DmlCommon.fUnspecifiedString()));
					switch (isNull(lvBioRec.RSex, "N").getValue().charAt(0)) //TODO: JM switch only accepts int values, charAt(0) gets first value in String
					{
						case 'N':
						caseExpressionResult = isNull(gotcmmeElement.getGotcmmeSex(), "N");
							break;
					}
					lvGender = toStr(caseExpressionResult);
					// 
					//  If no changes to apply, skip the update.
					// 
					if ( lvBd.equals(lvBioRec.RBirthDate) && lvSsn.equals(lvBioRec.RSsn) && lvGender.equals(lvBioRec.RSex) )
					{
						// 
						return ((GNls.Fget(toStr("GOAMTCH-0079"), toStr("FORM"), toStr(" Biographical record not updated;"))));
					}
					else {
						try
						{
							GbBio.pUpdate(/*pPidm=>*/pPidmIn, 
										 /*pSsn=>*/lvSsn, 
										 /*pBirthDate=>*/lvBd, 
										 /*pLgcyCode=>*/NString.getNull(), 
										 /*pEthnCode=>*/NString.getNull(), 
										 /*pMrtlCode=>*/ NString.getNull(),
										 /*pRelgCode=>*/ NString.getNull(),
										 /*pSex=>*/lvGender,
										 /*pConfidInd=>*/NString.getNull(),
										 /*pDeadInd=>*/NString.getNull(),
										 /*pVetcFileNumber=>*/NString.getNull(),
										 /*pLegalName=>*/NString.getNull(),
										 /*pPrefFirstName=>*/NString.getNull(),
										 /*pNamePrefix=>*/NString.getNull(),
										 /*pNameSuffix=>*/NString.getNull(),
										 /*pVeraInd=>*/NString.getNull(),
										 /*pDeadDate=>*/NDate.getNull(),
										 /*pCitzCode=>*/NString.getNull(),
										 /*pActiveDutySeprDate=>*/NDate.getNull(),
										 /*pSdvetInd=>*/NString.getNull(),
										 /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), 
										 /*pUserId=>*/getGlobal("CURRENT_USER"),
										 /*pEthnCde=>*/NString.getNull(),
										 /*pConfirmedReCde=>*/NString.getNull(),
										 /*pConfirmedReDate=>*/NDate.getNull(),
										 /*pArmedServMedVetInd=>*/DmlCommon.fUnspecifiedString(),
										 /*pRowid=>*/lvRowid);
						}
						catch(Exception  e)
						{
							return ((GNls.Fget(toStr("GOAMTCH-0080"), toStr("FORM"), toStr(" Biographical record update failed;"))));
						}
						// 
						if ( gotcmmeElement.getGotcmmeEntityCde().equals("C") )
						{
							lvMsg = GNls.Fget(toStr("GOAMTCH-0081"), toStr("FORM"), toStr(" Warning - Biographical Information was updated for a Non Person;"));
						}
						return ((lvMsg));
					}
				}
			}
			else {
				return ((GNls.Fget(toStr("GOAMTCH-0082"), toStr("FORM"), toStr(" Biographical record not updated;"))));
			}
		}

	
	/* Original PL/SQL code for Prog Unit F_CM_UPDATE_ADDRESS
	
	--
-- Process the SPRADDR items.
--
FUNCTION F_CM_UPDATE_ADDRESS (p_PIDM_IN            SPRIDEN.SPRIDEN_PIDM%TYPE,
                              p_ATYP_CODE_OUT  OUT SPRADDR.SPRADDR_ATYP_CODE%TYPE,
                              p_ADDR_SEQNO_OUT OUT SPRADDR.SPRADDR_SEQNO%TYPE) RETURN VARCHAR2 IS
--
  lv_addr_seqno  SPRADDR.SPRADDR_SEQNO%TYPE;
  lv_addr_seqno2 SPRADDR.SPRADDR_SEQNO%TYPE;
  lv_atyp_code   SPRADDR.SPRADDR_ATYP_CODE%TYPE := :GOTCMME.GOTCMME_ATYP_CODE;
  lv_id          SPRIDEN.SPRIDEN_ID%TYPE;
  lv_pidm        SPRIDEN.SPRIDEN_PIDM%TYPE;
  lv_rowid       VARCHAR2(18) := '';
  lv_status_msg  VARCHAR2(2000);
  --
  BEGINOFTIME CONSTANT DATE := TO_DATE('1','J');        --01/01/4712 BC
  ENDOFTIME   CONSTANT DATE := TO_DATE('5373484','J');  --12/31/9999 AD
  lv_addr_exists VARCHAR2(1) := '0';
--
  CURSOR get_addr_seq_no_c (p_ATYP_CODE VARCHAR2) IS
    SELECT SPRADDR_SEQNO, ROWID
      FROM SPRADDR
     WHERE SPRADDR_PIDM = p_PIDM_IN
       AND SPRADDR_ATYP_CODE = p_ATYP_CODE
       AND SPRADDR_STATUS_IND IS NULL
       -- 74-4 add follow two lines to find current Address seq no
       AND NVL(SPRADDR_FROM_DATE,BEGINOFTIME) <= SYSDATE
       AND NVL(SPRADDR_TO_DATE,ENDOFTIME) >= SYSDATE;
       -- 74-G add follwoing cursor to find an existing Address for today
    CURSOR current_addr_exists_c (p_ATYP_CODE VARCHAR2) IS
    SELECT '1'
      FROM SPRADDR
     WHERE SPRADDR_PIDM = p_PIDM_IN
       AND SPRADDR_ATYP_CODE = p_ATYP_CODE
       AND SPRADDR_STATUS_IND IS NULL
       AND NVL(SPRADDR_FROM_DATE,BEGINOFTIME) <= SYSDATE
       AND NVL(SPRADDR_TO_DATE,ENDOFTIME) >= SYSDATE;
--
  lv_addr_ref     GB_ADDRESS.ADDRESS_REF;
  lv_addr_rec     GB_ADDRESS.ADDRESS_REC;
--
BEGIN
  IF :GOTCMME.GOTCMME_ATYP_CODE IS NOT NULL THEN
    DEFAULT_VALUE('N','GLOBAL.USE_FINANCE_RULES');
--
-- Check if an active address exists.  If not, validate the data and then create.
--
-- 74-4  begin 
		OPEN current_addr_exists_c(:GOTCMME.GOTCMME_ATYP_CODE);
		FETCH current_addr_exists_c INTO lv_addr_exists;
		CLOSE current_addr_exists_c;
		<multilinecomment> 74-4
    IF GB_ADDRESS.F_EXISTS_ACTIVE(p_PIDM             =>p_PIDM_IN,
                                  p_ATYP_CODE        =>:GOTCMME.GOTCMME_ATYP_CODE,
                                  p_FROM_DATE        =>'',
                                  p_TO_DATE          =>'') = 'Y' THEN
                                  </multilinecomment>
    IF  lv_addr_exists = '1' THEN
-- 74-4  end
--
      OPEN get_addr_seq_no_c(:GOTCMME.GOTCMME_ATYP_CODE);
      FETCH get_addr_seq_no_c INTO lv_addr_seqno2, lv_rowid;
      CLOSE get_addr_seq_no_c;
--
-- Validate address data.
--
      BEGIN
        GB_ADDRESS_RULES.P_VALIDATE(p_pidm              =>p_PIDM_IN,
                                    p_atyp_code         =>:GOTCMME.GOTCMME_ATYP_CODE,
                                    p_seqno             =>lv_addr_seqno2,
                                    p_street_line1      =>:GOTCMME.GOTCMME_STREET_LINE1,
                                    p_city              =>:GOTCMME.GOTCMME_CITY,
                                    p_stat_code         =>:GOTCMME.GOTCMME_STAT_CODE,
                                    p_zip               =>:GOTCMME.GOTCMME_ZIP,
                                    p_cnty_code         =>:GOTCMME.GOTCMME_CNTY_CODE,
                                    p_natn_code         =>:GOTCMME.GOTCMME_NATN_CODE,
                                    p_status_ind        =>'',
                                    p_asrc_code         =>'',
                                    p_delivery_point    =>'',
                                    p_correction_digit  =>'',
                                    p_reviewed_ind      =>'',
                                    p_reviewed_user     =>'',
                                    p_ctry_code_phone   =>'',
                                    p_house_number      =>'',
                                    p_street_line4      =>'');
      EXCEPTION
      	WHEN OTHERS THEN
      	  RETURN(G$_NLS.Get('GOAMTCH-0083','FORM',' Address record not valid;'));
      END;
--
-- Verify address is different from existing one.
--
      lv_addr_ref := GB_ADDRESS.F_QUERY_ONE(p_PIDM       =>p_PIDM_IN,
                                            p_ATYP_CODE  =>:GOTCMME.GOTCMME_ATYP_CODE,
                                            p_SEQNO      =>lv_addr_seqno2,
                                            p_STATUS_IND =>'');
      FETCH lv_addr_ref INTO lv_addr_rec;
--
-- If no changes to apply, skip the update.
--
      IF UPPER(lv_addr_rec.r_street_line1 || lv_addr_rec.r_street_line2 ||
               lv_addr_rec.r_street_line3 || lv_addr_rec.r_city ||
               lv_addr_rec.r_stat_code || lv_addr_rec.r_zip ||
               lv_addr_rec.r_cnty_code || lv_addr_rec.r_natn_code) =
         UPPER(:GOTCMME.GOTCMME_STREET_LINE1 || :GOTCMME.GOTCMME_STREET_LINE2 ||
               :GOTCMME.GOTCMME_STREET_LINE3 || :GOTCMME.GOTCMME_CITY ||
               :GOTCMME.GOTCMME_STAT_CODE || :GOTCMME.GOTCMME_ZIP ||
               :GOTCMME.GOTCMME_CNTY_CODE || :GOTCMME.GOTCMME_NATN_CODE) THEN
--
        RETURN(G$_NLS.Get('GOAMTCH-0084','FORM',' Address record not updated;'));
--
-- Update existing address.
--
      ELSE
      	-- 73-6 add ASRC_CODE
        BEGIN
          GB_ADDRESS.P_UPDATE(p_PIDM             =>p_PIDM_IN,
                              p_ATYP_CODE        =>:GOTCMME.GOTCMME_ATYP_CODE,
                              p_SEQNO            =>lv_addr_seqno2,
                              p_STATUS_IND       =>'I',
                              p_FINANCE_RULES    =>:GLOBAL.USE_FINANCE_RULES,
                              p_asrc_code        =>:GOTCMME.GOTCMME_ASRC_CODE,
                              p_ROWID            =>lv_rowid);
        EXCEPTION
      	  WHEN OTHERS THEN
      	    RETURN(G$_NLS.Get('GOAMTCH-0085','FORM',' Address record update failed;'));
        END;
      END IF;
    END IF;
--
-- Create new address.
--
-- 73-6 add ASRC_CODE
    lv_status_msg := F_CREATE_ADDRESS(p_PIDM_IN, lv_atyp_code, lv_addr_seqno);
    IF lv_status_msg = :FORM_HEADER.ADDR_FAILED_LIT THEN
      IF lv_rowid IS NOT NULL THEN
        GB_ADDRESS.P_UPDATE(p_PIDM             =>p_PIDM_IN,
                            p_ATYP_CODE        =>:GOTCMME.GOTCMME_ATYP_CODE,
                            p_SEQNO            =>lv_addr_seqno2,
                            p_STATUS_IND       =>'',
                            p_FINANCE_RULES    =>:GLOBAL.USE_FINANCE_RULES,
                            p_asrc_code        =>:GOTCMME.GOTCMME_ASRC_CODE,
                            p_ROWID            =>lv_rowid);
      END IF;
    END IF;
--
    p_ATYP_CODE_OUT  := lv_atyp_code;
    p_ADDR_SEQNO_OUT := lv_addr_seqno;
    RETURN(lv_status_msg);
--
    ELSE
    RETURN(G$_NLS.Get('GOAMTCH-0086','FORM',' Address not updated;'));
  END IF;
END;

	*/
	//ID:1809
	/* <p>
		* 
		*  Process the SPRADDR items.
		* 
		 </p>
		* @param pPidmIn
		* @param pAtypCodeOut
		* @param pAddrSeqnoOut
		*/
		public NString fCmUpdateAddress(GotcmmeAdapter gotcmmeElement, NNumber pPidmIn, Ref<NString> pAtypCodeOut, Ref<NNumber> pAddrSeqnoOut)
		{
			int rowCount = 0;
			// 
			NNumber lvAddrSeqno= NNumber.getNull();
			NNumber lvAddrSeqno2= NNumber.getNull();
			NString lvAtypCode = gotcmmeElement.getGotcmmeAtypCode();
			NString lvId= NString.getNull();
			NNumber lvPidm= NNumber.getNull();
			java.sql.RowId lvRowid = null;
			NString lvStatusMsg= NString.getNull();
			// 
			//final NDate BEGINOFTIME = toDate("1", "J"); // 01/01/4712 BC
			//final NDate ENDOFTIME = toDate("5373484", "J"); // 12/31/9999 AD
			NString lvAddrExists = toStr("0");
			String sqlgetAddrSeqNoC = "SELECT SPRADDR_SEQNO, ROWID " +
	" FROM SPRADDR " +
	" WHERE SPRADDR_PIDM = :P_P_PIDM_IN AND SPRADDR_ATYP_CODE = :P_P_ATYP_CODE AND SPRADDR_STATUS_IND IS NULL AND NVL(SPRADDR_FROM_DATE, TO_DATE('1', 'J')) <= SYSDATE AND NVL(SPRADDR_TO_DATE, TO_DATE('5373484', 'J')) >= SYSDATE ";
			DataCursor getAddrSeqNoC = new DataCursor(sqlgetAddrSeqNoC);
			String sqlcurrentAddrExistsC = "SELECT '1' " +
	" FROM SPRADDR " +
	" WHERE SPRADDR_PIDM = :P_P_PIDM_IN AND SPRADDR_ATYP_CODE = :P_P_ATYP_CODE AND SPRADDR_STATUS_IND IS NULL AND NVL(SPRADDR_FROM_DATE, TO_DATE('1', 'J')) <= SYSDATE AND NVL(SPRADDR_TO_DATE, TO_DATE('5373484', 'J')) >= SYSDATE ";
			DataCursor currentAddrExistsC = new DataCursor(sqlcurrentAddrExistsC);
			NString pAtypCode = NString.getNull();
			// 
			Cursor lvAddrRef= null;
			GbAddress.AddressRecRow lvAddrRec= null;
			try {
				if ( !gotcmmeElement.getGotcmmeAtypCode().isNull() )
				{
					setDefaultValue("N", "GLOBAL.USE_FINANCE_RULES");
					// 
					//  Check if an active address exists.  If not, validate the data and then create.
					// 
					//  74-4  begin 
					pAtypCode=gotcmmeElement.getGotcmmeAtypCode();
					//Setting query parameters
					currentAddrExistsC.addParameter("P_P_PIDM_IN", pPidmIn);
					currentAddrExistsC.addParameter("P_P_ATYP_CODE", pAtypCode);
					//currentAddrExistsC.addParameter("P_BEGINOFTIME", BEGINOFTIME);
					//currentAddrExistsC.addParameter("P_ENDOFTIME", ENDOFTIME);
					currentAddrExistsC.open();
					ResultSet currentAddrExistsCResults = currentAddrExistsC.fetchInto();
					if ( currentAddrExistsCResults != null ) {
						lvAddrExists = currentAddrExistsCResults.getStr(0);
					}
					currentAddrExistsC.close();
					//  74-4
					// IF GB_ADDRESS.F_EXISTS_ACTIVE(p_PIDM             =>p_PIDM_IN,
					// p_ATYP_CODE        =>:GOTCMME.GOTCMME_ATYP_CODE,
					// p_FROM_DATE        =>'',
					// p_TO_DATE          =>'') = 'Y' THEN
					if ( lvAddrExists.equals("1") )
					{
						//  74-4  end
						// 
						pAtypCode=gotcmmeElement.getGotcmmeAtypCode();
						//Setting query parameters
						getAddrSeqNoC.addParameter("P_P_PIDM_IN", pPidmIn);
						getAddrSeqNoC.addParameter("P_P_ATYP_CODE", pAtypCode);
						//getAddrSeqNoC.addParameter("P_BEGINOFTIME", BEGINOFTIME);
						//getAddrSeqNoC.addParameter("P_ENDOFTIME", ENDOFTIME);
						getAddrSeqNoC.open();
						ResultSet getAddrSeqNoCResults = getAddrSeqNoC.fetchInto();
						if ( getAddrSeqNoCResults != null ) {
							lvAddrSeqno2 = getAddrSeqNoCResults.getNumber(0);
							lvRowid = DbManager.getDataBaseFactory().createRowid(getAddrSeqNoCResults.getStr(1).getValue().getBytes());
						}
						getAddrSeqNoC.close();
						try
						{
							GbAddressRules.pValidate(/*pPidm=>*/pPidmIn, 
													/*pAtypCode=>*/gotcmmeElement.getGotcmmeAtypCode(), 
													/*pSeqno=>*/lvAddrSeqno2, 
													/*pStreetLine1=>*/gotcmmeElement.getGotcmmeStreetLine1(), 
													/*pCity=>*/gotcmmeElement.getGotcmmeCity(), 
													/*pStatCode=>*/gotcmmeElement.getGotcmmeStatCode(), 
													/*pZip=>*/gotcmmeElement.getGotcmmeZip(), 
													/*pCntyCode=>*/gotcmmeElement.getGotcmmeCntyCode(), 
													/*pNatnCode=>*/gotcmmeElement.getGotcmmeNatnCode(), 
													/*pStatusInd=>*/NString.getNull(), 
													/*pAsrcCode=>*/NString.getNull(), 
													/*pDeliveryPoint=>*/NNumber.getNull(), 
													/*pCorrectionDigit=>*/NNumber.getNull(), 
													/*pReviewedInd=>*/NString.getNull(), 
													/*pReviewedUser=>*/NString.getNull(), 
													/*pCtryCodePhone=>*/NString.getNull(), 
													/*pHouseNumber=>*/NString.getNull(), 
													/*pStreetLine4=>*/NString.getNull(),
													/*pFromDate=>*/NDate.getNull(),
													/*pToDate=>*/NDate.getNull(),
													/*pFinanceRules=>*/NString.getNull());
						}
						catch(Exception  e)
						{
							return ((GNls.Fget(toStr("GOAMTCH-0083"), toStr("FORM"), toStr(" Address record not valid;"))));
						}
						// 
						//  Verify address is different from existing one.
						// 
						lvAddrRef = GbAddress.fQueryOne(/*pPidm=>*/pPidmIn, /*pAtypCode=>*/gotcmmeElement.getGotcmmeAtypCode(), /*pSeqno=>*/lvAddrSeqno2, /*pStatusInd=>*/toStr(""));
						List<Row> lvAddrRefResults = lvAddrRef.getRows();
						if ( lvAddrRefResults != null ) {
							lvAddrRec =  new GbAddress.AddressRecRow(lvAddrRefResults.get(0));
						}
						// 
						//  If no changes to apply, skip the update.
						// 
						if ( upper(lvAddrRec.RStreetLine1.append(lvAddrRec.RStreetLine2).append(lvAddrRec.RStreetLine3).append(lvAddrRec.RCity).append(lvAddrRec.RStatCode).append(lvAddrRec.RZip).append(lvAddrRec.RCntyCode).append(lvAddrRec.RNatnCode)).equals(upper(gotcmmeElement.getGotcmmeStreetLine1().append(gotcmmeElement.getGotcmmeStreetLine2()).append(gotcmmeElement.getGotcmmeStreetLine3()).append(gotcmmeElement.getGotcmmeCity()).append(gotcmmeElement.getGotcmmeStatCode()).append(gotcmmeElement.getGotcmmeZip()).append(gotcmmeElement.getGotcmmeCntyCode()).append(gotcmmeElement.getGotcmmeNatnCode()))) )
						{
							// 
							return ((GNls.Fget(toStr("GOAMTCH-0084"), toStr("FORM"), toStr(" Address record not updated;"))));
						}
						else {
							try
							{
								GbAddress.pUpdate(/*pPidm=>*/pPidmIn,
										 		  /*pSeqno=>*/lvAddrSeqno2,
												  /*pAtypCode=>*/gotcmmeElement.getGotcmmeAtypCode(),
												  /*pFromDate=>*/NDate.getNull(),
												  /*pToDate=>*/NDate.getNull(),
												  /*pStreetLine1=>*/NString.getNull(),
												  /*pStreetLine2=>*/NString.getNull(),
												  /*pStreetLine3=>*/NString.getNull(),
												  /*pCity=>*/NString.getNull(),
												  /*pStatCode=>*/NString.getNull(),
												  /*pZip=>*/NString.getNull(),
												  /*pCntyCode=>*/NString.getNull(),
												  /*pNatnCode=>*/NString.getNull(),
												  /*pStatusInd=>*/toStr("I"),
												  /*pUser=>*/NString.getNull(),
												  /*pAsrcCode=>*/gotcmmeElement.getGotcmmeAsrcCode(),
												  /*pDeliveryPoint=>*/NNumber.getNull(),
												  /*pCorrectionDigit=>*/NNumber.getNull(),
												  /*pGstTaxId=>*/NString.getNull(),
												  /*pCarrierRoute=>*/NString.getNull(),
												  /*pHouseNumber=>*/NString.getNull(),
												  /*pStreetLine4=>*/NString.getNull(),
												  /*pFinanceRules=>*/getGlobal("USE_FINANCE_RULES"), 
												  /*pDataOrigin=>*/NString.getNull(), 
												  /*pRowid=>*/lvRowid);
							}
							catch(Exception  e)
							{
								return ((GNls.Fget(toStr("GOAMTCH-0085"), toStr("FORM"), toStr(" Address record update failed;"))));
							}
						}
					}
					Ref<NString> pAtypCodeOut_ref = new Ref<NString>(lvAtypCode);
					Ref<NNumber> pAddrSeqnoOut_ref = new Ref<NNumber>(lvAddrSeqno) ;
					// 
					//  Create new address.
					// 
					//  73-6 add ASRC_CODE
					lvStatusMsg = fCreateAddress(gotcmmeElement, pPidmIn, pAtypCodeOut_ref, pAddrSeqnoOut_ref);
					if ( lvStatusMsg.equals(getFormModel().getFormHeader().getAddrFailedLit()) )
					{
						if ( lvRowid != null )
						{
							
							GbAddress.pUpdate(/*pPidm=>*/pPidmIn,
							 		  /*pSeqno=>*/lvAddrSeqno2,
									  /*pAtypCode=>*/gotcmmeElement.getGotcmmeAtypCode(),
									  /*pFromDate=>*/NDate.getNull(),
									  /*pToDate=>*/NDate.getNull(),
									  /*pStreetLine1=>*/NString.getNull(),
									  /*pStreetLine2=>*/NString.getNull(),
									  /*pStreetLine3=>*/NString.getNull(),
									  /*pCity=>*/NString.getNull(),
									  /*pStatCode=>*/NString.getNull(),
									  /*pZip=>*/NString.getNull(),
									  /*pCntyCode=>*/NString.getNull(),
									  /*pNatnCode=>*/NString.getNull(),
									  /*pStatusInd=>*/NString.getNull(),
									  /*pUser=>*/NString.getNull(),
									  /*pAsrcCode=>*/gotcmmeElement.getGotcmmeAsrcCode(),
									  /*pDeliveryPoint=>*/NNumber.getNull(),
									  /*pCorrectionDigit=>*/NNumber.getNull(),
									  /*pGstTaxId=>*/NString.getNull(),
									  /*pCarrierRoute=>*/NString.getNull(),
									  /*pHouseNumber=>*/NString.getNull(),
									  /*pStreetLine4=>*/NString.getNull(),
									  /*pFinanceRules=>*/getGlobal("USE_FINANCE_RULES"), 
									  /*pDataOrigin=>*/NString.getNull(), 
									  /*pRowid=>*/lvRowid);
						}
					}
					// 
					pAtypCodeOut.val = lvAtypCode;
					pAddrSeqnoOut.val = lvAddrSeqno;
					return ((lvStatusMsg));
				}
				else {
					return ((GNls.Fget(toStr("GOAMTCH-0086"), toStr("FORM"), toStr(" Address not updated;"))));
				}
				}finally{
					currentAddrExistsC.close();
					getAddrSeqNoC.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit F_CREATE_ADDRESS
	
	FUNCTION F_CREATE_ADDRESS (p_PIDM_IN            SPRIDEN.SPRIDEN_PIDM%TYPE,
                           p_ATYP_CODE_OUT  OUT SPRADDR.SPRADDR_ATYP_CODE%TYPE,
                           p_ADDR_SEQNO_OUT OUT SPRADDR.SPRADDR_SEQNO%TYPE) RETURN VARCHAR2 IS
--
  lv_addr_seqno  SPRADDR.SPRADDR_SEQNO%TYPE;
  lv_from_date   SPRADDR.SPRADDR_FROM_DATE%TYPE;
  lv_rowid       VARCHAR2(18);
--
BEGIN
  DEFAULT_VALUE('N','GLOBAL.USE_FINANCE_RULES');
  IF :GLOBAL.USE_FINANCE_RULES = 'N' THEN
  	lv_from_date := TRUNC(SYSDATE);
  END IF;
--
-- 73-6 add ASRC_CODE
  GB_ADDRESS.P_CREATE(p_PIDM             =>p_PIDM_IN,
                      p_ATYP_CODE        =>:GOTCMME.GOTCMME_ATYP_CODE,
                      p_FROM_DATE        =>lv_from_date,
                      p_STREET_LINE1     =>:GOTCMME.GOTCMME_STREET_LINE1,
                      p_STREET_LINE2     =>:GOTCMME.GOTCMME_STREET_LINE2,
                      p_STREET_LINE3     =>:GOTCMME.GOTCMME_STREET_LINE3,
                      p_CITY             =>:GOTCMME.GOTCMME_CITY,
                      p_STAT_CODE        =>:GOTCMME.GOTCMME_STAT_CODE,
                      p_ZIP              =>:GOTCMME.GOTCMME_ZIP,
                      p_CNTY_CODE        =>:GOTCMME.GOTCMME_CNTY_CODE,
                      p_NATN_CODE        =>:GOTCMME.GOTCMME_NATN_CODE,
                      p_USER             =>:GLOBAL.CURRENT_USER,
                      p_DATA_ORIGIN      =>:GLOBAL.DATA_ORIGIN,
                      p_FINANCE_RULES    =>:GLOBAL.USE_FINANCE_RULES,
                      p_SEQNO_INOUT      =>lv_addr_seqno,
                      p_asrc_code        =>:GOTCMME.GOTCMME_ASRC_CODE,
                      p_ROWID_OUT        =>lv_rowid);
--
  p_ATYP_CODE_OUT  := :GOTCMME.GOTCMME_ATYP_CODE;
  p_ADDR_SEQNO_OUT := lv_addr_seqno;
--
 	RETURN(G$_NLS.Get('GOAMTCH-0087','FORM',' Address record created;'));
EXCEPTION
 	WHEN OTHERS THEN
 	  :FORM_HEADER.API_FAILURE := 'Y';
 	  :FORM_HEADER.F_CREATE_ADDRESS_ERR := 'Y';
 	  RETURN(:FORM_HEADER.ADDR_FAILED_LIT);
END;
	*/
	//ID:1810
	/* <p>
	 </p>
		* @param pPidmIn
		* @param pAtypCodeOut
		* @param pAddrSeqnoOut
		*/
		public NString fCreateAddress(GotcmmeAdapter gotcmmeElement, NNumber pPidmIn, Ref<NString> pAtypCodeOut, Ref<NNumber> pAddrSeqnoOut)
		{
			// 
			Ref<NNumber> lvAddrSeqno= new Ref<NNumber>(NNumber.getNull());
			NDate lvFromDate= NDate.getNull();
			Ref<byte[]> lvRowid= new Ref<byte[]>();
			try
			{
				setDefaultValue("N", "GLOBAL.USE_FINANCE_RULES");
				if ( getGlobal("USE_FINANCE_RULES").equals("N") )
				{
					lvFromDate = trunc(NDate.getNow());
				}
				// 
				//  73-6 add ASRC_CODE
				GbAddress.pCreate(/*pPidm=>*/pPidmIn, 
								 /*pAtypCode=>*/gotcmmeElement.getGotcmmeAtypCode(), 
								 /*pFromDate=>*/lvFromDate,
								 /*pToDate=>*/NDate.getNull(),
								 /*pStreetLine1=>*/gotcmmeElement.getGotcmmeStreetLine1(), 
								 /*pStreetLine2=>*/gotcmmeElement.getGotcmmeStreetLine2(), 
								 /*pStreetLine3=>*/gotcmmeElement.getGotcmmeStreetLine3(), 
								 /*pCity=>*/gotcmmeElement.getGotcmmeCity(), 
								 /*pStatCode=>*/gotcmmeElement.getGotcmmeStatCode(), 
								 /*pZip=>*/gotcmmeElement.getGotcmmeZip(), 
								 /*pCntyCode=>*/gotcmmeElement.getGotcmmeCntyCode(), 
								 /*pNatnCode=>*/gotcmmeElement.getGotcmmeNatnCode(),
								 /*pStatusInd*/NString.getNull(),
								 /*pUser=>*/getGlobal("CURRENT_USER"),
								 /*pAsrcCode=>*/gotcmmeElement.getGotcmmeAsrcCode(),
								 /*pDeliveryPoint=>*/NNumber.getNull(),
								 /*pCorrectionDigit=>*/NNumber.getNull(),
								 /*pCarrierRoute=>*/NString.getNull(),
								 /*pGstTaxId=>*/NString.getNull(),
								 /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"),
								 /*pHouseNumber*/NString.getNull(),
								 /*pStreetLine4*/NString.getNull(),
								 /*pFinanceRules=>*/getGlobal("USE_FINANCE_RULES"), 
								 /*pSeqnoInout=>*/lvAddrSeqno, 
								 /*pRowidOut=>*/lvRowid);
				// 
				pAtypCodeOut.val = gotcmmeElement.getGotcmmeAtypCode();
				pAddrSeqnoOut.val = lvAddrSeqno.val;
				// 
				return ((GNls.Fget(toStr("GOAMTCH-0087"), toStr("FORM"), toStr(" Address record created;"))));
			}
			catch(Exception  e)
			{
				getFormModel().getFormHeader().setApiFailure(toStr("Y"));
				getFormModel().getFormHeader().setFCreateAddressErr(toStr("Y"));
				return ((getFormModel().getFormHeader().getAddrFailedLit()));
			}
		}

	
	/* Original PL/SQL code for Prog Unit F_CREATE_BIO
	
	FUNCTION F_CREATE_BIO (p_PIDM_IN  SPBPERS.SPBPERS_PIDM%TYPE,
                       p_BDATE_IN SPBPERS.SPBPERS_BIRTH_DATE%TYPE) RETURN VARCHAR2 IS
--
  lv_rowid       VARCHAR2(18);
  lv_msg         VARCHAR2(200) :=G$_NLS.Get('GOAMTCH-0088','FORM', ' Biographical record created;'); 
--
BEGIN
  GB_BIO.P_CREATE(p_PIDM            =>p_PIDM_IN,
                  p_SSN             =>:GOTCMME.GOTCMME_SSN,
                  p_BIRTH_DATE      =>p_BDATE_IN,
                  p_SEX             =>:GOTCMME.GOTCMME_SEX,
                  p_DATA_ORIGIN     =>:GLOBAL.DATA_ORIGIN,
                  p_USER_ID         =>:GLOBAL.CURRENT_USER,
                  p_ROWID_OUT       =>lv_rowid);
--
  IF :GOTCMME.GOTCMME_ENTITY_CDE = 'C' THEN
    lv_msg := G$_NLS.Get('GOAMTCH-0089','FORM', 'Warning - Biographical Information was created for a Non Person;');
  END IF;
--
  RETURN(lv_msg);
--
EXCEPTION
 	WHEN OTHERS THEN
 	  :FORM_HEADER.API_FAILURE := 'Y';
 	  :FORM_HEADER.F_CREATE_BIO_ERR := 'Y';
 	  RETURN(G$_NLS.Get('GOAMTCH-0090','FORM',' Biographical record create failed;'));
END;
	*/
	//ID:1811
	/* <p>
		 </p>
		* @param pPidmIn
		* @param pBdateIn
		*/
		public NString fCreateBio(GotcmmeAdapter gotcmmeElement, NNumber pPidmIn, NDate pBdateIn)
		{
			// 
			Ref<byte[]> lvRowid= new Ref<byte[]>();
			NString lvMsg = GNls.Fget(toStr("GOAMTCH-0088"), toStr("FORM"), toStr(" Biographical record created;"));
			try
			{
				GbBio.pCreate(/*pPidm=>*/pPidmIn, 
							 /*pSsn=>*/gotcmmeElement.getGotcmmeSsn(), 
							 /*pBirthDate=>*/pBdateIn,
							 /*pLgcyCode=>*/NString.getNull(),
							 /*pEthnCode=>*/NString.getNull(),
							 /*pMrtlCode=>*/NString.getNull(),
							 /*pRelgCode=>*/NString.getNull(),
							 /*pSex=>*/gotcmmeElement.getGotcmmeSex(),
							 /*pConfidInd=>*/toStr("N"),
							 /*pDeadInd=>*/NString.getNull(),
							 /*pVetcFileNumber=>*/NString.getNull(),
							 /*pLegalName=>*/NString.getNull(),
							 /*pPrefFirstName=>*/NString.getNull(),
							 /*pNamePrefix=>*/NString.getNull(),
							 /*pNameSuffix=>*/NString.getNull(),
							 /*pVeraInd=>*/NString.getNull(),
							 /*pDeadDate*/NDate.getNull(),
							 /*pCitzCode*/NString.getNull(),
							 /*pActiveDutySeprDate=>*/NDate.getNull(),
							 /*pSdvetInd=>*/NString.getNull(),
							 /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), 
							 /*pUserId=>*/getGlobal("CURRENT_USER"),
							 /*pEthnCode=>*/NString.getNull(),
							 /*pConfirmedReCde=>*/NString.getNull(),
							 /*pConfirmedReDate*/NDate.getNull(),
							 /*pArmedServMedVetInd*/toStr("N"),
							 /*pRowidOut=>*/lvRowid);
				// 
				if ( gotcmmeElement.getGotcmmeEntityCde().equals("C") )
				{
					lvMsg = GNls.Fget(toStr("GOAMTCH-0089"), toStr("FORM"), toStr("Warning - Biographical Information was created for a Non Person;"));
				}
				// 
				return lvMsg;
			}
			catch(Exception  e)
			{
				getFormModel().getFormHeader().setApiFailure(toStr("Y"));
				getFormModel().getFormHeader().setFCreateBioErr(toStr("Y"));
				return ((GNls.Fget(toStr("GOAMTCH-0090"), toStr("FORM"), toStr(" Biographical record create failed;"))));
			}
		}

	
	/* Original PL/SQL code for Prog Unit F_CM_UPDATE_EMAIL
	
	--
-- Process the GOREMAL items.
--
FUNCTION F_CM_UPDATE_EMAIL (p_PIDM_IN SPRIDEN.SPRIDEN_PIDM%TYPE) RETURN VARCHAR2 IS
  lv_rowid       VARCHAR2(18);
  lv_status_msg  VARCHAR2(2000);
--
  lv_email_ref     GB_EMAIL.EMAIL_REF;
  lv_email_rec     GB_EMAIL.EMAIL_REC;
--
BEGIN
  IF :GOTCMME.GOTCMME_EMAL_CODE IS NOT NULL AND
  	 :GOTCMME.GOTCMME_EMAIL_ADDRESS IS NOT NULL THEN
--
-- Determine if the record already exist.
--
    lv_email_ref := GB_EMAIL.F_QUERY_ALL(p_PIDM          =>p_PIDM_IN,
                                         p_EMAL_CODE     =>:GOTCMME.GOTCMME_EMAL_CODE,
                                         p_EMAIL_ADDRESS =>'');
--
    LOOP
      FETCH lv_email_ref INTO lv_email_rec;
      EXIT WHEN lv_email_ref%NOTFOUND;
--
      IF UPPER(lv_email_rec.r_email_address) = UPPER(:GOTCMME.GOTCMME_EMAIL_ADDRESS) THEN
        RETURN(G$_NLS.Get('GOAMTCH-0091','FORM','E-mail not updated.'));
      END IF;
    END LOOP;
--
-- Create new e-mail.
--
    RETURN(F_CREATE_EMAIL(p_PIDM_IN));
--
  ELSE
    RETURN(G$_NLS.Get('GOAMTCH-0092','FORM','E-mail not updated.'));
  END IF;
END;
	*/
	//ID:1812
	/* <p>
		* 
		*  Process the GOREMAL items.
		* 
	 </p>
		* @param pPidmIn
		*/
		public NString fCmUpdateEmail(GotcmmeAdapter gotcmmeElement, NNumber pPidmIn)
		{
			NString lvRowid= NString.getNull();
			NString lvStatusMsg= NString.getNull();
			// 
			Cursor lvEmailRef= null;
			GbEmail.EmailRecRow lvEmailRec= null;
			if ( !gotcmmeElement.getGotcmmeEmalCode().isNull() && !gotcmmeElement.getGotcmmeEmailAddress().isNull() )
			{
				// 
				//  Determine if the record already exist.
				// 
				lvEmailRef = GbEmail.fQueryAll(/*pPidm=>*/pPidmIn, /*pEmalCode=>*/gotcmmeElement.getGotcmmeEmalCode(), /*pEmailAddress=>*/toStr(""));
				// 
				while (true) {
					List<Row> lvEmailRefResults = lvEmailRef.getRows();
					if ( lvEmailRefResults != null ) {
						lvEmailRec =  new GbEmail.EmailRecRow(lvEmailRefResults.get(0));
					}
					if ( lvEmailRef.getRows().isEmpty()) 
						break;
					// 
					if ( upper(lvEmailRec.REmailAddress).equals(upper(gotcmmeElement.getGotcmmeEmailAddress())) )
					{
						return ((GNls.Fget(toStr("GOAMTCH-0091"), toStr("FORM"), toStr("E-mail not updated."))));
					}
				}
				// 
				//  Create new e-mail.
				// 
				return ((fCreateEmail(gotcmmeElement, pPidmIn)));
			}
			else {
				return ((GNls.Fget(toStr("GOAMTCH-0092"), toStr("FORM"), toStr("E-mail not updated."))));
			}
		}

	
	/* Original PL/SQL code for Prog Unit F_CREATE_EMAIL
	
	FUNCTION F_CREATE_EMAIL (p_PIDM_IN SPRIDEN.SPRIDEN_PIDM%TYPE) RETURN VARCHAR2 IS
--
  lv_rowid       VARCHAR2(18);
--
BEGIN
  GB_EMAIL.P_CREATE(p_PIDM          =>p_PIDM_IN,
                    p_EMAL_CODE     =>:GOTCMME.GOTCMME_EMAL_CODE,
                    p_EMAIL_ADDRESS =>:GOTCMME.GOTCMME_EMAIL_ADDRESS,
                    p_STATUS_IND    =>'A',
                    p_PREFERRED_IND =>'N',
                    p_USER_ID       =>:GLOBAL.CURRENT_USER,
                    p_DISP_WEB_IND  =>'Y',
                    p_DATA_ORIGIN   =>:GLOBAL.DATA_ORIGIN,
                    p_ROWID_OUT     =>lv_rowid);
--
  RETURN(G$_NLS.Get('GOAMTCH-0093','FORM','E-mail record created.'));
--
EXCEPTION
 	WHEN OTHERS THEN
 	  :FORM_HEADER.API_FAILURE := 'Y';
 	  :FORM_HEADER.F_CREATE_EMAIL_ERR := 'Y';
 	  RETURN(G$_NLS.Get('GOAMTCH-0094','FORM','E-mail record create failed.'));
END;
	*/
	//ID:1813
	/* <p>
	 </p>
		* @param pPidmIn
		*/
		public NString fCreateEmail(GotcmmeAdapter gotcmmeElement, NNumber pPidmIn)
		{
			// 
			Ref<byte[]> lvRowid= new Ref<byte[]>();
			try
			{
				GbEmail.pCreate(/*pPidm=>*/pPidmIn, 
								/*pEmalCode=>*/gotcmmeElement.getGotcmmeEmalCode(), 
								/*pEmailAddress=>*/gotcmmeElement.getGotcmmeEmailAddress(), 
								/*pStatusInd=>*/toStr("A"), 
								/*pPreferredInd=>*/toStr("N"), 
								/*pUserId=>*/getGlobal("CURRENT_USER"),
								/*pComment=>*/NString.getNull(),
								/*pDispWebInd=>*/toStr("Y"), 
								/*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), 
								/*pRowidOut=>*/lvRowid);
				// 
				return ((GNls.Fget(toStr("GOAMTCH-0093"), toStr("FORM"), toStr("E-mail record created."))));
			}
			catch(Exception  e)
			{
				getFormModel().getFormHeader().setApiFailure(toStr("Y"));
				getFormModel().getFormHeader().setFCreateEmailErr(toStr("Y"));
				return ((GNls.Fget(toStr("GOAMTCH-0094"), toStr("FORM"), toStr("E-mail record create failed."))));
			}
		}

	
	/* Original PL/SQL code for Prog Unit F_CM_UPDATE_TELEPHONE
	
	--
-- Process the SPRTELE items.
--
FUNCTION F_CM_UPDATE_TELEPHONE (p_PIDM_IN       SPRIDEN.SPRIDEN_PIDM%TYPE,
                                p_ATYP_CODE_IN  SPRADDR.SPRADDR_ATYP_CODE%TYPE,
                                p_ADDR_SEQNO_IN SPRADDR.SPRADDR_SEQNO%TYPE) RETURN VARCHAR2 IS
--
  lv_primary_ind SPRTELE.SPRTELE_PRIMARY_IND%TYPE := '';
  lv_rowid       VARCHAR2(18);
  lv_tele_seqno  SPRTELE.SPRTELE_SEQNO%TYPE;
--
  lv_telephone_ref     GB_TELEPHONE.TELEPHONE_REF;
  lv_telephone_rec     GB_TELEPHONE.TELEPHONE_REC;
--
BEGIN
  IF :GOTCMME.GOTCMME_TELE_CODE IS NOT NULL AND
     (:GOTCMME.GOTCMME_PHONE_AREA   IS NOT NULL OR
      :GOTCMME.GOTCMME_PHONE_NUMBER IS NOT NULL OR
      :GOTCMME.GOTCMME_PHONE_EXT    IS NOT NULL) THEN
--
-- Determine if the record already exist.
--
    lv_telephone_ref := GB_TELEPHONE.F_QUERY_ALL(p_PIDM       =>p_PIDM_IN,
                                                 p_TELE_CODE  =>:GOTCMME.GOTCMME_TELE_CODE,
                                                 p_SEQNO      =>'');
--
    LOOP
      FETCH lv_telephone_ref INTO lv_telephone_rec;
      EXIT WHEN lv_telephone_ref%NOTFOUND;
--
      IF NVL(lv_telephone_rec.r_phone_area,'*')   = NVL(:GOTCMME.GOTCMME_PHONE_AREA,'*') AND
         NVL(lv_telephone_rec.r_phone_number,'*') = NVL(:GOTCMME.GOTCMME_PHONE_NUMBER,'*') AND
         NVL(lv_telephone_rec.r_phone_ext,'*')    = NVL(:GOTCMME.GOTCMME_PHONE_EXT,'*') THEN
        RETURN(' Telephone not updated.');
      END IF;
    END LOOP;
--
-- Create new telephone.
--
    RETURN(F_CREATE_TELEPHONE(p_PIDM_IN, p_ATYP_CODE_IN, 
                              p_ADDR_SEQNO_IN, lv_primary_ind));
--
  ELSE
    RETURN(G$_NLS.Get('GOAMTCH-0095','FORM','Telephone not updated.'));
  END IF;
END;
	*/
	//ID:1814
	/* <p>
		* 
		*  Process the SPRTELE items.
		* 
		 </p>
		* @param pPidmIn
		* @param pAtypCodeIn
		* @param pAddrSeqnoIn
		*/
		public NString fCmUpdateTelephone(GotcmmeAdapter gotcmmeElement, NNumber pPidmIn, NString pAtypCodeIn, NNumber pAddrSeqnoIn)
		{
			// 
			NString lvPrimaryInd = toStr("");
			NString lvRowid= NString.getNull();
			NNumber lvTeleSeqno= NNumber.getNull();
			// 
			Cursor lvTelephoneRef= null;
			GbTelephone.TelephoneRecRow lvTelephoneRec= null;
			if ( !gotcmmeElement.getGotcmmeTeleCode().isNull() && (!gotcmmeElement.getGotcmmePhoneArea().isNull() || !gotcmmeElement.getGotcmmePhoneNumber().isNull() || !gotcmmeElement.getGotcmmePhoneExt().isNull()) )
			{
				// 
				//  Determine if the record already exist.
				// 
				lvTelephoneRef = GbTelephone.fQueryAll(/*pPidm=>*/pPidmIn, /*pTeleCode=>*/gotcmmeElement.getGotcmmeTeleCode(), toNumber(/*pSeqno=>*/""));
				// 
				while (true) {
					List<Row> lvTelephoneRefResults = lvTelephoneRef.getRows();
					if ( lvTelephoneRefResults != null ) {
						lvTelephoneRec =  new GbTelephone.TelephoneRecRow(lvTelephoneRefResults.get(0));
					}
					if ( lvTelephoneRef.getRows().isEmpty() ) 
						break;
					// 
					if ( isNull(lvTelephoneRec.RPhoneArea, "*").equals(isNull(gotcmmeElement.getGotcmmePhoneArea(), "*")) && isNull(lvTelephoneRec.RPhoneNumber, "*").equals(isNull(gotcmmeElement.getGotcmmePhoneNumber(), "*")) && isNull(lvTelephoneRec.RPhoneExt, "*").equals(isNull(gotcmmeElement.getGotcmmePhoneExt(), "*")) )
					{
						return  toStr(((" Telephone not updated.")));
					}
				}
				// 
				//  Create new telephone.
				// 
				return ((fCreateTelephone(gotcmmeElement, pPidmIn, pAtypCodeIn, pAddrSeqnoIn, lvPrimaryInd)));
			}
			else {
				return ((GNls.Fget(toStr("GOAMTCH-0095"), toStr("FORM"), toStr("Telephone not updated."))));
			}
		}

	
	/* Original PL/SQL code for Prog Unit F_CREATE_TELEPHONE
	
	FUNCTION F_CREATE_TELEPHONE (p_PIDM_IN         SPRIDEN.SPRIDEN_PIDM%TYPE,
                             p_ATYP_CODE_IN    SPRADDR.SPRADDR_ATYP_CODE%TYPE,
                             p_ADDR_SEQNO_IN   SPRADDR.SPRADDR_SEQNO%TYPE,
                             p_PRIMARY_IND_IN  SPRTELE.SPRTELE_PRIMARY_IND%TYPE) RETURN VARCHAR2 IS
--
  lv_rowid       VARCHAR2(18);
  lv_tele_seqno  SPRTELE.SPRTELE_SEQNO%TYPE;
--
BEGIN
  GB_TELEPHONE.P_CREATE(p_PIDM         =>p_PIDM_IN,
                        p_TELE_CODE    =>:GOTCMME.GOTCMME_TELE_CODE,
                        p_PHONE_AREA   =>:GOTCMME.GOTCMME_PHONE_AREA,
                        p_PHONE_NUMBER =>:GOTCMME.GOTCMME_PHONE_NUMBER,
                        p_PHONE_EXT    =>:GOTCMME.GOTCMME_PHONE_EXT,
                        p_ATYP_CODE    =>p_ATYP_CODE_IN,
                        p_ADDR_SEQNO   =>p_ADDR_SEQNO_IN,
                        p_PRIMARY_IND  =>p_PRIMARY_IND_IN,
                        p_DATA_ORIGIN  =>:GLOBAL.DATA_ORIGIN,
                        p_USER_ID      =>:GLOBAL.CURRENT_USER,
                        p_SEQNO_OUT    =>lv_tele_seqno,
                        p_ROWID_OUT    =>lv_rowid);
--
  RETURN(G$_NLS.Get('GOAMTCH-0096','FORM','Telephone record created;'));
--
EXCEPTION
 	WHEN OTHERS THEN
 	  :FORM_HEADER.API_FAILURE := 'Y';
 	  :FORM_HEADER.F_CREATE_TELEPHONE_ERR := 'Y';
 	  RETURN(G$_NLS.Get('GOAMTCH-0097','FORM','Telephone record create failed;'));
END;
	*/
	//ID:1815
	/* <p>
	 </p>
		* @param pPidmIn
		* @param pAtypCodeIn
		* @param pAddrSeqnoIn
		* @param pPrimaryIndIn
		*/
		public NString fCreateTelephone(GotcmmeAdapter gotcmmeElement, NNumber pPidmIn, NString pAtypCodeIn, NNumber pAddrSeqnoIn, NString pPrimaryIndIn)
		{
			// 
			Ref<byte[]> lvRowid= new Ref<byte[]>();
			Ref<NNumber> lvTeleSeqno= new Ref<NNumber>(NNumber.getNull());
			try
			{
				GbTelephone.pCreate(/*pPidm=>*/pPidmIn, 
									/*pTeleCode=>*/gotcmmeElement.getGotcmmeTeleCode(), 
									/*pPhoneArea=>*/gotcmmeElement.getGotcmmePhoneArea(), 
									/*pPhoneNumber=>*/gotcmmeElement.getGotcmmePhoneNumber(), 
									/*pPhoneExt=>*/gotcmmeElement.getGotcmmePhoneExt(),
									/*pStatusInd=>*/NString.getNull(),
									/*pAtypCode=>*/pAtypCodeIn, 
									/*pAddrSeqno=>*/pAddrSeqnoIn, 
									/*pPrimaryInd=>*/pPrimaryIndIn, 
									/*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), 
									/*pUserId=>*/getGlobal("CURRENT_USER"),
									/*pCtryCodePhone=>*/NString.getNull(),
									/*pSeqnoOut=>*/lvTeleSeqno, 
									/*pRowidOut=>*/lvRowid);
				// 
				return ((GNls.Fget(toStr("GOAMTCH-0096"), toStr("FORM"), toStr("Telephone record created;"))));
			}
			catch(Exception  e)
			{
				getFormModel().getFormHeader().setApiFailure(toStr("Y"));
				getFormModel().getFormHeader().setFCreateTelephoneErr(toStr("Y"));
				return ((GNls.Fget(toStr("GOAMTCH-0097"), toStr("FORM"), toStr("Telephone record create failed;"))));
			}
		}

	
	/* Original PL/SQL code for Prog Unit CLEAR_MATCH_BLOCK
	
	PROCEDURE CLEAR_MATCH_BLOCK IS
BEGIN
  IF GET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CLEAR_MATCH_BTN',ENABLED) = 'FALSE' THEN
  	
  	G$_INVALID_FUNCTION_MSG;
  ELSE
    :FORM_HEADER.HOLD_BLK_ITEM := '';
--
    REMOVE_CMRT_RECORDS;
    CLEAR_BLOCK(NO_VALIDATE);
-- 73-1  clear out the Matching Rule Sets
	  POP_GOVCMRT_MATCH_LIST;
  	G$_CHECK_FAILURE;
--
-- Navigate to the appropriate item based on source code type.
--
    IF :KEY_BLOCK.KEYBLOCK_ENTITY_CDE = 'C' THEN
      GO_ITEM('GOTCMME.NONPERSON_NAME');
    ELSIF :KEY_BLOCK.KEYBLOCK_ENTITY_CDE = 'P' THEN
      GO_ITEM('GOTCMME.LAST_NAME');
    ELSE
      IF GET_ITEM_PROPERTY('GOTCMME.LAST_NAME',ENABLED) = 'TRUE' THEN
        GO_ITEM('GOTCMME.LAST_NAME');
      ELSE
        GO_ITEM('GOTCMME.NONPERSON_NAME');
      END IF;
    END IF;
--
    EXECUTE_TRIGGER('RESET_TAB_PAGES');
  END IF;
END;
	*/
	//ID:1816
	/* <p>
	 </p>
		*/
		public void clearMatchBlock()
		{
			if ( getItemEnabled("BUTTON_CONTROL_BLOCK.CLEAR_MATCH_BTN").equals("FALSE") )
			{
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}
			else {
				getFormModel().getFormHeader().setHoldBlkItem(toStr(""));
				// 
				removeCmrtRecords();
				clearBlock(TaskServices.NO_VALIDATE);
				//  73-1  clear out the Matching Rule Sets
				popGovcmrtMatchList();
				getTask().getGoqrpls().gCheckFailure();
				// 
				//  Navigate to the appropriate item based on source code type.
				// 
				if ( getFormModel().getKeyBlock().getKeyblockEntityCde().equals("C") )
				{
					goItem(toStr("GOTCMME.NONPERSON_NAME"));
				}
				else if ( getFormModel().getKeyBlock().getKeyblockEntityCde().equals("P") ) {
					goItem(toStr("GOTCMME.LAST_NAME"));
				}
				else {
					if ( getItemEnabled("GOTCMME.LAST_NAME").equals("TRUE") )
					{
						goItem(toStr("GOTCMME.LAST_NAME"));
					}
					else {
						goItem(toStr("GOTCMME.NONPERSON_NAME"));
					}
				}
				// 
				executeAction("RESET_TAB_PAGES");
			}
		}

	
	/* Original PL/SQL code for Prog Unit CLEAR_SUSPENSE_BLOCK
	
	PROCEDURE CLEAR_SUSPENSE_BLOCK IS
BEGIN
  IF GET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.CLEAR_SUSPENSE_BTN',ENABLED) = 'FALSE' THEN  	
  	G$_INVALID_FUNCTION_MSG;
  ELSE
    :FORM_HEADER.DO_TAB_NAVIGATION := 'N';
    :FORM_HEADER.HOLD_BLK_ITEM := '';
--
    REMOVE_CMRT_RECORDS;
    CLEAR_BLOCK(NO_VALIDATE);
    --
    SYNCHRONIZE;    
--
    IF GET_TAB_PAGE_PROPERTY('MATCH_TAB',ENABLED) = 'TRUE' THEN
      GO_BLOCK('GOVCMRT_MATCH');
      CLEAR_BLOCK(NO_VALIDATE);
    END IF;
    -- 73-1  clear out the Matching Rule Sets
	  POP_GOVCMRT_MATCH_LIST;
  	G$_CHECK_FAILURE;
--
-- Navigate to the appropriate item based on source code type.
--
    IF :KEY_BLOCK.KEYBLOCK_ENTITY_CDE = 'C' THEN
      GO_ITEM('GOTCMME.NONPERSON_NAME');
    ELSIF :KEY_BLOCK.KEYBLOCK_ENTITY_CDE = 'P' THEN
      GO_ITEM('GOTCMME.LAST_NAME');
    ELSE
      IF GET_ITEM_PROPERTY('GOTCMME.LAST_NAME',ENABLED) = 'TRUE' THEN
        GO_ITEM('GOTCMME.LAST_NAME');
      ELSE
        GO_ITEM('GOTCMME.NONPERSON_NAME');
      END IF;
    END IF;
--
    EXECUTE_TRIGGER('RESET_TAB_PAGES');
    G$_CHECK_FAILURE;
    EXECUTE_TRIGGER('DISABLE_LOCAL_BTNS');
    G$_CHECK_FAILURE;
  END IF;
END;
	*/
	//ID:1817
	/* <p>
		</p>
		*/
		public void clearSuspenseBlock()
		{
			if ( getItemEnabled("BUTTON_CONTROL_BLOCK.CLEAR_SUSPENSE_BTN").equals("FALSE") )
			{
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}
			else {
				getFormModel().getFormHeader().setDoTabNavigation(toStr("N"));
				getFormModel().getFormHeader().setHoldBlkItem(toStr(""));
				// 
				removeCmrtRecords();
				clearBlock(TaskServices.NO_VALIDATE);
				// 
				
				
				// 
				if ( getTabPageEnabled("MATCH_TAB") /*.equals("TRUE"))*/ )
				{
					goBlock(toStr("GOVCMRT_MATCH"));
					clearBlock(TaskServices.NO_VALIDATE);
				}
				//  73-1  clear out the Matching Rule Sets
				popGovcmrtMatchList();
				getTask().getGoqrpls().gCheckFailure();
				// 
				//  Navigate to the appropriate item based on source code type.
				// 
				if ( getFormModel().getKeyBlock().getKeyblockEntityCde().equals("C") )
				{
					goItem(toStr("GOTCMME.NONPERSON_NAME"));
				}
				else if ( getFormModel().getKeyBlock().getKeyblockEntityCde().equals("P") ) {
					goItem(toStr("GOTCMME.LAST_NAME"));
				}
				else {
					if ( getItemEnabled("GOTCMME.LAST_NAME").equals("TRUE") )
					{
						goItem(toStr("GOTCMME.LAST_NAME"));
					}
					else {
						goItem(toStr("GOTCMME.NONPERSON_NAME"));
					}
				}
				// 
				executeAction("RESET_TAB_PAGES");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("DISABLE_LOCAL_BTNS");
				getTask().getGoqrpls().gCheckFailure();
			}
		}

	
	/* Original PL/SQL code for Prog Unit ENABLE_MATCH_TAB
	
	PROCEDURE ENABLE_MATCH_TAB IS
  lv_tab_id TAB_PAGE := FIND_TAB_PAGE('MATCH_TAB');
BEGIN
  IF GET_TAB_PAGE_PROPERTY(lv_tab_id,ENABLED) = 'FALSE' THEN
  	SET_TAB_PAGE_PROPERTY(lv_tab_id,ENABLED,PROPERTY_TRUE);	
  END IF;
END;

	*/
	//ID:1818
	/* <p>
/* </p>
		*/
		public void enableMatchTab()
		{
			TabPageDescriptor lvTabId = findTabPage("MATCH_TAB");
			if (!getTabPageEnabled(lvTabId))
			{
				setTabPageEnabled(lvTabId, true);
			}
		}

	
	/* Original PL/SQL code for Prog Unit ENABLE_SUSPENSE_TAB
	
	PROCEDURE ENABLE_SUSPENSE_TAB IS
  lv_tab_id TAB_PAGE := FIND_TAB_PAGE('GOVCMID');
BEGIN
  IF GET_TAB_PAGE_PROPERTY(lv_tab_id,ENABLED) = 'FALSE' THEN
    SET_TAB_PAGE_PROPERTY(lv_tab_id,ENABLED,PROPERTY_TRUE);	
  END IF;
END;

	*/
	//ID:1819
	/* <p>
/* </p>
		*/
		public void enableSuspenseTab()
		{
			TabPageDescriptor lvTabId = findTabPage("GOVCMID");
			if (!getTabPageEnabled(lvTabId))
			{
				setTabPageEnabled(lvTabId, true);
			}
		}

	
	/* Original PL/SQL code for Prog Unit DISABLE_MATCH_TAB
	
	PROCEDURE DISABLE_MATCH_TAB IS
  lv_tab_id TAB_PAGE := FIND_TAB_PAGE('MATCH_TAB');
BEGIN
  IF GET_TAB_PAGE_PROPERTY(lv_tab_id,ENABLED) = 'TRUE' THEN
    SET_TAB_PAGE_PROPERTY(lv_tab_id,ENABLED,PROPERTY_FALSE);	
  END IF;
END;

	*/
	//ID:1820
	/* <p>
/* </p>
		*/
		public void disableMatchTab()
		{
			TabPageDescriptor lvTabId = findTabPage("MATCH_TAB");
			if ( getTabPageEnabled(lvTabId))
			{
				setTabPageEnabled(lvTabId, false);
			}
		}

	
	/* Original PL/SQL code for Prog Unit DISABLE_SUSPENSE_TAB
	
	PROCEDURE DISABLE_SUSPENSE_TAB IS
  lv_tab_id TAB_PAGE := FIND_TAB_PAGE('GOVCMID');
BEGIN
  IF GET_TAB_PAGE_PROPERTY(lv_tab_id,ENABLED) = 'TRUE' THEN
    SET_TAB_PAGE_PROPERTY(lv_tab_id,ENABLED,PROPERTY_FALSE);	
  END IF;
END;
	*/
	//ID:1821
	/* <p>
/* </p>
		*/
		public void disableSuspenseTab()
		{
			TabPageDescriptor lvTabId = findTabPage("GOVCMID");
			if ( getTabPageEnabled(lvTabId))
			{
				setTabPageEnabled(lvTabId, false);
			}
		}

	
	/* Original PL/SQL code for Prog Unit ENABLE_DISABLE_NAME_ITEMS
	
	PROCEDURE ENABLE_DISABLE_NAME_ITEMS IS
BEGIN
  IF :KEY_BLOCK.KEYBLOCK_ENTITY_CDE = 'P' THEN
    ENABLE_PERSON;
    DISABLE_NONPERSON;
  ELSIF :KEY_BLOCK.KEYBLOCK_ENTITY_CDE = 'C' THEN
    ENABLE_NONPERSON;
    DISABLE_PERSON;
  ELSE
    ENABLE_PERSON;
    ENABLE_NONPERSON;
  END IF;
END;
	*/
	//ID:1822
	/* <p>
	</p>
		*/
		public void enableDisableNameItems()
		{
			if ( getFormModel().getKeyBlock().getKeyblockEntityCde().equals("P") )
			{
				enablePerson();
				disableNonperson();
			}
			else if ( getFormModel().getKeyBlock().getKeyblockEntityCde().equals("C") ) {
				enableNonperson();
				disablePerson();
			}
			else {
				enablePerson();
				enableNonperson();
			}
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_FIRST_NAME
	
	--
-- Verify first name since this is not required as part of search.
--
PROCEDURE CHECK_FIRST_NAME IS
BEGIN
  IF :GOTCMME.GOTCMME_ENTITY_CDE = 'P' THEN
  	IF :GOTCMME.GOTCMME_FIRST_NAME IS NULL THEN
      MESSAGE(G$_NLS.GET('GOAMTCH-0098','FORM','*ERROR* Cannot create a new person without a first name.'));
      RAISE FORM_TRIGGER_FAILURE;
  	END IF;
  END IF;
END;
	*/
	//ID:1823
	/* <p>
		* 
		*  Verify first name since this is not required as part of search.
		* 
		 </p>
		*/
		public void checkFirstName(GotcmmeAdapter gotcmmeElement)
		{
			if ( gotcmmeElement.getGotcmmeEntityCde().equals("P") )
			{
				if ( gotcmmeElement.getGotcmmeFirstName().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GOAMTCH-0098"), toStr("FORM"), toStr("*ERROR* Cannot create a new person without a first name.")));
					throw new ApplicationException();
				}
			}
		}

	
	/* Original PL/SQL code for Prog Unit ENABLE_DISABLE_IS_NONPERSON
	
	PROCEDURE ENABLE_DISABLE_IS_NONPERSON IS
BEGIN
  ENABLE_NONPERSON;
  DISABLE_PERSON;
END;
	*/
	//ID:1824
	/* <p>
		 </p>
		*/
		public void enableDisableIsNonperson()
		{
			enableNonperson();
			disablePerson();
		}

	
	/* Original PL/SQL code for Prog Unit ENABLE_DISABLE_IS_PERSON
	
	PROCEDURE ENABLE_DISABLE_IS_PERSON IS
BEGIN
  ENABLE_PERSON;
  DISABLE_NONPERSON;
END;
	*/
	//ID:1825
	/* <p>
	</p>
		*/
		public void enableDisableIsPerson()
		{
			enablePerson();
			disableNonperson();
		}

	
	/* Original PL/SQL code for Prog Unit ENABLE_PERSON
	
	PROCEDURE ENABLE_PERSON IS
BEGIN
  SET_ITEM_PROPERTY('GOTCMME.LAST_NAME',         ENABLED,   PROPERTY_TRUE);
  SET_ITEM_PROPERTY('GOTCMME.LAST_NAME',         NAVIGABLE, PROPERTY_TRUE);
  SET_ITEM_PROPERTY('GOTCMME.LAST_NAME',         UPDATEABLE,PROPERTY_TRUE);
--
  SET_ITEM_PROPERTY('GOTCMME.GOTCMME_FIRST_NAME',ENABLED,   PROPERTY_TRUE);
  SET_ITEM_PROPERTY('GOTCMME.GOTCMME_FIRST_NAME',NAVIGABLE, PROPERTY_TRUE);
  SET_ITEM_PROPERTY('GOTCMME.GOTCMME_FIRST_NAME',UPDATEABLE,PROPERTY_TRUE);
--
  SET_ITEM_PROPERTY('GOTCMME.GOTCMME_MI',        ENABLED,   PROPERTY_TRUE);
  SET_ITEM_PROPERTY('GOTCMME.GOTCMME_MI',        NAVIGABLE, PROPERTY_TRUE);
  SET_ITEM_PROPERTY('GOTCMME.GOTCMME_MI',        UPDATEABLE,PROPERTY_TRUE);
END;
	*/
	//ID:1826
	/* <p>
/* </p>
		*/
		public void enablePerson()
		{
			setItemEnabled("GOTCMME.LAST_NAME", true);
			setItemNavigable("GOTCMME.LAST_NAME", true);
			setItemUpdateAllowed("GOTCMME.LAST_NAME", true);
			// 
			setItemEnabled("GOTCMME.GOTCMME_FIRST_NAME", true);
			setItemNavigable("GOTCMME.GOTCMME_FIRST_NAME", true);
			setItemUpdateAllowed("GOTCMME.GOTCMME_FIRST_NAME", true);
			// 
			setItemEnabled("GOTCMME.GOTCMME_MI", true);
			setItemNavigable("GOTCMME.GOTCMME_MI", true);
			setItemUpdateAllowed("GOTCMME.GOTCMME_MI", true);
		}

	
	/* Original PL/SQL code for Prog Unit ENABLE_NONPERSON
	
	PROCEDURE ENABLE_NONPERSON IS
BEGIN
  SET_ITEM_PROPERTY('GOTCMME.NONPERSON_NAME',ENABLED,   PROPERTY_TRUE);
  SET_ITEM_PROPERTY('GOTCMME.NONPERSON_NAME',NAVIGABLE, PROPERTY_TRUE);
  SET_ITEM_PROPERTY('GOTCMME.NONPERSON_NAME',UPDATEABLE,PROPERTY_TRUE);
END;
	*/
	//ID:1827
	/* <p>
/* </p>
		*/
		public void enableNonperson()
		{
			setItemEnabled("GOTCMME.NONPERSON_NAME", true);
			setItemNavigable("GOTCMME.NONPERSON_NAME", true);
			setItemUpdateAllowed("GOTCMME.NONPERSON_NAME", true);
		}

	
	/* Original PL/SQL code for Prog Unit DISABLE_PERSON
	
	PROCEDURE DISABLE_PERSON IS
BEGIN
  SET_ITEM_PROPERTY('GOTCMME.LAST_NAME',ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('GOTCMME.GOTCMME_FIRST_NAME',ENABLED,  PROPERTY_FALSE);
  SET_ITEM_PROPERTY('GOTCMME.GOTCMME_MI',ENABLED,PROPERTY_FALSE);
END;
	*/
	//ID:1828
	/* <p>
/* </p>
		*/
		public void disablePerson()
		{
			setItemEnabled("GOTCMME.LAST_NAME", false);
			setItemEnabled("GOTCMME.GOTCMME_FIRST_NAME", false);
			setItemEnabled("GOTCMME.GOTCMME_MI", false);
		}

	
	/* Original PL/SQL code for Prog Unit DISABLE_NONPERSON
	
	PROCEDURE DISABLE_NONPERSON IS
BEGIN
  SET_ITEM_PROPERTY('GOTCMME.NONPERSON_NAME',ENABLED,PROPERTY_FALSE);
END;
	*/
	//ID:1829
	/* <p>
/* </p>
		*/
		public void disableNonperson()
		{
			setItemEnabled("GOTCMME.NONPERSON_NAME", false);
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
	//ID:1830
	/* <p>
		 </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit SET_GOVCMID_COUNT
	
	PROCEDURE SET_GOVCMID_COUNT (p_COUNT INTEGER) IS
BEGIN
  :FORM_HEADER.DO_TAB_NAVIGATION := 'N';
  IF p_COUNT IS NULL THEN
    SET_TAB_PAGE_PROPERTY('GOVCMID',LABEL,G$_NLS.Get('GOAMTCH-0099','FORM','Potential Matches'));
  ELSE
    --SET_TAB_PAGE_PROPERTY('GOVCMID',LABEL,'Potential Matches (' || TO_CHAR(p_COUNT) || ')');
    SET_TAB_PAGE_PROPERTY('GOVCMID',LABEL,G$_NLS.Get('GOAMTCH-0100','FORM','Potential Matches %01%',TO_CHAR(p_COUNT)));
  END IF;
END;
	*/
	//ID:1831
	/* <p>
		</p>
		* @param pCount
		*/
		public void setGovcmidCount(NInteger pCount)
		{
			getFormModel().getFormHeader().setDoTabNavigation(toStr("N"));
			if ( pCount.isNull() )
			{
				setTabPageLabel("GOVCMID", GNls.Fget(toStr("GOAMTCH-0099"), toStr("FORM"), toStr("Potential Matches")).getValue());
			}
			else {
				// SET_TAB_PAGE_PROPERTY('GOVCMID',LABEL,'Potential Matches (' || TO_CHAR(p_COUNT) || ')');
				setTabPageLabel("GOVCMID", GNls.Fget(toStr("GOAMTCH-0100"), toStr("FORM"), toStr("Potential Matches %01%"), toChar(pCount)).getValue());
			}
		}

	
	/* Original PL/SQL code for Prog Unit NAV_TO_GOVCMID_TAB
	
	PROCEDURE NAV_TO_GOVCMID_TAB IS
BEGIN
  GO_BLOCK('GOVCMID');
  EXECUTE_QUERY;
  EXECUTE_TRIGGER('COUNT_GOVCMID_TRG');
END;
	*/
	//ID:1832
	/* <p>
		</p>
		*/
		public void navToGovcmidTab()
		{
			goBlock(toStr("GOVCMID"));
			executeQuery();
			executeAction("COUNT_GOVCMID_TRG");
		}

	
	/* Original PL/SQL code for Prog Unit POP_GOVCMID_ADDRESS_LIST
	
	PROCEDURE POP_GOVCMID_ADDRESS_LIST IS
  lv_return_code  VARCHAR2(30);
BEGIN
  lv_return_code := POPULATE_GROUP('GOVCMID_ADDRESS_LIST_RG');
  CLEAR_LIST('GOVCMID.ADDRESS_LIST');
  POPULATE_LIST('GOVCMID.ADDRESS_LIST','GOVCMID_ADDRESS_LIST_RG');
END;
	*/
	//ID:1833
	/* <p>
		</p>
		*/
		public void popGovcmidAddressList()
		{
			NString lvReturnCode= NString.getNull();
			lvReturnCode = toStr((populateGroup("GOVCMID_ADDRESS_LIST_RG").getValue().toString()));
			clearList("GOVCMID.ADDRESS_LIST");
			populateList("GOVCMID.ADDRESS_LIST", "GOVCMID_ADDRESS_LIST_RG");
		}

	
	/* Original PL/SQL code for Prog Unit POP_GOVCMID_PRIORITY_LIST
	
	PROCEDURE POP_GOVCMID_PRIORITY_LIST IS
  lv_return_code  VARCHAR2(250);
BEGIN
  lv_return_code := POPULATE_GROUP('MATCH_PRIORITY_LIST_RG');
  CLEAR_LIST('GOVCMID.MATCH_PRIORITY_LIST');
  POPULATE_LIST('GOVCMID.MATCH_PRIORITY_LIST','MATCH_PRIORITY_LIST_RG');
END;
	*/
	//ID:1834
	/* <p>
		</p>
		*/
		public void popGovcmidPriorityList()
		{
			NString lvReturnCode= NString.getNull();
			lvReturnCode = toStr(populateGroup("MATCH_PRIORITY_LIST_RG").getValue().toString());
			clearList("GOVCMID.MATCH_PRIORITY_LIST");
			populateList("GOVCMID.MATCH_PRIORITY_LIST", "MATCH_PRIORITY_LIST_RG");
			
			NString firstValue = NString.getNull();
			if(!((ListDataDescriptor)findItem("GOVCMID.MATCH_PRIORITY_LIST")).getElements().isEmpty())
				firstValue = toStr(((ListDataDescriptor)findItem("GOVCMID.MATCH_PRIORITY_LIST")).getElements().get(0).getData());
			((GovcmidAdapter)getFormModel().getGovcmid().getRowAdapter()).setMatchPriorityList(firstValue);
		}

	
	/* Original PL/SQL code for Prog Unit POP_GOVCMID_PHONE_LIST
	
	PROCEDURE POP_GOVCMID_PHONE_LIST IS
  lv_return_code  VARCHAR2(30);
BEGIN
  lv_return_code := POPULATE_GROUP('GOVCMID_PHONE_LIST_RG');
  CLEAR_LIST('GOVCMID.PHONE_LIST');
  POPULATE_LIST('GOVCMID.PHONE_LIST','GOVCMID_PHONE_LIST_RG');
END;
	*/
	//ID:1835
	/* <p>
		</p>
		*/
		public void popGovcmidPhoneList()
		{
			NString lvReturnCode= NString.getNull();
			lvReturnCode = toStr(populateGroup("GOVCMID_PHONE_LIST_RG").getValue().toString());
			clearList("GOVCMID.PHONE_LIST");
			populateList("GOVCMID.PHONE_LIST", "GOVCMID_PHONE_LIST_RG");
		}

	
	/* Original PL/SQL code for Prog Unit POP_GOVCMID_EMAIL_LIST
	
	PROCEDURE POP_GOVCMID_EMAIL_LIST IS
  lv_return_code  VARCHAR2(30);
BEGIN
  lv_return_code := POPULATE_GROUP('GOVCMID_EMAIL_LIST_RG');
  CLEAR_LIST('GOVCMID.EMAIL_LIST');
  POPULATE_LIST('GOVCMID.EMAIL_LIST','GOVCMID_EMAIL_LIST_RG');
END;
	*/
	//ID:1836
	/* <p>
		</p>
		*/
		public void popGovcmidEmailList()
		{
			NString lvReturnCode= NString.getNull();
			lvReturnCode = toStr(populateGroup("GOVCMID_EMAIL_LIST_RG").getValue().toString());
			clearList("GOVCMID.EMAIL_LIST");
			populateList("GOVCMID.EMAIL_LIST", "GOVCMID_EMAIL_LIST_RG");
		}

	
	/* Original PL/SQL code for Prog Unit POPULATE_MATCH_ADDRESS_LIST
	
	PROCEDURE POPULATE_MATCH_ADDRESS_LIST IS
  lv_return_code  VARCHAR2(30);
BEGIN
  lv_return_code := POPULATE_GROUP('ADDRESS_MATCH_LIST_RG');
  CLEAR_LIST('GOVCMRT_MATCH.ADDRESS_LIST');
--
  POPULATE_LIST('GOVCMRT_MATCH.ADDRESS_LIST','ADDRESS_MATCH_LIST_RG');
END;
	*/
	//ID:1837
	/* <p>
		 </p>
		*/
		public void populateMatchAddressList()
		{
			NString lvReturnCode= NString.getNull();
			lvReturnCode = toStr(populateGroup("ADDRESS_MATCH_LIST_RG").getValue().toString());
			clearList("GOVCMRT_MATCH.ADDRESS_LIST");
			// 
			populateList("GOVCMRT_MATCH.ADDRESS_LIST", "ADDRESS_MATCH_LIST_RG");
		}

	
	/* Original PL/SQL code for Prog Unit F_POP_ADDR_HIER_GOVCMID
	
	FUNCTION F_POP_ADDR_HIER_GOVCMID (p_cm_code IN GTVCMSC.GTVCMSC_CODE%TYPE) RETURN VARCHAR2 IS
--
  lv_hier_address VARCHAR2(200) := '';
--
  lv_atyp_code    SPRADDR.SPRADDR_ATYP_CODE%TYPE;
  lv_addr_ref     GB_ADDRESS.ADDRESS_REF;
  lv_addr_rec     GB_ADDRESS.ADDRESS_REC;
--
  lv_cmdh_ref     GB_CM_DISP_HIER.CM_DISP_HIER_REF;
  lv_cmdh_rec     GB_CM_DISP_HIER.CM_DISP_HIER_REC;                                     
--
  CURSOR SPRADDR_BY_ROWID_C IS
       SELECT spraddr_atyp_code || '=' || spraddr_street_line1 || ' ' || spraddr_city || ' ' ||  
              spraddr_stat_code || ' ' ||  spraddr_zip
         FROM SPRADDR
        WHERE SPRADDR.ROWID = :GOVCMID.GOVCMRT_SPRADDR_ROWID;
--
  CURSOR SPRADDR_ACTIVE_BY_DATE_C IS
       SELECT S.spraddr_atyp_code || '=' || S.spraddr_street_line1 || ' ' || S.spraddr_city || ' ' ||  
              S.spraddr_stat_code || ' ' || S.spraddr_zip
         FROM SPRADDR S
        WHERE SYSDATE BETWEEN (NVL(S.SPRADDR_FROM_DATE,SYSDATE))
                          AND (NVL(S.SPRADDR_TO_DATE,SYSDATE))
          AND S.SPRADDR_STATUS_IND IS NULL
          AND S.SPRADDR_ATYP_CODE = lv_atyp_code
          AND S.SPRADDR_PIDM = :GOVCMID.GOVCMID_PIDM;
--
  CURSOR SPRADDR_ACTIVE_C IS
       SELECT spraddr_atyp_code || '=' || spraddr_street_line1 || ' ' || spraddr_city || ' ' ||  
              spraddr_stat_code || ' ' ||  spraddr_zip
         FROM SPRADDR
        WHERE SPRADDR.SPRADDR_STATUS_IND IS NULL
          AND SPRADDR.SPRADDR_ATYP_CODE = lv_atyp_code
          AND SPRADDR.SPRADDR_PIDM = :GOVCMID.GOVCMID_PIDM;
--
  CURSOR SPRADDR_INACTIVE_C IS
       SELECT '*' || spraddr_atyp_code || '=' || spraddr_street_line1 || ' ' || spraddr_city || ' ' ||  
              spraddr_stat_code || ' ' ||  spraddr_zip
         FROM SPRADDR
        WHERE SPRADDR.SPRADDR_STATUS_IND IS NOT NULL
          AND SPRADDR.SPRADDR_ATYP_CODE = lv_atyp_code
          AND SPRADDR.SPRADDR_PIDM = :GOVCMID.GOVCMID_PIDM;
--
BEGIN
-- matching address found in Common Matching package
  IF :GOVCMID.GOVCMRT_SPRADDR_ROWID IS NOT NULL THEN
    OPEN SPRADDR_BY_ROWID_C;
    FETCH SPRADDR_BY_ROWID_C INTO lv_hier_address;
    CLOSE SPRADDR_BY_ROWID_C; 
  ELSE
-- no matching address found; use GORCMSC hierarchy to get most recent match
    lv_cmdh_ref := GB_CM_DISP_HIER.f_query_all
                     (p_cmsc_code => p_cm_code,
                      p_hier_type => 'ATYP');
--
    <<CMDH_BY_DATE>>
    LOOP
      FETCH lv_cmdh_ref INTO lv_cmdh_rec;
      EXIT CMDH_BY_DATE WHEN lv_cmdh_ref%NotFound;
--
      lv_atyp_code := lv_cmdh_rec.r_hier_code;
--
      OPEN SPRADDR_ACTIVE_BY_DATE_C;
      FETCH SPRADDR_ACTIVE_BY_DATE_C INTO lv_hier_address;
--
      EXIT CMDH_BY_DATE WHEN SPRADDR_ACTIVE_BY_DATE_C%Found;
      CLOSE SPRADDR_ACTIVE_BY_DATE_C;
    END LOOP CMDH_BY_DATE;
--
    CLOSE lv_cmdh_ref;
--
    IF lv_hier_address IS NOT NULL THEN
      GOTO CLOSE_CURSORS;
    END IF;
--
--
    lv_cmdh_ref := GB_CM_DISP_HIER.f_query_all
                        (p_cmsc_code => p_cm_code,
                         p_hier_type => 'ATYP');
--
    <<CMDH_ACTIVE>>
    LOOP
      FETCH lv_cmdh_ref INTO lv_cmdh_rec;
      EXIT CMDH_ACTIVE WHEN lv_cmdh_ref%NotFound;
--
      lv_atyp_code := lv_cmdh_rec.r_hier_code;
--
      OPEN SPRADDR_ACTIVE_C;
      FETCH SPRADDR_ACTIVE_C INTO lv_hier_address;
      EXIT CMDH_ACTIVE WHEN SPRADDR_ACTIVE_C%Found;
      CLOSE SPRADDR_ACTIVE_C;
    END LOOP CMDH_ACTIVE;
--
    CLOSE lv_cmdh_ref;
--
    IF lv_hier_address IS NOT NULL THEN
      GOTO CLOSE_CURSORS;
    END IF;
--
--
    lv_cmdh_ref := GB_CM_DISP_HIER.f_query_all
                        (p_cmsc_code => p_cm_code,
                         p_hier_type => 'ATYP');
--
    <<CMDH_INACTIVE>>
    LOOP
      FETCH lv_cmdh_ref INTO lv_cmdh_rec;
      EXIT CMDH_INACTIVE WHEN lv_cmdh_ref%NotFound;
--
      lv_atyp_code := lv_cmdh_rec.r_hier_code;
--
      OPEN SPRADDR_INACTIVE_C;
      FETCH SPRADDR_INACTIVE_C INTO lv_hier_address;
      EXIT CMDH_INACTIVE WHEN SPRADDR_INACTIVE_C%Found;
      CLOSE SPRADDR_INACTIVE_C;
    END LOOP CMDH_INACTIVE;
--
    CLOSE lv_cmdh_ref;
--
    <<CLOSE_CURSORS>>
--
    IF SPRADDR_ACTIVE_BY_DATE_C%IsOpen THEN 
      CLOSE SPRADDR_ACTIVE_BY_DATE_C;
    END IF;
--
    IF SPRADDR_ACTIVE_C%IsOpen THEN 
      CLOSE SPRADDR_ACTIVE_C;
    END IF;
--
    IF SPRADDR_INACTIVE_C%IsOpen THEN 
      CLOSE SPRADDR_INACTIVE_C;
    END IF;
--
  END IF;
--
  IF lv_hier_address = '=   ' OR  lv_hier_address IS NULL THEN
    lv_hier_address := G$_NLS.GET('GOAMTCH-0101','FORM','No Matching or Hierarchical Address found');
  END IF;
--
  RETURN lv_hier_address;
--
EXCEPTION
  WHEN OTHERS THEN
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END;
	*/
	//ID:1838
	/* <p>
		</p>
		* @param pCmCode
		*/
		public NString fPopAddrHierGovcmid(GovcmidAdapter govcmidElement, NString pCmCode)
		{
			int rowCount = 0;
			// 
			NString lvHierAddress = toStr("");
			// 
			NString lvAtypCode= NString.getNull();
			UnknownTypes.GbAddressAddressRef lvAddrRef= null;
			GbAddress.AddressRecRow lvAddrRec= null;
			// 
			Cursor lvCmdhRef= null;
			GbCmDispHier.CmDispHierRecRow lvCmdhRec= null;
			String sqlspraddrByRowidC = "SELECT spraddr_atyp_code || '=' || spraddr_street_line1 || ' ' || spraddr_city || ' ' || spraddr_stat_code || ' ' || spraddr_zip " +
	" FROM SPRADDR " +
	" WHERE SPRADDR.ROWID = :GOVCMID_GOVCMRT_SPRADDR_ROWID ";
			DataCursor spraddrByRowidC = new DataCursor(sqlspraddrByRowidC);
			String sqlspraddrActiveByDateC = "SELECT S.spraddr_atyp_code || '=' || S.spraddr_street_line1 || ' ' || S.spraddr_city || ' ' || S.spraddr_stat_code || ' ' || S.spraddr_zip " +
	" FROM SPRADDR S " +
	" WHERE SYSDATE BETWEEN (NVL(S.SPRADDR_FROM_DATE, SYSDATE)) AND (NVL(S.SPRADDR_TO_DATE, SYSDATE)) AND S.SPRADDR_STATUS_IND IS NULL AND S.SPRADDR_ATYP_CODE = :P_LV_ATYP_CODE AND S.SPRADDR_PIDM = :GOVCMID_GOVCMID_PIDM ";
			DataCursor spraddrActiveByDateC = new DataCursor(sqlspraddrActiveByDateC);
			String sqlspraddrActiveC = "SELECT spraddr_atyp_code || '=' || spraddr_street_line1 || ' ' || spraddr_city || ' ' || spraddr_stat_code || ' ' || spraddr_zip " +
	" FROM SPRADDR " +
	" WHERE SPRADDR.SPRADDR_STATUS_IND IS NULL AND SPRADDR.SPRADDR_ATYP_CODE = :P_LV_ATYP_CODE AND SPRADDR.SPRADDR_PIDM = :GOVCMID_GOVCMID_PIDM ";
			DataCursor spraddrActiveC = new DataCursor(sqlspraddrActiveC);
			String sqlspraddrInactiveC = "SELECT '*' || spraddr_atyp_code || '=' || spraddr_street_line1 || ' ' || spraddr_city || ' ' || spraddr_stat_code || ' ' || spraddr_zip " +
	" FROM SPRADDR " +
	" WHERE SPRADDR.SPRADDR_STATUS_IND IS NOT NULL AND SPRADDR.SPRADDR_ATYP_CODE = :P_LV_ATYP_CODE AND SPRADDR.SPRADDR_PIDM = :GOVCMID_GOVCMID_PIDM ";
			DataCursor spraddrInactiveC = new DataCursor(sqlspraddrInactiveC);
			try {
				try
				{
					//  matching address found in Common Matching package
					if ( !govcmidElement.getGovcmrtSpraddrRowid().isNull() )
					{
						//Setting query parameters
						spraddrByRowidC.addParameter("GOVCMID_GOVCMRT_SPRADDR_ROWID", govcmidElement.getGovcmrtSpraddrRowid());
						spraddrByRowidC.open();
						ResultSet spraddrByRowidCResults = spraddrByRowidC.fetchInto();
						if ( spraddrByRowidCResults != null ) {
							lvHierAddress = spraddrByRowidCResults.getStr(0);
						}
						//spraddrByRowidC.close();
					}
					else {
						//  no matching address found; use GORCMSC hierarchy to get most recent match
						lvCmdhRef = GbCmDispHier.fQueryAll(/*pCmscCode=>*/pCmCode, /*pHierType=>*/toStr("ATYP"));
						// CMDH_BY_DATE:;
						while (true) {
							List<Row> lvCmdhRefResults = lvCmdhRef.getRows();
							if ( !lvCmdhRefResults.isEmpty() ) {
								lvCmdhRec =  new GbCmDispHier.CmDispHierRecRow(lvCmdhRefResults.get(0));
							}
							if ( lvCmdhRef.getRows().isEmpty() ) 
								break;
							// 
							lvAtypCode = lvCmdhRec.RHierCode;
							// 
							//Setting query parameters
							spraddrActiveByDateC.addParameter("P_LV_ATYP_CODE", lvAtypCode);
							spraddrActiveByDateC.addParameter("GOVCMID_GOVCMID_PIDM", govcmidElement.getGovcmidPidm());
							spraddrActiveByDateC.open();
							ResultSet spraddrActiveByDateCResults = spraddrActiveByDateC.fetchInto();
							if ( spraddrActiveByDateCResults != null ) {
								lvHierAddress = spraddrActiveByDateCResults.getStr(0);
							}
							// 
							if ( spraddrActiveByDateC.found() ) 
								break;
							//spraddrActiveByDateC.close();
						}
						// 
						//lvCmdhRef.close();
						// 
						if ( !lvHierAddress.isNull() )
						{
							 //goto CLOSE_CURSORS;
						}
						else{
							lvCmdhRef = GbCmDispHier.fQueryAll(/*pCmscCode=>*/pCmCode, /*pHierType=>*/toStr("ATYP"));
							// CMDH_ACTIVE:;
							while (true) {
								List<Row> lvCmdhRefResults = lvCmdhRef.getRows();
								if ( !lvCmdhRefResults.isEmpty() ) {
									lvCmdhRec =  new GbCmDispHier.CmDispHierRecRow(lvCmdhRefResults.get(0));
								}
								if ( lvCmdhRef.getRows().isEmpty() ) 
									break;
								// 
								lvAtypCode = lvCmdhRec.RHierCode;
								// 
								//Setting query parameters
								spraddrActiveC.addParameter("P_LV_ATYP_CODE", lvAtypCode);
								spraddrActiveC.addParameter("GOVCMID_GOVCMID_PIDM", govcmidElement.getGovcmidPidm());
								spraddrActiveC.open();
								ResultSet spraddrActiveCResults = spraddrActiveC.fetchInto();
								if ( spraddrActiveCResults != null ) {
									lvHierAddress = spraddrActiveCResults.getStr(0);
								}
								if ( spraddrActiveC.found() ) 
									break;
								//spraddrActiveC.close();
							}
							// 
							//lvCmdhRef.close();
							// 
							if ( !lvHierAddress.isNull() )
							{
								 //goto CLOSE_CURSORS;
							}
							else{
								lvCmdhRef = GbCmDispHier.fQueryAll(/*pCmscCode=>*/pCmCode, /*pHierType=>*/toStr("ATYP"));
								// CMDH_INACTIVE:;
								while (true) {
									List<Row> lvCmdhRefResults = lvCmdhRef.getRows();
									if ( !lvCmdhRefResults.isEmpty() ) {
										lvCmdhRec =  new GbCmDispHier.CmDispHierRecRow(lvCmdhRefResults.get(0));
									}
									if ( lvCmdhRef.getRows().isEmpty()) 
										break;
									// 
									lvAtypCode = lvCmdhRec.RHierCode;
									// 
									//Setting query parameters
									spraddrInactiveC.addParameter("P_LV_ATYP_CODE", lvAtypCode);
									spraddrInactiveC.addParameter("GOVCMID_GOVCMID_PIDM", govcmidElement.getGovcmidPidm());
									spraddrInactiveC.open();
									ResultSet spraddrInactiveCResults = spraddrInactiveC.fetchInto();
									if ( spraddrInactiveCResults != null ) {
										lvHierAddress = spraddrInactiveCResults.getStr(0);
									}
									if ( spraddrInactiveC.found() ) 
										break;
									//spraddrInactiveC.close();
								}
								// 
								//lvCmdhRef.close();
							}
						}
						// CLOSE_CURSORS:;
						/* since cursors are always closed when the finally clause is executed, there is no need to 
						 * check for open cursors to close
						 */
//						if ( spraddrActiveByDateC.isOpen() )
//						{
//							spraddrActiveByDateC.close();
//						}
//						// 
//						if ( spraddrActiveC.isOpen() )
//						{
//							spraddrActiveC.close();
//						}
//						// 
//						if ( spraddrInactiveC.isOpen() )
//						{
//							spraddrInactiveC.close();
//						}
					}
					// 
					if ( lvHierAddress.equals("=   ") || lvHierAddress.isNull() )
					{
						lvHierAddress = GNls.Fget(toStr("GOAMTCH-0101"), toStr("FORM"), toStr("No Matching or Hierarchical Address found"));
					}
					// 
					return lvHierAddress;
				}
				catch(Exception  e)
				{
					getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
				}finally{
					spraddrByRowidC.close();
					spraddrActiveByDateC.close();
					spraddrActiveC.close();
					spraddrInactiveC.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit POP_GOVCMRT_MATCH_LIST
	
	PROCEDURE POP_GOVCMRT_MATCH_LIST IS
  lv_return_code  VARCHAR2(250);
BEGIN
  lv_return_code := POPULATE_GROUP('MATCH_LIST_RG');
  CLEAR_LIST('GOVCMRT_MATCH.MATCH_LIST');
  POPULATE_LIST('GOVCMRT_MATCH.MATCH_LIST','MATCH_LIST_RG');
END;
	*/
	//ID:1839
	/* <p>
		 </p>
		*/
		public void popGovcmrtMatchList()
		{
			NString lvReturnCode= NString.getNull();
			lvReturnCode = toStr(populateGroup("MATCH_LIST_RG").getValue().toString());
			clearList("GOVCMRT_MATCH.MATCH_LIST");
			populateList("GOVCMRT_MATCH.MATCH_LIST", "MATCH_LIST_RG");
		}

	
	/* Original PL/SQL code for Prog Unit F_POP_PHONE_HIER_GOVCMID
	
	FUNCTION F_POP_PHONE_HIER_GOVCMID (p_cm_code IN GTVCMSC.GTVCMSC_CODE%TYPE)
  RETURN VARCHAR2 IS
--
  lv_hier_tele    VARCHAR2(120) := '';
--
  lv_tele_code    GORCMSC.GORCMSC_TELE_CODE%TYPE;
  lv_tele_ref     GB_TELEPHONE.TELEPHONE_REF;
  lv_tele_rec     GB_TELEPHONE.TELEPHONE_REC;
--
  lv_cmdh_ref     GB_CM_DISP_HIER.CM_DISP_HIER_REF;
  lv_cmdh_rec     GB_CM_DISP_HIER.CM_DISP_HIER_REC;
--
  CURSOR SPRTELE_BY_ROWID_C IS
    SELECT (SPRTELE_TELE_CODE ||'=' ||sprtele_phone_area 
            ||' '||sprtele_phone_number||' ' ||sprtele_phone_ext)
      FROM SPRTELE
     WHERE SPRTELE.ROWID = :GOVCMID.GOVCMRT_SPRTELE_ROWID;
--
  CURSOR SPRTELE_ACTIVE_C IS
    SELECT (SPRTELE_TELE_CODE ||'=' ||sprtele_phone_area 
            ||' '||sprtele_phone_number||' ' ||sprtele_phone_ext)
      FROM SPRTELE
     WHERE SPRTELE.SPRTELE_STATUS_IND IS NULL
       AND SPRTELE.SPRTELE_TELE_CODE = lv_tele_code
       AND SPRTELE.SPRTELE_PIDM = :GOVCMID.GOVCMID_PIDM;
--
  CURSOR SPRTELE_INACTIVE_C IS
    SELECT '*' || (SPRTELE_TELE_CODE ||'=' ||sprtele_phone_area 
            ||' '||sprtele_phone_number||' ' ||sprtele_phone_ext)
      FROM SPRTELE
     WHERE SPRTELE.SPRTELE_STATUS_IND IS NOT NULL
       AND SPRTELE.SPRTELE_TELE_CODE = lv_tele_code
       AND SPRTELE.SPRTELE_PIDM = :GOVCMID.GOVCMID_PIDM;
--
BEGIN
-- matching telephone found in Common Matching pacakge
--
  IF :GOVCMID.GOVCMRT_SPRTELE_ROWID IS NOT NULL THEN
    OPEN SPRTELE_BY_ROWID_C;
    FETCH SPRTELE_BY_ROWID_C INTO lv_hier_tele;
    CLOSE SPRTELE_BY_ROWID_C;
  ELSE
-- no matching address found; use GORCMSC hierarchy to match
    lv_cmdh_ref := GB_CM_DISP_HIER.f_query_all
                      (p_cmsc_code => p_cm_code,
                       p_hier_type => 'TELE');
--
    <<CMDH_ACTIVE>>
    LOOP
      FETCH lv_cmdh_ref INTO lv_cmdh_rec;
      EXIT CMDH_ACTIVE WHEN lv_cmdh_ref%NotFound;
--
      lv_tele_code := lv_cmdh_rec.r_hier_code;
--
      OPEN SPRTELE_ACTIVE_C;
      FETCH SPRTELE_ACTIVE_C INTO lv_hier_tele;
      EXIT CMDH_ACTIVE WHEN SPRTELE_ACTIVE_C%Found;
      CLOSE SPRTELE_ACTIVE_C;
    END LOOP CMDH_ACTIVE;
--
    CLOSE lv_cmdh_ref;
--
    IF lv_hier_tele IS NOT NULL THEN
      GOTO CLOSE_CURSORS;
    END IF;
--
--
    lv_cmdh_ref := GB_CM_DISP_HIER.f_query_all
                      (p_cmsc_code => p_cm_code,
                       p_hier_type => 'TELE');
--
    <<CMDH_INACTIVE>>
    LOOP
      FETCH lv_cmdh_ref INTO lv_cmdh_rec;
      EXIT CMDH_INACTIVE WHEN lv_cmdh_ref%NotFound;
--
      lv_tele_code := lv_cmdh_rec.r_hier_code;
--
      OPEN SPRTELE_INACTIVE_C;
      FETCH SPRTELE_INACTIVE_C INTO lv_hier_tele;
      EXIT CMDH_INACTIVE WHEN SPRTELE_INACTIVE_C%Found;
      CLOSE SPRTELE_INACTIVE_C;
    END LOOP CMDH_INACTIVE;
--
    CLOSE lv_cmdh_ref;
--
    <<CLOSE_CURSORS>>
--
    IF SPRTELE_ACTIVE_C%IsOpen THEN 
      CLOSE SPRTELE_ACTIVE_C;
    END IF;
--
    IF SPRTELE_INACTIVE_C%IsOpen THEN 
      CLOSE SPRTELE_INACTIVE_C;
    END IF;
--
  END IF;
--
  IF lv_hier_tele = '=   ' OR  lv_hier_tele IS NULL THEN
    lv_hier_tele := G$_NLS.Get('GOAMTCH-0102','FORM','No Matches');
  END IF;
--
  RETURN lv_hier_tele;
--
EXCEPTION
  WHEN OTHERS THEN
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END;
	*/
	//ID:1840
	/* <p>
		</p>
		* @param pCmCode
		*/
		public NString fPopPhoneHierGovcmid(GovcmidAdapter govcmidElement, NString pCmCode)
		{
			int rowCount = 0;
			// 
			NString lvHierTele = toStr("");
			// 
			NString lvTeleCode= NString.getNull();
			UnknownTypes.GbTelephoneTelephoneRef lvTeleRef= null;
			GbTelephone.TelephoneRecRow lvTeleRec= null;
			// 
			Cursor lvCmdhRef= null;
			GbCmDispHier.CmDispHierRecRow lvCmdhRec= null;
			String sqlsprteleByRowidC = "SELECT (SPRTELE_TELE_CODE || '=' || sprtele_phone_area || ' ' || sprtele_phone_number || ' ' || sprtele_phone_ext) " +
	" FROM SPRTELE " +
	" WHERE SPRTELE.ROWID = :GOVCMID_GOVCMRT_SPRTELE_ROWID ";
			DataCursor sprteleByRowidC = new DataCursor(sqlsprteleByRowidC);
			String sqlsprteleActiveC = "SELECT (SPRTELE_TELE_CODE || '=' || sprtele_phone_area || ' ' || sprtele_phone_number || ' ' || sprtele_phone_ext) " +
	" FROM SPRTELE " +
	" WHERE SPRTELE.SPRTELE_STATUS_IND IS NULL AND SPRTELE.SPRTELE_TELE_CODE = :P_LV_TELE_CODE AND SPRTELE.SPRTELE_PIDM = :GOVCMID_GOVCMID_PIDM ";
			DataCursor sprteleActiveC = new DataCursor(sqlsprteleActiveC);
			String sqlsprteleInactiveC = "SELECT '*' || (SPRTELE_TELE_CODE || '=' || sprtele_phone_area || ' ' || sprtele_phone_number || ' ' || sprtele_phone_ext) " +
	" FROM SPRTELE " +
	" WHERE SPRTELE.SPRTELE_STATUS_IND IS NOT NULL AND SPRTELE.SPRTELE_TELE_CODE = :P_LV_TELE_CODE AND SPRTELE.SPRTELE_PIDM = :GOVCMID_GOVCMID_PIDM ";
			DataCursor sprteleInactiveC = new DataCursor(sqlsprteleInactiveC);
			try {
				try
				{
					//  matching telephone found in Common Matching pacakge
					// 
					if ( !govcmidElement.getGovcmrtSprteleRowid().isNull() )
					{
						//Setting query parameters
						sprteleByRowidC.addParameter("GOVCMID_GOVCMRT_SPRTELE_ROWID", govcmidElement.getGovcmrtSprteleRowid());
						sprteleByRowidC.open();
						ResultSet sprteleByRowidCResults = sprteleByRowidC.fetchInto();
						if ( sprteleByRowidCResults != null ) {
							lvHierTele = sprteleByRowidCResults.getStr(0);
						}
						//sprteleByRowidC.close();
					}
					else {
						//  no matching address found; use GORCMSC hierarchy to match
						lvCmdhRef = GbCmDispHier.fQueryAll(/*pCmscCode=>*/pCmCode, /*pHierType=>*/toStr("TELE"));
						 //CMDH_ACTIVE:;
						while (true) {
							List<Row> lvCmdhRefResults = lvCmdhRef.getRows();
							if ( !lvCmdhRefResults.isEmpty() ) {
								lvCmdhRec =  new GbCmDispHier.CmDispHierRecRow(lvCmdhRefResults.get(0));
							}
							if ( lvCmdhRef.getRows().isEmpty() ) 
								break;
							// 
							lvTeleCode = lvCmdhRec.RHierCode;
							// 
							//Setting query parameters
							sprteleActiveC.addParameter("P_LV_TELE_CODE", lvTeleCode);
							sprteleActiveC.addParameter("GOVCMID_GOVCMID_PIDM", govcmidElement.getGovcmidPidm());
							sprteleActiveC.open();
							ResultSet sprteleActiveCResults = sprteleActiveC.fetchInto();
							if ( sprteleActiveCResults != null ) {
								lvHierTele = sprteleActiveCResults.getStr(0);
							}
							if ( sprteleActiveC.found() ) 
								break;
							//sprteleActiveC.close();
						}
						// 
						//lvCmdhRef.close();
						// 
						if ( !lvHierTele.isNull() )
						{
							 //goto CLOSE_CURSORS;
						}
						else{
							lvCmdhRef = GbCmDispHier.fQueryAll(/*pCmscCode=>*/pCmCode, /*pHierType=>*/toStr("TELE"));
							// CMDH_INACTIVE:;
							while (true) {
								List<Row> lvCmdhRefResults = lvCmdhRef.getRows();
								if ( !lvCmdhRefResults.isEmpty() ) {
									lvCmdhRec =  new GbCmDispHier.CmDispHierRecRow(lvCmdhRefResults.get(0));
								}
								if ( lvCmdhRef.getRows().isEmpty() ) 
									break;
								// 
								lvTeleCode = lvCmdhRec.RHierCode;
								// 
								//Setting query parameters
								sprteleInactiveC.addParameter("P_LV_TELE_CODE", lvTeleCode);
								sprteleInactiveC.addParameter("GOVCMID_GOVCMID_PIDM", govcmidElement.getGovcmidPidm());
								sprteleInactiveC.open();
								ResultSet sprteleInactiveCResults = sprteleInactiveC.fetchInto();
								if ( sprteleInactiveCResults != null ) {
									lvHierTele = sprteleInactiveCResults.getStr(0);
								}
								if ( sprteleInactiveC.found() ) 
									break;
								//sprteleInactiveC.close();
							}
							// 
							//lvCmdhRef.close();
						}
						// CLOSE_CURSORS:;
						// 
//						if ( sprteleActiveC.isOpen() )
//						{
//							sprteleActiveC.close();
//						}
//						// 
//						if ( sprteleInactiveC.isOpen() )
//						{
//							sprteleInactiveC.close();
//						}
					}
					// 
					if ( lvHierTele.equals("=   ") || lvHierTele.isNull() )
					{
						lvHierTele = GNls.Fget(toStr("GOAMTCH-0102"), toStr("FORM"), toStr("No Matches"));
					}
					// 
					return lvHierTele;
				}
				catch(Exception  e)
				{
					getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
				}finally{
					sprteleByRowidC.close();
					sprteleActiveC.close();
					sprteleInactiveC.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit F_POP_EMAIL_HIER_GOVCMID
	
	FUNCTION F_POP_EMAIL_HIER_GOVCMID (p_cm_code IN GTVCMSC.GTVCMSC_CODE%TYPE)
  RETURN VARCHAR2 IS
--
  lv_hier_emal VARCHAR2(150) := '';
--
  lv_emal_code    GORCMSC.GORCMSC_TELE_CODE%TYPE;
  lv_emal_ref     GB_EMAIL.EMAIL_REF;
  lv_emal_rec     GB_EMAIL.EMAIL_REC;
--
  lv_cmdh_ref     GB_CM_DISP_HIER.CM_DISP_HIER_REF;
  lv_cmdh_rec     GB_CM_DISP_HIER.CM_DISP_HIER_REC;
--
  CURSOR GOREMAL_BY_ROWID_C IS
    SELECT (GOREMAL_EMAL_CODE ||'='|| GOREMAL_EMAIL_ADDRESS)
      FROM GOREMAL
     WHERE GOREMAL.ROWID = :GOVCMID.GOVCMRT_GOREMAL_ROWID; 
--
  CURSOR GOREMAL_ACTIVE_C IS
    SELECT (GOREMAL_EMAL_CODE ||'='|| GOREMAL_EMAIL_ADDRESS)
      FROM GOREMAL
     WHERE GOREMAL.GOREMAL_STATUS_IND = 'A'
       AND GOREMAL.GOREMAL_EMAL_CODE = lv_emal_code
       AND GOREMAL.GOREMAL_PIDM = :GOVCMID.GOVCMID_PIDM;
--
  CURSOR GOREMAL_INACTIVE_C IS
    SELECT '*' || (GOREMAL_EMAL_CODE ||'='|| GOREMAL_EMAIL_ADDRESS)
      FROM GOREMAL
     WHERE GOREMAL.GOREMAL_STATUS_IND = 'I'
       AND GOREMAL.GOREMAL_EMAL_CODE = lv_emal_code
       AND GOREMAL.GOREMAL_PIDM = :GOVCMID.GOVCMID_PIDM;
--
BEGIN
-- matching e-mail found in Common Matching pacakge
  IF :GOVCMID.GOVCMRT_GOREMAL_ROWID IS NOT NULL THEN
    OPEN GOREMAL_BY_ROWID_C;
    FETCH GOREMAL_BY_ROWID_C INTO lv_hier_emal;
    CLOSE GOREMAL_BY_ROWID_C;
  ELSE
-- no matching e-mail found; use GORCMSC hierarchy to match
    lv_cmdh_ref := GB_CM_DISP_HIER.f_query_all
                      (p_cmsc_code => p_cm_code,
                       p_hier_type => 'EMAL');
--
    <<CMDH_ACTIVE>>
    LOOP
      FETCH lv_cmdh_ref INTO lv_cmdh_rec;
      EXIT CMDH_ACTIVE WHEN lv_cmdh_ref%NotFound;
--
      lv_emal_code := lv_cmdh_rec.r_hier_code;
--
      OPEN GOREMAL_ACTIVE_C;
      FETCH GOREMAL_ACTIVE_C INTO lv_hier_emal;
      EXIT CMDH_ACTIVE WHEN GOREMAL_ACTIVE_C%Found;
      CLOSE GOREMAL_ACTIVE_C;
    END LOOP CMDH_ACTIVE;
--
    CLOSE lv_cmdh_ref;
--
    IF lv_hier_emal IS NOT NULL THEN
      GOTO CLOSE_CURSORS;
    END IF;
--
--
    lv_cmdh_ref := GB_CM_DISP_HIER.f_query_all
                      (p_cmsc_code => p_cm_code,
                       p_hier_type => 'EMAL');
--
    <<CMDH_INACTIVE>>
    LOOP
      FETCH lv_cmdh_ref INTO lv_cmdh_rec;
      EXIT CMDH_INACTIVE WHEN lv_cmdh_ref%NotFound;
--
      lv_emal_code := lv_cmdh_rec.r_hier_code;
--
      OPEN GOREMAL_INACTIVE_C;
      FETCH GOREMAL_INACTIVE_C INTO lv_hier_emal;
      EXIT CMDH_INACTIVE WHEN GOREMAL_INACTIVE_C%Found;
      CLOSE GOREMAL_INACTIVE_C;
    END LOOP CMDH_INACTIVE;
--
    CLOSE lv_cmdh_ref;
--
    <<CLOSE_CURSORS>>
--
    IF GOREMAL_ACTIVE_C%IsOpen THEN 
      CLOSE GOREMAL_ACTIVE_C;
    END IF;
--
    IF GOREMAL_INACTIVE_C%IsOpen THEN 
      CLOSE GOREMAL_INACTIVE_C;
    END IF;
--
  END IF;
--
  IF lv_hier_emal = '=   ' OR  lv_hier_emal IS NULL THEN
    lv_hier_emal := G$_NLS.Get('GOAMTCH-0103','FORM','No Matches');
  END IF;
--
  RETURN lv_hier_emal;
--
EXCEPTION
  WHEN OTHERS THEN
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END;
	*/
	//ID:1841
	/* <p>
	 </p>
		* @param pCmCode
		*/
		public NString fPopEmailHierGovcmid(GovcmidAdapter govcmidElement, NString pCmCode)
		{
			int rowCount = 0;
			// 
			NString lvHierEmal = toStr("");
			// 
			NString lvEmalCode= NString.getNull();
			UnknownTypes.GbEmailEmailRef lvEmalRef= null;
			GbEmail.EmailRecRow lvEmalRec= null;
			// 
			Cursor lvCmdhRef= null;
			GbCmDispHier.CmDispHierRecRow lvCmdhRec= null;
			String sqlgoremalByRowidC = "SELECT (GOREMAL_EMAL_CODE || '=' || GOREMAL_EMAIL_ADDRESS) " +
	" FROM GOREMAL " +
	" WHERE GOREMAL.ROWID = :GOVCMID_GOVCMRT_GOREMAL_ROWID ";
			DataCursor goremalByRowidC = new DataCursor(sqlgoremalByRowidC);
			String sqlgoremalActiveC = "SELECT (GOREMAL_EMAL_CODE || '=' || GOREMAL_EMAIL_ADDRESS) " +
	" FROM GOREMAL " +
	" WHERE GOREMAL.GOREMAL_STATUS_IND = 'A' AND GOREMAL.GOREMAL_EMAL_CODE = :P_LV_EMAL_CODE AND GOREMAL.GOREMAL_PIDM = :GOVCMID_GOVCMID_PIDM ";
			DataCursor goremalActiveC = new DataCursor(sqlgoremalActiveC);
			String sqlgoremalInactiveC = "SELECT '*' || (GOREMAL_EMAL_CODE || '=' || GOREMAL_EMAIL_ADDRESS) " +
	" FROM GOREMAL " +
	" WHERE GOREMAL.GOREMAL_STATUS_IND = 'I' AND GOREMAL.GOREMAL_EMAL_CODE = :P_LV_EMAL_CODE AND GOREMAL.GOREMAL_PIDM = :GOVCMID_GOVCMID_PIDM ";
			DataCursor goremalInactiveC = new DataCursor(sqlgoremalInactiveC);
			try {
				try
				{
					//  matching e-mail found in Common Matching pacakge
					if ( !govcmidElement.getGovcmrtGoremalRowid().isNull() )
					{
						//Setting query parameters
						goremalByRowidC.addParameter("GOVCMID_GOVCMRT_GOREMAL_ROWID", govcmidElement.getGovcmrtGoremalRowid());
						goremalByRowidC.open();
						ResultSet goremalByRowidCResults = goremalByRowidC.fetchInto();
						if ( goremalByRowidCResults != null ) {
							lvHierEmal = goremalByRowidCResults.getStr(0);
						}
						//goremalByRowidC.close();
					}
					else {
						//  no matching e-mail found; use GORCMSC hierarchy to match
						lvCmdhRef = GbCmDispHier.fQueryAll(/*pCmscCode=>*/pCmCode, /*pHierType=>*/toStr("EMAL"));
						 //CMDH_ACTIVE:;
						while (true) {
							List<Row> lvCmdhRefResults = lvCmdhRef.getRows();
							if ( !lvCmdhRefResults.isEmpty() ) {
								lvCmdhRec =  new GbCmDispHier.CmDispHierRecRow(lvCmdhRefResults.get(0));
							}
							if ( lvCmdhRef.getRows().isEmpty() ) 
								break;
							// 
							lvEmalCode = lvCmdhRec.RHierCode;
							// 
							//Setting query parameters
							goremalActiveC.addParameter("P_LV_EMAL_CODE", lvEmalCode);
							goremalActiveC.addParameter("GOVCMID_GOVCMID_PIDM", govcmidElement.getGovcmidPidm());
							goremalActiveC.open();
							ResultSet goremalActiveCResults = goremalActiveC.fetchInto();
							if ( goremalActiveCResults != null ) {
								lvHierEmal = goremalActiveCResults.getStr(0);
							}
							if ( goremalActiveC.found() ) 
								break;
							//goremalActiveC.close();
						}
						// 
						//lvCmdhRef.close();
						// 
						if ( !lvHierEmal.isNull() )
						{
							 //goto CLOSE_CURSORS;
						}
						else{
								lvCmdhRef = GbCmDispHier.fQueryAll(/*pCmscCode=>*/pCmCode, /*pHierType=>*/toStr("EMAL"));
								// CMDH_INACTIVE:;
								while (true) {
									List<Row> lvCmdhRefResults = lvCmdhRef.getRows();
									if ( !lvCmdhRefResults.isEmpty() ) {
										lvCmdhRec =  new GbCmDispHier.CmDispHierRecRow(lvCmdhRefResults.get(0));
									}
									if ( lvCmdhRef.getRows().isEmpty() ) 
										break;
									// 
									lvEmalCode = lvCmdhRec.RHierCode;
									// 
									//Setting query parameters
									goremalInactiveC.addParameter("P_LV_EMAL_CODE", lvEmalCode);
									goremalInactiveC.addParameter("GOVCMID_GOVCMID_PIDM", govcmidElement.getGovcmidPidm());
									goremalInactiveC.open();
									ResultSet goremalInactiveCResults = goremalInactiveC.fetchInto();
									if ( goremalInactiveCResults != null ) {
										lvHierEmal = goremalInactiveCResults.getStr(0);
									}
									if ( goremalInactiveC.found() ) 
										break;
									//goremalInactiveC.close();
								}
								// 
								//lvCmdhRef.close();
						}
						 //CLOSE_CURSORS:;
						// 
//						if ( goremalActiveC.isOpen() )
//						{
//							goremalActiveC.close();
//						}
//						// 
//						if ( goremalInactiveC.isOpen() )
//						{
//							goremalInactiveC.close();
//						}
					}
					// 
					if ( lvHierEmal.equals("=   ") || lvHierEmal.isNull() )
					{
						lvHierEmal = GNls.Fget(toStr("GOAMTCH-0103"), toStr("FORM"), toStr("No Matches"));
					}
					// 
					return lvHierEmal;
				}
				catch(Exception  e)
				{
					getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
				}finally{
					goremalByRowidC.close();
					goremalActiveC.close();
					goremalInactiveC.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit POPULATE_MATCH_TELEPHONE_LIST
	
	PROCEDURE POPULATE_MATCH_TELEPHONE_LIST IS
  lv_return_code  VARCHAR2(30);
BEGIN
  lv_return_code := POPULATE_GROUP('PHONE_MATCH_LIST_RG');
  CLEAR_LIST('GOVCMRT_MATCH.PHONE_LIST');
--
  POPULATE_LIST('GOVCMRT_MATCH.PHONE_LIST','PHONE_MATCH_LIST_RG');
END;
	*/
	//ID:1842
	/* <p>
	 </p>
		*/
		public void populateMatchTelephoneList()
		{
			NString lvReturnCode= NString.getNull();
			lvReturnCode = toStr(populateGroup("PHONE_MATCH_LIST_RG").getValue().toString());
			clearList("GOVCMRT_MATCH.PHONE_LIST");
			// 
			populateList("GOVCMRT_MATCH.PHONE_LIST", "PHONE_MATCH_LIST_RG");
		}

	
	/* Original PL/SQL code for Prog Unit POPULATE_MATCH_EMAIL_LIST
	
	PROCEDURE POPULATE_MATCH_EMAIL_LIST IS
  lv_return_code  VARCHAR2(30);
BEGIN
  lv_return_code := POPULATE_GROUP('EMAIL_MATCH_LIST_RG');
  CLEAR_LIST('GOVCMRT_MATCH.EMAIL_LIST');
  POPULATE_LIST('GOVCMRT_MATCH.EMAIL_LIST','EMAIL_MATCH_LIST_RG');
END;
	*/
	//ID:1843
	/* <p>
		</p>
		*/
		public void populateMatchEmailList()
		{
			NString lvReturnCode= NString.getNull();
			lvReturnCode = toStr(populateGroup("EMAIL_MATCH_LIST_RG").getValue().toString());
			clearList("GOVCMRT_MATCH.EMAIL_LIST");
			populateList("GOVCMRT_MATCH.EMAIL_LIST", "EMAIL_MATCH_LIST_RG");
		}

	
	/* Original PL/SQL code for Prog Unit START_MATCHING_PROCESS
	
	PROCEDURE START_MATCHING_PROCESS IS
BEGIN
  DO_MATCHING_LOGIC;
  G$_CHECK_FAILURE;
-- 
-- Enable Data Entry Comments button only after query to prevent
-- navigation without commited rows.
--
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.SOURCE_COMMENT_BTN',ENABLED,PROPERTY_ON);
END;
	*/
	//ID:1844
	/* <p>
		 </p>
		*/
		public void startMatchingProcess(GotcmmeAdapter gotcmmeElement)
		{
			doMatchingLogic(gotcmmeElement);
			getTask().getGoqrpls().gCheckFailure();
			//  
			//  Enable Data Entry Comments button only after query to prevent
			//  navigation without commited rows.
			// 
			setItemEnabled("BUTTON_CONTROL_BLOCK.SOURCE_COMMENT_BTN", true);
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_4
	
	PROCEDURE AUDIT_TRAIL_7_4 IS
<multilinecomment> 
AUDIT TRAIL: 7.4
1.  G Shalovka  08 December 2005
    Hold for defect 1-I6RSK change to When-Tab-Page-Changed.
2.	George Shalovka  22 September 2006
		Correct 1-TTTLJ.
		Problem: When button 'Details' is pressed to display 
							'Additional Information Options', window does not clear 
							previously populated values when a different Key Block 
							'Matching Source' is entered.
		Solution:Modify trigger GORCMDO.When-New-BLock-Instance to clear
							block of old values before populating with new values.
3.	George Shalovka		04 October 2006
		Correct defect 1-12A0K3.
		Problem: Address edit requirements inconsistent with form SPAIDEN.
		Solution:Modify trigger CM_CREATE_NEW_ID_1 to require same set of
							form items as API GB_ADDRESS requires.
4.	George Shalovka		06 October 2006
		Correct defect CMS-DFCT103345.
		Problem:	Addresses not being updated corrected after update of existing ID.
		Solution:	Modify Program Unit F_CM_UPDATE_ADDRESS by adding new cursor to 
								find any current address by date and modify existing cursor to find 
								address sequence number for current address.
5.	George Shalovka		06 October 2006
		Correct defect 1-KUWC1.
		Problem:	Block 'Data Entry' form item 'ZIP or Postal Code' allows data
								entry in mixed case.
		Solution:	Modify form item GOTCMME.GOTCMME_ZIP Property Functional.Case Restriction 
								from 'Mixed' to 'Upper'.
6.	George Shalovka		09 November 2006
		Correct defect 1-199TKP.
		Problem:	Error on rollback the second time 'function not valid when called from another form'.
		Solution:	Remove calls to Program Unit CHECK_CLRFRM 
								from triggers GOTCMME.Key-ClrFrm and GOVCMRT_MATCH.Key-ClrFrm.  
							The check to verify that form GOAMTCH cannot perform updates 
							unless called directly from Main Menu (form GUAGMNU) is no longer needed.			
AUDIT TRAIL END
</multilinecomment>
BEGIN
null;
END;
	*/
	//ID:1845
	/* <p>
		</p>
		*/
		public void auditTrail74()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_I18N
	
	PROCEDURE AUDIT_TRAIL_8_0_I18N IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 I18N 
1. Michael Hitrik  06/28/2007
   This form has been modified to increase the bio-demographics fields 
   to support internationalization requirements. 
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS Property Class to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1846
	/* <p>
		 </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_SDE
	
	PROCEDURE AUDIT_TRAIL_8_0_SDE IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 SDE 
1. Michael Hitrik  06/28/2007
   This form has been modified to change W-N-R-I Execution Hierarchy to AFTER 
   to support SDE requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1847
	/* <p>
		 </p>
		*/
		public void auditTrail80Sde()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment> 
AUDIT TRAIL: 8.0 
1. George Shalovka  25 July 2007
   Migrated 7.4.1.1 modifications to 8.0.
   Defect 1-2JBCC5.
2. ShylajaS 2 August 2007
   In FORM.KEY_CLRFRM:Trigger and BLOCK:GOTCMME.KEY_CLRFRM trigger
   Commented: G$_INVALID_FUNCTION_MSG;     
   Added: MESSAGE(G$_NLS.GET('X','FORM','*ERROR* ID and Source cannot be changed.'));      
   Defect# 1-1V1V4D     
3. ShylajaS 16 Oct 2007
   Added G$_NLS.Get to support Internationalization requirement.
   Defect #1-1ADJKV    
4. Eapen Mani 26 October 2007
   Added G$_SSN_SET_ITEM_HINT in WHEN-NEW-FORM-INSTANCE trigger for Dynamic Hints.
   Added WHEN-VALIDATE-ITEM Trigger to GOTCMME_SSN item.  
5. TGKinderman  11/05/2007
   Modify in support of the SSN ID Lookup enhancement.
   Modify KEY_BLOCK.ID.WHEN-VALIDATE-ITEM:  If the SSN Search is enabled (GUBINST_SSN_SEARCH_ENABLED_IND is Y) throw
   an error if the entered ID is found to be an existing SSN.
6. LVH 01/28/2008
   The WHEN-VALIDATE-ITEM on GOTCMME.GOTCMME_SSN was calling G$_SSN_VALIDATE_MAX_LENGTH(:SYSTEM.CURSOR_ITEM)
   instead of G$_SSN_VALIDATE_MAX_LENGTH(:SYSTEM.TRIGGER_ITEM) which could generate an error if the 
   data in the field that the cursor was on was longer than the GUBINST_SSN_MAX_LENGTH value. 
   The trigger was changed so that the correct field is now being validated.
                                                     
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1848
	/* <p>
		</p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_4_1_1
	
	PROCEDURE AUDIT_TRAIL_7_4_1_1 IS
<multilinecomment> 
AUDIT TRAIL: 7.4.1.1
1. George Shalovka  02 March 2007
   Correct 1-i6r5k.
   Problem: When using mouse to navigate to tab 'Potential Matches' 
             currnt rows are not being queried.  Instead old rows 
             from prevcious match are displayed.  Using keystrokes 
             to navigate to block 'Potential Matches' works correctly.
   Solution:Modify trigger When-Tab-Page-Changed to remove IF statement
   	         using FORM_HEADER.DO_TAB_NAVIGATION.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1849
	/* <p>
		 </p>
		*/
		public void auditTrail7411()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1
	
	PROCEDURE AUDIT_TRAIL_8_1 IS
<multilinecomment>
AUDIT TRAIL: 8.1
1. Shriya Naidu 06/03/2008
   Defect : 1-3MKZPX, 1-3K6114
   Solution : ISC defect.Changed invalid message type like 'SQl','LIB' and 'form' to
   'FORM' in second G$_NLS.Get. argument.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1850
	/* <p>
		 </p>
		*/
		public void auditTrail81()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GOAMTCH
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Thu Jan 03 06:17:35 2013
-- MSGSIGN : #352e38030914302f
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:1851
	/* <p>
		 </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1_0_1
	
	PROCEDURE AUDIT_TRAIL_8_1_0_1 IS
<multilinecomment>
AUDIT TRAIL: 8.1.0.1
1. LvH 10/2/2008
   Defect   : 1-430PVS
   Solution : Changed G$NLS.Get variables used in equality checks to static variables.
2. LvH 11/24/2008
   Defect   : 1-2VR4VV
   Solution : Updated ADDRESS_MATCH_LIST_RG to include address type   

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1852
	/* <p>
		</p>
		*/
		public void auditTrail8101()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS
<multilinecomment>
AUDIT TRAIL: 8.2
1. LvH 11/25/2008
   a. Updated CM_CREATE_NEW_ID_2 to add in p_surname_prefix parameter to the call of 
      GB_IDENTIFICATION.P_CREATE.
   b. Updated F_CM_UPDATE_ADDRESS to add in p_ctry_code_phone, p_house_number and p_street_line4 
      parameters to the call of GB_ADDRESS_RULES.P_VALIDATE.
      
2. PSM 04/10/2009     
   DEFECT 1-43RRVA
   Trigger GLOBAL_COPY is modified inorder to set the value of global variable global.key_idno to "GENERATED", 
   when GOAMATCH is called from SHAEDIS and the value of global variable global.key_idno already exist in 
   Banner as a SSN number.This setting is done when SSN_SEARCH functionality is turned on.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:1853
	/* <p>
		</p>
		*/
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3_0_1
	
	PROCEDURE AUDIT_TRAIL_8_3_0_1 IS
<multilinecomment>
AUDIT TRAIL: 8.3.0.1
1. LvH 01/25/2010
   Defect 1-AI6UVE
   a. Modified GOVCMRT_MATCH.ADDRESS_LIST from a length of 30 to 90 
      and GOVCMRT_MATCH.MATCH_STREET_LINE1 from a length of 75 to 90 so that
      a match on a record having an address line 1 longer than 30 characters
      would work properly.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:1854
	/* <p>
		</p>
		*/
		public void auditTrail8301()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4
	
	PROCEDURE AUDIT_TRAIL_8_4 IS
<multilinecomment>
AUDIT TRAIL: 8.4
1. LvH 08/12/2010
   RPE 1-3IFYIX, 1-40EZO2, 1-45VUH5
   a. Modified GOVCMRT_MATCH.ADDRESS_LIST from a length of 90 to 176
   b. Modified lv_hier_emal from 120 to 150
   c. Modified CHECK_REQUIRED_ITEMS to not required ID / SSN / name if using
      a e-mail or phone for the primary search
   d. Removed the literal '-' from the phone number display
2. Defect 1-DPSB9R 
   LVH 10/13/2010
   a. Removed the G$_INVALID_FUNCTION_MSG and G$_NAVIGATION_FRAME that were included
      in the program units instead of being picked up from GOQRPLS.
3. Defect 1-D8GEXR
   LVH 10/13/2010
   Changed BEGINOFTIME CONSTANT DATE := TO_DATE('1','J') from TO_DATE('01014712BC','MMDDYYYYBC')
   and ENDOFTIME CONSTANT DATE := TO_DATE('5373484','J') from TO_DATE('12319999','MMDDYYYY');
   to accomodate international dates in F_CM_UPDATE_ADDRESS
4. LVH 10/22/2010
   Added :global.created_id to enable display of better messages after creating a new ID.      
AUDIT TRAIL END
</multilinecomment>
BEGIN
	NULL;
END;
	*/
	//ID:1855
	/* <p>
		 </p>
		*/
		public void auditTrail84()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4_1
	
	PROCEDURE AUDIT_TRAIL_8_4_1 IS

<multilinecomment>
AUDIT TRAIL: 8.4.1
1. Shubhashish Bhatt 31/01/2011
   Defect 1-1BEG3H
   a. Added Code in GOTCMME.GOTCMME_SSN, Created POST-TEXT-ITEM Trigger for displaying message for Duplicate SSN.
AUDIT TRAIL END


</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1856
	/* <p>
		 </p>
		*/
		public void auditTrail841()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5
	
	PROCEDURE AUDIT_TRAIL_8_5 IS
<multilinecomment>
AUDIT TRAIL: 8.5
1. TGKinderman   09/19/2011
   Defect 1-QQAGNK
   Defect 1-U7PWOR
   Code was added in GOTCMME.GOTCMME_SSN.POST-TEXT-ITEM Trigger for displaying message for Duplicate SSN (defect 1-1BEG3H).
   This was not added properly.  a) Code was not added such that a standard "one time" warning was presented.  The message was
   erroneously displayed every time when navigating through this GOTCMME_SSN item.  b) Code was not added properly to turn off
   pii so as to check for SSN accross all.   c) Warning is a form of validation. It was added to a post-text-item, where event
   firing was causing FRM-92101 runtime failure 
   1. Removed GOTCMME.GOTCMME_SSN.POST-TEXT-ITEM 
   2. Implemented a proper correction for 1-1BEG3H. Added proper validation (GOTCMME.GOTCMME_SSN.WHEN-VALIDATE-ITEM) in
      association with a HOLD_GOTCMME_SSN item to capture the entered value as a means to know if "one time" warning has
      already been presented.      
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1857
	/* <p>
		</p>
		*/
		public void auditTrail85()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5_1
	
	PROCEDURE AUDIT_TRAIL_8_5_1 IS
<multilinecomment>
AUDIT TRAIL: 8.5.1
1. Eapen Mani   03/19/2012
   RPE 1-10T9G5L
   Code was added in procedure CHECK_REQUIRED_ITEMS to validate the primary search as SSN.   
2. Pavadeppa Myageri   03/30/2012
   RPE 1-TS29H4
   Form is modified to incorporate Additional ID and Addition ID Type during Common Matching
   a) Function F_CREATE_ADDID is created
   b) Function F_CM_UPDATE_ADDID is created
   c) In block GOTCMME items GOTCMME_ADDITIONAL_ID, GOTCMME_ADID_CODE and ADID_DESC are added.
   d) In block FORM_HEADER item F_CREATE_ADDID_ERR is added.
   e) In block GOVCMRT_MATCH item MATCH_ADDITIONAL_ID is added.
   g) In block GOVCMID item MATCH_ADD_ID is added.
   h) Trigger GET_MATCH_DETAILS of block GOVCMRT_MATCH is modified to populate matched 
       Additional ID value to item MATCH_ADDITIONAL_ID.
   j) Trigger GET_GOVCMRT_DETAIL of block GOVCMID is modified to populate matched 
       Additional ID value to item MATCH_ADD_ID.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1858
	/* <p>
	 </p>
		*/
		public void auditTrail851()
		{
		}

	
	/* Original PL/SQL code for Prog Unit F_CREATE_ADDID
	
	FUNCTION F_CREATE_ADDID (p_PIDM_IN SPRIDEN.SPRIDEN_PIDM%TYPE) RETURN VARCHAR2 IS
--
  lv_rowid       VARCHAR2(18);
BEGIN
  GB_ADDITIONAL_IDENT.P_CREATE(p_PIDM          =>p_PIDM_IN,
                               p_additional_id =>:GOTCMME.GOTCMME_ADDITIONAL_ID,
                               p_adid_code     =>:GOTCMME.GOTCMME_ADID_CODE,
                               p_USER_ID       =>:GLOBAL.CURRENT_USER,
                               p_DATA_ORIGIN   =>:GLOBAL.DATA_ORIGIN,
                               p_ROWID_OUT     =>lv_rowid);
  
    
--
  RETURN(G$_NLS.Get('GOAMTCH-0104','FORM','Additional ID created.'));
--   
EXCEPTION
  WHEN OTHERS THEN
    :FORM_HEADER.API_FAILURE := 'Y';
    :FORM_HEADER.F_CREATE_ADDID_ERR := 'Y';
END;
	*/
	//ID:1859
	/* <p>
		 </p>
		* @param pPidmIn
		*/
		public NString fCreateAddid(GotcmmeAdapter gotcmmeElement, NNumber pPidmIn)
		{
			// 
			NString lvRowid= NString.getNull();
			try
			{
				Ref<byte[]> p_rowid_out_ref = new Ref<byte[]>();
				GbAdditionalIdent.pCreate(/*pPidm=>*/pPidmIn, 
										 /*pAdditionalId=>*/gotcmmeElement.getGotcmmeAdditionalId(), 
										 /*pAdidCode=>*/gotcmmeElement.getGotcmmeAdidCode(), 
										 /*pUserId=>*/getGlobal("CURRENT_USER"), 
										 /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), 
										 /*pRowidOut*=>*/p_rowid_out_ref);
				lvRowid = toStr(p_rowid_out_ref.val);
				//
				
				return GNls.Fget(toStr("GOAMTCH-0104"), toStr("FORM"), toStr("Additional ID created."));
				
			}
			catch(Exception  e)
			{
				getFormModel().getFormHeader().setApiFailure(toStr("Y"));
				getFormModel().getFormHeader().setFCreateAddidErr(toStr("Y"));
				return lvRowid;
			}
		}

	
	/* Original PL/SQL code for Prog Unit F_CM_UPDATE_ADDID
	
	--
-- Process the GORADID items.
--
FUNCTION F_CM_UPDATE_ADDID (p_PIDM_IN SPRIDEN.SPRIDEN_PIDM%TYPE) RETURN VARCHAR2 IS
  lv_rowid       VARCHAR2(18);
  lv_status_msg  VARCHAR2(2000);
--
  lv_addid_ref     GB_ADDITIONAL_IDENT.ADDITIONAL_IDENT_ref;
  lv_addid_rec     GB_ADDITIONAL_IDENT.ADDITIONAL_IDENT_rec;
--
BEGIN
  IF :GOTCMME.GOTCMME_ADID_CODE IS NOT NULL AND
  	 :GOTCMME.GOTCMME_ADDITIONAL_ID IS NOT NULL THEN
--
-- Determine if the record already exist.
--
    lv_addid_ref := GB_ADDITIONAL_IDENT.F_QUERY_ALL(p_PIDM   => p_PIDM_IN,
                                                    p_additional_id => :GOTCMME.GOTCMME_ADDITIONAL_ID,
                                                    p_adid_code => :GOTCMME.GOTCMME_ADID_CODE
                                                   );

    LOOP
      FETCH lv_addid_ref INTO lv_addid_rec;
      EXIT WHEN lv_addid_ref%NOTFOUND;
--
      IF UPPER(lv_addid_rec.r_adid_code) = UPPER(:GOTCMME.GOTCMME_ADID_CODE) AND 
         lv_addid_rec.r_additional_id =  :GOTCMME.GOTCMME_ADDITIONAL_ID
      THEN
        RETURN(G$_NLS.Get('GOAMTCH-0105','FORM','Additional ID not updated.'));
      END IF;
    END LOOP;
--
-- Create new Additional ID.
--
    RETURN(F_CREATE_ADDID(p_PIDM_IN));
--
  ELSE
    RETURN(G$_NLS.Get('GOAMTCH-0106','FORM','Additional ID not updated.'));
  END IF;
END F_CM_UPDATE_ADDID;
	*/
	//ID:1860
	/* <p>
		* 
		*  Process the GORADID items.
		* 
		</p>
		* @param pPidmIn
		*/
		public NString fCmUpdateAddid(GotcmmeAdapter gotcmmeElement, NNumber pPidmIn)
		{
			NString lvRowid= NString.getNull();
			NString lvStatusMsg= NString.getNull();
			// 
			Cursor lvAddidRef= null;
			GbAdditionalIdent.AdditionalIdentRecRow lvAddidRec= null;
			if ( !gotcmmeElement.getGotcmmeAdidCode().isNull() && !gotcmmeElement.getGotcmmeAdditionalId().isNull() )
			{
				// 
				//  Determine if the record already exist.
				// 
				lvAddidRef = GbAdditionalIdent.fQueryAll(/*pPidm=>*/pPidmIn, /*pAdditionalId=>*/gotcmmeElement.getGotcmmeAdditionalId(), /*pAdidCode=>*/gotcmmeElement.getGotcmmeAdidCode());
				while (true) {
					List<Row> lvAddidRefResults = lvAddidRef.getRows();
					if ( lvAddidRefResults != null ) {
						lvAddidRec =  new GbAdditionalIdent.AdditionalIdentRecRow(lvAddidRefResults.get(0));
					}
					if ( lvAddidRef.getRows().isEmpty() ) 
						break;
					// 
					if ( upper(lvAddidRec.RAdidCode).equals(upper(gotcmmeElement.getGotcmmeAdidCode())) && lvAddidRec.RAdditionalId.equals(gotcmmeElement.getGotcmmeAdditionalId()) )
					{
						return ((GNls.Fget(toStr("GOAMTCH-0105"), toStr("FORM"), toStr("Additional ID not updated."))));
					}
				}
				// 
				//  Create new Additional ID.
				// 
				return ((fCreateAddid(gotcmmeElement, pPidmIn)));
			}
			else {
				return ((GNls.Fget(toStr("GOAMTCH-0106"), toStr("FORM"), toStr("Additional ID not updated."))));
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5_2
	
	PROCEDURE AUDIT_TRAIL_8_5_2 IS
<multilinecomment>
AUDIT TRAIL: 8.5.2
1. RPE 1-11OOIO3, 1-54TEBR
   LVH 07/12/2012
   Updated WHEN-NEW-FORM-INSTANCE so the 'Generated Button' will now display whether coming from another form or not
   unless there is a GTVSDAX option (NO_GEN_BTN / GOAMTCH) to indicate that it should be hidden.
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1861
	/* <p>
		</p>
		*/
		public void auditTrail852()
		{
		}

	
	/* Original PL/SQL code for Prog Unit COPYRIGHT
	
	PROCEDURE COPYRIGHT IS
<multilinecomment> 
  Copyright 2003-2013 Ellucian Company L.P. and its affiliates. 
</multilinecomment> 
BEGIN
  NULL;
END;

	*/
	//ID:1862
	/* <p>
		 </p>
		*/
		public void copyright()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6
	
	PROCEDURE AUDIT_TRAIL_8_6 IS
<multilinecomment>
AUDIT TRAIL: 8.6
1. Defect 1-18AEBHH 
   LVH 10/22/2012
   Updated the defintion of ' Address record create failed' for internationalization use by creating
   :FORM_HEADER.ADDR_FAILED_LIT.
   
2. Defect 1-18AEBHF 
   EM 01/03/2012
   Added G$_NLS.Get in FUNCTION F_CM_UPDATE_BIO, for  'Biographical record created;'  
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1863
	/* <p>
	 </p>
		*/
		public void auditTrail86()
		{
		}

	
	

}
