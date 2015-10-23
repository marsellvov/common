package net.hedtech.banner.finance.common.Fomusor.controller;
 
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

import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.finance.common.Fomusor.model.*;
import net.hedtech.banner.finance.common.Fomusor.*;
import net.hedtech.banner.finance.common.Fomusor.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class ForusorDummyController extends DefaultBlockController {


	
	public ForusorDummyController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FomusorTask getTask() {
		return (FomusorTask)super.getTask();
	}

	public FomusorModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER FORUSOR_DUMMY.POST-INSERT
		 --
--  This deletes the dummy row created in the
--  COMMIT_DUMMY trigger.  It also copies or
--  deletes the security data. 
--
   DELETE FROM FORUSOR
   WHERE  FORUSOR_USER_ID_ENTERED =
               :KEY_BLOCK.USER_ID
     AND  FORUSOR_ORGN_CODE = '######'
     AND  FORUSOR_COAS_CODE = '#' ;
--
   IF :KEY_BLOCK.COPY_USER_ID IS NOT NULL THEN
      EXECUTE_TRIGGER( 'COPY_SECURITY_DATA' ) ;
      G$_CHECK_FAILURE ;
   ELSE
      EXECUTE_TRIGGER( 'INSERT_HISTORY' ) ;
      G$_CHECK_FAILURE ;
      EXECUTE_TRIGGER( 'DELETE_SECURITY_DATA' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_DUMMY.POST-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowInsert
		public void forusorDummy_AfterRowInsert(RowAdapterEvent args)
		{
			
				// 
				//   This deletes the dummy row created in the
				//   COMMIT_DUMMY trigger.  It also copies or
				//   deletes the security data. 
				// 
				int rowCount = 0;
				// 
				//   This deletes the dummy row created in the
				//   COMMIT_DUMMY trigger.  It also copies or
				//   deletes the security data. 
				// 
				String sql1 = "DELETE FROM FORUSOR " +
	" WHERE FORUSOR_USER_ID_ENTERED = :KEY_BLOCK_USER_ID AND FORUSOR_ORGN_CODE = '######' AND FORUSOR_COAS_CODE = '#'";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("KEY_BLOCK_USER_ID", getFormModel().getKeyBlock().getUserId());
				rowCount = command1.execute();
				// 
				if ( !getFormModel().getKeyBlock().getCopyUserId().isNull() )
				{
					executeAction("COPY_SECURITY_DATA");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					executeAction("INSERT_HISTORY");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("DELETE_SECURITY_DATA");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FORUSOR_DUMMY.INSERT_HISTORY
		    INSERT INTO FORUORH
   (FORUORH_USER_ID_ENTERED,
FORUORH_COAS_CODE,      
FORUORH_ORGN_CODE,      
FORUORH_ACCESS_IND,     
FORUORH_ACTIVITY_DATE,  
FORUORH_USER_ID,        
FORUORH_END_DATE,       
FORUORH_WBUD_ACCESS_IND)
   SELECT FORUSOR_USER_ID_ENTERED,
          FORUSOR_COAS_CODE,
          FORUSOR_ORGN_CODE,
          FORUSOR_ACCESS_IND,
          FORUSOR_ACTIVITY_DATE, 
          FORUSOR_USER_ID,
          SYSDATE,
          FORUSOR_WBUD_ACCESS_IND
   FROM   FORUSOR
   WHERE  FORUSOR_USER_ID_ENTERED =
                :KEY_BLOCK.USER_ID
     AND  (FORUSOR_COAS_CODE,
           FORUSOR_ORGN_CODE) IN
          (SELECT FORUSOR_COAS_CODE,
                  FORUSOR_ORGN_CODE
           FROM   FORUSOR
           WHERE  FORUSOR_COAS_CODE LIKE
             NVL(:KEY_BLOCK.INCLUDE_COAS_CODE,'%')
             AND  FORUSOR_ORGN_CODE LIKE
             NVL(:KEY_BLOCK.INCLUDE_ORGN_CODE,'%')
             AND  FORUSOR_USER_ID_ENTERED =
                       :KEY_BLOCK.USER_ID
         MINUS
           SELECT FORUSOR_COAS_CODE,
                  FORUSOR_ORGN_CODE
           FROM   FORUSOR
           WHERE  FORUSOR_COAS_CODE LIKE
             NVL(:KEY_BLOCK.EXCLUDE_COAS_CODE,'%')
             AND  FORUSOR_ORGN_CODE LIKE
             NVL(:KEY_BLOCK.EXCLUDE_ORGN_CODE,'#')
             AND  FORUSOR_USER_ID_ENTERED =
                       :KEY_BLOCK.USER_ID ) ;
--
   IF SQL%NOTFOUND THEN
      MESSAGE(  G$_NLS.Get('FOMUSOR-0020', 'FORM','*ERROR* Organization Code security data could not be written to the history table.')  
               
               ) ;
      RAISE FORM_TRIGGER_FAILURE ; 
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_DUMMY.INSERT_HISTORY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="INSERT_HISTORY")
		public void forusorDummy_InsertHistory()
		{
			
				int rowCount = 0;
				String sql1 = "INSERT INTO FORUORH " +
	"(FORUORH_USER_ID_ENTERED, FORUORH_COAS_CODE, FORUORH_ORGN_CODE, FORUORH_ACCESS_IND, FORUORH_ACTIVITY_DATE, FORUORH_USER_ID, FORUORH_END_DATE, FORUORH_WBUD_ACCESS_IND)" +
	"SELECT FORUSOR_USER_ID_ENTERED, FORUSOR_COAS_CODE, FORUSOR_ORGN_CODE, FORUSOR_ACCESS_IND, FORUSOR_ACTIVITY_DATE, FORUSOR_USER_ID, SYSDATE, FORUSOR_WBUD_ACCESS_IND " +
	" FROM FORUSOR " +
	" WHERE FORUSOR_USER_ID_ENTERED = :KEY_BLOCK_USER_ID AND ((FORUSOR_COAS_CODE, FORUSOR_ORGN_CODE)) IN ((SELECT FORUSOR_COAS_CODE, FORUSOR_ORGN_CODE " +
		" FROM FORUSOR " +
		" WHERE FORUSOR_COAS_CODE LIKE NVL(:KEY_BLOCK_INCLUDE_COAS_CODE, '%') AND FORUSOR_ORGN_CODE LIKE NVL(:KEY_BLOCK_INCLUDE_ORGN_CODE, '%') AND FORUSOR_USER_ID_ENTERED = :KEY_BLOCK_USER_ID " +
		"MINUS SELECT FORUSOR_COAS_CODE, FORUSOR_ORGN_CODE " +
		" FROM FORUSOR " +
		" WHERE FORUSOR_COAS_CODE LIKE NVL(:KEY_BLOCK_EXCLUDE_COAS_CODE, '%') AND FORUSOR_ORGN_CODE LIKE NVL(:KEY_BLOCK_EXCLUDE_ORGN_CODE, '#') AND FORUSOR_USER_ID_ENTERED = :KEY_BLOCK_USER_ID )) ";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("KEY_BLOCK_USER_ID", getFormModel().getKeyBlock().getUserId());
				command1.addParameter("KEY_BLOCK_INCLUDE_COAS_CODE", getFormModel().getKeyBlock().getIncludeCoasCode());
				command1.addParameter("KEY_BLOCK_INCLUDE_ORGN_CODE", getFormModel().getKeyBlock().getIncludeOrgnCode());
				command1.addParameter("KEY_BLOCK_EXCLUDE_COAS_CODE", getFormModel().getKeyBlock().getExcludeCoasCode());
				command1.addParameter("KEY_BLOCK_EXCLUDE_ORGN_CODE", getFormModel().getKeyBlock().getExcludeOrgnCode());
				rowCount = command1.execute();
				// 
				if ( rowCount == 0 )
				{
					errorMessage(GNls.Fget(toStr("FOMUSOR-0020"), toStr("FORM"), toStr("*ERROR* Organization Code security data could not be written to the history table.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FORUSOR_DUMMY.DELETE_SECURITY_DATA
		    DELETE FROM FORUSOR
   WHERE  FORUSOR_USER_ID_ENTERED =
               :KEY_BLOCK.USER_ID
     AND  (FORUSOR_COAS_CODE,
           FORUSOR_ORGN_CODE) IN
          (SELECT FORUSOR_COAS_CODE,
                  FORUSOR_ORGN_CODE
           FROM   FORUSOR
           WHERE  FORUSOR_COAS_CODE LIKE
             NVL(:KEY_BLOCK.INCLUDE_COAS_CODE,'%')
             AND   FORUSOR_ORGN_CODE LIKE
             NVL(:KEY_BLOCK.INCLUDE_ORGN_CODE,'%')
             AND  FORUSOR_USER_ID_ENTERED =
                       :KEY_BLOCK.USER_ID
         MINUS
           SELECT FORUSOR_COAS_CODE,
                  FORUSOR_ORGN_CODE
           FROM   FORUSOR
           WHERE  FORUSOR_COAS_CODE LIKE
             NVL(:KEY_BLOCK.EXCLUDE_COAS_CODE,'%')
             AND  FORUSOR_ORGN_CODE LIKE
             NVL(:KEY_BLOCK.EXCLUDE_ORGN_CODE,'#')
             AND  FORUSOR_USER_ID_ENTERED =
                       :KEY_BLOCK.USER_ID ) ;
--
   IF SQL%NOTFOUND THEN
      MESSAGE(  G$_NLS.Get('FOMUSOR-0021', 'FORM','No Organization Code security data deleted for the specified criteria.')  
                
                ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
   MESSAGE(  G$_NLS.Get('FOMUSOR-0022', 'FORM','Organization Code security data was deleted from the User ID.')  
             ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_DUMMY.DELETE_SECURITY_DATA
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DELETE_SECURITY_DATA")
		public void forusorDummy_DeleteSecurityData()
		{
			
				int rowCount = 0;
				String sql1 = "DELETE FROM FORUSOR " +
	" WHERE FORUSOR_USER_ID_ENTERED = :KEY_BLOCK_USER_ID AND ((FORUSOR_COAS_CODE, FORUSOR_ORGN_CODE)) IN ((SELECT FORUSOR_COAS_CODE, FORUSOR_ORGN_CODE " +
		" FROM FORUSOR " +
		" WHERE FORUSOR_COAS_CODE LIKE NVL(:KEY_BLOCK_INCLUDE_COAS_CODE, '%') AND FORUSOR_ORGN_CODE LIKE NVL(:KEY_BLOCK_INCLUDE_ORGN_CODE, '%') AND FORUSOR_USER_ID_ENTERED = :KEY_BLOCK_USER_ID " +
		"MINUS SELECT FORUSOR_COAS_CODE, FORUSOR_ORGN_CODE " +
		" FROM FORUSOR " +
		" WHERE FORUSOR_COAS_CODE LIKE NVL(:KEY_BLOCK_EXCLUDE_COAS_CODE, '%') AND FORUSOR_ORGN_CODE LIKE NVL(:KEY_BLOCK_EXCLUDE_ORGN_CODE, '#') AND FORUSOR_USER_ID_ENTERED = :KEY_BLOCK_USER_ID ))";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("KEY_BLOCK_USER_ID", getFormModel().getKeyBlock().getUserId());
				command1.addParameter("KEY_BLOCK_INCLUDE_COAS_CODE", getFormModel().getKeyBlock().getIncludeCoasCode());
				command1.addParameter("KEY_BLOCK_INCLUDE_ORGN_CODE", getFormModel().getKeyBlock().getIncludeOrgnCode());
				command1.addParameter("KEY_BLOCK_EXCLUDE_COAS_CODE", getFormModel().getKeyBlock().getExcludeCoasCode());
				command1.addParameter("KEY_BLOCK_EXCLUDE_ORGN_CODE", getFormModel().getKeyBlock().getExcludeOrgnCode());
				rowCount = command1.execute();
				// 
				if ( rowCount == 0 )
				{
					errorMessage(GNls.Fget(toStr("FOMUSOR-0021"), toStr("FORM"), toStr("No Organization Code security data deleted for the specified criteria.")));
					throw new ApplicationException();
				}
				// 
				infoMessage(GNls.Fget(toStr("FOMUSOR-0022"), toStr("FORM"), toStr("Organization Code security data was deleted from the User ID.")));
			}

		
		/* Original PL/SQL code code for TRIGGER FORUSOR_DUMMY.COPY_SECURITY_DATA
		    INSERT INTO FORUSOR
   (FORUSOR_USER_ID_ENTERED,
FORUSOR_COAS_CODE,      
FORUSOR_ORGN_CODE,      
FORUSOR_ACCESS_IND,     
FORUSOR_ACTIVITY_DATE,  
FORUSOR_USER_ID,        
FORUSOR_WBUD_ACCESS_IND)
   SELECT :KEY_BLOCK.USER_ID,
          FORUSOR_COAS_CODE,
          FORUSOR_ORGN_CODE,
          FORUSOR_ACCESS_IND,
          SYSDATE,
          :CURRENT_USER1,
          FORUSOR_WBUD_ACCESS_IND
   FROM   FORUSOR X
   WHERE  X.FORUSOR_USER_ID_ENTERED =
            :KEY_BLOCK.COPY_USER_ID
     AND (X.FORUSOR_COAS_CODE,
          X.FORUSOR_ORGN_CODE) IN
         (SELECT FORUSOR_COAS_CODE,
                 FORUSOR_ORGN_CODE
          FROM   FORUSOR
          WHERE  FORUSOR_COAS_CODE LIKE
             NVL(:KEY_BLOCK.INCLUDE_COAS_CODE,'%')
            AND  FORUSOR_ORGN_CODE LIKE
             NVL(:KEY_BLOCK.INCLUDE_ORGN_CODE,'%')
            AND  FORUSOR_USER_ID_ENTERED =
                 :KEY_BLOCK.COPY_USER_ID
          MINUS
             SELECT FORUSOR_COAS_CODE,
                    FORUSOR_ORGN_CODE
             FROM   FORUSOR
             WHERE  FORUSOR_COAS_CODE LIKE
             NVL(:KEY_BLOCK.EXCLUDE_COAS_CODE,'%')
              AND  FORUSOR_ORGN_CODE LIKE
             NVL(:KEY_BLOCK.EXCLUDE_ORGN_CODE,'#')
              AND  FORUSOR_USER_ID_ENTERED =
                   :KEY_BLOCK.COPY_USER_ID )
     AND NOT EXISTS
         (SELECT 'X'
          FROM   FORUSOR
          WHERE  FORUSOR_USER_ID_ENTERED =
                      :KEY_BLOCK.USER_ID
            AND  FORUSOR_COAS_CODE =
                 X.FORUSOR_COAS_CODE
            AND  FORUSOR_ORGN_CODE =
                 X.FORUSOR_ORGN_CODE)
     ;
--
   IF SQL%NOTFOUND THEN
      MESSAGE(  G$_NLS.Get('FOMUSOR-0023', 'FORM','*ERROR* Organization Code security data could not be copied to User ID.')  
                
                ) ;
      RETURN ;
   END IF ;
--
   MESSAGE(  G$_NLS.Get('FOMUSOR-0024', 'FORM','Organization Code security data has been copied.')  
             ) ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_DUMMY.COPY_SECURITY_DATA
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="COPY_SECURITY_DATA")
		public void forusorDummy_CopySecurityData()
		{
			
				int rowCount = 0;
				String sql1 = "INSERT INTO FORUSOR " +
	"(FORUSOR_USER_ID_ENTERED, FORUSOR_COAS_CODE, FORUSOR_ORGN_CODE, FORUSOR_ACCESS_IND, FORUSOR_ACTIVITY_DATE, FORUSOR_USER_ID, FORUSOR_WBUD_ACCESS_IND)" +
	"SELECT :KEY_BLOCK_USER_ID, FORUSOR_COAS_CODE, FORUSOR_ORGN_CODE, FORUSOR_ACCESS_IND, SYSDATE, :CURRENT_USER1, FORUSOR_WBUD_ACCESS_IND " +
	" FROM FORUSOR X " +
	" WHERE X.FORUSOR_USER_ID_ENTERED = :KEY_BLOCK_COPY_USER_ID AND (X.FORUSOR_COAS_CODE, X.FORUSOR_ORGN_CODE) IN ((SELECT FORUSOR_COAS_CODE, FORUSOR_ORGN_CODE " +
		" FROM FORUSOR " +
		" WHERE FORUSOR_COAS_CODE LIKE NVL(:KEY_BLOCK_INCLUDE_COAS_CODE, '%') AND FORUSOR_ORGN_CODE LIKE NVL(:KEY_BLOCK_INCLUDE_ORGN_CODE, '%') AND FORUSOR_USER_ID_ENTERED = :KEY_BLOCK_COPY_USER_ID " +
		"MINUS SELECT FORUSOR_COAS_CODE, FORUSOR_ORGN_CODE " +
		" FROM FORUSOR " +
		" WHERE FORUSOR_COAS_CODE LIKE NVL(:KEY_BLOCK_EXCLUDE_COAS_CODE, '%') AND FORUSOR_ORGN_CODE LIKE NVL(:KEY_BLOCK_EXCLUDE_ORGN_CODE, '#') AND FORUSOR_USER_ID_ENTERED = :KEY_BLOCK_COPY_USER_ID )) AND  NOT EXISTS(SELECT 'X' " +
		" FROM FORUSOR " +
		" WHERE FORUSOR_USER_ID_ENTERED = :KEY_BLOCK_USER_ID AND FORUSOR_COAS_CODE = X.FORUSOR_COAS_CODE AND FORUSOR_ORGN_CODE = X.FORUSOR_ORGN_CODE ) ";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("KEY_BLOCK_USER_ID", getFormModel().getKeyBlock().getUserId());
				command1.addParameter("CURRENT_USER1", getFormModel().getFormHeader().getCurrentUser1());
				command1.addParameter("KEY_BLOCK_COPY_USER_ID", getFormModel().getKeyBlock().getCopyUserId());
				command1.addParameter("KEY_BLOCK_INCLUDE_COAS_CODE", getFormModel().getKeyBlock().getIncludeCoasCode());
				command1.addParameter("KEY_BLOCK_INCLUDE_ORGN_CODE", getFormModel().getKeyBlock().getIncludeOrgnCode());
				command1.addParameter("KEY_BLOCK_EXCLUDE_COAS_CODE", getFormModel().getKeyBlock().getExcludeCoasCode());
				command1.addParameter("KEY_BLOCK_EXCLUDE_ORGN_CODE", getFormModel().getKeyBlock().getExcludeOrgnCode());
				rowCount = command1.execute();
				// 
				if ( rowCount == 0 )
				{
					errorMessage(GNls.Fget(toStr("FOMUSOR-0023"), toStr("FORM"), toStr("*ERROR* Organization Code security data could not be copied to User ID.")));
					return ;
				}
				// 
				message(GNls.Fget(toStr("FOMUSOR-0024"), toStr("FORM"), toStr("Organization Code security data has been copied.")));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FORUSOR_DUMMY.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void forusorDummy_BeforeQuery(QueryEvent args)
		{
			
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_USER_ID", this.getFormModel().getKeyBlock().getUserId()));             


           
               }

		
	
	
}

