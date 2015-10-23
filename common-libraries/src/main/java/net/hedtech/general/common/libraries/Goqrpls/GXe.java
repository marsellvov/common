package net.hedtech.general.common.libraries.Goqrpls;

import java.util.*;
import java.util.AbstractMap.SimpleEntry;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.core.utils.string.StringUtils;
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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.commands.CommandScope;
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

public class GXe extends AbstractSupportCodeObject {
	

	public GXe(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_XE
	/*
	PACKAGE G$_XE IS
  FUNCTION JSON(values_v VARCHAR2) RETURN VARCHAR2;
  PROCEDURE JSON_OUT(param VARCHAR2);
  --
  FUNCTION GET_MAX_SEQ(form_name VARCHAR2) RETURN NUMBER;
  
  PROCEDURE DELETE_BXE_FROM_CALL_STACK(form_name VARCHAR2);
  
  PROCEDURE FILL_GROUP_BXE_CALL(form_name VARCHAR2);
  
  FUNCTION IS_BXE_CALL_STACK_EMTY RETURN BOOLEAN; 
 -- 
  FUNCTION JSON_REQUEST_DIRTY_STATE(values_v VARCHAR2) RETURN VARCHAR2;
 --
  PROCEDURE JSON_DIRTY_STATUS(param VARCHAR2);
 --
  PROCEDURE JSON_CLEAN_STATUS(param VARCHAR2);
 --
  PROCEDURE GOTO_XE_MENU;
--
  PROCEDURE XE_CONTROLLER;
--
  PROCEDURE JSON_OPENED_FORM(form_name VARCHAR2);
--
  PROCEDURE JSON_CLOSED_FORM(form_name VARCHAR2);
-- -- -- --
-- -- -- --
  PROCEDURE SET_MENU_ITEMS(param NUMBER);
--
  PROCEDURE MENU_BROWSE_MAG;
  
  PROCEDURE MENU_OPEN_APP_MAG;
    
  PROCEDURE MENU_SEARCH_MAG;
  
  PROCEDURE MENU_SIGN_OUT_MAG;
  
  PROCEDURE MENU_HELP_MAG;
-- -- -- --
-- -- -- -- 
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_XE
		/*
		PACKAGE BODY G$_XE IS
  
FUNCTION JSON(values_v VARCHAR2) RETURN VARCHAR2 IS

hold_v varchar2(2000);
page varchar2(10);
globals varchar2(2000);
exp varchar2(2000);

begin

-- get the page

-- step 1

 hold_v := replace(values_v,'""','"NULL"'); 
 --hold_v := replace(values_v,'"');
 hold_v := replace(hold_v,'"');
 hold_v := replace(hold_v,'{');
 hold_v := replace(hold_v,'}');
 
-- get page
page := substr(hold_v,instr(hold_v,'page:') + 5,  7);

-- get globals
globals := substr(hold_v,instr(hold_v,'values:') + 7);

-- step 1

globals :=  replace(globals,':','::');

--step 2

globals :=  replace(globals,',','::');

--step 3

exp := '{'||page||'}'||globals;

--dbms_output.put_line(exp);

return exp;
  
END JSON;
--
PROCEDURE JSON_OUT(param VARCHAR2) IS
   LC$Token   VARCHAR2(100);
   i PLS_INTEGER := 1 ;
   LC$String VARCHAR2(2000) := param;
   messageOut varchar2(4000);
   global_context_found BOOLEAN := FALSE;
BEGIN
   messageOut	:= '{"type":"values","values": {'||'"';
   
   LOOP
      LC$Token := goknsut.f_split( LC$String, i , '|') ;
       EXIT WHEN LC$Token IS NULL ;
       --IF (gokgtrn.f_get_cntx_name_by_global8(LC$Token) IS NOT NULL AND NAME_IN('GLOBAL.'||LC$Token) IS NOT NULL) THEN
       	IF (gokgtrn.f_get_cntx_name_by_global8(LC$Token) IS NOT NULL) THEN
         messageOut := messageOut || gokgtrn.f_get_cntx_name_by_global8(LC$Token) || '": "' || NAME_IN('GLOBAL.'||LC$Token) || '","';
         global_context_found := TRUE;
       END IF;
       i := i + 1 ;
    END LOOP ;

    IF global_context_found THEN
      -- cut '"
      messageOut := substr(messageOut, 1, instr(messageOut,',"',-1) - 1);
      messageOut := messageOut ||  '}'|| '}';
      
      web.javascript_eval_expr('messageFromBannerOut('''||messageOut||''');');
    END IF;

   END JSON_OUT;
 --
 
 --
 --
  FUNCTION GET_MAX_SEQ(form_name VARCHAR2) RETURN NUMBER IS
    group_id        RECORDGROUP;
    hold_seq        PLS_INTEGER := 0;
    row_count       PLS_INTEGER;
    hold_form_name  VARCHAR2(7);
--
  BEGIN
    group_id := FIND_GROUP('BXE_CALL_GRP');
--
    IF NOT ID_NULL(group_id) THEN
      row_count := GET_GROUP_ROW_COUNT(group_id);  -- count number of records in array
--
      FOR i IN 1..row_count LOOP
        hold_form_name := GET_GROUP_CHAR_CELL('BXE_CALL_GRP.FORM_NAME', i);
--
        IF hold_form_name = form_name THEN
          hold_seq := GET_GROUP_NUMBER_CELL('BXE_CALL_GRP.SEQ', i);
        END IF;
      END LOOP;
--
    END IF;
--
    RETURN hold_seq;
  END GET_MAX_SEQ;
--
--

--
--
  PROCEDURE DELETE_BXE_FROM_CALL_STACK(form_name VARCHAR2) IS
    group_id  RECORDGROUP;
    max_seq   PLS_INTEGER;
--
  BEGIN
    group_id := FIND_GROUP('BXE_CALL_GRP');
--
    IF NOT ID_NULL(group_id) THEN
      max_seq := GET_MAX_SEQ(form_name);
      IF max_seq > 0 THEN
        DELETE_GROUP_ROW(group_id, max_seq);
      END IF;
    END IF;
  END DELETE_BXE_FROM_CALL_STACK;
--

--
  PROCEDURE FILL_GROUP_BXE_CALL(form_name VARCHAR2) IS
    group_id        RECORDGROUP;
    col_id          GROUPCOLUMN;
    row_count       PLS_INTEGER;
--
      BEGIN
--
-- Call this Procedure only when VPDI is ON
--
   <multilinecomment>
    IF NAME_IN('GLOBAL.INSTITUTION_CODE') IS NULL THEN
      RETURN;
    END IF;
   </multilinecomment>
--
   IF form_name NOT IN ('SOQMENU','GOQMENU') THEN
   	
    group_id := FIND_GROUP('BXE_CALL_GRP');
--
-- create new array
--
    IF ID_NULL(group_id) THEN
      group_id := CREATE_GROUP('BXE_CALL_GRP', GLOBAL_SCOPE);
      col_id := ADD_GROUP_COLUMN(group_id,'seq', NUMBER_COLUMN);
      col_id := ADD_GROUP_COLUMN(group_id,'form_name', CHAR_COLUMN, 10);
    END IF;
--
-- Get count of records in array and increment by one
--
    row_count := GET_GROUP_ROW_COUNT(group_id) + 1;  
    ADD_GROUP_ROW(group_id,row_count);
--
    SET_GROUP_NUMBER_CELL('BXE_CALL_GRP.SEQ',row_count, row_count);
    SET_GROUP_CHAR_CELL('BXE_CALL_GRP.FORM_NAME',row_count, form_name);
    
    END IF;
--
  END FILL_GROUP_BXE_CALL;
--
--

FUNCTION IS_BXE_CALL_STACK_EMTY RETURN BOOLEAN IS
   group_id        RECORDGROUP;
   row_count       PLS_INTEGER;
BEGIN

 group_id := FIND_GROUP('BXE_CALL_GRP');
--
-- create new array
--
   IF NOT ID_NULL(group_id) THEN
-- Get count of records in array and increment by one

    row_count := GET_GROUP_ROW_COUNT(group_id);

     IF row_count >1  THEN 
        RETURN FALSE;
     ELSE
        RETURN TRUE;
     END IF;
   ELSE
    RETURN TRUE;
   END IF;
      
   END IS_BXE_CALL_STACK_EMTY;
--   
FUNCTION JSON_REQUEST_DIRTY_STATE(values_v VARCHAR2) RETURN VARCHAR2 IS
   hold_v varchar2(2000);
begin
--	
 hold_v := replace(values_v,'"');
 hold_v := replace(hold_v,'{');
 hold_v := replace(hold_v,'}');
-- 
   --return substr(hold_v,instr(hold_v,'request:') + 8);
   return substr(hold_v, instr(hold_v,':dataState') + 1, 9);
--
END JSON_REQUEST_DIRTY_STATE;
--
PROCEDURE JSON_DIRTY_STATUS(param VARCHAR2) IS
   stateMessage varchar2(2000);
BEGIN
   stateMessage := '{"type": "dataState","state": [{"page": "' || param || '","state": "dirty"}]}';
--
   web.javascript_eval_expr('messageFromBannerDirtyStatus('''||stateMessage||''');');
--
END JSON_DIRTY_STATUS;
--
--
PROCEDURE JSON_CLEAN_STATUS(param VARCHAR2) IS
   stateMessage varchar2(2000);
BEGIN
   stateMessage := '{"type": "dataState","state": [{"page": "' || param || '","state": "clean"}]}';
--
   web.javascript_eval_expr('messageFromBannerDirtyStatus('''||stateMessage||''');');
--
END JSON_CLEAN_STATUS;
--
--
PROCEDURE GOTO_XE_MENU IS
BEGIN
--
DEFAULT_VALUE('N','GLOBAL.BANNER_XE_MODE');
IF NAME_IN('GLOBAL.BANNER_XE_MODE') = 'Y' THEN
  web.javascript_eval_expr('messageFromBannerBrowseMainMenu();');
ELSE
  G$_INVALID_FUNCTION_MSG;
END IF;
--
END GOTO_XE_MENU;
--
--
PROCEDURE XE_CONTROLLER IS
--
  eventName         VARCHAR2(30) := UPPER(NAME_IN('system.javascript_event_name'));
  eventValue        VARCHAR2(2000) := NAME_IN('system.javascript_event_value');
--
  lv_global_name    VARCHAR2(30);
  lv_global_name_c  VARCHAR2(30);
  lv_global_value   VARCHAR2(200);
  lv_parm_value     VARCHAR2(2000);
  form_name         VARCHAR2(10);
  args varchar2(2000);
--  
  messageOut varchar2(2000); 
  trans varchar2(2000);
--  
  FORM_ID FORMMODULE;
-- 
  ALERT_BUT NUMBER;
--
  dirty_status VARCHAR2(10);
BEGIN
--
   IF (eventName = 'NAVIGATE') then
--  
   	   trans := G$_XE.JSON(eventValue);
--   	        	
       form_name := substr(trans, instr(trans,'{')+ 1, instr(trans,'}') - 2);
--      
	     args := substr(trans, instr(trans,'}') + 1);
--	  		
--	  		
	      if (args IS NOT NULL) THEN
	  		     lv_parm_value := LTRIM(RTRIM(args,'::'),'::');
--	  		
	  		     lv_global_name := Genutil.Fstrtok(lv_parm_value,'::');
--	  
	 			     lv_global_name_c  := gokgtrn.f_get_banner8_global_name( lv_global_name );
--	 
  				LOOP
  							lv_global_value := Genutil.Fstrtok('','::');
  							IF lv_global_value != 'NULL' THEN
    						   COPY(lv_global_value,('GLOBAL.' || lv_global_name_c));
    						END IF;
--    						
    						lv_global_name := Genutil.Fstrtok('','::');
--
  							lv_global_name_c  := gokgtrn.f_get_banner8_global_name( lv_global_name );
  							EXIT WHEN lv_global_name IS NULL;
--  	
  				END LOOP;
  			end if;
--  				
  	  FORM_ID := FIND_FORM(form_name);
--
     IF (NOT ID_NULL(FORM_ID) AND NAME_IN('SYSTEM.CURRENT_FORM') <> form_name) THEN
     	  --
        -- Check for pending changes in the block and don't invoke if there are any.
        --
              IF NAME_IN('SYSTEM.FORM_STATUS') = 'CHANGED' THEN
                MESSAGE(G$_NLS.Get('GOQRPLS-0189','LIB','*ERROR* There are pending form changes; Commit or Rollback.'));
                RAISE FORM_TRIGGER_FAILURE;
              END IF;
     	
     	
     	      -- Alert
     	      ALERT_BUT := G$_DISPLAY_ALERT('G$_WARNING_ALERT', G$_NLS.Get('GOQRPLS-0190','LIB','All active INB forms will be closed in order to navigate to this form.'));
     	      COPY(form_name, 'GLOBAL.BANNER_XE');
            DO_KEY('EXIT_FORM');
      ELSE
         IF NAME_IN('SYSTEM.CURRENT_FORM') <> form_name THEN
         	
         	--
          -- Check for pending changes in the block and don't invoke if there are any.
          --
             IF NAME_IN('SYSTEM.FORM_STATUS') = 'CHANGED' THEN
                MESSAGE(G$_NLS.Get('GOQRPLS-0191','LIB','*ERROR* There are pending form changes; Commit or Rollback.'));
                RAISE FORM_TRIGGER_FAILURE;
             END IF;
           --
           --
           COPY('Y','GLOBAL.NAV_FRAME_CALL');
           G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),form_name,'');
         END IF;
     END IF;
--
  ELSIF (eventName = 'REQUEST' and eventValue = 'exit-banner') THEN
--     
-- -- --
      COPY('Y','GLOBAL.EXIT_BANNER');   	
      set_form_property(NAME_IN('system.current_form'),validation,property_false);
      exit_form(no_validate);
-- 
  ELSIF (eventName = 'REQUEST') THEN
     	  IF (G$_XE.JSON_REQUEST_DIRTY_STATE(eventValue) = 'dataState') THEN
     	  	--     	  	
     	  	   IF NAME_IN('SYSTEM.CURRENT_FORM') = 'SPAIDEN' THEN 
     	  	   	    NEXT_ITEM;
     	  	   	    PREVIOUS_ITEM;
     	  	   END IF;
     	  	   
     	  	   dirty_status := G$_XE_STATE_MANAGER.CHECK_ME;
     	  	  --MESSAGE('STATUS: ' || G$_XE_STATE_MANAGER.CHECK_ME);
     	  	--
     	  	<multilinecomment>
     	  	  IF NAME_IN('SYSTEM.FORM_STATUS') = 'CHANGED' THEN
     	  	  	  --G$_XE.JSON_DIRTY_STATUS('dirty');
     	  	  	    G$_XE.JSON_DIRTY_STATUS(NAME_IN('system.current_form'));
     	  	  ELSE
     	  	  	--	G$_XE.JSON_DIRTY_STATUS('clean');
     	  	  	    G$_XE.JSON_CLEAN_STATUS(NAME_IN('system.current_form'));
     	  	  END IF;
     	  	  </multilinecomment>
     	  	  
     	  	  IF dirty_status = 'Y' THEN
     	  	  	  --G$_XE.JSON_DIRTY_STATUS('dirty');
     	  	  	    G$_XE.JSON_DIRTY_STATUS(NAME_IN('system.current_form'));
     	  	  ELSE
     	  	  	--	G$_XE.JSON_DIRTY_STATUS('clean');
     	  	  	    G$_XE.JSON_CLEAN_STATUS(NAME_IN('system.current_form'));
     	  	  END IF;
     	  END IF;    
     	  	  END IF;
--
END XE_CONTROLLER;
--
PROCEDURE JSON_OPENED_FORM(form_name VARCHAR2) IS
   param varchar2(4000);
BEGIN
--
  IF NAME_IN('GLOBAL.BANNER_XE_MODE') = 'Y' THEN
    IF (NAME_IN('SYSTEM.CURRENT_FORM') NOT IN ('FOQMENU','SOQMENU','TOQMENU','AOQMEMU','GOQMENU','ROQMENU','NOQMENU','POQMENU')) THEN
      param := 'opened:'||form_name;  	  	
      web.javascript_eval_expr('messageFromBannerOpenedForm('''||param||''');');
    END IF;
  END IF;
--
END JSON_OPENED_FORM;
--
--
PROCEDURE JSON_CLOSED_FORM(form_name VARCHAR2) IS
   param varchar2(4000);
BEGIN
   	
 IF (NAME_IN('SYSTEM.CURRENT_FORM') NOT IN ('FOQMENU','SOQMENU','TOQMENU','AOQMEMU','GOQMENU','ROQMENU','NOQMENU','POQMENU')) THEN
       param := 'closed:'||form_name;
     	  	  	
       web.javascript_eval_expr('messageFromBannerClosedForm('''||param||''');');
 END IF;
--
--
END JSON_CLOSED_FORM;
--
--
-- -- -- --
-- -- -- --
PROCEDURE SET_MENU_ITEMS(param NUMBER) IS
-- param = 0 is off.  will set menu item displays off
-- param = 1 is on.  will set menu item displays on
--
BEGIN
  IF param = 0 THEN
    SET_MENU_ITEM_PROPERTY('Action.BROWSE_MAG',   VISIBLE  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Action.SEP01_MAG',    VISIBLE  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Action.SEP02_MAG',    VISIBLE  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Action.OPEN_APP_MAG', VISIBLE  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Action.SEARCH_MAG',   VISIBLE  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Action.SIGN_OUT_MAG', VISIBLE  ,PROPERTY_FALSE);
    SET_MENU_ITEM_PROPERTY('Help.HELP_MAG',       VISIBLE  ,PROPERTY_FALSE);
  ELSE
    SET_MENU_ITEM_PROPERTY('Action.BROWSE_MAG',   VISIBLE  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Action.SEP01_MAG',    VISIBLE  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Action.SEP02_MAG',    VISIBLE  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Action.OPEN_APP_MAG', VISIBLE  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Action.SEARCH_MAG',   VISIBLE  ,PROPERTY_TRUE);
    SET_MENU_ITEM_PROPERTY('Action.SIGN_OUT_MAG', VISIBLE  ,PROPERTY_TRUE);
-- --    SET_MENU_ITEM_PROPERTY('Help.HELP_MAG',       VISIBLE  ,PROPERTY_TRUE);
-- unified menu help was disabled with initial release. Has been softly remove from mmb with following line.
    SET_MENU_ITEM_PROPERTY('Help.HELP_MAG',       VISIBLE  ,PROPERTY_FALSE);
  END IF; 	
END SET_MENU_ITEMS;
--
PROCEDURE MENU_BROWSE_MAG IS
BEGIN
-- expr function is defined in configured js (java script file) as indicated in Forms base.html being used.
-- That function contains java call that invokes the unified menu Browse function
  web.javascript_eval_expr('messageFromBannerBrowseMainMenu();');
--
END MENU_BROWSE_MAG;
  
PROCEDURE MENU_OPEN_APP_MAG IS
BEGIN
-- expr function is defined in configured js (java script file) as indicated in Forms base.html being used.
-- That function contains java call that invokes the unified menu Open Application function
  web.javascript_eval_expr('messageFromBannerOpenAppMainMenu();');
--
END MENU_OPEN_APP_MAG;
  
PROCEDURE MENU_SEARCH_MAG IS
BEGIN	
-- expr function is defined in configured js (java script file) as indicated in Forms base.html being used.
-- That function contains java call that invokes the unified menu Search function
  web.javascript_eval_expr('messageFromBannerSearchMainMenu();');
--
END MENU_SEARCH_MAG;

PROCEDURE MENU_SIGN_OUT_MAG IS
BEGIN
-- expr function is defined in configured js (java script file) as indicated in Forms base.html being used.
-- That function contains java call that invokes the unified Sign Out function
  web.javascript_eval_expr('messageFromBannerSignOut();');
--
END MENU_SIGN_OUT_MAG;

PROCEDURE MENU_HELP_MAG IS
BEGIN
-- expr function is defined in configured js (java script file) as indicated in Forms base.html being used.
-- That function contains java call that invokes the unified menu Help function
  web.javascript_eval_expr('messageFromBannerHelpMainMenu();');
--
END MENU_HELP_MAG;
-- -- -- --
-- -- -- --
END G$_XE;
		*/
		/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param valuesV
		*/
		public class GXeArgs {
			public NString page;
			public NString values;
			public Hashtable<String, String> parameters;
			
			public GXeArgs(){
				parameters = new Hashtable<String, String>();
			}
		}
	
	
		public GXeArgs json(NString valuesV)
		{
			NString holdV= NString.getNull();
			NString globals= NString.getNull();
			GXeArgs exp= new GXeArgs();
			//  get the page
			//  step 1
			holdV = replace(valuesV, "\"\"", "\"NULL\"");
			// hold_v := replace(values_v,'"');
			holdV = replace(holdV, "\"");
			holdV = replace(holdV, "{");
			holdV = replace(holdV, "}");
			//  get page
			if ( holdV.contains("page:") )
				exp.page = substring(holdV, inStr(holdV, toStr("page:")).add(5), toInt(7));
			//  get globals
			holdV = substring(holdV, inStr(holdV, toStr("values:")).add(7));
			if ( holdV.contains("parameters:") ){
				try {
					NString parameters = substring(holdV, inStr(holdV, toStr("parameters:")).add(11));
					for(String param : parameters.split(',')){
						String[] parts = param.split(":");
						exp.parameters.put(parts[0].trim(), parts[1].trim());
					}
				} catch (Exception e) {
				}
				globals = substring(holdV,  1,  inStr(holdV, toStr("parameters:")).subtract(1));
			}
			else
				globals = holdV;
			//  step 1
			globals = replace(globals, ":", "::");
			// step 2
			globals = replace(globals, ",", "::");
			exp.values = toStr("{").append(exp.page).append("}").append(globals);
			// step 3
//			exp = toStr("{").append(page).append("}").append(globals);
			// dbms_output.put_line(exp);
			return exp;
		}
		
		
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param param
		*/
		public void jsonOut(NString param)
		{
			NString lcToken= NString.getNull();
			NInteger i = toInt(1);
			NString lcString = param;
			NString messageout= NString.getNull();
			NBool globalContextFound = toBool(NBool.False);
			messageout = toStr("{\"type\":\"values\",\"values\": {").append("\"");
			while (true) {
				lcToken = Goknsut.fSplit(lcString, i, toStr("|"));
				if ( lcToken.isNull() ) 
					break;
				// IF (gokgtrn.f_get_cntx_name_by_global8(LC$Token) IS NOT NULL AND NAME_IN('GLOBAL.'||LC$Token) IS NOT NULL) THEN
				if ((!Gokgtrn.fGetCntxNameByGlobal8(lcToken).isNull()))
				{
					messageout = messageout.append(Gokgtrn.fGetCntxNameByGlobal8(lcToken)).append("\": \"").append(getNameIn(toStr("GLOBAL.").append(lcToken))).append("\",\"");
					globalContextFound = toBool(NBool.True);
				}
				i = i.add(1);
			}
			if ( globalContextFound.getValue() )
			{
				//  cut '"
				messageout = substring(messageout, toInt(1), inStr(messageout, toStr(",\""), - (1)).subtract(1));
				messageout = messageout.append("}").append("}");
				TaskServices.addGenericCommand("XE", CommandScope.Global, new SimpleEntry<String, String>("COMMAND", toStr("messageFromBannerOut('").append(messageout).append("');").getValue()));
			}
		}
/* <p>
		* 
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formName
		*/
		public NNumber getMaxSeq(NString formName)
		{
			ValueSet groupId= null;
			NInteger holdSeq = toInt(0);
			int rowCount= 0;
			NString holdFormName= NString.getNull();
			groupId = findGroup("BXE_CALL_GRP");
			// 
			if ( !(groupId == null) )
			{
				rowCount = getGroupRowCount(groupId);
				//  count number of records in array
				// 
				for ( int i = 1; i <= rowCount; i++ )
				{
					holdFormName = getGroupCharCell("BXE_CALL_GRP.FORM_NAME", i);
					// 
					if ( holdFormName.equals(formName) )
					{
						holdSeq = toInt(getGroupNumberCell("BXE_CALL_GRP.SEQ", i));
					}
				}
			}
			// 
			return toNumber(holdSeq);
		}
/* <p>
		* 
		* 
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formName
		*/
		public void deleteBxeFromCallStack(NString formName)
		{
			ValueSet groupId= null;
			NInteger maxSeq= NInteger.getNull();
			groupId = findGroup("BXE_CALL_GRP");
			// 
			if ( !(groupId == null) )
			{
				maxSeq = toInt(getMaxSeq(formName));
				if ( maxSeq.greater(0) )
				{
					deleteGroupRow(groupId, maxSeq);
				}
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formName
		*/
		public void fillGroupBxeCall(NString formName)
		{
			ValueSet groupId= null;
			ValueSetColumn colId= null;
			int rowCount= -1;
			// 
			//  Call this Procedure only when VPDI is ON
			// 
			// IF NAME_IN('GLOBAL.INSTITUTION_CODE') IS NULL THEN
			// RETURN;
			// END IF;
			// 
			if ( !in(formName, "SOQMENU", "GOQMENU").getValue() )
			{
				groupId = findGroup("BXE_CALL_GRP");
				// 
				//  create new array
				// 
				if ( (groupId == null) )
				{
					//MORPHIS: TODO Support record groups at a global scope
					//groupId = createGroup("BXE_CALL_GRP", SupportClasses.Constants.GLOBAL_SCOPE);
					groupId = createGroup("BXE_CALL_GRP");
					colId = addGroupColumn(groupId, "seq", ValueSetColumn.NUMBER_COL);
					colId = addGroupColumn(groupId, "form_name", ValueSetColumn.CHAR_COL, 10);
				}
				// 
				//  Get count of records in array and increment by one
				// 
				rowCount = getGroupRowCount(groupId) + 1;
				//WARNING: only adding rows at the end is supported
				addGroupRow(groupId);
				// 
				setGroupNumberCell("BXE_CALL_GRP.SEQ", toInt(rowCount), toNumber(rowCount));
				setGroupCharCell("BXE_CALL_GRP.FORM_NAME", rowCount, formName);
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isBxeCallStackEmty()
		{
			ValueSet groupId= null;
			int rowCount= -1;
			groupId = findGroup("BXE_CALL_GRP");
			// 
			//  create new array
			// 
			if ( !(groupId == null) )
			{
				//  Get count of records in array and increment by one
				rowCount = getGroupRowCount(groupId);
				if ( rowCount > 1 )
				{
					return  toBool(NBool.False);
				}
				else {
					return  toBool(NBool.True);
				}
			}
			else {
				return  toBool(NBool.True);
			}
		}
/* <p>
		*    
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param valuesV
		*/
		public NString jsonRequestDirtyState(NString valuesV)
		{
			NString holdV= NString.getNull();
			// 	
			holdV = replace(valuesV, "\"");
			holdV = replace(holdV, "{");
			holdV = replace(holdV, "}");
			//  
			// return substr(hold_v,instr(hold_v,'request:') + 8);
			return substring(holdV, inStr(holdV, toStr(":dataState")).add(1), toInt(9));
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param param
		*/
		public void jsonDirtyStatus(NString param)
		{
			NString statemessage= NString.getNull();
			statemessage = toStr("{\"type\": \"dataState\",\"state\": [{\"page\": \"").append(param).append("\",\"state\": \"dirty\"}]}");
			// 
			TaskServices.addGenericCommand("XE", CommandScope.Global, new SimpleEntry<String, String>("COMMAND", toStr("messageFromBannerDirtyStatus('").append(statemessage).append("');").getValue()));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param param
		*/
		public void jsonCleanStatus(NString param)
		{
			NString statemessage= NString.getNull();
			statemessage = toStr("{\"type\": \"dataState\",\"state\": [{\"page\": \"").append(param).append("\",\"state\": \"clean\"}]}");
			// 
			TaskServices.addGenericCommand("XE", CommandScope.Global, new SimpleEntry<String, String>("COMMAND", toStr("messageFromBannerDirtyStatus('").append(statemessage).append("');").getValue()));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gotoXeMenu()
		{
			// 
			setDefaultValue("N", "GLOBAL.BANNER_XE_MODE");
			if ( getNameIn("GLOBAL.BANNER_XE_MODE").equals("Y") )
			{
				TaskServices.addGenericCommand("XE", CommandScope.Global, new SimpleEntry<String, String>("COMMAND", "messageFromBannerBrowseMainMenu();"));
				
			}
			else {
				getContainer().gInvalidFunctionMsg();
			}
		}
/* <p>
		* 
		* 
/* </p>
		*/
		public void xeController(NString eventname, NString eventvalue)
		{
		 
			
			// 
			NString lvGlobalName= NString.getNull();
			NString lvGlobalNameC= NString.getNull();
			NString lvGlobalValue= NString.getNull();
			NString lvParmValue= NString.getNull();
			NString formName= NString.getNull();
			NString args= NString.getNull();
			//   
			NString messageout= NString.getNull();
			GXeArgs trans= null;
			//   
			ITask formId = null;
			//  
			NNumber alertBut= NNumber.getNull();
			// 
			NString dirtyStatus= NString.getNull();
			// 
			if ((eventname.equals("NAVIGATE")))
			{
				//   
				trans = json(eventvalue);
				//    	        	
				formName = trans.page;
				//       
				args = trans.values;
				// 	  		
				// 	  		
				if ((!args.isNull()))
				{
					lvParmValue = ltrim(rtrim(args, "::"), "::");
					// 	  		
					lvGlobalName = Genutil.Fstrtok(lvParmValue, toStr("::"));
					// 	  
					lvGlobalNameC = Gokgtrn.fGetBanner8GlobalName(lvGlobalName);
					// 	 
					while (true) {
						lvGlobalValue = Genutil.Fstrtok(toStr(""), toStr("::"));
						if ( lvGlobalValue.notEquals("NULL") )
						{
							copy(lvGlobalValue,((toStr("GLOBAL.").append(lvGlobalNameC))));
						}
						//     						
						lvGlobalName = Genutil.Fstrtok(toStr(""), toStr("::"));
						// 
						lvGlobalNameC = Gokgtrn.fGetBanner8GlobalName(lvGlobalName);
						if ( lvGlobalName.isNull() ) 
							break;
					}
				}
				//   				
				formId = findTask(formName);
				// 
				if ((!(formId == null) && getCurrentTaskName().notEquals(formName)))
				{
					// 
					//  Check for pending changes in the block and don't invoke if there are any.
					// 
					if ( getTaskStatus().equals("CHANGED") )
					{
						errorMessage(GNls.Fget(toStr("GOQRPLS-0189"), toStr("LIB"), toStr("*ERROR* There are pending form changes; Commit or Rollback.")));
						throw new ApplicationException();
					}
					//  Alert
					alertBut = getContainer().gDisplayAlert(toStr("G$_WARNING_ALERT"), GNls.Fget(toStr("GOQRPLS-0190"), toStr("LIB"), toStr("All active INB forms will be closed in order to navigate to this form.")));
					copy(formName,"GLOBAL.BANNER_XE");
					executeAction("EXIT");
				}
				else {
					if ( getCurrentTaskName().notEquals(formName) )
					{
						// 
						//  Check for pending changes in the block and don't invoke if there are any.
						// 
						//MORPHIS: Preventing menu navigation to other form when there are changes is removed
						//similar to the changes done in Banner XE
						/*
						if ( getTaskStatus().equals("CHANGED") )
						{
							errorMessage(GNls.Fget(toStr("GOQRPLS-0191"), toStr("LIB"), toStr(" There are pending form changes; Commit or Rollback.")));
							throw new ApplicationException();
						}
						*/
						// 
						// 
						copy("Y","GLOBAL.NAV_FRAME_CALL");
						getContainer().gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), formName, toStr(""), trans.parameters);
					}
				}
			}
			else if ((eventname.equals("REQUEST") && eventvalue.equals("exit-banner"))) {
				//      
				//  -- --
				copy("Y","GLOBAL.EXIT_BANNER");
				// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
				//				SupportClasses.FORMS40.SetFormProperty(getCurrentTaskName(), SupportClasses.Property.VALIDATION, false);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
				
				
				ITask wsTask = TaskServices.getWorkspaceTask();
				exitTask(wsTask, TaskServices.NO_VALIDATE);
			}
			else if ((eventname.equals("REQUEST"))) {
				if ((jsonRequestDirtyState(eventvalue).equals("dataState")))
				{
					//      	  	
					if ( getCurrentTaskName().equals("SPAIDEN") )
					{
						nextItem();
						previousItem();
					}
					dirtyStatus = getContainer().getGXeStateManager().checkMe();
					// MESSAGE('STATUS: ' || G$_XE_STATE_MANAGER.CHECK_ME);
					// 
					// IF NAME_IN('SYSTEM.FORM_STATUS') = 'CHANGED' THEN
					// --G$_XE.JSON_DIRTY_STATUS('dirty');
					// G$_XE.JSON_DIRTY_STATUS(NAME_IN('system.current_form'));
					// ELSE
					// --	G$_XE.JSON_DIRTY_STATUS('clean');
					// G$_XE.JSON_CLEAN_STATUS(NAME_IN('system.current_form'));
					// END IF;
					if ( dirtyStatus.equals("Y") )
					{
						// G$_XE.JSON_DIRTY_STATUS('dirty');
						jsonDirtyStatus(getCurrentTaskName());
					}
					else {
						// 	G$_XE.JSON_DIRTY_STATUS('clean');
						jsonCleanStatus(getCurrentTaskName());
					}
				}
			}
		}
		
		
		private NString jsonNormalize(NString valuesV) {
			NString holdV= NString.getNull();
			
			holdV = replace(valuesV, "\"\"", "\"NULL\"");
			// hold_v := replace(values_v,'"');
			holdV = replace(holdV, "\"");
			holdV = replace(holdV, "{");
			holdV = replace(holdV, "}");
			
			return holdV;
		}
		
		private Map<String,String> jsonGetArgs(NString valuesV)
		{
			NString holdV= NString.getNull();
			//  step 1
			holdV = jsonNormalize(valuesV);

			Map<String,String> values = new HashMap<String,String>();
			String[] parts = holdV.getValue().split(",");
			for(String s : parts) {
				String key = StringUtils.substringBefore(s, ":");
				String val = StringUtils.substringAfter(s, ":");
				values.put(key, val);
			}
			
			return values;
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formName
		*/
		public void jsonOpenedForm(NString formName)
		{
			NString param= NString.getNull();
			// 
			if ( getNameIn("GLOBAL.BANNER_XE_MODE").equals("Y") )
			{
				if ((!in(getCurrentTaskName(), "FOQMENU", "SOQMENU", "TOQMENU", "AOQMEMU", "GOQMENU", "ROQMENU", "NOQMENU", "POQMENU").getValue()))
				{
					param = toStr("opened:").append(formName);
					TaskServices.addGenericCommand("XE", CommandScope.Global, new SimpleEntry<String, String>("COMMAND", toStr("messageFromBannerOpenedForm('").append(param).append("');").getValue()));
				}
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formName
		*/
		public void jsonClosedForm(NString formName)
		{
			NString param= NString.getNull();
			if ((!in(getCurrentTaskName(), "FOQMENU", "SOQMENU", "TOQMENU", "AOQMEMU", "GOQMENU", "ROQMENU", "NOQMENU", "POQMENU").getValue()))
			{
				param = toStr("closed:").append(formName);
				TaskServices.addGenericCommand("XE", CommandScope.Global, new SimpleEntry<String, String>("COMMAND", toStr("messageFromBannerClosedForm('").append(param).append("');").getValue()));
			}
		}
/* <p>
		* 
		* 
		*  -- -- --
		*  -- -- --
/* </p>
		* @param param
		*/
		public void setMenuItems(NNumber param)
		{
			if ( param.equals(0) )
			{
				setMenuItemVisible("Action.BROWSE_MAG", false);
				setMenuItemVisible("Action.SEP01_MAG", false);
				setMenuItemVisible("Action.SEP02_MAG", false);
				setMenuItemVisible("Action.OPEN_APP_MAG", false);
				setMenuItemVisible("Action.SEARCH_MAG", false);
				setMenuItemVisible("Action.SIGN_OUT_MAG", false);
				setMenuItemVisible("Help.HELP_MAG", false);
			}
			else {
				setMenuItemVisible("Action.BROWSE_MAG", true);
				setMenuItemVisible("Action.SEP01_MAG", true);
				setMenuItemVisible("Action.SEP02_MAG", true);
				setMenuItemVisible("Action.OPEN_APP_MAG", true);
				setMenuItemVisible("Action.SEARCH_MAG", true);
				setMenuItemVisible("Action.SIGN_OUT_MAG", true);
				//  --    SET_MENU_ITEM_PROPERTY('Help.HELP_MAG',       VISIBLE  ,PROPERTY_TRUE);
				//  unified menu help was disabled with initial release. Has been softly remove from mmb with following line.
				setMenuItemVisible("Help.HELP_MAG", false);
			}
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void menuBrowseMag()
		{
			//  expr function is defined in configured js (java script file) as indicated in Forms base.html being used.
			//  That function contains java call that invokes the unified menu Browse function
			
			TaskServices.addGenericCommand("XE", CommandScope.Global, new SimpleEntry<String, String>("COMMAND", "messageFromBannerBrowseMainMenu();"));
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void menuOpenAppMag()
		{
			//  expr function is defined in configured js (java script file) as indicated in Forms base.html being used.
			//  That function contains java call that invokes the unified menu Open Application function
			
			TaskServices.addGenericCommand("XE", CommandScope.Global, new SimpleEntry<String, String>("COMMAND", "messageFromBannerOpenAppMainMenu();"));
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void menuSearchMag()
		{
			//  expr function is defined in configured js (java script file) as indicated in Forms base.html being used.
			//  That function contains java call that invokes the unified menu Search function
			
			TaskServices.addGenericCommand("XE", CommandScope.Global, new SimpleEntry<String, String>("COMMAND", "messageFromBannerSearchMainMenu();"));
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void menuSignOutMag()
		{
			//  expr function is defined in configured js (java script file) as indicated in Forms base.html being used.
			//  That function contains java call that invokes the unified Sign Out function
			
			TaskServices.addGenericCommand("XE", CommandScope.Global, new SimpleEntry<String, String>("COMMAND", "messageFromBannerSignOut();"));
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void menuHelpMag()
		{
			//  expr function is defined in configured js (java script file) as indicated in Forms base.html being used.
			//  That function contains java call that invokes the unified menu Help function
			
			TaskServices.addGenericCommand("XE", CommandScope.Global, new SimpleEntry<String, String>("COMMAND", "messageFromBannerHelpMainMenu();"));
		}
		
		
	
	
}
