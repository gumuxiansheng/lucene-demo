package org.uic.demo;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.cn.smart.SmartChineseAnalyzer;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.Query;
import org.junit.Test;

public class SearchFiles {
    @Test
    public void testParser() throws ParseException {
        String field = "content";
        String queryStr = "Mike Zhu's编程乐趣";

        Analyzer analyzer = new SmartChineseAnalyzer();

        QueryParser parser = new QueryParser(field, analyzer);
        Query query = parser.parse(queryStr);
        System.out.println(query.toString());
    }
}
