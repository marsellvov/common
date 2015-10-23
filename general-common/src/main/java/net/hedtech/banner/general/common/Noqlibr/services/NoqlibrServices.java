package net.hedtech.banner.general.common.Noqlibr.services;

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

import net.hedtech.banner.general.common.Noqlibr.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Noqlibr.model.*;



public class NoqlibrServices extends AbstractSupportCodeObject{
	
	
	public NoqlibrServices(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public NoqlibrTaskPart getContainer() {
		return (NoqlibrTaskPart)super.getContainer();
	}
	
	
	public NoqlibrModel getFormModel() {
		return getContainer().getModel();
	}	

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_2_1
	
	PROCEDURE AUDIT_TRAIL_2_1 IS
<multilinecomment>
AUDIT TRAIL: 2.1                            INIT     DATE
1. New library form for HR. Contains LOV's, record groups,    
   and PL/SQL procedures.                  SG     02-06-95 
AUDIT TRAIL: 2.1.5
19. Convert for FORMS 4.5.                 JW     06-04-96
AUDIT TRAIL: 2.1.11
1. Added PTQBDPL1_RG and PTQBDPL1_LOV with breaked
   effective date in it.                   AS   11-10-96
   
2. Changed PTQEMPR_FED_EIN item from 12 characters to 15    
   long of PTQEMPR_RG.                     AY 01/02/1997
AUDIT TRAIL END                                                                                                            
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:507
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail21()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail21 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment>
AUDIT TRAIL :3.0
1.RPM#3062                LR   23-APR-97
  TECHNICAL MODIFICATION - LOV's NBQPOSN_LOV and NTQPCLS were deleted.
                           Record Groups NBQPOSN_RG and NTQPCLS were deleted.
2. Changed some LOV visual attribute to G$_NVA_LOV library visual
    attribute.               AY 06/09/1997
3.Defect 5955                  LR    18-JUN-1997
Problem - All forms wich use collector table and were called from Options menu by trigger
          N$_GUROPTM_CALL_FORM may be used only for query information not for inserting or
          deleting information .But for working these forms need to insert information in
          collector table .This is contradiction.
Functional Impact -All forms wich use collector table and were called from Options menu by trigger
          N$_GUROPTM_CALL_FORM may be used only for query information not for inserting or
          deleting information .But for working these forms need to insert information in
          collector table .This is contradiction.Now if you will call these forms
          from Options menu they will work not only in query mode. 
Technical Fix -In trigger N$_GUROPTM_CALL_FORM deleted logic wich call form 
              in query mode if name of the form has letter I in a third position.
AUDIT TRAIL :3.1
  1.Changed date format in record groups      E.T 04/15/98
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:508
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail30()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail30 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
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
2.Defect # 10382                              LR 07-OCT-1998
  Problem - Problem installing POSNCTL without PAYROLL installed.
    Functional Impact - Now you can compile forms without PAYROLL installed.
   Technical Fix - Changed record groups :
                    PTVASSN_RG,PTV87TR_RG,PTQBDPL1_RG 
3.Defect # 9946     GK 09-10-1998.
  Problem- Non HR issue. When in the LOV for employee class for NBAPOSN and NTRPCLS
           the form name for FTMECLS needs to be added next to the description for the LOV.
  Functional Impact- The LOV description for FTVECLS_LOV is now changed to add the name
                     for FTMECLS.
  Technical Fix- Changed the LOV description for FTVECLS_LOV.
4. Modified the NTQAPTY_LOV and NTQAPTY_RG to bring up the correct 	MWW   01-25-99
   Approval Type, Description, and Sequence No. in the popup window.

5. AP 02/22/99
   Changed Display Width for Priority from 48 to 21 in these LOVs: 
   PTQDCHN_LOV, PTQBDCA_LOV.
   Spelled out 'Amt' titles in these LOVs: PTQBDPL_LOV, PTQBDPL1_LOV.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:509
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40B2k()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail40B2k procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_1
	
	PROCEDURE AUDIT_TRAIL_3_1 IS
<multilinecomment>
AUDIT TRAIL: 3.1                            INIT     DATE
1. Year 2000 compliance                      SL    05/01/98
   All of LOV and Record groups are modified to reflect 
   date format '||G$_DATE.GET_NLS_DATE_FORMAT||'.
2. Contact #: 2192613                        SL    05/11/98
   Problem: When you hit the 'View' button on the bottom of FBLD, 
      the select effective date lov displays many of the same 
      effective dates.  According to Laurie Smith, it should display 
      distinct.
   Tech.Fix: FBIN_EFF_DATES_RG, FBEX_EFF_DATES_RG, and FELD_EFF_DATES_RG 
      modified to generate distinct dates.
3. LOVs and RGs                              SL   05/15/98
   LOVs and RGs (PTQECLS and PTQEARN) have been added from ntracat.

4. LOV title                                 SL   07/22/98
   Validation form name added in LOV title description area.

AUDIT TRAIL END                                                                                                            
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:510
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail31()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail31 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_1
	
	PROCEDURE AUDIT_TRAIL_4_1 IS
<multilinecomment>
AUDIT TRAIL: 4.1                              INIT     DATE
1. Work Flow Modification                      SL    10/07/99
   NTQLVID_RG, NTQROUT_RG, NTQLVID_LOV, and NTQROUT_LOV has been 
   modified to use gobeacc table instead of guriden.
2. Defect #41-0006			       SL    12/17/99
   NTQLVID_RG modified to retrieve 30 character length of gobeacc_
   username.
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:511
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail41()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail41 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
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
	//ID:512
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail50 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_3
	
	PROCEDURE AUDIT_TRAIL_5_3 IS
<multilinecomment>
AUDIT TRAIL: 5.3
1. New Enhancement for Probation and Labor Contract by Job.    							MS 08/13/2001
   Added a new LOV PTVBARG_LOV and a new RG PTVBARG_RG.
   Added a new Editor N$_COMMENTS_EDITOR  for comments to be 
   generic within Position Control Forms. The Editor also 
   includes two Property Clsasses associated with it 
   N$_COMMENTS_EDITOR_CLASS and N$_COMMENTS_BTN_CLASS and 
   Program Unit N$_OPEN_COMMENTS_EDITOR.
2. Defect #72003			                             VR    01/04/2002
   Added NBAJOBS_RG and NBAJOBS_LOV from ptrscdp.  
AUDIT TRAIL END
</multilinecomment>
 
BEGIN
  NULL;
END;
	*/
	//ID:513
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail53()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail53 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit N$_OPEN_COMMENTS_EDITOR
	
	PROCEDURE N$_OPEN_COMMENTS_EDITOR (comments_item IN VARCHAR2) IS
BEGIN
  GO_ITEM(comments_item);
  EXECUTE_TRIGGER('KEY-EDIT');
END;
	*/
	//ID:514
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param commentsItem
		*/
		//MORPHIS TODO TPaixao: Moved nOpenCommentsEditor to new Class NCommentsEditorClass
//		public void nOpenCommentsEditor(NString commentsItem)
//		{
//			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			goItem(commentsItem);
//			executeAction("KEY-EDIT");			
//		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_3_1
	
	PROCEDURE AUDIT_TRAIL_5_3_1 IS
<multilinecomment>
AUDIT TRAIL: 5.3.1

1. Vets-100 Reporting Regulatory Enhancement.   MK  19-JUN-2002

2. Defect #73477                               MK  28-MAY-2002
   Added PTVNRSI_RG, PTVNRSI_LOV, PTQBCAT_RG, PTQBCAT_LOV,
   PTVLCAT_RG, PTVLCAT_LOV, PTVEGRP_RG, PTVEGRP_LOV,
   PTVSTGR_RG, PTVSTGR_LOV, PTQWKPR_RG, PTQWKPR_LOV.
3. Internal Defect #531-0027									 MS 	'||G$_DATE.NORMALISE_GREG_DATE('01-07-2002', 'DD-MM-YYYY')||'
Problem:	When editor is invoked for comment fields in forms, 
					it truncates the text coming from that field.
Functional Impact: The text will not be truncated now and will 
									 copy up to 2000 characters into an editor.					
Technical Fix: Modified KEY-EDIT Trigger for N$_COMMENTS_EDITOR_CLASS.   

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:515
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail531()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail531 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
AUDIT TRAIL: 6.0

1. RPE #1341                       LR 26-SEP-2002
   Added PTQECLC_RG and PTQECLC_LOV.

2. RPE # 246											 DS 19-NOV-2002
   Added NTVJOBP_RG and NTVJOBP_LOV.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:516
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail60()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail60 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0_0_1
	
	PROCEDURE AUDIT_TRAIL_6_0_0_1 IS
<multilinecomment>
AUDIT TRAIL: 6.0.0.1
1. CA MIS Regulatory Updates- RPE 34834              MT 10/09/03

   Problem : Addition of a new column DICD code to the PTQJBLN LOV
   Functional Impact : DICD Code field defined on the table PTRJBLN can be seen in the LOV.
   Technical Fix : The LOV and its Record Group has been modified to include the new column
   							PTRJBLN_DICD_CODE.
AUDIT TRAIL END.   
</multilinecomment>   
BEGIN
  NULL;
END;
	*/
	//ID:517
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail6001()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail6001 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_1
	
	PROCEDURE AUDIT_TRAIL_6_1 IS
<multilinecomment>
AUDIT TRAIL: 6.1
1.Defect 62951                 LR 09/05/2003
 Added JOBS_EFF_DATES_RG and JOBS_EFF_DATES_LOV.
2. RPE #34790 - Salary Planning and Position Budgeting      TFH 09/15/2003
   Added NTVBPRO_RG, NTVBPRO_LOV, NTQSPEX_RG and NTQSPEX_LOV.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
	//ID:518
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail61()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail61 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0
1. Changes Migrated to Release 7.0          MT 01/27/2004
   RPE #34834                  Release    6.0.0.1
   RPE #34790, Defect #62951   Release    6.1
   
AUDIT TRAIL END.   

</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:519
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail70 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_2
	
	PROCEDURE AUDIT_TRAIL_7_2 IS
BEGIN
  NULL;
END;
<multilinecomment>
AUDIT TRAIL: 7.2
1. Employee Self-Service EPAFs.                                  LN 07/23/2005
   Added the followings:
   - Tab canvas noaapsm_1_tab_canvas
   - Block nobtran_info_1 and norcmnt.
   - Reference visual attributes G$_NVA_TEXT_ITEM, G$_NVA_CANVAS and 
     G$_NVA_PROMPT from goqclib.
   - Form trigger CHECK_TO_SAVE_NORCMNT.  
   - Object Group NORCMNT_OG of all above items, except the tab canvas.
2. Employee Self-Service EPAFs																	MS 08/11/2005
   Added new LOV's and new Record Groups: 
   NTVAGRP_LOV and NTVAGRP_RG 
   NTQAGRP_LOV and NTQAGRP_RG
   NTQAGID_LOV and NTQAGID_RG
AUDIT TRAIL END
</multilinecomment>
	*/
	//ID:520
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail72()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail72 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
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
	//ID:521
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrailNlsDateSupport procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3
	
	PROCEDURE AUDIT_TRAIL_7_3 IS
<multilinecomment>
AUDIT TRAIL: 7.3
1. RPE #1-52TAG                                       SL 07-MAR-2006
   Problem: Address/telephone set up through epaf processing requires to
     set up GTVSDAX which may not represent users' actual needs.  Also, address 
     sqno and telephone seqno are needed to be determined by users which makes 
     processing compilicated.
   Functional Impact:  Users will have options to choose their processing needs
     on address and telephone information upon creating of epafs.
   Techinical Fix:  Added SPRTELE_LOV, SPRTELE_RG into noqlibr, and 
     POPULATE_STRTELE_RG routine into noqlpls library to provide telephone Lov.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:522
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail73()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail73 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment>
AUDIT TRAIL: 8.0 
1. Defect # 1-1ADCOR                                  PR   02/27/2007
   Problem: Date format mask hardcoded which affects easy Internationalization
   	 of code.
   Functional Impact: None.
   Technical Fix: Removed the format mask of NORCMNT_ACTIVITY_DATE
   	 ITEM of NORCMNT BLOCK following the internationalization standards 
   	 for enabling easy internationalization of code. 

2. Grants Management Enhancement Multiple Year Encumbering        LN 04/19/2007
   Added a new Property Class, N$_RMONEY_CLASS, for amount field size 
   NUMBER(17, 2).

AUDIT TRAIL END</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:523
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail80 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1
	
	PROCEDURE AUDIT_TRAIL_8_1 IS
<multilinecomment> 
AUDIT TRAIL: 8.1
1. Added 2 new LOVs and Record Groups 															MS 02/20/2008
			NTVECCG_LOV and NTVECCG_RG
			NTVQPRT_LOV and NTVQPRT_RG
	
2. Added a new LOV and Record Group NTVPRXM_LOV and NTVPRXM_RG			PM 03/26/2008

AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:524
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail81()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail81 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : NOQLIBR
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Wed Mar 07 12:51:47 2012
-- MSGSIGN : #f8d69930019dbf8c
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:525
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrailMsgkeyUpdate procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS
<multilinecomment>
AUDIT TRAIL: 8.2
1. I18N Re-key 2.0 tool changes.                           PM 04/09/2009
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:526
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail82()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail82 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_7_1
	
	PROCEDURE AUDIT_TRAIL_8_7_1 IS
<multilinecomment> 
AUDIT TRAIL: 8.7.1
1. RPE # 1-1396BS5 															LN 03/26/2012
   IPEDS 2012-2013 Enhancements
	 Added two new LOVs and Record Groups
	 	 PTRESOC_LOV and PTRESOC_RG
		 PTVECIP_LOV and PTVECIP_RG
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:527
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail871()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail871 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	

}
