package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.Table;

//dataSourceName="GV_DISPLAY_PROPERTIES.t_display_items"

@DbTableType(id="Gkkprul.workItemTableType", dataSourceName="GKKPRUL.workitem_table_type", indexed=true)
public class workItemTableType extends Table<WorkitemTypeRow> {
    
    @Override
    protected WorkitemTypeRow newValue(){
        return new WorkitemTypeRow();
    }
}

