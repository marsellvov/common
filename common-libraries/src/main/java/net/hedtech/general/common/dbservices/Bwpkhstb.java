package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkhstb {
		public static void pChooseemployer(NString yr,NString docDate,NString pict,NString payno,NString seqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHSTB.P_CHOOSEEMPLOYER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YR", yr);
			cmd.addParameter("@DOC_DATE", docDate);
			cmd.addParameter("@PICT", pict);
			cmd.addParameter("@PAYNO", payno);
			cmd.addParameter("@SEQ_NO", seqNo);
				
			cmd.execute();


		}
		
		public static void pChooseemployeradmin(NString yr,NString docDate,NString pict,NString payno,NString seqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHSTB.P_CHOOSEEMPLOYERADMIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YR", yr);
			cmd.addParameter("@DOC_DATE", docDate);
			cmd.addParameter("@PICT", pict);
			cmd.addParameter("@PAYNO", payno);
			cmd.addParameter("@SEQ_NO", seqNo);
				
			cmd.execute();


		}
		
		public static void pChoosepaystubempadmin(NString pEmpId,NString pEmpFirstName,NString pEmpLastName,NString pRecsPerPage,NString pPageNum,NString pSortBy,NString pNewSearch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHSTB.P_CHOOSEPAYSTUBEMPADMIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_ID", pEmpId);
			cmd.addParameter("@P_EMP_FIRST_NAME", pEmpFirstName);
			cmd.addParameter("@P_EMP_LAST_NAME", pEmpLastName);
			cmd.addParameter("@P_RECS_PER_PAGE", pRecsPerPage);
			cmd.addParameter("@P_PAGE_NUM", pPageNum);
			cmd.addParameter("@P_SORT_BY", pSortBy);
			cmd.addParameter("@P_NEW_SEARCH", pNewSearch);
				
			cmd.execute();


		}
		
		public static void pChoosepaystubyear(NString yr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHSTB.P_CHOOSEPAYSTUBYEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YR", yr);
				
			cmd.execute();


		}
		
		public static void pChoosepaystubyearadmin(NString yr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHSTB.P_CHOOSEPAYSTUBYEARADMIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YR", yr);
				
			cmd.execute();


		}
		
		public static void pDisppaystubdtl(NString yr,NString docDate,NString pict,NString payno,NString seqNo,NString empr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHSTB.P_DISPPAYSTUBDTL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YR", yr);
			cmd.addParameter("@DOC_DATE", docDate);
			cmd.addParameter("@PICT", pict);
			cmd.addParameter("@PAYNO", payno);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@EMPR", empr);
				
			cmd.execute();


		}
		
		public static void pDisppaystubdtladmin(NString yr,NString docDate,NString pict,NString payno,NString seqNo,NString empr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHSTB.P_DISPPAYSTUBDTLADMIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YR", yr);
			cmd.addParameter("@DOC_DATE", docDate);
			cmd.addParameter("@PICT", pict);
			cmd.addParameter("@PAYNO", payno);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@EMPR", empr);
				
			cmd.execute();


		}
		
		public static void pDisppaystubsum(NString yr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHSTB.P_DISPPAYSTUBSUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YR", yr);
				
			cmd.execute();


		}
		
		public static void pDisppaystubsumadmin(NString yr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHSTB.P_DISPPAYSTUBSUMADMIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YR", yr);
				
			cmd.execute();


		}
		
		public static void pPrintpaystubdtl(NString yr,NString docDate,NString pict,NString payno,NString seqNo,NString empr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHSTB.P_PRINTPAYSTUBDTL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YR", yr);
			cmd.addParameter("@DOC_DATE", docDate);
			cmd.addParameter("@PICT", pict);
			cmd.addParameter("@PAYNO", payno);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@EMPR", empr);
				
			cmd.execute();


		}
		
		public static void pPrintpaystubdtladmin(NString yr,NString docDate,NString pict,NString payno,NString seqNo,NString empr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHSTB.P_PRINTPAYSTUBDTLADMIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YR", yr);
			cmd.addParameter("@DOC_DATE", docDate);
			cmd.addParameter("@PICT", pict);
			cmd.addParameter("@PAYNO", payno);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@EMPR", empr);
				
			cmd.execute();


		}
		
	
	
	
}
