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
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
		
public class AgrpgbeController extends AbstractSupportCodeObject {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	

	
	public AgrpgbeController(ITask task) {
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
	
		/* Original PL/SQL code code for TRIGGER AGRPGBE.ON-UPDATE
		 	-- Strip null characters from the field, which are not visible.
	:AGRPGBE.AGRPGBE_COMMENT := substr(replace(:AGRPGBE.AGRPGBE_COMMENT,chr(0),''),1,32767);  

	IF (LENGTH(REPLACE(:AGRPGBE.AGRPGBE_COMMENT,' ','')) IS NULL ) THEN
     :AGRPGBE.AGRPGBE_COMMENT:=EMPTY_CLOB();
	END IF;
	--
BEGIN	
	UPDATE AGRPGBE SET	   
	       AGRPGBE_PIDM           = :AGRPGBE_PIDM,          
         AGRPGBE_USER_ID        = :AGRPGBE_USER_ID, 
         AGRPGBE_ACTIVITY_DATE  = :AGRPGBE_ACTIVITY_DATE,                 
         AGRPGBE_PGBE_PIDM      = :AGRPGBE_PGBE_PIDM,                               
         AGRPGBE_XREF_CODE      = :AGRPGBE_XREF_CODE,                                
         AGRPGBE_PLEDGE_NO      = :AGRPGBE_PLEDGE_NO,                              
         AGRPGBE_GIFT_NO        = :AGRPGBE_GIFT_NO,                                 
         AGRPGBE_SURNAME_PREFIX = :AGRPGBE_SURNAME_PREFIX,                            
         AGRPGBE_LAST_NAME      = :AGRPGBE_LAST_NAME,                                
         AGRPGBE_FIRST_NAME     = :AGRPGBE_FIRST_NAME,                                
         AGRPGBE_MI             = :AGRPGBE_MI,                                   
         AGRPGBE_SEX            = :AGRPGBE_SEX,                               
         AGRPGBE_BIRTH_DATE     = :AGRPGBE_BIRTH_DATE,                              
         AGRPGBE_DECEASED_IND   = :AGRPGBE_DECEASED_IND,                              
         AGRPGBE_DECEASED_DATE  = :AGRPGBE_DECEASED_DATE,                            
         AGRPGBE_COMMENT        = :AGRPGBE_COMMENT
  WHERE AGRPGBE.rowid = :AGRPGBE.rowid ;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AGRPGBE.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

//		@RowUpdate
//		public void agrpgbe_RowUpdate(RowAdapterEvent args)
//		{
//			
//				//  Strip null characters from the field, which are not visible.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)args.getRow();
//
//
//				int rowCount = 0;
//				//  Strip null characters from the field, which are not visible.
//				agrpgbeElement.setAgrpgbeComment(substring(replace(agrpgbeElement.getAgrpgbeComment(), chr(0), ""), toInt(1), toInt(32767)));
//				if ((length(replace(agrpgbeElement.getAgrpgbeComment(), " ", "")).isNull()))
//				{
//					// F2J_NOT_SUPPORTED : Call to built-in "EMPTY_CLOB" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\AOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//					//					agrpgbeElement.setAgrpgbeComment(SupportClasses.STANDARD.EmptyClob());
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'EMPTY_CLOB' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\AOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//					
//				}
//				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//				String sql1 = "UPDATE AGRPGBE " +
//	"SET AGRPGBE_PIDM = :AGRPGBE_PIDM, AGRPGBE_USER_ID = :AGRPGBE_USER_ID, AGRPGBE_ACTIVITY_DATE = :AGRPGBE_ACTIVITY_DATE, AGRPGBE_PGBE_PIDM = :AGRPGBE_PGBE_PIDM, AGRPGBE_XREF_CODE = :AGRPGBE_XREF_CODE, AGRPGBE_PLEDGE_NO = :AGRPGBE_PLEDGE_NO, AGRPGBE_GIFT_NO = :AGRPGBE_GIFT_NO, AGRPGBE_SURNAME_PREFIX = :AGRPGBE_SURNAME_PREFIX, AGRPGBE_LAST_NAME = :AGRPGBE_LAST_NAME, AGRPGBE_FIRST_NAME = :AGRPGBE_FIRST_NAME, AGRPGBE_MI = :AGRPGBE_MI, AGRPGBE_SEX = :AGRPGBE_SEX, AGRPGBE_BIRTH_DATE = :AGRPGBE_BIRTH_DATE, AGRPGBE_DECEASED_IND = :AGRPGBE_DECEASED_IND, AGRPGBE_DECEASED_DATE = :AGRPGBE_DECEASED_DATE, AGRPGBE_COMMENT = :AGRPGBE_COMMENT " +
//	" WHERE AGRPGBE.rowid = :AGRPGBE_ROWID";
//				DataCommand command1 = new DataCommand(sql1);
//				//Setting query parameters
//				command1.addParameter("AGRPGBE_PIDM", agrpgbeElement.getAgrpgbePidm());
//				command1.addParameter("AGRPGBE_USER_ID", agrpgbeElement.getAgrpgbeUserId());
//				command1.addParameter("AGRPGBE_ACTIVITY_DATE", agrpgbeElement.getAgrpgbeActivityDate());
//				command1.addParameter("AGRPGBE_PGBE_PIDM", agrpgbeElement.getAgrpgbePgbePidm());
//				command1.addParameter("AGRPGBE_XREF_CODE", agrpgbeElement.getAgrpgbeXrefCode());
//				command1.addParameter("AGRPGBE_PLEDGE_NO", agrpgbeElement.getAgrpgbePledgeNo());
//				command1.addParameter("AGRPGBE_GIFT_NO", agrpgbeElement.getAgrpgbeGiftNo());
//				command1.addParameter("AGRPGBE_SURNAME_PREFIX", agrpgbeElement.getAgrpgbeSurnamePrefix());
//				command1.addParameter("AGRPGBE_LAST_NAME", agrpgbeElement.getAgrpgbeLastName());
//				command1.addParameter("AGRPGBE_FIRST_NAME", agrpgbeElement.getAgrpgbeFirstName());
//				command1.addParameter("AGRPGBE_MI", agrpgbeElement.getAgrpgbeMi());
//				command1.addParameter("AGRPGBE_SEX", agrpgbeElement.getAgrpgbeSex());
//				command1.addParameter("AGRPGBE_BIRTH_DATE", agrpgbeElement.getAgrpgbeBirthDate());
//				command1.addParameter("AGRPGBE_DECEASED_IND", agrpgbeElement.getAgrpgbeDeceasedInd());
//				command1.addParameter("AGRPGBE_DECEASED_DATE", agrpgbeElement.getAgrpgbeDeceasedDate());
//				command1.addParameter("AGRPGBE_COMMENT", agrpgbeElement.getAgrpgbeComment());
//				command1.addParameter("AGRPGBE_ROWID", agrpgbeElement.getROWID());
//				rowCount = command1.execute();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.ON-INSERT
//		 	-- Strip null characters from the field, which are not visible.
//	:AGRPGBE.AGRPGBE_COMMENT := substr(replace(:AGRPGBE.AGRPGBE_COMMENT,chr(0),''),1,32767);  
//
//	IF (LENGTH(REPLACE(:AGRPGBE.AGRPGBE_COMMENT,' ','')) IS NULL ) THEN
//     :AGRPGBE.AGRPGBE_COMMENT:=EMPTY_CLOB();
//	END IF;
//--
//--DECLARE
//-- agrpgbe_rec     agrpgbe%rowtype;
//BEGIN	
//--  agrpgbe_rec.agrpgbe_pidm           := :AGRPGBE_PIDM;          
//--  agrpgbe_rec.agrpgbe_user_id        := :AGRPGBE_USER_ID; 
//--  agrpgbe_rec.agrpgbe_data_origin    := :AGRPGBE_DATA_ORIGIN;
//--  agrpgbe_rec.agrpgbe_activity_date  := :AGRPGBE_ACTIVITY_DATE; 
//--  agrpgbe_rec.agrpgbe_pgbe_pidm      := :AGRPGBE_PGBE_PIDM;                          
//--  agrpgbe_rec.agrpgbe_xref_code      := :AGRPGBE_XREF_CODE;                           
//--  agrpgbe_rec.agrpgbe_pledge_no      := :AGRPGBE_PLEDGE_NO;                              
//--  agrpgbe_rec.agrpgbe_gift_no        := :AGRPGBE_GIFT_NO;                           
//--  agrpgbe_rec.agrpgbe_surname_prefix := :AGRPGBE_SURNAME_PREFIX;
//--  agrpgbe_rec.agrpgbe_last_name      := :AGRPGBE_LAST_NAME;
//--  agrpgbe_rec.agrpgbe_first_name     := :AGRPGBE_FIRST_NAME;
//--  agrpgbe_rec.agrpgbe_mi             := :AGRPGBE_MI;
//--  agrpgbe_rec.agrpgbe_sex            := :AGRPGBE_SEX;
//--  agrpgbe_rec.agrpgbe_birth_date     := :AGRPGBE_BIRTH_DATE;
//--  agrpgbe_rec.agrpgbe_deceased_ind   := :AGRPGBE_DECEASED_IND;
//--  agrpgbe_rec.agrpgbe_deceased_date  := :AGRPGBE_DECEASED_DATE;
//--  agrpgbe_rec.agrpgbe_comment        := :AGRPGBE_COMMENT;
//    
//--  dml_agrpgbe.p_insert( agrpgbe_rec, :agrpgbe.ROWID ); 
//    dml_agrpgbe.p_insert( :AGRPGBE_PIDM, :AGRPGBE_USER_ID, :AGRPGBE_DATA_ORIGIN,
//                          :AGRPGBE_ACTIVITY_DATE, :AGRPGBE_PGBE_PIDM, :AGRPGBE_XREF_CODE,
//                          :AGRPGBE_PLEDGE_NO, :AGRPGBE_GIFT_NO, :AGRPGBE_SURNAME_PREFIX,
//                          :AGRPGBE_LAST_NAME, :AGRPGBE_FIRST_NAME, :AGRPGBE_MI,
//                          :AGRPGBE_SEX, :AGRPGBE_BIRTH_DATE, :AGRPGBE_DECEASED_IND,
//                          :AGRPGBE_DECEASED_DATE, :AGRPGBE_COMMENT, :AGRPGBE.ROWID);     
//                             
//    :agrpgbe_activity_date := TO_DATE(G$_RESYNCH_RECORD(:agrpgbe.ROWID),'DDMONYYYYHH24MISS');
//
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.ON-INSERT
//		 *
//		 *
//		 *</p>
//		 * @param args
//		*/
//
//		@RowInsert
//		public void agrpgbe_RowInsert(RowAdapterEvent args)
//		{
//			
//				//  Strip null characters from the field, which are not visible.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)args.getRow();
//
//
//				//  Strip null characters from the field, which are not visible.
//				agrpgbeElement.setAgrpgbeComment(substring(replace(agrpgbeElement.getAgrpgbeComment(), chr(0), ""), toInt(1), toInt(32767)));
//				if ((length(replace(agrpgbeElement.getAgrpgbeComment(), " ", "")).isNull()))
//				{
//					// F2J_NOT_SUPPORTED : Call to built-in "EMPTY_CLOB" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\AOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//					//					agrpgbeElement.setAgrpgbeComment(SupportClasses.STANDARD.EmptyClob());
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'EMPTY_CLOB' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\AOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//					
//				}
//				//   agrpgbe_rec.agrpgbe_pidm           := :AGRPGBE_PIDM;          
//				//   agrpgbe_rec.agrpgbe_user_id        := :AGRPGBE_USER_ID; 
//				//   agrpgbe_rec.agrpgbe_data_origin    := :AGRPGBE_DATA_ORIGIN;
//				//   agrpgbe_rec.agrpgbe_activity_date  := :AGRPGBE_ACTIVITY_DATE; 
//				//   agrpgbe_rec.agrpgbe_pgbe_pidm      := :AGRPGBE_PGBE_PIDM;                          
//				//   agrpgbe_rec.agrpgbe_xref_code      := :AGRPGBE_XREF_CODE;                           
//				//   agrpgbe_rec.agrpgbe_pledge_no      := :AGRPGBE_PLEDGE_NO;                              
//				//   agrpgbe_rec.agrpgbe_gift_no        := :AGRPGBE_GIFT_NO;                           
//				//   agrpgbe_rec.agrpgbe_surname_prefix := :AGRPGBE_SURNAME_PREFIX;
//				//   agrpgbe_rec.agrpgbe_last_name      := :AGRPGBE_LAST_NAME;
//				//   agrpgbe_rec.agrpgbe_first_name     := :AGRPGBE_FIRST_NAME;
//				//   agrpgbe_rec.agrpgbe_mi             := :AGRPGBE_MI;
//				//   agrpgbe_rec.agrpgbe_sex            := :AGRPGBE_SEX;
//				//   agrpgbe_rec.agrpgbe_birth_date     := :AGRPGBE_BIRTH_DATE;
//				//   agrpgbe_rec.agrpgbe_deceased_ind   := :AGRPGBE_DECEASED_IND;
//				//   agrpgbe_rec.agrpgbe_deceased_date  := :AGRPGBE_DECEASED_DATE;
//				//   agrpgbe_rec.agrpgbe_comment        := :AGRPGBE_COMMENT;
//				//   dml_agrpgbe.p_insert( agrpgbe_rec, :agrpgbe.ROWID ); 
//				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//				Ref<NString> p_rowid_out_ref = new Ref<NString>(DbManager.getDataBaseFactory().rowidToString(agrpgbeElement.getROWID()));
//				DmlAgrpgbe.pInsert(agrpgbeElement.getAgrpgbePidm(), agrpgbeElement.getAgrpgbeUserId(), agrpgbeElement.getAgrpgbeDataOrigin(), agrpgbeElement.getAgrpgbeActivityDate(), agrpgbeElement.getAgrpgbePgbePidm(), agrpgbeElement.getAgrpgbeXrefCode(), agrpgbeElement.getAgrpgbePledgeNo(), agrpgbeElement.getAgrpgbeGiftNo(), agrpgbeElement.getAgrpgbeSurnamePrefix(), agrpgbeElement.getAgrpgbeLastName(), agrpgbeElement.getAgrpgbeFirstName(), agrpgbeElement.getAgrpgbeMi(), agrpgbeElement.getAgrpgbeSex(), agrpgbeElement.getAgrpgbeBirthDate(), agrpgbeElement.getAgrpgbeDeceasedInd(), agrpgbeElement.getAgrpgbeDeceasedDate(), agrpgbeElement.getAgrpgbeComment(), p_rowid_out_ref);
//				agrpgbeElement.setROWID(p_rowid_out_ref.val);
//				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//				agrpgbeElement.setAgrpgbeActivityDate(toDate(gResynchRecord(agrpgbeElement.getROWID()), "DDMONYYYYHH24MISS"));
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.DISABLE_SEX
//		 SET_ITEM_PROPERTY('PGBE_SEX',ENABLED,PROPERTY_OFF);
//
//
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.DISABLE_SEX
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="DISABLE_SEX")
//		public void agrpgbe_DisableSex()
//		{
//			
//				setItemEnabled("PGBE_SEX", false);
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.ENABLE_SEX
//		 IF  GET_ITEM_PROPERTY('PGBE_SEX',ENABLED)='FALSE' THEN
//    SET_ITEM_PROPERTY('PGBE_SEX',ENABLED,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_SEX',NAVIGABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_SEX',UPDATEABLE,PROPERTY_ON);
//END IF;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.ENABLE_SEX
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="ENABLE_SEX")
//		public void agrpgbe_EnableSex()
//		{
//			
//				if ( getItemEnabled("PGBE_SEX").equals("FALSE") )
//				{
//					setItemEnabled("PGBE_SEX", true);
//					setItemNavigable("PGBE_SEX", true);
//					setItemUpdateAllowed("PGBE_SEX", true);
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.REQ_LAST_NAME
//		 --
//   IF :PGBE_LAST_NAME IS NULL  THEN
//      MESSAGE (  G$_NLS.Get('AOQCLIB-0024', 'FORM','*ERROR* Last name is required.')  ) ;
//      RAISE FORM_TRIGGER_FAILURE ;
//   END IF ;
//--
//   IF :PGBE_ID IS NULL  THEN
//      IF :PGBE_FIRST_NAME IS NULL  THEN
//         MESSAGE (  G$_NLS.Get('AOQCLIB-0025', 'FORM','*ERROR* First name required if no ID exists.')  );
//         RAISE FORM_TRIGGER_FAILURE ;
//      END IF ;
//   END IF ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.REQ_LAST_NAME
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="REQ_LAST_NAME")
//		public void agrpgbe_ReqLastName()
//		{
//			
//				// 
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				// 
//				if ( agrpgbeElement.getPgbeLastName().isNull() )
//				{
//					errorMessage(GNls.Fget(toStr("AOQCLIB-0024"), toStr("FORM"), toStr("*ERROR* Last name is required.")));
//					throw new ApplicationException();
//				}
//				// 
//				if ( agrpgbeElement.getPgbeId().isNull() )
//				{
//					if ( agrpgbeElement.getPgbeFirstName().isNull() )
//					{
//						errorMessage(GNls.Fget(toStr("AOQCLIB-0025"), toStr("FORM"), toStr("*ERROR* First name required if no ID exists.")));
//						throw new ApplicationException();
//					}
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.WHEN-NEW-RECORD-INSTANCE
//		 GO_ITEM('AGRPGBE.PGBE_ID');
//--
//IF :AGRPGBE.PGBE_ID IS NOT NULL THEN
//    EXECUTE_TRIGGER( 'DISABLE_SEX' ) ;
//    G$_CHECK_FAILURE ;
//
//    SET_ITEM_PROPERTY('PGBE_FIRST_NAME',ENABLED,PROPERTY_OFF);
//    SET_ITEM_PROPERTY('PGBE_MI',ENABLED,PROPERTY_OFF);
//    IF  GET_ITEM_PROPERTY('PGBE_SURNAME_PREFIX', VISIBLE) = 'TRUE' 
//    AND GET_ITEM_PROPERTY('PGBE_SURNAME_PREFIX',ENABLED) = 'TRUE' THEN
//        SET_ITEM_PROPERTY('PGBE_SURNAME_PREFIX',ENABLED,PROPERTY_OFF);
//    END IF;    
//    SET_ITEM_PROPERTY('PGBE_LAST_NAME',ENABLED,PROPERTY_OFF);
//    SET_ITEM_PROPERTY('PGBE_BIRTH_DATE',ENABLED,PROPERTY_OFF);
//    SET_ITEM_PROPERTY('PGBE_ID_LBT',ENABLED,PROPERTY_OFF);
//    SET_ITEM_PROPERTY('PGBE_DECEASED_IND',ENABLED,PROPERTY_OFF);
//    SET_ITEM_PROPERTY('PGBE_DECEASED_DATE',ENABLED,PROPERTY_OFF);
//    SET_ITEM_PROPERTY('PGBE_BIRTH_DATE_DBT',ENABLED,PROPERTY_OFF);
//    SET_ITEM_PROPERTY('PGBE_DECEASED_DATE_DBT',ENABLED,PROPERTY_OFF);
//ELSE
//    SET_ITEM_PROPERTY('PGBE_FIRST_NAME',ENABLED,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_FIRST_NAME',NAVIGABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_FIRST_NAME',UPDATEABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_MI',ENABLED,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_MI',NAVIGABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_MI',UPDATEABLE,PROPERTY_ON);    
//    SET_ITEM_PROPERTY('PGBE_LAST_NAME',ENABLED,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_LAST_NAME',NAVIGABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_LAST_NAME',UPDATEABLE,PROPERTY_ON);
//    IF  GET_ITEM_PROPERTY('PGBE_SURNAME_PREFIX', VISIBLE) = 'TRUE' 
//    AND GET_ITEM_PROPERTY('PGBE_SURNAME_PREFIX',ENABLED) = 'FALSE' THEN
//        SET_ITEM_PROPERTY('PGBE_SURNAME_PREFIX',ENABLED,PROPERTY_ON);
//        SET_ITEM_PROPERTY('PGBE_SURNAME_PREFIX',NAVIGABLE,PROPERTY_ON);
//        SET_ITEM_PROPERTY('PGBE_SURNAME_PREFIX',UPDATEABLE,PROPERTY_ON);
//    END IF; 
//    EXECUTE_TRIGGER( 'ENABLE_SEX' ) ;
//    G$_CHECK_FAILURE ;
//    SET_ITEM_PROPERTY('PGBE_BIRTH_DATE',ENABLED,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_BIRTH_DATE',NAVIGABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_BIRTH_DATE',UPDATEABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_ID_LBT',ENABLED,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_DECEASED_IND',ENABLED,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_DECEASED_IND',NAVIGABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_DECEASED_IND',UPDATEABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_DECEASED_DATE',ENABLED,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_DECEASED_DATE',NAVIGABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_DECEASED_DATE',UPDATEABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_BIRTH_DATE_DBT',ENABLED,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_DECEASED_DATE_DBT',ENABLED,PROPERTY_ON);
//END IF;
//--
//
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.WHEN-NEW-RECORD-INSTANCE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
//		@After
//		public void agrpgbe_recordChange()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				goItem(toStr("AGRPGBE.PGBE_ID"));
//				// 
//				if ( !agrpgbeElement.getPgbeId().isNull() )
//				{
//					executeAction("DISABLE_SEX");
//					getContainer().getGoqrpls().gCheckFailure();
//					setItemEnabled("PGBE_FIRST_NAME", false);
//					setItemEnabled("PGBE_MI", false);
//					if ( getItemVisible("PGBE_SURNAME_PREFIX").equals("TRUE") && getItemEnabled("PGBE_SURNAME_PREFIX").equals("TRUE") )
//					{
//						setItemEnabled("PGBE_SURNAME_PREFIX", false);
//					}
//					setItemEnabled("PGBE_LAST_NAME", false);
//					setItemEnabled("PGBE_BIRTH_DATE", false);
//					setItemEnabled("PGBE_ID_LBT", false);
//					setItemEnabled("PGBE_DECEASED_IND", false);
//					setItemEnabled("PGBE_DECEASED_DATE", false);
//					setItemEnabled("PGBE_BIRTH_DATE_DBT", false);
//					setItemEnabled("PGBE_DECEASED_DATE_DBT", false);
//				}
//				else {
//					setItemEnabled("PGBE_FIRST_NAME", true);
//					setItemNavigable("PGBE_FIRST_NAME", true);
//					setItemUpdateAllowed("PGBE_FIRST_NAME", true);
//					setItemEnabled("PGBE_MI", true);
//					setItemNavigable("PGBE_MI", true);
//					setItemUpdateAllowed("PGBE_MI", true);
//					setItemEnabled("PGBE_LAST_NAME", true);
//					setItemNavigable("PGBE_LAST_NAME", true);
//					setItemUpdateAllowed("PGBE_LAST_NAME", true);
//					if ( getItemVisible("PGBE_SURNAME_PREFIX").equals("TRUE") && getItemEnabled("PGBE_SURNAME_PREFIX").equals("FALSE") )
//					{
//						setItemEnabled("PGBE_SURNAME_PREFIX", true);
//						setItemNavigable("PGBE_SURNAME_PREFIX", true);
//						setItemUpdateAllowed("PGBE_SURNAME_PREFIX", true);
//					}
//					executeAction("ENABLE_SEX");
//					getContainer().getGoqrpls().gCheckFailure();
//					setItemEnabled("PGBE_BIRTH_DATE", true);
//					setItemNavigable("PGBE_BIRTH_DATE", true);
//					setItemUpdateAllowed("PGBE_BIRTH_DATE", true);
//					setItemEnabled("PGBE_ID_LBT", true);
//					setItemEnabled("PGBE_DECEASED_IND", true);
//					setItemNavigable("PGBE_DECEASED_IND", true);
//					setItemUpdateAllowed("PGBE_DECEASED_IND", true);
//					setItemEnabled("PGBE_DECEASED_DATE", true);
//					setItemNavigable("PGBE_DECEASED_DATE", true);
//					setItemUpdateAllowed("PGBE_DECEASED_DATE", true);
//					setItemEnabled("PGBE_BIRTH_DATE_DBT", true);
//					setItemEnabled("PGBE_DECEASED_DATE_DBT", true);
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.QUERY_IDEN_PERS
//		    DECLARE
//      CURSOR PTI_CURSOR IS
//         SELECT SPRIDEN_ID, SPRIDEN_LAST_NAME,
//            SPRIDEN_FIRST_NAME, SPRIDEN_MI, SPRIDEN_SURNAME_PREFIX
//         FROM   SPRIDEN
//         WHERE  SPRIDEN_ENTITY_IND = 'P'
//           AND  SPRIDEN_PIDM = :AGRPGBE.AGRPGBE_PGBE_PIDM
//           AND  SPRIDEN_CHANGE_IND IS NULL ;
//   BEGIN
//      OPEN PTI_CURSOR ;
//      FETCH PTI_CURSOR INTO :PGBE_ID, :PGBE_LAST_NAME,
//         :PGBE_FIRST_NAME, :PGBE_MI, :PGBE_SURNAME_PREFIX ;
//   END ;
//--
//   DECLARE
//      DEAD_IND VARCHAR2(1);
//      CURSOR PTI_CURSOR IS
//         SELECT SPBPERS_SEX, 
//                SPBPERS_BIRTH_DATE, SPBPERS_DEAD_DATE, SPBPERS_DEAD_IND
//         FROM   SPBPERS
//         WHERE  SPBPERS_PIDM = :AGRPGBE.AGRPGBE_PGBE_PIDM ; 
//   BEGIN
//      OPEN PTI_CURSOR ;
//      FETCH PTI_CURSOR INTO :PGBE_SEX, 
//                            :PGBE_BIRTH_DATE, :PGBE_DECEASED_DATE, :PGBE_DECEASED_IND ;
//   END ;
//--
//   :PGBE_CHANGE_IND := '' ;
//   EXECUTE_TRIGGER('CALC_AGE');
//   
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.QUERY_IDEN_PERS
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="QUERY_IDEN_PERS")
//		public void agrpgbe_QueryIdenPers()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				int rowCount = 0;
//				{
//					String sqlptiCursor = "SELECT SPRIDEN_ID, SPRIDEN_LAST_NAME, SPRIDEN_FIRST_NAME, SPRIDEN_MI, SPRIDEN_SURNAME_PREFIX " +
//	" FROM SPRIDEN " +
//	" WHERE SPRIDEN_ENTITY_IND = 'P' AND SPRIDEN_PIDM = :AGRPGBE_AGRPGBE_PGBE_PIDM AND SPRIDEN_CHANGE_IND IS NULL ";
//					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
//					try {
//						//Setting query parameters
//						ptiCursor.addParameter("AGRPGBE_AGRPGBE_PGBE_PIDM", agrpgbeElement.getAgrpgbePgbePidm());
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
//						ptiCursor.open();
//						ResultSet ptiCursorResults = ptiCursor.fetchInto();
//						if ( ptiCursorResults != null ) {
//							agrpgbeElement.setPgbeId(ptiCursorResults.getStr(0));
//							agrpgbeElement.setPgbeLastName(ptiCursorResults.getStr(1));
//							agrpgbeElement.setPgbeFirstName(ptiCursorResults.getStr(2));
//							agrpgbeElement.setPgbeMi(ptiCursorResults.getStr(3));
//							agrpgbeElement.setPgbeSurnamePrefix(ptiCursorResults.getStr(4));
//						}
//					}
//					finally{
//						ptiCursor.close();
//					}
//				}
//				{
//					NString deadInd= NString.getNull();
//					String sqlptiCursor = "SELECT SPBPERS_SEX, SPBPERS_BIRTH_DATE, SPBPERS_DEAD_DATE, SPBPERS_DEAD_IND " +
//	" FROM SPBPERS " +
//	" WHERE SPBPERS_PIDM = :AGRPGBE_AGRPGBE_PGBE_PIDM ";
//					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
//					try {
//						//Setting query parameters
//						ptiCursor.addParameter("AGRPGBE_AGRPGBE_PGBE_PIDM", agrpgbeElement.getAgrpgbePgbePidm());
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
//						ptiCursor.open();
//						ResultSet ptiCursorResults = ptiCursor.fetchInto();
//						if ( ptiCursorResults != null ) {
//							agrpgbeElement.setPgbeSex(ptiCursorResults.getStr(0));
//							agrpgbeElement.setPgbeBirthDate(ptiCursorResults.getDate(1));
//							agrpgbeElement.setPgbeDeceasedDate(ptiCursorResults.getDate(2));
//							agrpgbeElement.setPgbeDeceasedInd(ptiCursorResults.getStr(3));
//						}
//					}
//					finally{
//						ptiCursor.close();
//					}
//				}
//				// 
//				agrpgbeElement.setPgbeChangeInd(toStr(""));
//				executeAction("CALC_AGE");
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.CALC_AGE
//		 --
//IF :PGBE_DECEASED_DATE IS NOT NULL THEN
//   :DISPLAY_AGE := FLOOR(MONTHS_BETWEEN(:PGBE_DECEASED_DATE, :PGBE_BIRTH_DATE) / 12);
// ELSE
//   :DISPLAY_AGE := FLOOR(MONTHS_BETWEEN(SYSDATE, :PGBE_BIRTH_DATE) / 12);
//END IF;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.CALC_AGE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="CALC_AGE")
//		public void agrpgbe_CalcAge()
//		{
//			
//				// 
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				// 
//				if ( !agrpgbeElement.getPgbeDeceasedDate().isNull() )
//				{
//					agrpgbeElement.setDisplayAge(floor(monthsBetween(agrpgbeElement.getPgbeDeceasedDate(), agrpgbeElement.getPgbeBirthDate()).divide(12)));
//				}
//				else {
//					agrpgbeElement.setDisplayAge(floor(monthsBetween(NDate.getNow(), agrpgbeElement.getPgbeBirthDate()).divide(12)));
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.POST-QUERY
//		 --
//-- get the corresponding PGBE_code and display it on query
//--
//DECLARE
//  CURSOR s1 IS
//    SELECT atvxref_desc
//      FROM atvxref
//     WHERE atvxref_code = :agrpgbe_xref_code;
//BEGIN
//	:PGBE_CHANGE_IND := '' ;
//	if :agrpgbe.agrpgbe_pgbe_pidm is null then
//   EXECUTE_TRIGGER('CALC_AGE');
//	end if;
//  OPEN s1;
//  FETCH s1 INTO :agrpgbe.pgbe_xref_desc; 
//  CLOSE s1;
//END;
//
//
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.POST-QUERY
//		 *
//		 *
//		 *</p>
//		 * @param args
//		*/
//
//		@AfterQuery
//		public void agrpgbe_AfterQuery(RowAdapterEvent args)
//		{
//			
//				// 
//				//  get the corresponding PGBE_code and display it on query
//				// 
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)args.getRow();
//
//
//				int rowCount = 0;
//				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.
//
//				
//				try
//				{
//					agrpgbeElement.setLockDbValues(true);
//					try{
//						this.agrpgbeSurnamePrefix_PostChange();
//
//					} catch (Exception ex) { }
//					try{
//						this.pgbeSurnamePrefix_PostChange();
//
//					} catch (Exception ex) { }
//					try{
//						this.agrpgbeLastName_PostChange();
//
//					} catch (Exception ex) { }
//					try{
//						this.pgbeLastName_PostChange();
//
//					} catch (Exception ex) { }
//					try{
//						this.agrpgbeFirstName_PostChange();
//
//					} catch (Exception ex) { }
//					try{
//						this.agrpgbeMi_PostChange();
//
//					} catch (Exception ex) { }
//					try{
//						this.pgbeMi_PostChange();
//
//					} catch (Exception ex) { }
//					try{
//						this.agrpgbeSex_PostChange();
//
//					} catch (Exception ex) { }
//					try{
//						this.agrpgbeBirthDate_PostChange();
//
//					} catch (Exception ex) { }
//					try{
//						this.agrpgbeDeceasedInd_PostChange();
//
//					} catch (Exception ex) { }
//					try{
//						this.agrpgbeDeceasedDate_PostChange();
//
//					} catch (Exception ex) { }
//					try{
//						this.agrpgbePgbePidm_PostChange();
//
//					} catch (Exception ex) { }
//
//				} finally { 
//					agrpgbeElement.setLockDbValues(false);
//				}
//				{
//					String sqls1 = "SELECT atvxref_desc " +
//	" FROM atvxref " +
//	" WHERE atvxref_code = :AGRPGBE_XREF_CODE ";
//					DataCursor s1 = new DataCursor(sqls1);
//					try {
//						agrpgbeElement.setPgbeChangeInd(toStr(""));
//						if ( agrpgbeElement.getAgrpgbePgbePidm().isNull() )
//						{
//							executeAction("CALC_AGE");
//						}
//						//Setting query parameters
//						s1.addParameter("AGRPGBE_XREF_CODE", agrpgbeElement.getAgrpgbeXrefCode());
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable s1.
//						s1.open();
//						ResultSet s1Results = s1.fetchInto();
//						if ( s1Results != null ) {
//							agrpgbeElement.setPgbeXrefDesc(s1Results.getStr(0));
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
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.PRE-INSERT
//		 EXECUTE_TRIGGER('PRE_COMMIT_VALIDATE');
//G$_CHECK_FAILURE;
//--
//   IF :PGBE_CHANGE_IND IS NOT NULL  THEN
//      IF :AGRPGBE_PGBE_PIDM IS NULL  THEN
//         EXECUTE_TRIGGER( 'COPY_FIELDS' ) ;
//         G$_CHECK_FAILURE ;
//      END IF ;
//   END IF ;
//--
//   IF :AGRPGBE_PGBE_PIDM IS NOT NULL  THEN
//         EXECUTE_TRIGGER( 'CLEAR_AGRPGBE_FIELDS' ) ;
//         G$_CHECK_FAILURE ;
//   END IF ; 
//   --
//EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
//G$_CHECK_FAILURE ;
//--
//:AGRPGBE_DATA_ORIGIN := UPPER(GET_APPLICATION_PROPERTY(CURRENT_FORM_NAME));
//:AGRPGBE_USER_ID := :GLOBAL.CURRENT_USER;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.PRE-INSERT
//		 *
//		 *
//		 *</p>
//		 * @param args
//		*/
//
//		@BeforeRowInsert
//		public void agrpgbe_BeforeRowInsert(RowAdapterEvent args)
//		{
//			
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)args.getRow();
//
//
//				executeAction("PRE_COMMIT_VALIDATE");
//				getContainer().getGoqrpls().gCheckFailure();
//				// 
//				if ( !agrpgbeElement.getPgbeChangeInd().isNull() )
//				{
//					if ( agrpgbeElement.getAgrpgbePgbePidm().isNull() )
//					{
//						executeAction("COPY_FIELDS");
//						getContainer().getGoqrpls().gCheckFailure();
//					}
//				}
//				// 
//				if ( !agrpgbeElement.getAgrpgbePgbePidm().isNull() )
//				{
//					executeAction("CLEAR_AGRPGBE_FIELDS");
//					getContainer().getGoqrpls().gCheckFailure();
//				}
//				// 
//				executeAction("UPDATE_ACTIVITY_DATE");
//				getContainer().getGoqrpls().gCheckFailure();
//				// 
//				agrpgbeElement.setAgrpgbeDataOrigin(upper(getCurrentTaskName()));
//				agrpgbeElement.setAgrpgbeUserId(getGlobal("CURRENT_USER"));
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.PRE-UPDATE
//		 EXECUTE_TRIGGER('PRE_COMMIT_VALIDATE');
//G$_CHECK_FAILURE;
//--
//   IF :PGBE_CHANGE_IND IS NOT NULL  THEN
//      IF :AGRPGBE_PGBE_PIDM IS NULL  THEN
//         EXECUTE_TRIGGER( 'COPY_FIELDS' ) ;
//      END IF ;
//   END IF ;
//--
//   IF :AGRPGBE_PGBE_PIDM IS NOT NULL  THEN
//         EXECUTE_TRIGGER( 'CLEAR_AGRPGBE_FIELDS' ) ;
//         G$_CHECK_FAILURE ;
//   END IF ;   
//--
//EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
//G$_CHECK_FAILURE ;
//--
//:AGRPGBE_USER_ID := :GLOBAL.CURRENT_USER;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.PRE-UPDATE
//		 *
//		 *
//		 *</p>
//		 * @param args
//		*/
//
//		@BeforeRowUpdate
//		public void agrpgbe_BeforeRowUpdate(RowAdapterEvent args)
//		{
//			
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)args.getRow();
//
//
//				executeAction("PRE_COMMIT_VALIDATE");
//				getContainer().getGoqrpls().gCheckFailure();
//				// 
//				if ( !agrpgbeElement.getPgbeChangeInd().isNull() )
//				{
//					if ( agrpgbeElement.getAgrpgbePgbePidm().isNull() )
//					{
//						executeAction("COPY_FIELDS");
//					}
//				}
//				// 
//				if ( !agrpgbeElement.getAgrpgbePgbePidm().isNull() )
//				{
//					executeAction("CLEAR_AGRPGBE_FIELDS");
//					getContainer().getGoqrpls().gCheckFailure();
//				}
//				// 
//				executeAction("UPDATE_ACTIVITY_DATE");
//				getContainer().getGoqrpls().gCheckFailure();
//				// 
//				agrpgbeElement.setAgrpgbeUserId(getGlobal("CURRENT_USER"));
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.KEY-NXTBLK
//		 IF :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN 
//  GO_ITEM(:SYSTEM.CURSOR_ITEM);
//  MESSAGE(G$_NLS.Get('AOQCLIB-0026','FORM','Beneficiary information changed, press SAVE before leaving current tab.'));
//ELSE
//	IF :PGBE_NEXT_BLOCK_OK = 'Y' THEN
//    NEXT_BLOCK;
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
//		 * AGRPGBE.KEY-NXTBLK
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
//		public void agrpgbe_NextBlock()
//		{
//			
//				if ( getBlockStatus().equals("CHANGED") )
//				{
//					goItem(toStr(getCursorItem()));
//					message(GNls.Fget(toStr("AOQCLIB-0026"), toStr("FORM"), toStr("Beneficiary information changed, press SAVE before leaving current tab.")));
//				}
//				else {
//					if ( getFormModel().getFormHeader().getPgbeNextBlockOk().equals("Y") )
//					{
//						nextBlock();
//					}
//					else {
//						executeAction("INVALID_FUNCTION_MSG");
//						getContainer().getGoqrpls().gCheckFailure();
//					}
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.KEY-PRVBLK
//		 IF :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN 
//  GO_ITEM(:SYSTEM.CURSOR_ITEM);
//  MESSAGE(G$_NLS.Get('AOQCLIB-0027','FORM','Beneficiary information changed, press SAVE before leaving current window.'));
//ELSE
//  PREVIOUS_BLOCK;
//END IF;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.KEY-PRVBLK
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
//		public void agrpgbe_PreviousBlock()
//		{
//			
//				if ( getBlockStatus().equals("CHANGED") )
//				{
//					goItem(toStr(getCursorItem()));
//					message(GNls.Fget(toStr("AOQCLIB-0027"), toStr("FORM"), toStr("Beneficiary information changed, press SAVE before leaving current window.")));
//				}
//				else {
//					previousBlock();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.PRE_COMMIT_VALIDATE
//		   IF NOT VALID_PLEDGE_GIFT_COMBO(:KEY_BLOCK.PIDM, :AGRPGBE_PLEDGE_NO, :AGRPGBE_GIFT_NO) THEN
//      MESSAGE(G$_NLS.Get('AOQCLIB-0028', 'FORM',
//              '*ERROR* Pledge/Gift number combination is invalid.'));
//      RAISE FORM_TRIGGER_FAILURE;
//  END IF; 
//--
//IF :AGRPGBE_PLEDGE_NO IS NULL AND :AGRPGBE_GIFT_NO IS NULL AND
//	 :PGBE_LAST_NAME IS NOT NULL THEN
//	 MESSAGE(G$_NLS.Get('AOQCLIB-0029', 'FORM',
//              '*ERROR* Pledge number or gift number is required.'));
//   RAISE FORM_TRIGGER_FAILURE;
//END IF;  
//IF :GLOBAL.PLEDGE_NO IS NOT NULL THEN
//   IF ((:GLOBAL.PLEDGE_NO <> :AGRPGBE_PLEDGE_NO OR :AGRPGBE_PLEDGE_NO IS NULL) AND
//       (:GLOBAL.GIFT_NO IS NULL OR :GLOBAL.GIFT_NO = '0000000')) THEN
//   	    MESSAGE(G$_NLS.Get('AOQCLIB-0030','FORM','*ERROR* Pledge number must match pledge number in key block.'));
//        RAISE FORM_TRIGGER_FAILURE;
//   END IF;   
//END IF;   
//IF :GLOBAL.PLEDGE_NO IS NOT NULL THEN
//   IF ((:GLOBAL.PLEDGE_NO <> :AGRPGBE_PLEDGE_NO OR :AGRPGBE_PLEDGE_NO IS NULL) AND
//   	    :GLOBAL.PLEDGE_NO IS NOT NULL AND :GLOBAL.GIFT_NO IS NULL) THEN
//      	MESSAGE(G$_NLS.Get('AOQCLIB-0031','FORM','*ERROR* Pledge number must match pledge number in key block.'));
//  	    RAISE FORM_TRIGGER_FAILURE;
//   END IF;
//END IF; 
//IF :GLOBAL.GIFT_NO IS NOT NULL THEN
//   IF ((:GLOBAL.GIFT_NO <> :AGRPGBE_GIFT_NO -- OR :AGRPGBE_GIFT_NO IS NULL   -- Defect#1-G9OURZ 
//   	    ) AND (:GLOBAL.PLEDGE_NO IS NULL OR :GLOBAL.PLEDGE_NO = '0000000')) THEN
//     	  MESSAGE(G$_NLS.Get('AOQCLIB-0032','FORM','*ERROR* Gift number must match gift number in key block.'));
//  	    RAISE FORM_TRIGGER_FAILURE;
//   END IF;
//END IF;      
//IF :GLOBAL.GIFT_NO IS NOT NULL THEN
//   IF ((:GLOBAL.GIFT_NO <> :AGRPGBE_GIFT_NO -- OR :AGRPGBE_GIFT_NO IS NULL   -- Defect#1-G9OURZ  
//   	    ) AND :GLOBAL.GIFT_NO IS NOT NULL AND :GLOBAL.PLEDGE_NO IS NULL) THEN
//        MESSAGE(G$_NLS.Get('AOQCLIB-0033','FORM','*ERROR* Gift number must match gift number in key block.'));
//  	    RAISE FORM_TRIGGER_FAILURE;
//   END IF;
//END IF;
//--
//EXECUTE_TRIGGER( 'REQ_LAST_NAME' ) ;
//G$_CHECK_FAILURE ;
//-- 
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.PRE_COMMIT_VALIDATE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="PRE_COMMIT_VALIDATE")
//		public void agrpgbe_PreCommitValidate()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//				if ( this.getTask().getServices().validPledgeGiftCombo(this.getModel()getValue(KEY_BLOCK,PIDM), agrpgbeElement.getAgrpgbePledgeNo(), agrpgbeElement.getAgrpgbeGiftNo()).not() )
//				{
//					errorMessage(GNls.Fget(toStr("AOQCLIB-0028"), toStr("FORM"), toStr("*ERROR* Pledge/Gift number combination is invalid.")));
//					throw new ApplicationException();
//				}
//				// 
//				if ( agrpgbeElement.getAgrpgbePledgeNo().isNull() && agrpgbeElement.getAgrpgbeGiftNo().isNull() && !agrpgbeElement.getPgbeLastName().isNull() )
//				{
//					errorMessage(GNls.Fget(toStr("AOQCLIB-0029"), toStr("FORM"), toStr("*ERROR* Pledge number or gift number is required.")));
//					throw new ApplicationException();
//				}
//				if ( !getGlobal("PLEDGE_NO").isNull() )
//				{
//					if (((getGlobal("PLEDGE_NO").notEquals(agrpgbeElement.getAgrpgbePledgeNo()) || agrpgbeElement.getAgrpgbePledgeNo().isNull()) && (getGlobal("GIFT_NO").isNull() || getGlobal("GIFT_NO").equals("0000000"))))
//					{
//						errorMessage(GNls.Fget(toStr("AOQCLIB-0030"), toStr("FORM"), toStr("*ERROR* Pledge number must match pledge number in key block.")));
//						throw new ApplicationException();
//					}
//				}
//				if ( !getGlobal("PLEDGE_NO").isNull() )
//				{
//					if (((getGlobal("PLEDGE_NO").notEquals(agrpgbeElement.getAgrpgbePledgeNo()) || agrpgbeElement.getAgrpgbePledgeNo().isNull()) && !getGlobal("PLEDGE_NO").isNull() && getGlobal("GIFT_NO").isNull()))
//					{
//						errorMessage(GNls.Fget(toStr("AOQCLIB-0031"), toStr("FORM"), toStr("*ERROR* Pledge number must match pledge number in key block.")));
//						throw new ApplicationException();
//					}
//				}
//				if ( !getGlobal("GIFT_NO").isNull() )
//				{
//					if (((getGlobal("GIFT_NO").notEquals(agrpgbeElement.getAgrpgbeGiftNo())) && (getGlobal("PLEDGE_NO").isNull() || getGlobal("PLEDGE_NO").equals("0000000"))))
//					{
//						errorMessage(GNls.Fget(toStr("AOQCLIB-0032"), toStr("FORM"), toStr("*ERROR* Gift number must match gift number in key block.")));
//						throw new ApplicationException();
//					}
//				}
//				if ( !getGlobal("GIFT_NO").isNull() )
//				{
//					if (((getGlobal("GIFT_NO").notEquals(agrpgbeElement.getAgrpgbeGiftNo())) && !getGlobal("GIFT_NO").isNull() && getGlobal("PLEDGE_NO").isNull()))
//					{
//						errorMessage(GNls.Fget(toStr("AOQCLIB-0033"), toStr("FORM"), toStr("*ERROR* Gift number must match gift number in key block.")));
//						throw new ApplicationException();
//					}
//				}
//				// 
//				executeAction("REQ_LAST_NAME");
//				getContainer().getGoqrpls().gCheckFailure();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.UPDATE_ACTIVITY_DATE
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
//		 * AGRPGBE.UPDATE_ACTIVITY_DATE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="UPDATE_ACTIVITY_DATE")
//		public void agrpgbe_UpdateActivityDate()
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
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.CALL_AOAIDEN
//		 :GLOBAL.FORM_WAS_CALLED := 'Y' ;
//EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
//G$_CHECK_FAILURE;
//G$_SECURED_FORM_CALL(:global.current_user,'AOAIDEN','QUERY') ;
//:GLOBAL.FORM_WAS_CALLED := '' ;
//G$_SET_INST_PROPERTY;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.CALL_AOAIDEN
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="CALL_AOAIDEN")
//		public void agrpgbe_CallAoaiden()
//		{
//			
//				setGlobal("FORM_WAS_CALLED", toStr("Y"));
//				executeAction("G$_REVOKE_ACCESS");
//				getContainer().getGoqrpls().gCheckFailure();
//				gSecuredFormCall(getGlobal("CURRENT_USER"), "AOAIDEN", "QUERY");
//				setGlobal("FORM_WAS_CALLED", toStr(""));
//				gSetInstProperty;
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.CALL_SOAIDEN
//		 :GLOBAL.FORM_WAS_CALLED := 'Y' ;
//EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
//G$_CHECK_FAILURE;
//G$_SECURED_FORM_CALL(:global.current_user,'SOAIDEN','QUERY') ;
//:GLOBAL.FORM_WAS_CALLED := '' ;
//G$_SET_INST_PROPERTY;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.CALL_SOAIDEN
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="CALL_SOAIDEN")
//		public void agrpgbe_CallSoaiden()
//		{
//			
//				setGlobal("FORM_WAS_CALLED", toStr("Y"));
//				executeAction("G$_REVOKE_ACCESS");
//				getContainer().getGoqrpls().gCheckFailure();
//				gSecuredFormCall(getGlobal("CURRENT_USER"), "SOAIDEN", "QUERY");
//				setGlobal("FORM_WAS_CALLED", toStr(""));
//				gSetInstProperty;
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.KEY-DELREC
//		 DELETE_RECORD;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.KEY-DELREC
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
//		public void agrpgbe_DeleteRecord()
//		{
//			
//				deleteRecord();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.KEY-CLRBLK
//		 CLEAR_BLOCK;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.KEY-CLRBLK
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
//		public void agrpgbe_keyClearBlock()
//		{
//			
//				clearBlock();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.KEY-CLRREC
//		 CLEAR_RECORD;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.KEY-CLRREC
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
//		public void agrpgbe_ClearRecord()
//		{
//			
//				clearRecord();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.COPY_FIELDS
//		    :AGRPGBE_SURNAME_PREFIX := :PGBE_SURNAME_PREFIX ;
//   :AGRPGBE_LAST_NAME := :PGBE_LAST_NAME ;
//   :AGRPGBE_FIRST_NAME := :PGBE_FIRST_NAME ;
//   :AGRPGBE_MI := :PGBE_MI ;
//   :AGRPGBE_SEX := :PGBE_SEX ;
//   :AGRPGBE_BIRTH_DATE := :PGBE_BIRTH_DATE ;
//   :AGRPGBE_DECEASED_IND := :PGBE_DECEASED_IND ;
//   :AGRPGBE_DECEASED_DATE := :PGBE_DECEASED_DATE ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.COPY_FIELDS
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="COPY_FIELDS")
//		public void agrpgbe_CopyFields()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				agrpgbeElement.setAgrpgbeSurnamePrefix(agrpgbeElement.getPgbeSurnamePrefix());
//				agrpgbeElement.setAgrpgbeLastName(agrpgbeElement.getPgbeLastName());
//				agrpgbeElement.setAgrpgbeFirstName(agrpgbeElement.getPgbeFirstName());
//				agrpgbeElement.setAgrpgbeMi(agrpgbeElement.getPgbeMi());
//				agrpgbeElement.setAgrpgbeSex(agrpgbeElement.getPgbeSex());
//				agrpgbeElement.setAgrpgbeBirthDate(agrpgbeElement.getPgbeBirthDate());
//				agrpgbeElement.setAgrpgbeDeceasedInd(agrpgbeElement.getPgbeDeceasedInd());
//				agrpgbeElement.setAgrpgbeDeceasedDate(agrpgbeElement.getPgbeDeceasedDate());
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE.CLEAR_AGRPGBE_FIELDS
//		    :AGRPGBE_SURNAME_PREFIX := '' ;
//   :AGRPGBE_LAST_NAME := '' ;
//   :AGRPGBE_FIRST_NAME := '' ;
//   :AGRPGBE_MI := '' ;
//   :AGRPGBE_SEX := '';
//   :AGRPGBE_BIRTH_DATE := '' ;
//   :AGRPGBE_DECEASED_IND := '' ;
//   :AGRPGBE_DECEASED_DATE := '' ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.CLEAR_AGRPGBE_FIELDS
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="CLEAR_AGRPGBE_FIELDS")
//		public void agrpgbe_ClearAgrpgbeFields()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				agrpgbeElement.setAgrpgbeSurnamePrefix(toStr(""));
//				agrpgbeElement.setAgrpgbeLastName(toStr(""));
//				agrpgbeElement.setAgrpgbeFirstName(toStr(""));
//				agrpgbeElement.setAgrpgbeMi(toStr(""));
//				agrpgbeElement.setAgrpgbeSex(toStr(""));
//				agrpgbeElement.setAgrpgbeBirthDate(toDate(""));
//				agrpgbeElement.setAgrpgbeDeceasedInd(toStr(""));
//				agrpgbeElement.setAgrpgbeDeceasedDate(toDate(""));
//			}
//
//		
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE.PRE-QUERY
//		 *
//		 *
//		 *</p>
//		 * @param args
//		*/
//
//		@BeforeQuery
//		public void agrpgbe_BeforeQuery(QueryEvent args)
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
//		/* Original PL/SQL code code for TRIGGER PGBE_ID.WHEN-VALIDATE-ITEM
//		 DECLARE
// 	lv_pidm         SPRIDEN.SPRIDEN_PIDM%TYPE := NULL;
// 	COUNT_GDES      number;
//      CURSOR PTI_CURSOR2 IS
//         SELECT COUNT(*)
//         FROM   AGRGDES
//         WHERE  AGRGDES_PIDM = :KEY_BLOCK.PIDM
//           AND  AGRGDES_GIFT_NO = :GLOBAL.GIFT_NO ;
//BEGIN
//  if :pgbe_id is null then
//     return;
//  end if;
//  
//  g$_sel_spriden_pidm_name(:PGBE_ID, 'PGBE_NAME', 'Y', lv_pidm, NULL, 'P'); 
//  
//  DECLARE
//    CURSOR PTI_CURSOR IS
//      SELECT SPRIDEN_PIDM, 
//             SUBSTR(SPRIDEN_LAST_NAME, 1, 25), 
//             SPRIDEN_FIRST_NAME, 
//             SUBSTR(SPRIDEN_MI, 1, 1),
//             SPRIDEN_SURNAME_PREFIX
//      FROM   SPRIDEN
//      WHERE  SPRIDEN_PIDM = lv_pidm
//        AND  SPRIDEN_CHANGE_IND IS NULL
//        AND  SPRIDEN_ENTITY_IND = 'P';
//  BEGIN
//    OPEN PTI_CURSOR;
//    FETCH PTI_CURSOR INTO :AGRPGBE.AGRPGBE_PGBE_PIDM,
//                          :PGBE_LAST_NAME, 
//                          :PGBE_FIRST_NAME, 
//                          :PGBE_MI,
//                          :PGBE_SURNAME_PREFIX;   
//    CLOSE PTI_CURSOR;
//  END;                          
//
//  << COMPARE_PIDM >>
//  IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
//    GOTO PTI_STEP_001;
//  END IF;
//
//  G$_CHECK_VALUE ((:AGRPGBE_PIDM = :AGRPGBE.AGRPGBE_PGBE_PIDM),
//    G$_NLS.Get('AOQCLIB-0034', 'FORM','*ERROR* Beneficiary cannot be the same person in the key block.'), TRUE);
//  --
//  << PTI_STEP_001 >>
//  EXECUTE_TRIGGER( 'QUERY_IDEN_PERS' );
//  --
//  If :agrpgbe_pidm is null then
//    return;
//  end if;
//  --
//  IF :AGRPGBE.ROWID IS NULL AND
//  	 :AGRPGBE_PLEDGE_NO IS NULL AND
//  	 :AGRPGBE_GIFT_NO IS NULL THEN
//	   :AGRPGBE_PLEDGE_NO := :GLOBAL.PLEDGE_NO;
//	   :AGRPGBE_GIFT_NO := :GLOBAL.GIFT_NO;	     
//  END IF;
//  OPEN PTI_CURSOR2;
//  FETCH PTI_CURSOR2 INTO COUNT_GDES;
//  IF COUNT_GDES > 1 THEN
//     :AGRPGBE_PLEDGE_NO := '';
//     :AGRPGBE_GIFT_NO := :GLOBAL.GIFT_NO;
//  END IF;  
//	CLOSE PTI_CURSOR2;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_ID.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="PGBE_ID")
//		public void pgbeId_validate()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				int rowCount = 0;
//				{
//					NNumber lvPidm = NNumber.getNull();
//					NNumber countGdes= NNumber.getNull();
//					String sqlptiCursor2 = "SELECT COUNT(*) " +
//	" FROM AGRGDES " +
//	" WHERE AGRGDES_PIDM = :KEY_BLOCK_PIDM AND AGRGDES_GIFT_NO = :GLOBAL_GIFT_NO ";
//					DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
//					try {
//						if ( agrpgbeElement.getPgbeId().isNull() )
//						{
//							return ;
//						}
//						gSelSpridenPidmName(agrpgbeElement.getPgbeId(), "PGBE_NAME", "Y", lvPidm, null, "P");
//						{
//							String sqlptiCursor = "SELECT SPRIDEN_PIDM, SUBSTR(SPRIDEN_LAST_NAME, 1, 25), SPRIDEN_FIRST_NAME, SUBSTR(SPRIDEN_MI, 1, 1), SPRIDEN_SURNAME_PREFIX " +
//	" FROM SPRIDEN " +
//	" WHERE SPRIDEN_PIDM = :P_LV_PIDM AND SPRIDEN_CHANGE_IND IS NULL AND SPRIDEN_ENTITY_IND = 'P' ";
//							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
//							try {
//								//Setting query parameters
//								ptiCursor.addParameter("P_LV_PIDM", lvPidm);
//								//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
//								ptiCursor.open();
//								ResultSet ptiCursorResults = ptiCursor.fetchInto();
//								if ( ptiCursorResults != null ) {
//									agrpgbeElement.setAgrpgbePgbePidm(ptiCursorResults.getNumber(0));
//									agrpgbeElement.setPgbeLastName(ptiCursorResults.getStr(1));
//									agrpgbeElement.setPgbeFirstName(ptiCursorResults.getStr(2));
//									agrpgbeElement.setPgbeMi(ptiCursorResults.getStr(3));
//									agrpgbeElement.setPgbeSurnamePrefix(ptiCursorResults.getStr(4));
//								}
//								ptiCursor.close();
//							}
//							finally{
//								ptiCursor.close();
//							}
//						}
//						 COMPARE_PIDM:;
//						if ((getGlobal("QUERY_MODE").equals("1")))
//						{
//							 goto PTI_STEP_001;
//						}
//						getContainer().getGoqrpls().gCheckValue(((agrpgbeElement.getAgrpgbePidm().equals(agrpgbeElement.getAgrpgbePgbePidm()))), GNls.Fget(toStr("AOQCLIB-0034"), toStr("FORM"), toStr("*ERROR* Beneficiary cannot be the same person in the key block.")), NBool.True);
//						 PTI_STEP_001:;
//						executeAction("QUERY_IDEN_PERS");
//						// 
//						if ( agrpgbeElement.getAgrpgbePidm().isNull() )
//						{
//							return ;
//						}
//						// 
//						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//						if ( agrpgbeElement.getROWID().isNull() && agrpgbeElement.getAgrpgbePledgeNo().isNull() && agrpgbeElement.getAgrpgbeGiftNo().isNull() )
//						{
//							agrpgbeElement.setAgrpgbePledgeNo(getGlobal("PLEDGE_NO"));
//							agrpgbeElement.setAgrpgbeGiftNo(getGlobal("GIFT_NO"));
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
//							agrpgbeElement.setAgrpgbePledgeNo(toStr(""));
//							agrpgbeElement.setAgrpgbeGiftNo(getGlobal("GIFT_NO"));
//						}
//						ptiCursor2.close();
//					}
//					finally{
//						ptiCursor2.close();
//					}
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_ID.KEY-LISTVAL
//		 :GLOBAL.VALUE := '';
//:GLOBAL.PRODUCT_IND := 'A' ;
//EXECUTE_TRIGGER('CALL_SOAIDEN');
//G$_CHECK_FAILURE;
//--
//   IF :GLOBAL.VALUE IS NOT NULL  THEN
//      IF :AGRPGBE.ROWID IS NOT NULL THEN
//          MESSAGE( G$_NLS.Get('AOQCLIB-0035', 'FORM',' Field is protected against update.') );
//          BELL;
//          RAISE FORM_TRIGGER_FAILURE;
//      END IF;
//   END IF;
//--
//   IF :GLOBAL.VALUE IS NOT NULL  THEN
//      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
//      G$_CHECK_FAILURE ;
//      NEXT_ITEM;
//   END IF ;  
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_ID.KEY-LISTVAL
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-LISTVAL", item="PGBE_ID", function=KeyFunction.LIST_VALUES)
//		public void pgbeId_ListValues()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				setGlobal("VALUE", toStr(""));
//				setGlobal("PRODUCT_IND", toStr("A"));
//				executeAction("CALL_SOAIDEN");
//				getContainer().getGoqrpls().gCheckFailure();
//				// 
//				if ( !getGlobal("VALUE").isNull() )
//				{
//					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//					if ( !agrpgbeElement.getROWID().isNull() )
//					{
//						message(GNls.Fget(toStr("AOQCLIB-0035"), toStr("FORM"), toStr(" Field is protected against update.")));
//						// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\AOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
//						//						SupportClasses.SQLFORMS.Bell();
//						System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\AOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
//						
//						throw new ApplicationException();
//					}
//				}
//				// 
//				if ( !getGlobal("VALUE").isNull() )
//				{
//					executeAction("LIST_VALUES_COPY");
//					getContainer().getGoqrpls().gCheckFailure();
//					nextItem();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_ID.POST-TEXT-ITEM
//		 IF :AGRPGBE.PGBE_ID IS NOT NULL THEN
//    EXECUTE_TRIGGER( 'DISABLE_SEX' ) ;
//    G$_CHECK_FAILURE ;
//    SET_ITEM_PROPERTY('PGBE_FIRST_NAME',ENABLED,PROPERTY_OFF);
//    SET_ITEM_PROPERTY('PGBE_MI',ENABLED,PROPERTY_OFF);
//    IF  GET_ITEM_PROPERTY('PGBE_SURNAME_PREFIX', VISIBLE) = 'TRUE' 
//    AND GET_ITEM_PROPERTY('PGBE_SURNAME_PREFIX',ENABLED) = 'TRUE' THEN
//        SET_ITEM_PROPERTY('PGBE_SURNAME_PREFIX',ENABLED,PROPERTY_OFF);
//    END IF;    
//    SET_ITEM_PROPERTY('PGBE_LAST_NAME',ENABLED,PROPERTY_OFF);
//    SET_ITEM_PROPERTY('PGBE_BIRTH_DATE',ENABLED,PROPERTY_OFF);
//    SET_ITEM_PROPERTY('PGBE_ID_LBT',ENABLED,PROPERTY_OFF); 
//    SET_ITEM_PROPERTY('PGBE_DECEASED_IND',ENABLED,PROPERTY_OFF);
//    SET_ITEM_PROPERTY('PGBE_DECEASED_DATE',ENABLED,PROPERTY_OFF);
//    --   
//ELSE
//    SET_ITEM_PROPERTY('PGBE_FIRST_NAME',ENABLED,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_FIRST_NAME',NAVIGABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_FIRST_NAME',UPDATEABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_MI',ENABLED,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_MI',NAVIGABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_MI',UPDATEABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_LAST_NAME',ENABLED,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_LAST_NAME',NAVIGABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_LAST_NAME',UPDATEABLE,PROPERTY_ON);
//    IF  GET_ITEM_PROPERTY('PGBE_SURNAME_PREFIX', VISIBLE) = 'TRUE' 
//    AND GET_ITEM_PROPERTY('PGBE_SURNAME_PREFIX',ENABLED) = 'FALSE' THEN
//        SET_ITEM_PROPERTY('PGBE_SURNAME_PREFIX',ENABLED,PROPERTY_ON);
//        SET_ITEM_PROPERTY('PGBE_SURNAME_PREFIX',NAVIGABLE,PROPERTY_ON);
//        SET_ITEM_PROPERTY('PGBE_SURNAME_PREFIX',UPDATEABLE,PROPERTY_ON);
//    END IF;    
//    EXECUTE_TRIGGER( 'ENABLE_SEX' ) ;
//    G$_CHECK_FAILURE ;
//    SET_ITEM_PROPERTY('PGBE_BIRTH_DATE',ENABLED,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_BIRTH_DATE',NAVIGABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_BIRTH_DATE',UPDATEABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_ID_LBT',ENABLED,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_DECEASED_IND',ENABLED,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_DECEASED_IND',NAVIGABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_DECEASED_IND',UPDATEABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_DECEASED_DATE',ENABLED,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_DECEASED_DATE',NAVIGABLE,PROPERTY_ON);
//    SET_ITEM_PROPERTY('PGBE_DECEASED_DATE',UPDATEABLE,PROPERTY_ON);
//    --
//  END IF;
//  
//
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_ID.POST-TEXT-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-TEXT-ITEM", item="PGBE_ID", function=KeyFunction.ITEM_OUT)
//		public void pgbeId_itemOut()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				if ( !agrpgbeElement.getPgbeId().isNull() )
//				{
//					executeAction("DISABLE_SEX");
//					getContainer().getGoqrpls().gCheckFailure();
//					setItemEnabled("PGBE_FIRST_NAME", false);
//					setItemEnabled("PGBE_MI", false);
//					if ( getItemVisible("PGBE_SURNAME_PREFIX").equals("TRUE") && getItemEnabled("PGBE_SURNAME_PREFIX").equals("TRUE") )
//					{
//						setItemEnabled("PGBE_SURNAME_PREFIX", false);
//					}
//					setItemEnabled("PGBE_LAST_NAME", false);
//					setItemEnabled("PGBE_BIRTH_DATE", false);
//					setItemEnabled("PGBE_ID_LBT", false);
//					setItemEnabled("PGBE_DECEASED_IND", false);
//					setItemEnabled("PGBE_DECEASED_DATE", false);
//				}
//				else {
//					setItemEnabled("PGBE_FIRST_NAME", true);
//					setItemNavigable("PGBE_FIRST_NAME", true);
//					setItemUpdateAllowed("PGBE_FIRST_NAME", true);
//					setItemEnabled("PGBE_MI", true);
//					setItemNavigable("PGBE_MI", true);
//					setItemUpdateAllowed("PGBE_MI", true);
//					setItemEnabled("PGBE_LAST_NAME", true);
//					setItemNavigable("PGBE_LAST_NAME", true);
//					setItemUpdateAllowed("PGBE_LAST_NAME", true);
//					if ( getItemVisible("PGBE_SURNAME_PREFIX").equals("TRUE") && getItemEnabled("PGBE_SURNAME_PREFIX").equals("FALSE") )
//					{
//						setItemEnabled("PGBE_SURNAME_PREFIX", true);
//						setItemNavigable("PGBE_SURNAME_PREFIX", true);
//						setItemUpdateAllowed("PGBE_SURNAME_PREFIX", true);
//					}
//					executeAction("ENABLE_SEX");
//					getContainer().getGoqrpls().gCheckFailure();
//					setItemEnabled("PGBE_BIRTH_DATE", true);
//					setItemNavigable("PGBE_BIRTH_DATE", true);
//					setItemUpdateAllowed("PGBE_BIRTH_DATE", true);
//					setItemEnabled("PGBE_ID_LBT", true);
//					setItemEnabled("PGBE_DECEASED_IND", true);
//					setItemNavigable("PGBE_DECEASED_IND", true);
//					setItemUpdateAllowed("PGBE_DECEASED_IND", true);
//					setItemEnabled("PGBE_DECEASED_DATE", true);
//					setItemNavigable("PGBE_DECEASED_DATE", true);
//					setItemUpdateAllowed("PGBE_DECEASED_DATE", true);
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_ID.KEY-DUPREC
//		 :GLOBAL.VALUE := '';
//:GLOBAL.PRODUCT_IND := 'A' ;
//EXECUTE_TRIGGER('CALL_AOAIDEN');
//G$_CHECK_FAILURE;
//--
//   IF :GLOBAL.VALUE IS NOT NULL  THEN
//      IF :AGRPGBE.ROWID IS NOT NULL THEN
//          MESSAGE( G$_NLS.Get('AOQCLIB-0036', 'FORM',' Field is protected against update.') );
//          BELL;
//          RAISE FORM_TRIGGER_FAILURE;
//      END IF;
//   END IF;
//--
//   IF :GLOBAL.VALUE IS NOT NULL  THEN
//      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
//      G$_CHECK_FAILURE ;
//      NEXT_ITEM;
//   END IF ;
//  
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_ID.KEY-DUPREC
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-DUPREC", item="PGBE_ID", function=KeyFunction.DUPLICATE_RECORD)
//		public void pgbeId_CopyRecord()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				setGlobal("VALUE", toStr(""));
//				setGlobal("PRODUCT_IND", toStr("A"));
//				executeAction("CALL_AOAIDEN");
//				getContainer().getGoqrpls().gCheckFailure();
//				// 
//				if ( !getGlobal("VALUE").isNull() )
//				{
//					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//					if ( !agrpgbeElement.getROWID().isNull() )
//					{
//						message(GNls.Fget(toStr("AOQCLIB-0036"), toStr("FORM"), toStr(" Field is protected against update.")));
//						// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\AOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
//						//						SupportClasses.SQLFORMS.Bell();
//						System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\AOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
//						
//						throw new ApplicationException();
//					}
//				}
//				// 
//				if ( !getGlobal("VALUE").isNull() )
//				{
//					executeAction("LIST_VALUES_COPY");
//					getContainer().getGoqrpls().gCheckFailure();
//					nextItem();
//				}
//			}
//
//		
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_XREF_CODE.POST-TEXT-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-TEXT-ITEM", item="AGRPGBE_XREF_CODE", function=KeyFunction.ITEM_OUT)
//		public void agrpgbeXrefCode_itemOut()
//		{
//			
//			getGCodeClass().itemOut();
//		}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_XREF_CODE.WHEN-VALIDATE-ITEM
//		 DECLARE
//	COUNT_GDES      number;
//  CURSOR s1 IS
//    SELECT atvxref_desc
//      FROM atvxref
//     WHERE atvxref_code=:AGRPGBE_XREF_CODE;   
//  CURSOR PTI_CURSOR IS
//    SELECT COUNT(*)
//    FROM   AGRGDES
//    WHERE  AGRGDES_PIDM = :KEY_BLOCK.PIDM
//      AND  AGRGDES_GIFT_NO = :GLOBAL.GIFT_NO ;      
//BEGIN
//  IF :AGRPGBE_XREF_CODE IS NULL THEN
//    :AGRPGBE.PGBE_XREF_DESC := '';
//  	RETURN;
//  END IF;
//--
//  OPEN s1;
//  FETCH s1 INTO :AGRPGBE.PGBE_XREF_DESC; 
//  IF s1%NOTFOUND THEN
//  	CLOSE s1;
//  	MESSAGE(G$_NLS.Get('AOQCLIB-0037','FORM','*ERROR* Invalid Relationship Code; press LIST for valid code.'));
//  	RAISE FORM_TRIGGER_FAILURE;
//  END IF;
//  CLOSE s1;
//  IF :AGRPGBE.ROWID IS NULL AND
//  	 :AGRPGBE_PLEDGE_NO IS NULL AND
//  	 :AGRPGBE_GIFT_NO IS NULL THEN
//	   :AGRPGBE_PLEDGE_NO := :GLOBAL.PLEDGE_NO;
//	   :AGRPGBE_GIFT_NO := :GLOBAL.GIFT_NO;
//  END IF;
//  OPEN PTI_CURSOR;
//  FETCH PTI_CURSOR INTO COUNT_GDES;
//  IF COUNT_GDES > 1 THEN
//  	 :AGRPGBE_PLEDGE_NO := '';
//	   :AGRPGBE_GIFT_NO := :GLOBAL.GIFT_NO;
//  END IF;
//  CLOSE PTI_CURSOR;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_XREF_CODE.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="AGRPGBE_XREF_CODE")
//		public void agrpgbeXrefCode_validate()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				int rowCount = 0;
//				{
//					NNumber countGdes= NNumber.getNull();
//					String sqls1 = "SELECT atvxref_desc " +
//	" FROM atvxref " +
//	" WHERE atvxref_code = :AGRPGBE_XREF_CODE ";
//					DataCursor s1 = new DataCursor(sqls1);
//					String sqlptiCursor = "SELECT COUNT(*) " +
//	" FROM AGRGDES " +
//	" WHERE AGRGDES_PIDM = :KEY_BLOCK_PIDM AND AGRGDES_GIFT_NO = :GLOBAL_GIFT_NO ";
//					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
//					try {
//						if ( agrpgbeElement.getAgrpgbeXrefCode().isNull() )
//						{
//							agrpgbeElement.setPgbeXrefDesc(toStr(""));
//							return ;
//						}
//						// 
//						//Setting query parameters
//						s1.addParameter("AGRPGBE_XREF_CODE", agrpgbeElement.getAgrpgbeXrefCode());
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable s1.
//						s1.open();
//						ResultSet s1Results = s1.fetchInto();
//						if ( s1Results != null ) {
//							agrpgbeElement.setPgbeXrefDesc(s1Results.getStr(0));
//						}
//						if ( s1.notFound() )
//						{
//							s1.close();
//							errorMessage(GNls.Fget(toStr("AOQCLIB-0037"), toStr("FORM"), toStr("*ERROR* Invalid Relationship Code; press LIST for valid code.")));
//							throw new ApplicationException();
//						}
//						s1.close();
//						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//						if ( agrpgbeElement.getROWID().isNull() && agrpgbeElement.getAgrpgbePledgeNo().isNull() && agrpgbeElement.getAgrpgbeGiftNo().isNull() )
//						{
//							agrpgbeElement.setAgrpgbePledgeNo(getGlobal("PLEDGE_NO"));
//							agrpgbeElement.setAgrpgbeGiftNo(getGlobal("GIFT_NO"));
//						}
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
//							agrpgbeElement.setAgrpgbePledgeNo(toStr(""));
//							agrpgbeElement.setAgrpgbeGiftNo(getGlobal("GIFT_NO"));
//						}
//						ptiCursor.close();
//					}
//					finally{
//						s1.close();
//						ptiCursor.close();
//					}
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_XREF_DESC.WHEN-NEW-ITEM-INSTANCE
//		 PREVIOUS_ITEM;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_XREF_DESC.WHEN-NEW-ITEM-INSTANCE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PGBE_XREF_DESC", function=KeyFunction.ITEM_CHANGE)
//		public void pgbeXrefDesc_itemChange()
//		{
//			
//				previousItem();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_PLEDGE_NO.KEY-NEXT-ITEM
//		 BEGIN
//  NEXT_ITEM;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_PLEDGE_NO.KEY-NEXT-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-NEXT-ITEM", item="AGRPGBE_PLEDGE_NO", function=KeyFunction.NEXT_ITEM)
//		public void agrpgbePledgeNo_keyNexItem()
//		{
//			
//				nextItem();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_PLEDGE_NO.WHEN-MOUSE-DOUBLECLICK
//		 BEGIN
//  G$_SEARCH.WHEN_MOUSE_CLICK;
//  G$_CHECK_FAILURE;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_PLEDGE_NO.WHEN-MOUSE-DOUBLECLICK
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="AGRPGBE_PLEDGE_NO")
//		public void agrpgbePledgeNo_doubleClick()
//		{
//			
//				GSearch.whenMouseClick;
//				getContainer().getGoqrpls().gCheckFailure();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_PLEDGE_NO.G$_SEARCH_PARAMETERS
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
//		 * AGRPGBE_PLEDGE_NO.G$_SEARCH_PARAMETERS
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="AGRPGBE_PLEDGE_NO")
//		public void agrpgbePledgeNo_GSearchParameters()
//		{
//			
//				GSearch.parameters("", "", "");
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_PLEDGE_NO.G$_SEARCH_OPTIONS
//		 BEGIN
//  DO_KEY('LIST_VALUES');
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_PLEDGE_NO.G$_SEARCH_OPTIONS
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="AGRPGBE_PLEDGE_NO")
//		public void agrpgbePledgeNo_GSearchOptions()
//		{
//			
//				executeAction(KeyFunction.LIST_VALUES);
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_PLEDGE_NO.WHEN-VALIDATE-ITEM
//		   DECLARE
//  	  COUNT_GDES           number;
//      PTI_INTO_TEMP        VARCHAR2(255);
//      CURSOR PTI_CURSOR IS
//         SELECT 'Y'
//         FROM   AGBPLDG
//         WHERE  AGBPLDG_PIDM = :KEY_BLOCK.PIDM
//           AND  AGBPLDG_PLEDGE_NO = :AGRPGBE_PLEDGE_NO ;
//      CURSOR PTI_CURSOR2 IS
//         SELECT 'X'
//         FROM   AGRGDES
//         WHERE  AGRGDES_PIDM = :KEY_BLOCK.PIDM
//           AND  AGRGDES_GIFT_NO = :GLOBAL.GIFT_NO
//           AND  :AGRPGBE_PLEDGE_NO = AGRGDES_PLEDGE_NO ; 
//      CURSOR PTI_CURSOR3 IS
//         SELECT COUNT(*)
//         FROM   AGRGDES
//         WHERE  AGRGDES_PIDM = :KEY_BLOCK.PIDM
//           AND  AGRGDES_GIFT_NO = :GLOBAL.GIFT_NO ;            
//  BEGIN
//      IF :AGRPGBE_PLEDGE_NO is not null and
//      	 :AGRPGBE_PLEDGE_NO <> '0000000' then
//        OPEN PTI_CURSOR ;
//        FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
//        G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,  
//                        G$_NLS.Get('AOQCLIB-0038', 'FORM',
//                                   '*ERROR* Pledge number does not exist; press LIST for pledge numbers.'), TRUE);
//        CLOSE PTI_CURSOR;
//        IF :GLOBAL.GIFT_NO IS NOT NULL THEN
//           OPEN PTI_CURSOR2 ;
//           FETCH PTI_CURSOR2 INTO PTI_INTO_TEMP ;
//           G$_CHECK_VALUE (PTI_CURSOR2%NOTFOUND,  
//                           G$_NLS.Get('AOQCLIB-0039', 'FORM',
//                                      '*ERROR* Pledge number does not exist; press LIST for pledge numbers.'), TRUE);
//           CLOSE PTI_CURSOR2;
//        END IF;        
//      END IF;  
//      IF :GLOBAL.PLEDGE_NO IS NOT NULL THEN
//         IF ((:GLOBAL.PLEDGE_NO <> :AGRPGBE_PLEDGE_NO OR :AGRPGBE_PLEDGE_NO IS NULL) AND
//         	   ((:GLOBAL.GIFT_NO IS NULL OR :GLOBAL.GIFT_NO = '0000000')AND :AGRPGBE.ROWID IS NOT NULL)) THEN
//      	    MESSAGE(G$_NLS.Get('AOQCLIB-0040','FORM','*ERROR* Pledge number must match pledge number in key block.'));
//  	        RAISE FORM_TRIGGER_FAILURE;
//  	     END IF;   
//      END IF;   
//      IF :GLOBAL.PLEDGE_NO IS NOT NULL THEN
//         IF ((:GLOBAL.PLEDGE_NO <> :AGRPGBE_PLEDGE_NO OR :AGRPGBE_PLEDGE_NO IS NULL) AND
//         	    :GLOBAL.PLEDGE_NO IS NOT NULL AND :AGRPGBE.ROWID IS NOT NULL AND :GLOBAL.GIFT_NO IS NULL) THEN
//         	 MESSAGE(G$_NLS.Get('AOQCLIB-0041','FORM','*ERROR* Pledge number must match pledge number in key block.'));
//  	        RAISE FORM_TRIGGER_FAILURE;
//         END IF;
//      END IF;        
//      OPEN PTI_CURSOR3;
//      FETCH PTI_CURSOR3 INTO COUNT_GDES;
//      IF COUNT_GDES < 2 THEN
//         IF :GLOBAL.PLEDGE_NO IS NOT NULL THEN
//           IF :GLOBAL.PLEDGE_NO <> :AGRPGBE_PLEDGE_NO AND :AGRPGBE_PLEDGE_NO IS NOT NULL THEN
//         	    MESSAGE(G$_NLS.Get('AOQCLIB-0042','FORM','*ERROR* Pledge number must match pledge number in key block.'));
//  	          RAISE FORM_TRIGGER_FAILURE;
//           END IF;
//         END IF;
//      END IF;  
//	    CLOSE PTI_CURSOR3;      
//   END ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_PLEDGE_NO.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="AGRPGBE_PLEDGE_NO")
//		public void agrpgbePledgeNo_validate()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				int rowCount = 0;
//				{
//					NNumber countGdes= NNumber.getNull();
//					NString ptiIntoTemp= NString.getNull();
//					String sqlptiCursor = "SELECT 'Y' " +
//	" FROM AGBPLDG " +
//	" WHERE AGBPLDG_PIDM = :KEY_BLOCK_PIDM AND AGBPLDG_PLEDGE_NO = :AGRPGBE_PLEDGE_NO ";
//					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
//					String sqlptiCursor2 = "SELECT 'X' " +
//	" FROM AGRGDES " +
//	" WHERE AGRGDES_PIDM = :KEY_BLOCK_PIDM AND AGRGDES_GIFT_NO = :GLOBAL_GIFT_NO AND :AGRPGBE_PLEDGE_NO = AGRGDES_PLEDGE_NO ";
//					DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
//					String sqlptiCursor3 = "SELECT COUNT(*) " +
//	" FROM AGRGDES " +
//	" WHERE AGRGDES_PIDM = :KEY_BLOCK_PIDM AND AGRGDES_GIFT_NO = :GLOBAL_GIFT_NO ";
//					DataCursor ptiCursor3 = new DataCursor(sqlptiCursor3);
//					try {
//						if ( !agrpgbeElement.getAgrpgbePledgeNo().isNull() && agrpgbeElement.getAgrpgbePledgeNo().notEquals("0000000") )
//						{
//							//Setting query parameters
//							ptiCursor.addParameter("KEY_BLOCK_PIDM", this.getModel()getValue(KEY_BLOCK,PIDM));
//							ptiCursor.addParameter("AGRPGBE_PLEDGE_NO", agrpgbeElement.getAgrpgbePledgeNo());
//							//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
//							ptiCursor.open();
//							ResultSet ptiCursorResults = ptiCursor.fetchInto();
//							if ( ptiCursorResults != null ) {
//								ptiIntoTemp = ptiCursorResults.getStr(0);
//							}
//							getContainer().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("AOQCLIB-0038"), toStr("FORM"), toStr("*ERROR* Pledge number does not exist; press LIST for pledge numbers.")), NBool.True);
//							ptiCursor.close();
//							if ( !getGlobal("GIFT_NO").isNull() )
//							{
//								//Setting query parameters
//								ptiCursor2.addParameter("KEY_BLOCK_PIDM", this.getModel()getValue(KEY_BLOCK,PIDM));
//								ptiCursor2.addParameter("GLOBAL_GIFT_NO", getGlobal("GIFT_NO"));
//								ptiCursor2.addParameter("AGRPGBE_PLEDGE_NO", agrpgbeElement.getAgrpgbePledgeNo());
//								//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor2.
//								ptiCursor2.open();
//								ResultSet ptiCursor2Results = ptiCursor2.fetchInto();
//								if ( ptiCursor2Results != null ) {
//									ptiIntoTemp = ptiCursor2Results.getStr(0);
//								}
//								getContainer().getGoqrpls().gCheckValue(ptiCursor2.notFound(), GNls.Fget(toStr("AOQCLIB-0039"), toStr("FORM"), toStr("*ERROR* Pledge number does not exist; press LIST for pledge numbers.")), NBool.True);
//								ptiCursor2.close();
//							}
//						}
//						if ( !getGlobal("PLEDGE_NO").isNull() )
//						{
//							// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//							if (((getGlobal("PLEDGE_NO").notEquals(agrpgbeElement.getAgrpgbePledgeNo()) || agrpgbeElement.getAgrpgbePledgeNo().isNull()) && ((getGlobal("GIFT_NO").isNull() || getGlobal("GIFT_NO").equals("0000000")) && !agrpgbeElement.getROWID().isNull())))
//							{
//								errorMessage(GNls.Fget(toStr("AOQCLIB-0040"), toStr("FORM"), toStr("*ERROR* Pledge number must match pledge number in key block.")));
//								throw new ApplicationException();
//							}
//						}
//						if ( !getGlobal("PLEDGE_NO").isNull() )
//						{
//							// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//							if (((getGlobal("PLEDGE_NO").notEquals(agrpgbeElement.getAgrpgbePledgeNo()) || agrpgbeElement.getAgrpgbePledgeNo().isNull()) && !getGlobal("PLEDGE_NO").isNull() && !agrpgbeElement.getROWID().isNull() && getGlobal("GIFT_NO").isNull()))
//							{
//								errorMessage(GNls.Fget(toStr("AOQCLIB-0041"), toStr("FORM"), toStr("*ERROR* Pledge number must match pledge number in key block.")));
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
//								if ( getGlobal("PLEDGE_NO").notEquals(agrpgbeElement.getAgrpgbePledgeNo()) && !agrpgbeElement.getAgrpgbePledgeNo().isNull() )
//								{
//									errorMessage(GNls.Fget(toStr("AOQCLIB-0042"), toStr("FORM"), toStr("*ERROR* Pledge number must match pledge number in key block.")));
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
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_PLEDGE_NO.KEY-LISTVAL
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
//   G$_DISPLAY_LOV('AGRPGBE_PLEDGE_NO','PLEDGE_NUM_LOV');
//   G$_CHECK_FAILURE;	
//ELSIF :GLOBAL.GIFT_NO IS NULL AND
//	    :AGRPGBE_PLEDGE_NO IS NULL THEN
//	    :AGRPGBE_PLEDGE_NO := :GLOBAL.PLEDGE_NO;	 
//ELSIF (:AGRPGBE_PLEDGE_NO IS NULL OR
//	     :AGRPGBE_PLEDGE_NO <> :GLOBAL.PLEDGE_NO) AND 
//	     :AGRPGBE_GIFT_NO IS NULL AND
//	     :GLOBAL.PLEDGE_NO IS NOT NULL THEN
//	     :AGRPGBE_PLEDGE_NO := :GLOBAL.PLEDGE_NO;
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
//		 * AGRPGBE_PLEDGE_NO.KEY-LISTVAL
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-LISTVAL", item="AGRPGBE_PLEDGE_NO", function=KeyFunction.LIST_VALUES)
//		public void agrpgbePledgeNo_ListValues()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
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
//							gDisplayLov("AGRPGBE_PLEDGE_NO", "PLEDGE_NUM_LOV");
//							getContainer().getGoqrpls().gCheckFailure();
//						}
//						else if ( getGlobal("GIFT_NO").isNull() && agrpgbeElement.getAgrpgbePledgeNo().isNull() ) {
//							agrpgbeElement.setAgrpgbePledgeNo(getGlobal("PLEDGE_NO"));
//						}
//						else if ( (agrpgbeElement.getAgrpgbePledgeNo().isNull() || agrpgbeElement.getAgrpgbePledgeNo().notEquals(getGlobal("PLEDGE_NO"))) && agrpgbeElement.getAgrpgbeGiftNo().isNull() && !getGlobal("PLEDGE_NO").isNull() ) {
//							agrpgbeElement.setAgrpgbePledgeNo(getGlobal("PLEDGE_NO"));
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
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_GIFT_NO.KEY-NEXT-ITEM
//		 BEGIN
//  NEXT_ITEM;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_GIFT_NO.KEY-NEXT-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-NEXT-ITEM", item="AGRPGBE_GIFT_NO", function=KeyFunction.NEXT_ITEM)
//		public void agrpgbeGiftNo_keyNexItem()
//		{
//			
//				nextItem();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_GIFT_NO.WHEN-MOUSE-DOUBLECLICK
//		 BEGIN
//  G$_SEARCH.WHEN_MOUSE_CLICK;
//  G$_CHECK_FAILURE;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_GIFT_NO.WHEN-MOUSE-DOUBLECLICK
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="AGRPGBE_GIFT_NO")
//		public void agrpgbeGiftNo_doubleClick()
//		{
//			
//				GSearch.whenMouseClick;
//				getContainer().getGoqrpls().gCheckFailure();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_GIFT_NO.G$_SEARCH_PARAMETERS
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
//		 * AGRPGBE_GIFT_NO.G$_SEARCH_PARAMETERS
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="AGRPGBE_GIFT_NO")
//		public void agrpgbeGiftNo_GSearchParameters()
//		{
//			
//				GSearch.parameters("", "", "");
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_GIFT_NO.G$_SEARCH_OPTIONS
//		 BEGIN
//  DO_KEY('LIST_VALUES');
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_GIFT_NO.G$_SEARCH_OPTIONS
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="AGRPGBE_GIFT_NO")
//		public void agrpgbeGiftNo_GSearchOptions()
//		{
//			
//				executeAction(KeyFunction.LIST_VALUES);
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_GIFT_NO.WHEN-VALIDATE-ITEM
//		   DECLARE
//  	  COUNT_GDES           number;  	
//      PTI_INTO_TEMP        VARCHAR2(255);
//      CURSOR PTI_CURSOR IS
//         SELECT 'Y'
//         FROM   AGBGIFT
//         WHERE  AGBGIFT_PIDM = :KEY_BLOCK.PIDM
//           AND  AGBGIFT_GIFT_NO = :AGRPGBE_GIFT_NO ; 
//      CURSOR PTI_CURSOR2 IS
//         SELECT COUNT(*)
//         FROM   AGRGDES
//         WHERE  AGRGDES_PIDM = :KEY_BLOCK.PIDM
//           AND  AGRGDES_GIFT_NO = :GLOBAL.GIFT_NO ;     
//  BEGIN
//      IF :AGRPGBE_GIFT_NO is not null then
//        OPEN PTI_CURSOR ;
//        FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
//        G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,  
//                        G$_NLS.Get('AOQCLIB-0043', 'FORM',
//                                   '*ERROR* Gift number does not exist; press LIST for gift numbers.'), TRUE);
//        CLOSE PTI_CURSOR;          
//      END IF;
//      IF :GLOBAL.GIFT_NO IS NOT NULL THEN
//         IF ((:GLOBAL.GIFT_NO <> :AGRPGBE_GIFT_NO -- OR :AGRPGBE_GIFT_NO IS NULL     -- Defect#1-G9OURZ  
//         	    ) AND ((:GLOBAL.PLEDGE_NO IS NULL OR :GLOBAL.PLEDGE_NO = '0000000')AND :AGRPGBE.ROWID IS NOT NULL)) THEN
//         	 MESSAGE(G$_NLS.Get('AOQCLIB-0044','FORM','*ERROR* Gift number must match gift number in key block.'));
//  	        RAISE FORM_TRIGGER_FAILURE;
//         END IF;
//	      -- Begin defect#1-G9OUS1 added code      
//         IF (:GLOBAL.GIFT_NO <> :AGRPGBE_GIFT_NO AND :AGRPGBE_GIFT_NO IS NOT NULL) THEN
//         	 MESSAGE(G$_NLS.Get('AOQCLIB-0045','FORM','*ERROR* Gift number must match gift number in key block.'));
//  	        RAISE FORM_TRIGGER_FAILURE;
//         END IF;
//         -- End defect#1-G9OUS1 added code               
//      END IF;      
//      IF :GLOBAL.GIFT_NO IS NOT NULL THEN
//         IF ((:GLOBAL.GIFT_NO <> :AGRPGBE_GIFT_NO -- OR :AGRPGBE_GIFT_NO IS NULL     -- Defect#1-G9OURZ 
//         	    ) AND :GLOBAL.GIFT_NO IS NOT NULL AND :AGRPGBE.ROWID IS NOT NULL AND :GLOBAL.PLEDGE_NO IS NULL) THEN
//         	 MESSAGE(G$_NLS.Get('AOQCLIB-0046','FORM','*ERROR* Gift number must match gift number in key block.'));
//  	        RAISE FORM_TRIGGER_FAILURE;
//         END IF;
//      END IF;
//      OPEN PTI_CURSOR2;
//      FETCH PTI_CURSOR2 INTO COUNT_GDES;
//      IF COUNT_GDES < 2 THEN
//         IF :GLOBAL.GIFT_NO IS NOT NULL THEN
//           IF :GLOBAL.GIFT_NO <> :AGRPGBE_GIFT_NO AND :AGRPGBE_GIFT_NO IS NOT NULL THEN
//         	    MESSAGE(G$_NLS.Get('AOQCLIB-0047','FORM','*ERROR* Gift number must match gift number in key block.'));
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
//		 * AGRPGBE_GIFT_NO.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="AGRPGBE_GIFT_NO")
//		public void agrpgbeGiftNo_validate()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				int rowCount = 0;
//				{
//					NNumber countGdes= NNumber.getNull();
//					NString ptiIntoTemp= NString.getNull();
//					String sqlptiCursor = "SELECT 'Y' " +
//	" FROM AGBGIFT " +
//	" WHERE AGBGIFT_PIDM = :KEY_BLOCK_PIDM AND AGBGIFT_GIFT_NO = :AGRPGBE_GIFT_NO ";
//					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
//					String sqlptiCursor2 = "SELECT COUNT(*) " +
//	" FROM AGRGDES " +
//	" WHERE AGRGDES_PIDM = :KEY_BLOCK_PIDM AND AGRGDES_GIFT_NO = :GLOBAL_GIFT_NO ";
//					DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
//					try {
//						if ( !agrpgbeElement.getAgrpgbeGiftNo().isNull() )
//						{
//							//Setting query parameters
//							ptiCursor.addParameter("KEY_BLOCK_PIDM", this.getModel()getValue(KEY_BLOCK,PIDM));
//							ptiCursor.addParameter("AGRPGBE_GIFT_NO", agrpgbeElement.getAgrpgbeGiftNo());
//							//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
//							ptiCursor.open();
//							ResultSet ptiCursorResults = ptiCursor.fetchInto();
//							if ( ptiCursorResults != null ) {
//								ptiIntoTemp = ptiCursorResults.getStr(0);
//							}
//							getContainer().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("AOQCLIB-0043"), toStr("FORM"), toStr("*ERROR* Gift number does not exist; press LIST for gift numbers.")), NBool.True);
//							ptiCursor.close();
//						}
//						if ( !getGlobal("GIFT_NO").isNull() )
//						{
//							// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//							if (((getGlobal("GIFT_NO").notEquals(agrpgbeElement.getAgrpgbeGiftNo())) && ((getGlobal("PLEDGE_NO").isNull() || getGlobal("PLEDGE_NO").equals("0000000")) && !agrpgbeElement.getROWID().isNull())))
//							{
//								errorMessage(GNls.Fget(toStr("AOQCLIB-0044"), toStr("FORM"), toStr("*ERROR* Gift number must match gift number in key block.")));
//								throw new ApplicationException();
//							}
//							//  Begin defect#1-G9OUS1 added code      
//							if ((getGlobal("GIFT_NO").notEquals(agrpgbeElement.getAgrpgbeGiftNo()) && !agrpgbeElement.getAgrpgbeGiftNo().isNull()))
//							{
//								errorMessage(GNls.Fget(toStr("AOQCLIB-0045"), toStr("FORM"), toStr("*ERROR* Gift number must match gift number in key block.")));
//								throw new ApplicationException();
//							}
//						}
//						if ( !getGlobal("GIFT_NO").isNull() )
//						{
//							// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//							if (((getGlobal("GIFT_NO").notEquals(agrpgbeElement.getAgrpgbeGiftNo())) && !getGlobal("GIFT_NO").isNull() && !agrpgbeElement.getROWID().isNull() && getGlobal("PLEDGE_NO").isNull()))
//							{
//								errorMessage(GNls.Fget(toStr("AOQCLIB-0046"), toStr("FORM"), toStr("*ERROR* Gift number must match gift number in key block.")));
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
//								if ( getGlobal("GIFT_NO").notEquals(agrpgbeElement.getAgrpgbeGiftNo()) && !agrpgbeElement.getAgrpgbeGiftNo().isNull() )
//								{
//									errorMessage(GNls.Fget(toStr("AOQCLIB-0047"), toStr("FORM"), toStr("*ERROR* Gift number must match gift number in key block.")));
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
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_GIFT_NO.KEY-LISTVAL
//		 IF :GLOBAL.PLEDGE_NO IS NULL AND
//	 :AGRPGBE_GIFT_NO IS NULL THEN
//	 :AGRPGBE_GIFT_NO := :GLOBAL.GIFT_NO;
//ELSIF (:AGRPGBE_GIFT_NO IS NULL OR
//	     :AGRPGBE_GIFT_NO <> :GLOBAL.GIFT_NO) AND 
//	     :AGRPGBE_PLEDGE_NO IS NULL AND
//	     :GLOBAL.GIFT_NO IS NOT NULL THEN
//	     :AGRPGBE_GIFT_NO := :GLOBAL.GIFT_NO;
//ELSE  
//  G$_DISPLAY_LOV('','');
//  G$_CHECK_FAILURE;
//END IF;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_GIFT_NO.KEY-LISTVAL
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-LISTVAL", item="AGRPGBE_GIFT_NO", function=KeyFunction.LIST_VALUES)
//		public void agrpgbeGiftNo_ListValues()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				if ( getGlobal("PLEDGE_NO").isNull() && agrpgbeElement.getAgrpgbeGiftNo().isNull() )
//				{
//					agrpgbeElement.setAgrpgbeGiftNo(getGlobal("GIFT_NO"));
//				}
//				else if ( (agrpgbeElement.getAgrpgbeGiftNo().isNull() || agrpgbeElement.getAgrpgbeGiftNo().notEquals(getGlobal("GIFT_NO"))) && agrpgbeElement.getAgrpgbePledgeNo().isNull() && !getGlobal("GIFT_NO").isNull() ) {
//					agrpgbeElement.setAgrpgbeGiftNo(getGlobal("GIFT_NO"));
//				}
//				else {
//					gDisplayLov("", "");
//					getContainer().getGoqrpls().gCheckFailure();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_SURNAME_PREFIX.POST-CHANGE
//		 BEGIN
//   G$_CHECK_QUERY_MODE ;
//--
//   :PGBE_SURNAME_PREFIX := :AGRPGBE_SURNAME_PREFIX ;
//--
//   :GLOBAL.QUERY_MODE := '0' ;
//EXCEPTION
//   WHEN FORM_TRIGGER_FAILURE THEN
//      :GLOBAL.QUERY_MODE := '0' ;
//      RAISE FORM_TRIGGER_FAILURE ;
//END ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_SURNAME_PREFIX.POST-CHANGE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-CHANGE", item="AGRPGBE_SURNAME_PREFIX")
//		public void agrpgbeSurnamePrefix_PostChange()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				if(agrpgbeElement.getAgrpgbeSurnamePrefix().isNull())
//		return;
//				try
//				{
//					gCheckQueryMode;
//					// 
//					agrpgbeElement.setPgbeSurnamePrefix(agrpgbeElement.getAgrpgbeSurnamePrefix());
//					// 
//					setGlobal("QUERY_MODE", toStr("0"));
//				}
//				catch(ApplicationException e)
//				{
//					setGlobal("QUERY_MODE", toStr("0"));
//					throw new ApplicationException();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_SURNAME_PREFIX.WHEN-VALIDATE-ITEM
//		 BEGIN
//   G$_CHECK_QUERY_MODE ;
//--
//   IF :AGRPGBE_PGBE_PIDM IS NULL AND
//      :PGBE_SURNAME_PREFIX IS NOT NULL THEN
//      :PGBE_CHANGE_IND := 'Y' ;
//   END IF ;
//--
//   :GLOBAL.QUERY_MODE := '0' ;
//EXCEPTION
//   WHEN FORM_TRIGGER_FAILURE THEN
//      :GLOBAL.QUERY_MODE := '0' ;
//      RAISE FORM_TRIGGER_FAILURE ;
//END ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_SURNAME_PREFIX.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="PGBE_SURNAME_PREFIX")
//		public void pgbeSurnamePrefix_validate()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//			this.pgbeSurnamePrefix_PostChange();
//
//				try
//				{
//					gCheckQueryMode;
//					// 
//					if ( agrpgbeElement.getAgrpgbePgbePidm().isNull() && !agrpgbeElement.getPgbeSurnamePrefix().isNull() )
//					{
//						agrpgbeElement.setPgbeChangeInd(toStr("Y"));
//					}
//					// 
//					setGlobal("QUERY_MODE", toStr("0"));
//				}
//				catch(ApplicationException e)
//				{
//					setGlobal("QUERY_MODE", toStr("0"));
//					throw new ApplicationException();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_SURNAME_PREFIX.POST-TEXT-ITEM
//		 IF :PGBE_SURNAME_PREFIX IS NULL  THEN
//   IF :AGRPGBE_SURNAME_PREFIX IS NOT NULL  THEN
//      :AGRPGBE_SURNAME_PREFIX := :PGBE_SURNAME_PREFIX ;
//   END IF ;
//END IF ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_SURNAME_PREFIX.POST-TEXT-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-TEXT-ITEM", item="PGBE_SURNAME_PREFIX", function=KeyFunction.ITEM_OUT)
//		public void pgbeSurnamePrefix_itemOut()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				if ( agrpgbeElement.getPgbeSurnamePrefix().isNull() )
//				{
//					if ( !agrpgbeElement.getAgrpgbeSurnamePrefix().isNull() )
//					{
//						agrpgbeElement.setAgrpgbeSurnamePrefix(agrpgbeElement.getPgbeSurnamePrefix());
//					}
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_SURNAME_PREFIX.POST-CHANGE
//		 BEGIN
//   G$_CHECK_QUERY_MODE ;
//--
//   IF :AGRPGBE_PGBE_PIDM IS NULL  THEN
//      :PGBE_CHANGE_IND := 'Y' ;
//   END IF ;
//--
//   :GLOBAL.QUERY_MODE := '0' ;
//EXCEPTION
//   WHEN FORM_TRIGGER_FAILURE THEN
//      :GLOBAL.QUERY_MODE := '0' ;
//      RAISE FORM_TRIGGER_FAILURE ;
//END ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_SURNAME_PREFIX.POST-CHANGE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-CHANGE", item="PGBE_SURNAME_PREFIX")
//		public void pgbeSurnamePrefix_PostChange()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				if(agrpgbeElement.getPgbeSurnamePrefix().isNull())
//		return;
//				try
//				{
//					gCheckQueryMode;
//					// 
//					if ( agrpgbeElement.getAgrpgbePgbePidm().isNull() )
//					{
//						agrpgbeElement.setPgbeChangeInd(toStr("Y"));
//					}
//					// 
//					setGlobal("QUERY_MODE", toStr("0"));
//				}
//				catch(ApplicationException e)
//				{
//					setGlobal("QUERY_MODE", toStr("0"));
//					throw new ApplicationException();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_LAST_NAME.POST-CHANGE
//		 BEGIN
//   G$_CHECK_QUERY_MODE ;
//--
//   :PGBE_LAST_NAME := :AGRPGBE_LAST_NAME ;
//--
//   :GLOBAL.QUERY_MODE := '0' ;
//EXCEPTION
//   WHEN FORM_TRIGGER_FAILURE THEN
//      :GLOBAL.QUERY_MODE := '0' ;
//      RAISE FORM_TRIGGER_FAILURE ;
//END ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_LAST_NAME.POST-CHANGE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-CHANGE", item="AGRPGBE_LAST_NAME")
//		public void agrpgbeLastName_PostChange()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				if(agrpgbeElement.getAgrpgbeLastName().isNull())
//		return;
//				try
//				{
//					gCheckQueryMode;
//					// 
//					agrpgbeElement.setPgbeLastName(agrpgbeElement.getAgrpgbeLastName());
//					// 
//					setGlobal("QUERY_MODE", toStr("0"));
//				}
//				catch(ApplicationException e)
//				{
//					setGlobal("QUERY_MODE", toStr("0"));
//					throw new ApplicationException();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_LAST_NAME.WHEN-VALIDATE-ITEM
//		 BEGIN
//   G$_CHECK_QUERY_MODE ;
//--
//   IF :AGRPGBE_PGBE_PIDM IS NULL AND
//      :PGBE_LAST_NAME IS NOT NULL THEN
//      :PGBE_CHANGE_IND := 'Y' ;
//   END IF ;
//--
//   :GLOBAL.QUERY_MODE := '0' ;
//EXCEPTION
//   WHEN FORM_TRIGGER_FAILURE THEN
//      :GLOBAL.QUERY_MODE := '0' ;
//      RAISE FORM_TRIGGER_FAILURE ;
//END ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_LAST_NAME.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="PGBE_LAST_NAME")
//		public void pgbeLastName_validate()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//			this.pgbeLastName_PostChange();
//
//				try
//				{
//					gCheckQueryMode;
//					// 
//					if ( agrpgbeElement.getAgrpgbePgbePidm().isNull() && !agrpgbeElement.getPgbeLastName().isNull() )
//					{
//						agrpgbeElement.setPgbeChangeInd(toStr("Y"));
//					}
//					// 
//					setGlobal("QUERY_MODE", toStr("0"));
//				}
//				catch(ApplicationException e)
//				{
//					setGlobal("QUERY_MODE", toStr("0"));
//					throw new ApplicationException();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_LAST_NAME.POST-CHANGE
//		 BEGIN
//   G$_CHECK_QUERY_MODE ;
//--
//   IF :AGRPGBE_PGBE_PIDM IS NULL  THEN
//      :PGBE_CHANGE_IND := 'Y' ;
//   END IF ;
//--
//   :GLOBAL.QUERY_MODE := '0' ;
//EXCEPTION
//   WHEN FORM_TRIGGER_FAILURE THEN
//      :GLOBAL.QUERY_MODE := '0' ;
//      RAISE FORM_TRIGGER_FAILURE ;
//END ;
//
//
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_LAST_NAME.POST-CHANGE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-CHANGE", item="PGBE_LAST_NAME")
//		public void pgbeLastName_PostChange()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				if(agrpgbeElement.getPgbeLastName().isNull())
//		return;
//				try
//				{
//					gCheckQueryMode;
//					// 
//					if ( agrpgbeElement.getAgrpgbePgbePidm().isNull() )
//					{
//						agrpgbeElement.setPgbeChangeInd(toStr("Y"));
//					}
//					// 
//					setGlobal("QUERY_MODE", toStr("0"));
//				}
//				catch(ApplicationException e)
//				{
//					setGlobal("QUERY_MODE", toStr("0"));
//					throw new ApplicationException();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_FIRST_NAME.POST-CHANGE
//		 BEGIN
//   G$_CHECK_QUERY_MODE ;
//--
//   :PGBE_FIRST_NAME := :AGRPGBE_FIRST_NAME ;
//--
//   :GLOBAL.QUERY_MODE := '0' ;
//EXCEPTION
//   WHEN FORM_TRIGGER_FAILURE THEN
//      :GLOBAL.QUERY_MODE := '0' ;
//      RAISE FORM_TRIGGER_FAILURE ;
//END ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_FIRST_NAME.POST-CHANGE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-CHANGE", item="AGRPGBE_FIRST_NAME")
//		public void agrpgbeFirstName_PostChange()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				if(agrpgbeElement.getAgrpgbeFirstName().isNull())
//		return;
//				try
//				{
//					gCheckQueryMode;
//					// 
//					agrpgbeElement.setPgbeFirstName(agrpgbeElement.getAgrpgbeFirstName());
//					// 
//					setGlobal("QUERY_MODE", toStr("0"));
//				}
//				catch(ApplicationException e)
//				{
//					setGlobal("QUERY_MODE", toStr("0"));
//					throw new ApplicationException();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_FIRST_NAME.WHEN-VALIDATE-ITEM
//		 BEGIN
//   G$_CHECK_QUERY_MODE ;
//--
//   IF :AGRPGBE_PGBE_PIDM IS NULL AND
//      :PGBE_FIRST_NAME IS NOT NULL THEN
//      :PGBE_CHANGE_IND := 'Y' ;
//   END IF ;
//--
//   :GLOBAL.QUERY_MODE := '0' ;
//EXCEPTION
//   WHEN FORM_TRIGGER_FAILURE THEN
//      :GLOBAL.QUERY_MODE := '0' ;
//      RAISE FORM_TRIGGER_FAILURE ;
//END ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_FIRST_NAME.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="PGBE_FIRST_NAME")
//		public void pgbeFirstName_validate()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				try
//				{
//					gCheckQueryMode;
//					// 
//					if ( agrpgbeElement.getAgrpgbePgbePidm().isNull() && !agrpgbeElement.getPgbeFirstName().isNull() )
//					{
//						agrpgbeElement.setPgbeChangeInd(toStr("Y"));
//					}
//					// 
//					setGlobal("QUERY_MODE", toStr("0"));
//				}
//				catch(ApplicationException e)
//				{
//					setGlobal("QUERY_MODE", toStr("0"));
//					throw new ApplicationException();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_MI.POST-CHANGE
//		 BEGIN
//   G$_CHECK_QUERY_MODE ;
//--
//   :PGBE_MI := :AGRPGBE_MI ;
//--
//   :GLOBAL.QUERY_MODE := '0' ;
//EXCEPTION
//   WHEN FORM_TRIGGER_FAILURE THEN
//      :GLOBAL.QUERY_MODE := '0' ;
//      RAISE FORM_TRIGGER_FAILURE ;
//END ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_MI.POST-CHANGE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-CHANGE", item="AGRPGBE_MI")
//		public void agrpgbeMi_PostChange()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				if(agrpgbeElement.getAgrpgbeMi().isNull())
//		return;
//				try
//				{
//					gCheckQueryMode;
//					// 
//					agrpgbeElement.setPgbeMi(agrpgbeElement.getAgrpgbeMi());
//					// 
//					setGlobal("QUERY_MODE", toStr("0"));
//				}
//				catch(ApplicationException e)
//				{
//					setGlobal("QUERY_MODE", toStr("0"));
//					throw new ApplicationException();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_MI.POST-TEXT-ITEM
//		   IF :PGBE_MI IS NULL  THEN
//      IF :AGRPGBE_MI IS NOT NULL  THEN
//         :AGRPGBE_MI := :PGBE_MI ;
//      END IF ;
//   END IF ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_MI.POST-TEXT-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-TEXT-ITEM", item="PGBE_MI", function=KeyFunction.ITEM_OUT)
//		public void pgbeMi_itemOut()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				if ( agrpgbeElement.getPgbeMi().isNull() )
//				{
//					if ( !agrpgbeElement.getAgrpgbeMi().isNull() )
//					{
//						agrpgbeElement.setAgrpgbeMi(agrpgbeElement.getPgbeMi());
//					}
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_MI.POST-CHANGE
//		 BEGIN
//   G$_CHECK_QUERY_MODE ;
//--
//   IF :AGRPGBE_PGBE_PIDM IS NULL  THEN
//      :PGBE_CHANGE_IND := 'Y' ;
//   END IF ;
//--
//   :GLOBAL.QUERY_MODE := '0' ;
//EXCEPTION
//   WHEN FORM_TRIGGER_FAILURE THEN
//      :GLOBAL.QUERY_MODE := '0' ;
//      RAISE FORM_TRIGGER_FAILURE ;
//END ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_MI.POST-CHANGE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-CHANGE", item="PGBE_MI")
//		public void pgbeMi_PostChange()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				if(agrpgbeElement.getPgbeMi().isNull())
//		return;
//				try
//				{
//					gCheckQueryMode;
//					// 
//					if ( agrpgbeElement.getAgrpgbePgbePidm().isNull() )
//					{
//						agrpgbeElement.setPgbeChangeInd(toStr("Y"));
//					}
//					// 
//					setGlobal("QUERY_MODE", toStr("0"));
//				}
//				catch(ApplicationException e)
//				{
//					setGlobal("QUERY_MODE", toStr("0"));
//					throw new ApplicationException();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_SEX.POST-CHANGE
//		 BEGIN
//   G$_CHECK_QUERY_MODE ;
//--
//   :PGBE_SEX := :AGRPGBE_SEX ;
//--
//   :GLOBAL.QUERY_MODE := '0' ;
//EXCEPTION
//   WHEN FORM_TRIGGER_FAILURE THEN
//      :GLOBAL.QUERY_MODE := '0' ;
//      RAISE FORM_TRIGGER_FAILURE ;
//END ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_SEX.POST-CHANGE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-CHANGE", item="AGRPGBE_SEX")
//		public void agrpgbeSex_PostChange()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				if(agrpgbeElement.getAgrpgbeSex().isNull())
//		return;
//				try
//				{
//					gCheckQueryMode;
//					// 
//					agrpgbeElement.setPgbeSex(agrpgbeElement.getAgrpgbeSex());
//					// 
//					setGlobal("QUERY_MODE", toStr("0"));
//				}
//				catch(ApplicationException e)
//				{
//					setGlobal("QUERY_MODE", toStr("0"));
//					throw new ApplicationException();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_SEX.INVALID_SEX
//		    MESSAGE(  G$_NLS.Get('AOQCLIB-0048', 'FORM','*ERROR* Beneficiary''s Sex; valid values (M, F, N).')  )
//       ;
//   RAISE FORM_TRIGGER_FAILURE ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_SEX.INVALID_SEX
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="INVALID_SEX", item="PGBE_SEX")
//		public void pgbeSex_InvalidSex()
//		{
//			
//				errorMessage(GNls.Fget(toStr("AOQCLIB-0048"), toStr("FORM"), toStr("*ERROR* Beneficiary's Sex; valid values (M, F, N).")));
//				throw new ApplicationException();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_SEX.WHEN-RADIO-CHANGED
//		 BEGIN
//   IF :AGRPGBE_PGBE_PIDM IS NULL  THEN
//      :PGBE_CHANGE_IND := 'Y' ;
//      :AGRPGBE_SEX := :PGBE_SEX;
//   END IF ;
//--
//   :GLOBAL.QUERY_MODE := '0' ;
//EXCEPTION
//   WHEN FORM_TRIGGER_FAILURE THEN
//      :GLOBAL.QUERY_MODE := '0' ;
//      RAISE FORM_TRIGGER_FAILURE ;
//END ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_SEX.WHEN-RADIO-CHANGED
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-RADIO-CHANGED", item="PGBE_SEX")
//		public void pgbeSex_radioGroupChange()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				try
//				{
//					if ( agrpgbeElement.getAgrpgbePgbePidm().isNull() )
//					{
//						agrpgbeElement.setPgbeChangeInd(toStr("Y"));
//						agrpgbeElement.setAgrpgbeSex(agrpgbeElement.getPgbeSex());
//					}
//					// 
//					setGlobal("QUERY_MODE", toStr("0"));
//				}
//				catch(ApplicationException e)
//				{
//					setGlobal("QUERY_MODE", toStr("0"));
//					throw new ApplicationException();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_BIRTH_DATE.POST-CHANGE
//		 BEGIN
//   G$_CHECK_QUERY_MODE ;
//--
//:PGBE_BIRTH_DATE := :AGRPGBE_BIRTH_DATE ;
//--
//   :GLOBAL.QUERY_MODE := '0' ;
//EXCEPTION
//   WHEN FORM_TRIGGER_FAILURE THEN
//      :GLOBAL.QUERY_MODE := '0' ;
//      RAISE FORM_TRIGGER_FAILURE ;
//END ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_BIRTH_DATE.POST-CHANGE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-CHANGE", item="AGRPGBE_BIRTH_DATE")
//		public void agrpgbeBirthDate_PostChange()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				if(agrpgbeElement.getAgrpgbeBirthDate().isNull())
//		return;
//				try
//				{
//					gCheckQueryMode;
//					// 
//					agrpgbeElement.setPgbeBirthDate(agrpgbeElement.getAgrpgbeBirthDate());
//					// 
//					setGlobal("QUERY_MODE", toStr("0"));
//				}
//				catch(ApplicationException e)
//				{
//					setGlobal("QUERY_MODE", toStr("0"));
//					throw new ApplicationException();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_BIRTH_DATE.WHEN-VALIDATE-ITEM
//		 G$_DATE_REFORMAT('','');
//G$_CHECK_FAILURE;
//--
//--
//IF :PGBE_BIRTH_DATE > SYSDATE THEN
//   MESSAGE( G$_NLS.Get('AOQCLIB-0049', 'FORM','*ERROR* Birthdate cannot be greater than today.') );
//   RAISE FORM_TRIGGER_FAILURE;
//END IF;
//   
//IF :PGBE_DECEASED_DATE IS NULL THEN
//   :DISPLAY_AGE := FLOOR(MONTHS_BETWEEN(SYSDATE, :PGBE_BIRTH_DATE) / 12);
//ELSE
//   :DISPLAY_AGE := FLOOR(MONTHS_BETWEEN(:PGBE_DECEASED_DATE, :PGBE_BIRTH_DATE) / 12);
//END IF;
//--
//IF :AGRPGBE_PGBE_PIDM IS NULL  THEN
//   :PGBE_CHANGE_IND := 'Y' ;
//END IF ;
//:AGRPGBE_BIRTH_DATE := :PGBE_BIRTH_DATE ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_BIRTH_DATE.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="PGBE_BIRTH_DATE")
//		public void pgbeBirthDate_validate()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				gDateReformat("", "");
//				getContainer().getGoqrpls().gCheckFailure();
//				// 
//				// 
//				if ( agrpgbeElement.getPgbeBirthDate().greater(NDate.getNow()) )
//				{
//					errorMessage(GNls.Fget(toStr("AOQCLIB-0049"), toStr("FORM"), toStr("*ERROR* Birthdate cannot be greater than today.")));
//					throw new ApplicationException();
//				}
//				if ( agrpgbeElement.getPgbeDeceasedDate().isNull() )
//				{
//					agrpgbeElement.setDisplayAge(floor(monthsBetween(NDate.getNow(), agrpgbeElement.getPgbeBirthDate()).divide(12)));
//				}
//				else {
//					agrpgbeElement.setDisplayAge(floor(monthsBetween(agrpgbeElement.getPgbeDeceasedDate(), agrpgbeElement.getPgbeBirthDate()).divide(12)));
//				}
//				// 
//				if ( agrpgbeElement.getAgrpgbePgbePidm().isNull() )
//				{
//					agrpgbeElement.setPgbeChangeInd(toStr("Y"));
//				}
//				agrpgbeElement.setAgrpgbeBirthDate(agrpgbeElement.getPgbeBirthDate());
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_BIRTH_DATE.KEY-NEXT-ITEM
//		 G$_DATE_REFORMAT('','');
//G$_CHECK_FAILURE;
//
//NEXT_ITEM;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_BIRTH_DATE.KEY-NEXT-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-NEXT-ITEM", item="PGBE_BIRTH_DATE", function=KeyFunction.NEXT_ITEM)
//		public void pgbeBirthDate_keyNexItem()
//		{
//			
//				gDateReformat("", "");
//				getContainer().getGoqrpls().gCheckFailure();
//				nextItem();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_BIRTH_DATE.WHEN-NEW-ITEM-INSTANCE
//		 G$_DATE_WHEN_NEW_ITEM;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_BIRTH_DATE.WHEN-NEW-ITEM-INSTANCE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PGBE_BIRTH_DATE", function=KeyFunction.ITEM_CHANGE)
//		public void pgbeBirthDate_itemChange()
//		{
//			
//				gDateWhenNewItem;
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_BIRTH_DATE.POST-TEXT-ITEM
//		 G$_DATE_REFORMAT('','');
//G$_CHECK_FAILURE;
//--
//--
//IF :PGBE_BIRTH_DATE > SYSDATE THEN
//   MESSAGE( G$_NLS.Get('AOQCLIB-0050', 'FORM','*ERROR* Birthdate cannot be greater than today.') );
//   RAISE FORM_TRIGGER_FAILURE;
//END IF;
//   
//IF :PGBE_DECEASED_DATE IS NULL THEN
//   :DISPLAY_AGE := FLOOR(MONTHS_BETWEEN(SYSDATE, :PGBE_BIRTH_DATE) / 12);
//ELSE
//   :DISPLAY_AGE := FLOOR(MONTHS_BETWEEN(:PGBE_DECEASED_DATE, :PGBE_BIRTH_DATE) / 12);
//END IF;
//--
//IF :AGRPGBE_PGBE_PIDM IS NULL  THEN
//   :PGBE_CHANGE_IND := 'Y' ;
//END IF ;
//G$_DATE_POST_ITEM;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_BIRTH_DATE.POST-TEXT-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-TEXT-ITEM", item="PGBE_BIRTH_DATE", function=KeyFunction.ITEM_OUT)
//		public void pgbeBirthDate_itemOut()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				gDateReformat("", "");
//				getContainer().getGoqrpls().gCheckFailure();
//				// 
//				// 
//				if ( agrpgbeElement.getPgbeBirthDate().greater(NDate.getNow()) )
//				{
//					errorMessage(GNls.Fget(toStr("AOQCLIB-0050"), toStr("FORM"), toStr("*ERROR* Birthdate cannot be greater than today.")));
//					throw new ApplicationException();
//				}
//				if ( agrpgbeElement.getPgbeDeceasedDate().isNull() )
//				{
//					agrpgbeElement.setDisplayAge(floor(monthsBetween(NDate.getNow(), agrpgbeElement.getPgbeBirthDate()).divide(12)));
//				}
//				else {
//					agrpgbeElement.setDisplayAge(floor(monthsBetween(agrpgbeElement.getPgbeDeceasedDate(), agrpgbeElement.getPgbeBirthDate()).divide(12)));
//				}
//				// 
//				if ( agrpgbeElement.getAgrpgbePgbePidm().isNull() )
//				{
//					agrpgbeElement.setPgbeChangeInd(toStr("Y"));
//				}
//				gDatePostItem;
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_DECEASED_IND.POST-CHANGE
//		 :PGBE_DECEASED_IND  := :AGRPGBE_DECEASED_IND;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_DECEASED_IND.POST-CHANGE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-CHANGE", item="AGRPGBE_DECEASED_IND")
//		public void agrpgbeDeceasedInd_PostChange()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				if(agrpgbeElement.getAgrpgbeDeceasedInd().isNull())
//		return;
//				agrpgbeElement.setPgbeDeceasedInd(agrpgbeElement.getAgrpgbeDeceasedInd());
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_DECEASED_IND.WHEN-CHECKBOX-CHANGED
//		 --
//IF :AGRPGBE_PGBE_PIDM IS NULL  THEN
//   :PGBE_CHANGE_IND := 'Y' ;
//END IF ;
//--
//IF NOT Checkbox_Checked('PGBE_DECEASED_IND') THEN
//     :PGBE_DECEASED_DATE :='';
//     :pgbe_deceased_ind := '';
//ELSE
//     :pgbe_deceased_ind := 'Y';
//END IF;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_DECEASED_IND.WHEN-CHECKBOX-CHANGED
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="PGBE_DECEASED_IND")
//		public void pgbeDeceasedInd_checkBoxChange()
//		{
//			
//				// 
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				// 
//				if ( agrpgbeElement.getAgrpgbePgbePidm().isNull() )
//				{
//					agrpgbeElement.setPgbeChangeInd(toStr("Y"));
//				}
//				// 
//				if ( SupportClasses.FORMS40.CheckboxChecked("PGBE_DECEASED_IND").not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					agrpgbeElement.setPgbeDeceasedDate(toDate(""));
//					agrpgbeElement.setPgbeDeceasedInd(toStr(""));
//				}
//				else {
//					agrpgbeElement.setPgbeDeceasedInd(toStr("Y"));
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_DECEASED_DATE.POST-CHANGE
//		 :PGBE_DECEASED_DATE := :AGRPGBE_DECEASED_DATE;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_DECEASED_DATE.POST-CHANGE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-CHANGE", item="AGRPGBE_DECEASED_DATE")
//		public void agrpgbeDeceasedDate_PostChange()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				if(agrpgbeElement.getAgrpgbeDeceasedDate().isNull())
//		return;
//				agrpgbeElement.setPgbeDeceasedDate(agrpgbeElement.getAgrpgbeDeceasedDate());
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_DECEASED_DATE.WHEN-VALIDATE-ITEM
//		 IF  Checkbox_Checked('PGBE_DECEASED_IND') THEN
//G$_DATE_REFORMAT('','');
//G$_CHECK_FAILURE;
//--
//  IF :PGBE_DECEASED_DATE > SYSDATE THEN
//     MESSAGE( G$_NLS.Get('AOQCLIB-0051', 'FORM','Deceased Date can not be greater then Current date.') );
//     RAISE FORM_TRIGGER_FAILURE;
//  ELSIF 
//     :PGBE_DECEASED_DATE < :PGBE_BIRTH_DATE THEN
//     MESSAGE( G$_NLS.Get('AOQCLIB-0052', 'FORM','Deceased Date can not be earlier then Birth date') );
//     RAISE FORM_TRIGGER_FAILURE;
//  END IF;
//--
//IF NOT Checkbox_Checked('PGBE_DECEASED_IND') THEN
//    :PGBE_DECEASED_DATE :='';
//    
//  END IF;
//--
//IF :AGRPGBE_PGBE_PIDM IS NULL  THEN
//   :PGBE_CHANGE_IND := 'Y' ;
//END IF ;
//--
//   EXECUTE_TRIGGER('CALC_AGE');
//ELSE
//  IF :PGBE_DECEASED_DATE IS NOT NULL THEN
//     :PGBE_DECEASED_DATE :='';
//   END IF;
//END IF;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_DECEASED_DATE.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="PGBE_DECEASED_DATE")
//		public void pgbeDeceasedDate_validate()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				if ( SupportClasses.FORMS40.CheckboxChecked("PGBE_DECEASED_IND").getValue() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					gDateReformat("", "");
//					getContainer().getGoqrpls().gCheckFailure();
//					// 
//					if ( agrpgbeElement.getPgbeDeceasedDate().greater(NDate.getNow()) )
//					{
//						message(GNls.Fget(toStr("AOQCLIB-0051"), toStr("FORM"), toStr("Deceased Date can not be greater then Current date.")));
//						throw new ApplicationException();
//					}
//					else if ( agrpgbeElement.getPgbeDeceasedDate().lesser(agrpgbeElement.getPgbeBirthDate()) ) {
//						message(GNls.Fget(toStr("AOQCLIB-0052"), toStr("FORM"), toStr("Deceased Date can not be earlier then Birth date")));
//						throw new ApplicationException();
//					}
//					// 
//					if ( SupportClasses.FORMS40.CheckboxChecked("PGBE_DECEASED_IND").not() )
//					{
//						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//						agrpgbeElement.setPgbeDeceasedDate(toDate(""));
//					}
//					// 
//					if ( agrpgbeElement.getAgrpgbePgbePidm().isNull() )
//					{
//						agrpgbeElement.setPgbeChangeInd(toStr("Y"));
//					}
//					// 
//					executeAction("CALC_AGE");
//				}
//				else {
//					if ( !agrpgbeElement.getPgbeDeceasedDate().isNull() )
//					{
//						agrpgbeElement.setPgbeDeceasedDate(toDate(""));
//					}
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_DECEASED_DATE.POST-TEXT-ITEM
//		 G$_DATE_POST_ITEM;
//--
//   IF NOT Checkbox_Checked('PGBE_DECEASED_IND') THEN
//     :PGBE_DECEASED_DATE :='';
//   END IF;
//
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_DECEASED_DATE.POST-TEXT-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-TEXT-ITEM", item="PGBE_DECEASED_DATE", function=KeyFunction.ITEM_OUT)
//		public void pgbeDeceasedDate_itemOut()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				gDatePostItem;
//				// 
//				if ( SupportClasses.FORMS40.CheckboxChecked("PGBE_DECEASED_IND").not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					agrpgbeElement.setPgbeDeceasedDate(toDate(""));
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_DECEASED_DATE.WHEN-NEW-ITEM-INSTANCE
//		 G$_DATE_WHEN_NEW_ITEM;
//
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_DECEASED_DATE.WHEN-NEW-ITEM-INSTANCE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PGBE_DECEASED_DATE", function=KeyFunction.ITEM_CHANGE)
//		public void pgbeDeceasedDate_itemChange()
//		{
//			
//				gDateWhenNewItem;
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_COMMENT_BTN.WHEN-BUTTON-PRESSED
//		 go_item('AGRPGBE_COMMENT');
//edit_textitem;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_COMMENT_BTN.WHEN-BUTTON-PRESSED
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="AGRPGBE_COMMENT_BTN")
//		public void agrpgbeCommentBtn_buttonClick()
//		{
//			
//				goItem(toStr("AGRPGBE_COMMENT"));
//				// F2J_NOT_SUPPORTED : Call to built-in "EDIT_TEXTITEM" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\AOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
//				//				SupportClasses.FORMS40.EditTextitem();
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'EDIT_TEXTITEM' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\AOQCLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
//				
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_ACTIVITY_DATE.KEY-NEXT-ITEM
//		 BEGIN
//  G$_DATE_NEXT_ITEM;
//  G$_CHECK_FAILURE;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_ACTIVITY_DATE.KEY-NEXT-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-NEXT-ITEM", item="AGRPGBE_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
//		public void agrpgbeActivityDate_keyNexItem()
//		{
//			
//				gDateNextItem;
//				getContainer().getGoqrpls().gCheckFailure();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
//		 BEGIN
//  G$_DATE_WHEN_NEW_ITEM;
//  G$_CHECK_FAILURE;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="AGRPGBE_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
//		public void agrpgbeActivityDate_itemChange()
//		{
//			
//				gDateWhenNewItem;
//				getContainer().getGoqrpls().gCheckFailure();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_ACTIVITY_DATE.POST-TEXT-ITEM
//		 BEGIN
//  G$_DATE_POST_ITEM;
//  G$_CHECK_FAILURE;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_ACTIVITY_DATE.POST-TEXT-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-TEXT-ITEM", item="AGRPGBE_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
//		public void agrpgbeActivityDate_itemOut()
//		{
//			
//				gDatePostItem;
//				getContainer().getGoqrpls().gCheckFailure();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_ID_LBT.WHEN-BUTTON-PRESSED
//		 G$_KEY_OPT_MENU('agrpgbe.pgbe_id', G$_NLS.Get('AOQCLIB-0053', 'FORM','Person Search (SOAIDEN)') ,'LIST_VALUES',
//                                G$_NLS.Get('AOQCLIB-0054', 'FORM','Constituent Search (AOAIDEN)') ,'DUPLICATE_RECORD',
//                               '','',
//                               '','');
//G$_CHECK_FAILURE; 
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_ID_LBT.WHEN-BUTTON-PRESSED
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PGBE_ID_LBT")
//		public void pgbeIdLbt_buttonClick()
//		{
//			
//				gKeyOptMenu("agrpgbe.pgbe_id", GNls.Fget(toStr("AOQCLIB-0053"), toStr("FORM"), toStr("Person Search (SOAIDEN)")), "LIST_VALUES", GNls.Fget(toStr("AOQCLIB-0054"), toStr("FORM"), toStr("Constituent Search (AOAIDEN)")), "DUPLICATE_RECORD", "", "", "", "");
//				getContainer().getGoqrpls().gCheckFailure();
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_BIRTH_DATE_DBT.WHEN-BUTTON-PRESSED
//		 DECLARE
//  ITEM_ID           ITEM;
//  AL_BUT            NUMBER;
//  CUR_ITEM          VARCHAR2(100) := NAME_IN('SYSTEM.TRIGGER_ITEM');
//  CURRENT_BLOCK_FLD VARCHAR2(61);
//BEGIN
//  ITEM_ID := FIND_ITEM(NAME_IN('SYSTEM.CURSOR_BLOCK') ||
//               SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
//                 INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1));
//  IF ID_NULL(ITEM_ID) THEN
//    MESSAGE(G$_NLS.Get('AOQCLIB-0055','FORM','*ERROR* Date button is outside the current block.'));
//    RAISE FORM_TRIGGER_FAILURE;
//  END IF;
//  CURRENT_BLOCK_FLD := NAME_IN('SYSTEM.CURSOR_BLOCK')||
//                         SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
//                           INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1);
//--
//-- If calculate item is not visible, exit.
//--
//  IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,ENABLED) = 'FALSE' THEN
//    RETURN;
//  END IF;
//--
//-- Check if item is protected or not.  If not, launch the form.
//--
//  IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATEABLE) = 'TRUE' OR
//     (GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATE_NULL) = 'TRUE' AND
//      NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL) OR
//     (NAME_IN('SYSTEM.MODE') <> 'NORMAL' AND
//      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,QUERYABLE) = 'TRUE') OR
//     (NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW' AND
//      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') OR
//     (NAME_IN('SYSTEM.RECORD_STATUS') = 'INSERT' AND
//      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') THEN
//--
//-- Not protected, so call the form.
//-- 
//    GO_ITEM(CURRENT_BLOCK_FLD);
//    G$_CHECK_FAILURE; 
//    COPY(NAME_IN('SYSTEM.CURSOR_VALUE'),'GLOBAL.VALUE');
//    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
//    G$_CHECK_FAILURE;
//    G$_SECURED_FORM_CALL(USER,'GUACALN','QUERY_NOHIDE');
//--
//    IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
//      COPY(NAME_IN('GLOBAL.VALUE'),CURRENT_BLOCK_FLD);
//      COPY('','GLOBAL.VALUE');
//      DO_KEY('NEXT_ITEM');
//    END IF;  
//--
//-- Protected, don't launch form.
//--
//  ELSE
//    MESSAGE(G$_NLS.Get('AOQCLIB-0056','FORM','*ERROR* Item is protected against update.'));              
//    NULL;
//  END IF;  
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_BIRTH_DATE_DBT.WHEN-BUTTON-PRESSED
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PGBE_BIRTH_DATE_DBT")
//		public void pgbeBirthDateDbt_buttonClick()
//		{
//			
//				{
//					ItemDescriptor itemId= null;
//					NNumber alBut= NNumber.getNull();
//					NString curItem = getTriggerItem();
//					NString currentBlockFld= NString.getNull();
//					itemId = findItem(getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1))));
//					if ( (itemId == null) )
//					{
//						errorMessage(GNls.Fget(toStr("AOQCLIB-0055"), toStr("FORM"), toStr("*ERROR* Date button is outside the current block.")));
//						throw new ApplicationException();
//					}
//					currentBlockFld = getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1)));
//					// 
//					//  If calculate item is not visible, exit.
//					// 
//					if ( getItemEnabled(currentBlockFld).equals("FALSE") )
//					{
//						return ;
//					}
//					// 
//					//  Check if item is protected or not.  If not, launch the form.
//					// 
//					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
//					if ( getItemUpdateAllowed(currentBlockFld).equals("TRUE") || (SupportClasses.FORMS40.GetItemProperty(currentBlockFld, SupportClasses.Property.UPDATE_NULL).equals("TRUE") && getCursorValue().isNull()) || (getMode().notEquals("NORMAL") && getItemQueryAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) )
//					{
//						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//						// 
//						//  Not protected, so call the form.
//						//  
//						goItem(currentBlockFld);
//						getContainer().getGoqrpls().gCheckFailure();
//						copy(getCursorValue(),"GLOBAL.VALUE");
//						executeAction("G$_REVOKE_ACCESS");
//						getContainer().getGoqrpls().gCheckFailure();
//						gSecuredFormCall(getUser(), "GUACALN", "QUERY_NOHIDE");
//						// 
//						if ( !getNameIn("GLOBAL.VALUE").isNull() )
//						{
//							copy(getNameIn("GLOBAL.VALUE"),currentBlockFld);
//							copy("","GLOBAL.VALUE");
//							executeAction(KeyFunction.NEXT_ITEM);
//						}
//					}
//					else {
//						errorMessage(GNls.Fget(toStr("AOQCLIB-0056"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
//					}
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_DECEASED_DATE_DBT.WHEN-BUTTON-PRESSED
//		 DECLARE
//  ITEM_ID           ITEM;
//  AL_BUT            NUMBER;
//  CUR_ITEM          VARCHAR2(100) := NAME_IN('SYSTEM.TRIGGER_ITEM');
//  CURRENT_BLOCK_FLD VARCHAR2(61);
//BEGIN
//  ITEM_ID := FIND_ITEM(NAME_IN('SYSTEM.CURSOR_BLOCK') ||
//               SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
//                 INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1));
//  IF ID_NULL(ITEM_ID) THEN
//    MESSAGE(G$_NLS.Get('AOQCLIB-0057','FORM','*ERROR* Date button is outside the current block.'));
//    RAISE FORM_TRIGGER_FAILURE;
//  END IF;
//  CURRENT_BLOCK_FLD := NAME_IN('SYSTEM.CURSOR_BLOCK')||
//                         SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
//                           INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1);
//--
//-- If calculate item is not visible, exit.
//--
//  IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,ENABLED) = 'FALSE' THEN
//    RETURN;
//  END IF;
//--
//-- Check if item is protected or not.  If not, launch the form.
//--
//  IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATEABLE) = 'TRUE' OR
//     (GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATE_NULL) = 'TRUE' AND
//      NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL) OR
//     (NAME_IN('SYSTEM.MODE') <> 'NORMAL' AND
//      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,QUERYABLE) = 'TRUE') OR
//     (NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW' AND
//      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') OR
//     (NAME_IN('SYSTEM.RECORD_STATUS') = 'INSERT' AND
//      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') THEN
//--
//-- Not protected, so call the form.
//-- 
//    GO_ITEM(CURRENT_BLOCK_FLD);
//    G$_CHECK_FAILURE; 
//    COPY(NAME_IN('SYSTEM.CURSOR_VALUE'),'GLOBAL.VALUE');
//    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
//    G$_CHECK_FAILURE;
//    G$_SECURED_FORM_CALL(USER,'GUACALN','QUERY_NOHIDE');
//--
//    IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
//      COPY(NAME_IN('GLOBAL.VALUE'),CURRENT_BLOCK_FLD);
//      COPY('','GLOBAL.VALUE');
//      DO_KEY('NEXT_ITEM');
//    END IF;  
//--
//-- Protected, don't launch form.
//--
//  ELSE
//    MESSAGE(G$_NLS.Get('AOQCLIB-0058','FORM','*ERROR* Item is protected against update.'));              
//    NULL;
//  END IF;  
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_DECEASED_DATE_DBT.WHEN-BUTTON-PRESSED
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PGBE_DECEASED_DATE_DBT")
//		public void pgbeDeceasedDateDbt_buttonClick()
//		{
//			
//				{
//					ItemDescriptor itemId= null;
//					NNumber alBut= NNumber.getNull();
//					NString curItem = getTriggerItem();
//					NString currentBlockFld= NString.getNull();
//					itemId = findItem(getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1))));
//					if ( (itemId == null) )
//					{
//						errorMessage(GNls.Fget(toStr("AOQCLIB-0057"), toStr("FORM"), toStr("*ERROR* Date button is outside the current block.")));
//						throw new ApplicationException();
//					}
//					currentBlockFld = getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1)));
//					// 
//					//  If calculate item is not visible, exit.
//					// 
//					if ( getItemEnabled(currentBlockFld).equals("FALSE") )
//					{
//						return ;
//					}
//					// 
//					//  Check if item is protected or not.  If not, launch the form.
//					// 
//					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
//					if ( getItemUpdateAllowed(currentBlockFld).equals("TRUE") || (SupportClasses.FORMS40.GetItemProperty(currentBlockFld, SupportClasses.Property.UPDATE_NULL).equals("TRUE") && getCursorValue().isNull()) || (getMode().notEquals("NORMAL") && getItemQueryAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) )
//					{
//						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//						// 
//						//  Not protected, so call the form.
//						//  
//						goItem(currentBlockFld);
//						getContainer().getGoqrpls().gCheckFailure();
//						copy(getCursorValue(),"GLOBAL.VALUE");
//						executeAction("G$_REVOKE_ACCESS");
//						getContainer().getGoqrpls().gCheckFailure();
//						gSecuredFormCall(getUser(), "GUACALN", "QUERY_NOHIDE");
//						// 
//						if ( !getNameIn("GLOBAL.VALUE").isNull() )
//						{
//							copy(getNameIn("GLOBAL.VALUE"),currentBlockFld);
//							copy("","GLOBAL.VALUE");
//							executeAction(KeyFunction.NEXT_ITEM);
//						}
//					}
//					else {
//						errorMessage(GNls.Fget(toStr("AOQCLIB-0058"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
//					}
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER AGRPGBE_PGBE_PIDM.POST-CHANGE
//		 BEGIN
//   G$_CHECK_QUERY_MODE ;
//--
//   EXECUTE_TRIGGER( 'QUERY_IDEN_PERS' ) ;
//   G$_CHECK_FAILURE ;
//--
//   :GLOBAL.QUERY_MODE := '0' ;
//EXCEPTION
//   WHEN FORM_TRIGGER_FAILURE THEN
//      :GLOBAL.QUERY_MODE := '0' ;
//      RAISE FORM_TRIGGER_FAILURE ;
//END ;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_PGBE_PIDM.POST-CHANGE
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="POST-CHANGE", item="AGRPGBE_PGBE_PIDM")
//		public void agrpgbePgbePidm_PostChange()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//
//
//				if(agrpgbeElement.getAgrpgbePgbePidm().isNull())
//		return;
//				try
//				{
//					gCheckQueryMode;
//					// 
//					executeAction("QUERY_IDEN_PERS");
//					getContainer().getGoqrpls().gCheckFailure();
//					// 
//					setGlobal("QUERY_MODE", toStr("0"));
//				}
//				catch(ApplicationException e)
//				{
//					setGlobal("QUERY_MODE", toStr("0"));
//					throw new ApplicationException();
//				}
//			}
//
//		
//		/* Original PL/SQL code code for TRIGGER PGBE_NAME.KEY-NEXT-ITEM
//		 BEGIN
//  G$_IDNAME_SEARCH.ID_SEARCH('NAME','','');
//  G$_CHECK_FAILURE;
//END;
//		*/
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_NAME.KEY-NEXT-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ActionTrigger(action="KEY-NEXT-ITEM", item="PGBE_NAME", function=KeyFunction.NEXT_ITEM)
//		public void pgbeName_keyNexItem()
//		{
//			
//				GIdnameSearch.idSearch("NAME", "", "");
//				getContainer().getGoqrpls().gCheckFailure();
//			}
//
//		
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_SURNAME_PREFIX.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="AGRPGBE_SURNAME_PREFIX")
//		public void agrpgbeSurnamePrefix_validate()
//		{
//			
//
//			AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//			this.agrpgbeSurnamePrefix_PostChange();
//
//		}
//
//		
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_LAST_NAME.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="AGRPGBE_LAST_NAME")
//		public void agrpgbeLastName_validate()
//		{
//			
//
//			AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//			this.agrpgbeLastName_PostChange();
//
//		}
//
//		
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_FIRST_NAME.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="AGRPGBE_FIRST_NAME")
//		public void agrpgbeFirstName_validate()
//		{
//			
//
//			AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//			this.agrpgbeFirstName_PostChange();
//
//		}
//
//		
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_MI.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="AGRPGBE_MI")
//		public void agrpgbeMi_validate()
//		{
//			
//
//			AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//			this.agrpgbeMi_PostChange();
//
//		}
//
//		
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * PGBE_MI.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="PGBE_MI")
//		public void pgbeMi_validate()
//		{
//			
//
//			AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//			this.pgbeMi_PostChange();
//
//		}
//
//		
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_SEX.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="AGRPGBE_SEX")
//		public void agrpgbeSex_validate()
//		{
//			
//
//			AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//			this.agrpgbeSex_PostChange();
//
//		}
//
//		
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_BIRTH_DATE.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="AGRPGBE_BIRTH_DATE")
//		public void agrpgbeBirthDate_validate()
//		{
//			
//
//			AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//			this.agrpgbeBirthDate_PostChange();
//
//		}
//
//		
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_DECEASED_IND.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="AGRPGBE_DECEASED_IND")
//		public void agrpgbeDeceasedInd_validate()
//		{
//			
//
//			AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//			this.agrpgbeDeceasedInd_PostChange();
//
//		}
//
//		
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_DECEASED_DATE.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="AGRPGBE_DECEASED_DATE")
//		public void agrpgbeDeceasedDate_validate()
//		{
//			
//
//			AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//			this.agrpgbeDeceasedDate_PostChange();
//
//		}
//
//		
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AGRPGBE_PGBE_PIDM.WHEN-VALIDATE-ITEM
//		 *
//		 *
//		 *</p>
//		*/
//
//		@ValidationTrigger(item="AGRPGBE_PGBE_PIDM")
//		public void agrpgbePgbePidm_validate()
//		{
//			
//
//			AgrpgbeAdapter agrpgbeElement = (AgrpgbeAdapter)this.getFormModel().getAgrpgbe().getRowAdapter(true);
//			this.agrpgbePgbePidm_PostChange();
//
//		}
//
//		
	
	
}

