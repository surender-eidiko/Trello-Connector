
package org.mule.modules.trello.adapters;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.mule.common.DefaultResult;
import org.mule.common.Result;
import org.mule.common.metadata.ConnectorMetaDataEnabled;
import org.mule.common.metadata.DefaultMetaDataKey;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataFailureType;
import org.mule.common.metadata.MetaDataKey;
import org.mule.common.metadata.key.property.TypeDescribingProperty;
import org.mule.common.metadata.property.StructureIdentifierMetaDataModelProperty;
import org.mule.devkit.internal.metadata.MetaDataGeneratorUtils;
import org.mule.modules.trello.DataSenseResolver;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.config.ConnectorConfig;


/**
 * A <code>TrelloConnectorConnectorConfigBasicAdapter</code> is a wrapper around {@link TrelloConnector } that represents the strategy {@link ConnectorConfig }
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2016-05-18T04:08:12+05:30", comments = "Build 3.7.x.2633.51164b9")
public class TrelloConnectorConnectorConfigBasicAdapter
    extends TrelloConnectorProcessAdapter
    implements ConnectorMetaDataEnabled
{


    @Override
    public Result<List<MetaDataKey>> getMetaDataKeys() {
        try {
            List<MetaDataKey> gatheredMetaDataKeys = new ArrayList<MetaDataKey>();
            DataSenseResolver dataSenseResolver = new DataSenseResolver();
            dataSenseResolver.setConnector(this);
            gatheredMetaDataKeys.addAll(MetaDataGeneratorUtils.fillCategory(dataSenseResolver.getMetaDataKeys(), "DataSenseResolver"));
            return new DefaultResult<List<MetaDataKey>>(gatheredMetaDataKeys, (Result.Status.SUCCESS));
        } catch (Exception e) {
            return new DefaultResult<List<MetaDataKey>>(null, (Result.Status.FAILURE), "There was an error retrieving the metadata keys from service provider after acquiring connection, for more detailed information please read the provided stacktrace", MetaDataFailureType.ERROR_METADATA_KEYS_RETRIEVER, e);
        }
    }

    @Override
    public Result<MetaData> getMetaData(MetaDataKey metaDataKey) {
        try {
            MetaData metaData = null;
            TypeDescribingProperty property = metaDataKey.getProperty(TypeDescribingProperty.class);
            String category = ((DefaultMetaDataKey) metaDataKey).getCategory();
            if (category!= null) {
                if (category.equals("DataSenseResolver")) {
                    DataSenseResolver dataSenseResolver = new DataSenseResolver();
                    dataSenseResolver.setConnector(this);
                    metaData = dataSenseResolver.getMetaData(metaDataKey);
                } else {
                    throw new Exception(((("Invalid key type. There is no matching category for ["+ metaDataKey.getId())+"]. All keys must contain a category with any of the following options:[DataSenseResolver]")+((", but found ["+ category)+"] instead")));
                }
            } else {
                throw new Exception((("Invalid key type. There is no matching category for ["+ metaDataKey.getId())+"]. All keys must contain a category with any of the following options:[DataSenseResolver]"));
            }
            metaData.getPayload().addProperty(new StructureIdentifierMetaDataModelProperty(metaDataKey, false));
            return new DefaultResult<MetaData>(metaData);
        } catch (Exception e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), MetaDataGeneratorUtils.getMetaDataException(metaDataKey), MetaDataFailureType.ERROR_METADATA_RETRIEVER, e);
        }
    }

}
