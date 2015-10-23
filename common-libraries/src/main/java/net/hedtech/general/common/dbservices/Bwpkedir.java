package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkedir {
//		public static NString fComposename(List<EmptabtypeRow> emptab,NInteger n) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.F_COMPOSENAME", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getTableType("EMPTAB", "", emptab, object.class));
//			cmd.addParameter("@N", n);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
		public static NString fValidateteleaddr(NNumber pidm,NString teleCode,NNumber phoneSeqno,NDate asofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.F_VALIDATETELEADDR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TELE_CODE", teleCode);
			cmd.addParameter("@PHONE_SEQNO", phoneSeqno);
			cmd.addParameter("@ASOF_DATE", asofDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pBuilddeptlinks(NString firstLetter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_BUILDDEPTLINKS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FIRST_LETTER", firstLetter);
				
			cmd.execute();


		}
		
		public static void pBuildnamelinks(NString firstLetter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_BUILDNAMELINKS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FIRST_LETTER", firstLetter);
				
			cmd.execute();


		}
		
		public static void pDeptdirectory(NString dirIndx,NString nextRow,NString prevRow,NString searchtype,NString curOrgn,NString buttonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_DEPTDIRECTORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DIR_INDX", dirIndx);
			cmd.addParameter("@NEXT_ROW", nextRow);
			cmd.addParameter("@PREV_ROW", prevRow);
			cmd.addParameter("@SEARCHTYPE", searchtype);
			cmd.addParameter("@CUR_ORGN", curOrgn);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
				
			cmd.execute();


		}
		
		public static void pDisplaydirectory(NString lastName,NString firstName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_DISPLAYDIRECTORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
				
			cmd.execute();


		}
		
//		public static void pDisplayempinfo(List<EmptabtypeRow> emptab,NInteger n,NString searchtype) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_DISPLAYEMPINFO", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("EMPTAB", "", emptab, object.class));
//			cmd.addParameter("@N", n);
//			cmd.addParameter("@SEARCHTYPE", searchtype);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDispsearchresults(NString lastName,NString firstName,NString dirIndx,NString nextRow,NString prevRow,NString searchtype,NString buttonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_DISPSEARCHRESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@DIR_INDX", dirIndx);
			cmd.addParameter("@NEXT_ROW", nextRow);
			cmd.addParameter("@PREV_ROW", prevRow);
			cmd.addParameter("@SEARCHTYPE", searchtype);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
				
			cmd.execute();


		}
		
		public static void pGetdatalabels() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_GETDATALABELS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetemails(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_GETEMAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pGetphones(NString diroCode,NNumber pidm,NDate asofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_GETPHONES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DIRO_CODE", diroCode);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@ASOF_DATE", asofDate);
				
			cmd.execute();


		}
		
		public static void pGettitles(NNumber pidm,NString deptname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_GETTITLES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DEPTNAME", deptname);
				
			cmd.execute();


		}
		
		public static void pLoademployees(NInteger i) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_LOADEMPLOYEES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@I", i);
				
			cmd.execute();


		}
		
		public static void pNamedirectory(NString dirIndx,NString nextRow,NString prevRow,NString searchtype,NString buttonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_NAMEDIRECTORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DIR_INDX", dirIndx);
			cmd.addParameter("@NEXT_ROW", nextRow);
			cmd.addParameter("@PREV_ROW", prevRow);
			cmd.addParameter("@SEARCHTYPE", searchtype);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
				
			cmd.execute();


		}
		
		public static void pPrintdeptindex() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_PRINTDEPTINDEX", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPrintdirectorylinks(NString varLinks) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_PRINTDIRECTORYLINKS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAR_LINKS", varLinks);
				
			cmd.execute();


		}
		
		public static void pPrintemployees(NString lastName,NString firstName,NString dirIndx,NString nextRow,NString prevRow,NString searchtype,NString curOrgn,NString buttonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_PRINTEMPLOYEES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@DIR_INDX", dirIndx);
			cmd.addParameter("@NEXT_ROW", nextRow);
			cmd.addParameter("@PREV_ROW", prevRow);
			cmd.addParameter("@SEARCHTYPE", searchtype);
			cmd.addParameter("@CUR_ORGN", curOrgn);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
				
			cmd.execute();


		}
		
		public static void pPrintmoreemployees(NString lastName,NString firstName,NString dirIndx,NString nextRow,NString prevRow,NString searchtype,NString curOrgn,NString buttonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_PRINTMOREEMPLOYEES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@DIR_INDX", dirIndx);
			cmd.addParameter("@NEXT_ROW", nextRow);
			cmd.addParameter("@PREV_ROW", prevRow);
			cmd.addParameter("@SEARCHTYPE", searchtype);
			cmd.addParameter("@CUR_ORGN", curOrgn);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
				
			cmd.execute();


		}
		
		public static void pPrintnameindex() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_PRINTNAMEINDEX", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pPrinttitledept(List<EmptabtypeRow> emptab,NInteger n) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_PRINTTITLEDEPT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("EMPTAB", "", emptab, object.class));
//			cmd.addParameter("@N", n);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pSearchindividual(NString lastName,NString firstName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEDIR.P_SEARCHINDIVIDUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EmptypeRow", dataSourceName="EMPTYPE")
	public static class EmptypeRow
	{
		@DbRecordField(dataSourceName="PIDM")
		public NNumber Pidm;
		@DbRecordField(dataSourceName="ORGN_TITLE")
		public NString OrgnTitle;
		@DbRecordField(dataSourceName="SURNAME_PREFIX")
		public NString SurnamePrefix;
		@DbRecordField(dataSourceName="LAST_NAME")
		public NString LastName;
		@DbRecordField(dataSourceName="FIRST_NAME")
		public NString FirstName;
		@DbRecordField(dataSourceName="MI")
		public NString Mi;
		@DbRecordField(dataSourceName="PREF_NAME")
		public NString PrefName;
		@DbRecordField(dataSourceName="PREFIX")
		public NString Prefix;
		@DbRecordField(dataSourceName="SUFFIX")
		public NString Suffix;
		@DbRecordField(dataSourceName="ASOF_DATE")
		public NDate AsofDate;
		@DbRecordField(dataSourceName="EMP_PER_PAGE")
		public NNumber EmpPerPage;
		@DbRecordField(dataSourceName="DISP_ORGN")
		public NString DispOrgn;
		@DbRecordField(dataSourceName="DISP_TITLE")
		public NString DispTitle;
		@DbRecordField(dataSourceName="TELE_OF_IND")
		public NString TeleOfInd;
		@DbRecordField(dataSourceName="TELE_PR_IND")
		public NString TelePrInd;
		@DbRecordField(dataSourceName="TELE_FAX_IND")
		public NString TeleFaxInd;
		@DbRecordField(dataSourceName="EMAIL_IND")
		public NString EmailInd;
		@DbRecordField(dataSourceName="OF_HOUSE_NUMBER")
		public NString OfHouseNumber;
		@DbRecordField(dataSourceName="OF_STREET1")
		public NString OfStreet1;
		@DbRecordField(dataSourceName="OF_STREET2")
		public NString OfStreet2;
		@DbRecordField(dataSourceName="OF_STREET3")
		public NString OfStreet3;
		@DbRecordField(dataSourceName="OF_STREET4")
		public NString OfStreet4;
		@DbRecordField(dataSourceName="OF_CITY")
		public NString OfCity;
		@DbRecordField(dataSourceName="OF_STATE")
		public NString OfState;
		@DbRecordField(dataSourceName="OF_ZIP")
		public NString OfZip;
		@DbRecordField(dataSourceName="OF_NATN")
		public NString OfNatn;
		@DbRecordField(dataSourceName="PR_HOUSE_NUMBER")
		public NString PrHouseNumber;
		@DbRecordField(dataSourceName="PR_STREET1")
		public NString PrStreet1;
		@DbRecordField(dataSourceName="PR_STREET2")
		public NString PrStreet2;
		@DbRecordField(dataSourceName="PR_STREET3")
		public NString PrStreet3;
		@DbRecordField(dataSourceName="PR_STREET4")
		public NString PrStreet4;
		@DbRecordField(dataSourceName="PR_CITY")
		public NString PrCity;
		@DbRecordField(dataSourceName="PR_STATE")
		public NString PrState;
		@DbRecordField(dataSourceName="PR_ZIP")
		public NString PrZip;
		@DbRecordField(dataSourceName="PR_NATN")
		public NString PrNatn;
	}

	
	
}
