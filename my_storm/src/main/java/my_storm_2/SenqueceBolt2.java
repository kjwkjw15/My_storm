package my_storm_2;

import backtype.storm.topology.BasicOutputCollector;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseBasicBolt;
import backtype.storm.tuple.Tuple;
import ch.qos.logback.core.net.SyslogOutputStream;

public class SenqueceBolt2 extends BaseBasicBolt{

	public void execute(Tuple input, BasicOutputCollector collector) {
		// TODO Auto-generated method stub
		String word = (String)input.getValue(0);
		System.out.println("out = fuck the " + word);
	}

	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		// TODO Auto-generated method stub
		
	}

}
