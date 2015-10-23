package net.hedtech.general.common.libraries.Noqjpls;

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
import net.hedtech.general.common.libraries.Goqrpls.*;

public class Nokbdpl extends AbstractSupportCodeObject {
	

	public Nokbdpl(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public NoqjplsServices getContainer() {
		return (NoqjplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) NOKBDPL
	/*
	PACKAGE NOKBDPL IS
  PROCEDURE CREATE_DYN_RG ( p_bdca_code IN varchar2,
                            p_eff_date  IN date  := null );
  PROCEDURE DISPLAY_LOV ( ITEM_NAME_IN IN VARCHAR2 := NULL,
                          LIST_NAME_IN IN VARCHAR2 := 'PTQBDPL1_LOV' );
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) NOKBDPL
		/*
		PACKAGE BODY NOKBDPL IS
--
PROCEDURE create_dyn_rg (p_bdca_code IN varchar2, 
                         p_eff_date  IN date  := null) IS
  rg_id          RecordGroup;
  col_id         GroupColumn;  
  lv_bdpl_tab    nokrecs.ptrbdpl_tabtype;
BEGIN
IF nokglob.f_global_string ('HR_INSTALLED_IND') = 'Y' THEN	

   rg_id := Find_Group('PTRBDPL_DYN_RG');
   IF NOT Id_Null(rg_id) THEN
      Delete_Group('PTRBDPL_DYN_RG');
   END IF; 

   rg_id := Create_Group('PTRBDPL_DYN_RG');
   col_id  := Add_Group_Column(rg_id,'PTRBDPL_EFFECTIVE_DATE',char_column,11); 
   col_id  := Add_Group_Column(rg_id,'PTRBDPL_CODE',char_column,2);
   col_id  := Add_Group_Column(rg_id,'PTRBDPL_DESC',char_column,30);
   col_id  := Add_Group_Column(rg_id,'PTRBDPL_AMT1',number_column);
   col_id  := Add_Group_Column(rg_id,'PTRBDPL_AMT2',number_column);
   col_id  := Add_Group_Column(rg_id,'PTRBDPL_AMT3',number_column);
   col_id  := Add_Group_Column(rg_id,'PTRBDPL_AMT4',number_column);

   lv_bdpl_tab := nokrecs.f_get_bdpl_recs(p_bdca_code, p_eff_date);
   FOR i IN 1..lv_bdpl_tab.COUNT LOOP
      -- Populating the record group by the table values.
      Add_Group_Row(rg_id, END_OF_GROUP);
      Set_Group_char_Cell('PTRBDPL_DYN_RG.PTRBDPL_EFFECTIVE_DATE',i ,to_char(lv_bdpl_tab(i).eff_date,G$_DATE.GET_NLS_DATE_FORMAT));
      Set_Group_Char_Cell('PTRBDPL_DYN_RG.PTRBDPL_CODE',i ,lv_bdpl_tab(i).bdpl_code);
      Set_Group_Char_Cell('PTRBDPL_DYN_RG.PTRBDPL_DESC',i ,lv_bdpl_tab(i).bdpl_desc);
      Set_Group_Number_Cell('PTRBDPL_DYN_RG.PTRBDPL_AMT1',i ,lv_bdpl_tab(i).bdpl_amt1);
      Set_Group_Number_Cell('PTRBDPL_DYN_RG.PTRBDPL_AMT2',i ,lv_bdpl_tab(i).bdpl_amt2);
      Set_Group_Number_Cell('PTRBDPL_DYN_RG.PTRBDPL_AMT3',i ,lv_bdpl_tab(i).bdpl_amt3);
      Set_Group_Number_Cell('PTRBDPL_DYN_RG.PTRBDPL_AMT4',i ,lv_bdpl_tab(i).bdpl_amt4);
   END LOOP;

   Set_Lov_Property('PTQBDPL1_LOV',GROUP_NAME,'PTRBDPL_DYN_RG');
   nokbdpl.DISPLAY_LOV;
END IF; -- HR_INSTALLED_IND
END;
--
PROCEDURE DISPLAY_LOV(ITEM_NAME_IN IN VARCHAR2 := NULL,
                      LIST_NAME_IN IN VARCHAR2 := 'PTQBDPL1_LOV') IS
  -- If the item name parameter is null, the cursor field will be used.
  -- If the list_name parameter is null, the lov associated with the item will be used.

  item_x      NUMBER := 0;
  item_y      NUMBER := 0;
  win_x       NUMBER := 0;
  win_y       NUMBER := 0;
  win_w       NUMBER := 0;  
  win_h       NUMBER := 0;  
  mid_win_w   NUMBER := 0;
  mid_win_h   NUMBER := 0;
  lov_x       NUMBER := 0;
  lov_y       NUMBER := 0;
  lov_w       NUMBER := 0;
  lov_h       NUMBER := 0;
  view_x      NUMBER := 0;
  view_y      NUMBER := 0;
  viewport_x  NUMBER := 0;
  viewport_y  NUMBER := 0;
--
  item_name   VARCHAR2(80);
  list_name   VARCHAR2(80);
  lov_id      LOV;
  rg_name     VARCHAR2(80);
  rg_id       RECORDGROUP;
  rg_status   NUMBER;
  main_win_id WINDOW;
  canvas_name VARCHAR2(50);
BEGIN 
IF nokglob.f_global_string ('HR_INSTALLED_IND') = 'Y' THEN	
  	
  -- Get the item name and type
  item_name := NVL(item_name_in, NAME_IN('SYSTEM.CURSOR_ITEM'));
  IF GET_ITEM_PROPERTY(item_name, ITEM_TYPE) <> 'TEXT ITEM' THEN
  	MESSAGE( G$_NLS.Get('NOQJPLS-0011', 'LIB','*ERROR* This function is only valid for text items.') );
    RETURN;
  END IF;

  -- Get the original LOV name, since it might have changed when in searh mode. 
  list_name := NVL(list_name_in, GET_ITEM_PROPERTY(item_name, LOV_NAME));
  IF list_name IS NULL THEN
    MESSAGE( G$_NLS.Get('NOQJPLS-0012', 'LIB','*ERROR* LOV does not exist for this item') );
    RETURN;
  END IF;

  -- Obtain the id for the LOV and use that to get the record group.
  lov_id := FIND_LOV(list_name);
  rg_name := GET_LOV_PROPERTY(lov_id, GROUP_NAME);
  rg_id := FIND_GROUP(rg_name);

  -- Check the number of the record group and use the returned status to determine 
  -- whether or not any records exist.  If no records exist, issue warning and return. 
  RG_STATUS := Get_Group_Row_Count(RG_ID);
  IF RG_STATUS = 0 THEN
    MESSAGE( G$_NLS.Get('NOQJPLS-0013', 'LIB','*WARNING* No records exist to query LOV.') );
    RETURN;
  END IF;
  
  COPY('','GLOBAL.VALUE');
  N$_CALCULATE_LOV_POS(item_name, list_name, lov_x, lov_y);
  COPY('N','GLOBAL.VALUE_SELECTED');

  -- Display LOV.
  IF SHOW_LOV(list_name, lov_x, lov_y) THEN
    COPY('Y','GLOBAL.VALUE_SELECTED');
    IF (GET_ITEM_PROPERTY(item_name,UPDATEABLE) = 'TRUE')  OR 
       (GET_ITEM_PROPERTY(item_name,UPDATE_NULL) = 'TRUE' AND
        NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL)            OR
       (NAME_IN('SYSTEM.MODE') <> 'NORMAL')                OR
       (NAME_IN('SYSTEM.RECORD_STATUS') IN ('NEW','INSERT')) THEN 
      IF list_name <> 'G$_SEARCH_LOV' THEN
        EXECUTE_TRIGGER('LIST_VALUES_COPY'); 
        G$_CHECK_FAILURE;
        COPY('','GLOBAL.VALUE');

        -- Set to 'Y' so that the Search Mode LOV will not appear 
        -- after leaving the original LOV.
        G$_SEARCH.USED_LOV(TRUE);
        DO_KEY('NEXT_ITEM');
      END IF;
    ELSE
      MESSAGE( G$_NLS.Get('NOQJPLS-0014', 'LIB','*ERROR* Item is protected against update.') );              
    END IF; 
  END IF;
END IF;
END;

END;
		*/
		/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pBdcaCode
		*/
		public void createDynRg(NString pBdcaCode) {
			createDynRg(pBdcaCode, NDate.getNull());
		}

/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pBdcaCode
		* @param pEffDate
		*/
		public void createDynRg(NString pBdcaCode, NDate pEffDate)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			ValueSet rgId= null;
			ValueSetColumn colId= null;
			//UnknownTypes.NokrecsPtrbdplTabtype lvBdplTab= null;
			Nokrecs.PtrbdplTabtypeRow lvBdplTab = null; 
			if ( Nokglob.fGlobalString(toStr("HR_INSTALLED_IND")).equals("Y") )
			{
				rgId = findGroup("PTRBDPL_DYN_RG");
				if ( !(rgId == null) )
				{
					deleteGroup("PTRBDPL_DYN_RG");
				}
				rgId = createGroup("PTRBDPL_DYN_RG");
				colId = addGroupColumn(rgId, "PTRBDPL_EFFECTIVE_DATE", ValueSetColumn.CHAR_COL, 11);
				colId = addGroupColumn(rgId, "PTRBDPL_CODE", ValueSetColumn.CHAR_COL, 2);
				colId = addGroupColumn(rgId, "PTRBDPL_DESC", ValueSetColumn.CHAR_COL, 30);
				colId = addGroupColumn(rgId, "PTRBDPL_AMT1", ValueSetColumn.NUMBER_COL);
				colId = addGroupColumn(rgId, "PTRBDPL_AMT2", ValueSetColumn.NUMBER_COL);
				colId = addGroupColumn(rgId, "PTRBDPL_AMT3", ValueSetColumn.NUMBER_COL);
				colId = addGroupColumn(rgId, "PTRBDPL_AMT4", ValueSetColumn.NUMBER_COL);
				lvBdplTab = Nokrecs.fGetBdplRecs(pBdcaCode, pEffDate);
				for ( int i = 1; i <= lvBdplTab.size(); i++ )//.Count
				{
					//  Populating the record group by the table values.
					//WARNING: only adding rows at the end is supported
					addGroupRow(rgId);
//					setGroupCharCell("PTRBDPL_DYN_RG.PTRBDPL_EFFECTIVE_DATE", i, toChar(lvBdplTab.get(i).EffDate, GDate.getNlsDateFormat()));//(toObject(i)).effDate
					//MORPHIS TODO JLB - foi acrescentado upper 
					setGroupCharCell("PTRBDPL_DYN_RG.PTRBDPL_EFFECTIVE_DATE", i, upper(toChar(lvBdplTab.get(i).EffDate, GDate.getNlsDateFormat())));					
					setGroupCharCell("PTRBDPL_DYN_RG.PTRBDPL_CODE", i, lvBdplTab.get(i).BdplCode);//(toObject(i)).bdplCode);
					setGroupCharCell("PTRBDPL_DYN_RG.PTRBDPL_DESC", i, lvBdplTab.get(i).BdplDesc);//(toObject(i)).bdplDesc);
					setGroupNumberCell("PTRBDPL_DYN_RG.PTRBDPL_AMT1", toInt(i), lvBdplTab.get(i).BdplAmt1);//(toObject(i)).bdplAmt1);
					setGroupNumberCell("PTRBDPL_DYN_RG.PTRBDPL_AMT2", toInt(i), lvBdplTab.get(i).BdplAmt2);//(toObject(i)).bdplAmt2);
					setGroupNumberCell("PTRBDPL_DYN_RG.PTRBDPL_AMT3", toInt(i), lvBdplTab.get(i).BdplAmt3);//(toObject(i)).bdplAmt3);
					setGroupNumberCell("PTRBDPL_DYN_RG.PTRBDPL_AMT4", toInt(i), lvBdplTab.get(i).BdplAmt4);//(toObject(i)).bdplAmt4);
				}
				setLovGroupName("PTQBDPL1_LOV", "PTRBDPL_DYN_RG");
				displayLov();
			}

			//System.err.println("F2J : createDynRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}
/* <p>
		* 
/* </p>
		*/
		public void displayLov() {
			displayLov(NString.getNull(), toStr("PTQBDPL1_LOV"));
		}

/* <p>
		* 
/* </p>
		* @param itemNameIn
		*/
		public void displayLov(NString itemNameIn) {
			displayLov(itemNameIn, toStr("PTQBDPL1_LOV"));
		}

/* <p>
		* 
/* </p>
		* @param itemNameIn
		* @param listNameIn
		*/
		public void displayLov(NString itemNameIn, NString listNameIn)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			//  If the item name parameter is null, the cursor field will be used.
			//  If the list_name parameter is null, the lov associated with the item will be used.
			NNumber itemX = toNumber(0);
			NNumber itemY = toNumber(0);
			NNumber winX = toNumber(0);
			NNumber winY = toNumber(0);
			NNumber winW = toNumber(0);
			NNumber winH = toNumber(0);
			NNumber midWinW = toNumber(0);
			NNumber midWinH = toNumber(0);
			NNumber lovX = toNumber(0);
			NNumber lovY = toNumber(0);
			NNumber lovW = toNumber(0);
			NNumber lovH = toNumber(0);
			NNumber viewX = toNumber(0);
			NNumber viewY = toNumber(0);
			NNumber viewportX = toNumber(0);
			NNumber viewportY = toNumber(0);
			// 
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			LovDescriptor lovId= null;
			NString rgName= NString.getNull();
			ValueSet rgId= null;
			NNumber rgStatus= NNumber.getNull();
			WindowDescriptor mainWinId= null;
			NString canvasName= NString.getNull();
			if ( Nokglob.fGlobalString(toStr("HR_INSTALLED_IND")).equals("Y") )
			{
				//  Get the item name and type
				itemName = isNull(itemNameIn, getCursorItem());
				if ( getItemType(itemName).notEquals("TEXT ITEM") )
				{
					errorMessage(GNls.Fget(toStr("NOQJPLS-0011"), toStr("LIB"), toStr("*ERROR* This function is only valid for text items.")));
					return ;
				}
				//  Get the original LOV name, since it might have changed when in searh mode. 
				listName = isNull(listNameIn, getItemLovName(itemName));
				if ( listName.isNull() )
				{
					errorMessage(GNls.Fget(toStr("NOQJPLS-0012"), toStr("LIB"), toStr("*ERROR* LOV does not exist for this item")));
					return ;
				}
				//  Obtain the id for the LOV and use that to get the record group.
				lovId = findLov(listName);
				rgName = toStr(getLovGroupName(lovId));
				rgId = findGroup(rgName);
				//  Check the number of the record group and use the returned status to determine 
				//  whether or not any records exist.  If no records exist, issue warning and return. 
				rgStatus = toNumber(getGroupRowCount(rgId));
				if ( rgStatus.equals(0) )
				{
					warningMessage(GNls.Fget(toStr("NOQJPLS-0013"), toStr("LIB"), toStr("*WARNING* No records exist to query LOV.")));
					return ;
				}
				copy("","GLOBAL.VALUE");
				Ref<NNumber> lovX_ref = new Ref<NNumber>(lovX);
				Ref<NNumber> lovY_ref = new Ref<NNumber>(lovY);
				getContainer().nCalculateLovPos(itemName, listName, lovX_ref, lovY_ref);
				lovX = lovX_ref.val;
				lovY = lovY_ref.val;
				copy("N","GLOBAL.VALUE_SELECTED");
				//  Display LOV.a
				//
				//if ( showLov(listName)!=null )	//if ( showLov(listName, lovX, lovY) )
				//Morphis TODO: ELLBHR-8116 Se se fizer cancel na love N�o deve entrar no if. Nuno Concei��o
				if ( showLov(listName).isTrue())						
				{
					copy("Y","GLOBAL.VALUE_SELECTED");
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( (getItemUpdateAllowed(itemName).equals("TRUE")) || 
							// MORPHIS TODO: ELLBHR-2037
							//(SupportClasses.FORMS40.GetItemProperty(itemName, SupportClasses.Property.UPDATE_NULL).equals("TRUE") && SupportClasses.AppContext.CursorValue.isNull()) || 
							(getMode().notEquals("NORMAL")) || (in(getRecordStatus(), "NEW", "INSERT").getValue()) )
					
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						if ( listName.notEquals("G$_SEARCH_LOV") )
						{
							executeAction("LIST_VALUES_COPY");
							getContainer().getGoqrpls().gCheckFailure();
							copy("","GLOBAL.VALUE");
							//  Set to 'Y' so that the Search Mode LOV will not appear 
							//  after leaving the original LOV.
							getContainer().getGoqrpls().getGSearch().usedLov(toBool(NBool.True));
							executeAction("NEXT_ITEM");
						}
					}
					else {
						errorMessage(GNls.Fget(toStr("NOQJPLS-0014"), toStr("LIB"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

			//System.err.println("F2J : displayLov procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}
		
	
	
}
