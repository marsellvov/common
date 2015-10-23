package net.hedtech.banner.general.common.Guagmnu.controller;
 
import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;
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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import morphis.foundations.core.appsupportlib.runtime.action.*;
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

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;

import net.hedtech.banner.general.common.Guagmnu.model.*;
import net.hedtech.banner.general.common.Guagmnu.*;
import net.hedtech.banner.general.common.Guagmnu.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SiteMap4Controller extends DefaultBlockController {


	
	public SiteMap4Controller(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GuagmnuTask getTask() {
		return (GuagmnuTask)super.getTask();
	}

	public GuagmnuModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER SITE_MAP4.POPULATE_SITE_MAP4
		 DECLARE
	ITEM_SEQ NUMBER;
	MENU_SEQ NUMBER;
	SUB_MENU_SEQ NUMBER;
	SUB_MENU_COUNT NUMBER;
	MAIN_MENU_NAME VARCHAR2(30);
	MAIN_MENU_DESC VARCHAR2(80);
	SUB_MENU_NAME VARCHAR2(30);
	ITEM_NAME VARCHAR2(30);
	it_id ITEM;
--
  hold_seq number;
--  
  CURSOR PROCESS_MAP IS
    SELECT GURMENU_OBJ_NAME, 
		       NVL(GURMENU_DESC,GUBOBJS_DESC)
	    FROM GURMENU,GUBOBJS
  	 WHERE GURMENU_OBJ_NAME = GUBOBJS_NAME
	     AND GURMENU_OBJ_NAME = '*PROCESS' 
       AND GURMENU_NAME = '*MAIN';
--
  CURSOR PROCESS_OBJECTS IS
    SELECT GURMENU_OBJ_NAME, 
		       NVL(GURMENU_DESC,GUBOBJS_DESC)
	    FROM GURMENU,GUBOBJS
	   WHERE GURMENU_OBJ_NAME = GUBOBJS_NAME
	     AND GURMENU_USER_ID = 'BASELINE' 
       AND GURMENU_NAME = '*PROCESS';
--
  CURSOR PRODUCT_DETAIL IS
    SELECT GUTMENU_VALUE,
           DECODE(GUTMENU_DESC,'NULL',GUBOBJS_DESC,GUTMENU_DESC)
      FROM GUTMENU,GUBOBJS
     WHERE GUTMENU_PRIOR_OBJ = MAIN_MENU_NAME
       AND GUTMENU_VALUE = GUBOBJS_NAME
       AND GUBOBJS_USER_ID = 'BASELINE'
     ORDER BY GUTMENU_SEQ_NO;
--	 
	CURSOR MENU_TOP (seq number ) IS	
		SELECT GURMENU_OBJ_NAME, GUBOBJS_DESC
	    FROM GURMENU,GUBOBJS
	   WHERE GURMENU_NAME = '*MENU'
	     AND GURMENU_OBJ_NAME = GUBOBJS_NAME
	     AND GURMENU_USER_ID = 'BASELINE'
       AND GURMENU_SORT_SEQ = seq
       AND EXISTS
             (SELECT GUTMENU_VALUE
                FROM GUTMENU
               WHERE GUTMENU_VALUE = GURMENU_OBJ_NAME
                 AND GUTMENU_LEVEL = 1);
--
BEGIN
  ITEM_SEQ := 0;
--
<<PRODUCT>>
  FOR MENU_SEQ IN 6..7 LOOP
	  hold_seq := get_seq( menu_seq ); 
--               
	  open menu_top ( hold_seq );
    fetch menu_top into :SITE_MAP4.GURMENU_OBJ_NAME,
	                      :SITE_MAP4.GURMENU_DESC;
--
    EXIT PRODUCT WHEN MENU_TOP%NotFound;
   	close MENU_TOP;
--
	  MAIN_MENU_NAME := :SITE_MAP4.GURMENU_OBJ_NAME;
	  MAIN_MENU_DESC := :SITE_MAP4.GURMENU_DESC;
--
--  display parent menu description, 
--    store child menu object name - blank in this case - in DTL_OBJ,
--    and store parent menu object name in MAIN_OBJ
--  both object names are needed to nav to next page.
--
	 	ITEM_SEQ := ITEM_SEQ + 1;
	  COPY( :SITE_MAP4.GURMENU_DESC,'SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	  COPY( MAIN_MENU_NAME,'SITE_MAP4.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	  COPY( '','SITE_MAP4.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	 	ITEM_NAME := 'SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
	  Set_Item_Property(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WHDR');
	  Set_Item_Property(ITEM_NAME,TOOLTIP_TEXT,:SITE_MAP4.GURMENU_DESC);
    Set_Item_Property(ITEM_NAME,NAVIGABLE,PROPERTY_TRUE);
--
    SELECT COUNT(*) 
      INTO SUB_MENU_COUNT
      FROM GURMENU
     WHERE GURMENU_NAME = MAIN_MENU_NAME
       AND GURMENU_USER_ID = 'BASELINE';
--
  OPEN PRODUCT_DETAIL;
<<INNER>>
	FOR SUB_MENU_SEQ IN 1..SUB_MENU_COUNT LOOP
    FETCH PRODUCT_DETAIL INTO :SITE_MAP4.GURMENU_OBJ_NAME,
	                            :SITE_MAP4.GURMENU_DESC;
--
	  EXIT INNER when sql%NotFound
	              OR (MENU_SEQ = 6 AND ITEM_SEQ = 15)
	              OR (MENU_SEQ = 7 AND ITEM_SEQ = 33);
--
--  display child menu description, 
--    store child menu object name in DTL_OBJ,
--    and store parent menu object name in MAIN_OBJ
--  both object names are needed to nav to next page.
--
	 	ITEM_SEQ := ITEM_SEQ + 1;
	  IF  (MENU_SEQ = 6 AND ITEM_SEQ = 15)
	   OR (MENU_SEQ = 7 AND ITEM_SEQ = 33) THEN
	      COPY(  G$_NLS.Get('GUAGMNU-0042', 'FORM',
	'Select to see more %01% on Menu'  
	, 
	            MAIN_MENU_DESC ),
	            'SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	      COPY( MAIN_MENU_NAME,'SITE_MAP4.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	      COPY( '','SITE_MAP4.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	 	    ITEM_NAME := 'SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
        Set_Item_Property(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WDTL');
        Set_Item_Property(ITEM_NAME,TOOLTIP_TEXT,
                           G$_NLS.Get('GUAGMNU-0043', 'FORM',
	'Select to see more %01% on Menu'  
	,  MAIN_MENU_DESC ));
        Set_Item_Property(ITEM_NAME,ENABLED,PROPERTY_TRUE);
        Set_Item_Property(ITEM_NAME,NAVIGABLE,PROPERTY_TRUE);
	 	ELSE
  	 	ITEM_NAME := 'SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
      Set_Item_Property(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WDTL');
	    COPY( :SITE_MAP4.GURMENU_DESC,'SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	    COPY( MAIN_MENU_NAME,'SITE_MAP14.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	    COPY( :SITE_MAP4.GURMENU_OBJ_NAME,'SITE_MAP4.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	    Set_Item_Property(ITEM_NAME,TOOLTIP_TEXT,:SITE_MAP4.GURMENU_DESC);
	    Set_Item_Property(ITEM_NAME,ENABLED,PROPERTY_TRUE);
      Set_Item_Property(ITEM_NAME,NAVIGABLE,PROPERTY_TRUE);
    END IF;
	END LOOP INNER; 
	CLOSE PRODUCT_DETAIL; 
-- insert blank line before next header
	ITEM_SEQ := ITEM_SEQ + 1;
	  COPY('','SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	  COPY('','SITE_MAP4.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	  COPY('','SITE_MAP4.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	 	ITEM_NAME := 'SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
    Set_Item_Property(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_BDTL');
    Set_Item_Property(ITEM_NAME,TOOLTIP_TEXT,'');
    Set_Item_Property(ITEM_NAME,ENABLED,PROPERTY_FALSE);
  END LOOP PRODUCT;
--
<<PROCESSES>>
	OPEN PROCESS_MAP;
	FETCH PROCESS_MAP INTO :SITE_MAP4.GURMENU_OBJ_NAME,:SITE_MAP4.GURMENU_DESC;
--
  IF SQL%NotFound THEN 
		GOTO ENDOUTER;
  END IF;
  MAIN_MENU_NAME := :SITE_MAP4.GURMENU_OBJ_NAME;
  MAIN_MENU_DESC := :SITE_MAP4.GURMENU_DESC;
--
 	ITEM_SEQ := ITEM_SEQ + 1;
  COPY( :SITE_MAP4.GURMENU_DESC,'SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
  COPY( MAIN_MENU_NAME,'SITE_MAP4.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
  COPY( :SITE_MAP4.GURMENU_OBJ_NAME,'SITE_MAP4.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
 	ITEM_NAME := 'SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
  Set_Item_Property(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_BHDR');
  Set_Item_Property(ITEM_NAME,TOOLTIP_TEXT,:SITE_MAP4.GURMENU_DESC);
  Set_Item_Property(ITEM_NAME,NAVIGABLE,PROPERTY_TRUE);
--
<<PROCESSES_DETAILS>>
  SELECT COUNT(*) 
    INTO SUB_MENU_COUNT
    FROM GURMENU
   WHERE GURMENU_NAME = MAIN_MENU_NAME
     AND GURMENU_USER_ID = 'BASELINE';
--
  IF SUB_MENU_COUNT = 0 THEN
   	:SITE_MAP4.GURMENU_DESC := G$_NLS.Get('GUAGMNU-0044','FORM','Empty');
	  ITEM_SEQ := ITEM_SEQ + 1;
	  COPY( :SITE_MAP4.GURMENU_DESC,'SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	  COPY( MAIN_MENU_NAME,'SITE_MAP4.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	  COPY( '','SITE_MAP4.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	 	ITEM_NAME := 'SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
    Set_Item_Property(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_BDTL');
    Set_Item_Property(ITEM_NAME,TOOLTIP_TEXT,G$_NLS.Get('GUAGMNU-0045','FORM','Empty'));
  END IF;
  OPEN PROCESS_OBJECTS;
<<PROCESSES_OBJECTS>>
	FOR SUB_MENU_SEQ IN 1..SUB_MENU_COUNT LOOP
 	  FETCH PROCESS_OBJECTS INTO :SITE_MAP4.GURMENU_OBJ_NAME,
	                             :SITE_MAP4.GURMENU_DESC;
	  EXIT PROCESSES_OBJECTS when sql%NotFound;
--
    IF ITEM_SEQ = 39 THEN
	  	ITEM_SEQ := ITEM_SEQ + 1;
	    COPY(  G$_NLS.Get('GUAGMNU-0046', 'FORM',
	'Select to see more %01% on Menu'  
	, 
	            :SITE_MAP4.GURMENU_DESC ),
	            'SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	    COPY( MAIN_MENU_NAME,'SITE_MAP4.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	    COPY( :SITE_MAP4.GURMENU_OBJ_NAME,'SITE_MAP4.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	 	  ITEM_NAME := 'SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
      Set_Item_Property(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_BDTL');
      Set_Item_Property(ITEM_NAME,TOOLTIP_TEXT,:SITE_MAP4.GURMENU_DESC);
      Set_Item_Property(ITEM_NAME,ENABLED,PROPERTY_TRUE);
      Set_Item_Property(ITEM_NAME,NAVIGABLE,PROPERTY_TRUE);
      EXIT PROCESSES_OBJECTS;
    END IF;
--
	 	ITEM_SEQ := ITEM_SEQ + 1;
	  COPY( :SITE_MAP4.GURMENU_DESC,'SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	  COPY( MAIN_MENU_NAME,'SITE_MAP4.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	  COPY( :SITE_MAP4.GURMENU_OBJ_NAME,'SITE_MAP4.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	 	ITEM_NAME := 'SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
    Set_Item_Property(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_BDTL');
    Set_Item_Property(ITEM_NAME,TOOLTIP_TEXT,:SITE_MAP4.GURMENU_DESC);
    Set_Item_Property(ITEM_NAME,ENABLED,PROPERTY_TRUE);
    Set_Item_Property(ITEM_NAME,NAVIGABLE,PROPERTY_TRUE);
	END LOOP PROCESSES_OBJECTS; 
	CLOSE PROCESS_OBJECTS;
<<ENDOUTER>>
  CLOSE PROCESS_MAP;
	-- insert blank line before next header
<<DISABLE_REST>>
  IF ITEM_SEQ <= 39 THEN
    IF ITEM_SEQ = 0 THEN
    	ITEM_SEQ := 1;
    END IF;
--
	  FOR SUB_MENU_SEQ IN ITEM_SEQ..39 LOOP
		  ITEM_SEQ := ITEM_SEQ + 1;
	    COPY('','SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	    COPY('','SITE_MAP4.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	    COPY('','SITE_MAP4.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	 	  ITEM_NAME := 'SITE_MAP4.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
      Set_Item_Property(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_BDTL');
      Set_Item_Property(ITEM_NAME,TOOLTIP_TEXT,'');
      Set_Item_Property(ITEM_NAME,ENABLED,PROPERTY_FALSE);
	  END LOOP DISABLE_REST;
	END IF;
--
EXCEPTION
  WHEN NO_DATA_FOUND THEN
	  NULL;
  WHEN OTHERS THEN
	 -- MESSAGE('EXCEPTION SQLCODE SQLERRM='||SQLCODE||':'||SQLERRM);pause;
	  MESSAGE(G$_NLS.Get('GUAGMNU-0047','FORM','EXCEPTION SQLCODE SQLERRM=%01% : %02%',SQLCODE,SQLERRM));pause;
	  
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SITE_MAP4.POPULATE_SITE_MAP4
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POPULATE_SITE_MAP4")
		public void siteMap4_PopulateSiteMap4()
		{
			
				int rowCount = 0;
				{
					NNumber itemSeq= NNumber.getNull();
					NNumber menuSeq= NNumber.getNull();
					NNumber subMenuSeq= NNumber.getNull();
					NNumber subMenuCount= NNumber.getNull();
					NString mainMenuName= NString.getNull();
					NString mainMenuDesc= NString.getNull();
					NString subMenuName= NString.getNull();
					NString itemName= NString.getNull();
					ItemDescriptor itId= null;
					// 
					NNumber holdSeq= NNumber.getNull();
					String sqlprocessMap = "SELECT GURMENU_OBJ_NAME, NVL(GURMENU_DESC, GUBOBJS_DESC) " +
	" FROM GURMENU, GUBOBJS " +
	" WHERE GURMENU_OBJ_NAME = GUBOBJS_NAME AND GURMENU_OBJ_NAME = '*PROCESS' AND GURMENU_NAME = '*MAIN' ";
					DataCursor processMap = new DataCursor(sqlprocessMap);
					String sqlprocessObjects = "SELECT GURMENU_OBJ_NAME, NVL(GURMENU_DESC, GUBOBJS_DESC) " +
	" FROM GURMENU, GUBOBJS " +
	" WHERE GURMENU_OBJ_NAME = GUBOBJS_NAME AND GURMENU_USER_ID = 'BASELINE' AND GURMENU_NAME = '*PROCESS' ";
					DataCursor processObjects = new DataCursor(sqlprocessObjects);
					String sqlproductDetail = "SELECT GUTMENU_VALUE, DECODE(GUTMENU_DESC, 'NULL', GUBOBJS_DESC, GUTMENU_DESC) " +
	" FROM GUTMENU, GUBOBJS " +
	" WHERE GUTMENU_PRIOR_OBJ = :P_MAIN_MENU_NAME AND GUTMENU_VALUE = GUBOBJS_NAME AND GUBOBJS_USER_ID = 'BASELINE' " +
	" ORDER BY GUTMENU_SEQ_NO";
					DataCursor productDetail = new DataCursor(sqlproductDetail);
					String sqlmenuTop = "SELECT GURMENU_OBJ_NAME, GUBOBJS_DESC " +
	" FROM GURMENU, GUBOBJS " +
	" WHERE GURMENU_NAME = '*MENU' AND GURMENU_OBJ_NAME = GUBOBJS_NAME AND GURMENU_USER_ID = 'BASELINE' AND GURMENU_SORT_SEQ = :P_SEQ AND  EXISTS(SELECT GUTMENU_VALUE " +
		" FROM GUTMENU " +
		" WHERE GUTMENU_VALUE = GURMENU_OBJ_NAME AND GUTMENU_LEVEL = 1 ) ";
					DataCursor menuTop = new DataCursor(sqlmenuTop);
					NString seq = NString.getNull();
					try {
						try
						{
							itemSeq = toNumber(0);
							// PRODUCT:;
							for ( menuSeq.equals(6); menuSeq.lesserOrEquals(7); menuSeq.add(1) )
							{
								holdSeq = this.getTask().getServices().getSeq(toNumber(menuSeq));
								//                
								seq=toStr(holdSeq);
								//Setting query parameters
								menuTop.addParameter("P_SEQ", seq);
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable menuTop.
								menuTop.open();
								ResultSet menuTopResults = menuTop.fetchInto();
								if ( menuTopResults != null ) {
									getFormModel().getSiteMap4().setGurmenuObjName(menuTopResults.getStr(0));
									getFormModel().getSiteMap4().setGurmenuDesc(menuTopResults.getStr(1));
								}
								// 
								if ( menuTop.notFound() ) 
									break;
								menuTop.close();
								// 
								mainMenuName = getFormModel().getSiteMap4().getGurmenuObjName();
								mainMenuDesc = getFormModel().getSiteMap4().getGurmenuDesc();
								// 
								//   display parent menu description, 
								//     store child menu object name - blank in this case - in DTL_OBJ,
								//     and store parent menu object name in MAIN_OBJ
								//   both object names are needed to nav to next page.
								// 
								itemSeq = itemSeq.add(1);
								copy(getFormModel().getSiteMap4().getGurmenuDesc(),toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq)));
								copy(mainMenuName,toStr("SITE_MAP4.MAIN_OBJ_").append(toChar(itemSeq)));
								copy("",toStr("SITE_MAP4.DTL_OBJ_").append(toChar(itemSeq)));
								itemName = toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq));
								setItemStyleClass(itemName, "G$_NVA_SITEMAP_WHDR");
								setItemToolTip(itemName, getFormModel().getSiteMap4().getGurmenuDesc());
								setItemNavigable(itemName, true);
								// 
								String sql1 = "SELECT COUNT(*) " +
	" FROM GURMENU " +
	" WHERE GURMENU_NAME = :P_MAIN_MENU_NAME AND GURMENU_USER_ID = 'BASELINE' ";
								DataCommand command1 = new DataCommand(sql1);
								//Setting query parameters
								command1.addParameter("P_MAIN_MENU_NAME", mainMenuName);
								ResultSet results1 = command1.executeQuery();
								rowCount = command1.getRowCount();
								if ( results1.hasData() ) {
									subMenuCount = results1.getNumber(0);
								}
								results1.close();
								// 
								//Setting query parameters
								productDetail.addParameter("P_MAIN_MENU_NAME", mainMenuName);
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable productDetail.
								productDetail.open();
								// INNER:;
								for ( subMenuSeq.equals(1); subMenuSeq.lesserOrEquals(subMenuCount); subMenuSeq.add( 1) )
								{
									ResultSet productDetailResults = productDetail.fetchInto();
									if ( productDetailResults != null ) {
										getFormModel().getSiteMap4().setGurmenuObjName(productDetailResults.getStr(0));
										getFormModel().getSiteMap4().setGurmenuDesc(productDetailResults.getStr(1));
									}
									// 
									if ( rowCount == 0 || (menuSeq.equals(6) && itemSeq.equals(15)) || (menuSeq.equals(7) && itemSeq.equals(33)) ) 
										break;
									// 
									//   display child menu description, 
									//     store child menu object name in DTL_OBJ,
									//     and store parent menu object name in MAIN_OBJ
									//   both object names are needed to nav to next page.
									// 
									itemSeq = itemSeq.add(1);
									if ( (menuSeq.equals(6) && itemSeq.equals(15)) || (menuSeq.equals(7) && itemSeq.equals(33)) )
									{
										copy(GNls.Fget(toStr("GUAGMNU-0042"), toStr("FORM"), toStr("Select to see more %01% on Menu"), mainMenuDesc),toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq)));
										copy(mainMenuName,toStr("SITE_MAP4.MAIN_OBJ_").append(toChar(itemSeq)));
										copy("",toStr("SITE_MAP4.DTL_OBJ_").append(toChar(itemSeq)));
										itemName = toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq));
										setItemStyleClass(itemName, "G$_NVA_SITEMAP_WDTL");
										setItemToolTip(itemName, GNls.Fget(toStr("GUAGMNU-0043"), toStr("FORM"), toStr("Select to see more %01% on Menu"), mainMenuDesc));
										setItemEnabled(itemName, true);
										setItemNavigable(itemName, true);
									}
									else {
										itemName = toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq));
										setItemStyleClass(itemName, "G$_NVA_SITEMAP_WDTL");
										copy(getFormModel().getSiteMap4().getGurmenuDesc(),toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq)));
										copy(mainMenuName,toStr("SITE_MAP14.MAIN_OBJ_").append(toChar(itemSeq)));
										copy(getFormModel().getSiteMap4().getGurmenuObjName(),toStr("SITE_MAP4.DTL_OBJ_").append(toChar(itemSeq)));
										setItemToolTip(itemName, getFormModel().getSiteMap4().getGurmenuDesc());
										setItemEnabled(itemName, true);
										setItemNavigable(itemName, true);
									}
								}
								productDetail.close();
								//  insert blank line before next header
								itemSeq = itemSeq.add(1);
								copy("",toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq)));
								copy("",toStr("SITE_MAP4.MAIN_OBJ_").append(toChar(itemSeq)));
								copy("",toStr("SITE_MAP4.DTL_OBJ_").append(toChar(itemSeq)));
								itemName = toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq));
								setItemStyleClass(itemName, "G$_NVA_SITEMAP_BDTL");
								setItemToolTip(itemName, "");
								setItemEnabled(itemName, false);
							}
							// PROCESSES:;
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable processMap.
							processMap.open();
							ResultSet processMapResults = processMap.fetchInto();
							if ( processMapResults != null ) {
								getFormModel().getSiteMap4().setGurmenuObjName(processMapResults.getStr(0));
								getFormModel().getSiteMap4().setGurmenuDesc(processMapResults.getStr(1));
							}
							// 
							if ( rowCount == 0 )
							{
								// goto ENDOUTER;
								 
									//	 ENDOUTER:;
									processMap.close();
									 DISABLE_REST:;
									if ( itemSeq.lesserOrEquals(39) )
									{
										if ( itemSeq.equals(0) )
										{
											itemSeq = toNumber(1);
										}
										// 
										for (  subMenuSeq = itemSeq; subMenuSeq.toInt32() <= 39; subMenuSeq.add(1) )
										{
											itemSeq = itemSeq.add(1);
											copy("",toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq)));
											copy("",toStr("SITE_MAP4.MAIN_OBJ_").append(toChar(itemSeq)));
											copy("",toStr("SITE_MAP4.DTL_OBJ_").append(toChar(itemSeq)));
											itemName = toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq));
											setItemStyleClass(itemName, "G$_NVA_SITEMAP_BDTL");
											setItemToolTip(itemName, "");
											setItemEnabled(itemName, false);
										}
									}
								 
								 
							}
							mainMenuName = getFormModel().getSiteMap4().getGurmenuObjName();
							mainMenuDesc = getFormModel().getSiteMap4().getGurmenuDesc();
							// 
							itemSeq = itemSeq.add(1);
							copy(getFormModel().getSiteMap4().getGurmenuDesc(),toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq)));
							copy(mainMenuName,toStr("SITE_MAP4.MAIN_OBJ_").append(toChar(itemSeq)));
							copy(getFormModel().getSiteMap4().getGurmenuObjName(),toStr("SITE_MAP4.DTL_OBJ_").append(toChar(itemSeq)));
							itemName = toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq));
							setItemStyleClass(itemName, "G$_NVA_SITEMAP_BHDR");
							setItemToolTip(itemName, getFormModel().getSiteMap4().getGurmenuDesc());
							setItemNavigable(itemName, true);
							 PROCESSES_DETAILS:;
							String sql2 = "SELECT COUNT(*) " +
	" FROM GURMENU " +
	" WHERE GURMENU_NAME = :P_MAIN_MENU_NAME AND GURMENU_USER_ID = 'BASELINE' ";
							DataCommand command2 = new DataCommand(sql2);
							//Setting query parameters
							command2.addParameter("P_MAIN_MENU_NAME", mainMenuName);
							ResultSet results2 = command2.executeQuery();
							rowCount = command2.getRowCount();
							if ( results2.hasData() ) {
								subMenuCount = results2.getNumber(0);
							}
							results2.close();
							// 
							if ( subMenuCount.equals(0) )
							{
								getFormModel().getSiteMap4().setGurmenuDesc(GNls.Fget(toStr("GUAGMNU-0044"), toStr("FORM"), toStr("Empty")));
								itemSeq = itemSeq.add(1);
								copy(getFormModel().getSiteMap4().getGurmenuDesc(),toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq)));
								copy(mainMenuName,toStr("SITE_MAP4.MAIN_OBJ_").append(toChar(itemSeq)));
								copy("",toStr("SITE_MAP4.DTL_OBJ_").append(toChar(itemSeq)));
								itemName = toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq));
								setItemStyleClass(itemName, "G$_NVA_SITEMAP_BDTL");
								setItemToolTip(itemName, GNls.Fget(toStr("GUAGMNU-0045"), toStr("FORM"), toStr("Empty")));
							}
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable processObjects.
							processObjects.open();
							// PROCESSES_OBJECTS:;
							for (  subMenuSeq.equals(1); subMenuSeq.lesserOrEquals(subMenuCount); subMenuSeq.add(1) )
							{
								ResultSet processObjectsResults = processObjects.fetchInto();
								if ( processObjectsResults != null ) {
									getFormModel().getSiteMap4().setGurmenuObjName(processObjectsResults.getStr(0));
									getFormModel().getSiteMap4().setGurmenuDesc(processObjectsResults.getStr(1));
								}
								if ( rowCount == 0 ) 
									break;
								// 
								if ( itemSeq.equals(39) )
								{
									itemSeq = itemSeq.add(1);
									copy(GNls.Fget(toStr("GUAGMNU-0046"), toStr("FORM"), toStr("Select to see more %01% on Menu"), getFormModel().getSiteMap4().getGurmenuDesc()),toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq)));
									copy(mainMenuName,toStr("SITE_MAP4.MAIN_OBJ_").append(toChar(itemSeq)));
									copy(getFormModel().getSiteMap4().getGurmenuObjName(),toStr("SITE_MAP4.DTL_OBJ_").append(toChar(itemSeq)));
									itemName = toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq));
									setItemStyleClass(itemName, "G$_NVA_SITEMAP_BDTL");
									setItemToolTip(itemName, getFormModel().getSiteMap4().getGurmenuDesc());
									setItemEnabled(itemName, true);
									setItemNavigable(itemName, true);
										break;
								}
								// 
								itemSeq = itemSeq.add(1);
								copy(getFormModel().getSiteMap4().getGurmenuDesc(),toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq)));
								copy(mainMenuName,toStr("SITE_MAP4.MAIN_OBJ_").append(toChar(itemSeq)));
								copy(getFormModel().getSiteMap4().getGurmenuObjName(),toStr("SITE_MAP4.DTL_OBJ_").append(toChar(itemSeq)));
								itemName = toStr("SITE_MAP4.MAIN_DESC_").append(toChar(itemSeq));
								setItemStyleClass(itemName, "G$_NVA_SITEMAP_BDTL");
								setItemToolTip(itemName, getFormModel().getSiteMap4().getGurmenuDesc());
								setItemEnabled(itemName, true);
								setItemNavigable(itemName, true);
							}
							processObjects.close();
					
						}
						catch(NoDataFoundException e)
						{
						}
						catch(Exception  e)
						{
							//  MESSAGE('EXCEPTION SQLCODE SQLERRM='||SQLCODE||':'||SQLERRM);pause;
							errorMessage(GNls.Fget(toStr("GUAGMNU-0047"), toStr("FORM"), toStr("EXCEPTION SQLCODE SQLERRM=%01% : %02%"), toStr(errorCode()), errorMessage()));
							// F2J_TO_REMOVE : Call to built-in "PAUSE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#ExcludePause".
							//							SupportClasses.SQLFORMS.Pause();
							this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'PAUSE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#ExcludePause'.");
							
							
						}
					}
					finally{
						menuTop.close();
						productDetail.close();
						processMap.close();
						processObjects.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SITE_MAP4.WHEN-NEW-ITEM-INSTANCE
		 SITEMAP_ADD_HIGHLIGHT;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SITE_MAP4.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", function=KeyFunction.ITEM_CHANGE)
		public void siteMap4_itemChange()
		{
			
				this.getTask().getServices().sitemapAddHighlight();
			}

		
		/* Original PL/SQL code code for TRIGGER SITE_MAP4.POST-TEXT-ITEM
		 SITEMAP_REMOVE_HIGHLIGHT;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SITE_MAP4.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", function=KeyFunction.ITEM_OUT)
		public void siteMap4_itemOut()
		{
			
				this.getTask().getServices().sitemapRemoveHighlight();
			}

		
		/* Original PL/SQL code code for TRIGGER SITE_MAP4.WHEN-MOUSE-DOUBLECLICK
		 SITEMAP_SELECTION;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SITE_MAP4.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void siteMap4_doubleClick()
		{
			
				this.getTask().getServices().sitemapSelection();
			}

		
		/* Original PL/SQL code code for TRIGGER SITE_MAP4.KEY-LISTVAL
		 SITEMAP_SELECTION;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SITE_MAP4.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void siteMap4_ListValues()
		{
			
				this.getTask().getServices().sitemapSelection();
			}

		
		/* Original PL/SQL code code for TRIGGER SITE_MAP4.KEY-NXTBLK
		 GO_ITEM('KEY_BLOCK.NEXT_SELECTION');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SITE_MAP4.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void siteMap4_NextBlock()
		{
			
				goItem(toStr("KEY_BLOCK.NEXT_SELECTION"));
			}

		
	
	
}

