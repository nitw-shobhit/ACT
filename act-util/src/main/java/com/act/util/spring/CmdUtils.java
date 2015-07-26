package com.act.util.spring;

import java.io.IOException;

public class CmdUtils {

	public static void executeBatchFile(String path) throws IOException, InterruptedException {
		Process proc = Runtime.getRuntime().exec(path+"bin/startup.bat");
		proc.waitFor();
	}
}
