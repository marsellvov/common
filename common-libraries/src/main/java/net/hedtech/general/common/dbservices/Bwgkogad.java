package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwgkogad {
		public static void pDispaddrupdate(NString atyp,Ref<NNumber> seqno,NString deladdr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOGAD.P_DISPADDRUPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@SEQNO", seqno, true);
			cmd.addParameter("@DELADDR", deladdr);
				
			cmd.execute();
			seqno.val = cmd.getParameterValue("@SEQNO", NNumber.class);


		}
		
		public static void pDispaddrupdate(NString atyp,NNumber seqno,NNumber ovrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOGAD.P_DISPADDRUPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@SEQNO", seqno);
			cmd.addParameter("@OVRL", ovrl);
				
			cmd.execute();


		}
		
//		public static void pDispaddrupdateint(NString atyp,Ref<NNumber> seqno,NString deladdr,NString fdate,NString tdate,NString houseno,NString str1,NString str2,NString str3,NString str4,NString city,NString stat,NString zip,NString cnty,NString natn,NString ctry,NString area,NString num,NString ext,NString accs,NString unl,Ref<List<Twbklibs.Varchar2TabtypeRow>> seqnos,List<Twbklibs.Varchar2TabtypeRow> teles,List<Twbklibs.Varchar2TabtypeRow> ctrys,List<Twbklibs.Varchar2TabtypeRow> areas,List<Twbklibs.Varchar2TabtypeRow> phones,List<Twbklibs.Varchar2TabtypeRow> exts,List<Twbklibs.Varchar2TabtypeRow> accss,NString unl1,NString unl2,NString unl3,NString unl4,NString unl5,NString del1,NString del2,NString del3,NString del4,NString del5) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOGAD.P_DISPADDRUPDATEINT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ATYP", atyp);
//			cmd.addParameter("@SEQNO", seqno, true);
//			cmd.addParameter("@DELADDR", deladdr);
//			cmd.addParameter("@FDATE", fdate);
//			cmd.addParameter("@TDATE", tdate);
//			cmd.addParameter("@HOUSENO", houseno);
//			cmd.addParameter("@STR1", str1);
//			cmd.addParameter("@STR2", str2);
//			cmd.addParameter("@STR3", str3);
//			cmd.addParameter("@STR4", str4);
//			cmd.addParameter("@CITY", city);
//			cmd.addParameter("@STAT", stat);
//			cmd.addParameter("@ZIP", zip);
//			cmd.addParameter("@CNTY", cnty);
//			cmd.addParameter("@NATN", natn);
//			cmd.addParameter("@CTRY", ctry);
//			cmd.addParameter("@AREA", area);
//			cmd.addParameter("@NUM", num);
//			cmd.addParameter("@EXT", ext);
//			cmd.addParameter("@ACCS", accs);
//			cmd.addParameter("@UNL", unl);
//			// cmd.addParameter(DbTypes.getTableType("SEQNOS", "", seqnos.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("TELES", "", teles, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CTRYS", "", ctrys, object.class));
//			// cmd.addParameter(DbTypes.getTableType("AREAS", "", areas, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PHONES", "", phones, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EXTS", "", exts, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ACCSS", "", accss, object.class));
//			cmd.addParameter("@UNL1", unl1);
//			cmd.addParameter("@UNL2", unl2);
//			cmd.addParameter("@UNL3", unl3);
//			cmd.addParameter("@UNL4", unl4);
//			cmd.addParameter("@UNL5", unl5);
//			cmd.addParameter("@DEL1", del1);
//			cmd.addParameter("@DEL2", del2);
//			cmd.addParameter("@DEL3", del3);
//			cmd.addParameter("@DEL4", del4);
//			cmd.addParameter("@DEL5", del5);
//				
//			cmd.execute();
//			seqno.val = cmd.getParameterValue("@SEQNO", NNumber.class);
//			// seqnos.val = cmd.getTableParameterValue("@SEQNOS", object.class);
//
//
//		}
		
		public static void pDispaddrview(NString atyp,Ref<NNumber> seqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOGAD.P_DISPADDRVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@SEQNO", seqno, true);
				
			cmd.execute();
			seqno.val = cmd.getParameterValue("@SEQNO", NNumber.class);


		}
		
		public static void pDispemailupdate(NString emal,NString eadd,NString ecmt,NString eprf,NString esta,NString erid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOGAD.P_DISPEMAILUPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EMAL", emal);
			cmd.addParameter("@EADD", eadd);
			cmd.addParameter("@ECMT", ecmt);
			cmd.addParameter("@EPRF", eprf);
			cmd.addParameter("@ESTA", esta);
			cmd.addParameter("@ERID", erid);
				
			cmd.execute();


		}
		
		public static void pDispemailview(NString emal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOGAD.P_DISPEMAILVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EMAL", emal);
				
			cmd.execute();


		}
		
//		public static void pProcaddrupdate(NString atyp,Ref<NNumber> seqno,NString deladdr,NString fdate,NString tdate,NString houseno,NString str1,NString str2,NString str3,NString str4,NString city,NString stat,NString zip,NString cnty,NString natn,NString ctry,NString area,NString num,NString ext,NString accs,NString unl,Ref<List<Twbklibs.Varchar2TabtypeRow>> seqnos,List<Twbklibs.Varchar2TabtypeRow> teles,List<Twbklibs.Varchar2TabtypeRow> ctrys,List<Twbklibs.Varchar2TabtypeRow> areas,List<Twbklibs.Varchar2TabtypeRow> phones,List<Twbklibs.Varchar2TabtypeRow> exts,List<Twbklibs.Varchar2TabtypeRow> accss,NString unl1,NString unl2,NString unl3,NString unl4,NString unl5,NString del1,NString del2,NString del3,NString del4,NString del5) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOGAD.P_PROCADDRUPDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ATYP", atyp);
//			cmd.addParameter("@SEQNO", seqno, true);
//			cmd.addParameter("@DELADDR", deladdr);
//			cmd.addParameter("@FDATE", fdate);
//			cmd.addParameter("@TDATE", tdate);
//			cmd.addParameter("@HOUSENO", houseno);
//			cmd.addParameter("@STR1", str1);
//			cmd.addParameter("@STR2", str2);
//			cmd.addParameter("@STR3", str3);
//			cmd.addParameter("@STR4", str4);
//			cmd.addParameter("@CITY", city);
//			cmd.addParameter("@STAT", stat);
//			cmd.addParameter("@ZIP", zip);
//			cmd.addParameter("@CNTY", cnty);
//			cmd.addParameter("@NATN", natn);
//			cmd.addParameter("@CTRY", ctry);
//			cmd.addParameter("@AREA", area);
//			cmd.addParameter("@NUM", num);
//			cmd.addParameter("@EXT", ext);
//			cmd.addParameter("@ACCS", accs);
//			cmd.addParameter("@UNL", unl);
//			// cmd.addParameter(DbTypes.getTableType("SEQNOS", "", seqnos.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("TELES", "", teles, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CTRYS", "", ctrys, object.class));
//			// cmd.addParameter(DbTypes.getTableType("AREAS", "", areas, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PHONES", "", phones, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EXTS", "", exts, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ACCSS", "", accss, object.class));
//			cmd.addParameter("@UNL1", unl1);
//			cmd.addParameter("@UNL2", unl2);
//			cmd.addParameter("@UNL3", unl3);
//			cmd.addParameter("@UNL4", unl4);
//			cmd.addParameter("@UNL5", unl5);
//			cmd.addParameter("@DEL1", del1);
//			cmd.addParameter("@DEL2", del2);
//			cmd.addParameter("@DEL3", del3);
//			cmd.addParameter("@DEL4", del4);
//			cmd.addParameter("@DEL5", del5);
//				
//			cmd.execute();
//			seqno.val = cmd.getParameterValue("@SEQNO", NNumber.class);
//			// seqnos.val = cmd.getTableParameterValue("@SEQNOS", object.class);
//
//
//		}
//		
//		public static void pProcaddrupdate(NString atyp,NNumber seqno,NString deladdr,NString fdate,NString tdate,NString houseno,NString str1,NString str2,NString str3,NString str4,NString city,NString stat,NString zip,NString cnty,NString natn,NString ctry,NString area,NString num,NString ext,NString accs,NString unl,List<Twbklibs.Varchar2TabtypeRow> seqnos,List<Twbklibs.Varchar2TabtypeRow> teles,List<Twbklibs.Varchar2TabtypeRow> ctrys,List<Twbklibs.Varchar2TabtypeRow> areas,List<Twbklibs.Varchar2TabtypeRow> phones,List<Twbklibs.Varchar2TabtypeRow> exts,List<Twbklibs.Varchar2TabtypeRow> accss,NString unl1,NString unl2,NString unl3,NString unl4,NString unl5,NString del1,NString del2,NString del3,NString del4,NString del5,NNumber ovrl) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOGAD.P_PROCADDRUPDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ATYP", atyp);
//			cmd.addParameter("@SEQNO", seqno);
//			cmd.addParameter("@DELADDR", deladdr);
//			cmd.addParameter("@FDATE", fdate);
//			cmd.addParameter("@TDATE", tdate);
//			cmd.addParameter("@HOUSENO", houseno);
//			cmd.addParameter("@STR1", str1);
//			cmd.addParameter("@STR2", str2);
//			cmd.addParameter("@STR3", str3);
//			cmd.addParameter("@STR4", str4);
//			cmd.addParameter("@CITY", city);
//			cmd.addParameter("@STAT", stat);
//			cmd.addParameter("@ZIP", zip);
//			cmd.addParameter("@CNTY", cnty);
//			cmd.addParameter("@NATN", natn);
//			cmd.addParameter("@CTRY", ctry);
//			cmd.addParameter("@AREA", area);
//			cmd.addParameter("@NUM", num);
//			cmd.addParameter("@EXT", ext);
//			cmd.addParameter("@ACCS", accs);
//			cmd.addParameter("@UNL", unl);
//			// cmd.addParameter(DbTypes.getTableType("SEQNOS", "", seqnos, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TELES", "", teles, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CTRYS", "", ctrys, object.class));
//			// cmd.addParameter(DbTypes.getTableType("AREAS", "", areas, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PHONES", "", phones, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EXTS", "", exts, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ACCSS", "", accss, object.class));
//			cmd.addParameter("@UNL1", unl1);
//			cmd.addParameter("@UNL2", unl2);
//			cmd.addParameter("@UNL3", unl3);
//			cmd.addParameter("@UNL4", unl4);
//			cmd.addParameter("@UNL5", unl5);
//			cmd.addParameter("@DEL1", del1);
//			cmd.addParameter("@DEL2", del2);
//			cmd.addParameter("@DEL3", del3);
//			cmd.addParameter("@DEL4", del4);
//			cmd.addParameter("@DEL5", del5);
//			cmd.addParameter("@OVRL", ovrl);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pProcemailupdate(NString emal,NString eadd,NString ecmt,NString eprf,NString esta,NString erid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOGAD.P_PROCEMAILUPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EMAL", emal);
			cmd.addParameter("@EADD", eadd);
			cmd.addParameter("@ECMT", ecmt);
			cmd.addParameter("@EPRF", eprf);
			cmd.addParameter("@ESTA", esta);
			cmd.addParameter("@ERID", erid);
				
			cmd.execute();


		}
		
		public static void pSelectatypupdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOGAD.P_SELECTATYPUPDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSelectatypview(NString atyp,NNumber seqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOGAD.P_SELECTATYPVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@SEQNO", seqno);
				
			cmd.execute();


		}
		
		public static void pSelectemalupdate(NString emal,NString eadd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOGAD.P_SELECTEMALUPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EMAL", emal);
			cmd.addParameter("@EADD", eadd);
				
			cmd.execute();


		}
		
		public static void pSelectemalview(NString emal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOGAD.P_SELECTEMALVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EMAL", emal);
				
			cmd.execute();


		}
		
	
	
	
}
