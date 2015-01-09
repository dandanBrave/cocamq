package org.jinn.cocamq.test.netty;

import org.jinn.cocamq.broker.MessageBroker;
import org.jinn.cocamq.storage.DataFileStorage;
import org.jinn.cocamq.storage.MessageStorage;
import org.junit.Test;

public class MessageBrokerTest {
	@Test
	public void testBroker(){
		MessageStorage ms=new DataFileStorage("comment");
		MessageBroker mb = new MessageBroker(ms);
		mb.start();

	}
}
