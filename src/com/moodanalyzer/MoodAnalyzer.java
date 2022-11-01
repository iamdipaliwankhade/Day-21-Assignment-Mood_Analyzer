package com.moodanalyzer;

public class MoodAnalyzer {
	public static void welcome() {
		System.out.println("Welcome to Mood Analyzer");
		System.out.println("========================");
	}

	public String analyseMood(String message) {
		if (message.contains("SAD"))
			return "SAD";
		else
			return "HAPPY";
	}
}