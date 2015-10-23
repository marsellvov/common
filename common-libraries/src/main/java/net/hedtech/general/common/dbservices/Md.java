package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Md {
		public static byte[] Fhhand(byte[] hh1,byte[] hh2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHAND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HH1", hh1);
			cmd.addParameter("@HH2", hh2);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static NString Fhhbits(byte[] hhc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHBITS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@HHC", hhc);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NInteger Fhhbytelen(NInteger ndim,NInteger mlv) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHBYTELEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@NDIM", ndim);
			cmd.addParameter("@MLV", mlv);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static byte[] Fhhcbit(byte[] hhc,NInteger bitNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHCBIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@BIT_NUMBER", bitNumber);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static NNumber Fhhcellbndry(byte[] hhc,NInteger dim,NNumber lb,NNumber ub,NInteger lv,NString mm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHCELLBNDRY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@DIM", dim);
			cmd.addParameter("@LB", lb);
			cmd.addParameter("@UB", ub);
			cmd.addParameter("@LV", lv);
			cmd.addParameter("@MM", mm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fhhcellsize(NNumber l01,NNumber u01,NInteger lv01,NNumber l02,NNumber u02,NInteger lv02,NNumber l03,NNumber u03,NInteger lv03,NNumber l04,NNumber u04,NInteger lv04,NNumber l05,NNumber u05,NInteger lv05,NNumber l06,NNumber u06,NInteger lv06,NNumber l07,NNumber u07,NInteger lv07,NNumber l08,NNumber u08,NInteger lv08,NNumber l09,NNumber u09,NInteger lv09,NNumber l10,NNumber u10,NInteger lv10,NNumber l11,NNumber u11,NInteger lv11,NNumber l12,NNumber u12,NInteger lv12,NNumber l13,NNumber u13,NInteger lv13,NNumber l14,NNumber u14,NInteger lv14,NNumber l15,NNumber u15,NInteger lv15,NNumber l16,NNumber u16,NInteger lv16,NNumber l17,NNumber u17,NInteger lv17,NNumber l18,NNumber u18,NInteger lv18,NNumber l19,NNumber u19,NInteger lv19,NNumber l20,NNumber u20,NInteger lv20,NNumber l21,NNumber u21,NInteger lv21,NNumber l22,NNumber u22,NInteger lv22,NNumber l23,NNumber u23,NInteger lv23,NNumber l24,NNumber u24,NInteger lv24,NNumber l25,NNumber u25,NInteger lv25,NNumber l26,NNumber u26,NInteger lv26,NNumber l27,NNumber u27,NInteger lv27,NNumber l28,NNumber u28,NInteger lv28,NNumber l29,NNumber u29,NInteger lv29,NNumber l30,NNumber u30,NInteger lv30,NNumber l31,NNumber u31,NInteger lv31,NNumber l32,NNumber u32,NInteger lv32) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHCELLSIZE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@L01", l01);
			cmd.addParameter("@U01", u01);
			cmd.addParameter("@LV01", lv01);
			cmd.addParameter("@L02", l02);
			cmd.addParameter("@U02", u02);
			cmd.addParameter("@LV02", lv02);
			cmd.addParameter("@L03", l03);
			cmd.addParameter("@U03", u03);
			cmd.addParameter("@LV03", lv03);
			cmd.addParameter("@L04", l04);
			cmd.addParameter("@U04", u04);
			cmd.addParameter("@LV04", lv04);
			cmd.addParameter("@L05", l05);
			cmd.addParameter("@U05", u05);
			cmd.addParameter("@LV05", lv05);
			cmd.addParameter("@L06", l06);
			cmd.addParameter("@U06", u06);
			cmd.addParameter("@LV06", lv06);
			cmd.addParameter("@L07", l07);
			cmd.addParameter("@U07", u07);
			cmd.addParameter("@LV07", lv07);
			cmd.addParameter("@L08", l08);
			cmd.addParameter("@U08", u08);
			cmd.addParameter("@LV08", lv08);
			cmd.addParameter("@L09", l09);
			cmd.addParameter("@U09", u09);
			cmd.addParameter("@LV09", lv09);
			cmd.addParameter("@L10", l10);
			cmd.addParameter("@U10", u10);
			cmd.addParameter("@LV10", lv10);
			cmd.addParameter("@L11", l11);
			cmd.addParameter("@U11", u11);
			cmd.addParameter("@LV11", lv11);
			cmd.addParameter("@L12", l12);
			cmd.addParameter("@U12", u12);
			cmd.addParameter("@LV12", lv12);
			cmd.addParameter("@L13", l13);
			cmd.addParameter("@U13", u13);
			cmd.addParameter("@LV13", lv13);
			cmd.addParameter("@L14", l14);
			cmd.addParameter("@U14", u14);
			cmd.addParameter("@LV14", lv14);
			cmd.addParameter("@L15", l15);
			cmd.addParameter("@U15", u15);
			cmd.addParameter("@LV15", lv15);
			cmd.addParameter("@L16", l16);
			cmd.addParameter("@U16", u16);
			cmd.addParameter("@LV16", lv16);
			cmd.addParameter("@L17", l17);
			cmd.addParameter("@U17", u17);
			cmd.addParameter("@LV17", lv17);
			cmd.addParameter("@L18", l18);
			cmd.addParameter("@U18", u18);
			cmd.addParameter("@LV18", lv18);
			cmd.addParameter("@L19", l19);
			cmd.addParameter("@U19", u19);
			cmd.addParameter("@LV19", lv19);
			cmd.addParameter("@L20", l20);
			cmd.addParameter("@U20", u20);
			cmd.addParameter("@LV20", lv20);
			cmd.addParameter("@L21", l21);
			cmd.addParameter("@U21", u21);
			cmd.addParameter("@LV21", lv21);
			cmd.addParameter("@L22", l22);
			cmd.addParameter("@U22", u22);
			cmd.addParameter("@LV22", lv22);
			cmd.addParameter("@L23", l23);
			cmd.addParameter("@U23", u23);
			cmd.addParameter("@LV23", lv23);
			cmd.addParameter("@L24", l24);
			cmd.addParameter("@U24", u24);
			cmd.addParameter("@LV24", lv24);
			cmd.addParameter("@L25", l25);
			cmd.addParameter("@U25", u25);
			cmd.addParameter("@LV25", lv25);
			cmd.addParameter("@L26", l26);
			cmd.addParameter("@U26", u26);
			cmd.addParameter("@LV26", lv26);
			cmd.addParameter("@L27", l27);
			cmd.addParameter("@U27", u27);
			cmd.addParameter("@LV27", lv27);
			cmd.addParameter("@L28", l28);
			cmd.addParameter("@U28", u28);
			cmd.addParameter("@LV28", lv28);
			cmd.addParameter("@L29", l29);
			cmd.addParameter("@U29", u29);
			cmd.addParameter("@LV29", lv29);
			cmd.addParameter("@L30", l30);
			cmd.addParameter("@U30", u30);
			cmd.addParameter("@LV30", lv30);
			cmd.addParameter("@L31", l31);
			cmd.addParameter("@U31", u31);
			cmd.addParameter("@LV31", lv31);
			cmd.addParameter("@L32", l32);
			cmd.addParameter("@U32", u32);
			cmd.addParameter("@LV32", lv32);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NInteger Fhhckref(byte[] hhc1,byte[] hhc2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHCKREF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@HHC1", hhc1);
			cmd.addParameter("@HHC2", hhc2);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString Fhhcldate(NNumber jd,NString fmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHCLDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@JD", jd);
			cmd.addParameter("@FMT", fmt);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static byte[] Fhhcollapse(byte[] hhc,NInteger d01,NInteger d02,NInteger d03,NInteger d04,NInteger d05,NInteger d06,NInteger d07,NInteger d08,NInteger d09,NInteger d10,NInteger d11,NInteger d12,NInteger d13,NInteger d14,NInteger d15,NInteger d16,NInteger d17,NInteger d18,NInteger d19,NInteger d20,NInteger d21,NInteger d22,NInteger d23,NInteger d24,NInteger d25,NInteger d26,NInteger d27,NInteger d28,NInteger d29,NInteger d30,NInteger d31) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHCOLLAPSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@D01", d01);
			cmd.addParameter("@D02", d02);
			cmd.addParameter("@D03", d03);
			cmd.addParameter("@D04", d04);
			cmd.addParameter("@D05", d05);
			cmd.addParameter("@D06", d06);
			cmd.addParameter("@D07", d07);
			cmd.addParameter("@D08", d08);
			cmd.addParameter("@D09", d09);
			cmd.addParameter("@D10", d10);
			cmd.addParameter("@D11", d11);
			cmd.addParameter("@D12", d12);
			cmd.addParameter("@D13", d13);
			cmd.addParameter("@D14", d14);
			cmd.addParameter("@D15", d15);
			cmd.addParameter("@D16", d16);
			cmd.addParameter("@D17", d17);
			cmd.addParameter("@D18", d18);
			cmd.addParameter("@D19", d19);
			cmd.addParameter("@D20", d20);
			cmd.addParameter("@D21", d21);
			cmd.addParameter("@D22", d22);
			cmd.addParameter("@D23", d23);
			cmd.addParameter("@D24", d24);
			cmd.addParameter("@D25", d25);
			cmd.addParameter("@D26", d26);
			cmd.addParameter("@D27", d27);
			cmd.addParameter("@D28", d28);
			cmd.addParameter("@D29", d29);
			cmd.addParameter("@D30", d30);
			cmd.addParameter("@D31", d31);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] Fhhcommoncode(byte[] hh1,byte[] hh2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHCOMMONCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HH1", hh1);
			cmd.addParameter("@HH2", hh2);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static NInteger Fhhcompare(byte[] hh1,byte[] hh2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHCOMPARE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@HH1", hh1);
			cmd.addParameter("@HH2", hh2);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static byte[] Fhhcompose(byte[] hhc,NInteger d01,NInteger d02,NInteger d03,NInteger d04,NInteger d05,NInteger d06,NInteger d07,NInteger d08,NInteger d09,NInteger d10,NInteger d11,NInteger d12,NInteger d13,NInteger d14,NInteger d15,NInteger d16,NInteger d17,NInteger d18,NInteger d19,NInteger d20,NInteger d21,NInteger d22,NInteger d23,NInteger d24,NInteger d25,NInteger d26,NInteger d27,NInteger d28,NInteger d29,NInteger d30,NInteger d31,NInteger d32) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHCOMPOSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@D01", d01);
			cmd.addParameter("@D02", d02);
			cmd.addParameter("@D03", d03);
			cmd.addParameter("@D04", d04);
			cmd.addParameter("@D05", d05);
			cmd.addParameter("@D06", d06);
			cmd.addParameter("@D07", d07);
			cmd.addParameter("@D08", d08);
			cmd.addParameter("@D09", d09);
			cmd.addParameter("@D10", d10);
			cmd.addParameter("@D11", d11);
			cmd.addParameter("@D12", d12);
			cmd.addParameter("@D13", d13);
			cmd.addParameter("@D14", d14);
			cmd.addParameter("@D15", d15);
			cmd.addParameter("@D16", d16);
			cmd.addParameter("@D17", d17);
			cmd.addParameter("@D18", d18);
			cmd.addParameter("@D19", d19);
			cmd.addParameter("@D20", d20);
			cmd.addParameter("@D21", d21);
			cmd.addParameter("@D22", d22);
			cmd.addParameter("@D23", d23);
			cmd.addParameter("@D24", d24);
			cmd.addParameter("@D25", d25);
			cmd.addParameter("@D26", d26);
			cmd.addParameter("@D27", d27);
			cmd.addParameter("@D28", d28);
			cmd.addParameter("@D29", d29);
			cmd.addParameter("@D30", d30);
			cmd.addParameter("@D31", d31);
			cmd.addParameter("@D32", d32);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static NNumber Fhhdecode(byte[] hhc,NInteger dim,NNumber lb,NNumber ub) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHDECODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@DIM", dim);
			cmd.addParameter("@LB", lb);
			cmd.addParameter("@UB", ub);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fhhdistance(NString type,byte[] hh1,byte[] hh2,NNumber l01,NNumber u01,NNumber l02,NNumber u02,NNumber l03,NNumber u03,NNumber l04,NNumber u04,NNumber l05,NNumber u05,NNumber l06,NNumber u06,NNumber l07,NNumber u07,NNumber l08,NNumber u08,NNumber l09,NNumber u09,NNumber l10,NNumber u10,NNumber l11,NNumber u11,NNumber l12,NNumber u12,NNumber l13,NNumber u13,NNumber l14,NNumber u14,NNumber l15,NNumber u15,NNumber l16,NNumber u16,NNumber l17,NNumber u17,NNumber l18,NNumber u18,NNumber l19,NNumber u19,NNumber l20,NNumber u20,NNumber l21,NNumber u21,NNumber l22,NNumber u22,NNumber l23,NNumber u23,NNumber l24,NNumber u24,NNumber l25,NNumber u25,NNumber l26,NNumber u26,NNumber l27,NNumber u27,NNumber l28,NNumber u28,NNumber l29,NNumber u29,NNumber l30,NNumber u30,NNumber l31,NNumber u31,NNumber l32,NNumber u32) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHDISTANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TYPE", type);
			cmd.addParameter("@HH1", hh1);
			cmd.addParameter("@HH2", hh2);
			cmd.addParameter("@L01", l01);
			cmd.addParameter("@U01", u01);
			cmd.addParameter("@L02", l02);
			cmd.addParameter("@U02", u02);
			cmd.addParameter("@L03", l03);
			cmd.addParameter("@U03", u03);
			cmd.addParameter("@L04", l04);
			cmd.addParameter("@U04", u04);
			cmd.addParameter("@L05", l05);
			cmd.addParameter("@U05", u05);
			cmd.addParameter("@L06", l06);
			cmd.addParameter("@U06", u06);
			cmd.addParameter("@L07", l07);
			cmd.addParameter("@U07", u07);
			cmd.addParameter("@L08", l08);
			cmd.addParameter("@U08", u08);
			cmd.addParameter("@L09", l09);
			cmd.addParameter("@U09", u09);
			cmd.addParameter("@L10", l10);
			cmd.addParameter("@U10", u10);
			cmd.addParameter("@L11", l11);
			cmd.addParameter("@U11", u11);
			cmd.addParameter("@L12", l12);
			cmd.addParameter("@U12", u12);
			cmd.addParameter("@L13", l13);
			cmd.addParameter("@U13", u13);
			cmd.addParameter("@L14", l14);
			cmd.addParameter("@U14", u14);
			cmd.addParameter("@L15", l15);
			cmd.addParameter("@U15", u15);
			cmd.addParameter("@L16", l16);
			cmd.addParameter("@U16", u16);
			cmd.addParameter("@L17", l17);
			cmd.addParameter("@U17", u17);
			cmd.addParameter("@L18", l18);
			cmd.addParameter("@U18", u18);
			cmd.addParameter("@L19", l19);
			cmd.addParameter("@U19", u19);
			cmd.addParameter("@L20", l20);
			cmd.addParameter("@U20", u20);
			cmd.addParameter("@L21", l21);
			cmd.addParameter("@U21", u21);
			cmd.addParameter("@L22", l22);
			cmd.addParameter("@U22", u22);
			cmd.addParameter("@L23", l23);
			cmd.addParameter("@U23", u23);
			cmd.addParameter("@L24", l24);
			cmd.addParameter("@U24", u24);
			cmd.addParameter("@L25", l25);
			cmd.addParameter("@U25", u25);
			cmd.addParameter("@L26", l26);
			cmd.addParameter("@U26", u26);
			cmd.addParameter("@L27", l27);
			cmd.addParameter("@U27", u27);
			cmd.addParameter("@L28", l28);
			cmd.addParameter("@U28", u28);
			cmd.addParameter("@L29", l29);
			cmd.addParameter("@U29", u29);
			cmd.addParameter("@L30", l30);
			cmd.addParameter("@U30", u30);
			cmd.addParameter("@L31", l31);
			cmd.addParameter("@U31", u31);
			cmd.addParameter("@L32", l32);
			cmd.addParameter("@U32", u32);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static byte[] Fhhencode(NNumber v01,NNumber l01,NNumber u01,NInteger p01,NNumber v02,NNumber l02,NNumber u02,NInteger p02,NNumber v03,NNumber l03,NNumber u03,NInteger p03,NNumber v04,NNumber l04,NNumber u04,NInteger p04,NNumber v05,NNumber l05,NNumber u05,NInteger p05,NNumber v06,NNumber l06,NNumber u06,NInteger p06) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHENCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@V01", v01);
			cmd.addParameter("@L01", l01);
			cmd.addParameter("@U01", u01);
			cmd.addParameter("@P01", p01);
			cmd.addParameter("@V02", v02);
			cmd.addParameter("@L02", l02);
			cmd.addParameter("@U02", u02);
			cmd.addParameter("@P02", p02);
			cmd.addParameter("@V03", v03);
			cmd.addParameter("@L03", l03);
			cmd.addParameter("@U03", u03);
			cmd.addParameter("@P03", p03);
			cmd.addParameter("@V04", v04);
			cmd.addParameter("@L04", l04);
			cmd.addParameter("@U04", u04);
			cmd.addParameter("@P04", p04);
			cmd.addParameter("@V05", v05);
			cmd.addParameter("@L05", l05);
			cmd.addParameter("@U05", u05);
			cmd.addParameter("@P05", p05);
			cmd.addParameter("@V06", v06);
			cmd.addParameter("@L06", l06);
			cmd.addParameter("@U06", u06);
			cmd.addParameter("@P06", p06);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] Fhhencode(NNumber v01,NNumber l01,NNumber u01,NInteger p01,NNumber v02,NNumber l02,NNumber u02,NInteger p02,NNumber v03,NNumber l03,NNumber u03,NInteger p03,NNumber v04,NNumber l04,NNumber u04,NInteger p04,NNumber v05,NNumber l05,NNumber u05,NInteger p05,NNumber v06,NNumber l06,NNumber u06,NInteger p06,NNumber v07,NNumber l07,NNumber u07,NInteger p07,NNumber v08,NNumber l08,NNumber u08,NInteger p08,NNumber v09,NNumber l09,NNumber u09,NInteger p09,NNumber v10,NNumber l10,NNumber u10,NInteger p10,NNumber v11,NNumber l11,NNumber u11,NInteger p11,NNumber v12,NNumber l12,NNumber u12,NInteger p12,NNumber v13,NNumber l13,NNumber u13,NInteger p13,NNumber v14,NNumber l14,NNumber u14,NInteger p14,NNumber v15,NNumber l15,NNumber u15,NInteger p15,NNumber v16,NNumber l16,NNumber u16,NInteger p16,NNumber v17,NNumber l17,NNumber u17,NInteger p17,NNumber v18,NNumber l18,NNumber u18,NInteger p18,NNumber v19,NNumber l19,NNumber u19,NInteger p19,NNumber v20,NNumber l20,NNumber u20,NInteger p20,NNumber v21,NNumber l21,NNumber u21,NInteger p21,NNumber v22,NNumber l22,NNumber u22,NInteger p22,NNumber v23,NNumber l23,NNumber u23,NInteger p23,NNumber v24,NNumber l24,NNumber u24,NInteger p24,NNumber v25,NNumber l25,NNumber u25,NInteger p25,NNumber v26,NNumber l26,NNumber u26,NInteger p26,NNumber v27,NNumber l27,NNumber u27,NInteger p27,NNumber v28,NNumber l28,NNumber u28,NInteger p28,NNumber v29,NNumber l29,NNumber u29,NInteger p29,NNumber v30,NNumber l30,NNumber u30,NInteger p30,NNumber v31,NNumber l31,NNumber u31,NInteger p31,NNumber v32,NNumber l32,NNumber u32,NInteger p32) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHENCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@V01", v01);
			cmd.addParameter("@L01", l01);
			cmd.addParameter("@U01", u01);
			cmd.addParameter("@P01", p01);
			cmd.addParameter("@V02", v02);
			cmd.addParameter("@L02", l02);
			cmd.addParameter("@U02", u02);
			cmd.addParameter("@P02", p02);
			cmd.addParameter("@V03", v03);
			cmd.addParameter("@L03", l03);
			cmd.addParameter("@U03", u03);
			cmd.addParameter("@P03", p03);
			cmd.addParameter("@V04", v04);
			cmd.addParameter("@L04", l04);
			cmd.addParameter("@U04", u04);
			cmd.addParameter("@P04", p04);
			cmd.addParameter("@V05", v05);
			cmd.addParameter("@L05", l05);
			cmd.addParameter("@U05", u05);
			cmd.addParameter("@P05", p05);
			cmd.addParameter("@V06", v06);
			cmd.addParameter("@L06", l06);
			cmd.addParameter("@U06", u06);
			cmd.addParameter("@P06", p06);
			cmd.addParameter("@V07", v07);
			cmd.addParameter("@L07", l07);
			cmd.addParameter("@U07", u07);
			cmd.addParameter("@P07", p07);
			cmd.addParameter("@V08", v08);
			cmd.addParameter("@L08", l08);
			cmd.addParameter("@U08", u08);
			cmd.addParameter("@P08", p08);
			cmd.addParameter("@V09", v09);
			cmd.addParameter("@L09", l09);
			cmd.addParameter("@U09", u09);
			cmd.addParameter("@P09", p09);
			cmd.addParameter("@V10", v10);
			cmd.addParameter("@L10", l10);
			cmd.addParameter("@U10", u10);
			cmd.addParameter("@P10", p10);
			cmd.addParameter("@V11", v11);
			cmd.addParameter("@L11", l11);
			cmd.addParameter("@U11", u11);
			cmd.addParameter("@P11", p11);
			cmd.addParameter("@V12", v12);
			cmd.addParameter("@L12", l12);
			cmd.addParameter("@U12", u12);
			cmd.addParameter("@P12", p12);
			cmd.addParameter("@V13", v13);
			cmd.addParameter("@L13", l13);
			cmd.addParameter("@U13", u13);
			cmd.addParameter("@P13", p13);
			cmd.addParameter("@V14", v14);
			cmd.addParameter("@L14", l14);
			cmd.addParameter("@U14", u14);
			cmd.addParameter("@P14", p14);
			cmd.addParameter("@V15", v15);
			cmd.addParameter("@L15", l15);
			cmd.addParameter("@U15", u15);
			cmd.addParameter("@P15", p15);
			cmd.addParameter("@V16", v16);
			cmd.addParameter("@L16", l16);
			cmd.addParameter("@U16", u16);
			cmd.addParameter("@P16", p16);
			cmd.addParameter("@V17", v17);
			cmd.addParameter("@L17", l17);
			cmd.addParameter("@U17", u17);
			cmd.addParameter("@P17", p17);
			cmd.addParameter("@V18", v18);
			cmd.addParameter("@L18", l18);
			cmd.addParameter("@U18", u18);
			cmd.addParameter("@P18", p18);
			cmd.addParameter("@V19", v19);
			cmd.addParameter("@L19", l19);
			cmd.addParameter("@U19", u19);
			cmd.addParameter("@P19", p19);
			cmd.addParameter("@V20", v20);
			cmd.addParameter("@L20", l20);
			cmd.addParameter("@U20", u20);
			cmd.addParameter("@P20", p20);
			cmd.addParameter("@V21", v21);
			cmd.addParameter("@L21", l21);
			cmd.addParameter("@U21", u21);
			cmd.addParameter("@P21", p21);
			cmd.addParameter("@V22", v22);
			cmd.addParameter("@L22", l22);
			cmd.addParameter("@U22", u22);
			cmd.addParameter("@P22", p22);
			cmd.addParameter("@V23", v23);
			cmd.addParameter("@L23", l23);
			cmd.addParameter("@U23", u23);
			cmd.addParameter("@P23", p23);
			cmd.addParameter("@V24", v24);
			cmd.addParameter("@L24", l24);
			cmd.addParameter("@U24", u24);
			cmd.addParameter("@P24", p24);
			cmd.addParameter("@V25", v25);
			cmd.addParameter("@L25", l25);
			cmd.addParameter("@U25", u25);
			cmd.addParameter("@P25", p25);
			cmd.addParameter("@V26", v26);
			cmd.addParameter("@L26", l26);
			cmd.addParameter("@U26", u26);
			cmd.addParameter("@P26", p26);
			cmd.addParameter("@V27", v27);
			cmd.addParameter("@L27", l27);
			cmd.addParameter("@U27", u27);
			cmd.addParameter("@P27", p27);
			cmd.addParameter("@V28", v28);
			cmd.addParameter("@L28", l28);
			cmd.addParameter("@U28", u28);
			cmd.addParameter("@P28", p28);
			cmd.addParameter("@V29", v29);
			cmd.addParameter("@L29", l29);
			cmd.addParameter("@U29", u29);
			cmd.addParameter("@P29", p29);
			cmd.addParameter("@V30", v30);
			cmd.addParameter("@L30", l30);
			cmd.addParameter("@U30", u30);
			cmd.addParameter("@P30", p30);
			cmd.addParameter("@V31", v31);
			cmd.addParameter("@L31", l31);
			cmd.addParameter("@U31", u31);
			cmd.addParameter("@P31", p31);
			cmd.addParameter("@V32", v32);
			cmd.addParameter("@L32", l32);
			cmd.addParameter("@U32", u32);
			cmd.addParameter("@P32", p32);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] FhhencodeBylevel(NNumber v01,NNumber l01,NNumber u01,NNumber p01,NNumber v02,NNumber l02,NNumber u02,NNumber p02,NNumber v03,NNumber l03,NNumber u03,NNumber p03,NNumber v04,NNumber l04,NNumber u04,NNumber p04) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHENCODE_BYLEVEL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@V01", v01);
			cmd.addParameter("@L01", l01);
			cmd.addParameter("@U01", u01);
			cmd.addParameter("@P01", p01);
			cmd.addParameter("@V02", v02);
			cmd.addParameter("@L02", l02);
			cmd.addParameter("@U02", u02);
			cmd.addParameter("@P02", p02);
			cmd.addParameter("@V03", v03);
			cmd.addParameter("@L03", l03);
			cmd.addParameter("@U03", u03);
			cmd.addParameter("@P03", p03);
			cmd.addParameter("@V04", v04);
			cmd.addParameter("@L04", l04);
			cmd.addParameter("@U04", u04);
			cmd.addParameter("@P04", p04);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static NInteger Fhhgbit(byte[] hhc,NInteger bitNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHGBIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@BIT_NUMBER", bitNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NNumber Fhhgetcid(byte[] hhc,NInteger lv) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHGETCID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@LV", lv);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static byte[] Fhhgroup(byte[] hhc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHGROUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HHC", hhc);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static NString Fhhgtbit(byte[] hhc,NInteger topology) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHGTBIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@TOPOLOGY", topology);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NInteger Fhhgtype(byte[] hhc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHGTYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@HHC", hhc);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString Fhhidlpart(NString type,byte[] hhc,NNumber v001,NNumber v002,NNumber v003,NNumber v004,NNumber v005,NNumber v006,NNumber v007,NNumber v008,NNumber v009,NNumber v010,NNumber v011,NNumber v012,NNumber v013,NNumber v014,NNumber v015,NNumber v016,NNumber v017,NNumber v018,NNumber v019,NNumber v020,NNumber v021,NNumber v022,NNumber v023,NNumber v024,NNumber v025,NNumber v026,NNumber v027,NNumber v028,NNumber v029,NNumber v030,NNumber v031,NNumber v032,NNumber v033,NNumber v034,NNumber v035,NNumber v036,NNumber v037,NNumber v038,NNumber v039,NNumber v040,NNumber v041,NNumber v042,NNumber v043,NNumber v044,NNumber v045,NNumber v046,NNumber v047,NNumber v048,NNumber v049,NNumber v050,NNumber v051,NNumber v052,NNumber v053,NNumber v054,NNumber v055,NNumber v056,NNumber v057,NNumber v058,NNumber v059,NNumber v060,NNumber v061,NNumber v062,NNumber v063,NNumber v064,NNumber v065,NNumber v066,NNumber v067,NNumber v068,NNumber v069,NNumber v070,NNumber v071,NNumber v072,NNumber v073,NNumber v074,NNumber v075,NNumber v076,NNumber v077,NNumber v078,NNumber v079,NNumber v080,NNumber v081,NNumber v082,NNumber v083,NNumber v084,NNumber v085,NNumber v086,NNumber v087,NNumber v088,NNumber v089,NNumber v090,NNumber v091,NNumber v092,NNumber v093,NNumber v094,NNumber v095,NNumber v096,NNumber v097,NNumber v098,NNumber v099,NNumber v100,NNumber v101,NNumber v102,NNumber v103,NNumber v104,NNumber v105,NNumber v106,NNumber v107,NNumber v108,NNumber v109,NNumber v110,NNumber v111,NNumber v112,NNumber v113,NNumber v114,NNumber v115,NNumber v116,NNumber v117,NNumber v118,NNumber v119,NNumber v120,NNumber v121,NNumber v122,NNumber v123,NNumber v124,NNumber v125,NNumber v126,NNumber v127,NNumber v128,NNumber v129,NNumber v130,NNumber v131,NNumber v132,NNumber v133,NNumber v134,NNumber v135,NNumber v136,NNumber v137,NNumber v138,NNumber v139,NNumber v140,NNumber v141,NNumber v142,NNumber v143,NNumber v144,NNumber v145,NNumber v146,NNumber v147,NNumber v148,NNumber v149,NNumber v150,NNumber v151,NNumber v152,NNumber v153,NNumber v154,NNumber v155,NNumber v156,NNumber v157,NNumber v158,NNumber v159,NNumber v160,NNumber v161,NNumber v162,NNumber v163,NNumber v164,NNumber v165,NNumber v166,NNumber v167,NNumber v168,NNumber v169,NNumber v170,NNumber v171,NNumber v172,NNumber v173,NNumber v174,NNumber v175,NNumber v176,NNumber v177,NNumber v178,NNumber v179,NNumber v180,NNumber v181,NNumber v182,NNumber v183,NNumber v184,NNumber v185,NNumber v186,NNumber v187,NNumber v188,NNumber v189,NNumber v190,NNumber v191,NNumber v192,NNumber v193,NNumber v194,NNumber v195,NNumber v196,NNumber v197,NNumber v198,NNumber v199,NNumber v200,NNumber v201,NNumber v202,NNumber v203,NNumber v204,NNumber v205,NNumber v206,NNumber v207,NNumber v208,NNumber v209,NNumber v210,NNumber v211,NNumber v212,NNumber v213,NNumber v214,NNumber v215,NNumber v216,NNumber v217,NNumber v218,NNumber v219,NNumber v220,NNumber v221,NNumber v222,NNumber v223,NNumber v224,NNumber v225,NNumber v226,NNumber v227,NNumber v228,NNumber v229,NNumber v230,NNumber v231,NNumber v232,NNumber v233,NNumber v234,NNumber v235,NNumber v236,NNumber v237,NNumber v238,NNumber v239,NNumber v240,NNumber v241,NNumber v242,NNumber v243,NNumber v244,NNumber v245,NNumber v246,NNumber v247,NNumber v248,NNumber v249,NNumber v250,NNumber v251,NNumber v252) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHIDLPART", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TYPE", type);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@V001", v001);
			cmd.addParameter("@V002", v002);
			cmd.addParameter("@V003", v003);
			cmd.addParameter("@V004", v004);
			cmd.addParameter("@V005", v005);
			cmd.addParameter("@V006", v006);
			cmd.addParameter("@V007", v007);
			cmd.addParameter("@V008", v008);
			cmd.addParameter("@V009", v009);
			cmd.addParameter("@V010", v010);
			cmd.addParameter("@V011", v011);
			cmd.addParameter("@V012", v012);
			cmd.addParameter("@V013", v013);
			cmd.addParameter("@V014", v014);
			cmd.addParameter("@V015", v015);
			cmd.addParameter("@V016", v016);
			cmd.addParameter("@V017", v017);
			cmd.addParameter("@V018", v018);
			cmd.addParameter("@V019", v019);
			cmd.addParameter("@V020", v020);
			cmd.addParameter("@V021", v021);
			cmd.addParameter("@V022", v022);
			cmd.addParameter("@V023", v023);
			cmd.addParameter("@V024", v024);
			cmd.addParameter("@V025", v025);
			cmd.addParameter("@V026", v026);
			cmd.addParameter("@V027", v027);
			cmd.addParameter("@V028", v028);
			cmd.addParameter("@V029", v029);
			cmd.addParameter("@V030", v030);
			cmd.addParameter("@V031", v031);
			cmd.addParameter("@V032", v032);
			cmd.addParameter("@V033", v033);
			cmd.addParameter("@V034", v034);
			cmd.addParameter("@V035", v035);
			cmd.addParameter("@V036", v036);
			cmd.addParameter("@V037", v037);
			cmd.addParameter("@V038", v038);
			cmd.addParameter("@V039", v039);
			cmd.addParameter("@V040", v040);
			cmd.addParameter("@V041", v041);
			cmd.addParameter("@V042", v042);
			cmd.addParameter("@V043", v043);
			cmd.addParameter("@V044", v044);
			cmd.addParameter("@V045", v045);
			cmd.addParameter("@V046", v046);
			cmd.addParameter("@V047", v047);
			cmd.addParameter("@V048", v048);
			cmd.addParameter("@V049", v049);
			cmd.addParameter("@V050", v050);
			cmd.addParameter("@V051", v051);
			cmd.addParameter("@V052", v052);
			cmd.addParameter("@V053", v053);
			cmd.addParameter("@V054", v054);
			cmd.addParameter("@V055", v055);
			cmd.addParameter("@V056", v056);
			cmd.addParameter("@V057", v057);
			cmd.addParameter("@V058", v058);
			cmd.addParameter("@V059", v059);
			cmd.addParameter("@V060", v060);
			cmd.addParameter("@V061", v061);
			cmd.addParameter("@V062", v062);
			cmd.addParameter("@V063", v063);
			cmd.addParameter("@V064", v064);
			cmd.addParameter("@V065", v065);
			cmd.addParameter("@V066", v066);
			cmd.addParameter("@V067", v067);
			cmd.addParameter("@V068", v068);
			cmd.addParameter("@V069", v069);
			cmd.addParameter("@V070", v070);
			cmd.addParameter("@V071", v071);
			cmd.addParameter("@V072", v072);
			cmd.addParameter("@V073", v073);
			cmd.addParameter("@V074", v074);
			cmd.addParameter("@V075", v075);
			cmd.addParameter("@V076", v076);
			cmd.addParameter("@V077", v077);
			cmd.addParameter("@V078", v078);
			cmd.addParameter("@V079", v079);
			cmd.addParameter("@V080", v080);
			cmd.addParameter("@V081", v081);
			cmd.addParameter("@V082", v082);
			cmd.addParameter("@V083", v083);
			cmd.addParameter("@V084", v084);
			cmd.addParameter("@V085", v085);
			cmd.addParameter("@V086", v086);
			cmd.addParameter("@V087", v087);
			cmd.addParameter("@V088", v088);
			cmd.addParameter("@V089", v089);
			cmd.addParameter("@V090", v090);
			cmd.addParameter("@V091", v091);
			cmd.addParameter("@V092", v092);
			cmd.addParameter("@V093", v093);
			cmd.addParameter("@V094", v094);
			cmd.addParameter("@V095", v095);
			cmd.addParameter("@V096", v096);
			cmd.addParameter("@V097", v097);
			cmd.addParameter("@V098", v098);
			cmd.addParameter("@V099", v099);
			cmd.addParameter("@V100", v100);
			cmd.addParameter("@V101", v101);
			cmd.addParameter("@V102", v102);
			cmd.addParameter("@V103", v103);
			cmd.addParameter("@V104", v104);
			cmd.addParameter("@V105", v105);
			cmd.addParameter("@V106", v106);
			cmd.addParameter("@V107", v107);
			cmd.addParameter("@V108", v108);
			cmd.addParameter("@V109", v109);
			cmd.addParameter("@V110", v110);
			cmd.addParameter("@V111", v111);
			cmd.addParameter("@V112", v112);
			cmd.addParameter("@V113", v113);
			cmd.addParameter("@V114", v114);
			cmd.addParameter("@V115", v115);
			cmd.addParameter("@V116", v116);
			cmd.addParameter("@V117", v117);
			cmd.addParameter("@V118", v118);
			cmd.addParameter("@V119", v119);
			cmd.addParameter("@V120", v120);
			cmd.addParameter("@V121", v121);
			cmd.addParameter("@V122", v122);
			cmd.addParameter("@V123", v123);
			cmd.addParameter("@V124", v124);
			cmd.addParameter("@V125", v125);
			cmd.addParameter("@V126", v126);
			cmd.addParameter("@V127", v127);
			cmd.addParameter("@V128", v128);
			cmd.addParameter("@V129", v129);
			cmd.addParameter("@V130", v130);
			cmd.addParameter("@V131", v131);
			cmd.addParameter("@V132", v132);
			cmd.addParameter("@V133", v133);
			cmd.addParameter("@V134", v134);
			cmd.addParameter("@V135", v135);
			cmd.addParameter("@V136", v136);
			cmd.addParameter("@V137", v137);
			cmd.addParameter("@V138", v138);
			cmd.addParameter("@V139", v139);
			cmd.addParameter("@V140", v140);
			cmd.addParameter("@V141", v141);
			cmd.addParameter("@V142", v142);
			cmd.addParameter("@V143", v143);
			cmd.addParameter("@V144", v144);
			cmd.addParameter("@V145", v145);
			cmd.addParameter("@V146", v146);
			cmd.addParameter("@V147", v147);
			cmd.addParameter("@V148", v148);
			cmd.addParameter("@V149", v149);
			cmd.addParameter("@V150", v150);
			cmd.addParameter("@V151", v151);
			cmd.addParameter("@V152", v152);
			cmd.addParameter("@V153", v153);
			cmd.addParameter("@V154", v154);
			cmd.addParameter("@V155", v155);
			cmd.addParameter("@V156", v156);
			cmd.addParameter("@V157", v157);
			cmd.addParameter("@V158", v158);
			cmd.addParameter("@V159", v159);
			cmd.addParameter("@V160", v160);
			cmd.addParameter("@V161", v161);
			cmd.addParameter("@V162", v162);
			cmd.addParameter("@V163", v163);
			cmd.addParameter("@V164", v164);
			cmd.addParameter("@V165", v165);
			cmd.addParameter("@V166", v166);
			cmd.addParameter("@V167", v167);
			cmd.addParameter("@V168", v168);
			cmd.addParameter("@V169", v169);
			cmd.addParameter("@V170", v170);
			cmd.addParameter("@V171", v171);
			cmd.addParameter("@V172", v172);
			cmd.addParameter("@V173", v173);
			cmd.addParameter("@V174", v174);
			cmd.addParameter("@V175", v175);
			cmd.addParameter("@V176", v176);
			cmd.addParameter("@V177", v177);
			cmd.addParameter("@V178", v178);
			cmd.addParameter("@V179", v179);
			cmd.addParameter("@V180", v180);
			cmd.addParameter("@V181", v181);
			cmd.addParameter("@V182", v182);
			cmd.addParameter("@V183", v183);
			cmd.addParameter("@V184", v184);
			cmd.addParameter("@V185", v185);
			cmd.addParameter("@V186", v186);
			cmd.addParameter("@V187", v187);
			cmd.addParameter("@V188", v188);
			cmd.addParameter("@V189", v189);
			cmd.addParameter("@V190", v190);
			cmd.addParameter("@V191", v191);
			cmd.addParameter("@V192", v192);
			cmd.addParameter("@V193", v193);
			cmd.addParameter("@V194", v194);
			cmd.addParameter("@V195", v195);
			cmd.addParameter("@V196", v196);
			cmd.addParameter("@V197", v197);
			cmd.addParameter("@V198", v198);
			cmd.addParameter("@V199", v199);
			cmd.addParameter("@V200", v200);
			cmd.addParameter("@V201", v201);
			cmd.addParameter("@V202", v202);
			cmd.addParameter("@V203", v203);
			cmd.addParameter("@V204", v204);
			cmd.addParameter("@V205", v205);
			cmd.addParameter("@V206", v206);
			cmd.addParameter("@V207", v207);
			cmd.addParameter("@V208", v208);
			cmd.addParameter("@V209", v209);
			cmd.addParameter("@V210", v210);
			cmd.addParameter("@V211", v211);
			cmd.addParameter("@V212", v212);
			cmd.addParameter("@V213", v213);
			cmd.addParameter("@V214", v214);
			cmd.addParameter("@V215", v215);
			cmd.addParameter("@V216", v216);
			cmd.addParameter("@V217", v217);
			cmd.addParameter("@V218", v218);
			cmd.addParameter("@V219", v219);
			cmd.addParameter("@V220", v220);
			cmd.addParameter("@V221", v221);
			cmd.addParameter("@V222", v222);
			cmd.addParameter("@V223", v223);
			cmd.addParameter("@V224", v224);
			cmd.addParameter("@V225", v225);
			cmd.addParameter("@V226", v226);
			cmd.addParameter("@V227", v227);
			cmd.addParameter("@V228", v228);
			cmd.addParameter("@V229", v229);
			cmd.addParameter("@V230", v230);
			cmd.addParameter("@V231", v231);
			cmd.addParameter("@V232", v232);
			cmd.addParameter("@V233", v233);
			cmd.addParameter("@V234", v234);
			cmd.addParameter("@V235", v235);
			cmd.addParameter("@V236", v236);
			cmd.addParameter("@V237", v237);
			cmd.addParameter("@V238", v238);
			cmd.addParameter("@V239", v239);
			cmd.addParameter("@V240", v240);
			cmd.addParameter("@V241", v241);
			cmd.addParameter("@V242", v242);
			cmd.addParameter("@V243", v243);
			cmd.addParameter("@V244", v244);
			cmd.addParameter("@V245", v245);
			cmd.addParameter("@V246", v246);
			cmd.addParameter("@V247", v247);
			cmd.addParameter("@V248", v248);
			cmd.addParameter("@V249", v249);
			cmd.addParameter("@V250", v250);
			cmd.addParameter("@V251", v251);
			cmd.addParameter("@V252", v252);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fhhidlrows(NString type,byte[] hhc,NNumber v001,NNumber v002,NNumber v003,NNumber v004,NNumber v005,NNumber v006,NNumber v007,NNumber v008,NNumber v009,NNumber v010,NNumber v011,NNumber v012,NNumber v013,NNumber v014,NNumber v015,NNumber v016,NNumber v017,NNumber v018,NNumber v019,NNumber v020,NNumber v021,NNumber v022,NNumber v023,NNumber v024,NNumber v025,NNumber v026,NNumber v027,NNumber v028,NNumber v029,NNumber v030,NNumber v031,NNumber v032,NNumber v033,NNumber v034,NNumber v035,NNumber v036,NNumber v037,NNumber v038,NNumber v039,NNumber v040,NNumber v041,NNumber v042,NNumber v043,NNumber v044,NNumber v045,NNumber v046,NNumber v047,NNumber v048,NNumber v049,NNumber v050,NNumber v051,NNumber v052,NNumber v053,NNumber v054,NNumber v055,NNumber v056,NNumber v057,NNumber v058,NNumber v059,NNumber v060,NNumber v061,NNumber v062,NNumber v063,NNumber v064,NNumber v065,NNumber v066,NNumber v067,NNumber v068,NNumber v069,NNumber v070,NNumber v071,NNumber v072,NNumber v073,NNumber v074,NNumber v075,NNumber v076,NNumber v077,NNumber v078,NNumber v079,NNumber v080,NNumber v081,NNumber v082,NNumber v083,NNumber v084,NNumber v085,NNumber v086,NNumber v087,NNumber v088,NNumber v089,NNumber v090,NNumber v091,NNumber v092,NNumber v093,NNumber v094,NNumber v095,NNumber v096,NNumber v097,NNumber v098,NNumber v099,NNumber v100,NNumber v101,NNumber v102,NNumber v103,NNumber v104,NNumber v105,NNumber v106,NNumber v107,NNumber v108,NNumber v109,NNumber v110,NNumber v111,NNumber v112,NNumber v113,NNumber v114,NNumber v115,NNumber v116,NNumber v117,NNumber v118,NNumber v119,NNumber v120,NNumber v121,NNumber v122,NNumber v123,NNumber v124,NNumber v125,NNumber v126,NNumber v127,NNumber v128,NNumber v129,NNumber v130,NNumber v131,NNumber v132,NNumber v133,NNumber v134,NNumber v135,NNumber v136,NNumber v137,NNumber v138,NNumber v139,NNumber v140,NNumber v141,NNumber v142,NNumber v143,NNumber v144,NNumber v145,NNumber v146,NNumber v147,NNumber v148,NNumber v149,NNumber v150,NNumber v151,NNumber v152,NNumber v153,NNumber v154,NNumber v155,NNumber v156,NNumber v157,NNumber v158,NNumber v159,NNumber v160,NNumber v161,NNumber v162,NNumber v163,NNumber v164,NNumber v165,NNumber v166,NNumber v167,NNumber v168,NNumber v169,NNumber v170,NNumber v171,NNumber v172,NNumber v173,NNumber v174,NNumber v175,NNumber v176,NNumber v177,NNumber v178,NNumber v179,NNumber v180,NNumber v181,NNumber v182,NNumber v183,NNumber v184,NNumber v185,NNumber v186,NNumber v187,NNumber v188,NNumber v189,NNumber v190,NNumber v191,NNumber v192,NNumber v193,NNumber v194,NNumber v195,NNumber v196,NNumber v197,NNumber v198,NNumber v199,NNumber v200,NNumber v201,NNumber v202,NNumber v203,NNumber v204,NNumber v205,NNumber v206,NNumber v207,NNumber v208,NNumber v209,NNumber v210,NNumber v211,NNumber v212,NNumber v213,NNumber v214,NNumber v215,NNumber v216,NNumber v217,NNumber v218,NNumber v219,NNumber v220,NNumber v221,NNumber v222,NNumber v223,NNumber v224,NNumber v225,NNumber v226,NNumber v227,NNumber v228,NNumber v229,NNumber v230,NNumber v231,NNumber v232,NNumber v233,NNumber v234,NNumber v235,NNumber v236,NNumber v237,NNumber v238,NNumber v239,NNumber v240,NNumber v241,NNumber v242,NNumber v243,NNumber v244,NNumber v245,NNumber v246,NNumber v247,NNumber v248,NNumber v249,NNumber v250,NNumber v251,NNumber v252) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHIDLROWS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TYPE", type);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@V001", v001);
			cmd.addParameter("@V002", v002);
			cmd.addParameter("@V003", v003);
			cmd.addParameter("@V004", v004);
			cmd.addParameter("@V005", v005);
			cmd.addParameter("@V006", v006);
			cmd.addParameter("@V007", v007);
			cmd.addParameter("@V008", v008);
			cmd.addParameter("@V009", v009);
			cmd.addParameter("@V010", v010);
			cmd.addParameter("@V011", v011);
			cmd.addParameter("@V012", v012);
			cmd.addParameter("@V013", v013);
			cmd.addParameter("@V014", v014);
			cmd.addParameter("@V015", v015);
			cmd.addParameter("@V016", v016);
			cmd.addParameter("@V017", v017);
			cmd.addParameter("@V018", v018);
			cmd.addParameter("@V019", v019);
			cmd.addParameter("@V020", v020);
			cmd.addParameter("@V021", v021);
			cmd.addParameter("@V022", v022);
			cmd.addParameter("@V023", v023);
			cmd.addParameter("@V024", v024);
			cmd.addParameter("@V025", v025);
			cmd.addParameter("@V026", v026);
			cmd.addParameter("@V027", v027);
			cmd.addParameter("@V028", v028);
			cmd.addParameter("@V029", v029);
			cmd.addParameter("@V030", v030);
			cmd.addParameter("@V031", v031);
			cmd.addParameter("@V032", v032);
			cmd.addParameter("@V033", v033);
			cmd.addParameter("@V034", v034);
			cmd.addParameter("@V035", v035);
			cmd.addParameter("@V036", v036);
			cmd.addParameter("@V037", v037);
			cmd.addParameter("@V038", v038);
			cmd.addParameter("@V039", v039);
			cmd.addParameter("@V040", v040);
			cmd.addParameter("@V041", v041);
			cmd.addParameter("@V042", v042);
			cmd.addParameter("@V043", v043);
			cmd.addParameter("@V044", v044);
			cmd.addParameter("@V045", v045);
			cmd.addParameter("@V046", v046);
			cmd.addParameter("@V047", v047);
			cmd.addParameter("@V048", v048);
			cmd.addParameter("@V049", v049);
			cmd.addParameter("@V050", v050);
			cmd.addParameter("@V051", v051);
			cmd.addParameter("@V052", v052);
			cmd.addParameter("@V053", v053);
			cmd.addParameter("@V054", v054);
			cmd.addParameter("@V055", v055);
			cmd.addParameter("@V056", v056);
			cmd.addParameter("@V057", v057);
			cmd.addParameter("@V058", v058);
			cmd.addParameter("@V059", v059);
			cmd.addParameter("@V060", v060);
			cmd.addParameter("@V061", v061);
			cmd.addParameter("@V062", v062);
			cmd.addParameter("@V063", v063);
			cmd.addParameter("@V064", v064);
			cmd.addParameter("@V065", v065);
			cmd.addParameter("@V066", v066);
			cmd.addParameter("@V067", v067);
			cmd.addParameter("@V068", v068);
			cmd.addParameter("@V069", v069);
			cmd.addParameter("@V070", v070);
			cmd.addParameter("@V071", v071);
			cmd.addParameter("@V072", v072);
			cmd.addParameter("@V073", v073);
			cmd.addParameter("@V074", v074);
			cmd.addParameter("@V075", v075);
			cmd.addParameter("@V076", v076);
			cmd.addParameter("@V077", v077);
			cmd.addParameter("@V078", v078);
			cmd.addParameter("@V079", v079);
			cmd.addParameter("@V080", v080);
			cmd.addParameter("@V081", v081);
			cmd.addParameter("@V082", v082);
			cmd.addParameter("@V083", v083);
			cmd.addParameter("@V084", v084);
			cmd.addParameter("@V085", v085);
			cmd.addParameter("@V086", v086);
			cmd.addParameter("@V087", v087);
			cmd.addParameter("@V088", v088);
			cmd.addParameter("@V089", v089);
			cmd.addParameter("@V090", v090);
			cmd.addParameter("@V091", v091);
			cmd.addParameter("@V092", v092);
			cmd.addParameter("@V093", v093);
			cmd.addParameter("@V094", v094);
			cmd.addParameter("@V095", v095);
			cmd.addParameter("@V096", v096);
			cmd.addParameter("@V097", v097);
			cmd.addParameter("@V098", v098);
			cmd.addParameter("@V099", v099);
			cmd.addParameter("@V100", v100);
			cmd.addParameter("@V101", v101);
			cmd.addParameter("@V102", v102);
			cmd.addParameter("@V103", v103);
			cmd.addParameter("@V104", v104);
			cmd.addParameter("@V105", v105);
			cmd.addParameter("@V106", v106);
			cmd.addParameter("@V107", v107);
			cmd.addParameter("@V108", v108);
			cmd.addParameter("@V109", v109);
			cmd.addParameter("@V110", v110);
			cmd.addParameter("@V111", v111);
			cmd.addParameter("@V112", v112);
			cmd.addParameter("@V113", v113);
			cmd.addParameter("@V114", v114);
			cmd.addParameter("@V115", v115);
			cmd.addParameter("@V116", v116);
			cmd.addParameter("@V117", v117);
			cmd.addParameter("@V118", v118);
			cmd.addParameter("@V119", v119);
			cmd.addParameter("@V120", v120);
			cmd.addParameter("@V121", v121);
			cmd.addParameter("@V122", v122);
			cmd.addParameter("@V123", v123);
			cmd.addParameter("@V124", v124);
			cmd.addParameter("@V125", v125);
			cmd.addParameter("@V126", v126);
			cmd.addParameter("@V127", v127);
			cmd.addParameter("@V128", v128);
			cmd.addParameter("@V129", v129);
			cmd.addParameter("@V130", v130);
			cmd.addParameter("@V131", v131);
			cmd.addParameter("@V132", v132);
			cmd.addParameter("@V133", v133);
			cmd.addParameter("@V134", v134);
			cmd.addParameter("@V135", v135);
			cmd.addParameter("@V136", v136);
			cmd.addParameter("@V137", v137);
			cmd.addParameter("@V138", v138);
			cmd.addParameter("@V139", v139);
			cmd.addParameter("@V140", v140);
			cmd.addParameter("@V141", v141);
			cmd.addParameter("@V142", v142);
			cmd.addParameter("@V143", v143);
			cmd.addParameter("@V144", v144);
			cmd.addParameter("@V145", v145);
			cmd.addParameter("@V146", v146);
			cmd.addParameter("@V147", v147);
			cmd.addParameter("@V148", v148);
			cmd.addParameter("@V149", v149);
			cmd.addParameter("@V150", v150);
			cmd.addParameter("@V151", v151);
			cmd.addParameter("@V152", v152);
			cmd.addParameter("@V153", v153);
			cmd.addParameter("@V154", v154);
			cmd.addParameter("@V155", v155);
			cmd.addParameter("@V156", v156);
			cmd.addParameter("@V157", v157);
			cmd.addParameter("@V158", v158);
			cmd.addParameter("@V159", v159);
			cmd.addParameter("@V160", v160);
			cmd.addParameter("@V161", v161);
			cmd.addParameter("@V162", v162);
			cmd.addParameter("@V163", v163);
			cmd.addParameter("@V164", v164);
			cmd.addParameter("@V165", v165);
			cmd.addParameter("@V166", v166);
			cmd.addParameter("@V167", v167);
			cmd.addParameter("@V168", v168);
			cmd.addParameter("@V169", v169);
			cmd.addParameter("@V170", v170);
			cmd.addParameter("@V171", v171);
			cmd.addParameter("@V172", v172);
			cmd.addParameter("@V173", v173);
			cmd.addParameter("@V174", v174);
			cmd.addParameter("@V175", v175);
			cmd.addParameter("@V176", v176);
			cmd.addParameter("@V177", v177);
			cmd.addParameter("@V178", v178);
			cmd.addParameter("@V179", v179);
			cmd.addParameter("@V180", v180);
			cmd.addParameter("@V181", v181);
			cmd.addParameter("@V182", v182);
			cmd.addParameter("@V183", v183);
			cmd.addParameter("@V184", v184);
			cmd.addParameter("@V185", v185);
			cmd.addParameter("@V186", v186);
			cmd.addParameter("@V187", v187);
			cmd.addParameter("@V188", v188);
			cmd.addParameter("@V189", v189);
			cmd.addParameter("@V190", v190);
			cmd.addParameter("@V191", v191);
			cmd.addParameter("@V192", v192);
			cmd.addParameter("@V193", v193);
			cmd.addParameter("@V194", v194);
			cmd.addParameter("@V195", v195);
			cmd.addParameter("@V196", v196);
			cmd.addParameter("@V197", v197);
			cmd.addParameter("@V198", v198);
			cmd.addParameter("@V199", v199);
			cmd.addParameter("@V200", v200);
			cmd.addParameter("@V201", v201);
			cmd.addParameter("@V202", v202);
			cmd.addParameter("@V203", v203);
			cmd.addParameter("@V204", v204);
			cmd.addParameter("@V205", v205);
			cmd.addParameter("@V206", v206);
			cmd.addParameter("@V207", v207);
			cmd.addParameter("@V208", v208);
			cmd.addParameter("@V209", v209);
			cmd.addParameter("@V210", v210);
			cmd.addParameter("@V211", v211);
			cmd.addParameter("@V212", v212);
			cmd.addParameter("@V213", v213);
			cmd.addParameter("@V214", v214);
			cmd.addParameter("@V215", v215);
			cmd.addParameter("@V216", v216);
			cmd.addParameter("@V217", v217);
			cmd.addParameter("@V218", v218);
			cmd.addParameter("@V219", v219);
			cmd.addParameter("@V220", v220);
			cmd.addParameter("@V221", v221);
			cmd.addParameter("@V222", v222);
			cmd.addParameter("@V223", v223);
			cmd.addParameter("@V224", v224);
			cmd.addParameter("@V225", v225);
			cmd.addParameter("@V226", v226);
			cmd.addParameter("@V227", v227);
			cmd.addParameter("@V228", v228);
			cmd.addParameter("@V229", v229);
			cmd.addParameter("@V230", v230);
			cmd.addParameter("@V231", v231);
			cmd.addParameter("@V232", v232);
			cmd.addParameter("@V233", v233);
			cmd.addParameter("@V234", v234);
			cmd.addParameter("@V235", v235);
			cmd.addParameter("@V236", v236);
			cmd.addParameter("@V237", v237);
			cmd.addParameter("@V238", v238);
			cmd.addParameter("@V239", v239);
			cmd.addParameter("@V240", v240);
			cmd.addParameter("@V241", v241);
			cmd.addParameter("@V242", v242);
			cmd.addParameter("@V243", v243);
			cmd.addParameter("@V244", v244);
			cmd.addParameter("@V245", v245);
			cmd.addParameter("@V246", v246);
			cmd.addParameter("@V247", v247);
			cmd.addParameter("@V248", v248);
			cmd.addParameter("@V249", v249);
			cmd.addParameter("@V250", v250);
			cmd.addParameter("@V251", v251);
			cmd.addParameter("@V252", v252);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fhhidpart(NString type,byte[] hhc,NNumber v001,NNumber v002,NNumber v003,NNumber v004,NNumber v005,NNumber v006,NNumber v007,NNumber v008,NNumber v009,NNumber v010,NNumber v011,NNumber v012,NNumber v013,NNumber v014,NNumber v015,NNumber v016,NNumber v017,NNumber v018,NNumber v019,NNumber v020,NNumber v021,NNumber v022,NNumber v023,NNumber v024,NNumber v025,NNumber v026,NNumber v027,NNumber v028,NNumber v029,NNumber v030,NNumber v031,NNumber v032,NNumber v033,NNumber v034,NNumber v035,NNumber v036,NNumber v037,NNumber v038,NNumber v039,NNumber v040,NNumber v041,NNumber v042,NNumber v043,NNumber v044,NNumber v045,NNumber v046,NNumber v047,NNumber v048,NNumber v049,NNumber v050,NNumber v051,NNumber v052,NNumber v053,NNumber v054,NNumber v055,NNumber v056,NNumber v057,NNumber v058,NNumber v059,NNumber v060,NNumber v061,NNumber v062,NNumber v063,NNumber v064,NNumber v065,NNumber v066,NNumber v067,NNumber v068,NNumber v069,NNumber v070,NNumber v071,NNumber v072,NNumber v073,NNumber v074,NNumber v075,NNumber v076,NNumber v077,NNumber v078,NNumber v079,NNumber v080,NNumber v081,NNumber v082,NNumber v083,NNumber v084,NNumber v085,NNumber v086,NNumber v087,NNumber v088,NNumber v089,NNumber v090,NNumber v091,NNumber v092,NNumber v093,NNumber v094,NNumber v095,NNumber v096,NNumber v097,NNumber v098,NNumber v099,NNumber v100,NNumber v101,NNumber v102,NNumber v103,NNumber v104,NNumber v105,NNumber v106,NNumber v107,NNumber v108,NNumber v109,NNumber v110,NNumber v111,NNumber v112,NNumber v113,NNumber v114,NNumber v115,NNumber v116,NNumber v117,NNumber v118,NNumber v119,NNumber v120,NNumber v121,NNumber v122,NNumber v123,NNumber v124,NNumber v125,NNumber v126,NNumber v127,NNumber v128,NNumber v129,NNumber v130,NNumber v131,NNumber v132,NNumber v133,NNumber v134,NNumber v135,NNumber v136,NNumber v137,NNumber v138,NNumber v139,NNumber v140,NNumber v141,NNumber v142,NNumber v143,NNumber v144,NNumber v145,NNumber v146,NNumber v147,NNumber v148,NNumber v149,NNumber v150,NNumber v151,NNumber v152,NNumber v153,NNumber v154,NNumber v155,NNumber v156,NNumber v157,NNumber v158,NNumber v159,NNumber v160,NNumber v161,NNumber v162,NNumber v163,NNumber v164,NNumber v165,NNumber v166,NNumber v167,NNumber v168,NNumber v169,NNumber v170,NNumber v171,NNumber v172,NNumber v173,NNumber v174,NNumber v175,NNumber v176,NNumber v177,NNumber v178,NNumber v179,NNumber v180,NNumber v181,NNumber v182,NNumber v183,NNumber v184,NNumber v185,NNumber v186,NNumber v187,NNumber v188,NNumber v189,NNumber v190,NNumber v191,NNumber v192,NNumber v193,NNumber v194,NNumber v195,NNumber v196,NNumber v197,NNumber v198,NNumber v199,NNumber v200,NNumber v201,NNumber v202,NNumber v203,NNumber v204,NNumber v205,NNumber v206,NNumber v207,NNumber v208,NNumber v209,NNumber v210,NNumber v211,NNumber v212,NNumber v213,NNumber v214,NNumber v215,NNumber v216,NNumber v217,NNumber v218,NNumber v219,NNumber v220,NNumber v221,NNumber v222,NNumber v223,NNumber v224,NNumber v225,NNumber v226,NNumber v227,NNumber v228,NNumber v229,NNumber v230,NNumber v231,NNumber v232,NNumber v233,NNumber v234,NNumber v235,NNumber v236,NNumber v237,NNumber v238,NNumber v239,NNumber v240,NNumber v241,NNumber v242,NNumber v243,NNumber v244,NNumber v245,NNumber v246,NNumber v247,NNumber v248,NNumber v249,NNumber v250,NNumber v251,NNumber v252) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHIDPART", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TYPE", type);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@V001", v001);
			cmd.addParameter("@V002", v002);
			cmd.addParameter("@V003", v003);
			cmd.addParameter("@V004", v004);
			cmd.addParameter("@V005", v005);
			cmd.addParameter("@V006", v006);
			cmd.addParameter("@V007", v007);
			cmd.addParameter("@V008", v008);
			cmd.addParameter("@V009", v009);
			cmd.addParameter("@V010", v010);
			cmd.addParameter("@V011", v011);
			cmd.addParameter("@V012", v012);
			cmd.addParameter("@V013", v013);
			cmd.addParameter("@V014", v014);
			cmd.addParameter("@V015", v015);
			cmd.addParameter("@V016", v016);
			cmd.addParameter("@V017", v017);
			cmd.addParameter("@V018", v018);
			cmd.addParameter("@V019", v019);
			cmd.addParameter("@V020", v020);
			cmd.addParameter("@V021", v021);
			cmd.addParameter("@V022", v022);
			cmd.addParameter("@V023", v023);
			cmd.addParameter("@V024", v024);
			cmd.addParameter("@V025", v025);
			cmd.addParameter("@V026", v026);
			cmd.addParameter("@V027", v027);
			cmd.addParameter("@V028", v028);
			cmd.addParameter("@V029", v029);
			cmd.addParameter("@V030", v030);
			cmd.addParameter("@V031", v031);
			cmd.addParameter("@V032", v032);
			cmd.addParameter("@V033", v033);
			cmd.addParameter("@V034", v034);
			cmd.addParameter("@V035", v035);
			cmd.addParameter("@V036", v036);
			cmd.addParameter("@V037", v037);
			cmd.addParameter("@V038", v038);
			cmd.addParameter("@V039", v039);
			cmd.addParameter("@V040", v040);
			cmd.addParameter("@V041", v041);
			cmd.addParameter("@V042", v042);
			cmd.addParameter("@V043", v043);
			cmd.addParameter("@V044", v044);
			cmd.addParameter("@V045", v045);
			cmd.addParameter("@V046", v046);
			cmd.addParameter("@V047", v047);
			cmd.addParameter("@V048", v048);
			cmd.addParameter("@V049", v049);
			cmd.addParameter("@V050", v050);
			cmd.addParameter("@V051", v051);
			cmd.addParameter("@V052", v052);
			cmd.addParameter("@V053", v053);
			cmd.addParameter("@V054", v054);
			cmd.addParameter("@V055", v055);
			cmd.addParameter("@V056", v056);
			cmd.addParameter("@V057", v057);
			cmd.addParameter("@V058", v058);
			cmd.addParameter("@V059", v059);
			cmd.addParameter("@V060", v060);
			cmd.addParameter("@V061", v061);
			cmd.addParameter("@V062", v062);
			cmd.addParameter("@V063", v063);
			cmd.addParameter("@V064", v064);
			cmd.addParameter("@V065", v065);
			cmd.addParameter("@V066", v066);
			cmd.addParameter("@V067", v067);
			cmd.addParameter("@V068", v068);
			cmd.addParameter("@V069", v069);
			cmd.addParameter("@V070", v070);
			cmd.addParameter("@V071", v071);
			cmd.addParameter("@V072", v072);
			cmd.addParameter("@V073", v073);
			cmd.addParameter("@V074", v074);
			cmd.addParameter("@V075", v075);
			cmd.addParameter("@V076", v076);
			cmd.addParameter("@V077", v077);
			cmd.addParameter("@V078", v078);
			cmd.addParameter("@V079", v079);
			cmd.addParameter("@V080", v080);
			cmd.addParameter("@V081", v081);
			cmd.addParameter("@V082", v082);
			cmd.addParameter("@V083", v083);
			cmd.addParameter("@V084", v084);
			cmd.addParameter("@V085", v085);
			cmd.addParameter("@V086", v086);
			cmd.addParameter("@V087", v087);
			cmd.addParameter("@V088", v088);
			cmd.addParameter("@V089", v089);
			cmd.addParameter("@V090", v090);
			cmd.addParameter("@V091", v091);
			cmd.addParameter("@V092", v092);
			cmd.addParameter("@V093", v093);
			cmd.addParameter("@V094", v094);
			cmd.addParameter("@V095", v095);
			cmd.addParameter("@V096", v096);
			cmd.addParameter("@V097", v097);
			cmd.addParameter("@V098", v098);
			cmd.addParameter("@V099", v099);
			cmd.addParameter("@V100", v100);
			cmd.addParameter("@V101", v101);
			cmd.addParameter("@V102", v102);
			cmd.addParameter("@V103", v103);
			cmd.addParameter("@V104", v104);
			cmd.addParameter("@V105", v105);
			cmd.addParameter("@V106", v106);
			cmd.addParameter("@V107", v107);
			cmd.addParameter("@V108", v108);
			cmd.addParameter("@V109", v109);
			cmd.addParameter("@V110", v110);
			cmd.addParameter("@V111", v111);
			cmd.addParameter("@V112", v112);
			cmd.addParameter("@V113", v113);
			cmd.addParameter("@V114", v114);
			cmd.addParameter("@V115", v115);
			cmd.addParameter("@V116", v116);
			cmd.addParameter("@V117", v117);
			cmd.addParameter("@V118", v118);
			cmd.addParameter("@V119", v119);
			cmd.addParameter("@V120", v120);
			cmd.addParameter("@V121", v121);
			cmd.addParameter("@V122", v122);
			cmd.addParameter("@V123", v123);
			cmd.addParameter("@V124", v124);
			cmd.addParameter("@V125", v125);
			cmd.addParameter("@V126", v126);
			cmd.addParameter("@V127", v127);
			cmd.addParameter("@V128", v128);
			cmd.addParameter("@V129", v129);
			cmd.addParameter("@V130", v130);
			cmd.addParameter("@V131", v131);
			cmd.addParameter("@V132", v132);
			cmd.addParameter("@V133", v133);
			cmd.addParameter("@V134", v134);
			cmd.addParameter("@V135", v135);
			cmd.addParameter("@V136", v136);
			cmd.addParameter("@V137", v137);
			cmd.addParameter("@V138", v138);
			cmd.addParameter("@V139", v139);
			cmd.addParameter("@V140", v140);
			cmd.addParameter("@V141", v141);
			cmd.addParameter("@V142", v142);
			cmd.addParameter("@V143", v143);
			cmd.addParameter("@V144", v144);
			cmd.addParameter("@V145", v145);
			cmd.addParameter("@V146", v146);
			cmd.addParameter("@V147", v147);
			cmd.addParameter("@V148", v148);
			cmd.addParameter("@V149", v149);
			cmd.addParameter("@V150", v150);
			cmd.addParameter("@V151", v151);
			cmd.addParameter("@V152", v152);
			cmd.addParameter("@V153", v153);
			cmd.addParameter("@V154", v154);
			cmd.addParameter("@V155", v155);
			cmd.addParameter("@V156", v156);
			cmd.addParameter("@V157", v157);
			cmd.addParameter("@V158", v158);
			cmd.addParameter("@V159", v159);
			cmd.addParameter("@V160", v160);
			cmd.addParameter("@V161", v161);
			cmd.addParameter("@V162", v162);
			cmd.addParameter("@V163", v163);
			cmd.addParameter("@V164", v164);
			cmd.addParameter("@V165", v165);
			cmd.addParameter("@V166", v166);
			cmd.addParameter("@V167", v167);
			cmd.addParameter("@V168", v168);
			cmd.addParameter("@V169", v169);
			cmd.addParameter("@V170", v170);
			cmd.addParameter("@V171", v171);
			cmd.addParameter("@V172", v172);
			cmd.addParameter("@V173", v173);
			cmd.addParameter("@V174", v174);
			cmd.addParameter("@V175", v175);
			cmd.addParameter("@V176", v176);
			cmd.addParameter("@V177", v177);
			cmd.addParameter("@V178", v178);
			cmd.addParameter("@V179", v179);
			cmd.addParameter("@V180", v180);
			cmd.addParameter("@V181", v181);
			cmd.addParameter("@V182", v182);
			cmd.addParameter("@V183", v183);
			cmd.addParameter("@V184", v184);
			cmd.addParameter("@V185", v185);
			cmd.addParameter("@V186", v186);
			cmd.addParameter("@V187", v187);
			cmd.addParameter("@V188", v188);
			cmd.addParameter("@V189", v189);
			cmd.addParameter("@V190", v190);
			cmd.addParameter("@V191", v191);
			cmd.addParameter("@V192", v192);
			cmd.addParameter("@V193", v193);
			cmd.addParameter("@V194", v194);
			cmd.addParameter("@V195", v195);
			cmd.addParameter("@V196", v196);
			cmd.addParameter("@V197", v197);
			cmd.addParameter("@V198", v198);
			cmd.addParameter("@V199", v199);
			cmd.addParameter("@V200", v200);
			cmd.addParameter("@V201", v201);
			cmd.addParameter("@V202", v202);
			cmd.addParameter("@V203", v203);
			cmd.addParameter("@V204", v204);
			cmd.addParameter("@V205", v205);
			cmd.addParameter("@V206", v206);
			cmd.addParameter("@V207", v207);
			cmd.addParameter("@V208", v208);
			cmd.addParameter("@V209", v209);
			cmd.addParameter("@V210", v210);
			cmd.addParameter("@V211", v211);
			cmd.addParameter("@V212", v212);
			cmd.addParameter("@V213", v213);
			cmd.addParameter("@V214", v214);
			cmd.addParameter("@V215", v215);
			cmd.addParameter("@V216", v216);
			cmd.addParameter("@V217", v217);
			cmd.addParameter("@V218", v218);
			cmd.addParameter("@V219", v219);
			cmd.addParameter("@V220", v220);
			cmd.addParameter("@V221", v221);
			cmd.addParameter("@V222", v222);
			cmd.addParameter("@V223", v223);
			cmd.addParameter("@V224", v224);
			cmd.addParameter("@V225", v225);
			cmd.addParameter("@V226", v226);
			cmd.addParameter("@V227", v227);
			cmd.addParameter("@V228", v228);
			cmd.addParameter("@V229", v229);
			cmd.addParameter("@V230", v230);
			cmd.addParameter("@V231", v231);
			cmd.addParameter("@V232", v232);
			cmd.addParameter("@V233", v233);
			cmd.addParameter("@V234", v234);
			cmd.addParameter("@V235", v235);
			cmd.addParameter("@V236", v236);
			cmd.addParameter("@V237", v237);
			cmd.addParameter("@V238", v238);
			cmd.addParameter("@V239", v239);
			cmd.addParameter("@V240", v240);
			cmd.addParameter("@V241", v241);
			cmd.addParameter("@V242", v242);
			cmd.addParameter("@V243", v243);
			cmd.addParameter("@V244", v244);
			cmd.addParameter("@V245", v245);
			cmd.addParameter("@V246", v246);
			cmd.addParameter("@V247", v247);
			cmd.addParameter("@V248", v248);
			cmd.addParameter("@V249", v249);
			cmd.addParameter("@V250", v250);
			cmd.addParameter("@V251", v251);
			cmd.addParameter("@V252", v252);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fhhidrows(NString type,byte[] hhc,NNumber v001,NNumber v002,NNumber v003,NNumber v004,NNumber v005,NNumber v006,NNumber v007,NNumber v008,NNumber v009,NNumber v010,NNumber v011,NNumber v012,NNumber v013,NNumber v014,NNumber v015,NNumber v016,NNumber v017,NNumber v018,NNumber v019,NNumber v020,NNumber v021,NNumber v022,NNumber v023,NNumber v024,NNumber v025,NNumber v026,NNumber v027,NNumber v028,NNumber v029,NNumber v030,NNumber v031,NNumber v032,NNumber v033,NNumber v034,NNumber v035,NNumber v036,NNumber v037,NNumber v038,NNumber v039,NNumber v040,NNumber v041,NNumber v042,NNumber v043,NNumber v044,NNumber v045,NNumber v046,NNumber v047,NNumber v048,NNumber v049,NNumber v050,NNumber v051,NNumber v052,NNumber v053,NNumber v054,NNumber v055,NNumber v056,NNumber v057,NNumber v058,NNumber v059,NNumber v060,NNumber v061,NNumber v062,NNumber v063,NNumber v064,NNumber v065,NNumber v066,NNumber v067,NNumber v068,NNumber v069,NNumber v070,NNumber v071,NNumber v072,NNumber v073,NNumber v074,NNumber v075,NNumber v076,NNumber v077,NNumber v078,NNumber v079,NNumber v080,NNumber v081,NNumber v082,NNumber v083,NNumber v084,NNumber v085,NNumber v086,NNumber v087,NNumber v088,NNumber v089,NNumber v090,NNumber v091,NNumber v092,NNumber v093,NNumber v094,NNumber v095,NNumber v096,NNumber v097,NNumber v098,NNumber v099,NNumber v100,NNumber v101,NNumber v102,NNumber v103,NNumber v104,NNumber v105,NNumber v106,NNumber v107,NNumber v108,NNumber v109,NNumber v110,NNumber v111,NNumber v112,NNumber v113,NNumber v114,NNumber v115,NNumber v116,NNumber v117,NNumber v118,NNumber v119,NNumber v120,NNumber v121,NNumber v122,NNumber v123,NNumber v124,NNumber v125,NNumber v126,NNumber v127,NNumber v128,NNumber v129,NNumber v130,NNumber v131,NNumber v132,NNumber v133,NNumber v134,NNumber v135,NNumber v136,NNumber v137,NNumber v138,NNumber v139,NNumber v140,NNumber v141,NNumber v142,NNumber v143,NNumber v144,NNumber v145,NNumber v146,NNumber v147,NNumber v148,NNumber v149,NNumber v150,NNumber v151,NNumber v152,NNumber v153,NNumber v154,NNumber v155,NNumber v156,NNumber v157,NNumber v158,NNumber v159,NNumber v160,NNumber v161,NNumber v162,NNumber v163,NNumber v164,NNumber v165,NNumber v166,NNumber v167,NNumber v168,NNumber v169,NNumber v170,NNumber v171,NNumber v172,NNumber v173,NNumber v174,NNumber v175,NNumber v176,NNumber v177,NNumber v178,NNumber v179,NNumber v180,NNumber v181,NNumber v182,NNumber v183,NNumber v184,NNumber v185,NNumber v186,NNumber v187,NNumber v188,NNumber v189,NNumber v190,NNumber v191,NNumber v192,NNumber v193,NNumber v194,NNumber v195,NNumber v196,NNumber v197,NNumber v198,NNumber v199,NNumber v200,NNumber v201,NNumber v202,NNumber v203,NNumber v204,NNumber v205,NNumber v206,NNumber v207,NNumber v208,NNumber v209,NNumber v210,NNumber v211,NNumber v212,NNumber v213,NNumber v214,NNumber v215,NNumber v216,NNumber v217,NNumber v218,NNumber v219,NNumber v220,NNumber v221,NNumber v222,NNumber v223,NNumber v224,NNumber v225,NNumber v226,NNumber v227,NNumber v228,NNumber v229,NNumber v230,NNumber v231,NNumber v232,NNumber v233,NNumber v234,NNumber v235,NNumber v236,NNumber v237,NNumber v238,NNumber v239,NNumber v240,NNumber v241,NNumber v242,NNumber v243,NNumber v244,NNumber v245,NNumber v246,NNumber v247,NNumber v248,NNumber v249,NNumber v250,NNumber v251,NNumber v252) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHIDROWS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TYPE", type);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@V001", v001);
			cmd.addParameter("@V002", v002);
			cmd.addParameter("@V003", v003);
			cmd.addParameter("@V004", v004);
			cmd.addParameter("@V005", v005);
			cmd.addParameter("@V006", v006);
			cmd.addParameter("@V007", v007);
			cmd.addParameter("@V008", v008);
			cmd.addParameter("@V009", v009);
			cmd.addParameter("@V010", v010);
			cmd.addParameter("@V011", v011);
			cmd.addParameter("@V012", v012);
			cmd.addParameter("@V013", v013);
			cmd.addParameter("@V014", v014);
			cmd.addParameter("@V015", v015);
			cmd.addParameter("@V016", v016);
			cmd.addParameter("@V017", v017);
			cmd.addParameter("@V018", v018);
			cmd.addParameter("@V019", v019);
			cmd.addParameter("@V020", v020);
			cmd.addParameter("@V021", v021);
			cmd.addParameter("@V022", v022);
			cmd.addParameter("@V023", v023);
			cmd.addParameter("@V024", v024);
			cmd.addParameter("@V025", v025);
			cmd.addParameter("@V026", v026);
			cmd.addParameter("@V027", v027);
			cmd.addParameter("@V028", v028);
			cmd.addParameter("@V029", v029);
			cmd.addParameter("@V030", v030);
			cmd.addParameter("@V031", v031);
			cmd.addParameter("@V032", v032);
			cmd.addParameter("@V033", v033);
			cmd.addParameter("@V034", v034);
			cmd.addParameter("@V035", v035);
			cmd.addParameter("@V036", v036);
			cmd.addParameter("@V037", v037);
			cmd.addParameter("@V038", v038);
			cmd.addParameter("@V039", v039);
			cmd.addParameter("@V040", v040);
			cmd.addParameter("@V041", v041);
			cmd.addParameter("@V042", v042);
			cmd.addParameter("@V043", v043);
			cmd.addParameter("@V044", v044);
			cmd.addParameter("@V045", v045);
			cmd.addParameter("@V046", v046);
			cmd.addParameter("@V047", v047);
			cmd.addParameter("@V048", v048);
			cmd.addParameter("@V049", v049);
			cmd.addParameter("@V050", v050);
			cmd.addParameter("@V051", v051);
			cmd.addParameter("@V052", v052);
			cmd.addParameter("@V053", v053);
			cmd.addParameter("@V054", v054);
			cmd.addParameter("@V055", v055);
			cmd.addParameter("@V056", v056);
			cmd.addParameter("@V057", v057);
			cmd.addParameter("@V058", v058);
			cmd.addParameter("@V059", v059);
			cmd.addParameter("@V060", v060);
			cmd.addParameter("@V061", v061);
			cmd.addParameter("@V062", v062);
			cmd.addParameter("@V063", v063);
			cmd.addParameter("@V064", v064);
			cmd.addParameter("@V065", v065);
			cmd.addParameter("@V066", v066);
			cmd.addParameter("@V067", v067);
			cmd.addParameter("@V068", v068);
			cmd.addParameter("@V069", v069);
			cmd.addParameter("@V070", v070);
			cmd.addParameter("@V071", v071);
			cmd.addParameter("@V072", v072);
			cmd.addParameter("@V073", v073);
			cmd.addParameter("@V074", v074);
			cmd.addParameter("@V075", v075);
			cmd.addParameter("@V076", v076);
			cmd.addParameter("@V077", v077);
			cmd.addParameter("@V078", v078);
			cmd.addParameter("@V079", v079);
			cmd.addParameter("@V080", v080);
			cmd.addParameter("@V081", v081);
			cmd.addParameter("@V082", v082);
			cmd.addParameter("@V083", v083);
			cmd.addParameter("@V084", v084);
			cmd.addParameter("@V085", v085);
			cmd.addParameter("@V086", v086);
			cmd.addParameter("@V087", v087);
			cmd.addParameter("@V088", v088);
			cmd.addParameter("@V089", v089);
			cmd.addParameter("@V090", v090);
			cmd.addParameter("@V091", v091);
			cmd.addParameter("@V092", v092);
			cmd.addParameter("@V093", v093);
			cmd.addParameter("@V094", v094);
			cmd.addParameter("@V095", v095);
			cmd.addParameter("@V096", v096);
			cmd.addParameter("@V097", v097);
			cmd.addParameter("@V098", v098);
			cmd.addParameter("@V099", v099);
			cmd.addParameter("@V100", v100);
			cmd.addParameter("@V101", v101);
			cmd.addParameter("@V102", v102);
			cmd.addParameter("@V103", v103);
			cmd.addParameter("@V104", v104);
			cmd.addParameter("@V105", v105);
			cmd.addParameter("@V106", v106);
			cmd.addParameter("@V107", v107);
			cmd.addParameter("@V108", v108);
			cmd.addParameter("@V109", v109);
			cmd.addParameter("@V110", v110);
			cmd.addParameter("@V111", v111);
			cmd.addParameter("@V112", v112);
			cmd.addParameter("@V113", v113);
			cmd.addParameter("@V114", v114);
			cmd.addParameter("@V115", v115);
			cmd.addParameter("@V116", v116);
			cmd.addParameter("@V117", v117);
			cmd.addParameter("@V118", v118);
			cmd.addParameter("@V119", v119);
			cmd.addParameter("@V120", v120);
			cmd.addParameter("@V121", v121);
			cmd.addParameter("@V122", v122);
			cmd.addParameter("@V123", v123);
			cmd.addParameter("@V124", v124);
			cmd.addParameter("@V125", v125);
			cmd.addParameter("@V126", v126);
			cmd.addParameter("@V127", v127);
			cmd.addParameter("@V128", v128);
			cmd.addParameter("@V129", v129);
			cmd.addParameter("@V130", v130);
			cmd.addParameter("@V131", v131);
			cmd.addParameter("@V132", v132);
			cmd.addParameter("@V133", v133);
			cmd.addParameter("@V134", v134);
			cmd.addParameter("@V135", v135);
			cmd.addParameter("@V136", v136);
			cmd.addParameter("@V137", v137);
			cmd.addParameter("@V138", v138);
			cmd.addParameter("@V139", v139);
			cmd.addParameter("@V140", v140);
			cmd.addParameter("@V141", v141);
			cmd.addParameter("@V142", v142);
			cmd.addParameter("@V143", v143);
			cmd.addParameter("@V144", v144);
			cmd.addParameter("@V145", v145);
			cmd.addParameter("@V146", v146);
			cmd.addParameter("@V147", v147);
			cmd.addParameter("@V148", v148);
			cmd.addParameter("@V149", v149);
			cmd.addParameter("@V150", v150);
			cmd.addParameter("@V151", v151);
			cmd.addParameter("@V152", v152);
			cmd.addParameter("@V153", v153);
			cmd.addParameter("@V154", v154);
			cmd.addParameter("@V155", v155);
			cmd.addParameter("@V156", v156);
			cmd.addParameter("@V157", v157);
			cmd.addParameter("@V158", v158);
			cmd.addParameter("@V159", v159);
			cmd.addParameter("@V160", v160);
			cmd.addParameter("@V161", v161);
			cmd.addParameter("@V162", v162);
			cmd.addParameter("@V163", v163);
			cmd.addParameter("@V164", v164);
			cmd.addParameter("@V165", v165);
			cmd.addParameter("@V166", v166);
			cmd.addParameter("@V167", v167);
			cmd.addParameter("@V168", v168);
			cmd.addParameter("@V169", v169);
			cmd.addParameter("@V170", v170);
			cmd.addParameter("@V171", v171);
			cmd.addParameter("@V172", v172);
			cmd.addParameter("@V173", v173);
			cmd.addParameter("@V174", v174);
			cmd.addParameter("@V175", v175);
			cmd.addParameter("@V176", v176);
			cmd.addParameter("@V177", v177);
			cmd.addParameter("@V178", v178);
			cmd.addParameter("@V179", v179);
			cmd.addParameter("@V180", v180);
			cmd.addParameter("@V181", v181);
			cmd.addParameter("@V182", v182);
			cmd.addParameter("@V183", v183);
			cmd.addParameter("@V184", v184);
			cmd.addParameter("@V185", v185);
			cmd.addParameter("@V186", v186);
			cmd.addParameter("@V187", v187);
			cmd.addParameter("@V188", v188);
			cmd.addParameter("@V189", v189);
			cmd.addParameter("@V190", v190);
			cmd.addParameter("@V191", v191);
			cmd.addParameter("@V192", v192);
			cmd.addParameter("@V193", v193);
			cmd.addParameter("@V194", v194);
			cmd.addParameter("@V195", v195);
			cmd.addParameter("@V196", v196);
			cmd.addParameter("@V197", v197);
			cmd.addParameter("@V198", v198);
			cmd.addParameter("@V199", v199);
			cmd.addParameter("@V200", v200);
			cmd.addParameter("@V201", v201);
			cmd.addParameter("@V202", v202);
			cmd.addParameter("@V203", v203);
			cmd.addParameter("@V204", v204);
			cmd.addParameter("@V205", v205);
			cmd.addParameter("@V206", v206);
			cmd.addParameter("@V207", v207);
			cmd.addParameter("@V208", v208);
			cmd.addParameter("@V209", v209);
			cmd.addParameter("@V210", v210);
			cmd.addParameter("@V211", v211);
			cmd.addParameter("@V212", v212);
			cmd.addParameter("@V213", v213);
			cmd.addParameter("@V214", v214);
			cmd.addParameter("@V215", v215);
			cmd.addParameter("@V216", v216);
			cmd.addParameter("@V217", v217);
			cmd.addParameter("@V218", v218);
			cmd.addParameter("@V219", v219);
			cmd.addParameter("@V220", v220);
			cmd.addParameter("@V221", v221);
			cmd.addParameter("@V222", v222);
			cmd.addParameter("@V223", v223);
			cmd.addParameter("@V224", v224);
			cmd.addParameter("@V225", v225);
			cmd.addParameter("@V226", v226);
			cmd.addParameter("@V227", v227);
			cmd.addParameter("@V228", v228);
			cmd.addParameter("@V229", v229);
			cmd.addParameter("@V230", v230);
			cmd.addParameter("@V231", v231);
			cmd.addParameter("@V232", v232);
			cmd.addParameter("@V233", v233);
			cmd.addParameter("@V234", v234);
			cmd.addParameter("@V235", v235);
			cmd.addParameter("@V236", v236);
			cmd.addParameter("@V237", v237);
			cmd.addParameter("@V238", v238);
			cmd.addParameter("@V239", v239);
			cmd.addParameter("@V240", v240);
			cmd.addParameter("@V241", v241);
			cmd.addParameter("@V242", v242);
			cmd.addParameter("@V243", v243);
			cmd.addParameter("@V244", v244);
			cmd.addParameter("@V245", v245);
			cmd.addParameter("@V246", v246);
			cmd.addParameter("@V247", v247);
			cmd.addParameter("@V248", v248);
			cmd.addParameter("@V249", v249);
			cmd.addParameter("@V250", v250);
			cmd.addParameter("@V251", v251);
			cmd.addParameter("@V252", v252);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static byte[] Fhhincrlev(byte[] hhc,NInteger lv) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHINCRLEV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@LV", lv);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static NNumber Fhhjldate(NString ds,NString fmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHJLDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@DS", ds);
			cmd.addParameter("@FMT", fmt);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NInteger Fhhlength(byte[] hhc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHLENGTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@HHC", hhc);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger Fhhlength(byte[] hhc,NInteger dim) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHLENGTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@DIM", dim);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger Fhhlevels(NNumber lb,NNumber ub,NInteger pr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHLEVELS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@LB", lb);
			cmd.addParameter("@UB", ub);
			cmd.addParameter("@PR", pr);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger Fhhmatch(byte[] hh1,byte[] hh2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHMATCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@HH1", hh1);
			cmd.addParameter("@HH2", hh2);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static byte[] Fhhmaxcode(byte[] hhc,NNumber maxlen) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHMAXCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@MAXLEN", maxlen);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] Fhhmkcode(byte[] v01,byte[] v02,byte[] v03,byte[] v04,byte[] v05,byte[] v06,byte[] v07,byte[] v08,byte[] v09,byte[] v10,byte[] v11,byte[] v12,byte[] v13,byte[] v14,byte[] v15,byte[] v16,byte[] v17,byte[] v18,byte[] v19,byte[] v20,byte[] v21,byte[] v22,byte[] v23,byte[] v24,byte[] v25,byte[] v26,byte[] v27,byte[] v28,byte[] v29,byte[] v30,byte[] v31,byte[] v32) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHMKCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@V01", v01);
			cmd.addParameter("@V02", v02);
			cmd.addParameter("@V03", v03);
			cmd.addParameter("@V04", v04);
			cmd.addParameter("@V05", v05);
			cmd.addParameter("@V06", v06);
			cmd.addParameter("@V07", v07);
			cmd.addParameter("@V08", v08);
			cmd.addParameter("@V09", v09);
			cmd.addParameter("@V10", v10);
			cmd.addParameter("@V11", v11);
			cmd.addParameter("@V12", v12);
			cmd.addParameter("@V13", v13);
			cmd.addParameter("@V14", v14);
			cmd.addParameter("@V15", v15);
			cmd.addParameter("@V16", v16);
			cmd.addParameter("@V17", v17);
			cmd.addParameter("@V18", v18);
			cmd.addParameter("@V19", v19);
			cmd.addParameter("@V20", v20);
			cmd.addParameter("@V21", v21);
			cmd.addParameter("@V22", v22);
			cmd.addParameter("@V23", v23);
			cmd.addParameter("@V24", v24);
			cmd.addParameter("@V25", v25);
			cmd.addParameter("@V26", v26);
			cmd.addParameter("@V27", v27);
			cmd.addParameter("@V28", v28);
			cmd.addParameter("@V29", v29);
			cmd.addParameter("@V30", v30);
			cmd.addParameter("@V31", v31);
			cmd.addParameter("@V32", v32);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] Fhhmkdim(NInteger v01,NInteger p01,NInteger v02,NInteger p02,NInteger v03,NInteger p03,NInteger v04,NInteger p04,NInteger v05,NInteger p05,NInteger v06,NInteger p06,NInteger v07,NInteger p07,NInteger v08,NInteger p08,NInteger v09,NInteger p09,NInteger v10,NInteger p10,NInteger v11,NInteger p11,NInteger v12,NInteger p12,NInteger v13,NInteger p13,NInteger v14,NInteger p14,NInteger v15,NInteger p15,NInteger v16,NInteger p16,NInteger v17,NInteger p17,NInteger v18,NInteger p18,NInteger v19,NInteger p19,NInteger v20,NInteger p20,NInteger v21,NInteger p21,NInteger v22,NInteger p22,NInteger v23,NInteger p23,NInteger v24,NInteger p24,NInteger v25,NInteger p25,NInteger v26,NInteger p26,NInteger v27,NInteger p27,NInteger v28,NInteger p28,NInteger v29,NInteger p29,NInteger v30,NInteger p30,NInteger v31,NInteger p31,NInteger v32,NInteger p32) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHMKDIM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@V01", v01);
			cmd.addParameter("@P01", p01);
			cmd.addParameter("@V02", v02);
			cmd.addParameter("@P02", p02);
			cmd.addParameter("@V03", v03);
			cmd.addParameter("@P03", p03);
			cmd.addParameter("@V04", v04);
			cmd.addParameter("@P04", p04);
			cmd.addParameter("@V05", v05);
			cmd.addParameter("@P05", p05);
			cmd.addParameter("@V06", v06);
			cmd.addParameter("@P06", p06);
			cmd.addParameter("@V07", v07);
			cmd.addParameter("@P07", p07);
			cmd.addParameter("@V08", v08);
			cmd.addParameter("@P08", p08);
			cmd.addParameter("@V09", v09);
			cmd.addParameter("@P09", p09);
			cmd.addParameter("@V10", v10);
			cmd.addParameter("@P10", p10);
			cmd.addParameter("@V11", v11);
			cmd.addParameter("@P11", p11);
			cmd.addParameter("@V12", v12);
			cmd.addParameter("@P12", p12);
			cmd.addParameter("@V13", v13);
			cmd.addParameter("@P13", p13);
			cmd.addParameter("@V14", v14);
			cmd.addParameter("@P14", p14);
			cmd.addParameter("@V15", v15);
			cmd.addParameter("@P15", p15);
			cmd.addParameter("@V16", v16);
			cmd.addParameter("@P16", p16);
			cmd.addParameter("@V17", v17);
			cmd.addParameter("@P17", p17);
			cmd.addParameter("@V18", v18);
			cmd.addParameter("@P18", p18);
			cmd.addParameter("@V19", v19);
			cmd.addParameter("@P19", p19);
			cmd.addParameter("@V20", v20);
			cmd.addParameter("@P20", p20);
			cmd.addParameter("@V21", v21);
			cmd.addParameter("@P21", p21);
			cmd.addParameter("@V22", v22);
			cmd.addParameter("@P22", p22);
			cmd.addParameter("@V23", v23);
			cmd.addParameter("@P23", p23);
			cmd.addParameter("@V24", v24);
			cmd.addParameter("@P24", p24);
			cmd.addParameter("@V25", v25);
			cmd.addParameter("@P25", p25);
			cmd.addParameter("@V26", v26);
			cmd.addParameter("@P26", p26);
			cmd.addParameter("@V27", v27);
			cmd.addParameter("@P27", p27);
			cmd.addParameter("@V28", v28);
			cmd.addParameter("@P28", p28);
			cmd.addParameter("@V29", v29);
			cmd.addParameter("@P29", p29);
			cmd.addParameter("@V30", v30);
			cmd.addParameter("@P30", p30);
			cmd.addParameter("@V31", v31);
			cmd.addParameter("@P31", p31);
			cmd.addParameter("@V32", v32);
			cmd.addParameter("@P32", p32);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static NInteger Fhhncompare(byte[] hh1,byte[] hh2,NInteger lv) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHNCOMPARE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@HH1", hh1);
			cmd.addParameter("@HH2", hh2);
			cmd.addParameter("@LV", lv);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger Fhhndim(byte[] hhc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHNDIM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@HHC", hhc);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static byte[] Fhhor(byte[] hh1,byte[] hh2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HH1", hh1);
			cmd.addParameter("@HH2", hh2);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] Fhhorder(byte[] hhc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHORDER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HHC", hhc);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static NInteger Fhhprecision(NNumber lb,NNumber ub,NInteger lv) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHPRECISION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@LB", lb);
			cmd.addParameter("@UB", ub);
			cmd.addParameter("@LV", lv);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static byte[] Fhhsbit(byte[] hhc,NInteger bitNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHSBIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@BIT_NUMBER", bitNumber);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] Fhhsetcid(byte[] hhc,NInteger lv,NNumber cid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHSETCID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@LV", lv);
			cmd.addParameter("@CID", cid);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] Fhhstbit(byte[] hhc,NInteger topology,NString type) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHSTBIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@TYPE", type);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] Fhhstype(byte[] hhc,NInteger typeId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHSTYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@TYPE_ID", typeId);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] Fhhsubdivide(byte[] hh1,NInteger cid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHSUBDIVIDE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HH1", hh1);
			cmd.addParameter("@CID", cid);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] Fhhsubstr(byte[] hhc,NInteger slv,NInteger elv) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHSUBSTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HHC", hhc);
			cmd.addParameter("@SLV", slv);
			cmd.addParameter("@ELV", elv);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] Fhhxor(byte[] hh1,byte[] hh2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.HHXOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@HH1", hh1);
			cmd.addParameter("@HH2", hh2);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static void setCheck(NBool checkflg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.SET_CHECK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CHECKFLG", checkflg);
				
			cmd.execute();


		}
		
		public static void sigerr(NInteger errn,NString sv01,NString sv02,NString sv03,NString sv04,NString sv05,NBool clrs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD.SIGERR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ERRN", errn);
			cmd.addParameter("@SV01", sv01);
			cmd.addParameter("@SV02", sv02);
			cmd.addParameter("@SV03", sv03);
			cmd.addParameter("@SV04", sv04);
			cmd.addParameter("@SV05", sv05);
			cmd.addParameter("@CLRS", clrs);
				
			cmd.execute();


		}
		
	
	
	
}
