package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.DbmsXdbresource.XdbresourceRow;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DbmsXevent {
		public static void clear(XdbhandlerlistRow hl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.CLEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("HL", hl, XdbhandlerlistRow.class ));
				
			cmd.execute();


		}
		
//		public static  Fgetapplicationdata(byte[] ev) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETAPPLICATIONDATA", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@EV", ev);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static byte[] Fgetchildoid(XdblinkRow link) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETCHILDOID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter(DbTypes.createStructType("LINK", link, XdblinkRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static NString Fgetcurrentuser(XdbeventRow ev) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETCURRENTUSER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("EV", ev, XdbeventRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fgetdavowner(XdblockRow lk) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETDAVOWNER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("LK", lk, XdblockRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fgetdavtoken(XdblockRow lk) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETDAVTOKEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("LK", lk, XdblockRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NInteger Fgetdepth(XdblockRow lk) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETDEPTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter(DbTypes.createStructType("LK", lk, XdblockRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger Fgetevent(XdbeventRow ev) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETEVENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter(DbTypes.createStructType("EV", ev, XdbeventRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
//		public static  Fgetexpiry(XdblockRow lk) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETEXPIRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter(DbTypes.createStructType("LK", lk, XdblockRow.class ));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static XdbhandlerRow Fgetfirst(XdbhandlerlistRow hl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETFIRST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(XdbhandlerRow.class));
			cmd.addParameter(DbTypes.createStructType("HL", hl, XdbhandlerlistRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(XdbhandlerRow.class);

		}
		
		public static XdbhandlerlistRow Fgethandlerlist(byte[] ev) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETHANDLERLIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(XdbhandlerlistRow.class));
			cmd.addParameter("@EV", ev);
				
			cmd.execute();

			return cmd.getReturnValue(XdbhandlerlistRow.class);

		}
		
		public static NString Fgetinterface(byte[] ev) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETINTERFACE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@EV", ev);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fgetlanguage(XdbhandlerRow handler) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETLANGUAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("HANDLER", handler, XdbhandlerRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static XdblinkRow Fgetlink(byte[] ev) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETLINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(XdblinkRow.class));
			cmd.addParameter("@EV", ev);
				
			cmd.execute();

			return cmd.getReturnValue(XdblinkRow.class);

		}
		
		public static NString Fgetlinkname(XdblinkRow link) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETLINKNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("LINK", link, XdblinkRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static XdblockRow Fgetlock(byte[] ev) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETLOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(XdblockRow.class));
			cmd.addParameter("@EV", ev);
				
			cmd.execute();

			return cmd.getReturnValue(XdblockRow.class);

		}
		
		public static NInteger Fgetlockmode(XdblockRow lk) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETLOCKMODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter(DbTypes.createStructType("LK", lk, XdblockRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger Fgetlocktype(XdblockRow lk) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETLOCKTYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter(DbTypes.createStructType("LK", lk, XdblockRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString Fgetname(XdbpathRow path) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("PATH", path, XdbpathRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static XdbhandlerRow Fgetnext(XdbhandlerlistRow hl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETNEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(XdbhandlerRow.class));
			cmd.addParameter(DbTypes.createStructType("HL", hl, XdbhandlerlistRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(XdbhandlerRow.class);

		}
		
		public static byte[] Fgetnfsnodeid(XdblockRow lk) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETNFSNODEID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter(DbTypes.createStructType("LK", lk, XdblockRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static XdbresourceRow Fgetoldresource(byte[] ev) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETOLDRESOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(XdbresourceRow.class));
			cmd.addParameter("@EV", ev);
				
			cmd.execute();

			return cmd.getReturnValue(XdbresourceRow.class);

		}
		
		public static NInteger Fgetopenaccessmode(byte[] ev) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETOPENACCESSMODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@EV", ev);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger Fgetopendenymode(byte[] ev) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETOPENDENYMODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@EV", ev);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NBlob Fgetoutputstream(byte[] ev) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETOUTPUTSTREAM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBlob.class);
			cmd.addParameter("@EV", ev);
				
			cmd.execute();

			return cmd.getReturnValue(NBlob.class);

		}
		
		public static NString Fgetparameter(byte[] ev,NString key) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETPARAMETER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@EV", ev);
			cmd.addParameter("@KEY", key);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static XdbresourceRow Fgetparent(byte[] ev) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETPARENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(XdbresourceRow.class));
			cmd.addParameter("@EV", ev);
				
			cmd.execute();

			return cmd.getReturnValue(XdbresourceRow.class);

		}
		
		public static NString Fgetparentname(XdblinkRow link) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETPARENTNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("LINK", link, XdblinkRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static byte[] Fgetparentoid(XdblinkRow link) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETPARENTOID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter(DbTypes.createStructType("LINK", link, XdblinkRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static XdbpathRow Fgetparentpath(XdbpathRow path,NInteger level) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETPARENTPATH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(XdbpathRow.class));
			cmd.addParameter(DbTypes.createStructType("PATH", path, XdbpathRow.class ));
			cmd.addParameter("@LEVEL", level);
				
			cmd.execute();

			return cmd.getReturnValue(XdbpathRow.class);

		}
		
		public static XdbpathRow Fgetpath(byte[] ev) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETPATH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(XdbpathRow.class));
			cmd.addParameter("@EV", ev);
				
			cmd.execute();

			return cmd.getReturnValue(XdbpathRow.class);

		}
		
		public static XdbresourceRow Fgetresource(byte[] ev) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETRESOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(XdbresourceRow.class));
			cmd.addParameter("@EV", ev);
				
			cmd.execute();

			return cmd.getReturnValue(XdbresourceRow.class);

		}
		
		public static NString Fgetschema(XdbhandlerRow handler) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETSCHEMA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("HANDLER", handler, XdbhandlerRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fgetsource(XdbhandlerRow handler) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETSOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("HANDLER", handler, XdbhandlerRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber Fgetupdatebytecount(byte[] ev) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETUPDATEBYTECOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@EV", ev);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fgetupdatebyteoffset(byte[] ev) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETUPDATEBYTEOFFSET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@EV", ev);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static XdbeventRow Fgetxdbevent(byte[] ev) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.GETXDBEVENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(XdbeventRow.class));
			cmd.addParameter("@EV", ev);
				
			cmd.execute();

			return cmd.getReturnValue(XdbeventRow.class);

		}
		
		public static NBool Fisnull(XdbeventRow ev) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.ISNULL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("EV", ev, XdbeventRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fisnull(byte[] repev) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.ISNULL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@REPEV", repev);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fisnull(XdbhandlerlistRow hl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.ISNULL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("HL", hl, XdbhandlerlistRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fisnull(XdbhandlerRow handler) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.ISNULL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("HANDLER", handler, XdbhandlerRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fisnull(XdbpathRow path) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.ISNULL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("PATH", path, XdbpathRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fisnull(XdblinkRow link) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.ISNULL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("LINK", link, XdblinkRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fisnull(XdblockRow lk) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.ISNULL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter(DbTypes.createStructType("LK", lk, XdblockRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void remove(XdbhandlerlistRow hl,XdbhandlerRow handler) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.REMOVE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("HL", hl, XdbhandlerlistRow.class ));
			cmd.addParameter(DbTypes.createStructType("HANDLER", handler, XdbhandlerRow.class ));
				
			cmd.execute();


		}
		
		public static void setrenderpath(byte[] ev,NString path) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.SETRENDERPATH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EV", ev);
			cmd.addParameter("@PATH", path);
				
			cmd.execute();


		}
		
		public static void setrenderstream(byte[] ev,NBlob istr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_XEVENT.SETRENDERSTREAM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EV", ev);
			cmd.addParameter("@ISTR", istr);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="XdbeventRow", dataSourceName="XDBEVENT")
	public static class XdbeventRow
	{
		@DbRecordField(dataSourceName="ID")
		public byte[] Id;
	}

	
	@DbRecordType(id="XdbhandlerRow", dataSourceName="XDBHANDLER")
	public static class XdbhandlerRow
	{
		@DbRecordField(dataSourceName="ID")
		public byte[] Id;
	}

	
	@DbRecordType(id="XdbhandlerlistRow", dataSourceName="XDBHANDLERLIST")
	public static class XdbhandlerlistRow
	{
		@DbRecordField(dataSourceName="ID")
		public byte[] Id;
	}

	
	@DbRecordType(id="XdblinkRow", dataSourceName="XDBLINK")
	public static class XdblinkRow
	{
		@DbRecordField(dataSourceName="ID")
		public byte[] Id;
	}

	
	@DbRecordType(id="XdblockRow", dataSourceName="XDBLOCK")
	public static class XdblockRow
	{
		@DbRecordField(dataSourceName="ID")
		public byte[] Id;
	}

	
	@DbRecordType(id="XdbpathRow", dataSourceName="XDBPATH")
	public static class XdbpathRow
	{
		@DbRecordField(dataSourceName="ID")
		public byte[] Id;
	}

	
	
}
