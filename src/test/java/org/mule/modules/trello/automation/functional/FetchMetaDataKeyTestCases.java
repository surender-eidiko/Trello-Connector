/**
 *
 */
package org.mule.modules.trello.automation.functional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.common.Result;
import org.mule.common.metadata.MetaDataKey;
import org.mule.modules.trello.TrelloConnector;
import org.mule.modules.trello.automation.runner.FunctionalTestSuite;
import org.mule.tools.devkit.ctf.junit.MetaDataTest;


public class FetchMetaDataKeyTestCases extends TrelloAbstractTestcases {
	
		public FetchMetaDataKeyTestCases() {
		super(TrelloConnector.class);
		
	}

		@Test
		@Category({FunctionalTestSuite.class})
		@MetaDataTest
		public void testFetchMetaDataKey()
		{
			Result<List<MetaDataKey>> metaDataKeysResult = getDispatcher().fetchMetaDataKeys();
			assertTrue(Result.Status.SUCCESS.equals(metaDataKeysResult.getStatus()));
			List<MetaDataKey> metaDataKeys = metaDataKeysResult.get();
			
			MetaDataKey user = null;
		    MetaDataKey book = null;
		    
		    
		    for (MetaDataKey key : metaDataKeys) {
		        if (user == null && key.getId().equals("USER"))
		          user = key;
		        if (book == null && key.getId().equals("BOOK"))
		          book = key;
		      }

		      // Assert on MetaDataKeys
		      //assertNotNull(user);
		      //assertNotNull(book);
		      
		     
		}

}
