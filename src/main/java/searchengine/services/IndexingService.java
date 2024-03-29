package searchengine.services;

import searchengine.dto.indexing.results.IndexingResult;

public interface IndexingService {

    IndexingResult getIndexingResult();
    IndexingResult stopIndexing();
    IndexingResult indexPage(String pageUrl);
}
