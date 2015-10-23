package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.Table;

@DbTableType(id="ParamTableType", dataSourceName="GKKPRUL.param_table_type", indexed=true)
public class ParamTableType extends Table<ParamInfoTypeRow>{
	
	public ParamTableType(){
		super();
	}
	
	@Override
	protected ParamInfoTypeRow newValue(){
		return new ParamInfoTypeRow();
	}
} 