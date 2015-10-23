package net.hedtech.general.common.libraries.Goqrpls;

import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;


import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

public class GFrm extends AbstractSupportCodeObject {
	

	public GFrm(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_FRM
	/*
	PACKAGE G$_FRM IS
  -- Define Common Form Constants here to reduce the number of text literals
	C_BUTTON 				CONSTANT VARCHAR2(6)  := 'BUTTON';
	C_CHANGED				CONSTANT VARCHAR2(7)  := 'CHANGED';
	C_DISPLAY_ITEM	CONSTANT VARCHAR2(12) := 'DISPLAY_ITEM';
	C_ENTER_QUERY		CONSTANT VARCHAR2(12) := 'ENTER-QUERY';	
	C_FALSE  				CONSTANT VARCHAR2(5)  := 'FALSE';
	C_INSERT				CONSTANT VARCHAR2(6)  := 'INSERT';
 	C_NEW		 				CONSTANT VARCHAR2(3)  := 'NEW';
 	C_NORMAL 				CONSTANT VARCHAR2(6)  := 'NORMAL'; 	
	C_QUERY  				CONSTANT VARCHAR2(5)  := 'QUERY';
	C_TRUE 	 				CONSTANT VARCHAR2(4)  := 'TRUE';

	
	C_SYSTEM_CURRENT_BLOCK 	  CONSTANT VARCHAR2(30) := 'SYSTEM.CURRENT_BLOCK';
	-- 80-12	
	C_SYSTEM_CURSOR_BLOCK 	  CONSTANT VARCHAR2(30) := 'SYSTEM.CURSOR_BLOCK';
	C_SYSTEM_CURRENT_FORM 	  CONSTANT VARCHAR2(30) := 'SYSTEM.CURRENT_FORM';
	--
	C_SYSTEM_CURSOR_RECORD 	  CONSTANT VARCHAR2(30) := 'SYSTEM.CURSOR_RECORD';
	C_SYSTEM_MODE             CONSTANT VARCHAR2(30) := 'SYSTEM.MODE';
	C_SYSTEM_RECORD_STATUS 	  CONSTANT VARCHAR2(30) := 'SYSTEM.RECORD_STATUS';
	C_SYSTEM_TRIGGER_BLOCK 	  CONSTANT VARCHAR2(30) := 'SYSTEM.TRIGGER_BLOCK';
	
END G$_FRM;
	*/
	
			//  Define Common Form Constants here to reduce the number of text literals
		public static final NString C_BUTTON = toStr("BUTTON");
		public static final NString C_CHANGED = toStr("CHANGED");
		public static final NString C_DISPLAY_ITEM = toStr("DISPLAY_ITEM");
		public static final NString C_ENTER_QUERY = toStr("ENTER-QUERY");
		public static final NString C_FALSE = toStr("FALSE");
		public static final NString C_INSERT = toStr("INSERT");
		public static final NString C_NEW = toStr("NEW");
		public static final NString C_NORMAL = toStr("NORMAL");
		public static final NString C_QUERY = toStr("QUERY");
		public static final NString C_TRUE = toStr("TRUE");
		public static final NString C_SYSTEM_CURRENT_BLOCK = toStr("SYSTEM.CURRENT_BLOCK");
		//  80-12	
		public static final NString C_SYSTEM_CURSOR_BLOCK = toStr("SYSTEM.CURSOR_BLOCK");
		public static final NString C_SYSTEM_CURRENT_FORM = toStr("SYSTEM.CURRENT_FORM");
		// 
		public static final NString C_SYSTEM_CURSOR_RECORD = toStr("SYSTEM.CURSOR_RECORD");
		public static final NString C_SYSTEM_MODE = toStr("SYSTEM.MODE");
		public static final NString C_SYSTEM_RECORD_STATUS = toStr("SYSTEM.RECORD_STATUS");
		public static final NString C_SYSTEM_TRIGGER_BLOCK = toStr("SYSTEM.TRIGGER_BLOCK");

			
	
	
}
