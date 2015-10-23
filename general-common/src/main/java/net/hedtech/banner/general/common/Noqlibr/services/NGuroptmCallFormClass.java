package net.hedtech.banner.general.common.Noqlibr.services;

import net.hedtech.banner.general.common.Noqlibr.NoqlibrTaskPart;
import net.hedtech.banner.general.common.Noqlibr.model.NoqlibrModel;

import morphis.foundations.core.appdatalayer.data.DataCursor;
import morphis.foundations.core.appdatalayer.data.ResultSet;
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.types.NString;

import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.types.Types.*;
import static morphis.foundations.core.appsupportlib.Globals.*;

public class NGuroptmCallFormClass extends AbstractSupportCodeObject {

	public NGuroptmCallFormClass(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public NoqlibrTaskPart getContainer() {
		return (NoqlibrTaskPart)super.getContainer();
	}
	
	
	public NoqlibrModel getFormModel() {
		return this.getContainer().getModel();
	}	
	
	/* Original PL/SQL code code for TRIGGER NOQLIBR.N$_GUROPTM_CALL_FORM
	 <multilinecomment> This trigger will call a form specified in the GUROPTM table.  It uses the logic from 
G$_secured_form_call to check security. </multilinecomment>

DECLARE 

FORM_TO_CALL VARCHAR2 (30);
TYPE_IND VARCHAR2(1);
CAPACITY VARCHAR2(1);
CURRENT_FORM VARCHAR2(10);
USER_NAME VARCHAR2(30);

CURSOR GET_CAPACITY IS
SELECT GUROPTM_CAPACITY
FROM GUROPTM
WHERE GUROPTM_FORM_NAME = CURRENT_FORM
AND GUROPTM_NAME1 = FORM_TO_CALL
AND GUROPTM_TYPE_IND = TYPE_IND;

<multilinecomment> GOT_PERMISSION    CHAR(1);


CURSOR SECURITY_CURSOR IS
    SELECT GURSECR_CAPACITY_IND
    FROM   GURSECR
    WHERE  GURSECR_TYPE_IND     = 'F'
      AND  GURSECR_PROCESS_NAME = FORM_TO_CALL
      AND  (GURSECR_USER_NAME   = USER_NAME
        OR  GURSECR_USER_NAME   = 'PUBLIC')
    ORDER BY DECODE(GURSECR_USER_NAME, 'PUBLIC', 2, 1) ; </multilinecomment>

BEGIN
CURRENT_FORM := GET_APPLICATION_PROPERTY (CURRENT_FORM_NAME);
EXECUTE_TRIGGER ('SAVE_KEYS');
FORM_TO_CALL:= :GLOBAL.GUROPTM_NAME1;
TYPE_IND := :GLOBAL.GUROPTM_TYPE_IND;
USER_NAME := :GLOBAL.CURRENT_USER;

<multilinecomment>  IF :GLOBAL.SECRSYS = 'Y'  THEN
OPEN SECURITY_CURSOR ;
FETCH SECURITY_CURSOR INTO GOT_PERMISSION ;
END IF; </multilinecomment>

OPEN GET_CAPACITY;
FETCH GET_CAPACITY INTO CAPACITY;
<multilinecomment>  IF GOT_PERMISSION = 'Q' AND :GLOBAL.SECRSYS = 'Y' THEN 
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,FORM_TO_CALL,'QUERY');
G$_CHECK_FAILURE ;
ELSIF GOT_PERMISSION NOT IN ('Q','M') AND :GLOBAL.SECRSYS = 'Y' THEN 
MESSAGE('*ERROR* User does not have permission for requested form' ) ;
RAISE FORM_TRIGGER_FAILURE; </multilinecomment>
IF CAPACITY = 'Q'  THEN 
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE ;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,FORM_TO_CALL,'QUERY');
G$_CHECK_FAILURE ;
ELSE 
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE ;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,FORM_TO_CALL,'');
G$_CHECK_FAILURE ;
END IF;
END;

	*/
	/*
	 *<p>
	 *<b>Migration Comments</b>
	 * Generated from trigger:
	 * NOQLIBR.N$_GUROPTM_CALL_FORM
	 *
	 *
	 *</p>
	*/
	
	public void Noqlibr_NGuroptmCallForm()
	{
		
			//  This trigger will call a form specified in the GUROPTM table.  It uses the logic from
			// G$_secured_form_call to check security. 
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.

			int rowCount = 0;
			{
				NString formToCall= NString.getNull();
				NString typeInd= NString.getNull();
				NString capacity= NString.getNull();
				NString currentForm= NString.getNull();
				NString userName= NString.getNull();
				String sqlgetCapacity = "SELECT GUROPTM_CAPACITY " +
" FROM GUROPTM " +
" WHERE GUROPTM_FORM_NAME = :P_CURRENT_FORM AND GUROPTM_NAME1 = :P_FORM_TO_CALL AND GUROPTM_TYPE_IND = :P_TYPE_IND ";
				DataCursor getCapacity = new DataCursor(sqlgetCapacity);
				try {
					currentForm = toStr(getCurrentTaskName());
					executeAction("SAVE_KEYS");
					formToCall = getGlobal("GUROPTM_NAME1");
					typeInd = getGlobal("GUROPTM_TYPE_IND");
					userName = getGlobal("CURRENT_USER");
					//   IF :GLOBAL.SECRSYS = 'Y'  THEN
					// OPEN SECURITY_CURSOR ;
					// FETCH SECURITY_CURSOR INTO GOT_PERMISSION ;
					// END IF; 
					//Setting query parameters
					getCapacity.addParameter("P_CURRENT_FORM", currentForm);
					getCapacity.addParameter("P_FORM_TO_CALL", formToCall);
					getCapacity.addParameter("P_TYPE_IND", typeInd);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable getCapacity.
					getCapacity.open();
					ResultSet getCapacityResults = getCapacity.fetchInto();
					if ( getCapacityResults != null ) {
						capacity = getCapacityResults.getStr(0);
					}
					//   IF GOT_PERMISSION = 'Q' AND :GLOBAL.SECRSYS = 'Y' THEN
					// G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,FORM_TO_CALL,'QUERY');
					// G$_CHECK_FAILURE ;
					// ELSIF GOT_PERMISSION NOT IN ('Q','M') AND :GLOBAL.SECRSYS = 'Y' THEN
					// MESSAGE('*ERROR* User does not have permission for requested form' ) ;
					// RAISE FORM_TRIGGER_FAILURE; 
					if ( capacity.equals("Q") )
					{
						executeAction("G$_REVOKE_ACCESS");
						getContainer().getGoqrpls().gCheckFailure();
						getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), formToCall, toStr("QUERY"));
						getContainer().getGoqrpls().gCheckFailure();
					}
					else {
						executeAction("G$_REVOKE_ACCESS");
						getContainer().getGoqrpls().gCheckFailure();
						getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), formToCall, toStr(""));
						getContainer().getGoqrpls().gCheckFailure();
					}
				}
				finally{
					getCapacity.close();
				}
			}
		}
}
