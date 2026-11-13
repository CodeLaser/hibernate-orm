package org.hibernate.tool.ant.test.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {

	static public String findFirstString(String string, File file) {
		String str;
		try {
			BufferedReader in = new BufferedReader(new FileReader(file) );
			while ( (str = in.readLine() ) != null ) {
				if(str.contains(string)) {
					break;
				}
			}
			in.close();
		}
		catch (IOException e) {
			throw new RuntimeException("trouble with searching in " + file,e);
		}
		return str;
	}

}
