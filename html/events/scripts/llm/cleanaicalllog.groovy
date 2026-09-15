import org.entermediadb.ai.llm.router.AiCallLogCleaner
import org.entermediadb.asset.MediaArchive

MediaArchive archive = context.getPageValue("mediaarchive");
int deleted = AiCallLogCleaner.deleteOlderThanDays(archive, 30);
log.info("aicalllog cleanup deleted " + deleted + " rows");
