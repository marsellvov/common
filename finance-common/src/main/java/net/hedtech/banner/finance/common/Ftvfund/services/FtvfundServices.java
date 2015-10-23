package net.hedtech.banner.finance.common.Ftvfund.services;

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


import net.hedtech.banner.finance.common.Ftvfund.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Ftvfund.model.*;



public class FtvfundServices extends AbstractSupportCodeObject{
	
	
	public FtvfundServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public FtvfundTask  getTask() {
		return (FtvfundTask )super.getContainer();
	}

	
	public net.hedtech.banner.finance.common.Ftvfund.model.FtvfundModel getFormModel() {
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
	//ID:624
	/* <p>
/* </p>
		*/
		public void auditTrail30B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_1
	
	PROCEDURE AUDIT_TRAIL_3_1 IS
BEGIN
  NULL;
<multilinecomment> AUDIT TRAIL: 3.1
1.defect#...4341
  signoff...Stan Mukhortov 23-sep-97
  problem...The form returns values with data entry ind='Y'
	....you can no longer query all records (Y or N)
  fix.......Created trigger KEY-EXEQRY on FTVFUND blk 
	....in which I set block property
	....so that all that all records were quered.
AUDIT TRAIL END
</multilinecomment>
END;
	*/
	//ID:625
	/* <p>
/* </p>
		*/
		public void auditTrail31()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. SJQ  04/01/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.

2. KAYUR PATEL  1/22/99
   Phase II UI Changes
3. defect......none
   signoff.....Wei Zhang 02/05/99
   problem.....data is allowed to be inserted in the 'insert not allowed field'
   fix.........Changing 'insert allowed' property to 'insert not allowed' for ftvfund block.


AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:626
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
	//ID:627
	/* <p>
/* </p>
		*/
		public void auditTrail50Apiconvert()
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
	//ID:628
	/* <p>
/* </p>
		*/
		public void auditTrail70Formscnv()
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
	//ID:629
	/* <p>
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit DISPLAY_GRNT_TITLE
	
	PROCEDURE DISPLAY_GRNT_TITLE IS
BEGIN
  
   IF :FTVFUND_GRNT_CODE IS NULL  THEN
      RETURN ;
   END IF ;
--
   DECLARE
        CURSOR PTI_CURSOR IS
        SELECT FRBGRNT_TITLE
        FROM   FRBGRNT
        WHERE   FRBGRNT_CODE = :FTVFUND_GRNT_CODE;         
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :GRNT_DESC;
			CLOSE PTI_CURSOR;
   END ;
END;
	*/
	//ID:630
	/* <p>
/* </p>
		*/
		public void displayGrntTitle(FtvfundAdapter ftvfundElement)
		{
			int rowCount = 0;
			if ( ftvfundElement.getFtvfundGrntCode().isNull() )
			{
				return ;
			}
			{
				String sqlptiCursor = "SELECT FRBGRNT_TITLE " +
									 " FROM FRBGRNT " +
									 " WHERE FRBGRNT_CODE = :FTVFUND_GRNT_CODE ";
				DataCursor ptiCursor = new DataCursor(sqlptiCursor);
				try {
					//Setting query parameters
					ptiCursor.addParameter("FTVFUND_GRNT_CODE", ftvfundElement.getFtvfundGrntCode());
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if ( ptiCursorResults != null ) {
						ftvfundElement.setGrntDesc(ptiCursorResults.getStr(0));
					}
				}
				finally{
					ptiCursor.close();
				}
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment>
AUDIT TRAIL: 8.0
1.Khanjan Shroff    21-MAY-2007
  Grants Management Enhancement Multiple Year Encumbrance       
   The Form has been modified to a scrolling canvas. Fields Fund Code, Type and Title
   are on the main canvas while other fields have been moved to the scrolling canvas. 
   Two new fields have been added, Grant and Grant Title. Also, the option menu has
   been modified to call the FRIFUND form by enabling/disabling it depending on the 
   current record. 
   1.Removed the field FTVFUND_POOL_IND.   
   2.Created a POST-QUERY trigger on FTVFUND block to call the DISPLAY_GRNT_TITLE procedure.
   3.Created a procedure DISPLAY_GRNT_TITLE to display Grant Title based on Grant Code.
   4.Modified the triggers  ENABLE_KEYS & DISABLE_KEYS to add the logic of FTVFUND_GRNT_CODE
     field and to remove the logic of FTVFUND_POOL_IND. 
   5.Created a WHEN-NEW-RECORD-INSTANCE on FTVFUND block to enable/disable the option menu.   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:631
	/* <p>
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_I18N
	
	PROCEDURE AUDIT_TRAIL_8_0_I18N IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 I18N 
1. Michael Hitrik  06/29/2007
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS  to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:632
	/* <p>
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_SDE
	
	PROCEDURE AUDIT_TRAIL_8_0_SDE IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 SDE 
1. Michael Hitrik  06/29/2007
   This form has been modified to change W-N-R-I Execution Hierarchy to AFTER 
   to support SDE requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:633
	/* <p>
/* </p>
		*/
		public void auditTrail80Sde()
		{
		}

	
	

}
