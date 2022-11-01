package com.moodanalyzer;

public class MoodAnalyzer extends Throwable {
	public static void welcome() {
		System.out.println("Welcome to Mood Analyzer");
		System.out.println("========================");
	}

	String message;

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public MoodAnalyzer() {

	}

	String MoodAnalyzer() {
		return "SAD";
	}

	public String analyseMood(String message) throws MoodAnalyzer, MoodAnalyzerException {
		try {
			if (message.contains("SAD"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalyzerException("please enter proper message");
		}
	}
}