package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwgkoadr {
		public static NString fAddressparams(NString atyp,Ref<NNumber> seqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOADR.F_ADDRESSPARAMS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@SEQNO", seqno, true);
				
			cmd.execute();
			seqno.val = cmd.getParameterValue("@SEQNO", NNumber.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateGtvemalRule(NString pRoleAlumni,NString pRoleBsac,NString pRoleEmployee,NString pRoleFaculty,NString pRoleFinaid,NString pRoleFinance,NString pRoleFriend,NString pRoleStudent,NString pEmailType,NString pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOADR.F_VALIDATE_GTVEMAL_RULE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROLE_ALUMNI", pRoleAlumni);
			cmd.addParameter("@P_ROLE_BSAC", pRoleBsac);
			cmd.addParameter("@P_ROLE_EMPLOYEE", pRoleEmployee);
			cmd.addParameter("@P_ROLE_FACULTY", pRoleFaculty);
			cmd.addParameter("@P_ROLE_FINAID", pRoleFinaid);
			cmd.addParameter("@P_ROLE_FINANCE", pRoleFinance);
			cmd.addParameter("@P_ROLE_FRIEND", pRoleFriend);
			cmd.addParameter("@P_ROLE_STUDENT", pRoleStudent);
			cmd.addParameter("@P_EMAIL_TYPE", pEmailType);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateStvteleRule(NString pRoleAlumni,NString pRoleBsac,NString pRoleEmployee,NString pRoleFaculty,NString pRoleFinaid,NString pRoleFinance,NString pRoleFriend,NString pRoleStudent,NString pTelephoneType,NString pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOADR.F_VALIDATE_STVTELE_RULE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROLE_ALUMNI", pRoleAlumni);
			cmd.addParameter("@P_ROLE_BSAC", pRoleBsac);
			cmd.addParameter("@P_ROLE_EMPLOYEE", pRoleEmployee);
			cmd.addParameter("@P_ROLE_FACULTY", pRoleFaculty);
			cmd.addParameter("@P_ROLE_FINAID", pRoleFinaid);
			cmd.addParameter("@P_ROLE_FINANCE", pRoleFinance);
			cmd.addParameter("@P_ROLE_FRIEND", pRoleFriend);
			cmd.addParameter("@P_ROLE_STUDENT", pRoleStudent);
			cmd.addParameter("@P_TELEPHONE_TYPE", pTelephoneType);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void pDispaddrupdate(NNumber pidm,NString errFlag,NString nextUrl,NString atyp,Ref<NNumber> seqno,NString deladdr,NString fdate,NString tdate,NString houseno,NString str1,NString str2,NString str3,NString str4,NString city,NString stat,NString zip,NString cnty,NString natn,NString ctry,NString area,NString num,NString ext,NString accs,NString unl,Ref<List<Twbklibs.Varchar2TabtypeRow>> seqnos,List<Twbklibs.Varchar2TabtypeRow> teles,List<Twbklibs.Varchar2TabtypeRow> ctrys,List<Twbklibs.Varchar2TabtypeRow> areas,List<Twbklibs.Varchar2TabtypeRow> phones,List<Twbklibs.Varchar2TabtypeRow> exts,List<Twbklibs.Varchar2TabtypeRow> accss,NString unl1,NString unl2,NString unl3,NString unl4,NString unl5,NString del1,NString del2,NString del3,NString del4,NString del5) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOADR.P_DISPADDRUPDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM", pidm);
//			cmd.addParameter("@ERR_FLAG", errFlag);
//			cmd.addParameter("@NEXT_URL", nextUrl);
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
		
		public static void pDispaddrview(NNumber pidm,NString atyp,Ref<NNumber> seqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOADR.P_DISPADDRVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@SEQNO", seqno, true);
				
			cmd.execute();
			seqno.val = cmd.getParameterValue("@SEQNO", NNumber.class);


		}
		
		public static void pDispemailupdate(NNumber pidm,NString errFlag,NString nextUrl,NString emal,NString eadd,NString ecmt,NString eprf,NString esta,NString erid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOADR.P_DISPEMAILUPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@ERR_FLAG", errFlag);
			cmd.addParameter("@NEXT_URL", nextUrl);
			cmd.addParameter("@EMAL", emal);
			cmd.addParameter("@EADD", eadd);
			cmd.addParameter("@ECMT", ecmt);
			cmd.addParameter("@EPRF", eprf);
			cmd.addParameter("@ESTA", esta);
			cmd.addParameter("@ERID", erid);
				
			cmd.execute();


		}
		
		public static void pDispemailview(NNumber pidm,NString emal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOADR.P_DISPEMAILVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@EMAL", emal);
				
			cmd.execute();


		}
		
		public static void pSelectatypupdate(NNumber pidm,NString nextUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOADR.P_SELECTATYPUPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@NEXT_URL", nextUrl);
				
			cmd.execute();


		}
		
		public static void pSelectatypview(NNumber pidm,NString nextUrl,NString atyp,NNumber seqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOADR.P_SELECTATYPVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@NEXT_URL", nextUrl);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@SEQNO", seqno);
				
			cmd.execute();


		}
		
		public static void pSelectemalupdate(NNumber pidm,NString nextUrl,NString emal,NString eadd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOADR.P_SELECTEMALUPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@NEXT_URL", nextUrl);
			cmd.addParameter("@EMAL", emal);
			cmd.addParameter("@EADD", eadd);
				
			cmd.execute();


		}
		
		public static void pSelectemalview(NNumber pidm,NString nextUrl,NString emal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOADR.P_SELECTEMALVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@NEXT_URL", nextUrl);
			cmd.addParameter("@EMAL", emal);
				
			cmd.execute();


		}
		
//		public static void pStoreaddrupdate(NNumber pidm,NString atyp,Ref<NNumber> seqno,NString deladdr,NString fdate,NString tdate,NString houseno,NString str1,NString str2,NString str3,NString str4,NString city,NString stat,NString zip,NString cnty,NString natn,NString ctry,NString area,NString num,NString ext,NString accs,NString unl,Ref<List<Twbklibs.Varchar2TabtypeRow>> seqnos,List<Twbklibs.Varchar2TabtypeRow> teles,List<Twbklibs.Varchar2TabtypeRow> ctrys,List<Twbklibs.Varchar2TabtypeRow> areas,List<Twbklibs.Varchar2TabtypeRow> phones,List<Twbklibs.Varchar2TabtypeRow> exts,List<Twbklibs.Varchar2TabtypeRow> accss,NString unl1,NString unl2,NString unl3,NString unl4,NString unl5,NString del1,NString del2,NString del3,NString del4,NString del5) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOADR.P_STOREADDRUPDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM", pidm);
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
		
		public static void pStoreemailupdate(NNumber pidm,NString emal,NString eadd,NString ecmt,NString eprf,NString esta,NString erid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOADR.P_STOREEMAILUPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@EMAL", emal);
			cmd.addParameter("@EADD", eadd);
			cmd.addParameter("@ECMT", ecmt);
			cmd.addParameter("@EPRF", eprf);
			cmd.addParameter("@ESTA", esta);
			cmd.addParameter("@ERID", erid);
				
			cmd.execute();


		}
		
//		public static void pValaddrupdate(NNumber pidm,NString atyp,Ref<NNumber> seqno,NString deladdr,NString fdate,NString tdate,NString houseno,NString str1,NString str2,NString str3,NString str4,NString city,NString stat,NString zip,NString cnty,NString natn,NString ctry,NString area,NString num,NString ext,NString accs,NString unl,Ref<List<Twbklibs.Varchar2TabtypeRow>> seqnos,List<Twbklibs.Varchar2TabtypeRow> teles,List<Twbklibs.Varchar2TabtypeRow> ctrys,List<Twbklibs.Varchar2TabtypeRow> areas,List<Twbklibs.Varchar2TabtypeRow> phones,List<Twbklibs.Varchar2TabtypeRow> exts,List<Twbklibs.Varchar2TabtypeRow> accss,NString unl1,NString unl2,NString unl3,NString unl4,NString unl5,NString del1,NString del2,NString del3,NString del4,NString del5) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOADR.P_VALADDRUPDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM", pidm);
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
		
		public static void pValemailupdate(NNumber pidm,NString emal,NString eadd,NString eprf,NString erid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOADR.P_VALEMAILUPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@EMAL", emal);
			cmd.addParameter("@EADD", eadd);
			cmd.addParameter("@EPRF", eprf);
			cmd.addParameter("@ERID", erid);
				
			cmd.execute();


		}
		
		public static void pValidateatyp(NString atyp,NString actn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOADR.P_VALIDATEATYP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@ACTN", actn);
				
			cmd.execute();


		}
		
	
	
	
}
