package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Frktrni {
		public static void getNextJvNumber(Ref<NString> outDocNum,NString grnt,NString budg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKTRNI.GET_NEXT_JV_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OUT_DOC_NUM", NString.class);
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@BUDG", budg);
				
			cmd.execute();
			outDocNum.val = cmd.getParameterValue("@OUT_DOC_NUM", NString.class);


		}
		
		public static void insTrniDtl(NString inJvNum,NNumber inSeqNum,NString inRuclCode,NDate inTransDate,NNumber inTransAmt,NString inTransDesc,NString inDrCrInd,NString inCoasCode,NString inAcciCode,NString inFundCode,NString inOrgnCode,NString inAcctCode,NString inProgCode,NString inActvCode,NString inLocnCode,NString inBudgetPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKTRNI.INS_TRNI_DTL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_JV_NUM", inJvNum);
			cmd.addParameter("@IN_SEQ_NUM", inSeqNum);
			cmd.addParameter("@IN_RUCL_CODE", inRuclCode);
			cmd.addParameter("@IN_TRANS_DATE", inTransDate);
			cmd.addParameter("@IN_TRANS_AMT", inTransAmt);
			cmd.addParameter("@IN_TRANS_DESC", inTransDesc);
			cmd.addParameter("@IN_DR_CR_IND", inDrCrInd);
			cmd.addParameter("@IN_COAS_CODE", inCoasCode);
			cmd.addParameter("@IN_ACCI_CODE", inAcciCode);
			cmd.addParameter("@IN_FUND_CODE", inFundCode);
			cmd.addParameter("@IN_ORGN_CODE", inOrgnCode);
			cmd.addParameter("@IN_ACCT_CODE", inAcctCode);
			cmd.addParameter("@IN_PROG_CODE", inProgCode);
			cmd.addParameter("@IN_ACTV_CODE", inActvCode);
			cmd.addParameter("@IN_LOCN_CODE", inLocnCode);
			cmd.addParameter("@IN_BUDGET_PERIOD", inBudgetPeriod);
				
			cmd.execute();


		}
		
		public static void insTrniHdrAndCommit(NString inDocNum,NDate inTransDate,NNumber inTransAmt,NString inTransDesc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKTRNI.INS_TRNI_HDR_AND_COMMIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_DOC_NUM", inDocNum);
			cmd.addParameter("@IN_TRANS_DATE", inTransDate);
			cmd.addParameter("@IN_TRANS_AMT", inTransAmt);
			cmd.addParameter("@IN_TRANS_DESC", inTransDesc);
				
			cmd.execute();


		}
		
		public static void insertError(NString grnt,NString budg,NString inErrorMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKTRNI.INSERT_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@BUDG", budg);
			cmd.addParameter("@IN_ERROR_MESSAGE", inErrorMessage);
				
			cmd.execute();


		}
		
		public static NBool FlineIsCsmaxRelated(NNumber inSeqMain,NNumber inSeq) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKTRNI.LINE_IS_CSMAX_RELATED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_SEQ_MAIN", inSeqMain);
			cmd.addParameter("@IN_SEQ", inSeq);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FlineIsIcRelated(NNumber inSeqMain,NNumber inSeq) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKTRNI.LINE_IS_IC_RELATED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_SEQ_MAIN", inSeqMain);
			cmd.addParameter("@IN_SEQ", inSeq);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FselectFgbtrnh7(NString inDocNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKTRNI.SELECT_FGBTRNH_7", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_DOC_NUM", inDocNum);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FselectFrbbasi12(NString inBasiCodeIc,Ref<NDate> outEffDate,NDate inFrbbudgTransDate,NString inFrbbudgCoasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKTRNI.SELECT_FRBBASI_12", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_BASI_CODE_IC", inBasiCodeIc);
			cmd.addParameter("@OUT_EFF_DATE", NDate.class);
			cmd.addParameter("@IN_FRBBUDG_TRANS_DATE", inFrbbudgTransDate);
			cmd.addParameter("@IN_FRBBUDG_COAS_CODE", inFrbbudgCoasCode);
				
			cmd.execute();
			outEffDate.val = cmd.getParameterValue("@OUT_EFF_DATE", NDate.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FselectFrbcsta81(NString inCstaCodeIc,NDate inDate,NString inCoasCode,Ref<NDate> outEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKTRNI.SELECT_FRBCSTA_81", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_CSTA_CODE_IC", inCstaCodeIc);
			cmd.addParameter("@IN_DATE", inDate);
			cmd.addParameter("@IN_COAS_CODE", inCoasCode);
			cmd.addParameter("@OUT_EFF_DATE", NDate.class);
				
			cmd.execute();
			outEffDate.val = cmd.getParameterValue("@OUT_EFF_DATE", NDate.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FselectFrbcstd80(NString inCstdCodeIc,NDate inDate,NString inCoasCode,Ref<NDate> outEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKTRNI.SELECT_FRBCSTD_80", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_CSTD_CODE_IC", inCstdCodeIc);
			cmd.addParameter("@IN_DATE", inDate);
			cmd.addParameter("@IN_COAS_CODE", inCoasCode);
			cmd.addParameter("@OUT_EFF_DATE", NDate.class);
				
			cmd.execute();
			outEffDate.val = cmd.getParameterValue("@OUT_EFF_DATE", NDate.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FselectFrbindd82(NString inInddCodeIc,NDate inDate,NString inCoasCode,Ref<NDate> outEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKTRNI.SELECT_FRBINDD_82", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_INDD_CODE_IC", inInddCodeIc);
			cmd.addParameter("@IN_DATE", inDate);
			cmd.addParameter("@IN_COAS_CODE", inCoasCode);
			cmd.addParameter("@OUT_EFF_DATE", NDate.class);
				
			cmd.execute();
			outEffDate.val = cmd.getParameterValue("@OUT_EFF_DATE", NDate.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FselectFrrbasi13(NString inAcct,NString inLocn,NDate inEffDate,NString inBasiCode,NString inCoasCode,Ref<NString> outExcludeInd,Ref<NNumber> outRateOverride,Ref<NNumber> outMaxAmount,Ref<NString> outCstaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKTRNI.SELECT_FRRBASI_13", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_ACCT", inAcct);
			cmd.addParameter("@IN_LOCN", inLocn);
			cmd.addParameter("@IN_EFF_DATE", inEffDate);
			cmd.addParameter("@IN_BASI_CODE", inBasiCode);
			cmd.addParameter("@IN_COAS_CODE", inCoasCode);
			cmd.addParameter("@OUT_EXCLUDE_IND", NString.class);
			cmd.addParameter("@OUT_RATE_OVERRIDE", NNumber.class);
			cmd.addParameter("@OUT_MAX_AMOUNT", NNumber.class);
			cmd.addParameter("@OUT_CSTA_CODE", NString.class);
				
			cmd.execute();
			outExcludeInd.val = cmd.getParameterValue("@OUT_EXCLUDE_IND", NString.class);
			outRateOverride.val = cmd.getParameterValue("@OUT_RATE_OVERRIDE", NNumber.class);
			outMaxAmount.val = cmd.getParameterValue("@OUT_MAX_AMOUNT", NNumber.class);
			outCstaCode.val = cmd.getParameterValue("@OUT_CSTA_CODE", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FselectFrrbasi14(NString inAtyp,NString inLocn,NDate inEffDate,NString inBasiCode,NString inCoasCode,Ref<NString> outExcludeInd,Ref<NNumber> outRateOverride,Ref<NNumber> outMaxAmount,Ref<NString> outCstaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKTRNI.SELECT_FRRBASI_14", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_ATYP", inAtyp);
			cmd.addParameter("@IN_LOCN", inLocn);
			cmd.addParameter("@IN_EFF_DATE", inEffDate);
			cmd.addParameter("@IN_BASI_CODE", inBasiCode);
			cmd.addParameter("@IN_COAS_CODE", inCoasCode);
			cmd.addParameter("@OUT_EXCLUDE_IND", NString.class);
			cmd.addParameter("@OUT_RATE_OVERRIDE", NNumber.class);
			cmd.addParameter("@OUT_MAX_AMOUNT", NNumber.class);
			cmd.addParameter("@OUT_CSTA_CODE", NString.class);
				
			cmd.execute();
			outExcludeInd.val = cmd.getParameterValue("@OUT_EXCLUDE_IND", NString.class);
			outRateOverride.val = cmd.getParameterValue("@OUT_RATE_OVERRIDE", NNumber.class);
			outMaxAmount.val = cmd.getParameterValue("@OUT_MAX_AMOUNT", NNumber.class);
			outCstaCode.val = cmd.getParameterValue("@OUT_CSTA_CODE", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FselectFrvbasi11(NString inBasiCodeIc,NString inBasiType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKTRNI.SELECT_FRVBASI_11", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_BASI_CODE_IC", inBasiCodeIc);
			cmd.addParameter("@IN_BASI_TYPE", inBasiType);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FselectFtvacct01(NString inAcct,Ref<NString> outAtyp,NDate inFrbbudgTransDate,NString inFrbbudgCoasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKTRNI.SELECT_FTVACCT_01", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_ACCT", inAcct);
			cmd.addParameter("@OUT_ATYP", NString.class);
			cmd.addParameter("@IN_FRBBUDG_TRANS_DATE", inFrbbudgTransDate);
			cmd.addParameter("@IN_FRBBUDG_COAS_CODE", inFrbbudgCoasCode);
				
			cmd.execute();
			outAtyp.val = cmd.getParameterValue("@OUT_ATYP", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FselectFtvatyp02(NString inAtyp,Ref<NString> outAtypTitle,Ref<NString> outAtypPred,Ref<NString> outAtypInternal,NDate inFrbbudgTransDate,NString inFrbbudgCoasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKTRNI.SELECT_FTVATYP_02", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_ATYP", inAtyp);
			cmd.addParameter("@OUT_ATYP_TITLE", NString.class);
			cmd.addParameter("@OUT_ATYP_PRED", NString.class);
			cmd.addParameter("@OUT_ATYP_INTERNAL", NString.class);
			cmd.addParameter("@IN_FRBBUDG_TRANS_DATE", inFrbbudgTransDate);
			cmd.addParameter("@IN_FRBBUDG_COAS_CODE", inFrbbudgCoasCode);
				
			cmd.execute();
			outAtypTitle.val = cmd.getParameterValue("@OUT_ATYP_TITLE", NString.class);
			outAtypPred.val = cmd.getParameterValue("@OUT_ATYP_PRED", NString.class);
			outAtypInternal.val = cmd.getParameterValue("@OUT_ATYP_INTERNAL", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void sendDocumentToFgbtrni(NString grnt,NString budg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKTRNI.SEND_DOCUMENT_TO_FGBTRNI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@BUDG", budg);
				
			cmd.execute();


		}
		
	
	
	
}
