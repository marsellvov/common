package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DbmsCsxAdmin {
		public static void copydefaulttokentableset(NNumber tsno,Ref<NString> qnametable,Ref<NString> nmspctable,Ref<NString> pttable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_ADMIN.COPYDEFAULTTOKENTABLESET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TSNO", tsno);
			cmd.addParameter("@QNAMETABLE", NString.class);
			cmd.addParameter("@NMSPCTABLE", NString.class);
			cmd.addParameter("@PTTABLE", NString.class);
				
			cmd.execute();
			qnametable.val = cmd.getParameterValue("@QNAMETABLE", NString.class);
			nmspctable.val = cmd.getParameterValue("@NMSPCTABLE", NString.class);
			pttable.val = cmd.getParameterValue("@PTTABLE", NString.class);


		}
		
		public static void gettokentableinfo(NString ownername,NString tablename,Ref<byte[]> guid,Ref<NString> qnametable,Ref<NString> nmspctable,Ref<NNumber> level,Ref<NNumber> tabno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_ADMIN.GETTOKENTABLEINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OWNERNAME", ownername);
			cmd.addParameter("@TABLENAME", tablename);
			cmd.addParameter("@GUID", byte[].class);
			cmd.addParameter("@QNAMETABLE", NString.class);
			cmd.addParameter("@NMSPCTABLE", NString.class);
			cmd.addParameter("@LEVEL", NNumber.class);
			cmd.addParameter("@TABNO", NNumber.class);
				
			cmd.execute();
			guid.val = cmd.getParameterValue("@GUID", byte[].class);
			qnametable.val = cmd.getParameterValue("@QNAMETABLE", NString.class);
			nmspctable.val = cmd.getParameterValue("@NMSPCTABLE", NString.class);
			level.val = cmd.getParameterValue("@LEVEL", NNumber.class);
			tabno.val = cmd.getParameterValue("@TABNO", NNumber.class);


		}
		
		public static NBool Fgettokentableinfo(NNumber tabno,Ref<byte[]> guid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_ADMIN.GETTOKENTABLEINFO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TABNO", tabno);
			cmd.addParameter("@GUID", byte[].class);
				
			cmd.execute();
			guid.val = cmd.getParameterValue("@GUID", byte[].class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void gettokentableinfobytablespace(NString tsname,NNumber tablespaceno,Ref<byte[]> guid,Ref<NString> qnametable,Ref<NString> nmspctable,Ref<NBool> isdefault,Ref<NBool> containtoktab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_ADMIN.GETTOKENTABLEINFOBYTABLESPACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TSNAME", tsname);
			cmd.addParameter("@TABLESPACENO", tablespaceno);
			cmd.addParameter("@GUID", byte[].class);
			cmd.addParameter("@QNAMETABLE", NString.class);
			cmd.addParameter("@NMSPCTABLE", NString.class);
			cmd.addParameter("@ISDEFAULT", NBool.class);
			cmd.addParameter("@CONTAINTOKTAB", NBool.class);
				
			cmd.execute();
			guid.val = cmd.getParameterValue("@GUID", byte[].class);
			qnametable.val = cmd.getParameterValue("@QNAMETABLE", NString.class);
			nmspctable.val = cmd.getParameterValue("@NMSPCTABLE", NString.class);
			isdefault.val = cmd.getParameterValue("@ISDEFAULT", NBool.class);
			containtoktab.val = cmd.getParameterValue("@CONTAINTOKTAB", NBool.class);


		}
		
		public static NString Fguidfrom32(NString guid32) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_ADMIN.GUIDFROM32", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GUID32", guid32);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fguidto32(NString guidhex) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_ADMIN.GUIDTO32", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GUIDHEX", guidhex);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FinstanceInfoExp(NString _name,NString schema,NInteger prepost,NInteger isdba,NString version,Ref<NInteger> newBlock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_ADMIN.INSTANCE_INFO_EXP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@SCHEMA", schema);
			cmd.addParameter("@PREPOST", prepost);
			cmd.addParameter("@ISDBA", isdba);
			cmd.addParameter("@VERSION", version);
			cmd.addParameter("@NEW_BLOCK", NInteger.class);
				
			cmd.execute();
			newBlock.val = cmd.getParameterValue("@NEW_BLOCK", NInteger.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fnamespaceidtable() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_ADMIN.NAMESPACEIDTABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fpathidtable() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_ADMIN.PATHIDTABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fqnameidtable() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_ADMIN.QNAMEIDTABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void registertokentableset(NNumber tstabno,byte[] guid,NNumber flags,NNumber tocreate,NNumber defaulttoks) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_ADMIN.REGISTERTOKENTABLESET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TSTABNO", tstabno);
			cmd.addParameter("@GUID", guid);
			cmd.addParameter("@FLAGS", flags);
			cmd.addParameter("@TOCREATE", tocreate);
			cmd.addParameter("@DEFAULTTOKS", defaulttoks);
				
			cmd.execute();


		}
		
		public static void updatemastertable(NString _name,NString schema,NNumber level,byte[] guid,NString toksuf) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_ADMIN.UPDATEMASTERTABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@SCHEMA", schema);
			cmd.addParameter("@LEVEL", level);
			cmd.addParameter("@GUID", guid);
			cmd.addParameter("@TOKSUF", toksuf);
				
			cmd.execute();


		}
		
	
	
	
}
