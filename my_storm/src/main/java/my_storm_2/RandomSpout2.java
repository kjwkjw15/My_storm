package my_storm_2;

import java.util.Map;
import java.util.Random;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Values;

public class RandomSpout2 extends BaseRichSpout{
	private static SpoutOutputCollector collector;
	private String words[]={"a","b","c"};

	public void open(Map conf, TopologyContext arg1, SpoutOutputCollector arg2) {
		// TODO Auto-generated method stub
		this.collector=arg2;
	}

	public void nextTuple() {
		// TODO Auto-generated method stub
		String word = words[new Random().nextInt(words.length)];
		this.collector.emit(new Values(word));
	}

	public void declareOutputFields(OutputFieldsDeclarer arg0) {
		// TODO Auto-generated method stub
		arg0.declare(new Fields("sdfsdf"));
		
	}
		

}
