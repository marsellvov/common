package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Frkcsic {
		public static NBool FatleastOneLineInBasi(NString grnt,NString budg,NString inFrbbudgCoasCode,NDate inFrbbasiEffDate,NString inBasiCodeCs,NDate inFrbbudgTransDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.ATLEAST_ONE_LINE_IN_BASI", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@BUDG", budg);
			cmd.addParameter("@IN_FRBBUDG_COAS_CODE", inFrbbudgCoasCode);
			cmd.addParameter("@IN_FRBBASI_EFF_DATE", inFrbbasiEffDate);
			cmd.addParameter("@IN_BASI_CODE_CS", inBasiCodeCs);
			cmd.addParameter("@IN_FRBBUDG_TRANS_DATE", inFrbbudgTransDate);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void calcCostShare(NString grnt,NString budg,NString inFrbbudgCoasCode,NString inBasiCodeCs,NString inCstrCodeRate,NString inLinkedInd,NDate inFrbbudgTransDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.CALC_COST_SHARE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@BUDG", budg);
			cmd.addParameter("@IN_FRBBUDG_COAS_CODE", inFrbbudgCoasCode);
			cmd.addParameter("@IN_BASI_CODE_CS", inBasiCodeCs);
			cmd.addParameter("@IN_CSTR_CODE_RATE", inCstrCodeRate);
			cmd.addParameter("@IN_LINKED_IND", inLinkedInd);
			cmd.addParameter("@IN_FRBBUDG_TRANS_DATE", inFrbbudgTransDate);
				
			cmd.execute();


		}
		
		public static void calcIndirect(NString grnt,NString budg,NString inFrbbudgCoasCode,NDate inFrbbudgTransDate,NString inFrbbudgCoasCodeDef,NString inFrbbudgAcciCodeDef,NString inFrbbudgFundCodeDef,NString inFrbbudgOrgnCodeDef,NString inFrbbudgProgCodeDef,NString inFrbbudgActvCodeDef,NString inFrbbudgLocnCodeDef,NString inBasiCodeIc,NString inIndrCodeRate,NString inIndaCodeCharge,NString inLinkedInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.CALC_INDIRECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@BUDG", budg);
			cmd.addParameter("@IN_FRBBUDG_COAS_CODE", inFrbbudgCoasCode);
			cmd.addParameter("@IN_FRBBUDG_TRANS_DATE", inFrbbudgTransDate);
			cmd.addParameter("@IN_FRBBUDG_COAS_CODE_DEF", inFrbbudgCoasCodeDef);
			cmd.addParameter("@IN_FRBBUDG_ACCI_CODE_DEF", inFrbbudgAcciCodeDef);
			cmd.addParameter("@IN_FRBBUDG_FUND_CODE_DEF", inFrbbudgFundCodeDef);
			cmd.addParameter("@IN_FRBBUDG_ORGN_CODE_DEF", inFrbbudgOrgnCodeDef);
			cmd.addParameter("@IN_FRBBUDG_PROG_CODE_DEF", inFrbbudgProgCodeDef);
			cmd.addParameter("@IN_FRBBUDG_ACTV_CODE_DEF", inFrbbudgActvCodeDef);
			cmd.addParameter("@IN_FRBBUDG_LOCN_CODE_DEF", inFrbbudgLocnCodeDef);
			cmd.addParameter("@IN_BASI_CODE_IC", inBasiCodeIc);
			cmd.addParameter("@IN_INDR_CODE_RATE", inIndrCodeRate);
			cmd.addParameter("@IN_INDA_CODE_CHARGE", inIndaCodeCharge);
			cmd.addParameter("@IN_LINKED_IND", inLinkedInd);
				
			cmd.execute();


		}
		
		public static void calculateNow(NString grnt,NString budg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.CALCULATE_NOW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@BUDG", budg);
				
			cmd.execute();


		}
		
		public static void calculateNowCi(NString grnt,NString budg,NString inFrbbudgCoasCode,NDate inFrbbudgTransDate,NString inFrbbudgCoasCodeDef,NString inFrbbudgAcciCodeDef,NString inFrbbudgFundCodeDef,NString inFrbbudgOrgnCodeDef,NString inFrbbudgProgCodeDef,NString inFrbbudgActvCodeDef,NString inFrbbudgLocnCodeDef,NString inBasiCodeIc,NString inIndrCodeRate,NString inIndaCodeCharge,NString inBasiCodeCs,NString inCstrCodeRate,NString inLinkedInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.CALCULATE_NOW_CI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@BUDG", budg);
			cmd.addParameter("@IN_FRBBUDG_COAS_CODE", inFrbbudgCoasCode);
			cmd.addParameter("@IN_FRBBUDG_TRANS_DATE", inFrbbudgTransDate);
			cmd.addParameter("@IN_FRBBUDG_COAS_CODE_DEF", inFrbbudgCoasCodeDef);
			cmd.addParameter("@IN_FRBBUDG_ACCI_CODE_DEF", inFrbbudgAcciCodeDef);
			cmd.addParameter("@IN_FRBBUDG_FUND_CODE_DEF", inFrbbudgFundCodeDef);
			cmd.addParameter("@IN_FRBBUDG_ORGN_CODE_DEF", inFrbbudgOrgnCodeDef);
			cmd.addParameter("@IN_FRBBUDG_PROG_CODE_DEF", inFrbbudgProgCodeDef);
			cmd.addParameter("@IN_FRBBUDG_ACTV_CODE_DEF", inFrbbudgActvCodeDef);
			cmd.addParameter("@IN_FRBBUDG_LOCN_CODE_DEF", inFrbbudgLocnCodeDef);
			cmd.addParameter("@IN_BASI_CODE_IC", inBasiCodeIc);
			cmd.addParameter("@IN_INDR_CODE_RATE", inIndrCodeRate);
			cmd.addParameter("@IN_INDA_CODE_CHARGE", inIndaCodeCharge);
			cmd.addParameter("@IN_BASI_CODE_CS", inBasiCodeCs);
			cmd.addParameter("@IN_CSTR_CODE_RATE", inCstrCodeRate);
			cmd.addParameter("@IN_LINKED_IND", inLinkedInd);
				
			cmd.execute();


		}
		
		public static void calculateNowIc(NString grnt,NString budg,NString inFrbbudgCoasCode,NDate inFrbbudgTransDate,NString inFrbbudgCoasCodeDef,NString inFrbbudgAcciCodeDef,NString inFrbbudgFundCodeDef,NString inFrbbudgOrgnCodeDef,NString inFrbbudgProgCodeDef,NString inFrbbudgActvCodeDef,NString inFrbbudgLocnCodeDef,NString inBasiCodeIc,NString inIndrCodeRate,NString inIndaCodeCharge,NString inBasiCodeCs,NString inCstrCodeRate,NString inLinkedInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.CALCULATE_NOW_IC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@BUDG", budg);
			cmd.addParameter("@IN_FRBBUDG_COAS_CODE", inFrbbudgCoasCode);
			cmd.addParameter("@IN_FRBBUDG_TRANS_DATE", inFrbbudgTransDate);
			cmd.addParameter("@IN_FRBBUDG_COAS_CODE_DEF", inFrbbudgCoasCodeDef);
			cmd.addParameter("@IN_FRBBUDG_ACCI_CODE_DEF", inFrbbudgAcciCodeDef);
			cmd.addParameter("@IN_FRBBUDG_FUND_CODE_DEF", inFrbbudgFundCodeDef);
			cmd.addParameter("@IN_FRBBUDG_ORGN_CODE_DEF", inFrbbudgOrgnCodeDef);
			cmd.addParameter("@IN_FRBBUDG_PROG_CODE_DEF", inFrbbudgProgCodeDef);
			cmd.addParameter("@IN_FRBBUDG_ACTV_CODE_DEF", inFrbbudgActvCodeDef);
			cmd.addParameter("@IN_FRBBUDG_LOCN_CODE_DEF", inFrbbudgLocnCodeDef);
			cmd.addParameter("@IN_BASI_CODE_IC", inBasiCodeIc);
			cmd.addParameter("@IN_INDR_CODE_RATE", inIndrCodeRate);
			cmd.addParameter("@IN_INDA_CODE_CHARGE", inIndaCodeCharge);
			cmd.addParameter("@IN_BASI_CODE_CS", inBasiCodeCs);
			cmd.addParameter("@IN_CSTR_CODE_RATE", inCstrCodeRate);
			cmd.addParameter("@IN_LINKED_IND", inLinkedInd);
				
			cmd.execute();


		}
		
		public static void costShareMax(NString grnt,NString budg,NNumber maxAmt,NString budgLinkedInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.COST_SHARE_MAX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@BUDG", budg);
			cmd.addParameter("@MAX_AMT", maxAmt);
			cmd.addParameter("@BUDG_LINKED_IND", budgLinkedInd);
				
			cmd.execute();


		}
		
		public static void flushIndirectCostLines(NString grnt,NString budg,NString inFrbbudgCoasCodeDef,NString inFrbbudgAcciCodeDef,NString inFrbbudgFundCodeDef,NString inFrbbudgOrgnCodeDef,NString inFrbbudgProgCodeDef,NString inFrbbudgActvCodeDef,NString inFrbbudgLocnCodeDef,NString inLinkedInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.FLUSH_INDIRECT_COST_LINES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@BUDG", budg);
			cmd.addParameter("@IN_FRBBUDG_COAS_CODE_DEF", inFrbbudgCoasCodeDef);
			cmd.addParameter("@IN_FRBBUDG_ACCI_CODE_DEF", inFrbbudgAcciCodeDef);
			cmd.addParameter("@IN_FRBBUDG_FUND_CODE_DEF", inFrbbudgFundCodeDef);
			cmd.addParameter("@IN_FRBBUDG_ORGN_CODE_DEF", inFrbbudgOrgnCodeDef);
			cmd.addParameter("@IN_FRBBUDG_PROG_CODE_DEF", inFrbbudgProgCodeDef);
			cmd.addParameter("@IN_FRBBUDG_ACTV_CODE_DEF", inFrbbudgActvCodeDef);
			cmd.addParameter("@IN_FRBBUDG_LOCN_CODE_DEF", inFrbbudgLocnCodeDef);
			cmd.addParameter("@IN_LINKED_IND", inLinkedInd);
				
			cmd.execute();


		}
		
		public static void insertError(NString grnt,NString budg,NString inErrorMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.INSERT_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@BUDG", budg);
			cmd.addParameter("@IN_ERROR_MESSAGE", inErrorMessage);
				
			cmd.execute();


		}
		
		public static void insertIcLine(NString grnt,NString budg,NNumber inSeqMain,NNumber inSeq,NNumber inIcAmount,NString inCoasCode,NString inAcciCode,NString inFundCode,NString inOrgnCode,NString inAcctCode,NString inProgCode,NString inActvCode,NString inLocnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.INSERT_IC_LINE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@BUDG", budg);
			cmd.addParameter("@IN_SEQ_MAIN", inSeqMain);
			cmd.addParameter("@IN_SEQ", inSeq);
			cmd.addParameter("@IN_IC_AMOUNT", inIcAmount);
			cmd.addParameter("@IN_COAS_CODE", inCoasCode);
			cmd.addParameter("@IN_ACCI_CODE", inAcciCode);
			cmd.addParameter("@IN_FUND_CODE", inFundCode);
			cmd.addParameter("@IN_ORGN_CODE", inOrgnCode);
			cmd.addParameter("@IN_ACCT_CODE", inAcctCode);
			cmd.addParameter("@IN_PROG_CODE", inProgCode);
			cmd.addParameter("@IN_ACTV_CODE", inActvCode);
			cmd.addParameter("@IN_LOCN_CODE", inLocnCode);
				
			cmd.execute();


		}
		
		public static NBool FlineIsIcRelated(NNumber inSeqMain,NNumber inSeq) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.LINE_IS_IC_RELATED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_SEQ_MAIN", inSeqMain);
			cmd.addParameter("@IN_SEQ", inSeq);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString FselectFoasyscIcCsOrder() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.SELECT_FOASYSC_IC_CS_ORDER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FselectFrbbasi12(NString inBasiCodeIc,Ref<NDate> outEffDate,NDate inFrbbudgTransDate,NString inFrbbudgCoasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.SELECT_FRBBASI_12", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_BASI_CODE_IC", inBasiCodeIc);
			cmd.addParameter("@OUT_EFF_DATE", NDate.class);
			cmd.addParameter("@IN_FRBBUDG_TRANS_DATE", inFrbbudgTransDate);
			cmd.addParameter("@IN_FRBBUDG_COAS_CODE", inFrbbudgCoasCode);
				
			cmd.execute();
			outEffDate.val = cmd.getParameterValue("@OUT_EFF_DATE", NDate.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FselectFrbinda83(NString inIndaCodeCharge,NDate inDate,NString inCoasCode,Ref<NDate> outEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.SELECT_FRBINDA_83", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_INDA_CODE_CHARGE", inIndaCodeCharge);
			cmd.addParameter("@IN_DATE", inDate);
			cmd.addParameter("@IN_COAS_CODE", inCoasCode);
			cmd.addParameter("@OUT_EFF_DATE", NDate.class);
				
			cmd.execute();
			outEffDate.val = cmd.getParameterValue("@OUT_EFF_DATE", NDate.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FselectFrrbasi13(NString inAcct,NString inLocn,NDate inEffDate,NString inBasiCode,NString inCoasCode,Ref<NString> outExcludeInd,Ref<NNumber> outRateOverride,Ref<NNumber> outMaxAmount,Ref<NString> outCstaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.SELECT_FRRBASI_13", DbManager.getDataBaseFactory());
			
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
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.SELECT_FRRBASI_14", DbManager.getDataBaseFactory());
			
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
		
		public static NBool FselectFrrbdgpNotlinked(NString grnt,NString budg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.SELECT_FRRBDGP_NOTLINKED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@BUDG", budg);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FselectFrrcstr20(NString inCstrCode,Ref<NNumber> outRate,Ref<NNumber> outMax,NDate inFrbbudgTransDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.SELECT_FRRCSTR_20", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_CSTR_CODE", inCstrCode);
			cmd.addParameter("@OUT_RATE", NNumber.class);
			cmd.addParameter("@OUT_MAX", NNumber.class);
			cmd.addParameter("@IN_FRBBUDG_TRANS_DATE", inFrbbudgTransDate);
				
			cmd.execute();
			outRate.val = cmd.getParameterValue("@OUT_RATE", NNumber.class);
			outMax.val = cmd.getParameterValue("@OUT_MAX", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FselectFrrindr10(NString inIndrCode,Ref<NNumber> outRate,Ref<NNumber> outMax,NDate inFrbbudgTransDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.SELECT_FRRINDR_10", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_INDR_CODE", inIndrCode);
			cmd.addParameter("@OUT_RATE", NNumber.class);
			cmd.addParameter("@OUT_MAX", NNumber.class);
			cmd.addParameter("@IN_FRBBUDG_TRANS_DATE", inFrbbudgTransDate);
				
			cmd.execute();
			outRate.val = cmd.getParameterValue("@OUT_RATE", NNumber.class);
			outMax.val = cmd.getParameterValue("@OUT_MAX", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FselectFrvbasi11(NString inBasiCodeIc,NString inBasiType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.SELECT_FRVBASI_11", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_BASI_CODE_IC", inBasiCodeIc);
			cmd.addParameter("@IN_BASI_TYPE", inBasiType);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FselectFtvacct01(NString inAcct,Ref<NString> outAtyp,NDate inFrbbudgTransDate,NString inFrbbudgCoasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.SELECT_FTVACCT_01", DbManager.getDataBaseFactory());
			
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
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.SELECT_FTVATYP_02", DbManager.getDataBaseFactory());
			
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
		
		public static void setIndirectAmount(NString grnt,NString budg,NNumber xIndrInAmt,NString inFrbbudgCoasCode,NDate inFrbbudgTransDate,NString inFrbbudgCoasCodeDef,NString inFrbbudgAcciCodeDef,NString inFrbbudgFundCodeDef,NString inFrbbudgOrgnCodeDef,NString inFrbbudgProgCodeDef,NString inFrbbudgActvCodeDef,NString inFrbbudgLocnCodeDef,NString inIndaCodeCharge,NString inLinkedInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.SET_INDIRECT_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@BUDG", budg);
			cmd.addParameter("@X_INDR_IN_AMT", xIndrInAmt);
			cmd.addParameter("@IN_FRBBUDG_COAS_CODE", inFrbbudgCoasCode);
			cmd.addParameter("@IN_FRBBUDG_TRANS_DATE", inFrbbudgTransDate);
			cmd.addParameter("@IN_FRBBUDG_COAS_CODE_DEF", inFrbbudgCoasCodeDef);
			cmd.addParameter("@IN_FRBBUDG_ACCI_CODE_DEF", inFrbbudgAcciCodeDef);
			cmd.addParameter("@IN_FRBBUDG_FUND_CODE_DEF", inFrbbudgFundCodeDef);
			cmd.addParameter("@IN_FRBBUDG_ORGN_CODE_DEF", inFrbbudgOrgnCodeDef);
			cmd.addParameter("@IN_FRBBUDG_PROG_CODE_DEF", inFrbbudgProgCodeDef);
			cmd.addParameter("@IN_FRBBUDG_ACTV_CODE_DEF", inFrbbudgActvCodeDef);
			cmd.addParameter("@IN_FRBBUDG_LOCN_CODE_DEF", inFrbbudgLocnCodeDef);
			cmd.addParameter("@IN_INDA_CODE_CHARGE", inIndaCodeCharge);
			cmd.addParameter("@IN_LINKED_IND", inLinkedInd);
				
			cmd.execute();


		}
		
		public static void updateFrrbudgZeroCsmax(NString grnt,NString budg,NString budgLinkedInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKCSIC.UPDATE_FRRBUDG_ZERO_CSMAX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@BUDG", budg);
			cmd.addParameter("@BUDG_LINKED_IND", budgLinkedInd);
				
			cmd.execute();


		}
		
	
	
	
}
