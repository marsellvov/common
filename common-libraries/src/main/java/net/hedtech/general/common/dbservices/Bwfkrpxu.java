package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkrpxu {
		public static NString fDocType(NNumber ttype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKRPXU.F_DOC_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TTYPE", ttype);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fReadarec(NString grnt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKRPXU.F_READAREC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@GRNT", grnt);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pFiscalDates(NString coasCode,NDate asofdate,Ref<NString> dateError,Ref<NString> fsyr,Ref<NString> fspd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKRPXU.P_FISCAL_DATES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@ASOFDATE", asofdate);
			cmd.addParameter("@DATE_ERROR", dateError, true);
			cmd.addParameter("@FSYR", fsyr, true);
			cmd.addParameter("@FSPD", fspd, true);
				
			cmd.execute();
			dateError.val = cmd.getParameterValue("@DATE_ERROR", NString.class);
			fsyr.val = cmd.getParameterValue("@FSYR", NString.class);
			fspd.val = cmd.getParameterValue("@FSPD", NString.class);


		}
		
		public static void pFiscalDates2(NString coasCode,NDate asofdate,Ref<NString> dateError,Ref<NString> fsyr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKRPXU.P_FISCAL_DATES_2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@ASOFDATE", asofdate);
			cmd.addParameter("@DATE_ERROR", dateError, true);
			cmd.addParameter("@FSYR", fsyr, true);
				
			cmd.execute();
			dateError.val = cmd.getParameterValue("@DATE_ERROR", NString.class);
			fsyr.val = cmd.getParameterValue("@FSYR", NString.class);


		}
		
		public static void pGrantDates(NString coasCode,NString grntCode,NDate asofdate,Ref<NString> grntError,Ref<Bwfkrpcu.TitlerecordRow> grntTitle,Ref<NString> grntFspd,Ref<NString> grntFsyr,Ref<NString> fsyrStart,Ref<NString> fspdStart,Ref<NString> fsyrEnd,Ref<NString> fspdEnd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKRPXU.P_GRANT_DATES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@GRNT_CODE", grntCode);
			cmd.addParameter("@ASOFDATE", asofdate);
			cmd.addParameter("@GRNT_ERROR", grntError, true);
			cmd.addParameter(DbTypes.createStructType("GRNT_TITLE", grntTitle.val, Bwfkrpcu.TitlerecordRow.class, true));
			cmd.addParameter("@GRNT_FSPD", grntFspd, true);
			cmd.addParameter("@GRNT_FSYR", grntFsyr, true);
			cmd.addParameter("@FSYR_START", fsyrStart, true);
			cmd.addParameter("@FSPD_START", fspdStart, true);
			cmd.addParameter("@FSYR_END", fsyrEnd, true);
			cmd.addParameter("@FSPD_END", fspdEnd, true);
				
			cmd.execute();
			grntError.val = cmd.getParameterValue("@GRNT_ERROR", NString.class);
			grntTitle.val = cmd.getParameterValue("@GRNT_TITLE", Bwfkrpcu.TitlerecordRow.class);
			grntFspd.val = cmd.getParameterValue("@GRNT_FSPD", NString.class);
			grntFsyr.val = cmd.getParameterValue("@GRNT_FSYR", NString.class);
			fsyrStart.val = cmd.getParameterValue("@FSYR_START", NString.class);
			fspdStart.val = cmd.getParameterValue("@FSPD_START", NString.class);
			fsyrEnd.val = cmd.getParameterValue("@FSYR_END", NString.class);
			fspdEnd.val = cmd.getParameterValue("@FSPD_END", NString.class);


		}
		
		public static void pRelatedDocument(NString inDocCode,NNumber inTtype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKRPXU.P_RELATED_DOCUMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_DOC_CODE", inDocCode);
			cmd.addParameter("@IN_TTYPE", inTtype);
				
			cmd.execute();


		}
		
		public static void pReporte(NString inclrev,NString coas,NString fund,NString ftyp,NString program,NString orgn,NString actv,NString acct,NString atyp,NString grnt,NString asof,NString refnumber,NString skiprows,NString fcode,NString locn,NString proto,NString shared,NString complete2,NString skeleton,NString cmttype,NString fspd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKRPXU.P_REPORTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INCLREV", inclrev);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@FTYP", ftyp);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@ASOF", asof);
			cmd.addParameter("@REFNUMBER", refnumber);
			cmd.addParameter("@SKIPROWS", skiprows);
			cmd.addParameter("@FCODE", fcode);
			cmd.addParameter("@LOCN", locn);
			cmd.addParameter("@PROTO", proto);
			cmd.addParameter("@SHARED", shared);
			cmd.addParameter("@COMPLETE2", complete2);
			cmd.addParameter("@SKELETON", skeleton);
			cmd.addParameter("@CMTTYPE", cmttype);
			cmd.addParameter("@FSPD", fspd);
				
			cmd.execute();


		}
		
		public static void pReportx(NString refnumber,NString skiprows,NString subno,NString tdate,NString trowid,NString ttype,NString fcode,NString proto,NString shared,NString complete2,NString skeleton,NString cmttype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKRPXU.P_REPORTX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REFNUMBER", refnumber);
			cmd.addParameter("@SKIPROWS", skiprows);
			cmd.addParameter("@SUBNO", subno);
			cmd.addParameter("@TDATE", tdate);
			cmd.addParameter("@TROWID", trowid);
			cmd.addParameter("@TTYPE", ttype);
			cmd.addParameter("@FCODE", fcode);
			cmd.addParameter("@PROTO", proto);
			cmd.addParameter("@SHARED", shared);
			cmd.addParameter("@COMPLETE2", complete2);
			cmd.addParameter("@SKELETON", skeleton);
			cmd.addParameter("@CMTTYPE", cmttype);
				
			cmd.execute();


		}
		
	
	
	
}
