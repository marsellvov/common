package net.hedtech.general.common.dbservices;

import java.text.ParseException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.MissingFormatArgumentException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.appsupportlib.runtime.AbstractLibrary;
import morphis.foundations.core.appsupportlib.runtime.ILibrary;
import morphis.foundations.core.appsupportlib.runtime.ITask;
import morphis.foundations.core.appsupportlib.runtime.TaskServices;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.types.Types;
import morphis.foundations.core.util.configuration.localization.ILocalizable;
import morphis.foundations.core.util.configuration.localization.LocalizationHelper;

public class GNls {
	
	final static String S_REGEX = "%[0-9]{2}%";
	final static String PERC_REGEX = "((?<!%[0-9]{2})%(?![0-9]{2}%))";
	
	public static NString formatmsg(NString pMsgIdIn, NString pMsgTypeIn,
			NString pMsgTxtIn, NString var01, NString var02,
			NString var03, NString var04, NString var05, NString var06,
			NString var07, NString var08, NString var09, NString var10,
			NString var11, NString var12, NString var13, NString var14,
			NString var15, NString var16, NString var17, NString var18,
			NString var19, NString var20, NString var21, NString var22,
			NString var23, NString var24, NString var25, NString var26,
			NString var27, NString var28, NString var29, NString var30,
			NString var31, NString var32) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"G$_NLS.FORMATMSG", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_MSG_ID_IN", pMsgIdIn);
		cmd.addParameter("@P_MSG_TYPE_IN", pMsgTypeIn);
		cmd.addParameter("@P_MSG_TXT_IN", pMsgTxtIn);
		cmd.addParameter("@VAR01", var01);
		cmd.addParameter("@VAR02", var02);
		cmd.addParameter("@VAR03", var03);
		cmd.addParameter("@VAR04", var04);
		cmd.addParameter("@VAR05", var05);
		cmd.addParameter("@VAR06", var06);
		cmd.addParameter("@VAR07", var07);
		cmd.addParameter("@VAR08", var08);
		cmd.addParameter("@VAR09", var09);
		cmd.addParameter("@VAR10", var10);
		cmd.addParameter("@VAR11", var11);
		cmd.addParameter("@VAR12", var12);
		cmd.addParameter("@VAR13", var13);
		cmd.addParameter("@VAR14", var14);
		cmd.addParameter("@VAR15", var15);
		cmd.addParameter("@VAR16", var16);
		cmd.addParameter("@VAR17", var17);
		cmd.addParameter("@VAR18", var18);
		cmd.addParameter("@VAR19", var19);
		cmd.addParameter("@VAR20", var20);
		cmd.addParameter("@VAR21", var21);
		cmd.addParameter("@VAR22", var22);
		cmd.addParameter("@VAR23", var23);
		cmd.addParameter("@VAR24", var24);
		cmd.addParameter("@VAR25", var25);
		cmd.addParameter("@VAR26", var26);
		cmd.addParameter("@VAR27", var27);
		cmd.addParameter("@VAR28", var28);
		cmd.addParameter("@VAR29", var29);
		cmd.addParameter("@VAR30", var30);
		cmd.addParameter("@VAR31", var31);
		cmd.addParameter("@VAR32", var32);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}
	
	public static NString Fget(NString pMsgIdIn, NString pMsgTypeIn,
			NString pMsgTxtIn, Object... params) {
		
		String strIn =  pMsgTxtIn.getValue(); 
		
		if (strIn != null)
			strIn = normalize(strIn);

		
		String strLocale = null;
		ITask task = TaskServices.getCurrentTask();
		
		if (pMsgTypeIn.equalsIgnoreCase("FORM"))
		{
			strLocale = getTaskLocalization(task, pMsgIdIn);
		}
		else if (pMsgTypeIn.equalsIgnoreCase("LIB"))
		{
			strLocale = getLibraryLocalization(task, pMsgIdIn);
		}
		else
		{
			strLocale = getTaskLocalization(task, pMsgIdIn);
			if (strLocale == null || strLocale.isEmpty())
				strLocale = getLibraryLocalization(task, pMsgIdIn);
		}
		
		try
		{
			if (strLocale != null && !strLocale.isEmpty())
			{
				strLocale = NString.Format(strLocale, params);
				return Types.toStr(strLocale);
			}
			else
			{
				strIn = NString.Format(strIn, params);
				return Types.toStr(strIn);
			}
		}
		catch (MissingFormatArgumentException e)
		{
			//fall back to original
			return Types.toStr(NString.Format(strIn, params));
		}
		
		
	}

	private static String getLibraryLocalization(ITask task, NString pMsgIdIn) {
		
		Hashtable<String, ILibrary> libs =  task.getSupportCodeManager().getLibraries();
		
		if (libs != null && libs.size() >0)
		{
			Iterator<Entry<String, ILibrary>> it = libs.entrySet().iterator();
			
			while(it.hasNext())
			{
				ILibrary lib = (ILibrary)it.next().getValue();
				
				String localized = localize(((AbstractLibrary)lib).getConfiguration(), pMsgIdIn);
				if (localized != null)
					return localized; 
				
			}
		}

		return null;
	}

	private static String getTaskLocalization(ITask task, NString pMsgIdIn) {
		return localize(task.getConfiguration(), pMsgIdIn);
	}
	
	private static String localize(ILocalizable localizable, NString pMsgIdIn) {
		String localized = LocalizationHelper.getLocalizedValue(localizable, pMsgIdIn.getValue(), null);
		if (localized != null)
			return normalize(localized);
		
		return null;
	}
	
	private static String normalize(String pMsgIdIn) {
		pMsgIdIn = pMsgIdIn.replaceAll(PERC_REGEX, "%%");
		
		
		Pattern p = Pattern.compile(S_REGEX);
		Matcher m = p.matcher(pMsgIdIn);
		while (m.find()) {
		  String mStr = m.group();
		  
		  try {
			NNumber index = NNumber.tryParse(mStr.replace("%", ""), "##");
			
			pMsgIdIn = pMsgIdIn.replace(mStr, "%" + index + "$s");
			
		  } catch (ParseException e) {}
		  
		  
		}
		
		return pMsgIdIn;//.replaceAll(S_REGEX, "%s");
	}
}