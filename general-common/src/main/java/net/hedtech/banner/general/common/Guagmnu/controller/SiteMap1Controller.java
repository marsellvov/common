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

public class SiteMap1Controller extends DefaultBlockController {


	
	public SiteMap1Controller(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER SITE_MAP1.POPULATE_SITE_MAP1
		 DECLARE
	ITEM_SEQ        NUMBER;
	MENU_SEQ        NUMBER;
	SUB_MENU_SEQ    NUMBER;
	SUB_MENU_COUNT  NUMBER;
	MAIN_MENU_NAME  VARCHAR2(30);
	MAIN_MENU_DESC  VARCHAR2(80);
	SUB_MENU_NAME   VARCHAR2(30);
	ITEM_NAME       VARCHAR2(30);
	it_id           ITEM;
--
	hold_seq number;
--
  CURSOR PERSONAL_MAP IS
  SELECT GURMENU_OBJ_NAME, 
		     NVL(GURMENU_DESC,GUBOBJS_DESC)
	  FROM GURMENU,GUBOBJS
	 WHERE GURMENU_OBJ_NAME = GUBOBJS_NAME
	   AND GURMENU_OBJ_NAME = '*PERSONAL' 
     AND GURMENU_NAME = '*MAIN';
--
  CURSOR PERSONAL_OBJECTS IS
  SELECT GURMENU_OBJ_NAME, 
		     NVL(GURMENU_DESC,GUBOBJS_DESC)
	  FROM GURMENU,GUBOBJS
	 WHERE GURMENU_OBJ_NAME = GUBOBJS_NAME
	   AND GURMENU_USER_ID = :GLOBAL.current_user1 
     AND GURMENU_NAME = '*PERSONAL'
   ORDER BY GURMENU_SORT_SEQ;
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
	CURSOR MENU_TOP IS	
    SELECT GUTMENU_VALUE,
           DECODE(GUTMENU_DESC,'NULL',GUBOBJS_DESC,GUTMENU_DESC),
           ROWNUM
      FROM GUTMENU,GUBOBJS
     WHERE GUTMENU_LEVEL = 1
       AND GUTMENU_VALUE = GUBOBJS_NAME
       AND GUTMENU_OBJT_CODE = 'MENU'
       AND GUTMENU_SEQ_NO =
             (SELECT MIN(GUTMENU_SEQ_NO)
                FROM GUTMENU
               WHERE GUTMENU_LEVEL = 1
                 AND GUTMENU_OBJT_CODE = 'MENU');
--
BEGIN
	ITEM_SEQ := 0;
<<PERSONAL_HEADER>>
	OPEN PERSONAL_MAP;
	FETCH PERSONAL_MAP INTO :SITE_MAP1.GURMENU_OBJ_NAME, :SITE_MAP1.GURMENU_DESC;
--
  IF  SQL%NOTFOUND THEN 
		GOTO PRODUCT;
	END IF;
--
	MAIN_MENU_NAME := :SITE_MAP1.GURMENU_OBJ_NAME;
	MAIN_MENU_DESC := :SITE_MAP1.GURMENU_DESC;
	CLOSE PERSONAL_MAP;
--
--  display parent menu description, 
--    store child menu object name - blank in this case - in DTL_OBJ,
--    and store parent menu object name in MAIN_OBJ
--  both object names are needed to nav to next page.
--
	ITEM_SEQ := ITEM_SEQ + 1;
	COPY( :SITE_MAP1.GURMENU_DESC,'SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	COPY( MAIN_MENU_NAME,'SITE_MAP1.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	COPY( '','SITE_MAP1.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	ITEM_NAME := 'SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
	SET_ITEM_PROPERTY(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WHDR');
	SET_ITEM_PROPERTY(ITEM_NAME,TOOLTIP_TEXT,:SITE_MAP1.GURMENU_DESC);
	--
  SELECT COUNT(*) 
    INTO SUB_MENU_COUNT
    FROM GURMENU
   WHERE GURMENU_NAME = MAIN_MENU_NAME
     AND GURMENU_USER_ID = :GLOBAL.current_user1;
  --
  IF SUB_MENU_COUNT = 0 THEN
 		:SITE_MAP1.GURMENU_DESC :=  G$_NLS.Get('GUAGMNU-0027', 'FORM','Empty; Select to build.') ;
    ITEM_SEQ := ITEM_SEQ + 1;
    COPY( :SITE_MAP1.GURMENU_DESC,'SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
    COPY( MAIN_MENU_NAME,'SITE_MAP1.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
    COPY( 'GUAPMNU','SITE_MAP1.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
 	  ITEM_NAME := 'SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
    SET_ITEM_PROPERTY(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WDTL');
    SET_ITEM_PROPERTY(ITEM_NAME,TOOLTIP_TEXT, G$_NLS.Get('GUAGMNU-0028', 'FORM','Empty; Select to build.') );
    SET_ITEM_PROPERTY(ITEM_NAME,NAVIGABLE,PROPERTY_TRUE);
    GOTO BLANK_LINE;
  END IF;
   --
	OPEN PERSONAL_OBJECTS;
<<PERSONAL_DETAIL>>
	FOR SUB_MENU_SEQ IN 1..SUB_MENU_COUNT LOOP
    FETCH PERSONAL_OBJECTS INTO :SITE_MAP1.GURMENU_OBJ_NAME,
	                              :SITE_MAP1.GURMENU_DESC;
	  EXIT PERSONAL_DETAIL when sql%NotFound OR ITEM_SEQ = 17;
--
	  ITEM_SEQ := ITEM_SEQ + 1;
	  COPY( :SITE_MAP1.GURMENU_DESC,'SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	  COPY( MAIN_MENU_NAME,'SITE_MAP1.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	  COPY( :SITE_MAP1.GURMENU_OBJ_NAME,'SITE_MAP1.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	  ITEM_NAME := 'SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
    SET_ITEM_PROPERTY(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WDTL');
    SET_ITEM_PROPERTY(ITEM_NAME,TOOLTIP_TEXT,:SITE_MAP1.GURMENU_DESC);
    SET_ITEM_PROPERTY(ITEM_NAME,ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY(ITEM_NAME,NAVIGABLE,PROPERTY_TRUE);
    --
  END LOOP PERSONAL_DETAIL ; 
	CLOSE PERSONAL_OBJECTS;
		-- add row to link to GUAPMNU form to provide link to maintain 'My Banner'
	  --
  IF SUB_MENU_COUNT > 0 THEN
   	:SITE_MAP1.GURMENU_DESC :=  G$_NLS.Get('GUAGMNU-0029', 'FORM','Organize My Banner') ;
	  ITEM_SEQ := ITEM_SEQ + 1;
	  COPY( :SITE_MAP1.GURMENU_DESC,'SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	  COPY( MAIN_MENU_NAME,'SITE_MAP1.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	  COPY( 'GUAPMNU','SITE_MAP1.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	 	ITEM_NAME := 'SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
    SET_ITEM_PROPERTY(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WDTL');
    SET_ITEM_PROPERTY(ITEM_NAME,TOOLTIP_TEXT, G$_NLS.Get('GUAGMNU-0030', 'FORM','Organize My Banner') );
    SET_ITEM_PROPERTY(ITEM_NAME,ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY(ITEM_NAME,NAVIGABLE,PROPERTY_TRUE);
  END IF;
   --
<<ADD_TREE_LINK>>
-- if needed on overflow: add link to TREE entry for My Banner
  IF ITEM_SEQ = 18 THEN
	  ITEM_SEQ := ITEM_SEQ + 1;
	  COPY( G$_NLS.Get('GUAGMNU-0031', 'FORM','Select to see more %01% on Menu',MAIN_MENU_DESC),
	          'SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	  COPY( MAIN_MENU_NAME,'SITE_MAP1.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	  COPY( '','SITE_MAP1.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	  ITEM_NAME := 'SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
    SET_ITEM_PROPERTY(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WDTL');
    SET_ITEM_PROPERTY(ITEM_NAME,TOOLTIP_TEXT,
             G$_NLS.Get('GUAGMNU-0032','FORM','Select to see more %01% on Menu',MAIN_MENU_DESC));
    SET_ITEM_PROPERTY(ITEM_NAME,ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY(ITEM_NAME,NAVIGABLE,PROPERTY_TRUE);
	END IF;
--
<<BLANK_LINE>>
-- insert blank line before next header
	ITEM_SEQ := ITEM_SEQ + 1;
	COPY('','SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	COPY('','SITE_MAP1.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	COPY('','SITE_MAP1.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	ITEM_NAME := 'SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
  SET_ITEM_PROPERTY(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WDTL');
  SET_ITEM_PROPERTY(ITEM_NAME,TOOLTIP_TEXT,'');
  SET_ITEM_PROPERTY(ITEM_NAME,ENABLED,PROPERTY_FALSE);
--
<<PRODUCT>>
  open menu_top;
  fetch menu_top into :SITE_MAP1.GURMENU_OBJ_NAME,
	                    :SITE_MAP1.GURMENU_DESC,menu_seq;
--
  if is_last( menu_seq ) then
    :last_seq := 'Y';
  end if;
--
  if menu_top%NotFound THEN
 		GOTO PRODUCT_END;
	END IF;                
--
 	close MENU_TOP;
--
  MAIN_MENU_NAME := :SITE_MAP1.GURMENU_OBJ_NAME;
  MAIN_MENU_DESC := :SITE_MAP1.GURMENU_DESC;
--
--  display parent menu description, 
--    store child menu object name - blank in this case - in DTL_OBJ,
--    and store parent menu object name in MAIN_OBJ
--  both object names are needed to nav to next page.
--
 	ITEM_SEQ := ITEM_SEQ + 1;
  COPY( :SITE_MAP1.GURMENU_DESC,'SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
  COPY( MAIN_MENU_NAME,'SITE_MAP1.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
  COPY( '','SITE_MAP1.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
 	ITEM_NAME := 'SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
  SET_ITEM_PROPERTY(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WHDR');
  SET_ITEM_PROPERTY(ITEM_NAME,TOOLTIP_TEXT,:SITE_MAP1.GURMENU_DESC);
  SET_ITEM_PROPERTY(ITEM_NAME,NAVIGABLE,PROPERTY_TRUE);
--
  SELECT COUNT(*)
    INTO SUB_MENU_COUNT
    FROM GUTMENU,GUBOBJS
   WHERE GUTMENU_PRIOR_OBJ = MAIN_MENU_NAME
     AND GUTMENU_VALUE = GUBOBJS_NAME
     AND GUBOBJS_USER_ID = 'BASELINE';
--
  OPEN PRODUCT_DETAIL;
<<INNER>>
	FOR SUB_MENU_SEQ IN 1..SUB_MENU_COUNT LOOP
    FETCH PRODUCT_DETAIL INTO :SITE_MAP1.GURMENU_OBJ_NAME,
	                            :SITE_MAP1.GURMENU_DESC;  
--
	  EXIT INNER when sql%NotFound OR ITEM_SEQ = 40;
--
--  display child menu description, 
--    store child menu object name in DTL_OBJ,
--    and store parent menu object name in MAIN_OBJ
--  both object names are needed to nav to next page.
--
	 	ITEM_SEQ := ITEM_SEQ + 1;
	 	EXIT INNER when sql%NotFound;
--
	 	IF ITEM_SEQ = 40 THEN
      COPY(G$_NLS.Get('GUAGMNU-0033','FORM','Select to see more %01% on Menu',MAIN_MENU_DESC),
	            'SITE_MAP1.MAIN_DESC_' || TO_CHAR(ITEM_SEQ));
      COPY(MAIN_MENU_NAME,'SITE_MAP1.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
      COPY('','SITE_MAP1.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
 	    ITEM_NAME := 'SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
      SET_ITEM_PROPERTY(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WDTL');
      SET_ITEM_PROPERTY(ITEM_NAME,TOOLTIP_TEXT,
             G$_NLS.Get('GUAGMNU-0034','FORM','Select to see more %01% on Menu',MAIN_MENU_DESC));
      SET_ITEM_PROPERTY(ITEM_NAME,ENABLED,PROPERTY_TRUE);
      SET_ITEM_PROPERTY(ITEM_NAME,NAVIGABLE,PROPERTY_TRUE);
	 	ELSE
  	 	ITEM_NAME := 'SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
      SET_ITEM_PROPERTY(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WDTL');
	    COPY( :SITE_MAP1.GURMENU_DESC,'SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
  	  COPY( MAIN_MENU_NAME,'SITE_MAP1.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
	    COPY( :SITE_MAP1.GURMENU_OBJ_NAME,'SITE_MAP1.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	    SET_ITEM_PROPERTY(ITEM_NAME,TOOLTIP_TEXT,:SITE_MAP1.GURMENU_DESC);
	    SET_ITEM_PROPERTY(ITEM_NAME,ENABLED,PROPERTY_TRUE);
	    SET_ITEM_PROPERTY(ITEM_NAME,NAVIGABLE,PROPERTY_TRUE);
	  END IF;
	END LOOP INNER; 
	CLOSE PRODUCT_DETAIL;
<<PRODUCT_END>>
  NULL;
<<DISABLE_REST>>
	IF ITEM_SEQ <= 39 THEN
    IF ITEM_SEQ = 0 THEN
    	ITEM_SEQ := 1;
    END IF;
  	FOR SUB_MENU_SEQ IN ITEM_SEQ..39 LOOP
	  	ITEM_SEQ := ITEM_SEQ + 1;
	    COPY('','SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ));
	    COPY('','SITE_MAP1.MAIN_OBJ_'||TO_CHAR(ITEM_SEQ));
  	  COPY('','SITE_MAP1.DTL_OBJ_'||TO_CHAR(ITEM_SEQ));
	  	ITEM_NAME := 'SITE_MAP1.MAIN_DESC_'||TO_CHAR(ITEM_SEQ);
      SET_ITEM_PROPERTY(ITEM_NAME,VISUAL_ATTRIBUTE,'G$_NVA_SITEMAP_WDTL');
      SET_ITEM_PROPERTY(ITEM_NAME,TOOLTIP_TEXT,'');
      SET_ITEM_PROPERTY(ITEM_NAME,ENABLED,PROPERTY_FALSE);
	  END LOOP DISABLE_REST;
	END IF;
	--
	EXCEPTION
	  WHEN NO_DATA_FOUND THEN
		  NULL;
	  WHEN OTHERS THEN
	   -- MESSAGE('EXCEPTION SQLCODE SQLERRM='||SQLCODE||':'||SQLERRM);pause;
	      MESSAGE(G$_NLS.Get('GUAGMNU-0035','FORM','EXCEPTION SQLCODE SQLERRM=%01% : %02%',SQLCODE,SQLERRM));pause;
	   
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SITE_MAP1.POPULATE_SITE_MAP1
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POPULATE_SITE_MAP1")
		public void siteMap1_PopulateSiteMap1()
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
					String sqlpersonalMap = "SELECT GURMENU_OBJ_NAME, NVL(GURMENU_DESC, GUBOBJS_DESC) " +
	" FROM GURMENU, GUBOBJS " +
	" WHERE GURMENU_OBJ_NAME = GUBOBJS_NAME AND GURMENU_OBJ_NAME = '*PERSONAL' AND GURMENU_NAME = '*MAIN' ";
					DataCursor personalMap = new DataCursor(sqlpersonalMap);
					String sqlpersonalObjects = "SELECT GURMENU_OBJ_NAME, NVL(GURMENU_DESC, GUBOBJS_DESC) " +
	" FROM GURMENU, GUBOBJS " +
	" WHERE GURMENU_OBJ_NAME = GUBOBJS_NAME AND GURMENU_USER_ID = :GLOBAL_CURRENT_USER1 AND GURMENU_NAME = '*PERSONAL' " +
	" ORDER BY GURMENU_SORT_SEQ";
					DataCursor personalObjects = new DataCursor(sqlpersonalObjects);
					String sqlproductDetail = "SELECT GUTMENU_VALUE, DECODE(GUTMENU_DESC, 'NULL', GUBOBJS_DESC, GUTMENU_DESC) " +
	" FROM GUTMENU, GUBOBJS " +
	" WHERE GUTMENU_PRIOR_OBJ = :P_MAIN_MENU_NAME AND GUTMENU_VALUE = GUBOBJS_NAME AND GUBOBJS_USER_ID = 'BASELINE' " +
	" ORDER BY GUTMENU_SEQ_NO";
					DataCursor productDetail = new DataCursor(sqlproductDetail);
					String sqlmenuTop = "SELECT GUTMENU_VALUE, DECODE(GUTMENU_DESC, 'NULL', GUBOBJS_DESC, GUTMENU_DESC), ROWNUM " +
	" FROM GUTMENU, GUBOBJS " +
	" WHERE GUTMENU_LEVEL = 1 AND GUTMENU_VALUE = GUBOBJS_NAME AND GUTMENU_OBJT_CODE = 'MENU' AND GUTMENU_SEQ_NO = (SELECT MIN(GUTMENU_SEQ_NO) " +
		" FROM GUTMENU " +
		" WHERE GUTMENU_LEVEL = 1 AND GUTMENU_OBJT_CODE = 'MENU' ) ";
					DataCursor menuTop = new DataCursor(sqlmenuTop);
					try {
						try
						{
							itemSeq = toNumber(0);
							// PERSONAL_HEADER:;
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable personalMap.
							personalMap.open();
							ResultSet personalMapResults = personalMap.fetchInto();
							if ( personalMapResults != null ) {
								getFormModel().getSiteMap1().setGurmenuObjName(personalMapResults.getStr(0));
								getFormModel().getSiteMap1().setGurmenuDesc(personalMapResults.getStr(1));
							}
							// 
							if ( rowCount == 0 )
							{
								 //goto PRODUCT;
								// PRODUCT:;
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable menuTop.
							menuTop.open();
							ResultSet menuTopResults = menuTop.fetchInto();
							if ( menuTopResults != null ) {
								getFormModel().getSiteMap1().setGurmenuObjName(menuTopResults.getStr(0));
								getFormModel().getSiteMap1().setGurmenuDesc(menuTopResults.getStr(1));
								menuSeq = menuTopResults.getNumber(2);
							}
								
								
								
								
								
							}
							// 
							mainMenuName = getFormModel().getSiteMap1().getGurmenuObjName();
							mainMenuDesc = getFormModel().getSiteMap1().getGurmenuDesc();
							personalMap.close();
							// 
							//   display parent menu description, 
							//     store child menu object name - blank in this case - in DTL_OBJ,
							//     and store parent menu object name in MAIN_OBJ
							//   both object names are needed to nav to next page.
							// 
							itemSeq = itemSeq.add(1);
							copy(getFormModel().getSiteMap1().getGurmenuDesc(),toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq)));
							copy(mainMenuName,toStr("SITE_MAP1.MAIN_OBJ_").append(toChar(itemSeq)));
							copy("",toStr("SITE_MAP1.DTL_OBJ_").append(toChar(itemSeq)));
							itemName = toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq));
							setItemStyleClass(itemName, "G$_NVA_SITEMAP_WHDR");
							setItemToolTip(itemName, getFormModel().getSiteMap1().getGurmenuDesc());
							// 
							String sql1 = "SELECT COUNT(*) " +
	" FROM GURMENU " +
	" WHERE GURMENU_NAME = :P_MAIN_MENU_NAME AND GURMENU_USER_ID = :GLOBAL_CURRENT_USER1 ";
							DataCommand command1 = new DataCommand(sql1);
							//Setting query parameters
							command1.addParameter("P_MAIN_MENU_NAME", mainMenuName);
							command1.addParameter("GLOBAL_CURRENT_USER1", getGlobal("CURRENT_USER1"));
							ResultSet results1 = command1.executeQuery();
							rowCount = command1.getRowCount();
							if ( results1.hasData() ) {
								subMenuCount = results1.getNumber(0);
							}
							results1.close();
							// 
							if ( subMenuCount.equals(0) )
							{
								getFormModel().getSiteMap1().setGurmenuDesc(GNls.Fget(toStr("GUAGMNU-0027"), toStr("FORM"), toStr("Empty; Select to build.")));
								itemSeq = itemSeq.add(1);
								copy(getFormModel().getSiteMap1().getGurmenuDesc(),toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq)));
								copy(mainMenuName,toStr("SITE_MAP1.MAIN_OBJ_").append(toChar(itemSeq)));
								copy("GUAPMNU",toStr("SITE_MAP1.DTL_OBJ_").append(toChar(itemSeq)));
								itemName = toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq));
								setItemStyleClass(itemName, "G$_NVA_SITEMAP_WDTL");
								setItemToolTip(itemName, GNls.Fget(toStr("GUAGMNU-0028"), toStr("FORM"), toStr("Empty; Select to build.")));
								setItemNavigable(itemName, true);
								// goto BLANK_LINE;
								// BLANK_LINE:;
								//  insert blank line before next header
								itemSeq = itemSeq.add(1);
								copy("",toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq)));
								copy("",toStr("SITE_MAP1.MAIN_OBJ_").append(toChar(itemSeq)));
								copy("",toStr("SITE_MAP1.DTL_OBJ_").append(toChar(itemSeq)));
								itemName = toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq));
								setItemStyleClass(itemName, "G$_NVA_SITEMAP_WDTL");
								setItemToolTip(itemName, "");
								setItemEnabled(itemName, false);
								
								
								
							}
							// 
							//Setting query parameters
							personalObjects.addParameter("GLOBAL_CURRENT_USER1", getGlobal("CURRENT_USER1"));
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable personalObjects.
							personalObjects.open();
							// PERSONAL_DETAIL:;
							for ( subMenuSeq.equals( 1); subMenuSeq.lesserOrEquals(subMenuCount); subMenuSeq.add(1) )
							{
								ResultSet personalObjectsResults = personalObjects.fetchInto();
								if ( personalObjectsResults != null ) {
									getFormModel().getSiteMap1().setGurmenuObjName(personalObjectsResults.getStr(0));
									getFormModel().getSiteMap1().setGurmenuDesc(personalObjectsResults.getStr(1));
								}
								if ( rowCount == 0 || itemSeq.equals(17) ) 
									break;
								// 
								itemSeq = itemSeq.add(1);
								copy(getFormModel().getSiteMap1().getGurmenuDesc(),toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq)));
								copy(mainMenuName,toStr("SITE_MAP1.MAIN_OBJ_").append(toChar(itemSeq)));
								copy(getFormModel().getSiteMap1().getGurmenuObjName(),toStr("SITE_MAP1.DTL_OBJ_").append(toChar(itemSeq)));
								itemName = toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq));
								setItemStyleClass(itemName, "G$_NVA_SITEMAP_WDTL");
								setItemToolTip(itemName, getFormModel().getSiteMap1().getGurmenuDesc());
								setItemEnabled(itemName, true);
								setItemNavigable(itemName, true);
							}
							personalObjects.close();
							//  add row to link to GUAPMNU form to provide link to maintain 'My Banner'
							// 
							if ( subMenuCount.greater(0) )
							{
								getFormModel().getSiteMap1().setGurmenuDesc(GNls.Fget(toStr("GUAGMNU-0029"), toStr("FORM"), toStr("Organize My Banner")));
								itemSeq = itemSeq.add(1);
								copy(getFormModel().getSiteMap1().getGurmenuDesc(),toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq)));
								copy(mainMenuName,toStr("SITE_MAP1.MAIN_OBJ_").append(toChar(itemSeq)));
								copy("GUAPMNU",toStr("SITE_MAP1.DTL_OBJ_").append(toChar(itemSeq)));
								itemName = toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq));
								setItemStyleClass(itemName, "G$_NVA_SITEMAP_WDTL");
								setItemToolTip(itemName, GNls.Fget(toStr("GUAGMNU-0030"), toStr("FORM"), toStr("Organize My Banner")));
								setItemEnabled(itemName, true);
								setItemNavigable(itemName, true);
							}
							// ADD_TREE_LINK:;
							//  if needed on overflow: add link to TREE entry for My Banner
							if ( itemSeq.equals(18) )
							{
								itemSeq = itemSeq.add(1);
								copy(GNls.Fget(toStr("GUAGMNU-0031"), toStr("FORM"), toStr("Select to see more %01% on Menu"), mainMenuDesc),toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq)));
								copy(mainMenuName,toStr("SITE_MAP1.MAIN_OBJ_").append(toChar(itemSeq)));
								copy("",toStr("SITE_MAP1.DTL_OBJ_").append(toChar(itemSeq)));
								itemName = toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq));
								setItemStyleClass(itemName, "G$_NVA_SITEMAP_WDTL");
								setItemToolTip(itemName, GNls.Fget(toStr("GUAGMNU-0032"), toStr("FORM"), toStr("Select to see more %01% on Menu"), mainMenuDesc));
								setItemEnabled(itemName, true);
								setItemNavigable(itemName, true);
							}
						
							
							// 
							if ( this.getTask().getServices().isLast(menuSeq).getValue() )
							{
								getFormModel().getFormHeader().setLastSeq(toStr("Y"));
							}
							// 
							if ( menuTop.notFound() )
							{
								// goto PRODUCT_END;
								 //PRODUCT_END:;
								 //DISABLE_REST:;
								if ( itemSeq.lesserOrEquals(39) )
								{
									if ( itemSeq.equals(0) )
									{
										itemSeq = toNumber(1);
									}
									for (  subMenuSeq = itemSeq; subMenuSeq.toInt32() <= 39; subMenuSeq.add(1) )
									{
										itemSeq = itemSeq.add(1);
										copy("",toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq)));
										copy("",toStr("SITE_MAP1.MAIN_OBJ_").append(toChar(itemSeq)));
										copy("",toStr("SITE_MAP1.DTL_OBJ_").append(toChar(itemSeq)));
										itemName = toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq));
										setItemStyleClass(itemName, "G$_NVA_SITEMAP_WDTL");
										setItemToolTip(itemName, "");
										setItemEnabled(itemName, false);
									}
								 
								 
								 
							}
							// 
							menuTop.close();
							// 
							mainMenuName = getFormModel().getSiteMap1().getGurmenuObjName();
							mainMenuDesc = getFormModel().getSiteMap1().getGurmenuDesc();
							// 
							//   display parent menu description, 
							//     store child menu object name - blank in this case - in DTL_OBJ,
							//     and store parent menu object name in MAIN_OBJ
							//   both object names are needed to nav to next page.
							// 
							itemSeq = itemSeq.add(1);
							copy(getFormModel().getSiteMap1().getGurmenuDesc(),toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq)));
							copy(mainMenuName,toStr("SITE_MAP1.MAIN_OBJ_").append(toChar(itemSeq)));
							copy("",toStr("SITE_MAP1.DTL_OBJ_").append(toChar(itemSeq)));
							itemName = toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq));
							setItemStyleClass(itemName, "G$_NVA_SITEMAP_WHDR");
							setItemToolTip(itemName, getFormModel().getSiteMap1().getGurmenuDesc());
							setItemNavigable(itemName, true);
							// 
							String sql2 = "SELECT COUNT(*) " +
	" FROM GUTMENU, GUBOBJS " +
	" WHERE GUTMENU_PRIOR_OBJ = :P_MAIN_MENU_NAME AND GUTMENU_VALUE = GUBOBJS_NAME AND GUBOBJS_USER_ID = 'BASELINE' ";
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
							//Setting query parameters
							productDetail.addParameter("P_MAIN_MENU_NAME", mainMenuName);
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable productDetail.
							productDetail.open();
							// INNER:;
							for (  subMenuSeq.equals(1); subMenuSeq.lesserOrEquals(subMenuCount); subMenuSeq.add(1) )
							{
								ResultSet productDetailResults = productDetail.fetchInto();
								if ( productDetailResults != null ) {
									getFormModel().getSiteMap1().setGurmenuObjName(productDetailResults.getStr(0));
									getFormModel().getSiteMap1().setGurmenuDesc(productDetailResults.getStr(1));
								}
								// 
								if ( rowCount == 0 || itemSeq.equals(40) ) 
									break;
								// 
								//   display child menu description, 
								//     store child menu object name in DTL_OBJ,
								//     and store parent menu object name in MAIN_OBJ
								//   both object names are needed to nav to next page.
								// 
								itemSeq = itemSeq.add(1);
								if ( rowCount == 0 ) 
									break;
								// 
								if ( itemSeq.equals(40) )
								{
									copy(GNls.Fget(toStr("GUAGMNU-0033"), toStr("FORM"), toStr("Select to see more %01% on Menu"), mainMenuDesc),toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq)));
									copy(mainMenuName,toStr("SITE_MAP1.MAIN_OBJ_").append(toChar(itemSeq)));
									copy("",toStr("SITE_MAP1.DTL_OBJ_").append(toChar(itemSeq)));
									itemName = toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq));
									setItemStyleClass(itemName, "G$_NVA_SITEMAP_WDTL");
									setItemToolTip(itemName, GNls.Fget(toStr("GUAGMNU-0034"), toStr("FORM"), toStr("Select to see more %01% on Menu"), mainMenuDesc));
									setItemEnabled(itemName, true);
									setItemNavigable(itemName, true);
								}
								else {
									itemName = toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq));
									setItemStyleClass(itemName, "G$_NVA_SITEMAP_WDTL");
									copy(getFormModel().getSiteMap1().getGurmenuDesc(),toStr("SITE_MAP1.MAIN_DESC_").append(toChar(itemSeq)));
									copy(mainMenuName,toStr("SITE_MAP1.MAIN_OBJ_").append(toChar(itemSeq)));
									copy(getFormModel().getSiteMap1().getGurmenuObjName(),toStr("SITE_MAP1.DTL_OBJ_").append(toChar(itemSeq)));
									setItemToolTip(itemName, getFormModel().getSiteMap1().getGurmenuDesc());
									setItemEnabled(itemName, true);
									setItemNavigable(itemName, true);
								}
							}
							productDetail.close();
							
							}
						}
						catch(NoDataFoundException e)
						{
						}
						catch(Exception  e)
						{
							//  MESSAGE('EXCEPTION SQLCODE SQLERRM='||SQLCODE||':'||SQLERRM);pause;
							errorMessage(GNls.Fget(toStr("GUAGMNU-0035"), toStr("FORM"), toStr("EXCEPTION SQLCODE SQLERRM=%01% : %02%"), toStr(errorCode()), errorMessage()));
							// F2J_TO_REMOVE : Call to built-in "PAUSE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#ExcludePause".
							//							SupportClasses.SQLFORMS.Pause();
							this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'PAUSE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#ExcludePause'.");
							
							
						}
					}
					finally{
						personalMap.close();
						personalObjects.close();
						menuTop.close();
						productDetail.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SITE_MAP1.WHEN-NEW-ITEM-INSTANCE
		 SITEMAP_ADD_HIGHLIGHT;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SITE_MAP1.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", function=KeyFunction.ITEM_CHANGE)
		public void siteMap1_itemChange()
		{
			
				this.getTask().getServices().sitemapAddHighlight();
			}

		
		/* Original PL/SQL code code for TRIGGER SITE_MAP1.POST-TEXT-ITEM
		 SITEMAP_REMOVE_HIGHLIGHT;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SITE_MAP1.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", function=KeyFunction.ITEM_OUT)
		public void siteMap1_itemOut()
		{
			
				this.getTask().getServices().sitemapRemoveHighlight();
			}

		
		/* Original PL/SQL code code for TRIGGER SITE_MAP1.WHEN-MOUSE-DOUBLECLICK
		 SITEMAP_SELECTION;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SITE_MAP1.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void siteMap1_doubleClick()
		{
			
				this.getTask().getServices().sitemapSelection();
			}

		
		/* Original PL/SQL code code for TRIGGER SITE_MAP1.KEY-LISTVAL
		 SITEMAP_SELECTION;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SITE_MAP1.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void siteMap1_ListValues()
		{
			
				this.getTask().getServices().sitemapSelection();
			}

		
		/* Original PL/SQL code code for TRIGGER SITE_MAP1.KEY-PRVBLK
		 GO_ITEM('KEY_BLOCK.NEXT_SELECTION');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SITE_MAP1.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void siteMap1_PreviousBlock()
		{
			
				goItem(toStr("KEY_BLOCK.NEXT_SELECTION"));
			}

		
	
	
}

