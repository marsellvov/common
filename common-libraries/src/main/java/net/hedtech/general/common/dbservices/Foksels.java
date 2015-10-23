package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.dbtypes.FobprofRow;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Foksels {
		public static DataCursor fGetFtvsdat(NString fEntity,NString fAttr,NString fCodeOpt1,NString fCodeOpt2,NString fCoas,NDate fEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.F_GET_FTVSDAT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@F_ENTITY", fEntity);
			cmd.addParameter("@F_ATTR", fAttr);
			cmd.addParameter("@F_CODE_OPT_1", fCodeOpt1);
			cmd.addParameter("@F_CODE_OPT_2", fCodeOpt2);
			cmd.addParameter("@F_COAS", fCoas);
			cmd.addParameter("@F_EFF_DATE", fEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fGetFtvsdatData(NString fEntity,NString fAttr,NString fCodeOpt1,NString fCodeOpt2,NString fCoas,NDate fEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.F_GET_FTVSDAT_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@F_ENTITY", fEntity);
			cmd.addParameter("@F_ATTR", fAttr);
			cmd.addParameter("@F_CODE_OPT_1", fCodeOpt1);
			cmd.addParameter("@F_CODE_OPT_2", fCodeOpt2);
			cmd.addParameter("@F_COAS", fCoas);
			cmd.addParameter("@F_EFF_DATE", fEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPendingApproval(NNumber pSeqCode,NString pDocCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.F_PENDING_APPROVAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SEQ_CODE", pSeqCode);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPendingDefEdit(NNumber pSeqCode,NString pDocNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.F_PENDING_DEF_EDIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SEQ_CODE", pSeqCode);
			cmd.addParameter("@P_DOC_NUM", pDocNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPendingPosting(NNumber pSeqCode,NString pDocNum,NNumber pSeqNum,NString pBankNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.F_PENDING_POSTING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SEQ_CODE", pSeqCode);
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_BANK_NUM", pBankNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void pGetFobprofRec(NString profId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.P_GET_FOBPROF_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PROF_ID", profId);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pGetFobsyscRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.P_GET_FOBSYSC_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetFtvacciRec(NString coas,NString acci,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.P_GET_FTVACCI_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@ACCI", acci);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvacctRec(NString coas,NString acct,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.P_GET_FTVACCT_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvactlRec(NString coas,NString atyp,NString seqNum,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.P_GET_FTVACTL_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@SEQ_NUM", seqNum);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvactvRec(NString coas,NString actv,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.P_GET_FTVACTV_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvatypRec(NString coasCode,NString inAtyp,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.P_GET_FTVATYP_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@IN_ATYP", inAtyp);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvcoasRec(NString coasCode,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.P_GET_FTVCOAS_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvfspdRec(NString coas,NString fsyr,NString fspd,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.P_GET_FTVFSPD_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@FSYR", fsyr);
			cmd.addParameter("@FSPD", fspd);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvfsyrRec(NString coas,NString fsyr,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.P_GET_FTVFSYR_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@FSYR", fsyr);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvftypRec(NString coasCode,NString inFtyp,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.P_GET_FTVFTYP_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@IN_FTYP", inFtyp);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvfundRec(NString coas,NString fund,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.P_GET_FTVFUND_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvlocnRec(NString coas,NString locn,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.P_GET_FTVLOCN_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@LOCN", locn);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvorgnRec(NString coas,NString orgn,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.P_GET_FTVORGN_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvprogRec(NString coas,NString prog,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.P_GET_FTVPROG_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@PROG", prog);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvsdatRec(NString fEntity,NString fAttr,NString fCodeOpt1,NString fCodeOpt2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.P_GET_FTVSDAT_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@F_ENTITY", fEntity);
			cmd.addParameter("@F_ATTR", fAttr);
			cmd.addParameter("@F_CODE_OPT_1", fCodeOpt1);
			cmd.addParameter("@F_CODE_OPT_2", fCodeOpt2);
				
			cmd.execute();


		}

		public static void pGetFobprofRec(NString global, Ref<FobprofRow> fobprofRec, Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSELS.P_GET_FOBPROF_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROF_ID", global);
			cmd.addParameter(DbTypes.createStructType("FOBPROF_REC", fobprofRec.val, FobprofRow.class));
			cmd.addParameter("@ERROR_MESG", errorMsg, true);
			
 			cmd.execute();
			
			fobprofRec.val = cmd.getParameterValue("FOBPROF_REC", FobprofRow.class);
			errorMsg.val = cmd.getParameterValue("@ERROR_MESG", NString.class);
		}
		
	
	
	
}
