package programs15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class FindMostRepeatedWordFile {
	public Map<String, Integer> getWordCount(String filename) {
		 
		FileInputStream fis = null;
		BufferedReader br = null;
 
		Map<String, Integer> wordMap = new HashMap<>();
 
		try {
			fis = new FileInputStream(filename);
			br = new BufferedReader(new InputStreamReader(fis));
			String line = null;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, " ");
				while (st.hasMoreTokens()) {
					String tmp = st.nextToken().toLowerCase();
					if (wordMap.containsKey(tmp)) {
						wordMap.put(tmp, wordMap.get(tmp) + 1);
					} else {
						wordMap.put(tmp, 1);
					}
				}
 
			}
 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (Exception e) {
				}
		}
		return wordMap;
	}
 
	public List<Entry<String, Integer>> sortByValue(Map<String, Integer> wordMap) {
 
		List<Entry<String, Integer>> entryLst = new ArrayList<Entry<String, Integer>>(wordMap.entrySet());
		Collections.sort(entryLst, (o1, o2) -> {
			return o2.getValue().compareTo(o1.getValue());
		});
		
 
		return entryLst;
	}
 
	public static void main(String[] args) {
		
		FindMostRepeatedWordFile rwords = new FindMostRepeatedWordFile();
		Map<String, Integer> wordMap = rwords.getWordCount("C://Users//einsu//Documents//FindRepeatedWord.txt");
		List<Entry<String, Integer>> list = rwords.sortByValue(wordMap);
		System.out.println("The most repeated word is :" + list.get(0).getKey());
		
	}
 }


