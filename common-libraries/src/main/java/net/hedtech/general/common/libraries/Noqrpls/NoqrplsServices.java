package net.hedtech.general.common.libraries.Noqrpls;

import static morphis.foundations.core.appsupportlib.Lib.copy;
import static morphis.foundations.core.appsupportlib.Lib.inStr;
import static morphis.foundations.core.appsupportlib.Lib.isNull;
import static morphis.foundations.core.appsupportlib.Lib.substring;
import static morphis.foundations.core.appsupportlib.Lib.toChar;
import static morphis.foundations.core.appsupportlib.Lib.toDate;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.getBlockQueryDataSourceName;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.findItem;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.getItemHeight;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.getItemUpdateAllowed;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.getItemYPos;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.setItemYPos;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.executeAction;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getCurrentTaskName;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getCursorItem;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getCurrentField;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getCursorRecord;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getMode;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getNameIn;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getRecordStatus;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getTriggerBlock;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getTriggerItem;
import static morphis.foundations.core.types.Types.toInt;
import static morphis.foundations.core.types.Types.toNumber;
import static morphis.foundations.core.types.Types.toStr;

import java.util.Hashtable;

import morphis.foundations.core.appsupportlib.exceptions.ApplicationException;
import morphis.foundations.core.appsupportlib.runtime.AbstractLibrary;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.configuration.LibraryConfiguration;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.util.Ref;

import net.hedtech.general.common.dbservices.GDate;
import net.hedtech.general.common.dbservices.GNls;
import net.hedtech.general.common.dbservices.Gokdbms;
import net.hedtech.general.common.dbservices.Nokglob;
import net.hedtech.general.common.dbservices.Nokrecs;


public class NoqrplsServices extends AbstractLibrary{
		
	public NoqrplsServices (LibraryConfiguration configuration,
			ISupportCodeContainer container, Hashtable sharedLibraries) {
		super(configuration, container, sharedLibraries);
	}
			
		
	// Attached Libraries
    public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }
    public net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices getEoqrpls()
    {
		return (net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices)getSupportCodeManager().getLibrary("EOQRPLS");
    }
	
	//Original PL/SQL code for Prog Unit NOQRPLS.N$_RESET_FIELDS
	/*
	PROCEDURE N$_RESET_FIELDS (SUFF IN VARCHAR2,
                          PROJ  IN VARCHAR2,
                          CTYP  IN VARCHAR2) IS
   TABLE_NAME          VARCHAR2(07);
--
<multilinecomment> PURPOSE: This procedure sets all 'N$_ACCI' fields to null.
            Then fields ACCI, FUND, ORGN, ACCT, PROG, ACTV, LOCN,
            PROJ, and CTYP are copied into themselves.
            (This action is necessary to force a revalidation
            of current values in case the 'ACCI_CODE'
            or 'COAS' has changed.)
   PARAMETER DEFINITIONS:
            SUFF - Suffix for the FOAPAL fields to being processed.
                   ** (I.E. '_EMP_LIB')**
                   This parameter should be null if the FOAPAL fields
                   have no suffix.
            PROJ - indicates whether there is a PROJ_CODE on the FOAPAL
                   being processed. 'N' represents no PROJ_CODE, and
                   'Y' represents the presents of a PROJ_CODE on the
                   FOAPAL.
            CTYP - indicates whether there is a CTYP_CODE on the FOAPAL
                   being processed. 'N' represents no CTYP_CODE, and
                   'Y' represents the presents of a CTYP_CODE on the
                   FOAPAL.
      WHERE EXECUTED FROM:
            1. In the 'ON-VALIDATE-FIELD' trigger of the COAS field
               being validated.
            2. In the 'ON-VALIDATE-FIELD' trigger of the ACCI field
               being validated.
            3. In the 'KEY-PRVFLD' trigger of the ACCI field
               being validated. </multilinecomment>
BEGIN
	 IF nokglob.f_global_string ('FINANCE_INSTALLED_IND') = 'Y' THEN		   	
--
--    Set the name of table for item being validated to the BASE TABLE where the item is defined,
--    returns null if the item is not a database field. 
      TABLE_NAME := GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.TRIGGER_BLOCK'), BASE_TABLE);
--
--    If the item doesn't have a BASE TABLE, (meaning it is not a database item), set the name
--    of table for item being validated to the first 7 characters of the item's name, not
--    including the block name and period preceding the item name.
      IF TABLE_NAME IS NULL THEN
         TABLE_NAME := SUBSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'), 
                             (INSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'),'.') + 1),7);
      END IF;
--
      COPY('', NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_FUND_CODE');
      COPY('', NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ORGN_CODE');
      COPY('', NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACCT_CODE');
      COPY('', NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_PROG_CODE');
      COPY('', NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACTV_CODE');
      COPY('', NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_LOCN_CODE');
      COPY('', NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_FUND_OVER');
      COPY('', NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ORGN_OVER');
      COPY('', NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACCT_OVER');
      COPY('', NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_PROG_OVER');
      COPY('', NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACTV_OVER');
      COPY('', NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_LOCN_OVER');
--
      COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ACCI_CODE' || SUFF,
           NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
      IF NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'))
            IS NOT NULL THEN
         COPY (SUBSTR(NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') ||
            '.N$_FOAPAL_FIELD')),1),
            ':' || NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'));
      END IF;
--
      COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_FUND_CODE' || SUFF,
           NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
      IF NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'))
            IS NOT NULL THEN
         COPY (SUBSTR(NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') ||
            '.N$_FOAPAL_FIELD')),1),
            ':' || NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'));
      END IF;
--
      COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ORGN_CODE' || SUFF,
           NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
      IF NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'))
            IS NOT NULL THEN
         COPY (SUBSTR(NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') ||
            '.N$_FOAPAL_FIELD')),1),
            ':' || NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'));
      END IF;
--
      COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ACCT_CODE' || SUFF,
           NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
      IF NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'))
            IS NOT NULL THEN
         COPY (SUBSTR(NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') ||
            '.N$_FOAPAL_FIELD')),1),
            ':' || NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'));
      END IF;
--
      COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_PROG_CODE' || SUFF,
           NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
      IF NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'))
            IS NOT NULL THEN
         COPY (SUBSTR(NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') ||
            '.N$_FOAPAL_FIELD')),1),
            ':' || NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'));
      END IF;
--
      COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ACTV_CODE' || SUFF,
           NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
      IF NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'))
            IS NOT NULL THEN
         COPY (SUBSTR(NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') ||
            '.N$_FOAPAL_FIELD')),1),
            ':' || NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'));
      END IF;
--
      COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_LOCN_CODE' || SUFF,
           NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
      IF NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'))
            IS NOT NULL THEN
         COPY (SUBSTR(NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') ||
            '.N$_FOAPAL_FIELD')),1),
            ':' || NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'));
      END IF;
--
      IF PROJ = 'Y' THEN
         COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_PROJ_CODE' || SUFF,
              NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
         IF NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'))
            IS NOT NULL THEN
            COPY(SUBSTR(NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') ||
                 '.N$_FOAPAL_FIELD')),1),
                  ':' || NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') ||
                  '.N$_FOAPAL_FIELD'));
         END IF;
      END IF;
--
      IF CTYP = 'Y' THEN
         COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_CTYP_CODE' || SUFF,
              NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
         IF NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'))
            IS NOT NULL THEN
            COPY(SUBSTR(NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') ||
                 '.N$_FOAPAL_FIELD')),1),
                  ':' || NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') ||
                  '.N$_FOAPAL_FIELD'));
         END IF;
      END IF;
   END IF;-- FINANCE_INSTALLED_IND
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param suff
		* @param proj
		* @param ctyp
		*/
		public void nResetFields(NString suff, NString proj, NString ctyp)
		{
			NString tableName= NString.getNull();
			if ( Nokglob.fGlobalString(toStr("FINANCE_INSTALLED_IND")).equals("Y") )
			{
				// 
				//     Set the name of table for item being validated to the BASE TABLE where the item is defined,
				//     returns null if the item is not a database field. 
				tableName = getBlockQueryDataSourceName(getTriggerBlock());
				// 
				//     If the item doesn't have a BASE TABLE, (meaning it is not a database item), set the name
				//     of table for item being validated to the first 7 characters of the item's name, not
				//     including the block name and period preceding the item name.
				if ( tableName.isNull() )
				{
					tableName = substring(getTriggerItem(), ((inStr(getTriggerItem(), toStr(".")).add(1))), toInt(7));
				}
				// 
				copy("",getTriggerBlock().append(".N$_ACCI_FUND_CODE"));
				copy("",getTriggerBlock().append(".N$_ACCI_ORGN_CODE"));
				copy("",getTriggerBlock().append(".N$_ACCI_ACCT_CODE"));
				copy("",getTriggerBlock().append(".N$_ACCI_PROG_CODE"));
				copy("",getTriggerBlock().append(".N$_ACCI_ACTV_CODE"));
				copy("",getTriggerBlock().append(".N$_ACCI_LOCN_CODE"));
				copy("",getTriggerBlock().append(".N$_ACCI_FUND_OVER"));
				copy("",getTriggerBlock().append(".N$_ACCI_ORGN_OVER"));
				copy("",getTriggerBlock().append(".N$_ACCI_ACCT_OVER"));
				copy("",getTriggerBlock().append(".N$_ACCI_PROG_OVER"));
				copy("",getTriggerBlock().append(".N$_ACCI_ACTV_OVER"));
				copy("",getTriggerBlock().append(".N$_ACCI_LOCN_OVER"));
				// 
				copy(getTriggerBlock().append(".").append(tableName).append("_ACCI_CODE").append(suff),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
				if ( !getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))).isNull() )
				{
					copy(substring(getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))), toInt(1)),toStr(":").append(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))));
				}
				// 
				copy(getTriggerBlock().append(".").append(tableName).append("_FUND_CODE").append(suff),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
				if ( !getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))).isNull() )
				{
					copy(substring(getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))), toInt(1)),toStr(":").append(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))));
				}
				// 
				copy(getTriggerBlock().append(".").append(tableName).append("_ORGN_CODE").append(suff),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
				if ( !getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))).isNull() )
				{
					copy(substring(getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))), toInt(1)),toStr(":").append(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))));
				}
				// 
				copy(getTriggerBlock().append(".").append(tableName).append("_ACCT_CODE").append(suff),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
				if ( !getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))).isNull() )
				{
					copy(substring(getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))), toInt(1)),toStr(":").append(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))));
				}
				// 
				copy(getTriggerBlock().append(".").append(tableName).append("_PROG_CODE").append(suff),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
				if ( !getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))).isNull() )
				{
					copy(substring(getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))), toInt(1)),toStr(":").append(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))));
				}
//
				copy(getTriggerBlock().append(".").append(tableName).append("_ACTV_CODE").append(suff),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
				if ( !getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))).isNull() )
				{
					copy(substring(getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))), toInt(1)),toStr(":").append(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))));
				}
				// 
				copy(getTriggerBlock().append(".").append(tableName).append("_LOCN_CODE").append(suff),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
				if ( !getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))).isNull() )
				{
					copy(substring(getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))), toInt(1)),toStr(":").append(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))));
				}
//
				if ( proj.equals("Y") )
				{
					copy(getTriggerBlock().append(".").append(tableName).append("_PROJ_CODE").append(suff),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
					if ( !getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))).isNull() )
					{
						copy(substring(getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))), toInt(1)),toStr(":").append(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))));
					}
				}
				// 
				if ( ctyp.equals("Y") )
				{
					copy(getTriggerBlock().append(".").append(tableName).append("_CTYP_CODE").append(suff),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
					if ( !getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))).isNull() )
					{
						copy(substring(getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))), toInt(1)),toStr(":").append(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD"))));
					}
				}
			}
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.N$_POINTER_TO_CURSOR
	/*
	PROCEDURE n$_pointer_to_cursor(p_field_name  VARCHAR2,
                               p_field_value VARCHAR2) is
  -- Local variables                               
  lv_y                         NUMBER(3);
  lv_top_rec                   NUMBER(3);
  lv_dif                       NUMBER(3);
  lv_curr_pos                  NUMBER(3);
  lv_item_pos                  NUMBER(3);
  lv_item_height               NUMBER(3);
begin
	-- Copy cursor value, i.e. >, to the given field name.
  COPY(p_field_value, p_field_name);
  lv_top_rec     := GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.CURSOR_BLOCK'), TOP_RECORD);
  lv_dif         := lv_top_rec - 1;
  lv_curr_pos    := TO_NUMBER(NAME_IN('SYSTEM.CURSOR_RECORD')) - lv_dif;
  lv_item_pos    := GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'), Y_POS);
  lv_item_height := GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'), HEIGHT);
  SET_ITEM_PROPERTY(p_field_name, Y_POS, lv_item_pos + ((lv_curr_pos -1) * lv_item_height));
END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pFieldName
		* @param pFieldValue
		*/
		public void nPointerToCursor(NString pFieldName, NString pFieldValue)
		{
			//  Local variables                               
			NNumber lvY= NNumber.getNull();
			NNumber lvTopRec= NNumber.getNull();
			NNumber lvDif= NNumber.getNull();
			NNumber lvCurrPos= NNumber.getNull();
			NNumber lvItemPos= NNumber.getNull();
			NNumber lvItemHeight= NNumber.getNull();
			//  Copy cursor value, i.e. >, to the given field name.
			copy(pFieldValue,pFieldName);
			// F2J_NOT_SUPPORTED : The property "BLOCK's TOP_RECORD" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\NOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
			//			lvTopRec = toNumber(SupportClasses.FORMS40.GetBlockProperty(getCursorBlock(), SupportClasses.Property.TOP_RECORD));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'BLOCK's TOP_RECORD' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\NOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
			
			
			lvDif = lvTopRec.subtract(1);
			lvCurrPos = toNumber(getCursorRecord()).subtract(lvDif);
			lvItemPos = toNumber(getItemYPos(getCursorItem()));
			lvItemHeight = toNumber(getItemHeight(getCursorItem()));
			setItemYPos(pFieldName.toString(), lvItemPos.add(((lvCurrPos.subtract(1)).multiply(lvItemHeight))).toInt32());
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.N$_FOAPAL_LIST
	/*
	PROCEDURE N$_FOAPAL_LIST IS
BEGIN
	 IF nokglob.f_global_string ('FINANCE_INSTALLED_IND') = 'Y' THEN		
		  G$_COPY_FLD_ATTR;
		  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
		  G$_CHECK_FAILURE;
		  G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),'FTV' || SUBSTR(NAME_IN('SYSTEM.CURSOR_ITEM'),
		           (INSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'),'.') + 9),4),'QUERY');
		  G$_RESET_GLOBAL;
		  IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
		     IF  GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),UPDATEABLE)  = 'TRUE'
		     OR (GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),UPDATE_NULL) = 'TRUE'
		     AND NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL)
		     OR  NAME_IN('SYSTEM.MODE')         <> 'NORMAL'
		     OR  NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW'
		     OR  NAME_IN('SYSTEM.RECORD_STATUS') = 'INSERT' THEN
		          EXECUTE_TRIGGER('LIST_VALUES_COPY');
		          COPY('','GLOBAL.VALUE');
		          DO_KEY('NEXT_ITEM');
		     ELSE
		          MESSAGE( G$_NLS.Get('NOQRPLS-0040', 'LIB','*ERROR* Item is protected against update.') );
		     END IF;
		  END IF;
	 END IF; -- FINANCE_INSTALLED_IND
END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void nFoapalList()
		{
			if ( Nokglob.fGlobalString(toStr("FINANCE_INSTALLED_IND")).equals("Y") )
			{
				getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getGoqrpls().gCheckFailure();
				//MORPHIS TODO: (JP) 31-10-2014.
				getGoqrpls().gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), toStr("FTV").append(substring(getCursorItem(), ((inStr(getCursorItem(), toStr(".")).add(9))), toInt(4))), toStr("QUERY"));
//				getGoqrpls().gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), toStr("FTV").append(substring(getCursorItem(), ((inStr(getTriggerItem(), toStr(".")).add(9))), toInt(4))), toStr("QUERY"));
//				getGoqrpls().gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), toStr("FTVORGN"), toStr("QUERY"));
				
				getGoqrpls().gResetGlobal();
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.

					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") ||  getMode().notEquals("NORMAL") || getRecordStatus().equals("NEW") || getRecordStatus().equals("INSERT") )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						executeAction("LIST_VALUES_COPY");
						copy("","GLOBAL.VALUE");
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("NOQRPLS-0040"), toStr("LIB"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.N$_EDIT_PROJ
	/*
	PROCEDURE N$_EDIT_PROJ (EFFECTIVE_DATE IN VARCHAR2,
                        EFFECTIVE_TIME  IN VARCHAR2) IS
   TABLE_NAME          VARCHAR2(07);
   COAS_CODE           VARCHAR2(1);
   PROJ_CODE           VARCHAR2(08) :=
                       NAME_IN(NAME_IN(':SYSTEM.TRIGGER_ITEM'));
   PROJ_TERM_DATE      DATE;
   EFFECTIVE_DATE_TIME DATE;
   lv_sql_stmt         VARCHAR2(1000);
   lv_proj_cd          VARCHAR2(08);
--
<multilinecomment> PURPOSE: This procedure validates the PROJ (Proj Code).
            To be valid the PROJ must:
              1. Exist on the 'FIMSMGR.FTVPROJ' table
              2. Have a null termination date or a termination date
                 greater than the effective date and time being processed
   PARAMETER DEFINITIONS:
            EFFECTIVE_DATE - Date the PROJ_CODE must be active for
            EFFECTIVE_TIME - Time the PROJ_CODE must be active for
   WHERE EXECUTED FROM:
            1. In the 'ON-VALIDATE-FIELD' trigger of the PROJ field
               being validated. </multilinecomment>
BEGIN
	 IF nokglob.f_global_string ('FINANCE_INSTALLED_IND') = 'Y' THEN	
--
--    Set the name of table for item being validated to the BASE TABLE where the item is defined,
--    returns null if the item is not a database field. 
      TABLE_NAME := GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.TRIGGER_BLOCK'), BASE_TABLE);
--
--    If the item doesn't have a BASE TABLE, (meaning it is not a database item), set the name
--    of table for item being validated to the first 7 characters of the item's name, not
--    including the block name and period preceding the item name.
      IF TABLE_NAME IS NULL THEN
         TABLE_NAME := SUBSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'), 
                             (INSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'),'.') + 1),7);
      END IF;
--
      IF PROJ_CODE IS NOT NULL THEN
         COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_COAS_CODE',
              NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
         COAS_CODE := NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'));
         EFFECTIVE_DATE_TIME :=
             TO_DATE(NVL(EFFECTIVE_DATE,TO_CHAR(SYSDATE,'YYYYMMDD')) ||
                    NVL(EFFECTIVE_TIME,'235959'),'YYYYMMDDHH24MISS');
         lv_sql_stmt :=  ' SELECT FTVPROJ_CODE, FTVPROJ_TERM_DATE '||
                         ' FROM   FTVPROJ '||
                         ' WHERE  FTVPROJ_CODE = '||''''||PROJ_CODE||''''|| 
                         ' AND    FTVPROJ_COAS_CODE = '||''''||COAS_CODE||''''|| 
                         ' AND    FTVPROJ_EFF_DATE <= '||''''||EFFECTIVE_DATE_TIME||''''|| 
                         ' AND    ROWNUM = 1';
         GOKDBMS.DYNAMIC_SQL(lv_sql_stmt, lv_proj_cd, PROJ_TERM_DATE);
         IF lv_proj_cd IS NULL THEN
            MESSAGE ( G$_NLS.Get('NOQRPLS-0038', 'LIB','*ERROR* Project Code; press LIST for valid codes.') );
            RAISE FORM_TRIGGER_FAILURE;
         ELSE
            IF PROJ_TERM_DATE IS NOT NULL THEN
               IF PROJ_TERM_DATE <= EFFECTIVE_DATE_TIME THEN MESSAGE
                  ( G$_NLS.Get('NOQRPLS-0039', 'LIB','*ERROR* Project Code entered is terminated; press LIST for valid codes.')  
                  );
                  RAISE FORM_TRIGGER_FAILURE;
               END IF;
            END IF;
         END IF; -- PROJ_TERM_DATE
      END IF; -- PROJ_CODE
   END IF; -- FINANCE_INSTALLED_IND
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param effectiveDate
		* @param effectiveTime
		*/
		public void nEditProj(NString effectiveDate, NString effectiveTime)
		{
			NString tableName= NString.getNull();
			NString coasCode= NString.getNull();
			NString projCode = getNameIn(getTriggerItem()); //MORPHIS TODO: (JP) 31-10-2014.
			NDate projTermDate= NDate.getNull();
			NDate effectiveDateTime= NDate.getNull();
			NString lvSqlStmt= NString.getNull();
			NString lvProjCd= NString.getNull();
			if ( Nokglob.fGlobalString(toStr("FINANCE_INSTALLED_IND")).equals("Y") )
			{
//
				//     Set the name of table for item being validated to the BASE TABLE where the item is defined,
				//     returns null if the item is not a database field. 
				tableName = getBlockQueryDataSourceName(getTriggerBlock());
//
				//     If the item doesn't have a BASE TABLE, (meaning it is not a database item), set the name
				//     of table for item being validated to the first 7 characters of the item's name, not
				//     including the block name and period preceding the item name.
				if ( tableName.isNull() )
				{
					tableName = substring(getTriggerItem(), ((inStr(getTriggerItem(), toStr(".")).add(1))), toInt(7));
				}
				// 
				if ( !projCode.isNull() )
				{
					copy(getTriggerBlock().append(".").append(tableName).append("_COAS_CODE"),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
					coasCode = getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD")));
					effectiveDateTime = toDate(isNull(effectiveDate, toChar(NDate.getNow(), "YYYYMMDD")).append(isNull(effectiveTime, "235959")), "YYYYMMDDHH24MISS");
					lvSqlStmt = toStr(" SELECT FTVPROJ_CODE, FTVPROJ_TERM_DATE ").append(" FROM   FTVPROJ ").append(" WHERE  FTVPROJ_CODE = ").append("'").append(projCode).append("'").append(" AND    FTVPROJ_COAS_CODE = ").append("'").append(coasCode).append("'").append(" AND    FTVPROJ_EFF_DATE <= ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(" AND    ROWNUM = 1");
					Ref<NString> p_return_value1_ref = new Ref<NString>(lvProjCd);
					Ref<NString> p_return_value2_ref = new Ref<NString>();
					Gokdbms.dynamicSql(lvSqlStmt, p_return_value1_ref, p_return_value2_ref);
					lvProjCd = p_return_value1_ref.val;
					if (p_return_value2_ref.val.isNotNull())
						projTermDate = toDate (p_return_value2_ref.val, GDate.getNlsDateFormat()) ;
					if ( lvProjCd.isNull() )
					{
						errorMessage(GNls.Fget(toStr("NOQRPLS-0038"), toStr("LIB"), toStr("*ERROR* Project Code; press LIST for valid codes.")));
						throw new ApplicationException();
					}
					else {
						if ( !projTermDate.isNull() )
						{
							if ( projTermDate.lesserOrEquals(effectiveDateTime) )
							{
								errorMessage(GNls.Fget(toStr("NOQRPLS-0039"), toStr("LIB"), toStr("*ERROR* Project Code entered is terminated; press LIST for valid codes.")));
								throw new ApplicationException();
							}
						}
					}
				}
			}
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.N$_EDIT_PROG
	/*
	PROCEDURE N$_EDIT_PROG (EFFECTIVE_DATE IN VARCHAR2,
                       EFFECTIVE_TIME  IN VARCHAR2) IS
   TABLE_NAME          VARCHAR2(07);
   SUFF                VARCHAR2(20);
   COAS_CODE           VARCHAR2(1);
   PROG_CODE           VARCHAR2(06) :=
                       NAME_IN(NAME_IN(':SYSTEM.TRIGGER_ITEM'));
   PROG_STATUS_IND     VARCHAR2(1);
   PROG_TERM_DATE      DATE;
   PROG_DATA_ENTRY_IND VARCHAR2(1);
   EFFECTIVE_DATE_TIME DATE;
   lv_sql_stmt         VARCHAR2(1000);
--
<multilinecomment> PURPOSE: This procedure validates the PROG (Prog Code).
            To be valid the PROG must:
              1. Be equal to the 'ACCI_PROG_CODE' of the Account index
                 code, if the 'ACCI_PROG_OVER' of the Account index
                 code is 'N'
              2. Exist on the 'FIMSMGR.FTVPROG' table
              3. Have a status indicator of 'A' for the effective
                 date and time being processed
              4. Have a null termination date or a termination date
                 greater than the effective date and time being processed
              5. Be defined as Data Entry
   PARAMETER DEFINITIONS:
            EFFECTIVE_DATE - Date the PROG_CODE must be active for
            EFFECTIVE_TIME - Time the PROG_CODE must be active for
   WHERE EXECUTED FROM:
            1. In the 'ON-VALIDATE-FIELD' trigger of the PROG field
               being validated. </multilinecomment>
BEGIN
	 IF nokglob.f_global_string ('FINANCE_INSTALLED_IND') = 'Y' THEN
--
--    Set the name of table for item being validated to the BASE TABLE where the item is defined,
--    returns null if the item is not a database field. 
      TABLE_NAME := GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.TRIGGER_BLOCK'), BASE_TABLE);
--
--    If the item doesn't have a BASE TABLE, (meaning it is not a database item), set the name
--    of table for item being validated to the first 7 characters of the item's name, not
--    including the block name and period preceding the item name.
      IF TABLE_NAME IS NULL THEN
         TABLE_NAME := SUBSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'), 
                             (INSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'),'.') + 1),7);
      END IF;
--
      SUFF := SUBSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'), INSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'),'_CODE'));
--
      IF NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_PROG_OVER') = 'Y' THEN
         NULL ;
      ELSIF
         NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_PROG_OVER') = 'N' THEN
         IF (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_PROG_CODE') =
             PROG_CODE) OR
            (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_PROG_CODE')
             IS NULL AND PROG_CODE IS NULL)
            THEN NULL;
         ELSE
            COPY (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_PROG_CODE'),
                  NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_PROG' ||
                  SUFF);
            MESSAGE
              ( G$_NLS.Get('NOQRPLS-0033', 'LIB','*ERROR* Account Index will not allow a Program override.') );
            RAISE FORM_TRIGGER_FAILURE;
         END IF ;
      END IF ;
--
      IF PROG_CODE IS NOT NULL THEN
         COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_COAS_CODE',
              NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
         COAS_CODE := NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'));
         EFFECTIVE_DATE_TIME :=
             TO_DATE(NVL(EFFECTIVE_DATE,TO_CHAR(SYSDATE,'YYYYMMDD')) ||
                    NVL(EFFECTIVE_TIME,'235959'),'YYYYMMDDHH24MISS');
                                       
         lv_sql_stmt :=  ' SELECT FTVPROG_STATUS_IND, '||
                                ' FTVPROG_TERM_DATE, '||
                                ' FTVPROG_DATA_ENTRY_IND '||
                         ' FROM   FTVPROG '||
									       ' WHERE  FTVPROG_COAS_CODE =  '||''''||COAS_CODE||''''|| 
									       ' AND    FTVPROG_PROG_CODE =  '||''''||PROG_CODE||''''|| 
									       ' AND    FTVPROG_EFF_DATE <=  '||''''||EFFECTIVE_DATE_TIME||''''|| 
									       ' AND    (FTVPROG_NCHG_DATE IS NULL '||
									       ' OR      FTVPROG_NCHG_DATE > '||''''||EFFECTIVE_DATE_TIME||''''||')'||
									       ' AND    ROWNUM = 1';
--
         GOKDBMS.DYNAMIC_SQL(lv_sql_stmt, PROG_STATUS_IND,
                                          PROG_TERM_DATE,
                                          PROG_DATA_ENTRY_IND);
         IF PROG_STATUS_IND IS NULL THEN
         	  MESSAGE ( G$_NLS.Get('NOQRPLS-0034', 'LIB','*ERROR* Program Code; press LIST for valid codes.') );
            RAISE FORM_TRIGGER_FAILURE;
         ELSE 
		        IF PROG_STATUS_IND != 'A' THEN MESSAGE
		            ( G$_NLS.Get('NOQRPLS-0035', 'LIB','*ERROR* Program Code entered is inactive; press LIST for valid codes.')  
		            );
		           RAISE FORM_TRIGGER_FAILURE;
		        END IF;
		--
		        IF PROG_TERM_DATE IS NOT NULL THEN
		           IF PROG_TERM_DATE <= EFFECTIVE_DATE_TIME THEN MESSAGE
		               ( G$_NLS.Get('NOQRPLS-0036', 'LIB','*ERROR* Program Code entered is terminated; press LIST for valid codes.')  
		               );
		               RAISE FORM_TRIGGER_FAILURE;
		           END IF;
		        END IF;
		--
		        IF PROG_DATA_ENTRY_IND != 'Y' THEN MESSAGE
		            ( G$_NLS.Get('NOQRPLS-0037', 'LIB','*ERROR* Program Code is not defined as Data Entry.') );
		            RAISE FORM_TRIGGER_FAILURE;
		        END IF;
		     END IF; --PROG_STATUS_IND
      END IF; -- PROG_CODE IS NOT NULL
   END IF; -- FINANCE_INSTALLED_IND
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param effectiveDate
		* @param effectiveTime
		*/
		public void nEditProg(NString effectiveDate, NString effectiveTime)
		{
			NString tableName= NString.getNull();
			NString suff= NString.getNull();
			NString coasCode= NString.getNull();
			NString progCode = getNameIn(getTriggerItem()); //MORPHIS TODO: (JP) 31-10-2014.
			NString progStatusInd= NString.getNull();
			NDate progTermDate= NDate.getNull();
			NString progDataEntryInd= NString.getNull();
			NDate effectiveDateTime= NDate.getNull();
			NString lvSqlStmt= NString.getNull();
			if ( Nokglob.fGlobalString(toStr("FINANCE_INSTALLED_IND")).equals("Y") )
			{
				// 
				//     Set the name of table for item being validated to the BASE TABLE where the item is defined,
				//     returns null if the item is not a database field. 
				tableName = getBlockQueryDataSourceName(getTriggerBlock());
				// 
				//     If the item doesn't have a BASE TABLE, (meaning it is not a database item), set the name
				//     of table for item being validated to the first 7 characters of the item's name, not
				//     including the block name and period preceding the item name.
				if ( tableName.isNull() )
				{
					tableName = substring(getTriggerItem(), ((inStr(getTriggerItem(), toStr(".")).add(1))), toInt(7));
				}
				// 
				suff = substring(getTriggerItem(), inStr(getTriggerItem(), toStr("_CODE")));
				// 
				if ( getNameIn(getTriggerBlock().append(".N$_ACCI_PROG_OVER")).equals("Y") )
				{
				}
				else if ( getNameIn(getTriggerBlock().append(".N$_ACCI_PROG_OVER")).equals("N") ) {
					if ( (getNameIn(getTriggerBlock().append(".N$_ACCI_PROG_CODE")).equals(progCode)) || (getNameIn(getTriggerBlock().append(".N$_ACCI_PROG_CODE")).isNull() && progCode.isNull()) )
					{
					}
					else {
						copy(getNameIn(getTriggerBlock().append(".N$_ACCI_PROG_CODE")),getTriggerBlock().append(".").append(tableName).append("_PROG").append(suff));
						errorMessage(GNls.Fget(toStr("NOQRPLS-0033"), toStr("LIB"), toStr("*ERROR* Account Index will not allow a Program override.")));
						throw new ApplicationException();
					}
				}
				// 
				if ( !progCode.isNull() )
				{
					copy(getTriggerBlock().append(".").append(tableName).append("_COAS_CODE"),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
					coasCode = getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD")));
					effectiveDateTime = toDate(isNull(effectiveDate, toChar(NDate.getNow(), "YYYYMMDD")).append(isNull(effectiveTime, "235959")), "YYYYMMDDHH24MISS");
					lvSqlStmt = toStr(" SELECT FTVPROG_STATUS_IND, ").append(" FTVPROG_TERM_DATE, ").append(" FTVPROG_DATA_ENTRY_IND ").append(" FROM   FTVPROG ").append(" WHERE  FTVPROG_COAS_CODE =  ").append("'").append(coasCode).append("'").append(" AND    FTVPROG_PROG_CODE =  ").append("'").append(progCode).append("'").append(" AND    FTVPROG_EFF_DATE <=  ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(" AND    (FTVPROG_NCHG_DATE IS NULL ").append(" OR      FTVPROG_NCHG_DATE > ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(")").append(" AND    ROWNUM = 1");
					Ref<NString> p_return_value1_ref = new Ref<NString>(progStatusInd);
					Ref<NString> p_return_value2_ref = new Ref<NString>();
					Ref<NString> p_return_value3_ref = new Ref<NString>(progDataEntryInd);
					Gokdbms.dynamicSql(lvSqlStmt, p_return_value1_ref, p_return_value2_ref, p_return_value3_ref);
					progStatusInd = p_return_value1_ref.val;
					if (p_return_value2_ref.val.isNotNull())
						progTermDate = toDate (p_return_value2_ref.val, GDate.getNlsDateFormat()) ;
					progDataEntryInd = p_return_value3_ref.val;
					if ( progStatusInd.isNull() )
					{
						errorMessage(GNls.Fget(toStr("NOQRPLS-0034"), toStr("LIB"), toStr("*ERROR* Program Code; press LIST for valid codes.")));
						throw new ApplicationException();
					}
					else {
						if ( progStatusInd.notEquals("A") )
						{
							errorMessage(GNls.Fget(toStr("NOQRPLS-0035"), toStr("LIB"), toStr("*ERROR* Program Code entered is inactive; press LIST for valid codes.")));
							throw new ApplicationException();
						}
//
						if ( !progTermDate.isNull() )
						{
							if ( progTermDate.lesserOrEquals(effectiveDateTime) )
							{
								errorMessage(GNls.Fget(toStr("NOQRPLS-0036"), toStr("LIB"), toStr("*ERROR* Program Code entered is terminated; press LIST for valid codes.")));
								throw new ApplicationException();
							}
						}
//
						if ( progDataEntryInd.notEquals("Y") )
						{
							errorMessage(GNls.Fget(toStr("NOQRPLS-0037"), toStr("LIB"), toStr("*ERROR* Program Code is not defined as Data Entry.")));
							throw new ApplicationException();
						}
					}
				}
			}
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.N$_EDIT_POSTING_DATE
	/*
	PROCEDURE N$_EDIT_POSTING_DATE ( POSTING_DATE  IN DATE, COAS_CODE IN VARCHAR2 ) IS
   SELECT_RC   VARCHAR2(1) ;
   lv_sql_stmt VARCHAR2(1000);
   P_DATE DATE;
BEGIN
	 IF nokglob.f_global_string ('FINANCE_INSTALLED_IND') = 'Y' THEN
	 	
		  IF POSTING_DATE IS NULL THEN
		     RETURN ;
		  END IF ;	 
		  P_DATE := TO_DATE(TO_CHAR(POSTING_DATE,'YYYYMMDDHH24MISS'), 'YYYYMMDDHH24MISS') ;
      lv_sql_stmt :=  'SELECT  FTVFSPD_COAS_CODE ' ||
										  ' FROM   FTVFSPD '||
											' WHERE  FTVFSPD_COAS_CODE =  '||''''||COAS_CODE||''''||
											' AND    '||''''||P_DATE||''''||
											           ' BETWEEN FTVFSPD_PRD_START_DATE '||
											           ' AND    FTVFSPD_PRD_END_DATE '||
											' AND    ROWNUM = 1';
		     
			GOKDBMS.DYNAMIC_SQL(lv_sql_stmt, SELECT_RC);
		  IF SELECT_RC IS NULL THEN
		     MESSAGE ( G$_NLS.Get('NOQRPLS-0032', 'LIB','*ERROR* Posting Date does not fall within a defined accounting period.') );
		     G$_DATE_WHEN_NEW_ITEM ;
		     RAISE FORM_TRIGGER_FAILURE;
		  END IF;
	 END IF;
END ;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param postingDate
		* @param coasCode
		*/
		public void nEditPostingDate(NDate postingDate, NString coasCode)
		{
			NString selectRc= NString.getNull();
			NString lvSqlStmt= NString.getNull();
			NDate pDate= NDate.getNull();
			if ( Nokglob.fGlobalString(toStr("FINANCE_INSTALLED_IND")).equals("Y") )
			{
				if ( postingDate.isNull() )
				{
					return ;
				}
				pDate = toDate(toChar(postingDate, "YYYYMMDDHH24MISS"), "YYYYMMDDHH24MISS");
				lvSqlStmt = toStr("SELECT  FTVFSPD_COAS_CODE ").append(" FROM   FTVFSPD ").append(" WHERE  FTVFSPD_COAS_CODE =  ").append("'").append(coasCode).append("'").append(" AND    ").append("'").append(pDate).append("'").append(" BETWEEN FTVFSPD_PRD_START_DATE ").append(" AND    FTVFSPD_PRD_END_DATE ").append(" AND    ROWNUM = 1");
				Ref<NString> p_return_value1_ref = new Ref<NString>(selectRc);
				Gokdbms.dynamicSql(lvSqlStmt, p_return_value1_ref);
				selectRc = p_return_value1_ref.val;
				if ( selectRc.isNull() )
				{
					errorMessage(GNls.Fget(toStr("NOQRPLS-0032"), toStr("LIB"), toStr("*ERROR* Posting Date does not fall within a defined accounting period.")));
					getGoqrpls().gDateWhenNewItem();
					throw new ApplicationException();
				}
			}
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.N$_EDIT_ORGN_COMMENTS
	/*
	PROCEDURE N$_EDIT_ORGN_COMMENTS IS
  -- *******  COMMENTS  *******
-- PURPOSE: This procedure validates the ORGN (Orgn Code).
--            To be valid the ORGN must:
--              1. Be equal to the 'ACCI_ORGN_CODE' of the Account index
--                 code, if the 'ACCI_ORGN_OVER' of the Account index
--                 code is 'N'
--              2. Exist on the 'FIMSMGR.FTVORGN' table
--              3. Have a status indicator of 'A' for the effective
--                 date and time being processed
--              4. Have a null termination date or a termination date
--                 greater than the effective date and time being processed
--              5. Be defined as Data Entry
--   PARAMETER DEFINITIONS:
--            EFFECTIVE_DATE - Date the ORGN_CODE must be active for
--            EFFECTIVE_TIME - Time the ORGN_CODE must be active for
--   WHERE EXECUTED FROM:
--              1. In the 'ON-VALIDATE-FIELD' trigger of the ORGN field
--                 being validated.
--   DEFAULT INFORMATION:
--        Defaulting occurs for forms 'NBAJOBS', 'NBAPBUD', 'PHAHOUR', 'PHATIME' and 'PHAREDS' only.
--
--        When the ORGN code is changed to a null value and the cursor leaves
--        the ORGN code field no further defaulting occurs.
--
--        When the ORGN code is changed to a not null value and the cursor
--        leaves the ORGN code field:
--
--        1. If a FUND code field exist and has not been entered the following occurs:
--
--            The (FUND) becomes equal to the ORGN code's default FUND
--            IF (PROG exist and IS NULL) it becomes equal to the ORGN code's default PROG
--            IF (ACTV exist and IS NULL) it becomes equal to the ORGN code's default ACTV
--            IF (LOCN exist and IS NULL) it becomes equal to the ORGN code's default LOCN.
--
--        2. If a FUND code field does not exist the following occurs:
--
--            IF (PROG exist and IS NULL) it becomes equal to the ORGN code's default PROG
--            IF (ACTV exist and IS NULL) it becomes equal to the ORGN code's default ACTV
--            IF (LOCN exist and IS NULL) it becomes equal to the ORGN code's default LOCN.
--
--        3. If a FUND code has been entered the following occurs:
--
--           If the FUND code's 'Default_Override_Ind' indicates that the FUND
--           code's defaults are to be used then the following occurs:
--
--            IF (ORGN exist and IS NULL) it becomes equal to the FUND code's default ORGN
--            IF (PROG exist and IS NULL) it becomes equal to the FUND code's default PROG
--            IF (ACTV exist and IS NULL) it becomes equal to the FUND code's default ACTV
--            IF (LOCN exist and IS NULL) it becomes equal to the FUND code's default LOCN.
--
--            IF (PROG exist and IS NULL) it becomes equal to the ORGN code's default PROG
--            IF (ACTV exist and IS NULL) it becomes equal to the ORGN code's default ACTV
--            IF (LOCN exist and IS NULL) it becomes equal to the ORGN code's default LOCN.
--
--
--           If the FUND code's 'Default_Override_Ind' indicates that the ORGN
--           code's defaults are to be used then the following occurs:
--
--            IF (FUND exist and IS NULL) it becomes equal to the ORGN code's default FUND
--            IF (PROG exist and IS NULL) it becomes equal to the ORGN code's default PROG
--            IF (ACTV exist and IS NULL) it becomes equal to the ORGN code's default ACTV
--            IF (LOCN exist and IS NULL) it becomes equal to the ORGN code's default LOCN.
--
--            IF (PROG exist and IS NULL) it becomes equal to the FUND code's default PROG
--            IF (ACTV exist and IS NULL) it becomes equal to the FUND code's default ACTV
--            IF (LOCN exist and IS NULL) it becomes equal to the FUND code's default LOCN.
BEGIN
--    Set the name of table for item being validated to the BASE TABLE where the item is defined,
--    returns null if the item is not a database field. 

--    If the item doesn't have a BASE TABLE, (meaning it is not a database item), set the name
--    of table for item being validated to the first 7 characters of the item's name, not
--    including the block name and period preceding the item name.
null;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void nEditOrgnComments()
		{
			//     Set the name of table for item being validated to the BASE TABLE where the item is defined,
			//     returns null if the item is not a database field. 
			//     If the item doesn't have a BASE TABLE, (meaning it is not a database item), set the name
			//     of table for item being validated to the first 7 characters of the item's name, not
			//     including the block name and period preceding the item name.
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.N$_EDIT_ORGN
	/*
	PROCEDURE N$_EDIT_ORGN (EFFECTIVE_DATE IN VARCHAR2,
                       EFFECTIVE_TIME  IN VARCHAR2) IS
   TABLE_NAME          VARCHAR2(07);
   SUFF                VARCHAR2(20);
   COAS_CODE           VARCHAR2(1);
   ORGN_CODE           VARCHAR2(06) :=
                       NAME_IN(NAME_IN(':SYSTEM.TRIGGER_ITEM'));
   ORGN_STATUS_IND     VARCHAR2(1);
   ORGN_TERM_DATE      DATE;
   ORGN_DATA_ENTRY_IND VARCHAR2(1);
   EFFECTIVE_DATE_TIME DATE;
   ORGN_FUND_DEF       VARCHAR2(6);
   ORGN_PROG_DEF       VARCHAR2(6);
   ORGN_ACTV_DEF       VARCHAR2(6);
   ORGN_LOCN_DEF       VARCHAR2(6);
   FUND_FTYP           VARCHAR2(2);
   GLOBAL_FUND_FTYP    VARCHAR2(2);
   FUND_OVERRIDE_IND   VARCHAR2(1);
   FLD_EXIST           VARCHAR2(80) := '';
   lv_sql_stmt         VARCHAR2(1000);
   
--
-- FOR COMMENTS SEE N$_EDIT_ORGN_COMMENTS
--
BEGIN
--
	 IF nokglob.f_global_string ('FINANCE_INSTALLED_IND') = 'Y' THEN
	 	
      TABLE_NAME := GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.TRIGGER_BLOCK'), BASE_TABLE);
--
      IF TABLE_NAME IS NULL THEN
         TABLE_NAME := SUBSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'), 
                             (INSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'),'.') + 1),7);
      END IF;
--
      SUFF := SUBSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'), INSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'),'_CODE'));
--
      IF NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ORGN_OVER') = 'Y' THEN
         NULL ;
      ELSIF
         NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ORGN_OVER') = 'N' THEN
         IF (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ORGN_CODE') =
             ORGN_CODE) OR
            (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ORGN_CODE')
             IS NULL AND ORGN_CODE IS NULL)
            THEN NULL;
         ELSE
            COPY (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ORGN_CODE'),
                  NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ORGN' ||
                  SUFF);
            MESSAGE
              ( G$_NLS.Get('NOQRPLS-0027', 'LIB','*ERROR* Account Index will not allow an Organization override.') );
            RAISE FORM_TRIGGER_FAILURE;
         END IF ;
      END IF ;
--
      IF ORGN_CODE IS NOT NULL THEN
         COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_COAS_CODE',
              NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
         COAS_CODE := NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'));
         EFFECTIVE_DATE_TIME :=
             TO_DATE(NVL(EFFECTIVE_DATE,TO_CHAR(SYSDATE,'YYYYMMDD')) ||
                    NVL(EFFECTIVE_TIME,'235959'),'YYYYMMDDHH24MISS');
         lv_sql_stmt :=  'SELECT FTVORGN_STATUS_IND, '||
			                         ' FTVORGN_TERM_DATE, '||
								               ' FTVORGN_DATA_ENTRY_IND, '||
								               ' FTVORGN_FUND_CODE_DEF, '||
								               ' FTVORGN_PROG_CODE_DEF, '||
								               ' FTVORGN_ACTV_CODE_DEF, '||
								               ' FTVORGN_LOCN_CODE_DEF '||
								         ' FROM   FTVORGN '||
								         ' WHERE  FTVORGN_COAS_CODE = '||''''||COAS_CODE||''''||
								         ' AND    FTVORGN_ORGN_CODE = '||''''||ORGN_CODE||''''||
								         ' AND    FTVORGN_EFF_DATE <= '||''''||EFFECTIVE_DATE_TIME||''''||
								         ' AND    (FTVORGN_NCHG_DATE IS NULL '||
								         ' OR      FTVORGN_NCHG_DATE > '||''''||EFFECTIVE_DATE_TIME||''''||')'||
								         ' AND    ROWNUM = 1';
--
				 NOKRECS.P_DYNAMIC_SQL(lv_sql_stmt, ORGN_STATUS_IND,
														                ORGN_TERM_DATE,
														                ORGN_DATA_ENTRY_IND,
														                ORGN_FUND_DEF,
														                ORGN_PROG_DEF,
														                ORGN_ACTV_DEF,
														                ORGN_LOCN_DEF);					                
         IF ORGN_STATUS_IND IS NULL THEN
            MESSAGE ( G$_NLS.Get('NOQRPLS-0028', 'LIB','*ERROR* Organization Code; press LIST for valid codes.') );
            RAISE FORM_TRIGGER_FAILURE;
         ELSE    
	          COPY(ORGN_FUND_DEF,'GLOBAL.ORGN_FUND_DEF');
	          COPY(ORGN_PROG_DEF,'GLOBAL.ORGN_PROG_DEF');
	          COPY(ORGN_ACTV_DEF,'GLOBAL.ORGN_ACTV_DEF');
	          COPY(ORGN_LOCN_DEF,'GLOBAL.ORGN_LOCN_DEF');
	          IF ORGN_STATUS_IND != 'A' THEN MESSAGE
	             ( G$_NLS.Get('NOQRPLS-0029', 'LIB','*ERROR* Organization Code entered is inactive; press LIST for valid codes.')  
	             );
	             RAISE FORM_TRIGGER_FAILURE;
	          END IF;
	--
	          IF ORGN_TERM_DATE IS NOT NULL THEN
	             IF ORGN_TERM_DATE <= EFFECTIVE_DATE_TIME THEN MESSAGE
	                ( G$_NLS.Get('NOQRPLS-0030', 'LIB','*ERROR* Organization Code entered is terminated; press LIST for valid codes.')  
	                );
	                RAISE FORM_TRIGGER_FAILURE;
	             END IF;
	          END IF;
	--
	          IF ORGN_DATA_ENTRY_IND != 'Y' THEN MESSAGE
	             ( G$_NLS.Get('NOQRPLS-0031', 'LIB','*ERROR* Organization is not defined as Data Entry.') );
	             RAISE FORM_TRIGGER_FAILURE;
	          END IF;
	--
	          IF NAME_IN('SYSTEM.CURRENT_FORM') = 'NBAJOBS' THEN
	             NULL;
	          ELSIF NAME_IN('SYSTEM.CURRENT_FORM') = 'NBAPBUD' THEN
	             NULL;
	          ELSIF NAME_IN('SYSTEM.CURRENT_FORM') = 'PHAHOUR' THEN
	             NULL;
		        ELSIF NAME_IN('SYSTEM.CURRENT_FORM') = 'PHATIME' THEN
	             NULL;
	          ELSIF NAME_IN('SYSTEM.CURRENT_FORM') = 'PHAREDS' THEN
	             NULL;
	          ELSE 
	             RETURN;
	          END IF ;
	--
	          FLD_EXIST := NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_FUND' || SUFF;
	          IF ((NOT id_null(find_item(FLD_EXIST))) AND
	             (name_in(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_FUND' || SUFF)
	             IS NOT NULL)) THEN
	             N$_EDIT_FUND(EFFECTIVE_DATE,EFFECTIVE_TIME);
	--
	             GLOBAL_FUND_FTYP := NAME_IN('GLOBAL.FUND_FTYP');
	             FUND_FTYP        := GLOBAL_FUND_FTYP;
	--
	             lv_sql_stmt :=  'SELECT FTVFTYP_DEF_OVERRIDE_IND '||
										           ' FROM   FTVFTYP '||
										           ' WHERE  FTVFTYP_FTYP_CODE  =  '||''''||FUND_FTYP||''''|| 
										           ' AND    FTVFTYP_COAS_CODE  =  '||''''||COAS_CODE||''''|| 
										           ' AND    FTVFTYP_EFF_DATE  <=  '||''''||EFFECTIVE_DATE_TIME||''''|| 
										           ' AND    FTVFTYP_NCHG_DATE  >  '||''''||EFFECTIVE_DATE_TIME||''''|| 
										           ' AND    (FTVFTYP_TERM_DATE >  '||''''||EFFECTIVE_DATE_TIME||''''|| 
										                  ' OR FTVFTYP_TERM_DATE IS NULL)';
               GOKDBMS.DYNAMIC_SQL(lv_sql_stmt, FUND_OVERRIDE_IND);
	             COPY(FUND_OVERRIDE_IND,'GLOBAL.FUND_OVERRIDE_IND');
	          ELSE
	             COPY('N','GLOBAL.FUND_OVERRIDE_IND');
	          END IF ;
	--
	          FOR i IN 1..2 LOOP
		           IF ((NAME_IN('GLOBAL.FUND_OVERRIDE_IND') = 'N' ) OR
		               (NAME_IN('GLOBAL.FUND_OVERRIDE_IND') = 'O' )) THEN
		          --
		              FLD_EXIST := NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_FUND' || SUFF;
		              IF id_null(find_item(FLD_EXIST)) THEN
		                 NULL;
		              ELSIF name_in(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_FUND' || SUFF)
		                 IS NULL THEN
		                 COPY (NAME_IN('GLOBAL.ORGN_FUND_DEF'), NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' ||
		                                  TABLE_NAME || '_FUND' || SUFF);
		              END IF ;
		           --
		              FLD_EXIST := NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_PROG' || SUFF;
		              IF id_null(find_item(FLD_EXIST)) THEN
		                 NULL;
		              ELSIF name_in(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_PROG' || SUFF)
		                 IS NULL THEN
		                    COPY (NAME_IN('GLOBAL.ORGN_PROG_DEF'), NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' ||
		                             TABLE_NAME || '_PROG' || SUFF);
		              END IF ;
		           --
		              FLD_EXIST := NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ACTV' || SUFF;
		              IF id_null(find_item(FLD_EXIST)) THEN
		                 NULL;
		              ELSIF name_in(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ACTV' || SUFF)
		                 IS NULL THEN
		                 COPY (NAME_IN('GLOBAL.ORGN_ACTV_DEF'), NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' ||
		                             TABLE_NAME || '_ACTV'  || SUFF);
		              END IF ;
		           --
		              FLD_EXIST := NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_LOCN' || SUFF;
		              IF id_null(find_item(FLD_EXIST)) THEN
		                 NULL;
		              ELSIF name_in(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_LOCN' || SUFF)
		                 IS NULL THEN
		                    COPY (NAME_IN('GLOBAL.ORGN_LOCN_DEF'), NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' ||
		                             TABLE_NAME || '_LOCN' || SUFF);
		              END IF ;
		           --
		           END IF;
		--
		           IF (NAME_IN('GLOBAL.FUND_OVERRIDE_IND') = 'F' ) THEN
		           --
		              FLD_EXIST := NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ORGN' || SUFF;
		              IF  id_null(find_item(FLD_EXIST)) THEN
		                        NULL;
		              ELSIF name_in(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ORGN' || SUFF)
		                   IS NULL THEN
		                       COPY (NAME_IN('GLOBAL.FUND_ORGN_DEF'), NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' ||
		                             TABLE_NAME || '_ORGN' || SUFF);
		              END IF ;
		           --
		              FLD_EXIST := NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_PROG' || SUFF;
		              IF  id_null(find_item(FLD_EXIST)) THEN
		                        NULL;
		              ELSIF name_in(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_PROG' || SUFF)
		                  IS NULL THEN
		                      COPY (NAME_IN('GLOBAL.FUND_PROG_DEF'), NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' ||
		                            TABLE_NAME || '_PROG' || SUFF);
		              END IF ;
		           --
		              FLD_EXIST := NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ACTV' || SUFF;
		              IF  id_null(find_item(FLD_EXIST)) THEN
		                        NULL;
		              ELSIF name_in(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ACTV' || SUFF)
		                  IS NULL THEN
		                      COPY (NAME_IN('GLOBAL.FUND_ACTV_DEF'), NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' ||
		                            TABLE_NAME || '_ACTV' || SUFF);
		              END IF ;
		           --
		              FLD_EXIST := NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_LOCN' || SUFF;
		              IF  id_null(find_item(FLD_EXIST)) THEN
		                        NULL;
		              ELSIF name_in(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_LOCN' || SUFF)
		                  IS NULL THEN
		                      COPY (NAME_IN('GLOBAL.FUND_LOCN_DEF'), NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' ||
		                            TABLE_NAME || '_LOCN' || SUFF);
		              END IF ;
		           --
		           END IF; --GLOBAL.FUND_OVERRIDE_IND
		--
			         IF (NAME_IN('GLOBAL.FUND_OVERRIDE_IND') = 'N' ) THEN
			            EXIT;
			         ELSIF (NAME_IN('GLOBAL.FUND_OVERRIDE_IND') = 'F' ) THEN
			            COPY('O','GLOBAL.FUND_OVERRIDE_IND');
			         ELSIF (NAME_IN('GLOBAL.FUND_OVERRIDE_IND') = 'O' ) THEN
			            COPY('F','GLOBAL.FUND_OVERRIDE_IND');
			         ELSE
			            EXIT;
		 	         END IF ;
		--
	          END LOOP;
	       END IF; -- ORGN_STATUS_IND
      END IF ; --ORGN_CODE IS NOT NULL
--
   END IF; -- FINANCE_INSTALLED_IND
END;
	*/
	/* <p>
/* </p>
		* @param effectiveDate
		* @param effectiveTime
		*/
		public void nEditOrgn(NString effectiveDate, NString effectiveTime)
		{
			NString tableName= NString.getNull();
			NString suff= NString.getNull();
			NString coasCode= NString.getNull();
			NString orgnCode = getNameIn(getTriggerItem()); //MORPHIS TODO: (JP) 31-10-2014.
			NString orgnStatusInd= NString.getNull();
			NDate orgnTermDate= NDate.getNull();
			NString orgnDataEntryInd= NString.getNull();
			NDate effectiveDateTime= NDate.getNull();
			NString orgnFundDef= NString.getNull();
			NString orgnProgDef= NString.getNull();
			NString orgnActvDef= NString.getNull();
			NString orgnLocnDef= NString.getNull();
			NString fundFtyp= NString.getNull();
			NString globalFundFtyp= NString.getNull();
			NString fundOverrideInd= NString.getNull();
			NString fldExist = toStr("");
			NString lvSqlStmt= NString.getNull();
			// 
			if ( Nokglob.fGlobalString(toStr("FINANCE_INSTALLED_IND")).equals("Y") )
			{
				tableName = getBlockQueryDataSourceName(getTriggerBlock());
				// 
				if ( tableName.isNull() )
				{
					tableName = substring(getTriggerItem(), ((inStr(getTriggerItem(), toStr(".")).add(1))), toInt(7));
				}
				// 
				suff = substring(getTriggerItem(), inStr(getTriggerItem(), toStr("_CODE")));
				// 
				if ( getNameIn(getTriggerBlock().append(".N$_ACCI_ORGN_OVER")).equals("Y") )
				{
				}
				else if ( getNameIn(getTriggerBlock().append(".N$_ACCI_ORGN_OVER")).equals("N") ) {
					if ( (getNameIn(getTriggerBlock().append(".N$_ACCI_ORGN_CODE")).equals(orgnCode)) || (getNameIn(getTriggerBlock().append(".N$_ACCI_ORGN_CODE")).isNull() && orgnCode.isNull()) )
					{
					}
					else {
						copy(getNameIn(getTriggerBlock().append(".N$_ACCI_ORGN_CODE")),getTriggerBlock().append(".").append(tableName).append("_ORGN").append(suff));
						errorMessage(GNls.Fget(toStr("NOQRPLS-0027"), toStr("LIB"), toStr("*ERROR* Account Index will not allow an Organization override.")));
						throw new ApplicationException();
					}
				}
				// 
				if ( !orgnCode.isNull() )
				{
					copy(getTriggerBlock().append(".").append(tableName).append("_COAS_CODE"),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
					coasCode = getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD")));
					effectiveDateTime = toDate(isNull(effectiveDate, toChar(NDate.getNow(), "YYYYMMDD")).append(isNull(effectiveTime, "235959")), "YYYYMMDDHH24MISS");
					lvSqlStmt = toStr("SELECT FTVORGN_STATUS_IND, ").append(" FTVORGN_TERM_DATE, ").append(" FTVORGN_DATA_ENTRY_IND, ").append(" FTVORGN_FUND_CODE_DEF, ").append(" FTVORGN_PROG_CODE_DEF, ").append(" FTVORGN_ACTV_CODE_DEF, ").append(" FTVORGN_LOCN_CODE_DEF ").append(" FROM   FTVORGN ").append(" WHERE  FTVORGN_COAS_CODE = ").append("'").append(coasCode).append("'").append(" AND    FTVORGN_ORGN_CODE = ").append("'").append(orgnCode).append("'").append(" AND    FTVORGN_EFF_DATE <= ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(" AND    (FTVORGN_NCHG_DATE IS NULL ").append(" OR      FTVORGN_NCHG_DATE > ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(")").append(" AND    ROWNUM = 1");
					Ref<NString> p_return_value1_ref = new Ref<NString>(orgnStatusInd);
					Ref<NString> p_return_value2_ref = new Ref<NString>();
					Ref<NString> p_return_value3_ref = new Ref<NString>(orgnDataEntryInd);
					Ref<NString> p_return_value4_ref = new Ref<NString>(orgnFundDef);
					Ref<NString> p_return_value5_ref = new Ref<NString>(orgnProgDef);
					Ref<NString> p_return_value6_ref = new Ref<NString>(orgnActvDef);
					Ref<NString> p_return_value7_ref = new Ref<NString>(orgnLocnDef);
					Nokrecs.pDynamicSql(lvSqlStmt, p_return_value1_ref, p_return_value2_ref, p_return_value3_ref, p_return_value4_ref, p_return_value5_ref, p_return_value6_ref, p_return_value7_ref);
					orgnStatusInd = p_return_value1_ref.val;
					if (p_return_value2_ref.val.isNotNull())
						orgnTermDate = toDate (p_return_value2_ref.val, GDate.getNlsDateFormat()) ;
					orgnDataEntryInd = p_return_value3_ref.val;
					orgnFundDef = p_return_value4_ref.val;
					orgnProgDef = p_return_value5_ref.val;
					orgnActvDef = p_return_value6_ref.val;
					orgnLocnDef = p_return_value7_ref.val;
					if ( orgnStatusInd.isNull() )
					{
						errorMessage(GNls.Fget(toStr("NOQRPLS-0028"), toStr("LIB"), toStr("*ERROR* Organization Code; press LIST for valid codes.")));
						throw new ApplicationException();
					}
					else {
						copy(orgnFundDef,"GLOBAL.ORGN_FUND_DEF");
						copy(orgnProgDef,"GLOBAL.ORGN_PROG_DEF");
						copy(orgnActvDef,"GLOBAL.ORGN_ACTV_DEF");
						copy(orgnLocnDef,"GLOBAL.ORGN_LOCN_DEF");
						if ( orgnStatusInd.notEquals("A") )
						{
							errorMessage(GNls.Fget(toStr("NOQRPLS-0029"), toStr("LIB"), toStr("*ERROR* Organization Code entered is inactive; press LIST for valid codes.")));
							throw new ApplicationException();
						}
						// 
						if ( !orgnTermDate.isNull() )
						{
							if ( orgnTermDate.lesserOrEquals(effectiveDateTime) )
							{
								errorMessage(GNls.Fget(toStr("NOQRPLS-0030"), toStr("LIB"), toStr("*ERROR* Organization Code entered is terminated; press LIST for valid codes.")));
								throw new ApplicationException();
							}
						}
						// 
						if ( orgnDataEntryInd.notEquals("Y") )
						{
							errorMessage(GNls.Fget(toStr("NOQRPLS-0031"), toStr("LIB"), toStr("*ERROR* Organization is not defined as Data Entry.")));
							throw new ApplicationException();
						}
						// 
						if ( getCurrentTaskName().equals("NBAJOBS") )
						{
						}
						else if ( getCurrentTaskName().equals("NBAPBUD") ) {
						}
						else if ( getCurrentTaskName().equals("PHAHOUR") ) {
						}
						else if ( getCurrentTaskName().equals("PHATIME") ) {
						}
						else if ( getCurrentTaskName().equals("PHAREDS") ) {
						}
						else {
							return ;
						}
						// 
						fldExist = getTriggerBlock().append(".").append(tableName).append("_FUND").append(suff);
						if (((!(findItem(fldExist) == null)) && (!getNameIn(getTriggerBlock().append(".").append(tableName).append("_FUND").append(suff)).isNull())))
						{
							nEditFund(effectiveDate, effectiveTime);
							// 
							globalFundFtyp = getNameIn("GLOBAL.FUND_FTYP");
							fundFtyp = globalFundFtyp;
							// 
							lvSqlStmt = toStr("SELECT FTVFTYP_DEF_OVERRIDE_IND ").append(" FROM   FTVFTYP ").append(" WHERE  FTVFTYP_FTYP_CODE  =  ").append("'").append(fundFtyp).append("'").append(" AND    FTVFTYP_COAS_CODE  =  ").append("'").append(coasCode).append("'").append(" AND    FTVFTYP_EFF_DATE  <=  ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(" AND    FTVFTYP_NCHG_DATE  >  ").append("'").append(effectiveDateTime).append("'").append(" AND    (FTVFTYP_TERM_DATE >  ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(" OR FTVFTYP_TERM_DATE IS NULL)");
							p_return_value1_ref = new Ref<NString>(fundOverrideInd);
							Gokdbms.dynamicSql(lvSqlStmt, p_return_value1_ref);
							fundOverrideInd = p_return_value1_ref.val;
							copy(fundOverrideInd,"GLOBAL.FUND_OVERRIDE_IND");
						}
						else {
							copy("N","GLOBAL.FUND_OVERRIDE_IND");
						}
						// 
						for ( int i = 1; i <= 2; i++ )
						{
							if (((getNameIn("GLOBAL.FUND_OVERRIDE_IND").equals("N")) || (getNameIn("GLOBAL.FUND_OVERRIDE_IND").equals("O"))))
							{
								// 
								fldExist = getTriggerBlock().append(".").append(tableName).append("_FUND").append(suff);
								if ( (findItem(fldExist) == null) )
								{
								}
								else if ( getNameIn(getTriggerBlock().append(".").append(tableName).append("_FUND").append(suff)).isNull() ) {
									copy(getNameIn("GLOBAL.ORGN_FUND_DEF"),getTriggerBlock().append(".").append(tableName).append("_FUND").append(suff));
								}
								// 
								fldExist = getTriggerBlock().append(".").append(tableName).append("_PROG").append(suff);
								if ( (findItem(fldExist) == null) )
								{
								}
								else if ( getNameIn(getTriggerBlock().append(".").append(tableName).append("_PROG").append(suff)).isNull() ) {
									copy(getNameIn("GLOBAL.ORGN_PROG_DEF"),getTriggerBlock().append(".").append(tableName).append("_PROG").append(suff));
								}
								// 
								fldExist = getTriggerBlock().append(".").append(tableName).append("_ACTV").append(suff);
								if ( (findItem(fldExist) == null) )
								{
								}
								else if ( getNameIn(getTriggerBlock().append(".").append(tableName).append("_ACTV").append(suff)).isNull() ) {
									copy(getNameIn("GLOBAL.ORGN_ACTV_DEF"),getTriggerBlock().append(".").append(tableName).append("_ACTV").append(suff));
								}
								// 
								fldExist = getTriggerBlock().append(".").append(tableName).append("_LOCN").append(suff);
								if ( (findItem(fldExist) == null) )
								{
								}
								else if ( getNameIn(getTriggerBlock().append(".").append(tableName).append("_LOCN").append(suff)).isNull() ) {
									copy(getNameIn("GLOBAL.ORGN_LOCN_DEF"),getTriggerBlock().append(".").append(tableName).append("_LOCN").append(suff));
								}
							}
							// 
							if ((getNameIn("GLOBAL.FUND_OVERRIDE_IND").equals("F")))
							{
//
								fldExist = getTriggerBlock().append(".").append(tableName).append("_ORGN").append(suff);
								if ( (findItem(fldExist) == null) )
								{
								}
								else if ( getNameIn(getTriggerBlock().append(".").append(tableName).append("_ORGN").append(suff)).isNull() ) {
									copy(getNameIn("GLOBAL.FUND_ORGN_DEF"),getTriggerBlock().append(".").append(tableName).append("_ORGN").append(suff));
								}
								// 
								fldExist = getTriggerBlock().append(".").append(tableName).append("_PROG").append(suff);
								if ( (findItem(fldExist) == null) )
								{
								}
								else if ( getNameIn(getTriggerBlock().append(".").append(tableName).append("_PROG").append(suff)).isNull() ) {
									copy(getNameIn("GLOBAL.FUND_PROG_DEF"),getTriggerBlock().append(".").append(tableName).append("_PROG").append(suff));
								}
								// 
								fldExist = getTriggerBlock().append(".").append(tableName).append("_ACTV").append(suff);
								if ( (findItem(fldExist) == null) )
								{
								}
								else if ( getNameIn(getTriggerBlock().append(".").append(tableName).append("_ACTV").append(suff)).isNull() ) {
									copy(getNameIn("GLOBAL.FUND_ACTV_DEF"),getTriggerBlock().append(".").append(tableName).append("_ACTV").append(suff));
								}
								// 
								fldExist = getTriggerBlock().append(".").append(tableName).append("_LOCN").append(suff);
								if ( (findItem(fldExist) == null) )
								{
								}
								else if ( getNameIn(getTriggerBlock().append(".").append(tableName).append("_LOCN").append(suff)).isNull() ) {
									copy(getNameIn("GLOBAL.FUND_LOCN_DEF"),getTriggerBlock().append(".").append(tableName).append("_LOCN").append(suff));
								}
							}
							// GLOBAL.FUND_OVERRIDE_IND
							// 
							if ((getNameIn("GLOBAL.FUND_OVERRIDE_IND").equals("N")))
							{
									break;
							}
							else if ((getNameIn("GLOBAL.FUND_OVERRIDE_IND").equals("F"))) {
								copy("O","GLOBAL.FUND_OVERRIDE_IND");
							}
							else if ((getNameIn("GLOBAL.FUND_OVERRIDE_IND").equals("O"))) {
								copy("F","GLOBAL.FUND_OVERRIDE_IND");
							}
							else {
									break;
							}
						}
					}
				}
			}
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.N$_EDIT_LOCN
	/*
	PROCEDURE N$_EDIT_LOCN (EFFECTIVE_DATE IN VARCHAR2,
                       EFFECTIVE_TIME  IN VARCHAR2) IS
   TABLE_NAME          VARCHAR2(07);
   SUFF                VARCHAR2(20);
   COAS_CODE           VARCHAR2(1);
   LOCN_CODE           VARCHAR2(6) :=
                       NAME_IN(NAME_IN(':SYSTEM.TRIGGER_ITEM'));
   LOCN_STATUS_IND     VARCHAR2(1);
   LOCN_TERM_DATE      DATE;
   EFFECTIVE_DATE_TIME DATE;
   lv_sql_stmt         VARCHAR2(1000);
--
<multilinecomment> PURPOSE: This procedure validates the LOCN (Locn Code).
            To be valid the LOCN must:
              1. Be equal to the 'ACCI_LOCN_CODE' of the Account index
                 code, if the 'ACCI_LOCN_OVER' of the Account index
                 code is 'N'
              2. Exist on the 'FIMSMGR.FTVLOCN' table
              3. Have a status indicator of 'A' for the effective
                 date and time being processed
              4. Have a null termination date or a termination date
                 greater than the effective date and time being processed
   PARAMETER DEFINITIONS:
            EFFECTIVE_DATE - Date the LOCN_CODE must be active for
            EFFECTIVE_TIME - Time the LOCN_CODE must be active for
   WHERE EXECUTED FROM:
            1. In the 'ON-VALIDATE-FIELD' trigger of the LOCN field
               being validated. </multilinecomment>
BEGIN
	 IF nokglob.f_global_string ('FINANCE_INSTALLED_IND') = 'Y' THEN
--
--    Set the name of table for item being validated to the BASE TABLE where the item is defined,
--    returns null if the item is not a database field. 
      TABLE_NAME := GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.TRIGGER_BLOCK'), BASE_TABLE);
--
--    If the item doesn't have a BASE TABLE, (meaning it is not a database item), set the name
--    of table for item being validated to the first 7 characters of the item's name, not
--    including the block name and period preceding the item name.
      IF TABLE_NAME IS NULL THEN
         TABLE_NAME := SUBSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'), 
                             (INSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'),'.') + 1),7);
      END IF;
--
      SUFF := SUBSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'), INSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'),'_CODE'));
--
      IF NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_LOCN_OVER') = 'Y' THEN
         NULL ;
      ELSIF
         NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_LOCN_OVER') = 'N' THEN
         IF (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_LOCN_CODE') =
             LOCN_CODE) OR
            (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_LOCN_CODE')
             IS NULL AND LOCN_CODE IS NULL)
            THEN NULL;
         ELSE
            COPY (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_LOCN_CODE'),
                  NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_LOCN' ||
                  SUFF);
            MESSAGE
              ( G$_NLS.Get('NOQRPLS-0023', 'LIB','*ERROR* Account Index will not allow a Location override.') );
            RAISE FORM_TRIGGER_FAILURE;
         END IF ;
      END IF ;
--
      IF LOCN_CODE IS NOT NULL THEN
         COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_COAS_CODE',
              NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
         COAS_CODE := NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'));
         EFFECTIVE_DATE_TIME :=
             TO_DATE(NVL(EFFECTIVE_DATE,TO_CHAR(SYSDATE,'YYYYMMDD')) ||
                    NVL(EFFECTIVE_TIME,'235959'),'YYYYMMDDHH24MISS');
                    
         lv_sql_stmt :=  'SELECT  FTVLOCN_STATUS_IND, '||
									               ' FTVLOCN_TERM_DATE '||
									       ' FROM   FTVLOCN '||
									       ' WHERE  FTVLOCN_COAS_CODE = '||''''||COAS_CODE||''''|| 
									       ' AND    FTVLOCN_LOCN_CODE = '||''''||LOCN_CODE||''''|| 
									       ' AND    FTVLOCN_EFF_DATE <= '||''''||EFFECTIVE_DATE_TIME||''''|| 
									       ' AND    (FTVLOCN_NCHG_DATE IS NULL '||
									       ' OR      FTVLOCN_NCHG_DATE > '||''''||EFFECTIVE_DATE_TIME||''''||')'||
									       ' AND    ROWNUM = 1 ';
--
         GOKDBMS.DYNAMIC_SQL(lv_sql_stmt, LOCN_STATUS_IND, LOCN_TERM_DATE);

         IF LOCN_STATUS_IND IS NULL THEN
            MESSAGE ( G$_NLS.Get('NOQRPLS-0024', 'LIB','*ERROR* Location Code; press LIST for valid codes.') );
            RAISE FORM_TRIGGER_FAILURE;
         ELSE
		        IF LOCN_STATUS_IND != 'A' THEN MESSAGE
		            ( G$_NLS.Get('NOQRPLS-0025', 'LIB','*ERROR* Location Code entered is inactive; press LIST for valid codes.')  
		            );
		           RAISE FORM_TRIGGER_FAILURE;
		        END IF;
		--
		        IF LOCN_TERM_DATE IS NOT NULL THEN
		           IF LOCN_TERM_DATE <= EFFECTIVE_DATE_TIME THEN MESSAGE
		               ( G$_NLS.Get('NOQRPLS-0026', 'LIB','*ERROR* Location Code entered is terminated; press LIST for valid codes.')  
		               );
		               RAISE FORM_TRIGGER_FAILURE;
		           END IF;
		        END IF;
		     END IF; -- LOCN_STATUS_IND
      END IF; -- LOCN_CODE
   END IF; -- FINANCE_INSTALLED_IND
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param effectiveDate
		* @param effectiveTime
		*/
		public void nEditLocn(NString effectiveDate, NString effectiveTime, NString triggerItem)
		{
			NString tableName= NString.getNull();
			NString suff= NString.getNull();
			NString coasCode= NString.getNull();
			NString locnCode = getNameIn(triggerItem); //MORPHIS TODO: (JP) 31-10-2014.
			NString locnStatusInd= NString.getNull();
			NDate locnTermDate= NDate.getNull();
			NDate effectiveDateTime= NDate.getNull();
			NString lvSqlStmt= NString.getNull();
			if ( Nokglob.fGlobalString(toStr("FINANCE_INSTALLED_IND")).equals("Y") )
			{
				// 
				//     Set the name of table for item being validated to the BASE TABLE where the item is defined,
				//     returns null if the item is not a database field. 
				tableName = getBlockQueryDataSourceName(getTriggerBlock());
				// 
				//     If the item doesn't have a BASE TABLE, (meaning it is not a database item), set the name
				//     of table for item being validated to the first 7 characters of the item's name, not
				//     including the block name and period preceding the item name.
				if ( tableName.isNull() )
				{
					tableName = substring(getTriggerItem(), ((inStr(getTriggerItem(), toStr(".")).add(1))), toInt(7));
				}
//
				suff = substring(getTriggerItem(), inStr(getTriggerItem(), toStr("_CODE")));
				// 
				if ( getNameIn(getTriggerBlock().append(".N$_ACCI_LOCN_OVER")).equals("Y") )
				{
				}
				else if ( getNameIn(getTriggerBlock().append(".N$_ACCI_LOCN_OVER")).equals("N") ) {
					if ( (getNameIn(getTriggerBlock().append(".N$_ACCI_LOCN_CODE")).equals(locnCode)) || (getNameIn(getTriggerBlock().append(".N$_ACCI_LOCN_CODE")).isNull() && locnCode.isNull()) )
					{
					}
					else {
						copy(getNameIn(getTriggerBlock().append(".N$_ACCI_LOCN_CODE")),getTriggerBlock().append(".").append(tableName).append("_LOCN").append(suff));
						errorMessage(GNls.Fget(toStr("NOQRPLS-0023"), toStr("LIB"), toStr("*ERROR* Account Index will not allow a Location override.")));
						throw new ApplicationException();
					}
				}
				// 
				if ( !locnCode.isNull() )
				{
					copy(getTriggerBlock().append(".").append(tableName).append("_COAS_CODE"),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
					coasCode = getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD")));
					effectiveDateTime = toDate(isNull(effectiveDate, toChar(NDate.getNow(), "YYYYMMDD")).append(isNull(effectiveTime, "235959")), "YYYYMMDDHH24MISS");
					lvSqlStmt = toStr("SELECT  FTVLOCN_STATUS_IND, ").append(" FTVLOCN_TERM_DATE ").append(" FROM   FTVLOCN ").append(" WHERE  FTVLOCN_COAS_CODE = ").append("'").append(coasCode).append("'").append(" AND    FTVLOCN_LOCN_CODE = ").append("'").append(locnCode).append("'").append(" AND    FTVLOCN_EFF_DATE <= ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(" AND    (FTVLOCN_NCHG_DATE IS NULL ").append(" OR      FTVLOCN_NCHG_DATE > ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(")").append(" AND    ROWNUM = 1 ");
					// 
					Ref<NString> p_return_value1_ref = new Ref<NString>(locnStatusInd);
					Ref<NString> p_return_value2_ref = new Ref<NString>();
					Gokdbms.dynamicSql(lvSqlStmt, p_return_value1_ref, p_return_value2_ref);
					locnStatusInd = p_return_value1_ref.val;
					if (p_return_value2_ref.val.isNotNull())
						locnTermDate = toDate (p_return_value2_ref.val, GDate.getNlsDateFormat()) ;
					if ( locnStatusInd.isNull() )
					{
						errorMessage(GNls.Fget(toStr("NOQRPLS-0024"), toStr("LIB"), toStr("*ERROR* Location Code; press LIST for valid codes.")));
						throw new ApplicationException();
					}
					else {
						if ( locnStatusInd.notEquals("A") )
						{
							errorMessage(GNls.Fget(toStr("NOQRPLS-0025"), toStr("LIB"), toStr("*ERROR* Location Code entered is inactive; press LIST for valid codes.")));
							throw new ApplicationException();
						}
//
						if ( !locnTermDate.isNull() )
						{
							if ( locnTermDate.lesserOrEquals(effectiveDateTime) )
							{
								errorMessage(GNls.Fget(toStr("NOQRPLS-0026"), toStr("LIB"), toStr("*ERROR* Location Code entered is terminated; press LIST for valid codes.")));
								throw new ApplicationException();
							}
						}
					}
				}
			}
		}
		
		// MORPHIS TODO: Adicionado par�metro triggerItem para dar a volta ao getTriggerItem() devolver o valor errado
		public void nEditLocn(NString effectiveDate, NString effectiveTime)
		{
			nEditLocn(effectiveDate, effectiveTime, getTriggerItem());			
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.N$_EDIT_FUND
	/*
	PROCEDURE N$_EDIT_FUND (EFFECTIVE_DATE  IN VARCHAR2,
                       EFFECTIVE_TIME   IN VARCHAR2) IS
   TABLE_NAME          VARCHAR2(07);
   SUFF                VARCHAR2(20);
   COAS_CODE           VARCHAR2(01);
   FUND_CODE           VARCHAR2(06);
   FUND_STATUS_IND     VARCHAR2(01);
   FUND_TERM_DATE      DATE;
   FUND_EXPEND_DATE    DATE;   
   FUND_DATA_ENTRY_IND VARCHAR2(01);
   EFFECTIVE_DATE_TIME DATE;
   FUND_ORGN_DEF       VARCHAR2(6);
   FUND_PROG_DEF       VARCHAR2(6);
   FUND_ACTV_DEF       VARCHAR2(6);
   FUND_LOCN_DEF       VARCHAR2(6);
   FUND_FTYP           VARCHAR2(2);
   FLD_EXIST           VARCHAR2(80) := '';
   lv_sql_stmt         VARCHAR2(1000);
--
-- *******  COMMENTS  *******
-- PURPOSE: This procedure validates the FUND (Fund Code).
--            To be valid the FUND must:
--              1. Be equal to the 'ACCI_FUND_CODE' of the Account index
--                 code, if the 'ACCI_FUND_OVER' of the Account index
--                 code is 'N'
--              2. Exist on the 'FIMSMGR.FTVFUND' table
--              3. Have a status indicator of 'A' for the effective
--                 date and time being processed
--              4. Have a null termination date or a termination date
--                 greater than the effective date and time being processed
--              5. Be defined as Data Entry
--   PARAMETER DEFINITIONS:
--              EFFECTIVE_DATE - Date the FUND_CODE must be active for
--              EFFECTIVE_TIME - Time the FUND_CODE must be active for
--   WHERE EXECUTED FROM:
--            1. In the 'ON-VALIDATE-FIELD' trigger of the FUND field
--               being validated.
--            2. 'N$_EDIT_ORGN' Procedure 
--   DEFAULT INFORMATION:
--        Defaulting occurs for forms 'NBAJOBS', 'NBAPBUD', 'PHAHOUR', 'PHATIME', and 'PHAREDS' only.       
--
--            When the FUND code is entered the following occurs:
--               IF (ORGN exist and IS NULL) it becomes equal to the 
--               FUND code's default ORGN.
--
BEGIN
	 IF nokglob.f_global_string ('FINANCE_INSTALLED_IND') = 'Y' THEN

--
--    Set the name of table for item being validated to the BASE TABLE where the item is defined,
--    returns null if the item is not a database field. 
      TABLE_NAME := GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.TRIGGER_BLOCK'), BASE_TABLE);
--
--    If the item doesn't have a BASE TABLE, (meaning it is not a database item), set the name
--    of table for item being validated to the first 7 characters of the item's name, not
--    including the block name and period preceding the item name.
      IF TABLE_NAME IS NULL THEN
         TABLE_NAME := SUBSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'), 
                             (INSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'),'.') + 1),7);
      END IF;
--
      SUFF := SUBSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'), INSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'),'_CODE'));
--
      COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_FUND' || SUFF,
           NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
      FUND_CODE := NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'));
--
      IF NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_FUND_OVER') = 'Y' THEN
         NULL ;
      ELSIF
         NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_FUND_OVER') = 'N' THEN
         IF (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_FUND_CODE') =
             FUND_CODE) OR
            (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_FUND_CODE')
             IS NULL AND FUND_CODE IS NULL)
            THEN NULL;
         ELSE
            COPY (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_FUND_CODE'),
                  NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_FUND' ||
                  SUFF);
            MESSAGE
              ( G$_NLS.Get('NOQRPLS-0017', 'LIB','*ERROR* Account Index will not allow a Fund override.') );
            RAISE FORM_TRIGGER_FAILURE;
         END IF ;
      END IF ;
--
      IF FUND_CODE IS NOT NULL THEN
         COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_COAS_CODE',
              NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
         COAS_CODE := NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'));
         EFFECTIVE_DATE_TIME :=
             TO_DATE(NVL(EFFECTIVE_DATE,TO_CHAR(SYSDATE,'YYYYMMDD')) ||
                    NVL(EFFECTIVE_TIME,'235959'),'YYYYMMDDHH24MISS');
                              
         lv_sql_stmt :=  'SELECT FTVFUND_STATUS_IND, '||
								                ' FTVFUND_TERM_DATE, '||
								                ' FTVFUND_EXPEND_END_DATE, '||
								                ' FTVFUND_DATA_ENTRY_IND, '||
								                ' FTVFUND_ORGN_CODE_DEF, '||
								                ' FTVFUND_PROG_CODE_DEF, '||
								                ' FTVFUND_ACTV_CODE_DEF, '||
								                ' FTVFUND_LOCN_CODE_DEF, '||
								                ' FTVFUND_FTYP_CODE '||
								         ' FROM   FTVFUND '||
								         ' WHERE  FTVFUND_COAS_CODE = '||''''||COAS_CODE||''''||
								         ' AND    FTVFUND_FUND_CODE = '||''''||FUND_CODE||''''||
								         ' AND    FTVFUND_EFF_DATE <= '||''''||EFFECTIVE_DATE_TIME ||''''||
								         ' AND    (FTVFUND_NCHG_DATE IS NULL '||
								         ' OR     FTVFUND_NCHG_DATE > '||''''||EFFECTIVE_DATE_TIME ||''''||')'||
								         ' AND    ROWNUM = 1';
--
         NOKRECS.P_DYNAMIC_SQL(lv_sql_stmt,   FUND_STATUS_IND,
															                FUND_TERM_DATE,
															                FUND_EXPEND_DATE,
															                FUND_DATA_ENTRY_IND,
															                FUND_ORGN_DEF,
							 								                FUND_PROG_DEF,
															                FUND_ACTV_DEF,
															                FUND_LOCN_DEF,
															                FUND_FTYP);
															                
         IF FUND_STATUS_IND IS NULL THEN
             MESSAGE ( G$_NLS.Get('NOQRPLS-0018', 'LIB','*ERROR* Fund Code; press LIST for valid codes.') );
             RAISE FORM_TRIGGER_FAILURE;
         ELSE									                
		         COPY(FUND_ORGN_DEF,'GLOBAL.FUND_ORGN_DEF');
		         COPY(FUND_PROG_DEF,'GLOBAL.FUND_PROG_DEF');
		         COPY(FUND_ACTV_DEF,'GLOBAL.FUND_ACTV_DEF');
		         COPY(FUND_LOCN_DEF,'GLOBAL.FUND_LOCN_DEF');
		         COPY(FUND_FTYP,'GLOBAL.FUND_FTYP');
		         
		         IF FUND_STATUS_IND != 'A' THEN MESSAGE
		            ( G$_NLS.Get('NOQRPLS-0019', 'LIB','*ERROR* Fund Code entered is inactive; press LIST for valid codes.')  
		            );
		            RAISE FORM_TRIGGER_FAILURE;
		         END IF;
		--
		         IF FUND_EXPEND_DATE IS NOT NULL THEN                        <multilinecomment> Defect# 77736 </multilinecomment>
		         	   IF FUND_EXPEND_DATE <= EFFECTIVE_DATE_TIME THEN MESSAGE
		               ( G$_NLS.Get('NOQRPLS-0020', 'LIB','*ERROR* Fund Code entered is terminated; press LIST for valid codes.')  
		               );
		               RAISE FORM_TRIGGER_FAILURE;
		         	   END IF;
		         ELSE         	
		         		IF FUND_TERM_DATE IS NOT NULL THEN
		            		IF FUND_TERM_DATE <= EFFECTIVE_DATE_TIME THEN MESSAGE
		               		( G$_NLS.Get('NOQRPLS-0021', 'LIB','*ERROR* Fund Code entered is terminated; press LIST for valid codes.')  
		               		);
		               		RAISE FORM_TRIGGER_FAILURE;
		            		END IF;
		         		END IF;
		         END IF; 		
		--
		         IF FUND_DATA_ENTRY_IND != 'Y' THEN MESSAGE
		            ( G$_NLS.Get('NOQRPLS-0022', 'LIB','*ERROR* Fund Code is not defined as Data Entry.') );
		            RAISE FORM_TRIGGER_FAILURE;
		         END IF;
		--
		         IF NAME_IN('SYSTEM.CURRENT_FORM') = 'NBAJOBS' THEN
		             NULL;
		         ELSIF NAME_IN('SYSTEM.CURRENT_FORM') = 'NBAPBUD' THEN
		             NULL;
		         ELSIF NAME_IN('SYSTEM.CURRENT_FORM') = 'PHAHOUR' THEN
		             NULL;
		         ELSIF NAME_IN('SYSTEM.CURRENT_FORM') = 'PHATIME' THEN
		             NULL;
		         ELSIF NAME_IN('SYSTEM.CURRENT_FORM') = 'PHAREDS' THEN
		             NULL;
		         ELSIF NAME_IN('SYSTEM.CURRENT_FORM') = 'NOAEPAF' THEN
		             NULL;
		         ELSE 
		             RETURN;
		         END IF ;
		--
		         FLD_EXIST := NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ORGN' || SUFF;
		         IF  id_null(find_item(FLD_EXIST)) THEN
		                       NULL;
		         ELSIF name_in(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ORGN' || SUFF)
		               IS NULL THEN
		                       COPY (NAME_IN('GLOBAL.FUND_ORGN_DEF'), NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' ||
		                             TABLE_NAME || '_ORGN' || SUFF);
		         END IF;
         END IF; --FUND_STATUS_IND
      END IF; --FUND_CODE
   END IF;--FINANCE_INSTALLED_IND
END;
	*/
	/* <p>
/* </p>
		* @param effectiveDate
		* @param effectiveTime
		*/
		public void nEditFund(NString effectiveDate, NString effectiveTime)
		{
			NString tableName= NString.getNull();
			NString suff= NString.getNull();
			NString coasCode= NString.getNull();
			NString fundCode= NString.getNull();
			NString fundStatusInd= NString.getNull();
			NDate fundTermDate= NDate.getNull();
			NDate fundExpendDate= NDate.getNull();
			NString fundDataEntryInd= NString.getNull();
			NDate effectiveDateTime= NDate.getNull();
			NString fundOrgnDef= NString.getNull();
			NString fundProgDef= NString.getNull();
			NString fundActvDef= NString.getNull();
			NString fundLocnDef= NString.getNull();
			NString fundFtyp= NString.getNull();
			NString fldExist = toStr("");
			NString lvSqlStmt= NString.getNull();
			if ( Nokglob.fGlobalString(toStr("FINANCE_INSTALLED_IND")).equals("Y") )
			{
				// 
				//     Set the name of table for item being validated to the BASE TABLE where the item is defined,
				//     returns null if the item is not a database field. 
				tableName = getBlockQueryDataSourceName(getTriggerBlock());
				// 
				//     If the item doesn't have a BASE TABLE, (meaning it is not a database item), set the name
				//     of table for item being validated to the first 7 characters of the item's name, not
				//     including the block name and period preceding the item name.
				if ( tableName.isNull() )
				{
					tableName = substring(getTriggerItem(), ((inStr(getTriggerItem(), toStr(".")).add(1))), toInt(7));
				}
				// 
				suff = substring(getTriggerItem(), inStr(getTriggerItem(), toStr("_CODE")));
				// 
				copy(getTriggerBlock().append(".").append(tableName).append("_FUND").append(suff),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
				fundCode = getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD")));
				// 
				if ( getNameIn(getTriggerBlock().append(".N$_ACCI_FUND_OVER")).equals("Y") )
				{
				}
				else if ( getNameIn(getTriggerBlock().append(".N$_ACCI_FUND_OVER")).equals("N") ) {
					if ( (getNameIn(getTriggerBlock().append(".N$_ACCI_FUND_CODE")).equals(fundCode)) || (getNameIn(getTriggerBlock().append(".N$_ACCI_FUND_CODE")).isNull() && fundCode.isNull()) )
					{
					}
					else {
						copy(getNameIn(getTriggerBlock().append(".N$_ACCI_FUND_CODE")),getTriggerBlock().append(".").append(tableName).append("_FUND").append(suff));
						errorMessage(GNls.Fget(toStr("NOQRPLS-0017"), toStr("LIB"), toStr("*ERROR* Account Index will not allow a Fund override.")));
						throw new ApplicationException();
					}
				}
				// 
				if ( !fundCode.isNull() )
				{
					copy(getTriggerBlock().append(".").append(tableName).append("_COAS_CODE"),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
					coasCode = getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD")));
					effectiveDateTime = toDate(isNull(effectiveDate, toChar(NDate.getNow(), "YYYYMMDD")).append(isNull(effectiveTime, "235959")), "YYYYMMDDHH24MISS");
					lvSqlStmt = toStr("SELECT FTVFUND_STATUS_IND, ").append(" FTVFUND_TERM_DATE, ").append(" FTVFUND_EXPEND_END_DATE, ").append(" FTVFUND_DATA_ENTRY_IND, ").append(" FTVFUND_ORGN_CODE_DEF, ").append(" FTVFUND_PROG_CODE_DEF, ").append(" FTVFUND_ACTV_CODE_DEF, ").append(" FTVFUND_LOCN_CODE_DEF, ").append(" FTVFUND_FTYP_CODE ").append(" FROM   FTVFUND ").append(" WHERE  FTVFUND_COAS_CODE = ").append("'").append(coasCode).append("'").append(" AND    FTVFUND_FUND_CODE = ").append("'").append(fundCode).append("'").append(" AND    FTVFUND_EFF_DATE <= ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(" AND    (FTVFUND_NCHG_DATE IS NULL ").append(" OR     FTVFUND_NCHG_DATE > ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(")").append(" AND    ROWNUM = 1");
					// 
					Ref<NString> p_return_value1_ref = new Ref<NString>(fundStatusInd);
					Ref<NString> p_return_value2_ref = new Ref<NString>();
					Ref<NString> p_return_value3_ref = new Ref<NString>();
					Ref<NString> p_return_value4_ref = new Ref<NString>(fundDataEntryInd);
					Ref<NString> p_return_value5_ref = new Ref<NString>(fundOrgnDef);
					Ref<NString> p_return_value6_ref = new Ref<NString>(fundProgDef);
					Ref<NString> p_return_value7_ref = new Ref<NString>(fundActvDef);
					Ref<NString> p_return_value8_ref = new Ref<NString>(fundLocnDef);
					Ref<NString> p_return_value9_ref = new Ref<NString>(fundFtyp);
					Nokrecs.pDynamicSql(lvSqlStmt, p_return_value1_ref, p_return_value2_ref, p_return_value3_ref, p_return_value4_ref, p_return_value5_ref, p_return_value6_ref, p_return_value7_ref, p_return_value8_ref, p_return_value9_ref);
					fundStatusInd = p_return_value1_ref.val;
					if (p_return_value2_ref.val.isNotNull())
						fundTermDate = toDate (p_return_value2_ref.val, GDate.getNlsDateFormat()) ;
					if (p_return_value3_ref.val.isNotNull())
						fundExpendDate = toDate (p_return_value3_ref.val, GDate.getNlsDateFormat()) ;
					fundDataEntryInd = p_return_value4_ref.val;
					fundOrgnDef = p_return_value5_ref.val;
					fundProgDef = p_return_value6_ref.val;
					fundActvDef = p_return_value7_ref.val;
					fundLocnDef = p_return_value8_ref.val;
					fundFtyp = p_return_value9_ref.val;
					if ( fundStatusInd.isNull() )
					{
						errorMessage(GNls.Fget(toStr("NOQRPLS-0018"), toStr("LIB"), toStr("*ERROR* Fund Code; press LIST for valid codes.")));
						throw new ApplicationException();
					}
					else {
						copy(fundOrgnDef,"GLOBAL.FUND_ORGN_DEF");
						copy(fundProgDef,"GLOBAL.FUND_PROG_DEF");
						copy(fundActvDef,"GLOBAL.FUND_ACTV_DEF");
						copy(fundLocnDef,"GLOBAL.FUND_LOCN_DEF");
						copy(fundFtyp,"GLOBAL.FUND_FTYP");
						if ( fundStatusInd.notEquals("A") )
						{
							errorMessage(GNls.Fget(toStr("NOQRPLS-0019"), toStr("LIB"), toStr("*ERROR* Fund Code entered is inactive; press LIST for valid codes.")));
							throw new ApplicationException();
						}
						// 
						if ( !fundExpendDate.isNull() )
						{
							//  Defect# 77736 
							if ( fundExpendDate.lesserOrEquals(effectiveDateTime) )
							{
								errorMessage(GNls.Fget(toStr("NOQRPLS-0020"), toStr("LIB"), toStr("*ERROR* Fund Code entered is terminated; press LIST for valid codes.")));
								throw new ApplicationException();
							}
						}
						else {
							if ( !fundTermDate.isNull() )
							{
								if ( fundTermDate.lesserOrEquals(effectiveDateTime) )
								{
									errorMessage(GNls.Fget(toStr("NOQRPLS-0021"), toStr("LIB"), toStr("*ERROR* Fund Code entered is terminated; press LIST for valid codes.")));
									throw new ApplicationException();
								}
							}
						}
						// 
						if ( fundDataEntryInd.notEquals("Y") )
						{
							errorMessage(GNls.Fget(toStr("NOQRPLS-0022"), toStr("LIB"), toStr("*ERROR* Fund Code is not defined as Data Entry.")));
							throw new ApplicationException();
						}
//
						if ( getCurrentTaskName().equals("NBAJOBS") )
						{
						}
						else if ( getCurrentTaskName().equals("NBAPBUD") ) {
						}
						else if ( getCurrentTaskName().equals("PHAHOUR") ) {
						}
						else if ( getCurrentTaskName().equals("PHATIME") ) {
						}
						else if ( getCurrentTaskName().equals("PHAREDS") ) {
						}
						else if ( getCurrentTaskName().equals("NOAEPAF") ) {
						}
						else {
							return ;
						}
//
						fldExist = getTriggerBlock().append(".").append(tableName).append("_ORGN").append(suff);
						if ( (findItem(fldExist) == null) )
						{
						}
						else if ( getNameIn(getTriggerBlock().append(".").append(tableName).append("_ORGN").append(suff)).isNull() ) {
							copy(getNameIn("GLOBAL.FUND_ORGN_DEF"),getTriggerBlock().append(".").append(tableName).append("_ORGN").append(suff));
						}
					}
				}
			}
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.N$_EDIT_CTYP
	/*
	PROCEDURE N$_EDIT_CTYP IS
   CTYP_CODE           VARCHAR2(08) :=
                       NAME_IN(NAME_IN(':SYSTEM.TRIGGER_ITEM'));
   DUMMY               VARCHAR2(08);
   lv_sql_stmt         VARCHAR2(1000);
--
<multilinecomment> PURPOSE: This procedure validates the CTYP (Ctyp Code).
            To be valid the CTYP must:
              1. Exist on the 'FIMSMGR.FTVCTYP' table
   PARAMETER DEFINITIONS:
            NONE
   WHERE EXECUTED FROM:
            1. In the 'ON-VALIDATE-FIELD' trigger of the CTYP field
               being validated. </multilinecomment>
BEGIN
--
   IF nokglob.f_global_string ('FINANCE_INSTALLED_IND') = 'Y' THEN
      IF CTYP_CODE IS NOT NULL THEN
         lv_sql_stmt :=  'SELECT FTVCTYP_CODE '||
                         ' FROM   FTVCTYP '||
                         ' WHERE  FTVCTYP_CODE = '||''''||CTYP_CODE||''''|| 
                         ' AND    ROWNUM = 1';
      
          GOKDBMS.DYNAMIC_SQL(lv_sql_stmt,DUMMY);

          IF DUMMY IS NULL THEN
             MESSAGE ( G$_NLS.Get('NOQRPLS-0016', 'LIB','*ERROR* Cost Type Code; press LIST for valid codes.') );
             RAISE FORM_TRIGGER_FAILURE;
          END IF;
      END IF;
   END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void nEditCtyp()
		{
			NString ctypCode = getNameIn(getTriggerItem()); //MORPHIS TODO: (JP) 31-10-2014.
			NString dummy= NString.getNull();
			NString lvSqlStmt= NString.getNull();
//
			if ( Nokglob.fGlobalString(toStr("FINANCE_INSTALLED_IND")).equals("Y") )
			{
				if ( !ctypCode.isNull() )
				{
					lvSqlStmt = toStr("SELECT FTVCTYP_CODE ").append(" FROM   FTVCTYP ").append(" WHERE  FTVCTYP_CODE = ").append("'").append(ctypCode).append("'").append(" AND    ROWNUM = 1");
					Ref<NString> p_return_value1_ref = new Ref<NString>(dummy);
					Gokdbms.dynamicSql(lvSqlStmt, p_return_value1_ref);
					dummy = p_return_value1_ref.val;
					if ( dummy.isNull() )
					{
						errorMessage(GNls.Fget(toStr("NOQRPLS-0016"), toStr("LIB"), toStr("*ERROR* Cost Type Code; press LIST for valid codes.")));
						throw new ApplicationException();
					}
				}
			}
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.N$_EDIT_COAS
	/*
	PROCEDURE N$_EDIT_COAS (EFFECTIVE_DATE IN VARCHAR2,
                       EFFECTIVE_TIME  IN VARCHAR2) IS
   COAS_CODE           VARCHAR2(01) :=
                       NAME_IN(NAME_IN(':SYSTEM.TRIGGER_ITEM'));
   COAS_STATUS_IND     VARCHAR2(1);
   COAS_TERM_DATE      DATE;
   EFFECTIVE_DATE_TIME DATE;
   lv_sql_stmt         VARCHAR2(1000);
--
<multilinecomment> PURPOSE: This procedure validates the COAS (Chart of Accounts code).
            To be valid the COAS must:
              1. Exist on the 'FIMSMGR.FTVCOAS' table
              2. Have a status indicator of 'A' for the effective
                 date and time being processed
              3. Have a null termination date or a termination date
                 greater than the effective date and time being processed
   PARAMETER DEFINITIONS:
            EFFECTIVE_DATE - Date the COAS_CODE must be active for
            EFFECTIVE_TIME - Time the COAS_CODE must be active for
   WHERE EXECUTED FROM:
            1. In the 'ON-VALIDATE-FIELD' trigger of the COAS field
               being validated. </multilinecomment>
BEGIN
   IF nokglob.f_global_string ('FINANCE_INSTALLED_IND') = 'Y' THEN

	
      EFFECTIVE_DATE_TIME :=
          TO_DATE(NVL(EFFECTIVE_DATE,TO_CHAR(SYSDATE,'YYYYMMDD')) ||
                 NVL(EFFECTIVE_TIME,'235959'),'YYYYMMDDHH24MISS');
--
      lv_sql_stmt := 'SELECT FTVCOAS_STATUS_IND, '||
                     ' FTVCOAS_TERM_DATE '||
                     ' FROM   FTVCOAS '||
                     ' WHERE  FTVCOAS_COAS_CODE = '||''''|| COAS_CODE ||''''|| 
                     ' AND    FTVCOAS_EFF_DATE <= '||''''|| EFFECTIVE_DATE_TIME ||''''|| 
                     ' AND    (FTVCOAS_NCHG_DATE IS NULL '||
                     ' OR      FTVCOAS_NCHG_DATE > '||''''|| EFFECTIVE_DATE_TIME ||''''|| ')'||
                     ' AND    ROWNUM = 1';
--
      GOKDBMS.DYNAMIC_SQL(lv_sql_stmt,COAS_STATUS_IND, COAS_TERM_DATE);

      IF  COAS_STATUS_IND IS NULL THEN
		      MESSAGE ( G$_NLS.Get('NOQRPLS-0013', 'LIB','*ERROR* Chart Of Accounts; press LIST for valid codes.') );
		      RAISE FORM_TRIGGER_FAILURE;
      ELSE             
		      IF COAS_STATUS_IND != 'A' THEN MESSAGE
		         ( G$_NLS.Get('NOQRPLS-0014', 'LIB','*ERROR* Chart Of Accounts entered is inactive; press LIST for valid codes.')  
		         );
		         RAISE FORM_TRIGGER_FAILURE;
		      END IF;
		--
		      IF COAS_TERM_DATE IS NOT NULL THEN
		         IF COAS_TERM_DATE <= EFFECTIVE_DATE_TIME THEN MESSAGE
		            ( G$_NLS.Get('NOQRPLS-0015', 'LIB','*ERROR* Chart Of Accounts entered is terminated; press LIST for valid codes.')  
		            );
		            RAISE FORM_TRIGGER_FAILURE;
		         END IF;
		      END IF;
      END IF; -- COAS_STATUS_IND
   END IF; -- FINANCE_INSTALLED_IND    
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param effectiveDate
		* @param effectiveTime
		*/
		public void nEditCoas(NString effectiveDate, NString effectiveTime)
		{
			
			
			
//			NString coasCode = getNameIn(getTriggerItem());
			//NString coasCode = getNameIn(getCurrentField()); //MORPHIS TODO: (JP) 03-11-2014.
			NString coasCode = getNameIn(getTriggerItem());
			NString coasStatusInd= NString.getNull();
			NDate coasTermDate= NDate.getNull();
			NDate effectiveDateTime= NDate.getNull();
			NString lvSqlStmt= NString.getNull();
			if ( Nokglob.fGlobalString(toStr("FINANCE_INSTALLED_IND")).equals("Y") )
			{
				effectiveDateTime = toDate(isNull(effectiveDate, toChar(NDate.getNow(), "YYYYMMDD")).append(isNull(effectiveTime, "235959")), "YYYYMMDDHH24MISS");
				// 
				lvSqlStmt = toStr("SELECT FTVCOAS_STATUS_IND, ").append(" FTVCOAS_TERM_DATE ").append(" FROM   FTVCOAS ").append(" WHERE  FTVCOAS_COAS_CODE = ").append("'").append(coasCode).append("'").append(" AND    FTVCOAS_EFF_DATE <= ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(" AND    (FTVCOAS_NCHG_DATE IS NULL ").append(" OR      FTVCOAS_NCHG_DATE > ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(")").append(" AND    ROWNUM = 1");
				Ref<NString> p_return_value1_ref = new Ref<NString>();
				Ref<NString> p_return_value2_ref = new Ref<NString>();
				Gokdbms.dynamicSql(lvSqlStmt, p_return_value1_ref, p_return_value2_ref);
				coasStatusInd = p_return_value1_ref.val;
				if (p_return_value2_ref.val.isNotNull())
				     coasTermDate = toDate (p_return_value2_ref.val, GDate.getNlsDateFormat()) ;
				if ( coasStatusInd.isNull() )
				{
					errorMessage(GNls.Fget(toStr("NOQRPLS-0013"), toStr("LIB"), toStr("*ERROR* Chart Of Accounts; press LIST for valid codes.")));
					throw new ApplicationException();
				}
				else {
					if ( coasStatusInd.notEquals("A") )
					{
						errorMessage(GNls.Fget(toStr("NOQRPLS-0014"), toStr("LIB"), toStr("*ERROR* Chart Of Accounts entered is inactive; press LIST for valid codes.")));
						throw new ApplicationException();
					}
//
					if ( !coasTermDate.isNull() )
					{
						if ( coasTermDate.lesserOrEquals(effectiveDateTime) )
						{
							errorMessage(GNls.Fget(toStr("NOQRPLS-0015"), toStr("LIB"), toStr("*ERROR* Chart Of Accounts entered is terminated; press LIST for valid codes.")));
							throw new ApplicationException();
						}
					}
				}
			}
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.N$_EDIT_ATYP
	/*
	PROCEDURE N$_EDIT_ATYP (COAS_CODE         IN VARCHAR2,
                       ATYP_CODE          IN VARCHAR2,
                       INTERNAL_ATYP_CODE IN VARCHAR2,
                       EFFECTIVE_DATE     IN VARCHAR2,
                       EFFECTIVE_TIME     IN VARCHAR2) IS
   DUMMY               VARCHAR2(1);
   EFFECTIVE_DATE_TIME DATE;
   lv_sql_stmt         VARCHAR2(1000);
--
<multilinecomment> PURPOSE: This procedure validates the ATYP (Account Type).
            To be valid the ATYP must:
              1. Exist on the 'FIMSMGR.FTVATYP' table
              2. Have a status indicator of 'A' for the effective
                 date and time being processed
              3. Have a null termination date or a termination date
                 greater than the effective date and time being processed
   PARAMETER DEFINITIONS:
            COAS_CODE - Chart of Accounts for the 'ATYP_CODE'
            ATYP_CODE - Atyp Code to be validated
            INTERNAL_ATYP_CODE - Internal account type code for the ATYP
            EFFECTIVE_DATE - Date the ATYP_CODE must be active for
            EFFECTIVE_TIME - Time the ATYP_CODE must be active for
   WHERE EXECUTED FROM:
            1. 'N$_EDIT_ACCT' Procedure </multilinecomment>
BEGIN
--
   IF nokglob.f_global_string ('FINANCE_INSTALLED_IND') = 'Y' THEN

      EFFECTIVE_DATE_TIME :=
          TO_DATE(NVL(EFFECTIVE_DATE,TO_CHAR(SYSDATE,'YYYYMMDD')) ||
                 NVL(EFFECTIVE_TIME,'235959'),'YYYYMMDDHH24MISS');
      lv_sql_stmt :=  'SELECT ''x'' '||
		                      ' FROM   FTVATYP '||
		                      ' WHERE  FTVATYP_COAS_CODE = '||''''||COAS_CODE ||''''||
		                      ' AND    FTVATYP_ATYP_CODE = '||''''||ATYP_CODE ||''''||
		                      ' AND    FTVATYP_INTERNAL_ATYP_CODE = '||''''||INTERNAL_ATYP_CODE ||''''||
		                      ' AND    FTVATYP_EFF_DATE <= '||''''||EFFECTIVE_DATE_TIME||''''||
		                      ' AND    (FTVATYP_NCHG_DATE IS NULL '||
		                      ' OR      FTVATYP_NCHG_DATE > '||''''||EFFECTIVE_DATE_TIME||''''||')'||
		                      ' AND    (FTVATYP_TERM_DATE IS NULL '||
		                      ' OR      FTVATYP_TERM_DATE > '||''''|| EFFECTIVE_DATE_TIME||''''||')'||
		                      ' AND    ROWNUM = 1';
--
      GOKDBMS.DYNAMIC_SQL(lv_sql_stmt,DUMMY);
      IF DUMMY IS NULL THEN
         MESSAGE ( G$_NLS.Get('NOQRPLS-0012', 'LIB','*ERROR* Account Code entered is not a Labor Account; press LIST for valid codes.')  
              );
         RAISE FORM_TRIGGER_FAILURE;
      END IF;
   END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param atypCode
		* @param internalAtypCode
		* @param effectiveDate
		* @param effectiveTime
		*/
		public void nEditAtyp(NString coasCode, NString atypCode, NString internalAtypCode, NString effectiveDate, NString effectiveTime)
		{
			NString dummy= NString.getNull();
			NDate effectiveDateTime= NDate.getNull();
			NString lvSqlStmt= NString.getNull();
//
			if ( Nokglob.fGlobalString(toStr("FINANCE_INSTALLED_IND")).equals("Y") )
			{
				effectiveDateTime = toDate(isNull(effectiveDate, toChar(NDate.getNow(), "YYYYMMDD")).append(isNull(effectiveTime, "235959")), "YYYYMMDDHH24MISS");
				lvSqlStmt = toStr("SELECT 'x' ").append(" FROM   FTVATYP ").append(" WHERE  FTVATYP_COAS_CODE = ").append("'").append(coasCode).append("'").append(" AND    FTVATYP_ATYP_CODE = ").append("'").append(atypCode).append("'").append(" AND    FTVATYP_INTERNAL_ATYP_CODE = ").append("'").append(internalAtypCode).append("'").append(" AND    FTVATYP_EFF_DATE <= ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(" AND    (FTVATYP_NCHG_DATE IS NULL ").append(" OR      FTVATYP_NCHG_DATE > ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(")").append(" AND    (FTVATYP_TERM_DATE IS NULL ").append(" OR      FTVATYP_TERM_DATE > ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(")").append(" AND    ROWNUM = 1");
				Ref<NString> p_return_value1_ref = new Ref<NString>(dummy);
				Gokdbms.dynamicSql(lvSqlStmt, p_return_value1_ref);
				dummy = p_return_value1_ref.val;
				if ( dummy.isNull() )
				{
					errorMessage(GNls.Fget(toStr("NOQRPLS-0012"), toStr("LIB"), toStr("*ERROR* Account Code entered is not a Labor Account; press LIST for valid codes.")));
					throw new ApplicationException();
				}
			}
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.N$_EDIT_ACTV
	/*
	PROCEDURE N$_EDIT_ACTV (EFFECTIVE_DATE IN VARCHAR2,
                       EFFECTIVE_TIME  IN VARCHAR2) IS
   TABLE_NAME          VARCHAR2(07);
   SUFF                VARCHAR2(20);
   COAS_CODE           VARCHAR2(1);
   ACTV_CODE           VARCHAR2(06) :=
                       NAME_IN(NAME_IN(':SYSTEM.TRIGGER_ITEM'));
   ACTV_STATUS_IND     VARCHAR2(1);
   ACTV_TERM_DATE      DATE;
   EFFECTIVE_DATE_TIME DATE;
   lv_sql_stmt         VARCHAR2(1000);
--
<multilinecomment> PURPOSE: This procedure validates the ACTV (Actv Code).
            To be valid the ACTV must:
              1. Be equal to the 'ACCI_ACTV_CODE' of the Account index
                 code, if the 'ACCI_ACTV_OVER' of the Account index
                 code is 'N'
              2. Exist on the 'FIMSMGR.FTVACTV' table
              3. Have a status indicator of 'A' for the effective
                 date and time being processed
              4. Have a null termination date or a termination date
                 greater than the effective date and time being processed
   PARAMETER DEFINITIONS:
            EFFECTIVE_DATE - Date the ACTV_CODE must be active for
            EFFECTIVE_TIME - Time the ACTV_CODE must be active for
   WHERE EXECUTED FROM:
            1. In the 'ON-VALIDATE-FIELD' trigger of the ACTV field
               being validated. </multilinecomment>
BEGIN
   IF nokglob.f_global_string ('FINANCE_INSTALLED_IND') = 'Y' THEN

--
--    Set the name of table for item being validated to the BASE TABLE where the item is defined,
--    returns null if the item is not a database field. 
      TABLE_NAME := GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.TRIGGER_BLOCK'), BASE_TABLE);
--
--    If the item doesn't have a BASE TABLE, (meaning it is not a database item), set the name
--    of table for item being validated to the first 7 characters of the item's name, not
--    including the block name and period preceding the item name.
      IF TABLE_NAME IS NULL THEN
         TABLE_NAME := SUBSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'), 
                             (INSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'),'.') + 1),7);
      END IF;
--
      SUFF := SUBSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'), INSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'),'_CODE'));
--
      IF NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACTV_OVER') = 'Y' THEN
         NULL ;
      ELSIF
         NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACTV_OVER') = 'N' THEN
         IF (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACTV_CODE') =
            ACTV_CODE) OR
            (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACTV_CODE')
             IS NULL AND ACTV_CODE IS NULL)
            THEN NULL;
         ELSE
            COPY (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACTV_CODE'),
                  NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ACTV' ||
                  SUFF);
            MESSAGE
              ( G$_NLS.Get('NOQRPLS-0008', 'LIB','*ERROR* Account Index will not allow an Activity override.') );
            RAISE FORM_TRIGGER_FAILURE;
         END IF ;
      END IF ;
--
      IF ACTV_CODE IS NOT NULL THEN
         COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_COAS_CODE',
              NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
         COAS_CODE := NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'));
         EFFECTIVE_DATE_TIME :=
             TO_DATE(NVL(EFFECTIVE_DATE,TO_CHAR(SYSDATE,'YYYYMMDD')) ||
                    NVL(EFFECTIVE_TIME,'235959'),'YYYYMMDDHH24MISS');
         lv_sql_stmt :=  'SELECT FTVACTV_STATUS_IND, '||
                ' FTVACTV_TERM_DATE '||               
                ' FROM   FTVACTV '||
                ' WHERE  FTVACTV_COAS_CODE = '||''''|| COAS_CODE ||''''|| 
                ' AND    FTVACTV_ACTV_CODE = '||''''|| ACTV_CODE||''''|| 
                ' AND    FTVACTV_EFF_DATE <= '||''''|| EFFECTIVE_DATE_TIME||''''|| 
                ' AND    (FTVACTV_NCHG_DATE IS NULL '||
                ' OR      FTVACTV_NCHG_DATE > '||''''|| EFFECTIVE_DATE_TIME||''''|| ')' ||
                ' AND    ROWNUM = 1';
         
         GOKDBMS.DYNAMIC_SQL(lv_sql_stmt,ACTV_STATUS_IND,ACTV_TERM_DATE);
--
         IF ACTV_STATUS_IND IS NULL THEN
            MESSAGE ( G$_NLS.Get('NOQRPLS-0009', 'LIB','*ERROR* Activity Code; press LIST for valid codes.') );
            RAISE FORM_TRIGGER_FAILURE;
         ELSE
		         IF ACTV_STATUS_IND != 'A' THEN MESSAGE
		            ( G$_NLS.Get('NOQRPLS-0010', 'LIB','*ERROR* Activity Code entered is inactive; press LIST for valid codes.')  
		            );
		            RAISE FORM_TRIGGER_FAILURE;
		         END IF;
		--
		         IF ACTV_TERM_DATE IS NOT NULL THEN
		            IF ACTV_TERM_DATE <= EFFECTIVE_DATE_TIME THEN MESSAGE
		               ( G$_NLS.Get('NOQRPLS-0011', 'LIB','*ERROR* Activity Code entered is terminated; press LIST for valid codes.')  
		               );
		               RAISE FORM_TRIGGER_FAILURE;
		            END IF;
		         END IF;
		     END IF;  -- ACTV_STATUS_IND
      END IF; -- ACTV_CODE
   END IF; -- FINANCE_INSTALLED_IND    
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param effectiveDate
		* @param effectiveTime
		*/
		public void nEditActv(NString effectiveDate, NString effectiveTime, NString triggerItem)
		{
			NString tableName= NString.getNull();
			NString suff= NString.getNull();
			NString coasCode= NString.getNull();
			NString actvCode = getNameIn(triggerItem); //MORPHIS TODO: (JP) 31-10-2014.
			NString actvStatusInd= NString.getNull();
			NDate actvTermDate= NDate.getNull();
			NDate effectiveDateTime= NDate.getNull();
			NString lvSqlStmt= NString.getNull();
			if ( Nokglob.fGlobalString(toStr("FINANCE_INSTALLED_IND")).equals("Y") )
			{
				// 
				//     Set the name of table for item being validated to the BASE TABLE where the item is defined,
				//     returns null if the item is not a database field. 
				tableName = getBlockQueryDataSourceName(getTriggerBlock());
				// 
				//     If the item doesn't have a BASE TABLE, (meaning it is not a database item), set the name
				//     of table for item being validated to the first 7 characters of the item's name, not
				//     including the block name and period preceding the item name.
				if ( tableName.isNull() )
				{
					tableName = substring(getTriggerItem(), ((inStr(getTriggerItem(), toStr(".")).add(1))), toInt(7));
				}
				// 
				suff = substring(getTriggerItem(), inStr(getTriggerItem(), toStr("_CODE")));
				// 
				if ( getNameIn(getTriggerBlock().append(".N$_ACCI_ACTV_OVER")).equals("Y") )
				{
				}
				else if ( getNameIn(getTriggerBlock().append(".N$_ACCI_ACTV_OVER")).equals("N") ) {
					if ( (getNameIn(getTriggerBlock().append(".N$_ACCI_ACTV_CODE")).equals(actvCode)) || (getNameIn(getTriggerBlock().append(".N$_ACCI_ACTV_CODE")).isNull() && actvCode.isNull()) )
					{
					}
					else {
						copy(getNameIn(getTriggerBlock().append(".N$_ACCI_ACTV_CODE")),getTriggerBlock().append(".").append(tableName).append("_ACTV").append(suff));
						errorMessage(GNls.Fget(toStr("NOQRPLS-0008"), toStr("LIB"), toStr("*ERROR* Account Index will not allow an Activity override.")));
						throw new ApplicationException();
					}
				}
//
				if ( !actvCode.isNull() )
				{
					copy(getTriggerBlock().append(".").append(tableName).append("_COAS_CODE"),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
					coasCode = getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD")));
					effectiveDateTime = toDate(isNull(effectiveDate, toChar(NDate.getNow(), "YYYYMMDD")).append(isNull(effectiveTime, "235959")), "YYYYMMDDHH24MISS");
					lvSqlStmt = toStr("SELECT FTVACTV_STATUS_IND, ").append(" FTVACTV_TERM_DATE ").append(" FROM   FTVACTV ").append(" WHERE  FTVACTV_COAS_CODE = ").append("'").append(coasCode).append("'").append(" AND    FTVACTV_ACTV_CODE = ").append("'").append(actvCode).append("'").append(" AND    FTVACTV_EFF_DATE <= ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(" AND    (FTVACTV_NCHG_DATE IS NULL ").append(" OR      FTVACTV_NCHG_DATE > ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(")").append(" AND    ROWNUM = 1");
					Ref<NString> p_return_value1_ref = new Ref<NString>(actvStatusInd);
					Ref<NString> p_return_value2_ref = new Ref<NString>();
					Gokdbms.dynamicSql(lvSqlStmt, p_return_value1_ref, p_return_value2_ref);
					actvStatusInd = p_return_value1_ref.val;
					if (p_return_value2_ref.val.isNotNull())
						actvTermDate = toDate (p_return_value2_ref.val, GDate.getNlsDateFormat()) ;
					// 
					if ( actvStatusInd.isNull() )
					{
						errorMessage(GNls.Fget(toStr("NOQRPLS-0009"), toStr("LIB"), toStr("*ERROR* Activity Code; press LIST for valid codes.")));
						throw new ApplicationException();
					}
					else {
						if ( actvStatusInd.notEquals("A") )
						{
							errorMessage(GNls.Fget(toStr("NOQRPLS-0010"), toStr("LIB"), toStr("*ERROR* Activity Code entered is inactive; press LIST for valid codes.")));
							throw new ApplicationException();
						}
//
						if ( !actvTermDate.isNull() )
						{
							if ( actvTermDate.lesserOrEquals(effectiveDateTime) )
							{
								errorMessage(GNls.Fget(toStr("NOQRPLS-0011"), toStr("LIB"), toStr("*ERROR* Activity Code entered is terminated; press LIST for valid codes.")));
								throw new ApplicationException();
							}
						}
					}
				}
			}
		}
		
		// MORPHIS TODO: Adicionado par�metro triggerItem para dar a volta ao getTriggerItem() devolver o valor errado
		public void nEditActv(NString effectiveDate, NString effectiveTime)
		{
			nEditActv(effectiveDate, effectiveTime, getTriggerItem());
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.N$_EDIT_ACCT
	/*
	PROCEDURE N$_EDIT_ACCT (INTERNAL_ATYP_CODE IN VARCHAR2,
                       EFFECTIVE_DATE      IN VARCHAR2,
                       EFFECTIVE_TIME      IN VARCHAR2) IS
   TABLE_NAME          VARCHAR2(07);
   SUFF                VARCHAR2(20);
   COAS_CODE           VARCHAR2(1);
   ACCT_CODE           VARCHAR2(06) :=
                       NAME_IN(NAME_IN(':SYSTEM.TRIGGER_ITEM'));
   ACCT_STATUS_IND     VARCHAR2(1);
   ACCT_TERM_DATE      DATE;
   ACCT_ATYP_CODE      VARCHAR2(2);
   ACCT_DATA_ENTRY_IND VARCHAR2(1);
   EFFECTIVE_DATE_TIME DATE;
   lv_sql_stmt	  	   VARCHAR2(1000);
--
<multilinecomment> PURPOSE: This procedure validates the ACCT (Acct Code).
            To be valid the ACCT must:
              1. Be equal to the 'ACCI_ACCT_CODE' of the Account index
                 code, if the 'ACCI_ACCT_OVER' of the Account index
                 code is 'N'
              2. Exist on the 'FIMSMGR.FTVACCT' table
              3. Have a status indicator of 'A' for the effective
                 date and time being processed
              4. Have a null termination date or a termination date
                 greater than the effective date and time being processed
              5. Be defined as Data Entry
              6. If the 'INTERNAL_ATYP_CODE' for the ACCT code is not
                 null then the 'FTVACCT_COAS_CODE', 'INTERNAL_ATYP_CODE'
                 and 'FTVACCT_ATYP_CODE' combination for the ACCT being
                 validated must exist on the 'FIMSMGR.FTVATYP' table
   PARAMETER DEFINITIONS:
            INTERNAL_ATYP_CODE - Internal account type code for the ACCT,
                                 is '60' for labor accounts otherwise null
            EFFECTIVE_DATE - Date the ACCT_CODE must be active for
            EFFECTIVE_TIME - Time the ACCT_CODE must be active for
   WHERE EXECUTED FROM:
            1. In the 'ON-VALIDATE-FIELD' trigger of the ACCT field
               being validated. </multilinecomment>
BEGIN
   IF nokglob.f_global_string ('FINANCE_INSTALLED_IND') = 'Y' THEN
--    Set the name of table for item being validated to the BASE TABLE where the item is defined,
--    returns null if the item is not a database field. 
      TABLE_NAME := GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.TRIGGER_BLOCK'), BASE_TABLE);
--
--    If the item doesn't have a BASE TABLE, (meaning it is not a database item), set the name
--    of table for item being validated to the first 7 characters of the item's name, not
--    including the block name and period preceding the item name.
      IF TABLE_NAME IS NULL THEN
         TABLE_NAME := SUBSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'), 
                             (INSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'),'.') + 1),7);
      END IF;
--
      SUFF := SUBSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'), INSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'),'_CODE'));
--
      IF NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACCT_OVER') = 'Y' THEN
         NULL ;
      ELSIF
         NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACCT_OVER') = 'N' THEN
         IF (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACCT_CODE') =
             ACCT_CODE) OR
            (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACCT_CODE')
             IS NULL AND ACCT_CODE IS NULL)
            THEN NULL;
         ELSE
            COPY (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACCT_CODE'),
                  NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ACCT' ||
                  SUFF);
            MESSAGE
              ( G$_NLS.Get('NOQRPLS-0003', 'LIB','*ERROR* Account Index will not allow an Account override.') );
            RAISE FORM_TRIGGER_FAILURE;
         END IF ;
      END IF ;
--
      IF ACCT_CODE IS NOT NULL THEN
         COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_COAS_CODE',
              NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
         COAS_CODE := NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'));
         EFFECTIVE_DATE_TIME :=
             TO_DATE(NVL(EFFECTIVE_DATE,TO_CHAR(SYSDATE,'YYYYMMDD')) ||
                    NVL(EFFECTIVE_TIME,'235959'),'YYYYMMDDHH24MISS');
         lv_sql_stmt :=  'SELECT FTVACCT_STATUS_IND, '||
                         ' FTVACCT_TERM_DATE, '||
                         ' FTVACCT_ATYP_CODE, '||
                         ' FTVACCT_DATA_ENTRY_IND '||
                         ' FROM   FTVACCT '||
                         ' WHERE  FTVACCT_COAS_CODE = '||''''|| COAS_CODE ||''''||
                         ' AND    FTVACCT_ACCT_CODE = '||''''|| ACCT_CODE ||''''||
                         ' AND    FTVACCT_EFF_DATE <= '|| ''''||EFFECTIVE_DATE_TIME ||''''||
                         ' AND    (FTVACCT_NCHG_DATE IS NULL '||
                         ' OR     FTVACCT_NCHG_DATE > '||''''|| EFFECTIVE_DATE_TIME ||''''|| ')' ||
                         ' AND    ROWNUM = 1';
         GOKDBMS.DYNAMIC_SQL(lv_sql_stmt,ACCT_STATUS_IND,ACCT_TERM_DATE,ACCT_ATYP_CODE,ACCT_DATA_ENTRY_IND);
--
         IF ACCT_STATUS_IND IS NULL THEN
         	  MESSAGE ( G$_NLS.Get('NOQRPLS-0004', 'LIB','*ERROR* Account Code; press LIST for valid codes.') );
         	  RAISE FORM_TRIGGER_FAILURE;
         ELSE
		         IF ACCT_STATUS_IND != 'A' THEN 
		         	  MESSAGE( G$_NLS.Get('NOQRPLS-0005', 'LIB',
		         	     '*ERROR* Account Code entered is inactive; press LIST for valid codes.'));
		            RAISE FORM_TRIGGER_FAILURE;
		         END IF;
		--
		         IF ACCT_TERM_DATE IS NOT NULL THEN
		            IF ACCT_TERM_DATE <= EFFECTIVE_DATE_TIME THEN 
		            	 MESSAGE( G$_NLS.Get('NOQRPLS-0006', 'LIB',
		            	    '*ERROR* Account Code entered is terminated; press LIST for valid codes.'));
		               RAISE FORM_TRIGGER_FAILURE;
		            END IF;
		         END IF;
		--
		         IF ACCT_DATA_ENTRY_IND != 'Y' THEN 
		         	  MESSAGE( G$_NLS.Get('NOQRPLS-0007', 'LIB',
		         	     '*ERROR* Account Code is not defined as Data Entry.') );
		            RAISE FORM_TRIGGER_FAILURE;
		         END IF;
		--
		         IF INTERNAL_ATYP_CODE IS NOT NULL THEN
		            N$_EDIT_ATYP(COAS_CODE,ACCT_ATYP_CODE,INTERNAL_ATYP_CODE,
		                        EFFECTIVE_DATE,EFFECTIVE_TIME);
		         END IF;
		     END IF;
      END IF;
   END IF;  -- FINANCE_INSTALLED_IND
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param internalAtypCode
		* @param effectiveDate
		* @param effectiveTime
		*/
		public void nEditAcct(NString internalAtypCode, NString effectiveDate, NString effectiveTime)
		{
			NString tableName= NString.getNull();
			NString suff= NString.getNull();
			NString coasCode= NString.getNull();
			NString acctCode = getNameIn(getTriggerItem()); //MORPHIS TODO: (JP) 31-10-2014.
			NString acctStatusInd= NString.getNull();
			NDate acctTermDate= NDate.getNull();
			NString acctAtypCode= NString.getNull();
			NString acctDataEntryInd= NString.getNull();
			NDate effectiveDateTime= NDate.getNull();
			NString lvSqlStmt= NString.getNull();
			if ( Nokglob.fGlobalString(toStr("FINANCE_INSTALLED_IND")).equals("Y") )
			{
				//     Set the name of table for item being validated to the BASE TABLE where the item is defined,
				//     returns null if the item is not a database field. 
				tableName = getBlockQueryDataSourceName(getTriggerBlock());
				// 
				//     If the item doesn't have a BASE TABLE, (meaning it is not a database item), set the name
				//     of table for item being validated to the first 7 characters of the item's name, not
				//     including the block name and period preceding the item name.
				if ( tableName.isNull() )
				{
					tableName = substring(getTriggerItem(), ((inStr(getTriggerItem(), toStr(".")).add(1))), toInt(7));
				}
				// 
				suff = substring(getTriggerItem(), inStr(getTriggerItem(), toStr("_CODE")));
				// 
				if ( getNameIn(getTriggerBlock().append(".N$_ACCI_ACCT_OVER")).equals("Y") )
				{
				}
				else if ( getNameIn(getTriggerBlock().append(".N$_ACCI_ACCT_OVER")).equals("N") ) {
					if ( (getNameIn(getTriggerBlock().append(".N$_ACCI_ACCT_CODE")).equals(acctCode)) || (getNameIn(getTriggerBlock().append(".N$_ACCI_ACCT_CODE")).isNull() && acctCode.isNull()) )
					{
					}
					else {
						copy(getNameIn(getTriggerBlock().append(".N$_ACCI_ACCT_CODE")),getTriggerBlock().append(".").append(tableName).append("_ACCT").append(suff));
						errorMessage(GNls.Fget(toStr("NOQRPLS-0003"), toStr("LIB"), toStr("*ERROR* Account Index will not allow an Account override.")));
						throw new ApplicationException();
					}
				}
				// 
				if ( !acctCode.isNull() )
				{
					copy(getTriggerBlock().append(".").append(tableName).append("_COAS_CODE"),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
					coasCode = getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD")));
					effectiveDateTime = toDate(isNull(effectiveDate, toChar(NDate.getNow(), "YYYYMMDD")).append(isNull(effectiveTime, "235959")), "YYYYMMDDHH24MISS");
					lvSqlStmt = toStr("SELECT FTVACCT_STATUS_IND, ").append(" FTVACCT_TERM_DATE, ").append(" FTVACCT_ATYP_CODE, ").append(" FTVACCT_DATA_ENTRY_IND ").append(" FROM   FTVACCT ").append(" WHERE  FTVACCT_COAS_CODE = ").append("'").append(coasCode).append("'").append(" AND    FTVACCT_ACCT_CODE = ").append("'").append(acctCode).append("'").append(" AND    FTVACCT_EFF_DATE <= ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(" AND    (FTVACCT_NCHG_DATE IS NULL ").append(" OR     FTVACCT_NCHG_DATE > ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(")").append(" AND    ROWNUM = 1");
					Ref<NString> p_return_value1_ref = new Ref<NString>(acctStatusInd);
					Ref<NString> p_return_value2_ref = new Ref<NString>();
					Ref<NString> p_return_value3_ref = new Ref<NString>(acctAtypCode);
					Ref<NString> p_return_value4_ref = new Ref<NString>(acctDataEntryInd);
					Gokdbms.dynamicSql(lvSqlStmt, p_return_value1_ref, p_return_value2_ref, p_return_value3_ref, p_return_value4_ref);
					acctStatusInd = p_return_value1_ref.val;
					if (p_return_value2_ref.val.isNotNull())
						acctTermDate = toDate (p_return_value2_ref.val, GDate.getNlsDateFormat()) ;
					acctAtypCode = p_return_value3_ref.val;
					acctDataEntryInd = p_return_value4_ref.val;
//
					if ( acctStatusInd.isNull() )
					{
						errorMessage(GNls.Fget(toStr("NOQRPLS-0004"), toStr("LIB"), toStr("*ERROR* Account Code; press LIST for valid codes.")));
						throw new ApplicationException();
					}
					else {
						if ( acctStatusInd.notEquals("A") )
						{
							errorMessage(GNls.Fget(toStr("NOQRPLS-0005"), toStr("LIB"), toStr("*ERROR* Account Code entered is inactive; press LIST for valid codes.")));
							throw new ApplicationException();
						}
//
						if ( !acctTermDate.isNull() )
						{
							if ( acctTermDate.lesserOrEquals(effectiveDateTime) )
							{
								errorMessage(GNls.Fget(toStr("NOQRPLS-0006"), toStr("LIB"), toStr("*ERROR* Account Code entered is terminated; press LIST for valid codes.")));
								throw new ApplicationException();
							}
						}
						// 
						if ( acctDataEntryInd.notEquals("Y") )
						{
							errorMessage(GNls.Fget(toStr("NOQRPLS-0007"), toStr("LIB"), toStr("*ERROR* Account Code is not defined as Data Entry.")));
							throw new ApplicationException();
						}
						// 
						if ( !internalAtypCode.isNull() )
						{
							nEditAtyp(coasCode, acctAtypCode, internalAtypCode, effectiveDate, effectiveTime);
						}
					}
				}
			}
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.N$_EDIT_ACCI
	/*
	PROCEDURE N$_EDIT_ACCI (SUFF           IN VARCHAR2,
                       EFFECTIVE_DATE  IN VARCHAR2,
                       EFFECTIVE_TIME  IN VARCHAR2) IS
   TABLE_NAME          VARCHAR2(07);
   COAS_CODE           VARCHAR2(1);
   ACCI_CODE           VARCHAR2(06);
   ACCI_FUND_CODE      VARCHAR2(06);
   ACCI_ORGN_CODE      VARCHAR2(06);
   ACCI_ACCT_CODE      VARCHAR2(06);
   ACCI_PROG_CODE      VARCHAR2(06);
   ACCI_ACTV_CODE      VARCHAR2(06);
   ACCI_LOCN_CODE      VARCHAR2(06);
   ACCI_FUND_OVER      VARCHAR2(01);
   ACCI_ORGN_OVER      VARCHAR2(01);
   ACCI_ACCT_OVER      VARCHAR2(01);
   ACCI_PROG_OVER      VARCHAR2(01);
   ACCI_ACTV_OVER      VARCHAR2(01);
   ACCI_LOCN_OVER      VARCHAR2(01);
   ACCI_STATUS_IND     VARCHAR2(1);
   ACCI_TERM_DATE      DATE;
   EFFECTIVE_DATE_TIME DATE;
   lv_sql_stmt         VARCHAR2(1000);   
--
<multilinecomment> PURPOSE: This procedure validates the ACCI (Account Index Code).
            To be valid the ACCI must:
              1. Exist on the 'FIMSMGR.FTVACCI' table
              2. Have a status indicator of 'A' for the effective
                 date and time being processed
              3. Have a null termination date or a termination date
                 greater than the effective date and time being processed
            If the ACCI is vaild:
              1. FTVACCI_FUND_CODE is read into the page zero field
                 N$_ACCI_FUND_CODE for the record associated the ACCI
                 code being validated.
              2. FTVACCI_ORGN_CODE is read into the page zero field
                 N$_ACCI_ORGN_CODE for the record associated the ACCI
                 code being validated.
              3. FTVACCI_ACCT_CODE is read into the page zero field
                 N$_ACCI_ACCT_CODE for the record associated the ACCI
                 code being validated.
              4. FTVACCI_PROG_CODE is read into the page zero field
                 N$_ACCI_PROG_CODE for the record associated the ACCI
                 code being validated.
              5. FTVACCI_ACTV_CODE is read into the page zero field
                 N$_ACCI_ACTV_CODE for the record associated the ACCI
                 code being validated.
              6. FTVACCI_LOCN_CODE is read into the page zero field
                 N$_ACCI_LOCN_CODE for the record associated the ACCI
                 code being validated.
              7. FTVACCI_FUND_OVERRIDE is read into the page zero field
                 N$_ACCI_FUND_OVER for the record associated the ACCI
                 code being validated.
              8. FTVACCI_ORGN_OVERRIDE is read into the page zero field
                 N$_ACCI_ORGN_OVER for the record associated the ACCI
                 code being validated.
              9. FTVACCI_ACCT_OVERRIDE is read into the page zero field
                 N$_ACCI_ACCT_OVER for the record associated the ACCI
                 code being validated.
             10. FTVACCI_PROG_OVERRIDE is read into the page zero field
                 N$_ACCI_PROG_OVER for the record associated the ACCI
                 code being validated.
             11. FTVACCI_ACTV_OVERRIDE is read into the page zero field
                 N$_ACCI_ACTV_OVER for the record associated the ACCI
                 code being validated.
             12. FTVACCI_LOCN_OVERRIDE is read into the page zero field
                 N$_ACCI_LOCN_OVER for the record associated the ACCI
                 code being validated.
             13. The N$_ACCI_FUND_CODE is copied to the associated
                 'FUND_CODE' field on the calling form and record.
             14. The N$_ACCI_ORGN_CODE is copied to the associated
                 'ORGN_CODE' field on the calling form and record.
              15. The N$_ACCI_ACCT_CODE is copied to the associated
                 'ACCT_CODE' field on the calling form and record.
             16. The N$_ACCI_PROG_CODE is copied to the associated
                 'PROG_CODE' field on the calling form and record.
             17. The N$_ACCI_ACTV_CODE is copied to the associated
                 'ACTV_CODE' field on the calling form and record.
             18. The N$_ACCI_FUND_LOCN is copied to the associated
                 'LOCN_CODE' field on the calling form and record.
   PARAMETER DEFINITIONS:
            SUFF - Suffix for the ACCI_CODE being processed.
                   ** (I.E. '_EMP_LIB')**
                   This parameter should be null if the ACCI_CODE
                   has no suffix.
            EFFECTIVE_DATE - Date the COAS_CODE must be active for
            EFFECTIVE_TIME - Time the COAS_CODE must be active for
   WHERE EXECUTED FROM:
            1. In the 'POST-QUERY' trigger of the FOAPAL block
            2. In the 'ON-VALIDATE-FIELD' trigger of the ACCI field
               being validated. </multilinecomment>
BEGIN
	 IF nokglob.f_global_string ('FINANCE_INSTALLED_IND') = 'Y' THEN
--
--    Set the name of table for item being validated to the BASE TABLE where the item is defined,
--    returns null if the item is not a database field. 
      TABLE_NAME := GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.TRIGGER_BLOCK'), BASE_TABLE);
--
--    If the item doesn't have a BASE TABLE, (meaning it is not a database item), set the name
--    of table for item being validated to the first 7 characters of the item's name, not
--    including the block name and period preceding the item name.
      IF TABLE_NAME IS NULL THEN
         TABLE_NAME := SUBSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'), 
                             (INSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'),'.') + 1),7);
      END IF;
--
      COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ACCI_CODE' || SUFF,
           NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
      ACCI_CODE := NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'));
      IF ACCI_CODE IS NOT NULL THEN
         COPY(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_COAS_CODE',
              NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD');
         COAS_CODE := NAME_IN(NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_FOAPAL_FIELD'));
         EFFECTIVE_DATE_TIME :=
             TO_DATE(NVL(EFFECTIVE_DATE,TO_CHAR(SYSDATE,'YYYYMMDD')) ||
                    NVL(EFFECTIVE_TIME,'235959'),'YYYYMMDDHH24MISS');
--
         lv_sql_stmt :=  'SELECT FTVACCI_STATUS_IND, '||
								               ' FTVACCI_TERM_DATE, '||
								               ' FTVACCI_FUND_CODE, '||
								               ' FTVACCI_ORGN_CODE, '||
								               ' FTVACCI_ACCT_CODE, '||
								               ' FTVACCI_PROG_CODE, '||
								               ' FTVACCI_ACTV_CODE, '||
								               ' FTVACCI_LOCN_CODE, '||
								               ' FTVACCI_FUND_OVERRIDE, '||
								               ' FTVACCI_ORGN_OVERRIDE, '||
								               ' FTVACCI_ACCT_OVERRIDE, '||
								               ' FTVACCI_PROG_OVERRIDE, '||
								               ' FTVACCI_ACTV_OVERRIDE, '||
								               ' FTVACCI_LOCN_OVERRIDE '||
									       ' FROM   FTVACCI '||
									       ' WHERE  FTVACCI_COAS_CODE = '||''''||COAS_CODE||''''|| 
									       ' AND    FTVACCI_ACCI_CODE = '||''''||ACCI_CODE||''''|| 
									       ' AND    FTVACCI_EFF_DATE <= '||''''||EFFECTIVE_DATE_TIME||''''|| 
									       ' AND    (FTVACCI_NCHG_DATE IS NULL '||
									       ' OR      FTVACCI_NCHG_DATE > '||''''||EFFECTIVE_DATE_TIME||''''||')'||
									       ' AND    ROWNUM = 1';
--
         NOKRECS.P_DYNAMIC_SQL(lv_sql_stmt,   ACCI_STATUS_IND,
															                ACCI_TERM_DATE,
															                ACCI_FUND_CODE,
															                ACCI_ORGN_CODE,
															                ACCI_ACCT_CODE,
															                ACCI_PROG_CODE,
															                ACCI_ACTV_CODE,
															                ACCI_LOCN_CODE,
															                ACCI_FUND_OVER,
															                ACCI_ORGN_OVER,
															                ACCI_ACCT_OVER,
															                ACCI_PROG_OVER,
															                ACCI_ACTV_OVER,
															                ACCI_LOCN_OVER);
                
         IF ACCI_STATUS_IND IS NULL THEN
            MESSAGE ( G$_NLS.Get('NOQRPLS-0000', 'LIB','*ERROR* Account Index Code; press LIST for valid codes.') );
            RAISE FORM_TRIGGER_FAILURE;
         ELSE                
					  COPY(ACCI_FUND_CODE,NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_FUND_CODE');
					  COPY(ACCI_ORGN_CODE,NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ORGN_CODE');
					  COPY(ACCI_ACCT_CODE,NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACCT_CODE');
					  COPY(ACCI_PROG_CODE,NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_PROG_CODE');
					  COPY(ACCI_ACTV_CODE,NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACTV_CODE');
					  COPY(ACCI_LOCN_CODE,NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_LOCN_CODE');
					  COPY(ACCI_FUND_OVER,NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_FUND_OVER');
					  COPY(ACCI_ORGN_OVER,NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ORGN_OVER');
					  COPY(ACCI_ACCT_OVER,NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACCT_OVER');
					  COPY(ACCI_PROG_OVER,NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_PROG_OVER');
					  COPY(ACCI_ACTV_OVER,NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACTV_OVER');
					  COPY(ACCI_LOCN_OVER,NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_LOCN_OVER');
--
		        IF ACCI_STATUS_IND != 'A' THEN MESSAGE
		           ( G$_NLS.Get('NOQRPLS-0001', 'LIB','*ERROR* Account Index Code entered is inactive; press LIST for valid codes.')  
		           );
		           RAISE FORM_TRIGGER_FAILURE;
		        END IF;
		--
		        IF ACCI_TERM_DATE IS NOT NULL THEN
		           IF ACCI_TERM_DATE <= EFFECTIVE_DATE_TIME THEN MESSAGE
		               ( G$_NLS.Get('NOQRPLS-0002', 'LIB','*ERROR* Account Index Code entered is terminated; press LIST for valid codes.')  
		               );
		               RAISE FORM_TRIGGER_FAILURE;
		           END IF;
		        END IF;
--
			      IF NAME_IN('SYSTEM.RECORD_STATUS') != 'QUERY' THEN
			         COPY (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_FUND_CODE'),
					     NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_FUND_CODE' || SUFF);
			         COPY (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ORGN_CODE'),
			         NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ORGN_CODE' || SUFF);
			         COPY (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACCT_CODE'),
			         NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ACCT_CODE' || SUFF);
			         COPY (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_PROG_CODE'),
			         NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_PROG_CODE' || SUFF);
			         COPY (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_ACTV_CODE'),
			         NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_ACTV_CODE' || SUFF);
			         COPY (NAME_IN(NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.N$_ACCI_LOCN_CODE'),
			         NAME_IN('SYSTEM.TRIGGER_BLOCK') || '.' || TABLE_NAME || '_LOCN_CODE' || SUFF);
			      END IF;
         END IF; --ACCI_STATUS_IND
     END IF; --ACCI_CODE
   END IF; --FINANCE_INSTALLED_IND 
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param suff
		* @param effectiveDate
		* @param effectiveTime
		*/
		public void nEditAcci(NString suff, NString effectiveDate, NString effectiveTime)
		{
			NString tableName= NString.getNull();
			NString coasCode= NString.getNull();
			NString acciCode= NString.getNull();
			NString acciFundCode= NString.getNull();
			NString acciOrgnCode= NString.getNull();
			NString acciAcctCode= NString.getNull();
			NString acciProgCode= NString.getNull();
			NString acciActvCode= NString.getNull();
			NString acciLocnCode= NString.getNull();
			NString acciFundOver= NString.getNull();
			NString acciOrgnOver= NString.getNull();
			NString acciAcctOver= NString.getNull();
			NString acciProgOver= NString.getNull();
			NString acciActvOver= NString.getNull();
			NString acciLocnOver= NString.getNull();
			NString acciStatusInd= NString.getNull();
			NDate acciTermDate= NDate.getNull();
			NDate effectiveDateTime= NDate.getNull();
			NString lvSqlStmt= NString.getNull();
			if ( Nokglob.fGlobalString(toStr("FINANCE_INSTALLED_IND")).equals("Y") )
			{
				// 
				//     Set the name of table for item being validated to the BASE TABLE where the item is defined,
				//     returns null if the item is not a database field. 
				tableName = getBlockQueryDataSourceName(getTriggerBlock());
				// 
				//     If the item doesn't have a BASE TABLE, (meaning it is not a database item), set the name
				//     of table for item being validated to the first 7 characters of the item's name, not
				//     including the block name and period preceding the item name.
				if ( tableName.isNull() )
				{
					tableName = substring(getTriggerItem(), ((inStr(getTriggerItem(), toStr(".")).add(1))), toInt(7));
				}
				// 
				copy(getTriggerBlock().append(".").append(tableName).append("_ACCI_CODE").append(suff),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
				acciCode = getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD")));
				if ( !acciCode.isNull() )
				{
					copy(getTriggerBlock().append(".").append(tableName).append("_COAS_CODE"),getTriggerBlock().append(".N$_FOAPAL_FIELD"));
					coasCode = getNameIn(getNameIn(getTriggerBlock().append(".N$_FOAPAL_FIELD")));
					effectiveDateTime = toDate(isNull(effectiveDate, toChar(NDate.getNow(), "YYYYMMDD")).append(isNull(effectiveTime, "235959")), "YYYYMMDDHH24MISS");
					// 
					lvSqlStmt = toStr("SELECT FTVACCI_STATUS_IND, ").append(" FTVACCI_TERM_DATE, ").append(" FTVACCI_FUND_CODE, ").append(" FTVACCI_ORGN_CODE, ").append(" FTVACCI_ACCT_CODE, ").append(" FTVACCI_PROG_CODE, ").append(" FTVACCI_ACTV_CODE, ").append(" FTVACCI_LOCN_CODE, ").append(" FTVACCI_FUND_OVERRIDE, ").append(" FTVACCI_ORGN_OVERRIDE, ").append(" FTVACCI_ACCT_OVERRIDE, ").append(" FTVACCI_PROG_OVERRIDE, ").append(" FTVACCI_ACTV_OVERRIDE, ").append(" FTVACCI_LOCN_OVERRIDE ").append(" FROM   FTVACCI ").append(" WHERE  FTVACCI_COAS_CODE = ").append("'").append(coasCode).append("'").append(" AND    FTVACCI_ACCI_CODE = ").append("'").append(acciCode).append("'").append(" AND    FTVACCI_EFF_DATE <= ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(" AND    (FTVACCI_NCHG_DATE IS NULL ").append(" OR      FTVACCI_NCHG_DATE > ").append("to_date('").append(effectiveDateTime).append("','").append(GDate.getNlsDateFormat()).append("')").append(")").append(" AND    ROWNUM = 1");
					Ref<NString> p_return_value1_ref = new Ref<NString>(acciStatusInd);
					Ref<NString> p_return_value2_ref = new Ref<NString>();
					Ref<NString> p_return_value3_ref = new Ref<NString>(acciFundCode);
					Ref<NString> p_return_value4_ref = new Ref<NString>(acciOrgnCode);
					Ref<NString> p_return_value5_ref = new Ref<NString>(acciAcctCode);
					Ref<NString> p_return_value6_ref = new Ref<NString>(acciProgCode);
					Ref<NString> p_return_value7_ref = new Ref<NString>(acciActvCode);
					Ref<NString> p_return_value8_ref = new Ref<NString>(acciLocnCode);
					Ref<NString> p_return_value9_ref = new Ref<NString>(acciFundOver);
					Ref<NString> p_return_value10_ref = new Ref<NString>(acciOrgnOver);
					Ref<NString> p_return_value11_ref = new Ref<NString>(acciAcctOver);
					Ref<NString> p_return_value12_ref = new Ref<NString>(acciProgOver);
					Ref<NString> p_return_value13_ref = new Ref<NString>(acciActvOver);
					Ref<NString> p_return_value14_ref = new Ref<NString>(acciLocnOver);
					Nokrecs.pDynamicSql(lvSqlStmt, p_return_value1_ref, p_return_value2_ref, p_return_value3_ref, p_return_value4_ref, p_return_value5_ref, p_return_value6_ref, p_return_value7_ref, p_return_value8_ref, p_return_value9_ref, p_return_value10_ref, p_return_value11_ref, p_return_value12_ref, p_return_value13_ref, p_return_value14_ref);
					acciStatusInd = p_return_value1_ref.val;
					if (p_return_value2_ref.val.isNotNull())
						acciTermDate = toDate (p_return_value2_ref.val, GDate.getNlsDateFormat()) ;
					acciFundCode = p_return_value3_ref.val;
					acciOrgnCode = p_return_value4_ref.val;
					acciAcctCode = p_return_value5_ref.val;
					acciProgCode = p_return_value6_ref.val;
					acciActvCode = p_return_value7_ref.val;
					acciLocnCode = p_return_value8_ref.val;
					acciFundOver = p_return_value9_ref.val;
					acciOrgnOver = p_return_value10_ref.val;
					acciAcctOver = p_return_value11_ref.val;
					acciProgOver = p_return_value12_ref.val;
					acciActvOver = p_return_value13_ref.val;
					acciLocnOver = p_return_value14_ref.val;
					if ( acciStatusInd.isNull() )
					{
						errorMessage(GNls.Fget(toStr("NOQRPLS-0000"), toStr("LIB"), toStr("*ERROR* Account Index Code; press LIST for valid codes.")));
						throw new ApplicationException();
					}
					else {
						copy(acciFundCode,getTriggerBlock().append(".N$_ACCI_FUND_CODE"));
						copy(acciOrgnCode,getTriggerBlock().append(".N$_ACCI_ORGN_CODE"));
						copy(acciAcctCode,getTriggerBlock().append(".N$_ACCI_ACCT_CODE"));
						copy(acciProgCode,getTriggerBlock().append(".N$_ACCI_PROG_CODE"));
						copy(acciActvCode,getTriggerBlock().append(".N$_ACCI_ACTV_CODE"));
						copy(acciLocnCode,getTriggerBlock().append(".N$_ACCI_LOCN_CODE"));
						copy(acciFundOver,getTriggerBlock().append(".N$_ACCI_FUND_OVER"));
						copy(acciOrgnOver,getTriggerBlock().append(".N$_ACCI_ORGN_OVER"));
						copy(acciAcctOver,getTriggerBlock().append(".N$_ACCI_ACCT_OVER"));
						copy(acciProgOver,getTriggerBlock().append(".N$_ACCI_PROG_OVER"));
						copy(acciActvOver,getTriggerBlock().append(".N$_ACCI_ACTV_OVER"));
						copy(acciLocnOver,getTriggerBlock().append(".N$_ACCI_LOCN_OVER"));
						// 
						if ( acciStatusInd.notEquals("A") )
						{
							errorMessage(GNls.Fget(toStr("NOQRPLS-0001"), toStr("LIB"), toStr("*ERROR* Account Index Code entered is inactive; press LIST for valid codes.")));
							throw new ApplicationException();
						}
//
						if ( !acciTermDate.isNull() )
						{
							if ( acciTermDate.lesserOrEquals(effectiveDateTime) )
							{
								errorMessage(GNls.Fget(toStr("NOQRPLS-0002"), toStr("LIB"), toStr("*ERROR* Account Index Code entered is terminated; press LIST for valid codes.")));
								throw new ApplicationException();
							}
						}
						// 
						// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
						if ( getRecordStatus()!="QUERY")
						{
							copy(getNameIn(getTriggerBlock().append(".N$_ACCI_FUND_CODE")),getTriggerBlock().append(".").append(tableName).append("_FUND_CODE").append(suff));
							copy(getNameIn(getTriggerBlock().append(".N$_ACCI_ORGN_CODE")),getTriggerBlock().append(".").append(tableName).append("_ORGN_CODE").append(suff));
							copy(getNameIn(getTriggerBlock().append(".N$_ACCI_ACCT_CODE")),getTriggerBlock().append(".").append(tableName).append("_ACCT_CODE").append(suff));
							copy(getNameIn(getTriggerBlock().append(".N$_ACCI_PROG_CODE")),getTriggerBlock().append(".").append(tableName).append("_PROG_CODE").append(suff));
							copy(getNameIn(getTriggerBlock().append(".N$_ACCI_ACTV_CODE")),getTriggerBlock().append(".").append(tableName).append("_ACTV_CODE").append(suff));
							copy(getNameIn(getTriggerBlock().append(".N$_ACCI_LOCN_CODE")),getTriggerBlock().append(".").append(tableName).append("_LOCN_CODE").append(suff));
						}
					}
				}
			}
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.AUDIT_TRAIL_NLS_DATE_SUPPORT
	/*
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
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.AUDIT_TRAIL_MSGKEY_UPDATE
	/*
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : NOQRPLS
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Mon Jun 11 14:25:21 2012
-- MSGSIGN : #6fddd55fc794ae22
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.AUDIT_TRAIL_8_8
	/*
	PROCEDURE AUDIT_TRAIL_8_8 IS
<multilinecomment>
AUDIT TRAIL: 8.8
1. Defect #1-12A6JVN        SL 02/08/2012
   Problem: Noqfpls and noqnpls are not synchronized with noqrpls.
   Functional Impact: None.
   Technical Fix: Noqrpls has been modified so that it compiles and functions 
     regardless Finance installation by using dynamic sql.  As part of this work, 
     noqfpls.pll and noqnpls.pll have been obsolete.  For orgn, fund, and acci codes, 
     nokrecs.p_dynamic_sql routines are added and referenced for various edits 
     of codes returned from validation forms. The rest of foapal components 
     edits are done using gokbdms.dynamic_sql routines.    
AUDIT TRAIL END.   

</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail88()
		{
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.AUDIT_TRAIL_8_2
	/*
	PROCEDURE AUDIT_TRAIL_8_2 IS
<multilinecomment>
AUDIT TRAIL: 8.2
1. Defect# 1-2QBGVJ                     PM 12/18/2008
   Problem: Default values from FTMFUND do not default when a new fund code is entered. 
   Functional Impact: When a Fund code is entered, the default values on FTMFUND get defaulted in the NOAEPAF form.
   Technical Fix: Modified the N$_EDIT_FUND program unit to default if the current form is NOAEPAF. 
AUDIT TRAIL END.   

</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail82()
		{
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.AUDIT_TRAIL_8_0
	/*
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment>
AUDIT TRAIL: 8.0
1. Grants Management Enhancement Multiple Year Encumbering        LN 04/19/2007
   Added a new routine n$_pointer_to_cursor to visually indicate the current 
   master block record when the form cursor is in the detail block.
AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80()
		{
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.AUDIT_TRAIL_7_0_NOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_7_0_NOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 7.0
1. TGKinderman 11/20/2003
   Converted to Forms9i
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70Noqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.AUDIT_TRAIL_7_0
	/*
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0
1. Changes Migrated to Release 7.0          MT 03/11/2004
   Defect# 77736  Release 6.1
2. Defect #8227.                  					MF 10/04/2004
   Problem: The PHAREDS form does not default the prog code when the orgn code is entered.
            The prog code is defaulted in all the other forms when orgn is entered.
   Functional Impact: Orgn fund override and default logic is enabled in PHAREDS.
            Also, Orgn now defaults from Fund.  
   Techincal Fix: Modified N$_EDIT_FUND and N$_EDIT_ORGN so defaulting occurs for PHAREDS.
3. Internal defect #70-0124.                MF 10/06/2004
   Problem: The termination edit for the fund is different than the termination edit for other foapal components.
            The fund termination date comparison uses just < while the others use <=.
   Functional Impact: Termination edit for fund code is now consistent with other foapal component edits.
   Techincal Fix: Modified the termination edit in N$_EDIT_FUND	to use a <= for comparing the termination date
            to the input effective date.
AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70()
		{
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.AUDIT_TRAIL_6_1
	/*
	PROCEDURE AUDIT_TRAIL_6_1 IS
<multilinecomment>
AUDIT TRAIL: 6.1
1. Defect# 77736                     MT 01/05/2004
   Probelm : The form is not considering the fund expenditure end date when determining 
   whether the fund is valid and can post to finance beyond the fund's termination date. 
   Functional Impact : A fund can be posted to finance until the expenditure end date. 
   			      If expenditure end date is null, then the fund is valid only until the
   			      termination date.
   Technical Fix: Modified the N$_EDIT_FUND program unit. 
AUDIT TRAIL END.   

</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail61()
		{
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.AUDIT_TRAIL_5_0_NOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_5_0_NOQRPLS IS
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
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50Noqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.AUDIT_TRAIL_4_2
	/*
	PROCEDURE AUDIT_TRAIL_4_2 IS
<multilinecomment>
AUDIT TRAIL: 4.2
    EA Time Entry Enhancement.					MS 3/24/2000
   1. Mdified N$_EDIT_FUND and N$_EDIT_ORGN so Defaulting occurs for PHATIME.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail42()
		{
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.AUDIT_TRAIL_4_0
	/*
	PROCEDURE AUDIT_TRAIL_4_0 IS
<multilinecomment>
AUDIT TRAIL: 4.0
   1.   Defect #8631                                       LR   16-SEP-1998
       Problem - Can not compile library in 16 bit. N$_EDIT_ORGN is too large.
       Functional Impact -NOQRPLS can be compiled in 16 bit.
       Technical Fix -The comments from N$_EDIT_ORGN were placed
                      in to the separate program unit N$_EDIT_ORGN_COMMENTS.
   2.  Defect #9605                                        LR    11-NOV-1998
       Problem - Receiving incorrect error message that a foapal component isn't
                 valid when the foapal effective date is equal to the date
                 that the foapal is effective in finance. Library should be validating
                 foapals using a timestamp of 235959.
       Functional Impact - Now library validates foapals using a timestamp of 235959.
       Technical Fix - Changed timestamp from 000001 to 235959 in procedure:
                       N$_EDIT_ACCI,N$_EDIT_ACCT,N$_EDIT_ACTV,N$_EDIT_ATYP,
                       N$_EDIT_COAS,N$_EDIT_FUND,N$_EDIT_LOCN,N$_EDIT_ORGN,
                       N$_EDIT_PROG,N$_EDIT_PROJ.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40()
		{
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.AUDIT_TRAIL_3_0
	/*
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment>
AUDIT TRAIL:3.0
  1.                              LR 04-JUN-1997
   Technical Fix - Added COAS_CODE parameter to  N$_EDIT_POSTING_DATE procedure.
                   Before the procedure used :GLOBAL.COAS_CODE.

AUDIT TRAIL: 3.1
   1.  Defect #8016					AA  21-OCT-1997
     Problem -  On certain platforms, the user is incorrectly getting the 
		error message "Posting Date does not fall within an open 
		accounting period".
     Functional Impact - User no longer receives this message when a valid 
		Posting Override Date is entered.  The message has also been 
		clarified to state that "Posting Date does not fall within a
		defined accounting period" versus "... an open accounting 
		period."
     Technical Fix - Modified trigger N$_EDIT_POSTING_DATE in NOQRPLS and
		NOQFPLS libraries to include TRUNC(POSTING_DATE).  Also 
		modified the corresponding error message.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail30()
		{
		}

	//Original PL/SQL code for Prog Unit NOQRPLS.AUDIT_TRAIL
	/*
	PROCEDURE AUDIT_TRAIL IS
BEGIN
<multilinecomment> AUDIT TRAIL: 2.1.11
   1. Created for Forms 4.5 version.        JW  09-23-96
   AUDIT TRAIL END
</multilinecomment>
null;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail()
		{
			//  AUDIT TRAIL: 2.1.11
			// 1. Created for Forms 4.5 version.        JW  09-23-96
			// AUDIT TRAIL END
		}

}
