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

public class GFormsNls extends AbstractSupportCodeObject {
	

	public GFormsNls(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_FORMS_NLS
	/*
	PACKAGE g$_forms_nls IS
  PROCEDURE init_form(p_form   IN VARCHAR2);
  PROCEDURE init_block(p_block IN VARCHAR2);
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_FORMS_NLS
		/*
		PACKAGE BODY g$_forms_nls IS
	c_oldfmtdm CONSTANT VARCHAR2(11) := 'DD-MON-'; -- Do Not Rip
	c_oldfmtyy CONSTANT VARCHAR2(4)  := 'YYYY';	-- Do Not Rip
	c_oldfmtyr CONSTANT VARCHAR2(4)  := 'RRRR'; -- Do Not Rip
	c_newfmt   CONSTANT VARCHAR2(30) := G$_DATE.GET_NLS_DATE_FORMAT;
	c_newfmtt  CONSTANT VARCHAR2(30) := G$_DATE.TRANSLATE_FORMAT(c_newfmt);  
--
	PROCEDURE init_form(p_form in varchar2) IS
	  l_block VARCHAR2(30) := GET_FORM_PROPERTY(p_form,FIRST_BLOCK);
	BEGIN
		IF (c_newfmt=c_oldfmtdm||c_oldfmtyy OR c_newfmt=c_oldfmtdm||c_oldfmtyr) AND c_newfmtt=c_oldfmtdm||c_oldfmtyy THEN
	  	NULL; -- No need to change format masks
	  ELSE		
			WHILE l_block IS NOT NULL LOOP
				IF l_block NOT IN ('G$_NAV_BLOCK','FORM_HEADER',
					                 'BUTTON_CONTROL_BLOCK','G$_EXTENDED_SEARCH_BLOCK','G$_OPT_BLOCK') THEN
					init_block(l_block);
				END IF;
				l_block := GET_BLOCK_PROPERTY(l_block,NEXTBLOCK);
			END LOOP;
		END IF;
	END init_form;
--
	PROCEDURE init_block(p_block in varchar2) is
	  -- What about time format if any?
	  l_itm   ITEM;
	  l_mask  VARCHAR2(30);
	  l_hint	VARCHAR2(512);
	BEGIN
		l_itm:= FIND_ITEM(p_block || '.' || GET_BLOCK_PROPERTY(p_block, FIRST_ITEM));
		WHILE NOT ID_NULL(l_itm) LOOP
		  IF GET_ITEM_PROPERTY(l_itm, ITEM_CANVAS) IS NOT NULL AND
         GET_ITEM_PROPERTY(l_itm, ITEM_TYPE) NOT IN ('BUTTON', 'CHART ITEM', 'IMAGE', 'TREE') AND
         GET_ITEM_PROPERTY(l_itm, DATATYPE) IN ('DATE', 'DATETIME') THEN
		    l_mask := GET_ITEM_PROPERTY(l_itm, FORMAT_MASK);
--
		    IF l_mask IS NOT NULL THEN
		    	IF INSTR(l_mask,c_oldfmtyy) > 0 THEN
		      	l_mask := REPLACE(l_mask, c_oldfmtdm||c_oldfmtyy, c_newfmt);
		      	SET_ITEM_PROPERTY(l_itm, FORMAT_MASK, l_mask);
		    	ELSIF INSTR(l_mask,c_oldfmtyr) > 0 THEN
		    		l_mask := REPLACE(l_mask, c_oldfmtdm||c_oldfmtyr, c_newfmt);
		    		SET_ITEM_PROPERTY(l_itm, FORMAT_MASK, l_mask);
		    	END IF;
		    END IF;
--
		    l_hint := GET_ITEM_PROPERTY(l_itm,HINT_TEXT);
		    IF l_hint IS NOT NULL THEN
		      IF INSTR(l_hint,c_oldfmtyy) > 0 THEN
		      	l_hint := REPLACE(l_hint, c_oldfmtdm||c_oldfmtyy, c_newfmtt);
		      	SET_ITEM_PROPERTY(l_itm, HINT_TEXT,l_hint);
					ELSIF INSTR(l_hint,c_oldfmtyr) > 0 THEN
		      	l_hint := REPLACE(l_hint, c_oldfmtdm||c_oldfmtyr, c_newfmtt);
		      	SET_ITEM_PROPERTY(l_itm, HINT_TEXT,l_hint);		      
					END IF;
				END IF;					
		  END IF;
		  l_itm := FIND_ITEM(p_block || '.' || GET_ITEM_PROPERTY(l_itm, NEXTITEM));
--
		END LOOP;
	END init_block;
--
END;
		*/
				public final NString C_OLDFMTDM = toStr("DD-MON-");
		//  Do Not Rip
		public final NString C_OLDFMTYY = toStr("YYYY");
		//  Do Not Rip
		public final NString C_OLDFMTYR = toStr("RRRR");
		//  Do Not Rip
		public static final NString C_NEWFMT = GDate.getNlsDateFormat();
		public static final NString C_NEWFMTT = GDate.translateFormat(C_NEWFMT);
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pForm
		*/
		public void initForm(NString pForm)
		{
			NString lBlock = getFormFirstBlock(pForm);
			if ( (C_NEWFMT.equals(C_OLDFMTDM.append(C_OLDFMTYY)) || C_NEWFMT.equals(C_OLDFMTDM.append(C_OLDFMTYR))) && C_NEWFMTT.equals(C_OLDFMTDM.append(C_OLDFMTYY)) )
			{
			}
			else {
				while ( !lBlock.isNull() ) {
					if ( !in(lBlock, "G$_NAV_BLOCK", "FORM_HEADER", "BUTTON_CONTROL_BLOCK", "G$_EXTENDED_SEARCH_BLOCK", "G$_OPT_BLOCK").getValue() )
					{
						initBlock(lBlock);
					}
					lBlock = getBlockNextDeclaredBlock(lBlock);
				}
			}
		}
/* <p>
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pBlock
		*/
		public void initBlock(NString pBlock)
		{
			//  What about time format if any?
			ItemDescriptor lItm= null;
			NString lMask= NString.getNull();
			NString lHint= NString.getNull();
			lItm = findItem(pBlock.append(".").append(getBlockFirstItem(pBlock)));
			while ( !(lItm == null) ) {
				// F2J_TODO : Check if the function used in the expression below may be called more than once. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#FunctionUsedInIn".
				if ( (getItemCanvas(lItm)) != null && !in(getItemType(lItm), "BUTTON", "CHART ITEM", "IMAGE", "TREE").getValue() && in(getItemDataType(lItm), "DATE", "DATETIME").getValue() )
				{
					lMask = toStr(getItemFormatMask(lItm));
					// 
					if ( !lMask.isNull() )
					{
						if ( inStr(lMask, C_OLDFMTYY).greater(0) )
						{
							lMask = replace(lMask, C_OLDFMTDM.append(C_OLDFMTYY), C_NEWFMT);
							setItemFormatMask(lItm, lMask);
						}
						else if ( inStr(lMask, C_OLDFMTYR).greater(0) ) {
							lMask = replace(lMask, C_OLDFMTDM.append(C_OLDFMTYR), C_NEWFMT);
							setItemFormatMask(lItm, lMask);
						}
					}
					// 
					lHint = toStr(getItemHint(lItm));
					if ( !lHint.isNull() )
					{
						if ( inStr(lHint, C_OLDFMTYY).greater(0) )
						{
							lHint = replace(lHint, C_OLDFMTDM.append(C_OLDFMTYY), C_NEWFMTT);
							setItemHint(lItm, lHint);
						}
						else if ( inStr(lHint, C_OLDFMTYR).greater(0) ) {
							lHint = replace(lHint, C_OLDFMTDM.append(C_OLDFMTYR), C_NEWFMTT);
							setItemHint(lItm, lHint);
						}
					}
				}
				lItm = findItem(pBlock.append(".").append(getItemNextItem(lItm)));
			}
		}
		
	
	
}
