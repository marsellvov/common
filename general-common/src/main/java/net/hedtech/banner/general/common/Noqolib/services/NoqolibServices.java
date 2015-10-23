package net.hedtech.banner.general.common.Noqolib.services;

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


import net.hedtech.banner.general.common.Noqolib.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Noqolib.model.*;



public class NoqolibServices extends AbstractSupportCodeObject{
	
	
	public NoqolibServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public NoqolibTaskPart  getContainer() {
		return (NoqolibTaskPart )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Noqolib.model.NoqolibModel getFormModel() {
		return getContainer().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_2_0
	
	PROCEDURE AUDIT_TRAIL_2_0 IS
<multilinecomment>
AUDIT TRAIL: 2.0                                         INIT   DATE
1. New Form created by renaming NOQOLIB to NOQFLIB.      RLP  06-11-93
2. All references set to NOQOLIB so forms gen regardless  GL  11-08-93
   of existence of finance product.
AUDIT TRAIL: 2.0.1
1. Referential integrity for 2.0.0 (Oracle 7)
AUDIT TRAIL: 2.0.2
1. Modify code to allow for procedures to be called from  MK  05-09-94
   more than one block for the IFOAPAL fields.  Added
   :SYSTEM.TRIGGER_BLOCK in front of the N$_... fields.
   Used the COPY command to set values to the variables
   to allow for the blocks to be differentiated by using
   :SYSTEM.TRIGGER_BLOCK.
AUDIT TRAIL: 2.1
1. Forms 4.0 Conversion.                                  SG  01-04-94
AUDIT TRAIL: 2.1.5
1. Added new procedure N$_FOAPAL_LIST.                                           RLP 05-24-95
2. Added new procedure N$_EDIT_POSTING_DATE.                                     RLP 06-09-95
3. Modified the N$_EDIT_FUND and N$_EDIT_ORGN procedures to default FUND,        RLP 06-27-95
   ORGN, PROG, ACTV, and LOCN values from the FTVFUND and FTVORGN tables.
   The logic to perform this defaulting is the same as what is used in 
   BANNER FINANCE. This defaulting action is only used in the nbajobs, 
   nbapbud, and phahour.
4. Added the 3.0 FOAPAL procedure edits comments.                                RLP 06-29-95
5. In the 'N$_EDIT_' procedures changed the line of code                         RLP 07-14-95
          TABLE_NAME := SUBSTR(:SYSTEM.TRIGGER_BLOCK,1,7);
          TABLE_NAME := SUBSTR(:SYSTEM.TRIGGER_ITEM,1,7);
   and changed all references to :SYSTEM.TRIGGER_FIELD to :SYSTEM.TRIGGER_ITEM.
6. A. In the 'N$_EDIT_' procedures changed all references of                     RLP 07-17-95
      "TABLE_NAME := SUBSTR(:SYSTEM.TRIGGER_BLOCK,1,7);" to
      "TABLE_NAME := GET_BLOCK_PROPERTY(:SYSTEM.TRIGGER_BLOCK, BASE_TABLE);",
      and all references of "SUBSTR(:SYSTEM.TRIGGER_BLOCK,1,7) to "TABLE_NAME".
   B. In procedure N$_FOAPAL_LIST changed
      "CALL_FORM('FTV' || SUBSTR(NAME_IN('SYSTEM.CUURENT_ITEM'),9,4),
       NO_HIDE, DO_REPLACE, QUERY_ONLY);" to
      "CALL_FORM('FTV' || SUBSTR(NAME_IN('SYSTEM.CURSOR_ITEM'), 
       (INSTR(:SYSTEM.TRIGGER_ITEM,'.') + 9),4), 
       NO_HIDE, DO_REPLACE, QUERY_ONLY);".
7. Defect# 3369                                                                  RLP 07-26-95
      Problem - When Term'ing an empl they got a msg that the orgn was inactive.
        The org had a term date of 30-JUN, which is the same day the empl's job 
        was being term'd.  
      Functional Impact - On forms where time processing is not used, the client 
        will have the ability to use any FOAPAL component up to and including
        the same date the particular FOAPAL component it is being terminated.
      Technical Fix - In all FOAPAL procedures that use, effective date 
        processing, the determination of "EFFECTIVE_DATE_TIME" has been 
        changed to use
        "NVL(EFFECTIVE_TIME,'000001')" instead of 
        "NVL(EFFECTIVE_TIME,TO_CHAR(SYSDATE,'235959'))".
8. Enhancement - Role based security.                                                              RLP    09-05-95
    Functional Impact - Users must have been granted access to appropriate role to use form.
                            Enforces more robust security throughout Banner applications.
    Technical modifications: Attached GOQRPLS library. Various changes centered around the
                            PRE-FORM and POST-FORM triggers. Also modified syntax for calling other
                            forms.
                            Also removed references to table owners that were not removed as part of the
                            2.0 to 2.1 conversion.
 AUDIT TRAIL END


</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:53
	/* <p>
		* 
/* </p>
		*/
		public void auditTrail20()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment>
AUDIT TRAIL :3.0
1.Technical Fix - Cleaning the form for 3.0 release.    LR 17-JUN-1997
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:54
	/* <p>
		* 
/* </p>
		*/
		public void auditTrail30()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. MS  08/20/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:55
	/* <p>
		* 
/* </p>
		*/
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0
	
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>
AUDIT TRAIL: 5.0
1. TGKinderman 06/14/2000
   Dev6.0 Upgrade.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:56
	/* <p>
		* 
/* </p>
		*/
		public void auditTrail50()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0_NOQOLIB
	
	PROCEDURE AUDIT_TRAIL_7_0_NOQOLIB IS
<multilinecomment>
AUDIT TRAIL: 7.0
1. TGKinderman 11/20/2030
   Converted to Forms9i
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:57
	/* <p>
		* 
/* </p>
		*/
		public void auditTrail70Noqolib()
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
	//ID:58
	/* <p>
		* 
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment> 
AUDIT TRAIL: 8.0

1. MS  09/26/2007
   Release number updated per minimal inclusion in release.
   
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:59
	/* <p>
		* 
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	

}
