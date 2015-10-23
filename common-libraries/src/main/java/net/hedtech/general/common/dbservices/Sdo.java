package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sdo {
		public static byte[] Fbvaluetodim(NNumber bval,NNumber lbound,NNumber ubound,NInteger precision) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO.BVALUETODIM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@BVAL", bval);
			cmd.addParameter("@LBOUND", lbound);
			cmd.addParameter("@UBOUND", ubound);
			cmd.addParameter("@PRECISION", precision);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static NString Fcompare(byte[] hhcode1,byte[] hhcode2,byte[] hhcode3) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO.COMPARE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@HHCODE1", hhcode1);
			cmd.addParameter("@HHCODE2", hhcode2);
			cmd.addParameter("@HHCODE3", hhcode3);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static byte[] Fdatetodim(NDate dateval,NInteger component) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO.DATETODIM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@DATEVAL", dateval);
			cmd.addParameter("@COMPONENT", component);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] Fdecode(byte[] hhcode,NInteger dimensionNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO.DECODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HHCODE", hhcode);
			cmd.addParameter("@DIMENSION_NUM", dimensionNum);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] Fencode(byte[] dimension1,byte[] dimension2,byte[] dimension3,byte[] dimension4,byte[] dimension5,byte[] dimension6,byte[] dimension7,byte[] dimension8,byte[] dimension9,byte[] dimension10,byte[] dimension11,byte[] dimension12,byte[] dimension13,byte[] dimension14,byte[] dimension15,byte[] dimension16,byte[] dimension17,byte[] dimension18,byte[] dimension19,byte[] dimension20,byte[] dimension21,byte[] dimension22,byte[] dimension23,byte[] dimension24,byte[] dimension25,byte[] dimension26,byte[] dimension27,byte[] dimension28,byte[] dimension29,byte[] dimension30,byte[] dimension31,byte[] dimension32) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO.ENCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@DIMENSION1", dimension1);
			cmd.addParameter("@DIMENSION2", dimension2);
			cmd.addParameter("@DIMENSION3", dimension3);
			cmd.addParameter("@DIMENSION4", dimension4);
			cmd.addParameter("@DIMENSION5", dimension5);
			cmd.addParameter("@DIMENSION6", dimension6);
			cmd.addParameter("@DIMENSION7", dimension7);
			cmd.addParameter("@DIMENSION8", dimension8);
			cmd.addParameter("@DIMENSION9", dimension9);
			cmd.addParameter("@DIMENSION10", dimension10);
			cmd.addParameter("@DIMENSION11", dimension11);
			cmd.addParameter("@DIMENSION12", dimension12);
			cmd.addParameter("@DIMENSION13", dimension13);
			cmd.addParameter("@DIMENSION14", dimension14);
			cmd.addParameter("@DIMENSION15", dimension15);
			cmd.addParameter("@DIMENSION16", dimension16);
			cmd.addParameter("@DIMENSION17", dimension17);
			cmd.addParameter("@DIMENSION18", dimension18);
			cmd.addParameter("@DIMENSION19", dimension19);
			cmd.addParameter("@DIMENSION20", dimension20);
			cmd.addParameter("@DIMENSION21", dimension21);
			cmd.addParameter("@DIMENSION22", dimension22);
			cmd.addParameter("@DIMENSION23", dimension23);
			cmd.addParameter("@DIMENSION24", dimension24);
			cmd.addParameter("@DIMENSION25", dimension25);
			cmd.addParameter("@DIMENSION26", dimension26);
			cmd.addParameter("@DIMENSION27", dimension27);
			cmd.addParameter("@DIMENSION28", dimension28);
			cmd.addParameter("@DIMENSION29", dimension29);
			cmd.addParameter("@DIMENSION30", dimension30);
			cmd.addParameter("@DIMENSION31", dimension31);
			cmd.addParameter("@DIMENSION32", dimension32);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] Fhvaluetodim(NInteger hval1,NInteger bitLength1,NInteger hval2,NInteger bitLength2,NInteger hval3,NInteger bitLength3,NInteger hval4,NInteger bitLength4,NInteger hval5,NInteger bitLength5,NInteger hval6,NInteger bitLength6,NInteger hval7,NInteger bitLength7,NInteger hval8,NInteger bitLength8,NInteger hval9,NInteger bitLength9,NInteger hval10,NInteger bitLength10,NInteger hval11,NInteger bitLength11,NInteger hval12,NInteger bitLength12,NInteger hval13,NInteger bitLength13,NInteger hval14,NInteger bitLength14,NInteger hval15,NInteger bitLength15,NInteger hval16,NInteger bitLength16) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO.HVALUETODIM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HVAL1", hval1);
			cmd.addParameter("@BIT_LENGTH1", bitLength1);
			cmd.addParameter("@HVAL2", hval2);
			cmd.addParameter("@BIT_LENGTH2", bitLength2);
			cmd.addParameter("@HVAL3", hval3);
			cmd.addParameter("@BIT_LENGTH3", bitLength3);
			cmd.addParameter("@HVAL4", hval4);
			cmd.addParameter("@BIT_LENGTH4", bitLength4);
			cmd.addParameter("@HVAL5", hval5);
			cmd.addParameter("@BIT_LENGTH5", bitLength5);
			cmd.addParameter("@HVAL6", hval6);
			cmd.addParameter("@BIT_LENGTH6", bitLength6);
			cmd.addParameter("@HVAL7", hval7);
			cmd.addParameter("@BIT_LENGTH7", bitLength7);
			cmd.addParameter("@HVAL8", hval8);
			cmd.addParameter("@BIT_LENGTH8", bitLength8);
			cmd.addParameter("@HVAL9", hval9);
			cmd.addParameter("@BIT_LENGTH9", bitLength9);
			cmd.addParameter("@HVAL10", hval10);
			cmd.addParameter("@BIT_LENGTH10", bitLength10);
			cmd.addParameter("@HVAL11", hval11);
			cmd.addParameter("@BIT_LENGTH11", bitLength11);
			cmd.addParameter("@HVAL12", hval12);
			cmd.addParameter("@BIT_LENGTH12", bitLength12);
			cmd.addParameter("@HVAL13", hval13);
			cmd.addParameter("@BIT_LENGTH13", bitLength13);
			cmd.addParameter("@HVAL14", hval14);
			cmd.addParameter("@BIT_LENGTH14", bitLength14);
			cmd.addParameter("@HVAL15", hval15);
			cmd.addParameter("@BIT_LENGTH15", bitLength15);
			cmd.addParameter("@HVAL16", hval16);
			cmd.addParameter("@BIT_LENGTH16", bitLength16);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] Flatlontocode(NNumber latitude,NNumber longitude) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO.LATLONTOCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@LATITUDE", latitude);
			cmd.addParameter("@LONGITUDE", longitude);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static NNumber FtoBvalue(byte[] dimension,NNumber lbound,NNumber ubound) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO.TO_BVALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@DIMENSION", dimension);
			cmd.addParameter("@LBOUND", lbound);
			cmd.addParameter("@UBOUND", ubound);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate FtoDate(byte[] dimension) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO.TO_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@DIMENSION", dimension);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NNumber FtoHvalue(byte[] dimension,NInteger bitPosition,NInteger bitLength) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO.TO_HVALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@DIMENSION", dimension);
			cmd.addParameter("@BIT_POSITION", bitPosition);
			cmd.addParameter("@BIT_LENGTH", bitLength);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FtoLat(byte[] dimension) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO.TO_LAT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@DIMENSION", dimension);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FtoLon(byte[] dimension) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO.TO_LON", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@DIMENSION", dimension);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
