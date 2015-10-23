package net.hedtech.general.common.libraries.Aoqclib.controller;
 
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
import morphis.core.utils.behavior.annotations.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Aoqclib.model.*;
import net.hedtech.general.common.libraries.Aoqclib.*;
import net.hedtech.general.common.libraries.Aoqclib.services.*;

		
public class AgradtlController extends AbstractSupportCodeObject {


	
	public AgradtlController(ITask task) {
		super(task);
	}
	
	
	@Override
	public AoqclibTaskPart getContainer() {
		return (AoqclibTaskPart)super.getContainer();
	}
	
	
	public AoqclibModel getFormModel() {
		return this.getContainer().getModel();
	}	
		
			
	//action methods generated from triggers
	
		/* Original PL/SQL code code for TRIGGER AGRADTL.POST-QUERY
		 --
-- get the corresponding ADTL_code and display it on query
--
DECLARE
  CURSOR s1 IS
    SELECT atvadtl_desc
      FROM atvadtl
     WHERE atvadtl_code = :agradtl.agradtl_adtl_code;
BEGIN
  OPEN s1;
  FETCH s1 INTO :agradtl.adtl_desc; 
  CLOSE s1;
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AGRADTL.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

//		@AfterQuery
//		public void agradtl_AfterQuery(RowAdapterEvent args)
//		{
//			
//				// 
//				//  get the corresponding ADTL_code and display it on query
//				// 
//				AgradtlAdapter agradtlElement = (AgradtlAdapter)args.getRow();
//
//
//				int rowCount = 0;
//				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.
//				{
//					String sqls1 = "SELECT atvadtl_desc " +
//	" FROM atvadtl " +
//	" WHERE atvadtl_code = :AGRADTL_AGRADTL_ADTL_CODE ";
//					DataCursor s1 = new DataCursor(sqls1);
//					try {
//						//Setting query parameters
//						s1.addParameter("AGRADTL_AGRADTL_ADTL_CODE", agradtlElement.getAgradtlAdtlCode());
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable s1.
//						s1.open();
//						ResultSet s1Results = s1.fetchInto();
//						if ( s1Results != null ) {
//							agradtlElement.setAdtlDesc(s1Results.getStr(0));
//						}
//						s1.close();
//					}
//					finally{
//						s1.close();
//					}
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL.PRE-INSERT
//		 EXECUTE_TRIGGER('PRE_COMMIT_VALIDATE');
//G$_CHECK_FAILURE;
//--
//EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
//G$_CHECK_FAILURE ;
//--
//:AGRADTL_DATA_ORIGIN := UPPER(GET_APPLICATION_PROPERTY(CURRENT_FORM_NAME));
//:AGRADTL_USER_ID := :GLOBAL.CURRENT_USER;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL.PRE-INSERT
//		 *
//		 *
//		 *</p>
//		 * @param args
//		*/
//
//		@BeforeRowInsert
//		public void agradtl_BeforeRowInsert(RowAdapterEvent args)
//		{
//			
//				AgradtlAdapter agradtlElement = (AgradtlAdapter)args.getRow();
//
//
//				executeAction("PRE_COMMIT_VALIDATE");
//				getContainer().getGoqrpls().gCheckFailure();
//				// 
//				executeAction("UPDATE_ACTIVITY_DATE");
//				getContainer().getGoqrpls().gCheckFailure();
//				// 
//				agradtlElement.setAgradtlDataOrigin(upper(getCurrentTaskName()));
//				agradtlElement.setAgradtlUserId(getGlobal("CURRENT_USER"));
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL.PRE-UPDATE
//		 EXECUTE_TRIGGER('PRE_COMMIT_VALIDATE');
//G$_CHECK_FAILURE;
//--
//EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
//G$_CHECK_FAILURE ;
//--	  
//:AGRADTL_USER_ID := :GLOBAL.CURRENT_USER;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL.PRE-UPDATE
//		 *
//		 *
//		 *</p>
//		 * @param args
//		*/
//
//		@BeforeRowUpdate
//		public void agradtl_BeforeRowUpdate(RowAdapterEvent args)
//		{
//			
//				AgradtlAdapter agradtlElement = (AgradtlAdapter)args.getRow();
//
//
//				executeAction("PRE_COMMIT_VALIDATE");
//				getContainer().getGoqrpls().gCheckFailure();
//				// 
//				executeAction("UPDATE_ACTIVITY_DATE");
//				getContainer().getGoqrpls().gCheckFailure();
//				// 	  
//				agradtlElement.setAgradtlUserId(getGlobal("CURRENT_USER"));
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL.KEY-NXTBLK
//		 IF :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN 
//  GO_ITEM(:SYSTEM.CURSOR_ITEM);
//  MESSAGE(G$_NLS.Get('AOQCLIB-0004','FORM','Additional Detail information changed, press SAVE before leaving current tab.'));
//ELSE
//	IF :ADTL_NEXT_BLOCK_OK = 'Y' THEN
//    NEXT_BLOCK;
//    GO_ITEM('PGBE_ID');
//    EXECUTE_QUERY;
//	ELSE
//		EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
//    G$_CHECK_FAILURE;
//  END IF;
//END IF;
//
//	
//
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL.KEY-NXTBLK
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
//		public void agradtl_NextBlock()
//		{
//			
//				if ( getBlockStatus().equals("CHANGED") )
//				{
//					goItem(toStr(getCursorItem()));
//					message(GNls.Fget(toStr("AOQCLIB-0004"), toStr("FORM"), toStr("Additional Detail information changed, press SAVE before leaving current tab.")));
//				}
//				else {
//					if ( getFormModel().getFormHeader().getAdtlNextBlockOk().equals("Y") )
//					{
//						nextBlock();
//						goItem(toStr("PGBE_ID"));
//						executeQuery();
//					}
//					else {
//						executeAction("INVALID_FUNCTION_MSG");
//						getContainer().getGoqrpls().gCheckFailure();
//					}
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL.KEY-PRVBLK
//		 IF :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN 
//  GO_ITEM(:SYSTEM.CURSOR_ITEM);
//  MESSAGE(G$_NLS.Get('AOQCLIB-0005','FORM','Additional Detail information changed, press SAVE before leaving current window.'));
//ELSE
//  PREVIOUS_BLOCK;
//END IF;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL.KEY-PRVBLK
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
//		public void agradtl_PreviousBlock()
//		{
//			
//				if ( getBlockStatus().equals("CHANGED") )
//				{
//					goItem(toStr(getCursorItem()));
//					message(GNls.Fget(toStr("AOQCLIB-0005"), toStr("FORM"), toStr("Additional Detail information changed, press SAVE before leaving current window.")));
//				}
//				else {
//					previousBlock();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL.PRE_COMMIT_VALIDATE
//		   IF :AGRADTL_ADTL_CODE IS NULL THEN
//  	MESSAGE(G$_NLS.Get('AOQCLIB-0006','FORM','*ERROR* Code is required.'));
//  	RAISE FORM_TRIGGER_FAILURE;
//  END IF;
//  IF NOT VALID_PLEDGE_GIFT_COMBO(:KEY_BLOCK.PIDM, :AGRADTL_PLEDGE_NO, :AGRADTL_GIFT_NO) THEN
//      MESSAGE(G$_NLS.Get('AOQCLIB-0007', 'FORM',
//              '*ERROR* Pledge/Gift number combination is invalid.'));
//      RAISE FORM_TRIGGER_FAILURE;
//  END IF; 
//  IF :AGRADTL_PLEDGE_NO IS NULL AND :AGRADTL_GIFT_NO IS NULL THEN
//	 MESSAGE(G$_NLS.Get('AOQCLIB-0008', 'FORM',
//              '*ERROR* Pledge number or gift number is required.'));
//   RAISE FORM_TRIGGER_FAILURE;
//  END IF; 
//  IF :GLOBAL.PLEDGE_NO IS NOT NULL THEN
//     IF ((:GLOBAL.PLEDGE_NO <> :AGRADTL_PLEDGE_NO OR :AGRADTL_PLEDGE_NO IS NULL) AND
//     	   (:GLOBAL.GIFT_NO IS NULL OR :GLOBAL.GIFT_NO = '0000000')) THEN
//    	    MESSAGE(G$_NLS.Get('AOQCLIB-0009','FORM','*ERROR* Pledge number must match pledge number in key block.'));
//          RAISE FORM_TRIGGER_FAILURE;
//     END IF;   
//  END IF;   
//  IF :GLOBAL.PLEDGE_NO IS NOT NULL THEN
//     IF ((:GLOBAL.PLEDGE_NO <> :AGRADTL_PLEDGE_NO OR :AGRADTL_PLEDGE_NO IS NULL) AND
//     	    :GLOBAL.PLEDGE_NO IS NOT NULL AND :GLOBAL.GIFT_NO IS NULL) THEN
//        	MESSAGE(G$_NLS.Get('AOQCLIB-0010','FORM','*ERROR* Pledge number must match pledge number in key block.'));
//  	      RAISE FORM_TRIGGER_FAILURE;
//     END IF;
//  END IF;
//  IF :GLOBAL.GIFT_NO IS NOT NULL THEN
//     IF ((:GLOBAL.GIFT_NO <> :AGRADTL_GIFT_NO -- OR :AGRADTL_GIFT_NO IS NULL  -- Defect#1-G9OURZ 
//     	    ) AND (:GLOBAL.PLEDGE_NO IS NULL OR :GLOBAL.PLEDGE_NO = '0000000')) THEN
//         MESSAGE(G$_NLS.Get('AOQCLIB-0011','FORM','*ERROR* Gift number must match gift number in key block.'));
//  	     RAISE FORM_TRIGGER_FAILURE;
//     END IF;
//  END IF;      
//  IF :GLOBAL.GIFT_NO IS NOT NULL THEN
//     IF ((:GLOBAL.GIFT_NO <> :AGRADTL_GIFT_NO -- OR :AGRADTL_GIFT_NO IS NULL  -- Defect#1-G9OURZ 
//     	    ) AND :GLOBAL.GIFT_NO IS NOT NULL AND :GLOBAL.PLEDGE_NO IS NULL) THEN
//         	MESSAGE(G$_NLS.Get('AOQCLIB-0012','FORM','*ERROR* Gift number must match gift number in key block.'));
//  	      RAISE FORM_TRIGGER_FAILURE;
//     END IF;
//  END IF;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL.PRE_COMMIT_VALIDATE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="PRE_COMMIT_VALIDATE")
//		public void agradtl_PreCommitValidate()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgradtlAdapter agradtlElement = (AgradtlAdapter)this.getFormModel().getAgradtl().getRowAdapter(true);
//
//
//				if ( agradtlElement.getAgradtlAdtlCode().isNull() )
//				{
//					errorMessage(GNls.Fget(toStr("AOQCLIB-0006"), toStr("FORM"), toStr("*ERROR* Code is required.")));
//					throw new ApplicationException();
//				}
//				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//				if ( this.getTask().getServices().validPledgeGiftCombo(this.getModel()getValue(KEY_BLOCK,PIDM), agradtlElement.getAgradtlPledgeNo(), agradtlElement.getAgradtlGiftNo()).not() )
//				{
//					errorMessage(GNls.Fget(toStr("AOQCLIB-0007"), toStr("FORM"), toStr("*ERROR* Pledge/Gift number combination is invalid.")));
//					throw new ApplicationException();
//				}
//				if ( agradtlElement.getAgradtlPledgeNo().isNull() && agradtlElement.getAgradtlGiftNo().isNull() )
//				{
//					errorMessage(GNls.Fget(toStr("AOQCLIB-0008"), toStr("FORM"), toStr("*ERROR* Pledge number or gift number is required.")));
//					throw new ApplicationException();
//				}
//				if ( !getGlobal("PLEDGE_NO").isNull() )
//				{
//					if (((getGlobal("PLEDGE_NO").notEquals(agradtlElement.getAgradtlPledgeNo()) || agradtlElement.getAgradtlPledgeNo().isNull()) && (getGlobal("GIFT_NO").isNull() || getGlobal("GIFT_NO").equals("0000000"))))
//					{
//						errorMessage(GNls.Fget(toStr("AOQCLIB-0009"), toStr("FORM"), toStr("*ERROR* Pledge number must match pledge number in key block.")));
//						throw new ApplicationException();
//					}
//				}
//				if ( !getGlobal("PLEDGE_NO").isNull() )
//				{
//					if (((getGlobal("PLEDGE_NO").notEquals(agradtlElement.getAgradtlPledgeNo()) || agradtlElement.getAgradtlPledgeNo().isNull()) && !getGlobal("PLEDGE_NO").isNull() && getGlobal("GIFT_NO").isNull()))
//					{
//						errorMessage(GNls.Fget(toStr("AOQCLIB-0010"), toStr("FORM"), toStr("*ERROR* Pledge number must match pledge number in key block.")));
//						throw new ApplicationException();
//					}
//				}
//				if ( !getGlobal("GIFT_NO").isNull() )
//				{
//					if (((getGlobal("GIFT_NO").notEquals(agradtlElement.getAgradtlGiftNo())) && (getGlobal("PLEDGE_NO").isNull() || getGlobal("PLEDGE_NO").equals("0000000"))))
//					{
//						errorMessage(GNls.Fget(toStr("AOQCLIB-0011"), toStr("FORM"), toStr("*ERROR* Gift number must match gift number in key block.")));
//						throw new ApplicationException();
//					}
//				}
//				if ( !getGlobal("GIFT_NO").isNull() )
//				{
//					if (((getGlobal("GIFT_NO").notEquals(agradtlElement.getAgradtlGiftNo())) && !getGlobal("GIFT_NO").isNull() && getGlobal("PLEDGE_NO").isNull()))
//					{
//						errorMessage(GNls.Fget(toStr("AOQCLIB-0012"), toStr("FORM"), toStr("*ERROR* Gift number must match gift number in key block.")));
//						throw new ApplicationException();
//					}
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL.UPDATE_ACTIVITY_DATE
//		    :WORKDATE := :SYSTEM.CURRENT_BLOCK ;
//--
//   :WORKDATE := SUBSTR(:WORKDATE, 1, 7) ;
//--
//   :WORKDATE := RPAD(:WORKDATE, 21, '_ACTIVITY_DATE') ;
//--
//   COPY( :CURRENT_DATE, :WORKDATE ) ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL.UPDATE_ACTIVITY_DATE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="UPDATE_ACTIVITY_DATE")
//		public void agradtl_UpdateActivityDate()
//		{
//			
//				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//				this.getModel()setValue(F2N_UKNOWN_BUSINESS_OBJECT,WORKDATE,getCurrentBlock());
//				// 
//				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//				this.getModel()setValue(F2N_UKNOWN_BUSINESS_OBJECT,WORKDATE,substring(this.getModel()getValue(F2N_UKNOWN_BUSINESS_OBJECT,WORKDATE), toInt(1), toInt(7)));
//				// 
//				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//				this.getModel()setValue(F2N_UKNOWN_BUSINESS_OBJECT,WORKDATE,rpad(this.getModel()getValue(F2N_UKNOWN_BUSINESS_OBJECT,WORKDATE), 21, "_ACTIVITY_DATE"));
//				// 
//				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//				copy(this.getModel()getValue(F2N_UKNOWN_BUSINESS_OBJECT,CURRENT_DATE),this.getModel()getValue(F2N_UKNOWN_BUSINESS_OBJECT,WORKDATE));
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL.ON-UPDATE
//		 	-- Strip null characters from the field, which are not visible.
//	:AGRADTL.AGRADTL_COMMENT := substr(replace(:AGRADTL.AGRADTL_COMMENT,chr(0),''),1,32767);  
//
//	IF (LENGTH(REPLACE(:AGRADTL.AGRADTL_COMMENT,' ','')) IS NULL ) THEN
//     :AGRADTL.AGRADTL_COMMENT:=EMPTY_CLOB();
//	END IF;
//	--
//BEGIN	
//	UPDATE AGRADTL SET	   
//	       AGRADTL_PIDM           = :AGRADTL_PIDM,          
//         AGRADTL_USER_ID        = :AGRADTL_USER_ID, 
//         AGRADTL_ACTIVITY_DATE  = :AGRADTL_ACTIVITY_DATE,    
//         AGRADTL_ADTL_CODE      = :AGRADTL_ADTL_CODE,               
//         AGRADTL_DETAILS        = :AGRADTL_DETAILS,                                
//         AGRADTL_PLEDGE_NO      = :AGRADTL_PLEDGE_NO,                              
//         AGRADTL_GIFT_NO        = :AGRADTL_GIFT_NO,  
//         AGRADTL_AMT            = :AGRADTL_AMT,                           
//         AGRADTL_COMMENT        = :AGRADTL_COMMENT
//  WHERE AGRADTL.rowid = :AGRADTL.rowid ;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL.ON-UPDATE
//		 *
//		 *
//		 *</p>
//		 * @param args
//		*/
//
//		@RowUpdate
//		public void agradtl_RowUpdate(RowAdapterEvent args)
//		{
//			
//				//  Strip null characters from the field, which are not visible.
//				AgradtlAdapter agradtlElement = (AgradtlAdapter)args.getRow();
//
//
//				int rowCount = 0;
//				//  Strip null characters from the field, which are not visible.
//				agradtlElement.setAgradtlComment(substring(replace(agradtlElement.getAgradtlComment(), chr(0), ""), toInt(1), toInt(32767)));
//				if ((length(replace(agradtlElement.getAgradtlComment(), " ", "")).isNull()))
//				{
//					// F2J_NOT_SUPPORTED : Call to built-in "EMPTY_CLOB" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\AOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//					//					agradtlElement.setAgradtlComment(SupportClasses.STANDARD.EmptyClob());
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'EMPTY_CLOB' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\AOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//					
//				}
//				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//				String sql1 = "UPDATE AGRADTL " +
//	"SET AGRADTL_PIDM = :AGRADTL_PIDM, AGRADTL_USER_ID = :AGRADTL_USER_ID, AGRADTL_ACTIVITY_DATE = :AGRADTL_ACTIVITY_DATE, AGRADTL_ADTL_CODE = :AGRADTL_ADTL_CODE, AGRADTL_DETAILS = :AGRADTL_DETAILS, AGRADTL_PLEDGE_NO = :AGRADTL_PLEDGE_NO, AGRADTL_GIFT_NO = :AGRADTL_GIFT_NO, AGRADTL_AMT = :AGRADTL_AMT, AGRADTL_COMMENT = :AGRADTL_COMMENT " +
//	" WHERE AGRADTL.rowid = :AGRADTL_ROWID";
//				DataCommand command1 = new DataCommand(sql1);
//				//Setting query parameters
//				command1.addParameter("AGRADTL_PIDM", agradtlElement.getAgradtlPidm());
//				command1.addParameter("AGRADTL_USER_ID", agradtlElement.getAgradtlUserId());
//				command1.addParameter("AGRADTL_ACTIVITY_DATE", agradtlElement.getAgradtlActivityDate());
//				command1.addParameter("AGRADTL_ADTL_CODE", agradtlElement.getAgradtlAdtlCode());
//				command1.addParameter("AGRADTL_DETAILS", agradtlElement.getAgradtlDetails());
//				command1.addParameter("AGRADTL_PLEDGE_NO", agradtlElement.getAgradtlPledgeNo());
//				command1.addParameter("AGRADTL_GIFT_NO", agradtlElement.getAgradtlGiftNo());
//				command1.addParameter("AGRADTL_AMT", agradtlElement.getAgradtlAmt());
//				command1.addParameter("AGRADTL_COMMENT", agradtlElement.getAgradtlComment());
//				command1.addParameter("AGRADTL_ROWID", agradtlElement.getROWID());
//				rowCount = command1.execute();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL.ON-INSERT
//		 -- Strip null characters from the field, which are not visible.
//	:AGRADTL.AGRADTL_COMMENT := substr(replace(:AGRADTL.AGRADTL_COMMENT,chr(0),''),1,32767);  
//
//	IF (LENGTH(REPLACE(:AGRADTL.AGRADTL_COMMENT,' ','')) IS NULL ) THEN
//     :AGRADTL.AGRADTL_COMMENT:=EMPTY_CLOB();
//	END IF;
//--
//--DECLARE
//-- agradtl_rec     agradtl%rowtype;
//BEGIN	
//--  agradtl_rec.agradtl_pidm           := :AGRADTL_PIDM;          
//--  agradtl_rec.agradtl_user_id        := :AGRADTL_USER_ID; 
//--  agradtl_rec.agradtl_data_origin    := :AGRADTL_DATA_ORIGIN;
//--  agradtl_rec.agradtl_activity_date  := :AGRADTL_ACTIVITY_DATE;                           
//--  agradtl_rec.agradtl_adtl_code      := :AGRADTL_ADTL_CODE;
//--  agradtl_rec.agradtl_details        := :AGRADTL_DETAILS;                              
//--  agradtl_rec.agradtl_pledge_no      := :AGRADTL_PLEDGE_NO;                              
//--  agradtl_rec.agradtl_gift_no        := :AGRADTL_GIFT_NO;                           
//--  agradtl_rec.agradtl_amt            := :AGRADTL_AMT;
//--  agradtl_rec.agradtl_comment        := :AGRADTL_COMMENT;
//    
//--  dml_agradtl.p_insert( agradtl_rec, :agradtl.ROWID ); 
//    dml_agradtl.p_insert( :AGRADTL_PIDM, :AGRADTL_USER_ID, :AGRADTL_DATA_ORIGIN,
//                          :AGRADTL_ACTIVITY_DATE, :AGRADTL_ADTL_CODE, :AGRADTL_DETAILS,
//                          :AGRADTL_PLEDGE_NO, :AGRADTL_GIFT_NO, :AGRADTL_AMT,
//                          :AGRADTL_COMMENT, :AGRADTL.ROWID);  
//                             
//    :agradtl_activity_date := TO_DATE(G$_RESYNCH_RECORD(:agradtl.ROWID),'DDMONYYYYHH24MISS');
//
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL.ON-INSERT
//		 *
//		 *
//		 *</p>
//		 * @param args
//		*/
//
//		@RowInsert
//		public void agradtl_RowInsert(RowAdapterEvent args)
//		{
//			
//				//  Strip null characters from the field, which are not visible.
//				AgradtlAdapter agradtlElement = (AgradtlAdapter)args.getRow();
//
//
//				//  Strip null characters from the field, which are not visible.
//				agradtlElement.setAgradtlComment(substring(replace(agradtlElement.getAgradtlComment(), chr(0), ""), toInt(1), toInt(32767)));
//				if ((length(replace(agradtlElement.getAgradtlComment(), " ", "")).isNull()))
//				{
//					// F2J_NOT_SUPPORTED : Call to built-in "EMPTY_CLOB" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\AOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//					//					agradtlElement.setAgradtlComment(SupportClasses.STANDARD.EmptyClob());
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'EMPTY_CLOB' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\AOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//					
//				}
//				//   agradtl_rec.agradtl_pidm           := :AGRADTL_PIDM;          
//				//   agradtl_rec.agradtl_user_id        := :AGRADTL_USER_ID; 
//				//   agradtl_rec.agradtl_data_origin    := :AGRADTL_DATA_ORIGIN;
//				//   agradtl_rec.agradtl_activity_date  := :AGRADTL_ACTIVITY_DATE;                           
//				//   agradtl_rec.agradtl_adtl_code      := :AGRADTL_ADTL_CODE;
//				//   agradtl_rec.agradtl_details        := :AGRADTL_DETAILS;                              
//				//   agradtl_rec.agradtl_pledge_no      := :AGRADTL_PLEDGE_NO;                              
//				//   agradtl_rec.agradtl_gift_no        := :AGRADTL_GIFT_NO;                           
//				//   agradtl_rec.agradtl_amt            := :AGRADTL_AMT;
//				//   agradtl_rec.agradtl_comment        := :AGRADTL_COMMENT;
//				//   dml_agradtl.p_insert( agradtl_rec, :agradtl.ROWID ); 
//				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//				Ref<NString> p_rowid_out_ref = new Ref<NString>(DbManager.getDataBaseFactory().rowidToString(agradtlElement.getROWID()));
//				DmlAgradtl.pInsert(agradtlElement.getAgradtlPidm(), agradtlElement.getAgradtlUserId(), agradtlElement.getAgradtlDataOrigin(), agradtlElement.getAgradtlActivityDate(), agradtlElement.getAgradtlAdtlCode(), agradtlElement.getAgradtlDetails(), agradtlElement.getAgradtlPledgeNo(), agradtlElement.getAgradtlGiftNo(), agradtlElement.getAgradtlAmt(), agradtlElement.getAgradtlComment(), p_rowid_out_ref);
//				agradtlElement.setROWID(p_rowid_out_ref.val);
//				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//				agradtlElement.setAgradtlActivityDate(toDate(gResynchRecord(agradtlElement.getROWID()), "DDMONYYYYHH24MISS"));
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL.POST-INSERT
//		 NULL;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL.POST-INSERT
//		 *
//		 *
//		 *</p>
//		 * @param args
//		*/
//
//		@AfterRowInsert
//		public void agradtl_AfterRowInsert(RowAdapterEvent args)
//		{
//			
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL.KEY-CLRBLK
//		 CLEAR_BLOCK;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL.KEY-CLRBLK
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
//		public void agradtl_keyClearBlock()
//		{
//			
//				clearBlock();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL.KEY-CLRREC
//		 CLEAR_RECORD;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL.KEY-CLRREC
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
//		public void agradtl_ClearRecord()
//		{
//			
//				clearRecord();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL.WHEN-NEW-RECORD-INSTANCE
//		 GO_ITEM('AGRADTL_ADTL_CODE');
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL.WHEN-NEW-RECORD-INSTANCE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
//		public void agradtl_recordChange()
//		{
//			
//				goItem(toStr("AGRADTL_ADTL_CODE"));
//			}
//
//		
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL.PRE-QUERY
//		 *
//		 *
//		 *</p>
//		 * @param args
//		*/
//
//		@BeforeQuery
//		public void agradtl_BeforeQuery(QueryEvent args)
//		{
//			
//               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized
//
//				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("PIDM", ));             
//
//
//				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GLOBAL_PLEDGE_NO", getGlobal("pledge_no")));             
//
//
//				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GLOBAL_GIFT_NO", getGlobal("gift_no")));             
//
//
//           
//               }
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_ADTL_CODE.WHEN-MOUSE-DOUBLECLICK
//		 BEGIN
//  G$_SEARCH.WHEN_MOUSE_CLICK;
//  G$_CHECK_FAILURE;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_ADTL_CODE.WHEN-MOUSE-DOUBLECLICK
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="AGRADTL_ADTL_CODE")
//		public void agradtlAdtlCode_doubleClick()
//		{
//			
//				GSearch.whenMouseClick;
//				getContainer().getGoqrpls().gCheckFailure();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_ADTL_CODE.WHEN-NEW-ITEM-INSTANCE
//		 BEGIN
//  G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
//  G$_CHECK_FAILURE;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_ADTL_CODE.WHEN-NEW-ITEM-INSTANCE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="AGRADTL_ADTL_CODE", function=KeyFunction.ITEM_CHANGE)
//		public void agradtlAdtlCode_itemChange()
//		{
//			
//				GSearch.codeWhenNewItemInst;
//				getContainer().getGoqrpls().gCheckFailure();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_ADTL_CODE.G$_SEARCH_PARAMETERS
//		 BEGIN
//  G$_SEARCH.PARAMETERS('','','');
//END;
//
//
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_ADTL_CODE.G$_SEARCH_PARAMETERS
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="AGRADTL_ADTL_CODE")
//		public void agradtlAdtlCode_GSearchParameters()
//		{
//			
//				GSearch.parameters("", "", "");
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_ADTL_CODE.G$_SEARCH_OPTIONS
//		 BEGIN
//  DO_KEY('LIST_VALUES');
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_ADTL_CODE.G$_SEARCH_OPTIONS
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="AGRADTL_ADTL_CODE")
//		public void agradtlAdtlCode_GSearchOptions()
//		{
//			
//				executeAction(KeyFunction.LIST_VALUES);
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_ADTL_CODE.KEY-NEXT-ITEM
//		 BEGIN
//  G$_SEARCH.CODE_KEY_NEXT_ITEM;
//  G$_CHECK_FAILURE;
//  NEXT_ITEM;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_ADTL_CODE.KEY-NEXT-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-NEXT-ITEM", item="AGRADTL_ADTL_CODE", function=KeyFunction.NEXT_ITEM)
//		public void agradtlAdtlCode_keyNexItem()
//		{
//			
//				GSearch.codeKeyNextItem;
//				getContainer().getGoqrpls().gCheckFailure();
//				nextItem();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_ADTL_CODE.POST-TEXT-ITEM
//		 BEGIN
//  G$_SEARCH.POST_TEXT_CODE;
//  G$_CHECK_FAILURE;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_ADTL_CODE.POST-TEXT-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-TEXT-ITEM", item="AGRADTL_ADTL_CODE", function=KeyFunction.ITEM_OUT)
//		public void agradtlAdtlCode_itemOut()
//		{
//			
//				GSearch.postTextCode;
//				getContainer().getGoqrpls().gCheckFailure();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_ADTL_CODE.WHEN-VALIDATE-ITEM
//		 DECLARE
//	COUNT_GDES      number;
//  CURSOR s1 IS
//    SELECT atvadtl_desc
//      FROM atvadtl
//     WHERE atvadtl_code=:AGRADTL.AGRADTL_ADTL_CODE;
//  CURSOR PTI_CURSOR2 IS
//    SELECT COUNT(*)
//    FROM   AGRGDES
//    WHERE  AGRGDES_PIDM = :KEY_BLOCK.PIDM
//    AND  AGRGDES_GIFT_NO = :GLOBAL.GIFT_NO ;   
//BEGIN
//  IF :AGRADTL.AGRADTL_ADTL_CODE IS NULL THEN
//    :AGRADTL.ADTL_DESC := '';
//  	RETURN;
//  END IF;
//--
//  OPEN s1;
//  FETCH s1 INTO :AGRADTL.ADTL_DESC; 
//  IF s1%NOTFOUND THEN
//  	CLOSE s1;
//  	MESSAGE(G$_NLS.Get('AOQCLIB-0013','FORM','*ERROR* Invalid Additional Detail Code; press LIST for valid code.'));
//  	RAISE FORM_TRIGGER_FAILURE;
//  END IF;
//  CLOSE s1;
//  IF :AGRADTL.ROWID IS NULL AND
//  	 :AGRADTL_PLEDGE_NO IS NULL AND
//  	 :AGRADTL_GIFT_NO IS NULL THEN
//	   :AGRADTL_PLEDGE_NO := :GLOBAL.PLEDGE_NO;
//	   :AGRADTL_GIFT_NO := :GLOBAL.GIFT_NO;
//  END IF;
//  OPEN PTI_CURSOR2;
//  FETCH PTI_CURSOR2 INTO COUNT_GDES;
//  IF COUNT_GDES > 1 THEN
//     :AGRADTL_PLEDGE_NO := '';
//     :AGRADTL_GIFT_NO := :GLOBAL.GIFT_NO;  
//  END IF;  
//	CLOSE PTI_CURSOR2;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_ADTL_CODE.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="AGRADTL_ADTL_CODE")
//		public void agradtlAdtlCode_validate()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgradtlAdapter agradtlElement = (AgradtlAdapter)this.getFormModel().getAgradtl().getRowAdapter(true);
//
//
//				int rowCount = 0;
//				{
//					NNumber countGdes= NNumber.getNull();
//					String sqls1 = "SELECT atvadtl_desc " +
//	" FROM atvadtl " +
//	" WHERE atvadtl_code = :AGRADTL_AGRADTL_ADTL_CODE ";
//					DataCursor s1 = new DataCursor(sqls1);
//					String sqlptiCursor2 = "SELECT COUNT(*) " +
//	" FROM AGRGDES " +
//	" WHERE AGRGDES_PIDM = :KEY_BLOCK_PIDM AND AGRGDES_GIFT_NO = :GLOBAL_GIFT_NO ";
//					DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
//					try {
//						if ( agradtlElement.getAgradtlAdtlCode().isNull() )
//						{
//							agradtlElement.setAdtlDesc(toStr(""));
//							return ;
//						}
//						// 
//						//Setting query parameters
//						s1.addParameter("AGRADTL_AGRADTL_ADTL_CODE", agradtlElement.getAgradtlAdtlCode());
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable s1.
//						s1.open();
//						ResultSet s1Results = s1.fetchInto();
//						if ( s1Results != null ) {
//							agradtlElement.setAdtlDesc(s1Results.getStr(0));
//						}
//						if ( s1.notFound() )
//						{
//							s1.close();
//							errorMessage(GNls.Fget(toStr("AOQCLIB-0013"), toStr("FORM"), toStr("*ERROR* Invalid Additional Detail Code; press LIST for valid code.")));
//							throw new ApplicationException();
//						}
//						s1.close();
//						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//						if ( agradtlElement.getROWID().isNull() && agradtlElement.getAgradtlPledgeNo().isNull() && agradtlElement.getAgradtlGiftNo().isNull() )
//						{
//							agradtlElement.setAgradtlPledgeNo(getGlobal("PLEDGE_NO"));
//							agradtlElement.setAgradtlGiftNo(getGlobal("GIFT_NO"));
//						}
//						//Setting query parameters
//						ptiCursor2.addParameter("KEY_BLOCK_PIDM", this.getModel()getValue(KEY_BLOCK,PIDM));
//						ptiCursor2.addParameter("GLOBAL_GIFT_NO", getGlobal("GIFT_NO"));
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor2.
//						ptiCursor2.open();
//						ResultSet ptiCursor2Results = ptiCursor2.fetchInto();
//						if ( ptiCursor2Results != null ) {
//							countGdes = ptiCursor2Results.getNumber(0);
//						}
//						if ( countGdes.greater(1) )
//						{
//							agradtlElement.setAgradtlPledgeNo(toStr(""));
//							agradtlElement.setAgradtlGiftNo(getGlobal("GIFT_NO"));
//						}
//						ptiCursor2.close();
//					}
//					finally{
//						s1.close();
//						ptiCursor2.close();
//					}
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_ADTL_CODE_LBT.WHEN-MOUSE-CLICK
//		 BEGIN
//  NULL;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_ADTL_CODE_LBT.WHEN-MOUSE-CLICK
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="AGRADTL_ADTL_CODE_LBT")
//		@Before
//		public void agradtlAdtlCodeLbt_click()
//		{
//			
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER ADTL_DESC.WHEN-NEW-ITEM-INSTANCE
//		 PREVIOUS_ITEM;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * ADTL_DESC.WHEN-NEW-ITEM-INSTANCE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ADTL_DESC", function=KeyFunction.ITEM_CHANGE)
//		public void adtlDesc_itemChange()
//		{
//			
//				previousItem();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_PLEDGE_NO.KEY-NEXT-ITEM
//		 BEGIN
//  NEXT_ITEM;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_PLEDGE_NO.KEY-NEXT-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-NEXT-ITEM", item="AGRADTL_PLEDGE_NO", function=KeyFunction.NEXT_ITEM)
//		public void agradtlPledgeNo_keyNexItem()
//		{
//			
//				nextItem();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_PLEDGE_NO.WHEN-MOUSE-DOUBLECLICK
//		 BEGIN
//  G$_SEARCH.WHEN_MOUSE_CLICK;
//  G$_CHECK_FAILURE;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_PLEDGE_NO.WHEN-MOUSE-DOUBLECLICK
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="AGRADTL_PLEDGE_NO")
//		public void agradtlPledgeNo_doubleClick()
//		{
//			
//				GSearch.whenMouseClick;
//				getContainer().getGoqrpls().gCheckFailure();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_PLEDGE_NO.G$_SEARCH_PARAMETERS
//		 BEGIN
//  G$_SEARCH.PARAMETERS('','','');
//END;
//
//
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_PLEDGE_NO.G$_SEARCH_PARAMETERS
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="AGRADTL_PLEDGE_NO")
//		public void agradtlPledgeNo_GSearchParameters()
//		{
//			
//				GSearch.parameters("", "", "");
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_PLEDGE_NO.G$_SEARCH_OPTIONS
//		 BEGIN
//  DO_KEY('LIST_VALUES');
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_PLEDGE_NO.G$_SEARCH_OPTIONS
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="AGRADTL_PLEDGE_NO")
//		public void agradtlPledgeNo_GSearchOptions()
//		{
//			
//				executeAction(KeyFunction.LIST_VALUES);
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_PLEDGE_NO.WHEN-VALIDATE-ITEM
//		   DECLARE
//  	  COUNT_GDES           number;
//      PTI_INTO_TEMP        VARCHAR2(255);
//      CURSOR PTI_CURSOR IS
//         SELECT 'Y'
//         FROM   AGBPLDG
//         WHERE  AGBPLDG_PIDM = :KEY_BLOCK.PIDM
//           AND  AGBPLDG_PLEDGE_NO = :AGRADTL_PLEDGE_NO ;
//      CURSOR PTI_CURSOR2 IS
//         SELECT 'X'
//         FROM   AGRGDES
//         WHERE  AGRGDES_PIDM = :KEY_BLOCK.PIDM
//           AND  AGRGDES_GIFT_NO = :GLOBAL.GIFT_NO
//           AND  :AGRADTL_PLEDGE_NO = AGRGDES_PLEDGE_NO ;    
//      CURSOR PTI_CURSOR3 IS
//         SELECT COUNT(*)
//         FROM   AGRGDES
//         WHERE  AGRGDES_PIDM = :KEY_BLOCK.PIDM
//           AND  AGRGDES_GIFT_NO = :GLOBAL.GIFT_NO ;      
//  BEGIN
//      IF :AGRADTL_PLEDGE_NO is not null and
//      	 :AGRADTL_PLEDGE_NO <> '0000000'then
//        OPEN PTI_CURSOR ;
//        FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
//        G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,  
//                        G$_NLS.Get('AOQCLIB-0014', 'FORM',
//                                   '*ERROR* Pledge number does not exist; press LIST for pledge numbers.'), TRUE);
//        CLOSE PTI_CURSOR;
//      IF :GLOBAL.GIFT_NO IS NOT NULL THEN
//           OPEN PTI_CURSOR2 ;
//           FETCH PTI_CURSOR2 INTO PTI_INTO_TEMP ;
//           G$_CHECK_VALUE (PTI_CURSOR2%NOTFOUND,  
//                           G$_NLS.Get('AOQCLIB-0015', 'FORM',
//                                      '*ERROR* Pledge number does not exist; press LIST for pledge numbers.'), TRUE);
//           CLOSE PTI_CURSOR2;                        
//      END IF;      
//      END IF;  
//      IF :GLOBAL.PLEDGE_NO IS NOT NULL THEN
//         IF ((:GLOBAL.PLEDGE_NO <> :AGRADTL_PLEDGE_NO OR :AGRADTL_PLEDGE_NO IS NULL) AND
//         	   ((:GLOBAL.GIFT_NO IS NULL OR :GLOBAL.GIFT_NO = '0000000')AND :AGRADTL.ROWID IS NOT NULL)) THEN
//      	    MESSAGE(G$_NLS.Get('AOQCLIB-0016','FORM','*ERROR* Pledge number must match pledge number in key block.'));
//  	        RAISE FORM_TRIGGER_FAILURE;
//  	     END IF;   
//      END IF;   
//      IF :GLOBAL.PLEDGE_NO IS NOT NULL THEN
//         IF ((:GLOBAL.PLEDGE_NO <> :AGRADTL_PLEDGE_NO OR :AGRADTL_PLEDGE_NO IS NULL) AND
//         	    :GLOBAL.PLEDGE_NO IS NOT NULL AND :AGRADTL.ROWID IS NOT NULL AND :GLOBAL.GIFT_NO IS NULL) THEN
//         	 MESSAGE(G$_NLS.Get('AOQCLIB-0017','FORM','*ERROR* Pledge number must match pledge number in key block.'));
//  	        RAISE FORM_TRIGGER_FAILURE;
//         END IF;
//      END IF;      
//      OPEN PTI_CURSOR3;
//      FETCH PTI_CURSOr3 INTO COUNT_GDES;
//      IF COUNT_GDES < 2 THEN
//         IF :GLOBAL.PLEDGE_NO IS NOT NULL THEN
//           IF :GLOBAL.PLEDGE_NO <> :AGRADTL_PLEDGE_NO AND :AGRADTL_PLEDGE_NO IS NOT NULL THEN
//         	    MESSAGE(G$_NLS.Get('AOQCLIB-0018','FORM','*ERROR* Pledge number must match pledge number in key block.'));
//  	          RAISE FORM_TRIGGER_FAILURE;
//           END IF;
//         END IF;
//      END IF;  
//	    CLOSE PTI_CURSOR3;    
//  END ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_PLEDGE_NO.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="AGRADTL_PLEDGE_NO")
//		public void agradtlPledgeNo_validate()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgradtlAdapter agradtlElement = (AgradtlAdapter)this.getFormModel().getAgradtl().getRowAdapter(true);
//
//
//				int rowCount = 0;
//				{
//					NNumber countGdes= NNumber.getNull();
//					NString ptiIntoTemp= NString.getNull();
//					String sqlptiCursor = "SELECT 'Y' " +
//	" FROM AGBPLDG " +
//	" WHERE AGBPLDG_PIDM = :KEY_BLOCK_PIDM AND AGBPLDG_PLEDGE_NO = :AGRADTL_PLEDGE_NO ";
//					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
//					String sqlptiCursor2 = "SELECT 'X' " +
//	" FROM AGRGDES " +
//	" WHERE AGRGDES_PIDM = :KEY_BLOCK_PIDM AND AGRGDES_GIFT_NO = :GLOBAL_GIFT_NO AND :AGRADTL_PLEDGE_NO = AGRGDES_PLEDGE_NO ";
//					DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
//					String sqlptiCursor3 = "SELECT COUNT(*) " +
//	" FROM AGRGDES " +
//	" WHERE AGRGDES_PIDM = :KEY_BLOCK_PIDM AND AGRGDES_GIFT_NO = :GLOBAL_GIFT_NO ";
//					DataCursor ptiCursor3 = new DataCursor(sqlptiCursor3);
//					try {
//						if ( !agradtlElement.getAgradtlPledgeNo().isNull() && agradtlElement.getAgradtlPledgeNo().notEquals("0000000") )
//						{
//							//Setting query parameters
//							ptiCursor.addParameter("KEY_BLOCK_PIDM", this.getModel()getValue(KEY_BLOCK,PIDM));
//							ptiCursor.addParameter("AGRADTL_PLEDGE_NO", agradtlElement.getAgradtlPledgeNo());
//							//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
//							ptiCursor.open();
//							ResultSet ptiCursorResults = ptiCursor.fetchInto();
//							if ( ptiCursorResults != null ) {
//								ptiIntoTemp = ptiCursorResults.getStr(0);
//							}
//							getContainer().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("AOQCLIB-0014"), toStr("FORM"), toStr("*ERROR* Pledge number does not exist; press LIST for pledge numbers.")), NBool.True);
//							ptiCursor.close();
//							if ( !getGlobal("GIFT_NO").isNull() )
//							{
//								//Setting query parameters
//								ptiCursor2.addParameter("KEY_BLOCK_PIDM", this.getModel()getValue(KEY_BLOCK,PIDM));
//								ptiCursor2.addParameter("GLOBAL_GIFT_NO", getGlobal("GIFT_NO"));
//								ptiCursor2.addParameter("AGRADTL_PLEDGE_NO", agradtlElement.getAgradtlPledgeNo());
//								//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor2.
//								ptiCursor2.open();
//								ResultSet ptiCursor2Results = ptiCursor2.fetchInto();
//								if ( ptiCursor2Results != null ) {
//									ptiIntoTemp = ptiCursor2Results.getStr(0);
//								}
//								getContainer().getGoqrpls().gCheckValue(ptiCursor2.notFound(), GNls.Fget(toStr("AOQCLIB-0015"), toStr("FORM"), toStr("*ERROR* Pledge number does not exist; press LIST for pledge numbers.")), NBool.True);
//								ptiCursor2.close();
//							}
//						}
//						if ( !getGlobal("PLEDGE_NO").isNull() )
//						{
//							// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//							if (((getGlobal("PLEDGE_NO").notEquals(agradtlElement.getAgradtlPledgeNo()) || agradtlElement.getAgradtlPledgeNo().isNull()) && ((getGlobal("GIFT_NO").isNull() || getGlobal("GIFT_NO").equals("0000000")) && !agradtlElement.getROWID().isNull())))
//							{
//								errorMessage(GNls.Fget(toStr("AOQCLIB-0016"), toStr("FORM"), toStr("*ERROR* Pledge number must match pledge number in key block.")));
//								throw new ApplicationException();
//							}
//						}
//						if ( !getGlobal("PLEDGE_NO").isNull() )
//						{
//							// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//							if (((getGlobal("PLEDGE_NO").notEquals(agradtlElement.getAgradtlPledgeNo()) || agradtlElement.getAgradtlPledgeNo().isNull()) && !getGlobal("PLEDGE_NO").isNull() && !agradtlElement.getROWID().isNull() && getGlobal("GIFT_NO").isNull()))
//							{
//								errorMessage(GNls.Fget(toStr("AOQCLIB-0017"), toStr("FORM"), toStr("*ERROR* Pledge number must match pledge number in key block.")));
//								throw new ApplicationException();
//							}
//						}
//						//Setting query parameters
//						ptiCursor3.addParameter("KEY_BLOCK_PIDM", this.getModel()getValue(KEY_BLOCK,PIDM));
//						ptiCursor3.addParameter("GLOBAL_GIFT_NO", getGlobal("GIFT_NO"));
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor3.
//						ptiCursor3.open();
//						ResultSet ptiCursor3Results = ptiCursor3.fetchInto();
//						if ( ptiCursor3Results != null ) {
//							countGdes = ptiCursor3Results.getNumber(0);
//						}
//						if ( countGdes.lesser(2) )
//						{
//							if ( !getGlobal("PLEDGE_NO").isNull() )
//							{
//								if ( getGlobal("PLEDGE_NO").notEquals(agradtlElement.getAgradtlPledgeNo()) && !agradtlElement.getAgradtlPledgeNo().isNull() )
//								{
//									errorMessage(GNls.Fget(toStr("AOQCLIB-0018"), toStr("FORM"), toStr("*ERROR* Pledge number must match pledge number in key block.")));
//									throw new ApplicationException();
//								}
//							}
//						}
//						ptiCursor3.close();
//					}
//					finally{
//						ptiCursor.close();
//						ptiCursor2.close();
//						ptiCursor3.close();
//					}
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_PLEDGE_NO.KEY-LISTVAL
//		 DECLARE
//	    COUNT_GDES           number;
//      CURSOR PTI_CURSOR IS
//         SELECT COUNT(*)
//         FROM   AGRGDES
//         WHERE  AGRGDES_PIDM = :KEY_BLOCK.PIDM
//           AND  AGRGDES_GIFT_NO = :GLOBAL.GIFT_NO ;
//BEGIN
//OPEN PTI_CURSOR;
//FETCH PTI_CURSOR INTO COUNT_GDES;
//IF COUNT_GDES > 1 THEN
//   G$_DISPLAY_LOV('AGRADTL_PLEDGE_NO','PLEDGE_NUM_LOV');
//   G$_CHECK_FAILURE;	
//ELSIF :GLOBAL.GIFT_NO IS NULL AND
//	    :AGRADTL_PLEDGE_NO IS NULL THEN
//	    :AGRADTL_PLEDGE_NO := :GLOBAL.PLEDGE_NO;	 
//ELSIF (:AGRADTL_PLEDGE_NO IS NULL OR
//	     :AGRADTL_PLEDGE_NO <> :GLOBAL.PLEDGE_NO) AND 
//	     :AGRADTL_GIFT_NO IS NULL AND
//	     :GLOBAL.PLEDGE_NO IS NOT NULL THEN
//	     :AGRADTL_PLEDGE_NO := :GLOBAL.PLEDGE_NO;
//ELSE	
//     G$_DISPLAY_LOV('','');
//     G$_CHECK_FAILURE;
//END IF;              
//END;       
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_PLEDGE_NO.KEY-LISTVAL
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-LISTVAL", item="AGRADTL_PLEDGE_NO", function=KeyFunction.LIST_VALUES)
//		public void agradtlPledgeNo_ListValues()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgradtlAdapter agradtlElement = (AgradtlAdapter)this.getFormModel().getAgradtl().getRowAdapter(true);
//
//
//				int rowCount = 0;
//				{
//					NNumber countGdes= NNumber.getNull();
//					String sqlptiCursor = "SELECT COUNT(*) " +
//	" FROM AGRGDES " +
//	" WHERE AGRGDES_PIDM = :KEY_BLOCK_PIDM AND AGRGDES_GIFT_NO = :GLOBAL_GIFT_NO ";
//					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
//					try {
//						//Setting query parameters
//						ptiCursor.addParameter("KEY_BLOCK_PIDM", this.getModel()getValue(KEY_BLOCK,PIDM));
//						ptiCursor.addParameter("GLOBAL_GIFT_NO", getGlobal("GIFT_NO"));
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
//						ptiCursor.open();
//						ResultSet ptiCursorResults = ptiCursor.fetchInto();
//						if ( ptiCursorResults != null ) {
//							countGdes = ptiCursorResults.getNumber(0);
//						}
//						if ( countGdes.greater(1) )
//						{
//							gDisplayLov("AGRADTL_PLEDGE_NO", "PLEDGE_NUM_LOV");
//							getContainer().getGoqrpls().gCheckFailure();
//						}
//						else if ( getGlobal("GIFT_NO").isNull() && agradtlElement.getAgradtlPledgeNo().isNull() ) {
//							agradtlElement.setAgradtlPledgeNo(getGlobal("PLEDGE_NO"));
//						}
//						else if ( (agradtlElement.getAgradtlPledgeNo().isNull() || agradtlElement.getAgradtlPledgeNo().notEquals(getGlobal("PLEDGE_NO"))) && agradtlElement.getAgradtlGiftNo().isNull() && !getGlobal("PLEDGE_NO").isNull() ) {
//							agradtlElement.setAgradtlPledgeNo(getGlobal("PLEDGE_NO"));
//						}
//						else {
//							gDisplayLov("", "");
//							getContainer().getGoqrpls().gCheckFailure();
//						}
//					}
//					finally{
//						ptiCursor.close();
//					}
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_GIFT_NO.KEY-NEXT-ITEM
//		 BEGIN
//  NEXT_ITEM;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_GIFT_NO.KEY-NEXT-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-NEXT-ITEM", item="AGRADTL_GIFT_NO", function=KeyFunction.NEXT_ITEM)
//		public void agradtlGiftNo_keyNexItem()
//		{
//			
//				nextItem();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_GIFT_NO.WHEN-MOUSE-DOUBLECLICK
//		 BEGIN
//  G$_SEARCH.WHEN_MOUSE_CLICK;
//  G$_CHECK_FAILURE;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_GIFT_NO.WHEN-MOUSE-DOUBLECLICK
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="AGRADTL_GIFT_NO")
//		public void agradtlGiftNo_doubleClick()
//		{
//			
//				GSearch.whenMouseClick;
//				getContainer().getGoqrpls().gCheckFailure();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_GIFT_NO.G$_SEARCH_PARAMETERS
//		 BEGIN
//  G$_SEARCH.PARAMETERS('','','');
//END;
//
//
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_GIFT_NO.G$_SEARCH_PARAMETERS
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="AGRADTL_GIFT_NO")
//		public void agradtlGiftNo_GSearchParameters()
//		{
//			
//				GSearch.parameters("", "", "");
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_GIFT_NO.G$_SEARCH_OPTIONS
//		 BEGIN
//  DO_KEY('LIST_VALUES');
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_GIFT_NO.G$_SEARCH_OPTIONS
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="AGRADTL_GIFT_NO")
//		public void agradtlGiftNo_GSearchOptions()
//		{
//			
//				executeAction(KeyFunction.LIST_VALUES);
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_GIFT_NO.WHEN-VALIDATE-ITEM
//		   DECLARE
//  	  COUNT_GDES           number;
//      PTI_INTO_TEMP        VARCHAR2(255);
//      CURSOR PTI_CURSOR IS
//         SELECT 'Y'
//         FROM   AGBGIFT
//         WHERE  AGBGIFT_PIDM = :KEY_BLOCK.PIDM
//           AND  AGBGIFT_GIFT_NO = :AGRADTL_GIFT_NO ;
//      CURSOR PTI_CURSOR2 IS
//         SELECT COUNT(*)
//         FROM   AGRGDES
//         WHERE  AGRGDES_PIDM = :KEY_BLOCK.PIDM
//           AND  AGRGDES_GIFT_NO = :GLOBAL.GIFT_NO ;       
//  BEGIN
//      IF :AGRADTL_GIFT_NO is not null then
//        OPEN PTI_CURSOR ;
//        FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
//        G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,  
//                        G$_NLS.Get('AOQCLIB-0019', 'FORM',
//                                   '*ERROR* Gift number does not exist; press LIST for gift numbers.'), TRUE);
//        CLOSE PTI_CURSOR;
//      END IF;
//      IF :GLOBAL.GIFT_NO IS NOT NULL THEN
//         IF ((:GLOBAL.GIFT_NO <> :AGRADTL_GIFT_NO -- OR :AGRADTL_GIFT_NO IS NULL  -- Defect#1-G9OURZ 
//         	    ) AND ((:GLOBAL.PLEDGE_NO IS NULL OR :GLOBAL.PLEDGE_NO = '0000000')AND :AGRADTL.ROWID IS NOT NULL)) THEN
//         	 MESSAGE(G$_NLS.Get('AOQCLIB-0020','FORM','*ERROR* Gift number must match gift number in key block.'));
//  	        RAISE FORM_TRIGGER_FAILURE;
//         END IF;
//         -- Begin defect#1-G9OUS1 added code    
//         IF (:GLOBAL.GIFT_NO <> :AGRADTL_GIFT_NO AND :AGRADTL_GIFT_NO IS NOT NULL) THEN
//         	 MESSAGE(G$_NLS.Get('AOQCLIB-0021','FORM','*ERROR* Gift number must match gift number in key block.'));
//  	        RAISE FORM_TRIGGER_FAILURE;
//         END IF;
//         -- Begin defect#1-G9OUS1 added code    
//      END IF;      
//      IF :GLOBAL.GIFT_NO IS NOT NULL THEN
//         IF ((:GLOBAL.GIFT_NO <> :AGRADTL_GIFT_NO -- OR :AGRADTL_GIFT_NO IS NULL  -- Defect#1-G9OURZ 
//         	    ) AND :GLOBAL.GIFT_NO IS NOT NULL AND :AGRADTL.ROWID IS NOT NULL AND :GLOBAL.PLEDGE_NO IS NULL) THEN
//         	 MESSAGE(G$_NLS.Get('AOQCLIB-0022','FORM','*ERROR* Gift number must match gift number in key block.'));
//  	        RAISE FORM_TRIGGER_FAILURE;
//         END IF;
//      END IF;
//      OPEN PTI_CURSOR2;
//      FETCH PTI_CURSOR2 INTO COUNT_GDES;
//      IF COUNT_GDES < 2 THEN
//         IF :GLOBAL.GIFT_NO IS NOT NULL THEN
//           IF :GLOBAL.GIFT_NO <> :AGRADTL_GIFT_NO AND :AGRADTL_GIFT_NO IS NOT NULL THEN
//         	    MESSAGE(G$_NLS.Get('AOQCLIB-0023','FORM','*ERROR* Gift number must match gift number in key block.'));
//  	          RAISE FORM_TRIGGER_FAILURE;
//           END IF;
//         END IF;
//      END IF;  
//	    CLOSE PTI_CURSOR2;
//   END ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_GIFT_NO.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="AGRADTL_GIFT_NO")
//		public void agradtlGiftNo_validate()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgradtlAdapter agradtlElement = (AgradtlAdapter)this.getFormModel().getAgradtl().getRowAdapter(true);
//
//
//				int rowCount = 0;
//				{
//					NNumber countGdes= NNumber.getNull();
//					NString ptiIntoTemp= NString.getNull();
//					String sqlptiCursor = "SELECT 'Y' " +
//	" FROM AGBGIFT " +
//	" WHERE AGBGIFT_PIDM = :KEY_BLOCK_PIDM AND AGBGIFT_GIFT_NO = :AGRADTL_GIFT_NO ";
//					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
//					String sqlptiCursor2 = "SELECT COUNT(*) " +
//	" FROM AGRGDES " +
//	" WHERE AGRGDES_PIDM = :KEY_BLOCK_PIDM AND AGRGDES_GIFT_NO = :GLOBAL_GIFT_NO ";
//					DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
//					try {
//						if ( !agradtlElement.getAgradtlGiftNo().isNull() )
//						{
//							//Setting query parameters
//							ptiCursor.addParameter("KEY_BLOCK_PIDM", this.getModel()getValue(KEY_BLOCK,PIDM));
//							ptiCursor.addParameter("AGRADTL_GIFT_NO", agradtlElement.getAgradtlGiftNo());
//							//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
//							ptiCursor.open();
//							ResultSet ptiCursorResults = ptiCursor.fetchInto();
//							if ( ptiCursorResults != null ) {
//								ptiIntoTemp = ptiCursorResults.getStr(0);
//							}
//							getContainer().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("AOQCLIB-0019"), toStr("FORM"), toStr("*ERROR* Gift number does not exist; press LIST for gift numbers.")), NBool.True);
//							ptiCursor.close();
//						}
//						if ( !getGlobal("GIFT_NO").isNull() )
//						{
//							// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//							if (((getGlobal("GIFT_NO").notEquals(agradtlElement.getAgradtlGiftNo())) && ((getGlobal("PLEDGE_NO").isNull() || getGlobal("PLEDGE_NO").equals("0000000")) && !agradtlElement.getROWID().isNull())))
//							{
//								errorMessage(GNls.Fget(toStr("AOQCLIB-0020"), toStr("FORM"), toStr("*ERROR* Gift number must match gift number in key block.")));
//								throw new ApplicationException();
//							}
//							//  Begin defect#1-G9OUS1 added code    
//							if ((getGlobal("GIFT_NO").notEquals(agradtlElement.getAgradtlGiftNo()) && !agradtlElement.getAgradtlGiftNo().isNull()))
//							{
//								errorMessage(GNls.Fget(toStr("AOQCLIB-0021"), toStr("FORM"), toStr("*ERROR* Gift number must match gift number in key block.")));
//								throw new ApplicationException();
//							}
//						}
//						if ( !getGlobal("GIFT_NO").isNull() )
//						{
//							// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//							if (((getGlobal("GIFT_NO").notEquals(agradtlElement.getAgradtlGiftNo())) && !getGlobal("GIFT_NO").isNull() && !agradtlElement.getROWID().isNull() && getGlobal("PLEDGE_NO").isNull()))
//							{
//								errorMessage(GNls.Fget(toStr("AOQCLIB-0022"), toStr("FORM"), toStr("*ERROR* Gift number must match gift number in key block.")));
//								throw new ApplicationException();
//							}
//						}
//						//Setting query parameters
//						ptiCursor2.addParameter("KEY_BLOCK_PIDM", this.getModel()getValue(KEY_BLOCK,PIDM));
//						ptiCursor2.addParameter("GLOBAL_GIFT_NO", getGlobal("GIFT_NO"));
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor2.
//						ptiCursor2.open();
//						ResultSet ptiCursor2Results = ptiCursor2.fetchInto();
//						if ( ptiCursor2Results != null ) {
//							countGdes = ptiCursor2Results.getNumber(0);
//						}
//						if ( countGdes.lesser(2) )
//						{
//							if ( !getGlobal("GIFT_NO").isNull() )
//							{
//								if ( getGlobal("GIFT_NO").notEquals(agradtlElement.getAgradtlGiftNo()) && !agradtlElement.getAgradtlGiftNo().isNull() )
//								{
//									errorMessage(GNls.Fget(toStr("AOQCLIB-0023"), toStr("FORM"), toStr("*ERROR* Gift number must match gift number in key block.")));
//									throw new ApplicationException();
//								}
//							}
//						}
//						ptiCursor2.close();
//					}
//					finally{
//						ptiCursor.close();
//						ptiCursor2.close();
//					}
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_GIFT_NO.KEY-LISTVAL
//		 IF :GLOBAL.PLEDGE_NO IS NULL AND
//	 :AGRADTL_GIFT_NO IS NULL THEN
//	 :AGRADTL_GIFT_NO := :GLOBAL.GIFT_NO;
//ELSIF (:AGRADTL_GIFT_NO IS NULL OR
//	     :AGRADTL_GIFT_NO <> :GLOBAL.GIFT_NO) AND 
//	     :AGRADTL_PLEDGE_NO IS NULL AND
//	     :GLOBAL.GIFT_NO IS NOT NULL THEN
//	     :AGRADTL_GIFT_NO := :GLOBAL.GIFT_NO;
//ELSE  
//  G$_DISPLAY_LOV('','');
//  G$_CHECK_FAILURE;
//END IF;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_GIFT_NO.KEY-LISTVAL
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-LISTVAL", item="AGRADTL_GIFT_NO", function=KeyFunction.LIST_VALUES)
//		public void agradtlGiftNo_ListValues()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgradtlAdapter agradtlElement = (AgradtlAdapter)this.getFormModel().getAgradtl().getRowAdapter(true);
//
//
//				if ( getGlobal("PLEDGE_NO").isNull() && agradtlElement.getAgradtlGiftNo().isNull() )
//				{
//					agradtlElement.setAgradtlGiftNo(getGlobal("GIFT_NO"));
//				}
//				else if ( (agradtlElement.getAgradtlGiftNo().isNull() || agradtlElement.getAgradtlGiftNo().notEquals(getGlobal("GIFT_NO"))) && agradtlElement.getAgradtlPledgeNo().isNull() && !getGlobal("GIFT_NO").isNull() ) {
//					agradtlElement.setAgradtlGiftNo(getGlobal("GIFT_NO"));
//				}
//				else {
//					gDisplayLov("", "");
//					getContainer().getGoqrpls().gCheckFailure();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_COMMENT_BTN.WHEN-MOUSE-CLICK
//		 BEGIN
//  NULL;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_COMMENT_BTN.WHEN-MOUSE-CLICK
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="AGRADTL_COMMENT_BTN")
//		@Before
//		public void agradtlCommentBtn_click()
//		{
//			
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_COMMENT_BTN.WHEN-BUTTON-PRESSED
//		 go_item('AGRADTL_COMMENT');
//edit_textitem;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_COMMENT_BTN.WHEN-BUTTON-PRESSED
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="AGRADTL_COMMENT_BTN")
//		public void agradtlCommentBtn_buttonClick()
//		{
//			
//				goItem(toStr("AGRADTL_COMMENT"));
//				// F2J_NOT_SUPPORTED : Call to built-in "EDIT_TEXTITEM" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\AOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
//				//				SupportClasses.FORMS40.EditTextitem();
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'EDIT_TEXTITEM' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\AOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
//				
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_ACTIVITY_DATE.KEY-NEXT-ITEM
//		 BEGIN
//  G$_DATE_NEXT_ITEM;
//  G$_CHECK_FAILURE;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_ACTIVITY_DATE.KEY-NEXT-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-NEXT-ITEM", item="AGRADTL_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
//		public void agradtlActivityDate_keyNexItem()
//		{
//			
//				gDateNextItem;
//				getContainer().getGoqrpls().gCheckFailure();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
//		 BEGIN
//  G$_DATE_WHEN_NEW_ITEM;
//  G$_CHECK_FAILURE;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="AGRADTL_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
//		public void agradtlActivityDate_itemChange()
//		{
//			
//				gDateWhenNewItem;
//				getContainer().getGoqrpls().gCheckFailure();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRADTL_ACTIVITY_DATE.POST-TEXT-ITEM
//		 BEGIN
//  G$_DATE_POST_ITEM;
//  G$_CHECK_FAILURE;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRADTL_ACTIVITY_DATE.POST-TEXT-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-TEXT-ITEM", item="AGRADTL_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
//		public void agradtlActivityDate_itemOut()
//		{
//			
//				gDatePostItem;
//				getContainer().getGoqrpls().gCheckFailure();
//			}
//
//		
	
	
}

