package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Shkwevn {
		public static NString fCurrentacademicyear(NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKWEVN.F_CURRENTACADEMICYEAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidatechangereason(NString gchgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKWEVN.F_VALIDATECHANGEREASON", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GCHG_CODE", gchgCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidategrade(NString grdeCode,NString termCode,NString crn,NString idFld) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKWEVN.F_VALIDATEGRADE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GRDE_CODE", grdeCode);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@ID_FLD", idFld);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidatestudentcrn(NString term,NString crn,NString stdId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKWEVN.F_VALIDATESTUDENTCRN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@STD_ID", stdId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pFawithdraw(NNumber pidm,NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKWEVN.P_FAWITHDRAW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();


		}
		
		public static void pGetgradechangeedata(NNumber transNo,NString wfedCode,Ref<NString> originatorUname,Ref<NString> instructorUname,Ref<NString> termCode,Ref<NString> acyrDesc,Ref<NString> crn,Ref<NString> stdId,Ref<NNumber> stdPidm,Ref<NString> grdeCodeNew,Ref<NString> gchgCode,Ref<NString> gmodCode,Ref<NString> deptheadUname,Ref<NString> crsedeanUname,Ref<NString> stdmajorUname,Ref<NString> stdName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKWEVN.P_GETGRADECHANGEEDATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_NO", transNo);
			cmd.addParameter("@WFED_CODE", wfedCode);
			cmd.addParameter("@ORIGINATOR_UNAME", NString.class);
			cmd.addParameter("@INSTRUCTOR_UNAME", NString.class);
			cmd.addParameter("@TERM_CODE", termCode, true);
			cmd.addParameter("@ACYR_DESC", NString.class);
			cmd.addParameter("@CRN", crn, true);
			cmd.addParameter("@STD_ID", stdId, true);
			cmd.addParameter("@STD_PIDM", stdPidm, true);
			cmd.addParameter("@GRDE_CODE_NEW", NString.class);
			cmd.addParameter("@GCHG_CODE", NString.class);
			cmd.addParameter("@GMOD_CODE", NString.class);
			cmd.addParameter("@DEPTHEAD_UNAME", NString.class);
			cmd.addParameter("@CRSEDEAN_UNAME", NString.class);
			cmd.addParameter("@STDMAJOR_UNAME", NString.class);
			cmd.addParameter("@STD_NAME", NString.class);
				
			cmd.execute();
			originatorUname.val = cmd.getParameterValue("@ORIGINATOR_UNAME", NString.class);
			instructorUname.val = cmd.getParameterValue("@INSTRUCTOR_UNAME", NString.class);
			termCode.val = cmd.getParameterValue("@TERM_CODE", NString.class);
			acyrDesc.val = cmd.getParameterValue("@ACYR_DESC", NString.class);
			crn.val = cmd.getParameterValue("@CRN", NString.class);
			stdId.val = cmd.getParameterValue("@STD_ID", NString.class);
			stdPidm.val = cmd.getParameterValue("@STD_PIDM", NNumber.class);
			grdeCodeNew.val = cmd.getParameterValue("@GRDE_CODE_NEW", NString.class);
			gchgCode.val = cmd.getParameterValue("@GCHG_CODE", NString.class);
			gmodCode.val = cmd.getParameterValue("@GMOD_CODE", NString.class);
			deptheadUname.val = cmd.getParameterValue("@DEPTHEAD_UNAME", NString.class);
			crsedeanUname.val = cmd.getParameterValue("@CRSEDEAN_UNAME", NString.class);
			stdmajorUname.val = cmd.getParameterValue("@STDMAJOR_UNAME", NString.class);
			stdName.val = cmd.getParameterValue("@STD_NAME", NString.class);


		}
		
		public static void pInsertshrgcol(NNumber pidm,NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKWEVN.P_INSERTSHRGCOL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();


		}
		
		public static void pProcessgradechangehold(NNumber pidm,NString actionInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKWEVN.P_PROCESSGRADECHANGEHOLD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@ACTION_IND", actionInd);
				
			cmd.execute();


		}
		
		public static void pUpdatestudentgrade(NNumber pidm,NString termCode,NString crn,NString instrucUname,NString gmodCode,NString gchgCode,NString grdeCodeNew,Ref<NString> currAcadyear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKWEVN.P_UPDATESTUDENTGRADE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@INSTRUC_UNAME", instrucUname);
			cmd.addParameter("@GMOD_CODE", gmodCode);
			cmd.addParameter("@GCHG_CODE", gchgCode);
			cmd.addParameter("@GRDE_CODE_NEW", grdeCodeNew);
			cmd.addParameter("@CURR_ACADYEAR", NString.class);
				
			cmd.execute();
			currAcadyear.val = cmd.getParameterValue("@CURR_ACADYEAR", NString.class);


		}
		
		public static void pWithdrawStudent(NNumber pidm,NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKWEVN.P_WITHDRAW_STUDENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();


		}
		
		public static void pWithdrawstudentinfo(NNumber pidm,NString term,Ref<NString> a,Ref<NString> b,Ref<NString> c,Ref<NString> d,Ref<NString> e,Ref<NString> f,Ref<NString> g,Ref<NString> h,Ref<NString> i,Ref<NString> j) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKWEVN.P_WITHDRAWSTUDENTINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@A", NString.class);
			cmd.addParameter("@B", NString.class);
			cmd.addParameter("@C", NString.class);
			cmd.addParameter("@D", NString.class);
			cmd.addParameter("@E", NString.class);
			cmd.addParameter("@F", NString.class);
			cmd.addParameter("@G", NString.class);
			cmd.addParameter("@H", NString.class);
			cmd.addParameter("@I", NString.class);
			cmd.addParameter("@J", NString.class);
				
			cmd.execute();
			a.val = cmd.getParameterValue("@A", NString.class);
			b.val = cmd.getParameterValue("@B", NString.class);
			c.val = cmd.getParameterValue("@C", NString.class);
			d.val = cmd.getParameterValue("@D", NString.class);
			e.val = cmd.getParameterValue("@E", NString.class);
			f.val = cmd.getParameterValue("@F", NString.class);
			g.val = cmd.getParameterValue("@G", NString.class);
			h.val = cmd.getParameterValue("@H", NString.class);
			i.val = cmd.getParameterValue("@I", NString.class);
			j.val = cmd.getParameterValue("@J", NString.class);


		}
		
	
	
	
}
