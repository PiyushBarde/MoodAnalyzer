package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	String message;
	

	public MoodAnalyzer(String message) {
		this.message = message;
	}
	public MoodAnalyzer() {
	}
	public String analyzeMood()
	{
		try {
			if (message.contains("Sad")) {
				return "SAD";
			}else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}
}

