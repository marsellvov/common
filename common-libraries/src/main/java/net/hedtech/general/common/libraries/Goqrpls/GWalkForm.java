package net.hedtech.general.common.libraries.Goqrpls;

import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
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
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;


import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

public class GWalkForm extends AbstractSupportCodeObject {
	

	public GWalkForm(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_WALK_FORM
	/*
	PACKAGE G$_WALK_FORM IS
--
-- Package created to walk through all of the items in all of the blocks of
-- the current form.  WALK_BLOCKS is the driver and it is passed the first block
-- and last block in the current form.  It is called from G$_FORM_STARTUP.
-- Created to set at form start up the TOOLTIP_TEXT for iconic buttons only.
--  
   FUNCTION VALUE_ITEM_TOOLTIP(X VARCHAR2) RETURN VARCHAR2;
   PROCEDURE WALK_ITEMS(XBLCK VARCHAR2,FRSTITM VARCHAR2,LSTITM VARCHAR2);
   PROCEDURE WALK_BLOCKS(FRSTBLCK VARCHAR2,LSTBLCK VARCHAR2);
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_WALK_FORM
		/*
		PACKAGE BODY G$_WALK_FORM IS
  FUNCTION VALUE_ITEM_TOOLTIP(X VARCHAR2) RETURN VARCHAR2 IS
    HOLD_VALUE    VARCHAR2(100):= '';
  BEGIN
    RETURN(HOLD_VALUE);
  END;
--
--
  PROCEDURE WALK_ITEMS(XBLCK VARCHAR2,FRSTITM VARCHAR2,LSTITM VARCHAR2)IS
    XITEM   VARCHAR2(61) := XBLCK||'.'||FRSTITM;
    XLSTITM VARCHAR2(61) := XBLCK||'.'||LSTITM;
  BEGIN
    LOOP
      IF GET_ITEM_PROPERTY(XITEM,ITEM_TYPE) = 'BUTTON' THEN
        IF GET_ITEM_PROPERTY(XITEM,ICONIC_BUTTON) = 'TRUE' THEN
          SET_ITEM_PROPERTY(XITEM,TOOLTIP_TEXT,VALUE_ITEM_TOOLTIP(XITEM));
        END IF;
      END IF;
--
      EXIT WHEN XITEM = XLSTITM;
--
      XITEM := XBLCK||'.'||GET_ITEM_PROPERTY(XITEM,NEXTITEM);
    END LOOP;
  END;
--
--
  PROCEDURE WALK_BLOCKS(FRSTBLCK VARCHAR2,LSTBLCK VARCHAR2)IS
    X VARCHAR2(30) := FRSTBLCK;
  BEGIN
    RETURN;
<multilinecomment>
    LOOP
      IF X NOT IN ('G$_OPT_BLOCK') THEN
        WALK_ITEMS(X,GET_BLOCK_PROPERTY(X,FIRST_ITEM),GET_BLOCK_PROPERTY(X,LAST_ITEM));
      END IF;
--
      EXIT WHEN X = LSTBLCK;
--
      X := GET_BLOCK_PROPERTY(X,NEXTBLOCK);
    END LOOP;
</multilinecomment>
  END;
END;
		*/
		/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param x
		*/
		public NString valueItemTooltip(NString x)
		{
			NString holdValue = toStr("");
			return ((holdValue));
		}
/* <p>
		* 
		* 
/* </p>
		* @param xblck
		* @param frstitm
		* @param lstitm
		*/
		public void walkItems(NString xblck, NString frstitm, NString lstitm)
		{
			NString xitem = xblck.append(".").append(frstitm);
			NString xlstitm = xblck.append(".").append(lstitm);
			while (true) {
				if ( getItemType(xitem).equals("BUTTON") )
				{
					if ( SupportClasses.FORMS40.GetItemProperty(xitem, SupportClasses.Property.ICONIC_BUTTON).equals("TRUE") )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						setItemToolTip(xitem, valueItemTooltip(xitem));
					}
				}
				// 
				if ( xitem.equals(xlstitm) ) 
					break;
				// 
				xitem = xblck.append(".").append(getItemNextItem(xitem));
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param frstblck
		* @param lstblck
		*/
		public void walkBlocks(NString frstblck, NString lstblck)
		{
			NString x = frstblck;
			return ;
		}
		
	
	
}
