import org.entermediadb.ai.llm.AiCallLogCleaner
import org.entermediadb.asset.MediaArchive

public void init() {

	MediaArchive archive = context.getPageValue("mediaarchive");
	int deleted = AiCallLogCleaner.deleteOlderThanDays(archive, 30);
	log.info("aicalllog cleanup deleted " + deleted + " rows");

}


init();
