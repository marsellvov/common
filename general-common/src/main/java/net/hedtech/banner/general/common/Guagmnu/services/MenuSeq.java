package net.hedtech.banner.general.common.Guagmnu.services;

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

import net.hedtech.banner.general.common.Guagmnu.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.general.common.Guagmnu.model.*;

public class MenuSeq extends AbstractSupportCodeObject {
	

	public MenuSeq(ISupportCodeContainer container) {
		super(container);
	}

	public GuagmnuTask  getTask() {
		return (GuagmnuTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Guagmnu.model.GuagmnuModel getFormModel() {
		return getTask().getModel();
	}
	
	//Original PL/SQL code for Package Prog Unit (SPEC) MENU_SEQ
	/*
	PACKAGE menu_seq IS
  PROCEDURE set_seq;
  FUNCTION get_seq RETURN NUMBER;
--
  last_seq BOOLEAN := FALSE;
END;
	*/
			// 
		public NBool lastSeq = toBool(NBool.False);

			
		//Original PL/SQL code for Package Prog Unit (BODY) MENU_SEQ
		/*
		PACKAGE BODY MENU_SEQ IS
--
  PROCEDURE set_seq IS
    rg_name VARCHAR2(15) := 'SEQ'; 
    rg_id   RECORDGROUP; 
    gc_id   GROUPCOLUMN;
    count_v PLS_INTEGER := 0;
--
   CURSOR get_seq IS
     SELECT GURMENU_SORT_SEQ 
       FROM GURMENU
      WHERE GURMENU_NAME = '*MENU'
        AND GURMENU_USER_ID = 'BASELINE'
        AND EXISTS
             (SELECT GUTMENU_VALUE
                FROM GUTMENU
               WHERE GUTMENU_VALUE = GURMENU_OBJ_NAME
                 AND GUTMENU_LEVEL = 1)
               ORDER BY GURMENU_SORT_SEQ;
--
  BEGIN 
    :last_seq := '';
--
    rg_id := FIND_GROUP(rg_name);
    IF ID_NULL(rg_id) THEN 
      rg_id := CREATE_GROUP(rg_name); 
      gc_id := ADD_GROUP_COLUMN(rg_id, 'NumCol', NUMBER_COLUMN);
      gc_id := ADD_GROUP_COLUMN(rg_id, 'SeqCol', NUMBER_COLUMN); 
    ELSE
      DELETE_GROUP_ROW(rg_name , ALL_ROWS); 
    END IF; 
--
    FOR i IN get_seq LOOP 
      count_v := count_v + 1;
      ADD_GROUP_ROW(rg_id, END_OF_GROUP);
      SET_GROUP_NUMBER_CELL('SEQ.NumCol', count_v, count_v); 
      SET_GROUP_NUMBER_CELL('SEQ.SeqCol', count_v, i.gurmenu_sort_seq);
    END LOOP; 
--
  END;
--
--
  FUNCTION get_seq RETURN NUMBER IS
  BEGIN
    RETURN GET_GROUP_NUMBER_CELL('SEQ.SeqCol', 1);
  END;
END;
		*/
		/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void setSeq()
		{
			int rowCount = 0;
			NString rgName = toStr("SEQ");
			ValueSet rgId= null;
			ValueSetColumn gcId= null;
			NInteger countV = toInt(0);
			String sqlgetSeq = "SELECT GURMENU_SORT_SEQ " +
	" FROM GURMENU " +
	" WHERE GURMENU_NAME = '*MENU' AND GURMENU_USER_ID = 'BASELINE' AND  EXISTS(SELECT GUTMENU_VALUE " +
		" FROM GUTMENU " +
		" WHERE GUTMENU_VALUE = GURMENU_OBJ_NAME AND GUTMENU_LEVEL = 1 ) " +
	" ORDER BY GURMENU_SORT_SEQ";
			DataCursor getSeq = new DataCursor(sqlgetSeq);
			getFormModel().getFormHeader().setLastSeq(toStr(""));
			// 
			rgId = findGroup(rgName);
			if ( (rgId == null) )
			{
				rgId = createGroup(rgName);
				gcId = addGroupColumn(rgId, "NumCol", ValueSetColumn.NUMBER_COL);
				gcId = addGroupColumn(rgId, "SeqCol", ValueSetColumn.NUMBER_COL);
			}
			else {
				deleteGroupRow(rgName.toString(), ValueSet.ALL_ROWS);
			}
			// 
			try
			{
				getSeq.open();
				while (true)
				{
					TableRow i = getSeq.fetchRow();
					if ( getSeq.notFound() ) break;
					countV = countV.add(1);
					//WARNING: only adding rows at the end is supported
					addGroupRow(rgId);
					setGroupNumberCell("SEQ.NumCol", countV, countV);
					setGroupNumberCell("SEQ.SeqCol", countV, i.getNumber("gurmenu_sort_seq"));
				}
			}finally{
				getSeq.close();
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NNumber getSeq()
		{
			return getGroupNumberCell("SEQ.SeqCol", 1);
		}
		
	
	
}
