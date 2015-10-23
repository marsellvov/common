package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Siklibs {
		public static NString fCheckAdvisor(NString term,NNumber facPidm,NNumber stuPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLIBS.F_CHECK_ADVISOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@FAC_PIDM", facPidm);
			cmd.addParameter("@STU_PIDM", stuPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckFaculty(NString term,NNumber facPidm,NNumber stuPidm,NString crn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLIBS.F_CHECK_FACULTY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@FAC_PIDM", facPidm);
			cmd.addParameter("@STU_PIDM", stuPidm);
			cmd.addParameter("@CRN", crn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckRelation(NString term,NNumber facPidm,NNumber stuPidm,NString crn,NString proc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLIBS.F_CHECK_RELATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@FAC_PIDM", facPidm);
			cmd.addParameter("@STU_PIDM", stuPidm);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@PROC", proc);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fCheckRoles(NString facAdvInd,NString proc,NString term,NNumber facPidm,NNumber stuPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLIBS.F_CHECK_ROLES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@FAC_ADV_IND", facAdvInd);
			cmd.addParameter("@PROC", proc);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@FAC_PIDM", facPidm);
			cmd.addParameter("@STU_PIDM", stuPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fCheckSiainst(NString term,NNumber facPidm,NString proc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLIBS.F_CHECK_SIAINST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@FAC_PIDM", facPidm);
			cmd.addParameter("@PROC", proc);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChecksecurity(NString proc,NString term,NNumber facPidm,NNumber stuPidm,NString crn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLIBS.F_CHECKSECURITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PROC", proc);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@FAC_PIDM", facPidm);
			cmd.addParameter("@STU_PIDM", stuPidm);
			cmd.addParameter("@CRN", crn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDispDesc(NString pDispCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLIBS.F_GET_DISP_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DISP_CODE", pDispCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetMinSibcfteFteFactor(NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLIBS.F_GET_MIN_SIBCFTE_FTE_FACTOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetMinSibtermFte(NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLIBS.F_GET_MIN_SIBTERM_FTE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetRankDesc(NString pRankCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLIBS.F_GET_RANK_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_RANK_CODE", pRankCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSibfacdTenrCode(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLIBS.F_GET_SIBFACD_TENR_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSibfacdValue(NString pPidm,NString pInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLIBS.F_GET_SIBFACD_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_IND", pInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSibinstMaxTermCode(NNumber pPidm,NString pStvtermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLIBS.F_GET_SIBINST_MAX_TERM_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_STVTERM_CODE", pStvtermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetTenrDesc(NString pTenrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLIBS.F_GET_TENR_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TENR_CODE", pTenrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fPersonIsFaculty(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLIBS.F_PERSON_IS_FACULTY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fSirattrValue(NString pInternalCode,NNumber pPidm,NString pTermCode,NNumber pPosition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLIBS.F_SIRATTR_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INTERNAL_CODE", pInternalCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_POSITION", pPosition);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSirnistValue(NString pInternalCode,NNumber pPidm,NString pTermCode,NNumber pPosition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLIBS.F_SIRNIST_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INTERNAL_CODE", pInternalCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_POSITION", pPosition);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetPrimaryInstructorPidm(NString termIn,NString crnIn,Ref<NNumber> pidmOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLIBS.P_GET_PRIMARY_INSTRUCTOR_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_OUT", NNumber.class);
				
			cmd.execute();
			pidmOut.val = cmd.getParameterValue("@PIDM_OUT", NNumber.class);


		}
		
	
	
	
}
