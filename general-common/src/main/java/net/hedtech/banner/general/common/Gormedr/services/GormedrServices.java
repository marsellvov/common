package net.hedtech.banner.general.common.Gormedr.services;

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


import net.hedtech.banner.general.common.Gormedr.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Gormedr.model.*;



public class GormedrServices extends AbstractSupportCodeObject{
	
	
	public GormedrServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GormedrTask  getTask() {
		return (GormedrTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Gormedr.model.GormedrModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit POINTER_TO_CURSOR
	
	PROCEDURE pointer_to_cursor(item_name  varchar2,
                            item_value varchar2) is
  y           number(3);
  top_rec     number(3);
  dif         number(3);
  curr_pos    number(3);
  item_pos    number(3);
  item_height number(3);
begin
  copy(item_value,item_name);
  top_rec := get_block_property(name_in('system.cursor_block'),top_record);
  dif     := top_rec - 1;
  curr_pos := to_number(name_in('system.cursor_record')) - dif;
  item_pos := get_item_property(name_in('system.cursor_item'),y_pos);
  item_height := get_item_property(name_in('system.cursor_item'),HEIGHT);
  set_item_property(item_name,Y_POS,item_pos + ((curr_pos -1) * item_height));
END;
	*/
	//ID:651
	/* <p>
	 </p>
		* @param itemName
		* @param itemValue
		*/
	
		public void pointerToCursor(NString itemName, NString itemValue)
		{
//			NNumber y= NNumber.getNull();
//			NNumber topRec= NNumber.getNull();
//			NNumber dif= NNumber.getNull();
//			NNumber currPos= NNumber.getNull();
//			NNumber itemPos= NNumber.getNull();
//			NNumber itemHeight= NNumber.getNull();
//			copy(itemValue,itemName);
			
//			dif = topRec.subtract(1);
//			currPos = toNumber(getCursorRecord()).subtract(dif);
//			itemPos = toNumber(getItemYPos(getCursorItem()));
//			itemHeight = toNumber(getItemHeight(getCursorItem()));
//			setItemYPos(itemName, itemPos.add(((currPos.subtract(1)).multiply(itemHeight)))); //Confirmar
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
AUDIT TRAIL: 6.0
1. RPE #29921              VRM 11/22/2002
   New form. This is the Medical Disability Rule Form.
   This new form is to enable users to associate 
   Disability Types with Medical Code conditions.																	    
 
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:652
	/* <p>
		 </p>
		*/
		public void auditTrail60()
		{
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_PACKAGE_FAILURE
	
	Procedure Check_Package_Failure IS
BEGIN
  IF NOT ( Form_Success ) THEN
    RAISE Form_Trigger_Failure;
  END IF;
END;
	*/
	//ID:653
	/* <p>
	</p>
		*/
		public void checkPackageFailure()
		{

		}

	
	/* Original PL/SQL code for Prog Unit QUERY_MASTER_DETAILS
	
	PROCEDURE Query_Master_Details(rel_id Relation,detail VARCHAR2) IS
  oldmsg VARCHAR2(2);  -- Old Message Level Setting
  reldef VARCHAR2(5);  -- Relation Deferred Setting
BEGIN
  --
  -- Initialize Local Variable(s)
  --
  reldef := Get_Relation_Property(rel_id, DEFERRED_COORDINATION);
  oldmsg := :System.Message_Level;
  --
  -- If NOT Deferred, Goto detail and execute the query.
  --
  IF reldef = 'FALSE' THEN
    Go_Block(detail);
    Check_Package_Failure;
    :System.Message_Level := '10';
    Execute_Query;
    :System.Message_Level := oldmsg;
  ELSE
    --
    -- Relation is deferred, mark the detail block as un-coordinated
    --
    Set_Block_Property(detail, COORDINATION_STATUS, NON_COORDINATED);
  END IF;

EXCEPTION
    WHEN Form_Trigger_Failure THEN
      :System.Message_Level := oldmsg;
      RAISE;
END Query_Master_Details;


	
	/* Original PL/SQL code for Prog Unit CLEAR_ALL_MASTER_DETAILS
	
	PROCEDURE Clear_All_Master_Details IS
  mastblk  VARCHAR2(30);  -- Initial Master Block Causing Coord
  coordop  VARCHAR2(30);  -- Operation Causing the Coord
  trigblk  VARCHAR2(30);  -- Cur Block On-Clear-Details Fires On
  startitm VARCHAR2(61);  -- Item in which cursor started
  frmstat  VARCHAR2(15);  -- Form Status
  curblk   VARCHAR2(30);  -- Current Block
  currel   VARCHAR2(30);  -- Current Relation
  curdtl   VARCHAR2(30);  -- Current Detail Block

  FUNCTION First_Changed_Block_Below(Master VARCHAR2)
  RETURN VARCHAR2 IS
    curblk VARCHAR2(30);  -- Current Block
    currel VARCHAR2(30);  -- Current Relation
    retblk VARCHAR2(30);  -- Return Block
  BEGIN
    --
    -- Initialize Local Vars
    --
    curblk := Master;
    currel := Get_Block_Property(curblk,  FIRST_MASTER_RELATION);
    --
    -- While there exists another relation for this block
    --
    WHILE currel IS NOT NULL LOOP
      --
      -- Get the name of the detail block
      --
      curblk := Get_Relation_Property(currel, DETAIL_NAME);
      --
      -- If this block has changes, return its name
      --
      IF ( Get_Block_Property(curblk, STATUS) = 'CHANGED' ) THEN
        RETURN curblk;
      ELSE
        --
        -- No changes, recursively look for changed blocks below
        --
        retblk := First_Changed_Block_Below(curblk);
        --
        -- If some block below is changed, return its name
        --
        IF retblk IS NOT NULL THEN
          RETURN retblk;
        ELSE
          --
          -- Consider the next relation
          --
          currel := Get_Relation_Property(currel, NEXT_MASTER_RELATION);
        END IF;
      END IF;
    END LOOP;

    --
    -- No changed blocks were found
    --
    RETURN NULL;
  END First_Changed_Block_Below;

BEGIN
  --
  -- Init Local Vars
  --
  mastblk  := :System.Master_Block;
  coordop  := :System.Coordination_Operation;
  trigblk  := :System.Trigger_Block;
  startitm := :System.Cursor_Item;
  frmstat  := :System.Form_Status;

  --
  -- If the coordination operation is anything but CLEAR_RECORD or
  -- SYNCHRONIZE_BLOCKS, then continue checking.
  --
  IF coordop NOT IN ('CLEAR_RECORD', 'SYNCHRONIZE_BLOCKS') THEN
    --
    -- If we're processing the driving master block...
    --
    IF mastblk = trigblk THEN
      --
      -- If something in the form is changed, find the
      -- first changed block below the master
      --
      IF frmstat = 'CHANGED' THEN
        curblk := First_Changed_Block_Below(mastblk);
        --
        -- If we find a changed block below, go there
        -- and Ask to commit the changes.
        --
        IF curblk IS NOT NULL THEN
          Go_Block(curblk);
          Check_Package_Failure;
          Clear_Block(ASK_COMMIT);
          --
          -- If user cancels commit dialog, raise error
          --
          IF NOT ( :System.Form_Status = 'QUERY'
                   OR :System.Block_Status = 'NEW' ) THEN
            RAISE Form_Trigger_Failure;
          END IF;
        END IF;
      END IF;
    END IF;
  END IF;

  --
  -- Clear all the detail blocks for this master without
  -- any further asking to commit.
  --
  currel := Get_Block_Property(trigblk, FIRST_MASTER_RELATION);
  WHILE currel IS NOT NULL LOOP
    curdtl := Get_Relation_Property(currel, DETAIL_NAME);
    IF Get_Block_Property(curdtl, STATUS) <> 'NEW'  THEN
      Go_Block(curdtl);
      Check_Package_Failure;
      Clear_Block(NO_VALIDATE);
      IF :System.Block_Status <> 'NEW' THEN
        RAISE Form_Trigger_Failure;
      END IF;
    END IF;
    currel := Get_Relation_Property(currel, NEXT_MASTER_RELATION);
  END LOOP;

  --
  -- Put cursor back where it started
  --
  IF :System.Cursor_Item <> startitm THEN
    Go_Item(startitm);
    Check_Package_Failure;
  END IF;

EXCEPTION
  WHEN Form_Trigger_Failure THEN
    IF :System.Cursor_Item <> startitm THEN
      Go_Item(startitm);
    END IF;
    RAISE;

END Clear_All_Master_Details;

	*/
	//ID:655


	
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
	//ID:656
	/* <p>
		 </p>
		*/
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS 
<multilinecomment> 
AUDIT TRAIL: 7.0
1. Michael Hitrik 02/06/2004
   Application of enhanced UI methodology.  Please refer to the SCT Banner 7.0 User Interface Technical  Methodology for more details. 

AUDIT TRAIL: 7.3
1. DS 02/20/2006
   Increased the length of STVMEDI_CODE field.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:657
	/* <p>
		 </p>
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
	//ID:658
	/* <p>
	 </p>
		*/
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
	//ID:659
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
	//ID:660
	/* <p>
	</p>
		*/
		public void auditTrail80Sde()
		{
		}

	
	

}
