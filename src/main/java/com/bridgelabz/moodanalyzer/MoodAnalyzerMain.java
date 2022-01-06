package com.bridgelabz.moodanalyzer;

public class MoodAnalyzerMain {
	public static void main(String[] args) {
		MoodAnalyzer mood = new MoodAnalyzer();
		System.out.println(mood.analyzeMood());
		MoodAnalyzer moodSad = new MoodAnalyzer("I am in Sad Mood");
		System.out.println(moodSad.analyzeMood());
		MoodAnalyzer moodHappy = new MoodAnalyzer("I am in Happy Mood");
		System.out.println(moodHappy.analyzeMood());
	}
}
